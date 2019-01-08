(ns portkey.aws.eks (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-vpc-config-request)

(clojure.core/declare ser-string)

(clojure.core/declare ser-cluster-name)

(clojure.core/declare ser-list-clusters-request-max-results)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-vpc-config-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:subnet-ids input)) #:http.request.field{:name "subnetIds", :shape "StringList"})], :shape "VpcConfigRequest", :type "structure"} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "StringList"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-cluster-name [input] #:http.request.field{:value input, :shape "ClusterName"})

(clojure.core/defn- ser-list-clusters-request-max-results [input] #:http.request.field{:value input, :shape "ListClustersRequestMaxResults"})

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-clusters-request-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListClustersRequestMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-describe-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-name (input :name)) #:http.request.field{:name "name", :shape "ClusterName"}) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "roleArn", :shape "String"}) (clojure.core/into (ser-vpc-config-request (input :resources-vpc-config)) #:http.request.field{:name "resourcesVpcConfig", :shape "VpcConfigRequest"})]} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "version", :shape "String"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "String", :idempotency-token true}))))

(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.eks/list-clusters-request-max-results))
(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/list-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.list-clusters-request/max-results :portkey.aws.eks.list-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks/string-list (clojure.spec.alpha/coll-of :portkey.aws.eks/string))

(clojure.spec.alpha/def :portkey.aws.eks.client-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.client-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.client-exception/cluster-name :portkey.aws.eks.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.delete-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.delete-cluster-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.list-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/list-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.list-clusters-response/clusters :portkey.aws.eks.list-clusters-response/next-token]))

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

(clojure.spec.alpha/def :portkey.aws.eks.create-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks/cluster))
(clojure.spec.alpha/def :portkey.aws.eks/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.create-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.vpc-config-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.eks/string-list))
(clojure.spec.alpha/def :portkey.aws.eks/vpc-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.vpc-config-request/subnet-ids] :opt-un [:portkey.aws.eks.vpc-config-request/security-group-ids]))

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

(clojure.spec.alpha/def :portkey.aws.eks.server-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.server-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.server-exception/cluster-name :portkey.aws.eks.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.resource-limit-exceeded-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.resource-limit-exceeded-exception/cluster-name :portkey.aws.eks.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.eks/cluster-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 255)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[A-Za-z0-9\-_]*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.eks.invalid-parameter-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.invalid-parameter-exception/cluster-name :portkey.aws.eks.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.certificate/data (clojure.spec.alpha/and :portkey.aws.eks/string))
(clojure.spec.alpha/def :portkey.aws.eks/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.certificate/data]))

(clojure.spec.alpha/def :portkey.aws.eks/list-clusters-request-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.core/defn create-cluster ([create-cluster-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.spec/output-spec :portkey.aws.eks/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/create-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCluster", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.eks/resource-in-use-exception, "ResourceLimitExceededException" :portkey.aws.eks/resource-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception, "UnsupportedAvailabilityZoneException" :portkey.aws.eks/unsupported-availability-zone-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/create-cluster-response))

(clojure.core/defn delete-cluster ([delete-cluster-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.spec/output-spec :portkey.aws.eks/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/delete-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCluster", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.eks/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/delete-cluster-response))

(clojure.core/defn describe-cluster ([describe-cluster-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-cluster-request describe-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.spec/output-spec :portkey.aws.eks/describe-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/describe-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCluster", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.eks/resource-not-found-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks/describe-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/describe-cluster-response))

(clojure.core/defn list-clusters ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.eks/endpoints, :http.request.spec/output-spec :portkey.aws.eks/list-clusters-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks/list-clusters-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListClusters", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks/invalid-parameter-exception, "ClientException" :portkey.aws.eks/client-exception, "ServerException" :portkey.aws.eks/server-exception, "ServiceUnavailableException" :portkey.aws.eks/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.eks/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.eks/list-clusters-response))