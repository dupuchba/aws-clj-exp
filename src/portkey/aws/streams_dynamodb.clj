(ns portkey.aws.streams-dynamodb (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "dynamodb", :region "us-gov-east-1"},
    :ssl-common-name "streams.dynamodb.us-gov-east-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "dynamodb", :region "ap-northeast-1"},
    :ssl-common-name "streams.dynamodb.ap-northeast-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dynamodb", :region "eu-west-1"},
    :ssl-common-name "streams.dynamodb.eu-west-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dynamodb", :region "us-east-2"},
    :ssl-common-name "streams.dynamodb.us-east-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dynamodb", :region "ap-southeast-2"},
    :ssl-common-name "streams.dynamodb.ap-southeast-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "dynamodb", :region "cn-north-1"},
    :ssl-common-name "streams.dynamodb.cn-north-1.amazonaws.com.cn",
    :endpoint "https://streams.dynamodb.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dynamodb", :region "sa-east-1"},
    :ssl-common-name "streams.dynamodb.sa-east-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dynamodb", :region "ap-southeast-1"},
    :ssl-common-name "streams.dynamodb.ap-southeast-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "dynamodb", :region "cn-northwest-1"},
    :ssl-common-name
    "streams.dynamodb.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://streams.dynamodb.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "dynamodb", :region "ap-northeast-2"},
    :ssl-common-name "streams.dynamodb.ap-northeast-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "dynamodb", :region "eu-west-3"},
    :ssl-common-name "streams.dynamodb.eu-west-3.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1-fips"
   {:credential-scope
    {:service "streams.dynamodb", :region "us-gov-west-1"},
    :ssl-common-name "dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "dynamodb", :region "ca-central-1"},
    :ssl-common-name "streams.dynamodb.ca-central-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "dynamodb", :region "eu-central-1"},
    :ssl-common-name "streams.dynamodb.eu-central-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "dynamodb", :region "eu-west-2"},
    :ssl-common-name "streams.dynamodb.eu-west-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "dynamodb", :region "us-gov-west-1"},
    :ssl-common-name "streams.dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "local"
   {:credential-scope
    {:service "streams.dynamodb", :region "us-east-1"},
    :ssl-common-name "localhost:8000",
    :endpoint "http://localhost:8000",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dynamodb", :region "us-west-2"},
    :ssl-common-name "streams.dynamodb.us-west-2.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dynamodb", :region "us-east-1"},
    :ssl-common-name "streams.dynamodb.us-east-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dynamodb", :region "us-west-1"},
    :ssl-common-name "streams.dynamodb.us-west-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dynamodb", :region "ap-south-1"},
    :ssl-common-name "streams.dynamodb.ap-south-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "dynamodb", :region "eu-north-1"},
    :ssl-common-name "streams.dynamodb.eu-north-1.amazonaws.com",
    :endpoint "https://streams.dynamodb.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-shard-id)

(clojure.core/declare ser-shard-iterator-type)

(clojure.core/declare ser-shard-iterator)

(clojure.core/declare ser-sequence-number)

(clojure.core/declare ser-stream-arn)

(clojure.core/declare ser-table-name)

(clojure.core/declare ser-positive-integer-object)

(clojure.core/defn- ser-shard-id [input] #:http.request.field{:value input, :shape "ShardId"})

(clojure.core/defn- ser-shard-iterator-type [input] #:http.request.field{:value (clojure.core/get {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER", :at-sequence-number "AT_SEQUENCE_NUMBER", "AFTER_SEQUENCE_NUMBER" "AFTER_SEQUENCE_NUMBER", :after-sequence-number "AFTER_SEQUENCE_NUMBER"} input), :shape "ShardIteratorType"})

(clojure.core/defn- ser-shard-iterator [input] #:http.request.field{:value input, :shape "ShardIterator"})

(clojure.core/defn- ser-sequence-number [input] #:http.request.field{:value input, :shape "SequenceNumber"})

(clojure.core/defn- ser-stream-arn [input] #:http.request.field{:value input, :shape "StreamArn"})

(clojure.core/defn- ser-table-name [input] #:http.request.field{:value input, :shape "TableName"})

(clojure.core/defn- ser-positive-integer-object [input] #:http.request.field{:value input, :shape "PositiveIntegerObject"})

(clojure.core/defn- req-get-shard-iterator-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamArn", :shape "StreamArn"}) (clojure.core/into (ser-shard-id (input :shard-id)) #:http.request.field{:name "ShardId", :shape "ShardId"}) (clojure.core/into (ser-shard-iterator-type (input :shard-iterator-type)) #:http.request.field{:name "ShardIteratorType", :shape "ShardIteratorType"})]} (clojure.core/contains? input :sequence-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sequence-number (input :sequence-number)) #:http.request.field{:name "SequenceNumber", :shape "SequenceNumber"}))))

(clojure.core/defn- req-get-records-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-shard-iterator (input :shard-iterator)) #:http.request.field{:name "ShardIterator", :shape "ShardIterator"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"}))))

(clojure.core/defn- req-list-streams-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :table-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-table-name (input :table-name)) #:http.request.field{:name "TableName", :shape "TableName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :exclusive-start-stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-arn (input :exclusive-start-stream-arn)) #:http.request.field{:name "ExclusiveStartStreamArn", :shape "StreamArn"}))))

(clojure.core/defn- req-describe-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-arn (input :stream-arn)) #:http.request.field{:name "StreamArn", :shape "StreamArn"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntegerObject"})) (clojure.core/contains? input :exclusive-start-shard-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shard-id (input :exclusive-start-shard-id)) #:http.request.field{:name "ExclusiveStartShardId", :shape "ShardId"}))))

(clojure.core/declare deser-attribute-map)

(clojure.core/declare deser-number-set-attribute-value)

(clojure.core/declare deser-number-attribute-value)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-positive-long-object)

(clojure.core/declare deser-shard-id)

(clojure.core/declare deser-boolean-attribute-value)

(clojure.core/declare deser-shard-iterator)

(clojure.core/declare deser-null-attribute-value)

(clojure.core/declare deser-map-attribute-value)

(clojure.core/declare deser-shard)

(clojure.core/declare deser-key-schema)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-date)

(clojure.core/declare deser-binary-set-attribute-value)

(clojure.core/declare deser-stream-description)

(clojure.core/declare deser-sequence-number)

(clojure.core/declare deser-stream-view-type)

(clojure.core/declare deser-binary-attribute-value)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-stream-arn)

(clojure.core/declare deser-stream-record)

(clojure.core/declare deser-stream-status)

(clojure.core/declare deser-string)

(clojure.core/declare deser-record)

(clojure.core/declare deser-record-list)

(clojure.core/declare deser-operation-type)

(clojure.core/declare deser-identity)

(clojure.core/declare deser-stream-list)

(clojure.core/declare deser-table-name)

(clojure.core/declare deser-stream)

(clojure.core/declare deser-key-schema-element)

(clojure.core/declare deser-shard-description-list)

(clojure.core/declare deser-sequence-number-range)

(clojure.core/declare deser-list-attribute-value)

(clojure.core/declare deser-string-attribute-value)

(clojure.core/declare deser-string-set-attribute-value)

(clojure.core/declare deser-key-schema-attribute-name)

(clojure.core/declare deser-key-type)

(clojure.core/defn- deser-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-number-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-number-attribute-value coll))) input))

(clojure.core/defn- deser-number-attribute-value [input] input)

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-positive-long-object [input] input)

(clojure.core/defn- deser-shard-id [input] input)

(clojure.core/defn- deser-boolean-attribute-value [input] input)

(clojure.core/defn- deser-shard-iterator [input] input)

(clojure.core/defn- deser-null-attribute-value [input] input)

(clojure.core/defn- deser-map-attribute-value [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-shard [input] (clojure.core/cond-> {} (clojure.core/contains? input "ShardId") (clojure.core/assoc :shard-id (deser-shard-id (input "ShardId"))) (clojure.core/contains? input "SequenceNumberRange") (clojure.core/assoc :sequence-number-range (deser-sequence-number-range (input "SequenceNumberRange"))) (clojure.core/contains? input "ParentShardId") (clojure.core/assoc :parent-shard-id (deser-shard-id (input "ParentShardId")))))

(clojure.core/defn- deser-key-schema [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-schema-element coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-binary-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-binary-attribute-value coll))) input))

(clojure.core/defn- deser-stream-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "StreamLabel") (clojure.core/assoc :stream-label (deser-string (input "StreamLabel"))) (clojure.core/contains? input "Shards") (clojure.core/assoc :shards (deser-shard-description-list (input "Shards"))) (clojure.core/contains? input "LastEvaluatedShardId") (clojure.core/assoc :last-evaluated-shard-id (deser-shard-id (input "LastEvaluatedShardId"))) (clojure.core/contains? input "KeySchema") (clojure.core/assoc :key-schema (deser-key-schema (input "KeySchema"))) (clojure.core/contains? input "StreamViewType") (clojure.core/assoc :stream-view-type (deser-stream-view-type (input "StreamViewType"))) (clojure.core/contains? input "CreationRequestDateTime") (clojure.core/assoc :creation-request-date-time (deser-date (input "CreationRequestDateTime"))) (clojure.core/contains? input "StreamArn") (clojure.core/assoc :stream-arn (deser-stream-arn (input "StreamArn"))) (clojure.core/contains? input "StreamStatus") (clojure.core/assoc :stream-status (deser-stream-status (input "StreamStatus"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-table-name (input "TableName")))))

(clojure.core/defn- deser-sequence-number [input] input)

(clojure.core/defn- deser-stream-view-type [input] (clojure.core/get {"NEW_IMAGE" :new-image, "OLD_IMAGE" :old-image, "NEW_AND_OLD_IMAGES" :new-and-old-images, "KEYS_ONLY" :keys-only} input))

(clojure.core/defn- deser-binary-attribute-value [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "NULL") (clojure.core/assoc :null (deser-null-attribute-value (input "NULL"))) (clojure.core/contains? input "L") (clojure.core/assoc :l (deser-list-attribute-value (input "L"))) (clojure.core/contains? input "BOOL") (clojure.core/assoc :bool (deser-boolean-attribute-value (input "BOOL"))) (clojure.core/contains? input "M") (clojure.core/assoc :m (deser-map-attribute-value (input "M"))) (clojure.core/contains? input "S") (clojure.core/assoc :s (deser-string-attribute-value (input "S"))) (clojure.core/contains? input "B") (clojure.core/assoc :b (deser-binary-attribute-value (input "B"))) (clojure.core/contains? input "NS") (clojure.core/assoc :ns (deser-number-set-attribute-value (input "NS"))) (clojure.core/contains? input "N") (clojure.core/assoc :n (deser-number-attribute-value (input "N"))) (clojure.core/contains? input "BS") (clojure.core/assoc :bs (deser-binary-set-attribute-value (input "BS"))) (clojure.core/contains? input "SS") (clojure.core/assoc :ss (deser-string-set-attribute-value (input "SS")))))

(clojure.core/defn- deser-stream-arn [input] input)

(clojure.core/defn- deser-stream-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "ApproximateCreationDateTime") (clojure.core/assoc :approximate-creation-date-time (deser-date (input "ApproximateCreationDateTime"))) (clojure.core/contains? input "Keys") (clojure.core/assoc :keys (deser-attribute-map (input "Keys"))) (clojure.core/contains? input "NewImage") (clojure.core/assoc :new-image (deser-attribute-map (input "NewImage"))) (clojure.core/contains? input "OldImage") (clojure.core/assoc :old-image (deser-attribute-map (input "OldImage"))) (clojure.core/contains? input "SequenceNumber") (clojure.core/assoc :sequence-number (deser-sequence-number (input "SequenceNumber"))) (clojure.core/contains? input "SizeBytes") (clojure.core/assoc :size-bytes (deser-positive-long-object (input "SizeBytes"))) (clojure.core/contains? input "StreamViewType") (clojure.core/assoc :stream-view-type (deser-stream-view-type (input "StreamViewType")))))

(clojure.core/defn- deser-stream-status [input] (clojure.core/get {"ENABLING" :enabling, "ENABLED" :enabled, "DISABLING" :disabling, "DISABLED" :disabled} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "eventID") (clojure.core/assoc :event-id (deser-string (input "eventID"))) (clojure.core/contains? input "eventName") (clojure.core/assoc :event-name (deser-operation-type (input "eventName"))) (clojure.core/contains? input "eventVersion") (clojure.core/assoc :event-version (deser-string (input "eventVersion"))) (clojure.core/contains? input "eventSource") (clojure.core/assoc :event-source (deser-string (input "eventSource"))) (clojure.core/contains? input "awsRegion") (clojure.core/assoc :aws-region (deser-string (input "awsRegion"))) (clojure.core/contains? input "dynamodb") (clojure.core/assoc :dynamodb (deser-stream-record (input "dynamodb"))) (clojure.core/contains? input "userIdentity") (clojure.core/assoc :user-identity (deser-identity (input "userIdentity")))))

(clojure.core/defn- deser-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record coll))) input))

(clojure.core/defn- deser-operation-type [input] (clojure.core/get {"INSERT" :insert, "MODIFY" :modify, "REMOVE" :remove} input))

(clojure.core/defn- deser-identity [input] (clojure.core/cond-> {} (clojure.core/contains? input "PrincipalId") (clojure.core/assoc :principal-id (deser-string (input "PrincipalId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type")))))

(clojure.core/defn- deser-stream-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stream coll))) input))

(clojure.core/defn- deser-table-name [input] input)

(clojure.core/defn- deser-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "StreamArn") (clojure.core/assoc :stream-arn (deser-stream-arn (input "StreamArn"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-table-name (input "TableName"))) (clojure.core/contains? input "StreamLabel") (clojure.core/assoc :stream-label (deser-string (input "StreamLabel")))))

(clojure.core/defn- deser-key-schema-element [input] (clojure.core/cond-> {:attribute-name (deser-key-schema-attribute-name (input "AttributeName")), :key-type (deser-key-type (input "KeyType"))}))

(clojure.core/defn- deser-shard-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-shard coll))) input))

(clojure.core/defn- deser-sequence-number-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "StartingSequenceNumber") (clojure.core/assoc :starting-sequence-number (deser-sequence-number (input "StartingSequenceNumber"))) (clojure.core/contains? input "EndingSequenceNumber") (clojure.core/assoc :ending-sequence-number (deser-sequence-number (input "EndingSequenceNumber")))))

(clojure.core/defn- deser-list-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-value coll))) input))

(clojure.core/defn- deser-string-attribute-value [input] input)

(clojure.core/defn- deser-string-set-attribute-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-attribute-value coll))) input))

(clojure.core/defn- deser-key-schema-attribute-name [input] input)

(clojure.core/defn- deser-key-type [input] (clojure.core/get {"HASH" :hash, "RANGE" :range} input))

(clojure.core/defn- response-describe-stream-output ([input] (response-describe-stream-output nil input)) ([resultWrapper1820164 input] (clojure.core/let [rawinput1820163 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820165 {"StreamDescription" (rawinput1820163 "StreamDescription")}] (clojure.core/cond-> {} (letvar1820165 "StreamDescription") (clojure.core/assoc :stream-description (deser-stream-description (clojure.core/get-in letvar1820165 ["StreamDescription"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1820167 input] (clojure.core/let [rawinput1820166 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820168 {"message" (rawinput1820166 "message")}] (clojure.core/cond-> {} (letvar1820168 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1820168 ["message"])))))))

(clojure.core/defn- response-expired-iterator-exception ([input] (response-expired-iterator-exception nil input)) ([resultWrapper1820170 input] (clojure.core/let [rawinput1820169 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820171 {"message" (rawinput1820169 "message")}] (clojure.core/cond-> {} (letvar1820171 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1820171 ["message"])))))))

(clojure.core/defn- response-get-records-output ([input] (response-get-records-output nil input)) ([resultWrapper1820173 input] (clojure.core/let [rawinput1820172 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820174 {"Records" (rawinput1820172 "Records"), "NextShardIterator" (rawinput1820172 "NextShardIterator")}] (clojure.core/cond-> {} (letvar1820174 "Records") (clojure.core/assoc :records (deser-record-list (clojure.core/get-in letvar1820174 ["Records"]))) (letvar1820174 "NextShardIterator") (clojure.core/assoc :next-shard-iterator (deser-shard-iterator (clojure.core/get-in letvar1820174 ["NextShardIterator"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1820176 input] (clojure.core/let [rawinput1820175 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820177 {"message" (rawinput1820175 "message")}] (clojure.core/cond-> {} (letvar1820177 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1820177 ["message"])))))))

(clojure.core/defn- response-list-streams-output ([input] (response-list-streams-output nil input)) ([resultWrapper1820179 input] (clojure.core/let [rawinput1820178 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820180 {"Streams" (rawinput1820178 "Streams"), "LastEvaluatedStreamArn" (rawinput1820178 "LastEvaluatedStreamArn")}] (clojure.core/cond-> {} (letvar1820180 "Streams") (clojure.core/assoc :streams (deser-stream-list (clojure.core/get-in letvar1820180 ["Streams"]))) (letvar1820180 "LastEvaluatedStreamArn") (clojure.core/assoc :last-evaluated-stream-arn (deser-stream-arn (clojure.core/get-in letvar1820180 ["LastEvaluatedStreamArn"])))))))

(clojure.core/defn- response-trimmed-data-access-exception ([input] (response-trimmed-data-access-exception nil input)) ([resultWrapper1820182 input] (clojure.core/let [rawinput1820181 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820183 {"message" (rawinput1820181 "message")}] (clojure.core/cond-> {} (letvar1820183 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1820183 ["message"])))))))

(clojure.core/defn- response-get-shard-iterator-output ([input] (response-get-shard-iterator-output nil input)) ([resultWrapper1820185 input] (clojure.core/let [rawinput1820184 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820186 {"ShardIterator" (rawinput1820184 "ShardIterator")}] (clojure.core/cond-> {} (letvar1820186 "ShardIterator") (clojure.core/assoc :shard-iterator (deser-shard-iterator (clojure.core/get-in letvar1820186 ["ShardIterator"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1820188 input] (clojure.core/let [rawinput1820187 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1820189 {"message" (rawinput1820187 "message")}] (clojure.core/cond-> {} (letvar1820189 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1820189 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/attribute-map (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb/attribute-name :portkey.aws.streams-dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-shard-iterator-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb/stream-arn :portkey.aws.streams-dynamodb/shard-id :portkey.aws.streams-dynamodb/shard-iterator-type] :opt-un [:portkey.aws.streams-dynamodb/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/number-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/number-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/positive-long-object clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 28 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 65))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-iterator-type #{"LATEST" "TRIM_HORIZON" "AFTER_SEQUENCE_NUMBER" "AT_SEQUENCE_NUMBER" :at-sequence-number :latest :trim-horizon :after-sequence-number})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/describe-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/stream-description]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-iterator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/null-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.expired-iterator-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/expired-iterator-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.expired-iterator-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/map-attribute-value (clojure.spec.alpha/map-of :portkey.aws.streams-dynamodb/attribute-name :portkey.aws.streams-dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.shard/parent-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/shard-id :portkey.aws.streams-dynamodb/sequence-number-range :portkey.aws.streams-dynamodb.shard/parent-shard-id]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-schema (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/key-schema-element :min-count 1 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/binary-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/binary-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/shards (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-description-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/last-evaluated-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-description/creation-request-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.stream-description/stream-label :portkey.aws.streams-dynamodb.stream-description/shards :portkey.aws.streams-dynamodb.stream-description/last-evaluated-shard-id :portkey.aws.streams-dynamodb/key-schema :portkey.aws.streams-dynamodb/stream-view-type :portkey.aws.streams-dynamodb.stream-description/creation-request-date-time :portkey.aws.streams-dynamodb/stream-arn :portkey.aws.streams-dynamodb/stream-status :portkey.aws.streams-dynamodb/table-name]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/sequence-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 21 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-view-type #{:new-image :old-image "NEW_IMAGE" "NEW_AND_OLD_IMAGES" :keys-only :new-and-old-images "OLD_IMAGE" "KEYS_ONLY"})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.get-records-output/records (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/record-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.get-records-output/next-shard-iterator (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-iterator))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-records-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.get-records-output/records :portkey.aws.streams-dynamodb.get-records-output/next-shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/binary-attribute-value clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/null (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/null-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/l (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/list-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/bool (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/m (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/map-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/s (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/b (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/ns (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/number-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/n (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/bs (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/binary-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.attribute-value/ss (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string-set-attribute-value))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.attribute-value/null :portkey.aws.streams-dynamodb.attribute-value/l :portkey.aws.streams-dynamodb.attribute-value/bool :portkey.aws.streams-dynamodb.attribute-value/m :portkey.aws.streams-dynamodb.attribute-value/s :portkey.aws.streams-dynamodb.attribute-value/b :portkey.aws.streams-dynamodb.attribute-value/ns :portkey.aws.streams-dynamodb.attribute-value/n :portkey.aws.streams-dynamodb.attribute-value/bs :portkey.aws.streams-dynamodb.attribute-value/ss]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 37 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-output/streams (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-list))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-output/last-evaluated-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/list-streams-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.list-streams-output/streams :portkey.aws.streams-dynamodb.list-streams-output/last-evaluated-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/approximate-creation-date-time (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/date))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/keys (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/new-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/old-image (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/attribute-map))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream-record/size-bytes (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-long-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.stream-record/approximate-creation-date-time :portkey.aws.streams-dynamodb.stream-record/keys :portkey.aws.streams-dynamodb.stream-record/new-image :portkey.aws.streams-dynamodb.stream-record/old-image :portkey.aws.streams-dynamodb/sequence-number :portkey.aws.streams-dynamodb.stream-record/size-bytes :portkey.aws.streams-dynamodb/stream-view-type]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-status #{"DISABLED" :disabled "DISABLING" "ENABLING" :disabling :enabling "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/operation-type))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-version (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/event-source (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/aws-region (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/dynamodb (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-record))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.record/user-identity (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/identity))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.record/event-id :portkey.aws.streams-dynamodb.record/event-name :portkey.aws.streams-dynamodb.record/event-version :portkey.aws.streams-dynamodb.record/event-source :portkey.aws.streams-dynamodb.record/aws-region :portkey.aws.streams-dynamodb.record/dynamodb :portkey.aws.streams-dynamodb.record/user-identity]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/record-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/record))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/operation-type #{:remove :insert "MODIFY" "REMOVE" "INSERT" :modify})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.trimmed-data-access-exception/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/trimmed-data-access-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.trimmed-data-access-exception/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.identity/principal-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.identity/type (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.identity/principal-id :portkey.aws.streams-dynamodb.identity/type]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/stream))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-shard-iterator-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/shard-iterator]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.stream/stream-label (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/string))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/stream-arn :portkey.aws.streams-dynamodb/table-name :portkey.aws.streams-dynamodb.stream/stream-label]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/positive-integer-object (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.get-records-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/get-records-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb/shard-iterator] :opt-un [:portkey.aws.streams-dynamodb.get-records-input/limit]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.key-schema-element/attribute-name (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/key-schema-attribute-name))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-schema-element (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb.key-schema-element/attribute-name :portkey.aws.streams-dynamodb/key-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/shard-description-list (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/shard))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.sequence-number-range/starting-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.sequence-number-range/ending-sequence-number (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/sequence-number))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/sequence-number-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.sequence-number-range/starting-sequence-number :portkey.aws.streams-dynamodb.sequence-number-range/ending-sequence-number]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.list-streams-input/exclusive-start-stream-arn (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/stream-arn))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/list-streams-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb/table-name :portkey.aws.streams-dynamodb.list-streams-input/limit :portkey.aws.streams-dynamodb.list-streams-input/exclusive-start-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/list-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/error-message))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.streams-dynamodb.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/string-set-attribute-value (clojure.spec.alpha/coll-of :portkey.aws.streams-dynamodb/string-attribute-value))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-schema-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/key-type #{:hash "RANGE" "HASH" :range})

(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.describe-stream-input/limit (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/positive-integer-object))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb.describe-stream-input/exclusive-start-shard-id (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/shard-id))
(clojure.spec.alpha/def :portkey.aws.streams-dynamodb/describe-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.streams-dynamodb/stream-arn] :opt-un [:portkey.aws.streams-dynamodb.describe-stream-input/limit :portkey.aws.streams-dynamodb.describe-stream-input/exclusive-start-shard-id]))

(clojure.core/defn describe-stream "Returns information about a stream, including the current status of the stream,\nits Amazon Resource Name (ARN), the composition of its shards, and its\ncorresponding DynamoDB table.\n You can call DescribeStream at a maximum rate of 10 times per second.\n Each shard in the stream has a SequenceNumberRange associated with it. If the\nSequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber,\nthen the shard is still open (able to receive more stream records). If both\nStartingSequenceNumber and EndingSequenceNumber are present, then that shard is\nclosed and can no longer receive more data." ([describe-stream-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stream-input describe-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/describe-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/describe-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStream", :http.request.configuration/output-deser-fn response-describe-stream-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/describe-stream-output))

(clojure.core/defn get-records "Retrieves the stream records from a given shard.\n Specify a shard iterator using the ShardIterator parameter. The shard iterator\nspecifies the position in the shard from which you want to start reading stream\nrecords sequentially. If there are no stream records available in the portion of\nthe shard that the iterator points to, GetRecords returns an empty list. Note\nthat it might take multiple calls to get to a portion of the shard that contains\nstream records.\n GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records,\nwhichever comes first." ([get-records-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-records-input get-records-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/get-records-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/get-records-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRecords", :http.request.configuration/output-deser-fn response-get-records-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "LimitExceededException" :portkey.aws.streams-dynamodb/limit-exceeded-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error, "ExpiredIteratorException" :portkey.aws.streams-dynamodb/expired-iterator-exception, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb/trimmed-data-access-exception}})))))
(clojure.spec.alpha/fdef get-records :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb/get-records-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/get-records-output))

(clojure.core/defn get-shard-iterator "Returns a shard iterator. A shard iterator provides information about how to\nretrieve the stream records from within a shard. Use the shard iterator in a\nsubsequent GetRecords request to read the stream records from the shard.\n A shard iterator expires 15 minutes after it is returned to the requester." ([get-shard-iterator-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-shard-iterator-input get-shard-iterator-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/get-shard-iterator-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/get-shard-iterator-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetShardIterator", :http.request.configuration/output-deser-fn response-get-shard-iterator-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error, "TrimmedDataAccessException" :portkey.aws.streams-dynamodb/trimmed-data-access-exception}})))))
(clojure.spec.alpha/fdef get-shard-iterator :args (clojure.spec.alpha/tuple :portkey.aws.streams-dynamodb/get-shard-iterator-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/get-shard-iterator-output))

(clojure.core/defn list-streams "Returns an array of stream ARNs associated with the current account and\nendpoint. If the TableName parameter is present, then ListStreams will return\nonly the streams ARNs for that table.\n You can call ListStreams at a maximum rate of 5 times per second." ([] (list-streams {})) ([list-streams-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-streams-input list-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.streams-dynamodb/endpoints, :http.request.configuration/target-prefix "DynamoDBStreams_20120810", :http.request.spec/output-spec :portkey.aws.streams-dynamodb/list-streams-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-08-10", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.streams-dynamodb/list-streams-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreams", :http.request.configuration/output-deser-fn response-list-streams-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.streams-dynamodb/resource-not-found-exception, "InternalServerError" :portkey.aws.streams-dynamodb/internal-server-error}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.streams-dynamodb/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.streams-dynamodb/list-streams-output))
