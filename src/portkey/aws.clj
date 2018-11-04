(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [clj-http.client :as http]
            [clojure.core.async :as async]
            [clojure.data.xml :as xml]
            [clojure.java.io :as io]
            [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [portkey.awssig :as sig]))


(defn dashed [^String s]
  (-> s (.replaceAll "(?<=[a-z0-9])(?=[A-Z]([a-z]|$))|_" "-") .toLowerCase))


; Java 8
(defn base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))
(defn base64-decode [^String s] (.decode (java.util.Base64/getDecoder) s))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                    ___            _         _   _      _                     ┃
;; ┃                   / __|_ _ ___ __| |___ _ _| |_(_)__ _| |___                 ┃
;; ┃                  | (__| '_/ -_) _` / -_) ' \  _| / _` | (_-<                 ┃
;; ┃                   \___|_| \___\__,_\___|_||_\__|_\__,_|_/__/                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


(def ^:dynamic *region* nil)


(def ^:dynamic *credentials*
  "A map with keys :access-key, :secret-key and optionally :token"
  nil)


(defmacro cond
  "This macro is used mainly in the guess-credentials! function."
  ([] nil)
  ([c e & etc]
   (case c
     :let `(let ~e (cond ~@etc))
     :when-let `(when-let ~e (cond ~@etc))
     :when-some `(when-some ~e (cond ~@etc))
     (case (and (vector? c) (some #{:let :some} (keys (meta c))))
       :let `(if-let ~(vary-meta c dissoc :let) ~e (cond ~@etc))
       :some `(if-some ~(vary-meta c dissoc :some) ~e (cond ~@etc))
       `(if ~c ~e (cond ~@etc))))))


(defn- parse-profile [file profile]
  (when (.exists file)
    (with-open [rdr (io/reader file)]
      (into {}
            (comp
             (remove #(re-matches #"\s*(?:;.*)?" %))
             (map str/trim)
             (drop-while #(not= profile (second (re-matches #"\s*\[\s*(.+?)\s*]\s*" %))))
             (drop 1)
             (map #(when-some [[_ k v] (re-matches #"\s*([^\[=][^=]*?)\s*=\s*(\S.*?)\s*" %)] [k v]))
             (take-while some?))
            (->> rdr java.io.BufferedReader. line-seq)))))


(defn- guess-credentials!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (when-some [[a s]
              (cond
                ^:some [id (System/getenv "AWS_ACCESS_KEY_ID")]
                [id (System/getenv "AWS_SECRET_ACCESS_KEY")]

                ^:some [id (System/getProperty "aws.accessKeyId")]
                [id (System/getProperty "aws.secretKey")]

                :let [file                                              (or (some-> (System/getenv "AWS_CREDENTIAL_PROFILES_FILE") java.io.File.)
                                                                            (java.io.File. (System/getProperty "user.home") ".aws/credentials"))
                      profile                                           (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")
                      {:strs [aws_access_key_id aws_secret_access_key]} (parse-profile file profile)]
                (some? aws_access_key_id)                                [aws_access_key_id aws_secret_access_key])]
    {:access-key a :secret-key s}))


(defn- guess-region!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (or
   (System/getenv "AWS_REGION")
   (let [file (or (some-> (System/getenv "AWS_CONFIG_FILE") java.io.File.)
                  (java.io.File. (System/getProperty "user.home") ".aws/config"))
         profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")]
     (get (parse-profile file profile) "region"))
   #_(TODO see "http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html")
   "us-east-1"))


(defn credentials []
  (or *credentials* (guess-credentials!)
    (throw (RuntimeException. "No AWS credentials found!"))))


(defn region []
  (or *region* (guess-region!)))



;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃      _  _ _____ _____ ___   ___                      _      ___      _ _     ┃
;; ┃     | || |_   _|_   _| _ \ | _ \___ __ _ _  _ ___ __| |_   / __|__ _| | |    ┃
;; ┃     | __ | | |   | | |  _/ |   / -_) _` | || / -_|_-<  _| | (__/ _` | | |    ┃
;; ┃     |_||_| |_|   |_| |_|   |_|_\___\__, |\_,_\___/__/\__|  \___\__,_|_|_|    ┃
;; ┃                                       |_|                                    ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


(defn- sign-v4 [req credential-scope]
  (sig/sigv4 req (into (credentials) credential-scope)))


(defn wrap-sign [client]
  (fn [{:as req :keys [::credential-scope ::signature-version]} & args]
    (let [req (dissoc req ::credential-scope ::signature-version)
          req (case signature-version
                (:v4 :s3v4) (sign-v4 req credential-scope))]
        (apply client req args))))


(defn sync-http-client [req coerce-resp]
  (http/with-additional-middleware [wrap-sign]
    (let [[tag v] (-> req
                    (assoc :throw-exceptions false)
                    http/request
                    coerce-resp)]
      (case tag
        :result v
        :exception (throw v)))))


(defn async-http-client
  "When this function is bound as *http-client* then AWS functions returns
   a core.async channel which will eventually receives either [:result r] or
   [:exception ex]."
  [req coerce-resp]
  (let [chan (async/chan 1)]
    (http/with-additional-middleware [wrap-sign]
      (-> req
        (assoc :throw-exceptions false :async? true)
        (http/request
          (fn [resp]
            (async/>!! chan (coerce-resp resp)))
          (fn [exception]
            (async/>!! chan [:exception exception])))))
    chan))


(def ^:dynamic *http-client* sync-http-client)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; RUNTIME REQUEST TRANSFORMATION ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn- params-to-uri
  "Given the url of the form '/{Bucket}/delete' and
  the :http.request.configuration/uri vector of user values, returns
  the final url in the request."
  [{:as req
    {url :url} :ring.request
    :keys [:http.request.configuration/uri]}]
  (assoc-in req
            [:ring.request :url]
            (str/replace url
                         #"\{([^\}\+]*)[+]*}"
                         (fn [[_ n]]
                           (if-some [v (some #(and (= n (:http.request.field/location-name %))
                                                   (:http.request.field/value %))
                                             uri)]
                             ;; @TODO : verify if url encoding is
                             ;; automatic with clj-http
                             v
                             (throw (ex-info (str "Missing parameter " n)
                                             {:url url :uri uri})))))))


(defn- params-to-header
  "Compute all headers for the ring request."
  [{:as   req
    :keys [:http.request.configuration/header]}]
  (update-in req
             [:ring.request :headers]
             (fnil into {})
             (into {}
                   (map (fn [{:http.request.field/keys [value name location-name]}]
                          [(or location-name name) value]))
                   header)))


(defn- params-to-headers
  "Compute all headers for the ring request. Comes from map type where
  we have to generate several headers."
  [{:as   req
    :keys [:http.request.configuration/headers]}]
  (update-in req
             [:ring.request :headers]
             (fnil into {})
             (into {}
                   (comp (mapcat (fn [{:http.request.field/keys [type location-name] :as v}]
                                   ;; @NOTE - @dupuchba : in case of map, we have to duplicate location-name with it's key name and value
                                   (if (= "map" type)
                                     (into []
                                           (map (fn [[k v]]
                                                  #:http.request.field{:location-name (str location-name (:http.request.field/value k))
                                                                       :value         (:http.request.field/value v)})
                                                (v :http.request.field/value)))
                                     [v])))
                         (map (fn [{:http.request.field/keys [value name location-name]}]
                                [(or location-name name) value])))
                   headers)))


(defn- params-to-body
  "to complete"
  [{:keys [:http.request.configuration/method] :as req}]
  (if (contains? #{:put :post :patch} method)
    ;; @TODO - @dupuchba : body should be a map and not a collection of field, to check
    (let [{:http.request.field/keys [streaming value] :as body} (-> req :http.request.configuration/body first)
          map->xml                                              (fn map->xml
                                                                  ([all]
                                                                   (map->xml all nil))
                                                                  ([{:http.request.field/keys [name shape value type location-name flattened xml-namespace xml-attribute] :as all} pre]
                                                                   (let [template-fn (fn template-fn
                                                                                       ([content]
                                                                                        (template-fn content nil))
                                                                                       ([content xml-attrs]
                                                                                        (let [{prefix "prefix" uri "uri"} xml-namespace]
                                                                                          (cond-> {:tag     (or pre location-name name shape)
                                                                                                   :content content}
                                                                                            xml-namespace (assoc :attrs (into {(if prefix (str "xmlns:" prefix) "xmlns") uri}
                                                                                                                              (when-let [attrs (seq xml-attrs)]
                                                                                                                                (into {}
                                                                                                                                      (map (fn [{:http.request.field/keys [location-name value]}]
                                                                                                                                             [location-name value]))
                                                                                                                                      attrs))))))))]
                                                                     (cond
                                                                       (= type "structure") (template-fn (into []
                                                                                                               (comp (remove #(:http.request.field/xml-attribute %))
                                                                                                                     (map map->xml)) value)
                                                                                                         ;; @NOTE -  @dupuchba : used to fill xml-attribute on it's direct parent
                                                                                                         (sequence (keep (fn [{:http.request.field/keys [xml-attribute] :as val}]
                                                                                                                           (and xml-attribute val)))
                                                                                                                   value))
                                                                       (= type "list")      (if flattened
                                                                                              (into [] (map #(map->xml % location-name) value))
                                                                                              (template-fn (into [] (map map->xml) value)))
                                                                       :else                (template-fn value)))))]
      (assoc-in req
                [:ring.request :body]
                ;; @NOTE : streaming doesn't need to be xmlfied
                (if (not (true? streaming))
                  (xml/emit-str (map->xml body))
                  value)))
    req))


(defn- content-md5 [{{:keys [body]} :ring.request :as req}]
  (let [message-digest (java.security.MessageDigest/getInstance "MD5")
        _              (.update message-digest (.getBytes body))
        bytes'         (.digest message-digest)]
    (base64-encode bytes')))


(defn- params-to-content-md5-header
  "Add the Contente-MD5 header to the request for S3 service."
  [{:as req :http.request.configuration/keys [protocol method service-id]}]
  (if (and (= protocol "rest-xml") (= service-id "S3") (contains? #{:put :post :patch} method))
    (-> req
        (update :http.request.configuration/header
                (fnil conj [])
                #:http.request.field{:value         (content-md5 req)
                                     :shape-name    "ContentMD5"
                                     :location-name "Content-MD5"}))
    req))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃      ___          _   _             _  _ _____ _____ ___    ___      _ _     ┃
;; ┃     | _ \_  _ _ _| |_(_)_ __  ___  | || |_   _|_   _| _ \  / __|__ _| | |    ┃
;; ┃     |   / || | ' \  _| | '  \/ -_) | __ | | |   | | |  _/ | (__/ _` | | |    ┃
;; ┃     |_|_\\_,_|_||_\__|_|_|_|_\___| |_||_| |_|   |_| |_|    \___\__,_|_|_|    ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;; @TODO - @dupuchba : remove this as it's only god is to break on
;; un-supported fields when developping the sdks. Already exist in
;; awsgen
(defmacro ^:private strict-strs
  "Allows to specify a string-keyed map in a strict manner (any unknown key
   triggers a validation error).
   This brittle behavior is on purpose: strict-strs is meant to be used to
   validate the API json files and we want to know when something new appears
   in a json file."
  [& {:keys [req opt]}]
  `(spec/and
    (spec/every
     (spec/or
      ~@(mapcat (fn [[field spec]]
                  [(keyword field)
                   `(spec/tuple #{~field} ~spec)]) (concat req opt)))
     :kind map?)
    (fn [m#]
      (every? #(contains? m# %) [~@(keys req)]))))


(spec/def :http.request.field/field (strict-strs :req {:http.request.field/shape-name    string?
                                                       :http.request.field/value         any?}
                                                 :opt {:http.request.field/streaming boolean?
                                                       :http.request.field/location-name string?}))

(spec/def :http.request.configuration/values (spec/coll-of :http.request.field/field :kind vector?))
  
(spec/def :http.request.configuration/uri :http.request.configuration/values)
(spec/def :http.request.configuration/header :http.request.configuration/values)
(spec/def :http.request.configuration/querystring :http.request.configuration/values)
(spec/def :http.request.configuration/body :http.request.configuration/values)

  
(spec/def :http.request.configuration/generate-request-function-part
  (spec/keys :opt [:http.request.configuration/uri
                   :http.request.configuration/header
                   :http.request.configuration/querystring
                   :http.request.configuration/body]))


(spec/def :http.request.configuration/method #{:get :put})
(spec/def :http.request.configuration/request-uri string?)
(spec/def :http.request.configuration/endpoints map?)
(spec/def :http.request.configuration/mime-type (spec/map-of #(= "content-type" %) string?))
(spec/def :http.request.configuration/protocol #{"rest-xml"})
(spec/def :http.request.configuration/service-id string?)
;; @TODO - @dupuchba : might be more precise
(spec/def :http.request.configuration/response-code (spec/nilable int?))
(spec/def :http.request.spec/input-spec (spec/nilable keyword?))
(spec/def :http.request.spec/output-spec (spec/nilable keyword?))
;; @TODO - @dupuchba : specifie something usefull as spec for this
;; one
(spec/def :http.request.spec/error-spec (spec/nilable any?))

(spec/def :http.request.configuration/generate-operation-function-part
  (spec/keys :req [:http.request.configuration/method
                   :http.request.configuration/endpoints
                   :http.request.configuration/request-uri
                   :http.request.configuration/mime-type
                   :http.request.configuration/response-code
                   :http.request.configuration/protocol
                   :http.request.configuration/service-id
                   :http.request.spec/input-spec
                   :http.request.spec/output-spec
                   :http.request.spec/error-spec]))

  
(spec/def :http.request.configuration/configuration
  (spec/merge :http.request.configuration/generate-request-function-part
              :http.request.configuration/generate-operation-function-part))


(defn -call-http
  "The HTTP Call function.
  Takes a map of inputs / configuration and compute a ring-request to
  make the HTTP call."
  [{:keys [:http.request.configuration/endpoints
           :http.request.configuration/method
           :http.request.configuration/request-uri
           :http.request.configuration/mime-type] :as req}]
  #_(spec/check-asserts true)
  (binding [spec/*compile-asserts* true]
    (spec/assert :http.request.configuration/configuration req))
  (let [{:keys [endpoint credential-scope signature-version]} (endpoints (region))]
    (->
     (into req
           {:ring.request {:method             method
                           ::credential-scope  credential-scope
                           ::signature-version signature-version
                           :url                (str endpoint request-uri)
                           :headers            mime-type}})
     params-to-uri
     params-to-body
     ;; @NOTE - @dupucba : must be placed before params-to-header and
     ;; after params-to-body as it rely on both to compute content-md5
     ;; value
     params-to-content-md5-header
     params-to-header
     params-to-headers
     :ring.request
     (*http-client* (fn [resp]
                      [:result resp])))))


