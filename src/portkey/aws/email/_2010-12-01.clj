(ns portkey.aws.email.-2010-12-01 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "email", :region "eu-west-1"},
    :ssl-common-name "email.eu-west-1.amazonaws.com",
    :endpoint "https://email.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "email", :region "us-west-2"},
    :ssl-common-name "email.us-west-2.amazonaws.com",
    :endpoint "https://email.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "email", :region "us-east-1"},
    :ssl-common-name "email.us-east-1.amazonaws.com",
    :endpoint "https://email.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-dimension-name)

(clojure.core/declare ser-address)

(clojure.core/declare ser-event-destination)

(clojure.core/declare ser-tracking-options)

(clojure.core/declare ser-dimension-value-source)

(clojure.core/declare ser-configuration-set-attribute)

(clojure.core/declare ser-receipt-rule-name)

(clojure.core/declare ser-bounce-action)

(clojure.core/declare ser-cidr)

(clojure.core/declare ser-message-data)

(clojure.core/declare ser-behavior-on-mx-failure)

(clojure.core/declare ser-dsn-action)

(clojure.core/declare ser-message-dsn)

(clojure.core/declare ser-cloud-watch-dimension-configuration)

(clojure.core/declare ser-bulk-email-destination)

(clojure.core/declare ser-template-content)

(clojure.core/declare ser-receipt-filter)

(clojure.core/declare ser-message-id)

(clojure.core/declare ser-add-header-action)

(clojure.core/declare ser-header-name)

(clojure.core/declare ser-extension-field-name)

(clojure.core/declare ser-cloud-watch-destination)

(clojure.core/declare ser-configuration-set)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-identity-list)

(clojure.core/declare ser-receipt-action)

(clojure.core/declare ser-body)

(clojure.core/declare ser-workmail-action)

(clojure.core/declare ser-amazon-resource-name)

(clojure.core/declare ser-arrival-date)

(clojure.core/declare ser-bulk-email-destination-list)

(clojure.core/declare ser-default-dimension-value)

(clojure.core/declare ser-stop-scope)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-s-3-bucket-name)

(clojure.core/declare ser-template)

(clojure.core/declare ser-raw-message-data)

(clojure.core/declare ser-configuration-set-name)

(clojure.core/declare ser-notification-type)

(clojure.core/declare ser-bounce-type)

(clojure.core/declare ser-bounced-recipient-info)

(clojure.core/declare ser-extension-field-value)

(clojure.core/declare ser-custom-redirect-domain)

(clojure.core/declare ser-html-part)

(clojure.core/declare ser-enabled)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-dsn-status)

(clojure.core/declare ser-address-list)

(clojure.core/declare ser-configuration-set-attribute-list)

(clojure.core/declare ser-recipient-dsn-fields)

(clojure.core/declare ser-header-value)

(clojure.core/declare ser-sns-action-encoding)

(clojure.core/declare ser-domain)

(clojure.core/declare ser-sns-action)

(clojure.core/declare ser-message-tag)

(clojure.core/declare ser-reporting-mta)

(clojure.core/declare ser-receipt-filter-name)

(clojure.core/declare ser-message-tag-name)

(clojure.core/declare ser-text-part)

(clojure.core/declare ser-subject)

(clojure.core/declare ser-event-destination-name)

(clojure.core/declare ser-tls-policy)

(clojure.core/declare ser-recipient)

(clojure.core/declare ser-message)

(clojure.core/declare ser-invocation-type)

(clojure.core/declare ser-last-attempt-date)

(clojure.core/declare ser-receipt-rule)

(clojure.core/declare ser-message-tag-value)

(clojure.core/declare ser-content)

(clojure.core/declare ser-identity-type)

(clojure.core/declare ser-bounce-message)

(clojure.core/declare ser-explanation)

(clojure.core/declare ser-extension-field-list)

(clojure.core/declare ser-identity)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-s-3-key-prefix)

(clojure.core/declare ser-template-name)

(clojure.core/declare ser-kinesis-firehose-destination)

(clojure.core/declare ser-message-tag-list)

(clojure.core/declare ser-bounced-recipient-info-list)

(clojure.core/declare ser-notification-topic)

(clojure.core/declare ser-cloud-watch-dimension-configurations)

(clojure.core/declare ser-event-types)

(clojure.core/declare ser-from-address)

(clojure.core/declare ser-receipt-actions-list)

(clojure.core/declare ser-charset)

(clojure.core/declare ser-success-redirection-url)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-sns-destination)

(clojure.core/declare ser-bounce-status-code)

(clojure.core/declare ser-failure-redirection-url)

(clojure.core/declare ser-raw-message)

(clojure.core/declare ser-extension-field)

(clojure.core/declare ser-receipt-filter-policy)

(clojure.core/declare ser-stop-action)

(clojure.core/declare ser-template-data)

(clojure.core/declare ser-lambda-action)

(clojure.core/declare ser-receipt-ip-filter)

(clojure.core/declare ser-recipients-list)

(clojure.core/declare ser-remote-mta)

(clojure.core/declare ser-diagnostic-code)

(clojure.core/declare ser-receipt-rule-names-list)

(clojure.core/declare ser-s-3-action)

(clojure.core/declare ser-policy-name-list)

(clojure.core/declare ser-subject-part)

(clojure.core/declare ser-bounce-smtp-reply-code)

(clojure.core/declare ser-receipt-rule-set-name)

(clojure.core/declare ser-mail-from-domain-name)

(clojure.core/defn- ser-dimension-name [input] #:http.request.field{:value input, :shape "DimensionName"})

(clojure.core/defn- ser-address [input] #:http.request.field{:value input, :shape "Address"})

(clojure.core/defn- ser-event-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-event-destination-name (:name input)) #:http.request.field{:name "Name", :shape "EventDestinationName"}) (clojure.core/into (ser-event-types (:matching-event-types input)) #:http.request.field{:name "MatchingEventTypes", :shape "EventTypes"})], :shape "EventDestination", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :kinesis-firehose-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-destination (input :kinesis-firehose-destination)) #:http.request.field{:name "KinesisFirehoseDestination", :shape "KinesisFirehoseDestination"})) (clojure.core/contains? input :cloud-watch-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-destination (input :cloud-watch-destination)) #:http.request.field{:name "CloudWatchDestination", :shape "CloudWatchDestination"})) (clojure.core/contains? input :sns-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-destination (input :sns-destination)) #:http.request.field{:name "SNSDestination", :shape "SNSDestination"}))))

(clojure.core/defn- ser-tracking-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TrackingOptions", :type "structure"} (clojure.core/contains? input :custom-redirect-domain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-redirect-domain (input :custom-redirect-domain)) #:http.request.field{:name "CustomRedirectDomain", :shape "CustomRedirectDomain"}))))

(clojure.core/defn- ser-dimension-value-source [input] #:http.request.field{:value (clojure.core/get {"messageTag" "messageTag", :message-tag "messageTag", "emailHeader" "emailHeader", :email-header "emailHeader", "linkTag" "linkTag", :link-tag "linkTag"} input), :shape "DimensionValueSource"})

(clojure.core/defn- ser-configuration-set-attribute [input] #:http.request.field{:value (clojure.core/get {"eventDestinations" "eventDestinations", :event-destinations "eventDestinations", "trackingOptions" "trackingOptions", :tracking-options "trackingOptions", "reputationOptions" "reputationOptions", :reputation-options "reputationOptions"} input), :shape "ConfigurationSetAttribute"})

(clojure.core/defn- ser-receipt-rule-name [input] #:http.request.field{:value input, :shape "ReceiptRuleName"})

(clojure.core/defn- ser-bounce-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bounce-smtp-reply-code (:smtp-reply-code input)) #:http.request.field{:name "SmtpReplyCode", :shape "BounceSmtpReplyCode"}) (clojure.core/into (ser-bounce-message (:message input)) #:http.request.field{:name "Message", :shape "BounceMessage"}) (clojure.core/into (ser-address (:sender input)) #:http.request.field{:name "Sender", :shape "Address"})], :shape "BounceAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :status-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bounce-status-code (input :status-code)) #:http.request.field{:name "StatusCode", :shape "BounceStatusCode"}))))

(clojure.core/defn- ser-cidr [input] #:http.request.field{:value input, :shape "Cidr"})

(clojure.core/defn- ser-message-data [input] #:http.request.field{:value input, :shape "MessageData"})

(clojure.core/defn- ser-behavior-on-mx-failure [input] #:http.request.field{:value (clojure.core/get {"UseDefaultValue" "UseDefaultValue", :use-default-value "UseDefaultValue", "RejectMessage" "RejectMessage", :reject-message "RejectMessage"} input), :shape "BehaviorOnMXFailure"})

(clojure.core/defn- ser-dsn-action [input] #:http.request.field{:value (clojure.core/get {"relayed" "relayed", :delayed "delayed", "delayed" "delayed", "failed" "failed", "delivered" "delivered", :delivered "delivered", :relayed "relayed", :expanded "expanded", "expanded" "expanded", :failed "failed"} input), :shape "DsnAction"})

(clojure.core/defn- ser-message-dsn [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-reporting-mta (:reporting-mta input)) #:http.request.field{:name "ReportingMta", :shape "ReportingMta"})], :shape "MessageDsn", :type "structure"} (clojure.core/contains? input :arrival-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arrival-date (input :arrival-date)) #:http.request.field{:name "ArrivalDate", :shape "ArrivalDate"})) (clojure.core/contains? input :extension-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extension-field-list (input :extension-fields)) #:http.request.field{:name "ExtensionFields", :shape "ExtensionFieldList"}))))

(clojure.core/defn- ser-cloud-watch-dimension-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dimension-name (:dimension-name input)) #:http.request.field{:name "DimensionName", :shape "DimensionName"}) (clojure.core/into (ser-dimension-value-source (:dimension-value-source input)) #:http.request.field{:name "DimensionValueSource", :shape "DimensionValueSource"}) (clojure.core/into (ser-default-dimension-value (:default-dimension-value input)) #:http.request.field{:name "DefaultDimensionValue", :shape "DefaultDimensionValue"})], :shape "CloudWatchDimensionConfiguration", :type "structure"}))

(clojure.core/defn- ser-bulk-email-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-destination (:destination input)) #:http.request.field{:name "Destination", :shape "Destination"})], :shape "BulkEmailDestination", :type "structure"} (clojure.core/contains? input :replacement-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :replacement-tags)) #:http.request.field{:name "ReplacementTags", :shape "MessageTagList"})) (clojure.core/contains? input :replacement-template-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-data (input :replacement-template-data)) #:http.request.field{:name "ReplacementTemplateData", :shape "TemplateData"}))))

(clojure.core/defn- ser-template-content [input] #:http.request.field{:value input, :shape "TemplateContent"})

(clojure.core/defn- ser-receipt-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-receipt-filter-name (:name input)) #:http.request.field{:name "Name", :shape "ReceiptFilterName"}) (clojure.core/into (ser-receipt-ip-filter (:ip-filter input)) #:http.request.field{:name "IpFilter", :shape "ReceiptIpFilter"})], :shape "ReceiptFilter", :type "structure"}))

(clojure.core/defn- ser-message-id [input] #:http.request.field{:value input, :shape "MessageId"})

(clojure.core/defn- ser-add-header-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-header-name (:header-name input)) #:http.request.field{:name "HeaderName", :shape "HeaderName"}) (clojure.core/into (ser-header-value (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "HeaderValue"})], :shape "AddHeaderAction", :type "structure"}))

(clojure.core/defn- ser-header-name [input] #:http.request.field{:value input, :shape "HeaderName"})

(clojure.core/defn- ser-extension-field-name [input] #:http.request.field{:value input, :shape "ExtensionFieldName"})

(clojure.core/defn- ser-cloud-watch-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cloud-watch-dimension-configurations (:dimension-configurations input)) #:http.request.field{:name "DimensionConfigurations", :shape "CloudWatchDimensionConfigurations"})], :shape "CloudWatchDestination", :type "structure"}))

(clojure.core/defn- ser-configuration-set [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-set-name (:name input)) #:http.request.field{:name "Name", :shape "ConfigurationSetName"})], :shape "ConfigurationSet", :type "structure"}))

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-identity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-identity coll) #:http.request.field{:shape "Identity"}))) input), :shape "IdentityList", :type "list"})

(clojure.core/defn- ser-receipt-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ReceiptAction", :type "structure"} (clojure.core/contains? input :s-3-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-action (input :s-3-action)) #:http.request.field{:name "S3Action", :shape "S3Action"})) (clojure.core/contains? input :bounce-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bounce-action (input :bounce-action)) #:http.request.field{:name "BounceAction", :shape "BounceAction"})) (clojure.core/contains? input :workmail-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workmail-action (input :workmail-action)) #:http.request.field{:name "WorkmailAction", :shape "WorkmailAction"})) (clojure.core/contains? input :lambda-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-action (input :lambda-action)) #:http.request.field{:name "LambdaAction", :shape "LambdaAction"})) (clojure.core/contains? input :stop-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stop-action (input :stop-action)) #:http.request.field{:name "StopAction", :shape "StopAction"})) (clojure.core/contains? input :add-header-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-header-action (input :add-header-action)) #:http.request.field{:name "AddHeaderAction", :shape "AddHeaderAction"})) (clojure.core/contains? input :sns-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-action (input :sns-action)) #:http.request.field{:name "SNSAction", :shape "SNSAction"}))))

(clojure.core/defn- ser-body [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Body", :type "structure"} (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content (input :text)) #:http.request.field{:name "Text", :shape "Content"})) (clojure.core/contains? input :html) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content (input :html)) #:http.request.field{:name "Html", :shape "Content"}))))

(clojure.core/defn- ser-workmail-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:organization-arn input)) #:http.request.field{:name "OrganizationArn", :shape "AmazonResourceName"})], :shape "WorkmailAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-amazon-resource-name [input] #:http.request.field{:value input, :shape "AmazonResourceName"})

(clojure.core/defn- ser-arrival-date [input] #:http.request.field{:value input, :shape "ArrivalDate"})

(clojure.core/defn- ser-bulk-email-destination-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bulk-email-destination coll) #:http.request.field{:shape "BulkEmailDestination"}))) input), :shape "BulkEmailDestinationList", :type "list"})

(clojure.core/defn- ser-default-dimension-value [input] #:http.request.field{:value input, :shape "DefaultDimensionValue"})

(clojure.core/defn- ser-stop-scope [input] #:http.request.field{:value (clojure.core/get {"RuleSet" "RuleSet", :rule-set "RuleSet"} input), :shape "StopScope"})

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Destination", :type "structure"} (clojure.core/contains? input :to-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :to-addresses)) #:http.request.field{:name "ToAddresses", :shape "AddressList"})) (clojure.core/contains? input :cc-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :cc-addresses)) #:http.request.field{:name "CcAddresses", :shape "AddressList"})) (clojure.core/contains? input :bcc-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :bcc-addresses)) #:http.request.field{:name "BccAddresses", :shape "AddressList"}))))

(clojure.core/defn- ser-s-3-bucket-name [input] #:http.request.field{:value input, :shape "S3BucketName"})

(clojure.core/defn- ser-template [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-template-name (:template-name input)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})], :shape "Template", :type "structure"} (clojure.core/contains? input :subject-part) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subject-part (input :subject-part)) #:http.request.field{:name "SubjectPart", :shape "SubjectPart"})) (clojure.core/contains? input :text-part) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-part (input :text-part)) #:http.request.field{:name "TextPart", :shape "TextPart"})) (clojure.core/contains? input :html-part) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-html-part (input :html-part)) #:http.request.field{:name "HtmlPart", :shape "HtmlPart"}))))

(clojure.core/defn- ser-raw-message-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "RawMessageData"})

(clojure.core/defn- ser-configuration-set-name [input] #:http.request.field{:value input, :shape "ConfigurationSetName"})

(clojure.core/defn- ser-notification-type [input] #:http.request.field{:value (clojure.core/get {"Bounce" "Bounce", :bounce "Bounce", "Complaint" "Complaint", :complaint "Complaint", "Delivery" "Delivery", :delivery "Delivery"} input), :shape "NotificationType"})

(clojure.core/defn- ser-bounce-type [input] #:http.request.field{:value (clojure.core/get {"Undefined" "Undefined", "ExceededQuota" "ExceededQuota", :exceeded-quota "ExceededQuota", "ContentRejected" "ContentRejected", "DoesNotExist" "DoesNotExist", "TemporaryFailure" "TemporaryFailure", "MessageTooLarge" "MessageTooLarge", :undefined "Undefined", :message-too-large "MessageTooLarge", :does-not-exist "DoesNotExist", :temporary-failure "TemporaryFailure", :content-rejected "ContentRejected"} input), :shape "BounceType"})

(clojure.core/defn- ser-bounced-recipient-info [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-address (:recipient input)) #:http.request.field{:name "Recipient", :shape "Address"})], :shape "BouncedRecipientInfo", :type "structure"} (clojure.core/contains? input :recipient-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :recipient-arn)) #:http.request.field{:name "RecipientArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :bounce-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bounce-type (input :bounce-type)) #:http.request.field{:name "BounceType", :shape "BounceType"})) (clojure.core/contains? input :recipient-dsn-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipient-dsn-fields (input :recipient-dsn-fields)) #:http.request.field{:name "RecipientDsnFields", :shape "RecipientDsnFields"}))))

(clojure.core/defn- ser-extension-field-value [input] #:http.request.field{:value input, :shape "ExtensionFieldValue"})

(clojure.core/defn- ser-custom-redirect-domain [input] #:http.request.field{:value input, :shape "CustomRedirectDomain"})

(clojure.core/defn- ser-html-part [input] #:http.request.field{:value input, :shape "HtmlPart"})

(clojure.core/defn- ser-enabled [input] #:http.request.field{:value input, :shape "Enabled"})

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {:open "open", "send" "send", "delivery" "delivery", :complaint "complaint", :delivery "delivery", "click" "click", "renderingFailure" "renderingFailure", :bounce "bounce", :click "click", "complaint" "complaint", "bounce" "bounce", :send "send", :reject "reject", "reject" "reject", "open" "open", :rendering-failure "renderingFailure"} input), :shape "EventType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-dsn-status [input] #:http.request.field{:value input, :shape "DsnStatus"})

(clojure.core/defn- ser-address-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-address coll) #:http.request.field{:shape "Address"}))) input), :shape "AddressList", :type "list"})

(clojure.core/defn- ser-configuration-set-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration-set-attribute coll) #:http.request.field{:shape "ConfigurationSetAttribute"}))) input), :shape "ConfigurationSetAttributeList", :type "list"})

(clojure.core/defn- ser-recipient-dsn-fields [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dsn-action (:action input)) #:http.request.field{:name "Action", :shape "DsnAction"}) (clojure.core/into (ser-dsn-status (:status input)) #:http.request.field{:name "Status", :shape "DsnStatus"})], :shape "RecipientDsnFields", :type "structure"} (clojure.core/contains? input :final-recipient) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :final-recipient)) #:http.request.field{:name "FinalRecipient", :shape "Address"})) (clojure.core/contains? input :remote-mta) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-mta (input :remote-mta)) #:http.request.field{:name "RemoteMta", :shape "RemoteMta"})) (clojure.core/contains? input :diagnostic-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-diagnostic-code (input :diagnostic-code)) #:http.request.field{:name "DiagnosticCode", :shape "DiagnosticCode"})) (clojure.core/contains? input :last-attempt-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-attempt-date (input :last-attempt-date)) #:http.request.field{:name "LastAttemptDate", :shape "LastAttemptDate"})) (clojure.core/contains? input :extension-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extension-field-list (input :extension-fields)) #:http.request.field{:name "ExtensionFields", :shape "ExtensionFieldList"}))))

(clojure.core/defn- ser-header-value [input] #:http.request.field{:value input, :shape "HeaderValue"})

(clojure.core/defn- ser-sns-action-encoding [input] #:http.request.field{:value (clojure.core/get {"UTF-8" "UTF-8", :utf-8 "UTF-8", "Base64" "Base64", :base-64 "Base64"} input), :shape "SNSActionEncoding"})

(clojure.core/defn- ser-domain [input] #:http.request.field{:value input, :shape "Domain"})

(clojure.core/defn- ser-sns-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:topic-arn input)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})], :shape "SNSAction", :type "structure"} (clojure.core/contains? input :encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-action-encoding (input :encoding)) #:http.request.field{:name "Encoding", :shape "SNSActionEncoding"}))))

(clojure.core/defn- ser-message-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-tag-name (:name input)) #:http.request.field{:name "Name", :shape "MessageTagName"}) (clojure.core/into (ser-message-tag-value (:value input)) #:http.request.field{:name "Value", :shape "MessageTagValue"})], :shape "MessageTag", :type "structure"}))

(clojure.core/defn- ser-reporting-mta [input] #:http.request.field{:value input, :shape "ReportingMta"})

(clojure.core/defn- ser-receipt-filter-name [input] #:http.request.field{:value input, :shape "ReceiptFilterName"})

(clojure.core/defn- ser-message-tag-name [input] #:http.request.field{:value input, :shape "MessageTagName"})

(clojure.core/defn- ser-text-part [input] #:http.request.field{:value input, :shape "TextPart"})

(clojure.core/defn- ser-subject [input] #:http.request.field{:value input, :shape "Subject"})

(clojure.core/defn- ser-event-destination-name [input] #:http.request.field{:value input, :shape "EventDestinationName"})

(clojure.core/defn- ser-tls-policy [input] #:http.request.field{:value (clojure.core/get {"Require" "Require", :require "Require", "Optional" "Optional", :optional "Optional"} input), :shape "TlsPolicy"})

(clojure.core/defn- ser-recipient [input] #:http.request.field{:value input, :shape "Recipient"})

(clojure.core/defn- ser-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-content (:subject input)) #:http.request.field{:name "Subject", :shape "Content"}) (clojure.core/into (ser-body (:body input)) #:http.request.field{:name "Body", :shape "Body"})], :shape "Message", :type "structure"}))

(clojure.core/defn- ser-invocation-type [input] #:http.request.field{:value (clojure.core/get {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse"} input), :shape "InvocationType"})

(clojure.core/defn- ser-last-attempt-date [input] #:http.request.field{:value input, :shape "LastAttemptDate"})

(clojure.core/defn- ser-receipt-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-receipt-rule-name (:name input)) #:http.request.field{:name "Name", :shape "ReceiptRuleName"})], :shape "ReceiptRule", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :tls-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tls-policy (input :tls-policy)) #:http.request.field{:name "TlsPolicy", :shape "TlsPolicy"})) (clojure.core/contains? input :recipients) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipients-list (input :recipients)) #:http.request.field{:name "Recipients", :shape "RecipientsList"})) (clojure.core/contains? input :actions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-actions-list (input :actions)) #:http.request.field{:name "Actions", :shape "ReceiptActionsList"})) (clojure.core/contains? input :scan-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :scan-enabled)) #:http.request.field{:name "ScanEnabled", :shape "Enabled"}))))

(clojure.core/defn- ser-message-tag-value [input] #:http.request.field{:value input, :shape "MessageTagValue"})

(clojure.core/defn- ser-content [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-data (:data input)) #:http.request.field{:name "Data", :shape "MessageData"})], :shape "Content", :type "structure"} (clojure.core/contains? input :charset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-charset (input :charset)) #:http.request.field{:name "Charset", :shape "Charset"}))))

(clojure.core/defn- ser-identity-type [input] #:http.request.field{:value (clojure.core/get {"EmailAddress" "EmailAddress", :email-address "EmailAddress", "Domain" "Domain", :domain "Domain"} input), :shape "IdentityType"})

(clojure.core/defn- ser-bounce-message [input] #:http.request.field{:value input, :shape "BounceMessage"})

(clojure.core/defn- ser-explanation [input] #:http.request.field{:value input, :shape "Explanation"})

(clojure.core/defn- ser-extension-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-extension-field coll) #:http.request.field{:shape "ExtensionField"}))) input), :shape "ExtensionFieldList", :type "list"})

(clojure.core/defn- ser-identity [input] #:http.request.field{:value input, :shape "Identity"})

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-s-3-key-prefix [input] #:http.request.field{:value input, :shape "S3KeyPrefix"})

(clojure.core/defn- ser-template-name [input] #:http.request.field{:value input, :shape "TemplateName"})

(clojure.core/defn- ser-kinesis-firehose-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:iam-role-arn input)) #:http.request.field{:name "IAMRoleARN", :shape "AmazonResourceName"}) (clojure.core/into (ser-amazon-resource-name (:delivery-stream-arn input)) #:http.request.field{:name "DeliveryStreamARN", :shape "AmazonResourceName"})], :shape "KinesisFirehoseDestination", :type "structure"}))

(clojure.core/defn- ser-message-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message-tag coll) #:http.request.field{:shape "MessageTag"}))) input), :shape "MessageTagList", :type "list"})

(clojure.core/defn- ser-bounced-recipient-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bounced-recipient-info coll) #:http.request.field{:shape "BouncedRecipientInfo"}))) input), :shape "BouncedRecipientInfoList", :type "list"})

(clojure.core/defn- ser-notification-topic [input] #:http.request.field{:value input, :shape "NotificationTopic"})

(clojure.core/defn- ser-cloud-watch-dimension-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-dimension-configuration coll) #:http.request.field{:shape "CloudWatchDimensionConfiguration"}))) input), :shape "CloudWatchDimensionConfigurations", :type "list"})

(clojure.core/defn- ser-event-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-type coll) #:http.request.field{:shape "EventType"}))) input), :shape "EventTypes", :type "list"})

(clojure.core/defn- ser-from-address [input] #:http.request.field{:value input, :shape "FromAddress"})

(clojure.core/defn- ser-receipt-actions-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-receipt-action coll) #:http.request.field{:shape "ReceiptAction"}))) input), :shape "ReceiptActionsList", :type "list"})

(clojure.core/defn- ser-charset [input] #:http.request.field{:value input, :shape "Charset"})

(clojure.core/defn- ser-success-redirection-url [input] #:http.request.field{:value input, :shape "SuccessRedirectionURL"})

(clojure.core/defn- ser-policy [input] #:http.request.field{:value input, :shape "Policy"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-sns-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:topic-arn input)) #:http.request.field{:name "TopicARN", :shape "AmazonResourceName"})], :shape "SNSDestination", :type "structure"}))

(clojure.core/defn- ser-bounce-status-code [input] #:http.request.field{:value input, :shape "BounceStatusCode"})

(clojure.core/defn- ser-failure-redirection-url [input] #:http.request.field{:value input, :shape "FailureRedirectionURL"})

(clojure.core/defn- ser-raw-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-raw-message-data (:data input)) #:http.request.field{:name "Data", :shape "RawMessageData"})], :shape "RawMessage", :type "structure"}))

(clojure.core/defn- ser-extension-field [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-extension-field-name (:name input)) #:http.request.field{:name "Name", :shape "ExtensionFieldName"}) (clojure.core/into (ser-extension-field-value (:value input)) #:http.request.field{:name "Value", :shape "ExtensionFieldValue"})], :shape "ExtensionField", :type "structure"}))

(clojure.core/defn- ser-receipt-filter-policy [input] #:http.request.field{:value (clojure.core/get {"Block" "Block", :block "Block", "Allow" "Allow", :allow "Allow"} input), :shape "ReceiptFilterPolicy"})

(clojure.core/defn- ser-stop-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-stop-scope (:scope input)) #:http.request.field{:name "Scope", :shape "StopScope"})], :shape "StopAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-template-data [input] #:http.request.field{:value input, :shape "TemplateData"})

(clojure.core/defn- ser-lambda-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-amazon-resource-name (:function-arn input)) #:http.request.field{:name "FunctionArn", :shape "AmazonResourceName"})], :shape "LambdaAction", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :invocation-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-invocation-type (input :invocation-type)) #:http.request.field{:name "InvocationType", :shape "InvocationType"}))))

(clojure.core/defn- ser-receipt-ip-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-receipt-filter-policy (:policy input)) #:http.request.field{:name "Policy", :shape "ReceiptFilterPolicy"}) (clojure.core/into (ser-cidr (:cidr input)) #:http.request.field{:name "Cidr", :shape "Cidr"})], :shape "ReceiptIpFilter", :type "structure"}))

(clojure.core/defn- ser-recipients-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-recipient coll) #:http.request.field{:shape "Recipient"}))) input), :shape "RecipientsList", :type "list"})

(clojure.core/defn- ser-remote-mta [input] #:http.request.field{:value input, :shape "RemoteMta"})

(clojure.core/defn- ser-diagnostic-code [input] #:http.request.field{:value input, :shape "DiagnosticCode"})

(clojure.core/defn- ser-receipt-rule-names-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-receipt-rule-name coll) #:http.request.field{:shape "ReceiptRuleName"}))) input), :shape "ReceiptRuleNamesList", :type "list"})

(clojure.core/defn- ser-s-3-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-bucket-name (:bucket-name input)) #:http.request.field{:name "BucketName", :shape "S3BucketName"})], :shape "S3Action", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :object-key-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :object-key-prefix)) #:http.request.field{:name "ObjectKeyPrefix", :shape "S3KeyPrefix"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :kms-key-arn)) #:http.request.field{:name "KmsKeyArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-policy-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-name coll) #:http.request.field{:shape "PolicyName"}))) input), :shape "PolicyNameList", :type "list"})

(clojure.core/defn- ser-subject-part [input] #:http.request.field{:value input, :shape "SubjectPart"})

(clojure.core/defn- ser-bounce-smtp-reply-code [input] #:http.request.field{:value input, :shape "BounceSmtpReplyCode"})

(clojure.core/defn- ser-receipt-rule-set-name [input] #:http.request.field{:value input, :shape "ReceiptRuleSetName"})

(clojure.core/defn- ser-mail-from-domain-name [input] #:http.request.field{:value input, :shape "MailFromDomainName"})

(clojure.core/defn- req-create-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"}) (clojure.core/into (ser-from-address (input :from-email-address)) #:http.request.field{:name "FromEmailAddress", :shape "FromAddress"}) (clojure.core/into (ser-subject (input :template-subject)) #:http.request.field{:name "TemplateSubject", :shape "Subject"}) (clojure.core/into (ser-template-content (input :template-content)) #:http.request.field{:name "TemplateContent", :shape "TemplateContent"}) (clojure.core/into (ser-success-redirection-url (input :success-redirection-url)) #:http.request.field{:name "SuccessRedirectionURL", :shape "SuccessRedirectionURL"}) (clojure.core/into (ser-failure-redirection-url (input :failure-redirection-url)) #:http.request.field{:name "FailureRedirectionURL", :shape "FailureRedirectionURL"})]}))

(clojure.core/defn- req-update-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]} (clojure.core/contains? input :from-email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-from-address (input :from-email-address)) #:http.request.field{:name "FromEmailAddress", :shape "FromAddress"})) (clojure.core/contains? input :template-subject) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subject (input :template-subject)) #:http.request.field{:name "TemplateSubject", :shape "Subject"})) (clojure.core/contains? input :template-content) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-content (input :template-content)) #:http.request.field{:name "TemplateContent", :shape "TemplateContent"})) (clojure.core/contains? input :success-redirection-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-success-redirection-url (input :success-redirection-url)) #:http.request.field{:name "SuccessRedirectionURL", :shape "SuccessRedirectionURL"})) (clojure.core/contains? input :failure-redirection-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-redirection-url (input :failure-redirection-url)) #:http.request.field{:name "FailureRedirectionURL", :shape "FailureRedirectionURL"}))))

(clojure.core/defn- req-list-receipt-rule-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-send-bulk-templated-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"}) (clojure.core/into (ser-template-name (input :template)) #:http.request.field{:name "Template", :shape "TemplateName"}) (clojure.core/into (ser-bulk-email-destination-list (input :destinations)) #:http.request.field{:name "Destinations", :shape "BulkEmailDestinationList"})]} (clojure.core/contains? input :default-template-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-data (input :default-template-data)) #:http.request.field{:name "DefaultTemplateData", :shape "TemplateData"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :return-path)) #:http.request.field{:name "ReturnPath", :shape "Address"})) (clojure.core/contains? input :template-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :template-arn)) #:http.request.field{:name "TemplateArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :default-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :default-tags)) #:http.request.field{:name "DefaultTags", :shape "MessageTagList"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "AddressList"}))))

(clojure.core/defn- req-send-custom-verification-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"}) (clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]} (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}))))

(clojure.core/defn- req-create-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template (input :template)) #:http.request.field{:name "Template", :shape "Template"})]}))

(clojure.core/defn- req-set-identity-mail-from-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"})]} (clojure.core/contains? input :mail-from-domain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mail-from-domain-name (input :mail-from-domain)) #:http.request.field{:name "MailFromDomain", :shape "MailFromDomainName"})) (clojure.core/contains? input :behavior-on-mx-failure) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-behavior-on-mx-failure (input :behavior-on-mx-failure)) #:http.request.field{:name "BehaviorOnMXFailure", :shape "BehaviorOnMXFailure"}))))

(clojure.core/defn- req-put-identity-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"}) (clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})]}))

(clojure.core/defn- req-delete-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-describe-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "ReceiptRuleName"})]}))

(clojure.core/defn- req-get-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-create-receipt-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-filter (input :filter)) #:http.request.field{:name "Filter", :shape "ReceiptFilter"})]}))

(clojure.core/defn- req-list-identity-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"})]}))

(clojure.core/defn- req-get-identity-notification-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-verify-email-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"})]}))

(clojure.core/defn- req-set-identity-headers-in-notifications-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-notification-type (input :notification-type)) #:http.request.field{:name "NotificationType", :shape "NotificationType"}) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})]}))

(clojure.core/defn- req-create-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-tracking-options (input :tracking-options)) #:http.request.field{:name "TrackingOptions", :shape "TrackingOptions"})]}))

(clojure.core/defn- req-send-templated-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"}) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "Destination", :shape "Destination"}) (clojure.core/into (ser-template-name (input :template)) #:http.request.field{:name "Template", :shape "TemplateName"}) (clojure.core/into (ser-template-data (input :template-data)) #:http.request.field{:name "TemplateData", :shape "TemplateData"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :return-path)) #:http.request.field{:name "ReturnPath", :shape "Address"})) (clojure.core/contains? input :template-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :template-arn)) #:http.request.field{:name "TemplateArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "AddressList"}))))

(clojure.core/defn- req-send-raw-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-raw-message (input :raw-message)) #:http.request.field{:name "RawMessage", :shape "RawMessage"})]} (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"})) (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :destinations)) #:http.request.field{:name "Destinations", :shape "AddressList"})) (clojure.core/contains? input :from-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :from-arn)) #:http.request.field{:name "FromArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}))))

(clojure.core/defn- req-update-configuration-set-sending-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})]}))

(clojure.core/defn- req-set-identity-feedback-forwarding-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-enabled (input :forwarding-enabled)) #:http.request.field{:name "ForwardingEnabled", :shape "Enabled"})]}))

(clojure.core/defn- req-delete-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-event-destination-name (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "EventDestinationName"})]}))

(clojure.core/defn- req-list-receipt-filters-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-identity-verification-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-describe-active-receipt-rule-set-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})]} (clojure.core/contains? input :configuration-set-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-attribute-list (input :configuration-set-attribute-names)) #:http.request.field{:name "ConfigurationSetAttributeNames", :shape "ConfigurationSetAttributeList"}))))

(clojure.core/defn- req-update-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template (input :template)) #:http.request.field{:name "Template", :shape "Template"})]}))

(clojure.core/defn- req-describe-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-get-identity-dkim-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-delete-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})]}))

(clojure.core/defn- req-update-account-sending-enabled-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"}))))

(clojure.core/defn- req-list-custom-verification-email-templates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule (input :rule)) #:http.request.field{:name "Rule", :shape "ReceiptRule"})]} (clojure.core/contains? input :after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-rule-name (input :after)) #:http.request.field{:name "After", :shape "ReceiptRuleName"}))))

(clojure.core/defn- req-list-configuration-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-set-receipt-rule-position-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "ReceiptRuleName"})]} (clojure.core/contains? input :after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-rule-name (input :after)) #:http.request.field{:name "After", :shape "ReceiptRuleName"}))))

(clojure.core/defn- req-delete-receipt-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-filter-name (input :filter-name)) #:http.request.field{:name "FilterName", :shape "ReceiptFilterName"})]}))

(clojure.core/defn- req-verify-email-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"})]}))

(clojure.core/defn- req-verify-domain-dkim-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain (input :domain)) #:http.request.field{:name "Domain", :shape "Domain"})]}))

(clojure.core/defn- req-verify-domain-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain (input :domain)) #:http.request.field{:name "Domain", :shape "Domain"})]}))

(clojure.core/defn- req-create-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set (input :configuration-set)) #:http.request.field{:name "ConfigurationSet", :shape "ConfigurationSet"})]}))

(clojure.core/defn- req-delete-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-set-identity-notification-topic-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-notification-type (input :notification-type)) #:http.request.field{:name "NotificationType", :shape "NotificationType"})]} (clojure.core/contains? input :sns-topic) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-topic (input :sns-topic)) #:http.request.field{:name "SnsTopic", :shape "NotificationTopic"}))))

(clojure.core/defn- req-delete-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-update-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-event-destination (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestination"})]}))

(clojure.core/defn- req-create-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-event-destination (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestination"})]}))

(clojure.core/defn- req-get-custom-verification-email-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"})]}))

(clojure.core/defn- req-get-identity-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-policy-name-list (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNameList"})]}))

(clojure.core/defn- req-reorder-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-names-list (input :rule-names)) #:http.request.field{:name "RuleNames", :shape "ReceiptRuleNamesList"})]}))

(clojure.core/defn- req-clone-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-set-name (input :original-rule-set-name)) #:http.request.field{:name "OriginalRuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-delete-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"})]}))

(clojure.core/defn- req-delete-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "ReceiptRuleName"})]}))

(clojure.core/defn- req-delete-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})]}))

(clojure.core/defn- req-update-receipt-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}) (clojure.core/into (ser-receipt-rule (input :rule)) #:http.request.field{:name "Rule", :shape "ReceiptRule"})]}))

(clojure.core/defn- req-create-receipt-rule-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"})]}))

(clojure.core/defn- req-send-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :source)) #:http.request.field{:name "Source", :shape "Address"}) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "Destination", :shape "Destination"}) (clojure.core/into (ser-message (input :message)) #:http.request.field{:name "Message", :shape "Message"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "MessageTagList"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :return-path-arn)) #:http.request.field{:name "ReturnPathArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :return-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address (input :return-path)) #:http.request.field{:name "ReturnPath", :shape "Address"})) (clojure.core/contains? input :reply-to-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-list (input :reply-to-addresses)) #:http.request.field{:name "ReplyToAddresses", :shape "AddressList"}))))

(clojure.core/defn- req-list-templates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-update-configuration-set-tracking-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-tracking-options (input :tracking-options)) #:http.request.field{:name "TrackingOptions", :shape "TrackingOptions"})]}))

(clojure.core/defn- req-delete-identity-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"})]}))

(clojure.core/defn- req-delete-verified-email-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "Address"})]}))

(clojure.core/defn- req-test-render-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "TemplateName"}) (clojure.core/into (ser-template-data (input :template-data)) #:http.request.field{:name "TemplateData", :shape "TemplateData"})]}))

(clojure.core/defn- req-set-active-receipt-rule-set-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :rule-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-receipt-rule-set-name (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "ReceiptRuleSetName"}))))

(clojure.core/defn- req-update-configuration-set-reputation-metrics-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-set-name (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "ConfigurationSetName"}) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})]}))

(clojure.core/defn- req-list-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :identity-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-type (input :identity-type)) #:http.request.field{:name "IdentityType", :shape "IdentityType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-set-identity-dkim-enabled-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "Identity", :shape "Identity"}) (clojure.core/into (ser-enabled (input :dkim-enabled)) #:http.request.field{:name "DkimEnabled", :shape "Enabled"})]}))

(clojure.core/defn- req-get-identity-mail-from-domain-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-list (input :identities)) #:http.request.field{:name "Identities", :shape "IdentityList"})]}))

(clojure.core/defn- req-send-bounce-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-message-id (input :original-message-id)) #:http.request.field{:name "OriginalMessageId", :shape "MessageId"}) (clojure.core/into (ser-address (input :bounce-sender)) #:http.request.field{:name "BounceSender", :shape "Address"}) (clojure.core/into (ser-bounced-recipient-info-list (input :bounced-recipient-info-list)) #:http.request.field{:name "BouncedRecipientInfoList", :shape "BouncedRecipientInfoList"})]} (clojure.core/contains? input :explanation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-explanation (input :explanation)) #:http.request.field{:name "Explanation", :shape "Explanation"})) (clojure.core/contains? input :message-dsn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-dsn (input :message-dsn)) #:http.request.field{:name "MessageDsn", :shape "MessageDsn"})) (clojure.core/contains? input :bounce-sender-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :bounce-sender-arn)) #:http.request.field{:name "BounceSenderArn", :shape "AmazonResourceName"}))))

(clojure.core/declare deser-counter)

(clojure.core/declare deser-dimension-name)

(clojure.core/declare deser-address)

(clojure.core/declare deser-send-data-point)

(clojure.core/declare deser-event-destination)

(clojure.core/declare deser-sent-last-24-hours)

(clojure.core/declare deser-tracking-options)

(clojure.core/declare deser-dimension-value-source)

(clojure.core/declare deser-receipt-rule-name)

(clojure.core/declare deser-bounce-action)

(clojure.core/declare deser-cidr)

(clojure.core/declare deser-behavior-on-mx-failure)

(clojure.core/declare deser-cloud-watch-dimension-configuration)

(clojure.core/declare deser-template-content)

(clojure.core/declare deser-receipt-filter)

(clojure.core/declare deser-max-send-rate)

(clojure.core/declare deser-message-id)

(clojure.core/declare deser-add-header-action)

(clojure.core/declare deser-policy-map)

(clojure.core/declare deser-header-name)

(clojure.core/declare deser-cloud-watch-destination)

(clojure.core/declare deser-configuration-set)

(clojure.core/declare deser-policy-name)

(clojure.core/declare deser-identity-list)

(clojure.core/declare deser-receipt-action)

(clojure.core/declare deser-workmail-action)

(clojure.core/declare deser-amazon-resource-name)

(clojure.core/declare deser-identity-dkim-attributes)

(clojure.core/declare deser-template-metadata-list)

(clojure.core/declare deser-rendered-template)

(clojure.core/declare deser-default-dimension-value)

(clojure.core/declare deser-stop-scope)

(clojure.core/declare deser-verification-attributes)

(clojure.core/declare deser-s-3-bucket-name)

(clojure.core/declare deser-template)

(clojure.core/declare deser-template-metadata)

(clojure.core/declare deser-configuration-set-name)

(clojure.core/declare deser-notification-attributes)

(clojure.core/declare deser-configuration-sets)

(clojure.core/declare deser-verification-token)

(clojure.core/declare deser-receipt-rule-sets-lists)

(clojure.core/declare deser-custom-redirect-domain)

(clojure.core/declare deser-html-part)

(clojure.core/declare deser-enabled)

(clojure.core/declare deser-dkim-attributes)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-send-data-point-list)

(clojure.core/declare deser-address-list)

(clojure.core/declare deser-header-value)

(clojure.core/declare deser-sns-action-encoding)

(clojure.core/declare deser-custom-verification-email-templates)

(clojure.core/declare deser-sns-action)

(clojure.core/declare deser-identity-verification-attributes)

(clojure.core/declare deser-identity-mail-from-domain-attributes)

(clojure.core/declare deser-receipt-filter-name)

(clojure.core/declare deser-bulk-email-destination-status)

(clojure.core/declare deser-last-fresh-start)

(clojure.core/declare deser-text-part)

(clojure.core/declare deser-subject)

(clojure.core/declare deser-event-destination-name)

(clojure.core/declare deser-tls-policy)

(clojure.core/declare deser-recipient)

(clojure.core/declare deser-invocation-type)

(clojure.core/declare deser-mail-from-domain-attributes)

(clojure.core/declare deser-receipt-rule)

(clojure.core/declare deser-custom-verification-email-template)

(clojure.core/declare deser-reputation-options)

(clojure.core/declare deser-bounce-message)

(clojure.core/declare deser-identity)

(clojure.core/declare deser-s-3-key-prefix)

(clojure.core/declare deser-template-name)

(clojure.core/declare deser-kinesis-firehose-destination)

(clojure.core/declare deser-verification-status)

(clojure.core/declare deser-notification-topic)

(clojure.core/declare deser-cloud-watch-dimension-configurations)

(clojure.core/declare deser-event-types)

(clojure.core/declare deser-bulk-email-status)

(clojure.core/declare deser-from-address)

(clojure.core/declare deser-receipt-actions-list)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-identity-notification-attributes)

(clojure.core/declare deser-success-redirection-url)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-receipt-rule-set-metadata)

(clojure.core/declare deser-error)

(clojure.core/declare deser-sns-destination)

(clojure.core/declare deser-receipt-rules-list)

(clojure.core/declare deser-bounce-status-code)

(clojure.core/declare deser-event-destinations)

(clojure.core/declare deser-failure-redirection-url)

(clojure.core/declare deser-receipt-filter-policy)

(clojure.core/declare deser-stop-action)

(clojure.core/declare deser-receipt-filter-list)

(clojure.core/declare deser-lambda-action)

(clojure.core/declare deser-receipt-ip-filter)

(clojure.core/declare deser-recipients-list)

(clojure.core/declare deser-bulk-email-destination-status-list)

(clojure.core/declare deser-custom-mail-from-status)

(clojure.core/declare deser-s-3-action)

(clojure.core/declare deser-max-24-hour-send)

(clojure.core/declare deser-policy-name-list)

(clojure.core/declare deser-rule-or-rule-set-name)

(clojure.core/declare deser-verification-token-list)

(clojure.core/declare deser-subject-part)

(clojure.core/declare deser-bounce-smtp-reply-code)

(clojure.core/declare deser-receipt-rule-set-name)

(clojure.core/declare deser-mail-from-domain-name)

(clojure.core/defn- deser-counter [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dimension-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-address [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-send-data-point [input] (clojure.core/let [letvar933766 {"Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "DeliveryAttempts" (portkey.aws/search-for-tag input "DeliveryAttempts" :flattened? nil :xmlAttribute? nil), "Bounces" (portkey.aws/search-for-tag input "Bounces" :flattened? nil :xmlAttribute? nil), "Complaints" (portkey.aws/search-for-tag input "Complaints" :flattened? nil :xmlAttribute? nil), "Rejects" (portkey.aws/search-for-tag input "Rejects" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar933766 "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (clojure.core/get-in letvar933766 ["Timestamp" :content]))) (letvar933766 "DeliveryAttempts") (clojure.core/assoc :delivery-attempts (deser-counter (clojure.core/get-in letvar933766 ["DeliveryAttempts" :content]))) (letvar933766 "Bounces") (clojure.core/assoc :bounces (deser-counter (clojure.core/get-in letvar933766 ["Bounces" :content]))) (letvar933766 "Complaints") (clojure.core/assoc :complaints (deser-counter (clojure.core/get-in letvar933766 ["Complaints" :content]))) (letvar933766 "Rejects") (clojure.core/assoc :rejects (deser-counter (clojure.core/get-in letvar933766 ["Rejects" :content]))))))

(clojure.core/defn- deser-event-destination [input] (clojure.core/let [letvar933874 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "MatchingEventTypes" (portkey.aws/search-for-tag input "MatchingEventTypes" :flattened? nil :xmlAttribute? nil), "KinesisFirehoseDestination" (portkey.aws/search-for-tag input "KinesisFirehoseDestination" :flattened? nil :xmlAttribute? nil), "CloudWatchDestination" (portkey.aws/search-for-tag input "CloudWatchDestination" :flattened? nil :xmlAttribute? nil), "SNSDestination" (portkey.aws/search-for-tag input "SNSDestination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-event-destination-name (clojure.core/get-in letvar933874 ["Name" :content])), :matching-event-types (deser-event-types (clojure.core/get-in letvar933874 ["MatchingEventTypes" :content]))} (letvar933874 "Enabled") (clojure.core/assoc :enabled (deser-enabled (clojure.core/get-in letvar933874 ["Enabled" :content]))) (letvar933874 "KinesisFirehoseDestination") (clojure.core/assoc :kinesis-firehose-destination (deser-kinesis-firehose-destination (clojure.core/get-in letvar933874 ["KinesisFirehoseDestination" :content]))) (letvar933874 "CloudWatchDestination") (clojure.core/assoc :cloud-watch-destination (deser-cloud-watch-destination (clojure.core/get-in letvar933874 ["CloudWatchDestination" :content]))) (letvar933874 "SNSDestination") (clojure.core/assoc :sns-destination (deser-sns-destination (clojure.core/get-in letvar933874 ["SNSDestination" :content]))))))

(clojure.core/defn- deser-sent-last-24-hours [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-tracking-options [input] (clojure.core/let [letvar933984 {"CustomRedirectDomain" (portkey.aws/search-for-tag input "CustomRedirectDomain" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar933984 "CustomRedirectDomain") (clojure.core/assoc :custom-redirect-domain (deser-custom-redirect-domain (clojure.core/get-in letvar933984 ["CustomRedirectDomain" :content]))))))

(clojure.core/defn- deser-dimension-value-source [input] (clojure.core/get {"messageTag" :message-tag, "emailHeader" :email-header, "linkTag" :link-tag} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-receipt-rule-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bounce-action [input] (clojure.core/let [letvar934102 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil), "SmtpReplyCode" (portkey.aws/search-for-tag input "SmtpReplyCode" :flattened? nil :xmlAttribute? nil), "StatusCode" (portkey.aws/search-for-tag input "StatusCode" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "Sender" (portkey.aws/search-for-tag input "Sender" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:smtp-reply-code (deser-bounce-smtp-reply-code (clojure.core/get-in letvar934102 ["SmtpReplyCode" :content])), :message (deser-bounce-message (clojure.core/get-in letvar934102 ["Message" :content])), :sender (deser-address (clojure.core/get-in letvar934102 ["Sender" :content]))} (letvar934102 "TopicArn") (clojure.core/assoc :topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar934102 ["TopicArn" :content]))) (letvar934102 "StatusCode") (clojure.core/assoc :status-code (deser-bounce-status-code (clojure.core/get-in letvar934102 ["StatusCode" :content]))))))

(clojure.core/defn- deser-cidr [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-behavior-on-mx-failure [input] (clojure.core/get {"UseDefaultValue" :use-default-value, "RejectMessage" :reject-message} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-watch-dimension-configuration [input] (clojure.core/let [letvar934220 {"DimensionName" (portkey.aws/search-for-tag input "DimensionName" :flattened? nil :xmlAttribute? nil), "DimensionValueSource" (portkey.aws/search-for-tag input "DimensionValueSource" :flattened? nil :xmlAttribute? nil), "DefaultDimensionValue" (portkey.aws/search-for-tag input "DefaultDimensionValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:dimension-name (deser-dimension-name (clojure.core/get-in letvar934220 ["DimensionName" :content])), :dimension-value-source (deser-dimension-value-source (clojure.core/get-in letvar934220 ["DimensionValueSource" :content])), :default-dimension-value (deser-default-dimension-value (clojure.core/get-in letvar934220 ["DefaultDimensionValue" :content]))})))

(clojure.core/defn- deser-template-content [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-receipt-filter [input] (clojure.core/let [letvar934333 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "IpFilter" (portkey.aws/search-for-tag input "IpFilter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-receipt-filter-name (clojure.core/get-in letvar934333 ["Name" :content])), :ip-filter (deser-receipt-ip-filter (clojure.core/get-in letvar934333 ["IpFilter" :content]))})))

(clojure.core/defn- deser-max-send-rate [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-message-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-add-header-action [input] (clojure.core/let [letvar934448 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? nil :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deser-header-name (clojure.core/get-in letvar934448 ["HeaderName" :content])), :header-value (deser-header-value (clojure.core/get-in letvar934448 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-policy-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-policy-name k) (deser-policy v)]))) input)))

(clojure.core/defn- deser-header-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cloud-watch-destination [input] (clojure.core/let [letvar934584 {"DimensionConfigurations" (portkey.aws/search-for-tag input "DimensionConfigurations" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:dimension-configurations (deser-cloud-watch-dimension-configurations (clojure.core/get-in letvar934584 ["DimensionConfigurations" :content]))})))

(clojure.core/defn- deser-configuration-set [input] (clojure.core/let [letvar934692 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-configuration-set-name (clojure.core/get-in letvar934692 ["Name" :content]))})))

(clojure.core/defn- deser-policy-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-identity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-identity coll))) input))

(clojure.core/defn- deser-receipt-action [input] (clojure.core/let [letvar934822 {"S3Action" (portkey.aws/search-for-tag input "S3Action" :flattened? nil :xmlAttribute? nil), "BounceAction" (portkey.aws/search-for-tag input "BounceAction" :flattened? nil :xmlAttribute? nil), "WorkmailAction" (portkey.aws/search-for-tag input "WorkmailAction" :flattened? nil :xmlAttribute? nil), "LambdaAction" (portkey.aws/search-for-tag input "LambdaAction" :flattened? nil :xmlAttribute? nil), "StopAction" (portkey.aws/search-for-tag input "StopAction" :flattened? nil :xmlAttribute? nil), "AddHeaderAction" (portkey.aws/search-for-tag input "AddHeaderAction" :flattened? nil :xmlAttribute? nil), "SNSAction" (portkey.aws/search-for-tag input "SNSAction" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar934822 "S3Action") (clojure.core/assoc :s-3-action (deser-s-3-action (clojure.core/get-in letvar934822 ["S3Action" :content]))) (letvar934822 "BounceAction") (clojure.core/assoc :bounce-action (deser-bounce-action (clojure.core/get-in letvar934822 ["BounceAction" :content]))) (letvar934822 "WorkmailAction") (clojure.core/assoc :workmail-action (deser-workmail-action (clojure.core/get-in letvar934822 ["WorkmailAction" :content]))) (letvar934822 "LambdaAction") (clojure.core/assoc :lambda-action (deser-lambda-action (clojure.core/get-in letvar934822 ["LambdaAction" :content]))) (letvar934822 "StopAction") (clojure.core/assoc :stop-action (deser-stop-action (clojure.core/get-in letvar934822 ["StopAction" :content]))) (letvar934822 "AddHeaderAction") (clojure.core/assoc :add-header-action (deser-add-header-action (clojure.core/get-in letvar934822 ["AddHeaderAction" :content]))) (letvar934822 "SNSAction") (clojure.core/assoc :sns-action (deser-sns-action (clojure.core/get-in letvar934822 ["SNSAction" :content]))))))

(clojure.core/defn- deser-workmail-action [input] (clojure.core/let [letvar934930 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil), "OrganizationArn" (portkey.aws/search-for-tag input "OrganizationArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:organization-arn (deser-amazon-resource-name (clojure.core/get-in letvar934930 ["OrganizationArn" :content]))} (letvar934930 "TopicArn") (clojure.core/assoc :topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar934930 ["TopicArn" :content]))))))

(clojure.core/defn- deser-amazon-resource-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-identity-dkim-attributes [input] (clojure.core/let [letvar935043 {"DkimEnabled" (portkey.aws/search-for-tag input "DkimEnabled" :flattened? nil :xmlAttribute? nil), "DkimVerificationStatus" (portkey.aws/search-for-tag input "DkimVerificationStatus" :flattened? nil :xmlAttribute? nil), "DkimTokens" (portkey.aws/search-for-tag input "DkimTokens" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:dkim-enabled (deser-enabled (clojure.core/get-in letvar935043 ["DkimEnabled" :content])), :dkim-verification-status (deser-verification-status (clojure.core/get-in letvar935043 ["DkimVerificationStatus" :content]))} (letvar935043 "DkimTokens") (clojure.core/assoc :dkim-tokens (deser-verification-token-list (clojure.core/get-in letvar935043 ["DkimTokens" :content]))))))

(clojure.core/defn- deser-template-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-template-metadata coll))) input))

(clojure.core/defn- deser-rendered-template [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-default-dimension-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stop-scope [input] (clojure.core/get {"RuleSet" :rule-set} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-verification-attributes [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-identity k) (deser-identity-verification-attributes v)]))) input)))

(clojure.core/defn- deser-s-3-bucket-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-template [input] (clojure.core/let [letvar935211 {"TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "SubjectPart" (portkey.aws/search-for-tag input "SubjectPart" :flattened? nil :xmlAttribute? nil), "TextPart" (portkey.aws/search-for-tag input "TextPart" :flattened? nil :xmlAttribute? nil), "HtmlPart" (portkey.aws/search-for-tag input "HtmlPart" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:template-name (deser-template-name (clojure.core/get-in letvar935211 ["TemplateName" :content]))} (letvar935211 "SubjectPart") (clojure.core/assoc :subject-part (deser-subject-part (clojure.core/get-in letvar935211 ["SubjectPart" :content]))) (letvar935211 "TextPart") (clojure.core/assoc :text-part (deser-text-part (clojure.core/get-in letvar935211 ["TextPart" :content]))) (letvar935211 "HtmlPart") (clojure.core/assoc :html-part (deser-html-part (clojure.core/get-in letvar935211 ["HtmlPart" :content]))))))

(clojure.core/defn- deser-template-metadata [input] (clojure.core/let [letvar935319 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CreatedTimestamp" (portkey.aws/search-for-tag input "CreatedTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar935319 "Name") (clojure.core/assoc :name (deser-template-name (clojure.core/get-in letvar935319 ["Name" :content]))) (letvar935319 "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp (clojure.core/get-in letvar935319 ["CreatedTimestamp" :content]))))))

(clojure.core/defn- deser-configuration-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-notification-attributes [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-identity k) (deser-identity-notification-attributes v)]))) input)))

(clojure.core/defn- deser-configuration-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-set coll))) input))

(clojure.core/defn- deser-verification-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-receipt-rule-sets-lists [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-receipt-rule-set-metadata coll))) input))

(clojure.core/defn- deser-custom-redirect-domain [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-html-part [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-dkim-attributes [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-identity k) (deser-identity-dkim-attributes v)]))) input)))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"send" :send, "reject" :reject, "bounce" :bounce, "complaint" :complaint, "delivery" :delivery, "open" :open, "click" :click, "renderingFailure" :rendering-failure} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-send-data-point-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-send-data-point coll))) input))

(clojure.core/defn- deser-address-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-address coll))) input))

(clojure.core/defn- deser-header-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-sns-action-encoding [input] (clojure.core/get {"UTF-8" :utf-8, "Base64" :base-64} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-verification-email-templates [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-verification-email-template coll))) input))

(clojure.core/defn- deser-sns-action [input] (clojure.core/let [letvar935600 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil), "Encoding" (portkey.aws/search-for-tag input "Encoding" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar935600 ["TopicArn" :content]))} (letvar935600 "Encoding") (clojure.core/assoc :encoding (deser-sns-action-encoding (clojure.core/get-in letvar935600 ["Encoding" :content]))))))

(clojure.core/defn- deser-identity-verification-attributes [input] (clojure.core/let [letvar935708 {"VerificationStatus" (portkey.aws/search-for-tag input "VerificationStatus" :flattened? nil :xmlAttribute? nil), "VerificationToken" (portkey.aws/search-for-tag input "VerificationToken" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:verification-status (deser-verification-status (clojure.core/get-in letvar935708 ["VerificationStatus" :content]))} (letvar935708 "VerificationToken") (clojure.core/assoc :verification-token (deser-verification-token (clojure.core/get-in letvar935708 ["VerificationToken" :content]))))))

(clojure.core/defn- deser-identity-mail-from-domain-attributes [input] (clojure.core/let [letvar935816 {"MailFromDomain" (portkey.aws/search-for-tag input "MailFromDomain" :flattened? nil :xmlAttribute? nil), "MailFromDomainStatus" (portkey.aws/search-for-tag input "MailFromDomainStatus" :flattened? nil :xmlAttribute? nil), "BehaviorOnMXFailure" (portkey.aws/search-for-tag input "BehaviorOnMXFailure" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:mail-from-domain (deser-mail-from-domain-name (clojure.core/get-in letvar935816 ["MailFromDomain" :content])), :mail-from-domain-status (deser-custom-mail-from-status (clojure.core/get-in letvar935816 ["MailFromDomainStatus" :content])), :behavior-on-mx-failure (deser-behavior-on-mx-failure (clojure.core/get-in letvar935816 ["BehaviorOnMXFailure" :content]))})))

(clojure.core/defn- deser-receipt-filter-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bulk-email-destination-status [input] (clojure.core/let [letvar935929 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Error" (portkey.aws/search-for-tag input "Error" :flattened? nil :xmlAttribute? nil), "MessageId" (portkey.aws/search-for-tag input "MessageId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar935929 "Status") (clojure.core/assoc :status (deser-bulk-email-status (clojure.core/get-in letvar935929 ["Status" :content]))) (letvar935929 "Error") (clojure.core/assoc :error (deser-error (clojure.core/get-in letvar935929 ["Error" :content]))) (letvar935929 "MessageId") (clojure.core/assoc :message-id (deser-message-id (clojure.core/get-in letvar935929 ["MessageId" :content]))))))

(clojure.core/defn- deser-last-fresh-start [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-text-part [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-subject [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-destination-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tls-policy [input] (clojure.core/get {"Require" :require, "Optional" :optional} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-recipient [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-invocation-type [input] (clojure.core/get {"Event" :event, "RequestResponse" :request-response} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-mail-from-domain-attributes [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-identity k) (deser-identity-mail-from-domain-attributes v)]))) input)))

(clojure.core/defn- deser-receipt-rule [input] (clojure.core/let [letvar936092 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "TlsPolicy" (portkey.aws/search-for-tag input "TlsPolicy" :flattened? nil :xmlAttribute? nil), "Recipients" (portkey.aws/search-for-tag input "Recipients" :flattened? nil :xmlAttribute? nil), "Actions" (portkey.aws/search-for-tag input "Actions" :flattened? nil :xmlAttribute? nil), "ScanEnabled" (portkey.aws/search-for-tag input "ScanEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-receipt-rule-name (clojure.core/get-in letvar936092 ["Name" :content]))} (letvar936092 "Enabled") (clojure.core/assoc :enabled (deser-enabled (clojure.core/get-in letvar936092 ["Enabled" :content]))) (letvar936092 "TlsPolicy") (clojure.core/assoc :tls-policy (deser-tls-policy (clojure.core/get-in letvar936092 ["TlsPolicy" :content]))) (letvar936092 "Recipients") (clojure.core/assoc :recipients (deser-recipients-list (clojure.core/get-in letvar936092 ["Recipients" :content]))) (letvar936092 "Actions") (clojure.core/assoc :actions (deser-receipt-actions-list (clojure.core/get-in letvar936092 ["Actions" :content]))) (letvar936092 "ScanEnabled") (clojure.core/assoc :scan-enabled (deser-enabled (clojure.core/get-in letvar936092 ["ScanEnabled" :content]))))))

(clojure.core/defn- deser-custom-verification-email-template [input] (clojure.core/let [letvar936200 {"TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "FromEmailAddress" (portkey.aws/search-for-tag input "FromEmailAddress" :flattened? nil :xmlAttribute? nil), "TemplateSubject" (portkey.aws/search-for-tag input "TemplateSubject" :flattened? nil :xmlAttribute? nil), "SuccessRedirectionURL" (portkey.aws/search-for-tag input "SuccessRedirectionURL" :flattened? nil :xmlAttribute? nil), "FailureRedirectionURL" (portkey.aws/search-for-tag input "FailureRedirectionURL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar936200 "TemplateName") (clojure.core/assoc :template-name (deser-template-name (clojure.core/get-in letvar936200 ["TemplateName" :content]))) (letvar936200 "FromEmailAddress") (clojure.core/assoc :from-email-address (deser-from-address (clojure.core/get-in letvar936200 ["FromEmailAddress" :content]))) (letvar936200 "TemplateSubject") (clojure.core/assoc :template-subject (deser-subject (clojure.core/get-in letvar936200 ["TemplateSubject" :content]))) (letvar936200 "SuccessRedirectionURL") (clojure.core/assoc :success-redirection-url (deser-success-redirection-url (clojure.core/get-in letvar936200 ["SuccessRedirectionURL" :content]))) (letvar936200 "FailureRedirectionURL") (clojure.core/assoc :failure-redirection-url (deser-failure-redirection-url (clojure.core/get-in letvar936200 ["FailureRedirectionURL" :content]))))))

(clojure.core/defn- deser-reputation-options [input] (clojure.core/let [letvar936308 {"SendingEnabled" (portkey.aws/search-for-tag input "SendingEnabled" :flattened? nil :xmlAttribute? nil), "ReputationMetricsEnabled" (portkey.aws/search-for-tag input "ReputationMetricsEnabled" :flattened? nil :xmlAttribute? nil), "LastFreshStart" (portkey.aws/search-for-tag input "LastFreshStart" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar936308 "SendingEnabled") (clojure.core/assoc :sending-enabled (deser-enabled (clojure.core/get-in letvar936308 ["SendingEnabled" :content]))) (letvar936308 "ReputationMetricsEnabled") (clojure.core/assoc :reputation-metrics-enabled (deser-enabled (clojure.core/get-in letvar936308 ["ReputationMetricsEnabled" :content]))) (letvar936308 "LastFreshStart") (clojure.core/assoc :last-fresh-start (deser-last-fresh-start (clojure.core/get-in letvar936308 ["LastFreshStart" :content]))))))

(clojure.core/defn- deser-bounce-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-identity [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-s-3-key-prefix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-template-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-kinesis-firehose-destination [input] (clojure.core/let [letvar936436 {"IAMRoleARN" (portkey.aws/search-for-tag input "IAMRoleARN" :flattened? nil :xmlAttribute? nil), "DeliveryStreamARN" (portkey.aws/search-for-tag input "DeliveryStreamARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:iam-role-arn (deser-amazon-resource-name (clojure.core/get-in letvar936436 ["IAMRoleARN" :content])), :delivery-stream-arn (deser-amazon-resource-name (clojure.core/get-in letvar936436 ["DeliveryStreamARN" :content]))})))

(clojure.core/defn- deser-verification-status [input] (clojure.core/get {"Pending" :pending, "Success" :success, "Failed" :failed, "TemporaryFailure" :temporary-failure, "NotStarted" :not-started} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-notification-topic [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cloud-watch-dimension-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-watch-dimension-configuration coll))) input))

(clojure.core/defn- deser-event-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-type coll))) input))

(clojure.core/defn- deser-bulk-email-status [input] (clojure.core/get {"ConfigurationSetDoesNotExist" :configuration-set-does-not-exist, "Failed" :failed, "AccountThrottled" :account-throttled, "InvalidParameterValue" :invalid-parameter-value, "ConfigurationSetSendingPaused" :configuration-set-sending-paused, "InvalidSendingPoolName" :invalid-sending-pool-name, "AccountSuspended" :account-suspended, "MessageRejected" :message-rejected, "AccountSendingPaused" :account-sending-paused, "AccountDailyQuotaExceeded" :account-daily-quota-exceeded, "Success" :success, "MailFromDomainNotVerified" :mail-from-domain-not-verified, "TransientFailure" :transient-failure, "TemplateDoesNotExist" :template-does-not-exist} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-from-address [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-receipt-actions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-receipt-action coll))) input))

(clojure.core/defn- deser-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-identity-notification-attributes [input] (clojure.core/let [letvar936617 {"BounceTopic" (portkey.aws/search-for-tag input "BounceTopic" :flattened? nil :xmlAttribute? nil), "ComplaintTopic" (portkey.aws/search-for-tag input "ComplaintTopic" :flattened? nil :xmlAttribute? nil), "DeliveryTopic" (portkey.aws/search-for-tag input "DeliveryTopic" :flattened? nil :xmlAttribute? nil), "ForwardingEnabled" (portkey.aws/search-for-tag input "ForwardingEnabled" :flattened? nil :xmlAttribute? nil), "HeadersInBounceNotificationsEnabled" (portkey.aws/search-for-tag input "HeadersInBounceNotificationsEnabled" :flattened? nil :xmlAttribute? nil), "HeadersInComplaintNotificationsEnabled" (portkey.aws/search-for-tag input "HeadersInComplaintNotificationsEnabled" :flattened? nil :xmlAttribute? nil), "HeadersInDeliveryNotificationsEnabled" (portkey.aws/search-for-tag input "HeadersInDeliveryNotificationsEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:bounce-topic (deser-notification-topic (clojure.core/get-in letvar936617 ["BounceTopic" :content])), :complaint-topic (deser-notification-topic (clojure.core/get-in letvar936617 ["ComplaintTopic" :content])), :delivery-topic (deser-notification-topic (clojure.core/get-in letvar936617 ["DeliveryTopic" :content])), :forwarding-enabled (deser-enabled (clojure.core/get-in letvar936617 ["ForwardingEnabled" :content]))} (letvar936617 "HeadersInBounceNotificationsEnabled") (clojure.core/assoc :headers-in-bounce-notifications-enabled (deser-enabled (clojure.core/get-in letvar936617 ["HeadersInBounceNotificationsEnabled" :content]))) (letvar936617 "HeadersInComplaintNotificationsEnabled") (clojure.core/assoc :headers-in-complaint-notifications-enabled (deser-enabled (clojure.core/get-in letvar936617 ["HeadersInComplaintNotificationsEnabled" :content]))) (letvar936617 "HeadersInDeliveryNotificationsEnabled") (clojure.core/assoc :headers-in-delivery-notifications-enabled (deser-enabled (clojure.core/get-in letvar936617 ["HeadersInDeliveryNotificationsEnabled" :content]))))))

(clojure.core/defn- deser-success-redirection-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-receipt-rule-set-metadata [input] (clojure.core/let [letvar936735 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CreatedTimestamp" (portkey.aws/search-for-tag input "CreatedTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar936735 "Name") (clojure.core/assoc :name (deser-receipt-rule-set-name (clojure.core/get-in letvar936735 ["Name" :content]))) (letvar936735 "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-timestamp (clojure.core/get-in letvar936735 ["CreatedTimestamp" :content]))))))

(clojure.core/defn- deser-error [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-sns-destination [input] (clojure.core/let [letvar936848 {"TopicARN" (portkey.aws/search-for-tag input "TopicARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar936848 ["TopicARN" :content]))})))

(clojure.core/defn- deser-receipt-rules-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-receipt-rule coll))) input))

(clojure.core/defn- deser-bounce-status-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-destinations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-destination coll))) input))

(clojure.core/defn- deser-failure-redirection-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-receipt-filter-policy [input] (clojure.core/get {"Block" :block, "Allow" :allow} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stop-action [input] (clojure.core/let [letvar937005 {"Scope" (portkey.aws/search-for-tag input "Scope" :flattened? nil :xmlAttribute? nil), "TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:scope (deser-stop-scope (clojure.core/get-in letvar937005 ["Scope" :content]))} (letvar937005 "TopicArn") (clojure.core/assoc :topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar937005 ["TopicArn" :content]))))))

(clojure.core/defn- deser-receipt-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-receipt-filter coll))) input))

(clojure.core/defn- deser-lambda-action [input] (clojure.core/let [letvar937130 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil), "FunctionArn" (portkey.aws/search-for-tag input "FunctionArn" :flattened? nil :xmlAttribute? nil), "InvocationType" (portkey.aws/search-for-tag input "InvocationType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:function-arn (deser-amazon-resource-name (clojure.core/get-in letvar937130 ["FunctionArn" :content]))} (letvar937130 "TopicArn") (clojure.core/assoc :topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar937130 ["TopicArn" :content]))) (letvar937130 "InvocationType") (clojure.core/assoc :invocation-type (deser-invocation-type (clojure.core/get-in letvar937130 ["InvocationType" :content]))))))

(clojure.core/defn- deser-receipt-ip-filter [input] (clojure.core/let [letvar937238 {"Policy" (portkey.aws/search-for-tag input "Policy" :flattened? nil :xmlAttribute? nil), "Cidr" (portkey.aws/search-for-tag input "Cidr" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:policy (deser-receipt-filter-policy (clojure.core/get-in letvar937238 ["Policy" :content])), :cidr (deser-cidr (clojure.core/get-in letvar937238 ["Cidr" :content]))})))

(clojure.core/defn- deser-recipients-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-recipient coll))) input))

(clojure.core/defn- deser-bulk-email-destination-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bulk-email-destination-status coll))) input))

(clojure.core/defn- deser-custom-mail-from-status [input] (clojure.core/get {"Pending" :pending, "Success" :success, "Failed" :failed, "TemporaryFailure" :temporary-failure} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-s-3-action [input] (clojure.core/let [letvar937385 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil), "BucketName" (portkey.aws/search-for-tag input "BucketName" :flattened? nil :xmlAttribute? nil), "ObjectKeyPrefix" (portkey.aws/search-for-tag input "ObjectKeyPrefix" :flattened? nil :xmlAttribute? nil), "KmsKeyArn" (portkey.aws/search-for-tag input "KmsKeyArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket-name (deser-s-3-bucket-name (clojure.core/get-in letvar937385 ["BucketName" :content]))} (letvar937385 "TopicArn") (clojure.core/assoc :topic-arn (deser-amazon-resource-name (clojure.core/get-in letvar937385 ["TopicArn" :content]))) (letvar937385 "ObjectKeyPrefix") (clojure.core/assoc :object-key-prefix (deser-s-3-key-prefix (clojure.core/get-in letvar937385 ["ObjectKeyPrefix" :content]))) (letvar937385 "KmsKeyArn") (clojure.core/assoc :kms-key-arn (deser-amazon-resource-name (clojure.core/get-in letvar937385 ["KmsKeyArn" :content]))))))

(clojure.core/defn- deser-max-24-hour-send [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-policy-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-name coll))) input))

(clojure.core/defn- deser-rule-or-rule-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-verification-token-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-verification-token coll))) input))

(clojure.core/defn- deser-subject-part [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bounce-smtp-reply-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-receipt-rule-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-mail-from-domain-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-tracking-options-already-exists-exception ([input] (response-tracking-options-already-exists-exception nil input)) ([resultWrapper937448 input] (clojure.core/let [rawinput937447 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937449 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937447 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937448)}] (clojure.core/cond-> {} (letvar937449 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937449 ["ConfigurationSetName" :content])))))))

(clojure.core/defn- response-create-template-response ([input] (response-create-template-response nil input)) ([resultWrapper937451 input] (clojure.core/let [rawinput937450 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937452 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-custom-verification-email-templates-response ([input] (response-list-custom-verification-email-templates-response nil input)) ([resultWrapper937454 input] (clojure.core/let [rawinput937453 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937455 {"CustomVerificationEmailTemplates" (portkey.aws/search-for-tag rawinput937453 "CustomVerificationEmailTemplates" :flattened? nil :result-wrapper resultWrapper937454), "NextToken" (portkey.aws/search-for-tag rawinput937453 "NextToken" :flattened? nil :result-wrapper resultWrapper937454)}] (clojure.core/cond-> {} (letvar937455 "CustomVerificationEmailTemplates") (clojure.core/assoc :custom-verification-email-templates (deser-custom-verification-email-templates (clojure.core/get-in letvar937455 ["CustomVerificationEmailTemplates" :content]))) (letvar937455 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar937455 ["NextToken" :content])))))))

(clojure.core/defn- response-template-does-not-exist-exception ([input] (response-template-does-not-exist-exception nil input)) ([resultWrapper937457 input] (clojure.core/let [rawinput937456 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937458 {"TemplateName" (portkey.aws/search-for-tag rawinput937456 "TemplateName" :flattened? nil :result-wrapper resultWrapper937457)}] (clojure.core/cond-> {} (letvar937458 "TemplateName") (clojure.core/assoc :template-name (deser-template-name (clojure.core/get-in letvar937458 ["TemplateName" :content])))))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper937460 input] (clojure.core/let [rawinput937459 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937461 {"Name" (portkey.aws/search-for-tag rawinput937459 "Name" :flattened? nil :result-wrapper resultWrapper937460)}] (clojure.core/cond-> {} (letvar937461 "Name") (clojure.core/assoc :name (deser-rule-or-rule-set-name (clojure.core/get-in letvar937461 ["Name" :content])))))))

(clojure.core/defn- response-send-templated-email-response ([input] (response-send-templated-email-response nil input)) ([resultWrapper937463 input] (clojure.core/let [rawinput937462 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937464 {"MessageId" (portkey.aws/search-for-tag rawinput937462 "MessageId" :flattened? nil :result-wrapper resultWrapper937463)}] (clojure.core/cond-> {:message-id (deser-message-id (clojure.core/get-in letvar937464 ["MessageId" :content]))}))))

(clojure.core/defn- response-custom-verification-email-template-does-not-exist-exception ([input] (response-custom-verification-email-template-does-not-exist-exception nil input)) ([resultWrapper937466 input] (clojure.core/let [rawinput937465 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937467 {"CustomVerificationEmailTemplateName" (portkey.aws/search-for-tag rawinput937465 "CustomVerificationEmailTemplateName" :flattened? nil :result-wrapper resultWrapper937466)}] (clojure.core/cond-> {} (letvar937467 "CustomVerificationEmailTemplateName") (clojure.core/assoc :custom-verification-email-template-name (deser-template-name (clojure.core/get-in letvar937467 ["CustomVerificationEmailTemplateName" :content])))))))

(clojure.core/defn- response-custom-verification-email-template-already-exists-exception ([input] (response-custom-verification-email-template-already-exists-exception nil input)) ([resultWrapper937469 input] (clojure.core/let [rawinput937468 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937470 {"CustomVerificationEmailTemplateName" (portkey.aws/search-for-tag rawinput937468 "CustomVerificationEmailTemplateName" :flattened? nil :result-wrapper resultWrapper937469)}] (clojure.core/cond-> {} (letvar937470 "CustomVerificationEmailTemplateName") (clojure.core/assoc :custom-verification-email-template-name (deser-template-name (clojure.core/get-in letvar937470 ["CustomVerificationEmailTemplateName" :content])))))))

(clojure.core/defn- response-invalid-tracking-options-exception ([input] (response-invalid-tracking-options-exception nil input)) ([resultWrapper937472 input] (clojure.core/let [rawinput937471 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937473 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-receipt-rule-sets-response ([input] (response-list-receipt-rule-sets-response nil input)) ([resultWrapper937475 input] (clojure.core/let [rawinput937474 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937476 {"RuleSets" (portkey.aws/search-for-tag rawinput937474 "RuleSets" :flattened? nil :result-wrapper resultWrapper937475), "NextToken" (portkey.aws/search-for-tag rawinput937474 "NextToken" :flattened? nil :result-wrapper resultWrapper937475)}] (clojure.core/cond-> {} (letvar937476 "RuleSets") (clojure.core/assoc :rule-sets (deser-receipt-rule-sets-lists (clojure.core/get-in letvar937476 ["RuleSets" :content]))) (letvar937476 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar937476 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-sns-destination-exception ([input] (response-invalid-sns-destination-exception nil input)) ([resultWrapper937478 input] (clojure.core/let [rawinput937477 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937479 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937477 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937478), "EventDestinationName" (portkey.aws/search-for-tag rawinput937477 "EventDestinationName" :flattened? nil :result-wrapper resultWrapper937478)}] (clojure.core/cond-> {} (letvar937479 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937479 ["ConfigurationSetName" :content]))) (letvar937479 "EventDestinationName") (clojure.core/assoc :event-destination-name (deser-event-destination-name (clojure.core/get-in letvar937479 ["EventDestinationName" :content])))))))

(clojure.core/defn- response-list-identity-policies-response ([input] (response-list-identity-policies-response nil input)) ([resultWrapper937481 input] (clojure.core/let [rawinput937480 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937482 {"PolicyNames" (portkey.aws/search-for-tag rawinput937480 "PolicyNames" :flattened? nil :result-wrapper resultWrapper937481)}] (clojure.core/cond-> {:policy-names (deser-policy-name-list (clojure.core/get-in letvar937482 ["PolicyNames" :content]))}))))

(clojure.core/defn- response-mail-from-domain-not-verified-exception ([input] (response-mail-from-domain-not-verified-exception nil input)) ([resultWrapper937484 input] (clojure.core/let [rawinput937483 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937485 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-configuration-exception ([input] (response-invalid-s-3-configuration-exception nil input)) ([resultWrapper937487 input] (clojure.core/let [rawinput937486 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937488 {"Bucket" (portkey.aws/search-for-tag rawinput937486 "Bucket" :flattened? nil :result-wrapper resultWrapper937487)}] (clojure.core/cond-> {} (letvar937488 "Bucket") (clojure.core/assoc :bucket (deser-s-3-bucket-name (clojure.core/get-in letvar937488 ["Bucket" :content])))))))

(clojure.core/defn- response-get-identity-policies-response ([input] (response-get-identity-policies-response nil input)) ([resultWrapper937490 input] (clojure.core/let [rawinput937489 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937491 {"Policies" (portkey.aws/search-for-tag rawinput937489 "Policies" :flattened? nil :result-wrapper resultWrapper937490)}] (clojure.core/cond-> {:policies (deser-policy-map (clojure.core/get-in letvar937491 ["Policies" :content]))}))))

(clojure.core/defn- response-get-send-statistics-response ([input] (response-get-send-statistics-response nil input)) ([resultWrapper937493 input] (clojure.core/let [rawinput937492 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937494 {"SendDataPoints" (portkey.aws/search-for-tag rawinput937492 "SendDataPoints" :flattened? nil :result-wrapper resultWrapper937493)}] (clojure.core/cond-> {} (letvar937494 "SendDataPoints") (clojure.core/assoc :send-data-points (deser-send-data-point-list (clojure.core/get-in letvar937494 ["SendDataPoints" :content])))))))

(clojure.core/defn- response-verify-domain-identity-response ([input] (response-verify-domain-identity-response nil input)) ([resultWrapper937496 input] (clojure.core/let [rawinput937495 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937497 {"VerificationToken" (portkey.aws/search-for-tag rawinput937495 "VerificationToken" :flattened? nil :result-wrapper resultWrapper937496)}] (clojure.core/cond-> {:verification-token (deser-verification-token (clojure.core/get-in letvar937497 ["VerificationToken" :content]))}))))

(clojure.core/defn- response-invalid-sns-topic-exception ([input] (response-invalid-sns-topic-exception nil input)) ([resultWrapper937499 input] (clojure.core/let [rawinput937498 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937500 {"Topic" (portkey.aws/search-for-tag rawinput937498 "Topic" :flattened? nil :result-wrapper resultWrapper937499)}] (clojure.core/cond-> {} (letvar937500 "Topic") (clojure.core/assoc :topic (deser-amazon-resource-name (clojure.core/get-in letvar937500 ["Topic" :content])))))))

(clojure.core/defn- response-list-templates-response ([input] (response-list-templates-response nil input)) ([resultWrapper937502 input] (clojure.core/let [rawinput937501 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937503 {"TemplatesMetadata" (portkey.aws/search-for-tag rawinput937501 "TemplatesMetadata" :flattened? nil :result-wrapper resultWrapper937502), "NextToken" (portkey.aws/search-for-tag rawinput937501 "NextToken" :flattened? nil :result-wrapper resultWrapper937502)}] (clojure.core/cond-> {} (letvar937503 "TemplatesMetadata") (clojure.core/assoc :templates-metadata (deser-template-metadata-list (clojure.core/get-in letvar937503 ["TemplatesMetadata" :content]))) (letvar937503 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar937503 ["NextToken" :content])))))))

(clojure.core/defn- response-event-destination-does-not-exist-exception ([input] (response-event-destination-does-not-exist-exception nil input)) ([resultWrapper937505 input] (clojure.core/let [rawinput937504 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937506 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937504 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937505), "EventDestinationName" (portkey.aws/search-for-tag rawinput937504 "EventDestinationName" :flattened? nil :result-wrapper resultWrapper937505)}] (clojure.core/cond-> {} (letvar937506 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937506 ["ConfigurationSetName" :content]))) (letvar937506 "EventDestinationName") (clojure.core/assoc :event-destination-name (deser-event-destination-name (clojure.core/get-in letvar937506 ["EventDestinationName" :content])))))))

(clojure.core/defn- response-invalid-configuration-set-exception ([input] (response-invalid-configuration-set-exception nil input)) ([resultWrapper937508 input] (clojure.core/let [rawinput937507 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937509 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-receipt-filter-response ([input] (response-delete-receipt-filter-response nil input)) ([resultWrapper937511 input] (clojure.core/let [rawinput937510 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937512 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-identity-feedback-forwarding-enabled-response ([input] (response-set-identity-feedback-forwarding-enabled-response nil input)) ([resultWrapper937514 input] (clojure.core/let [rawinput937513 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937515 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-receipt-rule-response ([input] (response-delete-receipt-rule-response nil input)) ([resultWrapper937517 input] (clojure.core/let [rawinput937516 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937518 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-identity-policy-response ([input] (response-put-identity-policy-response nil input)) ([resultWrapper937520 input] (clojure.core/let [rawinput937519 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937521 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper937523 input] (clojure.core/let [rawinput937522 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937524 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-verify-domain-dkim-response ([input] (response-verify-domain-dkim-response nil input)) ([resultWrapper937526 input] (clojure.core/let [rawinput937525 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937527 {"DkimTokens" (portkey.aws/search-for-tag rawinput937525 "DkimTokens" :flattened? nil :result-wrapper resultWrapper937526)}] (clojure.core/cond-> {:dkim-tokens (deser-verification-token-list (clojure.core/get-in letvar937527 ["DkimTokens" :content]))}))))

(clojure.core/defn- response-send-email-response ([input] (response-send-email-response nil input)) ([resultWrapper937529 input] (clojure.core/let [rawinput937528 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937530 {"MessageId" (portkey.aws/search-for-tag rawinput937528 "MessageId" :flattened? nil :result-wrapper resultWrapper937529)}] (clojure.core/cond-> {:message-id (deser-message-id (clojure.core/get-in letvar937530 ["MessageId" :content]))}))))

(clojure.core/defn- response-describe-receipt-rule-set-response ([input] (response-describe-receipt-rule-set-response nil input)) ([resultWrapper937532 input] (clojure.core/let [rawinput937531 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937533 {"Metadata" (portkey.aws/search-for-tag rawinput937531 "Metadata" :flattened? nil :result-wrapper resultWrapper937532), "Rules" (portkey.aws/search-for-tag rawinput937531 "Rules" :flattened? nil :result-wrapper resultWrapper937532)}] (clojure.core/cond-> {} (letvar937533 "Metadata") (clojure.core/assoc :metadata (deser-receipt-rule-set-metadata (clojure.core/get-in letvar937533 ["Metadata" :content]))) (letvar937533 "Rules") (clojure.core/assoc :rules (deser-receipt-rules-list (clojure.core/get-in letvar937533 ["Rules" :content])))))))

(clojure.core/defn- response-test-render-template-response ([input] (response-test-render-template-response nil input)) ([resultWrapper937535 input] (clojure.core/let [rawinput937534 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937536 {"RenderedTemplate" (portkey.aws/search-for-tag rawinput937534 "RenderedTemplate" :flattened? nil :result-wrapper resultWrapper937535)}] (clojure.core/cond-> {} (letvar937536 "RenderedTemplate") (clojure.core/assoc :rendered-template (deser-rendered-template (clojure.core/get-in letvar937536 ["RenderedTemplate" :content])))))))

(clojure.core/defn- response-custom-verification-email-invalid-content-exception ([input] (response-custom-verification-email-invalid-content-exception nil input)) ([resultWrapper937538 input] (clojure.core/let [rawinput937537 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937539 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-configuration-sets-response ([input] (response-list-configuration-sets-response nil input)) ([resultWrapper937541 input] (clojure.core/let [rawinput937540 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937542 {"ConfigurationSets" (portkey.aws/search-for-tag rawinput937540 "ConfigurationSets" :flattened? nil :result-wrapper resultWrapper937541), "NextToken" (portkey.aws/search-for-tag rawinput937540 "NextToken" :flattened? nil :result-wrapper resultWrapper937541)}] (clojure.core/cond-> {} (letvar937542 "ConfigurationSets") (clojure.core/assoc :configuration-sets (deser-configuration-sets (clojure.core/get-in letvar937542 ["ConfigurationSets" :content]))) (letvar937542 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar937542 ["NextToken" :content])))))))

(clojure.core/defn- response-create-configuration-set-response ([input] (response-create-configuration-set-response nil input)) ([resultWrapper937544 input] (clojure.core/let [rawinput937543 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937545 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-configuration-set-sending-paused-exception ([input] (response-configuration-set-sending-paused-exception nil input)) ([resultWrapper937547 input] (clojure.core/let [rawinput937546 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937548 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937546 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937547)}] (clojure.core/cond-> {} (letvar937548 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937548 ["ConfigurationSetName" :content])))))))

(clojure.core/defn- response-configuration-set-already-exists-exception ([input] (response-configuration-set-already-exists-exception nil input)) ([resultWrapper937550 input] (clojure.core/let [rawinput937549 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937551 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937549 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937550)}] (clojure.core/cond-> {} (letvar937551 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937551 ["ConfigurationSetName" :content])))))))

(clojure.core/defn- response-update-configuration-set-tracking-options-response ([input] (response-update-configuration-set-tracking-options-response nil input)) ([resultWrapper937553 input] (clojure.core/let [rawinput937552 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937554 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-rendering-parameter-exception ([input] (response-invalid-rendering-parameter-exception nil input)) ([resultWrapper937556 input] (clojure.core/let [rawinput937555 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937557 {"TemplateName" (portkey.aws/search-for-tag rawinput937555 "TemplateName" :flattened? nil :result-wrapper resultWrapper937556)}] (clojure.core/cond-> {} (letvar937557 "TemplateName") (clojure.core/assoc :template-name (deser-template-name (clojure.core/get-in letvar937557 ["TemplateName" :content])))))))

(clojure.core/defn- response-message-rejected ([input] (response-message-rejected nil input)) ([resultWrapper937559 input] (clojure.core/let [rawinput937558 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937560 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-event-destination-already-exists-exception ([input] (response-event-destination-already-exists-exception nil input)) ([resultWrapper937562 input] (clojure.core/let [rawinput937561 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937563 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937561 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937562), "EventDestinationName" (portkey.aws/search-for-tag rawinput937561 "EventDestinationName" :flattened? nil :result-wrapper resultWrapper937562)}] (clojure.core/cond-> {} (letvar937563 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937563 ["ConfigurationSetName" :content]))) (letvar937563 "EventDestinationName") (clojure.core/assoc :event-destination-name (deser-event-destination-name (clojure.core/get-in letvar937563 ["EventDestinationName" :content])))))))

(clojure.core/defn- response-delete-identity-policy-response ([input] (response-delete-identity-policy-response nil input)) ([resultWrapper937565 input] (clojure.core/let [rawinput937564 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937566 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-send-quota-response ([input] (response-get-send-quota-response nil input)) ([resultWrapper937568 input] (clojure.core/let [rawinput937567 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937569 {"Max24HourSend" (portkey.aws/search-for-tag rawinput937567 "Max24HourSend" :flattened? nil :result-wrapper resultWrapper937568), "MaxSendRate" (portkey.aws/search-for-tag rawinput937567 "MaxSendRate" :flattened? nil :result-wrapper resultWrapper937568), "SentLast24Hours" (portkey.aws/search-for-tag rawinput937567 "SentLast24Hours" :flattened? nil :result-wrapper resultWrapper937568)}] (clojure.core/cond-> {} (letvar937569 "Max24HourSend") (clojure.core/assoc :max-24-hour-send (deser-max-24-hour-send (clojure.core/get-in letvar937569 ["Max24HourSend" :content]))) (letvar937569 "MaxSendRate") (clojure.core/assoc :max-send-rate (deser-max-send-rate (clojure.core/get-in letvar937569 ["MaxSendRate" :content]))) (letvar937569 "SentLast24Hours") (clojure.core/assoc :sent-last-24-hours (deser-sent-last-24-hours (clojure.core/get-in letvar937569 ["SentLast24Hours" :content])))))))

(clojure.core/defn- response-get-account-sending-enabled-response ([input] (response-get-account-sending-enabled-response nil input)) ([resultWrapper937571 input] (clojure.core/let [rawinput937570 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937572 {"Enabled" (portkey.aws/search-for-tag rawinput937570 "Enabled" :flattened? nil :result-wrapper resultWrapper937571)}] (clojure.core/cond-> {} (letvar937572 "Enabled") (clojure.core/assoc :enabled (deser-enabled (clojure.core/get-in letvar937572 ["Enabled" :content])))))))

(clojure.core/defn- response-invalid-firehose-destination-exception ([input] (response-invalid-firehose-destination-exception nil input)) ([resultWrapper937574 input] (clojure.core/let [rawinput937573 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937575 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937573 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937574), "EventDestinationName" (portkey.aws/search-for-tag rawinput937573 "EventDestinationName" :flattened? nil :result-wrapper resultWrapper937574)}] (clojure.core/cond-> {} (letvar937575 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937575 ["ConfigurationSetName" :content]))) (letvar937575 "EventDestinationName") (clojure.core/assoc :event-destination-name (deser-event-destination-name (clojure.core/get-in letvar937575 ["EventDestinationName" :content])))))))

(clojure.core/defn- response-get-identity-verification-attributes-response ([input] (response-get-identity-verification-attributes-response nil input)) ([resultWrapper937577 input] (clojure.core/let [rawinput937576 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937578 {"VerificationAttributes" (portkey.aws/search-for-tag rawinput937576 "VerificationAttributes" :flattened? nil :result-wrapper resultWrapper937577)}] (clojure.core/cond-> {:verification-attributes (deser-verification-attributes (clojure.core/get-in letvar937578 ["VerificationAttributes" :content]))}))))

(clojure.core/defn- response-delete-identity-response ([input] (response-delete-identity-response nil input)) ([resultWrapper937580 input] (clojure.core/let [rawinput937579 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937581 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-configuration-set-tracking-options-response ([input] (response-delete-configuration-set-tracking-options-response nil input)) ([resultWrapper937583 input] (clojure.core/let [rawinput937582 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937584 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-identity-notification-topic-response ([input] (response-set-identity-notification-topic-response nil input)) ([resultWrapper937586 input] (clojure.core/let [rawinput937585 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937587 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-active-receipt-rule-set-response ([input] (response-set-active-receipt-rule-set-response nil input)) ([resultWrapper937589 input] (clojure.core/let [rawinput937588 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937590 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-bounce-response ([input] (response-send-bounce-response nil input)) ([resultWrapper937592 input] (clojure.core/let [rawinput937591 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937593 {"MessageId" (portkey.aws/search-for-tag rawinput937591 "MessageId" :flattened? nil :result-wrapper resultWrapper937592)}] (clojure.core/cond-> {} (letvar937593 "MessageId") (clojure.core/assoc :message-id (deser-message-id (clojure.core/get-in letvar937593 ["MessageId" :content])))))))

(clojure.core/defn- response-clone-receipt-rule-set-response ([input] (response-clone-receipt-rule-set-response nil input)) ([resultWrapper937595 input] (clojure.core/let [rawinput937594 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937596 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-identity-dkim-attributes-response ([input] (response-get-identity-dkim-attributes-response nil input)) ([resultWrapper937598 input] (clojure.core/let [rawinput937597 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937599 {"DkimAttributes" (portkey.aws/search-for-tag rawinput937597 "DkimAttributes" :flattened? nil :result-wrapper resultWrapper937598)}] (clojure.core/cond-> {:dkim-attributes (deser-dkim-attributes (clojure.core/get-in letvar937599 ["DkimAttributes" :content]))}))))

(clojure.core/defn- response-get-custom-verification-email-template-response ([input] (response-get-custom-verification-email-template-response nil input)) ([resultWrapper937601 input] (clojure.core/let [rawinput937600 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937602 {"TemplateName" (portkey.aws/search-for-tag rawinput937600 "TemplateName" :flattened? nil :result-wrapper resultWrapper937601), "FromEmailAddress" (portkey.aws/search-for-tag rawinput937600 "FromEmailAddress" :flattened? nil :result-wrapper resultWrapper937601), "TemplateSubject" (portkey.aws/search-for-tag rawinput937600 "TemplateSubject" :flattened? nil :result-wrapper resultWrapper937601), "TemplateContent" (portkey.aws/search-for-tag rawinput937600 "TemplateContent" :flattened? nil :result-wrapper resultWrapper937601), "SuccessRedirectionURL" (portkey.aws/search-for-tag rawinput937600 "SuccessRedirectionURL" :flattened? nil :result-wrapper resultWrapper937601), "FailureRedirectionURL" (portkey.aws/search-for-tag rawinput937600 "FailureRedirectionURL" :flattened? nil :result-wrapper resultWrapper937601)}] (clojure.core/cond-> {} (letvar937602 "TemplateName") (clojure.core/assoc :template-name (deser-template-name (clojure.core/get-in letvar937602 ["TemplateName" :content]))) (letvar937602 "FromEmailAddress") (clojure.core/assoc :from-email-address (deser-from-address (clojure.core/get-in letvar937602 ["FromEmailAddress" :content]))) (letvar937602 "TemplateSubject") (clojure.core/assoc :template-subject (deser-subject (clojure.core/get-in letvar937602 ["TemplateSubject" :content]))) (letvar937602 "TemplateContent") (clojure.core/assoc :template-content (deser-template-content (clojure.core/get-in letvar937602 ["TemplateContent" :content]))) (letvar937602 "SuccessRedirectionURL") (clojure.core/assoc :success-redirection-url (deser-success-redirection-url (clojure.core/get-in letvar937602 ["SuccessRedirectionURL" :content]))) (letvar937602 "FailureRedirectionURL") (clojure.core/assoc :failure-redirection-url (deser-failure-redirection-url (clojure.core/get-in letvar937602 ["FailureRedirectionURL" :content])))))))

(clojure.core/defn- response-update-configuration-set-event-destination-response ([input] (response-update-configuration-set-event-destination-response nil input)) ([resultWrapper937604 input] (clojure.core/let [rawinput937603 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937605 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-custom-verification-email-response ([input] (response-send-custom-verification-email-response nil input)) ([resultWrapper937607 input] (clojure.core/let [rawinput937606 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937608 {"MessageId" (portkey.aws/search-for-tag rawinput937606 "MessageId" :flattened? nil :result-wrapper resultWrapper937607)}] (clojure.core/cond-> {} (letvar937608 "MessageId") (clojure.core/assoc :message-id (deser-message-id (clojure.core/get-in letvar937608 ["MessageId" :content])))))))

(clojure.core/defn- response-rule-does-not-exist-exception ([input] (response-rule-does-not-exist-exception nil input)) ([resultWrapper937610 input] (clojure.core/let [rawinput937609 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937611 {"Name" (portkey.aws/search-for-tag rawinput937609 "Name" :flattened? nil :result-wrapper resultWrapper937610)}] (clojure.core/cond-> {} (letvar937611 "Name") (clojure.core/assoc :name (deser-rule-or-rule-set-name (clojure.core/get-in letvar937611 ["Name" :content])))))))

(clojure.core/defn- response-get-identity-notification-attributes-response ([input] (response-get-identity-notification-attributes-response nil input)) ([resultWrapper937613 input] (clojure.core/let [rawinput937612 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937614 {"NotificationAttributes" (portkey.aws/search-for-tag rawinput937612 "NotificationAttributes" :flattened? nil :result-wrapper resultWrapper937613)}] (clojure.core/cond-> {:notification-attributes (deser-notification-attributes (clojure.core/get-in letvar937614 ["NotificationAttributes" :content]))}))))

(clojure.core/defn- response-account-sending-paused-exception ([input] (response-account-sending-paused-exception nil input)) ([resultWrapper937616 input] (clojure.core/let [rawinput937615 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937617 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-receipt-rule-set-response ([input] (response-create-receipt-rule-set-response nil input)) ([resultWrapper937619 input] (clojure.core/let [rawinput937618 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937620 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-lambda-function-exception ([input] (response-invalid-lambda-function-exception nil input)) ([resultWrapper937622 input] (clojure.core/let [rawinput937621 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937623 {"FunctionArn" (portkey.aws/search-for-tag rawinput937621 "FunctionArn" :flattened? nil :result-wrapper resultWrapper937622)}] (clojure.core/cond-> {} (letvar937623 "FunctionArn") (clojure.core/assoc :function-arn (deser-amazon-resource-name (clojure.core/get-in letvar937623 ["FunctionArn" :content])))))))

(clojure.core/defn- response-delete-configuration-set-response ([input] (response-delete-configuration-set-response nil input)) ([resultWrapper937625 input] (clojure.core/let [rawinput937624 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937626 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-bulk-templated-email-response ([input] (response-send-bulk-templated-email-response nil input)) ([resultWrapper937628 input] (clojure.core/let [rawinput937627 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937629 {"Status" (portkey.aws/search-for-tag rawinput937627 "Status" :flattened? nil :result-wrapper resultWrapper937628)}] (clojure.core/cond-> {:status (deser-bulk-email-destination-status-list (clojure.core/get-in letvar937629 ["Status" :content]))}))))

(clojure.core/defn- response-describe-receipt-rule-response ([input] (response-describe-receipt-rule-response nil input)) ([resultWrapper937631 input] (clojure.core/let [rawinput937630 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937632 {"Rule" (portkey.aws/search-for-tag rawinput937630 "Rule" :flattened? nil :result-wrapper resultWrapper937631)}] (clojure.core/cond-> {} (letvar937632 "Rule") (clojure.core/assoc :rule (deser-receipt-rule (clojure.core/get-in letvar937632 ["Rule" :content])))))))

(clojure.core/defn- response-invalid-cloud-watch-destination-exception ([input] (response-invalid-cloud-watch-destination-exception nil input)) ([resultWrapper937634 input] (clojure.core/let [rawinput937633 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937635 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937633 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937634), "EventDestinationName" (portkey.aws/search-for-tag rawinput937633 "EventDestinationName" :flattened? nil :result-wrapper resultWrapper937634)}] (clojure.core/cond-> {} (letvar937635 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937635 ["ConfigurationSetName" :content]))) (letvar937635 "EventDestinationName") (clojure.core/assoc :event-destination-name (deser-event-destination-name (clojure.core/get-in letvar937635 ["EventDestinationName" :content])))))))

(clojure.core/defn- response-list-identities-response ([input] (response-list-identities-response nil input)) ([resultWrapper937637 input] (clojure.core/let [rawinput937636 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937638 {"Identities" (portkey.aws/search-for-tag rawinput937636 "Identities" :flattened? nil :result-wrapper resultWrapper937637), "NextToken" (portkey.aws/search-for-tag rawinput937636 "NextToken" :flattened? nil :result-wrapper resultWrapper937637)}] (clojure.core/cond-> {:identities (deser-identity-list (clojure.core/get-in letvar937638 ["Identities" :content]))} (letvar937638 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar937638 ["NextToken" :content])))))))

(clojure.core/defn- response-list-verified-email-addresses-response ([input] (response-list-verified-email-addresses-response nil input)) ([resultWrapper937640 input] (clojure.core/let [rawinput937639 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937641 {"VerifiedEmailAddresses" (portkey.aws/search-for-tag rawinput937639 "VerifiedEmailAddresses" :flattened? nil :result-wrapper resultWrapper937640)}] (clojure.core/cond-> {} (letvar937641 "VerifiedEmailAddresses") (clojure.core/assoc :verified-email-addresses (deser-address-list (clojure.core/get-in letvar937641 ["VerifiedEmailAddresses" :content])))))))

(clojure.core/defn- response-delete-template-response ([input] (response-delete-template-response nil input)) ([resultWrapper937643 input] (clojure.core/let [rawinput937642 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937644 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-policy-exception ([input] (response-invalid-policy-exception nil input)) ([resultWrapper937646 input] (clojure.core/let [rawinput937645 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937647 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-active-receipt-rule-set-response ([input] (response-describe-active-receipt-rule-set-response nil input)) ([resultWrapper937649 input] (clojure.core/let [rawinput937648 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937650 {"Metadata" (portkey.aws/search-for-tag rawinput937648 "Metadata" :flattened? nil :result-wrapper resultWrapper937649), "Rules" (portkey.aws/search-for-tag rawinput937648 "Rules" :flattened? nil :result-wrapper resultWrapper937649)}] (clojure.core/cond-> {} (letvar937650 "Metadata") (clojure.core/assoc :metadata (deser-receipt-rule-set-metadata (clojure.core/get-in letvar937650 ["Metadata" :content]))) (letvar937650 "Rules") (clojure.core/assoc :rules (deser-receipt-rules-list (clojure.core/get-in letvar937650 ["Rules" :content])))))))

(clojure.core/defn- response-list-receipt-filters-response ([input] (response-list-receipt-filters-response nil input)) ([resultWrapper937652 input] (clojure.core/let [rawinput937651 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937653 {"Filters" (portkey.aws/search-for-tag rawinput937651 "Filters" :flattened? nil :result-wrapper resultWrapper937652)}] (clojure.core/cond-> {} (letvar937653 "Filters") (clojure.core/assoc :filters (deser-receipt-filter-list (clojure.core/get-in letvar937653 ["Filters" :content])))))))

(clojure.core/defn- response-production-access-not-granted-exception ([input] (response-production-access-not-granted-exception nil input)) ([resultWrapper937655 input] (clojure.core/let [rawinput937654 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937656 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-template-response ([input] (response-get-template-response nil input)) ([resultWrapper937658 input] (clojure.core/let [rawinput937657 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937659 {"Template" (portkey.aws/search-for-tag rawinput937657 "Template" :flattened? nil :result-wrapper resultWrapper937658)}] (clojure.core/cond-> {} (letvar937659 "Template") (clojure.core/assoc :template (deser-template (clojure.core/get-in letvar937659 ["Template" :content])))))))

(clojure.core/defn- response-delete-receipt-rule-set-response ([input] (response-delete-receipt-rule-set-response nil input)) ([resultWrapper937661 input] (clojure.core/let [rawinput937660 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937662 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-configuration-set-event-destination-response ([input] (response-delete-configuration-set-event-destination-response nil input)) ([resultWrapper937664 input] (clojure.core/let [rawinput937663 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937665 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-configuration-set-tracking-options-response ([input] (response-create-configuration-set-tracking-options-response nil input)) ([resultWrapper937667 input] (clojure.core/let [rawinput937666 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937668 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-receipt-rule-position-response ([input] (response-set-receipt-rule-position-response nil input)) ([resultWrapper937670 input] (clojure.core/let [rawinput937669 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937671 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-missing-rendering-attribute-exception ([input] (response-missing-rendering-attribute-exception nil input)) ([resultWrapper937673 input] (clojure.core/let [rawinput937672 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937674 {"TemplateName" (portkey.aws/search-for-tag rawinput937672 "TemplateName" :flattened? nil :result-wrapper resultWrapper937673)}] (clojure.core/cond-> {} (letvar937674 "TemplateName") (clojure.core/assoc :template-name (deser-template-name (clojure.core/get-in letvar937674 ["TemplateName" :content])))))))

(clojure.core/defn- response-from-email-address-not-verified-exception ([input] (response-from-email-address-not-verified-exception nil input)) ([resultWrapper937676 input] (clojure.core/let [rawinput937675 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937677 {"FromEmailAddress" (portkey.aws/search-for-tag rawinput937675 "FromEmailAddress" :flattened? nil :result-wrapper resultWrapper937676)}] (clojure.core/cond-> {} (letvar937677 "FromEmailAddress") (clojure.core/assoc :from-email-address (deser-from-address (clojure.core/get-in letvar937677 ["FromEmailAddress" :content])))))))

(clojure.core/defn- response-describe-configuration-set-response ([input] (response-describe-configuration-set-response nil input)) ([resultWrapper937679 input] (clojure.core/let [rawinput937678 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937680 {"ConfigurationSet" (portkey.aws/search-for-tag rawinput937678 "ConfigurationSet" :flattened? nil :result-wrapper resultWrapper937679), "EventDestinations" (portkey.aws/search-for-tag rawinput937678 "EventDestinations" :flattened? nil :result-wrapper resultWrapper937679), "TrackingOptions" (portkey.aws/search-for-tag rawinput937678 "TrackingOptions" :flattened? nil :result-wrapper resultWrapper937679), "ReputationOptions" (portkey.aws/search-for-tag rawinput937678 "ReputationOptions" :flattened? nil :result-wrapper resultWrapper937679)}] (clojure.core/cond-> {} (letvar937680 "ConfigurationSet") (clojure.core/assoc :configuration-set (deser-configuration-set (clojure.core/get-in letvar937680 ["ConfigurationSet" :content]))) (letvar937680 "EventDestinations") (clojure.core/assoc :event-destinations (deser-event-destinations (clojure.core/get-in letvar937680 ["EventDestinations" :content]))) (letvar937680 "TrackingOptions") (clojure.core/assoc :tracking-options (deser-tracking-options (clojure.core/get-in letvar937680 ["TrackingOptions" :content]))) (letvar937680 "ReputationOptions") (clojure.core/assoc :reputation-options (deser-reputation-options (clojure.core/get-in letvar937680 ["ReputationOptions" :content])))))))

(clojure.core/defn- response-configuration-set-does-not-exist-exception ([input] (response-configuration-set-does-not-exist-exception nil input)) ([resultWrapper937682 input] (clojure.core/let [rawinput937681 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937683 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937681 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937682)}] (clojure.core/cond-> {} (letvar937683 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937683 ["ConfigurationSetName" :content])))))))

(clojure.core/defn- response-verify-email-identity-response ([input] (response-verify-email-identity-response nil input)) ([resultWrapper937685 input] (clojure.core/let [rawinput937684 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937686 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tracking-options-does-not-exist-exception ([input] (response-tracking-options-does-not-exist-exception nil input)) ([resultWrapper937688 input] (clojure.core/let [rawinput937687 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937689 {"ConfigurationSetName" (portkey.aws/search-for-tag rawinput937687 "ConfigurationSetName" :flattened? nil :result-wrapper resultWrapper937688)}] (clojure.core/cond-> {} (letvar937689 "ConfigurationSetName") (clojure.core/assoc :configuration-set-name (deser-configuration-set-name (clojure.core/get-in letvar937689 ["ConfigurationSetName" :content])))))))

(clojure.core/defn- response-get-identity-mail-from-domain-attributes-response ([input] (response-get-identity-mail-from-domain-attributes-response nil input)) ([resultWrapper937691 input] (clojure.core/let [rawinput937690 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937692 {"MailFromDomainAttributes" (portkey.aws/search-for-tag rawinput937690 "MailFromDomainAttributes" :flattened? nil :result-wrapper resultWrapper937691)}] (clojure.core/cond-> {:mail-from-domain-attributes (deser-mail-from-domain-attributes (clojure.core/get-in letvar937692 ["MailFromDomainAttributes" :content]))}))))

(clojure.core/defn- response-cannot-delete-exception ([input] (response-cannot-delete-exception nil input)) ([resultWrapper937694 input] (clojure.core/let [rawinput937693 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937695 {"Name" (portkey.aws/search-for-tag rawinput937693 "Name" :flattened? nil :result-wrapper resultWrapper937694)}] (clojure.core/cond-> {} (letvar937695 "Name") (clojure.core/assoc :name (deser-rule-or-rule-set-name (clojure.core/get-in letvar937695 ["Name" :content])))))))

(clojure.core/defn- response-set-identity-headers-in-notifications-enabled-response ([input] (response-set-identity-headers-in-notifications-enabled-response nil input)) ([resultWrapper937697 input] (clojure.core/let [rawinput937696 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937698 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-receipt-filter-response ([input] (response-create-receipt-filter-response nil input)) ([resultWrapper937700 input] (clojure.core/let [rawinput937699 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937701 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reorder-receipt-rule-set-response ([input] (response-reorder-receipt-rule-set-response nil input)) ([resultWrapper937703 input] (clojure.core/let [rawinput937702 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937704 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-template-response ([input] (response-update-template-response nil input)) ([resultWrapper937706 input] (clojure.core/let [rawinput937705 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937707 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-configuration-set-event-destination-response ([input] (response-create-configuration-set-event-destination-response nil input)) ([resultWrapper937709 input] (clojure.core/let [rawinput937708 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937710 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-identity-mail-from-domain-response ([input] (response-set-identity-mail-from-domain-response nil input)) ([resultWrapper937712 input] (clojure.core/let [rawinput937711 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937713 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-receipt-rule-response ([input] (response-update-receipt-rule-response nil input)) ([resultWrapper937715 input] (clojure.core/let [rawinput937714 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937716 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-identity-dkim-enabled-response ([input] (response-set-identity-dkim-enabled-response nil input)) ([resultWrapper937718 input] (clojure.core/let [rawinput937717 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937719 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-rule-set-does-not-exist-exception ([input] (response-rule-set-does-not-exist-exception nil input)) ([resultWrapper937721 input] (clojure.core/let [rawinput937720 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937722 {"Name" (portkey.aws/search-for-tag rawinput937720 "Name" :flattened? nil :result-wrapper resultWrapper937721)}] (clojure.core/cond-> {} (letvar937722 "Name") (clojure.core/assoc :name (deser-rule-or-rule-set-name (clojure.core/get-in letvar937722 ["Name" :content])))))))

(clojure.core/defn- response-invalid-template-exception ([input] (response-invalid-template-exception nil input)) ([resultWrapper937724 input] (clojure.core/let [rawinput937723 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937725 {"TemplateName" (portkey.aws/search-for-tag rawinput937723 "TemplateName" :flattened? nil :result-wrapper resultWrapper937724)}] (clojure.core/cond-> {} (letvar937725 "TemplateName") (clojure.core/assoc :template-name (deser-template-name (clojure.core/get-in letvar937725 ["TemplateName" :content])))))))

(clojure.core/defn- response-create-receipt-rule-response ([input] (response-create-receipt-rule-response nil input)) ([resultWrapper937727 input] (clojure.core/let [rawinput937726 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937728 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-raw-email-response ([input] (response-send-raw-email-response nil input)) ([resultWrapper937730 input] (clojure.core/let [rawinput937729 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar937731 {"MessageId" (portkey.aws/search-for-tag rawinput937729 "MessageId" :flattened? nil :result-wrapper resultWrapper937730)}] (clojure.core/cond-> {:message-id (deser-message-id (clojure.core/get-in letvar937731 ["MessageId" :content]))}))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/counter clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tracking-options-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/delivery-attempts (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/bounces (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/complaints (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-data-point/rejects (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/counter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-data-point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/timestamp :portkey.aws.email.-2010-12-01.send-data-point/delivery-attempts :portkey.aws.email.-2010-12-01.send-data-point/bounces :portkey.aws.email.-2010-12-01.send-data-point/complaints :portkey.aws.email.-2010-12-01.send-data-point/rejects]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.event-destination/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/event-destination-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.event-destination/matching-event-types (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/event-types))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.event-destination/name :portkey.aws.email.-2010-12-01.event-destination/matching-event-types] :opt-un [:portkey.aws.email.-2010-12-01/enabled :portkey.aws.email.-2010-12-01/kinesis-firehose-destination :portkey.aws.email.-2010-12-01/cloud-watch-destination :portkey.aws.email.-2010-12-01/sns-destination]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/from-email-address :portkey.aws.email.-2010-12-01.create-custom-verification-email-template-request/template-subject :portkey.aws.email.-2010-12-01/template-content :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sent-last-24-hours clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un [:portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/from-email-address :portkey.aws.email.-2010-12-01.update-custom-verification-email-template-request/template-subject :portkey.aws.email.-2010-12-01/template-content :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tracking-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/custom-redirect-domain]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dimension-value-source #{"linkTag" :link-tag :email-header :message-tag "emailHeader" "messageTag"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-attribute #{"trackingOptions" :reputation-options "eventDestinations" :event-destinations :tracking-options "reputationOptions"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/custom-verification-email-templates :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/smtp-reply-code (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bounce-smtp-reply-code))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/status-code (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bounce-status-code))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/message (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bounce-message))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounce-action/sender (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.bounce-action/smtp-reply-code :portkey.aws.email.-2010-12-01.bounce-action/message :portkey.aws.email.-2010-12-01.bounce-action/sender] :opt-un [:portkey.aws.email.-2010-12-01.bounce-action/topic-arn :portkey.aws.email.-2010-12-01.bounce-action/status-code]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.already-exists-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.already-exists-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-template-data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/destinations (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bulk-email-destination-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bulk-templated-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/destinations] :opt-un [:portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-template-data :portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/source-arn :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/return-path :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/template-arn :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/default-tags :portkey.aws.email.-2010-12-01.send-bulk-templated-email-request/reply-to-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-templated-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/message-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/behavior-on-mx-failure #{:reject-message "UseDefaultValue" "RejectMessage" :use-default-value})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template-does-not-exist-exception/custom-verification-email-template-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.custom-verification-email-template-does-not-exist-exception/custom-verification-email-template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template-already-exists-exception/custom-verification-email-template-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-template-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.custom-verification-email-template-already-exists-exception/custom-verification-email-template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-tracking-options-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dsn-action #{"relayed" :delayed "delayed" "failed" "delivered" :delivered :relayed :expanded "expanded" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message-dsn/extension-fields (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-dsn (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/reporting-mta] :opt-un [:portkey.aws.email.-2010-12-01/arrival-date :portkey.aws.email.-2010-12-01.message-dsn/extension-fields]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/dimension-name :portkey.aws.email.-2010-12-01/dimension-value-source :portkey.aws.email.-2010-12-01/default-dimension-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-custom-verification-email-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-custom-verification-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-custom-verification-email-request/email-address :portkey.aws.email.-2010-12-01/template-name] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-template-data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/destination] :opt-un [:portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-tags :portkey.aws.email.-2010-12-01.bulk-email-destination/replacement-template-data]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-receipt-rule-sets-response/rule-sets (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-sets-lists))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-receipt-rule-sets-response/rule-sets :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-filter/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-filter/ip-filter (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-ip-filter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.receipt-filter/name :portkey.aws.email.-2010-12-01.receipt-filter/ip-filter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-sns-destination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-mail-from-domain-request/mail-from-domain (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity] :opt-un [:portkey.aws.email.-2010-12-01.set-identity-mail-from-domain-request/mail-from-domain :portkey.aws.email.-2010-12-01/behavior-on-mx-failure]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-send-rate clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/put-identity-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/policy-name :portkey.aws.email.-2010-12-01/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-identity-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identity-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.list-identity-policies-response/policy-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/add-header-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/header-name :portkey.aws.email.-2010-12-01/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy-map (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/policy-name :portkey.aws.email.-2010-12-01/policy))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.invalid-s-3-configuration-exception/bucket (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-s-3-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.invalid-s-3-configuration-exception/bucket]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.describe-receipt-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/header-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.cloud-watch-destination/dimension-configurations (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configurations))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cloud-watch-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.cloud-watch-destination/dimension-configurations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-policies-response/policies (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/policy-map))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-policies-response/policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.configuration-set/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/configuration-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.configuration-set/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/identity))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-send-statistics-response/send-data-points (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-data-point-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-send-statistics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.get-send-statistics-response/send-data-points]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/s-3-action :portkey.aws.email.-2010-12-01/bounce-action :portkey.aws.email.-2010-12-01/workmail-action :portkey.aws.email.-2010-12-01/lambda-action :portkey.aws.email.-2010-12-01/stop-action :portkey.aws.email.-2010-12-01/add-header-action :portkey.aws.email.-2010-12-01/sns-action]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.body/text (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/content))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.body/html (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/content))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.body/text :portkey.aws.email.-2010-12-01.body/html]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.workmail-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.workmail-action/organization-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/workmail-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.workmail-action/organization-arn] :opt-un [:portkey.aws.email.-2010-12-01.workmail-action/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-identity-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/verification-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/amazon-resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-verification-status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verification-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-tokens (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verification-token-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-dkim-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-enabled :portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-verification-status] :opt-un [:portkey.aws.email.-2010-12-01.identity-dkim-attributes/dkim-tokens]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.invalid-sns-topic-exception/topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-sns-topic-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.invalid-sns-topic-exception/topic]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-templates-response/templates-metadata (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-metadata-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-templates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-templates-response/templates-metadata :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/arrival-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/bulk-email-destination))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/template-metadata))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-configuration-set-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-filter-request/filter (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.create-receipt-filter-request/filter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rendered-template (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/default-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/stop-scope #{"RuleSet" :rule-set})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-verification-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identity-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.destination/to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.destination/cc-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.destination/bcc-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.destination/to-addresses :portkey.aws.email.-2010-12-01.destination/cc-addresses :portkey.aws.email.-2010-12-01.destination/bcc-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-notification-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-notification-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/s-3-bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un [:portkey.aws.email.-2010-12-01/subject-part :portkey.aws.email.-2010-12-01/text-part :portkey.aws.email.-2010-12-01/html-part]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/put-identity-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.verify-email-identity-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-email-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.verify-email-identity-request/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.template-metadata/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.template-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.template-metadata/name :portkey.aws.email.-2010-12-01.template-metadata/created-timestamp]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.verify-domain-dkim-response/dkim-tokens (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verification-token-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-dkim-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.verify-domain-dkim-response/dkim-tokens] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/raw-message-data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/message-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/notification-type :portkey.aws.email.-2010-12-01/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/notification-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-notification-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-sets (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/configuration-set))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/notification-type #{"Delivery" :complaint :delivery "Complaint" :bounce "Bounce"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/tracking-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-type #{"Undefined" "ExceededQuota" :exceeded-quota "ContentRejected" "DoesNotExist" "TemporaryFailure" "MessageTooLarge" :undefined :message-too-large :does-not-exist :temporary-failure :content-rejected})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/template (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/template-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/template-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-templated-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-templated-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-templated-email-request/source :portkey.aws.email.-2010-12-01/destination :portkey.aws.email.-2010-12-01.send-templated-email-request/template :portkey.aws.email.-2010-12-01/template-data] :opt-un [:portkey.aws.email.-2010-12-01.send-templated-email-request/tags :portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01.send-templated-email-request/source-arn :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-templated-email-request/return-path :portkey.aws.email.-2010-12-01.send-templated-email-request/template-arn :portkey.aws.email.-2010-12-01.send-templated-email-request/reply-to-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/destinations (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/from-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-raw-email-request/tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-raw-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/raw-message] :opt-un [:portkey.aws.email.-2010-12-01.send-raw-email-request/source :portkey.aws.email.-2010-12-01.send-raw-email-request/destinations :portkey.aws.email.-2010-12-01.send-raw-email-request/from-arn :portkey.aws.email.-2010-12-01.send-raw-email-request/source-arn :portkey.aws.email.-2010-12-01.send-raw-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-raw-email-request/tags :portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounced-recipient-info (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient] :opt-un [:portkey.aws.email.-2010-12-01.bounced-recipient-info/recipient-arn :portkey.aws.email.-2010-12-01/bounce-type :portkey.aws.email.-2010-12-01/recipient-dsn-fields]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/metadata (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/rules (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rules-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/metadata :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-response/rules]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/test-render-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/rendered-template]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-sending-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-invalid-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-sets-lists (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-configuration-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-sets :portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-redirect-domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/html-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dkim-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-dkim-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-feedback-forwarding-enabled-request/forwarding-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01.set-identity-feedback-forwarding-enabled-request/forwarding-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-type #{:open "send" "delivery" :complaint :delivery "click" "renderingFailure" :bounce :click "complaint" "bounce" :send :reject "reject" "open" :rendering-failure})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/dsn-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-data-point-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/send-data-point))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/address-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/address))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/configuration-set-attribute))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-rendering-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-filters-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/final-recipient (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/action (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/dsn-action))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/dsn-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.recipient-dsn-fields/extension-fields (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/recipient-dsn-fields (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.recipient-dsn-fields/action :portkey.aws.email.-2010-12-01.recipient-dsn-fields/status] :opt-un [:portkey.aws.email.-2010-12-01.recipient-dsn-fields/final-recipient :portkey.aws.email.-2010-12-01/remote-mta :portkey.aws.email.-2010-12-01/diagnostic-code :portkey.aws.email.-2010-12-01/last-attempt-date :portkey.aws.email.-2010-12-01.recipient-dsn-fields/extension-fields]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-verification-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-verification-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/header-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-rejected (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sns-action-encoding #{"Base64" :base-64 :utf-8 "UTF-8"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-templates (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/custom-verification-email-template))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.sns-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.sns-action/encoding (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/sns-action-encoding))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sns-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.sns-action/topic-arn] :opt-un [:portkey.aws.email.-2010-12-01.sns-action/encoding]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-verification-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/verification-status] :opt-un [:portkey.aws.email.-2010-12-01/verification-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-configuration-set-request/configuration-set-attribute-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/configuration-set-attribute-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name] :opt-un [:portkey.aws.email.-2010-12-01.describe-configuration-set-request/configuration-set-attribute-names]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message-tag/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message-tag/value (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-value))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.message-tag/name :portkey.aws.email.-2010-12-01.message-tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-send-quota-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/max-24-hour-send :portkey.aws.email.-2010-12-01/max-send-rate :portkey.aws.email.-2010-12-01/sent-last-24-hours]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-account-sending-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reporting-mta (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-firehose-destination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/mail-from-domain-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain-status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/custom-mail-from-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-mail-from-domain-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain :portkey.aws.email.-2010-12-01.identity-mail-from-domain-attributes/mail-from-domain-status :portkey.aws.email.-2010-12-01/behavior-on-mx-failure] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.bulk-email-destination-status/status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bulk-email-status))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.bulk-email-destination-status/status :portkey.aws.email.-2010-12-01/error :portkey.aws.email.-2010-12-01/message-id]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-set-request/rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-dkim-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-dkim-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/verification-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/last-fresh-start clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-notification-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-account-sending-enabled-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/text-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-request/after (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.create-receipt-rule-request/rule] :opt-un [:portkey.aws.email.-2010-12-01.create-receipt-rule-request/after]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-configuration-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-items]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bounce-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/message-id]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/after (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-receipt-rule-position-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-set-name :portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/rule-name] :opt-un [:portkey.aws.email.-2010-12-01.set-receipt-rule-position-request/after]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-receipt-filter-request/filter-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.verify-email-address-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-email-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.verify-email-address-request/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destination-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tls-policy #{:require :optional "Require" "Optional"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/dkim-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/recipient (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.message/subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/content))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.message/subject :portkey.aws.email.-2010-12-01/body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/from-email-address :portkey.aws.email.-2010-12-01.get-custom-verification-email-template-response/template-subject :portkey.aws.email.-2010-12-01/template-content :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-custom-verification-email-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/message-id]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.rule-does-not-exist-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.rule-does-not-exist-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invocation-type #{"RequestResponse" "Event" :event :request-response})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-dkim-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-domain-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/mail-from-domain-attributes (clojure.spec.alpha/map-of :portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/identity-mail-from-domain-attributes))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/notification-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/account-sending-paused-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/last-attempt-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/recipients (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/recipients-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/actions (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-actions-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule/scan-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.receipt-rule/name] :opt-un [:portkey.aws.email.-2010-12-01/enabled :portkey.aws.email.-2010-12-01/tls-policy :portkey.aws.email.-2010-12-01.receipt-rule/recipients :portkey.aws.email.-2010-12-01.receipt-rule/actions :portkey.aws.email.-2010-12-01.receipt-rule/scan-enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.custom-verification-email-template/template-subject (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/subject))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-verification-email-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01.custom-verification-email-template/from-email-address :portkey.aws.email.-2010-12-01.custom-verification-email-template/template-subject :portkey.aws.email.-2010-12-01/success-redirection-url :portkey.aws.email.-2010-12-01/failure-redirection-url]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.content/data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/content (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.content/data] :opt-un [:portkey.aws.email.-2010-12-01/charset]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-type #{"Domain" :email-address :domain "EmailAddress"})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.invalid-lambda-function-exception/function-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-lambda-function-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.invalid-lambda-function-exception/function-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-receipt-rule-set-request/rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-notification-topic-request/sns-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-notification-topic-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/notification-type] :opt-un [:portkey.aws.email.-2010-12-01.set-identity-notification-topic-request/sns-topic]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bulk-templated-email-response/status (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/bulk-email-destination-status-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bulk-templated-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-bulk-templated-email-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reputation-options/sending-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reputation-options/reputation-metrics-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reputation-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.reputation-options/sending-enabled :portkey.aws.email.-2010-12-01.reputation-options/reputation-metrics-enabled :portkey.aws.email.-2010-12-01/last-fresh-start]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-receipt-rule-response/rule (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.describe-receipt-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-cloud-watch-destination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/explanation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/event-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/extension-field))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-items clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/s-3-key-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-policies-request/policy-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01.get-identity-policies-request/policy-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.kinesis-firehose-destination/iam-role-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.kinesis-firehose-destination/delivery-stream-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/kinesis-firehose-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.kinesis-firehose-destination/iam-role-arn :portkey.aws.email.-2010-12-01.kinesis-firehose-destination/delivery-stream-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-status #{"Failed" "NotStarted" :pending "TemporaryFailure" "Success" :success :temporary-failure :not-started "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-names (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-names-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-set-name :portkey.aws.email.-2010-12-01.reorder-receipt-rule-set-request/rule-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-identities-response/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identities-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.list-identities-response/identities] :opt-un [:portkey.aws.email.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-verified-email-addresses-response/verified-email-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-verified-email-addresses-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-verified-email-addresses-response/verified-email-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/original-rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/rule-set-name :portkey.aws.email.-2010-12-01.clone-receipt-rule-set-request/original-rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/message-tag-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/message-tag))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounced-recipient-info-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/bounced-recipient-info))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/notification-topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/metadata (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/rules (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rules-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/metadata :portkey.aws.email.-2010-12-01.describe-active-receipt-rule-set-response/rules]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configurations (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/cloud-watch-dimension-configuration))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-types (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/event-type))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-status #{"ConfigurationSetDoesNotExist" "Failed" :invalid-parameter-value "AccountThrottled" "InvalidParameterValue" "ConfigurationSetSendingPaused" :configuration-set-sending-paused :invalid-sending-pool-name "InvalidSendingPoolName" :account-throttled "AccountSuspended" :message-rejected :transient-failure "MessageRejected" "AccountSendingPaused" "AccountDailyQuotaExceeded" "Success" :configuration-set-does-not-exist "MailFromDomainNotVerified" :success :mail-from-domain-not-verified :template-does-not-exist :account-daily-quota-exceeded :account-suspended "TransientFailure" :account-sending-paused "TemplateDoesNotExist" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.list-receipt-filters-response/filters (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-receipt-filters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.list-receipt-filters-response/filters]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/from-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-actions-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-action))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/production-access-not-granted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/bounce-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/complaint-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/delivery-topic (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/notification-topic))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/forwarding-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-bounce-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-complaint-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-delivery-notifications-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/identity-notification-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.identity-notification-attributes/bounce-topic :portkey.aws.email.-2010-12-01.identity-notification-attributes/complaint-topic :portkey.aws.email.-2010-12-01.identity-notification-attributes/delivery-topic :portkey.aws.email.-2010-12-01.identity-notification-attributes/forwarding-enabled] :opt-un [:portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-bounce-notifications-enabled :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-complaint-notifications-enabled :portkey.aws.email.-2010-12-01.identity-notification-attributes/headers-in-delivery-notifications-enabled]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/charset (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/success-redirection-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-receipt-rule-position-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/created-timestamp (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-set-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/name :portkey.aws.email.-2010-12-01.receipt-rule-set-metadata/created-timestamp]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/error (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.sns-destination/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/sns-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.sns-destination/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/missing-rendering-attribute-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rules-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-rule))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.delete-receipt-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-status-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/event-destinations (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/event-destination))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-receipt-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule-set-name :portkey.aws.email.-2010-12-01.update-receipt-rule-request/rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.from-email-address-not-verified-exception/from-email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/from-address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.from-email-address-not-verified-exception/from-email-address]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.create-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.create-receipt-rule-set-request/rule-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/failure-redirection-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/describe-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set :portkey.aws.email.-2010-12-01/event-destinations :portkey.aws.email.-2010-12-01/tracking-options :portkey.aws.email.-2010-12-01/reputation-options]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verify-email-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/source (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/tags (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-tag-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/source-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/return-path-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/return-path (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-email-request/reply-to-addresses (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-email-request/source :portkey.aws.email.-2010-12-01/destination :portkey.aws.email.-2010-12-01/message] :opt-un [:portkey.aws.email.-2010-12-01.send-email-request/tags :portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01.send-email-request/source-arn :portkey.aws.email.-2010-12-01.send-email-request/return-path-arn :portkey.aws.email.-2010-12-01.send-email-request/return-path :portkey.aws.email.-2010-12-01.send-email-request/reply-to-addresses]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.raw-message/data (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/raw-message-data))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/raw-message (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.raw-message/data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/tracking-options-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.extension-field/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.extension-field/value (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/extension-field-value))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/extension-field (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.extension-field/name :portkey.aws.email.-2010-12-01.extension-field/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter-policy #{:block "Allow" "Block" :allow})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-items]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/tracking-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/mail-from-domain-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.cannot-delete-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/cannot-delete-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.cannot-delete-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.stop-action/scope (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/stop-scope))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.stop-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/stop-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.stop-action/scope] :opt-un [:portkey.aws.email.-2010-12-01.stop-action/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-filter-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-filter))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/template-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 262144))))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.lambda-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/lambda-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.lambda-action/function-arn] :opt-un [:portkey.aws.email.-2010-12-01.lambda-action/topic-arn :portkey.aws.email.-2010-12-01/invocation-type]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.receipt-ip-filter/policy (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-filter-policy))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-ip-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.receipt-ip-filter/policy :portkey.aws.email.-2010-12-01/cidr] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-identity-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.delete-verified-email-address-request/email-address (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/delete-verified-email-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.delete-verified-email-address-request/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/test-render-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/template-name :portkey.aws.email.-2010-12-01/template-data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/recipients-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/recipient))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/remote-mta (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-active-receipt-rule-set-request/rule-set-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/receipt-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.set-active-receipt-rule-set-request/rule-set-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/diagnostic-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/update-configuration-set-reputation-metrics-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/configuration-set-name :portkey.aws.email.-2010-12-01/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-names-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/receipt-rule-name))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bulk-email-destination-status-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/bulk-email-destination-status))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/custom-mail-from-status #{"Failed" :pending "TemporaryFailure" "Success" :success :temporary-failure "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/list-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/identity-type :portkey.aws.email.-2010-12-01/next-token :portkey.aws.email.-2010-12-01/max-items]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.rule-set-does-not-exist-exception/name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/rule-or-rule-set-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01.rule-set-does-not-exist-exception/name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/invalid-template-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.email.-2010-12-01/template-name]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/topic-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/object-key-prefix (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.s-3-action/kms-key-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/s-3-action (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.s-3-action/bucket-name] :opt-un [:portkey.aws.email.-2010-12-01.s-3-action/topic-arn :portkey.aws.email.-2010-12-01.s-3-action/object-key-prefix :portkey.aws.email.-2010-12-01.s-3-action/kms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/max-24-hour-send clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/policy-name-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/policy-name))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/create-receipt-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.set-identity-dkim-enabled-request/dkim-enabled (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/enabled))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/identity :portkey.aws.email.-2010-12-01.set-identity-dkim-enabled-request/dkim-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.get-identity-mail-from-domain-attributes-request/identities (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/identity-list))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.get-identity-mail-from-domain-attributes-request/identities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/rule-or-rule-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-raw-email-response (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01/message-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/verification-token-list (clojure.spec.alpha/coll-of :portkey.aws.email.-2010-12-01/verification-token))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/subject-part (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/bounce-smtp-reply-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/receipt-rule-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bounce-request/original-message-id (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/message-id))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/address))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender-arn (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/send-bounce-request (clojure.spec.alpha/keys :req-un [:portkey.aws.email.-2010-12-01.send-bounce-request/original-message-id :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender :portkey.aws.email.-2010-12-01/bounced-recipient-info-list] :opt-un [:portkey.aws.email.-2010-12-01/explanation :portkey.aws.email.-2010-12-01/message-dsn :portkey.aws.email.-2010-12-01.send-bounce-request/bounce-sender-arn]))

(clojure.spec.alpha/def :portkey.aws.email.-2010-12-01/mail-from-domain-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn update-account-sending-enabled "Enables or disables email sending across your entire Amazon SES account in the\ncurrent AWS Region. You can use this operation in conjunction with Amazon\nCloudWatch alarms to temporarily pause email sending across your Amazon SES\naccount in a given AWS Region when reputation metrics (such as your bounce or\ncomplaint rates) reach certain thresholds.\n You can execute this operation no more than once per second." ([] (update-account-sending-enabled {})) ([update-account-sending-enabled-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-account-sending-enabled-request update-account-sending-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-account-sending-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccountSendingEnabled", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-account-sending-enabled :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/update-account-sending-enabled-request) :ret clojure.core/true?)

(clojure.core/defn delete-verified-email-address "Deprecated. Use the DeleteIdentity operation to delete email addresses and\ndomains." ([delete-verified-email-address-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-verified-email-address-request delete-verified-email-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-verified-email-address-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVerifiedEmailAddress", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-verified-email-address :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-verified-email-address-request) :ret clojure.core/true?)

(clojure.core/defn list-verified-email-addresses "Deprecated. Use the ListIdentities operation to list the email addresses and\ndomains associated with your account." ([] (list-verified-email-addresses {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-verified-email-addresses-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListVerifiedEmailAddressesResult", :http.request.configuration/action "ListVerifiedEmailAddresses", :http.request.configuration/output-deser-fn response-list-verified-email-addresses-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-verified-email-addresses :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-verified-email-addresses-response))

(clojure.core/defn create-configuration-set-tracking-options "Creates an association between a configuration set and a custom domain for open\nand click event tracking.\n By default, images and links used for tracking open and click events are hosted\non domains operated by Amazon SES. You can configure a subdomain of your own to\nhandle these events. For information about using custom domains, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html)." ([create-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-set-tracking-options-request create-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateConfigurationSetTrackingOptionsResult", :http.request.configuration/action "CreateConfigurationSetTrackingOptions", :http.request.configuration/output-deser-fn response-create-configuration-set-tracking-options-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TrackingOptionsAlreadyExistsException" :portkey.aws.email.-2010-12-01/tracking-options-already-exists-exception, "InvalidTrackingOptionsException" :portkey.aws.email.-2010-12-01/invalid-tracking-options-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-configuration-set-tracking-options-response))

(clojure.core/defn set-active-receipt-rule-set "Sets the specified receipt rule set as the active receipt rule set.\n To disable your email-receiving through Amazon SES completely, you can call\nthis API with RuleSetName set to null.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([] (set-active-receipt-rule-set {})) ([set-active-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-active-receipt-rule-set-request set-active-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetActiveReceiptRuleSetResult", :http.request.configuration/action "SetActiveReceiptRuleSet", :http.request.configuration/output-deser-fn response-set-active-receipt-rule-set-response, :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef set-active-receipt-rule-set :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-active-receipt-rule-set-response))

(clojure.core/defn get-identity-mail-from-domain-attributes "Returns the custom MAIL FROM attributes for a list of identities (email\naddresses : domains).\n This operation is throttled at one request per second and can only get custom\nMAIL FROM attributes for up to 100 identities at a time." ([get-identity-mail-from-domain-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-mail-from-domain-attributes-request get-identity-mail-from-domain-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetIdentityMailFromDomainAttributesResult", :http.request.configuration/action "GetIdentityMailFromDomainAttributes", :http.request.configuration/output-deser-fn response-get-identity-mail-from-domain-attributes-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-mail-from-domain-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-mail-from-domain-attributes-response))

(clojure.core/defn send-templated-email "Composes an email message using an email template and immediately queues it for\nsending.\n In order to send email using the SendTemplatedEmail operation, your call to the\nAPI must meet the following requirements:\n * The call must refer to an existing email template. You can create email\ntemplates using the CreateTemplate operation.\n * The message must be sent from a verified email address or domain.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The maximum message size is 10 MB.\n * Calls to the SendTemplatedEmail operation may only include one Destination\nparameter. A destination is a set of recipients who will receive the same\nversion of the email. The Destination parameter can include up to 50 recipients,\nacross the To:, CC: and BCC: fields.\n * The Destination parameter must include at least one recipient email address.\nThe recipient address can be a To: address, a CC: address, or a BCC: address. If\na recipient email address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid.\n If your call to the SendTemplatedEmail operation includes all of the required\nparameters, Amazon SES accepts it and returns a Message ID. However, if Amazon\nSES can't render the email because the template contains errors, it doesn't send\nthe email. Additionally, because it already accepted the message, Amazon SES\ndoesn't return a message stating that it was unable to send the email.\n For these reasons, we highly recommend that you set up Amazon SES to send you\nnotifications when Rendering Failure events occur. For more information, see\nSending Personalized Email Using the Amazon SES API\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html)\nin the Amazon Simple Email Service Developer Guide." ([send-templated-email-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-templated-email-request send-templated-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-templated-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-templated-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendTemplatedEmailResult", :http.request.configuration/action "SendTemplatedEmail", :http.request.configuration/output-deser-fn response-send-templated-email-response, :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-templated-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-templated-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-templated-email-response))

(clojure.core/defn delete-configuration-set-tracking-options "Deletes an association between a configuration set and a custom domain for open\nand click event tracking.\n By default, images and links used for tracking open and click events are hosted\non domains operated by Amazon SES. You can configure a subdomain of your own to\nhandle these events. For information about using custom domains, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html).\n Deleting this kind of association will result in emails sent using the\nspecified configuration set to capture open and click events using the standard,\nAmazon SES-operated domains." ([delete-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-configuration-set-tracking-options-request delete-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteConfigurationSetTrackingOptionsResult", :http.request.configuration/action "DeleteConfigurationSetTrackingOptions", :http.request.configuration/output-deser-fn response-delete-configuration-set-tracking-options-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TrackingOptionsDoesNotExistException" :portkey.aws.email.-2010-12-01/tracking-options-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-configuration-set-tracking-options-response))

(clojure.core/defn set-identity-feedback-forwarding-enabled "Given an identity (an email address or a domain), enables or disables whether\nAmazon SES forwards bounce and complaint notifications as email. Feedback\nforwarding can only be disabled when Amazon Simple Notification Service (Amazon\nSNS) topics are specified for both bounces and complaints.\n Feedback forwarding does not apply to delivery notifications. Delivery\nnotifications are only available through Amazon SNS.\n You can execute this operation no more than once per second.\n For more information about using notifications with Amazon SES, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([set-identity-feedback-forwarding-enabled-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-identity-feedback-forwarding-enabled-request set-identity-feedback-forwarding-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetIdentityFeedbackForwardingEnabledResult", :http.request.configuration/action "SetIdentityFeedbackForwardingEnabled", :http.request.configuration/output-deser-fn response-set-identity-feedback-forwarding-enabled-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-feedback-forwarding-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-feedback-forwarding-enabled-response))

(clojure.core/defn verify-email-address "Deprecated. Use the VerifyEmailIdentity operation to verify a new email address." ([verify-email-address-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-email-address-request verify-email-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-email-address-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "VerifyEmailAddress", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-email-address :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-email-address-request) :ret clojure.core/true?)

(clojure.core/defn get-identity-verification-attributes "Given a list of identities (email addresses and/or domains), returns the\nverification status and (for domain identities) the verification token for each\nidentity.\n The verification status of an email address is \"Pending\" until the email\naddress owner clicks the link within the verification email that Amazon SES sent\nto that address. If the email address owner clicks the link within 24 hours, the\nverification status of the email address changes to \"Success\". If the link is\nnot clicked within 24 hours, the verification status changes to \"Failed.\" In\nthat case, if you still want to verify the email address, you must restart the\nverification process from the beginning.\n For domain identities, the domain's verification status is \"Pending\" as Amazon\nSES searches for the required TXT record in the DNS settings of the domain. When\nAmazon SES detects the record, the domain's verification status changes to\n\"Success\". If Amazon SES is unable to detect the record within 72 hours, the\ndomain's verification status changes to \"Failed.\" In that case, if you still\nwant to verify the domain, you must restart the verification process from the\nbeginning.\n This operation is throttled at one request per second and can only get\nverification attributes for up to 100 identities at a time." ([get-identity-verification-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-verification-attributes-request get-identity-verification-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetIdentityVerificationAttributesResult", :http.request.configuration/action "GetIdentityVerificationAttributes", :http.request.configuration/output-deser-fn response-get-identity-verification-attributes-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-verification-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-verification-attributes-response))

(clojure.core/defn list-custom-verification-email-templates "Lists the existing custom verification email templates for your account in the\ncurrent AWS Region.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([] (list-custom-verification-email-templates {})) ([list-custom-verification-email-templates-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-custom-verification-email-templates-request list-custom-verification-email-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListCustomVerificationEmailTemplatesResult", :http.request.configuration/action "ListCustomVerificationEmailTemplates", :http.request.configuration/output-deser-fn response-list-custom-verification-email-templates-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-custom-verification-email-templates :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-custom-verification-email-templates-response))

(clojure.core/defn delete-custom-verification-email-template "Deletes an existing custom verification email template.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([delete-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-custom-verification-email-template-request delete-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCustomVerificationEmailTemplate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn describe-configuration-set "Returns the details of the specified configuration set. For information about\nusing configuration sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([describe-configuration-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-configuration-set-request describe-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-configuration-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeConfigurationSetResult", :http.request.configuration/action "DescribeConfigurationSet", :http.request.configuration/output-deser-fn response-describe-configuration-set-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/describe-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-configuration-set-response))

(clojure.core/defn delete-template "Deletes an email template.\n You can execute this operation no more than once per second." ([delete-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-template-request delete-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteTemplateResult", :http.request.configuration/action "DeleteTemplate", :http.request.configuration/output-deser-fn response-delete-template-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-template-response))

(clojure.core/defn delete-configuration-set "Deletes a configuration set. Configuration sets enable you to publish email\nsending events. For information about using configuration sets, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([delete-configuration-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-configuration-set-request delete-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteConfigurationSetResult", :http.request.configuration/action "DeleteConfigurationSet", :http.request.configuration/output-deser-fn response-delete-configuration-set-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-configuration-set-response))

(clojure.core/defn test-render-template "Creates a preview of the MIME content of an email when provided with a template\nand a set of replacement data.\n You can execute this operation no more than once per second." ([test-render-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-test-render-template-request test-render-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/test-render-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/test-render-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "TestRenderTemplateResult", :http.request.configuration/action "TestRenderTemplate", :http.request.configuration/output-deser-fn response-test-render-template-response, :http.request.spec/error-spec {"TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "InvalidRenderingParameterException" :portkey.aws.email.-2010-12-01/invalid-rendering-parameter-exception, "MissingRenderingAttributeException" :portkey.aws.email.-2010-12-01/missing-rendering-attribute-exception}})))))
(clojure.spec.alpha/fdef test-render-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/test-render-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/test-render-template-response))

(clojure.core/defn verify-domain-dkim "Returns a set of DKIM tokens for a domain. DKIM tokens are character strings\nthat represent your domain's identity. Using these tokens, you will need to\ncreate DNS CNAME records that point to DKIM public keys hosted by Amazon SES.\nAmazon Web Services will eventually detect that you have updated your DNS\nrecords; this detection process may take up to 72 hours. Upon successful\ndetection, Amazon SES will be able to DKIM-sign email originating from that\ndomain.\n You can execute this operation no more than once per second.\n To enable or disable Easy DKIM signing for a domain, use the\nSetIdentityDkimEnabled operation.\n For more information about creating DNS records using DKIM tokens, go to the\nAmazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html)." ([verify-domain-dkim-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-domain-dkim-request verify-domain-dkim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/verify-domain-dkim-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-domain-dkim-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "VerifyDomainDkimResult", :http.request.configuration/action "VerifyDomainDkim", :http.request.configuration/output-deser-fn response-verify-domain-dkim-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-domain-dkim :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-domain-dkim-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verify-domain-dkim-response))

(clojure.core/defn put-identity-policy "Adds or updates a sending authorization policy for the specified identity (an\nemail address or a domain).\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([put-identity-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-identity-policy-request put-identity-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/put-identity-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/put-identity-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PutIdentityPolicyResult", :http.request.configuration/action "PutIdentityPolicy", :http.request.configuration/output-deser-fn response-put-identity-policy-response, :http.request.spec/error-spec {"InvalidPolicyException" :portkey.aws.email.-2010-12-01/invalid-policy-exception}})))))
(clojure.spec.alpha/fdef put-identity-policy :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/put-identity-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/put-identity-policy-response))

(clojure.core/defn delete-receipt-rule-set "Deletes the specified receipt rule set and all of the receipt rules it contains.\n The currently active rule set cannot be deleted.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([delete-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-receipt-rule-set-request delete-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteReceiptRuleSetResult", :http.request.configuration/action "DeleteReceiptRuleSet", :http.request.configuration/output-deser-fn response-delete-receipt-rule-set-response, :http.request.spec/error-spec {"CannotDeleteException" :portkey.aws.email.-2010-12-01/cannot-delete-exception}})))))
(clojure.spec.alpha/fdef delete-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-receipt-rule-set-response))

(clojure.core/defn list-configuration-sets "Provides a list of the configuration sets associated with your Amazon SES\naccount in the current AWS Region. For information about using configuration\nsets, see Monitoring Your Amazon SES Sending Activity\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second. This operation\nwill return up to 1,000 configuration sets each time it is run. If your Amazon\nSES account has more than 1,000 configuration sets, this operation will also\nreturn a NextToken element. You can then execute the ListConfigurationSets\noperation again, passing the NextToken parameter and the value of the NextToken\nelement to retrieve additional results." ([] (list-configuration-sets {})) ([list-configuration-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-configuration-sets-request list-configuration-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-configuration-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-configuration-sets-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListConfigurationSetsResult", :http.request.configuration/action "ListConfigurationSets", :http.request.configuration/output-deser-fn response-list-configuration-sets-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-configuration-sets :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-configuration-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-configuration-sets-response))

(clojure.core/defn delete-identity-policy "Deletes the specified sending authorization policy for the given identity (an\nemail address or a domain). This API returns successfully even if a policy with\nthe specified name does not exist.\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([delete-identity-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-identity-policy-request delete-identity-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-identity-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-identity-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteIdentityPolicyResult", :http.request.configuration/action "DeleteIdentityPolicy", :http.request.configuration/output-deser-fn response-delete-identity-policy-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-identity-policy :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-identity-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-identity-policy-response))

(clojure.core/defn update-receipt-rule "Updates a receipt rule.\n For information about managing receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html).\n You can execute this operation no more than once per second." ([update-receipt-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-receipt-rule-request update-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateReceiptRuleResult", :http.request.configuration/action "UpdateReceiptRule", :http.request.configuration/output-deser-fn response-update-receipt-rule-response, :http.request.spec/error-spec {"InvalidSnsTopicException" :portkey.aws.email.-2010-12-01/invalid-sns-topic-exception, "InvalidS3ConfigurationException" :portkey.aws.email.-2010-12-01/invalid-s-3-configuration-exception, "InvalidLambdaFunctionException" :portkey.aws.email.-2010-12-01/invalid-lambda-function-exception, "RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-receipt-rule-response))

(clojure.core/defn list-templates "Lists the email templates present in your Amazon SES account in the current AWS\nRegion.\n You can execute this operation no more than once per second." ([] (list-templates {})) ([list-templates-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-templates-request list-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-templates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListTemplatesResult", :http.request.configuration/action "ListTemplates", :http.request.configuration/output-deser-fn response-list-templates-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-templates :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-templates-response))

(clojure.core/defn set-identity-dkim-enabled "Enables or disables Easy DKIM signing of email sent from an identity:\n * If Easy DKIM signing is enabled for a domain name identity (such as\nexample.com), then Amazon SES will DKIM-sign all email sent by addresses under\nthat domain name (for example, user@example.com).\n * If Easy DKIM signing is enabled for an email address, then Amazon SES will\nDKIM-sign all email sent by that email address.\n For email addresses (for example, user@example.com), you can only enable Easy\nDKIM signing if the corresponding domain (in this case, example.com) has been\nset up for Easy DKIM using the AWS Console or the VerifyDomainDkim operation.\n You can execute this operation no more than once per second.\n For more information about Easy DKIM signing, go to the Amazon SES Developer\nGuide (http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html)." ([set-identity-dkim-enabled-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-identity-dkim-enabled-request set-identity-dkim-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetIdentityDkimEnabledResult", :http.request.configuration/action "SetIdentityDkimEnabled", :http.request.configuration/output-deser-fn response-set-identity-dkim-enabled-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-dkim-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-dkim-enabled-response))

(clojure.core/defn get-identity-policies "Returns the requested sending authorization policies for the given identity (an\nemail address or a domain). The policies are returned as a map of policy names\nto policy contents. You can retrieve a maximum of 20 policies at a time.\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([get-identity-policies-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-policies-request get-identity-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetIdentityPoliciesResult", :http.request.configuration/action "GetIdentityPolicies", :http.request.configuration/output-deser-fn response-get-identity-policies-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-policies :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-policies-response))

(clojure.core/defn list-identity-policies "Returns a list of sending authorization policies that are attached to the given\nidentity (an email address or a domain). This API returns only a list. If you\nwant the actual policy content, you can use GetIdentityPolicies.\n This API is for the identity owner only. If you have not verified the identity,\nthis API will return an error.\n Sending authorization is a feature that enables an identity owner to authorize\nother senders to use its identities. For information about using sending\nauthorization, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html).\n You can execute this operation no more than once per second." ([list-identity-policies-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-identity-policies-request list-identity-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-identity-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-identity-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListIdentityPoliciesResult", :http.request.configuration/action "ListIdentityPolicies", :http.request.configuration/output-deser-fn response-list-identity-policies-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-identity-policies :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/list-identity-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-identity-policies-response))

(clojure.core/defn get-account-sending-enabled "Returns the email sending status of the Amazon SES account for the current\nregion.\n You can execute this operation no more than once per second." ([] (get-account-sending-enabled {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-account-sending-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAccountSendingEnabledResult", :http.request.configuration/action "GetAccountSendingEnabled", :http.request.configuration/output-deser-fn response-get-account-sending-enabled-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-account-sending-enabled :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-account-sending-enabled-response))

(clojure.core/defn describe-receipt-rule-set "Returns the details of the specified receipt rule set.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([describe-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-receipt-rule-set-request describe-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeReceiptRuleSetResult", :http.request.configuration/action "DescribeReceiptRuleSet", :http.request.configuration/output-deser-fn response-describe-receipt-rule-set-response, :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-receipt-rule-set-response))

(clojure.core/defn update-configuration-set-reputation-metrics-enabled "Enables or disables the publishing of reputation metrics for emails sent using a\nspecific configuration set in a given AWS Region. Reputation metrics include\nbounce and complaint rates. These metrics are published to Amazon CloudWatch. By\nusing CloudWatch, you can create alarms when bounce or complaint rates exceed\ncertain thresholds.\n You can execute this operation no more than once per second." ([update-configuration-set-reputation-metrics-enabled-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-set-reputation-metrics-enabled-request update-configuration-set-reputation-metrics-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-reputation-metrics-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConfigurationSetReputationMetricsEnabled", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-reputation-metrics-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-reputation-metrics-enabled-request) :ret clojure.core/true?)

(clojure.core/defn send-bulk-templated-email "Composes an email message to multiple destinations. The message body is created\nusing an email template.\n In order to send email using the SendBulkTemplatedEmail operation, your call to\nthe API must meet the following requirements:\n * The call must refer to an existing email template. You can create email\ntemplates using the CreateTemplate operation.\n * The message must be sent from a verified email address or domain.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The maximum message size is 10 MB.\n * Each Destination parameter must include at least one recipient email address.\nThe recipient address can be a To: address, a CC: address, or a BCC: address. If\na recipient email address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid.\n * The message may not include more than 50 recipients, across the To:, CC: and\nBCC: fields. If you need to send an email message to a larger audience, you can\ndivide your recipient list into groups of 50 or fewer, and then call the\nSendBulkTemplatedEmail operation several times to send the message to each\ngroup.\n * The number of destinations you can contact in a single call to the API may be\nlimited by your account's maximum sending rate." ([send-bulk-templated-email-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-bulk-templated-email-request send-bulk-templated-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-bulk-templated-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-bulk-templated-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendBulkTemplatedEmailResult", :http.request.configuration/action "SendBulkTemplatedEmail", :http.request.configuration/output-deser-fn response-send-bulk-templated-email-response, :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-bulk-templated-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-bulk-templated-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-bulk-templated-email-response))

(clojure.core/defn create-configuration-set "Creates a configuration set.\n Configuration sets enable you to publish email sending events. For information\nabout using configuration sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([create-configuration-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-set-request create-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-configuration-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateConfigurationSetResult", :http.request.configuration/action "CreateConfigurationSet", :http.request.configuration/output-deser-fn response-create-configuration-set-response, :http.request.spec/error-spec {"ConfigurationSetAlreadyExistsException" :portkey.aws.email.-2010-12-01/configuration-set-already-exists-exception, "InvalidConfigurationSetException" :portkey.aws.email.-2010-12-01/invalid-configuration-set-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-configuration-set-response))

(clojure.core/defn send-email "Composes an email message and immediately queues it for sending. In order to\nsend email using the SendEmail operation, your message must meet the following\nrequirements:\n * The message must be sent from a verified email address or domain. If you\nattempt to send email using a non-verified address or domain, the operation will\nresult in an \"Email address not verified\" error.\n * If your account is still in the Amazon SES sandbox, you may only send to\nverified addresses or domains, or to email addresses associated with the Amazon\nSES Mailbox Simulator. For more information, see Verifying Email Addresses and\nDomains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n * The maximum message size is 10 MB.\n * The message must include at least one recipient email address. The recipient\naddress can be a To: address, a CC: address, or a BCC: address. If a recipient\nemail address is invalid (that is, it is not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be\nrejected, even if the message contains other recipients that are valid.\n * The message may not include more than 50 recipients, across the To:, CC: and\nBCC: fields. If you need to send an email message to a larger audience, you can\ndivide your recipient list into groups of 50 or fewer, and then call the\nSendEmail operation several times to send the message to each group.\n For every message that you send, the total number of recipients (including each\nrecipient in the To:, CC: and BCC: fields) is counted against the maximum number\nof emails you can send in a 24-hour period (your sending quota). For more\ninformation about sending quotas in Amazon SES, see Managing Your Amazon SES\nSending Limits\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html)\nin the Amazon SES Developer Guide." ([send-email-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-email-request send-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendEmailResult", :http.request.configuration/action "SendEmail", :http.request.configuration/output-deser-fn response-send-email-response, :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-email-response))

(clojure.core/defn update-template "Updates an email template. Email templates enable you to send personalized email\nto one or more destinations in a single API operation. For more information, see\nthe Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html).\n You can execute this operation no more than once per second." ([update-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-template-request update-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateTemplateResult", :http.request.configuration/action "UpdateTemplate", :http.request.configuration/output-deser-fn response-update-template-response, :http.request.spec/error-spec {"TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception, "InvalidTemplateException" :portkey.aws.email.-2010-12-01/invalid-template-exception}})))))
(clojure.spec.alpha/fdef update-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-template-response))

(clojure.core/defn describe-active-receipt-rule-set "Returns the metadata and receipt rules for the receipt rule set that is\ncurrently active.\n For information about setting up receipt rule sets, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html).\n You can execute this operation no more than once per second." ([] (describe-active-receipt-rule-set {})) ([describe-active-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-active-receipt-rule-set-request describe-active-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeActiveReceiptRuleSetResult", :http.request.configuration/action "DescribeActiveReceiptRuleSet", :http.request.configuration/output-deser-fn response-describe-active-receipt-rule-set-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-active-receipt-rule-set :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-active-receipt-rule-set-response))

(clojure.core/defn set-identity-headers-in-notifications-enabled "Given an identity (an email address or a domain), sets whether Amazon SES\nincludes the original email headers in the Amazon Simple Notification Service\n(Amazon SNS) notifications of a specified type.\n You can execute this operation no more than once per second.\n For more information about using notifications with Amazon SES, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([set-identity-headers-in-notifications-enabled-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-identity-headers-in-notifications-enabled-request set-identity-headers-in-notifications-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetIdentityHeadersInNotificationsEnabledResult", :http.request.configuration/action "SetIdentityHeadersInNotificationsEnabled", :http.request.configuration/output-deser-fn response-set-identity-headers-in-notifications-enabled-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-headers-in-notifications-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-headers-in-notifications-enabled-response))

(clojure.core/defn delete-configuration-set-event-destination "Deletes a configuration set event destination. Configuration set event\ndestinations are associated with configuration sets, which enable you to publish\nemail sending events. For information about using configuration sets, see the\nAmazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([delete-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-configuration-set-event-destination-request delete-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteConfigurationSetEventDestinationResult", :http.request.configuration/action "DeleteConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-delete-configuration-set-event-destination-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "EventDestinationDoesNotExistException" :portkey.aws.email.-2010-12-01/event-destination-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-configuration-set-event-destination-response))

(clojure.core/defn create-custom-verification-email-template "Creates a new custom verification email template.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([create-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-custom-verification-email-template-request create-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCustomVerificationEmailTemplate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"CustomVerificationEmailTemplateAlreadyExistsException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-already-exists-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception, "CustomVerificationEmailInvalidContentException" :portkey.aws.email.-2010-12-01/custom-verification-email-invalid-content-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn send-bounce "Generates and sends a bounce message to the sender of an email you received\nthrough Amazon SES. You can only use this API on an email up to 24 hours after\nyou receive it.\n You cannot use this API to send generic bounces for mail that was not received\nby Amazon SES.\n For information about receiving email through Amazon SES, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html).\n You can execute this operation no more than once per second." ([send-bounce-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-bounce-request send-bounce-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-bounce-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-bounce-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendBounceResult", :http.request.configuration/action "SendBounce", :http.request.configuration/output-deser-fn response-send-bounce-response, :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected}})))))
(clojure.spec.alpha/fdef send-bounce :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-bounce-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-bounce-response))

(clojure.core/defn create-receipt-filter "Creates a new IP address filter.\n For information about setting up IP address filters, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html).\n You can execute this operation no more than once per second." ([create-receipt-filter-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-receipt-filter-request create-receipt-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-receipt-filter-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-receipt-filter-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateReceiptFilterResult", :http.request.configuration/action "CreateReceiptFilter", :http.request.configuration/output-deser-fn response-create-receipt-filter-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-receipt-filter :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-receipt-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-receipt-filter-response))

(clojure.core/defn list-identities "Returns a list containing all of the identities (email addresses and domains)\nfor your AWS account in the current AWS Region, regardless of verification\nstatus.\n You can execute this operation no more than once per second." ([] (list-identities {})) ([list-identities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-identities-request list-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-identities-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListIdentitiesResult", :http.request.configuration/action "ListIdentities", :http.request.configuration/output-deser-fn response-list-identities-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-identities :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-identities-response))

(clojure.core/defn set-identity-notification-topic "Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when\ndelivering notifications. When you use this operation, you specify a verified\nidentity, such as an email address or domain. When you send an email that uses\nthe chosen identity in the Source field, Amazon SES sends notifications to the\ntopic you specified. You can send bounce, complaint, or delivery notifications\n(or any combination of the three) to the Amazon SNS topic that you specify.\n You can execute this operation no more than once per second.\n For more information about feedback notification, see the Amazon SES Developer\nGuide (http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([set-identity-notification-topic-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-identity-notification-topic-request set-identity-notification-topic-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-notification-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-notification-topic-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetIdentityNotificationTopicResult", :http.request.configuration/action "SetIdentityNotificationTopic", :http.request.configuration/output-deser-fn response-set-identity-notification-topic-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-notification-topic :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-notification-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-notification-topic-response))

(clojure.core/defn set-identity-mail-from-domain "Enables or disables the custom MAIL FROM domain setup for a verified identity\n(an email address or a domain).\n To send emails using the specified MAIL FROM domain, you must add an MX record\nto your MAIL FROM domain's DNS settings. If you want your emails to pass Sender\nPolicy Framework (SPF) checks, you must also add or update an SPF record. For\nmore information, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html).\n You can execute this operation no more than once per second." ([set-identity-mail-from-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-identity-mail-from-domain-request set-identity-mail-from-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetIdentityMailFromDomainResult", :http.request.configuration/action "SetIdentityMailFromDomain", :http.request.configuration/output-deser-fn response-set-identity-mail-from-domain-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-identity-mail-from-domain :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-identity-mail-from-domain-response))

(clojure.core/defn get-identity-dkim-attributes "Returns the current status of Easy DKIM signing for an entity. For domain name\nidentities, this operation also returns the DKIM tokens that are required for\nEasy DKIM signing, and whether Amazon SES has successfully verified that these\ntokens have been published.\n This operation takes a list of identities as input and returns the following\ninformation for each:\n * Whether Easy DKIM signing is enabled or disabled.\n * A set of DKIM tokens that represent the identity. If the identity is an email\naddress, the tokens represent the domain of that address.\n * Whether Amazon SES has successfully verified the DKIM tokens published in the\ndomain's DNS. This information is only returned for domain name identities, not\nfor email addresses.\n This operation is throttled at one request per second and can only get DKIM\nattributes for up to 100 identities at a time.\n For more information about creating DNS records using DKIM tokens, go to the\nAmazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html)." ([get-identity-dkim-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-dkim-attributes-request get-identity-dkim-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetIdentityDkimAttributesResult", :http.request.configuration/action "GetIdentityDkimAttributes", :http.request.configuration/output-deser-fn response-get-identity-dkim-attributes-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-dkim-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-dkim-attributes-response))

(clojure.core/defn update-configuration-set-sending-enabled "Enables or disables email sending for messages sent using a specific\nconfiguration set in a given AWS Region. You can use this operation in\nconjunction with Amazon CloudWatch alarms to temporarily pause email sending for\na configuration set when the reputation metrics for that configuration set (such\nas your bounce on complaint rate) exceed certain thresholds.\n You can execute this operation no more than once per second." ([update-configuration-set-sending-enabled-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-set-sending-enabled-request update-configuration-set-sending-enabled-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-sending-enabled-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConfigurationSetSendingEnabled", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-sending-enabled :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-sending-enabled-request) :ret clojure.core/true?)

(clojure.core/defn get-send-statistics "Provides sending statistics for the current AWS Region. The result is a list of\ndata points, representing the last two weeks of sending activity. Each data\npoint in the list contains statistics for a 15-minute period of time.\n You can execute this operation no more than once per second." ([] (get-send-statistics {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-send-statistics-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSendStatisticsResult", :http.request.configuration/action "GetSendStatistics", :http.request.configuration/output-deser-fn response-get-send-statistics-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-send-statistics :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-send-statistics-response))

(clojure.core/defn delete-receipt-filter "Deletes the specified IP address filter.\n For information about managing IP address filters, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html).\n You can execute this operation no more than once per second." ([delete-receipt-filter-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-receipt-filter-request delete-receipt-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-receipt-filter-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-receipt-filter-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteReceiptFilterResult", :http.request.configuration/action "DeleteReceiptFilter", :http.request.configuration/output-deser-fn response-delete-receipt-filter-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-receipt-filter :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-receipt-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-receipt-filter-response))

(clojure.core/defn create-template "Creates an email template. Email templates enable you to send personalized email\nto one or more destinations in a single API operation. For more information, see\nthe Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html).\n You can execute this operation no more than once per second." ([create-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-template-request create-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateTemplateResult", :http.request.configuration/action "CreateTemplate", :http.request.configuration/output-deser-fn response-create-template-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "InvalidTemplateException" :portkey.aws.email.-2010-12-01/invalid-template-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-template-response))

(clojure.core/defn update-configuration-set-event-destination "Updates the event destination of a configuration set. Event destinations are\nassociated with configuration sets, which enable you to publish email sending\nevents to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple\nNotification Service (Amazon SNS). For information about using configuration\nsets, see Monitoring Your Amazon SES Sending Activity\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html)\nin the Amazon SES Developer Guide.\n When you create or update an event destination, you must provide one, and only\none, destination. The destination can be Amazon CloudWatch, Amazon Kinesis\nFirehose, or Amazon Simple Notification Service (Amazon SNS).\n You can execute this operation no more than once per second." ([update-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-set-event-destination-request update-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateConfigurationSetEventDestinationResult", :http.request.configuration/action "UpdateConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-update-configuration-set-event-destination-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "EventDestinationDoesNotExistException" :portkey.aws.email.-2010-12-01/event-destination-does-not-exist-exception, "InvalidCloudWatchDestinationException" :portkey.aws.email.-2010-12-01/invalid-cloud-watch-destination-exception, "InvalidFirehoseDestinationException" :portkey.aws.email.-2010-12-01/invalid-firehose-destination-exception, "InvalidSNSDestinationException" :portkey.aws.email.-2010-12-01/invalid-sns-destination-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-configuration-set-event-destination-response))

(clojure.core/defn delete-identity "Deletes the specified identity (an email address or a domain) from the list of\nverified identities.\n You can execute this operation no more than once per second." ([delete-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-identity-request delete-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteIdentityResult", :http.request.configuration/action "DeleteIdentity", :http.request.configuration/output-deser-fn response-delete-identity-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-identity :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-identity-response))

(clojure.core/defn verify-email-identity "Adds an email address to the list of identities for your Amazon SES account in\nthe current AWS region and attempts to verify it. As a result of executing this\noperation, a verification email is sent to the specified address.\n You can execute this operation no more than once per second." ([verify-email-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-email-identity-request verify-email-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/verify-email-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-email-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "VerifyEmailIdentityResult", :http.request.configuration/action "VerifyEmailIdentity", :http.request.configuration/output-deser-fn response-verify-email-identity-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-email-identity :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-email-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verify-email-identity-response))

(clojure.core/defn reorder-receipt-rule-set "Reorders the receipt rules within a receipt rule set.\n All of the rules in the rule set must be represented in this request. That is,\nthis API will return an error if the reorder request doesn't explicitly position\nall of the rules.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([reorder-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-reorder-receipt-rule-set-request reorder-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ReorderReceiptRuleSetResult", :http.request.configuration/action "ReorderReceiptRuleSet", :http.request.configuration/output-deser-fn response-reorder-receipt-rule-set-response, :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef reorder-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/reorder-receipt-rule-set-response))

(clojure.core/defn list-receipt-rule-sets "Lists the receipt rule sets that exist under your AWS account in the current AWS\nRegion. If there are additional receipt rule sets to be retrieved, you will\nreceive a NextToken that you can provide to the next call to ListReceiptRuleSets\nto retrieve the additional entries.\n For information about managing receipt rule sets, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html).\n You can execute this operation no more than once per second." ([] (list-receipt-rule-sets {})) ([list-receipt-rule-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-receipt-rule-sets-request list-receipt-rule-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListReceiptRuleSetsResult", :http.request.configuration/action "ListReceiptRuleSets", :http.request.configuration/output-deser-fn response-list-receipt-rule-sets-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-receipt-rule-sets :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-receipt-rule-sets-response))

(clojure.core/defn describe-receipt-rule "Returns the details of the specified receipt rule.\n For information about setting up receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html).\n You can execute this operation no more than once per second." ([describe-receipt-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-receipt-rule-request describe-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/describe-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeReceiptRuleResult", :http.request.configuration/action "DescribeReceiptRule", :http.request.configuration/output-deser-fn response-describe-receipt-rule-response, :http.request.spec/error-spec {"RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception, "RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/describe-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/describe-receipt-rule-response))

(clojure.core/defn list-receipt-filters "Lists the IP address filters associated with your AWS account in the current AWS\nRegion.\n For information about managing IP address filters, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html).\n You can execute this operation no more than once per second." ([] (list-receipt-filters {})) ([list-receipt-filters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-receipt-filters-request list-receipt-filters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/list-receipt-filters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/list-receipt-filters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListReceiptFiltersResult", :http.request.configuration/action "ListReceiptFilters", :http.request.configuration/output-deser-fn response-list-receipt-filters-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-receipt-filters :args (clojure.spec.alpha/? :portkey.aws.email.-2010-12-01/list-receipt-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/list-receipt-filters-response))

(clojure.core/defn clone-receipt-rule-set "Creates a receipt rule set by cloning an existing one. All receipt rules and\nconfigurations are copied to the new receipt rule set and are completely\nindependent of the source rule set.\n For information about setting up rule sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html).\n You can execute this operation no more than once per second." ([clone-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-clone-receipt-rule-set-request clone-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CloneReceiptRuleSetResult", :http.request.configuration/action "CloneReceiptRuleSet", :http.request.configuration/output-deser-fn response-clone-receipt-rule-set-response, :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef clone-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/clone-receipt-rule-set-response))

(clojure.core/defn get-identity-notification-attributes "Given a list of verified identities (email addresses and/or domains), returns a\nstructure describing identity notification attributes.\n This operation is throttled at one request per second and can only get\nnotification attributes for up to 100 identities at a time.\n For more information about using notifications with Amazon SES, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html)." ([get-identity-notification-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-notification-attributes-request get-identity-notification-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetIdentityNotificationAttributesResult", :http.request.configuration/action "GetIdentityNotificationAttributes", :http.request.configuration/output-deser-fn response-get-identity-notification-attributes-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-identity-notification-attributes :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-identity-notification-attributes-response))

(clojure.core/defn send-custom-verification-email "Adds an email address to the list of identities for your Amazon SES account in\nthe current AWS Region and attempts to verify it. As a result of executing this\noperation, a customized verification email is sent to the specified address.\n To use this operation, you must first create a custom verification email\ntemplate. For more information about creating and using custom verification\nemail templates, see Using Custom Verification Email Templates\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([send-custom-verification-email-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-custom-verification-email-request send-custom-verification-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-custom-verification-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-custom-verification-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendCustomVerificationEmailResult", :http.request.configuration/action "SendCustomVerificationEmail", :http.request.configuration/output-deser-fn response-send-custom-verification-email-response, :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception, "ProductionAccessNotGrantedException" :portkey.aws.email.-2010-12-01/production-access-not-granted-exception}})))))
(clojure.spec.alpha/fdef send-custom-verification-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-custom-verification-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-custom-verification-email-response))

(clojure.core/defn delete-receipt-rule "Deletes the specified receipt rule.\n For information about managing receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html).\n You can execute this operation no more than once per second." ([delete-receipt-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-receipt-rule-request delete-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/delete-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteReceiptRuleResult", :http.request.configuration/action "DeleteReceiptRule", :http.request.configuration/output-deser-fn response-delete-receipt-rule-response, :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef delete-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/delete-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/delete-receipt-rule-response))

(clojure.core/defn get-send-quota "Provides the sending limits for the Amazon SES account.\n You can execute this operation no more than once per second." ([] (get-send-quota {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-send-quota-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSendQuotaResult", :http.request.configuration/action "GetSendQuota", :http.request.configuration/output-deser-fn response-get-send-quota-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-send-quota :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-send-quota-response))

(clojure.core/defn create-configuration-set-event-destination "Creates a configuration set event destination.\n When you create or update an event destination, you must provide one, and only\none, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or\nAmazon Simple Notification Service (Amazon SNS).\n An event destination is the AWS service to which Amazon SES publishes the email\nsending events associated with a configuration set. For information about using\nconfiguration sets, see the Amazon SES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html).\n You can execute this operation no more than once per second." ([create-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-set-event-destination-request create-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateConfigurationSetEventDestinationResult", :http.request.configuration/action "CreateConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-create-configuration-set-event-destination-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "EventDestinationAlreadyExistsException" :portkey.aws.email.-2010-12-01/event-destination-already-exists-exception, "InvalidCloudWatchDestinationException" :portkey.aws.email.-2010-12-01/invalid-cloud-watch-destination-exception, "InvalidFirehoseDestinationException" :portkey.aws.email.-2010-12-01/invalid-firehose-destination-exception, "InvalidSNSDestinationException" :portkey.aws.email.-2010-12-01/invalid-sns-destination-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-configuration-set-event-destination-response))

(clojure.core/defn verify-domain-identity "Adds a domain to the list of identities for your Amazon SES account in the\ncurrent AWS Region and attempts to verify it. For more information about\nverifying domains, see Verifying Email Addresses and Domains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([verify-domain-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-domain-identity-request verify-domain-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/verify-domain-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/verify-domain-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "VerifyDomainIdentityResult", :http.request.configuration/action "VerifyDomainIdentity", :http.request.configuration/output-deser-fn response-verify-domain-identity-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef verify-domain-identity :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/verify-domain-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/verify-domain-identity-response))

(clojure.core/defn get-custom-verification-email-template "Returns the custom email verification template for the template name you\nspecify.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([get-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-custom-verification-email-template-request get-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetCustomVerificationEmailTemplateResult", :http.request.configuration/action "GetCustomVerificationEmailTemplate", :http.request.configuration/output-deser-fn response-get-custom-verification-email-template-response, :http.request.spec/error-spec {"CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-custom-verification-email-template-response))

(clojure.core/defn update-configuration-set-tracking-options "Modifies an association between a configuration set and a custom domain for open\nand click event tracking.\n By default, images and links used for tracking open and click events are hosted\non domains operated by Amazon SES. You can configure a subdomain of your own to\nhandle these events. For information about using custom domains, see the Amazon\nSES Developer Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html)." ([update-configuration-set-tracking-options-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-set-tracking-options-request update-configuration-set-tracking-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateConfigurationSetTrackingOptionsResult", :http.request.configuration/action "UpdateConfigurationSetTrackingOptions", :http.request.configuration/output-deser-fn response-update-configuration-set-tracking-options-response, :http.request.spec/error-spec {"ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "TrackingOptionsDoesNotExistException" :portkey.aws.email.-2010-12-01/tracking-options-does-not-exist-exception, "InvalidTrackingOptionsException" :portkey.aws.email.-2010-12-01/invalid-tracking-options-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-tracking-options :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/update-configuration-set-tracking-options-response))

(clojure.core/defn send-raw-email "Composes an email message and immediately queues it for sending.\n This operation is more flexible than the SendEmail API operation. When you use\nthe SendRawEmail operation, you can specify the headers of the message as well\nas its content. This flexibility is useful, for example, when you want to send a\nmultipart MIME email (such a message that contains both a text and an HTML\nversion). You can also use this operation to send messages that include\nattachments.\n The SendRawEmail operation has the following requirements:\n * You can only send email from verified email addresses or domains\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html).\nIf you try to send email from an address that isn't verified, the operation\nresults in an \"Email address not verified\" error.\n * If your account is still in the Amazon SES sandbox\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html),\nyou can only send email to other verified addresses in your account, or to\naddresses that are associated with the Amazon SES mailbox simulator\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html).\n * The maximum message size, including attachments, is 10 MB.\n * Each message has to include at least one recipient address. A recipient\naddress includes any address on the To:, CC:, or BCC: lines.\n * If you send a single message to more than one recipient address, and one of\nthe recipient addresses isn't in a valid format (that is, it's not in the format\nUserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire\nmessage, even if the other addresses are valid.\n * Each message can include up to 50 recipient addresses across the To:, CC:, or\nBCC: lines. If you need to send a single message to more than 50 recipients, you\nhave to split the list of recipient addresses into groups of less than 50\nrecipients, and send separate messages to each group.\n * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME\nmessage parts. However, if Amazon SES has to modify the contents of your message\n(for example, if you use open and click tracking), 8-bit content isn't\npreserved. For this reason, we highly recommend that you encode all content that\nisn't 7-bit ASCII. For more information, see MIME Encoding\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding)\nin the Amazon SES Developer Guide.\n Additionally, keep the following considerations in mind when using the\nSendRawEmail operation:\n * Although you can customize the message headers when using the SendRawEmail\noperation, Amazon SES will automatically apply its own Message-ID and Date\nheaders; if you passed these headers when creating the message, they will be\noverwritten by the values that Amazon SES provides.\n * If you are using sending authorization to send on behalf of another user,\nSendRawEmail enables you to specify the cross-account identity for the email's\nSource, From, and Return-Path parameters in one of two ways: you can pass\noptional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you\ncan include the following X-headers in the header of your raw email:\n * X-SES-SOURCE-ARN\n * X-SES-FROM-ARN\n * X-SES-RETURN-PATH-ARN\n Do not include these X-headers in the DKIM signature; Amazon SES will remove\nthem before sending the email.\n For most common sending authorization scenarios, we recommend that you specify\nthe SourceIdentityArn parameter and not the FromIdentityArn or\nReturnPathIdentityArn parameters. If you only specify the SourceIdentityArn\nparameter, Amazon SES will set the From and Return Path addresses to the\nidentity specified in SourceIdentityArn. For more information about sending\nauthorization, see the Using Sending Authorization with Amazon SES\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html)\nin the Amazon SES Developer Guide.\n * For every message that you send, the total number of recipients (including\neach recipient in the To:, CC: and BCC: fields) is counted against the maximum\nnumber of emails you can send in a 24-hour period (your sending quota). For more\ninformation about sending quotas in Amazon SES, see Managing Your Amazon SES\nSending Limits\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html)\nin the Amazon SES Developer Guide." ([send-raw-email-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-raw-email-request send-raw-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/send-raw-email-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/send-raw-email-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendRawEmailResult", :http.request.configuration/action "SendRawEmail", :http.request.configuration/output-deser-fn response-send-raw-email-response, :http.request.spec/error-spec {"MessageRejected" :portkey.aws.email.-2010-12-01/message-rejected, "MailFromDomainNotVerifiedException" :portkey.aws.email.-2010-12-01/mail-from-domain-not-verified-exception, "ConfigurationSetDoesNotExistException" :portkey.aws.email.-2010-12-01/configuration-set-does-not-exist-exception, "ConfigurationSetSendingPausedException" :portkey.aws.email.-2010-12-01/configuration-set-sending-paused-exception, "AccountSendingPausedException" :portkey.aws.email.-2010-12-01/account-sending-paused-exception}})))))
(clojure.spec.alpha/fdef send-raw-email :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/send-raw-email-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/send-raw-email-response))

(clojure.core/defn update-custom-verification-email-template "Updates an existing custom verification email template.\n For more information about custom verification email templates, see Using\nCustom Verification Email Templates\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html)\nin the Amazon SES Developer Guide.\n You can execute this operation no more than once per second." ([update-custom-verification-email-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-custom-verification-email-template-request update-custom-verification-email-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/update-custom-verification-email-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCustomVerificationEmailTemplate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"CustomVerificationEmailTemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/custom-verification-email-template-does-not-exist-exception, "FromEmailAddressNotVerifiedException" :portkey.aws.email.-2010-12-01/from-email-address-not-verified-exception, "CustomVerificationEmailInvalidContentException" :portkey.aws.email.-2010-12-01/custom-verification-email-invalid-content-exception}})))))
(clojure.spec.alpha/fdef update-custom-verification-email-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/update-custom-verification-email-template-request) :ret clojure.core/true?)

(clojure.core/defn set-receipt-rule-position "Sets the position of the specified receipt rule in the receipt rule set.\n For information about managing receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html).\n You can execute this operation no more than once per second." ([set-receipt-rule-position-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-receipt-rule-position-request set-receipt-rule-position-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/set-receipt-rule-position-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/set-receipt-rule-position-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetReceiptRulePositionResult", :http.request.configuration/action "SetReceiptRulePosition", :http.request.configuration/output-deser-fn response-set-receipt-rule-position-response, :http.request.spec/error-spec {"RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef set-receipt-rule-position :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/set-receipt-rule-position-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/set-receipt-rule-position-response))

(clojure.core/defn create-receipt-rule-set "Creates an empty receipt rule set.\n For information about setting up receipt rule sets, see the Amazon SES\nDeveloper Guide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html).\n You can execute this operation no more than once per second." ([create-receipt-rule-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-receipt-rule-set-request create-receipt-rule-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-set-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateReceiptRuleSetResult", :http.request.configuration/action "CreateReceiptRuleSet", :http.request.configuration/output-deser-fn response-create-receipt-rule-set-response, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-receipt-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-receipt-rule-set-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-receipt-rule-set-response))

(clojure.core/defn create-receipt-rule "Creates a receipt rule.\n For information about setting up receipt rules, see the Amazon SES Developer\nGuide\n(http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html).\n You can execute this operation no more than once per second." ([create-receipt-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-receipt-rule-request create-receipt-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/create-receipt-rule-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateReceiptRuleResult", :http.request.configuration/action "CreateReceiptRule", :http.request.configuration/output-deser-fn response-create-receipt-rule-response, :http.request.spec/error-spec {"InvalidSnsTopicException" :portkey.aws.email.-2010-12-01/invalid-sns-topic-exception, "InvalidS3ConfigurationException" :portkey.aws.email.-2010-12-01/invalid-s-3-configuration-exception, "InvalidLambdaFunctionException" :portkey.aws.email.-2010-12-01/invalid-lambda-function-exception, "AlreadyExistsException" :portkey.aws.email.-2010-12-01/already-exists-exception, "RuleDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-does-not-exist-exception, "RuleSetDoesNotExistException" :portkey.aws.email.-2010-12-01/rule-set-does-not-exist-exception, "LimitExceededException" :portkey.aws.email.-2010-12-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-receipt-rule :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/create-receipt-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/create-receipt-rule-response))

(clojure.core/defn get-template "Displays the template object (which includes the Subject line, HTML part and\ntext part) for the template you specify.\n You can execute this operation no more than once per second." ([get-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-template-request get-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.email.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.email.-2010-12-01/get-template-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "SES", :http.request.spec/input-spec :portkey.aws.email.-2010-12-01/get-template-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTemplateResult", :http.request.configuration/action "GetTemplate", :http.request.configuration/output-deser-fn response-get-template-response, :http.request.spec/error-spec {"TemplateDoesNotExistException" :portkey.aws.email.-2010-12-01/template-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-template :args (clojure.spec.alpha/tuple :portkey.aws.email.-2010-12-01/get-template-request) :ret (clojure.spec.alpha/and :portkey.aws.email.-2010-12-01/get-template-response))
