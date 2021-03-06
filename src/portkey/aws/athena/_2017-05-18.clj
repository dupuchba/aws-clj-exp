(ns portkey.aws.athena.-2017-05-18 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "athena", :region "ap-northeast-1"},
    :ssl-common-name "athena.ap-northeast-1.amazonaws.com",
    :endpoint "https://athena.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "athena", :region "eu-west-1"},
    :ssl-common-name "athena.eu-west-1.amazonaws.com",
    :endpoint "https://athena.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "athena", :region "us-east-2"},
    :ssl-common-name "athena.us-east-2.amazonaws.com",
    :endpoint "https://athena.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "athena", :region "ap-southeast-2"},
    :ssl-common-name "athena.ap-southeast-2.amazonaws.com",
    :endpoint "https://athena.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "athena", :region "ap-southeast-1"},
    :ssl-common-name "athena.ap-southeast-1.amazonaws.com",
    :endpoint "https://athena.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "athena", :region "ap-northeast-2"},
    :ssl-common-name "athena.ap-northeast-2.amazonaws.com",
    :endpoint "https://athena.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "athena", :region "eu-central-1"},
    :ssl-common-name "athena.eu-central-1.amazonaws.com",
    :endpoint "https://athena.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "athena", :region "eu-west-2"},
    :ssl-common-name "athena.eu-west-2.amazonaws.com",
    :endpoint "https://athena.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "athena", :region "us-gov-west-1"},
    :ssl-common-name "athena.us-gov-west-1.amazonaws.com",
    :endpoint "https://athena.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "athena", :region "us-west-2"},
    :ssl-common-name "athena.us-west-2.amazonaws.com",
    :endpoint "https://athena.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "athena", :region "us-east-1"},
    :ssl-common-name "athena.us-east-1.amazonaws.com",
    :endpoint "https://athena.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "athena", :region "ap-south-1"},
    :ssl-common-name "athena.ap-south-1.amazonaws.com",
    :endpoint "https://athena.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-work-group-name)

(clojure.core/declare ser-work-group-configuration)

(clojure.core/declare ser-work-group-description-string)

(clojure.core/declare ser-query-execution-id)

(clojure.core/declare ser-boxed-boolean)

(clojure.core/declare ser-encryption-configuration)

(clojure.core/declare ser-work-group-state)

(clojure.core/declare ser-named-query-id-list)

(clojure.core/declare ser-amazon-resource-name)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-database-string)

(clojure.core/declare ser-encryption-option)

(clojure.core/declare ser-query-string)

(clojure.core/declare ser-named-query-id)

(clojure.core/declare ser-max-query-results)

(clojure.core/declare ser-result-configuration-updates)

(clojure.core/declare ser-work-group-configuration-updates)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-query-execution-context)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-query-execution-id-list)

(clojure.core/declare ser-max-tags-count)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-max-query-executions-count)

(clojure.core/declare ser-string)

(clojure.core/declare ser-name-string)

(clojure.core/declare ser-description-string)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-bytes-scanned-cutoff-value)

(clojure.core/declare ser-max-named-queries-count)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-result-configuration)

(clojure.core/declare ser-token)

(clojure.core/declare ser-max-work-groups-count)

(clojure.core/defn- ser-work-group-name [input] #:http.request.field{:value input, :shape "WorkGroupName"})

(clojure.core/defn- ser-work-group-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WorkGroupConfiguration", :type "structure"} (clojure.core/contains? input :result-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-configuration (input :result-configuration)) #:http.request.field{:name "ResultConfiguration", :shape "ResultConfiguration"})) (clojure.core/contains? input :enforce-work-group-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :enforce-work-group-configuration)) #:http.request.field{:name "EnforceWorkGroupConfiguration", :shape "BoxedBoolean"})) (clojure.core/contains? input :publish-cloud-watch-metrics-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :publish-cloud-watch-metrics-enabled)) #:http.request.field{:name "PublishCloudWatchMetricsEnabled", :shape "BoxedBoolean"})) (clojure.core/contains? input :bytes-scanned-cutoff-per-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bytes-scanned-cutoff-value (input :bytes-scanned-cutoff-per-query)) #:http.request.field{:name "BytesScannedCutoffPerQuery", :shape "BytesScannedCutoffValue"}))))

(clojure.core/defn- ser-work-group-description-string [input] #:http.request.field{:value input, :shape "WorkGroupDescriptionString"})

(clojure.core/defn- ser-query-execution-id [input] #:http.request.field{:value input, :shape "QueryExecutionId"})

(clojure.core/defn- ser-boxed-boolean [input] #:http.request.field{:value input, :shape "BoxedBoolean"})

(clojure.core/defn- ser-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-encryption-option (:encryption-option input)) #:http.request.field{:name "EncryptionOption", :shape "EncryptionOption"})], :shape "EncryptionConfiguration", :type "structure"} (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key)) #:http.request.field{:name "KmsKey", :shape "String"}))))

(clojure.core/defn- ser-work-group-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "WorkGroupState"})

(clojure.core/defn- ser-named-query-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-named-query-id coll) #:http.request.field{:shape "NamedQueryId"}))) input), :shape "NamedQueryIdList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-amazon-resource-name [input] #:http.request.field{:value input, :shape "AmazonResourceName"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-database-string [input] #:http.request.field{:value input, :shape "DatabaseString"})

(clojure.core/defn- ser-encryption-option [input] #:http.request.field{:value (clojure.core/get {"SSE_S3" "SSE_S3", :sse-s-3 "SSE_S3", "SSE_KMS" "SSE_KMS", :sse-kms "SSE_KMS", "CSE_KMS" "CSE_KMS", :cse-kms "CSE_KMS"} input), :shape "EncryptionOption"})

(clojure.core/defn- ser-query-string [input] #:http.request.field{:value input, :shape "QueryString"})

(clojure.core/defn- ser-named-query-id [input] #:http.request.field{:value input, :shape "NamedQueryId"})

(clojure.core/defn- ser-max-query-results [input] #:http.request.field{:value input, :shape "MaxQueryResults"})

(clojure.core/defn- ser-result-configuration-updates [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResultConfigurationUpdates", :type "structure"} (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "String"})) (clojure.core/contains? input :remove-output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :remove-output-location)) #:http.request.field{:name "RemoveOutputLocation", :shape "BoxedBoolean"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})) (clojure.core/contains? input :remove-encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :remove-encryption-configuration)) #:http.request.field{:name "RemoveEncryptionConfiguration", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-work-group-configuration-updates [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WorkGroupConfigurationUpdates", :type "structure"} (clojure.core/contains? input :enforce-work-group-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :enforce-work-group-configuration)) #:http.request.field{:name "EnforceWorkGroupConfiguration", :shape "BoxedBoolean"})) (clojure.core/contains? input :result-configuration-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-configuration-updates (input :result-configuration-updates)) #:http.request.field{:name "ResultConfigurationUpdates", :shape "ResultConfigurationUpdates"})) (clojure.core/contains? input :publish-cloud-watch-metrics-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :publish-cloud-watch-metrics-enabled)) #:http.request.field{:name "PublishCloudWatchMetricsEnabled", :shape "BoxedBoolean"})) (clojure.core/contains? input :bytes-scanned-cutoff-per-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bytes-scanned-cutoff-value (input :bytes-scanned-cutoff-per-query)) #:http.request.field{:name "BytesScannedCutoffPerQuery", :shape "BytesScannedCutoffValue"})) (clojure.core/contains? input :remove-bytes-scanned-cutoff-per-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :remove-bytes-scanned-cutoff-per-query)) #:http.request.field{:name "RemoveBytesScannedCutoffPerQuery", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-query-execution-context [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "QueryExecutionContext", :type "structure"} (clojure.core/contains? input :database) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-database-string (input :database)) #:http.request.field{:name "Database", :shape "DatabaseString"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-query-execution-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-execution-id coll) #:http.request.field{:shape "QueryExecutionId"}))) input), :shape "QueryExecutionIdList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-max-tags-count [input] #:http.request.field{:value input, :shape "MaxTagsCount"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-max-query-executions-count [input] #:http.request.field{:value input, :shape "MaxQueryExecutionsCount"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-name-string [input] #:http.request.field{:value input, :shape "NameString"})

(clojure.core/defn- ser-description-string [input] #:http.request.field{:value input, :shape "DescriptionString"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-bytes-scanned-cutoff-value [input] #:http.request.field{:value input, :shape "BytesScannedCutoffValue"})

(clojure.core/defn- ser-max-named-queries-count [input] #:http.request.field{:value input, :shape "MaxNamedQueriesCount"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-result-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResultConfiguration", :type "structure"} (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "String"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"}))))

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-max-work-groups-count [input] #:http.request.field{:value input, :shape "MaxWorkGroupsCount"})

(clojure.core/defn- req-list-work-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-work-groups-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxWorkGroupsCount"}))))

(clojure.core/defn- req-get-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"})]}))

(clojure.core/defn- req-get-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id (input :named-query-id)) #:http.request.field{:name "NamedQueryId", :shape "NamedQueryId"})]}))

(clojure.core/defn- req-tag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "AmazonResourceName"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-batch-get-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id-list (input :query-execution-ids)) #:http.request.field{:name "QueryExecutionIds", :shape "QueryExecutionIdList"})]}))

(clojure.core/defn- req-batch-get-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id-list (input :named-query-ids)) #:http.request.field{:name "NamedQueryIds", :shape "NamedQueryIdList"})]}))

(clojure.core/defn- req-get-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId"})]}))

(clojure.core/defn- req-stop-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId", :idempotency-token true})]}))

(clojure.core/defn- req-list-tags-for-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-tags-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxTagsCount"}))))

(clojure.core/defn- req-get-query-results-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-query-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxQueryResults"}))))

(clojure.core/defn- req-untag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "AmazonResourceName"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-create-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-database-string (input :database)) #:http.request.field{:name "Database", :shape "DatabaseString"}) (clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "QueryString", :shape "QueryString"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "IdempotencyToken", :idempotency-token true})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-start-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "QueryString", :shape "QueryString"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "IdempotencyToken", :idempotency-token true})) (clojure.core/contains? input :query-execution-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-execution-context (input :query-execution-context)) #:http.request.field{:name "QueryExecutionContext", :shape "QueryExecutionContext"})) (clojure.core/contains? input :result-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-configuration (input :result-configuration)) #:http.request.field{:name "ResultConfiguration", :shape "ResultConfiguration"})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-list-query-executions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-query-executions-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxQueryExecutionsCount"})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-update-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-description-string (input :description)) #:http.request.field{:name "Description", :shape "WorkGroupDescriptionString"})) (clojure.core/contains? input :configuration-updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-configuration-updates (input :configuration-updates)) #:http.request.field{:name "ConfigurationUpdates", :shape "WorkGroupConfigurationUpdates"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-state (input :state)) #:http.request.field{:name "State", :shape "WorkGroupState"}))))

(clojure.core/defn- req-create-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :name)) #:http.request.field{:name "Name", :shape "WorkGroupName"})]} (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-configuration (input :configuration)) #:http.request.field{:name "Configuration", :shape "WorkGroupConfiguration"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-description-string (input :description)) #:http.request.field{:name "Description", :shape "WorkGroupDescriptionString"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-list-named-queries-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-named-queries-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxNamedQueriesCount"})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-delete-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id (input :named-query-id)) #:http.request.field{:name "NamedQueryId", :shape "NamedQueryId", :idempotency-token true})]}))

(clojure.core/defn- req-delete-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"})]} (clojure.core/contains? input :recursive-delete-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :recursive-delete-option)) #:http.request.field{:name "RecursiveDeleteOption", :shape "BoxedBoolean"}))))

(clojure.core/declare deser-unprocessed-named-query-id)

(clojure.core/declare deser-query-execution-state)

(clojure.core/declare deser-work-group-name)

(clojure.core/declare deser-work-group-configuration)

(clojure.core/declare deser-statement-type)

(clojure.core/declare deser-work-group-description-string)

(clojure.core/declare deser-query-execution-id)

(clojure.core/declare deser-boxed-boolean)

(clojure.core/declare deser-encryption-configuration)

(clojure.core/declare deser-work-group-state)

(clojure.core/declare deser-named-query-id-list)

(clojure.core/declare deser-amazon-resource-name)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-work-group)

(clojure.core/declare deser-database-string)

(clojure.core/declare deser-query-execution-status)

(clojure.core/declare deser-encryption-option)

(clojure.core/declare deser-query-string)

(clojure.core/declare deserdatum-string)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-named-query-id)

(clojure.core/declare deser-date)

(clojure.core/declare deser-row)

(clojure.core/declare deser-column-info)

(clojure.core/declare deser-throttle-reason)

(clojure.core/declare deser-named-query)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-query-execution-context)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-column-nullable)

(clojure.core/declare deser-query-execution-id-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-result-set)

(clojure.core/declare deser-result-set-metadata)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-name-string)

(clojure.core/declare deser-query-execution-statistics)

(clojure.core/declare deser-unprocessed-named-query-id-list)

(clojure.core/declare deser-description-string)

(clojure.core/declare deser-work-group-summary)

(clojure.core/declare deser-query-execution-list)

(clojure.core/declare deser-row-list)

(clojure.core/declare deser-unprocessed-query-execution-id)

(clojure.core/declare deser-long)

(clojure.core/declare deser-bytes-scanned-cutoff-value)

(clojure.core/declare deser-unprocessed-query-execution-id-list)

(clojure.core/declare deserdatum-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-column-info-list)

(clojure.core/declare deser-query-execution)

(clojure.core/declare deser-work-groups-list)

(clojure.core/declare deser-result-configuration)

(clojure.core/declare deser-named-query-list)

(clojure.core/declare deser-token)

(clojure.core/declare deser-datum)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-unprocessed-named-query-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "NamedQueryId") (clojure.core/assoc :named-query-id (deser-named-query-id (input "NamedQueryId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-query-execution-state [input] (clojure.core/get {"QUEUED" :queued, "RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed, "CANCELLED" :cancelled} input))

(clojure.core/defn- deser-work-group-name [input] input)

(clojure.core/defn- deser-work-group-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResultConfiguration") (clojure.core/assoc :result-configuration (deser-result-configuration (input "ResultConfiguration"))) (clojure.core/contains? input "EnforceWorkGroupConfiguration") (clojure.core/assoc :enforce-work-group-configuration (deser-boxed-boolean (input "EnforceWorkGroupConfiguration"))) (clojure.core/contains? input "PublishCloudWatchMetricsEnabled") (clojure.core/assoc :publish-cloud-watch-metrics-enabled (deser-boxed-boolean (input "PublishCloudWatchMetricsEnabled"))) (clojure.core/contains? input "BytesScannedCutoffPerQuery") (clojure.core/assoc :bytes-scanned-cutoff-per-query (deser-bytes-scanned-cutoff-value (input "BytesScannedCutoffPerQuery")))))

(clojure.core/defn- deser-statement-type [input] (clojure.core/get {"DDL" :ddl, "DML" :dml, "UTILITY" :utility} input))

(clojure.core/defn- deser-work-group-description-string [input] input)

(clojure.core/defn- deser-query-execution-id [input] input)

(clojure.core/defn- deser-boxed-boolean [input] input)

(clojure.core/defn- deser-encryption-configuration [input] (clojure.core/cond-> {:encryption-option (deser-encryption-option (input "EncryptionOption"))} (clojure.core/contains? input "KmsKey") (clojure.core/assoc :kms-key (deser-string (input "KmsKey")))))

(clojure.core/defn- deser-work-group-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-named-query-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-named-query-id coll))) input))

(clojure.core/defn- deser-amazon-resource-name [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-work-group [input] (clojure.core/cond-> {:name (deser-work-group-name (input "Name"))} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-work-group-state (input "State"))) (clojure.core/contains? input "Configuration") (clojure.core/assoc :configuration (deser-work-group-configuration (input "Configuration"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-work-group-description-string (input "Description"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date (input "CreationTime")))))

(clojure.core/defn- deser-database-string [input] input)

(clojure.core/defn- deser-query-execution-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-query-execution-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-string (input "StateChangeReason"))) (clojure.core/contains? input "SubmissionDateTime") (clojure.core/assoc :submission-date-time (deser-date (input "SubmissionDateTime"))) (clojure.core/contains? input "CompletionDateTime") (clojure.core/assoc :completion-date-time (deser-date (input "CompletionDateTime")))))

(clojure.core/defn- deser-encryption-option [input] (clojure.core/get {"SSE_S3" :sse-s-3, "SSE_KMS" :sse-kms, "CSE_KMS" :cse-kms} input))

(clojure.core/defn- deser-query-string [input] input)

(clojure.core/defn- deserdatum-string [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-named-query-id [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-row [input] (clojure.core/cond-> {} (clojure.core/contains? input "Data") (clojure.core/assoc :data (deserdatum-list (input "Data")))))

(clojure.core/defn- deser-column-info [input] (clojure.core/cond-> {:name (deser-string (input "Name")), :type (deser-string (input "Type"))} (clojure.core/contains? input "Precision") (clojure.core/assoc :precision (deser-integer (input "Precision"))) (clojure.core/contains? input "Nullable") (clojure.core/assoc :nullable (deser-column-nullable (input "Nullable"))) (clojure.core/contains? input "CatalogName") (clojure.core/assoc :catalog-name (deser-string (input "CatalogName"))) (clojure.core/contains? input "CaseSensitive") (clojure.core/assoc :case-sensitive (deser-boolean (input "CaseSensitive"))) (clojure.core/contains? input "Scale") (clojure.core/assoc :scale (deser-integer (input "Scale"))) (clojure.core/contains? input "Label") (clojure.core/assoc :label (deser-string (input "Label"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-string (input "TableName"))) (clojure.core/contains? input "SchemaName") (clojure.core/assoc :schema-name (deser-string (input "SchemaName")))))

(clojure.core/defn- deser-throttle-reason [input] (clojure.core/get {"CONCURRENT_QUERY_LIMIT_EXCEEDED" :concurrent-query-limit-exceeded} input))

(clojure.core/defn- deser-named-query [input] (clojure.core/cond-> {:name (deser-name-string (input "Name")), :database (deser-database-string (input "Database")), :query-string (deser-query-string (input "QueryString"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "NamedQueryId") (clojure.core/assoc :named-query-id (deser-named-query-id (input "NamedQueryId"))) (clojure.core/contains? input "WorkGroup") (clojure.core/assoc :work-group (deser-work-group-name (input "WorkGroup")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-execution-context [input] (clojure.core/cond-> {} (clojure.core/contains? input "Database") (clojure.core/assoc :database (deser-database-string (input "Database")))))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-column-nullable [input] (clojure.core/get {"NOT_NULL" :not-null, "NULLABLE" :nullable, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-query-execution-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-execution-id coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-result-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "Rows") (clojure.core/assoc :rows (deser-row-list (input "Rows"))) (clojure.core/contains? input "ResultSetMetadata") (clojure.core/assoc :result-set-metadata (deser-result-set-metadata (input "ResultSetMetadata")))))

(clojure.core/defn- deser-result-set-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "ColumnInfo") (clojure.core/assoc :column-info (deser-column-info-list (input "ColumnInfo")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-name-string [input] input)

(clojure.core/defn- deser-query-execution-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "EngineExecutionTimeInMillis") (clojure.core/assoc :engine-execution-time-in-millis (deser-long (input "EngineExecutionTimeInMillis"))) (clojure.core/contains? input "DataScannedInBytes") (clojure.core/assoc :data-scanned-in-bytes (deser-long (input "DataScannedInBytes")))))

(clojure.core/defn- deser-unprocessed-named-query-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-named-query-id coll))) input))

(clojure.core/defn- deser-description-string [input] input)

(clojure.core/defn- deser-work-group-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-work-group-name (input "Name"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-work-group-state (input "State"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-work-group-description-string (input "Description"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date (input "CreationTime")))))

(clojure.core/defn- deser-query-execution-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-execution coll))) input))

(clojure.core/defn- deser-row-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-row coll))) input))

(clojure.core/defn- deser-unprocessed-query-execution-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "QueryExecutionId") (clojure.core/assoc :query-execution-id (deser-query-execution-id (input "QueryExecutionId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-bytes-scanned-cutoff-value [input] input)

(clojure.core/defn- deser-unprocessed-query-execution-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-query-execution-id coll))) input))

(clojure.core/defn- deserdatum-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-datum coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-column-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-column-info coll))) input))

(clojure.core/defn- deser-query-execution [input] (clojure.core/cond-> {} (clojure.core/contains? input "QueryExecutionId") (clojure.core/assoc :query-execution-id (deser-query-execution-id (input "QueryExecutionId"))) (clojure.core/contains? input "Query") (clojure.core/assoc :query (deser-query-string (input "Query"))) (clojure.core/contains? input "StatementType") (clojure.core/assoc :statement-type (deser-statement-type (input "StatementType"))) (clojure.core/contains? input "ResultConfiguration") (clojure.core/assoc :result-configuration (deser-result-configuration (input "ResultConfiguration"))) (clojure.core/contains? input "QueryExecutionContext") (clojure.core/assoc :query-execution-context (deser-query-execution-context (input "QueryExecutionContext"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-query-execution-status (input "Status"))) (clojure.core/contains? input "Statistics") (clojure.core/assoc :statistics (deser-query-execution-statistics (input "Statistics"))) (clojure.core/contains? input "WorkGroup") (clojure.core/assoc :work-group (deser-work-group-name (input "WorkGroup")))))

(clojure.core/defn- deser-work-groups-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-work-group-summary coll))) input))

(clojure.core/defn- deser-result-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "OutputLocation") (clojure.core/assoc :output-location (deser-string (input "OutputLocation"))) (clojure.core/contains? input "EncryptionConfiguration") (clojure.core/assoc :encryption-configuration (deser-encryption-configuration (input "EncryptionConfiguration")))))

(clojure.core/defn- deser-named-query-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-named-query coll))) input))

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-datum [input] (clojure.core/cond-> {} (clojure.core/contains? input "VarCharValue") (clojure.core/assoc :var-char-value (deserdatum-string (input "VarCharValue")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-stop-query-execution-output ([input] (response-stop-query-execution-output nil input)) ([resultWrapper113652 input] (clojure.core/let [rawinput113651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113653 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper113655 input] (clojure.core/let [rawinput113654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113656 {"AthenaErrorCode" (rawinput113654 "AthenaErrorCode"), "Message" (rawinput113654 "Message")}] (clojure.core/cond-> {} (letvar113656 "AthenaErrorCode") (clojure.core/assoc :athena-error-code (deser-error-code (clojure.core/get-in letvar113656 ["AthenaErrorCode"]))) (letvar113656 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar113656 ["Message"])))))))

(clojure.core/defn- response-get-query-execution-output ([input] (response-get-query-execution-output nil input)) ([resultWrapper113658 input] (clojure.core/let [rawinput113657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113659 {"QueryExecution" (rawinput113657 "QueryExecution")}] (clojure.core/cond-> {} (letvar113659 "QueryExecution") (clojure.core/assoc :query-execution (deser-query-execution (clojure.core/get-in letvar113659 ["QueryExecution"])))))))

(clojure.core/defn- response-update-work-group-output ([input] (response-update-work-group-output nil input)) ([resultWrapper113661 input] (clojure.core/let [rawinput113660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113662 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-work-group-output ([input] (response-create-work-group-output nil input)) ([resultWrapper113664 input] (clojure.core/let [rawinput113663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113665 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-resource-output ([input] (response-tag-resource-output nil input)) ([resultWrapper113667 input] (clojure.core/let [rawinput113666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113668 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-named-queries-output ([input] (response-list-named-queries-output nil input)) ([resultWrapper113670 input] (clojure.core/let [rawinput113669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113671 {"NamedQueryIds" (rawinput113669 "NamedQueryIds"), "NextToken" (rawinput113669 "NextToken")}] (clojure.core/cond-> {} (letvar113671 "NamedQueryIds") (clojure.core/assoc :named-query-ids (deser-named-query-id-list (clojure.core/get-in letvar113671 ["NamedQueryIds"]))) (letvar113671 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar113671 ["NextToken"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper113673 input] (clojure.core/let [rawinput113672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113674 {"Message" (rawinput113672 "Message"), "Reason" (rawinput113672 "Reason")}] (clojure.core/cond-> {} (letvar113674 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar113674 ["Message"]))) (letvar113674 "Reason") (clojure.core/assoc :reason (deser-throttle-reason (clojure.core/get-in letvar113674 ["Reason"])))))))

(clojure.core/defn- response-batch-get-named-query-output ([input] (response-batch-get-named-query-output nil input)) ([resultWrapper113676 input] (clojure.core/let [rawinput113675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113677 {"NamedQueries" (rawinput113675 "NamedQueries"), "UnprocessedNamedQueryIds" (rawinput113675 "UnprocessedNamedQueryIds")}] (clojure.core/cond-> {} (letvar113677 "NamedQueries") (clojure.core/assoc :named-queries (deser-named-query-list (clojure.core/get-in letvar113677 ["NamedQueries"]))) (letvar113677 "UnprocessedNamedQueryIds") (clojure.core/assoc :unprocessed-named-query-ids (deser-unprocessed-named-query-id-list (clojure.core/get-in letvar113677 ["UnprocessedNamedQueryIds"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper113679 input] (clojure.core/let [rawinput113678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113680 {"Message" (rawinput113678 "Message"), "ResourceName" (rawinput113678 "ResourceName")}] (clojure.core/cond-> {} (letvar113680 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar113680 ["Message"]))) (letvar113680 "ResourceName") (clojure.core/assoc :resource-name (deser-amazon-resource-name (clojure.core/get-in letvar113680 ["ResourceName"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper113682 input] (clojure.core/let [rawinput113681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113683 {"Message" (rawinput113681 "Message")}] (clojure.core/cond-> {} (letvar113683 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar113683 ["Message"])))))))

(clojure.core/defn- response-create-named-query-output ([input] (response-create-named-query-output nil input)) ([resultWrapper113685 input] (clojure.core/let [rawinput113684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113686 {"NamedQueryId" (rawinput113684 "NamedQueryId")}] (clojure.core/cond-> {} (letvar113686 "NamedQueryId") (clojure.core/assoc :named-query-id (deser-named-query-id (clojure.core/get-in letvar113686 ["NamedQueryId"])))))))

(clojure.core/defn- response-start-query-execution-output ([input] (response-start-query-execution-output nil input)) ([resultWrapper113688 input] (clojure.core/let [rawinput113687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113689 {"QueryExecutionId" (rawinput113687 "QueryExecutionId")}] (clojure.core/cond-> {} (letvar113689 "QueryExecutionId") (clojure.core/assoc :query-execution-id (deser-query-execution-id (clojure.core/get-in letvar113689 ["QueryExecutionId"])))))))

(clojure.core/defn- response-get-named-query-output ([input] (response-get-named-query-output nil input)) ([resultWrapper113691 input] (clojure.core/let [rawinput113690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113692 {"NamedQuery" (rawinput113690 "NamedQuery")}] (clojure.core/cond-> {} (letvar113692 "NamedQuery") (clojure.core/assoc :named-query (deser-named-query (clojure.core/get-in letvar113692 ["NamedQuery"])))))))

(clojure.core/defn- response-delete-named-query-output ([input] (response-delete-named-query-output nil input)) ([resultWrapper113694 input] (clojure.core/let [rawinput113693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113695 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-query-execution-output ([input] (response-batch-get-query-execution-output nil input)) ([resultWrapper113697 input] (clojure.core/let [rawinput113696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113698 {"QueryExecutions" (rawinput113696 "QueryExecutions"), "UnprocessedQueryExecutionIds" (rawinput113696 "UnprocessedQueryExecutionIds")}] (clojure.core/cond-> {} (letvar113698 "QueryExecutions") (clojure.core/assoc :query-executions (deser-query-execution-list (clojure.core/get-in letvar113698 ["QueryExecutions"]))) (letvar113698 "UnprocessedQueryExecutionIds") (clojure.core/assoc :unprocessed-query-execution-ids (deser-unprocessed-query-execution-id-list (clojure.core/get-in letvar113698 ["UnprocessedQueryExecutionIds"])))))))

(clojure.core/defn- response-list-work-groups-output ([input] (response-list-work-groups-output nil input)) ([resultWrapper113700 input] (clojure.core/let [rawinput113699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113701 {"WorkGroups" (rawinput113699 "WorkGroups"), "NextToken" (rawinput113699 "NextToken")}] (clojure.core/cond-> {} (letvar113701 "WorkGroups") (clojure.core/assoc :work-groups (deser-work-groups-list (clojure.core/get-in letvar113701 ["WorkGroups"]))) (letvar113701 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar113701 ["NextToken"])))))))

(clojure.core/defn- response-list-tags-for-resource-output ([input] (response-list-tags-for-resource-output nil input)) ([resultWrapper113703 input] (clojure.core/let [rawinput113702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113704 {"Tags" (rawinput113702 "Tags"), "NextToken" (rawinput113702 "NextToken")}] (clojure.core/cond-> {} (letvar113704 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar113704 ["Tags"]))) (letvar113704 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar113704 ["NextToken"])))))))

(clojure.core/defn- response-delete-work-group-output ([input] (response-delete-work-group-output nil input)) ([resultWrapper113706 input] (clojure.core/let [rawinput113705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113707 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-output ([input] (response-untag-resource-output nil input)) ([resultWrapper113709 input] (clojure.core/let [rawinput113708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113710 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-work-group-output ([input] (response-get-work-group-output nil input)) ([resultWrapper113712 input] (clojure.core/let [rawinput113711 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113713 {"WorkGroup" (rawinput113711 "WorkGroup")}] (clojure.core/cond-> {} (letvar113713 "WorkGroup") (clojure.core/assoc :work-group (deser-work-group (clojure.core/get-in letvar113713 ["WorkGroup"])))))))

(clojure.core/defn- response-get-query-results-output ([input] (response-get-query-results-output nil input)) ([resultWrapper113715 input] (clojure.core/let [rawinput113714 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113716 {"UpdateCount" (rawinput113714 "UpdateCount"), "ResultSet" (rawinput113714 "ResultSet"), "NextToken" (rawinput113714 "NextToken")}] (clojure.core/cond-> {} (letvar113716 "UpdateCount") (clojure.core/assoc :update-count (deser-long (clojure.core/get-in letvar113716 ["UpdateCount"]))) (letvar113716 "ResultSet") (clojure.core/assoc :result-set (deser-result-set (clojure.core/get-in letvar113716 ["ResultSet"]))) (letvar113716 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar113716 ["NextToken"])))))))

(clojure.core/defn- response-list-query-executions-output ([input] (response-list-query-executions-output nil input)) ([resultWrapper113718 input] (clojure.core/let [rawinput113717 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar113719 {"QueryExecutionIds" (rawinput113717 "QueryExecutionIds"), "NextToken" (rawinput113717 "NextToken")}] (clojure.core/cond-> {} (letvar113719 "QueryExecutionIds") (clojure.core/assoc :query-execution-ids (deser-query-execution-id-list (clojure.core/get-in letvar113719 ["QueryExecutionIds"]))) (letvar113719 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar113719 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/named-query-id :portkey.aws.athena.-2017-05-18/error-code :portkey.aws.athena.-2017-05-18/error-message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/stop-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-work-groups-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-work-groups-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-work-groups-count))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-work-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-work-groups-input/next-token :portkey.aws.athena.-2017-05-18.list-work-groups-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-work-group-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.get-work-group-input/work-group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-state #{:running :queued :cancelled "SUCCEEDED" "QUEUED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-z0-9._-]{1,128}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration/enforce-work-group-configuration (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration/publish-cloud-watch-metrics-enabled (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration/bytes-scanned-cutoff-per-query (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/bytes-scanned-cutoff-value))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/result-configuration :portkey.aws.athena.-2017-05-18.work-group-configuration/enforce-work-group-configuration :portkey.aws.athena.-2017-05-18.work-group-configuration/publish-cloud-watch-metrics-enabled :portkey.aws.athena.-2017-05-18.work-group-configuration/bytes-scanned-cutoff-per-query]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/statement-type #{:utility :ddl :dml "DML" "DDL" "UTILITY"})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group-description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.invalid-request-exception/athena-error-code (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-code))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.invalid-request-exception/athena-error-code :portkey.aws.athena.-2017-05-18.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/boxed-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.encryption-configuration/kms-key (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/encryption-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/encryption-option] :opt-un [:portkey.aws.athena.-2017-05-18.encryption-configuration/kms-key]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/named-query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/update-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/create-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/named-query-id :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/amazon-resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1011))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.tag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.tag-resource-input/tags (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.tag-resource-input/resource-arn :portkey.aws.athena.-2017-05-18.tag-resource-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group/state (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-state))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group/configuration (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-configuration))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group/creation-time (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/date))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.work-group/name] :opt-un [:portkey.aws.athena.-2017-05-18.work-group/state :portkey.aws.athena.-2017-05-18.work-group/configuration :portkey.aws.athena.-2017-05-18.work-group/description :portkey.aws.athena.-2017-05-18.work-group/creation-time]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/database-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-query-execution-input/query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.batch-get-query-execution-input/query-execution-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/state (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-state))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/submission-date-time (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/date))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/completion-date-time (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/date))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.query-execution-status/state :portkey.aws.athena.-2017-05-18.query-execution-status/state-change-reason :portkey.aws.athena.-2017-05-18.query-execution-status/submission-date-time :portkey.aws.athena.-2017-05-18.query-execution-status/completion-date-time]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/encryption-option #{:sse-kms :cse-kms :sse-s-3 "CSE_KMS" "SSE_S3" "SSE_KMS"})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 262144))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-named-query-input/named-query-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.batch-get-named-query-input/named-query-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/datum-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-output/named-query-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-named-queries-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-named-queries-output/named-query-ids :portkey.aws.athena.-2017-05-18.list-named-queries-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-query-results (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-configuration-updates/output-location (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-configuration-updates/remove-output-location (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-configuration-updates/remove-encryption-configuration (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-configuration-updates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.result-configuration-updates/output-location :portkey.aws.athena.-2017-05-18.result-configuration-updates/remove-output-location :portkey.aws.athena.-2017-05-18/encryption-configuration :portkey.aws.athena.-2017-05-18.result-configuration-updates/remove-encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/enforce-work-group-configuration (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/publish-cloud-watch-metrics-enabled (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/bytes-scanned-cutoff-per-query (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/bytes-scanned-cutoff-value))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/remove-bytes-scanned-cutoff-per-query (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group-configuration-updates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.work-group-configuration-updates/enforce-work-group-configuration :portkey.aws.athena.-2017-05-18/result-configuration-updates :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/publish-cloud-watch-metrics-enabled :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/bytes-scanned-cutoff-per-query :portkey.aws.athena.-2017-05-18.work-group-configuration-updates/remove-bytes-scanned-cutoff-per-query]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.too-many-requests-exception/message :portkey.aws.athena.-2017-05-18.too-many-requests-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.row/data (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/datum-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/row (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.row/data]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/precision (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/integer))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/nullable (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/column-nullable))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/catalog-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/type (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/case-sensitive (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/scale (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/integer))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/label (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/table-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/schema-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/column-info (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.column-info/name :portkey.aws.athena.-2017-05-18.column-info/type] :opt-un [:portkey.aws.athena.-2017-05-18.column-info/precision :portkey.aws.athena.-2017-05-18.column-info/nullable :portkey.aws.athena.-2017-05-18.column-info/catalog-name :portkey.aws.athena.-2017-05-18.column-info/case-sensitive :portkey.aws.athena.-2017-05-18.column-info/scale :portkey.aws.athena.-2017-05-18.column-info/label :portkey.aws.athena.-2017-05-18.column-info/table-name :portkey.aws.athena.-2017-05-18.column-info/schema-name]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/throttle-reason #{"CONCURRENT_QUERY_LIMIT_EXCEEDED" :concurrent-query-limit-exceeded})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/name-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/database (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.named-query/name :portkey.aws.athena.-2017-05-18.named-query/database :portkey.aws.athena.-2017-05-18/query-string] :opt-un [:portkey.aws.athena.-2017-05-18.named-query/description :portkey.aws.athena.-2017-05-18/named-query-id :portkey.aws.athena.-2017-05-18.named-query/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/tag))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/stop-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-context/database (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.query-execution-context/database]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/tag-key))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-named-query-output/named-queries (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/named-query-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-named-query-output/unprocessed-named-query-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.batch-get-named-query-output/named-queries :portkey.aws.athena.-2017-05-18.batch-get-named-query-output/unprocessed-named-query-ids]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.resource-not-found-exception/resource-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.resource-not-found-exception/message :portkey.aws.athena.-2017-05-18.resource-not-found-exception/resource-name]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/create-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/named-query-id]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/column-nullable #{"UNKNOWN" :unknown "NULLABLE" "NOT_NULL" :not-null :nullable})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/query-execution-id :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-tags-count (clojure.spec.alpha/int-in 75 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-tags-for-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-tags-for-resource-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-tags-for-resource-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-tags-count))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-tags-for-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.list-tags-for-resource-input/resource-arn] :opt-un [:portkey.aws.athena.-2017-05-18.list-tags-for-resource-input/next-token :portkey.aws.athena.-2017-05-18.list-tags-for-resource-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-query-results))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-results-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-execution-id] :opt-un [:portkey.aws.athena.-2017-05-18.get-query-results-input/next-token :portkey.aws.athena.-2017-05-18.get-query-results-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-set/rows (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/row-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.result-set/rows :portkey.aws.athena.-2017-05-18/result-set-metadata]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-set-metadata/column-info (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/column-info-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-set-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.result-set-metadata/column-info]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.untag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.untag-resource-input/tag-keys (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/untag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.untag-resource-input/resource-arn :portkey.aws.athena.-2017-05-18.untag-resource-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-query-executions-count (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/start-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution-id]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/named-query]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/name-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/database (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/client-request-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/create-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.create-named-query-input/name :portkey.aws.athena.-2017-05-18.create-named-query-input/database :portkey.aws.athena.-2017-05-18/query-string] :opt-un [:portkey.aws.athena.-2017-05-18.create-named-query-input/description :portkey.aws.athena.-2017-05-18.create-named-query-input/client-request-token :portkey.aws.athena.-2017-05-18.create-named-query-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.start-query-execution-input/client-request-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.start-query-execution-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/start-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-string] :opt-un [:portkey.aws.athena.-2017-05-18.start-query-execution-input/client-request-token :portkey.aws.athena.-2017-05-18/query-execution-context :portkey.aws.athena.-2017-05-18/result-configuration :portkey.aws.athena.-2017-05-18.start-query-execution-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/delete-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-statistics/engine-execution-time-in-millis (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/long))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-statistics/data-scanned-in-bytes (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/long))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.query-execution-statistics/engine-execution-time-in-millis :portkey.aws.athena.-2017-05-18.query-execution-statistics/data-scanned-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/query-executions (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/unprocessed-query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/query-executions :portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/unprocessed-query-execution-ids]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-summary/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-summary/state (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-state))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-summary/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.work-group-summary/creation-time (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/date))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-group-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.work-group-summary/name :portkey.aws.athena.-2017-05-18.work-group-summary/state :portkey.aws.athena.-2017-05-18.work-group-summary/description :portkey.aws.athena.-2017-05-18.work-group-summary/creation-time]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-query-executions-count))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-query-executions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-query-executions-input/next-token :portkey.aws.athena.-2017-05-18.list-query-executions-input/max-results :portkey.aws.athena.-2017-05-18.list-query-executions-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 32 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-work-groups-output/work-groups (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-groups-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-work-groups-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-work-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-work-groups-output/work-groups :portkey.aws.athena.-2017-05-18.list-work-groups-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/query-execution))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/row-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/row))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-tags-for-resource-output/tags (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-tags-for-resource-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-tags-for-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-tags-for-resource-output/tags :portkey.aws.athena.-2017-05-18.list-tags-for-resource-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution-id :portkey.aws.athena.-2017-05-18/error-code :portkey.aws.athena.-2017-05-18/error-message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.update-work-group-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.update-work-group-input/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.update-work-group-input/configuration-updates (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-configuration-updates))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.update-work-group-input/state (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-state))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/update-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.update-work-group-input/work-group] :opt-un [:portkey.aws.athena.-2017-05-18.update-work-group-input/description :portkey.aws.athena.-2017-05-18.update-work-group-input/configuration-updates :portkey.aws.athena.-2017-05-18.update-work-group-input/state]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/bytes-scanned-cutoff-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/delete-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/datum-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/datum))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-named-queries-count (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.tag/key (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-key))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.tag/value (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-value))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.tag/key :portkey.aws.athena.-2017-05-18.tag/value]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/column-info-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/column-info))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/query (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/status (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-status))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/statistics (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-statistics))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution-id :portkey.aws.athena.-2017-05-18.query-execution/query :portkey.aws.athena.-2017-05-18/statement-type :portkey.aws.athena.-2017-05-18/result-configuration :portkey.aws.athena.-2017-05-18/query-execution-context :portkey.aws.athena.-2017-05-18.query-execution/status :portkey.aws.athena.-2017-05-18.query-execution/statistics :portkey.aws.athena.-2017-05-18.query-execution/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/work-groups-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/work-group-summary :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/untag-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-configuration/output-location (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.result-configuration/output-location :portkey.aws.athena.-2017-05-18/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-work-group-input/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-work-group-input/configuration (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-configuration))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-work-group-input/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-work-group-input/tags (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/create-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.create-work-group-input/name] :opt-un [:portkey.aws.athena.-2017-05-18.create-work-group-input/configuration :portkey.aws.athena.-2017-05-18.create-work-group-input/description :portkey.aws.athena.-2017-05-18.create-work-group-input/tags]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/named-query))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-output/update-count (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/long))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-results-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.get-query-results-output/update-count :portkey.aws.athena.-2017-05-18/result-set :portkey.aws.athena.-2017-05-18.get-query-results-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-work-groups-count (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-named-queries-count))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-named-queries-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-named-queries-input/next-token :portkey.aws.athena.-2017-05-18.list-named-queries-input/max-results :portkey.aws.athena.-2017-05-18.list-named-queries-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.datum/var-char-value (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/datum-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/datum (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.datum/var-char-value]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/delete-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/named-query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.delete-work-group-input/work-group (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.delete-work-group-input/recursive-delete-option (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/delete-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.delete-work-group-input/work-group] :opt-un [:portkey.aws.athena.-2017-05-18.delete-work-group-input/recursive-delete-option]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-output/query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-query-executions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-query-executions-output/query-execution-ids :portkey.aws.athena.-2017-05-18.list-query-executions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/boolean clojure.core/boolean?)

(clojure.core/defn tag-resource "Adds one or more tags to the resource, such as a workgroup. A tag is a label\nthat you assign to an AWS Athena resource (a workgroup). Each tag consists of a\nkey and an optional value, both of which you define. Tags enable you to\ncategorize resources (workgroups) in Athena, for example, by purpose, owner, or\nenvironment. Use a consistent set of tag keys to make it easier to search and\nfilter workgroups in your account. For best practices, see AWS Tagging\nStrategies\n(https://aws.amazon.com/answers/account-management/aws-tagging-strategies/). The\nkey length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The\ntag value length is from 0 (minimum) to 256 (maximum) Unicode characters in\nUTF-8. You can use letters and numbers representable in UTF-8, and the following\ncharacters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys\nmust be unique per resource. If you specify more than one, separate them by\ncommas." ([tag-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-input tag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/tag-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/tag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.athena.-2017-05-18/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/tag-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/tag-resource-output))

(clojure.core/defn get-work-group "Returns information about the workgroup with the specified name." ([get-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-work-group-input get-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetWorkGroup", :http.request.configuration/output-deser-fn response-get-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-work-group-output))

(clojure.core/defn list-named-queries "Provides a list of available query IDs only for queries saved in the specified\nworkgroup. Requires that you have access to the workgroup.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([] (list-named-queries {})) ([list-named-queries-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-named-queries-input list-named-queries-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/list-named-queries-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/list-named-queries-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListNamedQueries", :http.request.configuration/output-deser-fn response-list-named-queries-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-named-queries :args (clojure.spec.alpha/? :portkey.aws.athena.-2017-05-18/list-named-queries-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/list-named-queries-output))

(clojure.core/defn update-work-group "Updates the workgroup with the specified name. The workgroup's name cannot be\nchanged." ([update-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-work-group-input update-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/update-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/update-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateWorkGroup", :http.request.configuration/output-deser-fn response-update-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/update-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/update-work-group-output))

(clojure.core/defn delete-work-group "Deletes the workgroup with the specified name. The primary workgroup cannot be\ndeleted." ([delete-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-work-group-input delete-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/delete-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/delete-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteWorkGroup", :http.request.configuration/output-deser-fn response-delete-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/delete-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/delete-work-group-output))

(clojure.core/defn stop-query-execution "Stops a query execution. Requires you to have access to the workgroup in which\nthe query ran.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([stop-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-query-execution-input stop-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/stop-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/stop-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopQueryExecution", :http.request.configuration/output-deser-fn response-stop-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef stop-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/stop-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/stop-query-execution-output))

(clojure.core/defn list-tags-for-resource "Lists the tags associated with this workgroup." ([list-tags-for-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-input list-tags-for-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/list-tags-for-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/list-tags-for-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.athena.-2017-05-18/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/list-tags-for-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/list-tags-for-resource-output))

(clojure.core/defn list-query-executions "Provides a list of available query execution IDs for the queries in the\nspecified workgroup. Requires you to have access to the workgroup in which the\nqueries ran.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([] (list-query-executions {})) ([list-query-executions-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-query-executions-input list-query-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/list-query-executions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/list-query-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListQueryExecutions", :http.request.configuration/output-deser-fn response-list-query-executions-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-query-executions :args (clojure.spec.alpha/? :portkey.aws.athena.-2017-05-18/list-query-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/list-query-executions-output))

(clojure.core/defn start-query-execution "Runs the SQL query statements contained in the Query. Requires you to have\naccess to the workgroup in which the query ran.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([start-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-query-execution-input start-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/start-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/start-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartQueryExecution", :http.request.configuration/output-deser-fn response-start-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception, "TooManyRequestsException" :portkey.aws.athena.-2017-05-18/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef start-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/start-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/start-query-execution-output))

(clojure.core/defn delete-named-query "Deletes the named query if you have access to the workgroup in which the query\nwas saved.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([delete-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-named-query-input delete-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/delete-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/delete-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNamedQuery", :http.request.configuration/output-deser-fn response-delete-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/delete-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/delete-named-query-output))

(clojure.core/defn list-work-groups "Lists available workgroups for the account." ([] (list-work-groups {})) ([list-work-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-work-groups-input list-work-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/list-work-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/list-work-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWorkGroups", :http.request.configuration/output-deser-fn response-list-work-groups-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-work-groups :args (clojure.spec.alpha/? :portkey.aws.athena.-2017-05-18/list-work-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/list-work-groups-output))

(clojure.core/defn get-named-query "Returns information about a single query. Requires that you have access to the\nworkgroup in which the query was saved." ([get-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-named-query-input get-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetNamedQuery", :http.request.configuration/output-deser-fn response-get-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-named-query-output))

(clojure.core/defn get-query-execution "Returns information about a single execution of a query if you have access to\nthe workgroup in which the query ran. Each time a query executes, information\nabout the query execution is saved with a unique ID." ([get-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-query-execution-input get-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueryExecution", :http.request.configuration/output-deser-fn response-get-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-query-execution-output))

(clojure.core/defn batch-get-named-query "Returns the details of a single named query or a list of up to 50 queries, which\nyou provide as an array of query ID strings. Requires you to have access to the\nworkgroup in which the queries were saved. Use ListNamedQueriesInput to get the\nlist of named query IDs in the specified workgroup. If information could not be\nretrieved for a submitted query ID, information about the query ID submitted is\nlisted under UnprocessedNamedQueryId. Named queries differ from executed\nqueries. Use BatchGetQueryExecutionInput to get details about each unique query\nexecution, and ListQueryExecutionsInput to get a list of query execution IDs." ([batch-get-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-named-query-input batch-get-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/batch-get-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/batch-get-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetNamedQuery", :http.request.configuration/output-deser-fn response-batch-get-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef batch-get-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/batch-get-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/batch-get-named-query-output))

(clojure.core/defn untag-resource "Removes one or more tags from the workgroup resource. Takes as an input a list\nof TagKey Strings separated by commas, and removes their tags at the same time." ([untag-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-input untag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/untag-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/untag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.athena.-2017-05-18/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/untag-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/untag-resource-output))

(clojure.core/defn create-work-group "Creates a workgroup with the specified name." ([create-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-work-group-input create-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/create-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/create-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateWorkGroup", :http.request.configuration/output-deser-fn response-create-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/create-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/create-work-group-output))

(clojure.core/defn create-named-query "Creates a named query in the specified workgroup. Requires that you have access\nto the workgroup.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([create-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-named-query-input create-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/create-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/create-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNamedQuery", :http.request.configuration/output-deser-fn response-create-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/create-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/create-named-query-output))

(clojure.core/defn batch-get-query-execution "Returns the details of a single query execution or a list of up to 50 query\nexecutions, which you provide as an array of query execution ID strings.\nRequires you to have access to the workgroup in which the queries ran. To get a\nlist of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query\nexecutions differ from named (saved) queries. Use BatchGetNamedQueryInput to get\ndetails about named queries." ([batch-get-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-query-execution-input batch-get-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/batch-get-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/batch-get-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetQueryExecution", :http.request.configuration/output-deser-fn response-batch-get-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef batch-get-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/batch-get-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/batch-get-query-execution-output))

(clojure.core/defn get-query-results "Returns the results of a single query execution specified by QueryExecutionId if\nyou have access to the workgroup in which the query ran. This request does not\nexecute the query but returns results. Use StartQueryExecution to run a query." ([get-query-results-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-query-results-input get-query-results-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-query-results-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-query-results-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueryResults", :http.request.configuration/output-deser-fn response-get-query-results-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-query-results :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-query-results-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-query-results-output))
