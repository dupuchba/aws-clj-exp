(ns portkey.aws.fms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "fms", :region "ap-northeast-1"},
    :ssl-common-name "fms.ap-northeast-1.amazonaws.com",
    :endpoint "https://fms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "fms", :region "eu-west-1"},
    :ssl-common-name "fms.eu-west-1.amazonaws.com",
    :endpoint "https://fms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "fms", :region "us-east-2"},
    :ssl-common-name "fms.us-east-2.amazonaws.com",
    :endpoint "https://fms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "fms", :region "ap-southeast-2"},
    :ssl-common-name "fms.ap-southeast-2.amazonaws.com",
    :endpoint "https://fms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "fms", :region "eu-central-1"},
    :ssl-common-name "fms.eu-central-1.amazonaws.com",
    :endpoint "https://fms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "fms", :region "us-west-2"},
    :ssl-common-name "fms.us-west-2.amazonaws.com",
    :endpoint "https://fms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "fms", :region "us-east-1"},
    :ssl-common-name "fms.us-east-1.amazonaws.com",
    :endpoint "https://fms.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-pagination-max-results)

(clojure.core/declare ser-resource-tags)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-customer-policy-scope-map)

(clojure.core/declare ser-customer-policy-scope-id-list)

(clojure.core/declare ser-aws-account-id)

(clojure.core/declare ser-customer-policy-scope-id-type)

(clojure.core/declare ser-policy-id)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-resource-tag)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-customer-policy-scope-id)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-security-service-type)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-managed-service-data)

(clojure.core/declare ser-security-service-policy-data)

(clojure.core/declare ser-policy-update-token)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-pagination-max-results [input] #:http.request.field{:value input, :shape "PaginationMaxResults"})

(clojure.core/defn- ser-resource-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-tag coll) #:http.request.field{:shape "ResourceTag"}))) input), :shape "ResourceTags", :type "list", :max 8, :min 0})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-customer-policy-scope-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-customer-policy-scope-id-type k) #:http.request.field{:map-info "key", :shape "CustomerPolicyScopeIdType"}) (clojure.core/into (ser-customer-policy-scope-id-list v) #:http.request.field{:map-info "value", :shape "CustomerPolicyScopeIdList"})])) input), :shape "CustomerPolicyScopeMap", :type "map"})

(clojure.core/defn- ser-customer-policy-scope-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-customer-policy-scope-id coll) #:http.request.field{:shape "CustomerPolicyScopeId"}))) input), :shape "CustomerPolicyScopeIdList", :type "list"})

(clojure.core/defn- ser-aws-account-id [input] #:http.request.field{:value input, :shape "AWSAccountId"})

(clojure.core/defn- ser-customer-policy-scope-id-type [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "CustomerPolicyScopeIdType"})

(clojure.core/defn- ser-policy-id [input] #:http.request.field{:value input, :shape "PolicyId"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-resource-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "ResourceTag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value input, :shape "ResourceType"})

(clojure.core/defn- ser-customer-policy-scope-id [input] #:http.request.field{:value input, :shape "CustomerPolicyScopeId"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-security-service-type [input] #:http.request.field{:value (clojure.core/get {"WAF" "WAF", :waf "WAF"} input), :shape "SecurityServiceType"})

(clojure.core/defn- ser-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-name (:policy-name input)) #:http.request.field{:name "PolicyName", :shape "ResourceName"}) (clojure.core/into (ser-security-service-policy-data (:security-service-policy-data input)) #:http.request.field{:name "SecurityServicePolicyData", :shape "SecurityServicePolicyData"}) (clojure.core/into (ser-resource-type (:resource-type input)) #:http.request.field{:name "ResourceType", :shape "ResourceType"}) (clojure.core/into (ser-boolean (:exclude-resource-tags input)) #:http.request.field{:name "ExcludeResourceTags", :shape "Boolean"}) (clojure.core/into (ser-boolean (:remediation-enabled input)) #:http.request.field{:name "RemediationEnabled", :shape "Boolean"})], :shape "Policy", :type "structure"} (clojure.core/contains? input :resource-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-tags (input :resource-tags)) #:http.request.field{:name "ResourceTags", :shape "ResourceTags"})) (clojure.core/contains? input :include-map) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-policy-scope-map (input :include-map)) #:http.request.field{:name "IncludeMap", :shape "CustomerPolicyScopeMap"})) (clojure.core/contains? input :policy-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})) (clojure.core/contains? input :exclude-map) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-policy-scope-map (input :exclude-map)) #:http.request.field{:name "ExcludeMap", :shape "CustomerPolicyScopeMap"})) (clojure.core/contains? input :policy-update-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-update-token (input :policy-update-token)) #:http.request.field{:name "PolicyUpdateToken", :shape "PolicyUpdateToken"}))))

(clojure.core/defn- ser-managed-service-data [input] #:http.request.field{:value input, :shape "ManagedServiceData"})

(clojure.core/defn- ser-security-service-policy-data [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-security-service-type (:type input)) #:http.request.field{:name "Type", :shape "SecurityServiceType"})], :shape "SecurityServicePolicyData", :type "structure"} (clojure.core/contains? input :managed-service-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-managed-service-data (input :managed-service-data)) #:http.request.field{:name "ManagedServiceData", :shape "ManagedServiceData"}))))

(clojure.core/defn- ser-policy-update-token [input] #:http.request.field{:value input, :shape "PolicyUpdateToken"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-disassociate-admin-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-member-accounts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PaginationMaxResults"}))))

(clojure.core/defn- req-put-notification-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicArn", :shape "ResourceArn"}) (clojure.core/into (ser-resource-arn (input :sns-role-name)) #:http.request.field{:name "SnsRoleName", :shape "ResourceArn"})]}))

(clojure.core/defn- req-list-compliance-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PaginationMaxResults"}))))

(clojure.core/defn- req-get-admin-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-notification-channel-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-compliance-detail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"}) (clojure.core/into (ser-aws-account-id (input :member-account)) #:http.request.field{:name "MemberAccount", :shape "AWSAccountId"})]}))

(clojure.core/defn- req-get-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]}))

(clojure.core/defn- req-put-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})]}))

(clojure.core/defn- req-delete-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]} (clojure.core/contains? input :delete-all-policy-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :delete-all-policy-resources)) #:http.request.field{:name "DeleteAllPolicyResources", :shape "Boolean"}))))

(clojure.core/defn- req-list-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PaginationMaxResults"}))))

(clojure.core/defn- req-get-notification-channel-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-associate-admin-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-aws-account-id (input :admin-account)) #:http.request.field{:name "AdminAccount", :shape "AWSAccountId"})]}))

(clojure.core/declare deser-policy-compliance-detail)

(clojure.core/declare deser-dependent-service-name)

(clojure.core/declare deser-policy-compliance-status-type)

(clojure.core/declare deser-compliance-violators)

(clojure.core/declare deser-policy-summary)

(clojure.core/declare deser-resource-tags)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-violation-reason)

(clojure.core/declare deser-customer-policy-scope-map)

(clojure.core/declare deser-customer-policy-scope-id-list)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-evaluation-results)

(clojure.core/declare deser-aws-account-id)

(clojure.core/declare deser-evaluation-result)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-issue-info-map)

(clojure.core/declare deser-customer-policy-scope-id-type)

(clojure.core/declare deser-policy-id)

(clojure.core/declare deser-policy-compliance-status)

(clojure.core/declare deser-compliance-violator)

(clojure.core/declare deser-member-accounts)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-policy-compliance-status-list)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-policy-summary-list)

(clojure.core/declare deser-resource-tag)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-resource-count)

(clojure.core/declare deser-customer-policy-scope-id)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-security-service-type)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-managed-service-data)

(clojure.core/declare deser-detailed-info)

(clojure.core/declare deser-account-role-status)

(clojure.core/declare deser-security-service-policy-data)

(clojure.core/declare deser-time-stamp)

(clojure.core/declare deser-policy-update-token)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-policy-compliance-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyOwner") (clojure.core/assoc :policy-owner (deser-aws-account-id (input "PolicyOwner"))) (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (input "PolicyId"))) (clojure.core/contains? input "MemberAccount") (clojure.core/assoc :member-account (deser-aws-account-id (input "MemberAccount"))) (clojure.core/contains? input "Violators") (clojure.core/assoc :violators (deser-compliance-violators (input "Violators"))) (clojure.core/contains? input "EvaluationLimitExceeded") (clojure.core/assoc :evaluation-limit-exceeded (deser-boolean (input "EvaluationLimitExceeded"))) (clojure.core/contains? input "ExpiredAt") (clojure.core/assoc :expired-at (deser-time-stamp (input "ExpiredAt"))) (clojure.core/contains? input "IssueInfoMap") (clojure.core/assoc :issue-info-map (deser-issue-info-map (input "IssueInfoMap")))))

(clojure.core/defn- deser-dependent-service-name [input] (clojure.core/get {"AWSCONFIG" :awsconfig, "AWSWAF" :awswaf} input))

(clojure.core/defn- deser-policy-compliance-status-type [input] (clojure.core/get {"COMPLIANT" :compliant, "NON_COMPLIANT" :non-compliant} input))

(clojure.core/defn- deser-compliance-violators [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compliance-violator coll))) input))

(clojure.core/defn- deser-policy-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyArn") (clojure.core/assoc :policy-arn (deser-resource-arn (input "PolicyArn"))) (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (input "PolicyId"))) (clojure.core/contains? input "PolicyName") (clojure.core/assoc :policy-name (deser-resource-name (input "PolicyName"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "SecurityServiceType") (clojure.core/assoc :security-service-type (deser-security-service-type (input "SecurityServiceType"))) (clojure.core/contains? input "RemediationEnabled") (clojure.core/assoc :remediation-enabled (deser-boolean (input "RemediationEnabled")))))

(clojure.core/defn- deser-resource-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-violation-reason [input] (clojure.core/get {"WEB_ACL_MISSING_RULE_GROUP" :web-acl-missing-rule-group, "RESOURCE_MISSING_WEB_ACL" :resource-missing-web-acl, "RESOURCE_INCORRECT_WEB_ACL" :resource-incorrect-web-acl} input))

(clojure.core/defn- deser-customer-policy-scope-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-customer-policy-scope-id-type k) (deser-customer-policy-scope-id-list v)])) input))

(clojure.core/defn- deser-customer-policy-scope-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-customer-policy-scope-id coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-evaluation-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-evaluation-result coll))) input))

(clojure.core/defn- deser-aws-account-id [input] input)

(clojure.core/defn- deser-evaluation-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ComplianceStatus") (clojure.core/assoc :compliance-status (deser-policy-compliance-status-type (input "ComplianceStatus"))) (clojure.core/contains? input "ViolatorCount") (clojure.core/assoc :violator-count (deser-resource-count (input "ViolatorCount"))) (clojure.core/contains? input "EvaluationLimitExceeded") (clojure.core/assoc :evaluation-limit-exceeded (deser-boolean (input "EvaluationLimitExceeded")))))

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-issue-info-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-dependent-service-name k) (deser-detailed-info v)])) input))

(clojure.core/defn- deser-customer-policy-scope-id-type [input] (clojure.core/get {"ACCOUNT" :account} input))

(clojure.core/defn- deser-policy-id [input] input)

(clojure.core/defn- deser-policy-compliance-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyOwner") (clojure.core/assoc :policy-owner (deser-aws-account-id (input "PolicyOwner"))) (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (input "PolicyId"))) (clojure.core/contains? input "PolicyName") (clojure.core/assoc :policy-name (deser-resource-name (input "PolicyName"))) (clojure.core/contains? input "MemberAccount") (clojure.core/assoc :member-account (deser-aws-account-id (input "MemberAccount"))) (clojure.core/contains? input "EvaluationResults") (clojure.core/assoc :evaluation-results (deser-evaluation-results (input "EvaluationResults"))) (clojure.core/contains? input "LastUpdated") (clojure.core/assoc :last-updated (deser-time-stamp (input "LastUpdated"))) (clojure.core/contains? input "IssueInfoMap") (clojure.core/assoc :issue-info-map (deser-issue-info-map (input "IssueInfoMap")))))

(clojure.core/defn- deser-compliance-violator [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-resource-id (input "ResourceId"))) (clojure.core/contains? input "ViolationReason") (clojure.core/assoc :violation-reason (deser-violation-reason (input "ViolationReason"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType")))))

(clojure.core/defn- deser-member-accounts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-aws-account-id coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-policy-compliance-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-compliance-status coll))) input))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-policy-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-summary coll))) input))

(clojure.core/defn- deser-resource-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-resource-type [input] input)

(clojure.core/defn- deser-resource-count [input] input)

(clojure.core/defn- deser-customer-policy-scope-id [input] input)

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-security-service-type [input] (clojure.core/get {"WAF" :waf} input))

(clojure.core/defn- deser-policy [input] (clojure.core/cond-> {:policy-name (deser-resource-name (input "PolicyName")), :security-service-policy-data (deser-security-service-policy-data (input "SecurityServicePolicyData")), :resource-type (deser-resource-type (input "ResourceType")), :exclude-resource-tags (deser-boolean (input "ExcludeResourceTags")), :remediation-enabled (deser-boolean (input "RemediationEnabled"))} (clojure.core/contains? input "ResourceTags") (clojure.core/assoc :resource-tags (deser-resource-tags (input "ResourceTags"))) (clojure.core/contains? input "IncludeMap") (clojure.core/assoc :include-map (deser-customer-policy-scope-map (input "IncludeMap"))) (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (input "PolicyId"))) (clojure.core/contains? input "ExcludeMap") (clojure.core/assoc :exclude-map (deser-customer-policy-scope-map (input "ExcludeMap"))) (clojure.core/contains? input "PolicyUpdateToken") (clojure.core/assoc :policy-update-token (deser-policy-update-token (input "PolicyUpdateToken")))))

(clojure.core/defn- deser-managed-service-data [input] input)

(clojure.core/defn- deser-detailed-info [input] input)

(clojure.core/defn- deser-account-role-status [input] (clojure.core/get {"READY" :ready, "CREATING" :creating, "PENDING_DELETION" :pending-deletion, "DELETING" :deleting, "DELETED" :deleted} input))

(clojure.core/defn- deser-security-service-policy-data [input] (clojure.core/cond-> {:type (deser-security-service-type (input "Type"))} (clojure.core/contains? input "ManagedServiceData") (clojure.core/assoc :managed-service-data (deser-managed-service-data (input "ManagedServiceData")))))

(clojure.core/defn- deser-time-stamp [input] input)

(clojure.core/defn- deser-policy-update-token [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-list-compliance-status-response ([input] (response-list-compliance-status-response nil input)) ([resultWrapper972904 input] (clojure.core/let [rawinput972903 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972905 {"PolicyComplianceStatusList" (rawinput972903 "PolicyComplianceStatusList"), "NextToken" (rawinput972903 "NextToken")}] (clojure.core/cond-> {} (letvar972905 "PolicyComplianceStatusList") (clojure.core/assoc :policy-compliance-status-list (deser-policy-compliance-status-list (clojure.core/get-in letvar972905 ["PolicyComplianceStatusList"]))) (letvar972905 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar972905 ["NextToken"])))))))

(clojure.core/defn- response-list-member-accounts-response ([input] (response-list-member-accounts-response nil input)) ([resultWrapper972907 input] (clojure.core/let [rawinput972906 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972908 {"MemberAccounts" (rawinput972906 "MemberAccounts"), "NextToken" (rawinput972906 "NextToken")}] (clojure.core/cond-> {} (letvar972908 "MemberAccounts") (clojure.core/assoc :member-accounts (deser-member-accounts (clojure.core/get-in letvar972908 ["MemberAccounts"]))) (letvar972908 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar972908 ["NextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper972910 input] (clojure.core/let [rawinput972909 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972911 {"Message" (rawinput972909 "Message")}] (clojure.core/cond-> {} (letvar972911 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar972911 ["Message"])))))))

(clojure.core/defn- response-get-compliance-detail-response ([input] (response-get-compliance-detail-response nil input)) ([resultWrapper972913 input] (clojure.core/let [rawinput972912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972914 {"PolicyComplianceDetail" (rawinput972912 "PolicyComplianceDetail")}] (clojure.core/cond-> {} (letvar972914 "PolicyComplianceDetail") (clojure.core/assoc :policy-compliance-detail (deser-policy-compliance-detail (clojure.core/get-in letvar972914 ["PolicyComplianceDetail"])))))))

(clojure.core/defn- response-invalid-type-exception ([input] (response-invalid-type-exception nil input)) ([resultWrapper972916 input] (clojure.core/let [rawinput972915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972917 {"Message" (rawinput972915 "Message")}] (clojure.core/cond-> {} (letvar972917 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar972917 ["Message"])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper972919 input] (clojure.core/let [rawinput972918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972920 {"Message" (rawinput972918 "Message")}] (clojure.core/cond-> {} (letvar972920 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar972920 ["Message"])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper972922 input] (clojure.core/let [rawinput972921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972923 {"Message" (rawinput972921 "Message")}] (clojure.core/cond-> {} (letvar972923 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar972923 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper972925 input] (clojure.core/let [rawinput972924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972926 {"Message" (rawinput972924 "Message")}] (clojure.core/cond-> {} (letvar972926 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar972926 ["Message"])))))))

(clojure.core/defn- response-get-notification-channel-response ([input] (response-get-notification-channel-response nil input)) ([resultWrapper972928 input] (clojure.core/let [rawinput972927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972929 {"SnsTopicArn" (rawinput972927 "SnsTopicArn"), "SnsRoleName" (rawinput972927 "SnsRoleName")}] (clojure.core/cond-> {} (letvar972929 "SnsTopicArn") (clojure.core/assoc :sns-topic-arn (deser-resource-arn (clojure.core/get-in letvar972929 ["SnsTopicArn"]))) (letvar972929 "SnsRoleName") (clojure.core/assoc :sns-role-name (deser-resource-arn (clojure.core/get-in letvar972929 ["SnsRoleName"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper972931 input] (clojure.core/let [rawinput972930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972932 {"Message" (rawinput972930 "Message")}] (clojure.core/cond-> {} (letvar972932 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar972932 ["Message"])))))))

(clojure.core/defn- response-get-policy-response ([input] (response-get-policy-response nil input)) ([resultWrapper972934 input] (clojure.core/let [rawinput972933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972935 {"Policy" (rawinput972933 "Policy"), "PolicyArn" (rawinput972933 "PolicyArn")}] (clojure.core/cond-> {} (letvar972935 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar972935 ["Policy"]))) (letvar972935 "PolicyArn") (clojure.core/assoc :policy-arn (deser-resource-arn (clojure.core/get-in letvar972935 ["PolicyArn"])))))))

(clojure.core/defn- response-get-admin-account-response ([input] (response-get-admin-account-response nil input)) ([resultWrapper972937 input] (clojure.core/let [rawinput972936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972938 {"AdminAccount" (rawinput972936 "AdminAccount"), "RoleStatus" (rawinput972936 "RoleStatus")}] (clojure.core/cond-> {} (letvar972938 "AdminAccount") (clojure.core/assoc :admin-account (deser-aws-account-id (clojure.core/get-in letvar972938 ["AdminAccount"]))) (letvar972938 "RoleStatus") (clojure.core/assoc :role-status (deser-account-role-status (clojure.core/get-in letvar972938 ["RoleStatus"])))))))

(clojure.core/defn- response-put-policy-response ([input] (response-put-policy-response nil input)) ([resultWrapper972940 input] (clojure.core/let [rawinput972939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972941 {"Policy" (rawinput972939 "Policy"), "PolicyArn" (rawinput972939 "PolicyArn")}] (clojure.core/cond-> {} (letvar972941 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar972941 ["Policy"]))) (letvar972941 "PolicyArn") (clojure.core/assoc :policy-arn (deser-resource-arn (clojure.core/get-in letvar972941 ["PolicyArn"])))))))

(clojure.core/defn- response-list-policies-response ([input] (response-list-policies-response nil input)) ([resultWrapper972943 input] (clojure.core/let [rawinput972942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar972944 {"PolicyList" (rawinput972942 "PolicyList"), "NextToken" (rawinput972942 "NextToken")}] (clojure.core/cond-> {} (letvar972944 "PolicyList") (clojure.core/assoc :policy-list (deser-policy-summary-list (clojure.core/get-in letvar972944 ["PolicyList"]))) (letvar972944 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar972944 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.fms/disassociate-admin-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-detail/policy-owner (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-detail/member-account (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-detail/violators (clojure.spec.alpha/and :portkey.aws.fms/compliance-violators))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-detail/evaluation-limit-exceeded (clojure.spec.alpha/and :portkey.aws.fms/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-detail/expired-at (clojure.spec.alpha/and :portkey.aws.fms/time-stamp))
(clojure.spec.alpha/def :portkey.aws.fms/policy-compliance-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.policy-compliance-detail/policy-owner :portkey.aws.fms/policy-id :portkey.aws.fms.policy-compliance-detail/member-account :portkey.aws.fms.policy-compliance-detail/violators :portkey.aws.fms.policy-compliance-detail/evaluation-limit-exceeded :portkey.aws.fms.policy-compliance-detail/expired-at :portkey.aws.fms/issue-info-map]))

(clojure.spec.alpha/def :portkey.aws.fms.list-member-accounts-request/next-token (clojure.spec.alpha/and :portkey.aws.fms/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.list-member-accounts-request/max-results (clojure.spec.alpha/and :portkey.aws.fms/pagination-max-results))
(clojure.spec.alpha/def :portkey.aws.fms/list-member-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.list-member-accounts-request/next-token :portkey.aws.fms.list-member-accounts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.fms/dependent-service-name #{"AWSWAF" "AWSCONFIG" :awswaf :awsconfig})

(clojure.spec.alpha/def :portkey.aws.fms.list-compliance-status-response/next-token (clojure.spec.alpha/and :portkey.aws.fms/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms/list-compliance-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms/policy-compliance-status-list :portkey.aws.fms.list-compliance-status-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.fms.put-notification-channel-request/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.put-notification-channel-request/sns-role-name (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms/put-notification-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.put-notification-channel-request/sns-topic-arn :portkey.aws.fms.put-notification-channel-request/sns-role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.list-member-accounts-response/next-token (clojure.spec.alpha/and :portkey.aws.fms/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms/list-member-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms/member-accounts :portkey.aws.fms.list-member-accounts-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.fms/policy-compliance-status-type #{"NON_COMPLIANT" "COMPLIANT" :compliant :non-compliant})

(clojure.spec.alpha/def :portkey.aws.fms/compliance-violators (clojure.spec.alpha/coll-of :portkey.aws.fms/compliance-violator))

(clojure.spec.alpha/def :portkey.aws.fms/pagination-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.fms.list-compliance-status-request/next-token (clojure.spec.alpha/and :portkey.aws.fms/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.list-compliance-status-request/max-results (clojure.spec.alpha/and :portkey.aws.fms/pagination-max-results))
(clojure.spec.alpha/def :portkey.aws.fms/list-compliance-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms/policy-id] :opt-un [:portkey.aws.fms.list-compliance-status-request/next-token :portkey.aws.fms.list-compliance-status-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.fms/get-admin-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.policy-summary/policy-arn (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.policy-summary/policy-name (clojure.spec.alpha/and :portkey.aws.fms/resource-name))
(clojure.spec.alpha/def :portkey.aws.fms.policy-summary/remediation-enabled (clojure.spec.alpha/and :portkey.aws.fms/boolean))
(clojure.spec.alpha/def :portkey.aws.fms/policy-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.policy-summary/policy-arn :portkey.aws.fms/policy-id :portkey.aws.fms.policy-summary/policy-name :portkey.aws.fms/resource-type :portkey.aws.fms/security-service-type :portkey.aws.fms.policy-summary/remediation-enabled]))

(clojure.spec.alpha/def :portkey.aws.fms/delete-notification-channel-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms/resource-tags (clojure.spec.alpha/coll-of :portkey.aws.fms/resource-tag :min-count 0 :max-count 8))

(clojure.spec.alpha/def :portkey.aws.fms/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fms/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.fms/violation-reason #{"RESOURCE_INCORRECT_WEB_ACL" "WEB_ACL_MISSING_RULE_GROUP" "RESOURCE_MISSING_WEB_ACL" :web-acl-missing-rule-group :resource-incorrect-web-acl :resource-missing-web-acl})

(clojure.spec.alpha/def :portkey.aws.fms.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.fms/error-message))
(clojure.spec.alpha/def :portkey.aws.fms/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms/customer-policy-scope-map (clojure.spec.alpha/map-of :portkey.aws.fms/customer-policy-scope-id-type :portkey.aws.fms/customer-policy-scope-id-list))

(clojure.spec.alpha/def :portkey.aws.fms/get-compliance-detail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms/policy-compliance-detail]))

(clojure.spec.alpha/def :portkey.aws.fms/customer-policy-scope-id-list (clojure.spec.alpha/coll-of :portkey.aws.fms/customer-policy-scope-id))

(clojure.spec.alpha/def :portkey.aws.fms.invalid-type-exception/message (clojure.spec.alpha/and :portkey.aws.fms/error-message))
(clojure.spec.alpha/def :portkey.aws.fms/invalid-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.invalid-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.fms/evaluation-results (clojure.spec.alpha/coll-of :portkey.aws.fms/evaluation-result))

(clojure.spec.alpha/def :portkey.aws.fms/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.evaluation-result/compliance-status (clojure.spec.alpha/and :portkey.aws.fms/policy-compliance-status-type))
(clojure.spec.alpha/def :portkey.aws.fms.evaluation-result/violator-count (clojure.spec.alpha/and :portkey.aws.fms/resource-count))
(clojure.spec.alpha/def :portkey.aws.fms.evaluation-result/evaluation-limit-exceeded (clojure.spec.alpha/and :portkey.aws.fms/boolean))
(clojure.spec.alpha/def :portkey.aws.fms/evaluation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.evaluation-result/compliance-status :portkey.aws.fms.evaluation-result/violator-count :portkey.aws.fms.evaluation-result/evaluation-limit-exceeded]))

(clojure.spec.alpha/def :portkey.aws.fms.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.fms/error-message))
(clojure.spec.alpha/def :portkey.aws.fms/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.fms/error-message))
(clojure.spec.alpha/def :portkey.aws.fms/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms/issue-info-map (clojure.spec.alpha/map-of :portkey.aws.fms/dependent-service-name :portkey.aws.fms/detailed-info))

(clojure.spec.alpha/def :portkey.aws.fms.get-compliance-detail-request/member-account (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms/get-compliance-detail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms/policy-id :portkey.aws.fms.get-compliance-detail-request/member-account] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms/customer-policy-scope-id-type #{:account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.fms/policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 36 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-status/policy-owner (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-status/policy-name (clojure.spec.alpha/and :portkey.aws.fms/resource-name))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-status/member-account (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.policy-compliance-status/last-updated (clojure.spec.alpha/and :portkey.aws.fms/time-stamp))
(clojure.spec.alpha/def :portkey.aws.fms/policy-compliance-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.policy-compliance-status/policy-owner :portkey.aws.fms/policy-id :portkey.aws.fms.policy-compliance-status/policy-name :portkey.aws.fms.policy-compliance-status/member-account :portkey.aws.fms/evaluation-results :portkey.aws.fms.policy-compliance-status/last-updated :portkey.aws.fms/issue-info-map]))

(clojure.spec.alpha/def :portkey.aws.fms/compliance-violator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms/resource-id :portkey.aws.fms/violation-reason :portkey.aws.fms/resource-type]))

(clojure.spec.alpha/def :portkey.aws.fms/get-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.fms/error-message))
(clojure.spec.alpha/def :portkey.aws.fms/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms/put-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.get-notification-channel-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.get-notification-channel-response/sns-role-name (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms/get-notification-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.get-notification-channel-response/sns-topic-arn :portkey.aws.fms.get-notification-channel-response/sns-role-name]))

(clojure.spec.alpha/def :portkey.aws.fms/member-accounts (clojure.spec.alpha/coll-of :portkey.aws.fms/aws-account-id))

(clojure.spec.alpha/def :portkey.aws.fms.delete-policy-request/delete-all-policy-resources (clojure.spec.alpha/and :portkey.aws.fms/boolean))
(clojure.spec.alpha/def :portkey.aws.fms/delete-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms/policy-id] :opt-un [:portkey.aws.fms.delete-policy-request/delete-all-policy-resources]))

(clojure.spec.alpha/def :portkey.aws.fms/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fms.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.fms/error-message))
(clojure.spec.alpha/def :portkey.aws.fms/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.get-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms/get-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms/policy :portkey.aws.fms.get-policy-response/policy-arn]))

(clojure.spec.alpha/def :portkey.aws.fms/policy-compliance-status-list (clojure.spec.alpha/coll-of :portkey.aws.fms/policy-compliance-status))

(clojure.spec.alpha/def :portkey.aws.fms/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.fms/policy-summary-list (clojure.spec.alpha/coll-of :portkey.aws.fms/policy-summary))

(clojure.spec.alpha/def :portkey.aws.fms.resource-tag/key (clojure.spec.alpha/and :portkey.aws.fms/tag-key))
(clojure.spec.alpha/def :portkey.aws.fms.resource-tag/value (clojure.spec.alpha/and :portkey.aws.fms/tag-value))
(clojure.spec.alpha/def :portkey.aws.fms/resource-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.resource-tag/key] :opt-un [:portkey.aws.fms.resource-tag/value]))

(clojure.spec.alpha/def :portkey.aws.fms/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.fms.list-policies-request/next-token (clojure.spec.alpha/and :portkey.aws.fms/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.list-policies-request/max-results (clojure.spec.alpha/and :portkey.aws.fms/pagination-max-results))
(clojure.spec.alpha/def :portkey.aws.fms/list-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.list-policies-request/next-token :portkey.aws.fms.list-policies-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.fms/resource-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.fms.get-admin-account-response/admin-account (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.get-admin-account-response/role-status (clojure.spec.alpha/and :portkey.aws.fms/account-role-status))
(clojure.spec.alpha/def :portkey.aws.fms/get-admin-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.get-admin-account-response/admin-account :portkey.aws.fms.get-admin-account-response/role-status]))

(clojure.spec.alpha/def :portkey.aws.fms/customer-policy-scope-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.put-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.fms/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms/put-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms/policy :portkey.aws.fms.put-policy-response/policy-arn]))

(clojure.spec.alpha/def :portkey.aws.fms/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms/security-service-type #{:waf "WAF"})

(clojure.spec.alpha/def :portkey.aws.fms.policy/policy-name (clojure.spec.alpha/and :portkey.aws.fms/resource-name))
(clojure.spec.alpha/def :portkey.aws.fms.policy/remediation-enabled (clojure.spec.alpha/and :portkey.aws.fms/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.policy/include-map (clojure.spec.alpha/and :portkey.aws.fms/customer-policy-scope-map))
(clojure.spec.alpha/def :portkey.aws.fms.policy/exclude-map (clojure.spec.alpha/and :portkey.aws.fms/customer-policy-scope-map))
(clojure.spec.alpha/def :portkey.aws.fms.policy/exclude-resource-tags (clojure.spec.alpha/and :portkey.aws.fms/boolean))
(clojure.spec.alpha/def :portkey.aws.fms/policy (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.policy/policy-name :portkey.aws.fms/security-service-policy-data :portkey.aws.fms/resource-type :portkey.aws.fms.policy/exclude-resource-tags :portkey.aws.fms.policy/remediation-enabled] :opt-un [:portkey.aws.fms/resource-tags :portkey.aws.fms.policy/include-map :portkey.aws.fms/policy-id :portkey.aws.fms.policy/exclude-map :portkey.aws.fms/policy-update-token]))

(clojure.spec.alpha/def :portkey.aws.fms/get-notification-channel-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.list-policies-response/policy-list (clojure.spec.alpha/and :portkey.aws.fms/policy-summary-list))
(clojure.spec.alpha/def :portkey.aws.fms.list-policies-response/next-token (clojure.spec.alpha/and :portkey.aws.fms/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms/list-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.list-policies-response/policy-list :portkey.aws.fms.list-policies-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.fms/managed-service-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms/detailed-info (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms/account-role-status #{:deleted :ready :creating :pending-deletion "READY" :deleting "DELETING" "CREATING" "PENDING_DELETION" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.fms.security-service-policy-data/type (clojure.spec.alpha/and :portkey.aws.fms/security-service-type))
(clojure.spec.alpha/def :portkey.aws.fms/security-service-policy-data (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.security-service-policy-data/type] :opt-un [:portkey.aws.fms/managed-service-data]))

(clojure.spec.alpha/def :portkey.aws.fms/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.fms/policy-update-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.associate-admin-account-request/admin-account (clojure.spec.alpha/and :portkey.aws.fms/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms/associate-admin-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.associate-admin-account-request/admin-account] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms/boolean clojure.core/boolean?)

(clojure.core/defn list-member-accounts "Returns a MemberAccounts object that lists the member accounts in the\nadministrator's AWS organization.\n The ListMemberAccounts must be submitted by the account that is set as the AWS\nFirewall Manager administrator." ([] (list-member-accounts {})) ([list-member-accounts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-member-accounts-request list-member-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/list-member-accounts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/list-member-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMemberAccounts", :http.request.configuration/output-deser-fn response-list-member-accounts-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-member-accounts :args (clojure.spec.alpha/? :portkey.aws.fms/list-member-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/list-member-accounts-response))

(clojure.core/defn associate-admin-account "Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must\nbe associated with the master account your AWS organization or associated with a\nmember account that has the appropriate permissions. If the account ID that you\nsubmit is not an AWS Organizations master account, AWS Firewall Manager will set\nthe appropriate permissions for the given member account.\n The account that you associate with AWS Firewall Manager is called the AWS\nFirewall Manager administrator account." ([associate-admin-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-admin-account-request associate-admin-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/associate-admin-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateAdminAccount", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InvalidInputException" :portkey.aws.fms/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef associate-admin-account :args (clojure.spec.alpha/tuple :portkey.aws.fms/associate-admin-account-request) :ret clojure.core/true?)

(clojure.core/defn list-policies "Returns an array of PolicySummary objects in the response." ([] (list-policies {})) ([list-policies-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/list-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPolicies", :http.request.configuration/output-deser-fn response-list-policies-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "LimitExceededException" :portkey.aws.fms/limit-exceeded-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.fms/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/list-policies-response))

(clojure.core/defn put-notification-channel "Designates the IAM role and Amazon Simple Notification Service (SNS) topic that\nAWS Firewall Manager uses to record SNS logs." ([put-notification-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-notification-channel-request put-notification-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/put-notification-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutNotificationChannel", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef put-notification-channel :args (clojure.spec.alpha/tuple :portkey.aws.fms/put-notification-channel-request) :ret clojure.core/true?)

(clojure.core/defn disassociate-admin-account "Disassociates the account that has been set as the AWS Firewall Manager\nadministrator account. To set a different account as the administrator account,\nyou must submit an AssociateAdminAccount request ." ([] (disassociate-admin-account {})) ([disassociate-admin-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-admin-account-request disassociate-admin-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/disassociate-admin-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateAdminAccount", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-admin-account :args (clojure.spec.alpha/? :portkey.aws.fms/disassociate-admin-account-request) :ret clojure.core/true?)

(clojure.core/defn get-compliance-detail "Returns detailed compliance information about the specified member account.\nDetails include resources that are in and out of compliance with the specified\npolicy. Resources are considered non-compliant if the specified policy has not\nbeen applied to them." ([get-compliance-detail-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-compliance-detail-request get-compliance-detail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/get-compliance-detail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/get-compliance-detail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetComplianceDetail", :http.request.configuration/output-deser-fn response-get-compliance-detail-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-compliance-detail :args (clojure.spec.alpha/tuple :portkey.aws.fms/get-compliance-detail-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/get-compliance-detail-response))

(clojure.core/defn get-notification-channel "Returns information about the Amazon Simple Notification Service (SNS) topic\nthat is used to record AWS Firewall Manager SNS logs." ([] (get-notification-channel {})) ([get-notification-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-notification-channel-request get-notification-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/get-notification-channel-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/get-notification-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetNotificationChannel", :http.request.configuration/output-deser-fn response-get-notification-channel-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-notification-channel :args (clojure.spec.alpha/? :portkey.aws.fms/get-notification-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/get-notification-channel-response))

(clojure.core/defn get-policy "Returns information about the specified AWS Firewall Manager policy." ([get-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/get-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPolicy", :http.request.configuration/output-deser-fn response-get-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception, "InvalidTypeException" :portkey.aws.fms/invalid-type-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.fms/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/get-policy-response))

(clojure.core/defn delete-notification-channel "Deletes an AWS Firewall Manager association with the IAM role and the Amazon\nSimple Notification Service (SNS) topic that is used to record AWS Firewall\nManager SNS logs." ([] (delete-notification-channel {})) ([delete-notification-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-notification-channel-request delete-notification-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/delete-notification-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotificationChannel", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-notification-channel :args (clojure.spec.alpha/? :portkey.aws.fms/delete-notification-channel-request) :ret clojure.core/true?)

(clojure.core/defn put-policy "Creates an AWS Firewall Manager policy." ([put-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-policy-request put-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/put-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/put-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPolicy", :http.request.configuration/output-deser-fn response-put-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InvalidInputException" :portkey.aws.fms/invalid-input-exception, "LimitExceededException" :portkey.aws.fms/limit-exceeded-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception, "InvalidTypeException" :portkey.aws.fms/invalid-type-exception}})))))
(clojure.spec.alpha/fdef put-policy :args (clojure.spec.alpha/tuple :portkey.aws.fms/put-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/put-policy-response))

(clojure.core/defn delete-policy "Permanently deletes an AWS Firewall Manager policy." ([delete-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/delete-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.fms/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-compliance-status "Returns an array of PolicyComplianceStatus objects in the response. Use\nPolicyComplianceStatus to get a summary of which member accounts are protected\nby the specified policy." ([list-compliance-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-compliance-status-request list-compliance-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/list-compliance-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/list-compliance-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListComplianceStatus", :http.request.configuration/output-deser-fn response-list-compliance-status-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-compliance-status :args (clojure.spec.alpha/tuple :portkey.aws.fms/list-compliance-status-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/list-compliance-status-response))

(clojure.core/defn get-admin-account "Returns the AWS Organizations master account that is associated with AWS\nFirewall Manager as the AWS Firewall Manager administrator." ([] (get-admin-account {})) ([get-admin-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-admin-account-request get-admin-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fms/endpoints, :http.request.configuration/target-prefix "AWSFMS_20180101", :http.request.spec/output-spec :portkey.aws.fms/get-admin-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms/get-admin-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAdminAccount", :http.request.configuration/output-deser-fn response-get-admin-account-response, :http.request.spec/error-spec {"InvalidOperationException" :portkey.aws.fms/invalid-operation-exception, "ResourceNotFoundException" :portkey.aws.fms/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-admin-account :args (clojure.spec.alpha/? :portkey.aws.fms/get-admin-account-request) :ret (clojure.spec.alpha/and :portkey.aws.fms/get-admin-account-response))
