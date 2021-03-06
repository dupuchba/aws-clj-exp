(ns portkey.aws.eks (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-list-updates-request-max-results)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-vpc-config-request)

(clojure.core/declare ser-string)

(clojure.core/declare ser-cluster-name)

(clojure.core/declare ser-list-clusters-request-max-results)

(clojure.core/defn- ser-list-updates-request-max-results [input] #:http.request.field{:value input, :shape "ListUpdatesRequestMaxResults"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-vpc-config-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:subnet-ids input)) #:http.request.field{:name "subnetIds", :shape "StringList"})], :shape "VpcConfigRequest", :type "structure"} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "StringList"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-cluster-name [input] #:http.request.field{:value input, :shape "ClusterName"})

(clojure.core/defn- ser-list-clusters-request-max-results [input] #:http.request.field{:value input, :shape "ListClustersRequestMaxResults"})

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-clusters-request-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListClustersRequestMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-describe-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-describe-update-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"}) (clojure.core/into (ser-string (input :update-id)) #:http.request.field{:name "updateId", :shape "String", :location "uri", :location-name "updateId"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-name (input :name)) #:http.request.field{:name "name", :shape "ClusterName"}) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "roleArn", :shape "String"}) (clojure.core/into (ser-vpc-config-request (input :resources-vpc-config)) #:http.request.field{:name "resourcesVpcConfig", :shape "VpcConfigRequest"})]} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "version", :shape "String"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-update-cluster-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-string (input :version)) #:http.request.field{:name "version", :shape "String"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-list-updates-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-updates-request-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListUpdatesRequestMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-update-status)

(clojure.core/declare deser-vpc-config-response)

(clojure.core/declare deser-update-param-type)

(clojure.core/declare deser-update-param)

(clojure.core/declare deser-error-detail)

(clojure.core/declare deser-update)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-cluster)

(clojure.core/declare deser-cluster-status)

(clojure.core/declare deser-string)

(clojure.core/declare deser-update-params)

(clojure.core/declare deser-update-type)

(clojure.core/declare deser-error-details)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-certificate)

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-update-status [input] (clojure.core/get {"InProgress" :in-progress, "Failed" :failed, "Cancelled" :cancelled, "Successful" :successful} input))

(clojure.core/defn- deser-vpc-config-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "subnetIds") (clojure.core/assoc :subnet-ids (deser-string-list (input "subnetIds"))) (clojure.core/contains? input "securityGroupIds") (clojure.core/assoc :security-group-ids (deser-string-list (input "securityGroupIds"))) (clojure.core/contains? input "vpcId") (clojure.core/assoc :vpc-id (deser-string (input "vpcId")))))

(clojure.core/defn- deser-update-param-type [input] (clojure.core/get {"Version" :version, "PlatformVersion" :platform-version} input))

(clojure.core/defn- deser-update-param [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-update-param-type (input "type"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- deser-error-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "errorMessage") (clojure.core/assoc :error-message (deser-string (input "errorMessage"))) (clojure.core/contains? input "resourceIds") (clojure.core/assoc :resource-ids (deser-string-list (input "resourceIds")))))

(clojure.core/defn- deser-update [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-update-status (input "status"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-update-type (input "type"))) (clojure.core/contains? input "params") (clojure.core/assoc :params (deser-update-params (input "params"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "errors") (clojure.core/assoc :errors (deser-error-details (input "errors")))))

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"SubnetNotFound" :subnet-not-found, "SecurityGroupNotFound" :security-group-not-found, "EniLimitReached" :eni-limit-reached, "IpNotAvailable" :ip-not-available, "AccessDenied" :access-denied, "OperationNotPermitted" :operation-not-permitted, "VpcIdNotFound" :vpc-id-not-found, "Unknown" :unknown} input))

(clojure.core/defn- deser-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "resourcesVpcConfig") (clojure.core/assoc :resources-vpc-config (deser-vpc-config-response (input "resourcesVpcConfig"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-string (input "roleArn"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-string (input "clientRequestToken"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-cluster-status (input "status"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-string (input "version"))) (clojure.core/contains? input "platformVersion") (clojure.core/assoc :platform-version (deser-string (input "platformVersion"))) (clojure.core/contains? input "endpoint") (clojure.core/assoc :endpoint (deser-string (input "endpoint"))) (clojure.core/contains? input "certificateAuthority") (clojure.core/assoc :certificate-authority (deser-certificate (input "certificateAuthority")))))

(clojure.core/defn- deser-cluster-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting, "FAILED" :failed} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-update-params [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-update-param coll))) input))

(clojure.core/defn- deser-update-type [input] (clojure.core/get {"VersionUpdate" :version-update} input))

(clojure.core/defn- deser-error-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-detail coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-certificate [input] (clojure.core/cond-> {} (clojure.core/contains? input "data") (clojure.core/assoc :data (deser-string (input "data")))))

(clojure.core/defn- response-client-exception ([input] (response-client-exception nil input)) ([resultWrapper830515 input] (clojure.core/let [rawinput830514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830516 {"clusterName" (rawinput830514 "clusterName"), "message" (rawinput830514 "message")}] (clojure.core/cond-> {} (letvar830516 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830516 ["clusterName"]))) (letvar830516 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830516 ["message"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper830518 input] (clojure.core/let [rawinput830517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830519 {"clusterName" (rawinput830517 "clusterName"), "message" (rawinput830517 "message")}] (clojure.core/cond-> {} (letvar830519 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830519 ["clusterName"]))) (letvar830519 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830519 ["message"])))))))

(clojure.core/defn- response-list-clusters-response ([input] (response-list-clusters-response nil input)) ([resultWrapper830521 input] (clojure.core/let [rawinput830520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830522 {"clusters" (rawinput830520 "clusters"), "nextToken" (rawinput830520 "nextToken")}] (clojure.core/cond-> {} (letvar830522 "clusters") (clojure.core/assoc :clusters (deser-string-list (clojure.core/get-in letvar830522 ["clusters"]))) (letvar830522 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar830522 ["nextToken"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper830524 input] (clojure.core/let [rawinput830523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830525 {"clusterName" (rawinput830523 "clusterName"), "message" (rawinput830523 "message")}] (clojure.core/cond-> {} (letvar830525 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830525 ["clusterName"]))) (letvar830525 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830525 ["message"])))))))

(clojure.core/defn- response-describe-cluster-response ([input] (response-describe-cluster-response nil input)) ([resultWrapper830527 input] (clojure.core/let [rawinput830526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830528 {"cluster" (rawinput830526 "cluster")}] (clojure.core/cond-> {} (letvar830528 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar830528 ["cluster"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper830530 input] (clojure.core/let [rawinput830529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830531 {"message" (rawinput830529 "message")}] (clojure.core/cond-> {} (letvar830531 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830531 ["message"])))))))

(clojure.core/defn- response-delete-cluster-response ([input] (response-delete-cluster-response nil input)) ([resultWrapper830533 input] (clojure.core/let [rawinput830532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830534 {"cluster" (rawinput830532 "cluster")}] (clojure.core/cond-> {} (letvar830534 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar830534 ["cluster"])))))))

(clojure.core/defn- response-create-cluster-response ([input] (response-create-cluster-response nil input)) ([resultWrapper830536 input] (clojure.core/let [rawinput830535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830537 {"cluster" (rawinput830535 "cluster")}] (clojure.core/cond-> {} (letvar830537 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar830537 ["cluster"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper830539 input] (clojure.core/let [rawinput830538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830540 {"clusterName" (rawinput830538 "clusterName"), "message" (rawinput830538 "message")}] (clojure.core/cond-> {} (letvar830540 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830540 ["clusterName"]))) (letvar830540 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830540 ["message"])))))))

(clojure.core/defn- response-unsupported-availability-zone-exception ([input] (response-unsupported-availability-zone-exception nil input)) ([resultWrapper830542 input] (clojure.core/let [rawinput830541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830543 {"message" (rawinput830541 "message"), "clusterName" (rawinput830541 "clusterName"), "validZones" (rawinput830541 "validZones")}] (clojure.core/cond-> {} (letvar830543 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830543 ["message"]))) (letvar830543 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830543 ["clusterName"]))) (letvar830543 "validZones") (clojure.core/assoc :valid-zones (deser-string-list (clojure.core/get-in letvar830543 ["validZones"])))))))

(clojure.core/defn- response-list-updates-response ([input] (response-list-updates-response nil input)) ([resultWrapper830545 input] (clojure.core/let [rawinput830544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830546 {"updateIds" (rawinput830544 "updateIds"), "nextToken" (rawinput830544 "nextToken")}] (clojure.core/cond-> {} (letvar830546 "updateIds") (clojure.core/assoc :update-ids (deser-string-list (clojure.core/get-in letvar830546 ["updateIds"]))) (letvar830546 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar830546 ["nextToken"])))))))

(clojure.core/defn- response-server-exception ([input] (response-server-exception nil input)) ([resultWrapper830548 input] (clojure.core/let [rawinput830547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830549 {"clusterName" (rawinput830547 "clusterName"), "message" (rawinput830547 "message")}] (clojure.core/cond-> {} (letvar830549 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830549 ["clusterName"]))) (letvar830549 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830549 ["message"])))))))

(clojure.core/defn- response-resource-limit-exceeded-exception ([input] (response-resource-limit-exceeded-exception nil input)) ([resultWrapper830551 input] (clojure.core/let [rawinput830550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830552 {"clusterName" (rawinput830550 "clusterName"), "message" (rawinput830550 "message")}] (clojure.core/cond-> {} (letvar830552 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830552 ["clusterName"]))) (letvar830552 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830552 ["message"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper830554 input] (clojure.core/let [rawinput830553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830555 {"clusterName" (rawinput830553 "clusterName"), "message" (rawinput830553 "message")}] (clojure.core/cond-> {} (letvar830555 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar830555 ["clusterName"]))) (letvar830555 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar830555 ["message"])))))))

(clojure.core/defn- response-describe-update-response ([input] (response-describe-update-response nil input)) ([resultWrapper830557 input] (clojure.core/let [rawinput830556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830558 {"update" (rawinput830556 "update")}] (clojure.core/cond-> {} (letvar830558 "update") (clojure.core/assoc :update (deser-update (clojure.core/get-in letvar830558 ["update"])))))))

(clojure.core/defn- response-update-cluster-version-response ([input] (response-update-cluster-version-response nil input)) ([resultWrapper830560 input] (clojure.core/let [rawinput830559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar830561 {"update" (rawinput830559 "update")}] (clojure.core/cond-> {} (letvar830561 "update") (clojure.core/assoc :update (deser-update (clojure.core/get-in letvar830561 ["update"])))))))

(clojure.spec.alpha/def :portkey.aws.eks/list-updates-request-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.eks/list-clusters-request-max-results))
(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/list-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.list-clusters-request/max-results :portkey.aws.eks.list-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks/string-list (clojure.spec.alpha/coll-of :portkey.aws.eks/string))

(clojure.spec.alpha/def :portkey.aws.eks.client-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.client-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.client-exception/cluster-name :portkey.aws.eks.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.delete-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.delete-cluster-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks.invalid-request-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.invalid-request-exception/cluster-name :portkey.aws.eks.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/list-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.list-clusters-response/clusters :portkey.aws.eks.list-clusters-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks/update-status #{"Failed" "Cancelled" :in-progress :successful :cancelled "InProgress" "Successful" :failed})

(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-response/subnet-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-response/security-group-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-response/vpc-id (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/vpc-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.vpc-config-response/subnet-ids :portkey.aws.eks.vpc-config-response/security-group-ids :portkey.aws.eks.vpc-config-response/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.eks.resource-in-use-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.resource-in-use-exception/cluster-name :portkey.aws.eks.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.describe-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks/cluster))
(clojure.spec.alpha/def :portkey.aws.eks/describe-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.describe-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks.describe-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/describe-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.describe-cluster-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.delete-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks/cluster))
(clojure.spec.alpha/def :portkey.aws.eks/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.delete-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks/update-param-type #{:platform-version "PlatformVersion" "Version" :version})

(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks/cluster))
(clojure.spec.alpha/def :portkey.aws.eks/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.create-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks.update-param/type (clojure.spec.alpha/and :portkey.aws.eks/update-param-type))
(clojure.spec.alpha/def :portkey.aws.eks.update-param/value (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/update-param (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.update-param/type :portkey.aws.eks.update-param/value]))

(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks/vpc-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.vpc-config-request/subnet-ids] :opt-un [:portkey.aws.eks.vpc-config-request/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.eks.error-detail/error-code (clojure.spec.alpha/and :portkey.aws.eks/error-code))
(clojure.spec.alpha/def :portkey.aws.eks.error-detail/error-message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.error-detail/resource-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks/error-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.error-detail/error-code :portkey.aws.eks.error-detail/error-message :portkey.aws.eks.error-detail/resource-ids]))

(clojure.spec.alpha/def :portkey.aws.eks.update/id (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.update/status (clojure.spec.alpha/and :portkey.aws.eks/update-status))
(clojure.spec.alpha/def :portkey.aws.eks.update/type (clojure.spec.alpha/and :portkey.aws.eks/update-type))
(clojure.spec.alpha/def :portkey.aws.eks.update/params (clojure.spec.alpha/and :portkey.aws.eks/update-params))
(clojure.spec.alpha/def :portkey.aws.eks.update/created-at (clojure.spec.alpha/and :portkey.aws.eks/timestamp))
(clojure.spec.alpha/def :portkey.aws.eks.update/errors (clojure.spec.alpha/and :portkey.aws.eks/error-details))
(clojure.spec.alpha/def :portkey.aws.eks/update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.update/id :portkey.aws.eks.update/status :portkey.aws.eks.update/type :portkey.aws.eks.update/params :portkey.aws.eks.update/created-at :portkey.aws.eks.update/errors]))

(clojure.spec.alpha/def :portkey.aws.eks/error-code #{"OperationNotPermitted" "EniLimitReached" :eni-limit-reached :ip-not-available "AccessDenied" "VpcIdNotFound" :unknown "IpNotAvailable" "Unknown" "SubnetNotFound" :subnet-not-found "SecurityGroupNotFound" :security-group-not-found :vpc-id-not-found :operation-not-permitted :access-denied})

(clojure.spec.alpha/def :portkey.aws.eks.cluster/resources-vpc-config (clojure.spec.alpha/and :portkey.aws.eks/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/arn (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/created-at (clojure.spec.alpha/and :portkey.aws.eks/timestamp))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/role-arn (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/client-request-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/status (clojure.spec.alpha/and :portkey.aws.eks/cluster-status))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/version (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/platform-version (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/endpoint (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.cluster/certificate-authority (clojure.spec.alpha/and :portkey.aws.eks/certificate))
(clojure.spec.alpha/def :portkey.aws.eks/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.cluster/resources-vpc-config :portkey.aws.eks.cluster/arn :portkey.aws.eks.cluster/created-at :portkey.aws.eks.cluster/role-arn :portkey.aws.eks.cluster/client-request-token :portkey.aws.eks.cluster/name :portkey.aws.eks.cluster/status :portkey.aws.eks.cluster/version :portkey.aws.eks.cluster/platform-version :portkey.aws.eks.cluster/endpoint :portkey.aws.eks.cluster/certificate-authority]))

(clojure.spec.alpha/def :portkey.aws.eks.resource-not-found-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.resource-not-found-exception/cluster-name :portkey.aws.eks.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks/cluster-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.eks.describe-update-request/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.describe-update-request/update-id (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/describe-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.describe-update-request/name :portkey.aws.eks.describe-update-request/update-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.eks.unsupported-availability-zone-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.unsupported-availability-zone-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.unsupported-availability-zone-exception/valid-zones (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks/unsupported-availability-zone-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.unsupported-availability-zone-exception/message :portkey.aws.eks.unsupported-availability-zone-exception/cluster-name :portkey.aws.eks.unsupported-availability-zone-exception/valid-zones]))

(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks/cluster-name))
(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-request/version (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-request/role-arn (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-request/resources-vpc-config (clojure.spec.alpha/and :portkey.aws.eks/vpc-config-request))
(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-request/client-request-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.create-cluster-request/name :portkey.aws.eks.create-cluster-request/role-arn :portkey.aws.eks.create-cluster-request/resources-vpc-config] :opt-un [:portkey.aws.eks.create-cluster-request/version :portkey.aws.eks.create-cluster-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.eks/update-params (clojure.spec.alpha/coll-of :portkey.aws.eks/update-param))

(clojure.spec.alpha/def :portkey.aws.eks.list-updates-response/update-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.list-updates-response/next-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/list-updates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.list-updates-response/update-ids :portkey.aws.eks.list-updates-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks.server-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.server-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.server-exception/cluster-name :portkey.aws.eks.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks/update-type #{"VersionUpdate" :version-update})

(clojure.spec.alpha/def :portkey.aws.eks.update-cluster-version-request/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.update-cluster-version-request/version (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.update-cluster-version-request/client-request-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/update-cluster-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.update-cluster-version-request/name :portkey.aws.eks.update-cluster-version-request/version] :opt-un [:portkey.aws.eks.update-cluster-version-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.eks.resource-limit-exceeded-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.resource-limit-exceeded-exception/cluster-name :portkey.aws.eks.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks/error-details (clojure.spec.alpha/coll-of :portkey.aws.eks/error-detail))

(clojure.spec.alpha/def :portkey.aws.eks/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.eks.list-updates-request/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.list-updates-request/next-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.list-updates-request/max-results (clojure.spec.alpha/and :portkey.aws.eks/list-updates-request-max-results))
(clojure.spec.alpha/def :portkey.aws.eks/list-updates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.list-updates-request/name] :opt-un [:portkey.aws.eks.list-updates-request/next-token :portkey.aws.eks.list-updates-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.eks/cluster-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[0-9A-Za-z][A-Za-z0-9\-_]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.eks.invalid-parameter-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.invalid-parameter-exception/cluster-name :portkey.aws.eks.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.describe-update-response/update (clojure.spec.alpha/and :portkey.aws.eks/update))
(clojure.spec.alpha/def :portkey.aws.eks/describe-update-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.describe-update-response/update]))

(clojure.spec.alpha/def :portkey.aws.eks.certificate/data (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.certificate/data]))

(clojure.spec.alpha/def :portkey.aws.eks/list-clusters-request-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.eks.update-cluster-version-response/update (clojure.spec.alpha/and :portkey.aws.eks/update))
(clojure.spec.alpha/def :portkey.aws.eks/update-cluster-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.update-cluster-version-response/update]))

(clojure.core/defn create-cluster "Creates an Amazon EKS control plane.\n The Amazon EKS control plane consists of control plane instances that run the\nKubernetes software, like etcd and the API server. The control plane runs in an\naccount managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API\nserver endpoint.\n Amazon EKS worker nodes run in your AWS account and connect to your cluster's\ncontrol plane via the Kubernetes API server endpoint and a certificate file that\nis created for your cluster.\n The cluster control plane is provisioned across multiple Availability Zones and\nfronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also\nprovisions elastic network interfaces in your VPC subnets to provide\nconnectivity from the control plane instances to the worker nodes (for example,\nto support kubectl exec, logs, and proxy data flows).\n After you create an Amazon EKS cluster, you must configure your Kubernetes\ntooling to communicate with the API server and launch worker nodes into your\ncluster. For more information, see Managing Cluster Authentication\n(http://docs.aws.amazon.com/eks/latest/userguide/managing-auth.html) and\nLaunching Amazon EKS Worker Nodes\n(http://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html)in the\nAmazon EKS User Guide." ([create-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/create-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.eks/resource-in-use-exception, "ResourceLimitExceededException" :portkey.aws.eks/resource-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception, "UnsupportedAvailabilityZoneException" :portkey.aws.eks/unsupported-availability-zone-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/create-cluster-response))

(clojure.core/defn delete-cluster "Deletes the Amazon EKS cluster control plane.\n If you have active services in your cluster that are associated with a load\nbalancer, you must delete those services before deleting the cluster so that the\nload balancers are deleted properly. Otherwise, you can have orphaned resources\nin your VPC that prevent you from being able to delete the VPC. For more\ninformation, see Deleting a Cluster\n(http://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html) in the\nAmazon EKS User Guide." ([delete-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/delete-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCluster", :http.request.configuration/output-deser-fn response-delete-cluster-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.eks/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/delete-cluster-response))

(clojure.core/defn describe-cluster "Returns descriptive information about an Amazon EKS cluster.\n The API server endpoint and certificate authority data returned by this\noperation are required for kubelet and kubectl to communicate with your\nKubernetes API server. For more information, see Create a kubeconfig for Amazon\nEKS (http://docs.aws.amazon.com/eks/latest/userguide/create-kubeconfig.html).\n The API server endpoint and certificate authority data are not available until\nthe cluster reaches the ACTIVE state." ([describe-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-cluster-request describe-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/describe-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/describe-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCluster", :http.request.configuration/output-deser-fn response-describe-cluster-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks/describe-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/describe-cluster-response))

(clojure.core/defn describe-update "Returns descriptive information about an update against your Amazon EKS cluster.\n When the status of the update is Succeeded, the update is complete. If an\nupdate fails, the status is Failed, and an error detail explains the reason for\nthe failure." ([describe-update-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-update-request describe-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/describe-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}/updates/{updateId}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/describe-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUpdate", :http.request.configuration/output-deser-fn response-describe-update-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-update :args (clojure.spec.alpha/tuple :portkey.aws.eks/describe-update-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/describe-update-response))

(clojure.core/defn list-clusters "Lists the Amazon EKS clusters in your AWS account in the specified Region." ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/list-clusters-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/list-clusters-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClusters", :http.request.configuration/output-deser-fn response-list-clusters-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.eks/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/list-clusters-response))

(clojure.core/defn list-updates "Lists the updates associated with an Amazon EKS cluster in your AWS account, in\nthe specified Region." ([list-updates-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-updates-request list-updates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/list-updates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}/updates", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/list-updates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUpdates", :http.request.configuration/output-deser-fn response-list-updates-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-updates :args (clojure.spec.alpha/tuple :portkey.aws.eks/list-updates-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/list-updates-response))

(clojure.core/defn update-cluster-version "Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster\ncontinues to function during the update. The response output includes an update\nID that you can use to track the status of your cluster update with the\nDescribeUpdate API operation.\n Cluster updates are asynchronous, and they should finish within a few minutes.\nDuring an update, the cluster status moves to UPDATING (this status transition\nis eventually consistent). When the update is complete (either Failed or\nSuccessful), the cluster status moves to Active." ([update-cluster-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-cluster-version-request update-cluster-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks/update-cluster-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}/updates", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/update-cluster-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateClusterVersion", :http.request.configuration/output-deser-fn response-update-cluster-version-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ResourceInUseException" :portkey.aws.eks/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception, "InvalidRequestException" :portkey.aws.eks/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-cluster-version :args (clojure.spec.alpha/tuple :portkey.aws.eks/update-cluster-version-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/update-cluster-version-response))
