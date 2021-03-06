(ns portkey.aws.secretsmanager.-2017-10-17 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "secretsmanager", :region "us-west-1"},
    :ssl-common-name "secretsmanager-fips.us-west-1.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "secretsmanager", :region "ap-northeast-1"},
    :ssl-common-name "secretsmanager.ap-northeast-1.amazonaws.com",
    :endpoint "https://secretsmanager.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "secretsmanager", :region "eu-west-1"},
    :ssl-common-name "secretsmanager.eu-west-1.amazonaws.com",
    :endpoint "https://secretsmanager.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "secretsmanager", :region "us-east-2"},
    :ssl-common-name "secretsmanager.us-east-2.amazonaws.com",
    :endpoint "https://secretsmanager.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "secretsmanager", :region "ap-southeast-2"},
    :ssl-common-name "secretsmanager.ap-southeast-2.amazonaws.com",
    :endpoint "https://secretsmanager.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "secretsmanager", :region "sa-east-1"},
    :ssl-common-name "secretsmanager.sa-east-1.amazonaws.com",
    :endpoint "https://secretsmanager.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "secretsmanager", :region "ap-southeast-1"},
    :ssl-common-name "secretsmanager.ap-southeast-1.amazonaws.com",
    :endpoint "https://secretsmanager.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "secretsmanager", :region "ap-northeast-2"},
    :ssl-common-name "secretsmanager.ap-northeast-2.amazonaws.com",
    :endpoint "https://secretsmanager.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "secretsmanager", :region "eu-west-3"},
    :ssl-common-name "secretsmanager.eu-west-3.amazonaws.com",
    :endpoint "https://secretsmanager.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "secretsmanager", :region "us-east-2"},
    :ssl-common-name "secretsmanager-fips.us-east-2.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "secretsmanager", :region "ca-central-1"},
    :ssl-common-name "secretsmanager.ca-central-1.amazonaws.com",
    :endpoint "https://secretsmanager.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "secretsmanager", :region "eu-central-1"},
    :ssl-common-name "secretsmanager.eu-central-1.amazonaws.com",
    :endpoint "https://secretsmanager.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "secretsmanager", :region "eu-west-2"},
    :ssl-common-name "secretsmanager.eu-west-2.amazonaws.com",
    :endpoint "https://secretsmanager.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "secretsmanager", :region "us-east-1"},
    :ssl-common-name "secretsmanager-fips.us-east-1.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "secretsmanager", :region "us-west-2"},
    :ssl-common-name "secretsmanager.us-west-2.amazonaws.com",
    :endpoint "https://secretsmanager.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "secretsmanager", :region "us-west-2"},
    :ssl-common-name "secretsmanager-fips.us-west-2.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "secretsmanager", :region "us-east-1"},
    :ssl-common-name "secretsmanager.us-east-1.amazonaws.com",
    :endpoint "https://secretsmanager.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "secretsmanager", :region "us-west-1"},
    :ssl-common-name "secretsmanager.us-west-1.amazonaws.com",
    :endpoint "https://secretsmanager.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "secretsmanager", :region "ap-south-1"},
    :ssl-common-name "secretsmanager.ap-south-1.amazonaws.com",
    :endpoint "https://secretsmanager.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-rotation-lambda-arn-type)

(clojure.core/declare ser-tag-key-type)

(clojure.core/declare ser-exclude-characters-type)

(clojure.core/declare ser-max-results-type)

(clojure.core/declare ser-secret-version-stages-type)

(clojure.core/declare ser-password-length-type)

(clojure.core/declare ser-rotation-rules-type)

(clojure.core/declare ser-exclude-lowercase-type)

(clojure.core/declare ser-tag-key-list-type)

(clojure.core/declare ser-exclude-punctuation-type)

(clojure.core/declare ser-next-token-type)

(clojure.core/declare ser-kms-key-id-type)

(clojure.core/declare ser-secret-version-stage-type)

(clojure.core/declare ser-exclude-numbers-type)

(clojure.core/declare ser-secret-version-id-type)

(clojure.core/declare ser-include-space-type)

(clojure.core/declare ser-require-each-included-type-type)

(clojure.core/declare ser-tag-list-type)

(clojure.core/declare ser-tag-value-type)

(clojure.core/declare ser-client-request-token-type)

(clojure.core/declare ser-non-empty-resource-policy-type)

(clojure.core/declare ser-automatically-rotate-after-days-type)

(clojure.core/declare ser-secret-binary-type)

(clojure.core/declare ser-exclude-uppercase-type)

(clojure.core/declare ser-secret-string-type)

(clojure.core/declare ser-recovery-window-in-days-type)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-description-type)

(clojure.core/declare ser-secret-id-type)

(clojure.core/declare ser-boolean-type)

(clojure.core/declare ser-name-type)

(clojure.core/defn- ser-rotation-lambda-arn-type [input] #:http.request.field{:value input, :shape "RotationLambdaARNType"})

(clojure.core/defn- ser-tag-key-type [input] #:http.request.field{:value input, :shape "TagKeyType"})

(clojure.core/defn- ser-exclude-characters-type [input] #:http.request.field{:value input, :shape "ExcludeCharactersType"})

(clojure.core/defn- ser-max-results-type [input] #:http.request.field{:value input, :shape "MaxResultsType"})

(clojure.core/defn- ser-secret-version-stages-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-secret-version-stage-type coll) #:http.request.field{:shape "SecretVersionStageType"}))) input), :shape "SecretVersionStagesType", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-password-length-type [input] #:http.request.field{:value input, :shape "PasswordLengthType"})

(clojure.core/defn- ser-rotation-rules-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RotationRulesType", :type "structure"} (clojure.core/contains? input :automatically-after-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automatically-rotate-after-days-type (input :automatically-after-days)) #:http.request.field{:name "AutomaticallyAfterDays", :shape "AutomaticallyRotateAfterDaysType", :box true}))))

(clojure.core/defn- ser-exclude-lowercase-type [input] #:http.request.field{:value input, :shape "ExcludeLowercaseType"})

(clojure.core/defn- ser-tag-key-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key-type coll) #:http.request.field{:shape "TagKeyType"}))) input), :shape "TagKeyListType", :type "list"})

(clojure.core/defn- ser-exclude-punctuation-type [input] #:http.request.field{:value input, :shape "ExcludePunctuationType"})

(clojure.core/defn- ser-next-token-type [input] #:http.request.field{:value input, :shape "NextTokenType"})

(clojure.core/defn- ser-kms-key-id-type [input] #:http.request.field{:value input, :shape "KmsKeyIdType"})

(clojure.core/defn- ser-secret-version-stage-type [input] #:http.request.field{:value input, :shape "SecretVersionStageType"})

(clojure.core/defn- ser-exclude-numbers-type [input] #:http.request.field{:value input, :shape "ExcludeNumbersType"})

(clojure.core/defn- ser-secret-version-id-type [input] #:http.request.field{:value input, :shape "SecretVersionIdType"})

(clojure.core/defn- ser-include-space-type [input] #:http.request.field{:value input, :shape "IncludeSpaceType"})

(clojure.core/defn- ser-require-each-included-type-type [input] #:http.request.field{:value input, :shape "RequireEachIncludedTypeType"})

(clojure.core/defn- ser-tag-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagListType", :type "list"})

(clojure.core/defn- ser-tag-value-type [input] #:http.request.field{:value input, :shape "TagValueType"})

(clojure.core/defn- ser-client-request-token-type [input] #:http.request.field{:value input, :shape "ClientRequestTokenType"})

(clojure.core/defn- ser-non-empty-resource-policy-type [input] #:http.request.field{:value input, :shape "NonEmptyResourcePolicyType"})

(clojure.core/defn- ser-automatically-rotate-after-days-type [input] #:http.request.field{:value input, :shape "AutomaticallyRotateAfterDaysType"})

(clojure.core/defn- ser-secret-binary-type [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "SecretBinaryType"})

(clojure.core/defn- ser-exclude-uppercase-type [input] #:http.request.field{:value input, :shape "ExcludeUppercaseType"})

(clojure.core/defn- ser-secret-string-type [input] #:http.request.field{:value input, :shape "SecretStringType"})

(clojure.core/defn- ser-recovery-window-in-days-type [input] #:http.request.field{:value input, :shape "RecoveryWindowInDaysType"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-type (input :key)) #:http.request.field{:name "Key", :shape "TagKeyType"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value-type (input :value)) #:http.request.field{:name "Value", :shape "TagValueType"}))))

(clojure.core/defn- ser-description-type [input] #:http.request.field{:value input, :shape "DescriptionType"})

(clojure.core/defn- ser-secret-id-type [input] #:http.request.field{:value input, :shape "SecretIdType"})

(clojure.core/defn- ser-boolean-type [input] #:http.request.field{:value input, :shape "BooleanType"})

(clojure.core/defn- ser-name-type [input] #:http.request.field{:value input, :shape "NameType"})

(clojure.core/defn- req-create-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-type (input :name)) #:http.request.field{:name "Name", :shape "NameType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id-type (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyIdType"})) (clojure.core/contains? input :secret-binary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-binary-type (input :secret-binary)) #:http.request.field{:name "SecretBinary", :shape "SecretBinaryType"})) (clojure.core/contains? input :secret-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string-type (input :secret-string)) #:http.request.field{:name "SecretString", :shape "SecretStringType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "TagListType"}))))

(clojure.core/defn- req-put-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-non-empty-resource-policy-type (input :resource-policy)) #:http.request.field{:name "ResourcePolicy", :shape "NonEmptyResourcePolicyType"})]}))

(clojure.core/defn- req-get-random-password-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :password-length) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password-length-type (input :password-length)) #:http.request.field{:name "PasswordLength", :shape "PasswordLengthType", :box true})) (clojure.core/contains? input :exclude-characters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-characters-type (input :exclude-characters)) #:http.request.field{:name "ExcludeCharacters", :shape "ExcludeCharactersType"})) (clojure.core/contains? input :exclude-numbers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-numbers-type (input :exclude-numbers)) #:http.request.field{:name "ExcludeNumbers", :shape "ExcludeNumbersType", :box true})) (clojure.core/contains? input :exclude-punctuation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-punctuation-type (input :exclude-punctuation)) #:http.request.field{:name "ExcludePunctuation", :shape "ExcludePunctuationType", :box true})) (clojure.core/contains? input :exclude-uppercase) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-uppercase-type (input :exclude-uppercase)) #:http.request.field{:name "ExcludeUppercase", :shape "ExcludeUppercaseType", :box true})) (clojure.core/contains? input :exclude-lowercase) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-lowercase-type (input :exclude-lowercase)) #:http.request.field{:name "ExcludeLowercase", :shape "ExcludeLowercaseType", :box true})) (clojure.core/contains? input :include-space) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-space-type (input :include-space)) #:http.request.field{:name "IncludeSpace", :shape "IncludeSpaceType", :box true})) (clojure.core/contains? input :require-each-included-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-require-each-included-type-type (input :require-each-included-type)) #:http.request.field{:name "RequireEachIncludedType", :shape "RequireEachIncludedTypeType", :box true}))))

(clojure.core/defn- req-delete-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-get-secret-value-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "SecretVersionIdType"})) (clojure.core/contains? input :version-stage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-stage-type (input :version-stage)) #:http.request.field{:name "VersionStage", :shape "SecretVersionStageType"}))))

(clojure.core/defn- req-delete-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :recovery-window-in-days) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recovery-window-in-days-type (input :recovery-window-in-days)) #:http.request.field{:name "RecoveryWindowInDays", :shape "RecoveryWindowInDaysType", :box true})) (clojure.core/contains? input :force-delete-without-recovery) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :force-delete-without-recovery)) #:http.request.field{:name "ForceDeleteWithoutRecovery", :shape "BooleanType", :box true}))))

(clojure.core/defn- req-rotate-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :rotation-lambda-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rotation-lambda-arn-type (input :rotation-lambda-arn)) #:http.request.field{:name "RotationLambdaARN", :shape "RotationLambdaARNType"})) (clojure.core/contains? input :rotation-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rotation-rules-type (input :rotation-rules)) #:http.request.field{:name "RotationRules", :shape "RotationRulesType"}))))

(clojure.core/defn- req-get-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-tag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "TagListType"})]}))

(clojure.core/defn- req-cancel-rotate-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-update-secret-version-stage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-secret-version-stage-type (input :version-stage)) #:http.request.field{:name "VersionStage", :shape "SecretVersionStageType"})]} (clojure.core/contains? input :remove-from-version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-id-type (input :remove-from-version-id)) #:http.request.field{:name "RemoveFromVersionId", :shape "SecretVersionIdType", :box true})) (clojure.core/contains? input :move-to-version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-id-type (input :move-to-version-id)) #:http.request.field{:name "MoveToVersionId", :shape "SecretVersionIdType", :box true}))))

(clojure.core/defn- req-put-secret-value-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :secret-binary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-binary-type (input :secret-binary)) #:http.request.field{:name "SecretBinary", :shape "SecretBinaryType"})) (clojure.core/contains? input :secret-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string-type (input :secret-string)) #:http.request.field{:name "SecretString", :shape "SecretStringType"})) (clojure.core/contains? input :version-stages) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-stages-type (input :version-stages)) #:http.request.field{:name "VersionStages", :shape "SecretVersionStagesType"}))))

(clojure.core/defn- req-update-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id-type (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyIdType"})) (clojure.core/contains? input :secret-binary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-binary-type (input :secret-binary)) #:http.request.field{:name "SecretBinary", :shape "SecretBinaryType"})) (clojure.core/contains? input :secret-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string-type (input :secret-string)) #:http.request.field{:name "SecretString", :shape "SecretStringType"}))))

(clojure.core/defn- req-list-secret-version-ids-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsType", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextTokenType"})) (clojure.core/contains? input :include-deprecated) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :include-deprecated)) #:http.request.field{:name "IncludeDeprecated", :shape "BooleanType", :box true}))))

(clojure.core/defn- req-list-secrets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsType", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextTokenType"}))))

(clojure.core/defn- req-describe-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-tag-key-list-type (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyListType"})]}))

(clojure.core/defn- req-restore-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/declare deser-rotation-lambda-arn-type)

(clojure.core/declare deser-random-password-type)

(clojure.core/declare deser-last-accessed-date-type)

(clojure.core/declare deser-rotation-enabled-type)

(clojure.core/declare deser-secret-list-type)

(clojure.core/declare deser-secret-arn-type)

(clojure.core/declare deser-secret-versions-list-entry)

(clojure.core/declare deser-tag-key-type)

(clojure.core/declare deser-created-date-type)

(clojure.core/declare deser-secret-version-stages-type)

(clojure.core/declare deser-rotation-rules-type)

(clojure.core/declare deser-secret-versions-list-type)

(clojure.core/declare deser-deletion-date-type)

(clojure.core/declare deser-last-changed-date-type)

(clojure.core/declare deser-next-token-type)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-kms-key-id-type)

(clojure.core/declare deser-secret-version-stage-type)

(clojure.core/declare deser-deleted-date-type)

(clojure.core/declare deser-secret-version-id-type)

(clojure.core/declare deser-tag-list-type)

(clojure.core/declare deser-secret-versions-to-stages-map-type)

(clojure.core/declare deser-tag-value-type)

(clojure.core/declare deser-non-empty-resource-policy-type)

(clojure.core/declare deser-automatically-rotate-after-days-type)

(clojure.core/declare deser-secret-binary-type)

(clojure.core/declare deser-secret-name-type)

(clojure.core/declare deser-last-rotated-date-type)

(clojure.core/declare deser-secret-string-type)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-secret-list-entry)

(clojure.core/declare deser-description-type)

(clojure.core/declare deser-name-type)

(clojure.core/defn- deser-rotation-lambda-arn-type [input] input)

(clojure.core/defn- deser-random-password-type [input] input)

(clojure.core/defn- deser-last-accessed-date-type [input] input)

(clojure.core/defn- deser-rotation-enabled-type [input] input)

(clojure.core/defn- deser-secret-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret-list-entry coll))) input))

(clojure.core/defn- deser-secret-arn-type [input] input)

(clojure.core/defn- deser-secret-versions-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (input "VersionId"))) (clojure.core/contains? input "VersionStages") (clojure.core/assoc :version-stages (deser-secret-version-stages-type (input "VersionStages"))) (clojure.core/contains? input "LastAccessedDate") (clojure.core/assoc :last-accessed-date (deser-last-accessed-date-type (input "LastAccessedDate"))) (clojure.core/contains? input "CreatedDate") (clojure.core/assoc :created-date (deser-created-date-type (input "CreatedDate")))))

(clojure.core/defn- deser-tag-key-type [input] input)

(clojure.core/defn- deser-created-date-type [input] input)

(clojure.core/defn- deser-secret-version-stages-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret-version-stage-type coll))) input))

(clojure.core/defn- deser-rotation-rules-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "AutomaticallyAfterDays") (clojure.core/assoc :automatically-after-days (deser-automatically-rotate-after-days-type (input "AutomaticallyAfterDays")))))

(clojure.core/defn- deser-secret-versions-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret-versions-list-entry coll))) input))

(clojure.core/defn- deser-deletion-date-type [input] input)

(clojure.core/defn- deser-last-changed-date-type [input] input)

(clojure.core/defn- deser-next-token-type [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-kms-key-id-type [input] input)

(clojure.core/defn- deser-secret-version-stage-type [input] input)

(clojure.core/defn- deser-deleted-date-type [input] input)

(clojure.core/defn- deser-secret-version-id-type [input] input)

(clojure.core/defn- deser-tag-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-secret-versions-to-stages-map-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-secret-version-id-type k) (deser-secret-version-stages-type v)])) input))

(clojure.core/defn- deser-tag-value-type [input] input)

(clojure.core/defn- deser-non-empty-resource-policy-type [input] input)

(clojure.core/defn- deser-automatically-rotate-after-days-type [input] input)

(clojure.core/defn- deser-secret-binary-type [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-secret-name-type [input] input)

(clojure.core/defn- deser-last-rotated-date-type [input] input)

(clojure.core/defn- deser-secret-string-type [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key-type (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value-type (input "Value")))))

(clojure.core/defn- deser-secret-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "RotationRules") (clojure.core/assoc :rotation-rules (deser-rotation-rules-type (input "RotationRules"))) (clojure.core/contains? input "LastRotatedDate") (clojure.core/assoc :last-rotated-date (deser-last-rotated-date-type (input "LastRotatedDate"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list-type (input "Tags"))) (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (input "ARN"))) (clojure.core/contains? input "LastAccessedDate") (clojure.core/assoc :last-accessed-date (deser-last-accessed-date-type (input "LastAccessedDate"))) (clojure.core/contains? input "LastChangedDate") (clojure.core/assoc :last-changed-date (deser-last-changed-date-type (input "LastChangedDate"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-type (input "Description"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id-type (input "KmsKeyId"))) (clojure.core/contains? input "DeletedDate") (clojure.core/assoc :deleted-date (deser-deleted-date-type (input "DeletedDate"))) (clojure.core/contains? input "RotationEnabled") (clojure.core/assoc :rotation-enabled (deser-rotation-enabled-type (input "RotationEnabled"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-secret-name-type (input "Name"))) (clojure.core/contains? input "SecretVersionsToStages") (clojure.core/assoc :secret-versions-to-stages (deser-secret-versions-to-stages-map-type (input "SecretVersionsToStages"))) (clojure.core/contains? input "RotationLambdaARN") (clojure.core/assoc :rotation-lambda-arn (deser-rotation-lambda-arn-type (input "RotationLambdaARN")))))

(clojure.core/defn- deser-description-type [input] input)

(clojure.core/defn- deser-name-type [input] input)

(clojure.core/defn- response-get-random-password-response ([input] (response-get-random-password-response nil input)) ([resultWrapper1687131 input] (clojure.core/let [rawinput1687130 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687132 {"RandomPassword" (rawinput1687130 "RandomPassword")}] (clojure.core/cond-> {} (letvar1687132 "RandomPassword") (clojure.core/assoc :random-password (deser-random-password-type (clojure.core/get-in letvar1687132 ["RandomPassword"])))))))

(clojure.core/defn- response-delete-secret-response ([input] (response-delete-secret-response nil input)) ([resultWrapper1687134 input] (clojure.core/let [rawinput1687133 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687135 {"ARN" (rawinput1687133 "ARN"), "Name" (rawinput1687133 "Name"), "DeletionDate" (rawinput1687133 "DeletionDate")}] (clojure.core/cond-> {} (letvar1687135 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687135 ["ARN"]))) (letvar1687135 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687135 ["Name"]))) (letvar1687135 "DeletionDate") (clojure.core/assoc :deletion-date (deser-deletion-date-type (clojure.core/get-in letvar1687135 ["DeletionDate"])))))))

(clojure.core/defn- response-list-secrets-response ([input] (response-list-secrets-response nil input)) ([resultWrapper1687137 input] (clojure.core/let [rawinput1687136 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687138 {"SecretList" (rawinput1687136 "SecretList"), "NextToken" (rawinput1687136 "NextToken")}] (clojure.core/cond-> {} (letvar1687138 "SecretList") (clojure.core/assoc :secret-list (deser-secret-list-type (clojure.core/get-in letvar1687138 ["SecretList"]))) (letvar1687138 "NextToken") (clojure.core/assoc :next-token (deser-next-token-type (clojure.core/get-in letvar1687138 ["NextToken"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1687140 input] (clojure.core/let [rawinput1687139 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687141 {"Message" (rawinput1687139 "Message")}] (clojure.core/cond-> {} (letvar1687141 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687141 ["Message"])))))))

(clojure.core/defn- response-restore-secret-response ([input] (response-restore-secret-response nil input)) ([resultWrapper1687143 input] (clojure.core/let [rawinput1687142 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687144 {"ARN" (rawinput1687142 "ARN"), "Name" (rawinput1687142 "Name")}] (clojure.core/cond-> {} (letvar1687144 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687144 ["ARN"]))) (letvar1687144 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687144 ["Name"])))))))

(clojure.core/defn- response-encryption-failure ([input] (response-encryption-failure nil input)) ([resultWrapper1687146 input] (clojure.core/let [rawinput1687145 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687147 {"Message" (rawinput1687145 "Message")}] (clojure.core/cond-> {} (letvar1687147 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687147 ["Message"])))))))

(clojure.core/defn- response-decryption-failure ([input] (response-decryption-failure nil input)) ([resultWrapper1687149 input] (clojure.core/let [rawinput1687148 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687150 {"Message" (rawinput1687148 "Message")}] (clojure.core/cond-> {} (letvar1687150 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687150 ["Message"])))))))

(clojure.core/defn- response-internal-service-error ([input] (response-internal-service-error nil input)) ([resultWrapper1687152 input] (clojure.core/let [rawinput1687151 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687153 {"Message" (rawinput1687151 "Message")}] (clojure.core/cond-> {} (letvar1687153 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687153 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1687155 input] (clojure.core/let [rawinput1687154 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687156 {"Message" (rawinput1687154 "Message")}] (clojure.core/cond-> {} (letvar1687156 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687156 ["Message"])))))))

(clojure.core/defn- response-resource-exists-exception ([input] (response-resource-exists-exception nil input)) ([resultWrapper1687158 input] (clojure.core/let [rawinput1687157 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687159 {"Message" (rawinput1687157 "Message")}] (clojure.core/cond-> {} (letvar1687159 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687159 ["Message"])))))))

(clojure.core/defn- response-cancel-rotate-secret-response ([input] (response-cancel-rotate-secret-response nil input)) ([resultWrapper1687161 input] (clojure.core/let [rawinput1687160 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687162 {"ARN" (rawinput1687160 "ARN"), "Name" (rawinput1687160 "Name"), "VersionId" (rawinput1687160 "VersionId")}] (clojure.core/cond-> {} (letvar1687162 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687162 ["ARN"]))) (letvar1687162 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687162 ["Name"]))) (letvar1687162 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar1687162 ["VersionId"])))))))

(clojure.core/defn- response-describe-secret-response ([input] (response-describe-secret-response nil input)) ([resultWrapper1687164 input] (clojure.core/let [rawinput1687163 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687165 {"RotationRules" (rawinput1687163 "RotationRules"), "LastRotatedDate" (rawinput1687163 "LastRotatedDate"), "Tags" (rawinput1687163 "Tags"), "ARN" (rawinput1687163 "ARN"), "LastAccessedDate" (rawinput1687163 "LastAccessedDate"), "LastChangedDate" (rawinput1687163 "LastChangedDate"), "Description" (rawinput1687163 "Description"), "KmsKeyId" (rawinput1687163 "KmsKeyId"), "DeletedDate" (rawinput1687163 "DeletedDate"), "VersionIdsToStages" (rawinput1687163 "VersionIdsToStages"), "RotationEnabled" (rawinput1687163 "RotationEnabled"), "Name" (rawinput1687163 "Name"), "RotationLambdaARN" (rawinput1687163 "RotationLambdaARN")}] (clojure.core/cond-> {} (letvar1687165 "RotationRules") (clojure.core/assoc :rotation-rules (deser-rotation-rules-type (clojure.core/get-in letvar1687165 ["RotationRules"]))) (letvar1687165 "LastRotatedDate") (clojure.core/assoc :last-rotated-date (deser-last-rotated-date-type (clojure.core/get-in letvar1687165 ["LastRotatedDate"]))) (letvar1687165 "Tags") (clojure.core/assoc :tags (deser-tag-list-type (clojure.core/get-in letvar1687165 ["Tags"]))) (letvar1687165 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687165 ["ARN"]))) (letvar1687165 "LastAccessedDate") (clojure.core/assoc :last-accessed-date (deser-last-accessed-date-type (clojure.core/get-in letvar1687165 ["LastAccessedDate"]))) (letvar1687165 "LastChangedDate") (clojure.core/assoc :last-changed-date (deser-last-changed-date-type (clojure.core/get-in letvar1687165 ["LastChangedDate"]))) (letvar1687165 "Description") (clojure.core/assoc :description (deser-description-type (clojure.core/get-in letvar1687165 ["Description"]))) (letvar1687165 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id-type (clojure.core/get-in letvar1687165 ["KmsKeyId"]))) (letvar1687165 "DeletedDate") (clojure.core/assoc :deleted-date (deser-deleted-date-type (clojure.core/get-in letvar1687165 ["DeletedDate"]))) (letvar1687165 "VersionIdsToStages") (clojure.core/assoc :version-ids-to-stages (deser-secret-versions-to-stages-map-type (clojure.core/get-in letvar1687165 ["VersionIdsToStages"]))) (letvar1687165 "RotationEnabled") (clojure.core/assoc :rotation-enabled (deser-rotation-enabled-type (clojure.core/get-in letvar1687165 ["RotationEnabled"]))) (letvar1687165 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687165 ["Name"]))) (letvar1687165 "RotationLambdaARN") (clojure.core/assoc :rotation-lambda-arn (deser-rotation-lambda-arn-type (clojure.core/get-in letvar1687165 ["RotationLambdaARN"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1687167 input] (clojure.core/let [rawinput1687166 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687168 {"Message" (rawinput1687166 "Message")}] (clojure.core/cond-> {} (letvar1687168 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687168 ["Message"])))))))

(clojure.core/defn- response-create-secret-response ([input] (response-create-secret-response nil input)) ([resultWrapper1687170 input] (clojure.core/let [rawinput1687169 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687171 {"ARN" (rawinput1687169 "ARN"), "Name" (rawinput1687169 "Name"), "VersionId" (rawinput1687169 "VersionId")}] (clojure.core/cond-> {} (letvar1687171 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687171 ["ARN"]))) (letvar1687171 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687171 ["Name"]))) (letvar1687171 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar1687171 ["VersionId"])))))))

(clojure.core/defn- response-get-secret-value-response ([input] (response-get-secret-value-response nil input)) ([resultWrapper1687173 input] (clojure.core/let [rawinput1687172 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687174 {"ARN" (rawinput1687172 "ARN"), "Name" (rawinput1687172 "Name"), "VersionId" (rawinput1687172 "VersionId"), "SecretBinary" (rawinput1687172 "SecretBinary"), "SecretString" (rawinput1687172 "SecretString"), "VersionStages" (rawinput1687172 "VersionStages"), "CreatedDate" (rawinput1687172 "CreatedDate")}] (clojure.core/cond-> {} (letvar1687174 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687174 ["ARN"]))) (letvar1687174 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687174 ["Name"]))) (letvar1687174 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar1687174 ["VersionId"]))) (letvar1687174 "SecretBinary") (clojure.core/assoc :secret-binary (deser-secret-binary-type (clojure.core/get-in letvar1687174 ["SecretBinary"]))) (letvar1687174 "SecretString") (clojure.core/assoc :secret-string (deser-secret-string-type (clojure.core/get-in letvar1687174 ["SecretString"]))) (letvar1687174 "VersionStages") (clojure.core/assoc :version-stages (deser-secret-version-stages-type (clojure.core/get-in letvar1687174 ["VersionStages"]))) (letvar1687174 "CreatedDate") (clojure.core/assoc :created-date (deser-created-date-type (clojure.core/get-in letvar1687174 ["CreatedDate"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1687176 input] (clojure.core/let [rawinput1687175 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687177 {"Message" (rawinput1687175 "Message")}] (clojure.core/cond-> {} (letvar1687177 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687177 ["Message"])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper1687179 input] (clojure.core/let [rawinput1687178 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687180 {"Message" (rawinput1687178 "Message")}] (clojure.core/cond-> {} (letvar1687180 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687180 ["Message"])))))))

(clojure.core/defn- response-update-secret-response ([input] (response-update-secret-response nil input)) ([resultWrapper1687182 input] (clojure.core/let [rawinput1687181 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687183 {"ARN" (rawinput1687181 "ARN"), "Name" (rawinput1687181 "Name"), "VersionId" (rawinput1687181 "VersionId")}] (clojure.core/cond-> {} (letvar1687183 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687183 ["ARN"]))) (letvar1687183 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687183 ["Name"]))) (letvar1687183 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar1687183 ["VersionId"])))))))

(clojure.core/defn- response-delete-resource-policy-response ([input] (response-delete-resource-policy-response nil input)) ([resultWrapper1687185 input] (clojure.core/let [rawinput1687184 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687186 {"ARN" (rawinput1687184 "ARN"), "Name" (rawinput1687184 "Name")}] (clojure.core/cond-> {} (letvar1687186 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687186 ["ARN"]))) (letvar1687186 "Name") (clojure.core/assoc :name (deser-name-type (clojure.core/get-in letvar1687186 ["Name"])))))))

(clojure.core/defn- response-put-resource-policy-response ([input] (response-put-resource-policy-response nil input)) ([resultWrapper1687188 input] (clojure.core/let [rawinput1687187 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687189 {"ARN" (rawinput1687187 "ARN"), "Name" (rawinput1687187 "Name")}] (clojure.core/cond-> {} (letvar1687189 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687189 ["ARN"]))) (letvar1687189 "Name") (clojure.core/assoc :name (deser-name-type (clojure.core/get-in letvar1687189 ["Name"])))))))

(clojure.core/defn- response-precondition-not-met-exception ([input] (response-precondition-not-met-exception nil input)) ([resultWrapper1687191 input] (clojure.core/let [rawinput1687190 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687192 {"Message" (rawinput1687190 "Message")}] (clojure.core/cond-> {} (letvar1687192 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687192 ["Message"])))))))

(clojure.core/defn- response-get-resource-policy-response ([input] (response-get-resource-policy-response nil input)) ([resultWrapper1687194 input] (clojure.core/let [rawinput1687193 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687195 {"ARN" (rawinput1687193 "ARN"), "Name" (rawinput1687193 "Name"), "ResourcePolicy" (rawinput1687193 "ResourcePolicy")}] (clojure.core/cond-> {} (letvar1687195 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687195 ["ARN"]))) (letvar1687195 "Name") (clojure.core/assoc :name (deser-name-type (clojure.core/get-in letvar1687195 ["Name"]))) (letvar1687195 "ResourcePolicy") (clojure.core/assoc :resource-policy (deser-non-empty-resource-policy-type (clojure.core/get-in letvar1687195 ["ResourcePolicy"])))))))

(clojure.core/defn- response-update-secret-version-stage-response ([input] (response-update-secret-version-stage-response nil input)) ([resultWrapper1687197 input] (clojure.core/let [rawinput1687196 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687198 {"ARN" (rawinput1687196 "ARN"), "Name" (rawinput1687196 "Name")}] (clojure.core/cond-> {} (letvar1687198 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687198 ["ARN"]))) (letvar1687198 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687198 ["Name"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1687200 input] (clojure.core/let [rawinput1687199 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687201 {"Message" (rawinput1687199 "Message")}] (clojure.core/cond-> {} (letvar1687201 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1687201 ["Message"])))))))

(clojure.core/defn- response-list-secret-version-ids-response ([input] (response-list-secret-version-ids-response nil input)) ([resultWrapper1687203 input] (clojure.core/let [rawinput1687202 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687204 {"Versions" (rawinput1687202 "Versions"), "NextToken" (rawinput1687202 "NextToken"), "ARN" (rawinput1687202 "ARN"), "Name" (rawinput1687202 "Name")}] (clojure.core/cond-> {} (letvar1687204 "Versions") (clojure.core/assoc :versions (deser-secret-versions-list-type (clojure.core/get-in letvar1687204 ["Versions"]))) (letvar1687204 "NextToken") (clojure.core/assoc :next-token (deser-next-token-type (clojure.core/get-in letvar1687204 ["NextToken"]))) (letvar1687204 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687204 ["ARN"]))) (letvar1687204 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687204 ["Name"])))))))

(clojure.core/defn- response-rotate-secret-response ([input] (response-rotate-secret-response nil input)) ([resultWrapper1687206 input] (clojure.core/let [rawinput1687205 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687207 {"ARN" (rawinput1687205 "ARN"), "Name" (rawinput1687205 "Name"), "VersionId" (rawinput1687205 "VersionId")}] (clojure.core/cond-> {} (letvar1687207 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687207 ["ARN"]))) (letvar1687207 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687207 ["Name"]))) (letvar1687207 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar1687207 ["VersionId"])))))))

(clojure.core/defn- response-put-secret-value-response ([input] (response-put-secret-value-response nil input)) ([resultWrapper1687209 input] (clojure.core/let [rawinput1687208 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1687210 {"ARN" (rawinput1687208 "ARN"), "Name" (rawinput1687208 "Name"), "VersionId" (rawinput1687208 "VersionId"), "VersionStages" (rawinput1687208 "VersionStages")}] (clojure.core/cond-> {} (letvar1687210 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar1687210 ["ARN"]))) (letvar1687210 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar1687210 ["Name"]))) (letvar1687210 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar1687210 ["VersionId"]))) (letvar1687210 "VersionStages") (clojure.core/assoc :version-stages (deser-secret-version-stages-type (clojure.core/get-in letvar1687210 ["VersionStages"])))))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/description (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/create-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.create-secret-request/name] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.create-secret-request/client-request-token :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/description :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/kms-key-id :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/secret-binary :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/secret-string :portkey.aws.secretsmanager.-2017-10-17.create-secret-request/tags]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/rotation-lambda-arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/random-password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-request/resource-policy (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/non-empty-resource-policy-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/put-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-request/secret-id :portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-request/resource-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-response/random-password (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/random-password-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/get-random-password-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.get-random-password-response/random-password]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/last-accessed-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/password-length (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/password-length-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-characters (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/exclude-characters-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-numbers (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/exclude-numbers-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-punctuation (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/exclude-punctuation-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-uppercase (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/exclude-uppercase-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-lowercase (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/exclude-lowercase-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/include-space (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/include-space-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/require-each-included-type (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/require-each-included-type-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/get-random-password-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/password-length :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-characters :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-numbers :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-punctuation :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-uppercase :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/exclude-lowercase :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/include-space :portkey.aws.secretsmanager.-2017-10-17.get-random-password-request/require-each-included-type]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/rotation-enabled-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-secret-response/deletion-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/deletion-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/delete-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.delete-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.delete-secret-response/name :portkey.aws.secretsmanager.-2017-10-17.delete-secret-response/deletion-date]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager.-2017-10-17/secret-list-entry))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secrets-response/secret-list (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secrets-response/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/list-secrets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.list-secrets-response/secret-list :portkey.aws.secretsmanager.-2017-10-17.list-secrets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/last-accessed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-accessed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/created-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/created-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-versions-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/version-id :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/version-stages :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/last-accessed-date :portkey.aws.secretsmanager.-2017-10-17.secret-versions-list-entry/created-date]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/tag-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/created-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.restore-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.restore-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/restore-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.restore-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.restore-secret-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.encryption-failure/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/encryption-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.encryption-failure/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.decryption-failure/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/decryption-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.decryption-failure/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-resource-policy-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/delete-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.delete-resource-policy-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-request/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-request/version-stage (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-stage-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/get-secret-value-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.get-secret-value-request/secret-id] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.get-secret-value-request/version-id :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-request/version-stage]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-secret-request/recovery-window-in-days (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/recovery-window-in-days-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-secret-request/force-delete-without-recovery (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/boolean-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/delete-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.delete-secret-request/secret-id] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.delete-secret-request/recovery-window-in-days :portkey.aws.secretsmanager.-2017-10-17.delete-secret-request/force-delete-without-recovery]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/exclude-characters-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/max-results-type (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-version-stages-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager.-2017-10-17/secret-version-stage-type :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/rotation-lambda-arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-lambda-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/rotation-rules (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-rules-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/rotate-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/secret-id] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/client-request-token :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/rotation-lambda-arn :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-request/rotation-rules]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/password-length-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.internal-service-error/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/internal-service-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.internal-service-error/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotation-rules-type/automatically-after-days (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/automatically-rotate-after-days-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/rotation-rules-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.rotation-rules-type/automatically-after-days]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-versions-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager.-2017-10-17/secret-versions-list-entry))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/exclude-lowercase-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/tag-key-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager.-2017-10-17/tag-key-type))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.resource-exists-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/resource-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.resource-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/deletion-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/exclude-punctuation-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/last-changed-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/cancel-rotate-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-response/name :portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/next-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/rotation-rules (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-rules-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/last-rotated-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-rotated-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/last-accessed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-accessed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/last-changed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-changed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/description (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/deleted-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/deleted-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/version-ids-to-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-versions-to-stages-map-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/rotation-enabled (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-enabled-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/rotation-lambda-arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-lambda-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/describe-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/rotation-rules :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/last-rotated-date :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/tags :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/last-accessed-date :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/last-changed-date :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/description :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/kms-key-id :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/deleted-date :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/version-ids-to-stages :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/rotation-enabled :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/name :portkey.aws.secretsmanager.-2017-10-17.describe-secret-response/rotation-lambda-arn]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/get-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.create-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/create-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.create-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.create-secret-response/name :portkey.aws.secretsmanager.-2017-10-17.create-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/kms-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-version-stage-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.tag-resource-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.tag-resource-request/secret-id :portkey.aws.secretsmanager.-2017-10-17.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/cancel-rotate-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.cancel-rotate-secret-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/exclude-numbers-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/created-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/created-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/get-secret-value-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/arn :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/name :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/version-id :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/secret-binary :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/secret-string :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/version-stages :portkey.aws.secretsmanager.-2017-10-17.get-secret-value-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/deleted-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 32 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/version-stage (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-stage-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/remove-from-version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/move-to-version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/update-secret-version-stage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/secret-id :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/version-stage] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/remove-from-version-id :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-request/move-to-version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/include-space-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/require-each-included-type-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/put-secret-value-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/secret-id] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/client-request-token :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/secret-binary :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/secret-string :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-request/version-stages]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/tag-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager.-2017-10-17/tag))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/description (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/update-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.update-secret-request/secret-id] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.update-secret-request/client-request-token :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/description :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/kms-key-id :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/secret-binary :portkey.aws.secretsmanager.-2017-10-17.update-secret-request/secret-string]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/update-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.update-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.update-secret-response/name :portkey.aws.secretsmanager.-2017-10-17.update-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-versions-to-stages-map-type (clojure.spec.alpha/map-of :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type :portkey.aws.secretsmanager.-2017-10-17/secret-version-stages-type))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/tag-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/client-request-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 32 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/max-results (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/max-results-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/include-deprecated (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/boolean-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/list-secret-version-ids-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/secret-id] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/max-results :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/next-token :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-request/include-deprecated]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/non-empty-resource-policy-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/automatically-rotate-after-days-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-resource-policy-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.delete-resource-policy-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/delete-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.delete-resource-policy-response/arn :portkey.aws.secretsmanager.-2017-10-17.delete-resource-policy-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/put-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-response/arn :portkey.aws.secretsmanager.-2017-10-17.put-resource-policy-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-binary-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.precondition-not-met-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/precondition-not-met-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.precondition-not-met-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/last-rotated-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secrets-request/max-results (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/max-results-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secrets-request/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/list-secrets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.list-secrets-request/max-results :portkey.aws.secretsmanager.-2017-10-17.list-secrets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/exclude-uppercase-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-string-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 7168))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/recovery-window-in-days-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.tag/key (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-key-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.tag/value (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-value-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.tag/key :portkey.aws.secretsmanager.-2017-10-17.tag/value]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/rotation-rules (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-rules-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/last-rotated-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-rotated-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/last-accessed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-accessed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/last-changed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/last-changed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/description (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/deleted-date (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/deleted-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/rotation-enabled (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-enabled-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/secret-versions-to-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-versions-to-stages-map-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/rotation-lambda-arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotation-lambda-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/rotation-rules :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/last-rotated-date :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/tags :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/arn :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/last-accessed-date :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/last-changed-date :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/description :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/kms-key-id :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/deleted-date :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/rotation-enabled :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/name :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/secret-versions-to-stages :portkey.aws.secretsmanager.-2017-10-17.secret-list-entry/rotation-lambda-arn]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-response/resource-policy (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/non-empty-resource-policy-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/get-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-response/arn :portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-response/name :portkey.aws.secretsmanager.-2017-10-17.get-resource-policy-response/resource-policy]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/secret-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/update-secret-version-stage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-response/arn :portkey.aws.secretsmanager.-2017-10-17.update-secret-version-stage-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/versions (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-versions-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/list-secret-version-ids-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/versions :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/next-token :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/arn :portkey.aws.secretsmanager.-2017-10-17.list-secret-version-ids-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/rotate-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.rotate-secret-response/arn :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-response/name :portkey.aws.secretsmanager.-2017-10-17.rotate-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/put-secret-value-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/arn :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/name :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/version-id :portkey.aws.secretsmanager.-2017-10-17.put-secret-value-response/version-stages]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.describe-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/describe-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.describe-secret-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.untag-resource-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/tag-key-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.untag-resource-request/secret-id :portkey.aws.secretsmanager.-2017-10-17.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17.restore-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/restore-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.-2017-10-17.restore-secret-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.-2017-10-17/name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512))))

(clojure.core/defn tag-resource "Attaches one or more tags, each consisting of a key name and a value, to the\nspecified secret. Tags are part of the secret's overall metadata, and are not\nassociated with any specific version of the secret. This operation only appends\ntags to the existing list of tags. To remove tags, you must use UntagResource.\n The following basic restrictions apply to tags:\n * Maximum number of tags per secret—50\n * Maximum key length—127 Unicode characters in UTF-8\n * Maximum value length—255 Unicode characters in UTF-8\n * Tag keys and values are case sensitive.\n * Do not use the aws: prefix in your tag names or values because it is reserved\nfor AWS use. You can't edit or delete tag names or values with this prefix. Tags\nwith this prefix do not count against your tags per secret limit.\n * If your tagging schema will be used across multiple services and resources,\nremember that other services might have restrictions on allowed characters.\nGenerally allowed characters are: letters, spaces, and numbers representable in\nUTF-8, plus the following special characters: + - = . _ : / @.\n If you use tags as part of your security strategy, then adding or removing a\ntag can change permissions. If successfully completing this operation would\nresult in you losing your permissions for this secret, then the operation is\nblocked and returns an Access Denied error.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:TagResource\n Related operations\n * To remove one or more tags from the collection attached to a secret, use\nUntagResource.\n * To view the list of tags attached to a secret, use DescribeSecret." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn cancel-rotate-secret "Disables automatic scheduled rotation and cancels the rotation of a secret if\none is currently in progress.\n To re-enable scheduled rotation, call RotateSecret with\nAutomaticallyRotateAfterDays set to a value greater than 0. This will\nimmediately rotate your secret and then enable the automatic schedule.\n If you cancel a rotation that is in progress, it can leave the VersionStage\nlabels in an unexpected state. Depending on what step of the rotation was in\nprogress, you might need to remove the staging label AWSPENDING from the\npartially created version, specified by the VersionId response value. You should\nalso evaluate the partially rotated new version to see if it should be deleted,\nwhich you can do by removing all staging labels from the new version's\nVersionStage field.\n To successfully start a rotation, the staging label AWSPENDING must be in one\nof the following states:\n * Not be attached to any version at all\n * Attached to the same version as the staging label AWSCURRENT\n If the staging label AWSPENDING is attached to a different version than the\nversion with AWSCURRENT then the attempt to rotate fails.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:CancelRotateSecret\n Related operations\n * To configure rotation for a secret or to manually trigger a rotation, use\nRotateSecret.\n * To get the rotation configuration details for a secret, use DescribeSecret.\n * To list all of the currently available secrets, use ListSecrets.\n * To list all of the versions currently associated with a secret, use\nListSecretVersionIds." ([cancel-rotate-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-rotate-secret-request cancel-rotate-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/cancel-rotate-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/cancel-rotate-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelRotateSecret", :http.request.configuration/output-deser-fn response-cancel-rotate-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception}})))))
(clojure.spec.alpha/fdef cancel-rotate-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/cancel-rotate-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/cancel-rotate-secret-response))

(clojure.core/defn delete-resource-policy "Deletes the resource-based permission policy that's attached to the secret.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:DeleteResourcePolicy\n Related operations\n * To attach a resource policy to a secret, use PutResourcePolicy.\n * To retrieve the current resource-based policy that's attached to a secret,\nuse GetResourcePolicy.\n * To list all of the currently available secrets, use ListSecrets." ([delete-resource-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-resource-policy-request delete-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/delete-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/delete-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResourcePolicy", :http.request.configuration/output-deser-fn response-delete-resource-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/delete-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/delete-resource-policy-response))

(clojure.core/defn get-random-password "Generates a random password of the specified complexity. This operation is\nintended for use in the Lambda rotation function. Per best practice, we\nrecommend that you specify the maximum length and include every character type\nthat the system you are generating a password for can support.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:GetRandomPassword" ([] (get-random-password {})) ([get-random-password-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-random-password-request get-random-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/get-random-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/get-random-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRandomPassword", :http.request.configuration/output-deser-fn response-get-random-password-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef get-random-password :args (clojure.spec.alpha/? :portkey.aws.secretsmanager.-2017-10-17/get-random-password-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/get-random-password-response))

(clojure.core/defn update-secret "Modifies many of the details of the specified secret. If you include a\nClientRequestToken and either SecretString or SecretBinary then it also creates\na new version attached to the secret.\n To modify the rotation configuration of a secret, use RotateSecret instead.\n The Secrets Manager console uses only the SecretString parameter and therefore\nlimits you to encrypting and storing only a text string. To encrypt and store\nbinary data as part of the version of a secret, you must use either the AWS CLI\nor one of the AWS SDKs.\n * If a version with a VersionId with the same value as the ClientRequestToken\nparameter already exists, the operation results in an error. You cannot modify\nan existing version, you can only create a new version.\n * If you include SecretString or SecretBinary to create a new secret version,\nSecrets Manager automatically attaches the staging label AWSCURRENT to the new\nversion.\n * If you call an operation that needs to encrypt or decrypt the SecretString or\nSecretBinary for a secret in the same account as the calling user and that\nsecret doesn't specify a AWS KMS encryption key, Secrets Manager uses the\naccount's default AWS managed customer master key (CMK) with the alias\naws/secretsmanager. If this key doesn't already exist in your account then\nSecrets Manager creates it for you automatically. All users and roles in the\nsame AWS account automatically have access to use the default CMK. Note that if\nan Secrets Manager API call results in AWS having to create the account's\nAWS-managed CMK, it can result in a one-time significant delay in returning the\nresult.\n * If the secret is in a different AWS account from the credentials calling an\nAPI that requires encryption or decryption of the secret value then you must\ncreate and use a custom AWS KMS CMK because you can't access the default CMK for\nthe account using credentials from a different AWS account. Store the ARN of the\nCMK in the secret when you create the secret or when you update it by including\nit in the KMSKeyId. If you call an API that must encrypt or decrypt SecretString\nor SecretBinary using credentials from a different account then the AWS KMS key\npolicy must grant cross-account access to that other account's user or role for\nboth the kms:GenerateDataKey and kms:Decrypt operations.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:UpdateSecret\n * kms:GenerateDataKey - needed only if you use a custom AWS KMS key to encrypt\nthe secret. You do not need this permission to use the account's AWS managed CMK\nfor Secrets Manager.\n * kms:Decrypt - needed only if you use a custom AWS KMS key to encrypt the\nsecret. You do not need this permission to use the account's AWS managed CMK for\nSecrets Manager.\n Related operations\n * To create a new secret, use CreateSecret.\n * To add only a new version to an existing secret, use PutSecretValue.\n * To get the details for a secret, use DescribeSecret.\n * To list the versions contained in a secret, use ListSecretVersionIds." ([update-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-secret-request update-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/update-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/update-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSecret", :http.request.configuration/output-deser-fn response-update-secret-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "EncryptionFailure" :portkey.aws.secretsmanager.-2017-10-17/encryption-failure, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "LimitExceededException" :portkey.aws.secretsmanager.-2017-10-17/limit-exceeded-exception, "ResourceExistsException" :portkey.aws.secretsmanager.-2017-10-17/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.secretsmanager.-2017-10-17/malformed-policy-document-exception, "PreconditionNotMetException" :portkey.aws.secretsmanager.-2017-10-17/precondition-not-met-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/update-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/update-secret-response))

(clojure.core/defn get-secret-value "Retrieves the contents of the encrypted fields SecretString or SecretBinary from\nthe specified version of a secret, whichever contains content.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:GetSecretValue\n * kms:Decrypt - required only if you use a customer-managed AWS KMS key to\nencrypt the secret. You do not need this permission to use the account's default\nAWS managed CMK for Secrets Manager.\n Related operations\n * To create a new version of the secret with different encrypted information,\nuse PutSecretValue.\n * To retrieve the non-encrypted details for the secret, use DescribeSecret." ([get-secret-value-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-secret-value-request get-secret-value-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/get-secret-value-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/get-secret-value-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSecretValue", :http.request.configuration/output-deser-fn response-get-secret-value-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "DecryptionFailure" :portkey.aws.secretsmanager.-2017-10-17/decryption-failure, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef get-secret-value :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/get-secret-value-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/get-secret-value-response))

(clojure.core/defn get-resource-policy "Retrieves the JSON text of the resource-based policy document that's attached to\nthe specified secret. The JSON request string input and response output are\nshown formatted with white space and line breaks for better readability. Submit\nyour input as a single line JSON string.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:GetResourcePolicy\n Related operations\n * To attach a resource policy to a secret, use PutResourcePolicy.\n * To delete the resource-based policy that's attached to a secret, use\nDeleteResourcePolicy.\n * To list all of the currently available secrets, use ListSecrets." ([get-resource-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resource-policy-request get-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/get-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/get-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourcePolicy", :http.request.configuration/output-deser-fn response-get-resource-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/get-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/get-resource-policy-response))

(clojure.core/defn list-secret-version-ids "Lists all of the versions attached to the specified secret. The output does not\ninclude the SecretString or SecretBinary fields. By default, the list includes\nonly versions that have at least one staging label in VersionStage attached.\n Always check the NextToken response parameter when calling any of the List*\noperations. These operations can occasionally return an empty or shorter than\nexpected list of results even when there are more results available. When this\nhappens, the NextToken response parameter contains a value to pass to the next\ncall to the same API to request the next part of the list.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:ListSecretVersionIds\n Related operations\n * To list the secrets in an account, use ListSecrets." ([list-secret-version-ids-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-secret-version-ids-request list-secret-version-ids-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/list-secret-version-ids-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/list-secret-version-ids-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSecretVersionIds", :http.request.configuration/output-deser-fn response-list-secret-version-ids-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.secretsmanager.-2017-10-17/invalid-next-token-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef list-secret-version-ids :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/list-secret-version-ids-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/list-secret-version-ids-response))

(clojure.core/defn put-resource-policy "Attaches the contents of the specified resource-based permission policy to a\nsecret. A resource-based policy is optional. Alternatively, you can use IAM\nidentity-based policies that specify the secret's Amazon Resource Name (ARN) in\nthe policy statement's Resources element. You can also use a combination of both\nidentity-based and resource-based policies. The affected users and roles receive\nthe permissions that are permitted by all of the relevant policies. For more\ninformation, see Using Resource-Based Policies for AWS Secrets Manager\n(http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).\nFor the complete description of the AWS policy syntax and grammar, see IAM JSON\nPolicy Reference\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html) in\nthe IAM User Guide.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:PutResourcePolicy\n Related operations\n * To retrieve the resource policy that's attached to a secret, use\nGetResourcePolicy.\n * To delete the resource-based policy that's attached to a secret, use\nDeleteResourcePolicy.\n * To list all of the currently available secrets, use ListSecrets." ([put-resource-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-resource-policy-request put-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/put-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/put-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResourcePolicy", :http.request.configuration/output-deser-fn response-put-resource-policy-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.secretsmanager.-2017-10-17/malformed-policy-document-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception}})))))
(clojure.spec.alpha/fdef put-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/put-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/put-resource-policy-response))

(clojure.core/defn put-secret-value "Stores a new encrypted secret value in the specified secret. To do this, the\noperation creates a new version and attaches it to the secret. The version can\ncontain a new SecretString value or a new SecretBinary value. You can also\nspecify the staging labels that are initially attached to the new version.\n The Secrets Manager console uses only the SecretString field. To add binary\ndata to a secret with the SecretBinary field you must use the AWS CLI or one of\nthe AWS SDKs.\n * If this operation creates the first version for the secret then Secrets\nManager automatically attaches the staging label AWSCURRENT to the new version.\n * If another version of this secret already exists, then this operation does\nnot automatically move any staging labels other than those that you explicitly\nspecify in the VersionStages parameter.\n * If this operation moves the staging label AWSCURRENT from another version to\nthis version (because you included it in the StagingLabels parameter) then\nSecrets Manager also automatically moves the staging label AWSPREVIOUS to the\nversion that AWSCURRENT was removed from.\n * This operation is idempotent. If a version with a VersionId with the same\nvalue as the ClientRequestToken parameter already exists and you specify the\nsame secret data, the operation succeeds but does nothing. However, if the\nsecret data is different, then the operation fails because you cannot modify an\nexisting version; you can only create new ones.\n * If you call an operation that needs to encrypt or decrypt the SecretString or\nSecretBinary for a secret in the same account as the calling user and that\nsecret doesn't specify a AWS KMS encryption key, Secrets Manager uses the\naccount's default AWS managed customer master key (CMK) with the alias\naws/secretsmanager. If this key doesn't already exist in your account then\nSecrets Manager creates it for you automatically. All users and roles in the\nsame AWS account automatically have access to use the default CMK. Note that if\nan Secrets Manager API call results in AWS having to create the account's\nAWS-managed CMK, it can result in a one-time significant delay in returning the\nresult.\n * If the secret is in a different AWS account from the credentials calling an\nAPI that requires encryption or decryption of the secret value then you must\ncreate and use a custom AWS KMS CMK because you can't access the default CMK for\nthe account using credentials from a different AWS account. Store the ARN of the\nCMK in the secret when you create the secret or when you update it by including\nit in the KMSKeyId. If you call an API that must encrypt or decrypt SecretString\nor SecretBinary using credentials from a different account then the AWS KMS key\npolicy must grant cross-account access to that other account's user or role for\nboth the kms:GenerateDataKey and kms:Decrypt operations.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:PutSecretValue\n * kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key\nto encrypt the secret. You do not need this permission to use the account's\ndefault AWS managed CMK for Secrets Manager.\n Related operations\n * To retrieve the encrypted value you store in the version of a secret, use\nGetSecretValue.\n * To create a secret, use CreateSecret.\n * To get the details for a secret, use DescribeSecret.\n * To list the versions attached to a secret, use ListSecretVersionIds." ([put-secret-value-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-secret-value-request put-secret-value-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/put-secret-value-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/put-secret-value-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSecretValue", :http.request.configuration/output-deser-fn response-put-secret-value-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "LimitExceededException" :portkey.aws.secretsmanager.-2017-10-17/limit-exceeded-exception, "EncryptionFailure" :portkey.aws.secretsmanager.-2017-10-17/encryption-failure, "ResourceExistsException" :portkey.aws.secretsmanager.-2017-10-17/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef put-secret-value :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/put-secret-value-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/put-secret-value-response))

(clojure.core/defn describe-secret "Retrieves the details of a secret. It does not include the encrypted fields.\nOnly those fields that are populated with a value are returned in the response.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:DescribeSecret\n Related operations\n * To create a secret, use CreateSecret.\n * To modify a secret, use UpdateSecret.\n * To retrieve the encrypted secret information in a version of the secret, use\nGetSecretValue.\n * To list all of the secrets in the AWS account, use ListSecrets." ([describe-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-secret-request describe-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/describe-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/describe-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSecret", :http.request.configuration/output-deser-fn response-describe-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef describe-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/describe-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/describe-secret-response))

(clojure.core/defn delete-secret "Deletes an entire secret and all of its versions. You can optionally include a\nrecovery window during which you can restore the secret. If you don't specify a\nrecovery window value, the operation defaults to 30 days. Secrets Manager\nattaches a DeletionDate stamp to the secret that specifies the end of the\nrecovery window. At the end of the recovery window, Secrets Manager deletes the\nsecret permanently.\n At any time before recovery window ends, you can use RestoreSecret to remove\nthe DeletionDate and cancel the deletion of the secret.\n You cannot access the encrypted secret information in any secret that is\nscheduled for deletion. If you need to access that information, you must cancel\nthe deletion with RestoreSecret and then retrieve the information.\n * There is no explicit operation to delete a version of a secret. Instead,\nremove all staging labels from the VersionStage field of a version. That marks\nthe version as deprecated and allows Secrets Manager to delete it as needed.\nVersions that do not have any staging labels do not show up in\nListSecretVersionIds unless you specify IncludeDeprecated.\n * The permanent secret deletion at the end of the waiting period is performed\nas a background task with low priority. There is no guarantee of a specific time\nafter the recovery window for the actual delete operation to occur.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:DeleteSecret\n Related operations\n * To create a secret, use CreateSecret.\n * To cancel deletion of a version of a secret before the recovery window has\nexpired, use RestoreSecret." ([delete-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-secret-request delete-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/delete-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/delete-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSecret", :http.request.configuration/output-deser-fn response-delete-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef delete-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/delete-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/delete-secret-response))

(clojure.core/defn untag-resource "Removes one or more tags from the specified secret.\n This operation is idempotent. If a requested tag is not attached to the secret,\nno error is returned and the secret metadata is unchanged.\n If you use tags as part of your security strategy, then removing a tag can\nchange permissions. If successfully completing this operation would result in\nyou losing your permissions for this secret, then the operation is blocked and\nreturns an Access Denied error.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:UntagResource\n Related operations\n * To add one or more tags to the collection attached to a secret, use\nTagResource.\n * To view the list of tags attached to a secret, use DescribeSecret." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn update-secret-version-stage "Modifies the staging labels attached to a version of a secret. Staging labels\nare used to track a version as it progresses through the secret rotation\nprocess. You can attach a staging label to only one version of a secret at a\ntime. If a staging label to be added is already attached to another version,\nthen it is moved--removed from the other version first and then attached to this\none. For more information about staging labels, see Staging Labels\n(https://docs.aws.amazon.com/secretsmanager/latest/userguide/terms-concepts.html#term_staging-label)\nin the AWS Secrets Manager User Guide.\n The staging labels that you specify in the VersionStage parameter are added to\nthe existing list of staging labels--they don't replace it.\n You can move the AWSCURRENT staging label to this version by including it in\nthis call.\n Whenever you move AWSCURRENT, Secrets Manager automatically moves the label\nAWSPREVIOUS to the version that AWSCURRENT was removed from.\n If this action results in the last label being removed from a version, then the\nversion is considered to be 'deprecated' and can be deleted by Secrets Manager.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:UpdateSecretVersionStage\n Related operations\n * To get the list of staging labels that are currently associated with a\nversion of a secret, use DescribeSecret and examine the SecretVersionsToStages\nresponse value." ([update-secret-version-stage-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-secret-version-stage-request update-secret-version-stage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/update-secret-version-stage-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/update-secret-version-stage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSecretVersionStage", :http.request.configuration/output-deser-fn response-update-secret-version-stage-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "LimitExceededException" :portkey.aws.secretsmanager.-2017-10-17/limit-exceeded-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef update-secret-version-stage :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/update-secret-version-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/update-secret-version-stage-response))

(clojure.core/defn restore-secret "Cancels the scheduled deletion of a secret by removing the DeletedDate time\nstamp. This makes the secret accessible to query once again.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:RestoreSecret\n Related operations\n * To delete a secret, use DeleteSecret." ([restore-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-restore-secret-request restore-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/restore-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/restore-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreSecret", :http.request.configuration/output-deser-fn response-restore-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef restore-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/restore-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/restore-secret-response))

(clojure.core/defn rotate-secret "Configures and starts the asynchronous process of rotating this secret. If you\ninclude the configuration parameters, the operation sets those values for the\nsecret and then immediately starts a rotation. If you do not include the\nconfiguration parameters, the operation starts a rotation with the values\nalready stored in the secret. After the rotation completes, the protected\nservice and its clients all use the new version of the secret.\n This required configuration information includes the ARN of an AWS Lambda\nfunction and the time between scheduled rotations. The Lambda rotation function\ncreates a new version of the secret and creates or updates the credentials on\nthe protected service to match. After testing the new credentials, the function\nmarks the new secret with the staging label AWSCURRENT so that your clients all\nimmediately begin to use the new version. For more information about rotating\nsecrets and how to configure a Lambda function to rotate the secrets for your\nprotected service, see Rotating Secrets in AWS Secrets Manager\n(https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html)\nin the AWS Secrets Manager User Guide.\n Secrets Manager schedules the next rotation when the previous one is complete.\nSecrets Manager schedules the date by adding the rotation interval (number of\ndays) to the actual date of the last rotation. The service chooses the hour\nwithin that 24-hour date window randomly. The minute is also chosen somewhat\nrandomly, but weighted towards the top of the hour and influenced by a variety\nof factors that help distribute load.\n The rotation function must end with the versions of the secret in one of two\nstates:\n * The AWSPENDING and AWSCURRENT staging labels are attached to the same version\nof the secret, or\n * The AWSPENDING staging label is not attached to any version of the secret.\n If instead the AWSPENDING staging label is present but is not attached to the\nsame version as AWSCURRENT then any later invocation of RotateSecret assumes\nthat a previous rotation request is still in progress and returns an error.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:RotateSecret\n * lambda:InvokeFunction (on the function specified in the secret's metadata)\n Related operations\n * To list the secrets in your account, use ListSecrets.\n * To get the details for a version of a secret, use DescribeSecret.\n * To create a new version of a secret, use CreateSecret.\n * To attach staging labels to or remove staging labels from a version of a\nsecret, use UpdateSecretVersionStage." ([rotate-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-rotate-secret-request rotate-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/rotate-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/rotate-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RotateSecret", :http.request.configuration/output-deser-fn response-rotate-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception}})))))
(clojure.spec.alpha/fdef rotate-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/rotate-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/rotate-secret-response))

(clojure.core/defn list-secrets "Lists all of the secrets that are stored by Secrets Manager in the AWS account.\nTo list the versions currently stored for a specific secret, use\nListSecretVersionIds. The encrypted fields SecretString and SecretBinary are not\nincluded in the output. To get that information, call the GetSecretValue\noperation.\n Always check the NextToken response parameter when calling any of the List*\noperations. These operations can occasionally return an empty or shorter than\nexpected list of results even when there are more results available. When this\nhappens, the NextToken response parameter contains a value to pass to the next\ncall to the same API to request the next part of the list.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:ListSecrets\n Related operations\n * To list the versions attached to a secret, use ListSecretVersionIds." ([] (list-secrets {})) ([list-secrets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-secrets-request list-secrets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/list-secrets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/list-secrets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSecrets", :http.request.configuration/output-deser-fn response-list-secrets-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.secretsmanager.-2017-10-17/invalid-next-token-exception, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error}})))))
(clojure.spec.alpha/fdef list-secrets :args (clojure.spec.alpha/? :portkey.aws.secretsmanager.-2017-10-17/list-secrets-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/list-secrets-response))

(clojure.core/defn create-secret "Creates a new secret. A secret in Secrets Manager consists of both the protected\nsecret data and the important information needed to manage the secret.\n Secrets Manager stores the encrypted secret data in one of a collection of\n\"versions\" associated with the secret. Each version contains a copy of the\nencrypted secret data. Each version is associated with one or more \"staging\nlabels\" that identify where the version is in the rotation cycle. The\nSecretVersionsToStages field of the secret contains the mapping of staging\nlabels to the active versions of the secret. Versions without a staging label\nare considered deprecated and are not included in the list.\n You provide the secret data to be encrypted by putting text in either the\nSecretString parameter or binary data in the SecretBinary parameter, but not\nboth. If you include SecretString or SecretBinary then Secrets Manager also\ncreates an initial secret version and automatically attaches the staging label\nAWSCURRENT to the new version.\n * If you call an operation that needs to encrypt or decrypt the SecretString or\nSecretBinary for a secret in the same account as the calling user and that\nsecret doesn't specify a AWS KMS encryption key, Secrets Manager uses the\naccount's default AWS managed customer master key (CMK) with the alias\naws/secretsmanager. If this key doesn't already exist in your account then\nSecrets Manager creates it for you automatically. All users and roles in the\nsame AWS account automatically have access to use the default CMK. Note that if\nan Secrets Manager API call results in AWS having to create the account's\nAWS-managed CMK, it can result in a one-time significant delay in returning the\nresult.\n * If the secret is in a different AWS account from the credentials calling an\nAPI that requires encryption or decryption of the secret value then you must\ncreate and use a custom AWS KMS CMK because you can't access the default CMK for\nthe account using credentials from a different AWS account. Store the ARN of the\nCMK in the secret when you create the secret or when you update it by including\nit in the KMSKeyId. If you call an API that must encrypt or decrypt SecretString\nor SecretBinary using credentials from a different account then the AWS KMS key\npolicy must grant cross-account access to that other account's user or role for\nboth the kms:GenerateDataKey and kms:Decrypt operations.\n Minimum permissions\n To run this command, you must have the following permissions:\n * secretsmanager:CreateSecret\n * kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key\nto encrypt the secret. You do not need this permission to use the account's\ndefault AWS managed CMK for Secrets Manager.\n * kms:Decrypt - needed only if you use a customer-managed AWS KMS key to\nencrypt the secret. You do not need this permission to use the account's default\nAWS managed CMK for Secrets Manager.\n * secretsmanager:TagResource - needed only if you include the Tags parameter.\n Related operations\n * To delete a secret, use DeleteSecret.\n * To modify an existing secret, use UpdateSecret.\n * To create a new version of a secret, use PutSecretValue.\n * To retrieve the encrypted secure string and secure binary values, use\nGetSecretValue.\n * To retrieve all other details for a secret, use DescribeSecret. This does not\ninclude the encrypted secure string and secure binary values.\n * To retrieve the list of secret versions associated with the current secret,\nuse DescribeSecret and examine the SecretVersionsToStages response value." ([create-secret-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-secret-request create-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager.-2017-10-17/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager.-2017-10-17/create-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager.-2017-10-17/create-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSecret", :http.request.configuration/output-deser-fn response-create-secret-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.secretsmanager.-2017-10-17/invalid-request-exception, "EncryptionFailure" :portkey.aws.secretsmanager.-2017-10-17/encryption-failure, "InternalServiceError" :portkey.aws.secretsmanager.-2017-10-17/internal-service-error, "LimitExceededException" :portkey.aws.secretsmanager.-2017-10-17/limit-exceeded-exception, "ResourceExistsException" :portkey.aws.secretsmanager.-2017-10-17/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager.-2017-10-17/resource-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.secretsmanager.-2017-10-17/malformed-policy-document-exception, "PreconditionNotMetException" :portkey.aws.secretsmanager.-2017-10-17/precondition-not-met-exception, "InvalidParameterException" :portkey.aws.secretsmanager.-2017-10-17/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager.-2017-10-17/create-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager.-2017-10-17/create-secret-response))
