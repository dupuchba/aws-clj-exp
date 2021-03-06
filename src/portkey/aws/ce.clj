(ns portkey.aws.ce (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-values)

(clojure.core/declare ser-group-definitions)

(clojure.core/declare ser-non-negative-integer)

(clojure.core/declare ser-search-string)

(clojure.core/declare ser-term-in-years)

(clojure.core/declare ser-year-month-day)

(clojure.core/declare ser-group-definition-key)

(clojure.core/declare ser-context)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-date-interval)

(clojure.core/declare ser-dimension)

(clojure.core/declare ser-expression)

(clojure.core/declare ser-payment-option)

(clojure.core/declare ser-account-scope)

(clojure.core/declare ser-lookback-period-in-days)

(clojure.core/declare ser-expressions)

(clojure.core/declare ser-value)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-values)

(clojure.core/declare ser-service-specification)

(clojure.core/declare ser-ec-2-specification)

(clojure.core/declare ser-metric)

(clojure.core/declare ser-group-definition-type)

(clojure.core/declare ser-metric-names)

(clojure.core/declare ser-granularity)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-offering-class)

(clojure.core/declare ser-dimension-values)

(clojure.core/declare ser-prediction-interval-level)

(clojure.core/declare ser-group-definition)

(clojure.core/declare ser-next-page-token)

(clojure.core/defn- ser-tag-values [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagValues", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"}))))

(clojure.core/defn- ser-group-definitions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-group-definition coll) #:http.request.field{:shape "GroupDefinition"}))) input), :shape "GroupDefinitions", :type "list"})

(clojure.core/defn- ser-non-negative-integer [input] #:http.request.field{:value input, :shape "NonNegativeInteger"})

(clojure.core/defn- ser-search-string [input] #:http.request.field{:value input, :shape "SearchString"})

(clojure.core/defn- ser-term-in-years [input] #:http.request.field{:value (clojure.core/get {"ONE_YEAR" "ONE_YEAR", :one-year "ONE_YEAR", "THREE_YEARS" "THREE_YEARS", :three-years "THREE_YEARS"} input), :shape "TermInYears"})

(clojure.core/defn- ser-year-month-day [input] #:http.request.field{:value input, :shape "YearMonthDay"})

(clojure.core/defn- ser-group-definition-key [input] #:http.request.field{:value input, :shape "GroupDefinitionKey"})

(clojure.core/defn- ser-context [input] #:http.request.field{:value (clojure.core/get {"COST_AND_USAGE" "COST_AND_USAGE", :cost-and-usage "COST_AND_USAGE", "RESERVATIONS" "RESERVATIONS", :reservations "RESERVATIONS"} input), :shape "Context"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-date-interval [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-year-month-day (:start input)) #:http.request.field{:name "Start", :shape "YearMonthDay"}) (clojure.core/into (ser-year-month-day (:end input)) #:http.request.field{:name "End", :shape "YearMonthDay"})], :shape "DateInterval", :type "structure"}))

(clojure.core/defn- ser-dimension [input] #:http.request.field{:value (clojure.core/get {"SUBSCRIPTION_ID" "SUBSCRIPTION_ID", :instance-type-family "INSTANCE_TYPE_FAMILY", :service "SERVICE", :az "AZ", :database-engine "DATABASE_ENGINE", "LINKED_ACCOUNT" "LINKED_ACCOUNT", "LEGAL_ENTITY_NAME" "LEGAL_ENTITY_NAME", "TENANCY" "TENANCY", :tenancy "TENANCY", "PURCHASE_TYPE" "PURCHASE_TYPE", :operation "OPERATION", "SERVICE" "SERVICE", :instance-type "INSTANCE_TYPE", "INSTANCE_TYPE_FAMILY" "INSTANCE_TYPE_FAMILY", :scope "SCOPE", "RECORD_TYPE" "RECORD_TYPE", "INSTANCE_TYPE" "INSTANCE_TYPE", "DEPLOYMENT_OPTION" "DEPLOYMENT_OPTION", :linked-account "LINKED_ACCOUNT", :region "REGION", :cache-engine "CACHE_ENGINE", :reservation-id "RESERVATION_ID", :billing-entity "BILLING_ENTITY", "PLATFORM" "PLATFORM", :operating-system "OPERATING_SYSTEM", :usage-type-group "USAGE_TYPE_GROUP", "OPERATING_SYSTEM" "OPERATING_SYSTEM", :usage-type "USAGE_TYPE", "SCOPE" "SCOPE", :subscription-id "SUBSCRIPTION_ID", "CACHE_ENGINE" "CACHE_ENGINE", "USAGE_TYPE_GROUP" "USAGE_TYPE_GROUP", "DATABASE_ENGINE" "DATABASE_ENGINE", "REGION" "REGION", :deployment-option "DEPLOYMENT_OPTION", "AZ" "AZ", :legal-entity-name "LEGAL_ENTITY_NAME", "RESERVATION_ID" "RESERVATION_ID", :record-type "RECORD_TYPE", "BILLING_ENTITY" "BILLING_ENTITY", :purchase-type "PURCHASE_TYPE", :platform "PLATFORM", "OPERATION" "OPERATION", "USAGE_TYPE" "USAGE_TYPE"} input), :shape "Dimension"})

(clojure.core/defn- ser-expression [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Expression", :type "structure"} (clojure.core/contains? input :or) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expressions (input :or)) #:http.request.field{:name "Or", :shape "Expressions"})) (clojure.core/contains? input :and) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expressions (input :and)) #:http.request.field{:name "And", :shape "Expressions"})) (clojure.core/contains? input :not) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :not)) #:http.request.field{:name "Not", :shape "Expression"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension-values (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "DimensionValues"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-values (input :tags)) #:http.request.field{:name "Tags", :shape "TagValues"}))))

(clojure.core/defn- ser-payment-option [input] #:http.request.field{:value (clojure.core/get {:heavy-utilization "HEAVY_UTILIZATION", :no-upfront "NO_UPFRONT", "LIGHT_UTILIZATION" "LIGHT_UTILIZATION", :medium-utilization "MEDIUM_UTILIZATION", :all-upfront "ALL_UPFRONT", "NO_UPFRONT" "NO_UPFRONT", :light-utilization "LIGHT_UTILIZATION", :partial-upfront "PARTIAL_UPFRONT", "HEAVY_UTILIZATION" "HEAVY_UTILIZATION", "PARTIAL_UPFRONT" "PARTIAL_UPFRONT", "ALL_UPFRONT" "ALL_UPFRONT", "MEDIUM_UTILIZATION" "MEDIUM_UTILIZATION"} input), :shape "PaymentOption"})

(clojure.core/defn- ser-account-scope [input] #:http.request.field{:value (clojure.core/get {"PAYER" "PAYER", :payer "PAYER", "LINKED" "LINKED", :linked "LINKED"} input), :shape "AccountScope"})

(clojure.core/defn- ser-lookback-period-in-days [input] #:http.request.field{:value (clojure.core/get {"SEVEN_DAYS" "SEVEN_DAYS", :seven-days "SEVEN_DAYS", "THIRTY_DAYS" "THIRTY_DAYS", :thirty-days "THIRTY_DAYS", "SIXTY_DAYS" "SIXTY_DAYS", :sixty-days "SIXTY_DAYS"} input), :shape "LookbackPeriodInDays"})

(clojure.core/defn- ser-expressions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-expression coll) #:http.request.field{:shape "Expression"}))) input), :shape "Expressions", :type "list"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-value coll) #:http.request.field{:shape "Value"}))) input), :shape "Values", :type "list"})

(clojure.core/defn- ser-service-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServiceSpecification", :type "structure"} (clojure.core/contains? input :ec-2-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-specification (input :ec-2-specification)) #:http.request.field{:name "EC2Specification", :shape "EC2Specification"}))))

(clojure.core/defn- ser-ec-2-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EC2Specification", :type "structure"} (clojure.core/contains? input :offering-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-offering-class (input :offering-class)) #:http.request.field{:name "OfferingClass", :shape "OfferingClass"}))))

(clojure.core/defn- ser-metric [input] #:http.request.field{:value (clojure.core/get {:blended-cost "BLENDED_COST", "AMORTIZED_COST" "AMORTIZED_COST", "BLENDED_COST" "BLENDED_COST", :usage-quantity "USAGE_QUANTITY", :unblended-cost "UNBLENDED_COST", "USAGE_QUANTITY" "USAGE_QUANTITY", :normalized-usage-amount "NORMALIZED_USAGE_AMOUNT", :net-amortized-cost "NET_AMORTIZED_COST", "NET_UNBLENDED_COST" "NET_UNBLENDED_COST", "UNBLENDED_COST" "UNBLENDED_COST", :net-unblended-cost "NET_UNBLENDED_COST", :amortized-cost "AMORTIZED_COST", "NET_AMORTIZED_COST" "NET_AMORTIZED_COST", "NORMALIZED_USAGE_AMOUNT" "NORMALIZED_USAGE_AMOUNT"} input), :shape "Metric"})

(clojure.core/defn- ser-group-definition-type [input] #:http.request.field{:value (clojure.core/get {"DIMENSION" "DIMENSION", :dimension "DIMENSION", "TAG" "TAG", :tag "TAG"} input), :shape "GroupDefinitionType"})

(clojure.core/defn- ser-metric-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-name coll) #:http.request.field{:shape "MetricName"}))) input), :shape "MetricNames", :type "list"})

(clojure.core/defn- ser-granularity [input] #:http.request.field{:value (clojure.core/get {"DAILY" "DAILY", :daily "DAILY", "MONTHLY" "MONTHLY", :monthly "MONTHLY", "HOURLY" "HOURLY", :hourly "HOURLY"} input), :shape "Granularity"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-offering-class [input] #:http.request.field{:value (clojure.core/get {"STANDARD" "STANDARD", :standard "STANDARD", "CONVERTIBLE" "CONVERTIBLE", :convertible "CONVERTIBLE"} input), :shape "OfferingClass"})

(clojure.core/defn- ser-dimension-values [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DimensionValues", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension (input :key)) #:http.request.field{:name "Key", :shape "Dimension"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"}))))

(clojure.core/defn- ser-prediction-interval-level [input] #:http.request.field{:value input, :shape "PredictionIntervalLevel"})

(clojure.core/defn- ser-group-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GroupDefinition", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definition-type (input :type)) #:http.request.field{:name "Type", :shape "GroupDefinitionType"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definition-key (input :key)) #:http.request.field{:name "Key", :shape "GroupDefinitionKey"}))))

(clojure.core/defn- ser-next-page-token [input] #:http.request.field{:value input, :shape "NextPageToken"})

(clojure.core/defn- req-get-reservation-utilization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})]} (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definitions (input :group-by)) #:http.request.field{:name "GroupBy", :shape "GroupDefinitions"})) (clojure.core/contains? input :granularity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-reservation-purchase-recommendation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :service)) #:http.request.field{:name "Service", :shape "GenericString"})]} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-negative-integer (input :page-size)) #:http.request.field{:name "PageSize", :shape "NonNegativeInteger"})) (clojure.core/contains? input :term-in-years) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-term-in-years (input :term-in-years)) #:http.request.field{:name "TermInYears", :shape "TermInYears"})) (clojure.core/contains? input :payment-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-payment-option (input :payment-option)) #:http.request.field{:name "PaymentOption", :shape "PaymentOption"})) (clojure.core/contains? input :account-scope) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-scope (input :account-scope)) #:http.request.field{:name "AccountScope", :shape "AccountScope"})) (clojure.core/contains? input :lookback-period-in-days) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lookback-period-in-days (input :lookback-period-in-days)) #:http.request.field{:name "LookbackPeriodInDays", :shape "LookbackPeriodInDays"})) (clojure.core/contains? input :service-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-specification (input :service-specification)) #:http.request.field{:name "ServiceSpecification", :shape "ServiceSpecification"})) (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "GenericString"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-dimension-values-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"}) (clojure.core/into (ser-dimension (input :dimension)) #:http.request.field{:name "Dimension", :shape "Dimension"})]} (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context (input :context)) #:http.request.field{:name "Context", :shape "Context"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-cost-and-usage-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :time-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})) (clojure.core/contains? input :granularity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-names (input :metrics)) #:http.request.field{:name "Metrics", :shape "MetricNames"})) (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definitions (input :group-by)) #:http.request.field{:name "GroupBy", :shape "GroupDefinitions"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-reservation-coverage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})]} (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definitions (input :group-by)) #:http.request.field{:name "GroupBy", :shape "GroupDefinitions"})) (clojure.core/contains? input :granularity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-names (input :metrics)) #:http.request.field{:name "Metrics", :shape "MetricNames"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})]} (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :tag-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :tag-key)) #:http.request.field{:name "TagKey", :shape "TagKey"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-cost-forecast-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"}) (clojure.core/into (ser-metric (input :metric)) #:http.request.field{:name "Metric", :shape "Metric"}) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})]} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :prediction-interval-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prediction-interval-level (input :prediction-interval-level)) #:http.request.field{:name "PredictionIntervalLevel", :shape "PredictionIntervalLevel"}))))

(clojure.core/declare deser-total-actual-units)

(clojure.core/declare deser-group-definitions)

(clojure.core/declare deser-attribute-type)

(clojure.core/declare deser-forecast-result)

(clojure.core/declare deser-estimated)

(clojure.core/declare deser-total-amortized-fee)

(clojure.core/declare deser-total-running-normalized-units)

(clojure.core/declare deser-total-potential-ri-savings)

(clojure.core/declare deser-coverage)

(clojure.core/declare deser-page-size)

(clojure.core/declare deser-term-in-years)

(clojure.core/declare deser-reservation-purchase-recommendation-detail)

(clojure.core/declare deser-unused-hours)

(clojure.core/declare deser-purchased-units)

(clojure.core/declare deser-year-month-day)

(clojure.core/declare deser-group-definition-key)

(clojure.core/declare deser-reservation-group-value)

(clojure.core/declare deser-coverage-normalized-units-percentage)

(clojure.core/declare deser-reservation-purchase-recommendation-summary)

(clojure.core/declare deser-instance-details)

(clojure.core/declare deser-reserved-hours)

(clojure.core/declare deser-on-demand-cost)

(clojure.core/declare deser-amortized-upfront-fee)

(clojure.core/declare deser-utilizations-by-time)

(clojure.core/declare deser-ec-2-instance-details)

(clojure.core/declare deser-date-interval)

(clojure.core/declare deser-generic-boolean)

(clojure.core/declare deser-utilization-percentage)

(clojure.core/declare deser-reservation-purchase-recommendations)

(clojure.core/declare deser-dimension-values-with-attributes-list)

(clojure.core/declare deser-reserved-normalized-units)

(clojure.core/declare deser-redshift-instance-details)

(clojure.core/declare deser-payment-option)

(clojure.core/declare deser-metric-unit)

(clojure.core/declare deser-account-scope)

(clojure.core/declare deser-on-demand-cost-of-ri-hours-used)

(clojure.core/declare deser-lookback-period-in-days)

(clojure.core/declare deser-reservation-utilization-group)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-reservation-coverage-group)

(clojure.core/declare deser-reservation-aggregates)

(clojure.core/declare deser-key)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-reservation-group-key)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-coverage-by-time)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-es-instance-details)

(clojure.core/declare deser-value)

(clojure.core/declare deser-net-ri-savings)

(clojure.core/declare deser-total-actual-hours)

(clojure.core/declare deser-reservation-utilization-groups)

(clojure.core/declare deser-utilization-by-time)

(clojure.core/declare deser-generic-string)

(clojure.core/declare deser-coverage-hours-percentage)

(clojure.core/declare deser-reservation-purchase-recommendation)

(clojure.core/declare deser-reservation-purchase-recommendation-metadata)

(clojure.core/declare deser-service-specification)

(clojure.core/declare deser-reservation-purchase-recommendation-details)

(clojure.core/declare deser-coverages-by-time)

(clojure.core/declare deser-elasti-cache-instance-details)

(clojure.core/declare deser-dimension-values-with-attributes)

(clojure.core/declare deser-groups)

(clojure.core/declare deser-ec-2-specification)

(clojure.core/declare deser-group-definition-type)

(clojure.core/declare deser-coverage-hours)

(clojure.core/declare deser-utilization-percentage-in-units)

(clojure.core/declare deser-metric-value)

(clojure.core/declare deser-total-running-hours)

(clojure.core/declare deser-results-by-time)

(clojure.core/declare deser-amortized-recurring-fee)

(clojure.core/declare deser-entity)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-unused-units)

(clojure.core/declare deser-offering-class)

(clojure.core/declare deser-coverage-normalized-units)

(clojure.core/declare deser-reservation-coverage-groups)

(clojure.core/declare deser-keys)

(clojure.core/declare deser-group)

(clojure.core/declare deser-rds-instance-details)

(clojure.core/declare deser-forecast-results-by-time)

(clojure.core/declare deser-coverage-cost)

(clojure.core/declare deser-group-definition)

(clojure.core/declare deser-purchased-hours)

(clojure.core/declare deser-on-demand-normalized-units)

(clojure.core/declare deser-metric-amount)

(clojure.core/declare deser-next-page-token)

(clojure.core/declare deser-result-by-time)

(clojure.core/declare deser-on-demand-hours)

(clojure.core/declare deser-metrics)

(clojure.core/defn- deser-total-actual-units [input] input)

(clojure.core/defn- deser-group-definitions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group-definition coll))) input))

(clojure.core/defn- deser-attribute-type [input] input)

(clojure.core/defn- deser-forecast-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "TimePeriod") (clojure.core/assoc :time-period (deser-date-interval (input "TimePeriod"))) (clojure.core/contains? input "MeanValue") (clojure.core/assoc :mean-value (deser-generic-string (input "MeanValue"))) (clojure.core/contains? input "PredictionIntervalLowerBound") (clojure.core/assoc :prediction-interval-lower-bound (deser-generic-string (input "PredictionIntervalLowerBound"))) (clojure.core/contains? input "PredictionIntervalUpperBound") (clojure.core/assoc :prediction-interval-upper-bound (deser-generic-string (input "PredictionIntervalUpperBound")))))

(clojure.core/defn- deser-estimated [input] input)

(clojure.core/defn- deser-total-amortized-fee [input] input)

(clojure.core/defn- deser-total-running-normalized-units [input] input)

(clojure.core/defn- deser-total-potential-ri-savings [input] input)

(clojure.core/defn- deser-coverage [input] (clojure.core/cond-> {} (clojure.core/contains? input "CoverageHours") (clojure.core/assoc :coverage-hours (deser-coverage-hours (input "CoverageHours"))) (clojure.core/contains? input "CoverageNormalizedUnits") (clojure.core/assoc :coverage-normalized-units (deser-coverage-normalized-units (input "CoverageNormalizedUnits"))) (clojure.core/contains? input "CoverageCost") (clojure.core/assoc :coverage-cost (deser-coverage-cost (input "CoverageCost")))))

(clojure.core/defn- deser-page-size [input] input)

(clojure.core/defn- deser-term-in-years [input] (clojure.core/get {"ONE_YEAR" :one-year, "THREE_YEARS" :three-years} input))

(clojure.core/defn- deser-reservation-purchase-recommendation-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "CurrencyCode") (clojure.core/assoc :currency-code (deser-generic-string (input "CurrencyCode"))) (clojure.core/contains? input "AverageUtilization") (clojure.core/assoc :average-utilization (deser-generic-string (input "AverageUtilization"))) (clojure.core/contains? input "EstimatedBreakEvenInMonths") (clojure.core/assoc :estimated-break-even-in-months (deser-generic-string (input "EstimatedBreakEvenInMonths"))) (clojure.core/contains? input "MaximumNumberOfInstancesUsedPerHour") (clojure.core/assoc :maximum-number-of-instances-used-per-hour (deser-generic-string (input "MaximumNumberOfInstancesUsedPerHour"))) (clojure.core/contains? input "EstimatedReservationCostForLookbackPeriod") (clojure.core/assoc :estimated-reservation-cost-for-lookback-period (deser-generic-string (input "EstimatedReservationCostForLookbackPeriod"))) (clojure.core/contains? input "InstanceDetails") (clojure.core/assoc :instance-details (deser-instance-details (input "InstanceDetails"))) (clojure.core/contains? input "RecurringStandardMonthlyCost") (clojure.core/assoc :recurring-standard-monthly-cost (deser-generic-string (input "RecurringStandardMonthlyCost"))) (clojure.core/contains? input "MinimumNormalizedUnitsUsedPerHour") (clojure.core/assoc :minimum-normalized-units-used-per-hour (deser-generic-string (input "MinimumNormalizedUnitsUsedPerHour"))) (clojure.core/contains? input "EstimatedMonthlySavingsAmount") (clojure.core/assoc :estimated-monthly-savings-amount (deser-generic-string (input "EstimatedMonthlySavingsAmount"))) (clojure.core/contains? input "UpfrontCost") (clojure.core/assoc :upfront-cost (deser-generic-string (input "UpfrontCost"))) (clojure.core/contains? input "AverageNumberOfInstancesUsedPerHour") (clojure.core/assoc :average-number-of-instances-used-per-hour (deser-generic-string (input "AverageNumberOfInstancesUsedPerHour"))) (clojure.core/contains? input "AverageNormalizedUnitsUsedPerHour") (clojure.core/assoc :average-normalized-units-used-per-hour (deser-generic-string (input "AverageNormalizedUnitsUsedPerHour"))) (clojure.core/contains? input "RecommendedNumberOfInstancesToPurchase") (clojure.core/assoc :recommended-number-of-instances-to-purchase (deser-generic-string (input "RecommendedNumberOfInstancesToPurchase"))) (clojure.core/contains? input "EstimatedMonthlySavingsPercentage") (clojure.core/assoc :estimated-monthly-savings-percentage (deser-generic-string (input "EstimatedMonthlySavingsPercentage"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-generic-string (input "AccountId"))) (clojure.core/contains? input "RecommendedNormalizedUnitsToPurchase") (clojure.core/assoc :recommended-normalized-units-to-purchase (deser-generic-string (input "RecommendedNormalizedUnitsToPurchase"))) (clojure.core/contains? input "EstimatedMonthlyOnDemandCost") (clojure.core/assoc :estimated-monthly-on-demand-cost (deser-generic-string (input "EstimatedMonthlyOnDemandCost"))) (clojure.core/contains? input "MinimumNumberOfInstancesUsedPerHour") (clojure.core/assoc :minimum-number-of-instances-used-per-hour (deser-generic-string (input "MinimumNumberOfInstancesUsedPerHour"))) (clojure.core/contains? input "MaximumNormalizedUnitsUsedPerHour") (clojure.core/assoc :maximum-normalized-units-used-per-hour (deser-generic-string (input "MaximumNormalizedUnitsUsedPerHour")))))

(clojure.core/defn- deser-unused-hours [input] input)

(clojure.core/defn- deser-purchased-units [input] input)

(clojure.core/defn- deser-year-month-day [input] input)

(clojure.core/defn- deser-group-definition-key [input] input)

(clojure.core/defn- deser-reservation-group-value [input] input)

(clojure.core/defn- deser-coverage-normalized-units-percentage [input] input)

(clojure.core/defn- deser-reservation-purchase-recommendation-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "TotalEstimatedMonthlySavingsAmount") (clojure.core/assoc :total-estimated-monthly-savings-amount (deser-generic-string (input "TotalEstimatedMonthlySavingsAmount"))) (clojure.core/contains? input "TotalEstimatedMonthlySavingsPercentage") (clojure.core/assoc :total-estimated-monthly-savings-percentage (deser-generic-string (input "TotalEstimatedMonthlySavingsPercentage"))) (clojure.core/contains? input "CurrencyCode") (clojure.core/assoc :currency-code (deser-generic-string (input "CurrencyCode")))))

(clojure.core/defn- deser-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "EC2InstanceDetails") (clojure.core/assoc :ec-2-instance-details (deser-ec-2-instance-details (input "EC2InstanceDetails"))) (clojure.core/contains? input "RDSInstanceDetails") (clojure.core/assoc :rds-instance-details (deser-rds-instance-details (input "RDSInstanceDetails"))) (clojure.core/contains? input "RedshiftInstanceDetails") (clojure.core/assoc :redshift-instance-details (deser-redshift-instance-details (input "RedshiftInstanceDetails"))) (clojure.core/contains? input "ElastiCacheInstanceDetails") (clojure.core/assoc :elasti-cache-instance-details (deser-elasti-cache-instance-details (input "ElastiCacheInstanceDetails"))) (clojure.core/contains? input "ESInstanceDetails") (clojure.core/assoc :es-instance-details (deser-es-instance-details (input "ESInstanceDetails")))))

(clojure.core/defn- deser-reserved-hours [input] input)

(clojure.core/defn- deser-on-demand-cost [input] input)

(clojure.core/defn- deser-amortized-upfront-fee [input] input)

(clojure.core/defn- deser-utilizations-by-time [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-utilization-by-time coll))) input))

(clojure.core/defn- deser-ec-2-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Family") (clojure.core/assoc :family (deser-generic-string (input "Family"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-generic-string (input "InstanceType"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-generic-string (input "Region"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-generic-string (input "AvailabilityZone"))) (clojure.core/contains? input "Platform") (clojure.core/assoc :platform (deser-generic-string (input "Platform"))) (clojure.core/contains? input "Tenancy") (clojure.core/assoc :tenancy (deser-generic-string (input "Tenancy"))) (clojure.core/contains? input "CurrentGeneration") (clojure.core/assoc :current-generation (deser-generic-boolean (input "CurrentGeneration"))) (clojure.core/contains? input "SizeFlexEligible") (clojure.core/assoc :size-flex-eligible (deser-generic-boolean (input "SizeFlexEligible")))))

(clojure.core/defn- deser-date-interval [input] (clojure.core/cond-> {:start (deser-year-month-day (input "Start")), :end (deser-year-month-day (input "End"))}))

(clojure.core/defn- deser-generic-boolean [input] input)

(clojure.core/defn- deser-utilization-percentage [input] input)

(clojure.core/defn- deser-reservation-purchase-recommendations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reservation-purchase-recommendation coll))) input))

(clojure.core/defn- deser-dimension-values-with-attributes-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension-values-with-attributes coll))) input))

(clojure.core/defn- deser-reserved-normalized-units [input] input)

(clojure.core/defn- deser-redshift-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Family") (clojure.core/assoc :family (deser-generic-string (input "Family"))) (clojure.core/contains? input "NodeType") (clojure.core/assoc :node-type (deser-generic-string (input "NodeType"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-generic-string (input "Region"))) (clojure.core/contains? input "CurrentGeneration") (clojure.core/assoc :current-generation (deser-generic-boolean (input "CurrentGeneration"))) (clojure.core/contains? input "SizeFlexEligible") (clojure.core/assoc :size-flex-eligible (deser-generic-boolean (input "SizeFlexEligible")))))

(clojure.core/defn- deser-payment-option [input] (clojure.core/get {"NO_UPFRONT" :no-upfront, "PARTIAL_UPFRONT" :partial-upfront, "ALL_UPFRONT" :all-upfront, "LIGHT_UTILIZATION" :light-utilization, "MEDIUM_UTILIZATION" :medium-utilization, "HEAVY_UTILIZATION" :heavy-utilization} input))

(clojure.core/defn- deser-metric-unit [input] input)

(clojure.core/defn- deser-account-scope [input] (clojure.core/get {"PAYER" :payer, "LINKED" :linked} input))

(clojure.core/defn- deser-on-demand-cost-of-ri-hours-used [input] input)

(clojure.core/defn- deser-lookback-period-in-days [input] (clojure.core/get {"SEVEN_DAYS" :seven-days, "THIRTY_DAYS" :thirty-days, "SIXTY_DAYS" :sixty-days} input))

(clojure.core/defn- deser-reservation-utilization-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-reservation-group-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-reservation-group-value (input "Value"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attributes (input "Attributes"))) (clojure.core/contains? input "Utilization") (clojure.core/assoc :utilization (deser-reservation-aggregates (input "Utilization")))))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-reservation-coverage-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attributes (input "Attributes"))) (clojure.core/contains? input "Coverage") (clojure.core/assoc :coverage (deser-coverage (input "Coverage")))))

(clojure.core/defn- deser-reservation-aggregates [input] (clojure.core/cond-> {} (clojure.core/contains? input "TotalActualUnits") (clojure.core/assoc :total-actual-units (deser-total-actual-units (input "TotalActualUnits"))) (clojure.core/contains? input "TotalAmortizedFee") (clojure.core/assoc :total-amortized-fee (deser-total-amortized-fee (input "TotalAmortizedFee"))) (clojure.core/contains? input "TotalPotentialRISavings") (clojure.core/assoc :total-potential-ri-savings (deser-total-potential-ri-savings (input "TotalPotentialRISavings"))) (clojure.core/contains? input "UnusedHours") (clojure.core/assoc :unused-hours (deser-unused-hours (input "UnusedHours"))) (clojure.core/contains? input "PurchasedUnits") (clojure.core/assoc :purchased-units (deser-purchased-units (input "PurchasedUnits"))) (clojure.core/contains? input "AmortizedUpfrontFee") (clojure.core/assoc :amortized-upfront-fee (deser-amortized-upfront-fee (input "AmortizedUpfrontFee"))) (clojure.core/contains? input "UtilizationPercentage") (clojure.core/assoc :utilization-percentage (deser-utilization-percentage (input "UtilizationPercentage"))) (clojure.core/contains? input "OnDemandCostOfRIHoursUsed") (clojure.core/assoc :on-demand-cost-of-ri-hours-used (deser-on-demand-cost-of-ri-hours-used (input "OnDemandCostOfRIHoursUsed"))) (clojure.core/contains? input "NetRISavings") (clojure.core/assoc :net-ri-savings (deser-net-ri-savings (input "NetRISavings"))) (clojure.core/contains? input "TotalActualHours") (clojure.core/assoc :total-actual-hours (deser-total-actual-hours (input "TotalActualHours"))) (clojure.core/contains? input "UtilizationPercentageInUnits") (clojure.core/assoc :utilization-percentage-in-units (deser-utilization-percentage-in-units (input "UtilizationPercentageInUnits"))) (clojure.core/contains? input "AmortizedRecurringFee") (clojure.core/assoc :amortized-recurring-fee (deser-amortized-recurring-fee (input "AmortizedRecurringFee"))) (clojure.core/contains? input "UnusedUnits") (clojure.core/assoc :unused-units (deser-unused-units (input "UnusedUnits"))) (clojure.core/contains? input "PurchasedHours") (clojure.core/assoc :purchased-hours (deser-purchased-hours (input "PurchasedHours")))))

(clojure.core/defn- deser-key [input] input)

(clojure.core/defn- deser-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-type k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-reservation-group-key [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity coll))) input))

(clojure.core/defn- deser-coverage-by-time [input] (clojure.core/cond-> {} (clojure.core/contains? input "TimePeriod") (clojure.core/assoc :time-period (deser-date-interval (input "TimePeriod"))) (clojure.core/contains? input "Groups") (clojure.core/assoc :groups (deser-reservation-coverage-groups (input "Groups"))) (clojure.core/contains? input "Total") (clojure.core/assoc :total (deser-coverage (input "Total")))))

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-es-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceClass") (clojure.core/assoc :instance-class (deser-generic-string (input "InstanceClass"))) (clojure.core/contains? input "InstanceSize") (clojure.core/assoc :instance-size (deser-generic-string (input "InstanceSize"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-generic-string (input "Region"))) (clojure.core/contains? input "CurrentGeneration") (clojure.core/assoc :current-generation (deser-generic-boolean (input "CurrentGeneration"))) (clojure.core/contains? input "SizeFlexEligible") (clojure.core/assoc :size-flex-eligible (deser-generic-boolean (input "SizeFlexEligible")))))

(clojure.core/defn- deser-value [input] input)

(clojure.core/defn- deser-net-ri-savings [input] input)

(clojure.core/defn- deser-total-actual-hours [input] input)

(clojure.core/defn- deser-reservation-utilization-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reservation-utilization-group coll))) input))

(clojure.core/defn- deser-utilization-by-time [input] (clojure.core/cond-> {} (clojure.core/contains? input "TimePeriod") (clojure.core/assoc :time-period (deser-date-interval (input "TimePeriod"))) (clojure.core/contains? input "Groups") (clojure.core/assoc :groups (deser-reservation-utilization-groups (input "Groups"))) (clojure.core/contains? input "Total") (clojure.core/assoc :total (deser-reservation-aggregates (input "Total")))))

(clojure.core/defn- deser-generic-string [input] input)

(clojure.core/defn- deser-coverage-hours-percentage [input] input)

(clojure.core/defn- deser-reservation-purchase-recommendation [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccountScope") (clojure.core/assoc :account-scope (deser-account-scope (input "AccountScope"))) (clojure.core/contains? input "LookbackPeriodInDays") (clojure.core/assoc :lookback-period-in-days (deser-lookback-period-in-days (input "LookbackPeriodInDays"))) (clojure.core/contains? input "TermInYears") (clojure.core/assoc :term-in-years (deser-term-in-years (input "TermInYears"))) (clojure.core/contains? input "PaymentOption") (clojure.core/assoc :payment-option (deser-payment-option (input "PaymentOption"))) (clojure.core/contains? input "ServiceSpecification") (clojure.core/assoc :service-specification (deser-service-specification (input "ServiceSpecification"))) (clojure.core/contains? input "RecommendationDetails") (clojure.core/assoc :recommendation-details (deser-reservation-purchase-recommendation-details (input "RecommendationDetails"))) (clojure.core/contains? input "RecommendationSummary") (clojure.core/assoc :recommendation-summary (deser-reservation-purchase-recommendation-summary (input "RecommendationSummary")))))

(clojure.core/defn- deser-reservation-purchase-recommendation-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "RecommendationId") (clojure.core/assoc :recommendation-id (deser-generic-string (input "RecommendationId"))) (clojure.core/contains? input "GenerationTimestamp") (clojure.core/assoc :generation-timestamp (deser-generic-string (input "GenerationTimestamp")))))

(clojure.core/defn- deser-service-specification [input] (clojure.core/cond-> {} (clojure.core/contains? input "EC2Specification") (clojure.core/assoc :ec-2-specification (deser-ec-2-specification (input "EC2Specification")))))

(clojure.core/defn- deser-reservation-purchase-recommendation-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reservation-purchase-recommendation-detail coll))) input))

(clojure.core/defn- deser-coverages-by-time [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-coverage-by-time coll))) input))

(clojure.core/defn- deser-elasti-cache-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Family") (clojure.core/assoc :family (deser-generic-string (input "Family"))) (clojure.core/contains? input "NodeType") (clojure.core/assoc :node-type (deser-generic-string (input "NodeType"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-generic-string (input "Region"))) (clojure.core/contains? input "ProductDescription") (clojure.core/assoc :product-description (deser-generic-string (input "ProductDescription"))) (clojure.core/contains? input "CurrentGeneration") (clojure.core/assoc :current-generation (deser-generic-boolean (input "CurrentGeneration"))) (clojure.core/contains? input "SizeFlexEligible") (clojure.core/assoc :size-flex-eligible (deser-generic-boolean (input "SizeFlexEligible")))))

(clojure.core/defn- deser-dimension-values-with-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-value (input "Value"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attributes (input "Attributes")))))

(clojure.core/defn- deser-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group coll))) input))

(clojure.core/defn- deser-ec-2-specification [input] (clojure.core/cond-> {} (clojure.core/contains? input "OfferingClass") (clojure.core/assoc :offering-class (deser-offering-class (input "OfferingClass")))))

(clojure.core/defn- deser-group-definition-type [input] (clojure.core/get {"DIMENSION" :dimension, "TAG" :tag} input))

(clojure.core/defn- deser-coverage-hours [input] (clojure.core/cond-> {} (clojure.core/contains? input "OnDemandHours") (clojure.core/assoc :on-demand-hours (deser-on-demand-hours (input "OnDemandHours"))) (clojure.core/contains? input "ReservedHours") (clojure.core/assoc :reserved-hours (deser-reserved-hours (input "ReservedHours"))) (clojure.core/contains? input "TotalRunningHours") (clojure.core/assoc :total-running-hours (deser-total-running-hours (input "TotalRunningHours"))) (clojure.core/contains? input "CoverageHoursPercentage") (clojure.core/assoc :coverage-hours-percentage (deser-coverage-hours-percentage (input "CoverageHoursPercentage")))))

(clojure.core/defn- deser-utilization-percentage-in-units [input] input)

(clojure.core/defn- deser-metric-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "Amount") (clojure.core/assoc :amount (deser-metric-amount (input "Amount"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-metric-unit (input "Unit")))))

(clojure.core/defn- deser-total-running-hours [input] input)

(clojure.core/defn- deser-results-by-time [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-result-by-time coll))) input))

(clojure.core/defn- deser-amortized-recurring-fee [input] input)

(clojure.core/defn- deser-entity [input] input)

(clojure.core/defn- deser-metric-name [input] input)

(clojure.core/defn- deser-unused-units [input] input)

(clojure.core/defn- deser-offering-class [input] (clojure.core/get {"STANDARD" :standard, "CONVERTIBLE" :convertible} input))

(clojure.core/defn- deser-coverage-normalized-units [input] (clojure.core/cond-> {} (clojure.core/contains? input "OnDemandNormalizedUnits") (clojure.core/assoc :on-demand-normalized-units (deser-on-demand-normalized-units (input "OnDemandNormalizedUnits"))) (clojure.core/contains? input "ReservedNormalizedUnits") (clojure.core/assoc :reserved-normalized-units (deser-reserved-normalized-units (input "ReservedNormalizedUnits"))) (clojure.core/contains? input "TotalRunningNormalizedUnits") (clojure.core/assoc :total-running-normalized-units (deser-total-running-normalized-units (input "TotalRunningNormalizedUnits"))) (clojure.core/contains? input "CoverageNormalizedUnitsPercentage") (clojure.core/assoc :coverage-normalized-units-percentage (deser-coverage-normalized-units-percentage (input "CoverageNormalizedUnitsPercentage")))))

(clojure.core/defn- deser-reservation-coverage-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reservation-coverage-group coll))) input))

(clojure.core/defn- deser-keys [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key coll))) input))

(clojure.core/defn- deser-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "Keys") (clojure.core/assoc :keys (deser-keys (input "Keys"))) (clojure.core/contains? input "Metrics") (clojure.core/assoc :metrics (deser-metrics (input "Metrics")))))

(clojure.core/defn- deser-rds-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "DatabaseEngine") (clojure.core/assoc :database-engine (deser-generic-string (input "DatabaseEngine"))) (clojure.core/contains? input "DatabaseEdition") (clojure.core/assoc :database-edition (deser-generic-string (input "DatabaseEdition"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-generic-string (input "InstanceType"))) (clojure.core/contains? input "LicenseModel") (clojure.core/assoc :license-model (deser-generic-string (input "LicenseModel"))) (clojure.core/contains? input "Family") (clojure.core/assoc :family (deser-generic-string (input "Family"))) (clojure.core/contains? input "DeploymentOption") (clojure.core/assoc :deployment-option (deser-generic-string (input "DeploymentOption"))) (clojure.core/contains? input "SizeFlexEligible") (clojure.core/assoc :size-flex-eligible (deser-generic-boolean (input "SizeFlexEligible"))) (clojure.core/contains? input "CurrentGeneration") (clojure.core/assoc :current-generation (deser-generic-boolean (input "CurrentGeneration"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-generic-string (input "Region")))))

(clojure.core/defn- deser-forecast-results-by-time [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-forecast-result coll))) input))

(clojure.core/defn- deser-coverage-cost [input] (clojure.core/cond-> {} (clojure.core/contains? input "OnDemandCost") (clojure.core/assoc :on-demand-cost (deser-on-demand-cost (input "OnDemandCost")))))

(clojure.core/defn- deser-group-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-group-definition-type (input "Type"))) (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-group-definition-key (input "Key")))))

(clojure.core/defn- deser-purchased-hours [input] input)

(clojure.core/defn- deser-on-demand-normalized-units [input] input)

(clojure.core/defn- deser-metric-amount [input] input)

(clojure.core/defn- deser-next-page-token [input] input)

(clojure.core/defn- deser-result-by-time [input] (clojure.core/cond-> {} (clojure.core/contains? input "TimePeriod") (clojure.core/assoc :time-period (deser-date-interval (input "TimePeriod"))) (clojure.core/contains? input "Total") (clojure.core/assoc :total (deser-metrics (input "Total"))) (clojure.core/contains? input "Groups") (clojure.core/assoc :groups (deser-groups (input "Groups"))) (clojure.core/contains? input "Estimated") (clojure.core/assoc :estimated (deser-estimated (input "Estimated")))))

(clojure.core/defn- deser-on-demand-hours [input] input)

(clojure.core/defn- deser-metrics [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-metric-name k) (deser-metric-value v)])) input))

(clojure.core/defn- response-get-reservation-utilization-response ([input] (response-get-reservation-utilization-response nil input)) ([resultWrapper159429 input] (clojure.core/let [rawinput159428 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159430 {"UtilizationsByTime" (rawinput159428 "UtilizationsByTime"), "Total" (rawinput159428 "Total"), "NextPageToken" (rawinput159428 "NextPageToken")}] (clojure.core/cond-> {:utilizations-by-time (deser-utilizations-by-time (clojure.core/get-in letvar159430 ["UtilizationsByTime"]))} (letvar159430 "Total") (clojure.core/assoc :total (deser-reservation-aggregates (clojure.core/get-in letvar159430 ["Total"]))) (letvar159430 "NextPageToken") (clojure.core/assoc :next-page-token (deser-next-page-token (clojure.core/get-in letvar159430 ["NextPageToken"])))))))

(clojure.core/defn- response-request-changed-exception ([input] (response-request-changed-exception nil input)) ([resultWrapper159432 input] (clojure.core/let [rawinput159431 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159433 {"Message" (rawinput159431 "Message")}] (clojure.core/cond-> {} (letvar159433 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar159433 ["Message"])))))))

(clojure.core/defn- response-data-unavailable-exception ([input] (response-data-unavailable-exception nil input)) ([resultWrapper159435 input] (clojure.core/let [rawinput159434 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159436 {"Message" (rawinput159434 "Message")}] (clojure.core/cond-> {} (letvar159436 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar159436 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper159438 input] (clojure.core/let [rawinput159437 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159439 {"Message" (rawinput159437 "Message")}] (clojure.core/cond-> {} (letvar159439 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar159439 ["Message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper159441 input] (clojure.core/let [rawinput159440 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159442 {"Message" (rawinput159440 "Message")}] (clojure.core/cond-> {} (letvar159442 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar159442 ["Message"])))))))

(clojure.core/defn- response-bill-expiration-exception ([input] (response-bill-expiration-exception nil input)) ([resultWrapper159444 input] (clojure.core/let [rawinput159443 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159445 {"Message" (rawinput159443 "Message")}] (clojure.core/cond-> {} (letvar159445 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar159445 ["Message"])))))))

(clojure.core/defn- response-get-tags-response ([input] (response-get-tags-response nil input)) ([resultWrapper159447 input] (clojure.core/let [rawinput159446 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159448 {"NextPageToken" (rawinput159446 "NextPageToken"), "Tags" (rawinput159446 "Tags"), "ReturnSize" (rawinput159446 "ReturnSize"), "TotalSize" (rawinput159446 "TotalSize")}] (clojure.core/cond-> {:tags (deser-tag-list (clojure.core/get-in letvar159448 ["Tags"])), :return-size (deser-page-size (clojure.core/get-in letvar159448 ["ReturnSize"])), :total-size (deser-page-size (clojure.core/get-in letvar159448 ["TotalSize"]))} (letvar159448 "NextPageToken") (clojure.core/assoc :next-page-token (deser-next-page-token (clojure.core/get-in letvar159448 ["NextPageToken"])))))))

(clojure.core/defn- response-get-cost-forecast-response ([input] (response-get-cost-forecast-response nil input)) ([resultWrapper159450 input] (clojure.core/let [rawinput159449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159451 {"Total" (rawinput159449 "Total"), "ForecastResultsByTime" (rawinput159449 "ForecastResultsByTime")}] (clojure.core/cond-> {} (letvar159451 "Total") (clojure.core/assoc :total (deser-metric-value (clojure.core/get-in letvar159451 ["Total"]))) (letvar159451 "ForecastResultsByTime") (clojure.core/assoc :forecast-results-by-time (deser-forecast-results-by-time (clojure.core/get-in letvar159451 ["ForecastResultsByTime"])))))))

(clojure.core/defn- response-get-reservation-coverage-response ([input] (response-get-reservation-coverage-response nil input)) ([resultWrapper159453 input] (clojure.core/let [rawinput159452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159454 {"CoveragesByTime" (rawinput159452 "CoveragesByTime"), "Total" (rawinput159452 "Total"), "NextPageToken" (rawinput159452 "NextPageToken")}] (clojure.core/cond-> {:coverages-by-time (deser-coverages-by-time (clojure.core/get-in letvar159454 ["CoveragesByTime"]))} (letvar159454 "Total") (clojure.core/assoc :total (deser-coverage (clojure.core/get-in letvar159454 ["Total"]))) (letvar159454 "NextPageToken") (clojure.core/assoc :next-page-token (deser-next-page-token (clojure.core/get-in letvar159454 ["NextPageToken"])))))))

(clojure.core/defn- response-get-reservation-purchase-recommendation-response ([input] (response-get-reservation-purchase-recommendation-response nil input)) ([resultWrapper159456 input] (clojure.core/let [rawinput159455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159457 {"Metadata" (rawinput159455 "Metadata"), "Recommendations" (rawinput159455 "Recommendations"), "NextPageToken" (rawinput159455 "NextPageToken")}] (clojure.core/cond-> {} (letvar159457 "Metadata") (clojure.core/assoc :metadata (deser-reservation-purchase-recommendation-metadata (clojure.core/get-in letvar159457 ["Metadata"]))) (letvar159457 "Recommendations") (clojure.core/assoc :recommendations (deser-reservation-purchase-recommendations (clojure.core/get-in letvar159457 ["Recommendations"]))) (letvar159457 "NextPageToken") (clojure.core/assoc :next-page-token (deser-next-page-token (clojure.core/get-in letvar159457 ["NextPageToken"])))))))

(clojure.core/defn- response-get-dimension-values-response ([input] (response-get-dimension-values-response nil input)) ([resultWrapper159459 input] (clojure.core/let [rawinput159458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159460 {"DimensionValues" (rawinput159458 "DimensionValues"), "ReturnSize" (rawinput159458 "ReturnSize"), "TotalSize" (rawinput159458 "TotalSize"), "NextPageToken" (rawinput159458 "NextPageToken")}] (clojure.core/cond-> {:dimension-values (deser-dimension-values-with-attributes-list (clojure.core/get-in letvar159460 ["DimensionValues"])), :return-size (deser-page-size (clojure.core/get-in letvar159460 ["ReturnSize"])), :total-size (deser-page-size (clojure.core/get-in letvar159460 ["TotalSize"]))} (letvar159460 "NextPageToken") (clojure.core/assoc :next-page-token (deser-next-page-token (clojure.core/get-in letvar159460 ["NextPageToken"])))))))

(clojure.core/defn- response-get-cost-and-usage-response ([input] (response-get-cost-and-usage-response nil input)) ([resultWrapper159462 input] (clojure.core/let [rawinput159461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar159463 {"NextPageToken" (rawinput159461 "NextPageToken"), "GroupDefinitions" (rawinput159461 "GroupDefinitions"), "ResultsByTime" (rawinput159461 "ResultsByTime")}] (clojure.core/cond-> {} (letvar159463 "NextPageToken") (clojure.core/assoc :next-page-token (deser-next-page-token (clojure.core/get-in letvar159463 ["NextPageToken"]))) (letvar159463 "GroupDefinitions") (clojure.core/assoc :group-definitions (deser-group-definitions (clojure.core/get-in letvar159463 ["GroupDefinitions"]))) (letvar159463 "ResultsByTime") (clojure.core/assoc :results-by-time (deser-results-by-time (clojure.core/get-in letvar159463 ["ResultsByTime"])))))))

(clojure.spec.alpha/def :portkey.aws.ce/total-actual-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.tag-values/key (clojure.spec.alpha/and :portkey.aws.ce/tag-key))
(clojure.spec.alpha/def :portkey.aws.ce/tag-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.tag-values/key :portkey.aws.ce/values]))

(clojure.spec.alpha/def :portkey.aws.ce/group-definitions (clojure.spec.alpha/coll-of :portkey.aws.ce/group-definition))

(clojure.spec.alpha/def :portkey.aws.ce/attribute-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.forecast-result/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.forecast-result/mean-value (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.forecast-result/prediction-interval-lower-bound (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.forecast-result/prediction-interval-upper-bound (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/forecast-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.forecast-result/time-period :portkey.aws.ce.forecast-result/mean-value :portkey.aws.ce.forecast-result/prediction-interval-lower-bound :portkey.aws.ce.forecast-result/prediction-interval-upper-bound]))

(clojure.spec.alpha/def :portkey.aws.ce/non-negative-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-request/group-by (clojure.spec.alpha/and :portkey.aws.ce/group-definitions))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-utilization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-reservation-utilization-request/time-period] :opt-un [:portkey.aws.ce.get-reservation-utilization-request/group-by :portkey.aws.ce/granularity :portkey.aws.ce.get-reservation-utilization-request/filter :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/search-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-response/total (clojure.spec.alpha/and :portkey.aws.ce/reservation-aggregates))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-utilization-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce/utilizations-by-time] :opt-un [:portkey.aws.ce.get-reservation-utilization-response/total :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/estimated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ce/total-amortized-fee (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/total-running-normalized-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/total-potential-ri-savings (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/coverage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/coverage-hours :portkey.aws.ce/coverage-normalized-units :portkey.aws.ce/coverage-cost]))

(clojure.spec.alpha/def :portkey.aws.ce/page-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ce/term-in-years #{"ONE_YEAR" :three-years "THREE_YEARS" :one-year})

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/currency-code (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/average-utilization (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-break-even-in-months (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-number-of-instances-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-reservation-cost-for-lookback-period (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/recurring-standard-monthly-cost (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-normalized-units-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-amount (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/upfront-cost (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/average-number-of-instances-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/average-normalized-units-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-number-of-instances-to-purchase (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-percentage (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/account-id (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-normalized-units-to-purchase (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-on-demand-cost (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-number-of-instances-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-normalized-units-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-purchase-recommendation-detail/currency-code :portkey.aws.ce.reservation-purchase-recommendation-detail/average-utilization :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-break-even-in-months :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-number-of-instances-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-reservation-cost-for-lookback-period :portkey.aws.ce/instance-details :portkey.aws.ce.reservation-purchase-recommendation-detail/recurring-standard-monthly-cost :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-normalized-units-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-amount :portkey.aws.ce.reservation-purchase-recommendation-detail/upfront-cost :portkey.aws.ce.reservation-purchase-recommendation-detail/average-number-of-instances-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/average-normalized-units-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-number-of-instances-to-purchase :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-percentage :portkey.aws.ce.reservation-purchase-recommendation-detail/account-id :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-normalized-units-to-purchase :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-on-demand-cost :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-number-of-instances-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-normalized-units-used-per-hour]))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-request/page-size (clojure.spec.alpha/and :portkey.aws.ce/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-request/account-id (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-request/service (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-purchase-recommendation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-reservation-purchase-recommendation-request/service] :opt-un [:portkey.aws.ce.get-reservation-purchase-recommendation-request/page-size :portkey.aws.ce/term-in-years :portkey.aws.ce/payment-option :portkey.aws.ce/account-scope :portkey.aws.ce/lookback-period-in-days :portkey.aws.ce/service-specification :portkey.aws.ce.get-reservation-purchase-recommendation-request/account-id :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/unused-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/purchased-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/year-month-day (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ce/group-definition-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-group-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/coverage-normalized-units-percentage (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.request-changed-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/request-changed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.request-changed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-amount (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-percentage (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-summary/currency-code (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-amount :portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-percentage :portkey.aws.ce.reservation-purchase-recommendation-summary/currency-code]))

(clojure.spec.alpha/def :portkey.aws.ce/context #{"COST_AND_USAGE" "RESERVATIONS" :cost-and-usage :reservations})

(clojure.spec.alpha/def :portkey.aws.ce/instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/ec-2-instance-details :portkey.aws.ce/rds-instance-details :portkey.aws.ce/redshift-instance-details :portkey.aws.ce/elasti-cache-instance-details :portkey.aws.ce/es-instance-details]))

(clojure.spec.alpha/def :portkey.aws.ce/reserved-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/on-demand-cost (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/amortized-upfront-fee (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/utilizations-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/utilization-by-time))

(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/platform (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/tenancy (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/ec-2-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.ec-2-instance-details/family :portkey.aws.ce.ec-2-instance-details/instance-type :portkey.aws.ce.ec-2-instance-details/region :portkey.aws.ce.ec-2-instance-details/availability-zone :portkey.aws.ce.ec-2-instance-details/platform :portkey.aws.ce.ec-2-instance-details/tenancy :portkey.aws.ce.ec-2-instance-details/current-generation :portkey.aws.ce.ec-2-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.date-interval/start (clojure.spec.alpha/and :portkey.aws.ce/year-month-day))
(clojure.spec.alpha/def :portkey.aws.ce.date-interval/end (clojure.spec.alpha/and :portkey.aws.ce/year-month-day))
(clojure.spec.alpha/def :portkey.aws.ce/date-interval (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.date-interval/start :portkey.aws.ce.date-interval/end] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ce/dimension #{"SUBSCRIPTION_ID" :instance-type-family :service :az :database-engine "LINKED_ACCOUNT" "LEGAL_ENTITY_NAME" "TENANCY" :tenancy "PURCHASE_TYPE" :operation "SERVICE" :instance-type "INSTANCE_TYPE_FAMILY" :scope "RECORD_TYPE" "INSTANCE_TYPE" "DEPLOYMENT_OPTION" :linked-account :region :cache-engine :reservation-id :billing-entity "PLATFORM" :operating-system :usage-type-group "OPERATING_SYSTEM" :usage-type "SCOPE" :subscription-id "CACHE_ENGINE" "USAGE_TYPE_GROUP" "DATABASE_ENGINE" "REGION" :deployment-option "AZ" :legal-entity-name "RESERVATION_ID" :record-type "BILLING_ENTITY" :purchase-type :platform "OPERATION" "USAGE_TYPE"})

(clojure.spec.alpha/def :portkey.aws.ce/generic-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ce/utilization-percentage (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.data-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/data-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.data-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendations (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-purchase-recommendation))

(clojure.spec.alpha/def :portkey.aws.ce.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/dimension-values-with-attributes-list (clojure.spec.alpha/coll-of :portkey.aws.ce/dimension-values-with-attributes))

(clojure.spec.alpha/def :portkey.aws.ce/reserved-normalized-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.expression/or (clojure.spec.alpha/and :portkey.aws.ce/expressions))
(clojure.spec.alpha/def :portkey.aws.ce.expression/and (clojure.spec.alpha/and :portkey.aws.ce/expressions))
(clojure.spec.alpha/def :portkey.aws.ce.expression/not (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce.expression/dimensions (clojure.spec.alpha/and :portkey.aws.ce/dimension-values))
(clojure.spec.alpha/def :portkey.aws.ce.expression/tags (clojure.spec.alpha/and :portkey.aws.ce/tag-values))
(clojure.spec.alpha/def :portkey.aws.ce/expression (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.expression/or :portkey.aws.ce.expression/and :portkey.aws.ce.expression/not :portkey.aws.ce.expression/dimensions :portkey.aws.ce.expression/tags]))

(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/node-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/redshift-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.redshift-instance-details/family :portkey.aws.ce.redshift-instance-details/node-type :portkey.aws.ce.redshift-instance-details/region :portkey.aws.ce.redshift-instance-details/current-generation :portkey.aws.ce.redshift-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce/payment-option #{:heavy-utilization :no-upfront "LIGHT_UTILIZATION" :medium-utilization :all-upfront "NO_UPFRONT" :light-utilization :partial-upfront "HEAVY_UTILIZATION" "PARTIAL_UPFRONT" "ALL_UPFRONT" "MEDIUM_UTILIZATION"})

(clojure.spec.alpha/def :portkey.aws.ce/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/account-scope #{:linked :payer "PAYER" "LINKED"})

(clojure.spec.alpha/def :portkey.aws.ce/on-demand-cost-of-ri-hours-used (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/lookback-period-in-days #{:thirty-days :seven-days "SIXTY_DAYS" "SEVEN_DAYS" "THIRTY_DAYS" :sixty-days})

(clojure.spec.alpha/def :portkey.aws.ce.reservation-utilization-group/key (clojure.spec.alpha/and :portkey.aws.ce/reservation-group-key))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-utilization-group/value (clojure.spec.alpha/and :portkey.aws.ce/reservation-group-value))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-utilization-group/utilization (clojure.spec.alpha/and :portkey.aws.ce/reservation-aggregates))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-utilization-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-utilization-group/key :portkey.aws.ce.reservation-utilization-group/value :portkey.aws.ce/attributes :portkey.aws.ce.reservation-utilization-group/utilization]))

(clojure.spec.alpha/def :portkey.aws.ce/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-coverage-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/attributes :portkey.aws.ce/coverage]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-aggregates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/total-actual-units :portkey.aws.ce/total-amortized-fee :portkey.aws.ce/total-potential-ri-savings :portkey.aws.ce/unused-hours :portkey.aws.ce/purchased-units :portkey.aws.ce/amortized-upfront-fee :portkey.aws.ce/utilization-percentage :portkey.aws.ce/on-demand-cost-of-ri-hours-used :portkey.aws.ce/net-ri-savings :portkey.aws.ce/total-actual-hours :portkey.aws.ce/utilization-percentage-in-units :portkey.aws.ce/amortized-recurring-fee :portkey.aws.ce/unused-units :portkey.aws.ce/purchased-hours]))

(clojure.spec.alpha/def :portkey.aws.ce/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/attributes (clojure.spec.alpha/map-of :portkey.aws.ce/attribute-type :portkey.aws.ce/attribute-value))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-group-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce/get-dimension-values-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-dimension-values-request/time-period :portkey.aws.ce/dimension] :opt-un [:portkey.aws.ce/search-string :portkey.aws.ce/context :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/tag-list (clojure.spec.alpha/coll-of :portkey.aws.ce/entity))

(clojure.spec.alpha/def :portkey.aws.ce.coverage-by-time/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.coverage-by-time/groups (clojure.spec.alpha/and :portkey.aws.ce/reservation-coverage-groups))
(clojure.spec.alpha/def :portkey.aws.ce.coverage-by-time/total (clojure.spec.alpha/and :portkey.aws.ce/coverage))
(clojure.spec.alpha/def :portkey.aws.ce/coverage-by-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.coverage-by-time/time-period :portkey.aws.ce.coverage-by-time/groups :portkey.aws.ce.coverage-by-time/total]))

(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/metrics (clojure.spec.alpha/and :portkey.aws.ce/metric-names))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/group-by (clojure.spec.alpha/and :portkey.aws.ce/group-definitions))
(clojure.spec.alpha/def :portkey.aws.ce/get-cost-and-usage-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.get-cost-and-usage-request/time-period :portkey.aws.ce/granularity :portkey.aws.ce.get-cost-and-usage-request/filter :portkey.aws.ce.get-cost-and-usage-request/metrics :portkey.aws.ce.get-cost-and-usage-request/group-by :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/instance-class (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/instance-size (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/es-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.es-instance-details/instance-class :portkey.aws.ce.es-instance-details/instance-size :portkey.aws.ce.es-instance-details/region :portkey.aws.ce.es-instance-details/current-generation :portkey.aws.ce.es-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce.bill-expiration-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/bill-expiration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.bill-expiration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/expressions (clojure.spec.alpha/coll-of :portkey.aws.ce/expression))

(clojure.spec.alpha/def :portkey.aws.ce/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/net-ri-savings (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/group-by (clojure.spec.alpha/and :portkey.aws.ce/group-definitions))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/metrics (clojure.spec.alpha/and :portkey.aws.ce/metric-names))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-coverage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-reservation-coverage-request/time-period] :opt-un [:portkey.aws.ce.get-reservation-coverage-request/group-by :portkey.aws.ce/granularity :portkey.aws.ce.get-reservation-coverage-request/filter :portkey.aws.ce.get-reservation-coverage-request/metrics :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/total-actual-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-utilization-groups (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-utilization-group))

(clojure.spec.alpha/def :portkey.aws.ce.utilization-by-time/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.utilization-by-time/groups (clojure.spec.alpha/and :portkey.aws.ce/reservation-utilization-groups))
(clojure.spec.alpha/def :portkey.aws.ce.utilization-by-time/total (clojure.spec.alpha/and :portkey.aws.ce/reservation-aggregates))
(clojure.spec.alpha/def :portkey.aws.ce/utilization-by-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.utilization-by-time/time-period :portkey.aws.ce.utilization-by-time/groups :portkey.aws.ce.utilization-by-time/total]))

(clojure.spec.alpha/def :portkey.aws.ce/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/coverage-hours-percentage (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation/recommendation-details (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendation-details))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation/recommendation-summary (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendation-summary))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/account-scope :portkey.aws.ce/lookback-period-in-days :portkey.aws.ce/term-in-years :portkey.aws.ce/payment-option :portkey.aws.ce/service-specification :portkey.aws.ce.reservation-purchase-recommendation/recommendation-details :portkey.aws.ce.reservation-purchase-recommendation/recommendation-summary]))

(clojure.spec.alpha/def :portkey.aws.ce.get-tags-response/tags (clojure.spec.alpha/and :portkey.aws.ce/tag-list))
(clojure.spec.alpha/def :portkey.aws.ce.get-tags-response/return-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce.get-tags-response/total-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce/get-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-tags-response/tags :portkey.aws.ce.get-tags-response/return-size :portkey.aws.ce.get-tags-response/total-size] :opt-un [:portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/values (clojure.spec.alpha/coll-of :portkey.aws.ce/value))

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-metadata/recommendation-id (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-metadata/generation-timestamp (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-purchase-recommendation-metadata/recommendation-id :portkey.aws.ce.reservation-purchase-recommendation-metadata/generation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.ce/service-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/ec-2-specification]))

(clojure.spec.alpha/def :portkey.aws.ce.get-cost-forecast-response/total (clojure.spec.alpha/and :portkey.aws.ce/metric-value))
(clojure.spec.alpha/def :portkey.aws.ce/get-cost-forecast-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.get-cost-forecast-response/total :portkey.aws.ce/forecast-results-by-time]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-details (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-purchase-recommendation-detail))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-response/total (clojure.spec.alpha/and :portkey.aws.ce/coverage))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-coverage-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce/coverages-by-time] :opt-un [:portkey.aws.ce.get-reservation-coverage-response/total :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/coverages-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/coverage-by-time))

(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/node-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/product-description (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/elasti-cache-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.elasti-cache-instance-details/family :portkey.aws.ce.elasti-cache-instance-details/node-type :portkey.aws.ce.elasti-cache-instance-details/region :portkey.aws.ce.elasti-cache-instance-details/product-description :portkey.aws.ce.elasti-cache-instance-details/current-generation :portkey.aws.ce.elasti-cache-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-response/metadata (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendation-metadata))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-response/recommendations (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendations))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-purchase-recommendation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.get-reservation-purchase-recommendation-response/metadata :portkey.aws.ce.get-reservation-purchase-recommendation-response/recommendations :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/dimension-values-with-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/value :portkey.aws.ce/attributes]))

(clojure.spec.alpha/def :portkey.aws.ce/groups (clojure.spec.alpha/coll-of :portkey.aws.ce/group))

(clojure.spec.alpha/def :portkey.aws.ce/ec-2-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/offering-class]))

(clojure.spec.alpha/def :portkey.aws.ce/metric #{:blended-cost "AMORTIZED_COST" "BLENDED_COST" :usage-quantity :unblended-cost "USAGE_QUANTITY" :normalized-usage-amount :net-amortized-cost "NET_UNBLENDED_COST" "UNBLENDED_COST" :net-unblended-cost :amortized-cost "NET_AMORTIZED_COST" "NORMALIZED_USAGE_AMOUNT"})

(clojure.spec.alpha/def :portkey.aws.ce/group-definition-type #{"TAG" :dimension :tag "DIMENSION"})

(clojure.spec.alpha/def :portkey.aws.ce/coverage-hours (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/on-demand-hours :portkey.aws.ce/reserved-hours :portkey.aws.ce/total-running-hours :portkey.aws.ce/coverage-hours-percentage]))

(clojure.spec.alpha/def :portkey.aws.ce/utilization-percentage-in-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-response/dimension-values (clojure.spec.alpha/and :portkey.aws.ce/dimension-values-with-attributes-list))
(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-response/return-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-response/total-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce/get-dimension-values-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-dimension-values-response/dimension-values :portkey.aws.ce.get-dimension-values-response/return-size :portkey.aws.ce.get-dimension-values-response/total-size] :opt-un [:portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce.metric-value/amount (clojure.spec.alpha/and :portkey.aws.ce/metric-amount))
(clojure.spec.alpha/def :portkey.aws.ce.metric-value/unit (clojure.spec.alpha/and :portkey.aws.ce/metric-unit))
(clojure.spec.alpha/def :portkey.aws.ce/metric-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.metric-value/amount :portkey.aws.ce.metric-value/unit]))

(clojure.spec.alpha/def :portkey.aws.ce/total-running-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metric-names (clojure.spec.alpha/coll-of :portkey.aws.ce/metric-name))

(clojure.spec.alpha/def :portkey.aws.ce/granularity #{:daily :monthly "MONTHLY" :hourly "DAILY" "HOURLY"})

(clojure.spec.alpha/def :portkey.aws.ce.get-tags-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce/get-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-tags-request/time-period] :opt-un [:portkey.aws.ce/search-string :portkey.aws.ce/tag-key :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/results-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/result-by-time))

(clojure.spec.alpha/def :portkey.aws.ce/amortized-recurring-fee (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/unused-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/offering-class #{"STANDARD" :standard :convertible "CONVERTIBLE"})

(clojure.spec.alpha/def :portkey.aws.ce/coverage-normalized-units (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/on-demand-normalized-units :portkey.aws.ce/reserved-normalized-units :portkey.aws.ce/total-running-normalized-units :portkey.aws.ce/coverage-normalized-units-percentage]))

(clojure.spec.alpha/def :portkey.aws.ce.get-cost-forecast-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-forecast-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce/get-cost-forecast-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-cost-forecast-request/time-period :portkey.aws.ce/metric :portkey.aws.ce/granularity] :opt-un [:portkey.aws.ce.get-cost-forecast-request/filter :portkey.aws.ce/prediction-interval-level]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-coverage-groups (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-coverage-group))

(clojure.spec.alpha/def :portkey.aws.ce.dimension-values/key (clojure.spec.alpha/and :portkey.aws.ce/dimension))
(clojure.spec.alpha/def :portkey.aws.ce/dimension-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.dimension-values/key :portkey.aws.ce/values]))

(clojure.spec.alpha/def :portkey.aws.ce/keys (clojure.spec.alpha/coll-of :portkey.aws.ce/key))

(clojure.spec.alpha/def :portkey.aws.ce/group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/keys :portkey.aws.ce/metrics]))

(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/database-engine (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/database-edition (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/license-model (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/deployment-option (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/rds-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.rds-instance-details/database-engine :portkey.aws.ce.rds-instance-details/database-edition :portkey.aws.ce.rds-instance-details/instance-type :portkey.aws.ce.rds-instance-details/license-model :portkey.aws.ce.rds-instance-details/family :portkey.aws.ce.rds-instance-details/deployment-option :portkey.aws.ce.rds-instance-details/size-flex-eligible :portkey.aws.ce.rds-instance-details/current-generation :portkey.aws.ce.rds-instance-details/region]))

(clojure.spec.alpha/def :portkey.aws.ce/forecast-results-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/forecast-result))

(clojure.spec.alpha/def :portkey.aws.ce/prediction-interval-level (clojure.spec.alpha/int-in 51 99))

(clojure.spec.alpha/def :portkey.aws.ce/coverage-cost (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/on-demand-cost]))

(clojure.spec.alpha/def :portkey.aws.ce.group-definition/type (clojure.spec.alpha/and :portkey.aws.ce/group-definition-type))
(clojure.spec.alpha/def :portkey.aws.ce.group-definition/key (clojure.spec.alpha/and :portkey.aws.ce/group-definition-key))
(clojure.spec.alpha/def :portkey.aws.ce/group-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.group-definition/type :portkey.aws.ce.group-definition/key]))

(clojure.spec.alpha/def :portkey.aws.ce/purchased-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/on-demand-normalized-units (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metric-amount (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/next-page-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/get-cost-and-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/next-page-token :portkey.aws.ce/group-definitions :portkey.aws.ce/results-by-time]))

(clojure.spec.alpha/def :portkey.aws.ce.result-by-time/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.result-by-time/total (clojure.spec.alpha/and :portkey.aws.ce/metrics))
(clojure.spec.alpha/def :portkey.aws.ce/result-by-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.result-by-time/time-period :portkey.aws.ce.result-by-time/total :portkey.aws.ce/groups :portkey.aws.ce/estimated]))

(clojure.spec.alpha/def :portkey.aws.ce/on-demand-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metrics (clojure.spec.alpha/map-of :portkey.aws.ce/metric-name :portkey.aws.ce/metric-value))

(clojure.core/defn get-cost-and-usage "Retrieves cost and usage metrics for your account. You can specify which cost\nand usage-related metric, such as BlendedCosts or UsageQuantity, that you want\nthe request to return. You can also filter and group your data by various\ndimensions, such as SERVICE or AZ, in a specific time range. For a complete list\nof valid dimensions, see the GetDimensionValues\n(http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html)\noperation. Master accounts in an organization in AWS Organizations have access\nto all member accounts." ([] (get-cost-and-usage {})) ([get-cost-and-usage-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cost-and-usage-request get-cost-and-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-cost-and-usage-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-cost-and-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCostAndUsage", :http.request.configuration/output-deser-fn response-get-cost-and-usage-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "BillExpirationException" :portkey.aws.ce/bill-expiration-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception, "RequestChangedException" :portkey.aws.ce/request-changed-exception}})))))
(clojure.spec.alpha/fdef get-cost-and-usage :args (clojure.spec.alpha/? :portkey.aws.ce/get-cost-and-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-cost-and-usage-response))

(clojure.core/defn get-cost-forecast "Retrieves a forecast for how much Amazon Web Services predicts that you will\nspend over the forecast time period that you select, based on your past costs." ([get-cost-forecast-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cost-forecast-request get-cost-forecast-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-cost-forecast-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-cost-forecast-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCostForecast", :http.request.configuration/output-deser-fn response-get-cost-forecast-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-cost-forecast :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-cost-forecast-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-cost-forecast-response))

(clojure.core/defn get-dimension-values "Retrieves all available filter values for a specified filter over a period of\ntime. You can search the dimension values for an arbitrary string." ([get-dimension-values-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-dimension-values-request get-dimension-values-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-dimension-values-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-dimension-values-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDimensionValues", :http.request.configuration/output-deser-fn response-get-dimension-values-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "BillExpirationException" :portkey.aws.ce/bill-expiration-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception, "RequestChangedException" :portkey.aws.ce/request-changed-exception}})))))
(clojure.spec.alpha/fdef get-dimension-values :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-dimension-values-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-dimension-values-response))

(clojure.core/defn get-reservation-coverage "Retrieves the reservation coverage for your account. This enables you to see how\nmuch of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational\nDatabase Service, or Amazon Redshift usage is covered by a reservation. An\norganization's master account can see the coverage of the associated member\naccounts. For any time period, you can filter data about reservation usage by\nthe following dimensions:\n * AZ\n * CACHE_ENGINE\n * DATABASE_ENGINE\n * DEPLOYMENT_OPTION\n * INSTANCE_TYPE\n * LINKED_ACCOUNT\n * OPERATING_SYSTEM\n * PLATFORM\n * REGION\n * SERVICE\n * TAG\n * TENANCY\n To determine valid values for a dimension, use the GetDimensionValues\noperation." ([get-reservation-coverage-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-reservation-coverage-request get-reservation-coverage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-reservation-coverage-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-reservation-coverage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReservationCoverage", :http.request.configuration/output-deser-fn response-get-reservation-coverage-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-reservation-coverage :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-reservation-coverage-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-reservation-coverage-response))

(clojure.core/defn get-reservation-purchase-recommendation "Gets recommendations for which reservations to purchase. These recommendations\ncould help you reduce your costs. Reservations provide a discounted hourly rate\n(up to 75%) compared to On-Demand pricing.\n AWS generates your recommendations by identifying your On-Demand usage during a\nspecific time period and collecting your usage into categories that are eligible\nfor a reservation. After AWS has these categories, it simulates every\ncombination of reservations in each category of usage to identify the best\nnumber of each type of RI to purchase to maximize your estimated savings.\n For example, AWS automatically aggregates your Amazon EC2 Linux, shared\ntenancy, and c4 family usage in the US West (Oregon) Region and recommends that\nyou buy size-flexible regional reservations to apply to the c4 family usage. AWS\nrecommends the smallest size instance in an instance family. This makes it\neasier to purchase a size-flexible RI. AWS also shows the equal number of\nnormalized units so that you can purchase any instance size that you want. For\nthis example, your RI recommendation would be for c4.large because that is the\nsmallest size instance in the c4 instance family." ([get-reservation-purchase-recommendation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-reservation-purchase-recommendation-request get-reservation-purchase-recommendation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-reservation-purchase-recommendation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-reservation-purchase-recommendation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReservationPurchaseRecommendation", :http.request.configuration/output-deser-fn response-get-reservation-purchase-recommendation-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-reservation-purchase-recommendation :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-reservation-purchase-recommendation-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-reservation-purchase-recommendation-response))

(clojure.core/defn get-reservation-utilization "Retrieves the reservation utilization for your account. Master accounts in an\norganization have access to member accounts. You can filter data by dimensions\nin a time period. You can use GetDimensionValues to determine the possible\ndimension values. Currently, you can group only by SUBSCRIPTION_ID." ([get-reservation-utilization-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-reservation-utilization-request get-reservation-utilization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-reservation-utilization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-reservation-utilization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReservationUtilization", :http.request.configuration/output-deser-fn response-get-reservation-utilization-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-reservation-utilization :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-reservation-utilization-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-reservation-utilization-response))

(clojure.core/defn get-tags "Queries for available tag keys and tag values for a specified period. You can\nsearch the tag values for an arbitrary string." ([get-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-tags-request get-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTags", :http.request.configuration/output-deser-fn response-get-tags-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "BillExpirationException" :portkey.aws.ce/bill-expiration-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception, "RequestChangedException" :portkey.aws.ce/request-changed-exception}})))))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-tags-response))
