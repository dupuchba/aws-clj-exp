(ns portkey.aws.waf-regional (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "waf-regional", :region "ap-northeast-1"},
    :ssl-common-name "waf-regional.ap-northeast-1.amazonaws.com",
    :endpoint "https://waf-regional.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "waf-regional", :region "eu-west-1"},
    :ssl-common-name "waf-regional.eu-west-1.amazonaws.com",
    :endpoint "https://waf-regional.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "waf-regional", :region "us-east-2"},
    :ssl-common-name "waf-regional.us-east-2.amazonaws.com",
    :endpoint "https://waf-regional.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "waf-regional", :region "ap-southeast-2"},
    :ssl-common-name "waf-regional.ap-southeast-2.amazonaws.com",
    :endpoint "https://waf-regional.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "waf-regional", :region "eu-central-1"},
    :ssl-common-name "waf-regional.eu-central-1.amazonaws.com",
    :endpoint "https://waf-regional.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "waf-regional", :region "us-west-2"},
    :ssl-common-name "waf-regional.us-west-2.amazonaws.com",
    :endpoint "https://waf-regional.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "waf-regional", :region "us-east-1"},
    :ssl-common-name "waf-regional.us-east-1.amazonaws.com",
    :endpoint "https://waf-regional.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "waf-regional", :region "us-west-1"},
    :ssl-common-name "waf-regional.us-west-1.amazonaws.com",
    :endpoint "https://waf-regional.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-change-token)

(clojure.core/declare ser-rule-updates)

(clojure.core/declare ser-positional-constraint)

(clojure.core/declare ser-text-transformation)

(clojure.core/declare ser-geo-match-constraint-type)

(clojure.core/declare ser-rule-priority)

(clojure.core/declare ser-byte-match-tuple)

(clojure.core/declare ser-waf-action-type)

(clojure.core/declare ser-geo-match-constraint)

(clojure.core/declare ser-field-to-match)

(clojure.core/declare ser-waf-override-action)

(clojure.core/declare ser-size-constraint)

(clojure.core/declare ser-ip-set-update)

(clojure.core/declare ser-excluded-rule)

(clojure.core/declare ser-rate-key)

(clojure.core/declare ser-change-action)

(clojure.core/declare ser-ip-set-descriptor-value)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-regex-pattern-string)

(clojure.core/declare ser-sql-injection-match-set-updates)

(clojure.core/declare ser-web-acl-updates)

(clojure.core/declare ser-byte-match-set-update)

(clojure.core/declare ser-sql-injection-match-tuple)

(clojure.core/declare ser-ip-set-descriptor-type)

(clojure.core/declare ser-time-window)

(clojure.core/declare ser-policy-string)

(clojure.core/declare ser-redacted-fields)

(clojure.core/declare ser-pagination-limit)

(clojure.core/declare ser-rule-group-update)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-log-destination-configs)

(clojure.core/declare ser-rule-update)

(clojure.core/declare ser-xss-match-tuple)

(clojure.core/declare ser-byte-match-set-updates)

(clojure.core/declare ser-waf-action)

(clojure.core/declare ser-regex-pattern-set-updates)

(clojure.core/declare ser-ip-set-descriptor)

(clojure.core/declare ser-size-constraint-set-update)

(clojure.core/declare ser-excluded-rules)

(clojure.core/declare ser-xss-match-set-update)

(clojure.core/declare ser-regex-match-set-updates)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-size)

(clojure.core/declare ser-ip-set-updates)

(clojure.core/declare ser-geo-match-constraint-value)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-match-field-type)

(clojure.core/declare ser-regex-match-set-update)

(clojure.core/declare ser-rule-group-updates)

(clojure.core/declare ser-match-field-data)

(clojure.core/declare ser-next-marker)

(clojure.core/declare ser-xss-match-set-updates)

(clojure.core/declare ser-logging-configuration)

(clojure.core/declare ser-size-constraint-set-updates)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-waf-rule-type)

(clojure.core/declare ser-sql-injection-match-set-update)

(clojure.core/declare ser-predicate-type)

(clojure.core/declare ser-geo-match-set-updates)

(clojure.core/declare ser-regex-match-tuple)

(clojure.core/declare ser-predicate)

(clojure.core/declare ser-activated-rule)

(clojure.core/declare ser-geo-match-set-update)

(clojure.core/declare ser-web-acl-update)

(clojure.core/declare ser-byte-match-target-string)

(clojure.core/declare ser-regex-pattern-set-update)

(clojure.core/declare ser-waf-override-action-type)

(clojure.core/declare ser-rate-limit)

(clojure.core/declare ser-negated)

(clojure.core/declare ser-get-sampled-requests-max-items)

(clojure.core/defn- ser-change-token [input] #:http.request.field{:value input, :shape "ChangeToken"})

(clojure.core/defn- ser-rule-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-update coll) #:http.request.field{:shape "RuleUpdate"}))) input), :shape "RuleUpdates", :type "list"})

(clojure.core/defn- ser-positional-constraint [input] #:http.request.field{:value (clojure.core/get {:starts-with "STARTS_WITH", :exactly "EXACTLY", :contains "CONTAINS", "CONTAINS" "CONTAINS", "EXACTLY" "EXACTLY", :contains-word "CONTAINS_WORD", "CONTAINS_WORD" "CONTAINS_WORD", "ENDS_WITH" "ENDS_WITH", "STARTS_WITH" "STARTS_WITH", :ends-with "ENDS_WITH"} input), :shape "PositionalConstraint"})

(clojure.core/defn- ser-text-transformation [input] #:http.request.field{:value (clojure.core/get {"HTML_ENTITY_DECODE" "HTML_ENTITY_DECODE", :compress-white-space "COMPRESS_WHITE_SPACE", :lowercase "LOWERCASE", "URL_DECODE" "URL_DECODE", "LOWERCASE" "LOWERCASE", "NONE" "NONE", :html-entity-decode "HTML_ENTITY_DECODE", "COMPRESS_WHITE_SPACE" "COMPRESS_WHITE_SPACE", "CMD_LINE" "CMD_LINE", :url-decode "URL_DECODE", :cmd-line "CMD_LINE", :none "NONE"} input), :shape "TextTransformation"})

(clojure.core/defn- ser-geo-match-constraint-type [input] #:http.request.field{:value (clojure.core/get {"Country" "Country", :country "Country"} input), :shape "GeoMatchConstraintType"})

(clojure.core/defn- ser-rule-priority [input] #:http.request.field{:value input, :shape "RulePriority"})

(clojure.core/defn- ser-byte-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-byte-match-target-string (:target-string input)) #:http.request.field{:name "TargetString", :shape "ByteMatchTargetString"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"}) (clojure.core/into (ser-positional-constraint (:positional-constraint input)) #:http.request.field{:name "PositionalConstraint", :shape "PositionalConstraint"})], :shape "ByteMatchTuple", :type "structure"}))

(clojure.core/defn- ser-waf-action-type [input] #:http.request.field{:value (clojure.core/get {"BLOCK" "BLOCK", :block "BLOCK", "ALLOW" "ALLOW", :allow "ALLOW", "COUNT" "COUNT", :count "COUNT"} input), :shape "WafActionType"})

(clojure.core/defn- ser-geo-match-constraint [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-match-constraint-type (:type input)) #:http.request.field{:name "Type", :shape "GeoMatchConstraintType"}) (clojure.core/into (ser-geo-match-constraint-value (:value input)) #:http.request.field{:name "Value", :shape "GeoMatchConstraintValue"})], :shape "GeoMatchConstraint", :type "structure"}))

(clojure.core/defn- ser-field-to-match [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-match-field-type (:type input)) #:http.request.field{:name "Type", :shape "MatchFieldType"})], :shape "FieldToMatch", :type "structure"} (clojure.core/contains? input :data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-match-field-data (input :data)) #:http.request.field{:name "Data", :shape "MatchFieldData"}))))

(clojure.core/defn- ser-waf-override-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-waf-override-action-type (:type input)) #:http.request.field{:name "Type", :shape "WafOverrideActionType"})], :shape "WafOverrideAction", :type "structure"}))

(clojure.core/defn- ser-size-constraint [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"}) (clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"}) (clojure.core/into (ser-size (:size input)) #:http.request.field{:name "Size", :shape "Size"})], :shape "SizeConstraint", :type "structure"}))

(clojure.core/defn- ser-ip-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-ip-set-descriptor (:ip-set-descriptor input)) #:http.request.field{:name "IPSetDescriptor", :shape "IPSetDescriptor"})], :shape "IPSetUpdate", :type "structure"}))

(clojure.core/defn- ser-excluded-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-id (:rule-id input)) #:http.request.field{:name "RuleId", :shape "ResourceId"})], :shape "ExcludedRule", :type "structure"}))

(clojure.core/defn- ser-rate-key [input] #:http.request.field{:value (clojure.core/get {"IP" "IP", :ip "IP"} input), :shape "RateKey"})

(clojure.core/defn- ser-change-action [input] #:http.request.field{:value (clojure.core/get {"INSERT" "INSERT", :insert "INSERT", "DELETE" "DELETE", :delete "DELETE"} input), :shape "ChangeAction"})

(clojure.core/defn- ser-ip-set-descriptor-value [input] #:http.request.field{:value input, :shape "IPSetDescriptorValue"})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {:ge "GE", :eq "EQ", "NE" "NE", "LT" "LT", "GE" "GE", "LE" "LE", :gt "GT", "EQ" "EQ", :ne "NE", "GT" "GT", :le "LE", :lt "LT"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-regex-pattern-string [input] #:http.request.field{:value input, :shape "RegexPatternString"})

(clojure.core/defn- ser-sql-injection-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sql-injection-match-set-update coll) #:http.request.field{:shape "SqlInjectionMatchSetUpdate"}))) input), :shape "SqlInjectionMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-web-acl-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-web-acl-update coll) #:http.request.field{:shape "WebACLUpdate"}))) input), :shape "WebACLUpdates", :type "list"})

(clojure.core/defn- ser-byte-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-byte-match-tuple (:byte-match-tuple input)) #:http.request.field{:name "ByteMatchTuple", :shape "ByteMatchTuple"})], :shape "ByteMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-sql-injection-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"})], :shape "SqlInjectionMatchTuple", :type "structure"}))

(clojure.core/defn- ser-ip-set-descriptor-type [input] #:http.request.field{:value (clojure.core/get {"IPV4" "IPV4", :ipv-4 "IPV4", "IPV6" "IPV6", :ipv-6 "IPV6"} input), :shape "IPSetDescriptorType"})

(clojure.core/defn- ser-time-window [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:start-time input)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (:end-time input)) #:http.request.field{:name "EndTime", :shape "Timestamp"})], :shape "TimeWindow", :type "structure"}))

(clojure.core/defn- ser-policy-string [input] #:http.request.field{:value input, :shape "PolicyString"})

(clojure.core/defn- ser-redacted-fields [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-field-to-match coll) #:http.request.field{:shape "FieldToMatch"}))) input), :shape "RedactedFields", :type "list"})

(clojure.core/defn- ser-pagination-limit [input] #:http.request.field{:value input, :shape "PaginationLimit"})

(clojure.core/defn- ser-rule-group-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-activated-rule (:activated-rule input)) #:http.request.field{:name "ActivatedRule", :shape "ActivatedRule"})], :shape "RuleGroupUpdate", :type "structure"}))

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-log-destination-configs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "LogDestinationConfigs", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-rule-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-predicate (:predicate input)) #:http.request.field{:name "Predicate", :shape "Predicate"})], :shape "RuleUpdate", :type "structure"}))

(clojure.core/defn- ser-xss-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"})], :shape "XssMatchTuple", :type "structure"}))

(clojure.core/defn- ser-byte-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-byte-match-set-update coll) #:http.request.field{:shape "ByteMatchSetUpdate"}))) input), :shape "ByteMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-waf-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-waf-action-type (:type input)) #:http.request.field{:name "Type", :shape "WafActionType"})], :shape "WafAction", :type "structure"}))

(clojure.core/defn- ser-regex-pattern-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-regex-pattern-set-update coll) #:http.request.field{:shape "RegexPatternSetUpdate"}))) input), :shape "RegexPatternSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-ip-set-descriptor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ip-set-descriptor-type (:type input)) #:http.request.field{:name "Type", :shape "IPSetDescriptorType"}) (clojure.core/into (ser-ip-set-descriptor-value (:value input)) #:http.request.field{:name "Value", :shape "IPSetDescriptorValue"})], :shape "IPSetDescriptor", :type "structure"}))

(clojure.core/defn- ser-size-constraint-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-size-constraint (:size-constraint input)) #:http.request.field{:name "SizeConstraint", :shape "SizeConstraint"})], :shape "SizeConstraintSetUpdate", :type "structure"}))

(clojure.core/defn- ser-excluded-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-excluded-rule coll) #:http.request.field{:shape "ExcludedRule"}))) input), :shape "ExcludedRules", :type "list"})

(clojure.core/defn- ser-xss-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-xss-match-tuple (:xss-match-tuple input)) #:http.request.field{:name "XssMatchTuple", :shape "XssMatchTuple"})], :shape "XssMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-regex-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-regex-match-set-update coll) #:http.request.field{:shape "RegexMatchSetUpdate"}))) input), :shape "RegexMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-size [input] #:http.request.field{:value input, :shape "Size"})

(clojure.core/defn- ser-ip-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-set-update coll) #:http.request.field{:shape "IPSetUpdate"}))) input), :shape "IPSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-geo-match-constraint-value [input] #:http.request.field{:value (clojure.core/get {:mm "MM", "CR" "CR", :tw "TW", "TG" "TG", :fr "FR", "TJ" "TJ", "ZA" "ZA", "IM" "IM", "PE" "PE", :ni "NI", :bd "BD", "LC" "LC", :gh "GH", "CH" "CH", :kp "KP", :mh "MH", "RU" "RU", :tv "TV", :gu "GU", :bt "BT", "MP" "MP", "CK" "CK", "SI" "SI", :lr "LR", "AU" "AU", "KR" "KR", "IT" "IT", "FI" "FI", :gn "GN", "GF" "GF", :ge "GE", :az "AZ", "SC" "SC", "SX" "SX", :fo "FO", "TT" "TT", :kh "KH", "TK" "TK", :rw "RW", :sz "SZ", "MY" "MY", "SY" "SY", "MN" "MN", "TF" "TF", "KP" "KP", :ma "MA", "AM" "AM", :ws "WS", "DZ" "DZ", :mv "MV", :hr "HR", "UY" "UY", :gp "GP", :es "ES", :io "IO", "TD" "TD", "DJ" "DJ", :pt "PT", :vg "VG", :cz "CZ", "BI" "BI", "MK" "MK", :gm "GM", "MU" "MU", "LI" "LI", :pg "PG", :pe "PE", :pk "PK", "NU" "NU", :lu "LU", "GR" "GR", "GY" "GY", :fi "FI", "CG" "CG", :ax "AX", :bz "BZ", :ga "GA", :pf "PF", "NF" "NF", :do "DO", "ML" "ML", "AX" "AX", "GM" "GM", :cl "CL", "SA" "SA", :ye "YE", :au "AU", "CX" "CX", "BH" "BH", :bb "BB", "NE" "NE", :er "ER", :bi "BI", :tl "TL", "BN" "BN", "MF" "MF", "CD" "CD", "DK" "DK", :is "IS", :be "BE", "BJ" "BJ", :ug "UG", :ba "BA", :tc "TC", :cv "CV", :kg "KG", "ME" "ME", "SJ" "SJ", :dk "DK", "BO" "BO", :sm "SM", "JO" "JO", "CV" "CV", "VE" "VE", "CI" "CI", :gb "GB", "UZ" "UZ", :cu "CU", :mo "MO", :dm "DM", "TN" "TN", :cd "CD", "IS" "IS", :ca "CA", :as "AS", :ro "RO", :sy "SY", :nc "NC", :td "TD", :li "LI", :ai "AI", :tz "TZ", :sl "SL", "EH" "EH", :bj "BJ", "TM" "TM", "GA" "GA", :th "TH", "LS" "LS", "TZ" "TZ", :jp "JP", :ua "UA", "AT" "AT", :tr "TR", :et "ET", :lc "LC", :re "RE", :bl "BL", :aw "AW", :lk "LK", :us "US", "LT" "LT", :hu "HU", "NP" "NP", :sg "SG", "BG" "BG", :mw "MW", "IL" "IL", "GU" "GU", "PK" "PK", :ec "EC", :mr "MR", :uz "UZ", "PT" "PT", :gg "GG", "HR" "HR", "VU" "VU", "PF" "PF", "BM" "BM", :cr "CR", "MR" "MR", "GE" "GE", "HU" "HU", "TW" "TW", "MM" "MM", :nz "NZ", :tn "TN", :gy "GY", :fj "FJ", :ci "CI", :cc "CC", :la "LA", "VG" "VG", "YE" "YE", :so "SO", :kn "KN", "SR" "SR", :mq "MQ", "PN" "PN", :zw "ZW", :af "AF", "VA" "VA", "PR" "PR", "KW" "KW", :sa "SA", "SE" "SE", "GB" "GB", :cg "CG", :tf "TF", :pl "PL", "UM" "UM", "VN" "VN", "CF" "CF", "PA" "PA", "VC" "VC", :gq "GQ", "JP" "JP", :ls "LS", :je "JE", "IR" "IR", :zm "ZM", "AF" "AF", :vn "VN", "LY" "LY", :tj "TJ", "MZ" "MZ", "RO" "RO", "QA" "QA", "CM" "CM", "GG" "GG", :dj "DJ", "BY" "BY", :ch "CH", :kw "KW", :am "AM", "SD" "SD", :ck "CK", "BQ" "BQ", "MO" "MO", "KY" "KY", :tm "TM", "AR" "AR", :jo "JO", :sb "SB", :mf "MF", :eh "EH", :it "IT", :ht "HT", :om "OM", "BR" "BR", :cm "CM", "ZW" "ZW", :bh "BH", "NR" "NR", "NZ" "NZ", "AW" "AW", :gr "GR", :pw "PW", :gw "GW", "FJ" "FJ", :co "CO", :ml "ML", "ID" "ID", "SV" "SV", "CN" "CN", :tt "TT", "FM" "FM", :uy "UY", "HT" "HT", "CC" "CC", "RW" "RW", "BA" "BA", :nu "NU", :mk "MK", "TL" "TL", :rs "RS", :nl "NL", "JM" "JM", "KM" "KM", :mz "MZ", "KE" "KE", "WS" "WS", "TO" "TO", :bv "BV", "PY" "PY", "SH" "SH", :iq "IQ", "CY" "CY", :sj "SJ", :bf "BF", "GH" "GH", "MA" "MA", :vc "VC", "SG" "SG", :bn "BN", "LK" "LK", :gd "GD", "PH" "PH", "SM" "SM", :lb "LB", :pa "PA", :va "VA", "WF" "WF", "TR" "TR", "PS" "PS", "BZ" "BZ", "CU" "CU", "TV" "TV", :za "ZA", :mn "MN", "AD" "AD", "SB" "SB", "DM" "DM", "LR" "LR", :np "NP", :al "AL", "OM" "OM", "SO" "SO", :sk "SK", :kz "KZ", :na "NA", :ie "IE", "DO" "DO", :ag "AG", :st "ST", "AL" "AL", "BL" "BL", :de "DE", "FR" "FR", "GW" "GW", :qa "QA", :nr "NR", :cx "CX", :id "ID", "MS" "MS", "BB" "BB", "CA" "CA", :mx "MX", :gt "GT", :pm "PM", :jm "JM", "MG" "MG", :cy "CY", :ar "AR", "KH" "KH", "LA" "LA", :at "AT", "GP" "GP", "BV" "BV", "HN" "HN", :aq "AQ", "TH" "TH", :ke "KE", "DE" "DE", "LB" "LB", :gf "GF", "KZ" "KZ", "AS" "AS", "EC" "EC", :ao "AO", :il "IL", "NO" "NO", :cf "CF", "AO" "AO", "FK" "FK", :ss "SS", "ET" "ET", "GS" "GS", "MD" "MD", :ru "RU", :gl "GL", :se "SE", "AG" "AG", "BE" "BE", :ph "PH", :bs "BS", "MV" "MV", "SZ" "SZ", "CZ" "CZ", "CL" "CL", :gi "GI", "BT" "BT", :sc "SC", "NL" "NL", :sd "SD", "EG" "EG", :sx "SX", :ve "VE", :sn "SN", "MQ" "MQ", :bw "BW", :km "KM", :ee "EE", "SN" "SN", :by "BY", "FO" "FO", :br "BR", "EE" "EE", "AQ" "AQ", "ST" "ST", "KN" "KN", "BW" "BW", "MH" "MH", "NI" "NI", "PG" "PG", :sv "SV", "VI" "VI", :sh "SH", "IQ" "IQ", :mu "MU", :ne "NE", "KG" "KG", :hk "HK", :dz "DZ", :mg "MG", "US" "US", "ZM" "ZM", "MC" "MC", "GI" "GI", "NC" "NC", :hm "HM", "GT" "GT", :mc "MC", :eg "EG", "BF" "BF", "YT" "YT", :ir "IR", :fk "FK", "LU" "LU", :me "ME", "UA" "UA", :ki "KI", "IE" "IE", "LV" "LV", "GD" "GD", :bm "BM", :ad "AD", "MW" "MW", :ae "AE", :my "MY", "BS" "BS", :bg "BG", :lt "LT", :ms "MS", "AZ" "AZ", :bq "BQ", :wf "WF", "SK" "SK", :hn "HN", :um "UM", :ng "NG", :pr "PR", "GQ" "GQ", "TC" "TC", :py "PY", :yt "YT", "RE" "RE", "IN" "IN", "ES" "ES", :ly "LY", "GL" "GL", :lv "LV", :gs "GS", :tk "TK", "KI" "KI", :mt "MT", :mp "MP", "HK" "HK", :kr "KR", "CO" "CO", "SS" "SS", "RS" "RS", "IO" "IO", :im "IM", "NG" "NG", :cw "CW", :fm "FM", :pn "PN", :sr "SR", "UG" "UG", "CW" "CW", "SL" "SL", :si "SI", "ER" "ER", "JE" "JE", :tg "TG", :cn "CN", "AE" "AE", :vi "VI", "HM" "HM", :no "NO", :ps "PS", "PM" "PM", "BD" "BD", "MT" "MT", "AI" "AI", :bo "BO", "GN" "GN", :in "IN", "PW" "PW", :vu "VU", :md "MD", :to "TO", "NA" "NA", "MX" "MX", :nf "NF", :ky "KY", "PL" "PL"} input), :shape "GeoMatchConstraintValue"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"APPLICATION_LOAD_BALANCER" "APPLICATION_LOAD_BALANCER", :application-load-balancer "APPLICATION_LOAD_BALANCER", "API_GATEWAY" "API_GATEWAY", :api-gateway "API_GATEWAY"} input), :shape "ResourceType"})

(clojure.core/defn- ser-match-field-type [input] #:http.request.field{:value (clojure.core/get {"SINGLE_QUERY_ARG" "SINGLE_QUERY_ARG", "QUERY_STRING" "QUERY_STRING", :method "METHOD", :header "HEADER", "METHOD" "METHOD", "HEADER" "HEADER", :all-query-args "ALL_QUERY_ARGS", "URI" "URI", "ALL_QUERY_ARGS" "ALL_QUERY_ARGS", "BODY" "BODY", :uri "URI", :query-string "QUERY_STRING", :single-query-arg "SINGLE_QUERY_ARG", :body "BODY"} input), :shape "MatchFieldType"})

(clojure.core/defn- ser-regex-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-regex-match-tuple (:regex-match-tuple input)) #:http.request.field{:name "RegexMatchTuple", :shape "RegexMatchTuple"})], :shape "RegexMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-rule-group-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-group-update coll) #:http.request.field{:shape "RuleGroupUpdate"}))) input), :shape "RuleGroupUpdates", :type "list", :min 1})

(clojure.core/defn- ser-match-field-data [input] #:http.request.field{:value input, :shape "MatchFieldData"})

(clojure.core/defn- ser-next-marker [input] #:http.request.field{:value input, :shape "NextMarker"})

(clojure.core/defn- ser-xss-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xss-match-set-update coll) #:http.request.field{:shape "XssMatchSetUpdate"}))) input), :shape "XssMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-logging-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-log-destination-configs (:log-destination-configs input)) #:http.request.field{:name "LogDestinationConfigs", :shape "LogDestinationConfigs"})], :shape "LoggingConfiguration", :type "structure"} (clojure.core/contains? input :redacted-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redacted-fields (input :redacted-fields)) #:http.request.field{:name "RedactedFields", :shape "RedactedFields"}))))

(clojure.core/defn- ser-size-constraint-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-size-constraint-set-update coll) #:http.request.field{:shape "SizeConstraintSetUpdate"}))) input), :shape "SizeConstraintSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-waf-rule-type [input] #:http.request.field{:value (clojure.core/get {"REGULAR" "REGULAR", :regular "REGULAR", "RATE_BASED" "RATE_BASED", :rate-based "RATE_BASED", "GROUP" "GROUP", :group "GROUP"} input), :shape "WafRuleType"})

(clojure.core/defn- ser-sql-injection-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-sql-injection-match-tuple (:sql-injection-match-tuple input)) #:http.request.field{:name "SqlInjectionMatchTuple", :shape "SqlInjectionMatchTuple"})], :shape "SqlInjectionMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-predicate-type [input] #:http.request.field{:value (clojure.core/get {:byte-match "ByteMatch", "SizeConstraint" "SizeConstraint", "XssMatch" "XssMatch", :ip-match "IPMatch", "GeoMatch" "GeoMatch", "SqlInjectionMatch" "SqlInjectionMatch", :regex-match "RegexMatch", :geo-match "GeoMatch", :sql-injection-match "SqlInjectionMatch", :xss-match "XssMatch", "ByteMatch" "ByteMatch", "RegexMatch" "RegexMatch", :size-constraint "SizeConstraint", "IPMatch" "IPMatch"} input), :shape "PredicateType"})

(clojure.core/defn- ser-geo-match-set-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-geo-match-set-update coll) #:http.request.field{:shape "GeoMatchSetUpdate"}))) input), :shape "GeoMatchSetUpdates", :type "list", :min 1})

(clojure.core/defn- ser-regex-match-tuple [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-to-match (:field-to-match input)) #:http.request.field{:name "FieldToMatch", :shape "FieldToMatch"}) (clojure.core/into (ser-text-transformation (:text-transformation input)) #:http.request.field{:name "TextTransformation", :shape "TextTransformation"}) (clojure.core/into (ser-resource-id (:regex-pattern-set-id input)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"})], :shape "RegexMatchTuple", :type "structure"}))

(clojure.core/defn- ser-predicate [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-negated (:negated input)) #:http.request.field{:name "Negated", :shape "Negated"}) (clojure.core/into (ser-predicate-type (:type input)) #:http.request.field{:name "Type", :shape "PredicateType"}) (clojure.core/into (ser-resource-id (:data-id input)) #:http.request.field{:name "DataId", :shape "ResourceId"})], :shape "Predicate", :type "structure"}))

(clojure.core/defn- ser-activated-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rule-priority (:priority input)) #:http.request.field{:name "Priority", :shape "RulePriority"}) (clojure.core/into (ser-resource-id (:rule-id input)) #:http.request.field{:name "RuleId", :shape "ResourceId"})], :shape "ActivatedRule", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-action (input :action)) #:http.request.field{:name "Action", :shape "WafAction"})) (clojure.core/contains? input :override-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-override-action (input :override-action)) #:http.request.field{:name "OverrideAction", :shape "WafOverrideAction"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-rule-type (input :type)) #:http.request.field{:name "Type", :shape "WafRuleType"})) (clojure.core/contains? input :excluded-rules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-excluded-rules (input :excluded-rules)) #:http.request.field{:name "ExcludedRules", :shape "ExcludedRules"}))))

(clojure.core/defn- ser-geo-match-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-geo-match-constraint (:geo-match-constraint input)) #:http.request.field{:name "GeoMatchConstraint", :shape "GeoMatchConstraint"})], :shape "GeoMatchSetUpdate", :type "structure"}))

(clojure.core/defn- ser-web-acl-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-activated-rule (:activated-rule input)) #:http.request.field{:name "ActivatedRule", :shape "ActivatedRule"})], :shape "WebACLUpdate", :type "structure"}))

(clojure.core/defn- ser-byte-match-target-string [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ByteMatchTargetString"})

(clojure.core/defn- ser-regex-pattern-set-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-regex-pattern-string (:regex-pattern-string input)) #:http.request.field{:name "RegexPatternString", :shape "RegexPatternString"})], :shape "RegexPatternSetUpdate", :type "structure"}))

(clojure.core/defn- ser-waf-override-action-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "COUNT" "COUNT", :count "COUNT"} input), :shape "WafOverrideActionType"})

(clojure.core/defn- ser-rate-limit [input] #:http.request.field{:value input, :shape "RateLimit"})

(clojure.core/defn- ser-negated [input] #:http.request.field{:value input, :shape "Negated"})

(clojure.core/defn- ser-get-sampled-requests-max-items [input] #:http.request.field{:value input, :shape "GetSampledRequestsMaxItems"})

(clojure.core/defn- req-get-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-subscribed-rule-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :xss-match-set-id)) #:http.request.field{:name "XssMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-xss-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "XssMatchSetUpdates"})]}))

(clojure.core/defn- req-get-rate-based-rule-managed-keys-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"})]} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"}))))

(clojure.core/defn- req-list-byte-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-update-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-pattern-set-id)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"}) (clojure.core/into (ser-regex-pattern-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RegexPatternSetUpdates"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-geo-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-pattern-set-id)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-update-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :sql-injection-match-set-id)) #:http.request.field{:name "SqlInjectionMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-sql-injection-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "SqlInjectionMatchSetUpdates"})]}))

(clojure.core/defn- req-delete-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :sql-injection-match-set-id)) #:http.request.field{:name "SqlInjectionMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-create-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-ip-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-get-sampled-requests-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebAclId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-time-window (input :time-window)) #:http.request.field{:name "TimeWindow", :shape "TimeWindow"}) (clojure.core/into (ser-get-sampled-requests-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "GetSampledRequestsMaxItems"})]}))

(clojure.core/defn- req-associate-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"}) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-create-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :xss-match-set-id)) #:http.request.field{:name "XssMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-logging-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-get-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-rate-based-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-delete-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-rule-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RuleUpdates"})]}))

(clojure.core/defn- req-list-resources-for-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"})]} (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceType"}))))

(clojure.core/defn- req-delete-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :geo-match-set-id)) #:http.request.field{:name "GeoMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-permission-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-create-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-logging-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-list-web-ac-ls-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-list-regex-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-create-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :ip-set-id)) #:http.request.field{:name "IPSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-ip-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "IPSetUpdates"})]}))

(clojure.core/defn- req-put-logging-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-logging-configuration (input :logging-configuration)) #:http.request.field{:name "LoggingConfiguration", :shape "LoggingConfiguration"})]}))

(clojure.core/defn- req-get-change-token-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]} (clojure.core/contains? input :updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-web-acl-updates (input :updates)) #:http.request.field{:name "Updates", :shape "WebACLUpdates"})) (clojure.core/contains? input :default-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-waf-action (input :default-action)) #:http.request.field{:name "DefaultAction", :shape "WafAction"}))))

(clojure.core/defn- req-create-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-delete-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-match-set-id)) #:http.request.field{:name "RegexMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :geo-match-set-id)) #:http.request.field{:name "GeoMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-geo-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "GeoMatchSetUpdates"})]}))

(clojure.core/defn- req-get-web-acl-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-get-change-token-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-disassociate-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-delete-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-xss-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-list-size-constraint-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-delete-permission-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-delete-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-pattern-set-id)) #:http.request.field{:name "RegexPatternSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-rule-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-update-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :byte-match-set-id)) #:http.request.field{:name "ByteMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-byte-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "ByteMatchSetUpdates"})]}))

(clojure.core/defn- req-get-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-match-set-id)) #:http.request.field{:name "RegexMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-update-regex-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :regex-match-set-id)) #:http.request.field{:name "RegexMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-regex-match-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RegexMatchSetUpdates"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :sql-injection-match-set-id)) #:http.request.field{:name "SqlInjectionMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-geo-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :geo-match-set-id)) #:http.request.field{:name "GeoMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-create-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-rate-key (input :rate-key)) #:http.request.field{:name "RateKey", :shape "RateKey"}) (clojure.core/into (ser-rate-limit (input :rate-limit)) #:http.request.field{:name "RateLimit", :shape "RateLimit"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-create-sql-injection-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :size-constraint-set-id)) #:http.request.field{:name "SizeConstraintSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-regex-pattern-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :ip-set-id)) #:http.request.field{:name "IPSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-activated-rules-in-rule-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :rule-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"})) (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-delete-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-regex-pattern-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-list-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-update-rule-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-group-id)) #:http.request.field{:name "RuleGroupId", :shape "ResourceId"}) (clojure.core/into (ser-rule-group-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RuleGroupUpdates"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-list-logging-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/defn- req-delete-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :size-constraint-set-id)) #:http.request.field{:name "SizeConstraintSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-delete-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :byte-match-set-id)) #:http.request.field{:name "ByteMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-update-rate-based-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :rule-id)) #:http.request.field{:name "RuleId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-rule-updates (input :updates)) #:http.request.field{:name "Updates", :shape "RuleUpdates"}) (clojure.core/into (ser-rate-limit (input :rate-limit)) #:http.request.field{:name "RateLimit", :shape "RateLimit"})]}))

(clojure.core/defn- req-update-size-constraint-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :size-constraint-set-id)) #:http.request.field{:name "SizeConstraintSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"}) (clojure.core/into (ser-size-constraint-set-updates (input :updates)) #:http.request.field{:name "Updates", :shape "SizeConstraintSetUpdates"})]}))

(clojure.core/defn- req-delete-xss-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :xss-match-set-id)) #:http.request.field{:name "XssMatchSetId", :shape "ResourceId"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-get-byte-match-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :byte-match-set-id)) #:http.request.field{:name "ByteMatchSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :ip-set-id)) #:http.request.field{:name "IPSetId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-web-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-waf-action (input :default-action)) #:http.request.field{:name "DefaultAction", :shape "WafAction"}) (clojure.core/into (ser-change-token (input :change-token)) #:http.request.field{:name "ChangeToken", :shape "ChangeToken"})]}))

(clojure.core/defn- req-put-permission-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-policy-string (input :policy)) #:http.request.field{:name "Policy", :shape "PolicyString"})]}))

(clojure.core/defn- req-list-sql-injection-match-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-marker (input :next-marker)) #:http.request.field{:name "NextMarker", :shape "NextMarker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PaginationLimit"}))))

(clojure.core/declare deser-change-token)

(clojure.core/declare deser-positional-constraint)

(clojure.core/declare deser-rule-group-summary)

(clojure.core/declare deser-web-acl)

(clojure.core/declare deser-regex-pattern-strings)

(clojure.core/declare deser-activated-rules)

(clojure.core/declare deser-text-transformation)

(clojure.core/declare deser-geo-match-constraint-type)

(clojure.core/declare deser-regex-pattern-set)

(clojure.core/declare deser-regex-match-set-summaries)

(clojure.core/declare deser-subscribed-rule-group-summaries)

(clojure.core/declare deser-rule-priority)

(clojure.core/declare deser-byte-match-tuple)

(clojure.core/declare deser-country)

(clojure.core/declare deser-waf-action-type)

(clojure.core/declare deser-geo-match-constraints)

(clojure.core/declare deser-regex-pattern-set-summaries)

(clojure.core/declare deser-geo-match-constraint)

(clojure.core/declare deser-field-to-match)

(clojure.core/declare deser-geo-match-set-summaries)

(clojure.core/declare deser-ip-set-summary)

(clojure.core/declare deser-waf-override-action)

(clojure.core/declare deser-header-name)

(clojure.core/declare deser-ip-set)

(clojure.core/declare deser-rule-summary)

(clojure.core/declare deser-uri-string)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-geo-match-set-summary)

(clojure.core/declare deser-parameter-exception-reason)

(clojure.core/declare deser-size-constraint)

(clojure.core/declare deser-excluded-rule)

(clojure.core/declare deser-rate-key)

(clojure.core/declare deser-ip-set-descriptor-value)

(clojure.core/declare deser-rule-group-summaries)

(clojure.core/declare deser-geo-match-set)

(clojure.core/declare deser-comparison-operator)

(clojure.core/declare deser-regex-pattern-string)

(clojure.core/declare deser-resource-arns)

(clojure.core/declare deser-sampled-http-request)

(clojure.core/declare deser-sql-injection-match-tuple)

(clojure.core/declare deser-regex-pattern-set-summary)

(clojure.core/declare deser-ip-set-descriptor-type)

(clojure.core/declare deser-time-window)

(clojure.core/declare deser-policy-string)

(clojure.core/declare deser-redacted-fields)

(clojure.core/declare deser-web-acl-summaries)

(clojure.core/declare deser-size-constraint-set-summary)

(clojure.core/declare deser-size-constraint-set-summaries)

(clojure.core/declare deser-header-value)

(clojure.core/declare deser-population-size)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-parameter-exception-parameter)

(clojure.core/declare deser-log-destination-configs)

(clojure.core/declare deser-xss-match-tuple)

(clojure.core/declare deser-http-version)

(clojure.core/declare deser-xss-match-set-summary)

(clojure.core/declare deser-regex-match-set-summary)

(clojure.core/declare deser-xss-match-tuples)

(clojure.core/declare deser-ip-set-summaries)

(clojure.core/declare deser-size-constraints)

(clojure.core/declare deser-rate-based-rule)

(clojure.core/declare deser-http-headers)

(clojure.core/declare deser-waf-action)

(clojure.core/declare deser-ip-set-descriptor)

(clojure.core/declare deser-rule-summaries)

(clojure.core/declare deser-rule-group)

(clojure.core/declare deser-excluded-rules)

(clojure.core/declare deser-subscribed-rule-group-summary)

(clojure.core/declare deser-ip-set-descriptors)

(clojure.core/declare deser-web-acl-summary)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-size)

(clojure.core/declare deser-managed-keys)

(clojure.core/declare deser-geo-match-constraint-value)

(clojure.core/declare deser-http-header)

(clojure.core/declare deser-xss-match-set)

(clojure.core/declare deser-match-field-type)

(clojure.core/declare deser-rule)

(clojure.core/declare deser-byte-match-set)

(clojure.core/declare deser-sample-weight)

(clojure.core/declare deser-byte-match-set-summary)

(clojure.core/declare deser-match-field-data)

(clojure.core/declare deser-next-marker)

(clojure.core/declare deser-sampled-http-requests)

(clojure.core/declare deser-logging-configuration)

(clojure.core/declare deser-byte-match-tuples)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-sql-injection-match-set-summaries)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-predicates)

(clojure.core/declare deser-regex-match-tuples)

(clojure.core/declare deser-sql-injection-match-tuples)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-waf-rule-type)

(clojure.core/declare deser-logging-configurations)

(clojure.core/declare deser-predicate-type)

(clojure.core/declare deser-parameter-exception-field)

(clojure.core/declare deser-xss-match-set-summaries)

(clojure.core/declare deser-sql-injection-match-set)

(clojure.core/declare deser-regex-match-tuple)

(clojure.core/declare deser-action)

(clojure.core/declare deser-byte-match-set-summaries)

(clojure.core/declare deser-predicate)

(clojure.core/declare deser-sql-injection-match-set-summary)

(clojure.core/declare deser-ip-string)

(clojure.core/declare deser-activated-rule)

(clojure.core/declare deser-http-request)

(clojure.core/declare deser-size-constraint-set)

(clojure.core/declare deser-regex-match-set)

(clojure.core/declare deser-byte-match-target-string)

(clojure.core/declare deser-waf-override-action-type)

(clojure.core/declare deser-rate-limit)

(clojure.core/declare deser-negated)

(clojure.core/declare deser-managed-key)

(clojure.core/declare deser-change-token-status)

(clojure.core/declare deser-http-method)

(clojure.core/defn- deser-change-token [input] input)

(clojure.core/defn- deser-positional-constraint [input] (clojure.core/get {"EXACTLY" :exactly, "STARTS_WITH" :starts-with, "ENDS_WITH" :ends-with, "CONTAINS" :contains, "CONTAINS_WORD" :contains-word} input))

(clojure.core/defn- deser-rule-group-summary [input] (clojure.core/cond-> {:rule-group-id (deser-resource-id (input "RuleGroupId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-web-acl [input] (clojure.core/cond-> {:web-acl-id (deser-resource-id (input "WebACLId")), :default-action (deser-waf-action (input "DefaultAction")), :rules (deser-activated-rules (input "Rules"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (input "MetricName"))) (clojure.core/contains? input "WebACLArn") (clojure.core/assoc :web-acl-arn (deser-resource-arn (input "WebACLArn")))))

(clojure.core/defn- deser-regex-pattern-strings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-regex-pattern-string coll))) input))

(clojure.core/defn- deser-activated-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-activated-rule coll))) input))

(clojure.core/defn- deser-text-transformation [input] (clojure.core/get {"NONE" :none, "COMPRESS_WHITE_SPACE" :compress-white-space, "HTML_ENTITY_DECODE" :html-entity-decode, "LOWERCASE" :lowercase, "CMD_LINE" :cmd-line, "URL_DECODE" :url-decode} input))

(clojure.core/defn- deser-geo-match-constraint-type [input] (clojure.core/get {"Country" :country} input))

(clojure.core/defn- deser-regex-pattern-set [input] (clojure.core/cond-> {:regex-pattern-set-id (deser-resource-id (input "RegexPatternSetId")), :regex-pattern-strings (deser-regex-pattern-strings (input "RegexPatternStrings"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-regex-match-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-regex-match-set-summary coll))) input))

(clojure.core/defn- deser-subscribed-rule-group-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscribed-rule-group-summary coll))) input))

(clojure.core/defn- deser-rule-priority [input] input)

(clojure.core/defn- deser-byte-match-tuple [input] (clojure.core/cond-> {:field-to-match (deser-field-to-match (input "FieldToMatch")), :target-string (deser-byte-match-target-string (input "TargetString")), :text-transformation (deser-text-transformation (input "TextTransformation")), :positional-constraint (deser-positional-constraint (input "PositionalConstraint"))}))

(clojure.core/defn- deser-country [input] input)

(clojure.core/defn- deser-waf-action-type [input] (clojure.core/get {"BLOCK" :block, "ALLOW" :allow, "COUNT" :count} input))

(clojure.core/defn- deser-geo-match-constraints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-geo-match-constraint coll))) input))

(clojure.core/defn- deser-regex-pattern-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-regex-pattern-set-summary coll))) input))

(clojure.core/defn- deser-geo-match-constraint [input] (clojure.core/cond-> {:type (deser-geo-match-constraint-type (input "Type")), :value (deser-geo-match-constraint-value (input "Value"))}))

(clojure.core/defn- deser-field-to-match [input] (clojure.core/cond-> {:type (deser-match-field-type (input "Type"))} (clojure.core/contains? input "Data") (clojure.core/assoc :data (deser-match-field-data (input "Data")))))

(clojure.core/defn- deser-geo-match-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-geo-match-set-summary coll))) input))

(clojure.core/defn- deser-ip-set-summary [input] (clojure.core/cond-> {:ip-set-id (deser-resource-id (input "IPSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-waf-override-action [input] (clojure.core/cond-> {:type (deser-waf-override-action-type (input "Type"))}))

(clojure.core/defn- deser-header-name [input] input)

(clojure.core/defn- deser-ip-set [input] (clojure.core/cond-> {:ip-set-id (deser-resource-id (input "IPSetId")), :ip-set-descriptors (deser-ip-set-descriptors (input "IPSetDescriptors"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-rule-summary [input] (clojure.core/cond-> {:rule-id (deser-resource-id (input "RuleId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-uri-string [input] input)

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-geo-match-set-summary [input] (clojure.core/cond-> {:geo-match-set-id (deser-resource-id (input "GeoMatchSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-parameter-exception-reason [input] (clojure.core/get {"INVALID_OPTION" :invalid-option, "ILLEGAL_COMBINATION" :illegal-combination, "ILLEGAL_ARGUMENT" :illegal-argument} input))

(clojure.core/defn- deser-size-constraint [input] (clojure.core/cond-> {:field-to-match (deser-field-to-match (input "FieldToMatch")), :text-transformation (deser-text-transformation (input "TextTransformation")), :comparison-operator (deser-comparison-operator (input "ComparisonOperator")), :size (deser-size (input "Size"))}))

(clojure.core/defn- deser-excluded-rule [input] (clojure.core/cond-> {:rule-id (deser-resource-id (input "RuleId"))}))

(clojure.core/defn- deser-rate-key [input] (clojure.core/get {"IP" :ip} input))

(clojure.core/defn- deser-ip-set-descriptor-value [input] input)

(clojure.core/defn- deser-rule-group-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule-group-summary coll))) input))

(clojure.core/defn- deser-geo-match-set [input] (clojure.core/cond-> {:geo-match-set-id (deser-resource-id (input "GeoMatchSetId")), :geo-match-constraints (deser-geo-match-constraints (input "GeoMatchConstraints"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"EQ" :eq, "NE" :ne, "LE" :le, "LT" :lt, "GE" :ge, "GT" :gt} input))

(clojure.core/defn- deser-regex-pattern-string [input] input)

(clojure.core/defn- deser-resource-arns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-arn coll))) input))

(clojure.core/defn- deser-sampled-http-request [input] (clojure.core/cond-> {:request (deser-http-request (input "Request")), :weight (deser-sample-weight (input "Weight"))} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "Action") (clojure.core/assoc :action (deser-action (input "Action"))) (clojure.core/contains? input "RuleWithinRuleGroup") (clojure.core/assoc :rule-within-rule-group (deser-resource-id (input "RuleWithinRuleGroup")))))

(clojure.core/defn- deser-sql-injection-match-tuple [input] (clojure.core/cond-> {:field-to-match (deser-field-to-match (input "FieldToMatch")), :text-transformation (deser-text-transformation (input "TextTransformation"))}))

(clojure.core/defn- deser-regex-pattern-set-summary [input] (clojure.core/cond-> {:regex-pattern-set-id (deser-resource-id (input "RegexPatternSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-ip-set-descriptor-type [input] (clojure.core/get {"IPV4" :ipv-4, "IPV6" :ipv-6} input))

(clojure.core/defn- deser-time-window [input] (clojure.core/cond-> {:start-time (deser-timestamp (input "StartTime")), :end-time (deser-timestamp (input "EndTime"))}))

(clojure.core/defn- deser-policy-string [input] input)

(clojure.core/defn- deser-redacted-fields [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-to-match coll))) input))

(clojure.core/defn- deser-web-acl-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-web-acl-summary coll))) input))

(clojure.core/defn- deser-size-constraint-set-summary [input] (clojure.core/cond-> {:size-constraint-set-id (deser-resource-id (input "SizeConstraintSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-size-constraint-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-size-constraint-set-summary coll))) input))

(clojure.core/defn- deser-header-value [input] input)

(clojure.core/defn- deser-population-size [input] input)

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-parameter-exception-parameter [input] input)

(clojure.core/defn- deser-log-destination-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-arn coll))) input))

(clojure.core/defn- deser-xss-match-tuple [input] (clojure.core/cond-> {:field-to-match (deser-field-to-match (input "FieldToMatch")), :text-transformation (deser-text-transformation (input "TextTransformation"))}))

(clojure.core/defn- deser-http-version [input] input)

(clojure.core/defn- deser-xss-match-set-summary [input] (clojure.core/cond-> {:xss-match-set-id (deser-resource-id (input "XssMatchSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-regex-match-set-summary [input] (clojure.core/cond-> {:regex-match-set-id (deser-resource-id (input "RegexMatchSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-xss-match-tuples [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xss-match-tuple coll))) input))

(clojure.core/defn- deser-ip-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-set-summary coll))) input))

(clojure.core/defn- deser-size-constraints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-size-constraint coll))) input))

(clojure.core/defn- deser-rate-based-rule [input] (clojure.core/cond-> {:rule-id (deser-resource-id (input "RuleId")), :match-predicates (deser-predicates (input "MatchPredicates")), :rate-key (deser-rate-key (input "RateKey")), :rate-limit (deser-rate-limit (input "RateLimit"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (input "MetricName")))))

(clojure.core/defn- deser-http-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-http-header coll))) input))

(clojure.core/defn- deser-waf-action [input] (clojure.core/cond-> {:type (deser-waf-action-type (input "Type"))}))

(clojure.core/defn- deser-ip-set-descriptor [input] (clojure.core/cond-> {:type (deser-ip-set-descriptor-type (input "Type")), :value (deser-ip-set-descriptor-value (input "Value"))}))

(clojure.core/defn- deser-rule-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule-summary coll))) input))

(clojure.core/defn- deser-rule-group [input] (clojure.core/cond-> {:rule-group-id (deser-resource-id (input "RuleGroupId"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (input "MetricName")))))

(clojure.core/defn- deser-excluded-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-excluded-rule coll))) input))

(clojure.core/defn- deser-subscribed-rule-group-summary [input] (clojure.core/cond-> {:rule-group-id (deser-resource-id (input "RuleGroupId")), :name (deser-resource-name (input "Name")), :metric-name (deser-metric-name (input "MetricName"))}))

(clojure.core/defn- deser-ip-set-descriptors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-set-descriptor coll))) input))

(clojure.core/defn- deser-web-acl-summary [input] (clojure.core/cond-> {:web-acl-id (deser-resource-id (input "WebACLId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-size [input] input)

(clojure.core/defn- deser-managed-keys [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-key coll))) input))

(clojure.core/defn- deser-geo-match-constraint-value [input] (clojure.core/get {"CR" :cr, "TG" :tg, "TJ" :tj, "ZA" :za, "IM" :im, "PE" :pe, "LC" :lc, "CH" :ch, "RU" :ru, "MP" :mp, "CK" :ck, "SI" :si, "AU" :au, "KR" :kr, "IT" :it, "FI" :fi, "GF" :gf, "SC" :sc, "SX" :sx, "TT" :tt, "TK" :tk, "MY" :my, "SY" :sy, "MN" :mn, "TF" :tf, "KP" :kp, "AM" :am, "DZ" :dz, "UY" :uy, "TD" :td, "DJ" :dj, "BI" :bi, "MK" :mk, "MU" :mu, "LI" :li, "NU" :nu, "GR" :gr, "GY" :gy, "CG" :cg, "NF" :nf, "ML" :ml, "AX" :ax, "GM" :gm, "SA" :sa, "CX" :cx, "BH" :bh, "NE" :ne, "BN" :bn, "MF" :mf, "CD" :cd, "DK" :dk, "BJ" :bj, "ME" :me, "SJ" :sj, "BO" :bo, "JO" :jo, "CV" :cv, "VE" :ve, "CI" :ci, "UZ" :uz, "TN" :tn, "IS" :is, "EH" :eh, "TM" :tm, "GA" :ga, "LS" :ls, "TZ" :tz, "AT" :at, "LT" :lt, "NP" :np, "BG" :bg, "IL" :il, "GU" :gu, "PK" :pk, "PT" :pt, "HR" :hr, "VU" :vu, "PF" :pf, "BM" :bm, "MR" :mr, "GE" :ge, "HU" :hu, "TW" :tw, "MM" :mm, "VG" :vg, "YE" :ye, "SR" :sr, "PN" :pn, "VA" :va, "PR" :pr, "KW" :kw, "SE" :se, "GB" :gb, "UM" :um, "VN" :vn, "CF" :cf, "PA" :pa, "VC" :vc, "JP" :jp, "IR" :ir, "AF" :af, "LY" :ly, "MZ" :mz, "RO" :ro, "QA" :qa, "CM" :cm, "GG" :gg, "BY" :by, "SD" :sd, "BQ" :bq, "MO" :mo, "KY" :ky, "AR" :ar, "BR" :br, "ZW" :zw, "NR" :nr, "NZ" :nz, "AW" :aw, "FJ" :fj, "ID" :id, "SV" :sv, "CN" :cn, "FM" :fm, "HT" :ht, "CC" :cc, "RW" :rw, "BA" :ba, "TL" :tl, "JM" :jm, "KM" :km, "KE" :ke, "WS" :ws, "TO" :to, "PY" :py, "SH" :sh, "CY" :cy, "GH" :gh, "MA" :ma, "SG" :sg, "LK" :lk, "PH" :ph, "SM" :sm, "WF" :wf, "TR" :tr, "PS" :ps, "BZ" :bz, "CU" :cu, "TV" :tv, "AD" :ad, "SB" :sb, "DM" :dm, "LR" :lr, "OM" :om, "SO" :so, "DO" :do, "AL" :al, "BL" :bl, "FR" :fr, "GW" :gw, "MS" :ms, "BB" :bb, "CA" :ca, "MG" :mg, "KH" :kh, "LA" :la, "GP" :gp, "BV" :bv, "HN" :hn, "TH" :th, "DE" :de, "LB" :lb, "KZ" :kz, "AS" :as, "EC" :ec, "NO" :no, "AO" :ao, "FK" :fk, "ET" :et, "GS" :gs, "MD" :md, "AG" :ag, "BE" :be, "MV" :mv, "SZ" :sz, "CZ" :cz, "CL" :cl, "BT" :bt, "NL" :nl, "EG" :eg, "MQ" :mq, "SN" :sn, "FO" :fo, "EE" :ee, "AQ" :aq, "ST" :st, "KN" :kn, "BW" :bw, "MH" :mh, "NI" :ni, "PG" :pg, "VI" :vi, "IQ" :iq, "KG" :kg, "US" :us, "ZM" :zm, "MC" :mc, "GI" :gi, "NC" :nc, "GT" :gt, "BF" :bf, "YT" :yt, "LU" :lu, "UA" :ua, "IE" :ie, "LV" :lv, "GD" :gd, "MW" :mw, "BS" :bs, "AZ" :az, "SK" :sk, "GQ" :gq, "TC" :tc, "RE" :re, "IN" :in, "ES" :es, "GL" :gl, "KI" :ki, "HK" :hk, "CO" :co, "SS" :ss, "RS" :rs, "IO" :io, "NG" :ng, "UG" :ug, "CW" :cw, "SL" :sl, "ER" :er, "JE" :je, "AE" :ae, "HM" :hm, "PM" :pm, "BD" :bd, "MT" :mt, "AI" :ai, "GN" :gn, "PW" :pw, "NA" :na, "MX" :mx, "PL" :pl} input))

(clojure.core/defn- deser-http-header [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-header-name (input "Name"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-header-value (input "Value")))))

(clojure.core/defn- deser-xss-match-set [input] (clojure.core/cond-> {:xss-match-set-id (deser-resource-id (input "XssMatchSetId")), :xss-match-tuples (deser-xss-match-tuples (input "XssMatchTuples"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-match-field-type [input] (clojure.core/get {"URI" :uri, "QUERY_STRING" :query-string, "HEADER" :header, "METHOD" :method, "BODY" :body, "SINGLE_QUERY_ARG" :single-query-arg, "ALL_QUERY_ARGS" :all-query-args} input))

(clojure.core/defn- deser-rule [input] (clojure.core/cond-> {:rule-id (deser-resource-id (input "RuleId")), :predicates (deser-predicates (input "Predicates"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (input "MetricName")))))

(clojure.core/defn- deser-byte-match-set [input] (clojure.core/cond-> {:byte-match-set-id (deser-resource-id (input "ByteMatchSetId")), :byte-match-tuples (deser-byte-match-tuples (input "ByteMatchTuples"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-sample-weight [input] input)

(clojure.core/defn- deser-byte-match-set-summary [input] (clojure.core/cond-> {:byte-match-set-id (deser-resource-id (input "ByteMatchSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-match-field-data [input] input)

(clojure.core/defn- deser-next-marker [input] input)

(clojure.core/defn- deser-sampled-http-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sampled-http-request coll))) input))

(clojure.core/defn- deser-logging-configuration [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceArn")), :log-destination-configs (deser-log-destination-configs (input "LogDestinationConfigs"))} (clojure.core/contains? input "RedactedFields") (clojure.core/assoc :redacted-fields (deser-redacted-fields (input "RedactedFields")))))

(clojure.core/defn- deser-byte-match-tuples [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-byte-match-tuple coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-sql-injection-match-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sql-injection-match-set-summary coll))) input))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-predicates [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-predicate coll))) input))

(clojure.core/defn- deser-regex-match-tuples [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-regex-match-tuple coll))) input))

(clojure.core/defn- deser-sql-injection-match-tuples [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sql-injection-match-tuple coll))) input))

(clojure.core/defn- deser-metric-name [input] input)

(clojure.core/defn- deser-waf-rule-type [input] (clojure.core/get {"REGULAR" :regular, "RATE_BASED" :rate-based, "GROUP" :group} input))

(clojure.core/defn- deser-logging-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-logging-configuration coll))) input))

(clojure.core/defn- deser-predicate-type [input] (clojure.core/get {"IPMatch" :ip-match, "ByteMatch" :byte-match, "SqlInjectionMatch" :sql-injection-match, "GeoMatch" :geo-match, "SizeConstraint" :size-constraint, "XssMatch" :xss-match, "RegexMatch" :regex-match} input))

(clojure.core/defn- deser-parameter-exception-field [input] (clojure.core/get {"RATE_KEY" :rate-key, "RULE_TYPE" :rule-type, "BYTE_MATCH_FIELD_TYPE" :byte-match-field-type, "WAF_OVERRIDE_ACTION" :waf-override-action, "GEO_MATCH_LOCATION_TYPE" :geo-match-location-type, "BYTE_MATCH_POSITIONAL_CONSTRAINT" :byte-match-positional-constraint, "GEO_MATCH_LOCATION_VALUE" :geo-match-location-value, "IPSET_TYPE" :ipset-type, "WAF_ACTION" :waf-action, "SIZE_CONSTRAINT_COMPARISON_OPERATOR" :size-constraint-comparison-operator, "CHANGE_ACTION" :change-action, "RESOURCE_ARN" :resource-arn, "NEXT_MARKER" :next-marker, "BYTE_MATCH_TEXT_TRANSFORMATION" :byte-match-text-transformation, "PREDICATE_TYPE" :predicate-type, "SQL_INJECTION_MATCH_FIELD_TYPE" :sql-injection-match-field-type} input))

(clojure.core/defn- deser-xss-match-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xss-match-set-summary coll))) input))

(clojure.core/defn- deser-sql-injection-match-set [input] (clojure.core/cond-> {:sql-injection-match-set-id (deser-resource-id (input "SqlInjectionMatchSetId")), :sql-injection-match-tuples (deser-sql-injection-match-tuples (input "SqlInjectionMatchTuples"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-regex-match-tuple [input] (clojure.core/cond-> {:field-to-match (deser-field-to-match (input "FieldToMatch")), :text-transformation (deser-text-transformation (input "TextTransformation")), :regex-pattern-set-id (deser-resource-id (input "RegexPatternSetId"))}))

(clojure.core/defn- deser-action [input] input)

(clojure.core/defn- deser-byte-match-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-byte-match-set-summary coll))) input))

(clojure.core/defn- deser-predicate [input] (clojure.core/cond-> {:negated (deser-negated (input "Negated")), :type (deser-predicate-type (input "Type")), :data-id (deser-resource-id (input "DataId"))}))

(clojure.core/defn- deser-sql-injection-match-set-summary [input] (clojure.core/cond-> {:sql-injection-match-set-id (deser-resource-id (input "SqlInjectionMatchSetId")), :name (deser-resource-name (input "Name"))}))

(clojure.core/defn- deser-ip-string [input] input)

(clojure.core/defn- deser-activated-rule [input] (clojure.core/cond-> {:priority (deser-rule-priority (input "Priority")), :rule-id (deser-resource-id (input "RuleId"))} (clojure.core/contains? input "Action") (clojure.core/assoc :action (deser-waf-action (input "Action"))) (clojure.core/contains? input "OverrideAction") (clojure.core/assoc :override-action (deser-waf-override-action (input "OverrideAction"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-waf-rule-type (input "Type"))) (clojure.core/contains? input "ExcludedRules") (clojure.core/assoc :excluded-rules (deser-excluded-rules (input "ExcludedRules")))))

(clojure.core/defn- deser-http-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "ClientIP") (clojure.core/assoc :client-ip (deser-ip-string (input "ClientIP"))) (clojure.core/contains? input "Country") (clojure.core/assoc :country (deser-country (input "Country"))) (clojure.core/contains? input "URI") (clojure.core/assoc :uri (deser-uri-string (input "URI"))) (clojure.core/contains? input "Method") (clojure.core/assoc :method (deser-http-method (input "Method"))) (clojure.core/contains? input "HTTPVersion") (clojure.core/assoc :http-version (deser-http-version (input "HTTPVersion"))) (clojure.core/contains? input "Headers") (clojure.core/assoc :headers (deser-http-headers (input "Headers")))))

(clojure.core/defn- deser-size-constraint-set [input] (clojure.core/cond-> {:size-constraint-set-id (deser-resource-id (input "SizeConstraintSetId")), :size-constraints (deser-size-constraints (input "SizeConstraints"))} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name")))))

(clojure.core/defn- deser-regex-match-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "RegexMatchSetId") (clojure.core/assoc :regex-match-set-id (deser-resource-id (input "RegexMatchSetId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "RegexMatchTuples") (clojure.core/assoc :regex-match-tuples (deser-regex-match-tuples (input "RegexMatchTuples")))))

(clojure.core/defn- deser-byte-match-target-string [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-waf-override-action-type [input] (clojure.core/get {"NONE" :none, "COUNT" :count} input))

(clojure.core/defn- deser-rate-limit [input] input)

(clojure.core/defn- deser-negated [input] input)

(clojure.core/defn- deser-managed-key [input] input)

(clojure.core/defn- deser-change-token-status [input] (clojure.core/get {"PROVISIONED" :provisioned, "PENDING" :pending, "INSYNC" :insync} input))

(clojure.core/defn- deser-http-method [input] input)

(clojure.core/defn- response-get-web-acl-response ([input] (response-get-web-acl-response nil input)) ([resultWrapper1880346 input] (clojure.core/let [rawinput1880345 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880347 {"WebACL" (rawinput1880345 "WebACL")}] (clojure.core/cond-> {} (letvar1880347 "WebACL") (clojure.core/assoc :web-acl (deser-web-acl (clojure.core/get-in letvar1880347 ["WebACL"])))))))

(clojure.core/defn- response-list-regex-pattern-sets-response ([input] (response-list-regex-pattern-sets-response nil input)) ([resultWrapper1880349 input] (clojure.core/let [rawinput1880348 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880350 {"NextMarker" (rawinput1880348 "NextMarker"), "RegexPatternSets" (rawinput1880348 "RegexPatternSets")}] (clojure.core/cond-> {} (letvar1880350 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880350 ["NextMarker"]))) (letvar1880350 "RegexPatternSets") (clojure.core/assoc :regex-pattern-sets (deser-regex-pattern-set-summaries (clojure.core/get-in letvar1880350 ["RegexPatternSets"])))))))

(clojure.core/defn- response-waf-invalid-parameter-exception ([input] (response-waf-invalid-parameter-exception nil input)) ([resultWrapper1880352 input] (clojure.core/let [rawinput1880351 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880353 {"field" (rawinput1880351 "field"), "parameter" (rawinput1880351 "parameter"), "reason" (rawinput1880351 "reason")}] (clojure.core/cond-> {} (letvar1880353 "field") (clojure.core/assoc :field (deser-parameter-exception-field (clojure.core/get-in letvar1880353 ["field"]))) (letvar1880353 "parameter") (clojure.core/assoc :parameter (deser-parameter-exception-parameter (clojure.core/get-in letvar1880353 ["parameter"]))) (letvar1880353 "reason") (clojure.core/assoc :reason (deser-parameter-exception-reason (clojure.core/get-in letvar1880353 ["reason"])))))))

(clojure.core/defn- response-update-regex-match-set-response ([input] (response-update-regex-match-set-response nil input)) ([resultWrapper1880355 input] (clojure.core/let [rawinput1880354 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880356 {"ChangeToken" (rawinput1880354 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880356 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880356 ["ChangeToken"])))))))

(clojure.core/defn- response-update-xss-match-set-response ([input] (response-update-xss-match-set-response nil input)) ([resultWrapper1880358 input] (clojure.core/let [rawinput1880357 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880359 {"ChangeToken" (rawinput1880357 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880359 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880359 ["ChangeToken"])))))))

(clojure.core/defn- response-create-regex-match-set-response ([input] (response-create-regex-match-set-response nil input)) ([resultWrapper1880361 input] (clojure.core/let [rawinput1880360 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880362 {"RegexMatchSet" (rawinput1880360 "RegexMatchSet"), "ChangeToken" (rawinput1880360 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880362 "RegexMatchSet") (clojure.core/assoc :regex-match-set (deser-regex-match-set (clojure.core/get-in letvar1880362 ["RegexMatchSet"]))) (letvar1880362 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880362 ["ChangeToken"])))))))

(clojure.core/defn- response-waf-invalid-account-exception ([input] (response-waf-invalid-account-exception nil input)) ([resultWrapper1880364 input] (clojure.core/let [rawinput1880363 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880365 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-rules-response ([input] (response-list-rules-response nil input)) ([resultWrapper1880367 input] (clojure.core/let [rawinput1880366 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880368 {"NextMarker" (rawinput1880366 "NextMarker"), "Rules" (rawinput1880366 "Rules")}] (clojure.core/cond-> {} (letvar1880368 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880368 ["NextMarker"]))) (letvar1880368 "Rules") (clojure.core/assoc :rules (deser-rule-summaries (clojure.core/get-in letvar1880368 ["Rules"])))))))

(clojure.core/defn- response-waf-internal-error-exception ([input] (response-waf-internal-error-exception nil input)) ([resultWrapper1880370 input] (clojure.core/let [rawinput1880369 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880371 {"message" (rawinput1880369 "message")}] (clojure.core/cond-> {} (letvar1880371 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880371 ["message"])))))))

(clojure.core/defn- response-waf-invalid-operation-exception ([input] (response-waf-invalid-operation-exception nil input)) ([resultWrapper1880373 input] (clojure.core/let [rawinput1880372 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880374 {"message" (rawinput1880372 "message")}] (clojure.core/cond-> {} (letvar1880374 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880374 ["message"])))))))

(clojure.core/defn- response-delete-sql-injection-match-set-response ([input] (response-delete-sql-injection-match-set-response nil input)) ([resultWrapper1880376 input] (clojure.core/let [rawinput1880375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880377 {"ChangeToken" (rawinput1880375 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880377 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880377 ["ChangeToken"])))))))

(clojure.core/defn- response-get-xss-match-set-response ([input] (response-get-xss-match-set-response nil input)) ([resultWrapper1880379 input] (clojure.core/let [rawinput1880378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880380 {"XssMatchSet" (rawinput1880378 "XssMatchSet")}] (clojure.core/cond-> {} (letvar1880380 "XssMatchSet") (clojure.core/assoc :xss-match-set (deser-xss-match-set (clojure.core/get-in letvar1880380 ["XssMatchSet"])))))))

(clojure.core/defn- response-update-sql-injection-match-set-response ([input] (response-update-sql-injection-match-set-response nil input)) ([resultWrapper1880382 input] (clojure.core/let [rawinput1880381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880383 {"ChangeToken" (rawinput1880381 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880383 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880383 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-rule-group-response ([input] (response-delete-rule-group-response nil input)) ([resultWrapper1880385 input] (clojure.core/let [rawinput1880384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880386 {"ChangeToken" (rawinput1880384 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880386 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880386 ["ChangeToken"])))))))

(clojure.core/defn- response-list-xss-match-sets-response ([input] (response-list-xss-match-sets-response nil input)) ([resultWrapper1880388 input] (clojure.core/let [rawinput1880387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880389 {"NextMarker" (rawinput1880387 "NextMarker"), "XssMatchSets" (rawinput1880387 "XssMatchSets")}] (clojure.core/cond-> {} (letvar1880389 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880389 ["NextMarker"]))) (letvar1880389 "XssMatchSets") (clojure.core/assoc :xss-match-sets (deser-xss-match-set-summaries (clojure.core/get-in letvar1880389 ["XssMatchSets"])))))))

(clojure.core/defn- response-waf-service-linked-role-error-exception ([input] (response-waf-service-linked-role-error-exception nil input)) ([resultWrapper1880391 input] (clojure.core/let [rawinput1880390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880392 {"message" (rawinput1880390 "message")}] (clojure.core/cond-> {} (letvar1880392 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880392 ["message"])))))))

(clojure.core/defn- response-delete-permission-policy-response ([input] (response-delete-permission-policy-response nil input)) ([resultWrapper1880394 input] (clojure.core/let [rawinput1880393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880395 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-sql-injection-match-set-response ([input] (response-create-sql-injection-match-set-response nil input)) ([resultWrapper1880397 input] (clojure.core/let [rawinput1880396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880398 {"SqlInjectionMatchSet" (rawinput1880396 "SqlInjectionMatchSet"), "ChangeToken" (rawinput1880396 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880398 "SqlInjectionMatchSet") (clojure.core/assoc :sql-injection-match-set (deser-sql-injection-match-set (clojure.core/get-in letvar1880398 ["SqlInjectionMatchSet"]))) (letvar1880398 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880398 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-regex-match-set-response ([input] (response-delete-regex-match-set-response nil input)) ([resultWrapper1880400 input] (clojure.core/let [rawinput1880399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880401 {"ChangeToken" (rawinput1880399 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880401 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880401 ["ChangeToken"])))))))

(clojure.core/defn- response-put-permission-policy-response ([input] (response-put-permission-policy-response nil input)) ([resultWrapper1880403 input] (clojure.core/let [rawinput1880402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880404 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-waf-invalid-regex-pattern-exception ([input] (response-waf-invalid-regex-pattern-exception nil input)) ([resultWrapper1880406 input] (clojure.core/let [rawinput1880405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880407 {"message" (rawinput1880405 "message")}] (clojure.core/cond-> {} (letvar1880407 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880407 ["message"])))))))

(clojure.core/defn- response-update-regex-pattern-set-response ([input] (response-update-regex-pattern-set-response nil input)) ([resultWrapper1880409 input] (clojure.core/let [rawinput1880408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880410 {"ChangeToken" (rawinput1880408 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880410 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880410 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-logging-configuration-response ([input] (response-delete-logging-configuration-response nil input)) ([resultWrapper1880412 input] (clojure.core/let [rawinput1880411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880413 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-waf-nonexistent-item-exception ([input] (response-waf-nonexistent-item-exception nil input)) ([resultWrapper1880415 input] (clojure.core/let [rawinput1880414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880416 {"message" (rawinput1880414 "message")}] (clojure.core/cond-> {} (letvar1880416 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880416 ["message"])))))))

(clojure.core/defn- response-get-rule-response ([input] (response-get-rule-response nil input)) ([resultWrapper1880418 input] (clojure.core/let [rawinput1880417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880419 {"Rule" (rawinput1880417 "Rule")}] (clojure.core/cond-> {} (letvar1880419 "Rule") (clojure.core/assoc :rule (deser-rule (clojure.core/get-in letvar1880419 ["Rule"])))))))

(clojure.core/defn- response-list-geo-match-sets-response ([input] (response-list-geo-match-sets-response nil input)) ([resultWrapper1880421 input] (clojure.core/let [rawinput1880420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880422 {"NextMarker" (rawinput1880420 "NextMarker"), "GeoMatchSets" (rawinput1880420 "GeoMatchSets")}] (clojure.core/cond-> {} (letvar1880422 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880422 ["NextMarker"]))) (letvar1880422 "GeoMatchSets") (clojure.core/assoc :geo-match-sets (deser-geo-match-set-summaries (clojure.core/get-in letvar1880422 ["GeoMatchSets"])))))))

(clojure.core/defn- response-get-byte-match-set-response ([input] (response-get-byte-match-set-response nil input)) ([resultWrapper1880424 input] (clojure.core/let [rawinput1880423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880425 {"ByteMatchSet" (rawinput1880423 "ByteMatchSet")}] (clojure.core/cond-> {} (letvar1880425 "ByteMatchSet") (clojure.core/assoc :byte-match-set (deser-byte-match-set (clojure.core/get-in letvar1880425 ["ByteMatchSet"])))))))

(clojure.core/defn- response-waf-nonexistent-container-exception ([input] (response-waf-nonexistent-container-exception nil input)) ([resultWrapper1880427 input] (clojure.core/let [rawinput1880426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880428 {"message" (rawinput1880426 "message")}] (clojure.core/cond-> {} (letvar1880428 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880428 ["message"])))))))

(clojure.core/defn- response-waf-stale-data-exception ([input] (response-waf-stale-data-exception nil input)) ([resultWrapper1880430 input] (clojure.core/let [rawinput1880429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880431 {"message" (rawinput1880429 "message")}] (clojure.core/cond-> {} (letvar1880431 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880431 ["message"])))))))

(clojure.core/defn- response-waf-referenced-item-exception ([input] (response-waf-referenced-item-exception nil input)) ([resultWrapper1880433 input] (clojure.core/let [rawinput1880432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880434 {"message" (rawinput1880432 "message")}] (clojure.core/cond-> {} (letvar1880434 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880434 ["message"])))))))

(clojure.core/defn- response-update-rule-response ([input] (response-update-rule-response nil input)) ([resultWrapper1880436 input] (clojure.core/let [rawinput1880435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880437 {"ChangeToken" (rawinput1880435 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880437 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880437 ["ChangeToken"])))))))

(clojure.core/defn- response-create-size-constraint-set-response ([input] (response-create-size-constraint-set-response nil input)) ([resultWrapper1880439 input] (clojure.core/let [rawinput1880438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880440 {"SizeConstraintSet" (rawinput1880438 "SizeConstraintSet"), "ChangeToken" (rawinput1880438 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880440 "SizeConstraintSet") (clojure.core/assoc :size-constraint-set (deser-size-constraint-set (clojure.core/get-in letvar1880440 ["SizeConstraintSet"]))) (letvar1880440 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880440 ["ChangeToken"])))))))

(clojure.core/defn- response-update-ip-set-response ([input] (response-update-ip-set-response nil input)) ([resultWrapper1880442 input] (clojure.core/let [rawinput1880441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880443 {"ChangeToken" (rawinput1880441 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880443 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880443 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-rule-response ([input] (response-delete-rule-response nil input)) ([resultWrapper1880445 input] (clojure.core/let [rawinput1880444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880446 {"ChangeToken" (rawinput1880444 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880446 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880446 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-xss-match-set-response ([input] (response-delete-xss-match-set-response nil input)) ([resultWrapper1880448 input] (clojure.core/let [rawinput1880447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880449 {"ChangeToken" (rawinput1880447 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880449 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880449 ["ChangeToken"])))))))

(clojure.core/defn- response-create-web-acl-response ([input] (response-create-web-acl-response nil input)) ([resultWrapper1880451 input] (clojure.core/let [rawinput1880450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880452 {"WebACL" (rawinput1880450 "WebACL"), "ChangeToken" (rawinput1880450 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880452 "WebACL") (clojure.core/assoc :web-acl (deser-web-acl (clojure.core/get-in letvar1880452 ["WebACL"]))) (letvar1880452 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880452 ["ChangeToken"])))))))

(clojure.core/defn- response-list-web-ac-ls-response ([input] (response-list-web-ac-ls-response nil input)) ([resultWrapper1880454 input] (clojure.core/let [rawinput1880453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880455 {"NextMarker" (rawinput1880453 "NextMarker"), "WebACLs" (rawinput1880453 "WebACLs")}] (clojure.core/cond-> {} (letvar1880455 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880455 ["NextMarker"]))) (letvar1880455 "WebACLs") (clojure.core/assoc :web-ac-ls (deser-web-acl-summaries (clojure.core/get-in letvar1880455 ["WebACLs"])))))))

(clojure.core/defn- response-list-sql-injection-match-sets-response ([input] (response-list-sql-injection-match-sets-response nil input)) ([resultWrapper1880457 input] (clojure.core/let [rawinput1880456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880458 {"NextMarker" (rawinput1880456 "NextMarker"), "SqlInjectionMatchSets" (rawinput1880456 "SqlInjectionMatchSets")}] (clojure.core/cond-> {} (letvar1880458 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880458 ["NextMarker"]))) (letvar1880458 "SqlInjectionMatchSets") (clojure.core/assoc :sql-injection-match-sets (deser-sql-injection-match-set-summaries (clojure.core/get-in letvar1880458 ["SqlInjectionMatchSets"])))))))

(clojure.core/defn- response-list-rule-groups-response ([input] (response-list-rule-groups-response nil input)) ([resultWrapper1880460 input] (clojure.core/let [rawinput1880459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880461 {"NextMarker" (rawinput1880459 "NextMarker"), "RuleGroups" (rawinput1880459 "RuleGroups")}] (clojure.core/cond-> {} (letvar1880461 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880461 ["NextMarker"]))) (letvar1880461 "RuleGroups") (clojure.core/assoc :rule-groups (deser-rule-group-summaries (clojure.core/get-in letvar1880461 ["RuleGroups"])))))))

(clojure.core/defn- response-waf-non-empty-entity-exception ([input] (response-waf-non-empty-entity-exception nil input)) ([resultWrapper1880463 input] (clojure.core/let [rawinput1880462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880464 {"message" (rawinput1880462 "message")}] (clojure.core/cond-> {} (letvar1880464 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880464 ["message"])))))))

(clojure.core/defn- response-get-regex-pattern-set-response ([input] (response-get-regex-pattern-set-response nil input)) ([resultWrapper1880466 input] (clojure.core/let [rawinput1880465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880467 {"RegexPatternSet" (rawinput1880465 "RegexPatternSet")}] (clojure.core/cond-> {} (letvar1880467 "RegexPatternSet") (clojure.core/assoc :regex-pattern-set (deser-regex-pattern-set (clojure.core/get-in letvar1880467 ["RegexPatternSet"])))))))

(clojure.core/defn- response-get-ip-set-response ([input] (response-get-ip-set-response nil input)) ([resultWrapper1880469 input] (clojure.core/let [rawinput1880468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880470 {"IPSet" (rawinput1880468 "IPSet")}] (clojure.core/cond-> {} (letvar1880470 "IPSet") (clojure.core/assoc :ip-set (deser-ip-set (clojure.core/get-in letvar1880470 ["IPSet"])))))))

(clojure.core/defn- response-delete-web-acl-response ([input] (response-delete-web-acl-response nil input)) ([resultWrapper1880472 input] (clojure.core/let [rawinput1880471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880473 {"ChangeToken" (rawinput1880471 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880473 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880473 ["ChangeToken"])))))))

(clojure.core/defn- response-get-rate-based-rule-response ([input] (response-get-rate-based-rule-response nil input)) ([resultWrapper1880475 input] (clojure.core/let [rawinput1880474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880476 {"Rule" (rawinput1880474 "Rule")}] (clojure.core/cond-> {} (letvar1880476 "Rule") (clojure.core/assoc :rule (deser-rate-based-rule (clojure.core/get-in letvar1880476 ["Rule"])))))))

(clojure.core/defn- response-list-activated-rules-in-rule-group-response ([input] (response-list-activated-rules-in-rule-group-response nil input)) ([resultWrapper1880478 input] (clojure.core/let [rawinput1880477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880479 {"NextMarker" (rawinput1880477 "NextMarker"), "ActivatedRules" (rawinput1880477 "ActivatedRules")}] (clojure.core/cond-> {} (letvar1880479 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880479 ["NextMarker"]))) (letvar1880479 "ActivatedRules") (clojure.core/assoc :activated-rules (deser-activated-rules (clojure.core/get-in letvar1880479 ["ActivatedRules"])))))))

(clojure.core/defn- response-put-logging-configuration-response ([input] (response-put-logging-configuration-response nil input)) ([resultWrapper1880481 input] (clojure.core/let [rawinput1880480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880482 {"LoggingConfiguration" (rawinput1880480 "LoggingConfiguration")}] (clojure.core/cond-> {} (letvar1880482 "LoggingConfiguration") (clojure.core/assoc :logging-configuration (deser-logging-configuration (clojure.core/get-in letvar1880482 ["LoggingConfiguration"])))))))

(clojure.core/defn- response-disassociate-web-acl-response ([input] (response-disassociate-web-acl-response nil input)) ([resultWrapper1880484 input] (clojure.core/let [rawinput1880483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880485 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-logging-configuration-response ([input] (response-get-logging-configuration-response nil input)) ([resultWrapper1880487 input] (clojure.core/let [rawinput1880486 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880488 {"LoggingConfiguration" (rawinput1880486 "LoggingConfiguration")}] (clojure.core/cond-> {} (letvar1880488 "LoggingConfiguration") (clojure.core/assoc :logging-configuration (deser-logging-configuration (clojure.core/get-in letvar1880488 ["LoggingConfiguration"])))))))

(clojure.core/defn- response-update-byte-match-set-response ([input] (response-update-byte-match-set-response nil input)) ([resultWrapper1880490 input] (clojure.core/let [rawinput1880489 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880491 {"ChangeToken" (rawinput1880489 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880491 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880491 ["ChangeToken"])))))))

(clojure.core/defn- response-list-subscribed-rule-groups-response ([input] (response-list-subscribed-rule-groups-response nil input)) ([resultWrapper1880493 input] (clojure.core/let [rawinput1880492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880494 {"NextMarker" (rawinput1880492 "NextMarker"), "RuleGroups" (rawinput1880492 "RuleGroups")}] (clojure.core/cond-> {} (letvar1880494 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880494 ["NextMarker"]))) (letvar1880494 "RuleGroups") (clojure.core/assoc :rule-groups (deser-subscribed-rule-group-summaries (clojure.core/get-in letvar1880494 ["RuleGroups"])))))))

(clojure.core/defn- response-update-geo-match-set-response ([input] (response-update-geo-match-set-response nil input)) ([resultWrapper1880496 input] (clojure.core/let [rawinput1880495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880497 {"ChangeToken" (rawinput1880495 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880497 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880497 ["ChangeToken"])))))))

(clojure.core/defn- response-waf-limits-exceeded-exception ([input] (response-waf-limits-exceeded-exception nil input)) ([resultWrapper1880499 input] (clojure.core/let [rawinput1880498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880500 {"message" (rawinput1880498 "message")}] (clojure.core/cond-> {} (letvar1880500 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880500 ["message"])))))))

(clojure.core/defn- response-list-rate-based-rules-response ([input] (response-list-rate-based-rules-response nil input)) ([resultWrapper1880502 input] (clojure.core/let [rawinput1880501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880503 {"NextMarker" (rawinput1880501 "NextMarker"), "Rules" (rawinput1880501 "Rules")}] (clojure.core/cond-> {} (letvar1880503 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880503 ["NextMarker"]))) (letvar1880503 "Rules") (clojure.core/assoc :rules (deser-rule-summaries (clojure.core/get-in letvar1880503 ["Rules"])))))))

(clojure.core/defn- response-create-byte-match-set-response ([input] (response-create-byte-match-set-response nil input)) ([resultWrapper1880505 input] (clojure.core/let [rawinput1880504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880506 {"ByteMatchSet" (rawinput1880504 "ByteMatchSet"), "ChangeToken" (rawinput1880504 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880506 "ByteMatchSet") (clojure.core/assoc :byte-match-set (deser-byte-match-set (clojure.core/get-in letvar1880506 ["ByteMatchSet"]))) (letvar1880506 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880506 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-ip-set-response ([input] (response-delete-ip-set-response nil input)) ([resultWrapper1880508 input] (clojure.core/let [rawinput1880507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880509 {"ChangeToken" (rawinput1880507 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880509 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880509 ["ChangeToken"])))))))

(clojure.core/defn- response-waf-subscription-not-found-exception ([input] (response-waf-subscription-not-found-exception nil input)) ([resultWrapper1880511 input] (clojure.core/let [rawinput1880510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880512 {"message" (rawinput1880510 "message")}] (clojure.core/cond-> {} (letvar1880512 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880512 ["message"])))))))

(clojure.core/defn- response-delete-size-constraint-set-response ([input] (response-delete-size-constraint-set-response nil input)) ([resultWrapper1880514 input] (clojure.core/let [rawinput1880513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880515 {"ChangeToken" (rawinput1880513 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880515 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880515 ["ChangeToken"])))))))

(clojure.core/defn- response-get-geo-match-set-response ([input] (response-get-geo-match-set-response nil input)) ([resultWrapper1880517 input] (clojure.core/let [rawinput1880516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880518 {"GeoMatchSet" (rawinput1880516 "GeoMatchSet")}] (clojure.core/cond-> {} (letvar1880518 "GeoMatchSet") (clojure.core/assoc :geo-match-set (deser-geo-match-set (clojure.core/get-in letvar1880518 ["GeoMatchSet"])))))))

(clojure.core/defn- response-create-geo-match-set-response ([input] (response-create-geo-match-set-response nil input)) ([resultWrapper1880520 input] (clojure.core/let [rawinput1880519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880521 {"GeoMatchSet" (rawinput1880519 "GeoMatchSet"), "ChangeToken" (rawinput1880519 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880521 "GeoMatchSet") (clojure.core/assoc :geo-match-set (deser-geo-match-set (clojure.core/get-in letvar1880521 ["GeoMatchSet"]))) (letvar1880521 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880521 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-byte-match-set-response ([input] (response-delete-byte-match-set-response nil input)) ([resultWrapper1880523 input] (clojure.core/let [rawinput1880522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880524 {"ChangeToken" (rawinput1880522 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880524 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880524 ["ChangeToken"])))))))

(clojure.core/defn- response-update-rule-group-response ([input] (response-update-rule-group-response nil input)) ([resultWrapper1880526 input] (clojure.core/let [rawinput1880525 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880527 {"ChangeToken" (rawinput1880525 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880527 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880527 ["ChangeToken"])))))))

(clojure.core/defn- response-waf-invalid-permission-policy-exception ([input] (response-waf-invalid-permission-policy-exception nil input)) ([resultWrapper1880529 input] (clojure.core/let [rawinput1880528 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880530 {"message" (rawinput1880528 "message")}] (clojure.core/cond-> {} (letvar1880530 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880530 ["message"])))))))

(clojure.core/defn- response-get-sampled-requests-response ([input] (response-get-sampled-requests-response nil input)) ([resultWrapper1880532 input] (clojure.core/let [rawinput1880531 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880533 {"SampledRequests" (rawinput1880531 "SampledRequests"), "PopulationSize" (rawinput1880531 "PopulationSize"), "TimeWindow" (rawinput1880531 "TimeWindow")}] (clojure.core/cond-> {} (letvar1880533 "SampledRequests") (clojure.core/assoc :sampled-requests (deser-sampled-http-requests (clojure.core/get-in letvar1880533 ["SampledRequests"]))) (letvar1880533 "PopulationSize") (clojure.core/assoc :population-size (deser-population-size (clojure.core/get-in letvar1880533 ["PopulationSize"]))) (letvar1880533 "TimeWindow") (clojure.core/assoc :time-window (deser-time-window (clojure.core/get-in letvar1880533 ["TimeWindow"])))))))

(clojure.core/defn- response-create-xss-match-set-response ([input] (response-create-xss-match-set-response nil input)) ([resultWrapper1880535 input] (clojure.core/let [rawinput1880534 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880536 {"XssMatchSet" (rawinput1880534 "XssMatchSet"), "ChangeToken" (rawinput1880534 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880536 "XssMatchSet") (clojure.core/assoc :xss-match-set (deser-xss-match-set (clojure.core/get-in letvar1880536 ["XssMatchSet"]))) (letvar1880536 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880536 ["ChangeToken"])))))))

(clojure.core/defn- response-update-rate-based-rule-response ([input] (response-update-rate-based-rule-response nil input)) ([resultWrapper1880538 input] (clojure.core/let [rawinput1880537 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880539 {"ChangeToken" (rawinput1880537 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880539 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880539 ["ChangeToken"])))))))

(clojure.core/defn- response-get-size-constraint-set-response ([input] (response-get-size-constraint-set-response nil input)) ([resultWrapper1880541 input] (clojure.core/let [rawinput1880540 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880542 {"SizeConstraintSet" (rawinput1880540 "SizeConstraintSet")}] (clojure.core/cond-> {} (letvar1880542 "SizeConstraintSet") (clojure.core/assoc :size-constraint-set (deser-size-constraint-set (clojure.core/get-in letvar1880542 ["SizeConstraintSet"])))))))

(clojure.core/defn- response-waf-unavailable-entity-exception ([input] (response-waf-unavailable-entity-exception nil input)) ([resultWrapper1880544 input] (clojure.core/let [rawinput1880543 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880545 {"message" (rawinput1880543 "message")}] (clojure.core/cond-> {} (letvar1880545 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880545 ["message"])))))))

(clojure.core/defn- response-waf-disallowed-name-exception ([input] (response-waf-disallowed-name-exception nil input)) ([resultWrapper1880547 input] (clojure.core/let [rawinput1880546 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880548 {"message" (rawinput1880546 "message")}] (clojure.core/cond-> {} (letvar1880548 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1880548 ["message"])))))))

(clojure.core/defn- response-update-size-constraint-set-response ([input] (response-update-size-constraint-set-response nil input)) ([resultWrapper1880550 input] (clojure.core/let [rawinput1880549 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880551 {"ChangeToken" (rawinput1880549 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880551 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880551 ["ChangeToken"])))))))

(clojure.core/defn- response-create-regex-pattern-set-response ([input] (response-create-regex-pattern-set-response nil input)) ([resultWrapper1880553 input] (clojure.core/let [rawinput1880552 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880554 {"RegexPatternSet" (rawinput1880552 "RegexPatternSet"), "ChangeToken" (rawinput1880552 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880554 "RegexPatternSet") (clojure.core/assoc :regex-pattern-set (deser-regex-pattern-set (clojure.core/get-in letvar1880554 ["RegexPatternSet"]))) (letvar1880554 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880554 ["ChangeToken"])))))))

(clojure.core/defn- response-list-logging-configurations-response ([input] (response-list-logging-configurations-response nil input)) ([resultWrapper1880556 input] (clojure.core/let [rawinput1880555 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880557 {"LoggingConfigurations" (rawinput1880555 "LoggingConfigurations"), "NextMarker" (rawinput1880555 "NextMarker")}] (clojure.core/cond-> {} (letvar1880557 "LoggingConfigurations") (clojure.core/assoc :logging-configurations (deser-logging-configurations (clojure.core/get-in letvar1880557 ["LoggingConfigurations"]))) (letvar1880557 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880557 ["NextMarker"])))))))

(clojure.core/defn- response-delete-regex-pattern-set-response ([input] (response-delete-regex-pattern-set-response nil input)) ([resultWrapper1880559 input] (clojure.core/let [rawinput1880558 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880560 {"ChangeToken" (rawinput1880558 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880560 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880560 ["ChangeToken"])))))))

(clojure.core/defn- response-create-rate-based-rule-response ([input] (response-create-rate-based-rule-response nil input)) ([resultWrapper1880562 input] (clojure.core/let [rawinput1880561 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880563 {"Rule" (rawinput1880561 "Rule"), "ChangeToken" (rawinput1880561 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880563 "Rule") (clojure.core/assoc :rule (deser-rate-based-rule (clojure.core/get-in letvar1880563 ["Rule"]))) (letvar1880563 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880563 ["ChangeToken"])))))))

(clojure.core/defn- response-get-web-acl-for-resource-response ([input] (response-get-web-acl-for-resource-response nil input)) ([resultWrapper1880565 input] (clojure.core/let [rawinput1880564 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880566 {"WebACLSummary" (rawinput1880564 "WebACLSummary")}] (clojure.core/cond-> {} (letvar1880566 "WebACLSummary") (clojure.core/assoc :web-acl-summary (deser-web-acl-summary (clojure.core/get-in letvar1880566 ["WebACLSummary"])))))))

(clojure.core/defn- response-list-regex-match-sets-response ([input] (response-list-regex-match-sets-response nil input)) ([resultWrapper1880568 input] (clojure.core/let [rawinput1880567 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880569 {"NextMarker" (rawinput1880567 "NextMarker"), "RegexMatchSets" (rawinput1880567 "RegexMatchSets")}] (clojure.core/cond-> {} (letvar1880569 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880569 ["NextMarker"]))) (letvar1880569 "RegexMatchSets") (clojure.core/assoc :regex-match-sets (deser-regex-match-set-summaries (clojure.core/get-in letvar1880569 ["RegexMatchSets"])))))))

(clojure.core/defn- response-get-change-token-status-response ([input] (response-get-change-token-status-response nil input)) ([resultWrapper1880571 input] (clojure.core/let [rawinput1880570 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880572 {"ChangeTokenStatus" (rawinput1880570 "ChangeTokenStatus")}] (clojure.core/cond-> {} (letvar1880572 "ChangeTokenStatus") (clojure.core/assoc :change-token-status (deser-change-token-status (clojure.core/get-in letvar1880572 ["ChangeTokenStatus"])))))))

(clojure.core/defn- response-list-byte-match-sets-response ([input] (response-list-byte-match-sets-response nil input)) ([resultWrapper1880574 input] (clojure.core/let [rawinput1880573 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880575 {"NextMarker" (rawinput1880573 "NextMarker"), "ByteMatchSets" (rawinput1880573 "ByteMatchSets")}] (clojure.core/cond-> {} (letvar1880575 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880575 ["NextMarker"]))) (letvar1880575 "ByteMatchSets") (clojure.core/assoc :byte-match-sets (deser-byte-match-set-summaries (clojure.core/get-in letvar1880575 ["ByteMatchSets"])))))))

(clojure.core/defn- response-delete-rate-based-rule-response ([input] (response-delete-rate-based-rule-response nil input)) ([resultWrapper1880577 input] (clojure.core/let [rawinput1880576 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880578 {"ChangeToken" (rawinput1880576 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880578 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880578 ["ChangeToken"])))))))

(clojure.core/defn- response-get-rate-based-rule-managed-keys-response ([input] (response-get-rate-based-rule-managed-keys-response nil input)) ([resultWrapper1880580 input] (clojure.core/let [rawinput1880579 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880581 {"ManagedKeys" (rawinput1880579 "ManagedKeys"), "NextMarker" (rawinput1880579 "NextMarker")}] (clojure.core/cond-> {} (letvar1880581 "ManagedKeys") (clojure.core/assoc :managed-keys (deser-managed-keys (clojure.core/get-in letvar1880581 ["ManagedKeys"]))) (letvar1880581 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880581 ["NextMarker"])))))))

(clojure.core/defn- response-list-size-constraint-sets-response ([input] (response-list-size-constraint-sets-response nil input)) ([resultWrapper1880583 input] (clojure.core/let [rawinput1880582 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880584 {"NextMarker" (rawinput1880582 "NextMarker"), "SizeConstraintSets" (rawinput1880582 "SizeConstraintSets")}] (clojure.core/cond-> {} (letvar1880584 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880584 ["NextMarker"]))) (letvar1880584 "SizeConstraintSets") (clojure.core/assoc :size-constraint-sets (deser-size-constraint-set-summaries (clojure.core/get-in letvar1880584 ["SizeConstraintSets"])))))))

(clojure.core/defn- response-get-permission-policy-response ([input] (response-get-permission-policy-response nil input)) ([resultWrapper1880586 input] (clojure.core/let [rawinput1880585 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880587 {"Policy" (rawinput1880585 "Policy")}] (clojure.core/cond-> {} (letvar1880587 "Policy") (clojure.core/assoc :policy (deser-policy-string (clojure.core/get-in letvar1880587 ["Policy"])))))))

(clojure.core/defn- response-create-rule-group-response ([input] (response-create-rule-group-response nil input)) ([resultWrapper1880589 input] (clojure.core/let [rawinput1880588 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880590 {"RuleGroup" (rawinput1880588 "RuleGroup"), "ChangeToken" (rawinput1880588 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880590 "RuleGroup") (clojure.core/assoc :rule-group (deser-rule-group (clojure.core/get-in letvar1880590 ["RuleGroup"]))) (letvar1880590 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880590 ["ChangeToken"])))))))

(clojure.core/defn- response-delete-geo-match-set-response ([input] (response-delete-geo-match-set-response nil input)) ([resultWrapper1880592 input] (clojure.core/let [rawinput1880591 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880593 {"ChangeToken" (rawinput1880591 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880593 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880593 ["ChangeToken"])))))))

(clojure.core/defn- response-get-change-token-response ([input] (response-get-change-token-response nil input)) ([resultWrapper1880595 input] (clojure.core/let [rawinput1880594 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880596 {"ChangeToken" (rawinput1880594 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880596 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880596 ["ChangeToken"])))))))

(clojure.core/defn- response-associate-web-acl-response ([input] (response-associate-web-acl-response nil input)) ([resultWrapper1880598 input] (clojure.core/let [rawinput1880597 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880599 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-web-acl-response ([input] (response-update-web-acl-response nil input)) ([resultWrapper1880601 input] (clojure.core/let [rawinput1880600 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880602 {"ChangeToken" (rawinput1880600 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880602 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880602 ["ChangeToken"])))))))

(clojure.core/defn- response-list-resources-for-web-acl-response ([input] (response-list-resources-for-web-acl-response nil input)) ([resultWrapper1880604 input] (clojure.core/let [rawinput1880603 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880605 {"ResourceArns" (rawinput1880603 "ResourceArns")}] (clojure.core/cond-> {} (letvar1880605 "ResourceArns") (clojure.core/assoc :resource-arns (deser-resource-arns (clojure.core/get-in letvar1880605 ["ResourceArns"])))))))

(clojure.core/defn- response-get-sql-injection-match-set-response ([input] (response-get-sql-injection-match-set-response nil input)) ([resultWrapper1880607 input] (clojure.core/let [rawinput1880606 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880608 {"SqlInjectionMatchSet" (rawinput1880606 "SqlInjectionMatchSet")}] (clojure.core/cond-> {} (letvar1880608 "SqlInjectionMatchSet") (clojure.core/assoc :sql-injection-match-set (deser-sql-injection-match-set (clojure.core/get-in letvar1880608 ["SqlInjectionMatchSet"])))))))

(clojure.core/defn- response-get-regex-match-set-response ([input] (response-get-regex-match-set-response nil input)) ([resultWrapper1880610 input] (clojure.core/let [rawinput1880609 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880611 {"RegexMatchSet" (rawinput1880609 "RegexMatchSet")}] (clojure.core/cond-> {} (letvar1880611 "RegexMatchSet") (clojure.core/assoc :regex-match-set (deser-regex-match-set (clojure.core/get-in letvar1880611 ["RegexMatchSet"])))))))

(clojure.core/defn- response-create-rule-response ([input] (response-create-rule-response nil input)) ([resultWrapper1880613 input] (clojure.core/let [rawinput1880612 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880614 {"Rule" (rawinput1880612 "Rule"), "ChangeToken" (rawinput1880612 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880614 "Rule") (clojure.core/assoc :rule (deser-rule (clojure.core/get-in letvar1880614 ["Rule"]))) (letvar1880614 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880614 ["ChangeToken"])))))))

(clojure.core/defn- response-create-ip-set-response ([input] (response-create-ip-set-response nil input)) ([resultWrapper1880616 input] (clojure.core/let [rawinput1880615 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880617 {"IPSet" (rawinput1880615 "IPSet"), "ChangeToken" (rawinput1880615 "ChangeToken")}] (clojure.core/cond-> {} (letvar1880617 "IPSet") (clojure.core/assoc :ip-set (deser-ip-set (clojure.core/get-in letvar1880617 ["IPSet"]))) (letvar1880617 "ChangeToken") (clojure.core/assoc :change-token (deser-change-token (clojure.core/get-in letvar1880617 ["ChangeToken"])))))))

(clojure.core/defn- response-get-rule-group-response ([input] (response-get-rule-group-response nil input)) ([resultWrapper1880619 input] (clojure.core/let [rawinput1880618 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880620 {"RuleGroup" (rawinput1880618 "RuleGroup")}] (clojure.core/cond-> {} (letvar1880620 "RuleGroup") (clojure.core/assoc :rule-group (deser-rule-group (clojure.core/get-in letvar1880620 ["RuleGroup"])))))))

(clojure.core/defn- response-list-ip-sets-response ([input] (response-list-ip-sets-response nil input)) ([resultWrapper1880622 input] (clojure.core/let [rawinput1880621 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1880623 {"NextMarker" (rawinput1880621 "NextMarker"), "IPSets" (rawinput1880621 "IPSets")}] (clojure.core/cond-> {} (letvar1880623 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1880623 ["NextMarker"]))) (letvar1880623 "IPSets") (clojure.core/assoc :ip-sets (deser-ip-set-summaries (clojure.core/get-in letvar1880623 ["IPSets"])))))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rule-group-request/rule-group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-subscribed-rule-groups-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-subscribed-rule-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-subscribed-rule-groups-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-size-constraint-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-size-constraint-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/change-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-xss-match-set-request/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-xss-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/xss-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-xss-match-set-request/xss-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-xss-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-update))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rate-based-rule-managed-keys-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rate-based-rule-managed-keys-request/rule-id] :opt-un [:portkey.aws.waf-regional/next-marker]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/positional-constraint #{:starts-with :exactly :contains "CONTAINS" "EXACTLY" :contains-word "CONTAINS_WORD" "ENDS_WITH" "STARTS_WITH" :ends-with})

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/web-acl]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-byte-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-byte-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-byte-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group-summary/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-group-summary/rule-group-id :portkey.aws.waf-regional.rule-group-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-pattern-set-request/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-pattern-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-pattern-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-regex-pattern-set-request/regex-pattern-set-id :portkey.aws.waf-regional.update-regex-pattern-set-request/updates :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-geo-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-geo-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-geo-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-pattern-sets-response/regex-pattern-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-pattern-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-pattern-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-pattern-sets-response/regex-pattern-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-parameter-exception/field (clojure.spec.alpha/and :portkey.aws.waf-regional/parameter-exception-field))
(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-parameter-exception/parameter (clojure.spec.alpha/and :portkey.aws.waf-regional/parameter-exception-parameter))
(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-parameter-exception/reason (clojure.spec.alpha/and :portkey.aws.waf-regional/parameter-exception-reason))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-parameter-exception/field :portkey.aws.waf-regional.waf-invalid-parameter-exception/parameter :portkey.aws.waf-regional.waf-invalid-parameter-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-byte-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-byte-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-regex-pattern-set-request/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-regex-pattern-set-request/regex-pattern-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-sql-injection-match-set-request/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-sql-injection-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/sql-injection-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-sql-injection-match-set-request/sql-injection-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-sql-injection-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/default-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/rules (clojure.spec.alpha/and :portkey.aws.waf-regional/activated-rules))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl/web-acl-arn (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-arn))
(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.web-acl/web-acl-id :portkey.aws.waf-regional.web-acl/default-action :portkey.aws.waf-regional.web-acl/rules] :opt-un [:portkey.aws.waf-regional.web-acl/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional.web-acl/web-acl-arn]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-sql-injection-match-set-request/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-sql-injection-match-set-request/sql-injection-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-strings (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-pattern-string :max-count 10))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rules-response/rules (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rules-response/rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rule-group-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-rule-group-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/activated-rules (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/activated-rule))

(clojure.spec.alpha/def :portkey.aws.waf-regional/text-transformation #{"HTML_ENTITY_DECODE" :compress-white-space :lowercase "URL_DECODE" "LOWERCASE" "NONE" :html-entity-decode "COMPRESS_WHITE_SPACE" "CMD_LINE" :url-decode :cmd-line :none})

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraint-type #{"Country" :country})

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-pattern-set/regex-pattern-set-id :portkey.aws.waf-regional/regex-pattern-strings] :opt-un [:portkey.aws.waf-regional.regex-pattern-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-ip-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-ip-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-ip-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/subscribed-rule-group-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/subscribed-rule-group-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-tuple/target-string (clojure.spec.alpha/and :portkey.aws.waf-regional/byte-match-target-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional.byte-match-tuple/target-string :portkey.aws.waf-regional/text-transformation :portkey.aws.waf-regional/positional-constraint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/country (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-request/max-items (clojure.spec.alpha/and :portkey.aws.waf-regional/get-sampled-requests-max-items))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sampled-requests-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-sampled-requests-request/web-acl-id :portkey.aws.waf-regional.get-sampled-requests-request/rule-id :portkey.aws.waf-regional/time-window :portkey.aws.waf-regional.get-sampled-requests-request/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-action-type #{:block "COUNT" "BLOCK" :allow :count "ALLOW"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraints (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/geo-match-constraint))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-pattern-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-constraint/type (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-constraint-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-constraint/value (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-constraint-value))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraint (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-constraint/type :portkey.aws.waf-regional.geo-match-constraint/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.field-to-match/type (clojure.spec.alpha/and :portkey.aws.waf-regional/match-field-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.field-to-match/data (clojure.spec.alpha/and :portkey.aws.waf-regional/match-field-data))
(clojure.spec.alpha/def :portkey.aws.waf-regional/field-to-match (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.field-to-match/type] :opt-un [:portkey.aws.waf-regional.field-to-match/data]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/geo-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-summary/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set-summary/ip-set-id :portkey.aws.waf-regional.ip-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-override-action/type (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-override-action-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-override-action (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.waf-override-action/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.associate-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/associate-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.associate-web-acl-request/web-acl-id :portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/xss-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/header-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-regex-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-regex-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set/ip-set-id :portkey.aws.waf-regional/ip-set-descriptors] :opt-un [:portkey.aws.waf-regional.ip-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-summary/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-summary/rule-id :portkey.aws.waf-regional.rule-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/uri-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-xss-match-sets-response/xss-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/xss-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-xss-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-xss-match-sets-response/xss-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-service-linked-role-error-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-service-linked-role-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-service-linked-role-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set-summary/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-set-summary/geo-match-set-id :portkey.aws.waf-regional.geo-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-xss-match-set-request/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-xss-match-set-request/xss-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-permission-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/parameter-exception-reason #{:illegal-combination "ILLEGAL_ARGUMENT" "ILLEGAL_COMBINATION" :illegal-argument "INVALID_OPTION" :invalid-option})

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/sql-injection-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation :portkey.aws.waf-regional/comparison-operator :portkey.aws.waf-regional/size] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-logging-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-web-acl-request/web-acl-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rate-based-rules-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rate-based-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rate-based-rules-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/put-permission-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-ip-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-ip-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-regex-pattern-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-regex-pattern-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-regex-pattern-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set-update/action :portkey.aws.waf-regional/ip-set-descriptor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.excluded-rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/excluded-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.excluded-rule/rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-rate-based-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-rate-based-rule-request/rule-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rate-key #{:ip "IP"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/change-action #{"DELETE" :insert :delete "INSERT"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptor-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-rule-request/rule-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-rule-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-group-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-resources-for-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-resources-for-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.list-resources-for-web-acl-request/web-acl-id] :opt-un [:portkey.aws.waf-regional/resource-type]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-set/geo-match-set-id :portkey.aws.waf-regional/geo-match-constraints] :opt-un [:portkey.aws.waf-regional.geo-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-geo-match-set-request/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-geo-match-set-request/geo-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-logging-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-nonexistent-item-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-nonexistent-item-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-nonexistent-item-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-permission-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-geo-match-sets-response/geo-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-geo-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-geo-match-sets-response/geo-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/comparison-operator #{:ge :eq "NE" "LT" "GE" "LE" :gt "EQ" :ne "GT" :le :lt})

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sql-injection-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/byte-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/web-acl-update))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rule-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-rule-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.byte-match-set-update/action :portkey.aws.waf-regional/byte-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-arns (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/resource-arn))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-nonexistent-container-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-nonexistent-container-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-nonexistent-container-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-stale-data-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-stale-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-stale-data-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-logging-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-referenced-item-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-referenced-item-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-referenced-item-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-web-ac-ls-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-web-ac-ls-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-web-ac-ls-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/size-constraint-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-xss-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-xss-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sampled-http-request/request (clojure.spec.alpha/and :portkey.aws.waf-regional/http-request))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sampled-http-request/weight (clojure.spec.alpha/and :portkey.aws.waf-regional/sample-weight))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sampled-http-request/rule-within-rule-group (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sampled-http-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sampled-http-request/request :portkey.aws.waf-regional.sampled-http-request/weight] :opt-un [:portkey.aws.waf-regional/timestamp :portkey.aws.waf-regional/action :portkey.aws.waf-regional.sampled-http-request/rule-within-rule-group]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-ip-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-ip-set-request/ip-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-ip-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/put-logging-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/logging-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/web-acl :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set-summary/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-pattern-set-summary/regex-pattern-set-id :portkey.aws.waf-regional.regex-pattern-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-web-ac-ls-response/web-ac-ls (clojure.spec.alpha/and :portkey.aws.waf-regional/web-acl-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-web-ac-ls-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-web-ac-ls-response/web-ac-ls]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptor-type #{:ipv-4 "IPV4" :ipv-6 "IPV6"})

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-sql-injection-match-sets-response/sql-injection-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/sql-injection-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-sql-injection-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-sql-injection-match-sets-response/sql-injection-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.time-window/start-time (clojure.spec.alpha/and :portkey.aws.waf-regional/timestamp))
(clojure.spec.alpha/def :portkey.aws.waf-regional.time-window/end-time (clojure.spec.alpha/and :portkey.aws.waf-regional/timestamp))
(clojure.spec.alpha/def :portkey.aws.waf-regional/time-window (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.time-window/start-time :portkey.aws.waf-regional.time-window/end-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rule-groups-response/rule-groups (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-group-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rule-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rule-groups-response/rule-groups]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-non-empty-entity-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-non-empty-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-non-empty-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/policy-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/redacted-fields (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/field-to-match))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-pattern-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/ip-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/pagination-limit (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-web-acl-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/web-acl-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-web-acl-request/default-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-web-acl-request/web-acl-id :portkey.aws.waf-regional/change-token] :opt-un [:portkey.aws.waf-regional.update-web-acl-request/updates :portkey.aws.waf-regional.update-web-acl-request/default-action]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-group-update/action :portkey.aws.waf-regional/activated-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rate-based-rule-response/rule (clojure.spec.alpha/and :portkey.aws.waf-regional/rate-based-rule))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.get-rate-based-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/web-acl-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/list-activated-rules-in-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional/activated-rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set-summary/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.size-constraint-set-summary/size-constraint-set-id :portkey.aws.waf-regional.size-constraint-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-geo-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-geo-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/size-constraint-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/header-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/population-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/put-logging-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/logging-configuration]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/parameter-exception-parameter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/disassociate-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/log-destination-configs (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/resource-arn :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-logging-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/logging-configuration]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-update/action :portkey.aws.waf-regional/predicate] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-regex-match-set-request/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-regex-match-set-request/regex-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-subscribed-rule-groups-response/rule-groups (clojure.spec.alpha/and :portkey.aws.waf-regional/subscribed-rule-group-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-subscribed-rule-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-subscribed-rule-groups-response/rule-groups]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/byte-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/http-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set-summary/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.xss-match-set-summary/xss-match-set-id :portkey.aws.waf-regional.xss-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set-summary/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-match-set-summary/regex-match-set-id :portkey.aws.waf-regional.regex-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-geo-match-set-request/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-geo-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/geo-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-geo-match-set-request/geo-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-geo-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/xss-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/ip-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-limits-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-limits-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-limits-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraints (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/size-constraint))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rate-based-rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rate-based-rule/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rate-based-rule/match-predicates (clojure.spec.alpha/and :portkey.aws.waf-regional/predicates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rate-based-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rate-based-rule/rule-id :portkey.aws.waf-regional.rate-based-rule/match-predicates :portkey.aws.waf-regional/rate-key :portkey.aws.waf-regional/rate-limit] :opt-un [:portkey.aws.waf-regional.rate-based-rule/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/http-headers (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/http-header))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rate-based-rules-response/rules (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rate-based-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rate-based-rules-response/rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/byte-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/disassociate-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-action/type (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-action (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.waf-action/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-rule-request/rule-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-xss-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-xss-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-xss-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-subscription-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-subscription-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-subscription-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-pattern-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/geo-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-descriptor/type (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-descriptor-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.ip-set-descriptor/value (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-descriptor-value))
(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptor (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.ip-set-descriptor/type :portkey.aws.waf-regional.ip-set-descriptor/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.size-constraint-set-update/action :portkey.aws.waf-regional/size-constraint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule-group/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule-group/rule-group-id] :opt-un [:portkey.aws.waf-regional.rule-group/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-size-constraint-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-size-constraint-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-size-constraint-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/geo-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-permission-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-regex-pattern-set-request/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-regex-pattern-set-request/regex-pattern-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-byte-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/excluded-rules (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/excluded-rule))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-invalid-permission-policy-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-invalid-permission-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-invalid-permission-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sampled-requests-response/sampled-requests (clojure.spec.alpha/and :portkey.aws.waf-regional/sampled-http-requests))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sampled-requests-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.get-sampled-requests-response/sampled-requests :portkey.aws.waf-regional/population-size :portkey.aws.waf-regional/time-window]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.subscribed-rule-group-summary/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.subscribed-rule-group-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/subscribed-rule-group-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.subscribed-rule-group-summary/rule-group-id :portkey.aws.waf-regional.subscribed-rule-group-summary/name :portkey.aws.waf-regional/metric-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.xss-match-set-update/action :portkey.aws.waf-regional/xss-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-descriptors (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/ip-set-descriptor))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rule-groups-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rule-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rule-groups-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.web-acl-summary/web-acl-id :portkey.aws.waf-regional.web-acl-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-byte-match-set-request/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-byte-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/byte-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-byte-match-set-request/byte-match-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-byte-match-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-xss-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/xss-match-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-regex-match-set-request/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-regex-match-set-request/regex-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rule-request/rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/ip-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/size-constraint-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-unavailable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-unavailable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-unavailable-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-match-set-request/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-regex-match-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-match-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-regex-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-regex-match-set-request/regex-match-set-id :portkey.aws.waf-regional.update-regex-match-set-request/updates :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.waf-disallowed-name-exception/message (clojure.spec.alpha/and :portkey.aws.waf-regional/error-message))
(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-disallowed-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.waf-disallowed-name-exception/message]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/managed-keys (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/managed-key))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-size-constraint-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-constraint-value #{:mm "CR" :tw "TG" :fr "TJ" "ZA" "IM" "PE" :ni :bd "LC" :gh "CH" :kp :mh "RU" :tv :gu :bt "MP" "CK" "SI" :lr "AU" "KR" "IT" "FI" :gn "GF" :ge :az "SC" "SX" :fo "TT" :kh "TK" :rw :sz "MY" "SY" "MN" "TF" "KP" :ma "AM" :ws "DZ" :mv :hr "UY" :gp :es :io "TD" "DJ" :pt :vg :cz "BI" "MK" :gm "MU" "LI" :pg :pe :pk "NU" :lu "GR" "GY" :fi "CG" :ax :bz :ga :pf "NF" :do "ML" "AX" "GM" :cl "SA" :ye :au "CX" "BH" :bb "NE" :er :bi :tl "BN" "MF" "CD" "DK" :is :be "BJ" :ug :ba :tc :cv :kg "ME" "SJ" :dk "BO" :sm "JO" "CV" "VE" "CI" :gb "UZ" :cu :mo :dm "TN" :cd "IS" :ca :as :ro :sy :nc :td :li :ai :tz :sl "EH" :bj "TM" "GA" :th "LS" "TZ" :jp :ua "AT" :tr :et :lc :re :bl :aw :lk :us "LT" :hu "NP" :sg "BG" :mw "IL" "GU" "PK" :ec :mr :uz "PT" :gg "HR" "VU" "PF" "BM" :cr "MR" "GE" "HU" "TW" "MM" :nz :tn :gy :fj :ci :cc :la "VG" "YE" :so :kn "SR" :mq "PN" :zw :af "VA" "PR" "KW" :sa "SE" "GB" :cg :tf :pl "UM" "VN" "CF" "PA" "VC" :gq "JP" :ls :je "IR" :zm "AF" :vn "LY" :tj "MZ" "RO" "QA" "CM" "GG" :dj "BY" :ch :kw :am "SD" :ck "BQ" "MO" "KY" :tm "AR" :jo :sb :mf :eh :it :ht :om "BR" :cm "ZW" :bh "NR" "NZ" "AW" :gr :pw :gw "FJ" :co :ml "ID" "SV" "CN" :tt "FM" :uy "HT" "CC" "RW" "BA" :nu :mk "TL" :rs :nl "JM" "KM" :mz "KE" "WS" "TO" :bv "PY" "SH" :iq "CY" :sj :bf "GH" "MA" :vc "SG" :bn "LK" :gd "PH" "SM" :lb :pa :va "WF" "TR" "PS" "BZ" "CU" "TV" :za :mn "AD" "SB" "DM" "LR" :np :al "OM" "SO" :sk :kz :na :ie "DO" :ag :st "AL" "BL" :de "FR" "GW" :qa :nr :cx :id "MS" "BB" "CA" :mx :gt :pm :jm "MG" :cy :ar "KH" "LA" :at "GP" "BV" "HN" :aq "TH" :ke "DE" "LB" :gf "KZ" "AS" "EC" :ao :il "NO" :cf "AO" "FK" :ss "ET" "GS" "MD" :ru :gl :se "AG" "BE" :ph :bs "MV" "SZ" "CZ" "CL" :gi "BT" :sc "NL" :sd "EG" :sx :ve :sn "MQ" :bw :km :ee "SN" :by "FO" :br "EE" "AQ" "ST" "KN" "BW" "MH" "NI" "PG" :sv "VI" :sh "IQ" :mu :ne "KG" :hk :dz :mg "US" "ZM" "MC" "GI" "NC" :hm "GT" :mc :eg "BF" "YT" :ir :fk "LU" :me "UA" :ki "IE" "LV" "GD" :bm :ad "MW" :ae :my "BS" :bg :lt :ms "AZ" :bq :wf "SK" :hn :um :ng :pr "GQ" "TC" :py :yt "RE" "IN" "ES" :ly "GL" :lv :gs :tk "KI" :mt :mp "HK" :kr "CO" "SS" "RS" "IO" :im "NG" :cw :fm :pn :sr "UG" "CW" "SL" :si "ER" "JE" :tg :cn "AE" :vi "HM" :no :ps "PM" "BD" "MT" "AI" :bo "GN" :in "PW" :vu :md :to "NA" "MX" :nf :ky "PL"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-pattern-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.http-header/name (clojure.spec.alpha/and :portkey.aws.waf-regional/header-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-header/value (clojure.spec.alpha/and :portkey.aws.waf-regional/header-value))
(clojure.spec.alpha/def :portkey.aws.waf-regional/http-header (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.http-header/name :portkey.aws.waf-regional.http-header/value]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-sql-injection-match-set-request/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-sql-injection-match-set-request/sql-injection-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.xss-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.xss-match-set/xss-match-set-id :portkey.aws.waf-regional/xss-match-tuples] :opt-un [:portkey.aws.waf-regional.xss-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-geo-match-set-request/geo-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-geo-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-geo-match-set-request/geo-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-type #{"APPLICATION_LOAD_BALANCER" "API_GATEWAY" :application-load-balancer :api-gateway})

(clojure.spec.alpha/def :portkey.aws.waf-regional/list-logging-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/logging-configurations :portkey.aws.waf-regional/next-marker]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/match-field-type #{"SINGLE_QUERY_ARG" "QUERY_STRING" :method :header "METHOD" "HEADER" :all-query-args "URI" "ALL_QUERY_ARGS" "BODY" :uri :query-string :single-query-arg :body})

(clojure.spec.alpha/def :portkey.aws.waf-regional.rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.rule/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.rule/rule-id :portkey.aws.waf-regional/predicates] :opt-un [:portkey.aws.waf-regional.rule/name :portkey.aws.waf-regional/metric-name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-rule-group-request/rule-group-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rate-based-rule-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-rate-based-rule-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional/rate-key :portkey.aws.waf-regional/rate-limit :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-match-set-update/action :portkey.aws.waf-regional/regex-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-regex-pattern-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.byte-match-set/byte-match-set-id :portkey.aws.waf-regional/byte-match-tuples] :opt-un [:portkey.aws.waf-regional.byte-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-rate-based-rule-response/rule (clojure.spec.alpha/and :portkey.aws.waf-regional/rate-based-rule))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.create-rate-based-rule-response/rule :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sample-weight clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-web-acl-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/web-acl-summary]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-match-sets-response/regex-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/regex-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-match-sets-response/regex-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set-summary/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.byte-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.byte-match-set-summary/byte-match-set-id :portkey.aws.waf-regional.byte-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token-status]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/rule-group-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/rule-group-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-sql-injection-match-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-sql-injection-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-sql-injection-match-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/match-field-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/next-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sampled-http-requests (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sampled-http-request))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-size-constraint-set-request/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-size-constraint-set-request/size-constraint-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-byte-match-sets-response/byte-match-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/byte-match-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-byte-match-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-byte-match-sets-response/byte-match-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/xss-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/logging-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn :portkey.aws.waf-regional/log-destination-configs] :opt-un [:portkey.aws.waf-regional/redacted-fields]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-regex-pattern-set-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-regex-pattern-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-regex-pattern-set-request/name :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-rate-based-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/size-constraint-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/byte-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sql-injection-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/managed-keys :portkey.aws.waf-regional/next-marker]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1224))))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-size-constraint-sets-response/size-constraint-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/size-constraint-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-size-constraint-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-size-constraint-sets-response/size-constraint-sets]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-rate-based-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-rate-based-rule-request/rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-permission-policy-response/policy (clojure.spec.alpha/and :portkey.aws.waf-regional/policy-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-permission-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.get-permission-policy-response/policy]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-ip-set-request/ip-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule-group :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/predicates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/predicate))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-activated-rules-in-rule-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/rule-group-id :portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-activated-rules-in-rule-group-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-web-acl-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-web-acl-request/web-acl-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/regex-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-tuples (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/sql-injection-match-tuple))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-regex-pattern-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-regex-pattern-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-regex-pattern-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-rule-type #{:rate-based :regular :group "REGULAR" "RATE_BASED" "GROUP"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-geo-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-rules-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-rules-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sql-injection-match-set-update/action :portkey.aws.waf-regional/sql-injection-match-tuple] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/logging-configurations (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/logging-configuration))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-change-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/predicate-type #{:byte-match "SizeConstraint" "XssMatch" :ip-match "GeoMatch" "SqlInjectionMatch" :regex-match :geo-match :sql-injection-match :xss-match "ByteMatch" "RegexMatch" :size-constraint "IPMatch"})

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-group-request/rule-group-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rule-group-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-group-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rule-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-rule-group-request/rule-group-id :portkey.aws.waf-regional.update-rule-group-request/updates :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/associate-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/update-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/parameter-exception-field #{"RATE_KEY" "RULE_TYPE" :predicate-type "BYTE_MATCH_FIELD_TYPE" "WAF_OVERRIDE_ACTION" "GEO_MATCH_LOCATION_TYPE" "BYTE_MATCH_POSITIONAL_CONSTRAINT" "GEO_MATCH_LOCATION_VALUE" :byte-match-text-transformation :change-action "IPSET_TYPE" :ipset-type :geo-match-location-value :next-marker "WAF_ACTION" "SIZE_CONSTRAINT_COMPARISON_OPERATOR" :resource-arn :waf-action :rule-type :byte-match-positional-constraint "CHANGE_ACTION" :size-constraint-comparison-operator :geo-match-location-type "RESOURCE_ARN" :sql-injection-match-field-type "NEXT_MARKER" "BYTE_MATCH_TEXT_TRANSFORMATION" :byte-match-field-type "PREDICATE_TYPE" :rate-key "SQL_INJECTION_MATCH_FIELD_TYPE" :waf-override-action})

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-logging-configurations-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-logging-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-logging-configurations-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-updates (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/geo-match-set-update :min-count 1))

(clojure.spec.alpha/def :portkey.aws.waf-regional/xss-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/xss-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional/list-resources-for-web-acl-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/resource-arns]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-size-constraint-set-request/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-size-constraint-set-request/size-constraint-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-byte-match-set-request/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-byte-match-set-request/byte-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sql-injection-match-set/sql-injection-match-set-id :portkey.aws.waf-regional/sql-injection-match-tuples] :opt-un [:portkey.aws.waf-regional.sql-injection-match-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rate-based-rule-request/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-rate-based-rule-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-rate-based-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-rate-based-rule-request/rule-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-rate-based-rule-request/updates :portkey.aws.waf-regional/rate-limit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.update-size-constraint-set-request/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.update-size-constraint-set-request/updates (clojure.spec.alpha/and :portkey.aws.waf-regional/size-constraint-set-updates))
(clojure.spec.alpha/def :portkey.aws.waf-regional/update-size-constraint-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.update-size-constraint-set-request/size-constraint-set-id :portkey.aws.waf-regional/change-token :portkey.aws.waf-regional.update-size-constraint-set-request/updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.delete-xss-match-set-request/xss-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/delete-xss-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.delete-xss-match-set-request/xss-match-set-id :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-tuple/regex-pattern-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-tuple (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/field-to-match :portkey.aws.waf-regional/text-transformation :portkey.aws.waf-regional.regex-match-tuple/regex-pattern-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/action (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-byte-match-set-request/byte-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-byte-match-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-byte-match-set-request/byte-match-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.waf-regional/byte-match-set-summary))

(clojure.spec.alpha/def :portkey.aws.waf-regional.predicate/type (clojure.spec.alpha/and :portkey.aws.waf-regional/predicate-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional.predicate/data-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/predicate (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/negated :portkey.aws.waf-regional.predicate/type :portkey.aws.waf-regional.predicate/data-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set-summary/sql-injection-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.sql-injection-match-set-summary/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/sql-injection-match-set-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.sql-injection-match-set-summary/sql-injection-match-set-id :portkey.aws.waf-regional.sql-injection-match-set-summary/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/ip-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/priority (clojure.spec.alpha/and :portkey.aws.waf-regional/rule-priority))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/rule-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/override-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-override-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional.activated-rule/type (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-rule-type))
(clojure.spec.alpha/def :portkey.aws.waf-regional/activated-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.activated-rule/priority :portkey.aws.waf-regional.activated-rule/rule-id] :opt-un [:portkey.aws.waf-regional.activated-rule/action :portkey.aws.waf-regional.activated-rule/override-action :portkey.aws.waf-regional.activated-rule/type :portkey.aws.waf-regional/excluded-rules]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.get-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional/get-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.get-ip-set-request/ip-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.geo-match-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/geo-match-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.geo-match-set-update/action :portkey.aws.waf-regional/geo-match-constraint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/client-ip (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/uri (clojure.spec.alpha/and :portkey.aws.waf-regional/uri-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/method (clojure.spec.alpha/and :portkey.aws.waf-regional/http-method))
(clojure.spec.alpha/def :portkey.aws.waf-regional.http-request/headers (clojure.spec.alpha/and :portkey.aws.waf-regional/http-headers))
(clojure.spec.alpha/def :portkey.aws.waf-regional/http-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.http-request/client-ip :portkey.aws.waf-regional/country :portkey.aws.waf-regional.http-request/uri :portkey.aws.waf-regional.http-request/method :portkey.aws.waf-regional/http-version :portkey.aws.waf-regional.http-request/headers]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set/size-constraint-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.size-constraint-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/size-constraint-set (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.size-constraint-set/size-constraint-set-id :portkey.aws.waf-regional/size-constraints] :opt-un [:portkey.aws.waf-regional.size-constraint-set/name]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set/regex-match-set-id (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-id))
(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-match-set/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-match-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional.regex-match-set/regex-match-set-id :portkey.aws.waf-regional.regex-match-set/name :portkey.aws.waf-regional/regex-match-tuples]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sql-injection-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/sql-injection-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.web-acl-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/web-acl-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.web-acl-update/action :portkey.aws.waf-regional/activated-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-regex-match-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/regex-match-set]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/byte-match-target-string clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.waf-regional.create-web-acl-request/name (clojure.spec.alpha/and :portkey.aws.waf-regional/resource-name))
(clojure.spec.alpha/def :portkey.aws.waf-regional.create-web-acl-request/default-action (clojure.spec.alpha/and :portkey.aws.waf-regional/waf-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/create-web-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.create-web-acl-request/name :portkey.aws.waf-regional/metric-name :portkey.aws.waf-regional.create-web-acl-request/default-action :portkey.aws.waf-regional/change-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional.regex-pattern-set-update/action (clojure.spec.alpha/and :portkey.aws.waf-regional/change-action))
(clojure.spec.alpha/def :portkey.aws.waf-regional/regex-pattern-set-update (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional.regex-pattern-set-update/action :portkey.aws.waf-regional/regex-pattern-string] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/waf-override-action-type #{"COUNT" "NONE" :count :none})

(clojure.spec.alpha/def :portkey.aws.waf-regional/rate-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/negated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.waf-regional/create-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/ip-set :portkey.aws.waf-regional/change-token]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.put-permission-policy-request/policy (clojure.spec.alpha/and :portkey.aws.waf-regional/policy-string))
(clojure.spec.alpha/def :portkey.aws.waf-regional/put-permission-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.waf-regional/resource-arn :portkey.aws.waf-regional.put-permission-policy-request/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.waf-regional/managed-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/change-token-status #{:pending :provisioned "INSYNC" "PENDING" :insync "PROVISIONED"})

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-rule-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/rule-group]))

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-sql-injection-match-sets-request/limit (clojure.spec.alpha/and :portkey.aws.waf-regional/pagination-limit))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-sql-injection-match-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-sql-injection-match-sets-request/limit]))

(clojure.spec.alpha/def :portkey.aws.waf-regional/http-method (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.waf-regional/get-sampled-requests-max-items clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.waf-regional.list-ip-sets-response/ip-sets (clojure.spec.alpha/and :portkey.aws.waf-regional/ip-set-summaries))
(clojure.spec.alpha/def :portkey.aws.waf-regional/list-ip-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.waf-regional/next-marker :portkey.aws.waf-regional.list-ip-sets-response/ip-sets]))

(clojure.core/defn create-size-constraint-set "Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify\nthe part of a web request that you want AWS WAF to check for length, such as the\nlength of the User-Agent header or the length of the query string. For example,\nyou can create a SizeConstraintSet that matches any requests that have a query\nstring that is longer than 100 bytes. You can then configure AWS WAF to reject\nthose requests.\n To create and configure a SizeConstraintSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateSizeConstraintSet request.\n * Submit a CreateSizeConstraintSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateSizeConstraintSet request.\n * Submit an UpdateSizeConstraintSet request to specify the part of the request\nthat you want AWS WAF to inspect (for example, the header or the URI) and the\nvalue that you want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-size-constraint-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-size-constraint-set-request create-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSizeConstraintSet", :http.request.configuration/output-deser-fn response-create-size-constraint-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-size-constraint-set-response))

(clojure.core/defn list-rules "Returns an array of RuleSummary objects." ([] (list-rules {})) ([list-rules-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-rules-request list-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRules", :http.request.configuration/output-deser-fn response-list-rules-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-rules :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-rules-response))

(clojure.core/defn delete-rule "Permanently deletes a Rule. You can't delete a Rule if it's still used in any\nWebACL objects or if it still includes any predicates, such as ByteMatchSet\nobjects.\n If you just want to remove a Rule from a WebACL, use UpdateWebACL.\n To permanently delete a Rule from AWS WAF, perform the following steps:\n * Update the Rule to remove predicates, if any. For more information, see\nUpdateRule.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteRule request.\n * Submit a DeleteRule request." ([delete-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-rule-request delete-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRule", :http.request.configuration/output-deser-fn response-delete-rule-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-rule-response))

(clojure.core/defn list-activated-rules-in-rule-group "Returns an array of ActivatedRule objects." ([] (list-activated-rules-in-rule-group {})) ([list-activated-rules-in-rule-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-activated-rules-in-rule-group-request list-activated-rules-in-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-activated-rules-in-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-activated-rules-in-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListActivatedRulesInRuleGroup", :http.request.configuration/output-deser-fn response-list-activated-rules-in-rule-group-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-activated-rules-in-rule-group :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-activated-rules-in-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-activated-rules-in-rule-group-response))

(clojure.core/defn update-sql-injection-match-set "Inserts or deletes SqlInjectionMatchTuple objects (filters) in a\nSqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the\nfollowing values:\n * Action: Whether to insert the object into or delete the object from the\narray. To change a SqlInjectionMatchTuple, you delete the existing object and\nadd a new one.\n * FieldToMatch: The part of web requests that you want AWS WAF to inspect and,\nif you want AWS WAF to inspect a header or custom query parameter, the name of\nthe header or parameter.\n * TextTransformation: Which text transformation, if any, to perform on the web\nrequest before inspecting the request for snippets of malicious SQL code.\n You can only specify a single type of TextTransformation.\n You use SqlInjectionMatchSet objects to specify which CloudFront requests that\nyou want to allow, block, or count. For example, if you're receiving requests\nthat contain snippets of SQL code in the query string and you want to block the\nrequests, you can create a SqlInjectionMatchSet with the applicable settings,\nand then configure AWS WAF to block the requests.\n To create and configure a SqlInjectionMatchSet, perform the following steps:\n * Submit a CreateSqlInjectionMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateIPSet request.\n * Submit an UpdateSqlInjectionMatchSet request to specify the parts of web\nrequests that you want AWS WAF to inspect for snippets of SQL code.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-sql-injection-match-set-request update-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSqlInjectionMatchSet", :http.request.configuration/output-deser-fn response-update-sql-injection-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-sql-injection-match-set-response))

(clojure.core/defn get-regex-match-set "Returns the RegexMatchSet specified by RegexMatchSetId." ([get-regex-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-regex-match-set-request get-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRegexMatchSet", :http.request.configuration/output-deser-fn response-get-regex-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-regex-match-set-response))

(clojure.core/defn update-ip-set "Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor\nobject, you specify the following values:\n * Whether to insert or delete the object from the array. If you want to change\nan IPSetDescriptor object, you delete the existing object and add a new one.\n * The IP address version, IPv4 or IPv6.\n * The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of\nIP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual\nIP address 192.0.2.44).\n AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32.\nAWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128. For\nmore information about CIDR notation, see the Wikipedia entry Classless\nInter-Domain Routing\n(https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing).\n IPv6 addresses can be represented using any of the following formats:\n * 1111:0000:0000:0000:0000:0000:0000:0111/128\n * 1111:0:0:0:0:0:0:0111/128\n * 1111::0111/128\n * 1111::111/128\n You use an IPSet to specify which web requests you want to allow or block based\non the IP addresses that the requests originated from. For example, if you're\nreceiving a lot of requests from one or a small number of IP addresses and you\nwant to block the requests, you can create an IPSet that specifies those IP\naddresses, and then configure AWS WAF to block the requests.\n To create and configure an IPSet, perform the following steps:\n * Submit a CreateIPSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateIPSet request.\n * Submit an UpdateIPSet request to specify the IP addresses that you want AWS\nWAF to watch for.\n When you update an IPSet, you specify the IP addresses that you want to add\nand/or the IP addresses that you want to delete. If you want to change an IP\naddress, you delete the existing IP address and add the new one.\n You can insert a maximum of 1000 addresses in a single request.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-ip-set-request update-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateIPSet", :http.request.configuration/output-deser-fn response-update-ip-set-response, :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-ip-set-response))

(clojure.core/defn get-ip-set "Returns the IPSet that is specified by IPSetId." ([get-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-ip-set-request get-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIPSet", :http.request.configuration/output-deser-fn response-get-ip-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-ip-set-response))

(clojure.core/defn get-sql-injection-match-set "Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId." ([get-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-sql-injection-match-set-request get-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSqlInjectionMatchSet", :http.request.configuration/output-deser-fn response-get-sql-injection-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-sql-injection-match-set-response))

(clojure.core/defn put-permission-policy "Attaches a IAM policy to the specified resource. The only supported use for this\naction is to share a RuleGroup across accounts.\n The PutPermissionPolicy is subject to the following restrictions:\n * You can attach only one policy with each PutPermissionPolicy request.\n * The policy must include an Effect, Action and Principal.\n * Effect must specify Allow.\n * The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL,\nwaf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions\nin the policy will be rejected.\n * The policy cannot include a Resource parameter.\n * The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup\nmust exist in the same region.\n * The user making the request must be the owner of the RuleGroup.\n * Your policy must be composed using IAM Policy version 2012-10-17.\n For more information, see IAM Policies\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html).\n An example of a valid policy parameter is shown in the Examples section below." ([put-permission-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-permission-policy-request put-permission-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/put-permission-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/put-permission-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPermissionPolicy", :http.request.configuration/output-deser-fn response-put-permission-policy-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidPermissionPolicyException" :portkey.aws.waf-regional/waf-invalid-permission-policy-exception}})))))
(clojure.spec.alpha/fdef put-permission-policy :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/put-permission-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/put-permission-policy-response))

(clojure.core/defn create-xss-match-set "Creates an XssMatchSet, which you use to allow, block, or count requests that\ncontain cross-site scripting attacks in the specified part of web requests. AWS\nWAF searches for character sequences that are likely to be malicious strings.\n To create and configure an XssMatchSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateXssMatchSet request.\n * Submit a CreateXssMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateXssMatchSet request.\n * Submit an UpdateXssMatchSet request to specify the parts of web requests in\nwhich you want to allow, block, or count cross-site scripting attacks.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-xss-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-xss-match-set-request create-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateXssMatchSet", :http.request.configuration/output-deser-fn response-create-xss-match-set-response, :http.request.spec/error-spec {"WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-xss-match-set-response))

(clojure.core/defn update-rule-group "Inserts or deletes ActivatedRule objects in a RuleGroup.\n You can only insert REGULAR rules into a rule group.\n You can have a maximum of ten rules per rule group.\n To create and configure a RuleGroup, perform the following steps:\n * Create and update the Rules that you want to include in the RuleGroup. See\nCreateRule.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRuleGroup request.\n * Submit an UpdateRuleGroup request to add Rules to the RuleGroup.\n * Create and update a WebACL that contains the RuleGroup. See CreateWebACL.\n If you want to replace one Rule with another, you delete the existing one and\nadd the new one.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-rule-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-rule-group-request update-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRuleGroup", :http.request.configuration/output-deser-fn response-update-rule-group-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-rule-group-response))

(clojure.core/defn list-resources-for-web-acl "Returns an array of resources associated with the specified web ACL." ([list-resources-for-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resources-for-web-acl-request list-resources-for-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-resources-for-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-resources-for-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourcesForWebACL", :http.request.configuration/output-deser-fn response-list-resources-for-web-acl-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-resources-for-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/list-resources-for-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-resources-for-web-acl-response))

(clojure.core/defn create-geo-match-set "Creates an GeoMatchSet, which you use to specify which web requests you want to\nallow or block based on the country that the requests originate from. For\nexample, if you're receiving a lot of requests from one or more countries and\nyou want to block the requests, you can create an GeoMatchSet that contains\nthose countries and then configure AWS WAF to block the requests.\n To create and configure a GeoMatchSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateGeoMatchSet request.\n * Submit a CreateGeoMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateGeoMatchSet request.\n * Submit an UpdateGeoMatchSetSet request to specify the countries that you want\nAWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-geo-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-geo-match-set-request create-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGeoMatchSet", :http.request.configuration/output-deser-fn response-create-geo-match-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-geo-match-set-response))

(clojure.core/defn get-rate-based-rule-managed-keys "Returns an array of IP addresses currently being blocked by the RateBasedRule\nthat is specified by the RuleId. The maximum number of managed keys that will be\nblocked is 10,000. If more than 10,000 addresses exceed the rate limit, the\n10,000 addresses with the highest rates will be blocked." ([get-rate-based-rule-managed-keys-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-rate-based-rule-managed-keys-request get-rate-based-rule-managed-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRateBasedRuleManagedKeys", :http.request.configuration/output-deser-fn response-get-rate-based-rule-managed-keys-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-rate-based-rule-managed-keys :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rate-based-rule-managed-keys-response))

(clojure.core/defn list-xss-match-sets "Returns an array of XssMatchSet objects." ([] (list-xss-match-sets {})) ([list-xss-match-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-xss-match-sets-request list-xss-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-xss-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-xss-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListXssMatchSets", :http.request.configuration/output-deser-fn response-list-xss-match-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-xss-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-xss-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-xss-match-sets-response))

(clojure.core/defn list-subscribed-rule-groups "Returns an array of RuleGroup objects that you are subscribed to." ([] (list-subscribed-rule-groups {})) ([list-subscribed-rule-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-subscribed-rule-groups-request list-subscribed-rule-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-subscribed-rule-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-subscribed-rule-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSubscribedRuleGroups", :http.request.configuration/output-deser-fn response-list-subscribed-rule-groups-response, :http.request.spec/error-spec {"WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-subscribed-rule-groups :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-subscribed-rule-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-subscribed-rule-groups-response))

(clojure.core/defn create-regex-pattern-set "Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the\nregular expression (regex) pattern that you want AWS WAF to search for, such as\nB[a@]dB[o0]t. You can then configure AWS WAF to reject those requests.\n To create and configure a RegexPatternSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateRegexPatternSet request.\n * Submit a CreateRegexPatternSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRegexPatternSet request.\n * Submit an UpdateRegexPatternSet request to specify the string that you want\nAWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-regex-pattern-set-request create-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRegexPatternSet", :http.request.configuration/output-deser-fn response-create-regex-pattern-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-regex-pattern-set-response))

(clojure.core/defn get-byte-match-set "Returns the ByteMatchSet specified by ByteMatchSetId." ([get-byte-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-byte-match-set-request get-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetByteMatchSet", :http.request.configuration/output-deser-fn response-get-byte-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-byte-match-set-response))

(clojure.core/defn delete-sql-injection-match-set "Permanently deletes a SqlInjectionMatchSet. You can't delete a\nSqlInjectionMatchSet if it's still used in any Rules or if it still contains any\nSqlInjectionMatchTuple objects.\n If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule.\n To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the\nfollowing steps:\n * Update the SqlInjectionMatchSet to remove filters, if any. For more\ninformation, see UpdateSqlInjectionMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteSqlInjectionMatchSet request.\n * Submit a DeleteSqlInjectionMatchSet request." ([delete-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-sql-injection-match-set-request delete-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSqlInjectionMatchSet", :http.request.configuration/output-deser-fn response-delete-sql-injection-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-sql-injection-match-set-response))

(clojure.core/defn update-rate-based-rule "Inserts or deletes Predicate objects in a rule and updates the RateLimit in the\nrule.\n Each Predicate object identifies a predicate, such as a ByteMatchSet or an\nIPSet, that specifies the web requests that you want to block or count. The\nRateLimit specifies the number of requests every five minutes that triggers the\nrule.\n If you add more than one predicate to a RateBasedRule, a request must match all\nthe predicates and exceed the RateLimit to be counted or blocked. For example,\nsuppose you add the following to a RateBasedRule:\n * An IPSet that matches the IP address 192.0.2.44/32\n * A ByteMatchSet that matches BadBot in the User-Agent header\n Further, you specify a RateLimit of 15,000.\n You then add the RateBasedRule to a WebACL and specify that you want to block\nrequests that satisfy the rule. For a request to be blocked, it must come from\nthe IP address 192.0.2.44 and the User-Agent header in the request must contain\nthe value BadBot. Further, requests that match these two conditions much be\nreceived at a rate of more than 15,000 every five minutes. If the rate drops\nbelow this limit, AWS WAF no longer blocks the requests.\n As a second example, suppose you want to limit requests to a particular page on\nyour site. To do this, you could add the following to a RateBasedRule:\n * A ByteMatchSet with FieldToMatch of URI\n * A PositionalConstraint of STARTS_WITH\n * A TargetString of login\n Further, you specify a RateLimit of 15,000.\n By adding this RateBasedRule to a WebACL, you could limit requests to your\nlogin page without affecting the rest of your site." ([update-rate-based-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-rate-based-rule-request update-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRateBasedRule", :http.request.configuration/output-deser-fn response-update-rate-based-rule-response, :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-rate-based-rule-response))

(clojure.core/defn list-geo-match-sets "Returns an array of GeoMatchSetSummary objects in the response." ([] (list-geo-match-sets {})) ([list-geo-match-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-geo-match-sets-request list-geo-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-geo-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-geo-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGeoMatchSets", :http.request.configuration/output-deser-fn response-list-geo-match-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-geo-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-geo-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-geo-match-sets-response))

(clojure.core/defn delete-permission-policy "Permanently deletes an IAM policy from the specified RuleGroup.\n The user making the request must be the owner of the RuleGroup." ([delete-permission-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-permission-policy-request delete-permission-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-permission-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-permission-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePermissionPolicy", :http.request.configuration/output-deser-fn response-delete-permission-policy-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef delete-permission-policy :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-permission-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-permission-policy-response))

(clojure.core/defn update-regex-match-set "Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For\neach RegexMatchSetUpdate object, you specify the following values:\n * Whether to insert or delete the object from the array. If you want to change\na RegexMatchSetUpdate object, you delete the existing object and add a new one.\n * The part of a web request that you want AWS WAF to inspectupdate, such as a\nquery string or the value of the User-Agent header.\n * The identifier of the pattern (a regular expression) that you want AWS WAF to\nlook for. For more information, see RegexPatternSet.\n * Whether to perform any conversions on the request, such as converting it to\nlowercase, before inspecting it for the specified string.\n For example, you can create a RegexPatternSet that matches any requests with\nUser-Agent headers that contain the string B[a@]dB[o0]t. You can then configure\nAWS WAF to reject those requests.\n To create and configure a RegexMatchSet, perform the following steps:\n * Create a RegexMatchSet. For more information, see CreateRegexMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRegexMatchSet request.\n * Submit an UpdateRegexMatchSet request to specify the part of the request that\nyou want AWS WAF to inspect (for example, the header or the URI) and the\nidentifier of the RegexPatternSet that contain the regular expression patters\nyou want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-regex-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-regex-match-set-request update-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRegexMatchSet", :http.request.configuration/output-deser-fn response-update-regex-match-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef update-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-regex-match-set-response))

(clojure.core/defn disassociate-web-acl "Removes a web ACL from the specified resource, either an application load\nbalancer or Amazon API Gateway stage." ([disassociate-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-web-acl-request disassociate-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/disassociate-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/disassociate-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateWebACL", :http.request.configuration/output-deser-fn response-disassociate-web-acl-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef disassociate-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/disassociate-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/disassociate-web-acl-response))

(clojure.core/defn list-size-constraint-sets "Returns an array of SizeConstraintSetSummary objects." ([] (list-size-constraint-sets {})) ([list-size-constraint-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-size-constraint-sets-request list-size-constraint-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-size-constraint-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-size-constraint-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSizeConstraintSets", :http.request.configuration/output-deser-fn response-list-size-constraint-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-size-constraint-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-size-constraint-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-size-constraint-sets-response))

(clojure.core/defn update-byte-match-set "Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each\nByteMatchTuple object, you specify the following values:\n * Whether to insert or delete the object from the array. If you want to change\na ByteMatchSetUpdate object, you delete the existing object and add a new one.\n * The part of a web request that you want AWS WAF to inspect, such as a query\nstring or the value of the User-Agent header.\n * The bytes (typically a string that corresponds with ASCII characters) that\nyou want AWS WAF to look for. For more information, including how you specify\nthe values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the\nByteMatchTuple data type.\n * Where to look, such as at the beginning or the end of a query string.\n * Whether to perform any conversions on the request, such as converting it to\nlowercase, before inspecting it for the specified string.\n For example, you can add a ByteMatchSetUpdate object that matches web requests\nin which User-Agent headers contain the string BadBot. You can then configure\nAWS WAF to block those requests.\n To create and configure a ByteMatchSet, perform the following steps:\n * Create a ByteMatchSet. For more information, see CreateByteMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateByteMatchSet request.\n * Submit an UpdateByteMatchSet request to specify the part of the request that\nyou want AWS WAF to inspect (for example, the header or the URI) and the value\nthat you want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-byte-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-byte-match-set-request update-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateByteMatchSet", :http.request.configuration/output-deser-fn response-update-byte-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-byte-match-set-response))

(clojure.core/defn update-geo-match-set "Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each\nGeoMatchConstraint object, you specify the following values:\n * Whether to insert or delete the object from the array. If you want to change\nan GeoMatchConstraint object, you delete the existing object and add a new one.\n * The Type. The only valid value for Type is Country.\n * The Value, which is a two character code for the country to add to the\nGeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.\n To create and configure an GeoMatchSet, perform the following steps:\n * Submit a CreateGeoMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateGeoMatchSet request.\n * Submit an UpdateGeoMatchSet request to specify the country that you want AWS\nWAF to watch for.\n When you update an GeoMatchSet, you specify the country that you want to add\nand/or the country that you want to delete. If you want to change a country, you\ndelete the existing country and add the new one.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-geo-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-geo-match-set-request update-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGeoMatchSet", :http.request.configuration/output-deser-fn response-update-geo-match-set-response, :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-geo-match-set-response))

(clojure.core/defn update-regex-pattern-set "Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each\nRegexPatternString object, you specify the following values:\n * Whether to insert or delete the RegexPatternString.\n * The regular expression pattern that you want to insert or delete. For more\ninformation, see RegexPatternSet.\n For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF\nwill match this RegexPatternString to:\n * BadBot\n * BadB0t\n * B@dBot\n * B@dB0t\n To create and configure a RegexPatternSet, perform the following steps:\n * Create a RegexPatternSet. For more information, see CreateRegexPatternSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRegexPatternSet request.\n * Submit an UpdateRegexPatternSet request to specify the regular expression\npattern that you want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-regex-pattern-set-request update-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRegexPatternSet", :http.request.configuration/output-deser-fn response-update-regex-pattern-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidRegexPatternException" :portkey.aws.waf-regional/waf-invalid-regex-pattern-exception}})))))
(clojure.spec.alpha/fdef update-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-regex-pattern-set-response))

(clojure.core/defn get-change-token-status "Returns the status of a ChangeToken that you got by calling GetChangeToken.\nChangeTokenStatus is one of the following values:\n * PROVISIONED: You requested the change token by calling GetChangeToken, but\nyou haven't used it yet in a call to create, update, or delete an AWS WAF\nobject.\n * PENDING: AWS WAF is propagating the create, update, or delete request to all\nAWS WAF servers.\n * INSYNC: Propagation is complete." ([get-change-token-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-change-token-status-request get-change-token-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-change-token-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-change-token-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetChangeTokenStatus", :http.request.configuration/output-deser-fn response-get-change-token-status-response, :http.request.spec/error-spec {"WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-change-token-status :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-change-token-status-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-change-token-status-response))

(clojure.core/defn create-web-acl "Creates a WebACL, which contains the Rules that identify the CloudFront web\nrequests that you want to allow, block, or count. AWS WAF evaluates Rules in\norder based on the value of Priority for each Rule.\n You also specify a default action, either ALLOW or BLOCK. If a web request\ndoesn't match any of the Rules in a WebACL, AWS WAF responds to the request with\nthe default action.\n To create and configure a WebACL, perform the following steps:\n * Create and update the ByteMatchSet objects and other predicates that you want\nto include in Rules. For more information, see CreateByteMatchSet,\nUpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and\nUpdateSqlInjectionMatchSet.\n * Create and update the Rules that you want to include in the WebACL. For more\ninformation, see CreateRule and UpdateRule.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateWebACL request.\n * Submit a CreateWebACL request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateWebACL request.\n * Submit an UpdateWebACL request to specify the Rules that you want to include\nin the WebACL, to specify the default action, and to associate the WebACL with a\nCloudFront distribution.\n For more information about how to use the AWS WAF API, see the AWS WAF\nDeveloper Guide (https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-web-acl-request create-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateWebACL", :http.request.configuration/output-deser-fn response-create-web-acl-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-web-acl-response))

(clojure.core/defn create-ip-set "Creates an IPSet, which you use to specify which web requests that you want to\nallow or block based on the IP addresses that the requests originate from. For\nexample, if you're receiving a lot of requests from one or more individual IP\naddresses or one or more ranges of IP addresses and you want to block the\nrequests, you can create an IPSet that contains those IP addresses and then\nconfigure AWS WAF to block the requests.\n To create and configure an IPSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateIPSet request.\n * Submit a CreateIPSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateIPSet request.\n * Submit an UpdateIPSet request to specify the IP addresses that you want AWS\nWAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-ip-set-request create-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIPSet", :http.request.configuration/output-deser-fn response-create-ip-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-ip-set-response))

(clojure.core/defn delete-xss-match-set "Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's\nstill used in any Rules or if it still contains any XssMatchTuple objects.\n If you just want to remove an XssMatchSet from a Rule, use UpdateRule.\n To permanently delete an XssMatchSet from AWS WAF, perform the following steps:\n * Update the XssMatchSet to remove filters, if any. For more information, see\nUpdateXssMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteXssMatchSet request.\n * Submit a DeleteXssMatchSet request." ([delete-xss-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-xss-match-set-request delete-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteXssMatchSet", :http.request.configuration/output-deser-fn response-delete-xss-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-xss-match-set-response))

(clojure.core/defn put-logging-configuration "Associates a LoggingConfiguration with a specified web ACL.\n You can access information about all traffic that AWS WAF inspects using the\nfollowing steps:\n * Create an Amazon Kinesis Data Firehose .\n Create the data firehose with a PUT source and in the region that you are\noperating. However, if you are capturing logs for Amazon CloudFront, always\ncreate the firehose in US East (N. Virginia).\n * Associate that firehose to your web ACL using a PutLoggingConfiguration\nrequest.\n When you successfully enable logging using a PutLoggingConfiguration request,\nAWS WAF will create a service linked role with the necessary permissions to\nwrite logs to the Amazon Kinesis Data Firehose. For more information, see\nLogging Web ACL Traffic Information\n(https://docs.aws.amazon.com/waf/latest/developerguide/logging.html) in the AWS\nWAF Developer Guide." ([put-logging-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-logging-configuration-request put-logging-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/put-logging-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/put-logging-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLoggingConfiguration", :http.request.configuration/output-deser-fn response-put-logging-configuration-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFServiceLinkedRoleErrorException" :portkey.aws.waf-regional/waf-service-linked-role-error-exception}})))))
(clojure.spec.alpha/fdef put-logging-configuration :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/put-logging-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/put-logging-configuration-response))

(clojure.core/defn list-rate-based-rules "Returns an array of RuleSummary objects." ([] (list-rate-based-rules {})) ([list-rate-based-rules-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-rate-based-rules-request list-rate-based-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-rate-based-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-rate-based-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRateBasedRules", :http.request.configuration/output-deser-fn response-list-rate-based-rules-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-rate-based-rules :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-rate-based-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-rate-based-rules-response))

(clojure.core/defn get-sampled-requests "Gets detailed information about a specified number of requests--a sample--that\nAWS WAF randomly selects from among the first 5,000 requests that your AWS\nresource received during a time range that you choose. You can specify a sample\nsize of up to 500 requests, and you can specify any time range in the previous\nthree hours.\n GetSampledRequests returns a time range, which is usually the time range that\nyou specified. However, if your resource (such as a CloudFront distribution)\nreceived 5,000 requests before the specified time range elapsed,\nGetSampledRequests returns an updated time range. This new time range indicates\nthe actual period during which AWS WAF selected the requests in the sample." ([get-sampled-requests-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-sampled-requests-request get-sampled-requests-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-sampled-requests-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-sampled-requests-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSampledRequests", :http.request.configuration/output-deser-fn response-get-sampled-requests-response, :http.request.spec/error-spec {"WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-sampled-requests :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-sampled-requests-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-sampled-requests-response))

(clojure.core/defn get-logging-configuration "Returns the LoggingConfiguration for the specified web ACL." ([get-logging-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-logging-configuration-request get-logging-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-logging-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-logging-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLoggingConfiguration", :http.request.configuration/output-deser-fn response-get-logging-configuration-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-logging-configuration :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-logging-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-logging-configuration-response))

(clojure.core/defn create-rule "Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and\nother predicates that identify the requests that you want to block. If you add\nmore than one predicate to a Rule, a request must match all of the\nspecifications to be allowed or blocked. For example, suppose that you add the\nfollowing to a Rule:\n * An IPSet that matches the IP address 192.0.2.44/32\n * A ByteMatchSet that matches BadBot in the User-Agent header\n You then add the Rule to a WebACL and specify that you want to blocks requests\nthat satisfy the Rule. For a request to be blocked, it must come from the IP\naddress 192.0.2.44 and the User-Agent header in the request must contain the\nvalue BadBot.\n To create and configure a Rule, perform the following steps:\n * Create and update the predicates that you want to include in the Rule. For\nmore information, see CreateByteMatchSet, CreateIPSet, and\nCreateSqlInjectionMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateRule request.\n * Submit a CreateRule request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRule request.\n * Submit an UpdateRule request to specify the predicates that you want to\ninclude in the Rule.\n * Create and update a WebACL that contains the Rule. For more information, see\nCreateWebACL.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-rule-request create-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRule", :http.request.configuration/output-deser-fn response-create-rule-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-rule-response))

(clojure.core/defn update-rule "Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies\na predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests\nthat you want to allow, block, or count. If you add more than one predicate to a\nRule, a request must match all of the specifications to be allowed, blocked, or\ncounted. For example, suppose that you add the following to a Rule:\n * A ByteMatchSet that matches the value BadBot in the User-Agent header\n * An IPSet that matches the IP address 192.0.2.44\n You then add the Rule to a WebACL and specify that you want to block requests\nthat satisfy the Rule. For a request to be blocked, the User-Agent header in the\nrequest must contain the value BadBot and the request must originate from the IP\naddress 192.0.2.44.\n To create and configure a Rule, perform the following steps:\n * Create and update the predicates that you want to include in the Rule.\n * Create the Rule. See CreateRule.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRule request.\n * Submit an UpdateRule request to add predicates to the Rule.\n * Create and update a WebACL that contains the Rule. See CreateWebACL.\n If you want to replace one ByteMatchSet or IPSet with another, you delete the\nexisting one and add the new one.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-rule-request update-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRule", :http.request.configuration/output-deser-fn response-update-rule-response, :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-rule-response))

(clojure.core/defn get-geo-match-set "Returns the GeoMatchSet that is specified by GeoMatchSetId." ([get-geo-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-geo-match-set-request get-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGeoMatchSet", :http.request.configuration/output-deser-fn response-get-geo-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-geo-match-set-response))

(clojure.core/defn list-web-ac-ls "Returns an array of WebACLSummary objects in the response." ([] (list-web-ac-ls {})) ([list-web-ac-ls-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-web-ac-ls-request list-web-ac-ls-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-web-ac-ls-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-web-ac-ls-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWebACLs", :http.request.configuration/output-deser-fn response-list-web-ac-ls-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-web-ac-ls :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-web-ac-ls-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-web-ac-ls-response))

(clojure.core/defn update-web-acl "Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web\nrequests that you want to allow, block, or count. When you update a WebACL, you\nspecify the following values:\n * A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the\ndefault action if a request doesn't match the criteria in any of the Rules in a\nWebACL.\n * The Rules that you want to add or delete. If you want to replace one Rule\nwith another, you delete the existing Rule and add the new one.\n * For each Rule, whether you want AWS WAF to allow requests, block requests, or\ncount requests that match the conditions in the Rule.\n * The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you\nadd more than one Rule to a WebACL, AWS WAF evaluates each request against the\nRules in order based on the value of Priority. (The Rule that has the lowest\nvalue for Priority is evaluated first.) When a web request matches all the\npredicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately\ntakes the corresponding action, allow or block, and doesn't evaluate the request\nagainst the remaining Rules in the WebACL, if any.\n To create and configure a WebACL, perform the following steps:\n * Create and update the predicates that you want to include in Rules. For more\ninformation, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet,\nUpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.\n * Create and update the Rules that you want to include in the WebACL. For more\ninformation, see CreateRule and UpdateRule.\n * Create a WebACL. See CreateWebACL.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateWebACL request.\n * Submit an UpdateWebACL request to specify the Rules that you want to include\nin the WebACL, to specify the default action, and to associate the WebACL with a\nCloudFront distribution.\n The ActivatedRule can be a rule group. If you specify a rule group as your\nActivatedRule, you can exclude specific rules from that rule group.\n If you already have a rule group associated with a web ACL and want to submit\nan UpdateWebACL request to exclude certain rules from that rule group, you must\nfirst remove the rule group from the web ACL, the re-insert it again, specifying\nthe excluded rules. For details, see ActivatedRule$ExcludedRules.\n Be aware that if you try to add a RATE_BASED rule to a web ACL without setting\nthe rule type when first creating the rule, the UpdateWebACL request will fail\nbecause the request tries to add a REGULAR rule (the default rule type) with the\nspecified ID, which does not exist.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-web-acl-request update-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateWebACL", :http.request.configuration/output-deser-fn response-update-web-acl-response, :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception, "WAFSubscriptionNotFoundException" :portkey.aws.waf-regional/waf-subscription-not-found-exception}})))))
(clojure.spec.alpha/fdef update-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-web-acl-response))

(clojure.core/defn update-xss-match-set "Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each\nXssMatchTuple object, you specify the following values:\n * Action: Whether to insert the object into or delete the object from the\narray. To change an XssMatchTuple, you delete the existing object and add a new\none.\n * FieldToMatch: The part of web requests that you want AWS WAF to inspect and,\nif you want AWS WAF to inspect a header or custom query parameter, the name of\nthe header or parameter.\n * TextTransformation: Which text transformation, if any, to perform on the web\nrequest before inspecting the request for cross-site scripting attacks.\n You can only specify a single type of TextTransformation.\n You use XssMatchSet objects to specify which CloudFront requests that you want\nto allow, block, or count. For example, if you're receiving requests that\ncontain cross-site scripting attacks in the request body and you want to block\nthe requests, you can create an XssMatchSet with the applicable settings, and\nthen configure AWS WAF to block the requests.\n To create and configure an XssMatchSet, perform the following steps:\n * Submit a CreateXssMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateIPSet request.\n * Submit an UpdateXssMatchSet request to specify the parts of web requests that\nyou want AWS WAF to inspect for cross-site scripting attacks.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-xss-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-xss-match-set-request update-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateXssMatchSet", :http.request.configuration/output-deser-fn response-update-xss-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-xss-match-set-response))

(clojure.core/defn delete-web-acl "Permanently deletes a WebACL. You can't delete a WebACL if it still contains any\nRules.\n To delete a WebACL, perform the following steps:\n * Update the WebACL to remove Rules, if any. For more information, see\nUpdateWebACL.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteWebACL request.\n * Submit a DeleteWebACL request." ([delete-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-web-acl-request delete-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteWebACL", :http.request.configuration/output-deser-fn response-delete-web-acl-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-web-acl-response))

(clojure.core/defn update-size-constraint-set "Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For\neach SizeConstraint object, you specify the following values:\n * Whether to insert or delete the object from the array. If you want to change\na SizeConstraintSetUpdate object, you delete the existing object and add a new\none.\n * The part of a web request that you want AWS WAF to evaluate, such as the\nlength of a query string or the length of the User-Agent header.\n * Whether to perform any transformations on the request, such as converting it\nto lowercase, before checking its length. Note that transformations of the\nrequest body are not supported because the AWS resource forwards only the first\n8192 bytes of your request to AWS WAF.\n You can only specify a single type of TextTransformation.\n * A ComparisonOperator used for evaluating the selected part of the request\nagainst the specified Size, such as equals, greater than, less than, and so on.\n * The length, in bytes, that you want AWS WAF to watch for in selected part of\nthe request. The length is computed after applying the transformation.\n For example, you can add a SizeConstraintSetUpdate object that matches web\nrequests in which the length of the User-Agent header is greater than 100 bytes.\nYou can then configure AWS WAF to block those requests.\n To create and configure a SizeConstraintSet, perform the following steps:\n * Create a SizeConstraintSet. For more information, see\nCreateSizeConstraintSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateSizeConstraintSet request.\n * Submit an UpdateSizeConstraintSet request to specify the part of the request\nthat you want AWS WAF to inspect (for example, the header or the URI) and the\nvalue that you want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([update-size-constraint-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-size-constraint-set-request update-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/update-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/update-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSizeConstraintSet", :http.request.configuration/output-deser-fn response-update-size-constraint-set-response, :http.request.spec/error-spec {"WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFNonexistentContainerException" :portkey.aws.waf-regional/waf-nonexistent-container-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/update-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/update-size-constraint-set-response))

(clojure.core/defn delete-rate-based-rule "Permanently deletes a RateBasedRule. You can't delete a rule if it's still used\nin any WebACL objects or if it still includes any predicates, such as\nByteMatchSet objects.\n If you just want to remove a rule from a WebACL, use UpdateWebACL.\n To permanently delete a RateBasedRule from AWS WAF, perform the following\nsteps:\n * Update the RateBasedRule to remove predicates, if any. For more information,\nsee UpdateRateBasedRule.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteRateBasedRule request.\n * Submit a DeleteRateBasedRule request." ([delete-rate-based-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-rate-based-rule-request delete-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRateBasedRule", :http.request.configuration/output-deser-fn response-delete-rate-based-rule-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-rate-based-rule-response))

(clojure.core/defn delete-byte-match-set "Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's\nstill used in any Rules or if it still includes any ByteMatchTuple objects (any\nfilters).\n If you just want to remove a ByteMatchSet from a Rule, use UpdateRule.\n To permanently delete a ByteMatchSet, perform the following steps:\n * Update the ByteMatchSet to remove filters, if any. For more information, see\nUpdateByteMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteByteMatchSet request.\n * Submit a DeleteByteMatchSet request." ([delete-byte-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-byte-match-set-request delete-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteByteMatchSet", :http.request.configuration/output-deser-fn response-delete-byte-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-byte-match-set-response))

(clojure.core/defn delete-logging-configuration "Permanently deletes the LoggingConfiguration from the specified web ACL." ([delete-logging-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-logging-configuration-request delete-logging-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-logging-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-logging-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLoggingConfiguration", :http.request.configuration/output-deser-fn response-delete-logging-configuration-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception}})))))
(clojure.spec.alpha/fdef delete-logging-configuration :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-logging-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-logging-configuration-response))

(clojure.core/defn delete-ip-set "Permanently deletes an IPSet. You can't delete an IPSet if it's still used in\nany Rules or if it still includes any IP addresses.\n If you just want to remove an IPSet from a Rule, use UpdateRule.\n To permanently delete an IPSet from AWS WAF, perform the following steps:\n * Update the IPSet to remove IP address ranges, if any. For more information,\nsee UpdateIPSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteIPSet request.\n * Submit a DeleteIPSet request." ([delete-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-ip-set-request delete-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-ip-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIPSet", :http.request.configuration/output-deser-fn response-delete-ip-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-ip-set-response))

(clojure.core/defn list-logging-configurations "Returns an array of LoggingConfiguration objects." ([] (list-logging-configurations {})) ([list-logging-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-logging-configurations-request list-logging-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-logging-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-logging-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLoggingConfigurations", :http.request.configuration/output-deser-fn response-list-logging-configurations-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-logging-configurations :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-logging-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-logging-configurations-response))

(clojure.core/defn get-rate-based-rule "Returns the RateBasedRule that is specified by the RuleId that you included in\nthe GetRateBasedRule request." ([get-rate-based-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-rate-based-rule-request get-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRateBasedRule", :http.request.configuration/output-deser-fn response-get-rate-based-rule-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rate-based-rule-response))

(clojure.core/defn list-regex-pattern-sets "Returns an array of RegexPatternSetSummary objects." ([] (list-regex-pattern-sets {})) ([list-regex-pattern-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-regex-pattern-sets-request list-regex-pattern-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-regex-pattern-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-regex-pattern-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRegexPatternSets", :http.request.configuration/output-deser-fn response-list-regex-pattern-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-regex-pattern-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-regex-pattern-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-regex-pattern-sets-response))

(clojure.core/defn associate-web-acl "Associates a web ACL with a resource, either an application load balancer or\nAmazon API Gateway stage." ([associate-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-web-acl-request associate-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/associate-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/associate-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateWebACL", :http.request.configuration/output-deser-fn response-associate-web-acl-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFUnavailableEntityException" :portkey.aws.waf-regional/waf-unavailable-entity-exception}})))))
(clojure.spec.alpha/fdef associate-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/associate-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/associate-web-acl-response))

(clojure.core/defn get-xss-match-set "Returns the XssMatchSet that is specified by XssMatchSetId." ([get-xss-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-xss-match-set-request get-xss-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-xss-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-xss-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetXssMatchSet", :http.request.configuration/output-deser-fn response-get-xss-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-xss-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-xss-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-xss-match-set-response))

(clojure.core/defn get-rule "Returns the Rule that is specified by the RuleId that you included in the\nGetRule request." ([get-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-rule-request get-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRule", :http.request.configuration/output-deser-fn response-get-rule-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rule-response))

(clojure.core/defn create-rule-group "Creates a RuleGroup. A rule group is a collection of predefined rules that you\nadd to a web ACL. You use UpdateRuleGroup to add rules to the rule group.\n Rule groups are subject to the following limits:\n * Three rule groups per account. You can request an increase to this limit by\ncontacting customer support.\n * One rule group per web ACL.\n * Ten rules per rule group.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-rule-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-rule-group-request create-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRuleGroup", :http.request.configuration/output-deser-fn response-create-rule-group-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-rule-group-response))

(clojure.core/defn list-byte-match-sets "Returns an array of ByteMatchSetSummary objects." ([] (list-byte-match-sets {})) ([list-byte-match-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-byte-match-sets-request list-byte-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-byte-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-byte-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListByteMatchSets", :http.request.configuration/output-deser-fn response-list-byte-match-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-byte-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-byte-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-byte-match-sets-response))

(clojure.core/defn create-regex-match-set "Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part\nof a web request that you want AWS WAF to inspect, such as the values of the\nUser-Agent header or the query string. For example, you can create a\nRegexMatchSet that contains a RegexMatchTuple that looks for any requests with\nUser-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You\ncan then configure AWS WAF to reject those requests.\n To create and configure a RegexMatchSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateRegexMatchSet request.\n * Submit a CreateRegexMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRegexMatchSet request.\n * Submit an UpdateRegexMatchSet request to specify the part of the request that\nyou want AWS WAF to inspect (for example, the header or the URI) and the value,\nusing a RegexPatternSet, that you want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-regex-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-regex-match-set-request create-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRegexMatchSet", :http.request.configuration/output-deser-fn response-create-regex-match-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-regex-match-set-response))

(clojure.core/defn get-rule-group "Returns the RuleGroup that is specified by the RuleGroupId that you included in\nthe GetRuleGroup request.\n To view the rules in a rule group, use ListActivatedRulesInRuleGroup." ([get-rule-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-rule-group-request get-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRuleGroup", :http.request.configuration/output-deser-fn response-get-rule-group-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-rule-group-response))

(clojure.core/defn delete-size-constraint-set "Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if\nit's still used in any Rules or if it still includes any SizeConstraint objects\n(any filters).\n If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule.\n To permanently delete a SizeConstraintSet, perform the following steps:\n * Update the SizeConstraintSet to remove filters, if any. For more information,\nsee UpdateSizeConstraintSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteSizeConstraintSet request.\n * Submit a DeleteSizeConstraintSet request." ([delete-size-constraint-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-size-constraint-set-request delete-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSizeConstraintSet", :http.request.configuration/output-deser-fn response-delete-size-constraint-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-size-constraint-set-response))

(clojure.core/defn delete-regex-pattern-set "Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if\nit's still used in any RegexMatchSet or if the RegexPatternSet is not empty." ([delete-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-regex-pattern-set-request delete-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRegexPatternSet", :http.request.configuration/output-deser-fn response-delete-regex-pattern-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-regex-pattern-set-response))

(clojure.core/defn create-byte-match-set "Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of\na web request that you want AWS WAF to inspect, such as the values of the\nUser-Agent header or the query string. For example, you can create a\nByteMatchSet that matches any requests with User-Agent headers that contain the\nstring BadBot. You can then configure AWS WAF to reject those requests.\n To create and configure a ByteMatchSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateByteMatchSet request.\n * Submit a CreateByteMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateByteMatchSet request.\n * Submit an UpdateByteMatchSet request to specify the part of the request that\nyou want AWS WAF to inspect (for example, the header or the URI) and the value\nthat you want AWS WAF to watch for.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-byte-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-byte-match-set-request create-byte-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-byte-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-byte-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateByteMatchSet", :http.request.configuration/output-deser-fn response-create-byte-match-set-response, :http.request.spec/error-spec {"WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-byte-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-byte-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-byte-match-set-response))

(clojure.core/defn delete-geo-match-set "Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still\nused in any Rules or if it still includes any countries.\n If you just want to remove a GeoMatchSet from a Rule, use UpdateRule.\n To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:\n * Update the GeoMatchSet to remove any countries. For more information, see\nUpdateGeoMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteGeoMatchSet request.\n * Submit a DeleteGeoMatchSet request." ([delete-geo-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-geo-match-set-request delete-geo-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-geo-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-geo-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGeoMatchSet", :http.request.configuration/output-deser-fn response-delete-geo-match-set-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-geo-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-geo-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-geo-match-set-response))

(clojure.core/defn list-sql-injection-match-sets "Returns an array of SqlInjectionMatchSet objects." ([] (list-sql-injection-match-sets {})) ([list-sql-injection-match-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-sql-injection-match-sets-request list-sql-injection-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-sql-injection-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-sql-injection-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSqlInjectionMatchSets", :http.request.configuration/output-deser-fn response-list-sql-injection-match-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-sql-injection-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-sql-injection-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-sql-injection-match-sets-response))

(clojure.core/defn get-permission-policy "Returns the IAM policy attached to the RuleGroup." ([get-permission-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-permission-policy-request get-permission-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-permission-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-permission-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPermissionPolicy", :http.request.configuration/output-deser-fn response-get-permission-policy-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-permission-policy :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-permission-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-permission-policy-response))

(clojure.core/defn get-change-token "When you want to create, update, or delete AWS WAF objects, get a change token\nand include the change token in the create, update, or delete request. Change\ntokens ensure that your application doesn't submit conflicting requests to AWS\nWAF.\n Each create, update, or delete request must use a unique change token. If your\napplication submits a GetChangeToken request and then submits a second\nGetChangeToken request before submitting a create, update, or delete request,\nthe second GetChangeToken request returns the same value as the first\nGetChangeToken request.\n When you use a change token in a create, update, or delete request, the status\nof the change token changes to PENDING, which indicates that AWS WAF is\npropagating the change to all AWS WAF servers. Use GetChangeTokenStatus to\ndetermine the status of your change token." ([] (get-change-token {})) ([get-change-token-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-change-token-request get-change-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-change-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-change-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetChangeToken", :http.request.configuration/output-deser-fn response-get-change-token-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-change-token :args (clojure.spec.alpha/? :portkey.aws.waf-regional/get-change-token-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-change-token-response))

(clojure.core/defn list-rule-groups "Returns an array of RuleGroup objects." ([] (list-rule-groups {})) ([list-rule-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-rule-groups-request list-rule-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-rule-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-rule-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRuleGroups", :http.request.configuration/output-deser-fn response-list-rule-groups-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-rule-groups :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-rule-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-rule-groups-response))

(clojure.core/defn list-regex-match-sets "Returns an array of RegexMatchSetSummary objects." ([] (list-regex-match-sets {})) ([list-regex-match-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-regex-match-sets-request list-regex-match-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-regex-match-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-regex-match-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRegexMatchSets", :http.request.configuration/output-deser-fn response-list-regex-match-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-regex-match-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-regex-match-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-regex-match-sets-response))

(clojure.core/defn delete-rule-group "Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used\nin any WebACL objects or if it still includes any rules.\n If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL.\n To permanently delete a RuleGroup from AWS WAF, perform the following steps:\n * Update the RuleGroup to remove rules, if any. For more information, see\nUpdateRuleGroup.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteRuleGroup request.\n * Submit a DeleteRuleGroup request." ([delete-rule-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-rule-group-request delete-rule-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-rule-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-rule-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRuleGroup", :http.request.configuration/output-deser-fn response-delete-rule-group-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception, "WAFInvalidOperationException" :portkey.aws.waf-regional/waf-invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-rule-group :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-rule-group-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-rule-group-response))

(clojure.core/defn get-web-acl "Returns the WebACL that is specified by WebACLId." ([get-web-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-web-acl-request get-web-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-web-acl-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-web-acl-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetWebACL", :http.request.configuration/output-deser-fn response-get-web-acl-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-web-acl :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-web-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-web-acl-response))

(clojure.core/defn create-sql-injection-match-set "Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests\nthat contain snippets of SQL code in a specified part of web requests. AWS WAF\nsearches for character sequences that are likely to be malicious strings.\n To create and configure a SqlInjectionMatchSet, perform the following steps:\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateSqlInjectionMatchSet request.\n * Submit a CreateSqlInjectionMatchSet request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateSqlInjectionMatchSet request.\n * Submit an UpdateSqlInjectionMatchSet request to specify the parts of web\nrequests in which you want to allow, block, or count malicious SQL code.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-sql-injection-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-sql-injection-match-set-request create-sql-injection-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-sql-injection-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-sql-injection-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSqlInjectionMatchSet", :http.request.configuration/output-deser-fn response-create-sql-injection-match-set-response, :http.request.spec/error-spec {"WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-sql-injection-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-sql-injection-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-sql-injection-match-set-response))

(clojure.core/defn get-regex-pattern-set "Returns the RegexPatternSet specified by RegexPatternSetId." ([get-regex-pattern-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-regex-pattern-set-request get-regex-pattern-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-regex-pattern-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-regex-pattern-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRegexPatternSet", :http.request.configuration/output-deser-fn response-get-regex-pattern-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-regex-pattern-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-regex-pattern-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-regex-pattern-set-response))

(clojure.core/defn get-web-acl-for-resource "Returns the web ACL for the specified resource, either an application load\nbalancer or Amazon API Gateway stage." ([get-web-acl-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-web-acl-for-resource-request get-web-acl-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-web-acl-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-web-acl-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetWebACLForResource", :http.request.configuration/output-deser-fn response-get-web-acl-for-resource-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFUnavailableEntityException" :portkey.aws.waf-regional/waf-unavailable-entity-exception}})))))
(clojure.spec.alpha/fdef get-web-acl-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-web-acl-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-web-acl-for-resource-response))

(clojure.core/defn get-size-constraint-set "Returns the SizeConstraintSet specified by SizeConstraintSetId." ([get-size-constraint-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-size-constraint-set-request get-size-constraint-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/get-size-constraint-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/get-size-constraint-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSizeConstraintSet", :http.request.configuration/output-deser-fn response-get-size-constraint-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception}})))))
(clojure.spec.alpha/fdef get-size-constraint-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/get-size-constraint-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/get-size-constraint-set-response))

(clojure.core/defn delete-regex-match-set "Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's\nstill used in any Rules or if it still includes any RegexMatchTuples objects\n(any filters).\n If you just want to remove a RegexMatchSet from a Rule, use UpdateRule.\n To permanently delete a RegexMatchSet, perform the following steps:\n * Update the RegexMatchSet to remove filters, if any. For more information, see\nUpdateRegexMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a DeleteRegexMatchSet request.\n * Submit a DeleteRegexMatchSet request." ([delete-regex-match-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-regex-match-set-request delete-regex-match-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/delete-regex-match-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/delete-regex-match-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRegexMatchSet", :http.request.configuration/output-deser-fn response-delete-regex-match-set-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception, "WAFNonexistentItemException" :portkey.aws.waf-regional/waf-nonexistent-item-exception, "WAFReferencedItemException" :portkey.aws.waf-regional/waf-referenced-item-exception, "WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFNonEmptyEntityException" :portkey.aws.waf-regional/waf-non-empty-entity-exception}})))))
(clojure.spec.alpha/fdef delete-regex-match-set :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/delete-regex-match-set-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/delete-regex-match-set-response))

(clojure.core/defn list-ip-sets "Returns an array of IPSetSummary objects in the response." ([] (list-ip-sets {})) ([list-ip-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-ip-sets-request list-ip-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/list-ip-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/list-ip-sets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIPSets", :http.request.configuration/output-deser-fn response-list-ip-sets-response, :http.request.spec/error-spec {"WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFInvalidAccountException" :portkey.aws.waf-regional/waf-invalid-account-exception}})))))
(clojure.spec.alpha/fdef list-ip-sets :args (clojure.spec.alpha/? :portkey.aws.waf-regional/list-ip-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/list-ip-sets-response))

(clojure.core/defn create-rate-based-rule "Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies\nthe maximum number of requests that AWS WAF allows from a specified IP address\nin a five-minute period. The RateBasedRule also contains the IPSet objects,\nByteMatchSet objects, and other predicates that identify the requests that you\nwant to count or block if these requests exceed the RateLimit.\n If you add more than one predicate to a RateBasedRule, a request not only must\nexceed the RateLimit, but it also must match all the specifications to be\ncounted or blocked. For example, suppose you add the following to a\nRateBasedRule:\n * An IPSet that matches the IP address 192.0.2.44/32\n * A ByteMatchSet that matches BadBot in the User-Agent header\n Further, you specify a RateLimit of 15,000.\n You then add the RateBasedRule to a WebACL and specify that you want to block\nrequests that meet the conditions in the rule. For a request to be blocked, it\nmust come from the IP address 192.0.2.44 and the User-Agent header in the\nrequest must contain the value BadBot. Further, requests that match these two\nconditions must be received at a rate of more than 15,000 requests every five\nminutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the\nrequests. If the rate drops below 15,000 for a five-minute period, AWS WAF no\nlonger blocks the requests.\n As a second example, suppose you want to limit requests to a particular page on\nyour site. To do this, you could add the following to a RateBasedRule:\n * A ByteMatchSet with FieldToMatch of URI\n * A PositionalConstraint of STARTS_WITH\n * A TargetString of login\n Further, you specify a RateLimit of 15,000.\n By adding this RateBasedRule to a WebACL, you could limit requests to your\nlogin page without affecting the rest of your site.\n To create and configure a RateBasedRule, perform the following steps:\n * Create and update the predicates that you want to include in the rule. For\nmore information, see CreateByteMatchSet, CreateIPSet, and\nCreateSqlInjectionMatchSet.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of a CreateRule request.\n * Submit a CreateRateBasedRule request.\n * Use GetChangeToken to get the change token that you provide in the\nChangeToken parameter of an UpdateRule request.\n * Submit an UpdateRateBasedRule request to specify the predicates that you want\nto include in the rule.\n * Create and update a WebACL that contains the RateBasedRule. For more\ninformation, see CreateWebACL.\n For more information about how to use the AWS WAF API to allow or block HTTP\nrequests, see the AWS WAF Developer Guide\n(https://docs.aws.amazon.com/waf/latest/developerguide/)." ([create-rate-based-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-rate-based-rule-request create-rate-based-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.waf-regional/endpoints, :http.request.configuration/target-prefix "AWSWAF_Regional_20161128", :http.request.spec/output-spec :portkey.aws.waf-regional/create-rate-based-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "WAF Regional", :http.request.spec/input-spec :portkey.aws.waf-regional/create-rate-based-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRateBasedRule", :http.request.configuration/output-deser-fn response-create-rate-based-rule-response, :http.request.spec/error-spec {"WAFStaleDataException" :portkey.aws.waf-regional/waf-stale-data-exception, "WAFInternalErrorException" :portkey.aws.waf-regional/waf-internal-error-exception, "WAFDisallowedNameException" :portkey.aws.waf-regional/waf-disallowed-name-exception, "WAFInvalidParameterException" :portkey.aws.waf-regional/waf-invalid-parameter-exception, "WAFLimitsExceededException" :portkey.aws.waf-regional/waf-limits-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-rate-based-rule :args (clojure.spec.alpha/tuple :portkey.aws.waf-regional/create-rate-based-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.waf-regional/create-rate-based-rule-response))
