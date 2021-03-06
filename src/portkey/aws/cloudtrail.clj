(ns portkey.aws.cloudtrail (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "cloudtrail", :region "us-gov-east-1"},
    :ssl-common-name "cloudtrail.us-gov-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "cloudtrail", :region "ap-northeast-1"},
    :ssl-common-name "cloudtrail.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudtrail", :region "eu-west-1"},
    :ssl-common-name "cloudtrail.eu-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudtrail", :region "us-east-2"},
    :ssl-common-name "cloudtrail.us-east-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudtrail", :region "ap-southeast-2"},
    :ssl-common-name "cloudtrail.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "cloudtrail", :region "cn-north-1"},
    :ssl-common-name "cloudtrail.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudtrail", :region "sa-east-1"},
    :ssl-common-name "cloudtrail.sa-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudtrail", :region "ap-southeast-1"},
    :ssl-common-name "cloudtrail.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "cloudtrail", :region "cn-northwest-1"},
    :ssl-common-name "cloudtrail.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudtrail", :region "ap-northeast-2"},
    :ssl-common-name "cloudtrail.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudtrail", :region "eu-west-3"},
    :ssl-common-name "cloudtrail.eu-west-3.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudtrail", :region "ca-central-1"},
    :ssl-common-name "cloudtrail.ca-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudtrail", :region "eu-central-1"},
    :ssl-common-name "cloudtrail.eu-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudtrail", :region "eu-west-2"},
    :ssl-common-name "cloudtrail.eu-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudtrail", :region "us-gov-west-1"},
    :ssl-common-name "cloudtrail.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudtrail", :region "us-west-2"},
    :ssl-common-name "cloudtrail.us-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudtrail", :region "us-east-1"},
    :ssl-common-name "cloudtrail.us-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudtrail", :region "us-west-1"},
    :ssl-common-name "cloudtrail.us-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudtrail", :region "ap-south-1"},
    :ssl-common-name "cloudtrail.ap-south-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "cloudtrail", :region "eu-north-1"},
    :ssl-common-name "cloudtrail.eu-north-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-lookup-attribute-key)

(clojure.core/declare ser-trail-name-list)

(clojure.core/declare ser-lookup-attribute)

(clojure.core/declare ser-event-selectors)

(clojure.core/declare ser-data-resource)

(clojure.core/declare ser-data-resources)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-date)

(clojure.core/declare ser-lookup-attributes-list)

(clojure.core/declare ser-read-write-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-event-selector)

(clojure.core/declare ser-tags-list)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-data-resource-values)

(clojure.core/declare ser-resource-id-list)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-lookup-attribute-key [input] #:http.request.field{:value (clojure.core/get {"Username" "Username", :event-name "EventName", :event-id "EventId", :username "Username", :resource-name "ResourceName", :event-source "EventSource", "EventName" "EventName", "ReadOnly" "ReadOnly", "ResourceName" "ResourceName", "ResourceType" "ResourceType", :resource-type "ResourceType", :read-only "ReadOnly", "EventId" "EventId", "EventSource" "EventSource", :access-key-id "AccessKeyId", "AccessKeyId" "AccessKeyId"} input), :shape "LookupAttributeKey"})

(clojure.core/defn- ser-trail-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "TrailNameList", :type "list"})

(clojure.core/defn- ser-lookup-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lookup-attribute-key (:attribute-key input)) #:http.request.field{:name "AttributeKey", :shape "LookupAttributeKey"}) (clojure.core/into (ser-string (:attribute-value input)) #:http.request.field{:name "AttributeValue", :shape "String"})], :shape "LookupAttribute", :type "structure"}))

(clojure.core/defn- ser-event-selectors [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-selector coll) #:http.request.field{:shape "EventSelector"}))) input), :shape "EventSelectors", :type "list"})

(clojure.core/defn- ser-data-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataResource", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :type)) #:http.request.field{:name "Type", :shape "String"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-resource-values (input :values)) #:http.request.field{:name "Values", :shape "DataResourceValues"}))))

(clojure.core/defn- ser-data-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-data-resource coll) #:http.request.field{:shape "DataResource"}))) input), :shape "DataResources", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-lookup-attributes-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lookup-attribute coll) #:http.request.field{:shape "LookupAttribute"}))) input), :shape "LookupAttributesList", :type "list"})

(clojure.core/defn- ser-read-write-type [input] #:http.request.field{:value (clojure.core/get {"ReadOnly" "ReadOnly", :read-only "ReadOnly", "WriteOnly" "WriteOnly", :write-only "WriteOnly", "All" "All", :all "All"} input), :shape "ReadWriteType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-event-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventSelector", :type "structure"} (clojure.core/contains? input :read-write-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-read-write-type (input :read-write-type)) #:http.request.field{:name "ReadWriteType", :shape "ReadWriteType"})) (clojure.core/contains? input :include-management-events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-management-events)) #:http.request.field{:name "IncludeManagementEvents", :shape "Boolean"})) (clojure.core/contains? input :data-resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-resources (input :data-resources)) #:http.request.field{:name "DataResources", :shape "DataResources"}))))

(clojure.core/defn- ser-tags-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagsList", :type "list"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:key input)) #:http.request.field{:name "Key", :shape "String"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-data-resource-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "DataResourceValues", :type "list"})

(clojure.core/defn- ser-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ResourceIdList", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"})]} (clojure.core/contains? input :enable-log-file-validation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-log-file-validation)) #:http.request.field{:name "EnableLogFileValidation", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "String"})) (clojure.core/contains? input :include-global-service-events) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-global-service-events)) #:http.request.field{:name "IncludeGlobalServiceEvents", :shape "Boolean"})) (clojure.core/contains? input :is-organization-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-organization-trail)) #:http.request.field{:name "IsOrganizationTrail", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-name)) #:http.request.field{:name "SnsTopicName", :shape "String"})) (clojure.core/contains? input :is-multi-region-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-multi-region-trail)) #:http.request.field{:name "IsMultiRegionTrail", :shape "Boolean"}))))

(clojure.core/defn- req-stop-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-remove-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "String"})]} (clojure.core/contains? input :tags-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-list (input :tags-list)) #:http.request.field{:name "TagsList", :shape "TagsList"}))))

(clojure.core/defn- req-add-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "String"})]} (clojure.core/contains? input :tags-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-list (input :tags-list)) #:http.request.field{:name "TagsList", :shape "TagsList"}))))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-time)) #:http.request.field{:name "StartTime", :shape "Date"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :end-time)) #:http.request.field{:name "EndTime", :shape "Date"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-start-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-lookup-events-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :lookup-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lookup-attributes-list (input :lookup-attributes)) #:http.request.field{:name "LookupAttributes", :shape "LookupAttributesList"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :start-time)) #:http.request.field{:name "StartTime", :shape "Date"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :end-time)) #:http.request.field{:name "EndTime", :shape "Date"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]} (clojure.core/contains? input :enable-log-file-validation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-log-file-validation)) #:http.request.field{:name "EnableLogFileValidation", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "String"})) (clojure.core/contains? input :include-global-service-events) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-global-service-events)) #:http.request.field{:name "IncludeGlobalServiceEvents", :shape "Boolean"})) (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"})) (clojure.core/contains? input :is-organization-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-organization-trail)) #:http.request.field{:name "IsOrganizationTrail", :shape "Boolean"})) (clojure.core/contains? input :cloud-watch-logs-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "String"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-name)) #:http.request.field{:name "SnsTopicName", :shape "String"})) (clojure.core/contains? input :is-multi-region-trail) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-multi-region-trail)) #:http.request.field{:name "IsMultiRegionTrail", :shape "Boolean"}))))

(clojure.core/defn- req-put-event-selectors-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :trail-name)) #:http.request.field{:name "TrailName", :shape "String"}) (clojure.core/into (ser-event-selectors (input :event-selectors)) #:http.request.field{:name "EventSelectors", :shape "EventSelectors"})]}))

(clojure.core/defn- req-get-event-selectors-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :trail-name)) #:http.request.field{:name "TrailName", :shape "String"})]}))

(clojure.core/defn- req-delete-trail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-describe-trails-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :trail-name-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trail-name-list (input :trail-name-list)) #:http.request.field{:name "trailNameList", :shape "TrailNameList"})) (clojure.core/contains? input :include-shadow-trails) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-shadow-trails)) #:http.request.field{:name "includeShadowTrails", :shape "Boolean"}))))

(clojure.core/defn- req-get-trail-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id-list (input :resource-id-list)) #:http.request.field{:name "ResourceIdList", :shape "ResourceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/declare deser-event-selectors)

(clojure.core/declare deser-trail-list)

(clojure.core/declare deser-data-resource)

(clojure.core/declare deser-data-resources)

(clojure.core/declare deser-event)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-date)

(clojure.core/declare deser-byte-buffer)

(clojure.core/declare deser-read-write-type)

(clojure.core/declare deser-string)

(clojure.core/declare deser-resource-tag)

(clojure.core/declare deser-event-selector)

(clojure.core/declare deser-resource-list)

(clojure.core/declare deser-tags-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-data-resource-values)

(clojure.core/declare deser-trail)

(clojure.core/declare deser-events-list)

(clojure.core/declare deser-public-key-list)

(clojure.core/declare deser-resource-tag-list)

(clojure.core/declare deser-public-key)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-event-selectors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-selector coll))) input))

(clojure.core/defn- deser-trail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trail coll))) input))

(clojure.core/defn- deser-data-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-data-resource-values (input "Values")))))

(clojure.core/defn- deser-data-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-resource coll))) input))

(clojure.core/defn- deser-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-string (input "Username"))) (clojure.core/contains? input "EventName") (clojure.core/assoc :event-name (deser-string (input "EventName"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-resource-list (input "Resources"))) (clojure.core/contains? input "ReadOnly") (clojure.core/assoc :read-only (deser-string (input "ReadOnly"))) (clojure.core/contains? input "EventTime") (clojure.core/assoc :event-time (deser-date (input "EventTime"))) (clojure.core/contains? input "EventId") (clojure.core/assoc :event-id (deser-string (input "EventId"))) (clojure.core/contains? input "CloudTrailEvent") (clojure.core/assoc :cloud-trail-event (deser-string (input "CloudTrailEvent"))) (clojure.core/contains? input "EventSource") (clojure.core/assoc :event-source (deser-string (input "EventSource"))) (clojure.core/contains? input "AccessKeyId") (clojure.core/assoc :access-key-id (deser-string (input "AccessKeyId")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-byte-buffer [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-read-write-type [input] (clojure.core/get {"ReadOnly" :read-only, "WriteOnly" :write-only, "All" :all} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-resource-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-string (input "ResourceId"))) (clojure.core/contains? input "TagsList") (clojure.core/assoc :tags-list (deser-tags-list (input "TagsList")))))

(clojure.core/defn- deser-event-selector [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReadWriteType") (clojure.core/assoc :read-write-type (deser-read-write-type (input "ReadWriteType"))) (clojure.core/contains? input "IncludeManagementEvents") (clojure.core/assoc :include-management-events (deser-boolean (input "IncludeManagementEvents"))) (clojure.core/contains? input "DataResources") (clojure.core/assoc :data-resources (deser-data-resources (input "DataResources")))))

(clojure.core/defn- deser-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-tags-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-string (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-string (input "ResourceType"))) (clojure.core/contains? input "ResourceName") (clojure.core/assoc :resource-name (deser-string (input "ResourceName")))))

(clojure.core/defn- deser-data-resource-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-trail [input] (clojure.core/cond-> {} (clojure.core/contains? input "HasCustomEventSelectors") (clojure.core/assoc :has-custom-event-selectors (deser-boolean (input "HasCustomEventSelectors"))) (clojure.core/contains? input "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (input "CloudWatchLogsLogGroupArn"))) (clojure.core/contains? input "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (input "IncludeGlobalServiceEvents"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (input "S3BucketName"))) (clojure.core/contains? input "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (input "IsOrganizationTrail"))) (clojure.core/contains? input "TrailARN") (clojure.core/assoc :trail-arn (deser-string (input "TrailARN"))) (clojure.core/contains? input "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (input "SnsTopicARN"))) (clojure.core/contains? input "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (input "CloudWatchLogsRoleArn"))) (clojure.core/contains? input "HomeRegion") (clojure.core/assoc :home-region (deser-string (input "HomeRegion"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (input "KmsKeyId"))) (clojure.core/contains? input "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (input "LogFileValidationEnabled"))) (clojure.core/contains? input "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (input "S3KeyPrefix"))) (clojure.core/contains? input "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (input "SnsTopicName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (input "IsMultiRegionTrail")))))

(clojure.core/defn- deser-events-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key coll))) input))

(clojure.core/defn- deser-resource-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag coll))) input))

(clojure.core/defn- deser-public-key [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-byte-buffer (input "Value"))) (clojure.core/contains? input "ValidityStartTime") (clojure.core/assoc :validity-start-time (deser-date (input "ValidityStartTime"))) (clojure.core/contains? input "ValidityEndTime") (clojure.core/assoc :validity-end-time (deser-date (input "ValidityEndTime"))) (clojure.core/contains? input "Fingerprint") (clojure.core/assoc :fingerprint (deser-string (input "Fingerprint")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-get-trail-status-response ([input] (response-get-trail-status-response nil input)) ([resultWrapper373308 input] (clojure.core/let [rawinput373307 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373309 {"TimeLoggingStopped" (rawinput373307 "TimeLoggingStopped"), "LatestDeliveryError" (rawinput373307 "LatestDeliveryError"), "LatestDeliveryTime" (rawinput373307 "LatestDeliveryTime"), "LatestDigestDeliveryError" (rawinput373307 "LatestDigestDeliveryError"), "LatestCloudWatchLogsDeliveryTime" (rawinput373307 "LatestCloudWatchLogsDeliveryTime"), "LatestNotificationTime" (rawinput373307 "LatestNotificationTime"), "StopLoggingTime" (rawinput373307 "StopLoggingTime"), "TimeLoggingStarted" (rawinput373307 "TimeLoggingStarted"), "StartLoggingTime" (rawinput373307 "StartLoggingTime"), "LatestNotificationError" (rawinput373307 "LatestNotificationError"), "LatestCloudWatchLogsDeliveryError" (rawinput373307 "LatestCloudWatchLogsDeliveryError"), "LatestNotificationAttemptSucceeded" (rawinput373307 "LatestNotificationAttemptSucceeded"), "LatestDeliveryAttemptSucceeded" (rawinput373307 "LatestDeliveryAttemptSucceeded"), "LatestDeliveryAttemptTime" (rawinput373307 "LatestDeliveryAttemptTime"), "IsLogging" (rawinput373307 "IsLogging"), "LatestNotificationAttemptTime" (rawinput373307 "LatestNotificationAttemptTime"), "LatestDigestDeliveryTime" (rawinput373307 "LatestDigestDeliveryTime")}] (clojure.core/cond-> {} (letvar373309 "TimeLoggingStopped") (clojure.core/assoc :time-logging-stopped (deser-string (clojure.core/get-in letvar373309 ["TimeLoggingStopped"]))) (letvar373309 "LatestDeliveryError") (clojure.core/assoc :latest-delivery-error (deser-string (clojure.core/get-in letvar373309 ["LatestDeliveryError"]))) (letvar373309 "LatestDeliveryTime") (clojure.core/assoc :latest-delivery-time (deser-date (clojure.core/get-in letvar373309 ["LatestDeliveryTime"]))) (letvar373309 "LatestDigestDeliveryError") (clojure.core/assoc :latest-digest-delivery-error (deser-string (clojure.core/get-in letvar373309 ["LatestDigestDeliveryError"]))) (letvar373309 "LatestCloudWatchLogsDeliveryTime") (clojure.core/assoc :latest-cloud-watch-logs-delivery-time (deser-date (clojure.core/get-in letvar373309 ["LatestCloudWatchLogsDeliveryTime"]))) (letvar373309 "LatestNotificationTime") (clojure.core/assoc :latest-notification-time (deser-date (clojure.core/get-in letvar373309 ["LatestNotificationTime"]))) (letvar373309 "StopLoggingTime") (clojure.core/assoc :stop-logging-time (deser-date (clojure.core/get-in letvar373309 ["StopLoggingTime"]))) (letvar373309 "TimeLoggingStarted") (clojure.core/assoc :time-logging-started (deser-string (clojure.core/get-in letvar373309 ["TimeLoggingStarted"]))) (letvar373309 "StartLoggingTime") (clojure.core/assoc :start-logging-time (deser-date (clojure.core/get-in letvar373309 ["StartLoggingTime"]))) (letvar373309 "LatestNotificationError") (clojure.core/assoc :latest-notification-error (deser-string (clojure.core/get-in letvar373309 ["LatestNotificationError"]))) (letvar373309 "LatestCloudWatchLogsDeliveryError") (clojure.core/assoc :latest-cloud-watch-logs-delivery-error (deser-string (clojure.core/get-in letvar373309 ["LatestCloudWatchLogsDeliveryError"]))) (letvar373309 "LatestNotificationAttemptSucceeded") (clojure.core/assoc :latest-notification-attempt-succeeded (deser-string (clojure.core/get-in letvar373309 ["LatestNotificationAttemptSucceeded"]))) (letvar373309 "LatestDeliveryAttemptSucceeded") (clojure.core/assoc :latest-delivery-attempt-succeeded (deser-string (clojure.core/get-in letvar373309 ["LatestDeliveryAttemptSucceeded"]))) (letvar373309 "LatestDeliveryAttemptTime") (clojure.core/assoc :latest-delivery-attempt-time (deser-string (clojure.core/get-in letvar373309 ["LatestDeliveryAttemptTime"]))) (letvar373309 "IsLogging") (clojure.core/assoc :is-logging (deser-boolean (clojure.core/get-in letvar373309 ["IsLogging"]))) (letvar373309 "LatestNotificationAttemptTime") (clojure.core/assoc :latest-notification-attempt-time (deser-string (clojure.core/get-in letvar373309 ["LatestNotificationAttemptTime"]))) (letvar373309 "LatestDigestDeliveryTime") (clojure.core/assoc :latest-digest-delivery-time (deser-date (clojure.core/get-in letvar373309 ["LatestDigestDeliveryTime"])))))))

(clojure.core/defn- response-trail-not-found-exception ([input] (response-trail-not-found-exception nil input)) ([resultWrapper373311 input] (clojure.core/let [rawinput373310 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373312 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trail-not-provided-exception ([input] (response-trail-not-provided-exception nil input)) ([resultWrapper373314 input] (clojure.core/let [rawinput373313 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373315 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-token-exception ([input] (response-invalid-token-exception nil input)) ([resultWrapper373317 input] (clojure.core/let [rawinput373316 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373318 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-logging-response ([input] (response-start-logging-response nil input)) ([resultWrapper373320 input] (clojure.core/let [rawinput373319 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373321 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper373323 input] (clojure.core/let [rawinput373322 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373324 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-prefix-exception ([input] (response-invalid-s-3-prefix-exception nil input)) ([resultWrapper373326 input] (clojure.core/let [rawinput373325 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373327 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-tags-response ([input] (response-remove-tags-response nil input)) ([resultWrapper373329 input] (clojure.core/let [rawinput373328 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373330 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tags-limit-exceeded-exception ([input] (response-tags-limit-exceeded-exception nil input)) ([resultWrapper373332 input] (clojure.core/let [rawinput373331 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373333 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-kms-key-id-exception ([input] (response-invalid-kms-key-id-exception nil input)) ([resultWrapper373335 input] (clojure.core/let [rawinput373334 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373336 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-event-selectors-response ([input] (response-get-event-selectors-response nil input)) ([resultWrapper373338 input] (clojure.core/let [rawinput373337 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373339 {"TrailARN" (rawinput373337 "TrailARN"), "EventSelectors" (rawinput373337 "EventSelectors")}] (clojure.core/cond-> {} (letvar373339 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar373339 ["TrailARN"]))) (letvar373339 "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (clojure.core/get-in letvar373339 ["EventSelectors"])))))))

(clojure.core/defn- response-update-trail-response ([input] (response-update-trail-response nil input)) ([resultWrapper373341 input] (clojure.core/let [rawinput373340 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373342 {"CloudWatchLogsLogGroupArn" (rawinput373340 "CloudWatchLogsLogGroupArn"), "IncludeGlobalServiceEvents" (rawinput373340 "IncludeGlobalServiceEvents"), "S3BucketName" (rawinput373340 "S3BucketName"), "IsOrganizationTrail" (rawinput373340 "IsOrganizationTrail"), "TrailARN" (rawinput373340 "TrailARN"), "SnsTopicARN" (rawinput373340 "SnsTopicARN"), "CloudWatchLogsRoleArn" (rawinput373340 "CloudWatchLogsRoleArn"), "KmsKeyId" (rawinput373340 "KmsKeyId"), "LogFileValidationEnabled" (rawinput373340 "LogFileValidationEnabled"), "S3KeyPrefix" (rawinput373340 "S3KeyPrefix"), "SnsTopicName" (rawinput373340 "SnsTopicName"), "Name" (rawinput373340 "Name"), "IsMultiRegionTrail" (rawinput373340 "IsMultiRegionTrail")}] (clojure.core/cond-> {} (letvar373342 "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (clojure.core/get-in letvar373342 ["CloudWatchLogsLogGroupArn"]))) (letvar373342 "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (clojure.core/get-in letvar373342 ["IncludeGlobalServiceEvents"]))) (letvar373342 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar373342 ["S3BucketName"]))) (letvar373342 "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (clojure.core/get-in letvar373342 ["IsOrganizationTrail"]))) (letvar373342 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar373342 ["TrailARN"]))) (letvar373342 "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar373342 ["SnsTopicARN"]))) (letvar373342 "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (clojure.core/get-in letvar373342 ["CloudWatchLogsRoleArn"]))) (letvar373342 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (clojure.core/get-in letvar373342 ["KmsKeyId"]))) (letvar373342 "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (clojure.core/get-in letvar373342 ["LogFileValidationEnabled"]))) (letvar373342 "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (clojure.core/get-in letvar373342 ["S3KeyPrefix"]))) (letvar373342 "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (clojure.core/get-in letvar373342 ["SnsTopicName"]))) (letvar373342 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar373342 ["Name"]))) (letvar373342 "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (clojure.core/get-in letvar373342 ["IsMultiRegionTrail"])))))))

(clojure.core/defn- response-put-event-selectors-response ([input] (response-put-event-selectors-response nil input)) ([resultWrapper373344 input] (clojure.core/let [rawinput373343 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373345 {"TrailARN" (rawinput373343 "TrailARN"), "EventSelectors" (rawinput373343 "EventSelectors")}] (clojure.core/cond-> {} (letvar373345 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar373345 ["TrailARN"]))) (letvar373345 "EventSelectors") (clojure.core/assoc :event-selectors (deser-event-selectors (clojure.core/get-in letvar373345 ["EventSelectors"])))))))

(clojure.core/defn- response-insufficient-dependency-service-access-permission-exception ([input] (response-insufficient-dependency-service-access-permission-exception nil input)) ([resultWrapper373347 input] (clojure.core/let [rawinput373346 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373348 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-key-disabled-exception ([input] (response-kms-key-disabled-exception nil input)) ([resultWrapper373350 input] (clojure.core/let [rawinput373349 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373351 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper373353 input] (clojure.core/let [rawinput373352 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373354 {"ResourceTagList" (rawinput373352 "ResourceTagList"), "NextToken" (rawinput373352 "NextToken")}] (clojure.core/cond-> {} (letvar373354 "ResourceTagList") (clojure.core/assoc :resource-tag-list (deser-resource-tag-list (clojure.core/get-in letvar373354 ["ResourceTagList"]))) (letvar373354 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar373354 ["NextToken"])))))))

(clojure.core/defn- response-invalid-event-selectors-exception ([input] (response-invalid-event-selectors-exception nil input)) ([resultWrapper373356 input] (clojure.core/let [rawinput373355 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373357 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-home-region-exception ([input] (response-invalid-home-region-exception nil input)) ([resultWrapper373359 input] (clojure.core/let [rawinput373358 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373360 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-bucket-does-not-exist-exception ([input] (response-s-3-bucket-does-not-exist-exception nil input)) ([resultWrapper373362 input] (clojure.core/let [rawinput373361 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373363 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-max-results-exception ([input] (response-invalid-max-results-exception nil input)) ([resultWrapper373365 input] (clojure.core/let [rawinput373364 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373366 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-sns-topic-policy-exception ([input] (response-insufficient-sns-topic-policy-exception nil input)) ([resultWrapper373368 input] (clojure.core/let [rawinput373367 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373369 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-logging-response ([input] (response-stop-logging-response nil input)) ([resultWrapper373371 input] (clojure.core/let [rawinput373370 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373372 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-trail-arn-invalid-exception ([input] (response-cloud-trail-arn-invalid-exception nil input)) ([resultWrapper373374 input] (clojure.core/let [rawinput373373 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373375 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-number-of-trails-exceeded-exception ([input] (response-maximum-number-of-trails-exceeded-exception nil input)) ([resultWrapper373377 input] (clojure.core/let [rawinput373376 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373378 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-exception ([input] (response-kms-exception nil input)) ([resultWrapper373380 input] (clojure.core/let [rawinput373379 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373381 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-public-keys-response ([input] (response-list-public-keys-response nil input)) ([resultWrapper373383 input] (clojure.core/let [rawinput373382 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373384 {"PublicKeyList" (rawinput373382 "PublicKeyList"), "NextToken" (rawinput373382 "NextToken")}] (clojure.core/cond-> {} (letvar373384 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar373384 ["PublicKeyList"]))) (letvar373384 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar373384 ["NextToken"])))))))

(clojure.core/defn- response-create-trail-response ([input] (response-create-trail-response nil input)) ([resultWrapper373386 input] (clojure.core/let [rawinput373385 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373387 {"CloudWatchLogsLogGroupArn" (rawinput373385 "CloudWatchLogsLogGroupArn"), "IncludeGlobalServiceEvents" (rawinput373385 "IncludeGlobalServiceEvents"), "S3BucketName" (rawinput373385 "S3BucketName"), "IsOrganizationTrail" (rawinput373385 "IsOrganizationTrail"), "TrailARN" (rawinput373385 "TrailARN"), "SnsTopicARN" (rawinput373385 "SnsTopicARN"), "CloudWatchLogsRoleArn" (rawinput373385 "CloudWatchLogsRoleArn"), "KmsKeyId" (rawinput373385 "KmsKeyId"), "LogFileValidationEnabled" (rawinput373385 "LogFileValidationEnabled"), "S3KeyPrefix" (rawinput373385 "S3KeyPrefix"), "SnsTopicName" (rawinput373385 "SnsTopicName"), "Name" (rawinput373385 "Name"), "IsMultiRegionTrail" (rawinput373385 "IsMultiRegionTrail")}] (clojure.core/cond-> {} (letvar373387 "CloudWatchLogsLogGroupArn") (clojure.core/assoc :cloud-watch-logs-log-group-arn (deser-string (clojure.core/get-in letvar373387 ["CloudWatchLogsLogGroupArn"]))) (letvar373387 "IncludeGlobalServiceEvents") (clojure.core/assoc :include-global-service-events (deser-boolean (clojure.core/get-in letvar373387 ["IncludeGlobalServiceEvents"]))) (letvar373387 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar373387 ["S3BucketName"]))) (letvar373387 "IsOrganizationTrail") (clojure.core/assoc :is-organization-trail (deser-boolean (clojure.core/get-in letvar373387 ["IsOrganizationTrail"]))) (letvar373387 "TrailARN") (clojure.core/assoc :trail-arn (deser-string (clojure.core/get-in letvar373387 ["TrailARN"]))) (letvar373387 "SnsTopicARN") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar373387 ["SnsTopicARN"]))) (letvar373387 "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-string (clojure.core/get-in letvar373387 ["CloudWatchLogsRoleArn"]))) (letvar373387 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-string (clojure.core/get-in letvar373387 ["KmsKeyId"]))) (letvar373387 "LogFileValidationEnabled") (clojure.core/assoc :log-file-validation-enabled (deser-boolean (clojure.core/get-in letvar373387 ["LogFileValidationEnabled"]))) (letvar373387 "S3KeyPrefix") (clojure.core/assoc :s-3-key-prefix (deser-string (clojure.core/get-in letvar373387 ["S3KeyPrefix"]))) (letvar373387 "SnsTopicName") (clojure.core/assoc :sns-topic-name (deser-string (clojure.core/get-in letvar373387 ["SnsTopicName"]))) (letvar373387 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar373387 ["Name"]))) (letvar373387 "IsMultiRegionTrail") (clojure.core/assoc :is-multi-region-trail (deser-boolean (clojure.core/get-in letvar373387 ["IsMultiRegionTrail"])))))))

(clojure.core/defn- response-invalid-tag-parameter-exception ([input] (response-invalid-tag-parameter-exception nil input)) ([resultWrapper373389 input] (clojure.core/let [rawinput373388 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373390 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-trail-access-not-enabled-exception ([input] (response-cloud-trail-access-not-enabled-exception nil input)) ([resultWrapper373392 input] (clojure.core/let [rawinput373391 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373393 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-lookup-events-response ([input] (response-lookup-events-response nil input)) ([resultWrapper373395 input] (clojure.core/let [rawinput373394 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373396 {"Events" (rawinput373394 "Events"), "NextToken" (rawinput373394 "NextToken")}] (clojure.core/cond-> {} (letvar373396 "Events") (clojure.core/assoc :events (deser-events-list (clojure.core/get-in letvar373396 ["Events"]))) (letvar373396 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar373396 ["NextToken"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper373398 input] (clojure.core/let [rawinput373397 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373399 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sns-topic-name-exception ([input] (response-invalid-sns-topic-name-exception nil input)) ([resultWrapper373401 input] (clojure.core/let [rawinput373400 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373402 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trail-already-exists-exception ([input] (response-trail-already-exists-exception nil input)) ([resultWrapper373404 input] (clojure.core/let [rawinput373403 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373405 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-trail-name-exception ([input] (response-invalid-trail-name-exception nil input)) ([resultWrapper373407 input] (clojure.core/let [rawinput373406 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373408 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper373410 input] (clojure.core/let [rawinput373409 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373411 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-cloud-watch-logs-log-group-arn-exception ([input] (response-invalid-cloud-watch-logs-log-group-arn-exception nil input)) ([resultWrapper373413 input] (clojure.core/let [rawinput373412 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373414 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper373416 input] (clojure.core/let [rawinput373415 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373417 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-trail-response ([input] (response-delete-trail-response nil input)) ([resultWrapper373419 input] (clojure.core/let [rawinput373418 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373420 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-lookup-attributes-exception ([input] (response-invalid-lookup-attributes-exception nil input)) ([resultWrapper373422 input] (clojure.core/let [rawinput373421 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373423 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-s-3-bucket-policy-exception ([input] (response-insufficient-s-3-bucket-policy-exception nil input)) ([resultWrapper373425 input] (clojure.core/let [rawinput373424 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373426 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-combination-exception ([input] (response-invalid-parameter-combination-exception nil input)) ([resultWrapper373428 input] (clojure.core/let [rawinput373427 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373429 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cloud-watch-logs-delivery-unavailable-exception ([input] (response-cloud-watch-logs-delivery-unavailable-exception nil input)) ([resultWrapper373431 input] (clojure.core/let [rawinput373430 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373432 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-trails-response ([input] (response-describe-trails-response nil input)) ([resultWrapper373434 input] (clojure.core/let [rawinput373433 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373435 {"trailList" (rawinput373433 "trailList")}] (clojure.core/cond-> {} (letvar373435 "trailList") (clojure.core/assoc :trail-list (deser-trail-list (clojure.core/get-in letvar373435 ["trailList"])))))))

(clojure.core/defn- response-not-organization-master-account-exception ([input] (response-not-organization-master-account-exception nil input)) ([resultWrapper373437 input] (clojure.core/let [rawinput373436 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373438 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-tags-response ([input] (response-add-tags-response nil input)) ([resultWrapper373440 input] (clojure.core/let [rawinput373439 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373441 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-kms-key-not-found-exception ([input] (response-kms-key-not-found-exception nil input)) ([resultWrapper373443 input] (clojure.core/let [rawinput373442 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373444 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organization-not-in-all-features-mode-exception ([input] (response-organization-not-in-all-features-mode-exception nil input)) ([resultWrapper373446 input] (clojure.core/let [rawinput373445 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373447 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-encryption-policy-exception ([input] (response-insufficient-encryption-policy-exception nil input)) ([resultWrapper373449 input] (clojure.core/let [rawinput373448 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373450 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-type-not-supported-exception ([input] (response-resource-type-not-supported-exception nil input)) ([resultWrapper373452 input] (clojure.core/let [rawinput373451 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373453 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-time-range-exception ([input] (response-invalid-time-range-exception nil input)) ([resultWrapper373455 input] (clojure.core/let [rawinput373454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373456 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-cloud-watch-logs-role-arn-exception ([input] (response-invalid-cloud-watch-logs-role-arn-exception nil input)) ([resultWrapper373458 input] (clojure.core/let [rawinput373457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373459 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organizations-not-in-use-exception ([input] (response-organizations-not-in-use-exception nil input)) ([resultWrapper373461 input] (clojure.core/let [rawinput373460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373462 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-bucket-name-exception ([input] (response-invalid-s-3-bucket-name-exception nil input)) ([resultWrapper373464 input] (clojure.core/let [rawinput373463 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar373465 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/time-logging-stopped (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/stop-logging-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/time-logging-started (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/start-logging-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-error (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-succeeded (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-succeeded (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/is-logging (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-trail-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.get-trail-status-response/time-logging-stopped :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-error :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-time :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-error :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-time :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-time :portkey.aws.cloudtrail.get-trail-status-response/stop-logging-time :portkey.aws.cloudtrail.get-trail-status-response/time-logging-started :portkey.aws.cloudtrail.get-trail-status-response/start-logging-time :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-error :portkey.aws.cloudtrail.get-trail-status-response/latest-cloud-watch-logs-delivery-error :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-succeeded :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-succeeded :portkey.aws.cloudtrail.get-trail-status-response/latest-delivery-attempt-time :portkey.aws.cloudtrail.get-trail-status-response/is-logging :portkey.aws.cloudtrail.get-trail-status-response/latest-notification-attempt-time :portkey.aws.cloudtrail.get-trail-status-response/latest-digest-delivery-time]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-not-provided-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/start-logging-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-s-3-prefix-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/remove-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-attribute-key #{"Username" :event-name :event-id :username :resource-name :event-source "EventName" "ReadOnly" "ResourceName" "ResourceType" :resource-type :read-only "EventId" "EventSource" :access-key-id "AccessKeyId"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail/tags-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-kms-key-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.get-event-selectors-response/trail-arn :portkey.aws.cloudtrail/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/update-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.update-trail-response/include-global-service-events :portkey.aws.cloudtrail.update-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.update-trail-response/is-organization-trail :portkey.aws.cloudtrail.update-trail-response/trail-arn :portkey.aws.cloudtrail.update-trail-response/sns-topic-arn :portkey.aws.cloudtrail.update-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.update-trail-response/kms-key-id :portkey.aws.cloudtrail.update-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.update-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.update-trail-response/sns-topic-name :portkey.aws.cloudtrail.update-trail-response/name :portkey.aws.cloudtrail.update-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-attribute/attribute-key (clojure.spec.alpha/and :portkey.aws.cloudtrail/lookup-attribute-key))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-attribute/attribute-value (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.lookup-attribute/attribute-key :portkey.aws.cloudtrail.lookup-attribute/attribute-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/event-selectors (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/event-selector))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.put-event-selectors-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/put-event-selectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.put-event-selectors-response/trail-arn :portkey.aws.cloudtrail/event-selectors]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/kms-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail/resource-tag-list :portkey.aws.cloudtrail.list-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/create-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.create-trail-request/name :portkey.aws.cloudtrail.create-trail-request/s-3-bucket-name] :opt-un [:portkey.aws.cloudtrail.create-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.create-trail-request/include-global-service-events :portkey.aws.cloudtrail.create-trail-request/is-organization-trail :portkey.aws.cloudtrail.create-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.create-trail-request/kms-key-id :portkey.aws.cloudtrail.create-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.create-trail-request/sns-topic-name :portkey.aws.cloudtrail.create-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/trail))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-event-selectors-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-home-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/s-3-bucket-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.data-resource/type (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.data-resource/values (clojure.spec.alpha/and :portkey.aws.cloudtrail/data-resource-values))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/data-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.data-resource/type :portkey.aws.cloudtrail.data-resource/values]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-sns-topic-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/data-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/data-resource))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.stop-logging-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/stop-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.stop-logging-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/stop-logging-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/maximum-number-of-trails-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/username (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/resources (clojure.spec.alpha/and :portkey.aws.cloudtrail/resource-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/read-only (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/cloud-trail-event (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/event-source (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.event/access-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.event/username :portkey.aws.cloudtrail.event/event-name :portkey.aws.cloudtrail.event/resources :portkey.aws.cloudtrail.event/read-only :portkey.aws.cloudtrail.event/event-time :portkey.aws.cloudtrail.event/event-id :portkey.aws.cloudtrail.event/cloud-trail-event :portkey.aws.cloudtrail.event/event-source :portkey.aws.cloudtrail.event/access-key-id]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/kms-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-public-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail/public-key-list :portkey.aws.cloudtrail.list-public-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.create-trail-response/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/create-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.create-trail-response/include-global-service-events :portkey.aws.cloudtrail.create-trail-response/s-3-bucket-name :portkey.aws.cloudtrail.create-trail-response/is-organization-trail :portkey.aws.cloudtrail.create-trail-response/trail-arn :portkey.aws.cloudtrail.create-trail-response/sns-topic-arn :portkey.aws.cloudtrail.create-trail-response/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.create-trail-response/kms-key-id :portkey.aws.cloudtrail.create-trail-response/log-file-validation-enabled :portkey.aws.cloudtrail.create-trail-response/s-3-key-prefix :portkey.aws.cloudtrail.create-trail-response/sns-topic-name :portkey.aws.cloudtrail.create-trail-response/name :portkey.aws.cloudtrail.create-trail-response/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-tag-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/cloud-trail-access-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-response/events (clojure.spec.alpha/and :portkey.aws.cloudtrail/events-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.lookup-events-response/events :portkey.aws.cloudtrail/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-attributes-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/lookup-attribute))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.remove-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/remove-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.remove-tags-request/resource-id] :opt-un [:portkey.aws.cloudtrail/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-sns-topic-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.add-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/add-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.add-tags-request/resource-id] :opt-un [:portkey.aws.cloudtrail/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-trail-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-cloud-watch-logs-log-group-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-request/start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-request/end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-public-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.list-public-keys-request/start-time :portkey.aws.cloudtrail.list-public-keys-request/end-time :portkey.aws.cloudtrail.list-public-keys-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/byte-buffer clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail/delete-trail-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/read-write-type #{"WriteOnly" :all :write-only "ReadOnly" :read-only "All"})

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-lookup-attributes-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.start-logging-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/start-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.start-logging-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.resource-tag/resource-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.resource-tag/resource-id :portkey.aws.cloudtrail/tags-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-request/lookup-attributes (clojure.spec.alpha/and :portkey.aws.cloudtrail/lookup-attributes-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-request/start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.lookup-events-request/end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/lookup-events-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.lookup-events-request/lookup-attributes :portkey.aws.cloudtrail.lookup-events-request/start-time :portkey.aws.cloudtrail.lookup-events-request/end-time :portkey.aws.cloudtrail/max-results :portkey.aws.cloudtrail/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-s-3-bucket-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.event-selector/include-management-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/event-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail/read-write-type :portkey.aws.cloudtrail.event-selector/include-management-events :portkey.aws.cloudtrail/data-resources]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/resource))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/cloud-watch-logs-delivery-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/enable-log-file-validation (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.update-trail-request/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/update-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.update-trail-request/name] :opt-un [:portkey.aws.cloudtrail.update-trail-request/enable-log-file-validation :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.update-trail-request/include-global-service-events :portkey.aws.cloudtrail.update-trail-request/s-3-bucket-name :portkey.aws.cloudtrail.update-trail-request/is-organization-trail :portkey.aws.cloudtrail.update-trail-request/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.update-trail-request/kms-key-id :portkey.aws.cloudtrail.update-trail-request/s-3-key-prefix :portkey.aws.cloudtrail.update-trail-request/sns-topic-name :portkey.aws.cloudtrail.update-trail-request/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.describe-trails-response/trail-list (clojure.spec.alpha/and :portkey.aws.cloudtrail/trail-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/describe-trails-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.describe-trails-response/trail-list]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/not-organization-master-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/tags-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/tag))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.tag/key (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.tag/value (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.tag/key] :opt-un [:portkey.aws.cloudtrail.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.resource/resource-type (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.resource/resource-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.resource/resource-type :portkey.aws.cloudtrail.resource/resource-name]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/data-resource-values (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/add-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/has-custom-event-selectors (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/include-global-service-events (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/is-organization-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/trail-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/home-region (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/kms-key-id (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/log-file-validation-enabled (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/sns-topic-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.trail/is-multi-region-trail (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/trail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.trail/has-custom-event-selectors :portkey.aws.cloudtrail.trail/cloud-watch-logs-log-group-arn :portkey.aws.cloudtrail.trail/include-global-service-events :portkey.aws.cloudtrail.trail/s-3-bucket-name :portkey.aws.cloudtrail.trail/is-organization-trail :portkey.aws.cloudtrail.trail/trail-arn :portkey.aws.cloudtrail.trail/sns-topic-arn :portkey.aws.cloudtrail.trail/cloud-watch-logs-role-arn :portkey.aws.cloudtrail.trail/home-region :portkey.aws.cloudtrail.trail/kms-key-id :portkey.aws.cloudtrail.trail/log-file-validation-enabled :portkey.aws.cloudtrail.trail/s-3-key-prefix :portkey.aws.cloudtrail.trail/sns-topic-name :portkey.aws.cloudtrail.trail/name :portkey.aws.cloudtrail.trail/is-multi-region-trail]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.put-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/put-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.put-event-selectors-request/trail-name :portkey.aws.cloudtrail/event-selectors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-event-selectors-request/trail-name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-event-selectors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.get-event-selectors-request/trail-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/kms-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/organization-not-in-all-features-mode-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/string))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/insufficient-encryption-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.delete-trail-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/delete-trail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.delete-trail-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.describe-trails-request/trail-name-list (clojure.spec.alpha/and :portkey.aws.cloudtrail/trail-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.describe-trails-request/include-shadow-trails (clojure.spec.alpha/and :portkey.aws.cloudtrail/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/describe-trails-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.describe-trails-request/trail-name-list :portkey.aws.cloudtrail.describe-trails-request/include-shadow-trails]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/events-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/event))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.get-trail-status-request/name (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/get-trail-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail.get-trail-status-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-time-range-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/public-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/public-key))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/resource-tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudtrail/resource-tag))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/value (clojure.spec.alpha/and :portkey.aws.cloudtrail/byte-buffer))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/validity-start-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/validity-end-time (clojure.spec.alpha/and :portkey.aws.cloudtrail/date))
(clojure.spec.alpha/def :portkey.aws.cloudtrail.public-key/fingerprint (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudtrail.public-key/value :portkey.aws.cloudtrail.public-key/validity-start-time :portkey.aws.cloudtrail.public-key/validity-end-time :portkey.aws.cloudtrail.public-key/fingerprint]))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-cloud-watch-logs-role-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/organizations-not-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudtrail/invalid-s-3-bucket-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudtrail.list-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudtrail/string))
(clojure.spec.alpha/def :portkey.aws.cloudtrail/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudtrail/resource-id-list] :opt-un [:portkey.aws.cloudtrail.list-tags-request/next-token]))

(clojure.core/defn remove-tags "Removes the specified tags from a trail." ([remove-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-request remove-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/remove-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/remove-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn response-remove-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail/invalid-tag-parameter-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/remove-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/remove-tags-response))

(clojure.core/defn start-logging "Starts the recording of AWS API calls and log file delivery for a trail. For a\ntrail that is enabled in all regions, this operation must be called from the\nregion in which the trail was created. This operation cannot be called on the\nshadow trails (replicated trails in other regions) of a trail that is enabled in\nall regions." ([start-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-logging-request start-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/start-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/start-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartLogging", :http.request.configuration/output-deser-fn response-start-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef start-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/start-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/start-logging-response))

(clojure.core/defn delete-trail "Deletes a trail. This operation must be called from the region in which the\ntrail was created. DeleteTrail cannot be called on the shadow trails (replicated\ntrails in other regions) of a trail that is enabled in all regions." ([delete-trail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-trail-request delete-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/delete-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/delete-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrail", :http.request.configuration/output-deser-fn response-delete-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef delete-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/delete-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/delete-trail-response))

(clojure.core/defn update-trail "Updates the settings that specify delivery of log files. Changes to a trail do\nnot require stopping the CloudTrail service. Use this action to designate an\nexisting bucket for log delivery. If the existing bucket has previously been a\ntarget for CloudTrail log files, an IAM policy exists for the bucket.\nUpdateTrail must be called from the region in which the trail was created;\notherwise, an InvalidHomeRegionException is thrown." ([update-trail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-trail-request update-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/update-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/update-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrail", :http.request.configuration/output-deser-fn response-update-trail-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "TrailNotProvidedException" :portkey.aws.cloudtrail/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail/invalid-kms-key-id-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail/kms-key-disabled-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail/insufficient-sns-topic-policy-exception, "KmsException" :portkey.aws.cloudtrail/kms-exception, "CloudTrailAccessNotEnabledException" :portkey.aws.cloudtrail/cloud-trail-access-not-enabled-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail/invalid-sns-topic-name-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail/cloud-watch-logs-delivery-unavailable-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail/kms-key-not-found-exception, "OrganizationNotInAllFeaturesModeException" :portkey.aws.cloudtrail/organization-not-in-all-features-mode-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-role-arn-exception, "OrganizationsNotInUseException" :portkey.aws.cloudtrail/organizations-not-in-use-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef update-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/update-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/update-trail-response))

(clojure.core/defn list-tags "Lists the tags for the trail in the current region." ([list-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cloudtrail/resource-not-found-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail/resource-type-not-supported-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/list-tags-response))

(clojure.core/defn describe-trails "Retrieves settings for the trail associated with the current region for your\naccount." ([] (describe-trails {})) ([describe-trails-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-trails-request describe-trails-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/describe-trails-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/describe-trails-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrails", :http.request.configuration/output-deser-fn response-describe-trails-response, :http.request.spec/error-spec {"UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef describe-trails :args (clojure.spec.alpha/? :portkey.aws.cloudtrail/describe-trails-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/describe-trails-response))

(clojure.core/defn create-trail "Creates a trail that specifies the settings for delivery of log data to an\nAmazon S3 bucket. A maximum of five trails can exist in a region, irrespective\nof the region in which they were created." ([create-trail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-trail-request create-trail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/create-trail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/create-trail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrail", :http.request.configuration/output-deser-fn response-create-trail-response, :http.request.spec/error-spec {"TrailNotProvidedException" :portkey.aws.cloudtrail/trail-not-provided-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidS3PrefixException" :portkey.aws.cloudtrail/invalid-s-3-prefix-exception, "InvalidKmsKeyIdException" :portkey.aws.cloudtrail/invalid-kms-key-id-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception, "KmsKeyDisabledException" :portkey.aws.cloudtrail/kms-key-disabled-exception, "S3BucketDoesNotExistException" :portkey.aws.cloudtrail/s-3-bucket-does-not-exist-exception, "InsufficientSnsTopicPolicyException" :portkey.aws.cloudtrail/insufficient-sns-topic-policy-exception, "MaximumNumberOfTrailsExceededException" :portkey.aws.cloudtrail/maximum-number-of-trails-exceeded-exception, "KmsException" :portkey.aws.cloudtrail/kms-exception, "CloudTrailAccessNotEnabledException" :portkey.aws.cloudtrail/cloud-trail-access-not-enabled-exception, "InvalidSnsTopicNameException" :portkey.aws.cloudtrail/invalid-sns-topic-name-exception, "TrailAlreadyExistsException" :portkey.aws.cloudtrail/trail-already-exists-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidCloudWatchLogsLogGroupArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-log-group-arn-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "InsufficientS3BucketPolicyException" :portkey.aws.cloudtrail/insufficient-s-3-bucket-policy-exception, "InvalidParameterCombinationException" :portkey.aws.cloudtrail/invalid-parameter-combination-exception, "CloudWatchLogsDeliveryUnavailableException" :portkey.aws.cloudtrail/cloud-watch-logs-delivery-unavailable-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "KmsKeyNotFoundException" :portkey.aws.cloudtrail/kms-key-not-found-exception, "OrganizationNotInAllFeaturesModeException" :portkey.aws.cloudtrail/organization-not-in-all-features-mode-exception, "InsufficientEncryptionPolicyException" :portkey.aws.cloudtrail/insufficient-encryption-policy-exception, "InvalidCloudWatchLogsRoleArnException" :portkey.aws.cloudtrail/invalid-cloud-watch-logs-role-arn-exception, "OrganizationsNotInUseException" :portkey.aws.cloudtrail/organizations-not-in-use-exception, "InvalidS3BucketNameException" :portkey.aws.cloudtrail/invalid-s-3-bucket-name-exception}})))))
(clojure.spec.alpha/fdef create-trail :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/create-trail-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/create-trail-response))

(clojure.core/defn get-trail-status "Returns a JSON-formatted list of information about the specified trail. Fields\ninclude information on delivery errors, Amazon SNS and Amazon S3 errors, and\nstart and stop logging times for each trail. This operation returns trail status\nfrom a single region. To return trail status from all regions, you must call the\noperation on each region." ([get-trail-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-trail-status-request get-trail-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/get-trail-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/get-trail-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrailStatus", :http.request.configuration/output-deser-fn response-get-trail-status-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception}})))))
(clojure.spec.alpha/fdef get-trail-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/get-trail-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/get-trail-status-response))

(clojure.core/defn put-event-selectors "Configures an event selector for your trail. Use event selectors to further\nspecify the management and data event settings for your trail. By default,\ntrails created without specific event selectors will be configured to log all\nread and write management events, and no data events.\n When an event occurs in your account, CloudTrail evaluates the event selectors\nin all trails. For each trail, if the event matches any event selector, the\ntrail processes and logs the event. If the event doesn't match any event\nselector, the trail doesn't log the event.\n Example\n * You create an event selector for a trail and specify that you want write-only\nevents.\n * The EC2 GetConsoleOutput and RunInstances API operations occur in your\naccount.\n * CloudTrail evaluates whether the events match your event selectors.\n * The RunInstances is a write-only event and it matches your event selector.\nThe trail logs the event.\n * The GetConsoleOutput is a read-only event but it doesn't match your event\nselector. The trail doesn't log the event.\n The PutEventSelectors operation must be called from the region in which the\ntrail was created; otherwise, an InvalidHomeRegionException is thrown.\n You can configure up to five event selectors for each trail. For more\ninformation, see Logging Data and Management Events for Trails\n(http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html)\nand Limits in AWS CloudTrail\n(https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html)\nin the AWS CloudTrail User Guide." ([put-event-selectors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-event-selectors-request put-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/put-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/put-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEventSelectors", :http.request.configuration/output-deser-fn response-put-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "InvalidEventSelectorsException" :portkey.aws.cloudtrail/invalid-event-selectors-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef put-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/put-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/put-event-selectors-response))

(clojure.core/defn get-event-selectors "Describes the settings for the event selectors that you configured for your\ntrail. The information returned for your event selectors includes the following:\n * If your event selector includes read-only events, write-only events, or all\nevents. This applies to both management events and data events.\n * If your event selector includes management events.\n * If your event selector includes data events, the Amazon S3 objects or AWS\nLambda functions that you are logging for data events.\n For more information, see Logging Data and Management Events for Trails\n(http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html)\nin the AWS CloudTrail User Guide." ([get-event-selectors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-event-selectors-request get-event-selectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/get-event-selectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/get-event-selectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEventSelectors", :http.request.configuration/output-deser-fn response-get-event-selectors-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-event-selectors :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/get-event-selectors-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/get-event-selectors-response))

(clojure.core/defn lookup-events "Looks up management events\n(https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events)\ncaptured by CloudTrail. Events for a region can be looked up in that region\nduring the last 90 days. Lookup supports the following attributes:\n * AWS access key\n * Event ID\n * Event name\n * Event source\n * Read only\n * Resource name\n * Resource type\n * User name\n All attributes are optional. The default number of results returned is 50, with\na maximum of 50 possible. The response includes a token that you can use to get\nthe next page of results.\n The rate of lookup requests is limited to one per second per account. If this\nlimit is exceeded, a throttling error occurs.\n Events that occurred during the selected time range will not be available for\nlookup if CloudTrail logging was not enabled when the events occurred." ([] (lookup-events {})) ([lookup-events-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-lookup-events-request lookup-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/lookup-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/lookup-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LookupEvents", :http.request.configuration/output-deser-fn response-lookup-events-response, :http.request.spec/error-spec {"InvalidLookupAttributesException" :portkey.aws.cloudtrail/invalid-lookup-attributes-exception, "InvalidTimeRangeException" :portkey.aws.cloudtrail/invalid-time-range-exception, "InvalidMaxResultsException" :portkey.aws.cloudtrail/invalid-max-results-exception, "InvalidNextTokenException" :portkey.aws.cloudtrail/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef lookup-events :args (clojure.spec.alpha/? :portkey.aws.cloudtrail/lookup-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/lookup-events-response))

(clojure.core/defn list-public-keys "Returns all public keys whose private keys were used to sign the digest files\nwithin the specified time range. The public key is needed to validate digest\nfiles that were signed with its corresponding private key.\n CloudTrail uses different private/public key pairs per region. Each digest file\nis signed with a private key unique to its region. Therefore, when you validate\na digest file from a particular region, you must look in the same region for its\ncorresponding public key." ([] (list-public-keys {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/list-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/list-public-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublicKeys", :http.request.configuration/output-deser-fn response-list-public-keys-response, :http.request.spec/error-spec {"InvalidTimeRangeException" :portkey.aws.cloudtrail/invalid-time-range-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "InvalidTokenException" :portkey.aws.cloudtrail/invalid-token-exception}})))))
(clojure.spec.alpha/fdef list-public-keys :args (clojure.spec.alpha/? :portkey.aws.cloudtrail/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/list-public-keys-response))

(clojure.core/defn add-tags "Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per\ntrail. Overwrites an existing tag's value when a new value is specified for an\nexisting tag key. If you specify a key without a value, the tag will be created\nwith the specified key and a value of null. You can tag a trail that applies to\nall regions only from the region in which the trail was created (that is, from\nits home region)." ([add-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-request add-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/add-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/add-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-response, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "TagsLimitExceededException" :portkey.aws.cloudtrail/tags-limit-exceeded-exception, "CloudTrailARNInvalidException" :portkey.aws.cloudtrail/cloud-trail-arn-invalid-exception, "InvalidTagParameterException" :portkey.aws.cloudtrail/invalid-tag-parameter-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "ResourceNotFoundException" :portkey.aws.cloudtrail/resource-not-found-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "ResourceTypeNotSupportedException" :portkey.aws.cloudtrail/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/add-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/add-tags-response))

(clojure.core/defn stop-logging "Suspends the recording of AWS API calls and log file delivery for the specified\ntrail. Under most circumstances, there is no need to use this action. You can\nupdate a trail without stopping it first. This action is the only way to stop\nrecording. For a trail enabled in all regions, this operation must be called\nfrom the region in which the trail was created, or an InvalidHomeRegionException\nwill occur. This operation cannot be called on the shadow trails (replicated\ntrails in other regions) of a trail enabled in all regions." ([stop-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-logging-request stop-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudtrail/endpoints, :http.request.configuration/target-prefix "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101", :http.request.spec/output-spec :portkey.aws.cloudtrail/stop-logging-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-11-01", :http.request.configuration/service-id "CloudTrail", :http.request.spec/input-spec :portkey.aws.cloudtrail/stop-logging-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopLogging", :http.request.configuration/output-deser-fn response-stop-logging-response, :http.request.spec/error-spec {"TrailNotFoundException" :portkey.aws.cloudtrail/trail-not-found-exception, "InvalidTrailNameException" :portkey.aws.cloudtrail/invalid-trail-name-exception, "InvalidHomeRegionException" :portkey.aws.cloudtrail/invalid-home-region-exception, "UnsupportedOperationException" :portkey.aws.cloudtrail/unsupported-operation-exception, "OperationNotPermittedException" :portkey.aws.cloudtrail/operation-not-permitted-exception, "NotOrganizationMasterAccountException" :portkey.aws.cloudtrail/not-organization-master-account-exception, "InsufficientDependencyServiceAccessPermissionException" :portkey.aws.cloudtrail/insufficient-dependency-service-access-permission-exception}})))))
(clojure.spec.alpha/fdef stop-logging :args (clojure.spec.alpha/tuple :portkey.aws.cloudtrail/stop-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudtrail/stop-logging-response))
