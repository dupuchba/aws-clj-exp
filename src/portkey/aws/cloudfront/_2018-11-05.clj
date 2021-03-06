(ns portkey.aws.cloudfront.-2018-11-05 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare serboolean)

(clojure.core/declare ser-cookie-names)

(clojure.core/declare ser-content-type-profile)

(clojure.core/declare ser-logging-config)

(clojure.core/declare ser-streaming-distribution-config-with-tags)

(clojure.core/declare ser-custom-error-response-list)

(clojure.core/declare ser-certificate-source)

(clojure.core/declare ser-location-list)

(clojure.core/declare ser-field-patterns)

(clojure.core/declare ser-restrictions)

(clojure.core/declare ser-field-level-encryption-profile-config)

(clojure.core/declare serstring)

(clojure.core/declare ser-field-level-encryption-config)

(clojure.core/declare ser-origin-group-list)

(clojure.core/declare ser-query-arg-profile)

(clojure.core/declare ser-lambda-function-association)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-origin-group-members)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-origin-group-failover-criteria)

(clojure.core/declare ser-query-string-cache-keys-list)

(clojure.core/declare ser-public-key-config)

(clojure.core/declare ser-item-selection)

(clojure.core/declare ser-encryption-entity-list)

(clojure.core/declare ser-lambda-function-associations)

(clojure.core/declare ser-encryption-entities)

(clojure.core/declare ser-viewer-protocol-policy)

(clojure.core/declare ser-content-type-profile-list)

(clojure.core/declare ser-custom-error-response)

(clojure.core/declare serlong)

(clojure.core/declare ser-origin-list)

(clojure.core/declare ser-content-type-profile-config)

(clojure.core/declare ser-cached-methods)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-query-arg-profile-list)

(clojure.core/declare ser-cache-behaviors)

(clojure.core/declare ser-cache-behavior)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-format)

(clojure.core/declare ser-custom-error-responses)

(clojure.core/declare ser-origin-group-member)

(clojure.core/declare ser-origin-ssl-protocols)

(clojure.core/declare ser-aliases)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-content-type-profiles)

(clojure.core/declare ser-encryption-entity)

(clojure.core/declare ser-lambda-function-arn)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-price-class)

(clojure.core/declare ser-custom-origin-config)

(clojure.core/declare ser-s-3-origin)

(clojure.core/declare ser-cookie-name-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-query-string-cache-keys)

(clojure.core/declare ser-distribution-config)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-ssl-protocols-list)

(clojure.core/declare ser-aws-account-number-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-method)

(clojure.core/declare ser-alias-list)

(clojure.core/declare ser-origin-custom-headers-list)

(clojure.core/declare ser-query-arg-profile-config)

(clojure.core/declare ser-origin-protocol-policy)

(clojure.core/declare ser-query-arg-profiles)

(clojure.core/declare ser-path-list)

(clojure.core/declare ser-status-code-list)

(clojure.core/declare ser-geo-restriction-type)

(clojure.core/declare ser-status-codes)

(clojure.core/declare ser-paths)

(clojure.core/declare serinteger)

(clojure.core/declare ser-cache-behavior-list)

(clojure.core/declare ser-origin-custom-header)

(clojure.core/declare ser-streaming-distribution-config)

(clojure.core/declare ser-origin-group-member-list)

(clojure.core/declare ser-field-pattern-list)

(clojure.core/declare ser-s-3-origin-config)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-origin-group)

(clojure.core/declare ser-streaming-logging-config)

(clojure.core/declare ser-ssl-protocol)

(clojure.core/declare ser-lambda-function-association-list)

(clojure.core/declare ser-headers)

(clojure.core/declare ser-minimum-protocol-version)

(clojure.core/declare ser-origins)

(clojure.core/declare ser-distribution-config-with-tags)

(clojure.core/declare ser-header-list)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-ssl-support-method)

(clojure.core/declare ser-http-version)

(clojure.core/declare ser-cookie-preference)

(clojure.core/declare ser-custom-headers)

(clojure.core/declare ser-origin-groups)

(clojure.core/declare ser-methods-list)

(clojure.core/declare ser-default-cache-behavior)

(clojure.core/declare ser-trusted-signers)

(clojure.core/declare ser-viewer-certificate)

(clojure.core/declare ser-cloud-front-origin-access-identity-config)

(clojure.core/declare ser-geo-restriction)

(clojure.core/defn- ser-tag-keys [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :items)) #:http.request.field{:name "Items", :shape "TagKeyList"}))))

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-cookie-names [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CookieNames", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-name-list (input :items)) #:http.request.field{:name "Items", :shape "CookieNameList"}))))

(clojure.core/defn- ser-content-type-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-format (:format input)) #:http.request.field{:name "Format", :shape "Format"}) (clojure.core/into (serstring (:content-type input)) #:http.request.field{:name "ContentType", :shape "string"})], :shape "ContentTypeProfile", :type "structure"} (clojure.core/contains? input :profile-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :profile-id)) #:http.request.field{:name "ProfileId", :shape "string"}))))

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-streaming-distribution-config (:streaming-distribution-config input)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "StreamingDistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-custom-error-response-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-error-response coll) #:http.request.field{:shape "CustomErrorResponse", :location-name "CustomErrorResponse"}))) input), :shape "CustomErrorResponseList", :type "list"})

(clojure.core/defn- ser-certificate-source [input] #:http.request.field{:value (clojure.core/get {"cloudfront" "cloudfront", :cloudfront "cloudfront", "iam" "iam", :iam "iam", "acm" "acm", :acm "acm"} input), :shape "CertificateSource"})

(clojure.core/defn- ser-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Location"}))) input), :shape "LocationList", :type "list"})

(clojure.core/defn- ser-field-patterns [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "FieldPatterns", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-pattern-list (input :items)) #:http.request.field{:name "Items", :shape "FieldPatternList"}))))

(clojure.core/defn- ser-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction (:geo-restriction input)) #:http.request.field{:name "GeoRestriction", :shape "GeoRestriction"})], :shape "Restrictions", :type "structure"}))

(clojure.core/defn- ser-field-level-encryption-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:name input)) #:http.request.field{:name "Name", :shape "string"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-encryption-entities (:encryption-entities input)) #:http.request.field{:name "EncryptionEntities", :shape "EncryptionEntities"})], :shape "FieldLevelEncryptionProfileConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"}))))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-field-level-encryption-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "FieldLevelEncryptionConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"})) (clojure.core/contains? input :query-arg-profile-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profile-config (input :query-arg-profile-config)) #:http.request.field{:name "QueryArgProfileConfig", :shape "QueryArgProfileConfig"})) (clojure.core/contains? input :content-type-profile-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profile-config (input :content-type-profile-config)) #:http.request.field{:name "ContentTypeProfileConfig", :shape "ContentTypeProfileConfig"}))))

(clojure.core/defn- ser-origin-group-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-group coll) #:http.request.field{:shape "OriginGroup", :location-name "OriginGroup"}))) input), :shape "OriginGroupList", :type "list"})

(clojure.core/defn- ser-query-arg-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:query-arg input)) #:http.request.field{:name "QueryArg", :shape "string"}) (clojure.core/into (serstring (:profile-id input)) #:http.request.field{:name "ProfileId", :shape "string"})], :shape "QueryArgProfile", :type "structure"}))

(clojure.core/defn- ser-lambda-function-association [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:lambda-function-arn input)) #:http.request.field{:name "LambdaFunctionARN", :shape "LambdaFunctionARN"}) (clojure.core/into (ser-event-type (:event-type input)) #:http.request.field{:name "EventType", :shape "EventType"})], :shape "LambdaFunctionAssociation", :type "structure"} (clojure.core/contains? input :include-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-body)) #:http.request.field{:name "IncludeBody", :shape "boolean"}))))

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-origin-group-members [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-origin-group-member-list (:items input)) #:http.request.field{:name "Items", :shape "OriginGroupMemberList"})], :shape "OriginGroupMembers", :type "structure"}))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-origin-group-failover-criteria [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-status-codes (:status-codes input)) #:http.request.field{:name "StatusCodes", :shape "StatusCodes"})], :shape "OriginGroupFailoverCriteria", :type "structure"}))

(clojure.core/defn- ser-query-string-cache-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "QueryStringCacheKeysList", :type "list"})

(clojure.core/defn- ser-public-key-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:name input)) #:http.request.field{:name "Name", :shape "string"}) (clojure.core/into (serstring (:encoded-key input)) #:http.request.field{:name "EncodedKey", :shape "string"})], :shape "PublicKeyConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"}))))

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-encryption-entity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-encryption-entity coll) #:http.request.field{:shape "EncryptionEntity", :location-name "EncryptionEntity"}))) input), :shape "EncryptionEntityList", :type "list"})

(clojure.core/defn- ser-lambda-function-associations [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "LambdaFunctionAssociations", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-association-list (input :items)) #:http.request.field{:name "Items", :shape "LambdaFunctionAssociationList"}))))

(clojure.core/defn- ser-encryption-entities [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "EncryptionEntities", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-entity-list (input :items)) #:http.request.field{:name "Items", :shape "EncryptionEntityList"}))))

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-content-type-profile-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-content-type-profile coll) #:http.request.field{:shape "ContentTypeProfile", :location-name "ContentTypeProfile"}))) input), :shape "ContentTypeProfileList", :type "list"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-content-type-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:forward-when-content-type-is-unknown input)) #:http.request.field{:name "ForwardWhenContentTypeIsUnknown", :shape "boolean"})], :shape "ContentTypeProfileConfig", :type "structure"} (clojure.core/contains? input :content-type-profiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profiles (input :content-type-profiles)) #:http.request.field{:name "ContentTypeProfiles", :shape "ContentTypeProfiles"}))))

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-query-arg-profile-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-arg-profile coll) #:http.request.field{:shape "QueryArgProfile", :location-name "QueryArgProfile"}))) input), :shape "QueryArgProfileList", :type "list"})

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-format [input] #:http.request.field{:value (clojure.core/get {"URLEncoded" "URLEncoded", :url-encoded "URLEncoded"} input), :shape "Format"})

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-group-member [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-id input)) #:http.request.field{:name "OriginId", :shape "string"})], :shape "OriginGroupMember", :type "structure"}))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"viewer-request" "viewer-request", :viewerrequest "viewer-request", "viewer-response" "viewer-response", :viewerresponse "viewer-response", "origin-request" "origin-request", :originrequest "origin-request", "origin-response" "origin-response", :originresponse "origin-response"} input), :shape "EventType"})

(clojure.core/defn- ser-content-type-profiles [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "ContentTypeProfiles", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profile-list (input :items)) #:http.request.field{:name "Items", :shape "ContentTypeProfileList"}))))

(clojure.core/defn- ser-encryption-entity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:public-key-id input)) #:http.request.field{:name "PublicKeyId", :shape "string"}) (clojure.core/into (serstring (:provider-id input)) #:http.request.field{:name "ProviderId", :shape "string"}) (clojure.core/into (ser-field-patterns (:field-patterns input)) #:http.request.field{:name "FieldPatterns", :shape "FieldPatterns"})], :shape "EncryptionEntity", :type "structure"}))

(clojure.core/defn- ser-lambda-function-arn [input] #:http.request.field{:value input, :shape "LambdaFunctionARN"})

(clojure.core/defn- ser-allowed-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "AllowedMethods", :type "structure"} (clojure.core/contains? input :cached-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cached-methods (input :cached-methods)) #:http.request.field{:name "CachedMethods", :shape "CachedMethods"}))))

(clojure.core/defn- ser-price-class [input] #:http.request.field{:value (clojure.core/get {"PriceClass_100" "PriceClass_100", :price-class-100 "PriceClass_100", "PriceClass_200" "PriceClass_200", :price-class-200 "PriceClass_200", "PriceClass_All" "PriceClass_All", :price-class-all "PriceClass_All"} input), :shape "PriceClass"})

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"})) (clojure.core/contains? input :origin-read-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-read-timeout)) #:http.request.field{:name "OriginReadTimeout", :shape "integer"})) (clojure.core/contains? input :origin-keepalive-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-keepalive-timeout)) #:http.request.field{:name "OriginKeepaliveTimeout", :shape "integer"}))))

(clojure.core/defn- ser-s-3-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"}) (clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3Origin", :type "structure"}))

(clojure.core/defn- ser-cookie-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "CookieNameList", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-query-string-cache-keys [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryStringCacheKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys-list (input :items)) #:http.request.field{:name "Items", :shape "QueryStringCacheKeysList"}))))

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :is-ipv-6-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-ipv-6-enabled)) #:http.request.field{:name "IsIPV6Enabled", :shape "boolean"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :origin-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-groups (input :origin-groups)) #:http.request.field{:name "OriginGroups", :shape "OriginGroups"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "Key"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-ssl-protocols-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-protocol coll) #:http.request.field{:shape "SslProtocol", :location-name "SslProtocol"}))) input), :shape "SslProtocolsList", :type "list"})

(clojure.core/defn- ser-aws-account-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "AwsAccountNumber"}))) input), :shape "AwsAccountNumberList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-method [input] #:http.request.field{:value (clojure.core/get {"DELETE" "DELETE", :get "GET", "OPTIONS" "OPTIONS", :patch "PATCH", "PATCH" "PATCH", :delete "DELETE", :head "HEAD", "HEAD" "HEAD", "POST" "POST", :post "POST", :options "OPTIONS", :put "PUT", "GET" "GET", "PUT" "PUT"} input), :shape "Method"})

(clojure.core/defn- ser-alias-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "CNAME"}))) input), :shape "AliasList", :type "list"})

(clojure.core/defn- ser-origin-custom-headers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-custom-header coll) #:http.request.field{:shape "OriginCustomHeader", :location-name "OriginCustomHeader"}))) input), :shape "OriginCustomHeadersList", :type "list"})

(clojure.core/defn- ser-query-arg-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:forward-when-query-arg-profile-is-unknown input)) #:http.request.field{:name "ForwardWhenQueryArgProfileIsUnknown", :shape "boolean"})], :shape "QueryArgProfileConfig", :type "structure"} (clojure.core/contains? input :query-arg-profiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profiles (input :query-arg-profiles)) #:http.request.field{:name "QueryArgProfiles", :shape "QueryArgProfiles"}))))

(clojure.core/defn- ser-origin-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"http-only" "http-only", :httponly "http-only", "match-viewer" "match-viewer", :matchviewer "match-viewer", "https-only" "https-only", :httpsonly "https-only"} input), :shape "OriginProtocolPolicy"})

(clojure.core/defn- ser-query-arg-profiles [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryArgProfiles", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profile-list (input :items)) #:http.request.field{:name "Items", :shape "QueryArgProfileList"}))))

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-status-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serinteger coll) #:http.request.field{:shape "integer", :location-name "StatusCode"}))) input), :shape "StatusCodeList", :type "list", :min 1})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-status-codes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-status-code-list (:items input)) #:http.request.field{:name "Items", :shape "StatusCodeList"})], :shape "StatusCodes", :type "structure"}))

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-origin-group-member-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-group-member coll) #:http.request.field{:shape "OriginGroupMember", :location-name "OriginGroupMember"}))) input), :shape "OriginGroupMemberList", :type "list", :max 2, :min 2})

(clojure.core/defn- ser-field-pattern-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "FieldPattern"}))) input), :shape "FieldPatternList", :type "list"})

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-origin-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (ser-origin-group-failover-criteria (:failover-criteria input)) #:http.request.field{:name "FailoverCriteria", :shape "OriginGroupFailoverCriteria"}) (clojure.core/into (ser-origin-group-members (:members input)) #:http.request.field{:name "Members", :shape "OriginGroupMembers"})], :shape "OriginGroup", :type "structure"}))

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-lambda-function-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-association coll) #:http.request.field{:shape "LambdaFunctionAssociation", :location-name "LambdaFunctionAssociation"}))) input), :shape "LambdaFunctionAssociationList", :type "list"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1_2016" "TLSv1_2016", :tl-sv-12-2018 "TLSv1.2_2018", :ss-lv-3 "SSLv3", "TLSv1.2_2018" "TLSv1.2_2018", "SSLv3" "SSLv3", :tl-sv-11-2016 "TLSv1.1_2016", :tl-sv-1-2016 "TLSv1_2016", "TLSv1.1_2016" "TLSv1.1_2016"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-origin-list (:items input)) #:http.request.field{:name "Items", :shape "OriginList"})], :shape "Origins", :type "structure"}))

(clojure.core/defn- ser-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-distribution-config (:distribution-config input)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "DistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-ssl-support-method [input] #:http.request.field{:value (clojure.core/get {"sni-only" "sni-only", :snionly "sni-only", "vip" "vip", :vip "vip"} input), :shape "SSLSupportMethod"})

(clojure.core/defn- ser-http-version [input] #:http.request.field{:value (clojure.core/get {"http1.1" "http1.1", :http-11 "http1.1", "http2" "http2", :http-2 "http2"} input), :shape "HttpVersion"})

(clojure.core/defn- ser-cookie-preference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-item-selection (:forward input)) #:http.request.field{:name "Forward", :shape "ItemSelection"})], :shape "CookiePreference", :type "structure"} (clojure.core/contains? input :whitelisted-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-names (input :whitelisted-names)) #:http.request.field{:name "WhitelistedNames", :shape "CookieNames"}))))

(clojure.core/defn- ser-custom-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomHeaders", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-custom-headers-list (input :items)) #:http.request.field{:name "Items", :shape "OriginCustomHeadersList"}))))

(clojure.core/defn- ser-origin-groups [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "OriginGroups", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-group-list (input :items)) #:http.request.field{:name "Items", :shape "OriginGroupList"}))))

(clojure.core/defn- ser-methods-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method coll) #:http.request.field{:shape "Method", :location-name "Method"}))) input), :shape "MethodsList", :type "list"})

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-trusted-signers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "TrustedSigners", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-number-list (input :items)) #:http.request.field{:name "Items", :shape "AwsAccountNumberList"}))))

(clojure.core/defn- ser-viewer-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ViewerCertificate", :type "structure"} (clojure.core/contains? input :cloud-front-default-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :cloud-front-default-certificate)) #:http.request.field{:name "CloudFrontDefaultCertificate", :shape "boolean"})) (clojure.core/contains? input :iam-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :iam-certificate-id)) #:http.request.field{:name "IAMCertificateId", :shape "string"})) (clojure.core/contains? input :acm-certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :acm-certificate-arn)) #:http.request.field{:name "ACMCertificateArn", :shape "string"})) (clojure.core/contains? input :ssl-support-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-support-method (input :ssl-support-method)) #:http.request.field{:name "SSLSupportMethod", :shape "SSLSupportMethod"})) (clojure.core/contains? input :minimum-protocol-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-protocol-version (input :minimum-protocol-version)) #:http.request.field{:name "MinimumProtocolVersion", :shape "MinimumProtocolVersion"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :certificate)) #:http.request.field{:name "Certificate", :shape "string", :deprecated true})) (clojure.core/contains? input :certificate-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-source (input :certificate-source)) #:http.request.field{:name "CertificateSource", :shape "CertificateSource", :deprecated true}))))

(clojure.core/defn- ser-cloud-front-origin-access-identity-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"})], :shape "CloudFrontOriginAccessIdentityConfig", :type "structure"}))

(clojure.core/defn- ser-geo-restriction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction-type (:restriction-type input)) #:http.request.field{:name "RestrictionType", :shape "GeoRestrictionType"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "GeoRestriction", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-list (input :items)) #:http.request.field{:name "Items", :shape "LocationList"}))))

(clojure.core/defn- req-list-distributions-by-web-acl-id-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string", :location "uri", :location-name "WebACLId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-create-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-streaming-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-public-key-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})]}))

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-field-level-encryption-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-list-field-level-encryption-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-update-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-field-level-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-delete-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-list-cloud-front-origin-access-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/declare deserboolean)

(clojure.core/declare deser-cookie-names)

(clojure.core/declare deser-content-type-profile)

(clojure.core/declare deser-logging-config)

(clojure.core/declare deser-invalidation-summary)

(clojure.core/declare deser-custom-error-response-list)

(clojure.core/declare deser-invalidation)

(clojure.core/declare deser-certificate-source)

(clojure.core/declare deser-location-list)

(clojure.core/declare deser-key-pair-id-list)

(clojure.core/declare deser-field-patterns)

(clojure.core/declare deser-restrictions)

(clojure.core/declare deser-field-level-encryption-profile-config)

(clojure.core/declare deserstring)

(clojure.core/declare deser-field-level-encryption-config)

(clojure.core/declare deser-origin-group-list)

(clojure.core/declare deser-field-level-encryption-profile)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-cloud-front-origin-access-identity-list)

(clojure.core/declare deser-query-arg-profile)

(clojure.core/declare deser-lambda-function-association)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-origin-group-members)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-origin-group-failover-criteria)

(clojure.core/declare deser-invalidation-summary-list)

(clojure.core/declare deser-query-string-cache-keys-list)

(clojure.core/declare deser-streaming-distribution-list)

(clojure.core/declare deser-public-key-config)

(clojure.core/declare deser-item-selection)

(clojure.core/declare deser-encryption-entity-list)

(clojure.core/declare deser-streaming-distribution)

(clojure.core/declare deser-lambda-function-associations)

(clojure.core/declare deser-encryption-entities)

(clojure.core/declare deser-viewer-protocol-policy)

(clojure.core/declare deser-field-level-encryption-profile-summary)

(clojure.core/declare deser-content-type-profile-list)

(clojure.core/declare deser-custom-error-response)

(clojure.core/declare deser-distribution-summary-list)

(clojure.core/declare deser-signer)

(clojure.core/declare deserlong)

(clojure.core/declare deser-origin-list)

(clojure.core/declare deser-field-level-encryption-profile-list)

(clojure.core/declare deser-content-type-profile-config)

(clojure.core/declare deser-cached-methods)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-streaming-distribution-summary-list)

(clojure.core/declare deser-query-arg-profile-list)

(clojure.core/declare deser-cache-behaviors)

(clojure.core/declare deser-cache-behavior)

(clojure.core/declare deser-active-trusted-signers)

(clojure.core/declare deser-origin)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-format)

(clojure.core/declare deser-custom-error-responses)

(clojure.core/declare deser-origin-group-member)

(clojure.core/declare deser-invalidation-list)

(clojure.core/declare deser-origin-ssl-protocols)

(clojure.core/declare deser-aliases)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-content-type-profiles)

(clojure.core/declare deser-encryption-entity)

(clojure.core/declare deser-lambda-function-arn)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-price-class)

(clojure.core/declare deser-custom-origin-config)

(clojure.core/declare deser-s-3-origin)

(clojure.core/declare deser-streaming-distribution-summary)

(clojure.core/declare deser-cloud-front-origin-access-identity)

(clojure.core/declare deser-cookie-name-list)

(clojure.core/declare deser-field-level-encryption)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-query-string-cache-keys)

(clojure.core/declare deser-key-pair-ids)

(clojure.core/declare deser-distribution-config)

(clojure.core/declare deser-public-key-summary)

(clojure.core/declare deser-ssl-protocols-list)

(clojure.core/declare deser-aws-account-number-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-method)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-origin-custom-headers-list)

(clojure.core/declare deser-query-arg-profile-config)

(clojure.core/declare deser-origin-protocol-policy)

(clojure.core/declare deser-signer-list)

(clojure.core/declare deser-query-arg-profiles)

(clojure.core/declare deser-path-list)

(clojure.core/declare deser-status-code-list)

(clojure.core/declare deser-geo-restriction-type)

(clojure.core/declare deser-status-codes)

(clojure.core/declare deser-paths)

(clojure.core/declare deser-field-level-encryption-summary-list)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary)

(clojure.core/declare deser-cache-behavior-list)

(clojure.core/declare deser-origin-custom-header)

(clojure.core/declare deser-streaming-distribution-config)

(clojure.core/declare deser-origin-group-member-list)

(clojure.core/declare deser-public-key-summary-list)

(clojure.core/declare deser-field-pattern-list)

(clojure.core/declare deser-s-3-origin-config)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-origin-group)

(clojure.core/declare deser-streaming-logging-config)

(clojure.core/declare deser-field-level-encryption-summary)

(clojure.core/declare deser-distribution-summary)

(clojure.core/declare deser-ssl-protocol)

(clojure.core/declare deser-lambda-function-association-list)

(clojure.core/declare deser-headers)

(clojure.core/declare deser-minimum-protocol-version)

(clojure.core/declare deser-origins)

(clojure.core/declare deser-header-list)

(clojure.core/declare deser-distribution-list)

(clojure.core/declare deser-ssl-support-method)

(clojure.core/declare deser-http-version)

(clojure.core/declare deser-cookie-preference)

(clojure.core/declare deser-custom-headers)

(clojure.core/declare deser-origin-groups)

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-public-key-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-field-level-encryption-list)

(clojure.core/declare deser-public-key)

(clojure.core/declare deser-field-level-encryption-profile-summary-list)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar341844 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar341844 ["Quantity" :content]))} (letvar341844 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar341844 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile [input] (clojure.core/let [letvar341952 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? nil :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? nil :xmlAttribute? nil), "ContentType" (portkey.aws/search-for-tag input "ContentType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-format (clojure.core/get-in letvar341952 ["Format" :content])), :content-type (deserstring (clojure.core/get-in letvar341952 ["ContentType" :content]))} (letvar341952 "ProfileId") (clojure.core/assoc :profile-id (deserstring (clojure.core/get-in letvar341952 ["ProfileId" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar342060 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar342060 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar342060 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar342060 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar342060 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar342168 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar342168 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar342168 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar342168 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar342293 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar342293 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar342293 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar342293 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar342293 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-patterns [input] (clojure.core/let [letvar342440 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar342440 ["Quantity" :content]))} (letvar342440 "Items") (clojure.core/assoc :items (deser-field-pattern-list (clojure.core/get-in letvar342440 ["Items" :content]))))))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar342548 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar342548 ["GeoRestriction" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-config [input] (clojure.core/let [letvar342656 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deserstring (clojure.core/get-in letvar342656 ["Name" :content])), :caller-reference (deserstring (clojure.core/get-in letvar342656 ["CallerReference" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar342656 ["EncryptionEntities" :content]))} (letvar342656 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar342656 ["Comment" :content]))))))

(clojure.core/defn- deserstring [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-field-level-encryption-config [input] (clojure.core/let [letvar342769 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? nil :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar342769 ["CallerReference" :content]))} (letvar342769 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar342769 ["Comment" :content]))) (letvar342769 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar342769 ["QueryArgProfileConfig" :content]))) (letvar342769 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar342769 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-origin-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-group coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile [input] (clojure.core/let [letvar342894 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionProfileConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar342894 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar342894 ["LastModifiedTime" :content])), :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar342894 ["FieldLevelEncryptionProfileConfig" :content]))})))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar343002 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar343002 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar343002 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar343002 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar343002 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar343002 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar343002 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar343002 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar343002 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar343110 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar343110 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar343110 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar343110 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar343110 ["Quantity" :content]))} (letvar343110 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar343110 ["NextMarker" :content]))) (letvar343110 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar343110 ["Items" :content]))))))

(clojure.core/defn- deser-query-arg-profile [input] (clojure.core/let [letvar343218 {"QueryArg" (portkey.aws/search-for-tag input "QueryArg" :flattened? nil :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:query-arg (deserstring (clojure.core/get-in letvar343218 ["QueryArg" :content])), :profile-id (deserstring (clojure.core/get-in letvar343218 ["ProfileId" :content]))})))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar343326 {"LambdaFunctionARN" (portkey.aws/search-for-tag input "LambdaFunctionARN" :flattened? nil :xmlAttribute? nil), "EventType" (portkey.aws/search-for-tag input "EventType" :flattened? nil :xmlAttribute? nil), "IncludeBody" (portkey.aws/search-for-tag input "IncludeBody" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar343326 ["LambdaFunctionARN" :content])), :event-type (deser-event-type (clojure.core/get-in letvar343326 ["EventType" :content]))} (letvar343326 "IncludeBody") (clojure.core/assoc :include-body (deserboolean (clojure.core/get-in letvar343326 ["IncludeBody" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar343434 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? nil :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? nil :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? nil :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar343434 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar343434 ["Cookies" :content]))} (letvar343434 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar343434 ["Headers" :content]))) (letvar343434 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar343434 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-origin-group-members [input] (clojure.core/let [letvar343542 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar343542 ["Quantity" :content])), :items (deser-origin-group-member-list (clojure.core/get-in letvar343542 ["Items" :content]))})))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar343650 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar343650 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar343650 ["CallerReference" :content]))})))

(clojure.core/defn- deser-origin-group-failover-criteria [input] (clojure.core/let [letvar343758 {"StatusCodes" (portkey.aws/search-for-tag input "StatusCodes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status-codes (deser-status-codes (clojure.core/get-in letvar343758 ["StatusCodes" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar343900 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar343900 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar343900 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar343900 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar343900 ["Quantity" :content]))} (letvar343900 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar343900 ["NextMarker" :content]))) (letvar343900 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar343900 ["Items" :content]))))))

(clojure.core/defn- deser-public-key-config [input] (clojure.core/let [letvar344008 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar344008 ["CallerReference" :content])), :name (deserstring (clojure.core/get-in letvar344008 ["Name" :content])), :encoded-key (deserstring (clojure.core/get-in letvar344008 ["EncodedKey" :content]))} (letvar344008 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar344008 ["Comment" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-encryption-entity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-encryption-entity coll))) input))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar344138 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar344138 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar344138 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar344138 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar344138 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar344138 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar344138 ["StreamingDistributionConfig" :content]))} (letvar344138 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar344138 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar344246 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar344246 ["Quantity" :content]))} (letvar344246 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar344246 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entities [input] (clojure.core/let [letvar344354 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar344354 ["Quantity" :content]))} (letvar344354 "Items") (clojure.core/assoc :items (deser-encryption-entity-list (clojure.core/get-in letvar344354 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-field-level-encryption-profile-summary [input] (clojure.core/let [letvar344467 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar344467 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar344467 ["LastModifiedTime" :content])), :name (deserstring (clojure.core/get-in letvar344467 ["Name" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar344467 ["EncryptionEntities" :content]))} (letvar344467 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar344467 ["Comment" :content]))))))

(clojure.core/defn- deser-content-type-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-type-profile coll))) input))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar344592 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? nil :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? nil :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? nil :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar344592 ["ErrorCode" :content]))} (letvar344592 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar344592 ["ResponsePagePath" :content]))) (letvar344592 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar344592 ["ResponseCode" :content]))) (letvar344592 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar344592 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar344717 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? nil :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar344717 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar344717 ["AwsAccountNumber" :content]))) (letvar344717 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar344717 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile-list [input] (clojure.core/let [letvar344844 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar344844 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar344844 ["Quantity" :content]))} (letvar344844 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar344844 ["NextMarker" :content]))) (letvar344844 "Items") (clojure.core/assoc :items (deser-field-level-encryption-profile-summary-list (clojure.core/get-in letvar344844 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile-config [input] (clojure.core/let [letvar344952 {"ForwardWhenContentTypeIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenContentTypeIsUnknown" :flattened? nil :xmlAttribute? nil), "ContentTypeProfiles" (portkey.aws/search-for-tag input "ContentTypeProfiles" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-content-type-is-unknown (deserboolean (clojure.core/get-in letvar344952 ["ForwardWhenContentTypeIsUnknown" :content]))} (letvar344952 "ContentTypeProfiles") (clojure.core/assoc :content-type-profiles (deser-content-type-profiles (clojure.core/get-in letvar344952 ["ContentTypeProfiles" :content]))))))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar345060 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar345060 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar345060 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar345173 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar345173 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar345173 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-query-arg-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-arg-profile coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar345315 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar345315 ["Quantity" :content]))} (letvar345315 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar345315 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar345423 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar345423 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar345423 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar345423 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar345423 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar345423 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar345423 ["MinTTL" :content]))} (letvar345423 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar345423 ["SmoothStreaming" :content]))) (letvar345423 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar345423 ["FieldLevelEncryptionId" :content]))) (letvar345423 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar345423 ["Compress" :content]))) (letvar345423 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar345423 ["LambdaFunctionAssociations" :content]))) (letvar345423 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar345423 ["MaxTTL" :content]))) (letvar345423 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar345423 ["AllowedMethods" :content]))) (letvar345423 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar345423 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar345531 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar345531 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar345531 ["Quantity" :content]))} (letvar345531 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar345531 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar345639 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? nil :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? nil :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? nil :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar345639 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar345639 ["DomainName" :content]))} (letvar345639 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar345639 ["OriginPath" :content]))) (letvar345639 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar345639 ["CustomHeaders" :content]))) (letvar345639 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar345639 ["S3OriginConfig" :content]))) (letvar345639 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar345639 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-format [input] (clojure.core/get {"URLEncoded" :url-encoded} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar345754 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar345754 ["Quantity" :content]))} (letvar345754 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar345754 ["Items" :content]))))))

(clojure.core/defn- deser-origin-group-member [input] (clojure.core/let [letvar345862 {"OriginId" (portkey.aws/search-for-tag input "OriginId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-id (deserstring (clojure.core/get-in letvar345862 ["OriginId" :content]))})))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar345970 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar345970 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar345970 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar345970 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar345970 ["Quantity" :content]))} (letvar345970 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar345970 ["NextMarker" :content]))) (letvar345970 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar345970 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar346078 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar346078 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar346078 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar346186 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar346186 ["Quantity" :content]))} (letvar346186 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar346186 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-content-type-profiles [input] (clojure.core/let [letvar346299 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar346299 ["Quantity" :content]))} (letvar346299 "Items") (clojure.core/assoc :items (deser-content-type-profile-list (clojure.core/get-in letvar346299 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entity [input] (clojure.core/let [letvar346407 {"PublicKeyId" (portkey.aws/search-for-tag input "PublicKeyId" :flattened? nil :xmlAttribute? nil), "ProviderId" (portkey.aws/search-for-tag input "ProviderId" :flattened? nil :xmlAttribute? nil), "FieldPatterns" (portkey.aws/search-for-tag input "FieldPatterns" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:public-key-id (deserstring (clojure.core/get-in letvar346407 ["PublicKeyId" :content])), :provider-id (deserstring (clojure.core/get-in letvar346407 ["ProviderId" :content])), :field-patterns (deser-field-patterns (clojure.core/get-in letvar346407 ["FieldPatterns" :content]))})))

(clojure.core/defn- deser-lambda-function-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar346520 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar346520 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar346520 ["Items" :content]))} (letvar346520 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar346520 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar346633 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? nil :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? nil :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? nil :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? nil :xmlAttribute? nil), "OriginReadTimeout" (portkey.aws/search-for-tag input "OriginReadTimeout" :flattened? nil :xmlAttribute? nil), "OriginKeepaliveTimeout" (portkey.aws/search-for-tag input "OriginKeepaliveTimeout" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar346633 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar346633 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar346633 ["OriginProtocolPolicy" :content]))} (letvar346633 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar346633 ["OriginSslProtocols" :content]))) (letvar346633 "OriginReadTimeout") (clojure.core/assoc :origin-read-timeout (deserinteger (clojure.core/get-in letvar346633 ["OriginReadTimeout" :content]))) (letvar346633 "OriginKeepaliveTimeout") (clojure.core/assoc :origin-keepalive-timeout (deserinteger (clojure.core/get-in letvar346633 ["OriginKeepaliveTimeout" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar346741 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar346741 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar346741 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar346849 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar346849 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar346849 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar346849 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar346849 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar346849 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar346849 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar346849 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar346849 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar346849 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar346849 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar346849 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar346957 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar346957 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar346957 ["S3CanonicalUserId" :content]))} (letvar346957 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar346957 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-level-encryption [input] (clojure.core/let [letvar347082 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar347082 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar347082 ["LastModifiedTime" :content])), :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar347082 ["FieldLevelEncryptionConfig" :content]))})))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar347207 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar347207 ["Quantity" :content]))} (letvar347207 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar347207 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar347315 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar347315 ["Quantity" :content]))} (letvar347315 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar347315 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar347423 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar347423 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar347423 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar347423 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar347423 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar347423 ["Enabled" :content]))} (letvar347423 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar347423 ["DefaultRootObject" :content]))) (letvar347423 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar347423 ["IsIPV6Enabled" :content]))) (letvar347423 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar347423 ["Restrictions" :content]))) (letvar347423 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar347423 ["WebACLId" :content]))) (letvar347423 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar347423 ["Logging" :content]))) (letvar347423 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar347423 ["CacheBehaviors" :content]))) (letvar347423 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar347423 ["CustomErrorResponses" :content]))) (letvar347423 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar347423 ["Aliases" :content]))) (letvar347423 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar347423 ["PriceClass" :content]))) (letvar347423 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar347423 ["HttpVersion" :content]))) (letvar347423 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar347423 ["OriginGroups" :content]))) (letvar347423 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar347423 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-public-key-summary [input] (clojure.core/let [letvar347531 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar347531 ["Id" :content])), :name (deserstring (clojure.core/get-in letvar347531 ["Name" :content])), :created-time (desertimestamp (clojure.core/get-in letvar347531 ["CreatedTime" :content])), :encoded-key (deserstring (clojure.core/get-in letvar347531 ["EncodedKey" :content]))} (letvar347531 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar347531 ["Comment" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-query-arg-profile-config [input] (clojure.core/let [letvar347717 {"ForwardWhenQueryArgProfileIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenQueryArgProfileIsUnknown" :flattened? nil :xmlAttribute? nil), "QueryArgProfiles" (portkey.aws/search-for-tag input "QueryArgProfiles" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-query-arg-profile-is-unknown (deserboolean (clojure.core/get-in letvar347717 ["ForwardWhenQueryArgProfileIsUnknown" :content]))} (letvar347717 "QueryArgProfiles") (clojure.core/assoc :query-arg-profiles (deser-query-arg-profiles (clojure.core/get-in letvar347717 ["QueryArgProfiles" :content]))))))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-query-arg-profiles [input] (clojure.core/let [letvar347847 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar347847 ["Quantity" :content]))} (letvar347847 "Items") (clojure.core/assoc :items (deser-query-arg-profile-list (clojure.core/get-in letvar347847 ["Items" :content]))))))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-status-code-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserinteger coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-status-codes [input] (clojure.core/let [letvar347994 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar347994 ["Quantity" :content])), :items (deser-status-code-list (clojure.core/get-in letvar347994 ["Items" :content]))})))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar348102 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar348102 ["Quantity" :content]))} (letvar348102 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar348102 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-summary coll))) input))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar348229 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar348229 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar348229 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar348229 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar348354 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? nil :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar348354 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar348354 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar348462 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar348462 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar348462 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar348462 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar348462 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar348462 ["Enabled" :content]))} (letvar348462 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar348462 ["Aliases" :content]))) (letvar348462 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar348462 ["Logging" :content]))) (letvar348462 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar348462 ["PriceClass" :content]))))))

(clojure.core/defn- deser-origin-group-member-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-group-member coll))) input))

(clojure.core/defn- deser-public-key-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key-summary coll))) input))

(clojure.core/defn- deser-field-pattern-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar348621 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar348621 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar348746 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar348746 ["Key" :content]))} (letvar348746 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar348746 ["Value" :content]))))))

(clojure.core/defn- deser-origin-group [input] (clojure.core/let [letvar348854 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "FailoverCriteria" (portkey.aws/search-for-tag input "FailoverCriteria" :flattened? nil :xmlAttribute? nil), "Members" (portkey.aws/search-for-tag input "Members" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar348854 ["Id" :content])), :failover-criteria (deser-origin-group-failover-criteria (clojure.core/get-in letvar348854 ["FailoverCriteria" :content])), :members (deser-origin-group-members (clojure.core/get-in letvar348854 ["Members" :content]))})))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar348962 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar348962 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar348962 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar348962 ["Prefix" :content]))})))

(clojure.core/defn- deser-field-level-encryption-summary [input] (clojure.core/let [letvar349070 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? nil :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar349070 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar349070 ["LastModifiedTime" :content]))} (letvar349070 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar349070 ["Comment" :content]))) (letvar349070 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar349070 ["QueryArgProfileConfig" :content]))) (letvar349070 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar349070 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar349178 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar349178 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar349178 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar349178 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar349178 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar349178 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar349178 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar349178 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar349178 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar349178 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar349178 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar349178 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar349178 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar349178 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar349178 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar349178 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar349178 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar349178 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar349178 ["PriceClass" :content]))} (letvar349178 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar349178 ["OriginGroups" :content]))))))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar349308 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar349308 ["Quantity" :content]))} (letvar349308 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar349308 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1_2016" :tl-sv-1-2016, "TLSv1.1_2016" :tl-sv-11-2016, "TLSv1.2_2018" :tl-sv-12-2018} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar349421 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar349421 ["Quantity" :content])), :items (deser-origin-list (clojure.core/get-in letvar349421 ["Items" :content]))})))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar349546 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar349546 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar349546 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar349546 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar349546 ["Quantity" :content]))} (letvar349546 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar349546 ["NextMarker" :content]))) (letvar349546 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar349546 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar349664 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? nil :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar349664 ["Forward" :content]))} (letvar349664 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar349664 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar349772 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar349772 ["Quantity" :content]))} (letvar349772 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar349772 ["Items" :content]))))))

(clojure.core/defn- deser-origin-groups [input] (clojure.core/let [letvar349880 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar349880 ["Quantity" :content]))} (letvar349880 "Items") (clojure.core/assoc :items (deser-origin-group-list (clojure.core/get-in letvar349880 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/let [letvar350005 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar350005 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar350005 ["Quantity" :content]))} (letvar350005 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar350005 ["NextMarker" :content]))) (letvar350005 "Items") (clojure.core/assoc :items (deser-public-key-summary-list (clojure.core/get-in letvar350005 ["Items" :content]))))))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar350113 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar350113 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar350113 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar350113 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar350113 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar350113 ["MinTTL" :content]))} (letvar350113 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar350113 ["SmoothStreaming" :content]))) (letvar350113 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar350113 ["FieldLevelEncryptionId" :content]))) (letvar350113 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar350113 ["Compress" :content]))) (letvar350113 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar350113 ["LambdaFunctionAssociations" :content]))) (letvar350113 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar350113 ["MaxTTL" :content]))) (letvar350113 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar350113 ["AllowedMethods" :content]))) (letvar350113 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar350113 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar350221 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar350221 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar350221 ["Quantity" :content]))} (letvar350221 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar350221 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-list [input] (clojure.core/let [letvar350329 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar350329 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar350329 ["Quantity" :content]))} (letvar350329 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar350329 ["NextMarker" :content]))) (letvar350329 "Items") (clojure.core/assoc :items (deser-field-level-encryption-summary-list (clojure.core/get-in letvar350329 ["Items" :content]))))))

(clojure.core/defn- deser-public-key [input] (clojure.core/let [letvar350437 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "PublicKeyConfig" (portkey.aws/search-for-tag input "PublicKeyConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar350437 ["Id" :content])), :created-time (desertimestamp (clojure.core/get-in letvar350437 ["CreatedTime" :content])), :public-key-config (deser-public-key-config (clojure.core/get-in letvar350437 ["PublicKeyConfig" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-profile-summary coll))) input))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar350562 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? nil :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? nil :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? nil :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? nil :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? nil :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? nil :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar350562 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar350562 ["CloudFrontDefaultCertificate" :content]))) (letvar350562 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar350562 ["IAMCertificateId" :content]))) (letvar350562 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar350562 ["ACMCertificateArn" :content]))) (letvar350562 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar350562 ["SSLSupportMethod" :content]))) (letvar350562 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar350562 ["MinimumProtocolVersion" :content]))) (letvar350562 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar350562 ["Certificate" :content]))) (letvar350562 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar350562 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar350670 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar350670 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar350670 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar350778 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar350778 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar350778 ["Quantity" :content]))} (letvar350778 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar350778 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper350780 input] (clojure.core/let [rawinput350779 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350781 {"Tags" (portkey.aws/search-for-tag rawinput350779 "Tags" :flattened? nil :result-wrapper resultWrapper350780)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar350781 ["Tags" :content]))}))))

(clojure.core/defn- response-too-many-distributions-with-lambda-associations ([input] (response-too-many-distributions-with-lambda-associations nil input)) ([resultWrapper350783 input] (clojure.core/let [rawinput350782 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350784 {"Message" (portkey.aws/search-for-tag rawinput350782 "Message" :flattened? nil :result-wrapper resultWrapper350783)}] (clojure.core/cond-> {} (letvar350784 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350784 ["Message" :content])))))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper350786 input] (clojure.core/let [rawinput350785 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350787 {"Message" (portkey.aws/search-for-tag rawinput350785 "Message" :flattened? nil :result-wrapper resultWrapper350786)}] (clojure.core/cond-> {} (letvar350787 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350787 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper350789 input] (clojure.core/let [rawinput350788 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350790 {"Message" (portkey.aws/search-for-tag rawinput350788 "Message" :flattened? nil :result-wrapper resultWrapper350789)}] (clojure.core/cond-> {} (letvar350790 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350790 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper350792 input] (clojure.core/let [rawinput350791 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350793 {"Message" (portkey.aws/search-for-tag rawinput350791 "Message" :flattened? nil :result-wrapper resultWrapper350792)}] (clojure.core/cond-> {} (letvar350793 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350793 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper350795 input] (clojure.core/let [rawinput350794 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350796 {"Message" (portkey.aws/search-for-tag rawinput350794 "Message" :flattened? nil :result-wrapper resultWrapper350795)}] (clojure.core/cond-> {} (letvar350796 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350796 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper350798 input] (clojure.core/let [rawinput350797 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350799 {"Message" (portkey.aws/search-for-tag rawinput350797 "Message" :flattened? nil :result-wrapper resultWrapper350798)}] (clojure.core/cond-> {} (letvar350799 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350799 ["Message" :content])))))))

(clojure.core/defn- response-create-field-level-encryption-config-result ([input] (response-create-field-level-encryption-config-result nil input)) ([resultWrapper350801 input] (clojure.core/let [rawinput350800 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350802 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput350800 "FieldLevelEncryption" :flattened? nil :result-wrapper resultWrapper350801), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350802 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar350802 ["FieldLevelEncryption" :content]))) (letvar350802 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar350802 ["Location"]))) (letvar350802 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350802 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper350804 input] (clojure.core/let [rawinput350803 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350805 {"Message" (portkey.aws/search-for-tag rawinput350803 "Message" :flattened? nil :result-wrapper resultWrapper350804)}] (clojure.core/cond-> {} (letvar350805 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350805 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper350807 input] (clojure.core/let [rawinput350806 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350808 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput350806 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper350807), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350808 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar350808 ["StreamingDistribution" :content]))) (letvar350808 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350808 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper350810 input] (clojure.core/let [rawinput350809 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350811 {"Message" (portkey.aws/search-for-tag rawinput350809 "Message" :flattened? nil :result-wrapper resultWrapper350810)}] (clojure.core/cond-> {} (letvar350811 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350811 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-already-exists ([input] (response-field-level-encryption-profile-already-exists nil input)) ([resultWrapper350813 input] (clojure.core/let [rawinput350812 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350814 {"Message" (portkey.aws/search-for-tag rawinput350812 "Message" :flattened? nil :result-wrapper resultWrapper350813)}] (clojure.core/cond-> {} (letvar350814 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350814 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper350816 input] (clojure.core/let [rawinput350815 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350817 {"Message" (portkey.aws/search-for-tag rawinput350815 "Message" :flattened? nil :result-wrapper resultWrapper350816)}] (clojure.core/cond-> {} (letvar350817 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350817 ["Message" :content])))))))

(clojure.core/defn- response-get-public-key-config-result ([input] (response-get-public-key-config-result nil input)) ([resultWrapper350819 input] (clojure.core/let [rawinput350818 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350820 {"PublicKeyConfig" (portkey.aws/search-for-tag rawinput350818 "PublicKeyConfig" :flattened? nil :result-wrapper resultWrapper350819), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350820 "PublicKeyConfig") (clojure.core/assoc :public-key-config (deser-public-key-config (clojure.core/get-in letvar350820 ["PublicKeyConfig" :content]))) (letvar350820 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350820 ["ETag"])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper350822 input] (clojure.core/let [rawinput350821 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350823 {"Message" (portkey.aws/search-for-tag rawinput350821 "Message" :flattened? nil :result-wrapper resultWrapper350822)}] (clojure.core/cond-> {} (letvar350823 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350823 ["Message" :content])))))))

(clojure.core/defn- response-no-such-public-key ([input] (response-no-such-public-key nil input)) ([resultWrapper350825 input] (clojure.core/let [rawinput350824 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350826 {"Message" (portkey.aws/search-for-tag rawinput350824 "Message" :flattened? nil :result-wrapper resultWrapper350825)}] (clojure.core/cond-> {} (letvar350826 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350826 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper350828 input] (clojure.core/let [rawinput350827 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350829 {"Message" (portkey.aws/search-for-tag rawinput350827 "Message" :flattened? nil :result-wrapper resultWrapper350828)}] (clojure.core/cond-> {} (letvar350829 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350829 ["Message" :content])))))))

(clojure.core/defn- response-illegal-field-level-encryption-config-association-with-cache-behavior ([input] (response-illegal-field-level-encryption-config-association-with-cache-behavior nil input)) ([resultWrapper350831 input] (clojure.core/let [rawinput350830 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350832 {"Message" (portkey.aws/search-for-tag rawinput350830 "Message" :flattened? nil :result-wrapper resultWrapper350831)}] (clojure.core/cond-> {} (letvar350832 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350832 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper350834 input] (clojure.core/let [rawinput350833 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350835 {"Message" (portkey.aws/search-for-tag rawinput350833 "Message" :flattened? nil :result-wrapper resultWrapper350834)}] (clojure.core/cond-> {} (letvar350835 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350835 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper350837 input] (clojure.core/let [rawinput350836 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350838 {"Message" (portkey.aws/search-for-tag rawinput350836 "Message" :flattened? nil :result-wrapper resultWrapper350837)}] (clojure.core/cond-> {} (letvar350838 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350838 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper350840 input] (clojure.core/let [rawinput350839 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350841 {"Message" (portkey.aws/search-for-tag rawinput350839 "Message" :flattened? nil :result-wrapper resultWrapper350840)}] (clojure.core/cond-> {} (letvar350841 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350841 ["Message" :content])))))))

(clojure.core/defn- response-cannot-change-immutable-public-key-fields ([input] (response-cannot-change-immutable-public-key-fields nil input)) ([resultWrapper350843 input] (clojure.core/let [rawinput350842 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350844 {"Message" (portkey.aws/search-for-tag rawinput350842 "Message" :flattened? nil :result-wrapper resultWrapper350843)}] (clojure.core/cond-> {} (letvar350844 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350844 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-size-exceeded ([input] (response-field-level-encryption-profile-size-exceeded nil input)) ([resultWrapper350846 input] (clojure.core/let [rawinput350845 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350847 {"Message" (portkey.aws/search-for-tag rawinput350845 "Message" :flattened? nil :result-wrapper resultWrapper350846)}] (clojure.core/cond-> {} (letvar350847 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350847 ["Message" :content])))))))

(clojure.core/defn- response-invalid-lambda-function-association ([input] (response-invalid-lambda-function-association nil input)) ([resultWrapper350849 input] (clojure.core/let [rawinput350848 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350850 {"Message" (portkey.aws/search-for-tag rawinput350848 "Message" :flattened? nil :result-wrapper resultWrapper350849)}] (clojure.core/cond-> {} (letvar350850 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350850 ["Message" :content])))))))

(clojure.core/defn- response-create-field-level-encryption-profile-result ([input] (response-create-field-level-encryption-profile-result nil input)) ([resultWrapper350852 input] (clojure.core/let [rawinput350851 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350853 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput350851 "FieldLevelEncryptionProfile" :flattened? nil :result-wrapper resultWrapper350852), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350853 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar350853 ["FieldLevelEncryptionProfile" :content]))) (letvar350853 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar350853 ["Location"]))) (letvar350853 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350853 ["ETag"])))))))

(clojure.core/defn- response-get-field-level-encryption-profile-result ([input] (response-get-field-level-encryption-profile-result nil input)) ([resultWrapper350855 input] (clojure.core/let [rawinput350854 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350856 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput350854 "FieldLevelEncryptionProfile" :flattened? nil :result-wrapper resultWrapper350855), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350856 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar350856 ["FieldLevelEncryptionProfile" :content]))) (letvar350856 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350856 ["ETag"])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper350858 input] (clojure.core/let [rawinput350857 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350859 {"Message" (portkey.aws/search-for-tag rawinput350857 "Message" :flattened? nil :result-wrapper resultWrapper350858)}] (clojure.core/cond-> {} (letvar350859 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350859 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper350861 input] (clojure.core/let [rawinput350860 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350862 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput350860 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper350861), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350862 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar350862 ["CloudFrontOriginAccessIdentity" :content]))) (letvar350862 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350862 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper350864 input] (clojure.core/let [rawinput350863 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350865 {"Message" (portkey.aws/search-for-tag rawinput350863 "Message" :flattened? nil :result-wrapper resultWrapper350864)}] (clojure.core/cond-> {} (letvar350865 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350865 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-in-use ([input] (response-field-level-encryption-profile-in-use nil input)) ([resultWrapper350867 input] (clojure.core/let [rawinput350866 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350868 {"Message" (portkey.aws/search-for-tag rawinput350866 "Message" :flattened? nil :result-wrapper resultWrapper350867)}] (clojure.core/cond-> {} (letvar350868 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350868 ["Message" :content])))))))

(clojure.core/defn- response-too-many-lambda-function-associations ([input] (response-too-many-lambda-function-associations nil input)) ([resultWrapper350870 input] (clojure.core/let [rawinput350869 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350871 {"Message" (portkey.aws/search-for-tag rawinput350869 "Message" :flattened? nil :result-wrapper resultWrapper350870)}] (clojure.core/cond-> {} (letvar350871 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350871 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper350873 input] (clojure.core/let [rawinput350872 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350874 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput350872 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper350873), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350874 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar350874 ["StreamingDistribution" :content]))) (letvar350874 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar350874 ["Location"]))) (letvar350874 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350874 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-profiles ([input] (response-too-many-field-level-encryption-profiles nil input)) ([resultWrapper350876 input] (clojure.core/let [rawinput350875 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350877 {"Message" (portkey.aws/search-for-tag rawinput350875 "Message" :flattened? nil :result-wrapper resultWrapper350876)}] (clojure.core/cond-> {} (letvar350877 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350877 ["Message" :content])))))))

(clojure.core/defn- response-no-such-field-level-encryption-profile ([input] (response-no-such-field-level-encryption-profile nil input)) ([resultWrapper350879 input] (clojure.core/let [rawinput350878 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350880 {"Message" (portkey.aws/search-for-tag rawinput350878 "Message" :flattened? nil :result-wrapper resultWrapper350879)}] (clojure.core/cond-> {} (letvar350880 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350880 ["Message" :content])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper350882 input] (clojure.core/let [rawinput350881 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350883 {"Message" (portkey.aws/search-for-tag rawinput350881 "Message" :flattened? nil :result-wrapper resultWrapper350882)}] (clojure.core/cond-> {} (letvar350883 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350883 ["Message" :content])))))))

(clojure.core/defn- response-create-public-key-result ([input] (response-create-public-key-result nil input)) ([resultWrapper350885 input] (clojure.core/let [rawinput350884 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350886 {"PublicKey" (portkey.aws/search-for-tag rawinput350884 "PublicKey" :flattened? nil :result-wrapper resultWrapper350885), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350886 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar350886 ["PublicKey" :content]))) (letvar350886 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar350886 ["Location"]))) (letvar350886 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350886 ["ETag"])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper350888 input] (clojure.core/let [rawinput350887 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350889 {"Message" (portkey.aws/search-for-tag rawinput350887 "Message" :flattened? nil :result-wrapper resultWrapper350888)}] (clojure.core/cond-> {} (letvar350889 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350889 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper350891 input] (clojure.core/let [rawinput350890 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350892 {"Message" (portkey.aws/search-for-tag rawinput350890 "Message" :flattened? nil :result-wrapper resultWrapper350891)}] (clojure.core/cond-> {} (letvar350892 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350892 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper350894 input] (clojure.core/let [rawinput350893 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350895 {"Message" (portkey.aws/search-for-tag rawinput350893 "Message" :flattened? nil :result-wrapper resultWrapper350894)}] (clojure.core/cond-> {} (letvar350895 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350895 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper350897 input] (clojure.core/let [rawinput350896 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350898 {"Message" (portkey.aws/search-for-tag rawinput350896 "Message" :flattened? nil :result-wrapper resultWrapper350897)}] (clojure.core/cond-> {} (letvar350898 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350898 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-config-already-exists ([input] (response-field-level-encryption-config-already-exists nil input)) ([resultWrapper350900 input] (clojure.core/let [rawinput350899 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350901 {"Message" (portkey.aws/search-for-tag rawinput350899 "Message" :flattened? nil :result-wrapper resultWrapper350900)}] (clojure.core/cond-> {} (letvar350901 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350901 ["Message" :content])))))))

(clojure.core/defn- response-no-such-field-level-encryption-config ([input] (response-no-such-field-level-encryption-config nil input)) ([resultWrapper350903 input] (clojure.core/let [rawinput350902 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350904 {"Message" (portkey.aws/search-for-tag rawinput350902 "Message" :flattened? nil :result-wrapper resultWrapper350903)}] (clojure.core/cond-> {} (letvar350904 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350904 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper350906 input] (clojure.core/let [rawinput350905 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350907 {"Distribution" (portkey.aws/search-for-tag rawinput350905 "Distribution" :flattened? nil :result-wrapper resultWrapper350906), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350907 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar350907 ["Distribution" :content]))) (letvar350907 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350907 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper350909 input] (clojure.core/let [rawinput350908 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350910 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput350908 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper350909), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350910 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar350910 ["CloudFrontOriginAccessIdentity" :content]))) (letvar350910 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350910 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-encryption-entities ([input] (response-too-many-field-level-encryption-encryption-entities nil input)) ([resultWrapper350912 input] (clojure.core/let [rawinput350911 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350913 {"Message" (portkey.aws/search-for-tag rawinput350911 "Message" :flattened? nil :result-wrapper resultWrapper350912)}] (clojure.core/cond-> {} (letvar350913 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350913 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-result ([input] (response-get-field-level-encryption-result nil input)) ([resultWrapper350915 input] (clojure.core/let [rawinput350914 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350916 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput350914 "FieldLevelEncryption" :flattened? nil :result-wrapper resultWrapper350915), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350916 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar350916 ["FieldLevelEncryption" :content]))) (letvar350916 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350916 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper350918 input] (clojure.core/let [rawinput350917 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350919 {"Message" (portkey.aws/search-for-tag rawinput350917 "Message" :flattened? nil :result-wrapper resultWrapper350918)}] (clojure.core/cond-> {} (letvar350919 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350919 ["Message" :content])))))))

(clojure.core/defn- response-public-key-already-exists ([input] (response-public-key-already-exists nil input)) ([resultWrapper350921 input] (clojure.core/let [rawinput350920 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350922 {"Message" (portkey.aws/search-for-tag rawinput350920 "Message" :flattened? nil :result-wrapper resultWrapper350921)}] (clojure.core/cond-> {} (letvar350922 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350922 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper350924 input] (clojure.core/let [rawinput350923 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350925 {"Message" (portkey.aws/search-for-tag rawinput350923 "Message" :flattened? nil :result-wrapper resultWrapper350924)}] (clojure.core/cond-> {} (letvar350925 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350925 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper350927 input] (clojure.core/let [rawinput350926 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350928 {"Message" (portkey.aws/search-for-tag rawinput350926 "Message" :flattened? nil :result-wrapper resultWrapper350927)}] (clojure.core/cond-> {} (letvar350928 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350928 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper350930 input] (clojure.core/let [rawinput350929 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350931 {"Message" (portkey.aws/search-for-tag rawinput350929 "Message" :flattened? nil :result-wrapper resultWrapper350930)}] (clojure.core/cond-> {} (letvar350931 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350931 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper350933 input] (clojure.core/let [rawinput350932 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350934 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput350932 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper350933), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350934 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar350934 ["CloudFrontOriginAccessIdentity" :content]))) (letvar350934 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar350934 ["Location"]))) (letvar350934 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350934 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper350936 input] (clojure.core/let [rawinput350935 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350937 {"Message" (portkey.aws/search-for-tag rawinput350935 "Message" :flattened? nil :result-wrapper resultWrapper350936)}] (clojure.core/cond-> {} (letvar350937 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350937 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper350939 input] (clojure.core/let [rawinput350938 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350940 {"Message" (portkey.aws/search-for-tag rawinput350938 "Message" :flattened? nil :result-wrapper resultWrapper350939)}] (clojure.core/cond-> {} (letvar350940 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350940 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper350942 input] (clojure.core/let [rawinput350941 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350943 {"Message" (portkey.aws/search-for-tag rawinput350941 "Message" :flattened? nil :result-wrapper resultWrapper350942)}] (clojure.core/cond-> {} (letvar350943 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350943 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper350945 input] (clojure.core/let [rawinput350944 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350946 {"Message" (portkey.aws/search-for-tag rawinput350944 "Message" :flattened? nil :result-wrapper resultWrapper350945)}] (clojure.core/cond-> {} (letvar350946 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350946 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper350948 input] (clojure.core/let [rawinput350947 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350949 {"Message" (portkey.aws/search-for-tag rawinput350947 "Message" :flattened? nil :result-wrapper resultWrapper350948)}] (clojure.core/cond-> {} (letvar350949 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350949 ["Message" :content])))))))

(clojure.core/defn- response-get-public-key-result ([input] (response-get-public-key-result nil input)) ([resultWrapper350951 input] (clojure.core/let [rawinput350950 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350952 {"PublicKey" (portkey.aws/search-for-tag rawinput350950 "PublicKey" :flattened? nil :result-wrapper resultWrapper350951), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350952 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar350952 ["PublicKey" :content]))) (letvar350952 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350952 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions-associated-to-field-level-encryption-config ([input] (response-too-many-distributions-associated-to-field-level-encryption-config nil input)) ([resultWrapper350954 input] (clojure.core/let [rawinput350953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350955 {"Message" (portkey.aws/search-for-tag rawinput350953 "Message" :flattened? nil :result-wrapper resultWrapper350954)}] (clojure.core/cond-> {} (letvar350955 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350955 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper350957 input] (clojure.core/let [rawinput350956 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350958 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput350956 "CloudFrontOriginAccessIdentityList" :flattened? nil :result-wrapper resultWrapper350957)}] (clojure.core/cond-> {} (letvar350958 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar350958 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-update-public-key-result ([input] (response-update-public-key-result nil input)) ([resultWrapper350960 input] (clojure.core/let [rawinput350959 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350961 {"PublicKey" (portkey.aws/search-for-tag rawinput350959 "PublicKey" :flattened? nil :result-wrapper resultWrapper350960), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350961 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar350961 ["PublicKey" :content]))) (letvar350961 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350961 ["ETag"])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper350963 input] (clojure.core/let [rawinput350962 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350964 {"Message" (portkey.aws/search-for-tag rawinput350962 "Message" :flattened? nil :result-wrapper resultWrapper350963)}] (clojure.core/cond-> {} (letvar350964 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350964 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper350966 input] (clojure.core/let [rawinput350965 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350967 {"DistributionConfig" (portkey.aws/search-for-tag rawinput350965 "DistributionConfig" :flattened? nil :result-wrapper resultWrapper350966), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350967 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar350967 ["DistributionConfig" :content]))) (letvar350967 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350967 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper350969 input] (clojure.core/let [rawinput350968 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350970 {"Message" (portkey.aws/search-for-tag rawinput350968 "Message" :flattened? nil :result-wrapper resultWrapper350969)}] (clojure.core/cond-> {} (letvar350970 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350970 ["Message" :content])))))))

(clojure.core/defn- response-update-field-level-encryption-config-result ([input] (response-update-field-level-encryption-config-result nil input)) ([resultWrapper350972 input] (clojure.core/let [rawinput350971 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350973 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput350971 "FieldLevelEncryption" :flattened? nil :result-wrapper resultWrapper350972), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350973 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar350973 ["FieldLevelEncryption" :content]))) (letvar350973 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350973 ["ETag"])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper350975 input] (clojure.core/let [rawinput350974 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350976 {"Distribution" (portkey.aws/search-for-tag rawinput350974 "Distribution" :flattened? nil :result-wrapper resultWrapper350975), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350976 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar350976 ["Distribution" :content]))) (letvar350976 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350976 ["ETag"])))))))

(clojure.core/defn- response-update-field-level-encryption-profile-result ([input] (response-update-field-level-encryption-profile-result nil input)) ([resultWrapper350978 input] (clojure.core/let [rawinput350977 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350979 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput350977 "FieldLevelEncryptionProfile" :flattened? nil :result-wrapper resultWrapper350978), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350979 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar350979 ["FieldLevelEncryptionProfile" :content]))) (letvar350979 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350979 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper350981 input] (clojure.core/let [rawinput350980 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350982 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput350980 "StreamingDistributionConfig" :flattened? nil :result-wrapper resultWrapper350981), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350982 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar350982 ["StreamingDistributionConfig" :content]))) (letvar350982 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350982 ["ETag"])))))))

(clojure.core/defn- response-too-many-origin-groups-per-distribution ([input] (response-too-many-origin-groups-per-distribution nil input)) ([resultWrapper350984 input] (clojure.core/let [rawinput350983 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350985 {"Message" (portkey.aws/search-for-tag rawinput350983 "Message" :flattened? nil :result-wrapper resultWrapper350984)}] (clojure.core/cond-> {} (letvar350985 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350985 ["Message" :content])))))))

(clojure.core/defn- response-list-public-keys-result ([input] (response-list-public-keys-result nil input)) ([resultWrapper350987 input] (clojure.core/let [rawinput350986 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350988 {"PublicKeyList" (portkey.aws/search-for-tag rawinput350986 "PublicKeyList" :flattened? nil :result-wrapper resultWrapper350987)}] (clojure.core/cond-> {} (letvar350988 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar350988 ["PublicKeyList" :content])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper350990 input] (clojure.core/let [rawinput350989 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350991 {"Message" (portkey.aws/search-for-tag rawinput350989 "Message" :flattened? nil :result-wrapper resultWrapper350990)}] (clojure.core/cond-> {} (letvar350991 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350991 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-config-result ([input] (response-get-field-level-encryption-config-result nil input)) ([resultWrapper350993 input] (clojure.core/let [rawinput350992 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350994 {"FieldLevelEncryptionConfig" (portkey.aws/search-for-tag rawinput350992 "FieldLevelEncryptionConfig" :flattened? nil :result-wrapper resultWrapper350993), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar350994 "FieldLevelEncryptionConfig") (clojure.core/assoc :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar350994 ["FieldLevelEncryptionConfig" :content]))) (letvar350994 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar350994 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-configs ([input] (response-too-many-field-level-encryption-configs nil input)) ([resultWrapper350996 input] (clojure.core/let [rawinput350995 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar350997 {"Message" (portkey.aws/search-for-tag rawinput350995 "Message" :flattened? nil :result-wrapper resultWrapper350996)}] (clojure.core/cond-> {} (letvar350997 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar350997 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-config-in-use ([input] (response-field-level-encryption-config-in-use nil input)) ([resultWrapper350999 input] (clojure.core/let [rawinput350998 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351000 {"Message" (portkey.aws/search-for-tag rawinput350998 "Message" :flattened? nil :result-wrapper resultWrapper350999)}] (clojure.core/cond-> {} (letvar351000 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351000 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper351002 input] (clojure.core/let [rawinput351001 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351003 {"Message" (portkey.aws/search-for-tag rawinput351001 "Message" :flattened? nil :result-wrapper resultWrapper351002)}] (clojure.core/cond-> {} (letvar351003 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351003 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper351005 input] (clojure.core/let [rawinput351004 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351006 {"Message" (portkey.aws/search-for-tag rawinput351004 "Message" :flattened? nil :result-wrapper resultWrapper351005)}] (clojure.core/cond-> {} (letvar351006 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351006 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper351008 input] (clojure.core/let [rawinput351007 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351009 {"Message" (portkey.aws/search-for-tag rawinput351007 "Message" :flattened? nil :result-wrapper resultWrapper351008)}] (clojure.core/cond-> {} (letvar351009 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351009 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper351011 input] (clojure.core/let [rawinput351010 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351012 {"InvalidationList" (portkey.aws/search-for-tag rawinput351010 "InvalidationList" :flattened? nil :result-wrapper resultWrapper351011)}] (clojure.core/cond-> {} (letvar351012 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar351012 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper351014 input] (clojure.core/let [rawinput351013 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351015 {"Message" (portkey.aws/search-for-tag rawinput351013 "Message" :flattened? nil :result-wrapper resultWrapper351014)}] (clojure.core/cond-> {} (letvar351015 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351015 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper351017 input] (clojure.core/let [rawinput351016 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351018 {"Distribution" (portkey.aws/search-for-tag rawinput351016 "Distribution" :flattened? nil :result-wrapper resultWrapper351017), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar351018 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar351018 ["Distribution" :content]))) (letvar351018 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar351018 ["Location"]))) (letvar351018 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar351018 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-query-arg-profiles ([input] (response-too-many-field-level-encryption-query-arg-profiles nil input)) ([resultWrapper351020 input] (clojure.core/let [rawinput351019 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351021 {"Message" (portkey.aws/search-for-tag rawinput351019 "Message" :flattened? nil :result-wrapper resultWrapper351020)}] (clojure.core/cond-> {} (letvar351021 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351021 ["Message" :content])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper351023 input] (clojure.core/let [rawinput351022 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351024 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput351022 "StreamingDistributionList" :flattened? nil :result-wrapper resultWrapper351023)}] (clojure.core/cond-> {} (letvar351024 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar351024 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper351026 input] (clojure.core/let [rawinput351025 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351027 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput351025 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper351026), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar351027 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar351027 ["StreamingDistribution" :content]))) (letvar351027 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar351027 ["Location"]))) (letvar351027 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar351027 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper351029 input] (clojure.core/let [rawinput351028 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351030 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput351028 "Invalidation" :flattened? nil :result-wrapper resultWrapper351029)}] (clojure.core/cond-> {} (letvar351030 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar351030 ["Location"]))) (letvar351030 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar351030 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper351032 input] (clojure.core/let [rawinput351031 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351033 {"Message" (portkey.aws/search-for-tag rawinput351031 "Message" :flattened? nil :result-wrapper resultWrapper351032)}] (clojure.core/cond-> {} (letvar351033 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351033 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-read-timeout ([input] (response-invalid-origin-read-timeout nil input)) ([resultWrapper351035 input] (clojure.core/let [rawinput351034 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351036 {"Message" (portkey.aws/search-for-tag rawinput351034 "Message" :flattened? nil :result-wrapper resultWrapper351035)}] (clojure.core/cond-> {} (letvar351036 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351036 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper351038 input] (clojure.core/let [rawinput351037 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351039 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput351037 "CloudFrontOriginAccessIdentityConfig" :flattened? nil :result-wrapper resultWrapper351038), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar351039 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar351039 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar351039 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar351039 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper351041 input] (clojure.core/let [rawinput351040 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351042 {"Message" (portkey.aws/search-for-tag rawinput351040 "Message" :flattened? nil :result-wrapper resultWrapper351041)}] (clojure.core/cond-> {} (letvar351042 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351042 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper351044 input] (clojure.core/let [rawinput351043 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351045 {"Message" (portkey.aws/search-for-tag rawinput351043 "Message" :flattened? nil :result-wrapper resultWrapper351044)}] (clojure.core/cond-> {} (letvar351045 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351045 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper351047 input] (clojure.core/let [rawinput351046 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351048 {"Message" (portkey.aws/search-for-tag rawinput351046 "Message" :flattened? nil :result-wrapper resultWrapper351047)}] (clojure.core/cond-> {} (letvar351048 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351048 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper351050 input] (clojure.core/let [rawinput351049 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351051 {"Message" (portkey.aws/search-for-tag rawinput351049 "Message" :flattened? nil :result-wrapper resultWrapper351050)}] (clojure.core/cond-> {} (letvar351051 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351051 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper351053 input] (clojure.core/let [rawinput351052 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351054 {"Message" (portkey.aws/search-for-tag rawinput351052 "Message" :flattened? nil :result-wrapper resultWrapper351053)}] (clojure.core/cond-> {} (letvar351054 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351054 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper351056 input] (clojure.core/let [rawinput351055 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351057 {"Message" (portkey.aws/search-for-tag rawinput351055 "Message" :flattened? nil :result-wrapper resultWrapper351056)}] (clojure.core/cond-> {} (letvar351057 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351057 ["Message" :content])))))))

(clojure.core/defn- response-too-many-public-keys ([input] (response-too-many-public-keys nil input)) ([resultWrapper351059 input] (clojure.core/let [rawinput351058 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351060 {"Message" (portkey.aws/search-for-tag rawinput351058 "Message" :flattened? nil :result-wrapper resultWrapper351059)}] (clojure.core/cond-> {} (letvar351060 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351060 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper351062 input] (clojure.core/let [rawinput351061 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351063 {"Message" (portkey.aws/search-for-tag rawinput351061 "Message" :flattened? nil :result-wrapper resultWrapper351062)}] (clojure.core/cond-> {} (letvar351063 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351063 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper351065 input] (clojure.core/let [rawinput351064 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351066 {"Message" (portkey.aws/search-for-tag rawinput351064 "Message" :flattened? nil :result-wrapper resultWrapper351065)}] (clojure.core/cond-> {} (letvar351066 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351066 ["Message" :content])))))))

(clojure.core/defn- response-public-key-in-use ([input] (response-public-key-in-use nil input)) ([resultWrapper351068 input] (clojure.core/let [rawinput351067 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351069 {"Message" (portkey.aws/search-for-tag rawinput351067 "Message" :flattened? nil :result-wrapper resultWrapper351068)}] (clojure.core/cond-> {} (letvar351069 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351069 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper351071 input] (clojure.core/let [rawinput351070 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351072 {"Message" (portkey.aws/search-for-tag rawinput351070 "Message" :flattened? nil :result-wrapper resultWrapper351071)}] (clojure.core/cond-> {} (letvar351072 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351072 ["Message" :content])))))))

(clojure.core/defn- response-list-field-level-encryption-profiles-result ([input] (response-list-field-level-encryption-profiles-result nil input)) ([resultWrapper351074 input] (clojure.core/let [rawinput351073 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351075 {"FieldLevelEncryptionProfileList" (portkey.aws/search-for-tag rawinput351073 "FieldLevelEncryptionProfileList" :flattened? nil :result-wrapper resultWrapper351074)}] (clojure.core/cond-> {} (letvar351075 "FieldLevelEncryptionProfileList") (clojure.core/assoc :field-level-encryption-profile-list (deser-field-level-encryption-profile-list (clojure.core/get-in letvar351075 ["FieldLevelEncryptionProfileList" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper351077 input] (clojure.core/let [rawinput351076 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351078 {"Distribution" (portkey.aws/search-for-tag rawinput351076 "Distribution" :flattened? nil :result-wrapper resultWrapper351077), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar351078 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar351078 ["Distribution" :content]))) (letvar351078 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar351078 ["Location"]))) (letvar351078 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar351078 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper351080 input] (clojure.core/let [rawinput351079 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351081 {"Message" (portkey.aws/search-for-tag rawinput351079 "Message" :flattened? nil :result-wrapper resultWrapper351080)}] (clojure.core/cond-> {} (letvar351081 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351081 ["Message" :content])))))))

(clojure.core/defn- response-list-field-level-encryption-configs-result ([input] (response-list-field-level-encryption-configs-result nil input)) ([resultWrapper351083 input] (clojure.core/let [rawinput351082 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351084 {"FieldLevelEncryptionList" (portkey.aws/search-for-tag rawinput351082 "FieldLevelEncryptionList" :flattened? nil :result-wrapper resultWrapper351083)}] (clojure.core/cond-> {} (letvar351084 "FieldLevelEncryptionList") (clojure.core/assoc :field-level-encryption-list (deser-field-level-encryption-list (clojure.core/get-in letvar351084 ["FieldLevelEncryptionList" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper351086 input] (clojure.core/let [rawinput351085 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351087 {"Message" (portkey.aws/search-for-tag rawinput351085 "Message" :flattened? nil :result-wrapper resultWrapper351086)}] (clojure.core/cond-> {} (letvar351087 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351087 ["Message" :content])))))))

(clojure.core/defn- response-query-arg-profile-empty ([input] (response-query-arg-profile-empty nil input)) ([resultWrapper351089 input] (clojure.core/let [rawinput351088 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351090 {"Message" (portkey.aws/search-for-tag rawinput351088 "Message" :flattened? nil :result-wrapper resultWrapper351089)}] (clojure.core/cond-> {} (letvar351090 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351090 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper351092 input] (clojure.core/let [rawinput351091 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351093 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput351091 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper351092), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar351093 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar351093 ["StreamingDistribution" :content]))) (letvar351093 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar351093 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper351095 input] (clojure.core/let [rawinput351094 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351096 {"Message" (portkey.aws/search-for-tag rawinput351094 "Message" :flattened? nil :result-wrapper resultWrapper351095)}] (clojure.core/cond-> {} (letvar351096 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351096 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-profile-config-result ([input] (response-get-field-level-encryption-profile-config-result nil input)) ([resultWrapper351098 input] (clojure.core/let [rawinput351097 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351099 {"FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag rawinput351097 "FieldLevelEncryptionProfileConfig" :flattened? nil :result-wrapper resultWrapper351098), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar351099 "FieldLevelEncryptionProfileConfig") (clojure.core/assoc :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar351099 ["FieldLevelEncryptionProfileConfig" :content]))) (letvar351099 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar351099 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-content-type-profiles ([input] (response-too-many-field-level-encryption-content-type-profiles nil input)) ([resultWrapper351101 input] (clojure.core/let [rawinput351100 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351102 {"Message" (portkey.aws/search-for-tag rawinput351100 "Message" :flattened? nil :result-wrapper resultWrapper351101)}] (clojure.core/cond-> {} (letvar351102 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351102 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-keepalive-timeout ([input] (response-invalid-origin-keepalive-timeout nil input)) ([resultWrapper351104 input] (clojure.core/let [rawinput351103 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351105 {"Message" (portkey.aws/search-for-tag rawinput351103 "Message" :flattened? nil :result-wrapper resultWrapper351104)}] (clojure.core/cond-> {} (letvar351105 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351105 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper351107 input] (clojure.core/let [rawinput351106 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351108 {"Message" (portkey.aws/search-for-tag rawinput351106 "Message" :flattened? nil :result-wrapper resultWrapper351107)}] (clojure.core/cond-> {} (letvar351108 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351108 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper351110 input] (clojure.core/let [rawinput351109 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351111 {"DistributionList" (portkey.aws/search-for-tag rawinput351109 "DistributionList" :flattened? nil :result-wrapper resultWrapper351110)}] (clojure.core/cond-> {} (letvar351111 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar351111 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper351113 input] (clojure.core/let [rawinput351112 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351114 {"Message" (portkey.aws/search-for-tag rawinput351112 "Message" :flattened? nil :result-wrapper resultWrapper351113)}] (clojure.core/cond-> {} (letvar351114 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351114 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper351116 input] (clojure.core/let [rawinput351115 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351117 {"Message" (portkey.aws/search-for-tag rawinput351115 "Message" :flattened? nil :result-wrapper resultWrapper351116)}] (clojure.core/cond-> {} (letvar351117 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351117 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper351119 input] (clojure.core/let [rawinput351118 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351120 {"DistributionList" (portkey.aws/search-for-tag rawinput351118 "DistributionList" :flattened? nil :result-wrapper resultWrapper351119)}] (clojure.core/cond-> {} (letvar351120 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar351120 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper351122 input] (clojure.core/let [rawinput351121 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351123 {"Message" (portkey.aws/search-for-tag rawinput351121 "Message" :flattened? nil :result-wrapper resultWrapper351122)}] (clojure.core/cond-> {} (letvar351123 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351123 ["Message" :content])))))))

(clojure.core/defn- response-too-many-field-level-encryption-field-patterns ([input] (response-too-many-field-level-encryption-field-patterns nil input)) ([resultWrapper351125 input] (clojure.core/let [rawinput351124 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351126 {"Message" (portkey.aws/search-for-tag rawinput351124 "Message" :flattened? nil :result-wrapper resultWrapper351125)}] (clojure.core/cond-> {} (letvar351126 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351126 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper351128 input] (clojure.core/let [rawinput351127 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351129 {"Invalidation" (portkey.aws/search-for-tag rawinput351127 "Invalidation" :flattened? nil :result-wrapper resultWrapper351128)}] (clojure.core/cond-> {} (letvar351129 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar351129 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper351131 input] (clojure.core/let [rawinput351130 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar351132 {"Message" (portkey.aws/search-for-tag rawinput351130 "Message" :flattened? nil :result-wrapper resultWrapper351131)}] (clojure.core/cond-> {} (letvar351132 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar351132 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2018-11-05.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.content-type-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.content-type-profile/content-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/content-type-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/format :portkey.aws.cloudfront.-2018-11-05.content-type-profile/content-type] :opt-un [:portkey.aws.cloudfront.-2018-11-05.content-type-profile/profile-id]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.logging-config/enabled :portkey.aws.cloudfront.-2018-11-05.logging-config/include-cookies :portkey.aws.cloudfront.-2018-11-05.logging-config/bucket :portkey.aws.cloudfront.-2018-11-05.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config :portkey.aws.cloudfront.-2018-11-05/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.invalidation-summary/id :portkey.aws.cloudfront.-2018-11-05.invalidation-summary/create-time :portkey.aws.cloudfront.-2018-11-05.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.invalidation/id :portkey.aws.cloudfront.-2018-11-05.invalidation/status :portkey.aws.cloudfront.-2018-11-05.invalidation/create-time :portkey.aws.cloudfront.-2018-11-05/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-config-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-config-result/location :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution :portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-patterns/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-patterns/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/field-pattern-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-patterns (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-patterns/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-patterns/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-config/name :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-config/caller-reference :portkey.aws.cloudfront.-2018-11-05/encryption-entities] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-public-key-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-public-key-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/public-key-config :portkey.aws.cloudfront.-2018-11-05.get-public-key-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-public-key/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-public-key/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.illegal-field-level-encryption-config-association-with-cache-behavior/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/illegal-field-level-encryption-config-association-with-cache-behavior (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.illegal-field-level-encryption-config-association-with-cache-behavior/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config/caller-reference] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config/comment :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-config :portkey.aws.cloudfront.-2018-11-05/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-group-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/origin-group))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile/id :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile/last-modified-time :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.distribution/id :portkey.aws.cloudfront.-2018-11-05.distribution/arn :portkey.aws.cloudfront.-2018-11-05.distribution/status :portkey.aws.cloudfront.-2018-11-05.distribution/last-modified-time :portkey.aws.cloudfront.-2018-11-05.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2018-11-05.distribution/domain-name :portkey.aws.cloudfront.-2018-11-05/active-trusted-signers :portkey.aws.cloudfront.-2018-11-05/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-arg-profile/query-arg (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-arg-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-arg-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.query-arg-profile/query-arg :portkey.aws.cloudfront.-2018-11-05.query-arg-profile/profile-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.lambda-function-association/include-body (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/lambda-function-association (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/lambda-function-arn :portkey.aws.cloudfront.-2018-11-05/event-type] :opt-un [:portkey.aws.cloudfront.-2018-11-05.lambda-function-association/include-body]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.forwarded-values/query-string :portkey.aws.cloudfront.-2018-11-05.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2018-11-05/headers :portkey.aws.cloudfront.-2018-11-05/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-group-members/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-group-members/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/origin-group-member-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-group-members (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin-group-members/quantity :portkey.aws.cloudfront.-2018-11-05.origin-group-members/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/paths :portkey.aws.cloudfront.-2018-11-05.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-group-failover-criteria (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/status-codes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/public-key-config :portkey.aws.cloudfront.-2018-11-05.update-public-key-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.update-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-public-key-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-public-key-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-public-key-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/marker :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-config/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.public-key-config/caller-reference :portkey.aws.cloudfront.-2018-11-05.public-key-config/name :portkey.aws.cloudfront.-2018-11-05.public-key-config/encoded-key] :opt-un [:portkey.aws.cloudfront.-2018-11-05.public-key-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/encryption-entity-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/encryption-entity))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution/id :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/arn :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/status :portkey.aws.cloudfront.-2018-11-05.streaming-distribution/domain-name :portkey.aws.cloudfront.-2018-11-05/active-trusted-signers :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.encryption-entities/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.encryption-entities/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/encryption-entity-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/encryption-entities (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.encryption-entities/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.encryption-entities/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cannot-change-immutable-public-key-fields/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cannot-change-immutable-public-key-fields (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cannot-change-immutable-public-key-fields/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-size-exceeded/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-size-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-size-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/id :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/last-modified-time :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/name :portkey.aws.cloudfront.-2018-11-05/encryption-entities] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/content-type-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/content-type-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2018-11-05.custom-error-response/response-page-path :portkey.aws.cloudfront.-2018-11-05.custom-error-response/response-code :portkey.aws.cloudfront.-2018-11-05.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-profile-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-profile-result/location :portkey.aws.cloudfront.-2018-11-05.create-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.signer/aws-account-number :portkey.aws.cloudfront.-2018-11-05/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-public-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-11-05.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/max-items :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/next-marker :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-profile-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.content-type-profile-config/forward-when-content-type-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/content-type-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.content-type-profile-config/forward-when-content-type-is-unknown] :opt-un [:portkey.aws.cloudfront.-2018-11-05/content-type-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cached-methods/quantity :portkey.aws.cloudfront.-2018-11-05.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-profiles-request/marker :portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-profiles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/query-arg-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cache-behavior/path-pattern :portkey.aws.cloudfront.-2018-11-05.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2018-11-05/forwarded-values :portkey.aws.cloudfront.-2018-11-05/trusted-signers :portkey.aws.cloudfront.-2018-11-05/viewer-protocol-policy :portkey.aws.cloudfront.-2018-11-05.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2018-11-05.cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.-2018-11-05.cache-behavior/compress :portkey.aws.cloudfront.-2018-11-05/lambda-function-associations :portkey.aws.cloudfront.-2018-11-05.cache-behavior/max-ttl :portkey.aws.cloudfront.-2018-11-05/allowed-methods :portkey.aws.cloudfront.-2018-11-05.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-field-level-encryption-profile/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-field-level-encryption-profile/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2018-11-05.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.active-trusted-signers/enabled :portkey.aws.cloudfront.-2018-11-05.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-public-key-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/public-key :portkey.aws.cloudfront.-2018-11-05.create-public-key-result/location :portkey.aws.cloudfront.-2018-11-05.create-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin/id :portkey.aws.cloudfront.-2018-11-05.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2018-11-05.origin/origin-path :portkey.aws.cloudfront.-2018-11-05/custom-headers :portkey.aws.cloudfront.-2018-11-05/s-3-origin-config :portkey.aws.cloudfront.-2018-11-05/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/format #{"URLEncoded" :url-encoded})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-group-member/origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-group-member (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin-group-member/origin-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.invalidation-list/marker :portkey.aws.cloudfront.-2018-11-05.invalidation-list/max-items :portkey.aws.cloudfront.-2018-11-05.invalidation-list/is-truncated :portkey.aws.cloudfront.-2018-11-05.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalidation-list/next-marker :portkey.aws.cloudfront.-2018-11-05.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2018-11-05.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution :portkey.aws.cloudfront.-2018-11-05.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.content-type-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.content-type-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/content-type-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/content-type-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.content-type-profiles/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.content-type-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.encryption-entity/public-key-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.encryption-entity/provider-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/encryption-entity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.encryption-entity/public-key-id :portkey.aws.cloudfront.-2018-11-05.encryption-entity/provider-id :portkey.aws.cloudfront.-2018-11-05/field-patterns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-encryption-entities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-encryption-entities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-encryption-entities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.allowed-methods/quantity :portkey.aws.cloudfront.-2018-11-05.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/origin-read-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/origin-keepalive-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.custom-origin-config/http-port :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/https-port :portkey.aws.cloudfront.-2018-11-05/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2018-11-05/origin-ssl-protocols :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/origin-read-timeout :portkey.aws.cloudfront.-2018-11-05.custom-origin-config/origin-keepalive-timeout]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.public-key-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-distributions-request/marker :portkey.aws.cloudfront.-2018-11-05.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.s-3-origin/domain-name :portkey.aws.cloudfront.-2018-11-05.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-11-05.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2018-11-05.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/id :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/status :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2018-11-05/s-3-origin :portkey.aws.cloudfront.-2018-11-05/aliases :portkey.aws.cloudfront.-2018-11-05/trusted-signers :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2018-11-05/price-class :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2018-11-05.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2018-11-05/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.tag-resource-request/resource :portkey.aws.cloudfront.-2018-11-05/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-configs-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-configs-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-configs-request/marker :portkey.aws.cloudfront.-2018-11-05.list-field-level-encryption-configs-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption/id :portkey.aws.cloudfront.-2018-11-05.field-level-encryption/last-modified-time :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.distribution-config/caller-reference :portkey.aws.cloudfront.-2018-11-05/origins :portkey.aws.cloudfront.-2018-11-05/default-cache-behavior :portkey.aws.cloudfront.-2018-11-05.distribution-config/comment :portkey.aws.cloudfront.-2018-11-05.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2018-11-05.distribution-config/default-root-object :portkey.aws.cloudfront.-2018-11-05.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2018-11-05/restrictions :portkey.aws.cloudfront.-2018-11-05.distribution-config/web-acl-id :portkey.aws.cloudfront.-2018-11-05.distribution-config/logging :portkey.aws.cloudfront.-2018-11-05/cache-behaviors :portkey.aws.cloudfront.-2018-11-05/custom-error-responses :portkey.aws.cloudfront.-2018-11-05/aliases :portkey.aws.cloudfront.-2018-11-05/price-class :portkey.aws.cloudfront.-2018-11-05/http-version :portkey.aws.cloudfront.-2018-11-05/origin-groups :portkey.aws.cloudfront.-2018-11-05/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/public-key :portkey.aws.cloudfront.-2018-11-05.get-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-distributions-associated-to-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-associated-to-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-distributions-associated-to-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/public-key :portkey.aws.cloudfront.-2018-11-05.update-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-summary/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-summary/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.public-key-summary/id :portkey.aws.cloudfront.-2018-11-05.public-key-summary/name :portkey.aws.cloudfront.-2018-11-05.public-key-summary/created-time :portkey.aws.cloudfront.-2018-11-05.public-key-summary/encoded-key] :opt-un [:portkey.aws.cloudfront.-2018-11-05.public-key-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution-config :portkey.aws.cloudfront.-2018-11-05.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-public-keys-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-public-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-public-keys-request/marker :portkey.aws.cloudfront.-2018-11-05.list-public-keys-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution :portkey.aws.cloudfront.-2018-11-05.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config :portkey.aws.cloudfront.-2018-11-05.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-origin-groups-per-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-origin-groups-per-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-origin-groups-per-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-arg-profile-config/forward-when-query-arg-profile-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.query-arg-profile-config/forward-when-query-arg-profile-is-unknown] :opt-un [:portkey.aws.cloudfront.-2018-11-05/query-arg-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-public-keys-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/public-key-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-configs/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-configs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-configs/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-arg-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-arg-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-arg-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.query-arg-profiles/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.query-arg-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-config-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/status-code-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/integer :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.status-codes/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.status-codes/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/status-code-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/status-codes (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.status-codes/quantity :portkey.aws.cloudfront.-2018-11-05.status-codes/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution :portkey.aws.cloudfront.-2018-11-05.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2018-11-05.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-query-arg-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-query-arg-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-query-arg-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config :portkey.aws.cloudfront.-2018-11-05.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2018-11-05.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.create-invalidation-result/location :portkey.aws.cloudfront.-2018-11-05/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-origin-read-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-origin-read-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-origin-read-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2018-11-05.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin-custom-header/header-name :portkey.aws.cloudfront.-2018-11-05.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2018-11-05/s-3-origin :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/comment :portkey.aws.cloudfront.-2018-11-05/trusted-signers :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2018-11-05/aliases :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-config/logging :portkey.aws.cloudfront.-2018-11-05/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-group-member-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/origin-group-member :min-count 2 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/public-key-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-pattern-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.tag/key] :opt-un [:portkey.aws.cloudfront.-2018-11-05.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-group/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-group/failover-criteria (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/origin-group-failover-criteria))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-group/members (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/origin-group-members))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-group (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin-group/id :portkey.aws.cloudfront.-2018-11-05.origin-group/failover-criteria :portkey.aws.cloudfront.-2018-11-05.origin-group/members] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.streaming-logging-config/enabled :portkey.aws.cloudfront.-2018-11-05.streaming-logging-config/bucket :portkey.aws.cloudfront.-2018-11-05.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-public-keys/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-public-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-public-keys/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-config :portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.update-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-summary/id :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-summary/last-modified-time] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-summary/comment :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-config :portkey.aws.cloudfront.-2018-11-05/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.distribution-summary/id :portkey.aws.cloudfront.-2018-11-05.distribution-summary/arn :portkey.aws.cloudfront.-2018-11-05.distribution-summary/status :portkey.aws.cloudfront.-2018-11-05.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2018-11-05.distribution-summary/domain-name :portkey.aws.cloudfront.-2018-11-05/aliases :portkey.aws.cloudfront.-2018-11-05/origins :portkey.aws.cloudfront.-2018-11-05/default-cache-behavior :portkey.aws.cloudfront.-2018-11-05/cache-behaviors :portkey.aws.cloudfront.-2018-11-05/custom-error-responses :portkey.aws.cloudfront.-2018-11-05.distribution-summary/comment :portkey.aws.cloudfront.-2018-11-05/price-class :portkey.aws.cloudfront.-2018-11-05.distribution-summary/enabled :portkey.aws.cloudfront.-2018-11-05/viewer-certificate :portkey.aws.cloudfront.-2018-11-05/restrictions :portkey.aws.cloudfront.-2018-11-05.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2018-11-05/http-version :portkey.aws.cloudfront.-2018-11-05.distribution-summary/is-ipv-6-enabled] :opt-un [:portkey.aws.cloudfront.-2018-11-05/origin-groups]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.public-key-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/minimum-protocol-version #{"TLSv1" :tl-sv-1 "TLSv1_2016" :tl-sv-12-2018 :ss-lv-3 "TLSv1.2_2018" "SSLv3" :tl-sv-11-2016 :tl-sv-1-2016 "TLSv1.1_2016"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origins/quantity :portkey.aws.cloudfront.-2018-11-05.origins/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/distribution-config :portkey.aws.cloudfront.-2018-11-05/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/delete-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.delete-public-key-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.delete-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution :portkey.aws.cloudfront.-2018-11-05.create-distribution-result/location :portkey.aws.cloudfront.-2018-11-05.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-configs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2018-11-05.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.query-arg-profile-empty/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-empty (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.query-arg-profile-empty/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.distribution-list/marker :portkey.aws.cloudfront.-2018-11-05.distribution-list/max-items :portkey.aws.cloudfront.-2018-11-05.distribution-list/is-truncated :portkey.aws.cloudfront.-2018-11-05.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.distribution-list/next-marker :portkey.aws.cloudfront.-2018-11-05.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/streaming-distribution :portkey.aws.cloudfront.-2018-11-05.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-config :portkey.aws.cloudfront.-2018-11-05.get-field-level-encryption-profile-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-content-type-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-content-type-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-content-type-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2018-11-05.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-groups/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.origin-groups/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/origin-group-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/origin-groups (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.origin-groups/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.origin-groups/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-origin-keepalive-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-origin-keepalive-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-origin-keepalive-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/delete-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-invalidations-request/marker :portkey.aws.cloudfront.-2018-11-05.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.untag-resource-request/resource :portkey.aws.cloudfront.-2018-11-05/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/public-key-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.public-key-list/max-items :portkey.aws.cloudfront.-2018-11-05.public-key-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.public-key-list/next-marker :portkey.aws.cloudfront.-2018-11-05.public-key-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2018-11-05/forwarded-values :portkey.aws.cloudfront.-2018-11-05/trusted-signers :portkey.aws.cloudfront.-2018-11-05/viewer-protocol-policy :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/compress :portkey.aws.cloudfront.-2018-11-05/lambda-function-associations :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2018-11-05/allowed-methods :portkey.aws.cloudfront.-2018-11-05.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.trusted-signers/enabled :portkey.aws.cloudfront.-2018-11-05.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/delete-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.delete-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-field-patterns/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-field-patterns (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-field-level-encryption-field-patterns/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/max-items :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/next-marker :portkey.aws.cloudfront.-2018-11-05.field-level-encryption-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.public-key/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/public-key (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.public-key/id :portkey.aws.cloudfront.-2018-11-05.public-key/created-time :portkey.aws.cloudfront.-2018-11-05/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/distribution-config :portkey.aws.cloudfront.-2018-11-05.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-11-05.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/create-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2018-11-05/ssl-support-method :portkey.aws.cloudfront.-2018-11-05/minimum-protocol-version :portkey.aws.cloudfront.-2018-11-05.viewer-certificate/certificate :portkey.aws.cloudfront.-2018-11-05/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-11-05.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2018-11-05.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2018-11-05.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-11-05/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-11-05.geo-restriction/restriction-type :portkey.aws.cloudfront.-2018-11-05.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2018-11-05.geo-restriction/items]))

(clojure.core/defn tag-resource-2018-11-05 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging?Operation=Tag", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-11-05/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-11-05/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2018-11-05 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2018_11_05", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-distribution-result))

(clojure.core/defn get-public-key-2018-11-05 ([get-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-key-request get-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicKey2018_11_05", :http.request.configuration/output-deser-fn response-get-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-11-05/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-public-key-result))

(clojure.core/defn create-streaming-distribution-with-tags-2018-11-05 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution?WithTags", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2018_11_05", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2018-11-05/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2018-11-05/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2018-11-05 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2018_11_05", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-11-05/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-11-05/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-11-05/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-11-05/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-11-05/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-11-05/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-11-05/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-11-05/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-11-05/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-11-05/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-11-05/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-11-05/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-11-05/invalid-web-acl-id, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-11-05/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-11-05/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-11-05/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-11-05/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-11-05/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-11-05/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-11-05/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront.-2018-11-05/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-11-05/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-11-05/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-11-05/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-read-timeout, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2018-11-05/illegal-update, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-11-05/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-11-05/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/update-distribution-result))

(clojure.core/defn update-field-level-encryption-profile-2018-11-05 ([update-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-field-level-encryption-profile-request update-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-update-field-level-encryption-profile-result, :http.request.spec/error-spec {"FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-already-exists, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-11-05/no-such-public-key, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-size-exceeded, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-encryption-entities, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-11-05/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-profile-result))

(clojure.core/defn delete-streaming-distribution-2018-11-05 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2018-11-05 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2018-11-05 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution?WithTags", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2018_11_05", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-11-05/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2018-11-05/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-11-05/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-11-05/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-11-05/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-11-05/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-11-05/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-11-05/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-11-05/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-11-05/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-11-05/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-11-05/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-11-05/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-11-05/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2018-11-05/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-11-05/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-11-05/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-11-05/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-11-05/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-11-05/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-11-05/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-11-05/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront.-2018-11-05/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-11-05/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-11-05/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-11-05/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-11-05/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2018-11-05/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-11-05/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-distribution-with-tags-result))

(clojure.core/defn delete-field-level-encryption-profile-2018-11-05 ([delete-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-field-level-encryption-profile-request delete-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/delete-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "FieldLevelEncryptionProfileInUse" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/delete-field-level-encryption-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2018-11-05 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2018_11_05", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2018-11-05/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-invalidation-result))

(clojure.core/defn list-field-level-encryption-profiles-2018-11-05 ([] (list-field-level-encryption-profiles-2018-11-05 {})) ([list-field-level-encryption-profiles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-field-level-encryption-profiles-request list-field-level-encryption-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-profiles-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFieldLevelEncryptionProfiles2018_11_05", :http.request.configuration/output-deser-fn response-list-field-level-encryption-profiles-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-profiles-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-profiles-result))

(clojure.core/defn create-field-level-encryption-profile-2018-11-05 ([create-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-field-level-encryption-profile-request create-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-create-field-level-encryption-profile-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-11-05/no-such-public-key, "FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-already-exists, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-profile-size-exceeded, "TooManyFieldLevelEncryptionProfiles" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-profiles, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-encryption-entities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-profile-result))

(clojure.core/defn create-streaming-distribution-2018-11-05 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2018-11-05/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-profile-2018-11-05 ([get-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-profile-request get-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-result))

(clojure.core/defn list-field-level-encryption-configs-2018-11-05 ([] (list-field-level-encryption-configs-2018-11-05 {})) ([list-field-level-encryption-configs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-field-level-encryption-configs-request list-field-level-encryption-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFieldLevelEncryptionConfigs2018_11_05", :http.request.configuration/output-deser-fn response-list-field-level-encryption-configs-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-configs-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-field-level-encryption-configs-result))

(clojure.core/defn list-tags-for-resource-2018-11-05 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2018_11_05", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-11-05/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-11-05/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2018-11-05 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-2018-11-05 ([get-field-level-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-request get-field-level-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryption2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-result))

(clojure.core/defn create-distribution-2018-11-05 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2018_11_05", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-11-05/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2018-11-05/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-11-05/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-11-05/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-11-05/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-11-05/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-11-05/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-11-05/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-11-05/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-11-05/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-11-05/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-11-05/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-11-05/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-11-05/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2018-11-05/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-11-05/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-11-05/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-11-05/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-11-05/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-11-05/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-11-05/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-11-05/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront.-2018-11-05/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-11-05/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-11-05/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-11-05/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2018-11-05/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-11-05/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-11-05/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-distribution-result))

(clojure.core/defn create-field-level-encryption-config-2018-11-05 ([create-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-field-level-encryption-config-request create-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-create-field-level-encryption-config-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile, "FieldLevelEncryptionConfigAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config-already-exists, "TooManyFieldLevelEncryptionConfigs" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-configs, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-query-arg-profiles, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-content-type-profiles, "QueryArgProfileEmpty" :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-empty}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-field-level-encryption-config-result))

(clojure.core/defn get-streaming-distribution-config-2018-11-05 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-streaming-distribution-config-result))

(clojure.core/defn update-field-level-encryption-config-2018-11-05 ([update-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-field-level-encryption-config-request update-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-update-field-level-encryption-config-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-query-arg-profiles, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "QueryArgProfileEmpty" :portkey.aws.cloudfront.-2018-11-05/query-arg-profile-empty, "IllegalUpdate" :portkey.aws.cloudfront.-2018-11-05/illegal-update, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront.-2018-11-05/too-many-field-level-encryption-content-type-profiles, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/update-field-level-encryption-config-result))

(clojure.core/defn list-distributions-2018-11-05 ([] (list-distributions-2018-11-05 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2018_11_05", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-11-05/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-distributions-result))

(clojure.core/defn list-public-keys-2018-11-05 ([] (list-public-keys-2018-11-05 {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-public-keys-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-public-keys-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublicKeys2018_11_05", :http.request.configuration/output-deser-fn response-list-public-keys-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument}})))))
(clojure.spec.alpha/fdef list-public-keys-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-11-05/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-public-keys-result))

(clojure.core/defn create-public-key-2018-11-05 ([create-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-public-key-request create-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePublicKey2018_11_05", :http.request.configuration/output-deser-fn response-create-public-key-result, :http.request.spec/error-spec {"PublicKeyAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/public-key-already-exists, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "TooManyPublicKeys" :portkey.aws.cloudfront.-2018-11-05/too-many-public-keys}})))))
(clojure.spec.alpha/fdef create-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-public-key-result))

(clojure.core/defn get-field-level-encryption-profile-config-2018-11-05 ([get-field-level-encryption-profile-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-profile-config-request get-field-level-encryption-profile-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionProfileConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-profile-config-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2018-11-05 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2018-11-05 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2018_11_05", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-invalidations-result))

(clojure.core/defn delete-public-key-2018-11-05 ([delete-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-public-key-request delete-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/delete-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePublicKey2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "PublicKeyInUse" :portkey.aws.cloudfront.-2018-11-05/public-key-in-use, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-11-05/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/delete-public-key-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource-2018-11-05 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging?Operation=Untag", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-11-05/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-11-05/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2018-11-05 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2018-11-05 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2018-11-05/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2018-11-05 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-11-05/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-11-05/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-11-05/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-11-05/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-11-05/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2018-11-05 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-distribution-config-result))

(clojure.core/defn get-public-key-config-2018-11-05 ([get-public-key-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-key-config-request get-public-key-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-public-key-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-public-key-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicKeyConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-public-key-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-11-05/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-public-key-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-public-key-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2018-11-05 ([] (list-cloud-front-origin-access-identities-2018-11-05 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2018_11_05", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-11-05/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2018-11-05 ([] (list-streaming-distributions-2018-11-05 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2018_11_05", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-11-05/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-streaming-distributions-result))

(clojure.core/defn update-public-key-2018-11-05 ([update-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-public-key-request update-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/update-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/update-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePublicKey2018_11_05", :http.request.configuration/output-deser-fn response-update-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "CannotChangeImmutablePublicKeyFields" :portkey.aws.cloudfront.-2018-11-05/cannot-change-immutable-public-key-fields, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-11-05/illegal-update, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-11-05/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed}})))))
(clojure.spec.alpha/fdef update-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/update-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/update-public-key-result))

(clojure.core/defn get-field-level-encryption-config-2018-11-05 ([get-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-config-request get-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/get-field-level-encryption-config-result))

(clojure.core/defn delete-distribution-2018-11-05 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2018-11-05/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2018-11-05 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2018_11_05", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-11-05/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2018-11-05/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2018-11-05/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-invalidation-result))

(clojure.core/defn delete-field-level-encryption-config-2018-11-05 ([delete-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-field-level-encryption-config-request delete-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/delete-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-11-05/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-11-05/invalid-if-match-version, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-11-05/no-such-field-level-encryption-config, "PreconditionFailed" :portkey.aws.cloudfront.-2018-11-05/precondition-failed, "FieldLevelEncryptionConfigInUse" :portkey.aws.cloudfront.-2018-11-05/field-level-encryption-config-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/delete-field-level-encryption-config-request) :ret clojure.core/true?)

(clojure.core/defn list-distributions-by-web-acl-id-2018-11-05 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2018_11_05", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-11-05/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2018-11-05 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-11-05/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-11-05/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2018-11-05/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-11-05/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2018-11-05/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2018-11-05/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-11-05/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-11-05/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-11-05/create-cloud-front-origin-access-identity-result))
