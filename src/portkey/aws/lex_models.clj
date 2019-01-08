(ns portkey.aws.lex-models (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-merge-strategy)

(clojure.core/declare ser-slot-list)

(clojure.core/declare ser-lambda-arn)

(clojure.core/declare ser-prompt)

(clojure.core/declare ser-locale)

(clojure.core/declare ser-alias-name-or-list-all)

(clojure.core/declare ser-slot-value-selection-strategy)

(clojure.core/declare ser-prompt-max-attempts)

(clojure.core/declare ser-numerical-version)

(clojure.core/declare ser-statement)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-code-hook)

(clojure.core/declare ser-intent-name)

(clojure.core/declare ser-slot-utterance-list)

(clojure.core/declare ser-response-card)

(clojure.core/declare ser-group-number)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-priority)

(clojure.core/declare ser-status-type)

(clojure.core/declare ser-bot-versions)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-session-ttl)

(clojure.core/declare ser-content-string)

(clojure.core/declare ser-follow-up-prompt)

(clojure.core/declare ser-builtin-intent-signature)

(clojure.core/declare ser-intent-list)

(clojure.core/declare ser-fulfillment-activity-type)

(clojure.core/declare ser-utterance)

(clojure.core/declare ser-value)

(clojure.core/declare ser-description)

(clojure.core/declare ser-message)

(clojure.core/declare ser-slot-type-name)

(clojure.core/declare ser-export-type)

(clojure.core/declare ser-custom-or-builtin-slot-type-name)

(clojure.core/declare ser-enumeration-values)

(clojure.core/declare ser-bot-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-slot)

(clojure.core/declare ser-slot-name)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-fulfillment-activity)

(clojure.core/declare ser-message-list)

(clojure.core/declare ser-slot-constraint)

(clojure.core/declare ser-message-version)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-version)

(clojure.core/declare ser-intent-utterance-list)

(clojure.core/declare ser-enumeration-value)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-alias-name)

(clojure.core/declare ser-name)

(clojure.core/declare ser-bot-channel-name)

(clojure.core/declare ser-process-behavior)

(clojure.core/declare ser-synonym-list)

(clojure.core/declare ser-intent)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-merge-strategy [input] #:http.request.field{:value (clojure.core/get {"OVERWRITE_LATEST" "OVERWRITE_LATEST", :overwrite-latest "OVERWRITE_LATEST", "FAIL_ON_CONFLICT" "FAIL_ON_CONFLICT", :fail-on-conflict "FAIL_ON_CONFLICT"} input), :shape "MergeStrategy"})

(clojure.core/defn- ser-slot-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-slot coll) #:http.request.field{:shape "Slot"}))) input), :shape "SlotList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-lambda-arn [input] #:http.request.field{:value input, :shape "LambdaARN"})

(clojure.core/defn- ser-prompt [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-list (:messages input)) #:http.request.field{:name "messages", :shape "MessageList"}) (clojure.core/into (ser-prompt-max-attempts (:max-attempts input)) #:http.request.field{:name "maxAttempts", :shape "PromptMaxAttempts"})], :shape "Prompt", :type "structure"} (clojure.core/contains? input :response-card) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-card (input :response-card)) #:http.request.field{:name "responseCard", :shape "ResponseCard"}))))

(clojure.core/defn- ser-locale [input] #:http.request.field{:value (clojure.core/get {"en-US" "en-US", :en-us "en-US", "en-GB" "en-GB", :en-gb "en-GB", "de-DE" "de-DE", :de-de "de-DE"} input), :shape "Locale"})

(clojure.core/defn- ser-alias-name-or-list-all [input] #:http.request.field{:value input, :shape "AliasNameOrListAll"})

(clojure.core/defn- ser-slot-value-selection-strategy [input] #:http.request.field{:value (clojure.core/get {"ORIGINAL_VALUE" "ORIGINAL_VALUE", :original-value "ORIGINAL_VALUE", "TOP_RESOLUTION" "TOP_RESOLUTION", :top-resolution "TOP_RESOLUTION"} input), :shape "SlotValueSelectionStrategy"})

(clojure.core/defn- ser-prompt-max-attempts [input] #:http.request.field{:value input, :shape "PromptMaxAttempts"})

(clojure.core/defn- ser-numerical-version [input] #:http.request.field{:value input, :shape "NumericalVersion"})

(clojure.core/defn- ser-statement [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-list (:messages input)) #:http.request.field{:name "messages", :shape "MessageList"})], :shape "Statement", :type "structure"} (clojure.core/contains? input :response-card) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-card (input :response-card)) #:http.request.field{:name "responseCard", :shape "ResponseCard"}))))

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-code-hook [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-arn (:uri input)) #:http.request.field{:name "uri", :shape "LambdaARN"}) (clojure.core/into (ser-message-version (:message-version input)) #:http.request.field{:name "messageVersion", :shape "MessageVersion"})], :shape "CodeHook", :type "structure"}))

(clojure.core/defn- ser-intent-name [input] #:http.request.field{:value input, :shape "IntentName"})

(clojure.core/defn- ser-slot-utterance-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-utterance coll) #:http.request.field{:shape "Utterance"}))) input), :shape "SlotUtteranceList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-response-card [input] #:http.request.field{:value input, :shape "ResponseCard"})

(clojure.core/defn- ser-group-number [input] #:http.request.field{:value input, :shape "GroupNumber"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-priority [input] #:http.request.field{:value input, :shape "Priority"})

(clojure.core/defn- ser-status-type [input] #:http.request.field{:value (clojure.core/get {"Detected" "Detected", :detected "Detected", "Missed" "Missed", :missed "Missed"} input), :shape "StatusType"})

(clojure.core/defn- ser-bot-versions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-version coll) #:http.request.field{:shape "Version"}))) input), :shape "BotVersions", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value (clojure.core/get {"PlainText" "PlainText", :plain-text "PlainText", "SSML" "SSML", :ssml "SSML", "CustomPayload" "CustomPayload", :custom-payload "CustomPayload"} input), :shape "ContentType"})

(clojure.core/defn- ser-session-ttl [input] #:http.request.field{:value input, :shape "SessionTTL"})

(clojure.core/defn- ser-content-string [input] #:http.request.field{:value input, :shape "ContentString"})

(clojure.core/defn- ser-follow-up-prompt [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-prompt (:prompt input)) #:http.request.field{:name "prompt", :shape "Prompt"}) (clojure.core/into (ser-statement (:rejection-statement input)) #:http.request.field{:name "rejectionStatement", :shape "Statement"})], :shape "FollowUpPrompt", :type "structure"}))

(clojure.core/defn- ser-builtin-intent-signature [input] #:http.request.field{:value input, :shape "BuiltinIntentSignature"})

(clojure.core/defn- ser-intent-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-intent coll) #:http.request.field{:shape "Intent"}))) input), :shape "IntentList", :type "list"})

(clojure.core/defn- ser-fulfillment-activity-type [input] #:http.request.field{:value (clojure.core/get {"ReturnIntent" "ReturnIntent", :return-intent "ReturnIntent", "CodeHook" "CodeHook", :code-hook "CodeHook"} input), :shape "FulfillmentActivityType"})

(clojure.core/defn- ser-utterance [input] #:http.request.field{:value input, :shape "Utterance"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-content-type (:content-type input)) #:http.request.field{:name "contentType", :shape "ContentType"}) (clojure.core/into (ser-content-string (:content input)) #:http.request.field{:name "content", :shape "ContentString"})], :shape "Message", :type "structure"} (clojure.core/contains? input :group-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-number (input :group-number)) #:http.request.field{:name "groupNumber", :shape "GroupNumber"}))))

(clojure.core/defn- ser-slot-type-name [input] #:http.request.field{:value input, :shape "SlotTypeName"})

(clojure.core/defn- ser-export-type [input] #:http.request.field{:value (clojure.core/get {"ALEXA_SKILLS_KIT" "ALEXA_SKILLS_KIT", :alexa-skills-kit "ALEXA_SKILLS_KIT", "LEX" "LEX", :lex "LEX"} input), :shape "ExportType"})

(clojure.core/defn- ser-custom-or-builtin-slot-type-name [input] #:http.request.field{:value input, :shape "CustomOrBuiltinSlotTypeName"})

(clojure.core/defn- ser-enumeration-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-enumeration-value coll) #:http.request.field{:shape "EnumerationValue"}))) input), :shape "EnumerationValues", :type "list", :max 10000, :min 1})

(clojure.core/defn- ser-bot-name [input] #:http.request.field{:value input, :shape "BotName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-slot [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-slot-name (:name input)) #:http.request.field{:name "name", :shape "SlotName"}) (clojure.core/into (ser-slot-constraint (:slot-constraint input)) #:http.request.field{:name "slotConstraint", :shape "SlotConstraint"})], :shape "Slot", :type "structure"} (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-priority (input :priority)) #:http.request.field{:name "priority", :shape "Priority"})) (clojure.core/contains? input :response-card) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-card (input :response-card)) #:http.request.field{:name "responseCard", :shape "ResponseCard"})) (clojure.core/contains? input :slot-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-or-builtin-slot-type-name (input :slot-type)) #:http.request.field{:name "slotType", :shape "CustomOrBuiltinSlotTypeName"})) (clojure.core/contains? input :slot-type-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :slot-type-version)) #:http.request.field{:name "slotTypeVersion", :shape "Version"})) (clojure.core/contains? input :sample-utterances) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-utterance-list (input :sample-utterances)) #:http.request.field{:name "sampleUtterances", :shape "SlotUtteranceList"})) (clojure.core/contains? input :value-elicitation-prompt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prompt (input :value-elicitation-prompt)) #:http.request.field{:name "valueElicitationPrompt", :shape "Prompt"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- ser-slot-name [input] #:http.request.field{:value input, :shape "SlotName"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"BOT" "BOT", :bot "BOT", "INTENT" "INTENT", :intent "INTENT", "SLOT_TYPE" "SLOT_TYPE", :slot-type "SLOT_TYPE"} input), :shape "ResourceType"})

(clojure.core/defn- ser-fulfillment-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-fulfillment-activity-type (:type input)) #:http.request.field{:name "type", :shape "FulfillmentActivityType"})], :shape "FulfillmentActivity", :type "structure"} (clojure.core/contains? input :code-hook) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-hook (input :code-hook)) #:http.request.field{:name "codeHook", :shape "CodeHook"}))))

(clojure.core/defn- ser-message-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message coll) #:http.request.field{:shape "Message"}))) input), :shape "MessageList", :type "list", :max 15, :min 1})

(clojure.core/defn- ser-slot-constraint [input] #:http.request.field{:value (clojure.core/get {"Required" "Required", :required "Required", "Optional" "Optional", :optional "Optional"} input), :shape "SlotConstraint"})

(clojure.core/defn- ser-message-version [input] #:http.request.field{:value input, :shape "MessageVersion"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-intent-utterance-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-utterance coll) #:http.request.field{:shape "Utterance"}))) input), :shape "IntentUtteranceList", :type "list", :max 1500, :min 0})

(clojure.core/defn- ser-enumeration-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-value (:value input)) #:http.request.field{:name "value", :shape "Value"})], :shape "EnumerationValue", :type "structure"} (clojure.core/contains? input :synonyms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-synonym-list (input :synonyms)) #:http.request.field{:name "synonyms", :shape "SynonymList"}))))

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-alias-name [input] #:http.request.field{:value input, :shape "AliasName"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-bot-channel-name [input] #:http.request.field{:value input, :shape "BotChannelName"})

(clojure.core/defn- ser-process-behavior [input] #:http.request.field{:value (clojure.core/get {"SAVE" "SAVE", :save "SAVE", "BUILD" "BUILD", :build "BUILD"} input), :shape "ProcessBehavior"})

(clojure.core/defn- ser-synonym-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-value coll) #:http.request.field{:shape "Value"}))) input), :shape "SynonymList", :type "list"})

(clojure.core/defn- ser-intent [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-intent-name (:intent-name input)) #:http.request.field{:name "intentName", :shape "IntentName"}) (clojure.core/into (ser-version (:intent-version input)) #:http.request.field{:name "intentVersion", :shape "Version"})], :shape "Intent", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-put-bot-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-alias-name (input :name)) #:http.request.field{:name "name", :shape "AliasName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})], :body [(clojure.core/into (ser-version (input :bot-version)) #:http.request.field{:name "botVersion", :shape "Version"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-delete-slot-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-get-bots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bot-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "BotName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-bot-channel-associations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-alias-name-or-list-all (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "AliasNameOrListAll", :location "uri", :location-name "aliasName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bot-channel-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "BotChannelName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-put-bot-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale"}) (clojure.core/into (ser-boolean (input :child-directed)) #:http.request.field{:name "childDirected", :shape "Boolean"})]} (clojure.core/contains? input :intents) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-intent-list (input :intents)) #:http.request.field{:name "intents", :shape "IntentList"})) (clojure.core/contains? input :idle-session-ttl-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-ttl (input :idle-session-ttl-in-seconds)) #:http.request.field{:name "idleSessionTTLInSeconds", :shape "SessionTTL"})) (clojure.core/contains? input :clarification-prompt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prompt (input :clarification-prompt)) #:http.request.field{:name "clarificationPrompt", :shape "Prompt"})) (clojure.core/contains? input :process-behavior) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-process-behavior (input :process-behavior)) #:http.request.field{:name "processBehavior", :shape "ProcessBehavior"})) (clojure.core/contains? input :create-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :create-version)) #:http.request.field{:name "createVersion", :shape "Boolean"})) (clojure.core/contains? input :abort-statement) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statement (input :abort-statement)) #:http.request.field{:name "abortStatement", :shape "Statement"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"})) (clojure.core/contains? input :voice-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :voice-id)) #:http.request.field{:name "voiceId", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-create-bot-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-delete-intent-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-put-slot-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :enumeration-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enumeration-values (input :enumeration-values)) #:http.request.field{:name "enumerationValues", :shape "EnumerationValues"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"})) (clojure.core/contains? input :value-selection-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-value-selection-strategy (input :value-selection-strategy)) #:http.request.field{:name "valueSelectionStrategy", :shape "SlotValueSelectionStrategy"})) (clojure.core/contains? input :create-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :create-version)) #:http.request.field{:name "createVersion", :shape "Boolean"}))))

(clojure.core/defn- req-create-intent-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-create-slot-type-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-get-export-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name", :location "querystring", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "querystring", :location-name "version"}) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "resourceType", :shape "ResourceType", :location "querystring", :location-name "resourceType"}) (clojure.core/into (ser-export-type (input :export-type)) #:http.request.field{:name "exportType", :shape "ExportType", :location "querystring", :location-name "exportType"})]}))

(clojure.core/defn- req-get-slot-types-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-type-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "SlotTypeName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-builtin-intents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale", :location "querystring", :location-name "locale"})) (clojure.core/contains? input :signature-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signature-contains)) #:http.request.field{:name "signatureContains", :shape "String", :location "querystring", :location-name "signatureContains"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-bot-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-alias-name (input :name)) #:http.request.field{:name "name", :shape "AliasName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})]}))

(clojure.core/defn- req-delete-slot-type-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-delete-bot-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-get-bot-channel-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-channel-name (input :name)) #:http.request.field{:name "name", :shape "BotChannelName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-alias-name (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "AliasName", :location "uri", :location-name "aliasName"})]}))

(clojure.core/defn- req-get-intents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-intent-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "IntentName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-bot-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-slot-type-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-builtin-slot-types-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale", :location "querystring", :location-name "locale"})) (clojure.core/contains? input :signature-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signature-contains)) #:http.request.field{:name "signatureContains", :shape "String", :location "querystring", :location-name "signatureContains"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-builtin-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-builtin-intent-signature (input :signature)) #:http.request.field{:name "signature", :shape "BuiltinIntentSignature", :location "uri", :location-name "signature"})]}))

(clojure.core/defn- req-delete-utterances-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "userId", :shape "UserId", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-start-import-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-blob (input :payload)) #:http.request.field{:name "payload", :shape "Blob"}) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "resourceType", :shape "ResourceType"}) (clojure.core/into (ser-merge-strategy (input :merge-strategy)) #:http.request.field{:name "mergeStrategy", :shape "MergeStrategy"})]}))

(clojure.core/defn- req-delete-bot-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-delete-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-delete-bot-channel-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-channel-name (input :name)) #:http.request.field{:name "name", :shape "BotChannelName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-alias-name (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "AliasName", :location "uri", :location-name "aliasName"})]}))

(clojure.core/defn- req-get-intent-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-put-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :follow-up-prompt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-follow-up-prompt (input :follow-up-prompt)) #:http.request.field{:name "followUpPrompt", :shape "FollowUpPrompt"})) (clojure.core/contains? input :fulfillment-activity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fulfillment-activity (input :fulfillment-activity)) #:http.request.field{:name "fulfillmentActivity", :shape "FulfillmentActivity"})) (clojure.core/contains? input :slots) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-list (input :slots)) #:http.request.field{:name "slots", :shape "SlotList"})) (clojure.core/contains? input :parent-intent-signature) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-builtin-intent-signature (input :parent-intent-signature)) #:http.request.field{:name "parentIntentSignature", :shape "BuiltinIntentSignature"})) (clojure.core/contains? input :confirmation-prompt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prompt (input :confirmation-prompt)) #:http.request.field{:name "confirmationPrompt", :shape "Prompt"})) (clojure.core/contains? input :rejection-statement) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statement (input :rejection-statement)) #:http.request.field{:name "rejectionStatement", :shape "Statement"})) (clojure.core/contains? input :create-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :create-version)) #:http.request.field{:name "createVersion", :shape "Boolean"})) (clojure.core/contains? input :dialog-code-hook) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-hook (input :dialog-code-hook)) #:http.request.field{:name "dialogCodeHook", :shape "CodeHook"})) (clojure.core/contains? input :conclusion-statement) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statement (input :conclusion-statement)) #:http.request.field{:name "conclusionStatement", :shape "Statement"})) (clojure.core/contains? input :sample-utterances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-intent-utterance-list (input :sample-utterances)) #:http.request.field{:name "sampleUtterances", :shape "IntentUtteranceList"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-get-slot-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-get-bot-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"}) (clojure.core/into (ser-string (input :version-or-alias)) #:http.request.field{:name "versionOrAlias", :shape "String", :location "uri", :location-name "versionoralias"})]}))

(clojure.core/defn- req-get-bot-aliases-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "AliasName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-import-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :import-id)) #:http.request.field{:name "importId", :shape "String", :location "uri", :location-name "importId"})]}))

(clojure.core/defn- req-get-bot-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-alias-name (input :name)) #:http.request.field{:name "name", :shape "AliasName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})]}))

(clojure.core/defn- req-get-utterances-view-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botname"})], :querystring [(clojure.core/into (ser-bot-versions (input :bot-versions)) #:http.request.field{:name "botVersions", :shape "BotVersions", :location "querystring", :location-name "bot_versions"}) (clojure.core/into (ser-status-type (input :status-type)) #:http.request.field{:name "statusType", :shape "StatusType", :location "querystring", :location-name "status_type"})]}))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-metadata/name :portkey.aws.lex-models.bot-metadata/description :portkey.aws.lex-models.bot-metadata/status :portkey.aws.lex-models.bot-metadata/last-updated-date :portkey.aws.lex-models.bot-metadata/created-date :portkey.aws.lex-models.bot-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/merge-strategy #{:fail-on-conflict "FAIL_ON_CONFLICT" :overwrite-latest "OVERWRITE_LATEST"})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bots-response/bots :portkey.aws.lex-models.get-bots-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/slot :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-alias-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-alias-metadata/name :portkey.aws.lex-models.bot-alias-metadata/description :portkey.aws.lex-models.bot-alias-metadata/bot-version :portkey.aws.lex-models.bot-alias-metadata/bot-name :portkey.aws.lex-models.bot-alias-metadata/last-updated-date :portkey.aws.lex-models.bot-alias-metadata/created-date :portkey.aws.lex-models.bot-alias-metadata/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-bot-alias-request/name :portkey.aws.lex-models.put-bot-alias-request/bot-version :portkey.aws.lex-models.put-bot-alias-request/bot-name] :opt-un [:portkey.aws.lex-models.put-bot-alias-request/description :portkey.aws.lex-models.put-bot-alias-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/string-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/string))

(clojure.spec.alpha/def :portkey.aws.lex-models/locale-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/locale))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-slot-type-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-intent-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.resource-reference/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.resource-reference/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/resource-reference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.resource-reference/name :portkey.aws.lex-models.resource-reference/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/lambda-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 20 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA-Z0-9-_]+(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(:[a-zA-Z0-9-_]+)?" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-response/bot-aliases (clojure.spec.alpha/and :portkey.aws.lex-models/bot-alias-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-aliases-response/bot-aliases :portkey.aws.lex-models.get-bot-aliases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/export-type (clojure.spec.alpha/and :portkey.aws.lex-models/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/export-status (clojure.spec.alpha/and :portkey.aws.lex-models/export-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/url (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-export-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-export-response/name :portkey.aws.lex-models.get-export-response/version :portkey.aws.lex-models.get-export-response/resource-type :portkey.aws.lex-models.get-export-response/export-type :portkey.aws.lex-models.get-export-response/export-status :portkey.aws.lex-models.get-export-response/failure-reason :portkey.aws.lex-models.get-export-response/url]))

(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/messages (clojure.spec.alpha/and :portkey.aws.lex-models/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/max-attempts (clojure.spec.alpha/and :portkey.aws.lex-models/prompt-max-attempts))
(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models/prompt (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.prompt/messages :portkey.aws.lex-models.prompt/max-attempts] :opt-un [:portkey.aws.lex-models.prompt/response-card]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-bot-response/intents :portkey.aws.lex-models.put-bot-response/created-date :portkey.aws.lex-models.put-bot-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.put-bot-response/clarification-prompt :portkey.aws.lex-models.put-bot-response/name :portkey.aws.lex-models.put-bot-response/locale :portkey.aws.lex-models.put-bot-response/last-updated-date :portkey.aws.lex-models.put-bot-response/status :portkey.aws.lex-models.put-bot-response/create-version :portkey.aws.lex-models.put-bot-response/abort-statement :portkey.aws.lex-models.put-bot-response/version :portkey.aws.lex-models.put-bot-response/failure-reason :portkey.aws.lex-models.put-bot-response/child-directed :portkey.aws.lex-models.put-bot-response/checksum :portkey.aws.lex-models.put-bot-response/voice-id :portkey.aws.lex-models.put-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/import-status #{"IN_PROGRESS" :in-progress "COMPLETE" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/type (clojure.spec.alpha/and :portkey.aws.lex-models/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-association-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-channel-association-response/bot-alias :portkey.aws.lex-models.get-bot-channel-association-response/created-date :portkey.aws.lex-models.get-bot-channel-association-response/name :portkey.aws.lex-models.get-bot-channel-association-response/status :portkey.aws.lex-models.get-bot-channel-association-response/bot-configuration :portkey.aws.lex-models.get-bot-channel-association-response/bot-name :portkey.aws.lex-models.get-bot-channel-association-response/type :portkey.aws.lex-models.get-bot-channel-association-response/failure-reason :portkey.aws.lex-models.get-bot-channel-association-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-configuration-map (clojure.spec.alpha/map-of :portkey.aws.lex-models/string :portkey.aws.lex-models/string))

(clojure.spec.alpha/def :portkey.aws.lex-models.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/precondition-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-bot-alias-response/name :portkey.aws.lex-models.put-bot-alias-response/description :portkey.aws.lex-models.put-bot-alias-response/bot-version :portkey.aws.lex-models.put-bot-alias-response/bot-name :portkey.aws.lex-models.put-bot-alias-response/last-updated-date :portkey.aws.lex-models.put-bot-alias-response/created-date :portkey.aws.lex-models.put-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/export-status #{:ready "IN_PROGRESS" :in-progress "READY" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bots-request/next-token :portkey.aws.lex-models.get-bots-request/max-results :portkey.aws.lex-models.get-bots-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models/locale #{"de-DE" :en-gb :de-de "en-US" "en-GB" :en-us})

(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/utterance-string (clojure.spec.alpha/and :portkey.aws.lex-models/utterance-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/count (clojure.spec.alpha/and :portkey.aws.lex-models/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/distinct-users (clojure.spec.alpha/and :portkey.aws.lex-models/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/first-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/last-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.utterance-data/utterance-string :portkey.aws.lex-models.utterance-data/count :portkey.aws.lex-models.utterance-data/distinct-users :portkey.aws.lex-models.utterance-data/first-uttered-date :portkey.aws.lex-models.utterance-data/last-uttered-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models/alias-name-or-list-all (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^(-|^([A-Za-z]_?)+$)$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name-or-list-all))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-associations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-channel-associations-request/bot-name :portkey.aws.lex-models.get-bot-channel-associations-request/bot-alias] :opt-un [:portkey.aws.lex-models.get-bot-channel-associations-request/next-token :portkey.aws.lex-models.get-bot-channel-associations-request/max-results :portkey.aws.lex-models.get-bot-channel-associations-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/process-behavior (clojure.spec.alpha/and :portkey.aws.lex-models/process-behavior))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-bot-request/name :portkey.aws.lex-models.put-bot-request/locale :portkey.aws.lex-models.put-bot-request/child-directed] :opt-un [:portkey.aws.lex-models.put-bot-request/intents :portkey.aws.lex-models.put-bot-request/idle-session-ttl-in-seconds :portkey.aws.lex-models.put-bot-request/clarification-prompt :portkey.aws.lex-models.put-bot-request/process-behavior :portkey.aws.lex-models.put-bot-request/create-version :portkey.aws.lex-models.put-bot-request/abort-statement :portkey.aws.lex-models.put-bot-request/checksum :portkey.aws.lex-models.put-bot-request/voice-id :portkey.aws.lex-models.put-bot-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-value-selection-strategy #{:original-value "ORIGINAL_VALUE" :top-resolution "TOP_RESOLUTION"})

(clojure.spec.alpha/def :portkey.aws.lex-models/prompt-max-attempts (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-intent-slot))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-bot-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.create-bot-version-request/name] :opt-un [:portkey.aws.lex-models.create-bot-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/numerical-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-list/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-list/utterances (clojure.spec.alpha/and :portkey.aws.lex-models/list-of-utterance))
(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.utterance-list/bot-version :portkey.aws.lex-models.utterance-list/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-response/utterances (clojure.spec.alpha/and :portkey.aws.lex-models/lists-of-utterances))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-utterances-view-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-utterances-view-response/bot-name :portkey.aws.lex-models.get-utterances-view-response/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-slot-type-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.create-slot-type-version-response/name :portkey.aws.lex-models.create-slot-type-version-response/description :portkey.aws.lex-models.create-slot-type-version-response/enumeration-values :portkey.aws.lex-models.create-slot-type-version-response/last-updated-date :portkey.aws.lex-models.create-slot-type-version-response/created-date :portkey.aws.lex-models.create-slot-type-version-response/version :portkey.aws.lex-models.create-slot-type-version-response/checksum :portkey.aws.lex-models.create-slot-type-version-response/value-selection-strategy]))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-intent-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-intent-version-request/name :portkey.aws.lex-models.delete-intent-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-slot-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-slot-types-response/slot-types :portkey.aws.lex-models.get-builtin-slot-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.statement/messages (clojure.spec.alpha/and :portkey.aws.lex-models/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.statement/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models/statement (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.statement/messages] :opt-un [:portkey.aws.lex-models.statement/response-card]))

(clojure.spec.alpha/def :portkey.aws.lex-models/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 2 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-slot-type-request/name] :opt-un [:portkey.aws.lex-models.put-slot-type-request/description :portkey.aws.lex-models.put-slot-type-request/enumeration-values :portkey.aws.lex-models.put-slot-type-request/checksum :portkey.aws.lex-models.put-slot-type-request/value-selection-strategy :portkey.aws.lex-models.put-slot-type-request/create-version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-intent-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.create-intent-version-request/name] :opt-un [:portkey.aws.lex-models.create-intent-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.resource-in-use-exception/reference-type (clojure.spec.alpha/and :portkey.aws.lex-models/reference-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.resource-in-use-exception/example-reference (clojure.spec.alpha/and :portkey.aws.lex-models/resource-reference))
(clojure.spec.alpha/def :portkey.aws.lex-models/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.resource-in-use-exception/reference-type :portkey.aws.lex-models.resource-in-use-exception/example-reference]))

(clojure.spec.alpha/def :portkey.aws.lex-models.code-hook/uri (clojure.spec.alpha/and :portkey.aws.lex-models/lambda-arn))
(clojure.spec.alpha/def :portkey.aws.lex-models.code-hook/message-version (clojure.spec.alpha/and :portkey.aws.lex-models/message-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/code-hook (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.code-hook/uri :portkey.aws.lex-models.code-hook/message-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.limit-exceeded-exception/retry-after-seconds :portkey.aws.lex-models.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-slot-type-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.create-slot-type-version-request/name] :opt-un [:portkey.aws.lex-models.create-slot-type-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.lex-models/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-export-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-export-request/name :portkey.aws.lex-models.get-export-request/version :portkey.aws.lex-models.get-export-request/resource-type :portkey.aws.lex-models.get-export-request/export-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-types-request/next-token :portkey.aws.lex-models.get-slot-types-request/max-results :portkey.aws.lex-models.get-slot-types-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models/response-card (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intents-request/locale :portkey.aws.lex-models.get-builtin-intents-request/signature-contains :portkey.aws.lex-models.get-builtin-intents-request/next-token :portkey.aws.lex-models.get-builtin-intents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-alias-request/name :portkey.aws.lex-models.delete-bot-alias-request/bot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/status #{"READY_BASIC_TESTING" :ready-basic-testing "NOT_BUILT" :ready :building :not-built "READY" "BUILDING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/start-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.start-import-response/name :portkey.aws.lex-models.start-import-response/resource-type :portkey.aws.lex-models.start-import-response/merge-strategy :portkey.aws.lex-models.start-import-response/import-id :portkey.aws.lex-models.start-import-response/import-status :portkey.aws.lex-models.start-import-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models/group-number (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.lex-models/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models/priority (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.lex-models/status-type #{"Detected" :missed "Missed" :detected})

(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-slot-type-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-slot-type-version-request/name :portkey.aws.lex-models.delete-slot-type-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-version-request/name :portkey.aws.lex-models.delete-bot-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-versions (clojure.spec.alpha/coll-of :portkey.aws.lex-models/version :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lex-models/content-type #{:custom-payload :ssml :plain-text "PlainText" "CustomPayload" "SSML"})

(clojure.spec.alpha/def :portkey.aws.lex-models/session-ttl (clojure.spec.alpha/int-in 60 86400))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-alias-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-alias-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models/content-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.follow-up-prompt/prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.follow-up-prompt/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models/follow-up-prompt (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.follow-up-prompt/prompt :portkey.aws.lex-models.follow-up-prompt/rejection-statement] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-channel-association-request/name :portkey.aws.lex-models.get-bot-channel-association-request/bot-name :portkey.aws.lex-models.get-bot-channel-association-request/bot-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-import-response/name :portkey.aws.lex-models.get-import-response/resource-type :portkey.aws.lex-models.get-import-response/merge-strategy :portkey.aws.lex-models.get-import-response/import-id :portkey.aws.lex-models.get-import-response/import-status :portkey.aws.lex-models.get-import-response/failure-reason :portkey.aws.lex-models.get-import-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-slot/name (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-slot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-intent-slot/name]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-bot-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.create-bot-version-response/intents :portkey.aws.lex-models.create-bot-version-response/created-date :portkey.aws.lex-models.create-bot-version-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.create-bot-version-response/clarification-prompt :portkey.aws.lex-models.create-bot-version-response/name :portkey.aws.lex-models.create-bot-version-response/locale :portkey.aws.lex-models.create-bot-version-response/last-updated-date :portkey.aws.lex-models.create-bot-version-response/status :portkey.aws.lex-models.create-bot-version-response/abort-statement :portkey.aws.lex-models.create-bot-version-response/version :portkey.aws.lex-models.create-bot-version-response/failure-reason :portkey.aws.lex-models.create-bot-version-response/child-directed :portkey.aws.lex-models.create-bot-version-response/checksum :portkey.aws.lex-models.create-bot-version-response/voice-id :portkey.aws.lex-models.create-bot-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intents-request/next-token :portkey.aws.lex-models.get-intents-request/max-results :portkey.aws.lex-models.get-intents-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-type-versions-response/slot-types :portkey.aws.lex-models.get-slot-type-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-versions-request/name] :opt-un [:portkey.aws.lex-models.get-bot-versions-request/next-token :portkey.aws.lex-models.get-bot-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intent-versions-response/intents :portkey.aws.lex-models.get-intent-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-slot-type-versions-request/name] :opt-un [:portkey.aws.lex-models.get-slot-type-versions-request/next-token :portkey.aws.lex-models.get-slot-type-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-response/intents :portkey.aws.lex-models.get-bot-response/created-date :portkey.aws.lex-models.get-bot-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.get-bot-response/clarification-prompt :portkey.aws.lex-models.get-bot-response/name :portkey.aws.lex-models.get-bot-response/locale :portkey.aws.lex-models.get-bot-response/last-updated-date :portkey.aws.lex-models.get-bot-response/status :portkey.aws.lex-models.get-bot-response/abort-statement :portkey.aws.lex-models.get-bot-response/version :portkey.aws.lex-models.get-bot-response/failure-reason :portkey.aws.lex-models.get-bot-response/child-directed :portkey.aws.lex-models.get-bot-response/checksum :portkey.aws.lex-models.get-bot-response/voice-id :portkey.aws.lex-models.get-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-slot-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-slot-types-request/locale :portkey.aws.lex-models.get-builtin-slot-types-request/signature-contains :portkey.aws.lex-models.get-builtin-slot-types-request/next-token :portkey.aws.lex-models.get-builtin-slot-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/intent))

(clojure.spec.alpha/def :portkey.aws.lex-models/fulfillment-activity-type #{:code-hook "ReturnIntent" "CodeHook" :return-intent})

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-association-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-channel-association))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intents-response/intents :portkey.aws.lex-models.get-intents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models/utterance (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.lex-models/list-of-utterance (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance-data))

(clojure.spec.alpha/def :portkey.aws.lex-models/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-slot-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-slot-type-response/value-selection-strategy :portkey.aws.lex-models.put-slot-type-response/created-date :portkey.aws.lex-models.put-slot-type-response/name :portkey.aws.lex-models.put-slot-type-response/enumeration-values :portkey.aws.lex-models.put-slot-type-response/last-updated-date :portkey.aws.lex-models.put-slot-type-response/create-version :portkey.aws.lex-models.put-slot-type-response/version :portkey.aws.lex-models.put-slot-type-response/checksum :portkey.aws.lex-models.put-slot-type-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-response/bot-channel-associations (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-association-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-associations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-channel-associations-response/bot-channel-associations :portkey.aws.lex-models.get-bot-channel-associations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.message/content-type (clojure.spec.alpha/and :portkey.aws.lex-models/content-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.message/content (clojure.spec.alpha/and :portkey.aws.lex-models/content-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.message/group-number (clojure.spec.alpha/and :portkey.aws.lex-models/group-number))
(clojure.spec.alpha/def :portkey.aws.lex-models/message (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.message/content-type :portkey.aws.lex-models.message/content] :opt-un [:portkey.aws.lex-models.message/group-number]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-request/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-builtin-intent-request/signature] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models/export-type #{"ALEXA_SKILLS_KIT" :lex "LEX" :alexa-skills-kit})

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-utterances-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-utterances-request/user-id (clojure.spec.alpha/and :portkey.aws.lex-models/user-id))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-utterances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-utterances-request/bot-name :portkey.aws.lex-models.delete-utterances-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/custom-or-builtin-slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^((AMAZON\.)_?|[A-Za-z]_?)+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/enumeration-values (clojure.spec.alpha/coll-of :portkey.aws.lex-models/enumeration-value :min-count 1 :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 2 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 50)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.slot/priority (clojure.spec.alpha/and :portkey.aws.lex-models/priority))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/slot-type (clojure.spec.alpha/and :portkey.aws.lex-models/custom-or-builtin-slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/slot-constraint (clojure.spec.alpha/and :portkey.aws.lex-models/slot-constraint))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/slot-type-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/slot-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/value-elicitation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/slot (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.slot/name :portkey.aws.lex-models.slot/slot-constraint] :opt-un [:portkey.aws.lex-models.slot/priority :portkey.aws.lex-models.slot/response-card :portkey.aws.lex-models.slot/slot-type :portkey.aws.lex-models.slot/slot-type-version :portkey.aws.lex-models.slot/sample-utterances :portkey.aws.lex-models.slot/value-elicitation-prompt :portkey.aws.lex-models.slot/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/payload (clojure.spec.alpha/and :portkey.aws.lex-models/blob))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/start-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.start-import-request/payload :portkey.aws.lex-models.start-import-request/resource-type :portkey.aws.lex-models.start-import-request/merge-strategy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-slot-type-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([A-Za-z](-|_|.)?)+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/resource-type #{:bot "SLOT_TYPE" "INTENT" :slot-type :intent "BOT"})

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-intent-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-intent-response/follow-up-prompt :portkey.aws.lex-models.put-intent-response/fulfillment-activity :portkey.aws.lex-models.put-intent-response/slots :portkey.aws.lex-models.put-intent-response/parent-intent-signature :portkey.aws.lex-models.put-intent-response/confirmation-prompt :portkey.aws.lex-models.put-intent-response/created-date :portkey.aws.lex-models.put-intent-response/name :portkey.aws.lex-models.put-intent-response/rejection-statement :portkey.aws.lex-models.put-intent-response/last-updated-date :portkey.aws.lex-models.put-intent-response/create-version :portkey.aws.lex-models.put-intent-response/dialog-code-hook :portkey.aws.lex-models.put-intent-response/conclusion-statement :portkey.aws.lex-models.put-intent-response/sample-utterances :portkey.aws.lex-models.put-intent-response/version :portkey.aws.lex-models.put-intent-response/checksum :portkey.aws.lex-models.put-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-channel-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-channel-association-request/name :portkey.aws.lex-models.delete-bot-channel-association-request/bot-name :portkey.aws.lex-models.delete-bot-channel-association-request/bot-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.fulfillment-activity/type (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.fulfillment-activity/code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models/fulfillment-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.fulfillment-activity/type] :opt-un [:portkey.aws.lex-models.fulfillment-activity/code-hook]))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-status #{"IN_PROGRESS" :in-progress :created "FAILED" :failed "CREATED"})

(clojure.spec.alpha/def :portkey.aws.lex-models/message-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/message :min-count 1 :max-count 15))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-intent-versions-request/name] :opt-un [:portkey.aws.lex-models.get-intent-versions-request/next-token :portkey.aws.lex-models.get-intent-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-intent-request/name :portkey.aws.lex-models.get-intent-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intent-response/follow-up-prompt :portkey.aws.lex-models.get-intent-response/fulfillment-activity :portkey.aws.lex-models.get-intent-response/slots :portkey.aws.lex-models.get-intent-response/parent-intent-signature :portkey.aws.lex-models.get-intent-response/confirmation-prompt :portkey.aws.lex-models.get-intent-response/created-date :portkey.aws.lex-models.get-intent-response/name :portkey.aws.lex-models.get-intent-response/rejection-statement :portkey.aws.lex-models.get-intent-response/last-updated-date :portkey.aws.lex-models.get-intent-response/dialog-code-hook :portkey.aws.lex-models.get-intent-response/conclusion-statement :portkey.aws.lex-models.get-intent-response/sample-utterances :portkey.aws.lex-models.get-intent-response/version :portkey.aws.lex-models.get-intent-response/checksum :portkey.aws.lex-models.get-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/intent-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.intent-metadata/name :portkey.aws.lex-models.intent-metadata/description :portkey.aws.lex-models.intent-metadata/last-updated-date :portkey.aws.lex-models.intent-metadata/created-date :portkey.aws.lex-models.intent-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-constraint #{"Required" :optional "Optional" :required})

(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.slot-type-metadata/name :portkey.aws.lex-models.slot-type-metadata/description :portkey.aws.lex-models.slot-type-metadata/last-updated-date :portkey.aws.lex-models.slot-type-metadata/created-date :portkey.aws.lex-models.slot-type-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/intent-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models/message-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/slot-type-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-intent-request/name] :opt-un [:portkey.aws.lex-models.put-intent-request/follow-up-prompt :portkey.aws.lex-models.put-intent-request/fulfillment-activity :portkey.aws.lex-models.put-intent-request/slots :portkey.aws.lex-models.put-intent-request/parent-intent-signature :portkey.aws.lex-models.put-intent-request/confirmation-prompt :portkey.aws.lex-models.put-intent-request/rejection-statement :portkey.aws.lex-models.put-intent-request/create-version :portkey.aws.lex-models.put-intent-request/dialog-code-hook :portkey.aws.lex-models.put-intent-request/conclusion-statement :portkey.aws.lex-models.put-intent-request/sample-utterances :portkey.aws.lex-models.put-intent-request/checksum :portkey.aws.lex-models.put-intent-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/reference-type #{:bot :bot-channel "BotAlias" "BotChannel" :intent :bot-alias "Bot" "Intent"})

(clojure.spec.alpha/def :portkey.aws.lex-models/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.lex-models/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"\$LATEST|[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-intent-metadata/signature :portkey.aws.lex-models.builtin-intent-metadata/supported-locales]))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance :min-count 0 :max-count 1500))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intent-response/signature :portkey.aws.lex-models.get-builtin-intent-response/supported-locales :portkey.aws.lex-models.get-builtin-intent-response/slots]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-slot-type-request/name :portkey.aws.lex-models.get-slot-type-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.enumeration-value/value (clojure.spec.alpha/and :portkey.aws.lex-models/value))
(clojure.spec.alpha/def :portkey.aws.lex-models.enumeration-value/synonyms (clojure.spec.alpha/and :portkey.aws.lex-models/synonym-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/enumeration-value (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.enumeration-value/value] :opt-un [:portkey.aws.lex-models.enumeration-value/synonyms]))

(clojure.spec.alpha/def :portkey.aws.lex-models/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lex-models/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-alias-response/name :portkey.aws.lex-models.get-bot-alias-response/description :portkey.aws.lex-models.get-bot-alias-response/bot-version :portkey.aws.lex-models.get-bot-alias-response/bot-name :portkey.aws.lex-models.get-bot-alias-response/last-updated-date :portkey.aws.lex-models.get-bot-alias-response/created-date :portkey.aws.lex-models.get-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-type-response/name :portkey.aws.lex-models.get-slot-type-response/description :portkey.aws.lex-models.get-slot-type-response/enumeration-values :portkey.aws.lex-models.get-slot-type-response/last-updated-date :portkey.aws.lex-models.get-slot-type-response/created-date :portkey.aws.lex-models.get-slot-type-response/version :portkey.aws.lex-models.get-slot-type-response/checksum :portkey.aws.lex-models.get-slot-type-response/value-selection-strategy]))

(clojure.spec.alpha/def :portkey.aws.lex-models/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z_]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-versions-response/bots :portkey.aws.lex-models.get-bot-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-request/version-or-alias (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-request/name :portkey.aws.lex-models.get-bot-request/version-or-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-aliases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-aliases-request/bot-name] :opt-un [:portkey.aws.lex-models.get-bot-aliases-request/next-token :portkey.aws.lex-models.get-bot-aliases-request/max-results :portkey.aws.lex-models.get-bot-aliases-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/status (clojure.spec.alpha/and :portkey.aws.lex-models/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/type (clojure.spec.alpha/and :portkey.aws.lex-models/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-channel-association/bot-alias :portkey.aws.lex-models.bot-channel-association/created-date :portkey.aws.lex-models.bot-channel-association/name :portkey.aws.lex-models.bot-channel-association/status :portkey.aws.lex-models.bot-channel-association/bot-configuration :portkey.aws.lex-models.bot-channel-association/bot-name :portkey.aws.lex-models.bot-channel-association/type :portkey.aws.lex-models.bot-channel-association/failure-reason :portkey.aws.lex-models.bot-channel-association/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-request/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-import-request/import-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-slot-type-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-slot-type-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-slot-type-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-slot-type-metadata/signature :portkey.aws.lex-models.builtin-slot-type-metadata/supported-locales]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-alias-request/name :portkey.aws.lex-models.get-bot-alias-request/bot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/process-behavior #{:save "SAVE" :build "BUILD"})

(clojure.spec.alpha/def :portkey.aws.lex-models/synonym-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/value))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intents-response/intents :portkey.aws.lex-models.get-builtin-intents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-types-response/slot-types :portkey.aws.lex-models.get-slot-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models/lists-of-utterances (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance-list))

(clojure.spec.alpha/def :portkey.aws.lex-models.intent/intent-name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent/intent-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/intent (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.intent/intent-name :portkey.aws.lex-models.intent/intent-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-intent-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.create-intent-version-response/follow-up-prompt :portkey.aws.lex-models.create-intent-version-response/fulfillment-activity :portkey.aws.lex-models.create-intent-version-response/slots :portkey.aws.lex-models.create-intent-version-response/parent-intent-signature :portkey.aws.lex-models.create-intent-version-response/confirmation-prompt :portkey.aws.lex-models.create-intent-version-response/created-date :portkey.aws.lex-models.create-intent-version-response/name :portkey.aws.lex-models.create-intent-version-response/rejection-statement :portkey.aws.lex-models.create-intent-version-response/last-updated-date :portkey.aws.lex-models.create-intent-version-response/dialog-code-hook :portkey.aws.lex-models.create-intent-version-response/conclusion-statement :portkey.aws.lex-models.create-intent-version-response/sample-utterances :portkey.aws.lex-models.create-intent-version-response/version :portkey.aws.lex-models.create-intent-version-response/checksum :portkey.aws.lex-models.create-intent-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-type #{:facebook "Slack" :kik "Kik" "Twilio-Sms" :slack "Facebook" :twilio-sms})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/bot-versions (clojure.spec.alpha/and :portkey.aws.lex-models/bot-versions))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/status-type (clojure.spec.alpha/and :portkey.aws.lex-models/status-type))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-utterances-view-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-utterances-view-request/bot-name :portkey.aws.lex-models.get-utterances-view-request/bot-versions :portkey.aws.lex-models.get-utterances-view-request/status-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/boolean clojure.core/boolean?)

(clojure.core/defn delete-bot-channel-association ([delete-bot-channel-association-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-bot-channel-association-request delete-bot-channel-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-channel-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteBotChannelAssociation", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-channel-association-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-slot-types ([] (get-builtin-slot-types {})) ([get-builtin-slot-types-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-builtin-slot-types-request get-builtin-slot-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-builtin-slot-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/slottypes/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-builtin-slot-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBuiltinSlotTypes", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-builtin-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-slot-types-response))

(clojure.core/defn get-bot-channel-associations ([get-bot-channel-associations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bot-channel-associations-request get-bot-channel-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-channel-associations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-channel-associations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBotChannelAssociations", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-channel-associations :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-channel-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-channel-associations-response))

(clojure.core/defn create-slot-type-version ([create-slot-type-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-slot-type-version-request create-slot-type-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/create-slot-type-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/create-slot-type-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateSlotTypeVersion", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-slot-type-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-slot-type-version-response))

(clojure.core/defn get-import ([get-import-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-import-request get-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/imports/{importId}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetImport", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-import-response))

(clojure.core/defn get-slot-type ([get-slot-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-slot-type-request get-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-slot-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetSlotType", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-type-response))

(clojure.core/defn get-intent-versions ([get-intent-versions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-intent-versions-request get-intent-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-intent-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-intent-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetIntentVersions", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intent-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-intent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intent-versions-response))

(clojure.core/defn get-utterances-view ([get-utterances-view-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-utterances-view-request get-utterances-view-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-utterances-view-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botname}/utterances?view=aggregation", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-utterances-view-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetUtterancesView", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-utterances-view :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-utterances-view-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-utterances-view-response))

(clojure.core/defn delete-intent-version ([delete-intent-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-intent-version-request delete-intent-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-intent-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteIntentVersion", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-intent-version-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-intents ([] (get-builtin-intents {})) ([get-builtin-intents-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-builtin-intents-request get-builtin-intents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-builtin-intents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/intents/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-builtin-intents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBuiltinIntents", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-builtin-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-intents-response))

(clojure.core/defn get-slot-types ([] (get-slot-types {})) ([get-slot-types-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-slot-types-request get-slot-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-slot-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-slot-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetSlotTypes", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-types-response))

(clojure.core/defn get-bot-alias ([get-bot-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bot-alias-request get-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBotAlias", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-alias-response))

(clojure.core/defn get-export ([get-export-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-export-request get-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-export-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/exports/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-export-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetExport", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-export-response))

(clojure.core/defn start-import ([start-import-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-import-request start-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/start-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/imports/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/start-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "StartImport", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef start-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/start-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/start-import-response))

(clojure.core/defn get-builtin-intent ([get-builtin-intent-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-builtin-intent-request get-builtin-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-builtin-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/intents/{signature}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-builtin-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBuiltinIntent", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-builtin-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-intent-response))

(clojure.core/defn delete-slot-type ([delete-slot-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-slot-type-request delete-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteSlotType", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-slot-type-request) :ret clojure.core/true?)

(clojure.core/defn create-bot-version ([create-bot-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-bot-version-request create-bot-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/create-bot-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/create-bot-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateBotVersion", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-bot-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-bot-version-response))

(clojure.core/defn put-intent ([put-intent-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-intent-request put-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/put-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutIntent", :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-intent-response))

(clojure.core/defn delete-intent ([delete-intent-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-intent-request delete-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteIntent", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-intent-request) :ret clojure.core/true?)

(clojure.core/defn get-intents ([] (get-intents {})) ([get-intents-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-intents-request get-intents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-intents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-intents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetIntents", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intents-response))

(clojure.core/defn delete-utterances ([delete-utterances-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-utterances-request delete-utterances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/utterances/{userId}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-utterances-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteUtterances", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-utterances :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-utterances-request) :ret clojure.core/true?)

(clojure.core/defn get-intent ([get-intent-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-intent-request get-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetIntent", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intent-response))

(clojure.core/defn create-intent-version ([create-intent-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-intent-version-request create-intent-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/create-intent-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/create-intent-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateIntentVersion", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-intent-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-intent-version-response))

(clojure.core/defn get-bot-channel-association ([get-bot-channel-association-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bot-channel-association-request get-bot-channel-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-channel-association-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-channel-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBotChannelAssociation", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-channel-association-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-channel-association-response))

(clojure.core/defn put-slot-type ([put-slot-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-slot-type-request put-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/put-slot-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutSlotType", :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-slot-type-response))

(clojure.core/defn get-slot-type-versions ([get-slot-type-versions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-slot-type-versions-request get-slot-type-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-slot-type-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-slot-type-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetSlotTypeVersions", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-type-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-slot-type-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-type-versions-response))

(clojure.core/defn delete-bot-version ([delete-bot-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-bot-version-request delete-bot-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteBotVersion", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-version-request) :ret clojure.core/true?)

(clojure.core/defn get-bot-aliases ([get-bot-aliases-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bot-aliases-request get-bot-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBotAliases", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-aliases-response))

(clojure.core/defn get-bot-versions ([get-bot-versions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bot-versions-request get-bot-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBotVersions", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-versions-response))

(clojure.core/defn put-bot-alias ([put-bot-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-bot-alias-request put-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/put-bot-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutBotAlias", :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-bot-alias-response))

(clojure.core/defn get-bots ([] (get-bots {})) ([get-bots-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bots-request get-bots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bots-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bots-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBots", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bots :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-bots-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bots-response))

(clojure.core/defn get-bot ([get-bot-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bot-request get-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/{versionoralias}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBot", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-response))

(clojure.core/defn delete-slot-type-version ([delete-slot-type-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-slot-type-version-request delete-slot-type-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/version/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-slot-type-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteSlotTypeVersion", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-slot-type-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-bot ([delete-bot-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-bot-request delete-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteBot", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-request) :ret clojure.core/true?)

(clojure.core/defn put-bot ([put-bot-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-bot-request put-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec :portkey.aws.lex-models/put-bot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutBot", :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-bot-response))

(clojure.core/defn delete-bot-alias ([delete-bot-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-bot-alias-request delete-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteBotAlias", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-alias-request) :ret clojure.core/true?)