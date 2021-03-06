(ns portkey.aws.cognito-idp (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cognito-idp", :region "ap-northeast-1"},
    :ssl-common-name "cognito-idp.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cognito-idp", :region "eu-west-1"},
    :ssl-common-name "cognito-idp.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-idp.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cognito-idp", :region "us-east-2"},
    :ssl-common-name "cognito-idp.us-east-2.amazonaws.com",
    :endpoint "https://cognito-idp.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cognito-idp", :region "ap-southeast-2"},
    :ssl-common-name "cognito-idp.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-idp.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cognito-idp", :region "ap-southeast-1"},
    :ssl-common-name "cognito-idp.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cognito-idp", :region "ap-northeast-2"},
    :ssl-common-name "cognito-idp.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-idp.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cognito-idp", :region "ca-central-1"},
    :ssl-common-name "cognito-idp.ca-central-1.amazonaws.com",
    :endpoint "https://cognito-idp.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cognito-idp", :region "eu-central-1"},
    :ssl-common-name "cognito-idp.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-idp.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cognito-idp", :region "eu-west-2"},
    :ssl-common-name "cognito-idp.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-idp.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cognito-idp", :region "us-west-2"},
    :ssl-common-name "cognito-idp.us-west-2.amazonaws.com",
    :endpoint "https://cognito-idp.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cognito-idp", :region "us-east-1"},
    :ssl-common-name "cognito-idp.us-east-1.amazonaws.com",
    :endpoint "https://cognito-idp.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cognito-idp", :region "ap-south-1"},
    :ssl-common-name "cognito-idp.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-redirect-url-type)

(clojure.core/declare ser-attribute-type)

(clojure.core/declare ser-device-configuration-type)

(clojure.core/declare ser-user-pool-id-type)

(clojure.core/declare ser-list-providers-limit-type)

(clojure.core/declare ser-provider-name-type)

(clojure.core/declare ser-username-attributes-list-type)

(clojure.core/declare ser-analytics-metadata-type)

(clojure.core/declare ser-css-type)

(clojure.core/declare ser-advanced-security-mode-type)

(clojure.core/declare ser-event-id-type)

(clojure.core/declare ser-sms-mfa-config-type)

(clojure.core/declare ser-client-metadata-type)

(clojure.core/declare ser-provider-user-identifier-type)

(clojure.core/declare ser-alias-attributes-list-type)

(clojure.core/declare ser-arn-type)

(clojure.core/declare ser-resource-server-scope-list-type)

(clojure.core/declare ser-supported-identity-providers-list-type)

(clojure.core/declare ser-pagination-key)

(clojure.core/declare ser-delivery-medium-type)

(clojure.core/declare ser-context-data-type)

(clojure.core/declare ser-http-header)

(clojure.core/declare ser-attribute-list-type)

(clojure.core/declare ser-http-header-list)

(clojure.core/declare ser-identity-provider-type-type)

(clojure.core/declare ser-precedence-type)

(clojure.core/declare ser-force-alias-creation)

(clojure.core/declare ser-auth-parameters-type)

(clojure.core/declare ser-device-name-type)

(clojure.core/declare ser-o-auth-flows-type)

(clojure.core/declare ser-query-limit)

(clojure.core/declare ser-idp-identifiers-list-type)

(clojure.core/declare ser-alias-attribute-type)

(clojure.core/declare ser-challenge-responses-type)

(clojure.core/declare ser-email-verification-message-type)

(clojure.core/declare ser-hex-string-type)

(clojure.core/declare ser-o-auth-flow-type)

(clojure.core/declare ser-user-pool-name-type)

(clojure.core/declare ser-resource-server-identifier-type)

(clojure.core/declare ser-provider-name-type-v-1)

(clojure.core/declare ser-analytics-configuration-type)

(clojure.core/declare ser-email-address-type)

(clojure.core/declare ser-delivery-medium-list-type)

(clojure.core/declare ser-software-token-mfa-settings-type)

(clojure.core/declare ser-admin-create-user-config-type)

(clojure.core/declare ser-client-permission-list-type)

(clojure.core/declare ser-generate-secret)

(clojure.core/declare ser-search-pagination-token-type)

(clojure.core/declare ser-resource-server-scope-name-type)

(clojure.core/declare ser-client-permission-type)

(clojure.core/declare ser-email-verification-message-by-link-type)

(clojure.core/declare ser-number-attribute-constraints-type)

(clojure.core/declare ser-list-resource-servers-limit-type)

(clojure.core/declare ser-password-policy-min-length-type)

(clojure.core/declare ser-resource-server-scope-type)

(clojure.core/declare ser-verified-attributes-list-type)

(clojure.core/declare ser-resource-server-name-type)

(clojure.core/declare ser-token-model-type)

(clojure.core/declare ser-username-type)

(clojure.core/declare ser-email-notification-body-type)

(clojure.core/declare ser-group-name-type)

(clojure.core/declare ser-verified-attribute-type)

(clojure.core/declare ser-pagination-key-type)

(clojure.core/declare ser-admin-create-user-unused-account-validity-days-type)

(clojure.core/declare ser-compromised-credentials-risk-configuration-type)

(clojure.core/declare ser-user-import-job-name-type)

(clojure.core/declare ser-user-pool-add-ons-type)

(clojure.core/declare ser-software-token-mfa-user-code-type)

(clojure.core/declare ser-lambda-config-type)

(clojure.core/declare ser-device-remembered-status-type)

(clojure.core/declare ser-schema-attribute-type)

(clojure.core/declare ser-custom-domain-config-type)

(clojure.core/declare ser-attribute-data-type)

(clojure.core/declare ser-provider-details-type)

(clojure.core/declare ser-skipped-ip-range-list-type)

(clojure.core/declare ser-auth-flow-type)

(clojure.core/declare ser-explicit-auth-flows-type)

(clojure.core/declare ser-user-context-data-type)

(clojure.core/declare ser-user-import-job-id-type)

(clojure.core/declare ser-password-type)

(clojure.core/declare ser-sms-verification-message-type)

(clojure.core/declare ser-user-pool-tags-type)

(clojure.core/declare ser-password-policy-type)

(clojure.core/declare ser-event-filters-type)

(clojure.core/declare ser-verification-message-template-type)

(clojure.core/declare ser-logout-ur-ls-list-type)

(clojure.core/declare ser-blocked-ip-range-list-type)

(clojure.core/declare ser-secret-hash-type)

(clojure.core/declare ser-searched-attribute-names-list-type)

(clojure.core/declare ser-attribute-name-list-type)

(clojure.core/declare ser-scope-type)

(clojure.core/declare ser-resource-server-scope-description-type)

(clojure.core/declare ser-message-template-type)

(clojure.core/declare ser-attribute-mapping-key-type)

(clojure.core/declare ser-custom-attributes-list-type)

(clojure.core/declare ser-schema-attributes-list-type)

(clojure.core/declare ser-software-token-mfa-config-type)

(clojure.core/declare ser-image-file-type)

(clojure.core/declare ser-user-filter-type)

(clojure.core/declare ser-refresh-token-validity-type)

(clojure.core/declare ser-string-type)

(clojure.core/declare ser-query-limit-type)

(clojure.core/declare ser-domain-type)

(clojure.core/declare ser-event-filter-type)

(clojure.core/declare ser-explicit-auth-flows-list-type)

(clojure.core/declare ser-sms-mfa-settings-type)

(clojure.core/declare ser-feedback-value-type)

(clojure.core/declare ser-attribute-mapping-type)

(clojure.core/declare ser-user-pool-policy-type)

(clojure.core/declare ser-attribute-value-type)

(clojure.core/declare ser-default-email-option-type)

(clojure.core/declare ser-pool-query-limit-type)

(clojure.core/declare ser-risk-exception-configuration-type)

(clojure.core/declare ser-confirmation-code-type)

(clojure.core/declare ser-user-pool-mfa-type)

(clojure.core/declare ser-sms-configuration-type)

(clojure.core/declare ser-username-attribute-type)

(clojure.core/declare ser-account-takeover-risk-configuration-type)

(clojure.core/declare ser-account-takeover-action-type)

(clojure.core/declare ser-attribute-name-type)

(clojure.core/declare ser-description-type)

(clojure.core/declare ser-email-verification-subject-type)

(clojure.core/declare ser-device-secret-verifier-config-type)

(clojure.core/declare ser-account-takeover-event-action-type)

(clojure.core/declare ser-scope-list-type)

(clojure.core/declare ser-email-verification-subject-by-link-type)

(clojure.core/declare ser-compromised-credentials-actions-type)

(clojure.core/declare ser-account-takeover-actions-type)

(clojure.core/declare ser-account-takeover-action-notify-type)

(clojure.core/declare ser-client-name-type)

(clojure.core/declare ser-string-attribute-constraints-type)

(clojure.core/declare ser-compromised-credentials-event-action-type)

(clojure.core/declare ser-email-configuration-type)

(clojure.core/declare ser-client-id-type)

(clojure.core/declare ser-idp-identifier-type)

(clojure.core/declare ser-custom-attribute-name-type)

(clojure.core/declare ser-mfa-option-list-type)

(clojure.core/declare ser-session-type)

(clojure.core/declare ser-callback-ur-ls-list-type)

(clojure.core/declare ser-message-action-type)

(clojure.core/declare ser-challenge-name-type)

(clojure.core/declare ser-email-notification-subject-type)

(clojure.core/declare ser-notify-email-type)

(clojure.core/declare ser-device-key-type)

(clojure.core/declare ser-mfa-option-type)

(clojure.core/declare ser-boolean-type)

(clojure.core/declare ser-notify-configuration-type)

(clojure.core/defn- ser-redirect-url-type [input] #:http.request.field{:value input, :shape "RedirectUrlType"})

(clojure.core/defn- ser-attribute-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-name-type (:name input)) #:http.request.field{:name "Name", :shape "AttributeNameType"})], :shape "AttributeType", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value-type (input :value)) #:http.request.field{:name "Value", :shape "AttributeValueType"}))))

(clojure.core/defn- ser-device-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeviceConfigurationType", :type "structure"} (clojure.core/contains? input :challenge-required-on-new-device) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :challenge-required-on-new-device)) #:http.request.field{:name "ChallengeRequiredOnNewDevice", :shape "BooleanType"})) (clojure.core/contains? input :device-only-remembered-on-user-prompt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :device-only-remembered-on-user-prompt)) #:http.request.field{:name "DeviceOnlyRememberedOnUserPrompt", :shape "BooleanType"}))))

(clojure.core/defn- ser-user-pool-id-type [input] #:http.request.field{:value input, :shape "UserPoolIdType"})

(clojure.core/defn- ser-list-providers-limit-type [input] #:http.request.field{:value input, :shape "ListProvidersLimitType"})

(clojure.core/defn- ser-provider-name-type [input] #:http.request.field{:value input, :shape "ProviderNameType"})

(clojure.core/defn- ser-username-attributes-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-username-attribute-type coll) #:http.request.field{:shape "UsernameAttributeType"}))) input), :shape "UsernameAttributesListType", :type "list"})

(clojure.core/defn- ser-analytics-metadata-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AnalyticsMetadataType", :type "structure"} (clojure.core/contains? input :analytics-endpoint-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :analytics-endpoint-id)) #:http.request.field{:name "AnalyticsEndpointId", :shape "StringType"}))))

(clojure.core/defn- ser-css-type [input] #:http.request.field{:value input, :shape "CSSType"})

(clojure.core/defn- ser-advanced-security-mode-type [input] #:http.request.field{:value (clojure.core/get {"OFF" "OFF", :off "OFF", "AUDIT" "AUDIT", :audit "AUDIT", "ENFORCED" "ENFORCED", :enforced "ENFORCED"} input), :shape "AdvancedSecurityModeType"})

(clojure.core/defn- ser-event-id-type [input] #:http.request.field{:value input, :shape "EventIdType"})

(clojure.core/defn- ser-sms-mfa-config-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SmsMfaConfigType", :type "structure"} (clojure.core/contains? input :sms-authentication-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-authentication-message)) #:http.request.field{:name "SmsAuthenticationMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :sms-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-configuration-type (input :sms-configuration)) #:http.request.field{:name "SmsConfiguration", :shape "SmsConfigurationType"}))))

(clojure.core/defn- ser-client-metadata-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string-type k) #:http.request.field{:map-info "key", :shape "StringType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "ClientMetadataType", :type "map"})

(clojure.core/defn- ser-provider-user-identifier-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ProviderUserIdentifierType", :type "structure"} (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-name-type (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderNameType"})) (clojure.core/contains? input :provider-attribute-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :provider-attribute-name)) #:http.request.field{:name "ProviderAttributeName", :shape "StringType"})) (clojure.core/contains? input :provider-attribute-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :provider-attribute-value)) #:http.request.field{:name "ProviderAttributeValue", :shape "StringType"}))))

(clojure.core/defn- ser-alias-attributes-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-alias-attribute-type coll) #:http.request.field{:shape "AliasAttributeType"}))) input), :shape "AliasAttributesListType", :type "list"})

(clojure.core/defn- ser-arn-type [input] #:http.request.field{:value input, :shape "ArnType"})

(clojure.core/defn- ser-resource-server-scope-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-server-scope-type coll) #:http.request.field{:shape "ResourceServerScopeType"}))) input), :shape "ResourceServerScopeListType", :type "list", :max 25})

(clojure.core/defn- ser-supported-identity-providers-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-provider-name-type coll) #:http.request.field{:shape "ProviderNameType"}))) input), :shape "SupportedIdentityProvidersListType", :type "list"})

(clojure.core/defn- ser-pagination-key [input] #:http.request.field{:value input, :shape "PaginationKey"})

(clojure.core/defn- ser-delivery-medium-type [input] #:http.request.field{:value (clojure.core/get {"SMS" "SMS", :sms "SMS", "EMAIL" "EMAIL", :email "EMAIL"} input), :shape "DeliveryMediumType"})

(clojure.core/defn- ser-context-data-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-type (:ip-address input)) #:http.request.field{:name "IpAddress", :shape "StringType"}) (clojure.core/into (ser-string-type (:server-name input)) #:http.request.field{:name "ServerName", :shape "StringType"}) (clojure.core/into (ser-string-type (:server-path input)) #:http.request.field{:name "ServerPath", :shape "StringType"}) (clojure.core/into (ser-http-header-list (:http-headers input)) #:http.request.field{:name "HttpHeaders", :shape "HttpHeaderList"})], :shape "ContextDataType", :type "structure"} (clojure.core/contains? input :encoded-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :encoded-data)) #:http.request.field{:name "EncodedData", :shape "StringType"}))))

(clojure.core/defn- ser-http-header [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpHeader", :type "structure"} (clojure.core/contains? input :header-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :header-name)) #:http.request.field{:name "headerName", :shape "StringType"})) (clojure.core/contains? input :header-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :header-value)) #:http.request.field{:name "headerValue", :shape "StringType"}))))

(clojure.core/defn- ser-attribute-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-type coll) #:http.request.field{:shape "AttributeType"}))) input), :shape "AttributeListType", :type "list"})

(clojure.core/defn- ser-http-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-http-header coll) #:http.request.field{:shape "HttpHeader"}))) input), :shape "HttpHeaderList", :type "list"})

(clojure.core/defn- ser-identity-provider-type-type [input] #:http.request.field{:value (clojure.core/get {"OIDC" "OIDC", :facebook "Facebook", :oidc "OIDC", "Google" "Google", "SAML" "SAML", :login-with-amazon "LoginWithAmazon", "LoginWithAmazon" "LoginWithAmazon", :google "Google", :saml "SAML", "Facebook" "Facebook"} input), :shape "IdentityProviderTypeType"})

(clojure.core/defn- ser-precedence-type [input] #:http.request.field{:value input, :shape "PrecedenceType"})

(clojure.core/defn- ser-force-alias-creation [input] #:http.request.field{:value input, :shape "ForceAliasCreation"})

(clojure.core/defn- ser-auth-parameters-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string-type k) #:http.request.field{:map-info "key", :shape "StringType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "AuthParametersType", :type "map"})

(clojure.core/defn- ser-device-name-type [input] #:http.request.field{:value input, :shape "DeviceNameType"})

(clojure.core/defn- ser-o-auth-flows-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-o-auth-flow-type coll) #:http.request.field{:shape "OAuthFlowType"}))) input), :shape "OAuthFlowsType", :type "list", :max 3, :min 0})

(clojure.core/defn- ser-query-limit [input] #:http.request.field{:value input, :shape "QueryLimit"})

(clojure.core/defn- ser-idp-identifiers-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-idp-identifier-type coll) #:http.request.field{:shape "IdpIdentifierType"}))) input), :shape "IdpIdentifiersListType", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-alias-attribute-type [input] #:http.request.field{:value (clojure.core/get {"phone_number" "phone_number", :phone-number "phone_number", "email" "email", :email "email", "preferred_username" "preferred_username", :preferred-username "preferred_username"} input), :shape "AliasAttributeType"})

(clojure.core/defn- ser-challenge-responses-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string-type k) #:http.request.field{:map-info "key", :shape "StringType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "ChallengeResponsesType", :type "map"})

(clojure.core/defn- ser-email-verification-message-type [input] #:http.request.field{:value input, :shape "EmailVerificationMessageType"})

(clojure.core/defn- ser-hex-string-type [input] #:http.request.field{:value input, :shape "HexStringType"})

(clojure.core/defn- ser-o-auth-flow-type [input] #:http.request.field{:value (clojure.core/get {"code" "code", :code "code", "implicit" "implicit", :implicit "implicit", "client_credentials" "client_credentials", :client-credentials "client_credentials"} input), :shape "OAuthFlowType"})

(clojure.core/defn- ser-user-pool-name-type [input] #:http.request.field{:value input, :shape "UserPoolNameType"})

(clojure.core/defn- ser-resource-server-identifier-type [input] #:http.request.field{:value input, :shape "ResourceServerIdentifierType"})

(clojure.core/defn- ser-provider-name-type-v-1 [input] #:http.request.field{:value input, :shape "ProviderNameTypeV1"})

(clojure.core/defn- ser-analytics-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hex-string-type (:application-id input)) #:http.request.field{:name "ApplicationId", :shape "HexStringType"}) (clojure.core/into (ser-arn-type (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "ArnType"}) (clojure.core/into (ser-string-type (:external-id input)) #:http.request.field{:name "ExternalId", :shape "StringType"})], :shape "AnalyticsConfigurationType", :type "structure"} (clojure.core/contains? input :user-data-shared) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :user-data-shared)) #:http.request.field{:name "UserDataShared", :shape "BooleanType"}))))

(clojure.core/defn- ser-email-address-type [input] #:http.request.field{:value input, :shape "EmailAddressType"})

(clojure.core/defn- ser-delivery-medium-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-delivery-medium-type coll) #:http.request.field{:shape "DeliveryMediumType"}))) input), :shape "DeliveryMediumListType", :type "list"})

(clojure.core/defn- ser-software-token-mfa-settings-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SoftwareTokenMfaSettingsType", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanType"})) (clojure.core/contains? input :preferred-mfa) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :preferred-mfa)) #:http.request.field{:name "PreferredMfa", :shape "BooleanType"}))))

(clojure.core/defn- ser-admin-create-user-config-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AdminCreateUserConfigType", :type "structure"} (clojure.core/contains? input :allow-admin-create-user-only) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :allow-admin-create-user-only)) #:http.request.field{:name "AllowAdminCreateUserOnly", :shape "BooleanType"})) (clojure.core/contains? input :unused-account-validity-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-admin-create-user-unused-account-validity-days-type (input :unused-account-validity-days)) #:http.request.field{:name "UnusedAccountValidityDays", :shape "AdminCreateUserUnusedAccountValidityDaysType"})) (clojure.core/contains? input :invite-message-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-template-type (input :invite-message-template)) #:http.request.field{:name "InviteMessageTemplate", :shape "MessageTemplateType"}))))

(clojure.core/defn- ser-client-permission-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-client-permission-type coll) #:http.request.field{:shape "ClientPermissionType"}))) input), :shape "ClientPermissionListType", :type "list"})

(clojure.core/defn- ser-generate-secret [input] #:http.request.field{:value input, :shape "GenerateSecret"})

(clojure.core/defn- ser-search-pagination-token-type [input] #:http.request.field{:value input, :shape "SearchPaginationTokenType"})

(clojure.core/defn- ser-resource-server-scope-name-type [input] #:http.request.field{:value input, :shape "ResourceServerScopeNameType"})

(clojure.core/defn- ser-client-permission-type [input] #:http.request.field{:value input, :shape "ClientPermissionType"})

(clojure.core/defn- ser-email-verification-message-by-link-type [input] #:http.request.field{:value input, :shape "EmailVerificationMessageByLinkType"})

(clojure.core/defn- ser-number-attribute-constraints-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NumberAttributeConstraintsType", :type "structure"} (clojure.core/contains? input :min-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :min-value)) #:http.request.field{:name "MinValue", :shape "StringType"})) (clojure.core/contains? input :max-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :max-value)) #:http.request.field{:name "MaxValue", :shape "StringType"}))))

(clojure.core/defn- ser-list-resource-servers-limit-type [input] #:http.request.field{:value input, :shape "ListResourceServersLimitType"})

(clojure.core/defn- ser-password-policy-min-length-type [input] #:http.request.field{:value input, :shape "PasswordPolicyMinLengthType"})

(clojure.core/defn- ser-resource-server-scope-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-server-scope-name-type (:scope-name input)) #:http.request.field{:name "ScopeName", :shape "ResourceServerScopeNameType"}) (clojure.core/into (ser-resource-server-scope-description-type (:scope-description input)) #:http.request.field{:name "ScopeDescription", :shape "ResourceServerScopeDescriptionType"})], :shape "ResourceServerScopeType", :type "structure"}))

(clojure.core/defn- ser-verified-attributes-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-verified-attribute-type coll) #:http.request.field{:shape "VerifiedAttributeType"}))) input), :shape "VerifiedAttributesListType", :type "list"})

(clojure.core/defn- ser-resource-server-name-type [input] #:http.request.field{:value input, :shape "ResourceServerNameType"})

(clojure.core/defn- ser-token-model-type [input] #:http.request.field{:value input, :shape "TokenModelType"})

(clojure.core/defn- ser-username-type [input] #:http.request.field{:value input, :shape "UsernameType"})

(clojure.core/defn- ser-email-notification-body-type [input] #:http.request.field{:value input, :shape "EmailNotificationBodyType"})

(clojure.core/defn- ser-group-name-type [input] #:http.request.field{:value input, :shape "GroupNameType"})

(clojure.core/defn- ser-verified-attribute-type [input] #:http.request.field{:value (clojure.core/get {"phone_number" "phone_number", :phone-number "phone_number", "email" "email", :email "email"} input), :shape "VerifiedAttributeType"})

(clojure.core/defn- ser-pagination-key-type [input] #:http.request.field{:value input, :shape "PaginationKeyType"})

(clojure.core/defn- ser-admin-create-user-unused-account-validity-days-type [input] #:http.request.field{:value input, :shape "AdminCreateUserUnusedAccountValidityDaysType"})

(clojure.core/defn- ser-compromised-credentials-risk-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-compromised-credentials-actions-type (:actions input)) #:http.request.field{:name "Actions", :shape "CompromisedCredentialsActionsType"})], :shape "CompromisedCredentialsRiskConfigurationType", :type "structure"} (clojure.core/contains? input :event-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-filters-type (input :event-filter)) #:http.request.field{:name "EventFilter", :shape "EventFiltersType"}))))

(clojure.core/defn- ser-user-import-job-name-type [input] #:http.request.field{:value input, :shape "UserImportJobNameType"})

(clojure.core/defn- ser-user-pool-add-ons-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-advanced-security-mode-type (:advanced-security-mode input)) #:http.request.field{:name "AdvancedSecurityMode", :shape "AdvancedSecurityModeType"})], :shape "UserPoolAddOnsType", :type "structure"}))

(clojure.core/defn- ser-software-token-mfa-user-code-type [input] #:http.request.field{:value input, :shape "SoftwareTokenMFAUserCodeType"})

(clojure.core/defn- ser-lambda-config-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LambdaConfigType", :type "structure"} (clojure.core/contains? input :pre-sign-up) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :pre-sign-up)) #:http.request.field{:name "PreSignUp", :shape "ArnType"})) (clojure.core/contains? input :pre-token-generation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :pre-token-generation)) #:http.request.field{:name "PreTokenGeneration", :shape "ArnType"})) (clojure.core/contains? input :pre-authentication) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :pre-authentication)) #:http.request.field{:name "PreAuthentication", :shape "ArnType"})) (clojure.core/contains? input :create-auth-challenge) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :create-auth-challenge)) #:http.request.field{:name "CreateAuthChallenge", :shape "ArnType"})) (clojure.core/contains? input :verify-auth-challenge-response) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :verify-auth-challenge-response)) #:http.request.field{:name "VerifyAuthChallengeResponse", :shape "ArnType"})) (clojure.core/contains? input :post-authentication) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :post-authentication)) #:http.request.field{:name "PostAuthentication", :shape "ArnType"})) (clojure.core/contains? input :custom-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :custom-message)) #:http.request.field{:name "CustomMessage", :shape "ArnType"})) (clojure.core/contains? input :post-confirmation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :post-confirmation)) #:http.request.field{:name "PostConfirmation", :shape "ArnType"})) (clojure.core/contains? input :define-auth-challenge) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :define-auth-challenge)) #:http.request.field{:name "DefineAuthChallenge", :shape "ArnType"})) (clojure.core/contains? input :user-migration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :user-migration)) #:http.request.field{:name "UserMigration", :shape "ArnType"}))))

(clojure.core/defn- ser-device-remembered-status-type [input] #:http.request.field{:value (clojure.core/get {"remembered" "remembered", :remembered "remembered", "not_remembered" "not_remembered", :not-remembered "not_remembered"} input), :shape "DeviceRememberedStatusType"})

(clojure.core/defn- ser-schema-attribute-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SchemaAttributeType", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-attribute-name-type (input :name)) #:http.request.field{:name "Name", :shape "CustomAttributeNameType"})) (clojure.core/contains? input :attribute-data-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-data-type (input :attribute-data-type)) #:http.request.field{:name "AttributeDataType", :shape "AttributeDataType"})) (clojure.core/contains? input :developer-only-attribute) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :developer-only-attribute)) #:http.request.field{:name "DeveloperOnlyAttribute", :shape "BooleanType", :box true})) (clojure.core/contains? input :mutable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :mutable)) #:http.request.field{:name "Mutable", :shape "BooleanType", :box true})) (clojure.core/contains? input :required) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :required)) #:http.request.field{:name "Required", :shape "BooleanType", :box true})) (clojure.core/contains? input :number-attribute-constraints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-attribute-constraints-type (input :number-attribute-constraints)) #:http.request.field{:name "NumberAttributeConstraints", :shape "NumberAttributeConstraintsType"})) (clojure.core/contains? input :string-attribute-constraints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-attribute-constraints-type (input :string-attribute-constraints)) #:http.request.field{:name "StringAttributeConstraints", :shape "StringAttributeConstraintsType"}))))

(clojure.core/defn- ser-custom-domain-config-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn-type (:certificate-arn input)) #:http.request.field{:name "CertificateArn", :shape "ArnType"})], :shape "CustomDomainConfigType", :type "structure"}))

(clojure.core/defn- ser-attribute-data-type [input] #:http.request.field{:value (clojure.core/get {"String" "String", :string "String", "Number" "Number", :number "Number", "DateTime" "DateTime", :date-time "DateTime", "Boolean" "Boolean", :boolean "Boolean"} input), :shape "AttributeDataType"})

(clojure.core/defn- ser-provider-details-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string-type k) #:http.request.field{:map-info "key", :shape "StringType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "ProviderDetailsType", :type "map"})

(clojure.core/defn- ser-skipped-ip-range-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-type coll) #:http.request.field{:shape "StringType"}))) input), :shape "SkippedIPRangeListType", :type "list", :max 20})

(clojure.core/defn- ser-auth-flow-type [input] #:http.request.field{:value (clojure.core/get {:refresh-token "REFRESH_TOKEN", :custom-auth "CUSTOM_AUTH", "CUSTOM_AUTH" "CUSTOM_AUTH", :user-password-auth "USER_PASSWORD_AUTH", "ADMIN_NO_SRP_AUTH" "ADMIN_NO_SRP_AUTH", "USER_SRP_AUTH" "USER_SRP_AUTH", :admin-no-srp-auth "ADMIN_NO_SRP_AUTH", "USER_PASSWORD_AUTH" "USER_PASSWORD_AUTH", "REFRESH_TOKEN" "REFRESH_TOKEN", "REFRESH_TOKEN_AUTH" "REFRESH_TOKEN_AUTH", :user-srp-auth "USER_SRP_AUTH", :refresh-token-auth "REFRESH_TOKEN_AUTH"} input), :shape "AuthFlowType"})

(clojure.core/defn- ser-explicit-auth-flows-type [input] #:http.request.field{:value (clojure.core/get {"ADMIN_NO_SRP_AUTH" "ADMIN_NO_SRP_AUTH", :admin-no-srp-auth "ADMIN_NO_SRP_AUTH", "CUSTOM_AUTH_FLOW_ONLY" "CUSTOM_AUTH_FLOW_ONLY", :custom-auth-flow-only "CUSTOM_AUTH_FLOW_ONLY", "USER_PASSWORD_AUTH" "USER_PASSWORD_AUTH", :user-password-auth "USER_PASSWORD_AUTH"} input), :shape "ExplicitAuthFlowsType"})

(clojure.core/defn- ser-user-context-data-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UserContextDataType", :type "structure"} (clojure.core/contains? input :encoded-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :encoded-data)) #:http.request.field{:name "EncodedData", :shape "StringType"}))))

(clojure.core/defn- ser-user-import-job-id-type [input] #:http.request.field{:value input, :shape "UserImportJobIdType"})

(clojure.core/defn- ser-password-type [input] #:http.request.field{:value input, :shape "PasswordType"})

(clojure.core/defn- ser-sms-verification-message-type [input] #:http.request.field{:value input, :shape "SmsVerificationMessageType"})

(clojure.core/defn- ser-user-pool-tags-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string-type k) #:http.request.field{:map-info "key", :shape "StringType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "UserPoolTagsType", :type "map"})

(clojure.core/defn- ser-password-policy-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PasswordPolicyType", :type "structure"} (clojure.core/contains? input :minimum-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password-policy-min-length-type (input :minimum-length)) #:http.request.field{:name "MinimumLength", :shape "PasswordPolicyMinLengthType"})) (clojure.core/contains? input :require-uppercase) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :require-uppercase)) #:http.request.field{:name "RequireUppercase", :shape "BooleanType"})) (clojure.core/contains? input :require-lowercase) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :require-lowercase)) #:http.request.field{:name "RequireLowercase", :shape "BooleanType"})) (clojure.core/contains? input :require-numbers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :require-numbers)) #:http.request.field{:name "RequireNumbers", :shape "BooleanType"})) (clojure.core/contains? input :require-symbols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :require-symbols)) #:http.request.field{:name "RequireSymbols", :shape "BooleanType"}))))

(clojure.core/defn- ser-event-filters-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-filter-type coll) #:http.request.field{:shape "EventFilterType"}))) input), :shape "EventFiltersType", :type "list"})

(clojure.core/defn- ser-verification-message-template-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VerificationMessageTemplateType", :type "structure"} (clojure.core/contains? input :sms-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-message)) #:http.request.field{:name "SmsMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :email-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-message-type (input :email-message)) #:http.request.field{:name "EmailMessage", :shape "EmailVerificationMessageType"})) (clojure.core/contains? input :email-subject) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-subject-type (input :email-subject)) #:http.request.field{:name "EmailSubject", :shape "EmailVerificationSubjectType"})) (clojure.core/contains? input :email-message-by-link) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-message-by-link-type (input :email-message-by-link)) #:http.request.field{:name "EmailMessageByLink", :shape "EmailVerificationMessageByLinkType"})) (clojure.core/contains? input :email-subject-by-link) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-subject-by-link-type (input :email-subject-by-link)) #:http.request.field{:name "EmailSubjectByLink", :shape "EmailVerificationSubjectByLinkType"})) (clojure.core/contains? input :default-email-option) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default-email-option-type (input :default-email-option)) #:http.request.field{:name "DefaultEmailOption", :shape "DefaultEmailOptionType"}))))

(clojure.core/defn- ser-logout-ur-ls-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-redirect-url-type coll) #:http.request.field{:shape "RedirectUrlType"}))) input), :shape "LogoutURLsListType", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-blocked-ip-range-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-type coll) #:http.request.field{:shape "StringType"}))) input), :shape "BlockedIPRangeListType", :type "list", :max 20})

(clojure.core/defn- ser-secret-hash-type [input] #:http.request.field{:value input, :shape "SecretHashType"})

(clojure.core/defn- ser-searched-attribute-names-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name-type coll) #:http.request.field{:shape "AttributeNameType"}))) input), :shape "SearchedAttributeNamesListType", :type "list"})

(clojure.core/defn- ser-attribute-name-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name-type coll) #:http.request.field{:shape "AttributeNameType"}))) input), :shape "AttributeNameListType", :type "list"})

(clojure.core/defn- ser-scope-type [input] #:http.request.field{:value input, :shape "ScopeType"})

(clojure.core/defn- ser-resource-server-scope-description-type [input] #:http.request.field{:value input, :shape "ResourceServerScopeDescriptionType"})

(clojure.core/defn- ser-message-template-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MessageTemplateType", :type "structure"} (clojure.core/contains? input :sms-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-message)) #:http.request.field{:name "SMSMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :email-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-message-type (input :email-message)) #:http.request.field{:name "EmailMessage", :shape "EmailVerificationMessageType"})) (clojure.core/contains? input :email-subject) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-subject-type (input :email-subject)) #:http.request.field{:name "EmailSubject", :shape "EmailVerificationSubjectType"}))))

(clojure.core/defn- ser-attribute-mapping-key-type [input] #:http.request.field{:value input, :shape "AttributeMappingKeyType"})

(clojure.core/defn- ser-custom-attributes-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-schema-attribute-type coll) #:http.request.field{:shape "SchemaAttributeType"}))) input), :shape "CustomAttributesListType", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-schema-attributes-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-schema-attribute-type coll) #:http.request.field{:shape "SchemaAttributeType"}))) input), :shape "SchemaAttributesListType", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-software-token-mfa-config-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SoftwareTokenMfaConfigType", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanType"}))))

(clojure.core/defn- ser-image-file-type [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ImageFileType"})

(clojure.core/defn- ser-user-filter-type [input] #:http.request.field{:value input, :shape "UserFilterType"})

(clojure.core/defn- ser-refresh-token-validity-type [input] #:http.request.field{:value input, :shape "RefreshTokenValidityType"})

(clojure.core/defn- ser-string-type [input] #:http.request.field{:value input, :shape "StringType"})

(clojure.core/defn- ser-query-limit-type [input] #:http.request.field{:value input, :shape "QueryLimitType"})

(clojure.core/defn- ser-domain-type [input] #:http.request.field{:value input, :shape "DomainType"})

(clojure.core/defn- ser-event-filter-type [input] #:http.request.field{:value (clojure.core/get {"SIGN_IN" "SIGN_IN", :sign-in "SIGN_IN", "PASSWORD_CHANGE" "PASSWORD_CHANGE", :password-change "PASSWORD_CHANGE", "SIGN_UP" "SIGN_UP", :sign-up "SIGN_UP"} input), :shape "EventFilterType"})

(clojure.core/defn- ser-explicit-auth-flows-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-explicit-auth-flows-type coll) #:http.request.field{:shape "ExplicitAuthFlowsType"}))) input), :shape "ExplicitAuthFlowsListType", :type "list"})

(clojure.core/defn- ser-sms-mfa-settings-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SMSMfaSettingsType", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanType"})) (clojure.core/contains? input :preferred-mfa) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :preferred-mfa)) #:http.request.field{:name "PreferredMfa", :shape "BooleanType"}))))

(clojure.core/defn- ser-feedback-value-type [input] #:http.request.field{:value (clojure.core/get {"Valid" "Valid", :valid "Valid", "Invalid" "Invalid", :invalid "Invalid"} input), :shape "FeedbackValueType"})

(clojure.core/defn- ser-attribute-mapping-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-mapping-key-type k) #:http.request.field{:map-info "key", :shape "AttributeMappingKeyType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "AttributeMappingType", :type "map"})

(clojure.core/defn- ser-user-pool-policy-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UserPoolPolicyType", :type "structure"} (clojure.core/contains? input :password-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password-policy-type (input :password-policy)) #:http.request.field{:name "PasswordPolicy", :shape "PasswordPolicyType"}))))

(clojure.core/defn- ser-attribute-value-type [input] #:http.request.field{:value input, :shape "AttributeValueType"})

(clojure.core/defn- ser-default-email-option-type [input] #:http.request.field{:value (clojure.core/get {"CONFIRM_WITH_LINK" "CONFIRM_WITH_LINK", :confirm-with-link "CONFIRM_WITH_LINK", "CONFIRM_WITH_CODE" "CONFIRM_WITH_CODE", :confirm-with-code "CONFIRM_WITH_CODE"} input), :shape "DefaultEmailOptionType"})

(clojure.core/defn- ser-pool-query-limit-type [input] #:http.request.field{:value input, :shape "PoolQueryLimitType"})

(clojure.core/defn- ser-risk-exception-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RiskExceptionConfigurationType", :type "structure"} (clojure.core/contains? input :blocked-ip-range-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blocked-ip-range-list-type (input :blocked-ip-range-list)) #:http.request.field{:name "BlockedIPRangeList", :shape "BlockedIPRangeListType"})) (clojure.core/contains? input :skipped-ip-range-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skipped-ip-range-list-type (input :skipped-ip-range-list)) #:http.request.field{:name "SkippedIPRangeList", :shape "SkippedIPRangeListType"}))))

(clojure.core/defn- ser-confirmation-code-type [input] #:http.request.field{:value input, :shape "ConfirmationCodeType"})

(clojure.core/defn- ser-user-pool-mfa-type [input] #:http.request.field{:value (clojure.core/get {"OFF" "OFF", :off "OFF", "ON" "ON", :on "ON", "OPTIONAL" "OPTIONAL", :optional "OPTIONAL"} input), :shape "UserPoolMfaType"})

(clojure.core/defn- ser-sms-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn-type (:sns-caller-arn input)) #:http.request.field{:name "SnsCallerArn", :shape "ArnType"})], :shape "SmsConfigurationType", :type "structure"} (clojure.core/contains? input :external-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :external-id)) #:http.request.field{:name "ExternalId", :shape "StringType"}))))

(clojure.core/defn- ser-username-attribute-type [input] #:http.request.field{:value (clojure.core/get {"phone_number" "phone_number", :phone-number "phone_number", "email" "email", :email "email"} input), :shape "UsernameAttributeType"})

(clojure.core/defn- ser-account-takeover-risk-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-account-takeover-actions-type (:actions input)) #:http.request.field{:name "Actions", :shape "AccountTakeoverActionsType"})], :shape "AccountTakeoverRiskConfigurationType", :type "structure"} (clojure.core/contains? input :notify-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notify-configuration-type (input :notify-configuration)) #:http.request.field{:name "NotifyConfiguration", :shape "NotifyConfigurationType"}))))

(clojure.core/defn- ser-account-takeover-action-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-account-takeover-action-notify-type (:notify input)) #:http.request.field{:name "Notify", :shape "AccountTakeoverActionNotifyType"}) (clojure.core/into (ser-account-takeover-event-action-type (:event-action input)) #:http.request.field{:name "EventAction", :shape "AccountTakeoverEventActionType"})], :shape "AccountTakeoverActionType", :type "structure"}))

(clojure.core/defn- ser-attribute-name-type [input] #:http.request.field{:value input, :shape "AttributeNameType"})

(clojure.core/defn- ser-description-type [input] #:http.request.field{:value input, :shape "DescriptionType"})

(clojure.core/defn- ser-email-verification-subject-type [input] #:http.request.field{:value input, :shape "EmailVerificationSubjectType"})

(clojure.core/defn- ser-device-secret-verifier-config-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeviceSecretVerifierConfigType", :type "structure"} (clojure.core/contains? input :password-verifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :password-verifier)) #:http.request.field{:name "PasswordVerifier", :shape "StringType"})) (clojure.core/contains? input :salt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :salt)) #:http.request.field{:name "Salt", :shape "StringType"}))))

(clojure.core/defn- ser-account-takeover-event-action-type [input] #:http.request.field{:value (clojure.core/get {"BLOCK" "BLOCK", :block "BLOCK", "MFA_IF_CONFIGURED" "MFA_IF_CONFIGURED", :mfa-if-configured "MFA_IF_CONFIGURED", "MFA_REQUIRED" "MFA_REQUIRED", :mfa-required "MFA_REQUIRED", "NO_ACTION" "NO_ACTION", :no-action "NO_ACTION"} input), :shape "AccountTakeoverEventActionType"})

(clojure.core/defn- ser-scope-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scope-type coll) #:http.request.field{:shape "ScopeType"}))) input), :shape "ScopeListType", :type "list", :max 25})

(clojure.core/defn- ser-email-verification-subject-by-link-type [input] #:http.request.field{:value input, :shape "EmailVerificationSubjectByLinkType"})

(clojure.core/defn- ser-compromised-credentials-actions-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-compromised-credentials-event-action-type (:event-action input)) #:http.request.field{:name "EventAction", :shape "CompromisedCredentialsEventActionType"})], :shape "CompromisedCredentialsActionsType", :type "structure"}))

(clojure.core/defn- ser-account-takeover-actions-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccountTakeoverActionsType", :type "structure"} (clojure.core/contains? input :low-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-takeover-action-type (input :low-action)) #:http.request.field{:name "LowAction", :shape "AccountTakeoverActionType"})) (clojure.core/contains? input :medium-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-takeover-action-type (input :medium-action)) #:http.request.field{:name "MediumAction", :shape "AccountTakeoverActionType"})) (clojure.core/contains? input :high-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-takeover-action-type (input :high-action)) #:http.request.field{:name "HighAction", :shape "AccountTakeoverActionType"}))))

(clojure.core/defn- ser-account-takeover-action-notify-type [input] #:http.request.field{:value input, :shape "AccountTakeoverActionNotifyType"})

(clojure.core/defn- ser-client-name-type [input] #:http.request.field{:value input, :shape "ClientNameType"})

(clojure.core/defn- ser-string-attribute-constraints-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StringAttributeConstraintsType", :type "structure"} (clojure.core/contains? input :min-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :min-length)) #:http.request.field{:name "MinLength", :shape "StringType"})) (clojure.core/contains? input :max-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :max-length)) #:http.request.field{:name "MaxLength", :shape "StringType"}))))

(clojure.core/defn- ser-compromised-credentials-event-action-type [input] #:http.request.field{:value (clojure.core/get {"BLOCK" "BLOCK", :block "BLOCK", "NO_ACTION" "NO_ACTION", :no-action "NO_ACTION"} input), :shape "CompromisedCredentialsEventActionType"})

(clojure.core/defn- ser-email-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmailConfigurationType", :type "structure"} (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "ArnType"})) (clojure.core/contains? input :reply-to-email-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address-type (input :reply-to-email-address)) #:http.request.field{:name "ReplyToEmailAddress", :shape "EmailAddressType"}))))

(clojure.core/defn- ser-client-id-type [input] #:http.request.field{:value input, :shape "ClientIdType"})

(clojure.core/defn- ser-idp-identifier-type [input] #:http.request.field{:value input, :shape "IdpIdentifierType"})

(clojure.core/defn- ser-custom-attribute-name-type [input] #:http.request.field{:value input, :shape "CustomAttributeNameType"})

(clojure.core/defn- ser-mfa-option-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mfa-option-type coll) #:http.request.field{:shape "MFAOptionType"}))) input), :shape "MFAOptionListType", :type "list"})

(clojure.core/defn- ser-session-type [input] #:http.request.field{:value input, :shape "SessionType"})

(clojure.core/defn- ser-callback-ur-ls-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-redirect-url-type coll) #:http.request.field{:shape "RedirectUrlType"}))) input), :shape "CallbackURLsListType", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-message-action-type [input] #:http.request.field{:value (clojure.core/get {"RESEND" "RESEND", :resend "RESEND", "SUPPRESS" "SUPPRESS", :suppress "SUPPRESS"} input), :shape "MessageActionType"})

(clojure.core/defn- ser-challenge-name-type [input] #:http.request.field{:value (clojure.core/get {"MFA_SETUP" "MFA_SETUP", :sms-mfa "SMS_MFA", "SOFTWARE_TOKEN_MFA" "SOFTWARE_TOKEN_MFA", :password-verifier "PASSWORD_VERIFIER", :device-password-verifier "DEVICE_PASSWORD_VERIFIER", "ADMIN_NO_SRP_AUTH" "ADMIN_NO_SRP_AUTH", :select-mfa-type "SELECT_MFA_TYPE", "DEVICE_SRP_AUTH" "DEVICE_SRP_AUTH", :new-password-required "NEW_PASSWORD_REQUIRED", "SELECT_MFA_TYPE" "SELECT_MFA_TYPE", :admin-no-srp-auth "ADMIN_NO_SRP_AUTH", :mfa-setup "MFA_SETUP", :software-token-mfa "SOFTWARE_TOKEN_MFA", "DEVICE_PASSWORD_VERIFIER" "DEVICE_PASSWORD_VERIFIER", "CUSTOM_CHALLENGE" "CUSTOM_CHALLENGE", "PASSWORD_VERIFIER" "PASSWORD_VERIFIER", :device-srp-auth "DEVICE_SRP_AUTH", :custom-challenge "CUSTOM_CHALLENGE", "NEW_PASSWORD_REQUIRED" "NEW_PASSWORD_REQUIRED", "SMS_MFA" "SMS_MFA"} input), :shape "ChallengeNameType"})

(clojure.core/defn- ser-email-notification-subject-type [input] #:http.request.field{:value input, :shape "EmailNotificationSubjectType"})

(clojure.core/defn- ser-notify-email-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-email-notification-subject-type (:subject input)) #:http.request.field{:name "Subject", :shape "EmailNotificationSubjectType"})], :shape "NotifyEmailType", :type "structure"} (clojure.core/contains? input :html-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-notification-body-type (input :html-body)) #:http.request.field{:name "HtmlBody", :shape "EmailNotificationBodyType"})) (clojure.core/contains? input :text-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-notification-body-type (input :text-body)) #:http.request.field{:name "TextBody", :shape "EmailNotificationBodyType"}))))

(clojure.core/defn- ser-device-key-type [input] #:http.request.field{:value input, :shape "DeviceKeyType"})

(clojure.core/defn- ser-mfa-option-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MFAOptionType", :type "structure"} (clojure.core/contains? input :delivery-medium) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-medium-type (input :delivery-medium)) #:http.request.field{:name "DeliveryMedium", :shape "DeliveryMediumType"})) (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-type (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "AttributeNameType"}))))

(clojure.core/defn- ser-boolean-type [input] #:http.request.field{:value input, :shape "BooleanType"})

(clojure.core/defn- ser-notify-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn-type (:source-arn input)) #:http.request.field{:name "SourceArn", :shape "ArnType"})], :shape "NotifyConfigurationType", :type "structure"} (clojure.core/contains? input :from) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :from)) #:http.request.field{:name "From", :shape "StringType"})) (clojure.core/contains? input :reply-to) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :reply-to)) #:http.request.field{:name "ReplyTo", :shape "StringType"})) (clojure.core/contains? input :block-email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notify-email-type (input :block-email)) #:http.request.field{:name "BlockEmail", :shape "NotifyEmailType"})) (clojure.core/contains? input :no-action-email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notify-email-type (input :no-action-email)) #:http.request.field{:name "NoActionEmail", :shape "NotifyEmailType"})) (clojure.core/contains? input :mfa-email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notify-email-type (input :mfa-email)) #:http.request.field{:name "MfaEmail", :shape "NotifyEmailType"}))))

(clojure.core/defn- req-update-resource-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-resource-server-identifier-type (input :identifier)) #:http.request.field{:name "Identifier", :shape "ResourceServerIdentifierType"}) (clojure.core/into (ser-resource-server-name-type (input :name)) #:http.request.field{:name "Name", :shape "ResourceServerNameType"})]} (clojure.core/contains? input :scopes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-server-scope-list-type (input :scopes)) #:http.request.field{:name "Scopes", :shape "ResourceServerScopeListType"}))))

(clojure.core/defn- req-resend-confirmation-code-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]} (clojure.core/contains? input :secret-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-hash-type (input :secret-hash)) #:http.request.field{:name "SecretHash", :shape "SecretHashType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"}))))

(clojure.core/defn- req-forgot-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]} (clojure.core/contains? input :secret-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-hash-type (input :secret-hash)) #:http.request.field{:name "SecretHash", :shape "SecretHashType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"}))))

(clojure.core/defn- req-admin-update-auth-event-feedback-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-event-id-type (input :event-id)) #:http.request.field{:name "EventId", :shape "EventIdType"}) (clojure.core/into (ser-feedback-value-type (input :feedback-value)) #:http.request.field{:name "FeedbackValue", :shape "FeedbackValueType"})]}))

(clojure.core/defn- req-verify-software-token-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-software-token-mfa-user-code-type (input :user-code)) #:http.request.field{:name "UserCode", :shape "SoftwareTokenMFAUserCodeType"})]} (clojure.core/contains? input :access-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})) (clojure.core/contains? input :session) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-type (input :session)) #:http.request.field{:name "Session", :shape "SessionType"})) (clojure.core/contains? input :friendly-device-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :friendly-device-name)) #:http.request.field{:name "FriendlyDeviceName", :shape "StringType"}))))

(clojure.core/defn- req-describe-identity-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-provider-name-type (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderNameType"})]}))

(clojure.core/defn- req-list-user-pools-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pool-query-limit-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PoolQueryLimitType"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKeyType"}))))

(clojure.core/defn- req-get-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]}))

(clojure.core/defn- req-get-user-pool-mfa-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-list-user-pool-clients-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-admin-update-user-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-attribute-list-type (input :user-attributes)) #:http.request.field{:name "UserAttributes", :shape "AttributeListType"})]}))

(clojure.core/defn- req-admin-set-user-mfa-preference-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :sms-mfa-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-mfa-settings-type (input :sms-mfa-settings)) #:http.request.field{:name "SMSMfaSettings", :shape "SMSMfaSettingsType"})) (clojure.core/contains? input :software-token-mfa-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-software-token-mfa-settings-type (input :software-token-mfa-settings)) #:http.request.field{:name "SoftwareTokenMfaSettings", :shape "SoftwareTokenMfaSettingsType"}))))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :attributes-to-get) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-searched-attribute-names-list-type (input :attributes-to-get)) #:http.request.field{:name "AttributesToGet", :shape "SearchedAttributeNamesListType"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "QueryLimitType"})) (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-pagination-token-type (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "SearchPaginationTokenType"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-filter-type (input :filter)) #:http.request.field{:name "Filter", :shape "UserFilterType"}))))

(clojure.core/defn- req-admin-list-groups-for-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "QueryLimitType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-update-identity-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-provider-name-type (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderNameType"})]} (clojure.core/contains? input :provider-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-details-type (input :provider-details)) #:http.request.field{:name "ProviderDetails", :shape "ProviderDetailsType"})) (clojure.core/contains? input :attribute-mapping) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-mapping-type (input :attribute-mapping)) #:http.request.field{:name "AttributeMapping", :shape "AttributeMappingType"})) (clojure.core/contains? input :idp-identifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idp-identifiers-list-type (input :idp-identifiers)) #:http.request.field{:name "IdpIdentifiers", :shape "IdpIdentifiersListType"}))))

(clojure.core/defn- req-get-csv-header-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-delete-resource-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-resource-server-identifier-type (input :identifier)) #:http.request.field{:name "Identifier", :shape "ResourceServerIdentifierType"})]}))

(clojure.core/defn- req-stop-user-import-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-user-import-job-id-type (input :job-id)) #:http.request.field{:name "JobId", :shape "UserImportJobIdType"})]}))

(clojure.core/defn- req-set-user-pool-mfa-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :sms-mfa-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-mfa-config-type (input :sms-mfa-configuration)) #:http.request.field{:name "SmsMfaConfiguration", :shape "SmsMfaConfigType"})) (clojure.core/contains? input :software-token-mfa-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-software-token-mfa-config-type (input :software-token-mfa-configuration)) #:http.request.field{:name "SoftwareTokenMfaConfiguration", :shape "SoftwareTokenMfaConfigType"})) (clojure.core/contains? input :mfa-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-mfa-type (input :mfa-configuration)) #:http.request.field{:name "MfaConfiguration", :shape "UserPoolMfaType"}))))

(clojure.core/defn- req-admin-forget-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"})]}))

(clojure.core/defn- req-admin-delete-user-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-attribute-name-list-type (input :user-attribute-names)) #:http.request.field{:name "UserAttributeNames", :shape "AttributeNameListType"})]}))

(clojure.core/defn- req-admin-initiate-auth-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-auth-flow-type (input :auth-flow)) #:http.request.field{:name "AuthFlow", :shape "AuthFlowType"})]} (clojure.core/contains? input :auth-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auth-parameters-type (input :auth-parameters)) #:http.request.field{:name "AuthParameters", :shape "AuthParametersType"})) (clojure.core/contains? input :client-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-metadata-type (input :client-metadata)) #:http.request.field{:name "ClientMetadata", :shape "ClientMetadataType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-data-type (input :context-data)) #:http.request.field{:name "ContextData", :shape "ContextDataType"}))))

(clojure.core/defn- req-list-user-import-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-pool-query-limit-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PoolQueryLimitType"})]} (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key-type (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "PaginationKeyType"}))))

(clojure.core/defn- req-admin-disable-provider-for-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "StringType"}) (clojure.core/into (ser-provider-user-identifier-type (input :user)) #:http.request.field{:name "User", :shape "ProviderUserIdentifierType"})]}))

(clojure.core/defn- req-list-identity-providers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-providers-limit-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListProvidersLimitType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKeyType"}))))

(clojure.core/defn- req-describe-user-pool-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"})]}))

(clojure.core/defn- req-admin-set-user-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-mfa-option-list-type (input :mfa-options)) #:http.request.field{:name "MFAOptions", :shape "MFAOptionListType"})]}))

(clojure.core/defn- req-initiate-auth-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-auth-flow-type (input :auth-flow)) #:http.request.field{:name "AuthFlow", :shape "AuthFlowType"}) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"})]} (clojure.core/contains? input :auth-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auth-parameters-type (input :auth-parameters)) #:http.request.field{:name "AuthParameters", :shape "AuthParametersType"})) (clojure.core/contains? input :client-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-metadata-type (input :client-metadata)) #:http.request.field{:name "ClientMetadata", :shape "ClientMetadataType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"}))))

(clojure.core/defn- req-create-resource-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-resource-server-identifier-type (input :identifier)) #:http.request.field{:name "Identifier", :shape "ResourceServerIdentifierType"}) (clojure.core/into (ser-resource-server-name-type (input :name)) #:http.request.field{:name "Name", :shape "ResourceServerNameType"})]} (clojure.core/contains? input :scopes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-server-scope-list-type (input :scopes)) #:http.request.field{:name "Scopes", :shape "ResourceServerScopeListType"}))))

(clojure.core/defn- req-get-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"})]} (clojure.core/contains? input :access-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}))))

(clojure.core/defn- req-describe-risk-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}))))

(clojure.core/defn- req-create-identity-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-provider-name-type-v-1 (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderNameTypeV1"}) (clojure.core/into (ser-identity-provider-type-type (input :provider-type)) #:http.request.field{:name "ProviderType", :shape "IdentityProviderTypeType"}) (clojure.core/into (ser-provider-details-type (input :provider-details)) #:http.request.field{:name "ProviderDetails", :shape "ProviderDetailsType"})]} (clojure.core/contains? input :attribute-mapping) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-mapping-type (input :attribute-mapping)) #:http.request.field{:name "AttributeMapping", :shape "AttributeMappingType"})) (clojure.core/contains? input :idp-identifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idp-identifiers-list-type (input :idp-identifiers)) #:http.request.field{:name "IdpIdentifiers", :shape "IdpIdentifiersListType"}))))

(clojure.core/defn- req-get-user-attribute-verification-code-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}) (clojure.core/into (ser-attribute-name-type (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "AttributeNameType"})]}))

(clojure.core/defn- req-set-ui-customization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"})) (clojure.core/contains? input :css) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-css-type (input :css)) #:http.request.field{:name "CSS", :shape "CSSType"})) (clojure.core/contains? input :image-file) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-file-type (input :image-file)) #:http.request.field{:name "ImageFile", :shape "ImageFileType"}))))

(clojure.core/defn- req-describe-user-pool-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-type (input :domain)) #:http.request.field{:name "Domain", :shape "DomainType"})]}))

(clojure.core/defn- req-update-user-pool-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"})]} (clojure.core/contains? input :allowed-o-auth-flows-user-pool-client) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :allowed-o-auth-flows-user-pool-client)) #:http.request.field{:name "AllowedOAuthFlowsUserPoolClient", :shape "BooleanType"})) (clojure.core/contains? input :refresh-token-validity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-refresh-token-validity-type (input :refresh-token-validity)) #:http.request.field{:name "RefreshTokenValidity", :shape "RefreshTokenValidityType"})) (clojure.core/contains? input :read-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-permission-list-type (input :read-attributes)) #:http.request.field{:name "ReadAttributes", :shape "ClientPermissionListType"})) (clojure.core/contains? input :default-redirect-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-url-type (input :default-redirect-uri)) #:http.request.field{:name "DefaultRedirectURI", :shape "RedirectUrlType"})) (clojure.core/contains? input :allowed-o-auth-flows) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-o-auth-flows-type (input :allowed-o-auth-flows)) #:http.request.field{:name "AllowedOAuthFlows", :shape "OAuthFlowsType"})) (clojure.core/contains? input :logout-ur-ls) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logout-ur-ls-list-type (input :logout-ur-ls)) #:http.request.field{:name "LogoutURLs", :shape "LogoutURLsListType"})) (clojure.core/contains? input :client-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-name-type (input :client-name)) #:http.request.field{:name "ClientName", :shape "ClientNameType"})) (clojure.core/contains? input :supported-identity-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-supported-identity-providers-list-type (input :supported-identity-providers)) #:http.request.field{:name "SupportedIdentityProviders", :shape "SupportedIdentityProvidersListType"})) (clojure.core/contains? input :callback-ur-ls) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-callback-ur-ls-list-type (input :callback-ur-ls)) #:http.request.field{:name "CallbackURLs", :shape "CallbackURLsListType"})) (clojure.core/contains? input :allowed-o-auth-scopes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scope-list-type (input :allowed-o-auth-scopes)) #:http.request.field{:name "AllowedOAuthScopes", :shape "ScopeListType"})) (clojure.core/contains? input :write-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-permission-list-type (input :write-attributes)) #:http.request.field{:name "WriteAttributes", :shape "ClientPermissionListType"})) (clojure.core/contains? input :explicit-auth-flows) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-explicit-auth-flows-list-type (input :explicit-auth-flows)) #:http.request.field{:name "ExplicitAuthFlows", :shape "ExplicitAuthFlowsListType"})) (clojure.core/contains? input :analytics-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-configuration-type (input :analytics-configuration)) #:http.request.field{:name "AnalyticsConfiguration", :shape "AnalyticsConfigurationType"}))))

(clojure.core/defn- req-admin-add-user-to-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"})]}))

(clojure.core/defn- req-set-risk-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"})) (clojure.core/contains? input :compromised-credentials-risk-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compromised-credentials-risk-configuration-type (input :compromised-credentials-risk-configuration)) #:http.request.field{:name "CompromisedCredentialsRiskConfiguration", :shape "CompromisedCredentialsRiskConfigurationType"})) (clojure.core/contains? input :account-takeover-risk-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-takeover-risk-configuration-type (input :account-takeover-risk-configuration)) #:http.request.field{:name "AccountTakeoverRiskConfiguration", :shape "AccountTakeoverRiskConfigurationType"})) (clojure.core/contains? input :risk-exception-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-risk-exception-configuration-type (input :risk-exception-configuration)) #:http.request.field{:name "RiskExceptionConfiguration", :shape "RiskExceptionConfigurationType"}))))

(clojure.core/defn- req-admin-list-devices-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "QueryLimitType"})) (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-pagination-token-type (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "SearchPaginationTokenType"}))))

(clojure.core/defn- req-admin-user-global-sign-out-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-admin-respond-to-auth-challenge-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-challenge-name-type (input :challenge-name)) #:http.request.field{:name "ChallengeName", :shape "ChallengeNameType"})]} (clojure.core/contains? input :challenge-responses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-challenge-responses-type (input :challenge-responses)) #:http.request.field{:name "ChallengeResponses", :shape "ChallengeResponsesType"})) (clojure.core/contains? input :session) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-type (input :session)) #:http.request.field{:name "Session", :shape "SessionType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-data-type (input :context-data)) #:http.request.field{:name "ContextData", :shape "ContextDataType"}))))

(clojure.core/defn- req-describe-user-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-delete-identity-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-provider-name-type (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderNameType"})]}))

(clojure.core/defn- req-update-user-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :sms-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-configuration-type (input :sms-configuration)) #:http.request.field{:name "SmsConfiguration", :shape "SmsConfigurationType"})) (clojure.core/contains? input :mfa-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-mfa-type (input :mfa-configuration)) #:http.request.field{:name "MfaConfiguration", :shape "UserPoolMfaType"})) (clojure.core/contains? input :admin-create-user-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-admin-create-user-config-type (input :admin-create-user-config)) #:http.request.field{:name "AdminCreateUserConfig", :shape "AdminCreateUserConfigType"})) (clojure.core/contains? input :sms-verification-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-verification-message)) #:http.request.field{:name "SmsVerificationMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :email-verification-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-message-type (input :email-verification-message)) #:http.request.field{:name "EmailVerificationMessage", :shape "EmailVerificationMessageType"})) (clojure.core/contains? input :auto-verified-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verified-attributes-list-type (input :auto-verified-attributes)) #:http.request.field{:name "AutoVerifiedAttributes", :shape "VerifiedAttributesListType"})) (clojure.core/contains? input :device-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-configuration-type (input :device-configuration)) #:http.request.field{:name "DeviceConfiguration", :shape "DeviceConfigurationType"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-config-type (input :lambda-config)) #:http.request.field{:name "LambdaConfig", :shape "LambdaConfigType"})) (clojure.core/contains? input :policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-policy-type (input :policies)) #:http.request.field{:name "Policies", :shape "UserPoolPolicyType"})) (clojure.core/contains? input :email-verification-subject) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-subject-type (input :email-verification-subject)) #:http.request.field{:name "EmailVerificationSubject", :shape "EmailVerificationSubjectType"})) (clojure.core/contains? input :user-pool-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-tags-type (input :user-pool-tags)) #:http.request.field{:name "UserPoolTags", :shape "UserPoolTagsType"})) (clojure.core/contains? input :user-pool-add-ons) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-add-ons-type (input :user-pool-add-ons)) #:http.request.field{:name "UserPoolAddOns", :shape "UserPoolAddOnsType"})) (clojure.core/contains? input :email-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-configuration-type (input :email-configuration)) #:http.request.field{:name "EmailConfiguration", :shape "EmailConfigurationType"})) (clojure.core/contains? input :sms-authentication-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-authentication-message)) #:http.request.field{:name "SmsAuthenticationMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :verification-message-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verification-message-template-type (input :verification-message-template)) #:http.request.field{:name "VerificationMessageTemplate", :shape "VerificationMessageTemplateType"}))))

(clojure.core/defn- req-confirm-sign-up-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-confirmation-code-type (input :confirmation-code)) #:http.request.field{:name "ConfirmationCode", :shape "ConfirmationCodeType"})]} (clojure.core/contains? input :secret-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-hash-type (input :secret-hash)) #:http.request.field{:name "SecretHash", :shape "SecretHashType"})) (clojure.core/contains? input :force-alias-creation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-alias-creation (input :force-alias-creation)) #:http.request.field{:name "ForceAliasCreation", :shape "ForceAliasCreation"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"}))))

(clojure.core/defn- req-set-user-mfa-preference-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]} (clojure.core/contains? input :sms-mfa-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-mfa-settings-type (input :sms-mfa-settings)) #:http.request.field{:name "SMSMfaSettings", :shape "SMSMfaSettingsType"})) (clojure.core/contains? input :software-token-mfa-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-software-token-mfa-settings-type (input :software-token-mfa-settings)) #:http.request.field{:name "SoftwareTokenMfaSettings", :shape "SoftwareTokenMfaSettingsType"}))))

(clojure.core/defn- req-describe-resource-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-resource-server-identifier-type (input :identifier)) #:http.request.field{:name "Identifier", :shape "ResourceServerIdentifierType"})]}))

(clojure.core/defn- req-delete-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-start-user-import-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-user-import-job-id-type (input :job-id)) #:http.request.field{:name "JobId", :shape "UserImportJobIdType"})]}))

(clojure.core/defn- req-create-user-import-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-import-job-name-type (input :job-name)) #:http.request.field{:name "JobName", :shape "UserImportJobNameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-arn-type (input :cloud-watch-logs-role-arn)) #:http.request.field{:name "CloudWatchLogsRoleArn", :shape "ArnType"})]}))

(clojure.core/defn- req-admin-link-provider-for-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "StringType"}) (clojure.core/into (ser-provider-user-identifier-type (input :destination-user)) #:http.request.field{:name "DestinationUser", :shape "ProviderUserIdentifierType"}) (clojure.core/into (ser-provider-user-identifier-type (input :source-user)) #:http.request.field{:name "SourceUser", :shape "ProviderUserIdentifierType"})]}))

(clojure.core/defn- req-set-user-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}) (clojure.core/into (ser-mfa-option-list-type (input :mfa-options)) #:http.request.field{:name "MFAOptions", :shape "MFAOptionListType"})]}))

(clojure.core/defn- req-admin-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-create-user-pool-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-client-name-type (input :client-name)) #:http.request.field{:name "ClientName", :shape "ClientNameType"})]} (clojure.core/contains? input :allowed-o-auth-flows-user-pool-client) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :allowed-o-auth-flows-user-pool-client)) #:http.request.field{:name "AllowedOAuthFlowsUserPoolClient", :shape "BooleanType"})) (clojure.core/contains? input :refresh-token-validity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-refresh-token-validity-type (input :refresh-token-validity)) #:http.request.field{:name "RefreshTokenValidity", :shape "RefreshTokenValidityType"})) (clojure.core/contains? input :read-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-permission-list-type (input :read-attributes)) #:http.request.field{:name "ReadAttributes", :shape "ClientPermissionListType"})) (clojure.core/contains? input :generate-secret) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generate-secret (input :generate-secret)) #:http.request.field{:name "GenerateSecret", :shape "GenerateSecret"})) (clojure.core/contains? input :default-redirect-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-url-type (input :default-redirect-uri)) #:http.request.field{:name "DefaultRedirectURI", :shape "RedirectUrlType"})) (clojure.core/contains? input :allowed-o-auth-flows) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-o-auth-flows-type (input :allowed-o-auth-flows)) #:http.request.field{:name "AllowedOAuthFlows", :shape "OAuthFlowsType"})) (clojure.core/contains? input :logout-ur-ls) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logout-ur-ls-list-type (input :logout-ur-ls)) #:http.request.field{:name "LogoutURLs", :shape "LogoutURLsListType"})) (clojure.core/contains? input :supported-identity-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-supported-identity-providers-list-type (input :supported-identity-providers)) #:http.request.field{:name "SupportedIdentityProviders", :shape "SupportedIdentityProvidersListType"})) (clojure.core/contains? input :callback-ur-ls) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-callback-ur-ls-list-type (input :callback-ur-ls)) #:http.request.field{:name "CallbackURLs", :shape "CallbackURLsListType"})) (clojure.core/contains? input :allowed-o-auth-scopes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scope-list-type (input :allowed-o-auth-scopes)) #:http.request.field{:name "AllowedOAuthScopes", :shape "ScopeListType"})) (clojure.core/contains? input :write-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-permission-list-type (input :write-attributes)) #:http.request.field{:name "WriteAttributes", :shape "ClientPermissionListType"})) (clojure.core/contains? input :explicit-auth-flows) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-explicit-auth-flows-list-type (input :explicit-auth-flows)) #:http.request.field{:name "ExplicitAuthFlows", :shape "ExplicitAuthFlowsListType"})) (clojure.core/contains? input :analytics-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-configuration-type (input :analytics-configuration)) #:http.request.field{:name "AnalyticsConfiguration", :shape "AnalyticsConfigurationType"}))))

(clojure.core/defn- req-verify-user-attribute-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}) (clojure.core/into (ser-attribute-name-type (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "AttributeNameType"}) (clojure.core/into (ser-confirmation-code-type (input :code)) #:http.request.field{:name "Code", :shape "ConfirmationCodeType"})]}))

(clojure.core/defn- req-change-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-password-type (input :previous-password)) #:http.request.field{:name "PreviousPassword", :shape "PasswordType"}) (clojure.core/into (ser-password-type (input :proposed-password)) #:http.request.field{:name "ProposedPassword", :shape "PasswordType"}) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]}))

(clojure.core/defn- req-admin-update-device-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"})]} (clojure.core/contains? input :device-remembered-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-remembered-status-type (input :device-remembered-status)) #:http.request.field{:name "DeviceRememberedStatus", :shape "DeviceRememberedStatusType"}))))

(clojure.core/defn- req-delete-user-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attribute-name-list-type (input :user-attribute-names)) #:http.request.field{:name "UserAttributeNames", :shape "AttributeNameListType"}) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]}))

(clojure.core/defn- req-admin-enable-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-delete-user-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-admin-list-user-auth-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimitType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-list-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "QueryLimitType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-update-user-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attribute-list-type (input :user-attributes)) #:http.request.field{:name "UserAttributes", :shape "AttributeListType"}) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]}))

(clojure.core/defn- req-update-user-pool-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-type (input :domain)) #:http.request.field{:name "Domain", :shape "DomainType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-custom-domain-config-type (input :custom-domain-config)) #:http.request.field{:name "CustomDomainConfig", :shape "CustomDomainConfigType"})]}))

(clojure.core/defn- req-create-user-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-name-type (input :pool-name)) #:http.request.field{:name "PoolName", :shape "UserPoolNameType"})]} (clojure.core/contains? input :sms-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-configuration-type (input :sms-configuration)) #:http.request.field{:name "SmsConfiguration", :shape "SmsConfigurationType"})) (clojure.core/contains? input :schema) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-attributes-list-type (input :schema)) #:http.request.field{:name "Schema", :shape "SchemaAttributesListType"})) (clojure.core/contains? input :mfa-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-mfa-type (input :mfa-configuration)) #:http.request.field{:name "MfaConfiguration", :shape "UserPoolMfaType"})) (clojure.core/contains? input :admin-create-user-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-admin-create-user-config-type (input :admin-create-user-config)) #:http.request.field{:name "AdminCreateUserConfig", :shape "AdminCreateUserConfigType"})) (clojure.core/contains? input :sms-verification-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-verification-message)) #:http.request.field{:name "SmsVerificationMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :username-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-username-attributes-list-type (input :username-attributes)) #:http.request.field{:name "UsernameAttributes", :shape "UsernameAttributesListType"})) (clojure.core/contains? input :email-verification-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-message-type (input :email-verification-message)) #:http.request.field{:name "EmailVerificationMessage", :shape "EmailVerificationMessageType"})) (clojure.core/contains? input :auto-verified-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verified-attributes-list-type (input :auto-verified-attributes)) #:http.request.field{:name "AutoVerifiedAttributes", :shape "VerifiedAttributesListType"})) (clojure.core/contains? input :device-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-configuration-type (input :device-configuration)) #:http.request.field{:name "DeviceConfiguration", :shape "DeviceConfigurationType"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-config-type (input :lambda-config)) #:http.request.field{:name "LambdaConfig", :shape "LambdaConfigType"})) (clojure.core/contains? input :policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-policy-type (input :policies)) #:http.request.field{:name "Policies", :shape "UserPoolPolicyType"})) (clojure.core/contains? input :email-verification-subject) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-verification-subject-type (input :email-verification-subject)) #:http.request.field{:name "EmailVerificationSubject", :shape "EmailVerificationSubjectType"})) (clojure.core/contains? input :user-pool-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-tags-type (input :user-pool-tags)) #:http.request.field{:name "UserPoolTags", :shape "UserPoolTagsType"})) (clojure.core/contains? input :user-pool-add-ons) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-add-ons-type (input :user-pool-add-ons)) #:http.request.field{:name "UserPoolAddOns", :shape "UserPoolAddOnsType"})) (clojure.core/contains? input :email-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-configuration-type (input :email-configuration)) #:http.request.field{:name "EmailConfiguration", :shape "EmailConfigurationType"})) (clojure.core/contains? input :sms-authentication-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sms-verification-message-type (input :sms-authentication-message)) #:http.request.field{:name "SmsAuthenticationMessage", :shape "SmsVerificationMessageType"})) (clojure.core/contains? input :verification-message-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verification-message-template-type (input :verification-message-template)) #:http.request.field{:name "VerificationMessageTemplate", :shape "VerificationMessageTemplateType"})) (clojure.core/contains? input :alias-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-attributes-list-type (input :alias-attributes)) #:http.request.field{:name "AliasAttributes", :shape "AliasAttributesListType"}))))

(clojure.core/defn- req-create-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "ArnType"})) (clojure.core/contains? input :precedence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-precedence-type (input :precedence)) #:http.request.field{:name "Precedence", :shape "PrecedenceType"}))))

(clojure.core/defn- req-delete-user-pool-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-type (input :domain)) #:http.request.field{:name "Domain", :shape "DomainType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]}))

(clojure.core/defn- req-get-ui-customization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}))))

(clojure.core/defn- req-list-users-in-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "QueryLimitType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-admin-remove-user-from-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"})]}))

(clojure.core/defn- req-list-devices-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "QueryLimitType"})) (clojure.core/contains? input :pagination-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-pagination-token-type (input :pagination-token)) #:http.request.field{:name "PaginationToken", :shape "SearchPaginationTokenType"}))))

(clojure.core/defn- req-get-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-admin-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]} (clojure.core/contains? input :user-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list-type (input :user-attributes)) #:http.request.field{:name "UserAttributes", :shape "AttributeListType"})) (clojure.core/contains? input :validation-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list-type (input :validation-data)) #:http.request.field{:name "ValidationData", :shape "AttributeListType"})) (clojure.core/contains? input :temporary-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password-type (input :temporary-password)) #:http.request.field{:name "TemporaryPassword", :shape "PasswordType"})) (clojure.core/contains? input :force-alias-creation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-alias-creation (input :force-alias-creation)) #:http.request.field{:name "ForceAliasCreation", :shape "ForceAliasCreation"})) (clojure.core/contains? input :message-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-action-type (input :message-action)) #:http.request.field{:name "MessageAction", :shape "MessageActionType"})) (clojure.core/contains? input :desired-delivery-mediums) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-medium-list-type (input :desired-delivery-mediums)) #:http.request.field{:name "DesiredDeliveryMediums", :shape "DeliveryMediumListType"}))))

(clojure.core/defn- req-admin-confirm-sign-up-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-associate-software-token-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :access-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})) (clojure.core/contains? input :session) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-type (input :session)) #:http.request.field{:name "Session", :shape "SessionType"}))))

(clojure.core/defn- req-get-identity-provider-by-identifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-idp-identifier-type (input :idp-identifier)) #:http.request.field{:name "IdpIdentifier", :shape "IdpIdentifierType"})]}))

(clojure.core/defn- req-update-device-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}) (clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"})]} (clojure.core/contains? input :device-remembered-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-remembered-status-type (input :device-remembered-status)) #:http.request.field{:name "DeviceRememberedStatus", :shape "DeviceRememberedStatusType"}))))

(clojure.core/defn- req-update-auth-event-feedback-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-event-id-type (input :event-id)) #:http.request.field{:name "EventId", :shape "EventIdType"}) (clojure.core/into (ser-token-model-type (input :feedback-token)) #:http.request.field{:name "FeedbackToken", :shape "TokenModelType"}) (clojure.core/into (ser-feedback-value-type (input :feedback-value)) #:http.request.field{:name "FeedbackValue", :shape "FeedbackValueType"})]}))

(clojure.core/defn- req-confirm-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}) (clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"})]} (clojure.core/contains? input :device-secret-verifier-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-secret-verifier-config-type (input :device-secret-verifier-config)) #:http.request.field{:name "DeviceSecretVerifierConfig", :shape "DeviceSecretVerifierConfigType"})) (clojure.core/contains? input :device-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-name-type (input :device-name)) #:http.request.field{:name "DeviceName", :shape "DeviceNameType"}))))

(clojure.core/defn- req-describe-user-import-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-user-import-job-id-type (input :job-id)) #:http.request.field{:name "JobId", :shape "UserImportJobIdType"})]}))

(clojure.core/defn- req-get-signing-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]}))

(clojure.core/defn- req-create-user-pool-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-type (input :domain)) #:http.request.field{:name "Domain", :shape "DomainType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :custom-domain-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-domain-config-type (input :custom-domain-config)) #:http.request.field{:name "CustomDomainConfig", :shape "CustomDomainConfigType"}))))

(clojure.core/defn- req-delete-user-pool-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"})]}))

(clojure.core/defn- req-respond-to-auth-challenge-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-challenge-name-type (input :challenge-name)) #:http.request.field{:name "ChallengeName", :shape "ChallengeNameType"})]} (clojure.core/contains? input :session) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-type (input :session)) #:http.request.field{:name "Session", :shape "SessionType"})) (clojure.core/contains? input :challenge-responses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-challenge-responses-type (input :challenge-responses)) #:http.request.field{:name "ChallengeResponses", :shape "ChallengeResponsesType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"}))))

(clojure.core/defn- req-global-sign-out-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"})]}))

(clojure.core/defn- req-admin-get-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-admin-disable-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-forget-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"})]} (clojure.core/contains? input :access-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-model-type (input :access-token)) #:http.request.field{:name "AccessToken", :shape "TokenModelType"}))))

(clojure.core/defn- req-update-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-group-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupNameType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-type (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "ArnType"})) (clojure.core/contains? input :precedence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-precedence-type (input :precedence)) #:http.request.field{:name "Precedence", :shape "PrecedenceType"}))))

(clojure.core/defn- req-admin-reset-user-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-add-custom-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-custom-attributes-list-type (input :custom-attributes)) #:http.request.field{:name "CustomAttributes", :shape "CustomAttributesListType"})]}))

(clojure.core/defn- req-list-resource-servers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-resource-servers-limit-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListResourceServersLimitType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKeyType"}))))

(clojure.core/defn- req-admin-get-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-device-key-type (input :device-key)) #:http.request.field{:name "DeviceKey", :shape "DeviceKeyType"}) (clojure.core/into (ser-user-pool-id-type (input :user-pool-id)) #:http.request.field{:name "UserPoolId", :shape "UserPoolIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"})]}))

(clojure.core/defn- req-confirm-forgot-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-confirmation-code-type (input :confirmation-code)) #:http.request.field{:name "ConfirmationCode", :shape "ConfirmationCodeType"}) (clojure.core/into (ser-password-type (input :password)) #:http.request.field{:name "Password", :shape "PasswordType"})]} (clojure.core/contains? input :secret-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-hash-type (input :secret-hash)) #:http.request.field{:name "SecretHash", :shape "SecretHashType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"}))))

(clojure.core/defn- req-sign-up-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-id-type (input :client-id)) #:http.request.field{:name "ClientId", :shape "ClientIdType"}) (clojure.core/into (ser-username-type (input :username)) #:http.request.field{:name "Username", :shape "UsernameType"}) (clojure.core/into (ser-password-type (input :password)) #:http.request.field{:name "Password", :shape "PasswordType"})]} (clojure.core/contains? input :secret-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-hash-type (input :secret-hash)) #:http.request.field{:name "SecretHash", :shape "SecretHashType"})) (clojure.core/contains? input :user-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list-type (input :user-attributes)) #:http.request.field{:name "UserAttributes", :shape "AttributeListType"})) (clojure.core/contains? input :validation-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list-type (input :validation-data)) #:http.request.field{:name "ValidationData", :shape "AttributeListType"})) (clojure.core/contains? input :analytics-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-metadata-type (input :analytics-metadata)) #:http.request.field{:name "AnalyticsMetadata", :shape "AnalyticsMetadataType"})) (clojure.core/contains? input :user-context-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-context-data-type (input :user-context-data)) #:http.request.field{:name "UserContextData", :shape "UserContextDataType"}))))

(clojure.core/declare deser-redirect-url-type)

(clojure.core/declare deser-attribute-type)

(clojure.core/declare deser-domain-version-type)

(clojure.core/declare deser-device-configuration-type)

(clojure.core/declare deser-user-pool-id-type)

(clojure.core/declare deser-resource-servers-list-type)

(clojure.core/declare deser-provider-name-type)

(clojure.core/declare deser-username-attributes-list-type)

(clojure.core/declare deser-device-list-type)

(clojure.core/declare deser-css-type)

(clojure.core/declare deser-advanced-security-mode-type)

(clojure.core/declare deser-sms-mfa-config-type)

(clojure.core/declare deser-alias-attributes-list-type)

(clojure.core/declare deser-arn-type)

(clojure.core/declare deser-resource-server-scope-list-type)

(clojure.core/declare deser-supported-identity-providers-list-type)

(clojure.core/declare deser-pagination-key)

(clojure.core/declare deser-user-pool-description-type)

(clojure.core/declare deser-delivery-medium-type)

(clojure.core/declare deser-authentication-result-type)

(clojure.core/declare deser-users-list-type)

(clojure.core/declare deser-attribute-list-type)

(clojure.core/declare deser-identity-provider-type-type)

(clojure.core/declare deser-risk-configuration-type)

(clojure.core/declare deser-precedence-type)

(clojure.core/declare deser-new-device-metadata-type)

(clojure.core/declare deser-user-pool-list-type)

(clojure.core/declare deser-user-mfa-setting-list-type)

(clojure.core/declare deser-o-auth-flows-type)

(clojure.core/declare deser-idp-identifiers-list-type)

(clojure.core/declare deser-alias-attribute-type)

(clojure.core/declare deser-email-verification-message-type)

(clojure.core/declare deser-hex-string-type)

(clojure.core/declare deser-challenge-parameters-type)

(clojure.core/declare deser-o-auth-flow-type)

(clojure.core/declare deser-user-pool-name-type)

(clojure.core/declare deser-user-pool-type)

(clojure.core/declare deser-resource-server-identifier-type)

(clojure.core/declare deser-user-import-job-status-type)

(clojure.core/declare deser-analytics-configuration-type)

(clojure.core/declare deser-email-address-type)

(clojure.core/declare deser-provider-description)

(clojure.core/declare deser-ui-customization-type)

(clojure.core/declare deser-user-pool-client-type)

(clojure.core/declare deser-admin-create-user-config-type)

(clojure.core/declare deser-client-permission-list-type)

(clojure.core/declare deser-search-pagination-token-type)

(clojure.core/declare deser-image-url-type)

(clojure.core/declare deser-domain-status-type)

(clojure.core/declare deser-resource-server-scope-name-type)

(clojure.core/declare deser-user-type)

(clojure.core/declare deser-client-permission-type)

(clojure.core/declare deser-email-verification-message-by-link-type)

(clojure.core/declare deser-number-attribute-constraints-type)

(clojure.core/declare deser-password-policy-min-length-type)

(clojure.core/declare deser-integer-type)

(clojure.core/declare deser-resource-server-scope-type)

(clojure.core/declare deser-verified-attributes-list-type)

(clojure.core/declare deser-completion-message-type)

(clojure.core/declare deser-resource-server-name-type)

(clojure.core/declare deser-user-pool-client-description)

(clojure.core/declare deser-token-model-type)

(clojure.core/declare deser-username-type)

(clojure.core/declare deser-email-notification-body-type)

(clojure.core/declare deser-secret-code-type)

(clojure.core/declare deser-group-name-type)

(clojure.core/declare deser-verified-attribute-type)

(clojure.core/declare deser-pagination-key-type)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-admin-create-user-unused-account-validity-days-type)

(clojure.core/declare deser-long-type)

(clojure.core/declare deser-status-type)

(clojure.core/declare deser-compromised-credentials-risk-configuration-type)

(clojure.core/declare deser-user-import-job-name-type)

(clojure.core/declare deser-user-pool-add-ons-type)

(clojure.core/declare deser-lambda-config-type)

(clojure.core/declare deser-schema-attribute-type)

(clojure.core/declare deser-custom-domain-config-type)

(clojure.core/declare deser-attribute-data-type)

(clojure.core/declare deser-challenge-response)

(clojure.core/declare deser-provider-details-type)

(clojure.core/declare deser-skipped-ip-range-list-type)

(clojure.core/declare deser-domain-description-type)

(clojure.core/declare deser-client-secret-type)

(clojure.core/declare deser-explicit-auth-flows-type)

(clojure.core/declare deser-user-import-job-id-type)

(clojure.core/declare deser-date-type)

(clojure.core/declare deser-sms-verification-message-type)

(clojure.core/declare deser-user-pool-tags-type)

(clojure.core/declare deser-user-import-jobs-list-type)

(clojure.core/declare deser-user-status-type)

(clojure.core/declare deser-code-delivery-details-type)

(clojure.core/declare deser-password-policy-type)

(clojure.core/declare deser-css-version-type)

(clojure.core/declare deser-event-filters-type)

(clojure.core/declare deser-verification-message-template-type)

(clojure.core/declare deser-logout-ur-ls-list-type)

(clojure.core/declare deser-code-delivery-details-list-type)

(clojure.core/declare deser-blocked-ip-range-list-type)

(clojure.core/declare deser-device-type)

(clojure.core/declare deser-scope-type)

(clojure.core/declare deser-resource-server-scope-description-type)

(clojure.core/declare deser-resource-server-type)

(clojure.core/declare deser-message-template-type)

(clojure.core/declare deser-attribute-mapping-key-type)

(clojure.core/declare deser-schema-attributes-list-type)

(clojure.core/declare deser-software-token-mfa-config-type)

(clojure.core/declare deser-event-risk-type)

(clojure.core/declare deser-auth-events-type)

(clojure.core/declare deser-refresh-token-validity-type)

(clojure.core/declare deser-string-type)

(clojure.core/declare deser-verify-software-token-response-type)

(clojure.core/declare deser-domain-type)

(clojure.core/declare deser-s-3-bucket-type)

(clojure.core/declare deser-identity-provider-type)

(clojure.core/declare deser-event-filter-type)

(clojure.core/declare deser-explicit-auth-flows-list-type)

(clojure.core/declare deser-feedback-value-type)

(clojure.core/declare deser-event-feedback-type)

(clojure.core/declare deser-attribute-mapping-type)

(clojure.core/declare deser-user-pool-policy-type)

(clojure.core/declare deser-challenge-response-list-type)

(clojure.core/declare deser-attribute-value-type)

(clojure.core/declare deser-user-import-job-type)

(clojure.core/declare deser-group-type)

(clojure.core/declare deser-risk-level-type)

(clojure.core/declare deser-message-type)

(clojure.core/declare deser-default-email-option-type)

(clojure.core/declare deser-challenge-response-type)

(clojure.core/declare deser-list-of-string-types)

(clojure.core/declare deser-risk-exception-configuration-type)

(clojure.core/declare deser-user-pool-mfa-type)

(clojure.core/declare deser-sms-configuration-type)

(clojure.core/declare deser-username-attribute-type)

(clojure.core/declare deser-event-context-data-type)

(clojure.core/declare deser-aws-account-id-type)

(clojure.core/declare deser-account-takeover-risk-configuration-type)

(clojure.core/declare deser-account-takeover-action-type)

(clojure.core/declare deser-attribute-name-type)

(clojure.core/declare deser-description-type)

(clojure.core/declare deser-challenge-name)

(clojure.core/declare deser-email-verification-subject-type)

(clojure.core/declare deser-account-takeover-event-action-type)

(clojure.core/declare deser-scope-list-type)

(clojure.core/declare deser-email-verification-subject-by-link-type)

(clojure.core/declare deser-user-pool-client-list-type)

(clojure.core/declare deser-compromised-credentials-actions-type)

(clojure.core/declare deser-account-takeover-actions-type)

(clojure.core/declare deser-account-takeover-action-notify-type)

(clojure.core/declare deser-risk-decision-type)

(clojure.core/declare deser-client-name-type)

(clojure.core/declare deser-event-response-type)

(clojure.core/declare deser-string-attribute-constraints-type)

(clojure.core/declare deser-compromised-credentials-event-action-type)

(clojure.core/declare deser-email-configuration-type)

(clojure.core/declare deser-client-id-type)

(clojure.core/declare deser-idp-identifier-type)

(clojure.core/declare deser-custom-attribute-name-type)

(clojure.core/declare deser-mfa-option-list-type)

(clojure.core/declare deser-pre-signed-url-type)

(clojure.core/declare deser-session-type)

(clojure.core/declare deser-callback-ur-ls-list-type)

(clojure.core/declare deser-challenge-name-type)

(clojure.core/declare deser-auth-event-type)

(clojure.core/declare deser-email-notification-subject-type)

(clojure.core/declare deser-notify-email-type)

(clojure.core/declare deser-device-key-type)

(clojure.core/declare deser-mfa-option-type)

(clojure.core/declare deser-group-list-type)

(clojure.core/declare deser-providers-list-type)

(clojure.core/declare deser-boolean-type)

(clojure.core/declare deser-notify-configuration-type)

(clojure.core/defn- deser-redirect-url-type [input] input)

(clojure.core/defn- deser-attribute-type [input] (clojure.core/cond-> {:name (deser-attribute-name-type (input "Name"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-attribute-value-type (input "Value")))))

(clojure.core/defn- deser-domain-version-type [input] input)

(clojure.core/defn- deser-device-configuration-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "ChallengeRequiredOnNewDevice") (clojure.core/assoc :challenge-required-on-new-device (deser-boolean-type (input "ChallengeRequiredOnNewDevice"))) (clojure.core/contains? input "DeviceOnlyRememberedOnUserPrompt") (clojure.core/assoc :device-only-remembered-on-user-prompt (deser-boolean-type (input "DeviceOnlyRememberedOnUserPrompt")))))

(clojure.core/defn- deser-user-pool-id-type [input] input)

(clojure.core/defn- deser-resource-servers-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-server-type coll))) input))

(clojure.core/defn- deser-provider-name-type [input] input)

(clojure.core/defn- deser-username-attributes-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-username-attribute-type coll))) input))

(clojure.core/defn- deser-device-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-type coll))) input))

(clojure.core/defn- deser-css-type [input] input)

(clojure.core/defn- deser-advanced-security-mode-type [input] (clojure.core/get {"OFF" :off, "AUDIT" :audit, "ENFORCED" :enforced} input))

(clojure.core/defn- deser-sms-mfa-config-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "SmsAuthenticationMessage") (clojure.core/assoc :sms-authentication-message (deser-sms-verification-message-type (input "SmsAuthenticationMessage"))) (clojure.core/contains? input "SmsConfiguration") (clojure.core/assoc :sms-configuration (deser-sms-configuration-type (input "SmsConfiguration")))))

(clojure.core/defn- deser-alias-attributes-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alias-attribute-type coll))) input))

(clojure.core/defn- deser-arn-type [input] input)

(clojure.core/defn- deser-resource-server-scope-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-server-scope-type coll))) input))

(clojure.core/defn- deser-supported-identity-providers-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provider-name-type coll))) input))

(clojure.core/defn- deser-pagination-key [input] input)

(clojure.core/defn- deser-user-pool-description-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-user-pool-id-type (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-user-pool-name-type (input "Name"))) (clojure.core/contains? input "LambdaConfig") (clojure.core/assoc :lambda-config (deser-lambda-config-type (input "LambdaConfig"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-status-type (input "Status"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate")))))

(clojure.core/defn- deser-delivery-medium-type [input] (clojure.core/get {"SMS" :sms, "EMAIL" :email} input))

(clojure.core/defn- deser-authentication-result-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccessToken") (clojure.core/assoc :access-token (deser-token-model-type (input "AccessToken"))) (clojure.core/contains? input "ExpiresIn") (clojure.core/assoc :expires-in (deser-integer-type (input "ExpiresIn"))) (clojure.core/contains? input "TokenType") (clojure.core/assoc :token-type (deser-string-type (input "TokenType"))) (clojure.core/contains? input "RefreshToken") (clojure.core/assoc :refresh-token (deser-token-model-type (input "RefreshToken"))) (clojure.core/contains? input "IdToken") (clojure.core/assoc :id-token (deser-token-model-type (input "IdToken"))) (clojure.core/contains? input "NewDeviceMetadata") (clojure.core/assoc :new-device-metadata (deser-new-device-metadata-type (input "NewDeviceMetadata")))))

(clojure.core/defn- deser-users-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-type coll))) input))

(clojure.core/defn- deser-attribute-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-type coll))) input))

(clojure.core/defn- deser-identity-provider-type-type [input] (clojure.core/get {"SAML" :saml, "Facebook" :facebook, "Google" :google, "LoginWithAmazon" :login-with-amazon, "OIDC" :oidc} input))

(clojure.core/defn- deser-risk-configuration-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "ClientId") (clojure.core/assoc :client-id (deser-client-id-type (input "ClientId"))) (clojure.core/contains? input "CompromisedCredentialsRiskConfiguration") (clojure.core/assoc :compromised-credentials-risk-configuration (deser-compromised-credentials-risk-configuration-type (input "CompromisedCredentialsRiskConfiguration"))) (clojure.core/contains? input "AccountTakeoverRiskConfiguration") (clojure.core/assoc :account-takeover-risk-configuration (deser-account-takeover-risk-configuration-type (input "AccountTakeoverRiskConfiguration"))) (clojure.core/contains? input "RiskExceptionConfiguration") (clojure.core/assoc :risk-exception-configuration (deser-risk-exception-configuration-type (input "RiskExceptionConfiguration"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate")))))

(clojure.core/defn- deser-precedence-type [input] input)

(clojure.core/defn- deser-new-device-metadata-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceKey") (clojure.core/assoc :device-key (deser-device-key-type (input "DeviceKey"))) (clojure.core/contains? input "DeviceGroupKey") (clojure.core/assoc :device-group-key (deser-string-type (input "DeviceGroupKey")))))

(clojure.core/defn- deser-user-pool-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-pool-description-type coll))) input))

(clojure.core/defn- deser-user-mfa-setting-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-type coll))) input))

(clojure.core/defn- deser-o-auth-flows-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-o-auth-flow-type coll))) input))

(clojure.core/defn- deser-idp-identifiers-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-idp-identifier-type coll))) input))

(clojure.core/defn- deser-alias-attribute-type [input] (clojure.core/get {"phone_number" :phone-number, "email" :email, "preferred_username" :preferred-username} input))

(clojure.core/defn- deser-email-verification-message-type [input] input)

(clojure.core/defn- deser-hex-string-type [input] input)

(clojure.core/defn- deser-challenge-parameters-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string-type k) (deser-string-type v)])) input))

(clojure.core/defn- deser-o-auth-flow-type [input] (clojure.core/get {"code" :code, "implicit" :implicit, "client_credentials" :client-credentials} input))

(clojure.core/defn- deser-user-pool-name-type [input] input)

(clojure.core/defn- deser-user-pool-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "SchemaAttributes") (clojure.core/assoc :schema-attributes (deser-schema-attributes-list-type (input "SchemaAttributes"))) (clojure.core/contains? input "SmsConfiguration") (clojure.core/assoc :sms-configuration (deser-sms-configuration-type (input "SmsConfiguration"))) (clojure.core/contains? input "MfaConfiguration") (clojure.core/assoc :mfa-configuration (deser-user-pool-mfa-type (input "MfaConfiguration"))) (clojure.core/contains? input "AdminCreateUserConfig") (clojure.core/assoc :admin-create-user-config (deser-admin-create-user-config-type (input "AdminCreateUserConfig"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "SmsConfigurationFailure") (clojure.core/assoc :sms-configuration-failure (deser-string-type (input "SmsConfigurationFailure"))) (clojure.core/contains? input "SmsVerificationMessage") (clojure.core/assoc :sms-verification-message (deser-sms-verification-message-type (input "SmsVerificationMessage"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-status-type (input "Status"))) (clojure.core/contains? input "UsernameAttributes") (clojure.core/assoc :username-attributes (deser-username-attributes-list-type (input "UsernameAttributes"))) (clojure.core/contains? input "EstimatedNumberOfUsers") (clojure.core/assoc :estimated-number-of-users (deser-integer-type (input "EstimatedNumberOfUsers"))) (clojure.core/contains? input "EmailConfigurationFailure") (clojure.core/assoc :email-configuration-failure (deser-string-type (input "EmailConfigurationFailure"))) (clojure.core/contains? input "Domain") (clojure.core/assoc :domain (deser-domain-type (input "Domain"))) (clojure.core/contains? input "EmailVerificationMessage") (clojure.core/assoc :email-verification-message (deser-email-verification-message-type (input "EmailVerificationMessage"))) (clojure.core/contains? input "AutoVerifiedAttributes") (clojure.core/assoc :auto-verified-attributes (deser-verified-attributes-list-type (input "AutoVerifiedAttributes"))) (clojure.core/contains? input "DeviceConfiguration") (clojure.core/assoc :device-configuration (deser-device-configuration-type (input "DeviceConfiguration"))) (clojure.core/contains? input "LambdaConfig") (clojure.core/assoc :lambda-config (deser-lambda-config-type (input "LambdaConfig"))) (clojure.core/contains? input "CustomDomain") (clojure.core/assoc :custom-domain (deser-domain-type (input "CustomDomain"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn-type (input "Arn"))) (clojure.core/contains? input "Policies") (clojure.core/assoc :policies (deser-user-pool-policy-type (input "Policies"))) (clojure.core/contains? input "EmailVerificationSubject") (clojure.core/assoc :email-verification-subject (deser-email-verification-subject-type (input "EmailVerificationSubject"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "UserPoolTags") (clojure.core/assoc :user-pool-tags (deser-user-pool-tags-type (input "UserPoolTags"))) (clojure.core/contains? input "UserPoolAddOns") (clojure.core/assoc :user-pool-add-ons (deser-user-pool-add-ons-type (input "UserPoolAddOns"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-user-pool-name-type (input "Name"))) (clojure.core/contains? input "EmailConfiguration") (clojure.core/assoc :email-configuration (deser-email-configuration-type (input "EmailConfiguration"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-user-pool-id-type (input "Id"))) (clojure.core/contains? input "SmsAuthenticationMessage") (clojure.core/assoc :sms-authentication-message (deser-sms-verification-message-type (input "SmsAuthenticationMessage"))) (clojure.core/contains? input "VerificationMessageTemplate") (clojure.core/assoc :verification-message-template (deser-verification-message-template-type (input "VerificationMessageTemplate"))) (clojure.core/contains? input "AliasAttributes") (clojure.core/assoc :alias-attributes (deser-alias-attributes-list-type (input "AliasAttributes")))))

(clojure.core/defn- deser-resource-server-identifier-type [input] input)

(clojure.core/defn- deser-user-import-job-status-type [input] (clojure.core/get {"Created" :created, "Pending" :pending, "InProgress" :in-progress, "Stopping" :stopping, "Expired" :expired, "Stopped" :stopped, "Failed" :failed, "Succeeded" :succeeded} input))

(clojure.core/defn- deser-analytics-configuration-type [input] (clojure.core/cond-> {:application-id (deser-hex-string-type (input "ApplicationId")), :role-arn (deser-arn-type (input "RoleArn")), :external-id (deser-string-type (input "ExternalId"))} (clojure.core/contains? input "UserDataShared") (clojure.core/assoc :user-data-shared (deser-boolean-type (input "UserDataShared")))))

(clojure.core/defn- deser-email-address-type [input] input)

(clojure.core/defn- deser-provider-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProviderName") (clojure.core/assoc :provider-name (deser-provider-name-type (input "ProviderName"))) (clojure.core/contains? input "ProviderType") (clojure.core/assoc :provider-type (deser-identity-provider-type-type (input "ProviderType"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate")))))

(clojure.core/defn- deser-ui-customization-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "ClientId") (clojure.core/assoc :client-id (deser-client-id-type (input "ClientId"))) (clojure.core/contains? input "ImageUrl") (clojure.core/assoc :image-url (deser-image-url-type (input "ImageUrl"))) (clojure.core/contains? input "CSS") (clojure.core/assoc :css (deser-css-type (input "CSS"))) (clojure.core/contains? input "CSSVersion") (clojure.core/assoc :css-version (deser-css-version-type (input "CSSVersion"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate")))))

(clojure.core/defn- deser-user-pool-client-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "AllowedOAuthFlowsUserPoolClient") (clojure.core/assoc :allowed-o-auth-flows-user-pool-client (deser-boolean-type (input "AllowedOAuthFlowsUserPoolClient"))) (clojure.core/contains? input "RefreshTokenValidity") (clojure.core/assoc :refresh-token-validity (deser-refresh-token-validity-type (input "RefreshTokenValidity"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "ReadAttributes") (clojure.core/assoc :read-attributes (deser-client-permission-list-type (input "ReadAttributes"))) (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "DefaultRedirectURI") (clojure.core/assoc :default-redirect-uri (deser-redirect-url-type (input "DefaultRedirectURI"))) (clojure.core/contains? input "AllowedOAuthFlows") (clojure.core/assoc :allowed-o-auth-flows (deser-o-auth-flows-type (input "AllowedOAuthFlows"))) (clojure.core/contains? input "LogoutURLs") (clojure.core/assoc :logout-ur-ls (deser-logout-ur-ls-list-type (input "LogoutURLs"))) (clojure.core/contains? input "ClientName") (clojure.core/assoc :client-name (deser-client-name-type (input "ClientName"))) (clojure.core/contains? input "SupportedIdentityProviders") (clojure.core/assoc :supported-identity-providers (deser-supported-identity-providers-list-type (input "SupportedIdentityProviders"))) (clojure.core/contains? input "CallbackURLs") (clojure.core/assoc :callback-ur-ls (deser-callback-ur-ls-list-type (input "CallbackURLs"))) (clojure.core/contains? input "ClientId") (clojure.core/assoc :client-id (deser-client-id-type (input "ClientId"))) (clojure.core/contains? input "AllowedOAuthScopes") (clojure.core/assoc :allowed-o-auth-scopes (deser-scope-list-type (input "AllowedOAuthScopes"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "WriteAttributes") (clojure.core/assoc :write-attributes (deser-client-permission-list-type (input "WriteAttributes"))) (clojure.core/contains? input "ExplicitAuthFlows") (clojure.core/assoc :explicit-auth-flows (deser-explicit-auth-flows-list-type (input "ExplicitAuthFlows"))) (clojure.core/contains? input "ClientSecret") (clojure.core/assoc :client-secret (deser-client-secret-type (input "ClientSecret"))) (clojure.core/contains? input "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration (deser-analytics-configuration-type (input "AnalyticsConfiguration")))))

(clojure.core/defn- deser-admin-create-user-config-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "AllowAdminCreateUserOnly") (clojure.core/assoc :allow-admin-create-user-only (deser-boolean-type (input "AllowAdminCreateUserOnly"))) (clojure.core/contains? input "UnusedAccountValidityDays") (clojure.core/assoc :unused-account-validity-days (deser-admin-create-user-unused-account-validity-days-type (input "UnusedAccountValidityDays"))) (clojure.core/contains? input "InviteMessageTemplate") (clojure.core/assoc :invite-message-template (deser-message-template-type (input "InviteMessageTemplate")))))

(clojure.core/defn- deser-client-permission-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-client-permission-type coll))) input))

(clojure.core/defn- deser-search-pagination-token-type [input] input)

(clojure.core/defn- deser-image-url-type [input] input)

(clojure.core/defn- deser-domain-status-type [input] (clojure.core/get {"CREATING" :creating, "DELETING" :deleting, "UPDATING" :updating, "ACTIVE" :active, "FAILED" :failed} input))

(clojure.core/defn- deser-resource-server-scope-name-type [input] input)

(clojure.core/defn- deser-user-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "Username") (clojure.core/assoc :username (deser-username-type (input "Username"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attribute-list-type (input "Attributes"))) (clojure.core/contains? input "UserCreateDate") (clojure.core/assoc :user-create-date (deser-date-type (input "UserCreateDate"))) (clojure.core/contains? input "UserLastModifiedDate") (clojure.core/assoc :user-last-modified-date (deser-date-type (input "UserLastModifiedDate"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean-type (input "Enabled"))) (clojure.core/contains? input "UserStatus") (clojure.core/assoc :user-status (deser-user-status-type (input "UserStatus"))) (clojure.core/contains? input "MFAOptions") (clojure.core/assoc :mfa-options (deser-mfa-option-list-type (input "MFAOptions")))))

(clojure.core/defn- deser-client-permission-type [input] input)

(clojure.core/defn- deser-email-verification-message-by-link-type [input] input)

(clojure.core/defn- deser-number-attribute-constraints-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "MinValue") (clojure.core/assoc :min-value (deser-string-type (input "MinValue"))) (clojure.core/contains? input "MaxValue") (clojure.core/assoc :max-value (deser-string-type (input "MaxValue")))))

(clojure.core/defn- deser-password-policy-min-length-type [input] input)

(clojure.core/defn- deser-integer-type [input] input)

(clojure.core/defn- deser-resource-server-scope-type [input] (clojure.core/cond-> {:scope-name (deser-resource-server-scope-name-type (input "ScopeName")), :scope-description (deser-resource-server-scope-description-type (input "ScopeDescription"))}))

(clojure.core/defn- deser-verified-attributes-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-verified-attribute-type coll))) input))

(clojure.core/defn- deser-completion-message-type [input] input)

(clojure.core/defn- deser-resource-server-name-type [input] input)

(clojure.core/defn- deser-user-pool-client-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ClientId") (clojure.core/assoc :client-id (deser-client-id-type (input "ClientId"))) (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "ClientName") (clojure.core/assoc :client-name (deser-client-name-type (input "ClientName")))))

(clojure.core/defn- deser-token-model-type [input] input)

(clojure.core/defn- deser-username-type [input] input)

(clojure.core/defn- deser-email-notification-body-type [input] input)

(clojure.core/defn- deser-secret-code-type [input] input)

(clojure.core/defn- deser-group-name-type [input] input)

(clojure.core/defn- deser-verified-attribute-type [input] (clojure.core/get {"phone_number" :phone-number, "email" :email} input))

(clojure.core/defn- deser-pagination-key-type [input] input)

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"SignIn" :sign-in, "SignUp" :sign-up, "ForgotPassword" :forgot-password} input))

(clojure.core/defn- deser-admin-create-user-unused-account-validity-days-type [input] input)

(clojure.core/defn- deser-long-type [input] input)

(clojure.core/defn- deser-status-type [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} input))

(clojure.core/defn- deser-compromised-credentials-risk-configuration-type [input] (clojure.core/cond-> {:actions (deser-compromised-credentials-actions-type (input "Actions"))} (clojure.core/contains? input "EventFilter") (clojure.core/assoc :event-filter (deser-event-filters-type (input "EventFilter")))))

(clojure.core/defn- deser-user-import-job-name-type [input] input)

(clojure.core/defn- deser-user-pool-add-ons-type [input] (clojure.core/cond-> {:advanced-security-mode (deser-advanced-security-mode-type (input "AdvancedSecurityMode"))}))

(clojure.core/defn- deser-lambda-config-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "PreSignUp") (clojure.core/assoc :pre-sign-up (deser-arn-type (input "PreSignUp"))) (clojure.core/contains? input "PreTokenGeneration") (clojure.core/assoc :pre-token-generation (deser-arn-type (input "PreTokenGeneration"))) (clojure.core/contains? input "PreAuthentication") (clojure.core/assoc :pre-authentication (deser-arn-type (input "PreAuthentication"))) (clojure.core/contains? input "CreateAuthChallenge") (clojure.core/assoc :create-auth-challenge (deser-arn-type (input "CreateAuthChallenge"))) (clojure.core/contains? input "VerifyAuthChallengeResponse") (clojure.core/assoc :verify-auth-challenge-response (deser-arn-type (input "VerifyAuthChallengeResponse"))) (clojure.core/contains? input "PostAuthentication") (clojure.core/assoc :post-authentication (deser-arn-type (input "PostAuthentication"))) (clojure.core/contains? input "CustomMessage") (clojure.core/assoc :custom-message (deser-arn-type (input "CustomMessage"))) (clojure.core/contains? input "PostConfirmation") (clojure.core/assoc :post-confirmation (deser-arn-type (input "PostConfirmation"))) (clojure.core/contains? input "DefineAuthChallenge") (clojure.core/assoc :define-auth-challenge (deser-arn-type (input "DefineAuthChallenge"))) (clojure.core/contains? input "UserMigration") (clojure.core/assoc :user-migration (deser-arn-type (input "UserMigration")))))

(clojure.core/defn- deser-schema-attribute-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-custom-attribute-name-type (input "Name"))) (clojure.core/contains? input "AttributeDataType") (clojure.core/assoc :attribute-data-type (deser-attribute-data-type (input "AttributeDataType"))) (clojure.core/contains? input "DeveloperOnlyAttribute") (clojure.core/assoc :developer-only-attribute (deser-boolean-type (input "DeveloperOnlyAttribute"))) (clojure.core/contains? input "Mutable") (clojure.core/assoc :mutable (deser-boolean-type (input "Mutable"))) (clojure.core/contains? input "Required") (clojure.core/assoc :required (deser-boolean-type (input "Required"))) (clojure.core/contains? input "NumberAttributeConstraints") (clojure.core/assoc :number-attribute-constraints (deser-number-attribute-constraints-type (input "NumberAttributeConstraints"))) (clojure.core/contains? input "StringAttributeConstraints") (clojure.core/assoc :string-attribute-constraints (deser-string-attribute-constraints-type (input "StringAttributeConstraints")))))

(clojure.core/defn- deser-custom-domain-config-type [input] (clojure.core/cond-> {:certificate-arn (deser-arn-type (input "CertificateArn"))}))

(clojure.core/defn- deser-attribute-data-type [input] (clojure.core/get {"String" :string, "Number" :number, "DateTime" :date-time, "Boolean" :boolean} input))

(clojure.core/defn- deser-challenge-response [input] (clojure.core/get {"Success" :success, "Failure" :failure} input))

(clojure.core/defn- deser-provider-details-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string-type k) (deser-string-type v)])) input))

(clojure.core/defn- deser-skipped-ip-range-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-type coll))) input))

(clojure.core/defn- deser-domain-description-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "AWSAccountId") (clojure.core/assoc :aws-account-id (deser-aws-account-id-type (input "AWSAccountId"))) (clojure.core/contains? input "Domain") (clojure.core/assoc :domain (deser-domain-type (input "Domain"))) (clojure.core/contains? input "S3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket-type (input "S3Bucket"))) (clojure.core/contains? input "CloudFrontDistribution") (clojure.core/assoc :cloud-front-distribution (deser-string-type (input "CloudFrontDistribution"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-domain-version-type (input "Version"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-domain-status-type (input "Status"))) (clojure.core/contains? input "CustomDomainConfig") (clojure.core/assoc :custom-domain-config (deser-custom-domain-config-type (input "CustomDomainConfig")))))

(clojure.core/defn- deser-client-secret-type [input] input)

(clojure.core/defn- deser-explicit-auth-flows-type [input] (clojure.core/get {"ADMIN_NO_SRP_AUTH" :admin-no-srp-auth, "CUSTOM_AUTH_FLOW_ONLY" :custom-auth-flow-only, "USER_PASSWORD_AUTH" :user-password-auth} input))

(clojure.core/defn- deser-user-import-job-id-type [input] input)

(clojure.core/defn- deser-date-type [input] input)

(clojure.core/defn- deser-sms-verification-message-type [input] input)

(clojure.core/defn- deser-user-pool-tags-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string-type k) (deser-string-type v)])) input))

(clojure.core/defn- deser-user-import-jobs-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-import-job-type coll))) input))

(clojure.core/defn- deser-user-status-type [input] (clojure.core/get {"UNCONFIRMED" :unconfirmed, "CONFIRMED" :confirmed, "ARCHIVED" :archived, "COMPROMISED" :compromised, "UNKNOWN" :unknown, "RESET_REQUIRED" :reset-required, "FORCE_CHANGE_PASSWORD" :force-change-password} input))

(clojure.core/defn- deser-code-delivery-details-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "Destination") (clojure.core/assoc :destination (deser-string-type (input "Destination"))) (clojure.core/contains? input "DeliveryMedium") (clojure.core/assoc :delivery-medium (deser-delivery-medium-type (input "DeliveryMedium"))) (clojure.core/contains? input "AttributeName") (clojure.core/assoc :attribute-name (deser-attribute-name-type (input "AttributeName")))))

(clojure.core/defn- deser-password-policy-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "MinimumLength") (clojure.core/assoc :minimum-length (deser-password-policy-min-length-type (input "MinimumLength"))) (clojure.core/contains? input "RequireUppercase") (clojure.core/assoc :require-uppercase (deser-boolean-type (input "RequireUppercase"))) (clojure.core/contains? input "RequireLowercase") (clojure.core/assoc :require-lowercase (deser-boolean-type (input "RequireLowercase"))) (clojure.core/contains? input "RequireNumbers") (clojure.core/assoc :require-numbers (deser-boolean-type (input "RequireNumbers"))) (clojure.core/contains? input "RequireSymbols") (clojure.core/assoc :require-symbols (deser-boolean-type (input "RequireSymbols")))))

(clojure.core/defn- deser-css-version-type [input] input)

(clojure.core/defn- deser-event-filters-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-filter-type coll))) input))

(clojure.core/defn- deser-verification-message-template-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "SmsMessage") (clojure.core/assoc :sms-message (deser-sms-verification-message-type (input "SmsMessage"))) (clojure.core/contains? input "EmailMessage") (clojure.core/assoc :email-message (deser-email-verification-message-type (input "EmailMessage"))) (clojure.core/contains? input "EmailSubject") (clojure.core/assoc :email-subject (deser-email-verification-subject-type (input "EmailSubject"))) (clojure.core/contains? input "EmailMessageByLink") (clojure.core/assoc :email-message-by-link (deser-email-verification-message-by-link-type (input "EmailMessageByLink"))) (clojure.core/contains? input "EmailSubjectByLink") (clojure.core/assoc :email-subject-by-link (deser-email-verification-subject-by-link-type (input "EmailSubjectByLink"))) (clojure.core/contains? input "DefaultEmailOption") (clojure.core/assoc :default-email-option (deser-default-email-option-type (input "DefaultEmailOption")))))

(clojure.core/defn- deser-logout-ur-ls-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-redirect-url-type coll))) input))

(clojure.core/defn- deser-code-delivery-details-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-code-delivery-details-type coll))) input))

(clojure.core/defn- deser-blocked-ip-range-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-type coll))) input))

(clojure.core/defn- deser-device-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceKey") (clojure.core/assoc :device-key (deser-device-key-type (input "DeviceKey"))) (clojure.core/contains? input "DeviceAttributes") (clojure.core/assoc :device-attributes (deser-attribute-list-type (input "DeviceAttributes"))) (clojure.core/contains? input "DeviceCreateDate") (clojure.core/assoc :device-create-date (deser-date-type (input "DeviceCreateDate"))) (clojure.core/contains? input "DeviceLastModifiedDate") (clojure.core/assoc :device-last-modified-date (deser-date-type (input "DeviceLastModifiedDate"))) (clojure.core/contains? input "DeviceLastAuthenticatedDate") (clojure.core/assoc :device-last-authenticated-date (deser-date-type (input "DeviceLastAuthenticatedDate")))))

(clojure.core/defn- deser-scope-type [input] input)

(clojure.core/defn- deser-resource-server-scope-description-type [input] input)

(clojure.core/defn- deser-resource-server-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "Identifier") (clojure.core/assoc :identifier (deser-resource-server-identifier-type (input "Identifier"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-server-name-type (input "Name"))) (clojure.core/contains? input "Scopes") (clojure.core/assoc :scopes (deser-resource-server-scope-list-type (input "Scopes")))))

(clojure.core/defn- deser-message-template-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "SMSMessage") (clojure.core/assoc :sms-message (deser-sms-verification-message-type (input "SMSMessage"))) (clojure.core/contains? input "EmailMessage") (clojure.core/assoc :email-message (deser-email-verification-message-type (input "EmailMessage"))) (clojure.core/contains? input "EmailSubject") (clojure.core/assoc :email-subject (deser-email-verification-subject-type (input "EmailSubject")))))

(clojure.core/defn- deser-attribute-mapping-key-type [input] input)

(clojure.core/defn- deser-schema-attributes-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-schema-attribute-type coll))) input))

(clojure.core/defn- deser-software-token-mfa-config-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean-type (input "Enabled")))))

(clojure.core/defn- deser-event-risk-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "RiskDecision") (clojure.core/assoc :risk-decision (deser-risk-decision-type (input "RiskDecision"))) (clojure.core/contains? input "RiskLevel") (clojure.core/assoc :risk-level (deser-risk-level-type (input "RiskLevel")))))

(clojure.core/defn- deser-auth-events-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auth-event-type coll))) input))

(clojure.core/defn- deser-refresh-token-validity-type [input] input)

(clojure.core/defn- deser-string-type [input] input)

(clojure.core/defn- deser-verify-software-token-response-type [input] (clojure.core/get {"SUCCESS" :success, "ERROR" :error} input))

(clojure.core/defn- deser-domain-type [input] input)

(clojure.core/defn- deser-s-3-bucket-type [input] input)

(clojure.core/defn- deser-identity-provider-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "ProviderName") (clojure.core/assoc :provider-name (deser-provider-name-type (input "ProviderName"))) (clojure.core/contains? input "ProviderType") (clojure.core/assoc :provider-type (deser-identity-provider-type-type (input "ProviderType"))) (clojure.core/contains? input "ProviderDetails") (clojure.core/assoc :provider-details (deser-provider-details-type (input "ProviderDetails"))) (clojure.core/contains? input "AttributeMapping") (clojure.core/assoc :attribute-mapping (deser-attribute-mapping-type (input "AttributeMapping"))) (clojure.core/contains? input "IdpIdentifiers") (clojure.core/assoc :idp-identifiers (deser-idp-identifiers-list-type (input "IdpIdentifiers"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate")))))

(clojure.core/defn- deser-event-filter-type [input] (clojure.core/get {"SIGN_IN" :sign-in, "PASSWORD_CHANGE" :password-change, "SIGN_UP" :sign-up} input))

(clojure.core/defn- deser-explicit-auth-flows-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-explicit-auth-flows-type coll))) input))

(clojure.core/defn- deser-feedback-value-type [input] (clojure.core/get {"Valid" :valid, "Invalid" :invalid} input))

(clojure.core/defn- deser-event-feedback-type [input] (clojure.core/cond-> {:feedback-value (deser-feedback-value-type (input "FeedbackValue")), :provider (deser-string-type (input "Provider"))} (clojure.core/contains? input "FeedbackDate") (clojure.core/assoc :feedback-date (deser-date-type (input "FeedbackDate")))))

(clojure.core/defn- deser-attribute-mapping-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-mapping-key-type k) (deser-string-type v)])) input))

(clojure.core/defn- deser-user-pool-policy-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "PasswordPolicy") (clojure.core/assoc :password-policy (deser-password-policy-type (input "PasswordPolicy")))))

(clojure.core/defn- deser-challenge-response-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-challenge-response-type coll))) input))

(clojure.core/defn- deser-attribute-value-type [input] input)

(clojure.core/defn- deser-user-import-job-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "CompletionDate") (clojure.core/assoc :completion-date (deser-date-type (input "CompletionDate"))) (clojure.core/contains? input "PreSignedUrl") (clojure.core/assoc :pre-signed-url (deser-pre-signed-url-type (input "PreSignedUrl"))) (clojure.core/contains? input "ImportedUsers") (clojure.core/assoc :imported-users (deser-long-type (input "ImportedUsers"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-user-import-job-name-type (input "JobName"))) (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-user-import-job-status-type (input "Status"))) (clojure.core/contains? input "CloudWatchLogsRoleArn") (clojure.core/assoc :cloud-watch-logs-role-arn (deser-arn-type (input "CloudWatchLogsRoleArn"))) (clojure.core/contains? input "FailedUsers") (clojure.core/assoc :failed-users (deser-long-type (input "FailedUsers"))) (clojure.core/contains? input "CompletionMessage") (clojure.core/assoc :completion-message (deser-completion-message-type (input "CompletionMessage"))) (clojure.core/contains? input "SkippedUsers") (clojure.core/assoc :skipped-users (deser-long-type (input "SkippedUsers"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "StartDate") (clojure.core/assoc :start-date (deser-date-type (input "StartDate"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-user-import-job-id-type (input "JobId")))))

(clojure.core/defn- deser-group-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "GroupName") (clojure.core/assoc :group-name (deser-group-name-type (input "GroupName"))) (clojure.core/contains? input "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (input "UserPoolId"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-type (input "Description"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-arn-type (input "RoleArn"))) (clojure.core/contains? input "Precedence") (clojure.core/assoc :precedence (deser-precedence-type (input "Precedence"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate")))))

(clojure.core/defn- deser-risk-level-type [input] (clojure.core/get {"Low" :low, "Medium" :medium, "High" :high} input))

(clojure.core/defn- deser-message-type [input] input)

(clojure.core/defn- deser-default-email-option-type [input] (clojure.core/get {"CONFIRM_WITH_LINK" :confirm-with-link, "CONFIRM_WITH_CODE" :confirm-with-code} input))

(clojure.core/defn- deser-challenge-response-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "ChallengeName") (clojure.core/assoc :challenge-name (deser-challenge-name (input "ChallengeName"))) (clojure.core/contains? input "ChallengeResponse") (clojure.core/assoc :challenge-response (deser-challenge-response (input "ChallengeResponse")))))

(clojure.core/defn- deser-list-of-string-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-type coll))) input))

(clojure.core/defn- deser-risk-exception-configuration-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "BlockedIPRangeList") (clojure.core/assoc :blocked-ip-range-list (deser-blocked-ip-range-list-type (input "BlockedIPRangeList"))) (clojure.core/contains? input "SkippedIPRangeList") (clojure.core/assoc :skipped-ip-range-list (deser-skipped-ip-range-list-type (input "SkippedIPRangeList")))))

(clojure.core/defn- deser-user-pool-mfa-type [input] (clojure.core/get {"OFF" :off, "ON" :on, "OPTIONAL" :optional} input))

(clojure.core/defn- deser-sms-configuration-type [input] (clojure.core/cond-> {:sns-caller-arn (deser-arn-type (input "SnsCallerArn"))} (clojure.core/contains? input "ExternalId") (clojure.core/assoc :external-id (deser-string-type (input "ExternalId")))))

(clojure.core/defn- deser-username-attribute-type [input] (clojure.core/get {"phone_number" :phone-number, "email" :email} input))

(clojure.core/defn- deser-event-context-data-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-string-type (input "IpAddress"))) (clojure.core/contains? input "DeviceName") (clojure.core/assoc :device-name (deser-string-type (input "DeviceName"))) (clojure.core/contains? input "Timezone") (clojure.core/assoc :timezone (deser-string-type (input "Timezone"))) (clojure.core/contains? input "City") (clojure.core/assoc :city (deser-string-type (input "City"))) (clojure.core/contains? input "Country") (clojure.core/assoc :country (deser-string-type (input "Country")))))

(clojure.core/defn- deser-aws-account-id-type [input] input)

(clojure.core/defn- deser-account-takeover-risk-configuration-type [input] (clojure.core/cond-> {:actions (deser-account-takeover-actions-type (input "Actions"))} (clojure.core/contains? input "NotifyConfiguration") (clojure.core/assoc :notify-configuration (deser-notify-configuration-type (input "NotifyConfiguration")))))

(clojure.core/defn- deser-account-takeover-action-type [input] (clojure.core/cond-> {:notify (deser-account-takeover-action-notify-type (input "Notify")), :event-action (deser-account-takeover-event-action-type (input "EventAction"))}))

(clojure.core/defn- deser-attribute-name-type [input] input)

(clojure.core/defn- deser-description-type [input] input)

(clojure.core/defn- deser-challenge-name [input] (clojure.core/get {"Password" :password, "Mfa" :mfa} input))

(clojure.core/defn- deser-email-verification-subject-type [input] input)

(clojure.core/defn- deser-account-takeover-event-action-type [input] (clojure.core/get {"BLOCK" :block, "MFA_IF_CONFIGURED" :mfa-if-configured, "MFA_REQUIRED" :mfa-required, "NO_ACTION" :no-action} input))

(clojure.core/defn- deser-scope-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scope-type coll))) input))

(clojure.core/defn- deser-email-verification-subject-by-link-type [input] input)

(clojure.core/defn- deser-user-pool-client-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-pool-client-description coll))) input))

(clojure.core/defn- deser-compromised-credentials-actions-type [input] (clojure.core/cond-> {:event-action (deser-compromised-credentials-event-action-type (input "EventAction"))}))

(clojure.core/defn- deser-account-takeover-actions-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "LowAction") (clojure.core/assoc :low-action (deser-account-takeover-action-type (input "LowAction"))) (clojure.core/contains? input "MediumAction") (clojure.core/assoc :medium-action (deser-account-takeover-action-type (input "MediumAction"))) (clojure.core/contains? input "HighAction") (clojure.core/assoc :high-action (deser-account-takeover-action-type (input "HighAction")))))

(clojure.core/defn- deser-account-takeover-action-notify-type [input] input)

(clojure.core/defn- deser-risk-decision-type [input] (clojure.core/get {"NoRisk" :no-risk, "AccountTakeover" :account-takeover, "Block" :block} input))

(clojure.core/defn- deser-client-name-type [input] input)

(clojure.core/defn- deser-event-response-type [input] (clojure.core/get {"Success" :success, "Failure" :failure} input))

(clojure.core/defn- deser-string-attribute-constraints-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "MinLength") (clojure.core/assoc :min-length (deser-string-type (input "MinLength"))) (clojure.core/contains? input "MaxLength") (clojure.core/assoc :max-length (deser-string-type (input "MaxLength")))))

(clojure.core/defn- deser-compromised-credentials-event-action-type [input] (clojure.core/get {"BLOCK" :block, "NO_ACTION" :no-action} input))

(clojure.core/defn- deser-email-configuration-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceArn") (clojure.core/assoc :source-arn (deser-arn-type (input "SourceArn"))) (clojure.core/contains? input "ReplyToEmailAddress") (clojure.core/assoc :reply-to-email-address (deser-email-address-type (input "ReplyToEmailAddress")))))

(clojure.core/defn- deser-client-id-type [input] input)

(clojure.core/defn- deser-idp-identifier-type [input] input)

(clojure.core/defn- deser-custom-attribute-name-type [input] input)

(clojure.core/defn- deser-mfa-option-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mfa-option-type coll))) input))

(clojure.core/defn- deser-pre-signed-url-type [input] input)

(clojure.core/defn- deser-session-type [input] input)

(clojure.core/defn- deser-callback-ur-ls-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-redirect-url-type coll))) input))

(clojure.core/defn- deser-challenge-name-type [input] (clojure.core/get {"MFA_SETUP" :mfa-setup, "SOFTWARE_TOKEN_MFA" :software-token-mfa, "ADMIN_NO_SRP_AUTH" :admin-no-srp-auth, "DEVICE_SRP_AUTH" :device-srp-auth, "SELECT_MFA_TYPE" :select-mfa-type, "DEVICE_PASSWORD_VERIFIER" :device-password-verifier, "CUSTOM_CHALLENGE" :custom-challenge, "PASSWORD_VERIFIER" :password-verifier, "NEW_PASSWORD_REQUIRED" :new-password-required, "SMS_MFA" :sms-mfa} input))

(clojure.core/defn- deser-auth-event-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventId") (clojure.core/assoc :event-id (deser-string-type (input "EventId"))) (clojure.core/contains? input "EventType") (clojure.core/assoc :event-type (deser-event-type (input "EventType"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "EventResponse") (clojure.core/assoc :event-response (deser-event-response-type (input "EventResponse"))) (clojure.core/contains? input "EventRisk") (clojure.core/assoc :event-risk (deser-event-risk-type (input "EventRisk"))) (clojure.core/contains? input "ChallengeResponses") (clojure.core/assoc :challenge-responses (deser-challenge-response-list-type (input "ChallengeResponses"))) (clojure.core/contains? input "EventContextData") (clojure.core/assoc :event-context-data (deser-event-context-data-type (input "EventContextData"))) (clojure.core/contains? input "EventFeedback") (clojure.core/assoc :event-feedback (deser-event-feedback-type (input "EventFeedback")))))

(clojure.core/defn- deser-email-notification-subject-type [input] input)

(clojure.core/defn- deser-notify-email-type [input] (clojure.core/cond-> {:subject (deser-email-notification-subject-type (input "Subject"))} (clojure.core/contains? input "HtmlBody") (clojure.core/assoc :html-body (deser-email-notification-body-type (input "HtmlBody"))) (clojure.core/contains? input "TextBody") (clojure.core/assoc :text-body (deser-email-notification-body-type (input "TextBody")))))

(clojure.core/defn- deser-device-key-type [input] input)

(clojure.core/defn- deser-mfa-option-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeliveryMedium") (clojure.core/assoc :delivery-medium (deser-delivery-medium-type (input "DeliveryMedium"))) (clojure.core/contains? input "AttributeName") (clojure.core/assoc :attribute-name (deser-attribute-name-type (input "AttributeName")))))

(clojure.core/defn- deser-group-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group-type coll))) input))

(clojure.core/defn- deser-providers-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provider-description coll))) input))

(clojure.core/defn- deser-boolean-type [input] input)

(clojure.core/defn- deser-notify-configuration-type [input] (clojure.core/cond-> {:source-arn (deser-arn-type (input "SourceArn"))} (clojure.core/contains? input "From") (clojure.core/assoc :from (deser-string-type (input "From"))) (clojure.core/contains? input "ReplyTo") (clojure.core/assoc :reply-to (deser-string-type (input "ReplyTo"))) (clojure.core/contains? input "BlockEmail") (clojure.core/assoc :block-email (deser-notify-email-type (input "BlockEmail"))) (clojure.core/contains? input "NoActionEmail") (clojure.core/assoc :no-action-email (deser-notify-email-type (input "NoActionEmail"))) (clojure.core/contains? input "MfaEmail") (clojure.core/assoc :mfa-email (deser-notify-email-type (input "MfaEmail")))))

(clojure.core/defn- response-user-pool-add-on-not-enabled-exception ([input] (response-user-pool-add-on-not-enabled-exception nil input)) ([resultWrapper449569 input] (clojure.core/let [rawinput449568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449570 {"message" (rawinput449568 "message")}] (clojure.core/cond-> {} (letvar449570 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449570 ["message"])))))))

(clojure.core/defn- response-list-identity-providers-response ([input] (response-list-identity-providers-response nil input)) ([resultWrapper449572 input] (clojure.core/let [rawinput449571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449573 {"Providers" (rawinput449571 "Providers"), "NextToken" (rawinput449571 "NextToken")}] (clojure.core/cond-> {:providers (deser-providers-list-type (clojure.core/get-in letvar449573 ["Providers"]))} (letvar449573 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key-type (clojure.core/get-in letvar449573 ["NextToken"])))))))

(clojure.core/defn- response-admin-update-user-attributes-response ([input] (response-admin-update-user-attributes-response nil input)) ([resultWrapper449575 input] (clojure.core/let [rawinput449574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449576 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-group-exists-exception ([input] (response-group-exists-exception nil input)) ([resultWrapper449578 input] (clojure.core/let [rawinput449577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449579 {"message" (rawinput449577 "message")}] (clojure.core/cond-> {} (letvar449579 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449579 ["message"])))))))

(clojure.core/defn- response-duplicate-provider-exception ([input] (response-duplicate-provider-exception nil input)) ([resultWrapper449581 input] (clojure.core/let [rawinput449580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449582 {"message" (rawinput449580 "message")}] (clojure.core/cond-> {} (letvar449582 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449582 ["message"])))))))

(clojure.core/defn- response-create-identity-provider-response ([input] (response-create-identity-provider-response nil input)) ([resultWrapper449584 input] (clojure.core/let [rawinput449583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449585 {"IdentityProvider" (rawinput449583 "IdentityProvider")}] (clojure.core/cond-> {:identity-provider (deser-identity-provider-type (clojure.core/get-in letvar449585 ["IdentityProvider"]))}))))

(clojure.core/defn- response-change-password-response ([input] (response-change-password-response nil input)) ([resultWrapper449587 input] (clojure.core/let [rawinput449586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449588 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-user-import-job-response ([input] (response-start-user-import-job-response nil input)) ([resultWrapper449590 input] (clojure.core/let [rawinput449589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449591 {"UserImportJob" (rawinput449589 "UserImportJob")}] (clojure.core/cond-> {} (letvar449591 "UserImportJob") (clojure.core/assoc :user-import-job (deser-user-import-job-type (clojure.core/get-in letvar449591 ["UserImportJob"])))))))

(clojure.core/defn- response-set-ui-customization-response ([input] (response-set-ui-customization-response nil input)) ([resultWrapper449593 input] (clojure.core/let [rawinput449592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449594 {"UICustomization" (rawinput449592 "UICustomization")}] (clojure.core/cond-> {:ui-customization (deser-ui-customization-type (clojure.core/get-in letvar449594 ["UICustomization"]))}))))

(clojure.core/defn- response-sign-up-response ([input] (response-sign-up-response nil input)) ([resultWrapper449596 input] (clojure.core/let [rawinput449595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449597 {"UserConfirmed" (rawinput449595 "UserConfirmed"), "CodeDeliveryDetails" (rawinput449595 "CodeDeliveryDetails"), "UserSub" (rawinput449595 "UserSub")}] (clojure.core/cond-> {:user-confirmed (deser-boolean-type (clojure.core/get-in letvar449597 ["UserConfirmed"])), :user-sub (deser-string-type (clojure.core/get-in letvar449597 ["UserSub"]))} (letvar449597 "CodeDeliveryDetails") (clojure.core/assoc :code-delivery-details (deser-code-delivery-details-type (clojure.core/get-in letvar449597 ["CodeDeliveryDetails"])))))))

(clojure.core/defn- response-set-user-settings-response ([input] (response-set-user-settings-response nil input)) ([resultWrapper449599 input] (clojure.core/let [rawinput449598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449600 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-admin-initiate-auth-response ([input] (response-admin-initiate-auth-response nil input)) ([resultWrapper449602 input] (clojure.core/let [rawinput449601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449603 {"ChallengeName" (rawinput449601 "ChallengeName"), "Session" (rawinput449601 "Session"), "ChallengeParameters" (rawinput449601 "ChallengeParameters"), "AuthenticationResult" (rawinput449601 "AuthenticationResult")}] (clojure.core/cond-> {} (letvar449603 "ChallengeName") (clojure.core/assoc :challenge-name (deser-challenge-name-type (clojure.core/get-in letvar449603 ["ChallengeName"]))) (letvar449603 "Session") (clojure.core/assoc :session (deser-session-type (clojure.core/get-in letvar449603 ["Session"]))) (letvar449603 "ChallengeParameters") (clojure.core/assoc :challenge-parameters (deser-challenge-parameters-type (clojure.core/get-in letvar449603 ["ChallengeParameters"]))) (letvar449603 "AuthenticationResult") (clojure.core/assoc :authentication-result (deser-authentication-result-type (clojure.core/get-in letvar449603 ["AuthenticationResult"])))))))

(clojure.core/defn- response-update-auth-event-feedback-response ([input] (response-update-auth-event-feedback-response nil input)) ([resultWrapper449605 input] (clojure.core/let [rawinput449604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449606 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-user-import-jobs-response ([input] (response-list-user-import-jobs-response nil input)) ([resultWrapper449608 input] (clojure.core/let [rawinput449607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449609 {"UserImportJobs" (rawinput449607 "UserImportJobs"), "PaginationToken" (rawinput449607 "PaginationToken")}] (clojure.core/cond-> {} (letvar449609 "UserImportJobs") (clojure.core/assoc :user-import-jobs (deser-user-import-jobs-list-type (clojure.core/get-in letvar449609 ["UserImportJobs"]))) (letvar449609 "PaginationToken") (clojure.core/assoc :pagination-token (deser-pagination-key-type (clojure.core/get-in letvar449609 ["PaginationToken"])))))))

(clojure.core/defn- response-create-user-pool-domain-response ([input] (response-create-user-pool-domain-response nil input)) ([resultWrapper449611 input] (clojure.core/let [rawinput449610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449612 {"CloudFrontDomain" (rawinput449610 "CloudFrontDomain")}] (clojure.core/cond-> {} (letvar449612 "CloudFrontDomain") (clojure.core/assoc :cloud-front-domain (deser-domain-type (clojure.core/get-in letvar449612 ["CloudFrontDomain"])))))))

(clojure.core/defn- response-admin-confirm-sign-up-response ([input] (response-admin-confirm-sign-up-response nil input)) ([resultWrapper449614 input] (clojure.core/let [rawinput449613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449615 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resend-confirmation-code-response ([input] (response-resend-confirmation-code-response nil input)) ([resultWrapper449617 input] (clojure.core/let [rawinput449616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449618 {"CodeDeliveryDetails" (rawinput449616 "CodeDeliveryDetails")}] (clojure.core/cond-> {} (letvar449618 "CodeDeliveryDetails") (clojure.core/assoc :code-delivery-details (deser-code-delivery-details-type (clojure.core/get-in letvar449618 ["CodeDeliveryDetails"])))))))

(clojure.core/defn- response-admin-list-user-auth-events-response ([input] (response-admin-list-user-auth-events-response nil input)) ([resultWrapper449620 input] (clojure.core/let [rawinput449619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449621 {"AuthEvents" (rawinput449619 "AuthEvents"), "NextToken" (rawinput449619 "NextToken")}] (clojure.core/cond-> {} (letvar449621 "AuthEvents") (clojure.core/assoc :auth-events (deser-auth-events-type (clojure.core/get-in letvar449621 ["AuthEvents"]))) (letvar449621 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar449621 ["NextToken"])))))))

(clojure.core/defn- response-expired-code-exception ([input] (response-expired-code-exception nil input)) ([resultWrapper449623 input] (clojure.core/let [rawinput449622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449624 {"message" (rawinput449622 "message")}] (clojure.core/cond-> {} (letvar449624 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449624 ["message"])))))))

(clojure.core/defn- response-delete-user-pool-domain-response ([input] (response-delete-user-pool-domain-response nil input)) ([resultWrapper449626 input] (clojure.core/let [rawinput449625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449627 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-device-response ([input] (response-get-device-response nil input)) ([resultWrapper449629 input] (clojure.core/let [rawinput449628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449630 {"Device" (rawinput449628 "Device")}] (clojure.core/cond-> {:device (deser-device-type (clojure.core/get-in letvar449630 ["Device"]))}))))

(clojure.core/defn- response-set-user-pool-mfa-config-response ([input] (response-set-user-pool-mfa-config-response nil input)) ([resultWrapper449632 input] (clojure.core/let [rawinput449631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449633 {"SmsMfaConfiguration" (rawinput449631 "SmsMfaConfiguration"), "SoftwareTokenMfaConfiguration" (rawinput449631 "SoftwareTokenMfaConfiguration"), "MfaConfiguration" (rawinput449631 "MfaConfiguration")}] (clojure.core/cond-> {} (letvar449633 "SmsMfaConfiguration") (clojure.core/assoc :sms-mfa-configuration (deser-sms-mfa-config-type (clojure.core/get-in letvar449633 ["SmsMfaConfiguration"]))) (letvar449633 "SoftwareTokenMfaConfiguration") (clojure.core/assoc :software-token-mfa-configuration (deser-software-token-mfa-config-type (clojure.core/get-in letvar449633 ["SoftwareTokenMfaConfiguration"]))) (letvar449633 "MfaConfiguration") (clojure.core/assoc :mfa-configuration (deser-user-pool-mfa-type (clojure.core/get-in letvar449633 ["MfaConfiguration"])))))))

(clojure.core/defn- response-invalid-sms-role-access-policy-exception ([input] (response-invalid-sms-role-access-policy-exception nil input)) ([resultWrapper449635 input] (clojure.core/let [rawinput449634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449636 {"message" (rawinput449634 "message")}] (clojure.core/cond-> {} (letvar449636 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449636 ["message"])))))))

(clojure.core/defn- response-enable-software-token-mfa-exception ([input] (response-enable-software-token-mfa-exception nil input)) ([resultWrapper449638 input] (clojure.core/let [rawinput449637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449639 {"message" (rawinput449637 "message")}] (clojure.core/cond-> {} (letvar449639 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449639 ["message"])))))))

(clojure.core/defn- response-update-user-pool-domain-response ([input] (response-update-user-pool-domain-response nil input)) ([resultWrapper449641 input] (clojure.core/let [rawinput449640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449642 {"CloudFrontDomain" (rawinput449640 "CloudFrontDomain")}] (clojure.core/cond-> {} (letvar449642 "CloudFrontDomain") (clojure.core/assoc :cloud-front-domain (deser-domain-type (clojure.core/get-in letvar449642 ["CloudFrontDomain"])))))))

(clojure.core/defn- response-get-user-attribute-verification-code-response ([input] (response-get-user-attribute-verification-code-response nil input)) ([resultWrapper449644 input] (clojure.core/let [rawinput449643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449645 {"CodeDeliveryDetails" (rawinput449643 "CodeDeliveryDetails")}] (clojure.core/cond-> {} (letvar449645 "CodeDeliveryDetails") (clojure.core/assoc :code-delivery-details (deser-code-delivery-details-type (clojure.core/get-in letvar449645 ["CodeDeliveryDetails"])))))))

(clojure.core/defn- response-get-user-pool-mfa-config-response ([input] (response-get-user-pool-mfa-config-response nil input)) ([resultWrapper449647 input] (clojure.core/let [rawinput449646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449648 {"SmsMfaConfiguration" (rawinput449646 "SmsMfaConfiguration"), "SoftwareTokenMfaConfiguration" (rawinput449646 "SoftwareTokenMfaConfiguration"), "MfaConfiguration" (rawinput449646 "MfaConfiguration")}] (clojure.core/cond-> {} (letvar449648 "SmsMfaConfiguration") (clojure.core/assoc :sms-mfa-configuration (deser-sms-mfa-config-type (clojure.core/get-in letvar449648 ["SmsMfaConfiguration"]))) (letvar449648 "SoftwareTokenMfaConfiguration") (clojure.core/assoc :software-token-mfa-configuration (deser-software-token-mfa-config-type (clojure.core/get-in letvar449648 ["SoftwareTokenMfaConfiguration"]))) (letvar449648 "MfaConfiguration") (clojure.core/assoc :mfa-configuration (deser-user-pool-mfa-type (clojure.core/get-in letvar449648 ["MfaConfiguration"])))))))

(clojure.core/defn- response-list-user-pools-response ([input] (response-list-user-pools-response nil input)) ([resultWrapper449650 input] (clojure.core/let [rawinput449649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449651 {"UserPools" (rawinput449649 "UserPools"), "NextToken" (rawinput449649 "NextToken")}] (clojure.core/cond-> {} (letvar449651 "UserPools") (clojure.core/assoc :user-pools (deser-user-pool-list-type (clojure.core/get-in letvar449651 ["UserPools"]))) (letvar449651 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key-type (clojure.core/get-in letvar449651 ["NextToken"])))))))

(clojure.core/defn- response-update-user-pool-response ([input] (response-update-user-pool-response nil input)) ([resultWrapper449653 input] (clojure.core/let [rawinput449652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449654 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-identity-provider-response ([input] (response-describe-identity-provider-response nil input)) ([resultWrapper449656 input] (clojure.core/let [rawinput449655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449657 {"IdentityProvider" (rawinput449655 "IdentityProvider")}] (clojure.core/cond-> {:identity-provider (deser-identity-provider-type (clojure.core/get-in letvar449657 ["IdentityProvider"]))}))))

(clojure.core/defn- response-get-group-response ([input] (response-get-group-response nil input)) ([resultWrapper449659 input] (clojure.core/let [rawinput449658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449660 {"Group" (rawinput449658 "Group")}] (clojure.core/cond-> {} (letvar449660 "Group") (clojure.core/assoc :group (deser-group-type (clojure.core/get-in letvar449660 ["Group"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper449662 input] (clojure.core/let [rawinput449661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449663 {"message" (rawinput449661 "message")}] (clojure.core/cond-> {} (letvar449663 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449663 ["message"])))))))

(clojure.core/defn- response-invalid-lambda-response-exception ([input] (response-invalid-lambda-response-exception nil input)) ([resultWrapper449665 input] (clojure.core/let [rawinput449664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449666 {"message" (rawinput449664 "message")}] (clojure.core/cond-> {} (letvar449666 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449666 ["message"])))))))

(clojure.core/defn- response-update-group-response ([input] (response-update-group-response nil input)) ([resultWrapper449668 input] (clojure.core/let [rawinput449667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449669 {"Group" (rawinput449667 "Group")}] (clojure.core/cond-> {} (letvar449669 "Group") (clojure.core/assoc :group (deser-group-type (clojure.core/get-in letvar449669 ["Group"])))))))

(clojure.core/defn- response-list-groups-response ([input] (response-list-groups-response nil input)) ([resultWrapper449671 input] (clojure.core/let [rawinput449670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449672 {"Groups" (rawinput449670 "Groups"), "NextToken" (rawinput449670 "NextToken")}] (clojure.core/cond-> {} (letvar449672 "Groups") (clojure.core/assoc :groups (deser-group-list-type (clojure.core/get-in letvar449672 ["Groups"]))) (letvar449672 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar449672 ["NextToken"])))))))

(clojure.core/defn- response-invalid-user-pool-configuration-exception ([input] (response-invalid-user-pool-configuration-exception nil input)) ([resultWrapper449674 input] (clojure.core/let [rawinput449673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449675 {"message" (rawinput449673 "message")}] (clojure.core/cond-> {} (letvar449675 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449675 ["message"])))))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper449677 input] (clojure.core/let [rawinput449676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449678 {"message" (rawinput449676 "message")}] (clojure.core/cond-> {} (letvar449678 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449678 ["message"])))))))

(clojure.core/defn- response-admin-set-user-mfa-preference-response ([input] (response-admin-set-user-mfa-preference-response nil input)) ([resultWrapper449680 input] (clojure.core/let [rawinput449679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449681 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-initiate-auth-response ([input] (response-initiate-auth-response nil input)) ([resultWrapper449683 input] (clojure.core/let [rawinput449682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449684 {"ChallengeName" (rawinput449682 "ChallengeName"), "Session" (rawinput449682 "Session"), "ChallengeParameters" (rawinput449682 "ChallengeParameters"), "AuthenticationResult" (rawinput449682 "AuthenticationResult")}] (clojure.core/cond-> {} (letvar449684 "ChallengeName") (clojure.core/assoc :challenge-name (deser-challenge-name-type (clojure.core/get-in letvar449684 ["ChallengeName"]))) (letvar449684 "Session") (clojure.core/assoc :session (deser-session-type (clojure.core/get-in letvar449684 ["Session"]))) (letvar449684 "ChallengeParameters") (clojure.core/assoc :challenge-parameters (deser-challenge-parameters-type (clojure.core/get-in letvar449684 ["ChallengeParameters"]))) (letvar449684 "AuthenticationResult") (clojure.core/assoc :authentication-result (deser-authentication-result-type (clojure.core/get-in letvar449684 ["AuthenticationResult"])))))))

(clojure.core/defn- response-admin-respond-to-auth-challenge-response ([input] (response-admin-respond-to-auth-challenge-response nil input)) ([resultWrapper449686 input] (clojure.core/let [rawinput449685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449687 {"ChallengeName" (rawinput449685 "ChallengeName"), "Session" (rawinput449685 "Session"), "ChallengeParameters" (rawinput449685 "ChallengeParameters"), "AuthenticationResult" (rawinput449685 "AuthenticationResult")}] (clojure.core/cond-> {} (letvar449687 "ChallengeName") (clojure.core/assoc :challenge-name (deser-challenge-name-type (clojure.core/get-in letvar449687 ["ChallengeName"]))) (letvar449687 "Session") (clojure.core/assoc :session (deser-session-type (clojure.core/get-in letvar449687 ["Session"]))) (letvar449687 "ChallengeParameters") (clojure.core/assoc :challenge-parameters (deser-challenge-parameters-type (clojure.core/get-in letvar449687 ["ChallengeParameters"]))) (letvar449687 "AuthenticationResult") (clojure.core/assoc :authentication-result (deser-authentication-result-type (clojure.core/get-in letvar449687 ["AuthenticationResult"])))))))

(clojure.core/defn- response-password-reset-required-exception ([input] (response-password-reset-required-exception nil input)) ([resultWrapper449689 input] (clojure.core/let [rawinput449688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449690 {"message" (rawinput449688 "message")}] (clojure.core/cond-> {} (letvar449690 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449690 ["message"])))))))

(clojure.core/defn- response-list-users-in-group-response ([input] (response-list-users-in-group-response nil input)) ([resultWrapper449692 input] (clojure.core/let [rawinput449691 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449693 {"Users" (rawinput449691 "Users"), "NextToken" (rawinput449691 "NextToken")}] (clojure.core/cond-> {} (letvar449693 "Users") (clojure.core/assoc :users (deser-users-list-type (clojure.core/get-in letvar449693 ["Users"]))) (letvar449693 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar449693 ["NextToken"])))))))

(clojure.core/defn- response-invalid-password-exception ([input] (response-invalid-password-exception nil input)) ([resultWrapper449695 input] (clojure.core/let [rawinput449694 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449696 {"message" (rawinput449694 "message")}] (clojure.core/cond-> {} (letvar449696 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449696 ["message"])))))))

(clojure.core/defn- response-user-pool-tagging-exception ([input] (response-user-pool-tagging-exception nil input)) ([resultWrapper449698 input] (clojure.core/let [rawinput449697 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449699 {"message" (rawinput449697 "message")}] (clojure.core/cond-> {} (letvar449699 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449699 ["message"])))))))

(clojure.core/defn- response-respond-to-auth-challenge-response ([input] (response-respond-to-auth-challenge-response nil input)) ([resultWrapper449701 input] (clojure.core/let [rawinput449700 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449702 {"ChallengeName" (rawinput449700 "ChallengeName"), "Session" (rawinput449700 "Session"), "ChallengeParameters" (rawinput449700 "ChallengeParameters"), "AuthenticationResult" (rawinput449700 "AuthenticationResult")}] (clojure.core/cond-> {} (letvar449702 "ChallengeName") (clojure.core/assoc :challenge-name (deser-challenge-name-type (clojure.core/get-in letvar449702 ["ChallengeName"]))) (letvar449702 "Session") (clojure.core/assoc :session (deser-session-type (clojure.core/get-in letvar449702 ["Session"]))) (letvar449702 "ChallengeParameters") (clojure.core/assoc :challenge-parameters (deser-challenge-parameters-type (clojure.core/get-in letvar449702 ["ChallengeParameters"]))) (letvar449702 "AuthenticationResult") (clojure.core/assoc :authentication-result (deser-authentication-result-type (clojure.core/get-in letvar449702 ["AuthenticationResult"])))))))

(clojure.core/defn- response-admin-link-provider-for-user-response ([input] (response-admin-link-provider-for-user-response nil input)) ([resultWrapper449704 input] (clojure.core/let [rawinput449703 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449705 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-email-role-access-policy-exception ([input] (response-invalid-email-role-access-policy-exception nil input)) ([resultWrapper449707 input] (clojure.core/let [rawinput449706 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449708 {"message" (rawinput449706 "message")}] (clojure.core/cond-> {} (letvar449708 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449708 ["message"])))))))

(clojure.core/defn- response-admin-create-user-response ([input] (response-admin-create-user-response nil input)) ([resultWrapper449710 input] (clojure.core/let [rawinput449709 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449711 {"User" (rawinput449709 "User")}] (clojure.core/cond-> {} (letvar449711 "User") (clojure.core/assoc :user (deser-user-type (clojure.core/get-in letvar449711 ["User"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper449713 input] (clojure.core/let [rawinput449712 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449714 {"message" (rawinput449712 "message")}] (clojure.core/cond-> {} (letvar449714 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449714 ["message"])))))))

(clojure.core/defn- response-username-exists-exception ([input] (response-username-exists-exception nil input)) ([resultWrapper449716 input] (clojure.core/let [rawinput449715 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449717 {"message" (rawinput449715 "message")}] (clojure.core/cond-> {} (letvar449717 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449717 ["message"])))))))

(clojure.core/defn- response-verify-software-token-response ([input] (response-verify-software-token-response nil input)) ([resultWrapper449719 input] (clojure.core/let [rawinput449718 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449720 {"Status" (rawinput449718 "Status"), "Session" (rawinput449718 "Session")}] (clojure.core/cond-> {} (letvar449720 "Status") (clojure.core/assoc :status (deser-verify-software-token-response-type (clojure.core/get-in letvar449720 ["Status"]))) (letvar449720 "Session") (clojure.core/assoc :session (deser-session-type (clojure.core/get-in letvar449720 ["Session"])))))))

(clojure.core/defn- response-global-sign-out-response ([input] (response-global-sign-out-response nil input)) ([resultWrapper449722 input] (clojure.core/let [rawinput449721 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449723 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper449725 input] (clojure.core/let [rawinput449724 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449726 {"message" (rawinput449724 "message")}] (clojure.core/cond-> {} (letvar449726 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449726 ["message"])))))))

(clojure.core/defn- response-update-identity-provider-response ([input] (response-update-identity-provider-response nil input)) ([resultWrapper449728 input] (clojure.core/let [rawinput449727 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449729 {"IdentityProvider" (rawinput449727 "IdentityProvider")}] (clojure.core/cond-> {:identity-provider (deser-identity-provider-type (clojure.core/get-in letvar449729 ["IdentityProvider"]))}))))

(clojure.core/defn- response-code-delivery-failure-exception ([input] (response-code-delivery-failure-exception nil input)) ([resultWrapper449731 input] (clojure.core/let [rawinput449730 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449732 {"message" (rawinput449730 "message")}] (clojure.core/cond-> {} (letvar449732 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449732 ["message"])))))))

(clojure.core/defn- response-code-mismatch-exception ([input] (response-code-mismatch-exception nil input)) ([resultWrapper449734 input] (clojure.core/let [rawinput449733 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449735 {"message" (rawinput449733 "message")}] (clojure.core/cond-> {} (letvar449735 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449735 ["message"])))))))

(clojure.core/defn- response-admin-enable-user-response ([input] (response-admin-enable-user-response nil input)) ([resultWrapper449737 input] (clojure.core/let [rawinput449736 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449738 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-scope-does-not-exist-exception ([input] (response-scope-does-not-exist-exception nil input)) ([resultWrapper449740 input] (clojure.core/let [rawinput449739 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449741 {"message" (rawinput449739 "message")}] (clojure.core/cond-> {} (letvar449741 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449741 ["message"])))))))

(clojure.core/defn- response-admin-get-device-response ([input] (response-admin-get-device-response nil input)) ([resultWrapper449743 input] (clojure.core/let [rawinput449742 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449744 {"Device" (rawinput449742 "Device")}] (clojure.core/cond-> {:device (deser-device-type (clojure.core/get-in letvar449744 ["Device"]))}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper449746 input] (clojure.core/let [rawinput449745 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449747 {"message" (rawinput449745 "message")}] (clojure.core/cond-> {} (letvar449747 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449747 ["message"])))))))

(clojure.core/defn- response-user-not-found-exception ([input] (response-user-not-found-exception nil input)) ([resultWrapper449749 input] (clojure.core/let [rawinput449748 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449750 {"message" (rawinput449748 "message")}] (clojure.core/cond-> {} (letvar449750 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449750 ["message"])))))))

(clojure.core/defn- response-verify-user-attribute-response ([input] (response-verify-user-attribute-response nil input)) ([resultWrapper449752 input] (clojure.core/let [rawinput449751 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449753 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-device-status-response ([input] (response-update-device-status-response nil input)) ([resultWrapper449755 input] (clojure.core/let [rawinput449754 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449756 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-attributes-response ([input] (response-delete-user-attributes-response nil input)) ([resultWrapper449758 input] (clojure.core/let [rawinput449757 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449759 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-user-state-exception ([input] (response-unsupported-user-state-exception nil input)) ([resultWrapper449761 input] (clojure.core/let [rawinput449760 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449762 {"message" (rawinput449760 "message")}] (clojure.core/cond-> {} (letvar449762 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449762 ["message"])))))))

(clojure.core/defn- response-unexpected-lambda-exception ([input] (response-unexpected-lambda-exception nil input)) ([resultWrapper449764 input] (clojure.core/let [rawinput449763 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449765 {"message" (rawinput449763 "message")}] (clojure.core/cond-> {} (letvar449765 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449765 ["message"])))))))

(clojure.core/defn- response-create-user-import-job-response ([input] (response-create-user-import-job-response nil input)) ([resultWrapper449767 input] (clojure.core/let [rawinput449766 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449768 {"UserImportJob" (rawinput449766 "UserImportJob")}] (clojure.core/cond-> {} (letvar449768 "UserImportJob") (clojure.core/assoc :user-import-job (deser-user-import-job-type (clojure.core/get-in letvar449768 ["UserImportJob"])))))))

(clojure.core/defn- response-create-user-pool-client-response ([input] (response-create-user-pool-client-response nil input)) ([resultWrapper449770 input] (clojure.core/let [rawinput449769 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449771 {"UserPoolClient" (rawinput449769 "UserPoolClient")}] (clojure.core/cond-> {} (letvar449771 "UserPoolClient") (clojure.core/assoc :user-pool-client (deser-user-pool-client-type (clojure.core/get-in letvar449771 ["UserPoolClient"])))))))

(clojure.core/defn- response-list-user-pool-clients-response ([input] (response-list-user-pool-clients-response nil input)) ([resultWrapper449773 input] (clojure.core/let [rawinput449772 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449774 {"UserPoolClients" (rawinput449772 "UserPoolClients"), "NextToken" (rawinput449772 "NextToken")}] (clojure.core/cond-> {} (letvar449774 "UserPoolClients") (clojure.core/assoc :user-pool-clients (deser-user-pool-client-list-type (clojure.core/get-in letvar449774 ["UserPoolClients"]))) (letvar449774 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar449774 ["NextToken"])))))))

(clojure.core/defn- response-stop-user-import-job-response ([input] (response-stop-user-import-job-response nil input)) ([resultWrapper449776 input] (clojure.core/let [rawinput449775 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449777 {"UserImportJob" (rawinput449775 "UserImportJob")}] (clojure.core/cond-> {} (letvar449777 "UserImportJob") (clojure.core/assoc :user-import-job (deser-user-import-job-type (clojure.core/get-in letvar449777 ["UserImportJob"])))))))

(clojure.core/defn- response-admin-list-groups-for-user-response ([input] (response-admin-list-groups-for-user-response nil input)) ([resultWrapper449779 input] (clojure.core/let [rawinput449778 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449780 {"Groups" (rawinput449778 "Groups"), "NextToken" (rawinput449778 "NextToken")}] (clojure.core/cond-> {} (letvar449780 "Groups") (clojure.core/assoc :groups (deser-group-list-type (clojure.core/get-in letvar449780 ["Groups"]))) (letvar449780 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar449780 ["NextToken"])))))))

(clojure.core/defn- response-add-custom-attributes-response ([input] (response-add-custom-attributes-response nil input)) ([resultWrapper449782 input] (clojure.core/let [rawinput449781 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449783 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-user-pool-domain-response ([input] (response-describe-user-pool-domain-response nil input)) ([resultWrapper449785 input] (clojure.core/let [rawinput449784 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449786 {"DomainDescription" (rawinput449784 "DomainDescription")}] (clojure.core/cond-> {} (letvar449786 "DomainDescription") (clojure.core/assoc :domain-description (deser-domain-description-type (clojure.core/get-in letvar449786 ["DomainDescription"])))))))

(clojure.core/defn- response-mfa-method-not-found-exception ([input] (response-mfa-method-not-found-exception nil input)) ([resultWrapper449788 input] (clojure.core/let [rawinput449787 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449789 {"message" (rawinput449787 "message")}] (clojure.core/cond-> {} (letvar449789 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449789 ["message"])))))))

(clojure.core/defn- response-unsupported-identity-provider-exception ([input] (response-unsupported-identity-provider-exception nil input)) ([resultWrapper449791 input] (clojure.core/let [rawinput449790 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449792 {"message" (rawinput449790 "message")}] (clojure.core/cond-> {} (letvar449792 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449792 ["message"])))))))

(clojure.core/defn- response-admin-get-user-response ([input] (response-admin-get-user-response nil input)) ([resultWrapper449794 input] (clojure.core/let [rawinput449793 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449795 {"Username" (rawinput449793 "Username"), "MFAOptions" (rawinput449793 "MFAOptions"), "Enabled" (rawinput449793 "Enabled"), "UserCreateDate" (rawinput449793 "UserCreateDate"), "PreferredMfaSetting" (rawinput449793 "PreferredMfaSetting"), "UserMFASettingList" (rawinput449793 "UserMFASettingList"), "UserAttributes" (rawinput449793 "UserAttributes"), "UserLastModifiedDate" (rawinput449793 "UserLastModifiedDate"), "UserStatus" (rawinput449793 "UserStatus")}] (clojure.core/cond-> {:username (deser-username-type (clojure.core/get-in letvar449795 ["Username"]))} (letvar449795 "MFAOptions") (clojure.core/assoc :mfa-options (deser-mfa-option-list-type (clojure.core/get-in letvar449795 ["MFAOptions"]))) (letvar449795 "Enabled") (clojure.core/assoc :enabled (deser-boolean-type (clojure.core/get-in letvar449795 ["Enabled"]))) (letvar449795 "UserCreateDate") (clojure.core/assoc :user-create-date (deser-date-type (clojure.core/get-in letvar449795 ["UserCreateDate"]))) (letvar449795 "PreferredMfaSetting") (clojure.core/assoc :preferred-mfa-setting (deser-string-type (clojure.core/get-in letvar449795 ["PreferredMfaSetting"]))) (letvar449795 "UserMFASettingList") (clojure.core/assoc :user-mfa-setting-list (deser-user-mfa-setting-list-type (clojure.core/get-in letvar449795 ["UserMFASettingList"]))) (letvar449795 "UserAttributes") (clojure.core/assoc :user-attributes (deser-attribute-list-type (clojure.core/get-in letvar449795 ["UserAttributes"]))) (letvar449795 "UserLastModifiedDate") (clojure.core/assoc :user-last-modified-date (deser-date-type (clojure.core/get-in letvar449795 ["UserLastModifiedDate"]))) (letvar449795 "UserStatus") (clojure.core/assoc :user-status (deser-user-status-type (clojure.core/get-in letvar449795 ["UserStatus"])))))))

(clojure.core/defn- response-get-identity-provider-by-identifier-response ([input] (response-get-identity-provider-by-identifier-response nil input)) ([resultWrapper449797 input] (clojure.core/let [rawinput449796 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449798 {"IdentityProvider" (rawinput449796 "IdentityProvider")}] (clojure.core/cond-> {:identity-provider (deser-identity-provider-type (clojure.core/get-in letvar449798 ["IdentityProvider"]))}))))

(clojure.core/defn- response-user-import-in-progress-exception ([input] (response-user-import-in-progress-exception nil input)) ([resultWrapper449800 input] (clojure.core/let [rawinput449799 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449801 {"message" (rawinput449799 "message")}] (clojure.core/cond-> {} (letvar449801 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449801 ["message"])))))))

(clojure.core/defn- response-alias-exists-exception ([input] (response-alias-exists-exception nil input)) ([resultWrapper449803 input] (clojure.core/let [rawinput449802 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449804 {"message" (rawinput449802 "message")}] (clojure.core/cond-> {} (letvar449804 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449804 ["message"])))))))

(clojure.core/defn- response-get-ui-customization-response ([input] (response-get-ui-customization-response nil input)) ([resultWrapper449806 input] (clojure.core/let [rawinput449805 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449807 {"UICustomization" (rawinput449805 "UICustomization")}] (clojure.core/cond-> {:ui-customization (deser-ui-customization-type (clojure.core/get-in letvar449807 ["UICustomization"]))}))))

(clojure.core/defn- response-too-many-failed-attempts-exception ([input] (response-too-many-failed-attempts-exception nil input)) ([resultWrapper449809 input] (clojure.core/let [rawinput449808 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449810 {"message" (rawinput449808 "message")}] (clojure.core/cond-> {} (letvar449810 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449810 ["message"])))))))

(clojure.core/defn- response-admin-reset-user-password-response ([input] (response-admin-reset-user-password-response nil input)) ([resultWrapper449812 input] (clojure.core/let [rawinput449811 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449813 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-precondition-not-met-exception ([input] (response-precondition-not-met-exception nil input)) ([resultWrapper449815 input] (clojure.core/let [rawinput449814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449816 {"message" (rawinput449814 "message")}] (clojure.core/cond-> {} (letvar449816 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449816 ["message"])))))))

(clojure.core/defn- response-user-lambda-validation-exception ([input] (response-user-lambda-validation-exception nil input)) ([resultWrapper449818 input] (clojure.core/let [rawinput449817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449819 {"message" (rawinput449817 "message")}] (clojure.core/cond-> {} (letvar449819 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449819 ["message"])))))))

(clojure.core/defn- response-user-not-confirmed-exception ([input] (response-user-not-confirmed-exception nil input)) ([resultWrapper449821 input] (clojure.core/let [rawinput449820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449822 {"message" (rawinput449820 "message")}] (clojure.core/cond-> {} (letvar449822 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449822 ["message"])))))))

(clojure.core/defn- response-create-group-response ([input] (response-create-group-response nil input)) ([resultWrapper449824 input] (clojure.core/let [rawinput449823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449825 {"Group" (rawinput449823 "Group")}] (clojure.core/cond-> {} (letvar449825 "Group") (clojure.core/assoc :group (deser-group-type (clojure.core/get-in letvar449825 ["Group"])))))))

(clojure.core/defn- response-update-user-attributes-response ([input] (response-update-user-attributes-response nil input)) ([resultWrapper449827 input] (clojure.core/let [rawinput449826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449828 {"CodeDeliveryDetailsList" (rawinput449826 "CodeDeliveryDetailsList")}] (clojure.core/cond-> {} (letvar449828 "CodeDeliveryDetailsList") (clojure.core/assoc :code-delivery-details-list (deser-code-delivery-details-list-type (clojure.core/get-in letvar449828 ["CodeDeliveryDetailsList"])))))))

(clojure.core/defn- response-admin-set-user-settings-response ([input] (response-admin-set-user-settings-response nil input)) ([resultWrapper449830 input] (clojure.core/let [rawinput449829 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449831 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-csv-header-response ([input] (response-get-csv-header-response nil input)) ([resultWrapper449833 input] (clojure.core/let [rawinput449832 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449834 {"UserPoolId" (rawinput449832 "UserPoolId"), "CSVHeader" (rawinput449832 "CSVHeader")}] (clojure.core/cond-> {} (letvar449834 "UserPoolId") (clojure.core/assoc :user-pool-id (deser-user-pool-id-type (clojure.core/get-in letvar449834 ["UserPoolId"]))) (letvar449834 "CSVHeader") (clojure.core/assoc :csv-header (deser-list-of-string-types (clojure.core/get-in letvar449834 ["CSVHeader"])))))))

(clojure.core/defn- response-list-resource-servers-response ([input] (response-list-resource-servers-response nil input)) ([resultWrapper449836 input] (clojure.core/let [rawinput449835 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449837 {"ResourceServers" (rawinput449835 "ResourceServers"), "NextToken" (rawinput449835 "NextToken")}] (clojure.core/cond-> {:resource-servers (deser-resource-servers-list-type (clojure.core/get-in letvar449837 ["ResourceServers"]))} (letvar449837 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key-type (clojure.core/get-in letvar449837 ["NextToken"])))))))

(clojure.core/defn- response-describe-user-pool-client-response ([input] (response-describe-user-pool-client-response nil input)) ([resultWrapper449839 input] (clojure.core/let [rawinput449838 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449840 {"UserPoolClient" (rawinput449838 "UserPoolClient")}] (clojure.core/cond-> {} (letvar449840 "UserPoolClient") (clojure.core/assoc :user-pool-client (deser-user-pool-client-type (clojure.core/get-in letvar449840 ["UserPoolClient"])))))))

(clojure.core/defn- response-confirm-device-response ([input] (response-confirm-device-response nil input)) ([resultWrapper449842 input] (clojure.core/let [rawinput449841 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449843 {"UserConfirmationNecessary" (rawinput449841 "UserConfirmationNecessary")}] (clojure.core/cond-> {} (letvar449843 "UserConfirmationNecessary") (clojure.core/assoc :user-confirmation-necessary (deser-boolean-type (clojure.core/get-in letvar449843 ["UserConfirmationNecessary"])))))))

(clojure.core/defn- response-confirm-forgot-password-response ([input] (response-confirm-forgot-password-response nil input)) ([resultWrapper449845 input] (clojure.core/let [rawinput449844 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449846 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-software-token-response ([input] (response-associate-software-token-response nil input)) ([resultWrapper449848 input] (clojure.core/let [rawinput449847 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449849 {"SecretCode" (rawinput449847 "SecretCode"), "Session" (rawinput449847 "Session")}] (clojure.core/cond-> {} (letvar449849 "SecretCode") (clojure.core/assoc :secret-code (deser-secret-code-type (clojure.core/get-in letvar449849 ["SecretCode"]))) (letvar449849 "Session") (clojure.core/assoc :session (deser-session-type (clojure.core/get-in letvar449849 ["Session"])))))))

(clojure.core/defn- response-admin-disable-provider-for-user-response ([input] (response-admin-disable-provider-for-user-response nil input)) ([resultWrapper449851 input] (clojure.core/let [rawinput449850 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449852 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-risk-configuration-response ([input] (response-set-risk-configuration-response nil input)) ([resultWrapper449854 input] (clojure.core/let [rawinput449853 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449855 {"RiskConfiguration" (rawinput449853 "RiskConfiguration")}] (clojure.core/cond-> {:risk-configuration (deser-risk-configuration-type (clojure.core/get-in letvar449855 ["RiskConfiguration"]))}))))

(clojure.core/defn- response-admin-update-device-status-response ([input] (response-admin-update-device-status-response nil input)) ([resultWrapper449857 input] (clojure.core/let [rawinput449856 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449858 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forgot-password-response ([input] (response-forgot-password-response nil input)) ([resultWrapper449860 input] (clojure.core/let [rawinput449859 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449861 {"CodeDeliveryDetails" (rawinput449859 "CodeDeliveryDetails")}] (clojure.core/cond-> {} (letvar449861 "CodeDeliveryDetails") (clojure.core/assoc :code-delivery-details (deser-code-delivery-details-type (clojure.core/get-in letvar449861 ["CodeDeliveryDetails"])))))))

(clojure.core/defn- response-set-user-mfa-preference-response ([input] (response-set-user-mfa-preference-response nil input)) ([resultWrapper449863 input] (clojure.core/let [rawinput449862 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449864 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-o-auth-flow-exception ([input] (response-invalid-o-auth-flow-exception nil input)) ([resultWrapper449866 input] (clojure.core/let [rawinput449865 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449867 {"message" (rawinput449865 "message")}] (clojure.core/cond-> {} (letvar449867 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449867 ["message"])))))))

(clojure.core/defn- response-confirm-sign-up-response ([input] (response-confirm-sign-up-response nil input)) ([resultWrapper449869 input] (clojure.core/let [rawinput449868 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449870 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-admin-user-global-sign-out-response ([input] (response-admin-user-global-sign-out-response nil input)) ([resultWrapper449872 input] (clojure.core/let [rawinput449871 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449873 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper449875 input] (clojure.core/let [rawinput449874 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449876 {"message" (rawinput449874 "message")}] (clojure.core/cond-> {} (letvar449876 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449876 ["message"])))))))

(clojure.core/defn- response-update-user-pool-client-response ([input] (response-update-user-pool-client-response nil input)) ([resultWrapper449878 input] (clojure.core/let [rawinput449877 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449879 {"UserPoolClient" (rawinput449877 "UserPoolClient")}] (clojure.core/cond-> {} (letvar449879 "UserPoolClient") (clojure.core/assoc :user-pool-client (deser-user-pool-client-type (clojure.core/get-in letvar449879 ["UserPoolClient"])))))))

(clojure.core/defn- response-describe-risk-configuration-response ([input] (response-describe-risk-configuration-response nil input)) ([resultWrapper449881 input] (clojure.core/let [rawinput449880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449882 {"RiskConfiguration" (rawinput449880 "RiskConfiguration")}] (clojure.core/cond-> {:risk-configuration (deser-risk-configuration-type (clojure.core/get-in letvar449882 ["RiskConfiguration"]))}))))

(clojure.core/defn- response-invalid-sms-role-trust-relationship-exception ([input] (response-invalid-sms-role-trust-relationship-exception nil input)) ([resultWrapper449884 input] (clojure.core/let [rawinput449883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449885 {"message" (rawinput449883 "message")}] (clojure.core/cond-> {} (letvar449885 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449885 ["message"])))))))

(clojure.core/defn- response-describe-resource-server-response ([input] (response-describe-resource-server-response nil input)) ([resultWrapper449887 input] (clojure.core/let [rawinput449886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449888 {"ResourceServer" (rawinput449886 "ResourceServer")}] (clojure.core/cond-> {:resource-server (deser-resource-server-type (clojure.core/get-in letvar449888 ["ResourceServer"]))}))))

(clojure.core/defn- response-software-token-mfa-not-found-exception ([input] (response-software-token-mfa-not-found-exception nil input)) ([resultWrapper449890 input] (clojure.core/let [rawinput449889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449891 {"message" (rawinput449889 "message")}] (clojure.core/cond-> {} (letvar449891 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449891 ["message"])))))))

(clojure.core/defn- response-get-signing-certificate-response ([input] (response-get-signing-certificate-response nil input)) ([resultWrapper449893 input] (clojure.core/let [rawinput449892 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449894 {"Certificate" (rawinput449892 "Certificate")}] (clojure.core/cond-> {} (letvar449894 "Certificate") (clojure.core/assoc :certificate (deser-string-type (clojure.core/get-in letvar449894 ["Certificate"])))))))

(clojure.core/defn- response-admin-disable-user-response ([input] (response-admin-disable-user-response nil input)) ([resultWrapper449896 input] (clojure.core/let [rawinput449895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449897 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper449899 input] (clojure.core/let [rawinput449898 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449900 {"message" (rawinput449898 "message")}] (clojure.core/cond-> {} (letvar449900 "message") (clojure.core/assoc :message (deser-message-type (clojure.core/get-in letvar449900 ["message"])))))))

(clojure.core/defn- response-describe-user-import-job-response ([input] (response-describe-user-import-job-response nil input)) ([resultWrapper449902 input] (clojure.core/let [rawinput449901 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449903 {"UserImportJob" (rawinput449901 "UserImportJob")}] (clojure.core/cond-> {} (letvar449903 "UserImportJob") (clojure.core/assoc :user-import-job (deser-user-import-job-type (clojure.core/get-in letvar449903 ["UserImportJob"])))))))

(clojure.core/defn- response-create-user-pool-response ([input] (response-create-user-pool-response nil input)) ([resultWrapper449905 input] (clojure.core/let [rawinput449904 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449906 {"UserPool" (rawinput449904 "UserPool")}] (clojure.core/cond-> {} (letvar449906 "UserPool") (clojure.core/assoc :user-pool (deser-user-pool-type (clojure.core/get-in letvar449906 ["UserPool"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper449908 input] (clojure.core/let [rawinput449907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449909 {"Users" (rawinput449907 "Users"), "PaginationToken" (rawinput449907 "PaginationToken")}] (clojure.core/cond-> {} (letvar449909 "Users") (clojure.core/assoc :users (deser-users-list-type (clojure.core/get-in letvar449909 ["Users"]))) (letvar449909 "PaginationToken") (clojure.core/assoc :pagination-token (deser-search-pagination-token-type (clojure.core/get-in letvar449909 ["PaginationToken"])))))))

(clojure.core/defn- response-update-resource-server-response ([input] (response-update-resource-server-response nil input)) ([resultWrapper449911 input] (clojure.core/let [rawinput449910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449912 {"ResourceServer" (rawinput449910 "ResourceServer")}] (clojure.core/cond-> {:resource-server (deser-resource-server-type (clojure.core/get-in letvar449912 ["ResourceServer"]))}))))

(clojure.core/defn- response-admin-delete-user-attributes-response ([input] (response-admin-delete-user-attributes-response nil input)) ([resultWrapper449914 input] (clojure.core/let [rawinput449913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449915 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-resource-server-response ([input] (response-create-resource-server-response nil input)) ([resultWrapper449917 input] (clojure.core/let [rawinput449916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449918 {"ResourceServer" (rawinput449916 "ResourceServer")}] (clojure.core/cond-> {:resource-server (deser-resource-server-type (clojure.core/get-in letvar449918 ["ResourceServer"]))}))))

(clojure.core/defn- response-list-devices-response ([input] (response-list-devices-response nil input)) ([resultWrapper449920 input] (clojure.core/let [rawinput449919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449921 {"Devices" (rawinput449919 "Devices"), "PaginationToken" (rawinput449919 "PaginationToken")}] (clojure.core/cond-> {} (letvar449921 "Devices") (clojure.core/assoc :devices (deser-device-list-type (clojure.core/get-in letvar449921 ["Devices"]))) (letvar449921 "PaginationToken") (clojure.core/assoc :pagination-token (deser-search-pagination-token-type (clojure.core/get-in letvar449921 ["PaginationToken"])))))))

(clojure.core/defn- response-get-user-response ([input] (response-get-user-response nil input)) ([resultWrapper449923 input] (clojure.core/let [rawinput449922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449924 {"Username" (rawinput449922 "Username"), "UserAttributes" (rawinput449922 "UserAttributes"), "MFAOptions" (rawinput449922 "MFAOptions"), "PreferredMfaSetting" (rawinput449922 "PreferredMfaSetting"), "UserMFASettingList" (rawinput449922 "UserMFASettingList")}] (clojure.core/cond-> {:username (deser-username-type (clojure.core/get-in letvar449924 ["Username"])), :user-attributes (deser-attribute-list-type (clojure.core/get-in letvar449924 ["UserAttributes"]))} (letvar449924 "MFAOptions") (clojure.core/assoc :mfa-options (deser-mfa-option-list-type (clojure.core/get-in letvar449924 ["MFAOptions"]))) (letvar449924 "PreferredMfaSetting") (clojure.core/assoc :preferred-mfa-setting (deser-string-type (clojure.core/get-in letvar449924 ["PreferredMfaSetting"]))) (letvar449924 "UserMFASettingList") (clojure.core/assoc :user-mfa-setting-list (deser-user-mfa-setting-list-type (clojure.core/get-in letvar449924 ["UserMFASettingList"])))))))

(clojure.core/defn- response-admin-update-auth-event-feedback-response ([input] (response-admin-update-auth-event-feedback-response nil input)) ([resultWrapper449926 input] (clojure.core/let [rawinput449925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449927 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-admin-list-devices-response ([input] (response-admin-list-devices-response nil input)) ([resultWrapper449929 input] (clojure.core/let [rawinput449928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449930 {"Devices" (rawinput449928 "Devices"), "PaginationToken" (rawinput449928 "PaginationToken")}] (clojure.core/cond-> {} (letvar449930 "Devices") (clojure.core/assoc :devices (deser-device-list-type (clojure.core/get-in letvar449930 ["Devices"]))) (letvar449930 "PaginationToken") (clojure.core/assoc :pagination-token (deser-search-pagination-token-type (clojure.core/get-in letvar449930 ["PaginationToken"])))))))

(clojure.core/defn- response-describe-user-pool-response ([input] (response-describe-user-pool-response nil input)) ([resultWrapper449932 input] (clojure.core/let [rawinput449931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar449933 {"UserPool" (rawinput449931 "UserPool")}] (clojure.core/cond-> {} (letvar449933 "UserPool") (clojure.core/assoc :user-pool (deser-user-pool-type (clojure.core/get-in letvar449933 ["UserPool"])))))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-add-on-not-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-add-on-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-add-on-not-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-identity-providers-response/providers (clojure.spec.alpha/and :portkey.aws.cognito-idp/providers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-identity-providers-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-identity-providers-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-identity-providers-response/providers] :opt-un [:portkey.aws.cognito-idp.list-identity-providers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/redirect-url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.attribute-type/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.attribute-type/value (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-value-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.attribute-type/name] :opt-un [:portkey.aws.cognito-idp.attribute-type/value]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-resource-server-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-resource-server-request/identifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-resource-server-request/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-resource-server-request/scopes (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-scope-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-resource-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-resource-server-request/user-pool-id :portkey.aws.cognito-idp.update-resource-server-request/identifier :portkey.aws.cognito-idp.update-resource-server-request/name] :opt-un [:portkey.aws.cognito-idp.update-resource-server-request/scopes]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.resend-confirmation-code-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resend-confirmation-code-request/secret-hash (clojure.spec.alpha/and :portkey.aws.cognito-idp/secret-hash-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resend-confirmation-code-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resend-confirmation-code-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resend-confirmation-code-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/resend-confirmation-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.resend-confirmation-code-request/client-id :portkey.aws.cognito-idp.resend-confirmation-code-request/username] :opt-un [:portkey.aws.cognito-idp.resend-confirmation-code-request/secret-hash :portkey.aws.cognito-idp.resend-confirmation-code-request/user-context-data :portkey.aws.cognito-idp.resend-confirmation-code-request/analytics-metadata]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.forgot-password-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.forgot-password-request/secret-hash (clojure.spec.alpha/and :portkey.aws.cognito-idp/secret-hash-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.forgot-password-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.forgot-password-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.forgot-password-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/forgot-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.forgot-password-request/client-id :portkey.aws.cognito-idp.forgot-password-request/username] :opt-un [:portkey.aws.cognito-idp.forgot-password-request/secret-hash :portkey.aws.cognito-idp.forgot-password-request/user-context-data :portkey.aws.cognito-idp.forgot-password-request/analytics-metadata]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/domain-version-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-update-user-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-configuration-type/challenge-required-on-new-device (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-configuration-type/device-only-remembered-on-user-prompt (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-configuration-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.device-configuration-type/challenge-required-on-new-device :portkey.aws.cognito-idp.device-configuration-type/device-only-remembered-on-user-prompt]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 55)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w-]+_[0-9a-zA-Z]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/event-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/feedback-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/feedback-value-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-update-auth-event-feedback-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/user-pool-id :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/username :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/event-id :portkey.aws.cognito-idp.admin-update-auth-event-feedback-request/feedback-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-software-token-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-software-token-request/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-software-token-request/user-code (clojure.spec.alpha/and :portkey.aws.cognito-idp/software-token-mfa-user-code-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-software-token-request/friendly-device-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/verify-software-token-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.verify-software-token-request/user-code] :opt-un [:portkey.aws.cognito-idp.verify-software-token-request/access-token :portkey.aws.cognito-idp.verify-software-token-request/session :portkey.aws.cognito-idp.verify-software-token-request/friendly-device-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-exists-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/group-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.group-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-servers-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/resource-server-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-providers-limit-type (clojure.spec.alpha/int-in 1 60))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-identity-provider-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-identity-provider-request/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-identity-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-identity-provider-request/user-pool-id :portkey.aws.cognito-idp.describe-identity-provider-request/provider-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/provider-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/username-attributes-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/username-attribute-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/device-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.duplicate-provider-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/duplicate-provider-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.duplicate-provider-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pools-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pools-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-idp/pool-query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-user-pools-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-user-pools-request/max-results] :opt-un [:portkey.aws.cognito-idp.list-user-pools-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-user-request/access-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.analytics-metadata-type/analytics-endpoint-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/analytics-metadata-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.analytics-metadata-type/analytics-endpoint-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/css-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/advanced-security-mode-type #{"AUDIT" :audit :off :enforced "ENFORCED" "OFF"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.sms-mfa-config-type/sms-authentication-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sms-mfa-config-type/sms-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/sms-mfa-config-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.sms-mfa-config-type/sms-authentication-message :portkey.aws.cognito-idp.sms-mfa-config-type/sms-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-pool-mfa-config-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-user-pool-mfa-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-user-pool-mfa-config-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-response/identity-provider (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-identity-provider-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-identity-provider-response/identity-provider] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pool-clients-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pool-clients-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pool-clients-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-user-pool-clients-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-user-pool-clients-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.list-user-pool-clients-request/max-results :portkey.aws.cognito-idp.list-user-pool-clients-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/client-metadata-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/string-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-user-identifier-type/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-user-identifier-type/provider-attribute-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-user-identifier-type/provider-attribute-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/provider-user-identifier-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.provider-user-identifier-type/provider-name :portkey.aws.cognito-idp.provider-user-identifier-type/provider-attribute-name :portkey.aws.cognito-idp.provider-user-identifier-type/provider-attribute-value]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/change-password-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/alias-attributes-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/alias-attribute-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.start-user-import-job-response/user-import-job (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/start-user-import-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.start-user-import-job-response/user-import-job]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=/,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-user-attributes-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-user-attributes-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-user-attributes-request/user-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-update-user-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-update-user-attributes-request/user-pool-id :portkey.aws.cognito-idp.admin-update-user-attributes-request/username :portkey.aws.cognito-idp.admin-update-user-attributes-request/user-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-scope-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/resource-server-scope-type :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/supported-identity-providers-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/provider-name-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-ui-customization-response/ui-customization (clojure.spec.alpha/and :portkey.aws.cognito-idp/ui-customization-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-ui-customization-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-ui-customization-response/ui-customization] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/pagination-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-response/user-confirmed (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-response/code-delivery-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/code-delivery-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-response/user-sub (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/sign-up-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.sign-up-response/user-confirmed :portkey.aws.cognito-idp.sign-up-response/user-sub] :opt-un [:portkey.aws.cognito-idp.sign-up-response/code-delivery-details]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/sms-mfa-settings (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-mfa-settings-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/software-token-mfa-settings (clojure.spec.alpha/and :portkey.aws.cognito-idp/software-token-mfa-settings-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-set-user-mfa-preference-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/username :portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/sms-mfa-settings :portkey.aws.cognito-idp.admin-set-user-mfa-preference-request/software-token-mfa-settings]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-description-type/id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-description-type/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-description-type/lambda-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/lambda-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-description-type/status (clojure.spec.alpha/and :portkey.aws.cognito-idp/status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-description-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-description-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-description-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-description-type/id :portkey.aws.cognito-idp.user-pool-description-type/name :portkey.aws.cognito-idp.user-pool-description-type/lambda-config :portkey.aws.cognito-idp.user-pool-description-type/status :portkey.aws.cognito-idp.user-pool-description-type/last-modified-date :portkey.aws.cognito-idp.user-pool-description-type/creation-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/delivery-medium-type #{:email "SMS" :sms "EMAIL"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-request/attributes-to-get (clojure.spec.alpha/and :portkey.aws.cognito-idp/searched-attribute-names-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-request/limit (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-request/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/search-pagination-token-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-request/filter (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-filter-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-users-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.list-users-request/attributes-to-get :portkey.aws.cognito-idp.list-users-request/limit :portkey.aws.cognito-idp.list-users-request/pagination-token :portkey.aws.cognito-idp.list-users-request/filter]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-groups-for-user-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-groups-for-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-groups-for-user-request/limit (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-groups-for-user-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-list-groups-for-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-list-groups-for-user-request/username :portkey.aws.cognito-idp.admin-list-groups-for-user-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.admin-list-groups-for-user-request/limit :portkey.aws.cognito-idp.admin-list-groups-for-user-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-identity-provider-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-identity-provider-request/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-identity-provider-request/provider-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-identity-provider-request/attribute-mapping (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-mapping-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-identity-provider-request/idp-identifiers (clojure.spec.alpha/and :portkey.aws.cognito-idp/idp-identifiers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-identity-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-identity-provider-request/user-pool-id :portkey.aws.cognito-idp.update-identity-provider-request/provider-name] :opt-un [:portkey.aws.cognito-idp.update-identity-provider-request/provider-details :portkey.aws.cognito-idp.update-identity-provider-request/attribute-mapping :portkey.aws.cognito-idp.update-identity-provider-request/idp-identifiers]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.authentication-result-type/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.authentication-result-type/expires-in (clojure.spec.alpha/and :portkey.aws.cognito-idp/integer-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.authentication-result-type/token-type (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.authentication-result-type/refresh-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.authentication-result-type/id-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.authentication-result-type/new-device-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/new-device-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/authentication-result-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.authentication-result-type/access-token :portkey.aws.cognito-idp.authentication-result-type/expires-in :portkey.aws.cognito-idp.authentication-result-type/token-type :portkey.aws.cognito-idp.authentication-result-type/refresh-token :portkey.aws.cognito-idp.authentication-result-type/id-token :portkey.aws.cognito-idp.authentication-result-type/new-device-metadata]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.context-data-type/ip-address (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.context-data-type/server-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.context-data-type/server-path (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.context-data-type/http-headers (clojure.spec.alpha/and :portkey.aws.cognito-idp/http-header-list))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.context-data-type/encoded-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/context-data-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.context-data-type/ip-address :portkey.aws.cognito-idp.context-data-type/server-name :portkey.aws.cognito-idp.context-data-type/server-path :portkey.aws.cognito-idp.context-data-type/http-headers] :opt-un [:portkey.aws.cognito-idp.context-data-type/encoded-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-user-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-response/challenge-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-response/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-response/challenge-parameters (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-parameters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-response/authentication-result (clojure.spec.alpha/and :portkey.aws.cognito-idp/authentication-result-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-initiate-auth-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-initiate-auth-response/challenge-name :portkey.aws.cognito-idp.admin-initiate-auth-response/session :portkey.aws.cognito-idp.admin-initiate-auth-response/challenge-parameters :portkey.aws.cognito-idp.admin-initiate-auth-response/authentication-result]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/users-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/user-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.http-header/header-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.http-header/header-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/http-header (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.http-header/header-name :portkey.aws.cognito-idp.http-header/header-value]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-auth-event-feedback-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-import-jobs-response/user-import-jobs (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-jobs-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-import-jobs-response/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-user-import-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-user-import-jobs-response/user-import-jobs :portkey.aws.cognito-idp.list-user-import-jobs-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/attribute-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-domain-response/cloud-front-domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-pool-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.create-user-pool-domain-response/cloud-front-domain]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/http-header-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/http-header))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/identity-provider-type-type #{"OIDC" :facebook :oidc "Google" "SAML" :login-with-amazon "LoginWithAmazon" :google :saml "Facebook"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-confirm-sign-up-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-csv-header-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-csv-header-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-csv-header-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-resource-server-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-resource-server-request/identifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-resource-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-resource-server-request/user-pool-id :portkey.aws.cognito-idp.delete-resource-server-request/identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-configuration-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-configuration-type/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-configuration-type/compromised-credentials-risk-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/compromised-credentials-risk-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-configuration-type/account-takeover-risk-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-risk-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-configuration-type/risk-exception-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/risk-exception-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-configuration-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/risk-configuration-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.risk-configuration-type/user-pool-id :portkey.aws.cognito-idp.risk-configuration-type/client-id :portkey.aws.cognito-idp.risk-configuration-type/compromised-credentials-risk-configuration :portkey.aws.cognito-idp.risk-configuration-type/account-takeover-risk-configuration :portkey.aws.cognito-idp.risk-configuration-type/risk-exception-configuration :portkey.aws.cognito-idp.risk-configuration-type/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.resend-confirmation-code-response/code-delivery-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/code-delivery-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/resend-confirmation-code-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.resend-confirmation-code-response/code-delivery-details]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-user-auth-events-response/auth-events (clojure.spec.alpha/and :portkey.aws.cognito-idp/auth-events-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-user-auth-events-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-list-user-auth-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-list-user-auth-events-response/auth-events :portkey.aws.cognito-idp.admin-list-user-auth-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/precedence-type (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.expired-code-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/expired-code-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.expired-code-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.stop-user-import-job-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.stop-user-import-job-request/job-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/stop-user-import-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.stop-user-import-job-request/user-pool-id :portkey.aws.cognito-idp.stop-user-import-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.new-device-metadata-type/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.new-device-metadata-type/device-group-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/new-device-metadata-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.new-device-metadata-type/device-key :portkey.aws.cognito-idp.new-device-metadata-type/device-group-key]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-pool-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-device-response/device (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-device-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-device-response/device] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-response/sms-mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-mfa-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-response/software-token-mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/software-token-mfa-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-response/mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-mfa-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-user-pool-mfa-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.set-user-pool-mfa-config-response/sms-mfa-configuration :portkey.aws.cognito-idp.set-user-pool-mfa-config-response/software-token-mfa-configuration :portkey.aws.cognito-idp.set-user-pool-mfa-config-response/mfa-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-sms-role-access-policy-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-sms-role-access-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.enable-software-token-mfa-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/enable-software-token-mfa-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.enable-software-token-mfa-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/force-alias-creation clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-request/sms-mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-mfa-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-request/software-token-mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/software-token-mfa-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-pool-mfa-config-request/mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-mfa-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-user-pool-mfa-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-user-pool-mfa-config-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.set-user-pool-mfa-config-request/sms-mfa-configuration :portkey.aws.cognito-idp.set-user-pool-mfa-config-request/software-token-mfa-configuration :portkey.aws.cognito-idp.set-user-pool-mfa-config-request/mfa-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/auth-parameters-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/string-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-domain-response/cloud-front-domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-pool-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.update-user-pool-domain-response/cloud-front-domain]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-forget-device-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-forget-device-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-forget-device-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-forget-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-forget-device-request/user-pool-id :portkey.aws.cognito-idp.admin-forget-device-request/username :portkey.aws.cognito-idp.admin-forget-device-request/device-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-delete-user-attributes-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-delete-user-attributes-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-delete-user-attributes-request/user-attribute-names (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-delete-user-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-delete-user-attributes-request/user-pool-id :portkey.aws.cognito-idp.admin-delete-user-attributes-request/username :portkey.aws.cognito-idp.admin-delete-user-attributes-request/user-attribute-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/auth-flow (clojure.spec.alpha/and :portkey.aws.cognito-idp/auth-flow-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/auth-parameters (clojure.spec.alpha/and :portkey.aws.cognito-idp/auth-parameters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/client-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-initiate-auth-request/context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-initiate-auth-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-initiate-auth-request/user-pool-id :portkey.aws.cognito-idp.admin-initiate-auth-request/client-id :portkey.aws.cognito-idp.admin-initiate-auth-request/auth-flow] :opt-un [:portkey.aws.cognito-idp.admin-initiate-auth-request/auth-parameters :portkey.aws.cognito-idp.admin-initiate-auth-request/client-metadata :portkey.aws.cognito-idp.admin-initiate-auth-request/analytics-metadata :portkey.aws.cognito-idp.admin-initiate-auth-request/context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/user-pool-description-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-mfa-setting-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/o-auth-flows-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/o-auth-flow-type :min-count 0 :max-count 3))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-import-jobs-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-import-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-idp/pool-query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-import-jobs-request/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-user-import-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-user-import-jobs-request/user-pool-id :portkey.aws.cognito-idp.list-user-import-jobs-request/max-results] :opt-un [:portkey.aws.cognito-idp.list-user-import-jobs-request/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-attribute-verification-code-response/code-delivery-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/code-delivery-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-user-attribute-verification-code-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.get-user-attribute-verification-code-response/code-delivery-details]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-disable-provider-for-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-disable-provider-for-user-request/user (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-user-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-disable-provider-for-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-disable-provider-for-user-request/user-pool-id :portkey.aws.cognito-idp.admin-disable-provider-for-user-request/user] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/query-limit (clojure.spec.alpha/int-in 1 60))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-identity-providers-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-identity-providers-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-providers-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-identity-providers-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-identity-providers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-identity-providers-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.list-identity-providers-request/max-results :portkey.aws.cognito-idp.list-identity-providers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/idp-identifiers-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/idp-identifier-type :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/alias-attribute-type #{:email :phone-number :preferred-username "phone_number" "email" "preferred_username"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-responses-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/string-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-verification-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20000)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/hex-string-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-parameters-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/string-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/o-auth-flow-type #{:client-credentials "implicit" "client_credentials" :code :implicit "code"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\s+=,.@-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-client-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-client-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-pool-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-user-pool-client-request/user-pool-id :portkey.aws.cognito-idp.describe-user-pool-client-request/client-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/schema-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/schema-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/sms-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-mfa-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/admin-create-user-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-create-user-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/sms-configuration-failure (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/sms-verification-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/status (clojure.spec.alpha/and :portkey.aws.cognito-idp/status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/username-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/estimated-number-of-users (clojure.spec.alpha/and :portkey.aws.cognito-idp/integer-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/email-configuration-failure (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/email-verification-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/auto-verified-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/verified-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/device-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/lambda-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/lambda-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/custom-domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/policies (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-policy-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/email-verification-subject (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-subject-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/user-pool-tags (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-tags-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/user-pool-add-ons (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-add-ons-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/email-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/sms-authentication-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/verification-message-template (clojure.spec.alpha/and :portkey.aws.cognito-idp/verification-message-template-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-type/alias-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/alias-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-type/schema-attributes :portkey.aws.cognito-idp.user-pool-type/sms-configuration :portkey.aws.cognito-idp.user-pool-type/mfa-configuration :portkey.aws.cognito-idp.user-pool-type/admin-create-user-config :portkey.aws.cognito-idp.user-pool-type/last-modified-date :portkey.aws.cognito-idp.user-pool-type/sms-configuration-failure :portkey.aws.cognito-idp.user-pool-type/sms-verification-message :portkey.aws.cognito-idp.user-pool-type/status :portkey.aws.cognito-idp.user-pool-type/username-attributes :portkey.aws.cognito-idp.user-pool-type/estimated-number-of-users :portkey.aws.cognito-idp.user-pool-type/email-configuration-failure :portkey.aws.cognito-idp.user-pool-type/domain :portkey.aws.cognito-idp.user-pool-type/email-verification-message :portkey.aws.cognito-idp.user-pool-type/auto-verified-attributes :portkey.aws.cognito-idp.user-pool-type/device-configuration :portkey.aws.cognito-idp.user-pool-type/lambda-config :portkey.aws.cognito-idp.user-pool-type/custom-domain :portkey.aws.cognito-idp.user-pool-type/arn :portkey.aws.cognito-idp.user-pool-type/policies :portkey.aws.cognito-idp.user-pool-type/email-verification-subject :portkey.aws.cognito-idp.user-pool-type/creation-date :portkey.aws.cognito-idp.user-pool-type/user-pool-tags :portkey.aws.cognito-idp.user-pool-type/user-pool-add-ons :portkey.aws.cognito-idp.user-pool-type/name :portkey.aws.cognito-idp.user-pool-type/email-configuration :portkey.aws.cognito-idp.user-pool-type/id :portkey.aws.cognito-idp.user-pool-type/sms-authentication-message :portkey.aws.cognito-idp.user-pool-type/verification-message-template :portkey.aws.cognito-idp.user-pool-type/alias-attributes]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-identifier-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\x21\x23-\x5B\x5D-\x7E]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/provider-name-type-v-1 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[^_][\p{L}\p{M}\p{S}\p{N}\p{P}][^_]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-pool-mfa-config-response/sms-mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-mfa-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-pool-mfa-config-response/software-token-mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/software-token-mfa-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-pool-mfa-config-response/mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-mfa-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-user-pool-mfa-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.get-user-pool-mfa-config-response/sms-mfa-configuration :portkey.aws.cognito-idp.get-user-pool-mfa-config-response/software-token-mfa-configuration :portkey.aws.cognito-idp.get-user-pool-mfa-config-response/mfa-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-import-job-status-type #{"Created" "Failed" :in-progress "Succeeded" :pending :created "Expired" :stopping :stopped "InProgress" "Stopping" :expired "Stopped" "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-settings-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-settings-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-set-user-settings-request/mfa-options (clojure.spec.alpha/and :portkey.aws.cognito-idp/mfa-option-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-set-user-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-set-user-settings-request/user-pool-id :portkey.aws.cognito-idp.admin-set-user-settings-request/username :portkey.aws.cognito-idp.admin-set-user-settings-request/mfa-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.analytics-configuration-type/application-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/hex-string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.analytics-configuration-type/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.analytics-configuration-type/external-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.analytics-configuration-type/user-data-shared (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/analytics-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.analytics-configuration-type/application-id :portkey.aws.cognito-idp.analytics-configuration-type/role-arn :portkey.aws.cognito-idp.analytics-configuration-type/external-id] :opt-un [:portkey.aws.cognito-idp.analytics-configuration-type/user-data-shared]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-request/auth-flow (clojure.spec.alpha/and :portkey.aws.cognito-idp/auth-flow-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-request/auth-parameters (clojure.spec.alpha/and :portkey.aws.cognito-idp/auth-parameters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-request/client-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/initiate-auth-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.initiate-auth-request/auth-flow :portkey.aws.cognito-idp.initiate-auth-request/client-id] :opt-un [:portkey.aws.cognito-idp.initiate-auth-request/auth-parameters :portkey.aws.cognito-idp.initiate-auth-request/client-metadata :portkey.aws.cognito-idp.initiate-auth-request/analytics-metadata :portkey.aws.cognito-idp.initiate-auth-request/user-context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-address-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+@[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pools-response/user-pools (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pools-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-user-pools-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-user-pools-response/user-pools :portkey.aws.cognito-idp.list-user-pools-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/delivery-medium-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/delivery-medium-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-resource-server-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-resource-server-request/identifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-resource-server-request/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-resource-server-request/scopes (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-scope-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-resource-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-resource-server-request/user-pool-id :portkey.aws.cognito-idp.create-resource-server-request/identifier :portkey.aws.cognito-idp.create-resource-server-request/name] :opt-un [:portkey.aws.cognito-idp.create-resource-server-request/scopes]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-description/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-description/provider-type (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.provider-description/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/provider-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.provider-description/provider-name :portkey.aws.cognito-idp.provider-description/provider-type :portkey.aws.cognito-idp.provider-description/last-modified-date :portkey.aws.cognito-idp.provider-description/creation-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-device-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-device-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-device-request/device-key] :opt-un [:portkey.aws.cognito-idp.get-device-request/access-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-risk-configuration-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-risk-configuration-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-risk-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-risk-configuration-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.describe-risk-configuration-request/client-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/image-url (clojure.spec.alpha/and :portkey.aws.cognito-idp/image-url-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/css (clojure.spec.alpha/and :portkey.aws.cognito-idp/css-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/css-version (clojure.spec.alpha/and :portkey.aws.cognito-idp/css-version-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.ui-customization-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/ui-customization-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.ui-customization-type/user-pool-id :portkey.aws.cognito-idp.ui-customization-type/client-id :portkey.aws.cognito-idp.ui-customization-type/image-url :portkey.aws.cognito-idp.ui-customization-type/css :portkey.aws.cognito-idp.ui-customization-type/css-version :portkey.aws.cognito-idp.ui-customization-type/last-modified-date :portkey.aws.cognito-idp.ui-customization-type/creation-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-pool-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.software-token-mfa-settings-type/enabled (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.software-token-mfa-settings-type/preferred-mfa (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/software-token-mfa-settings-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.software-token-mfa-settings-type/enabled :portkey.aws.cognito-idp.software-token-mfa-settings-type/preferred-mfa]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/allowed-o-auth-flows-user-pool-client (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/refresh-token-validity (clojure.spec.alpha/and :portkey.aws.cognito-idp/refresh-token-validity-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/read-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-permission-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/default-redirect-uri (clojure.spec.alpha/and :portkey.aws.cognito-idp/redirect-url-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/allowed-o-auth-flows (clojure.spec.alpha/and :portkey.aws.cognito-idp/o-auth-flows-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/logout-ur-ls (clojure.spec.alpha/and :portkey.aws.cognito-idp/logout-ur-ls-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/client-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/supported-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-idp/supported-identity-providers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/callback-ur-ls (clojure.spec.alpha/and :portkey.aws.cognito-idp/callback-ur-ls-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/allowed-o-auth-scopes (clojure.spec.alpha/and :portkey.aws.cognito-idp/scope-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/write-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-permission-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/explicit-auth-flows (clojure.spec.alpha/and :portkey.aws.cognito-idp/explicit-auth-flows-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/client-secret (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-secret-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-type/analytics-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-client-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-client-type/allowed-o-auth-flows-user-pool-client :portkey.aws.cognito-idp.user-pool-client-type/refresh-token-validity :portkey.aws.cognito-idp.user-pool-client-type/last-modified-date :portkey.aws.cognito-idp.user-pool-client-type/read-attributes :portkey.aws.cognito-idp.user-pool-client-type/user-pool-id :portkey.aws.cognito-idp.user-pool-client-type/default-redirect-uri :portkey.aws.cognito-idp.user-pool-client-type/allowed-o-auth-flows :portkey.aws.cognito-idp.user-pool-client-type/logout-ur-ls :portkey.aws.cognito-idp.user-pool-client-type/client-name :portkey.aws.cognito-idp.user-pool-client-type/supported-identity-providers :portkey.aws.cognito-idp.user-pool-client-type/callback-ur-ls :portkey.aws.cognito-idp.user-pool-client-type/client-id :portkey.aws.cognito-idp.user-pool-client-type/allowed-o-auth-scopes :portkey.aws.cognito-idp.user-pool-client-type/creation-date :portkey.aws.cognito-idp.user-pool-client-type/write-attributes :portkey.aws.cognito-idp.user-pool-client-type/explicit-auth-flows :portkey.aws.cognito-idp.user-pool-client-type/client-secret :portkey.aws.cognito-idp.user-pool-client-type/analytics-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-config-type/allow-admin-create-user-only (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-config-type/unused-account-validity-days (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-create-user-unused-account-validity-days-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-config-type/invite-message-template (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-template-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-create-user-config-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-create-user-config-type/allow-admin-create-user-only :portkey.aws.cognito-idp.admin-create-user-config-type/unused-account-validity-days :portkey.aws.cognito-idp.admin-create-user-config-type/invite-message-template]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-request/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type-v-1))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-request/provider-type (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-request/provider-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-request/attribute-mapping (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-mapping-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-identity-provider-request/idp-identifiers (clojure.spec.alpha/and :portkey.aws.cognito-idp/idp-identifiers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-identity-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-identity-provider-request/user-pool-id :portkey.aws.cognito-idp.create-identity-provider-request/provider-name :portkey.aws.cognito-idp.create-identity-provider-request/provider-type :portkey.aws.cognito-idp.create-identity-provider-request/provider-details] :opt-un [:portkey.aws.cognito-idp.create-identity-provider-request/attribute-mapping :portkey.aws.cognito-idp.create-identity-provider-request/idp-identifiers]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-identity-provider-response/identity-provider (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-identity-provider-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-identity-provider-response/identity-provider] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/client-permission-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/client-permission-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/generate-secret clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-group-response/group (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.get-group-response/group]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/search-pagination-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/image-url-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/domain-status-type #{:creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" "FAILED" :updating :failed})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-lambda-response-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-lambda-response-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-lambda-response-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-scope-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\x21\x23-\x2E\x30-\x5B\x5D-\x7E]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-group-response/group (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.update-group-response/group]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/user-create-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/user-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/enabled (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/user-status (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-type/mfa-options (clojure.spec.alpha/and :portkey.aws.cognito-idp/mfa-option-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-type/username :portkey.aws.cognito-idp.user-type/attributes :portkey.aws.cognito-idp.user-type/user-create-date :portkey.aws.cognito-idp.user-type/user-last-modified-date :portkey.aws.cognito-idp.user-type/enabled :portkey.aws.cognito-idp.user-type/user-status :portkey.aws.cognito-idp.user-type/mfa-options]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/client-permission-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-verification-message-by-link-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20000)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{##[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*##\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.number-attribute-constraints-type/min-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.number-attribute-constraints-type/max-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/number-attribute-constraints-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.number-attribute-constraints-type/min-value :portkey.aws.cognito-idp.number-attribute-constraints-type/max-value]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-resource-servers-limit-type (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/password-policy-min-length-type (clojure.spec.alpha/int-in 6 99))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-groups-response/groups (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-groups-response/groups :portkey.aws.cognito-idp.list-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-user-pool-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-user-pool-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-set-user-mfa-preference-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/integer-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-server-scope-type/scope-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-scope-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-server-scope-type/scope-description (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-scope-description-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-scope-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.resource-server-scope-type/scope-name :portkey.aws.cognito-idp.resource-server-scope-type/scope-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/verified-attributes-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/verified-attribute-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-response/challenge-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-response/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-response/challenge-parameters (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-parameters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.initiate-auth-response/authentication-result (clojure.spec.alpha/and :portkey.aws.cognito-idp/authentication-result-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/initiate-auth-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.initiate-auth-response/challenge-name :portkey.aws.cognito-idp.initiate-auth-response/session :portkey.aws.cognito-idp.initiate-auth-response/challenge-parameters :portkey.aws.cognito-idp.initiate-auth-response/authentication-result]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/completion-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/challenge-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/challenge-parameters (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-parameters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/authentication-result (clojure.spec.alpha/and :portkey.aws.cognito-idp/authentication-result-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-respond-to-auth-challenge-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/challenge-name :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/session :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/challenge-parameters :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-response/authentication-result]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-attribute-verification-code-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-attribute-verification-code-request/attribute-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-user-attribute-verification-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-user-attribute-verification-code-request/access-token :portkey.aws.cognito-idp.get-user-attribute-verification-code-request/attribute-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-ui-customization-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-ui-customization-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-ui-customization-request/css (clojure.spec.alpha/and :portkey.aws.cognito-idp/css-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-ui-customization-request/image-file (clojure.spec.alpha/and :portkey.aws.cognito-idp/image-file-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-ui-customization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-ui-customization-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.set-ui-customization-request/client-id :portkey.aws.cognito-idp.set-ui-customization-request/css :portkey.aws.cognito-idp.set-ui-customization-request/image-file]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\s+=,.@-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.password-reset-required-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/password-reset-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.password-reset-required-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-description/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-description/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-client-description/client-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-client-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-client-description/client-id :portkey.aws.cognito-idp.user-pool-client-description/user-pool-id :portkey.aws.cognito-idp.user-pool-client-description/client-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/token-model-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[A-Za-z0-9-_=.]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-in-group-response/users (clojure.spec.alpha/and :portkey.aws.cognito-idp/users-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-in-group-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-users-in-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-users-in-group-response/users :portkey.aws.cognito-idp.list-users-in-group-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-password-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-password-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/username-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-notification-body-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20000)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-tagging-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-tagging-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-tagging-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/secret-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 16 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[A-Za-z0-9]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-domain-request/domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-pool-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-user-pool-domain-request/domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/allowed-o-auth-flows-user-pool-client (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/refresh-token-validity (clojure.spec.alpha/and :portkey.aws.cognito-idp/refresh-token-validity-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/read-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-permission-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/default-redirect-uri (clojure.spec.alpha/and :portkey.aws.cognito-idp/redirect-url-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/allowed-o-auth-flows (clojure.spec.alpha/and :portkey.aws.cognito-idp/o-auth-flows-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/logout-ur-ls (clojure.spec.alpha/and :portkey.aws.cognito-idp/logout-ur-ls-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/client-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/supported-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-idp/supported-identity-providers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/callback-ur-ls (clojure.spec.alpha/and :portkey.aws.cognito-idp/callback-ur-ls-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/allowed-o-auth-scopes (clojure.spec.alpha/and :portkey.aws.cognito-idp/scope-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/write-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-permission-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/explicit-auth-flows (clojure.spec.alpha/and :portkey.aws.cognito-idp/explicit-auth-flows-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-request/analytics-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-pool-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-user-pool-client-request/user-pool-id :portkey.aws.cognito-idp.update-user-pool-client-request/client-id] :opt-un [:portkey.aws.cognito-idp.update-user-pool-client-request/allowed-o-auth-flows-user-pool-client :portkey.aws.cognito-idp.update-user-pool-client-request/refresh-token-validity :portkey.aws.cognito-idp.update-user-pool-client-request/read-attributes :portkey.aws.cognito-idp.update-user-pool-client-request/default-redirect-uri :portkey.aws.cognito-idp.update-user-pool-client-request/allowed-o-auth-flows :portkey.aws.cognito-idp.update-user-pool-client-request/logout-ur-ls :portkey.aws.cognito-idp.update-user-pool-client-request/client-name :portkey.aws.cognito-idp.update-user-pool-client-request/supported-identity-providers :portkey.aws.cognito-idp.update-user-pool-client-request/callback-ur-ls :portkey.aws.cognito-idp.update-user-pool-client-request/allowed-o-auth-scopes :portkey.aws.cognito-idp.update-user-pool-client-request/write-attributes :portkey.aws.cognito-idp.update-user-pool-client-request/explicit-auth-flows :portkey.aws.cognito-idp.update-user-pool-client-request/analytics-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/group-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-add-user-to-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-add-user-to-group-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-add-user-to-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-add-user-to-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-add-user-to-group-request/user-pool-id :portkey.aws.cognito-idp.admin-add-user-to-group-request/username :portkey.aws.cognito-idp.admin-add-user-to-group-request/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/verified-attribute-type #{:email :phone-number "phone_number" "email"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-response/challenge-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-response/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-response/challenge-parameters (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-parameters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-response/authentication-result (clojure.spec.alpha/and :portkey.aws.cognito-idp/authentication-result-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/respond-to-auth-challenge-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.respond-to-auth-challenge-response/challenge-name :portkey.aws.cognito-idp.respond-to-auth-challenge-response/session :portkey.aws.cognito-idp.respond-to-auth-challenge-response/challenge-parameters :portkey.aws.cognito-idp.respond-to-auth-challenge-response/authentication-result]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/pagination-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-type #{:sign-in "SignIn" :sign-up "ForgotPassword" "SignUp" :forgot-password})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-create-user-unused-account-validity-days-type (clojure.spec.alpha/int-in 0 365))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-link-provider-for-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-email-role-access-policy-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-email-role-access-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/long-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-risk-configuration-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-risk-configuration-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-risk-configuration-request/compromised-credentials-risk-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/compromised-credentials-risk-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-risk-configuration-request/account-takeover-risk-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-risk-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-risk-configuration-request/risk-exception-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/risk-exception-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-risk-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-risk-configuration-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.set-risk-configuration-request/client-id :portkey.aws.cognito-idp.set-risk-configuration-request/compromised-credentials-risk-configuration :portkey.aws.cognito-idp.set-risk-configuration-request/account-takeover-risk-configuration :portkey.aws.cognito-idp.set-risk-configuration-request/risk-exception-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/status-type #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-response/user (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-create-user-response/user]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.compromised-credentials-risk-configuration-type/event-filter (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-filters-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.compromised-credentials-risk-configuration-type/actions (clojure.spec.alpha/and :portkey.aws.cognito-idp/compromised-credentials-actions-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/compromised-credentials-risk-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.compromised-credentials-risk-configuration-type/actions] :opt-un [:portkey.aws.cognito-idp.compromised-credentials-risk-configuration-type/event-filter]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-devices-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-devices-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-devices-request/limit (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-devices-request/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/search-pagination-token-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-list-devices-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-list-devices-request/user-pool-id :portkey.aws.cognito-idp.admin-list-devices-request/username] :opt-un [:portkey.aws.cognito-idp.admin-list-devices-request/limit :portkey.aws.cognito-idp.admin-list-devices-request/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-user-global-sign-out-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-user-global-sign-out-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-user-global-sign-out-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-user-global-sign-out-request/user-pool-id :portkey.aws.cognito-idp.admin-user-global-sign-out-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-import-job-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\s+=,.@-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-add-ons-type/advanced-security-mode (clojure.spec.alpha/and :portkey.aws.cognito-idp/advanced-security-mode-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-add-ons-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.user-pool-add-ons-type/advanced-security-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.username-exists-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/username-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.username-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/software-token-mfa-user-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 6)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-software-token-response/status (clojure.spec.alpha/and :portkey.aws.cognito-idp/verify-software-token-response-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-software-token-response/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/verify-software-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.verify-software-token-response/status :portkey.aws.cognito-idp.verify-software-token-response/session]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/pre-sign-up (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/pre-token-generation (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/pre-authentication (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/create-auth-challenge (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/verify-auth-challenge-response (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/post-authentication (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/custom-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/post-confirmation (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/define-auth-challenge (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.lambda-config-type/user-migration (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/lambda-config-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.lambda-config-type/pre-sign-up :portkey.aws.cognito-idp.lambda-config-type/pre-token-generation :portkey.aws.cognito-idp.lambda-config-type/pre-authentication :portkey.aws.cognito-idp.lambda-config-type/create-auth-challenge :portkey.aws.cognito-idp.lambda-config-type/verify-auth-challenge-response :portkey.aws.cognito-idp.lambda-config-type/post-authentication :portkey.aws.cognito-idp.lambda-config-type/custom-message :portkey.aws.cognito-idp.lambda-config-type/post-confirmation :portkey.aws.cognito-idp.lambda-config-type/define-auth-challenge :portkey.aws.cognito-idp.lambda-config-type/user-migration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/challenge-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/challenge-responses (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-responses-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-respond-to-auth-challenge-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/user-pool-id :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/client-id :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/challenge-name] :opt-un [:portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/challenge-responses :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/session :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/analytics-metadata :portkey.aws.cognito-idp.admin-respond-to-auth-challenge-request/context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-remembered-status-type #{"not_remembered" :remembered "remembered" :not-remembered})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.schema-attribute-type/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/custom-attribute-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.schema-attribute-type/developer-only-attribute (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.schema-attribute-type/mutable (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.schema-attribute-type/required (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.schema-attribute-type/number-attribute-constraints (clojure.spec.alpha/and :portkey.aws.cognito-idp/number-attribute-constraints-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.schema-attribute-type/string-attribute-constraints (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-attribute-constraints-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/schema-attribute-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.schema-attribute-type/name :portkey.aws.cognito-idp/attribute-data-type :portkey.aws.cognito-idp.schema-attribute-type/developer-only-attribute :portkey.aws.cognito-idp.schema-attribute-type/mutable :portkey.aws.cognito-idp.schema-attribute-type/required :portkey.aws.cognito-idp.schema-attribute-type/number-attribute-constraints :portkey.aws.cognito-idp.schema-attribute-type/string-attribute-constraints]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/global-sign-out-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.custom-domain-config-type/certificate-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/custom-domain-config-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.custom-domain-config-type/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-identity-provider-response/identity-provider (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-identity-provider-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-identity-provider-response/identity-provider] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-data-type #{:date-time :number "Number" :string "String" :boolean "DateTime" "Boolean"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-response #{:failure "Success" "Failure" :success})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.code-delivery-failure-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/code-delivery-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.code-delivery-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/provider-details-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/string-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/skipped-ip-range-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/string-type :max-count 20))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/aws-account-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/aws-account-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/s-3-bucket (clojure.spec.alpha/and :portkey.aws.cognito-idp/s-3-bucket-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/cloud-front-distribution (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/version (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-version-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/status (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.domain-description-type/custom-domain-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/custom-domain-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/domain-description-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.domain-description-type/user-pool-id :portkey.aws.cognito-idp.domain-description-type/aws-account-id :portkey.aws.cognito-idp.domain-description-type/domain :portkey.aws.cognito-idp.domain-description-type/s-3-bucket :portkey.aws.cognito-idp.domain-description-type/cloud-front-distribution :portkey.aws.cognito-idp.domain-description-type/version :portkey.aws.cognito-idp.domain-description-type/status :portkey.aws.cognito-idp.domain-description-type/custom-domain-config]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-user-pool-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-identity-provider-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-identity-provider-request/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-identity-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-identity-provider-request/user-pool-id :portkey.aws.cognito-idp.delete-identity-provider-request/provider-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.code-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/code-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.code-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-enable-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/auth-flow-type #{:refresh-token :custom-auth "CUSTOM_AUTH" :user-password-auth "ADMIN_NO_SRP_AUTH" "USER_SRP_AUTH" :admin-no-srp-auth "USER_PASSWORD_AUTH" "REFRESH_TOKEN" "REFRESH_TOKEN_AUTH" :user-srp-auth :refresh-token-auth})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/client-secret-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/sms-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-mfa-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/admin-create-user-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-create-user-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/sms-verification-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/email-verification-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/auto-verified-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/verified-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/device-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/lambda-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/lambda-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/policies (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-policy-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/email-verification-subject (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-subject-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/user-pool-tags (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-tags-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/user-pool-add-ons (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-add-ons-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/email-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/sms-authentication-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-request/verification-message-template (clojure.spec.alpha/and :portkey.aws.cognito-idp/verification-message-template-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-user-pool-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.update-user-pool-request/sms-configuration :portkey.aws.cognito-idp.update-user-pool-request/mfa-configuration :portkey.aws.cognito-idp.update-user-pool-request/admin-create-user-config :portkey.aws.cognito-idp.update-user-pool-request/sms-verification-message :portkey.aws.cognito-idp.update-user-pool-request/email-verification-message :portkey.aws.cognito-idp.update-user-pool-request/auto-verified-attributes :portkey.aws.cognito-idp.update-user-pool-request/device-configuration :portkey.aws.cognito-idp.update-user-pool-request/lambda-config :portkey.aws.cognito-idp.update-user-pool-request/policies :portkey.aws.cognito-idp.update-user-pool-request/email-verification-subject :portkey.aws.cognito-idp.update-user-pool-request/user-pool-tags :portkey.aws.cognito-idp.update-user-pool-request/user-pool-add-ons :portkey.aws.cognito-idp.update-user-pool-request/email-configuration :portkey.aws.cognito-idp.update-user-pool-request/sms-authentication-message :portkey.aws.cognito-idp.update-user-pool-request/verification-message-template]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/explicit-auth-flows-type #{:custom-auth-flow-only :user-password-auth "ADMIN_NO_SRP_AUTH" "CUSTOM_AUTH_FLOW_ONLY" :admin-no-srp-auth "USER_PASSWORD_AUTH"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-context-data-type/encoded-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-context-data-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-context-data-type/encoded-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-import-job-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 55)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"import-[0-9a-zA-Z-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp/sms-verification-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 140)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*\{####\}.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-tags-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/string-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.scope-does-not-exist-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/scope-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.scope-does-not-exist-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-device-response/device (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-get-device-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-get-device-response/device] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-import-jobs-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/user-import-job-type :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-status-type #{:archived "UNKNOWN" "ARCHIVED" :unknown "FORCE_CHANGE_PASSWORD" "COMPROMISED" "RESET_REQUIRED" "UNCONFIRMED" :confirmed :compromised "CONFIRMED" :force-change-password :unconfirmed :reset-required})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.code-delivery-details-type/destination (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.code-delivery-details-type/delivery-medium (clojure.spec.alpha/and :portkey.aws.cognito-idp/delivery-medium-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.code-delivery-details-type/attribute-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/code-delivery-details-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.code-delivery-details-type/destination :portkey.aws.cognito-idp.code-delivery-details-type/delivery-medium :portkey.aws.cognito-idp.code-delivery-details-type/attribute-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.password-policy-type/minimum-length (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-policy-min-length-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.password-policy-type/require-uppercase (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.password-policy-type/require-lowercase (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.password-policy-type/require-numbers (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.password-policy-type/require-symbols (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/password-policy-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.password-policy-type/minimum-length :portkey.aws.cognito-idp.password-policy-type/require-uppercase :portkey.aws.cognito-idp.password-policy-type/require-lowercase :portkey.aws.cognito-idp.password-policy-type/require-numbers :portkey.aws.cognito-idp.password-policy-type/require-symbols]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/css-version-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-filters-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/event-filter-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.verification-message-template-type/sms-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verification-message-template-type/email-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verification-message-template-type/email-subject (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-subject-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verification-message-template-type/email-message-by-link (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-message-by-link-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verification-message-template-type/email-subject-by-link (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-subject-by-link-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verification-message-template-type/default-email-option (clojure.spec.alpha/and :portkey.aws.cognito-idp/default-email-option-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/verification-message-template-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.verification-message-template-type/sms-message :portkey.aws.cognito-idp.verification-message-template-type/email-message :portkey.aws.cognito-idp.verification-message-template-type/email-subject :portkey.aws.cognito-idp.verification-message-template-type/email-message-by-link :portkey.aws.cognito-idp.verification-message-template-type/email-subject-by-link :portkey.aws.cognito-idp.verification-message-template-type/default-email-option]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/logout-ur-ls-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/redirect-url-type :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-sign-up-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-sign-up-request/secret-hash (clojure.spec.alpha/and :portkey.aws.cognito-idp/secret-hash-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-sign-up-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-sign-up-request/confirmation-code (clojure.spec.alpha/and :portkey.aws.cognito-idp/confirmation-code-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-sign-up-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-sign-up-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirm-sign-up-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.confirm-sign-up-request/client-id :portkey.aws.cognito-idp.confirm-sign-up-request/username :portkey.aws.cognito-idp.confirm-sign-up-request/confirmation-code] :opt-un [:portkey.aws.cognito-idp.confirm-sign-up-request/secret-hash :portkey.aws.cognito-idp/force-alias-creation :portkey.aws.cognito-idp.confirm-sign-up-request/analytics-metadata :portkey.aws.cognito-idp.confirm-sign-up-request/user-context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/code-delivery-details-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/code-delivery-details-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/blocked-ip-range-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/string-type :max-count 20))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-mfa-preference-request/sms-mfa-settings (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-mfa-settings-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-mfa-preference-request/software-token-mfa-settings (clojure.spec.alpha/and :portkey.aws.cognito-idp/software-token-mfa-settings-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-mfa-preference-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-user-mfa-preference-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-user-mfa-preference-request/access-token] :opt-un [:portkey.aws.cognito-idp.set-user-mfa-preference-request/sms-mfa-settings :portkey.aws.cognito-idp.set-user-mfa-preference-request/software-token-mfa-settings]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/verify-user-attribute-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-resource-server-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-resource-server-request/identifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-resource-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-resource-server-request/user-pool-id :portkey.aws.cognito-idp.describe-resource-server-request/identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/secret-hash-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=/]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/searched-attribute-names-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/attribute-name-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-type/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-type/device-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-type/device-create-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-type/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-type/device-last-authenticated-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.device-type/device-key :portkey.aws.cognito-idp.device-type/device-attributes :portkey.aws.cognito-idp.device-type/device-create-date :portkey.aws.cognito-idp.device-type/device-last-modified-date :portkey.aws.cognito-idp.device-type/device-last-authenticated-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/attribute-name-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-group-request/group-name :portkey.aws.cognito-idp.delete-group-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/scope-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\x21\x23-\x5B\x5D-\x7E]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.start-user-import-job-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.start-user-import-job-request/job-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/start-user-import-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.start-user-import-job-request/user-pool-id :portkey.aws.cognito-idp.start-user-import-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-scope-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-device-status-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.unsupported-user-state-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/unsupported-user-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.unsupported-user-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-server-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-server-type/identifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-server-type/name (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.resource-server-type/scopes (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-scope-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/resource-server-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.resource-server-type/user-pool-id :portkey.aws.cognito-idp.resource-server-type/identifier :portkey.aws.cognito-idp.resource-server-type/name :portkey.aws.cognito-idp.resource-server-type/scopes]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.unexpected-lambda-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/unexpected-lambda-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.unexpected-lambda-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-import-job-response/user-import-job (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-import-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.create-user-import-job-response/user-import-job]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.message-template-type/sms-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.message-template-type/email-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.message-template-type/email-subject (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-subject-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/message-template-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.message-template-type/sms-message :portkey.aws.cognito-idp.message-template-type/email-message :portkey.aws.cognito-idp.message-template-type/email-subject]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-response/user-pool-client (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-client-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-pool-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.create-user-pool-client-response/user-pool-client]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pool-clients-response/user-pool-clients (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-client-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-user-pool-clients-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-user-pool-clients-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-user-pool-clients-response/user-pool-clients :portkey.aws.cognito-idp.list-user-pool-clients-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-mapping-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-import-job-request/job-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-import-job-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-import-job-request/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-import-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-user-import-job-request/job-name :portkey.aws.cognito-idp.create-user-import-job-request/user-pool-id :portkey.aws.cognito-idp.create-user-import-job-request/cloud-watch-logs-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.stop-user-import-job-response/user-import-job (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/stop-user-import-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.stop-user-import-job-response/user-import-job]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-link-provider-for-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-link-provider-for-user-request/destination-user (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-user-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-link-provider-for-user-request/source-user (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-user-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-link-provider-for-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-link-provider-for-user-request/user-pool-id :portkey.aws.cognito-idp.admin-link-provider-for-user-request/destination-user :portkey.aws.cognito-idp.admin-link-provider-for-user-request/source-user] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/custom-attributes-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/schema-attribute-type :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/schema-attributes-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/schema-attribute-type :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-groups-for-user-response/groups (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-groups-for-user-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-list-groups-for-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-list-groups-for-user-response/groups :portkey.aws.cognito-idp.admin-list-groups-for-user-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-settings-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-user-settings-request/mfa-options (clojure.spec.alpha/and :portkey.aws.cognito-idp/mfa-option-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-user-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-user-settings-request/access-token :portkey.aws.cognito-idp.set-user-settings-request/mfa-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/add-custom-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.software-token-mfa-config-type/enabled (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/software-token-mfa-config-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.software-token-mfa-config-type/enabled]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/image-file-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-risk-type/risk-decision (clojure.spec.alpha/and :portkey.aws.cognito-idp/risk-decision-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-risk-type/risk-level (clojure.spec.alpha/and :portkey.aws.cognito-idp/risk-level-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-risk-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.event-risk-type/risk-decision :portkey.aws.cognito-idp.event-risk-type/risk-level]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-filter-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/auth-events-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/auth-event-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-domain-response/domain-description (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-description-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-pool-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.describe-user-pool-domain-response/domain-description]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/refresh-token-validity-type (clojure.spec.alpha/int-in 0 3650))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.mfa-method-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/mfa-method-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.mfa-method-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/string-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.unsupported-identity-provider-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/unsupported-identity-provider-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.unsupported-identity-provider-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/mfa-options (clojure.spec.alpha/and :portkey.aws.cognito-idp/mfa-option-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/enabled (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/user-create-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/preferred-mfa-setting (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/user-mfa-setting-list (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-mfa-setting-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/user-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/user-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-response/user-status (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-get-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-get-user-response/username] :opt-un [:portkey.aws.cognito-idp.admin-get-user-response/mfa-options :portkey.aws.cognito-idp.admin-get-user-response/enabled :portkey.aws.cognito-idp.admin-get-user-response/user-create-date :portkey.aws.cognito-idp.admin-get-user-response/preferred-mfa-setting :portkey.aws.cognito-idp.admin-get-user-response/user-mfa-setting-list :portkey.aws.cognito-idp.admin-get-user-response/user-attributes :portkey.aws.cognito-idp.admin-get-user-response/user-last-modified-date :portkey.aws.cognito-idp.admin-get-user-response/user-status]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/verify-software-token-response-type #{"SUCCESS" "ERROR" :success :error})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/query-limit-type (clojure.spec.alpha/int-in 0 60))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-delete-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-delete-user-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-delete-user-request/user-pool-id :portkey.aws.cognito-idp.admin-delete-user-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/domain-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 63)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/s-3-bucket-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/provider-type (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/provider-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/provider-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/attribute-mapping (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-mapping-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/idp-identifiers (clojure.spec.alpha/and :portkey.aws.cognito-idp/idp-identifiers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.identity-provider-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/identity-provider-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.identity-provider-type/user-pool-id :portkey.aws.cognito-idp.identity-provider-type/provider-name :portkey.aws.cognito-idp.identity-provider-type/provider-type :portkey.aws.cognito-idp.identity-provider-type/provider-details :portkey.aws.cognito-idp.identity-provider-type/attribute-mapping :portkey.aws.cognito-idp.identity-provider-type/idp-identifiers :portkey.aws.cognito-idp.identity-provider-type/last-modified-date :portkey.aws.cognito-idp.identity-provider-type/creation-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-filter-type #{:sign-in :sign-up "SIGN_UP" :password-change "SIGN_IN" "PASSWORD_CHANGE"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-identity-provider-by-identifier-response/identity-provider (clojure.spec.alpha/and :portkey.aws.cognito-idp/identity-provider-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-identity-provider-by-identifier-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-identity-provider-by-identifier-response/identity-provider] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/allowed-o-auth-flows-user-pool-client (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/refresh-token-validity (clojure.spec.alpha/and :portkey.aws.cognito-idp/refresh-token-validity-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/read-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-permission-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/default-redirect-uri (clojure.spec.alpha/and :portkey.aws.cognito-idp/redirect-url-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/allowed-o-auth-flows (clojure.spec.alpha/and :portkey.aws.cognito-idp/o-auth-flows-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/logout-ur-ls (clojure.spec.alpha/and :portkey.aws.cognito-idp/logout-ur-ls-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/client-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/supported-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-idp/supported-identity-providers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/callback-ur-ls (clojure.spec.alpha/and :portkey.aws.cognito-idp/callback-ur-ls-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/allowed-o-auth-scopes (clojure.spec.alpha/and :portkey.aws.cognito-idp/scope-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/write-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-permission-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/explicit-auth-flows (clojure.spec.alpha/and :portkey.aws.cognito-idp/explicit-auth-flows-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-client-request/analytics-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-pool-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-user-pool-client-request/user-pool-id :portkey.aws.cognito-idp.create-user-pool-client-request/client-name] :opt-un [:portkey.aws.cognito-idp.create-user-pool-client-request/allowed-o-auth-flows-user-pool-client :portkey.aws.cognito-idp.create-user-pool-client-request/refresh-token-validity :portkey.aws.cognito-idp.create-user-pool-client-request/read-attributes :portkey.aws.cognito-idp/generate-secret :portkey.aws.cognito-idp.create-user-pool-client-request/default-redirect-uri :portkey.aws.cognito-idp.create-user-pool-client-request/allowed-o-auth-flows :portkey.aws.cognito-idp.create-user-pool-client-request/logout-ur-ls :portkey.aws.cognito-idp.create-user-pool-client-request/supported-identity-providers :portkey.aws.cognito-idp.create-user-pool-client-request/callback-ur-ls :portkey.aws.cognito-idp.create-user-pool-client-request/allowed-o-auth-scopes :portkey.aws.cognito-idp.create-user-pool-client-request/write-attributes :portkey.aws.cognito-idp.create-user-pool-client-request/explicit-auth-flows :portkey.aws.cognito-idp.create-user-pool-client-request/analytics-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-import-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-import-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/explicit-auth-flows-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/explicit-auth-flows-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.alias-exists-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/alias-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.alias-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.sms-mfa-settings-type/enabled (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sms-mfa-settings-type/preferred-mfa (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/sms-mfa-settings-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.sms-mfa-settings-type/enabled :portkey.aws.cognito-idp.sms-mfa-settings-type/preferred-mfa]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-ui-customization-response/ui-customization (clojure.spec.alpha/and :portkey.aws.cognito-idp/ui-customization-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-ui-customization-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-ui-customization-response/ui-customization] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/feedback-value-type #{:valid "Invalid" :invalid "Valid"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-user-attribute-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-user-attribute-request/attribute-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.verify-user-attribute-request/code (clojure.spec.alpha/and :portkey.aws.cognito-idp/confirmation-code-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/verify-user-attribute-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.verify-user-attribute-request/access-token :portkey.aws.cognito-idp.verify-user-attribute-request/attribute-name :portkey.aws.cognito-idp.verify-user-attribute-request/code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-feedback-type/feedback-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/feedback-value-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-feedback-type/provider (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-feedback-type/feedback-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-feedback-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.event-feedback-type/feedback-value :portkey.aws.cognito-idp.event-feedback-type/provider] :opt-un [:portkey.aws.cognito-idp.event-feedback-type/feedback-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-mapping-type (clojure.spec.alpha/map-of :portkey.aws.cognito-idp/attribute-mapping-key-type :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-pool-policy-type/password-policy (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-policy-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-policy-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-pool-policy-type/password-policy]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.change-password-request/previous-password (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.change-password-request/proposed-password (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.change-password-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/change-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.change-password-request/previous-password :portkey.aws.cognito-idp.change-password-request/proposed-password :portkey.aws.cognito-idp.change-password-request/access-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-device-status-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-device-status-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-device-status-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-update-device-status-request/device-remembered-status (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-remembered-status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-update-device-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-update-device-status-request/user-pool-id :portkey.aws.cognito-idp.admin-update-device-status-request/username :portkey.aws.cognito-idp.admin-update-device-status-request/device-key] :opt-un [:portkey.aws.cognito-idp.admin-update-device-status-request/device-remembered-status]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-attributes-request/user-attribute-names (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-attributes-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-user-attributes-request/user-attribute-names :portkey.aws.cognito-idp.delete-user-attributes-request/access-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-response-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/challenge-response-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-enable-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-enable-user-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-enable-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-enable-user-request/user-pool-id :portkey.aws.cognito-idp.admin-enable-user-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/completion-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/pre-signed-url (clojure.spec.alpha/and :portkey.aws.cognito-idp/pre-signed-url-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/imported-users (clojure.spec.alpha/and :portkey.aws.cognito-idp/long-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/job-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/status (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/failed-users (clojure.spec.alpha/and :portkey.aws.cognito-idp/long-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/completion-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/completion-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/skipped-users (clojure.spec.alpha/and :portkey.aws.cognito-idp/long-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/start-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-import-job-type/job-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-import-job-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-import-job-type/completion-date :portkey.aws.cognito-idp.user-import-job-type/pre-signed-url :portkey.aws.cognito-idp.user-import-job-type/imported-users :portkey.aws.cognito-idp.user-import-job-type/job-name :portkey.aws.cognito-idp.user-import-job-type/user-pool-id :portkey.aws.cognito-idp.user-import-job-type/status :portkey.aws.cognito-idp.user-import-job-type/cloud-watch-logs-role-arn :portkey.aws.cognito-idp.user-import-job-type/failed-users :portkey.aws.cognito-idp.user-import-job-type/completion-message :portkey.aws.cognito-idp.user-import-job-type/skipped-users :portkey.aws.cognito-idp.user-import-job-type/creation-date :portkey.aws.cognito-idp.user-import-job-type/start-date :portkey.aws.cognito-idp.user-import-job-type/job-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.too-many-failed-attempts-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/too-many-failed-attempts-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.too-many-failed-attempts-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/description (clojure.spec.alpha/and :portkey.aws.cognito-idp/description-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/precedence (clojure.spec.alpha/and :portkey.aws.cognito-idp/precedence-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.group-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/group-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.group-type/group-name :portkey.aws.cognito-idp.group-type/user-pool-id :portkey.aws.cognito-idp.group-type/description :portkey.aws.cognito-idp.group-type/role-arn :portkey.aws.cognito-idp.group-type/precedence :portkey.aws.cognito-idp.group-type/last-modified-date :portkey.aws.cognito-idp.group-type/creation-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/risk-level-type #{"Medium" :medium :high "High" :low "Low"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-reset-user-password-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-pool-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-user-pool-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.precondition-not-met-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/precondition-not-met-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.precondition-not-met-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-lambda-validation-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-lambda-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-lambda-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-user-auth-events-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-user-auth-events-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-user-auth-events-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-user-auth-events-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-list-user-auth-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-list-user-auth-events-request/user-pool-id :portkey.aws.cognito-idp.admin-list-user-auth-events-request/username] :opt-un [:portkey.aws.cognito-idp.admin-list-user-auth-events-request/max-results :portkey.aws.cognito-idp.admin-list-user-auth-events-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-groups-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-groups-request/limit (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-groups-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.list-groups-request/limit :portkey.aws.cognito-idp.list-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-attributes-request/user-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-attributes-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-user-attributes-request/user-attributes :portkey.aws.cognito-idp.update-user-attributes-request/access-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.user-not-confirmed-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-not-confirmed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.user-not-confirmed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-group-response/group (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.create-group-response/group]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-attributes-response/code-delivery-details-list (clojure.spec.alpha/and :portkey.aws.cognito-idp/code-delivery-details-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.update-user-attributes-response/code-delivery-details-list]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/default-email-option-type #{:confirm-with-link "CONFIRM_WITH_CODE" "CONFIRM_WITH_LINK" :confirm-with-code})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-set-user-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-csv-header-response/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-csv-header-response/csv-header (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-of-string-types))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-csv-header-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.get-csv-header-response/user-pool-id :portkey.aws.cognito-idp.get-csv-header-response/csv-header]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-domain-request/domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-domain-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-domain-request/custom-domain-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/custom-domain-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-pool-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-user-pool-domain-request/domain :portkey.aws.cognito-idp.update-user-pool-domain-request/user-pool-id :portkey.aws.cognito-idp.update-user-pool-domain-request/custom-domain-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/pool-query-limit-type (clojure.spec.alpha/int-in 1 60))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-response-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp/challenge-name :portkey.aws.cognito-idp/challenge-response]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-of-string-types (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/string-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/sms-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/schema (clojure.spec.alpha/and :portkey.aws.cognito-idp/schema-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/mfa-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-mfa-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/pool-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/admin-create-user-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-create-user-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/sms-verification-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/username-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/email-verification-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/auto-verified-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/verified-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/device-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/lambda-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/lambda-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/policies (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-policy-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/email-verification-subject (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-verification-subject-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/user-pool-tags (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-tags-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/user-pool-add-ons (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-add-ons-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/email-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/sms-authentication-message (clojure.spec.alpha/and :portkey.aws.cognito-idp/sms-verification-message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/verification-message-template (clojure.spec.alpha/and :portkey.aws.cognito-idp/verification-message-template-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-request/alias-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/alias-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-user-pool-request/pool-name] :opt-un [:portkey.aws.cognito-idp.create-user-pool-request/sms-configuration :portkey.aws.cognito-idp.create-user-pool-request/schema :portkey.aws.cognito-idp.create-user-pool-request/mfa-configuration :portkey.aws.cognito-idp.create-user-pool-request/admin-create-user-config :portkey.aws.cognito-idp.create-user-pool-request/sms-verification-message :portkey.aws.cognito-idp.create-user-pool-request/username-attributes :portkey.aws.cognito-idp.create-user-pool-request/email-verification-message :portkey.aws.cognito-idp.create-user-pool-request/auto-verified-attributes :portkey.aws.cognito-idp.create-user-pool-request/device-configuration :portkey.aws.cognito-idp.create-user-pool-request/lambda-config :portkey.aws.cognito-idp.create-user-pool-request/policies :portkey.aws.cognito-idp.create-user-pool-request/email-verification-subject :portkey.aws.cognito-idp.create-user-pool-request/user-pool-tags :portkey.aws.cognito-idp.create-user-pool-request/user-pool-add-ons :portkey.aws.cognito-idp.create-user-pool-request/email-configuration :portkey.aws.cognito-idp.create-user-pool-request/sms-authentication-message :portkey.aws.cognito-idp.create-user-pool-request/verification-message-template :portkey.aws.cognito-idp.create-user-pool-request/alias-attributes]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-exception-configuration-type/blocked-ip-range-list (clojure.spec.alpha/and :portkey.aws.cognito-idp/blocked-ip-range-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.risk-exception-configuration-type/skipped-ip-range-list (clojure.spec.alpha/and :portkey.aws.cognito-idp/skipped-ip-range-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/risk-exception-configuration-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.risk-exception-configuration-type/blocked-ip-range-list :portkey.aws.cognito-idp.risk-exception-configuration-type/skipped-ip-range-list]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-resource-servers-response/resource-servers (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-servers-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-resource-servers-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-resource-servers-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-resource-servers-response/resource-servers] :opt-un [:portkey.aws.cognito-idp.list-resource-servers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-group-request/description (clojure.spec.alpha/and :portkey.aws.cognito-idp/description-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-group-request/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-group-request/precedence (clojure.spec.alpha/and :portkey.aws.cognito-idp/precedence-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-group-request/group-name :portkey.aws.cognito-idp.create-group-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.create-group-request/description :portkey.aws.cognito-idp.create-group-request/role-arn :portkey.aws.cognito-idp.create-group-request/precedence]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-client-response/user-pool-client (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-client-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-pool-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.describe-user-pool-client-response/user-pool-client]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-device-response/user-confirmation-necessary (clojure.spec.alpha/and :portkey.aws.cognito-idp/boolean-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirm-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.confirm-device-response/user-confirmation-necessary]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirmation-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirm-forgot-password-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-mfa-type #{"OPTIONAL" "ON" :optional :off :on "OFF"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.associate-software-token-response/secret-code (clojure.spec.alpha/and :portkey.aws.cognito-idp/secret-code-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.associate-software-token-response/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/associate-software-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.associate-software-token-response/secret-code :portkey.aws.cognito-idp.associate-software-token-response/session]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-pool-domain-request/domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-pool-domain-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-pool-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-user-pool-domain-request/domain :portkey.aws.cognito-idp.delete-user-pool-domain-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-user-request/access-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-ui-customization-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-ui-customization-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-ui-customization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-ui-customization-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.get-ui-customization-request/client-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.sms-configuration-type/sns-caller-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sms-configuration-type/external-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/sms-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.sms-configuration-type/sns-caller-arn] :opt-un [:portkey.aws.cognito-idp.sms-configuration-type/external-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-disable-provider-for-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-in-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-in-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-in-group-request/limit (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-in-group-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-users-in-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-users-in-group-request/user-pool-id :portkey.aws.cognito-idp.list-users-in-group-request/group-name] :opt-un [:portkey.aws.cognito-idp.list-users-in-group-request/limit :portkey.aws.cognito-idp.list-users-in-group-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/username-attribute-type #{:email :phone-number "phone_number" "email"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.set-risk-configuration-response/risk-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/risk-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-risk-configuration-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.set-risk-configuration-response/risk-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-context-data-type/ip-address (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-context-data-type/device-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-context-data-type/timezone (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-context-data-type/city (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.event-context-data-type/country (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-context-data-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.event-context-data-type/ip-address :portkey.aws.cognito-idp.event-context-data-type/device-name :portkey.aws.cognito-idp.event-context-data-type/timezone :portkey.aws.cognito-idp.event-context-data-type/city :portkey.aws.cognito-idp.event-context-data-type/country]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-remove-user-from-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-remove-user-from-group-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-remove-user-from-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-remove-user-from-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-remove-user-from-group-request/user-pool-id :portkey.aws.cognito-idp.admin-remove-user-from-group-request/username :portkey.aws.cognito-idp.admin-remove-user-from-group-request/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/aws-account-id-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-risk-configuration-type/notify-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/notify-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-risk-configuration-type/actions (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-actions-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/account-takeover-risk-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.account-takeover-risk-configuration-type/actions] :opt-un [:portkey.aws.cognito-idp.account-takeover-risk-configuration-type/notify-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-update-device-status-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-devices-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-devices-request/limit (clojure.spec.alpha/and :portkey.aws.cognito-idp/query-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-devices-request/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/search-pagination-token-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-devices-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-devices-request/access-token] :opt-un [:portkey.aws.cognito-idp.list-devices-request/limit :portkey.aws.cognito-idp.list-devices-request/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-group-request/group-name :portkey.aws.cognito-idp.get-group-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.forgot-password-response/code-delivery-details (clojure.spec.alpha/and :portkey.aws.cognito-idp/code-delivery-details-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/forgot-password-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.forgot-password-response/code-delivery-details]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-action-type/notify (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-action-notify-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-action-type/event-action (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-event-action-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/account-takeover-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.account-takeover-action-type/notify :portkey.aws.cognito-idp.account-takeover-action-type/event-action] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/attribute-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/set-user-mfa-preference-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/user-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/validation-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/temporary-password (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/message-action (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-action-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-create-user-request/desired-delivery-mediums (clojure.spec.alpha/and :portkey.aws.cognito-idp/delivery-medium-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-create-user-request/user-pool-id :portkey.aws.cognito-idp.admin-create-user-request/username] :opt-un [:portkey.aws.cognito-idp.admin-create-user-request/user-attributes :portkey.aws.cognito-idp.admin-create-user-request/validation-data :portkey.aws.cognito-idp.admin-create-user-request/temporary-password :portkey.aws.cognito-idp/force-alias-creation :portkey.aws.cognito-idp.admin-create-user-request/message-action :portkey.aws.cognito-idp.admin-create-user-request/desired-delivery-mediums]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-o-auth-flow-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-o-auth-flow-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-o-auth-flow-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-name #{"Mfa" :mfa "Password" :password})

(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirm-sign-up-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-verification-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 140)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-user-global-sign-out-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-secret-verifier-config-type/password-verifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.device-secret-verifier-config-type/salt (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-secret-verifier-config-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.device-secret-verifier-config-type/password-verifier :portkey.aws.cognito-idp.device-secret-verifier-config-type/salt]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-confirm-sign-up-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-confirm-sign-up-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-confirm-sign-up-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-confirm-sign-up-request/user-pool-id :portkey.aws.cognito-idp.admin-confirm-sign-up-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.associate-software-token-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.associate-software-token-request/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/associate-software-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.associate-software-token-request/access-token :portkey.aws.cognito-idp.associate-software-token-request/session]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-user-pool-client-response/user-pool-client (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-client-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-user-pool-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.update-user-pool-client-response/user-pool-client]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-risk-configuration-response/risk-configuration (clojure.spec.alpha/and :portkey.aws.cognito-idp/risk-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-risk-configuration-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-risk-configuration-response/risk-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-sms-role-trust-relationship-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-sms-role-trust-relationship-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-resource-server-response/resource-server (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-resource-server-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-resource-server-response/resource-server] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-identity-provider-by-identifier-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-identity-provider-by-identifier-request/idp-identifier (clojure.spec.alpha/and :portkey.aws.cognito-idp/idp-identifier-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-identity-provider-by-identifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-identity-provider-by-identifier-request/user-pool-id :portkey.aws.cognito-idp.get-identity-provider-by-identifier-request/idp-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.software-token-mfa-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/software-token-mfa-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.software-token-mfa-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/account-takeover-event-action-type #{"NO_ACTION" :block :no-action "BLOCK" "MFA_REQUIRED" "MFA_IF_CONFIGURED" :mfa-if-configured :mfa-required})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-device-status-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-device-status-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-device-status-request/device-remembered-status (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-remembered-status-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-device-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-device-status-request/access-token :portkey.aws.cognito-idp.update-device-status-request/device-key] :opt-un [:portkey.aws.cognito-idp.update-device-status-request/device-remembered-status]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/scope-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/scope-type :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-verification-subject-by-link-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 140)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-signing-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-signing-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.get-signing-certificate-response/certificate]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-disable-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/user-pool-client-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/user-pool-client-description))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.compromised-credentials-actions-type/event-action (clojure.spec.alpha/and :portkey.aws.cognito-idp/compromised-credentials-event-action-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/compromised-credentials-actions-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.compromised-credentials-actions-type/event-action] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-idp/message-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-actions-type/low-action (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-action-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-actions-type/medium-action (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-action-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.account-takeover-actions-type/high-action (clojure.spec.alpha/and :portkey.aws.cognito-idp/account-takeover-action-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/account-takeover-actions-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.account-takeover-actions-type/low-action :portkey.aws.cognito-idp.account-takeover-actions-type/medium-action :portkey.aws.cognito-idp.account-takeover-actions-type/high-action]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/account-takeover-action-notify-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-import-job-response/user-import-job (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-import-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.describe-user-import-job-response/user-import-job]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/risk-decision-type #{:block "NoRisk" "Block" "AccountTakeover" :account-takeover :no-risk})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-response/user-pool (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-pool-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.create-user-pool-response/user-pool]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-auth-event-feedback-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-auth-event-feedback-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-auth-event-feedback-request/event-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-auth-event-feedback-request/feedback-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-auth-event-feedback-request/feedback-value (clojure.spec.alpha/and :portkey.aws.cognito-idp/feedback-value-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-auth-event-feedback-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-auth-event-feedback-request/user-pool-id :portkey.aws.cognito-idp.update-auth-event-feedback-request/username :portkey.aws.cognito-idp.update-auth-event-feedback-request/event-id :portkey.aws.cognito-idp.update-auth-event-feedback-request/feedback-token :portkey.aws.cognito-idp.update-auth-event-feedback-request/feedback-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/client-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\s+=,.@-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/event-response-type #{:failure "Success" "Failure" :success})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.string-attribute-constraints-type/min-length (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.string-attribute-constraints-type/max-length (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/string-attribute-constraints-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.string-attribute-constraints-type/min-length :portkey.aws.cognito-idp.string-attribute-constraints-type/max-length]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/compromised-credentials-event-action-type #{"NO_ACTION" :block :no-action "BLOCK"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.email-configuration-type/source-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.email-configuration-type/reply-to-email-address (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-address-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-configuration-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.email-configuration-type/source-arn :portkey.aws.cognito-idp.email-configuration-type/reply-to-email-address]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/client-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-response/users (clojure.spec.alpha/and :portkey.aws.cognito-idp/users-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-users-response/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/search-pagination-token-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-users-response/users :portkey.aws.cognito-idp.list-users-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-device-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-device-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-device-request/device-secret-verifier-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-secret-verifier-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-device-request/device-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirm-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.confirm-device-request/access-token :portkey.aws.cognito-idp.confirm-device-request/device-key] :opt-un [:portkey.aws.cognito-idp.confirm-device-request/device-secret-verifier-config :portkey.aws.cognito-idp.confirm-device-request/device-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/idp-identifier-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 40)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\s+=.@-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-import-job-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-import-job-request/job-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-import-job-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-import-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.describe-user-import-job-request/user-pool-id :portkey.aws.cognito-idp.describe-user-import-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-signing-certificate-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-signing-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-signing-certificate-request/user-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-resource-server-response/resource-server (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-resource-server-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-resource-server-response/resource-server] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/custom-attribute-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/mfa-option-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/mfa-option-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-domain-request/domain (clojure.spec.alpha/and :portkey.aws.cognito-idp/domain-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-domain-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-user-pool-domain-request/custom-domain-config (clojure.spec.alpha/and :portkey.aws.cognito-idp/custom-domain-config-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-user-pool-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-user-pool-domain-request/domain :portkey.aws.cognito-idp.create-user-pool-domain-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.create-user-pool-domain-request/custom-domain-config]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-pool-client-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.delete-user-pool-client-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/delete-user-pool-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.delete-user-pool-client-request/user-pool-id :portkey.aws.cognito-idp.delete-user-pool-client-request/client-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/pre-signed-url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-request/challenge-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-request/session (clojure.spec.alpha/and :portkey.aws.cognito-idp/session-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-request/challenge-responses (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-responses-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.respond-to-auth-challenge-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/respond-to-auth-challenge-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.respond-to-auth-challenge-request/client-id :portkey.aws.cognito-idp.respond-to-auth-challenge-request/challenge-name] :opt-un [:portkey.aws.cognito-idp.respond-to-auth-challenge-request/session :portkey.aws.cognito-idp.respond-to-auth-challenge-request/challenge-responses :portkey.aws.cognito-idp.respond-to-auth-challenge-request/analytics-metadata :portkey.aws.cognito-idp.respond-to-auth-challenge-request/user-context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-delete-user-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.global-sign-out-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/global-sign-out-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.global-sign-out-request/access-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-user-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-get-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-get-user-request/user-pool-id :portkey.aws.cognito-idp.admin-get-user-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-disable-user-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-disable-user-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-disable-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-disable-user-request/user-pool-id :portkey.aws.cognito-idp.admin-disable-user-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/session-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.create-resource-server-response/resource-server (clojure.spec.alpha/and :portkey.aws.cognito-idp/resource-server-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/create-resource-server-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.create-resource-server-response/resource-server] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/callback-ur-ls-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/redirect-url-type :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/message-action-type #{:suppress "RESEND" :resend "SUPPRESS"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.forget-device-request/access-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/token-model-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.forget-device-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/forget-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.forget-device-request/device-key] :opt-un [:portkey.aws.cognito-idp.forget-device-request/access-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/challenge-name-type #{"MFA_SETUP" :sms-mfa "SOFTWARE_TOKEN_MFA" :password-verifier :device-password-verifier "ADMIN_NO_SRP_AUTH" :select-mfa-type "DEVICE_SRP_AUTH" :new-password-required "SELECT_MFA_TYPE" :admin-no-srp-auth :mfa-setup :software-token-mfa "DEVICE_PASSWORD_VERIFIER" "CUSTOM_CHALLENGE" "PASSWORD_VERIFIER" :device-srp-auth :custom-challenge "NEW_PASSWORD_REQUIRED" "SMS_MFA"})

(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-group-request/group-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/group-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-group-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-group-request/description (clojure.spec.alpha/and :portkey.aws.cognito-idp/description-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-group-request/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.update-group-request/precedence (clojure.spec.alpha/and :portkey.aws.cognito-idp/precedence-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/update-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.update-group-request/group-name :portkey.aws.cognito-idp.update-group-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.update-group-request/description :portkey.aws.cognito-idp.update-group-request/role-arn :portkey.aws.cognito-idp.update-group-request/precedence]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-reset-user-password-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-reset-user-password-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-reset-user-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-reset-user-password-request/user-pool-id :portkey.aws.cognito-idp.admin-reset-user-password-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/event-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-idp/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/event-response (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-response-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/event-risk (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-risk-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/challenge-responses (clojure.spec.alpha/and :portkey.aws.cognito-idp/challenge-response-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/event-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.auth-event-type/event-feedback (clojure.spec.alpha/and :portkey.aws.cognito-idp/event-feedback-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/auth-event-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.auth-event-type/event-id :portkey.aws.cognito-idp/event-type :portkey.aws.cognito-idp.auth-event-type/creation-date :portkey.aws.cognito-idp.auth-event-type/event-response :portkey.aws.cognito-idp.auth-event-type/event-risk :portkey.aws.cognito-idp.auth-event-type/challenge-responses :portkey.aws.cognito-idp.auth-event-type/event-context-data :portkey.aws.cognito-idp.auth-event-type/event-feedback]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.add-custom-attributes-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.add-custom-attributes-request/custom-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/custom-attributes-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/add-custom-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.add-custom-attributes-request/user-pool-id :portkey.aws.cognito-idp.add-custom-attributes-request/custom-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-resource-servers-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-resource-servers-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-resource-servers-limit-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-resource-servers-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/pagination-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-resource-servers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.list-resource-servers-request/user-pool-id] :opt-un [:portkey.aws.cognito-idp.list-resource-servers-request/max-results :portkey.aws.cognito-idp.list-resource-servers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-device-request/device-key (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-key-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-device-request/user-pool-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-get-device-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-get-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.admin-get-device-request/device-key :portkey.aws.cognito-idp.admin-get-device-request/user-pool-id :portkey.aws.cognito-idp.admin-get-device-request/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-devices-response/devices (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.list-devices-response/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/search-pagination-token-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/list-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.list-devices-response/devices :portkey.aws.cognito-idp.list-devices-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/email-notification-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 140)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/secret-hash (clojure.spec.alpha/and :portkey.aws.cognito-idp/secret-hash-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/confirmation-code (clojure.spec.alpha/and :portkey.aws.cognito-idp/confirmation-code-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/password (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.confirm-forgot-password-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/confirm-forgot-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.confirm-forgot-password-request/client-id :portkey.aws.cognito-idp.confirm-forgot-password-request/username :portkey.aws.cognito-idp.confirm-forgot-password-request/confirmation-code :portkey.aws.cognito-idp.confirm-forgot-password-request/password] :opt-un [:portkey.aws.cognito-idp.confirm-forgot-password-request/secret-hash :portkey.aws.cognito-idp.confirm-forgot-password-request/analytics-metadata :portkey.aws.cognito-idp.confirm-forgot-password-request/user-context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-email-type/subject (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-notification-subject-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-email-type/html-body (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-notification-body-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-email-type/text-body (clojure.spec.alpha/and :portkey.aws.cognito-idp/email-notification-body-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/notify-email-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.notify-email-type/subject] :opt-un [:portkey.aws.cognito-idp.notify-email-type/html-body :portkey.aws.cognito-idp.notify-email-type/text-body]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/device-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 55)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w-]+_[0-9a-f-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-response/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-response/user-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-response/mfa-options (clojure.spec.alpha/and :portkey.aws.cognito-idp/mfa-option-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-response/preferred-mfa-setting (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.get-user-response/user-mfa-setting-list (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-mfa-setting-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/get-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.get-user-response/username :portkey.aws.cognito-idp.get-user-response/user-attributes] :opt-un [:portkey.aws.cognito-idp.get-user-response/mfa-options :portkey.aws.cognito-idp.get-user-response/preferred-mfa-setting :portkey.aws.cognito-idp.get-user-response/user-mfa-setting-list]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-update-auth-event-feedback-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.mfa-option-type/delivery-medium (clojure.spec.alpha/and :portkey.aws.cognito-idp/delivery-medium-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.mfa-option-type/attribute-name (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-name-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/mfa-option-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.mfa-option-type/delivery-medium :portkey.aws.cognito-idp.mfa-option-type/attribute-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-devices-response/devices (clojure.spec.alpha/and :portkey.aws.cognito-idp/device-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.admin-list-devices-response/pagination-token (clojure.spec.alpha/and :portkey.aws.cognito-idp/search-pagination-token-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/admin-list-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.admin-list-devices-response/devices :portkey.aws.cognito-idp.admin-list-devices-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/client-id (clojure.spec.alpha/and :portkey.aws.cognito-idp/client-id-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/secret-hash (clojure.spec.alpha/and :portkey.aws.cognito-idp/secret-hash-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/username (clojure.spec.alpha/and :portkey.aws.cognito-idp/username-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/password (clojure.spec.alpha/and :portkey.aws.cognito-idp/password-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/user-attributes (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/validation-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/attribute-list-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/analytics-metadata (clojure.spec.alpha/and :portkey.aws.cognito-idp/analytics-metadata-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.sign-up-request/user-context-data (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-context-data-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/sign-up-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.sign-up-request/client-id :portkey.aws.cognito-idp.sign-up-request/username :portkey.aws.cognito-idp.sign-up-request/password] :opt-un [:portkey.aws.cognito-idp.sign-up-request/secret-hash :portkey.aws.cognito-idp.sign-up-request/user-attributes :portkey.aws.cognito-idp.sign-up-request/validation-data :portkey.aws.cognito-idp.sign-up-request/analytics-metadata :portkey.aws.cognito-idp.sign-up-request/user-context-data]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp.describe-user-pool-response/user-pool (clojure.spec.alpha/and :portkey.aws.cognito-idp/user-pool-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/describe-user-pool-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-idp.describe-user-pool-response/user-pool]))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/group-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/group-type))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/providers-list-type (clojure.spec.alpha/coll-of :portkey.aws.cognito-idp/provider-description :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cognito-idp/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-configuration-type/from (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-configuration-type/reply-to (clojure.spec.alpha/and :portkey.aws.cognito-idp/string-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-configuration-type/source-arn (clojure.spec.alpha/and :portkey.aws.cognito-idp/arn-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-configuration-type/block-email (clojure.spec.alpha/and :portkey.aws.cognito-idp/notify-email-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-configuration-type/no-action-email (clojure.spec.alpha/and :portkey.aws.cognito-idp/notify-email-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp.notify-configuration-type/mfa-email (clojure.spec.alpha/and :portkey.aws.cognito-idp/notify-email-type))
(clojure.spec.alpha/def :portkey.aws.cognito-idp/notify-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-idp.notify-configuration-type/source-arn] :opt-un [:portkey.aws.cognito-idp.notify-configuration-type/from :portkey.aws.cognito-idp.notify-configuration-type/reply-to :portkey.aws.cognito-idp.notify-configuration-type/block-email :portkey.aws.cognito-idp.notify-configuration-type/no-action-email :portkey.aws.cognito-idp.notify-configuration-type/mfa-email]))

(clojure.core/defn admin-remove-user-from-group "Removes the specified user from the specified group.\n Requires developer credentials." ([admin-remove-user-from-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-remove-user-from-group-request admin-remove-user-from-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-remove-user-from-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminRemoveUserFromGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-remove-user-from-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-remove-user-from-group-request) :ret clojure.core/true?)

(clojure.core/defn update-device-status "Updates the device status." ([update-device-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-device-status-request update-device-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-device-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-device-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDeviceStatus", :http.request.configuration/output-deser-fn response-update-device-status-response, :http.request.spec/error-spec {"InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-device-status :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-device-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-device-status-response))

(clojure.core/defn describe-risk-configuration "Describes the risk configuration." ([describe-risk-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-risk-configuration-request describe-risk-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-risk-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-risk-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRiskConfiguration", :http.request.configuration/output-deser-fn response-describe-risk-configuration-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserPoolAddOnNotEnabledException" :portkey.aws.cognito-idp/user-pool-add-on-not-enabled-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-risk-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-risk-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-risk-configuration-response))

(clojure.core/defn create-user-import-job "Creates the user import job." ([create-user-import-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-import-job-request create-user-import-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-user-import-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-user-import-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserImportJob", :http.request.configuration/output-deser-fn response-create-user-import-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "PreconditionNotMetException" :portkey.aws.cognito-idp/precondition-not-met-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef create-user-import-job :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-user-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-user-import-job-response))

(clojure.core/defn update-user-pool-client "Updates the specified user pool app client with the specified attributes. If you\ndon't provide a value for an attribute, it will be set to the default value. You\ncan get a list of the current user pool app client settings with ." ([update-user-pool-client-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-pool-client-request update-user-pool-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-user-pool-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-user-pool-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserPoolClient", :http.request.configuration/output-deser-fn response-update-user-pool-client-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ConcurrentModificationException" :portkey.aws.cognito-idp/concurrent-modification-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "ScopeDoesNotExistException" :portkey.aws.cognito-idp/scope-does-not-exist-exception, "InvalidOAuthFlowException" :portkey.aws.cognito-idp/invalid-o-auth-flow-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef update-user-pool-client :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-user-pool-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-user-pool-client-response))

(clojure.core/defn describe-identity-provider "Gets information about a specific identity provider." ([describe-identity-provider-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-identity-provider-request describe-identity-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-identity-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-identity-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentityProvider", :http.request.configuration/output-deser-fn response-describe-identity-provider-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-identity-provider :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-identity-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-identity-provider-response))

(clojure.core/defn delete-group "Deletes a group. Currently only groups with no members can be deleted.\n Requires developer credentials." ([delete-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-group-request delete-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-group-request) :ret clojure.core/true?)

(clojure.core/defn get-device "Gets the device." ([get-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-device-request get-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDevice", :http.request.configuration/output-deser-fn response-get-device-response, :http.request.spec/error-spec {"InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-device-response))

(clojure.core/defn admin-enable-user "Enables the specified user as an administrator. Works on any user.\n Requires developer credentials." ([admin-enable-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-enable-user-request admin-enable-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-enable-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-enable-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminEnableUser", :http.request.configuration/output-deser-fn response-admin-enable-user-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-enable-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-enable-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-enable-user-response))

(clojure.core/defn set-user-mfa-preference "Set the user's multi-factor authentication (MFA) method preference." ([set-user-mfa-preference-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-user-mfa-preference-request set-user-mfa-preference-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/set-user-mfa-preference-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/set-user-mfa-preference-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetUserMFAPreference", :http.request.configuration/output-deser-fn response-set-user-mfa-preference-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef set-user-mfa-preference :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/set-user-mfa-preference-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/set-user-mfa-preference-response))

(clojure.core/defn admin-add-user-to-group "Adds the specified user to the specified group.\n Requires developer credentials." ([admin-add-user-to-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-add-user-to-group-request admin-add-user-to-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-add-user-to-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminAddUserToGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-add-user-to-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-add-user-to-group-request) :ret clojure.core/true?)

(clojure.core/defn list-user-pools "Lists the user pools associated with an AWS account." ([list-user-pools-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-user-pools-request list-user-pools-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-user-pools-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-user-pools-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUserPools", :http.request.configuration/output-deser-fn response-list-user-pools-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-user-pools :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-user-pools-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-user-pools-response))

(clojure.core/defn confirm-forgot-password "Allows a user to enter a confirmation code to reset a forgotten password." ([confirm-forgot-password-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-forgot-password-request confirm-forgot-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/confirm-forgot-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/confirm-forgot-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmForgotPassword", :http.request.configuration/output-deser-fn response-confirm-forgot-password-response, :http.request.spec/error-spec {"ExpiredCodeException" :portkey.aws.cognito-idp/expired-code-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "TooManyFailedAttemptsException" :portkey.aws.cognito-idp/too-many-failed-attempts-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef confirm-forgot-password :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/confirm-forgot-password-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/confirm-forgot-password-response))

(clojure.core/defn set-ui-customization "Sets the UI customization information for a user pool's built-in app UI.\n You can specify app UI customization settings for a single client (with a\nspecific clientId) or for all clients (by setting the clientId to ALL). If you\nspecify ALL, the default configuration will be used for every client that has no\nUI customization set previously. If you specify UI customization settings for a\nparticular client, it will no longer fall back to the ALL configuration.\n To use this API, your user pool must have a domain associated with it.\nOtherwise, there is no place to host the app's pages, and the service will throw\nan error." ([set-ui-customization-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-ui-customization-request set-ui-customization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/set-ui-customization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/set-ui-customization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetUICustomization", :http.request.configuration/output-deser-fn response-set-ui-customization-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef set-ui-customization :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/set-ui-customization-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/set-ui-customization-response))

(clojure.core/defn admin-get-device "Gets the device, as an administrator.\n Requires developer credentials." ([admin-get-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-get-device-request admin-get-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-get-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-get-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminGetDevice", :http.request.configuration/output-deser-fn response-admin-get-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception}})))))
(clojure.spec.alpha/fdef admin-get-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-get-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-get-device-response))

(clojure.core/defn list-groups "Lists the groups associated with a user pool.\n Requires developer credentials." ([list-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-groups-request list-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGroups", :http.request.configuration/output-deser-fn response-list-groups-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-groups-response))

(clojure.core/defn set-risk-configuration "Configures actions on detected risks. To delete the risk configuration for\nUserPoolId or ClientId, pass null values for all four configuration types.\n To enable Amazon Cognito advanced security features, update the user pool to\ninclude the UserPoolAddOns keyAdvancedSecurityMode.\n See ." ([set-risk-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-risk-configuration-request set-risk-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/set-risk-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/set-risk-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetRiskConfiguration", :http.request.configuration/output-deser-fn response-set-risk-configuration-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserPoolAddOnNotEnabledException" :portkey.aws.cognito-idp/user-pool-add-on-not-enabled-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef set-risk-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/set-risk-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/set-risk-configuration-response))

(clojure.core/defn admin-disable-provider-for-user "Disables the user from signing in with the specified external (SAML or social)\nidentity provider. If the user to disable is a Cognito User Pools native\nusername + password user, they are not permitted to use their password to\nsign-in. If the user to disable is a linked external IdP user, any link between\nthat user and an existing user is removed. The next time the external user (no\nlonger attached to the previously linked DestinationUser) signs in, they must\ncreate a new user account. See .\n This action is enabled only for admin access and requires developer\ncredentials.\n The ProviderName must match the value specified when creating an IdP for the\npool.\n To disable a native username + password user, the ProviderName value must be\nCognito and the ProviderAttributeName must be Cognito_Subject, with the\nProviderAttributeValue being the name that is used in the user pool for the\nuser.\n The ProviderAttributeName must always be Cognito_Subject for social identity\nproviders. The ProviderAttributeValue must always be the exact subject that was\nused when the user was originally linked as a source user.\n For de-linking a SAML identity, there are two scenarios. If the linked identity\nhas not yet been used to sign-in, the ProviderAttributeName and\nProviderAttributeValue must be the same values that were used for the SourceUser\nwhen the identities were originally linked in the call. (If the linking was done\nwith ProviderAttributeName set to Cognito_Subject, the same applies here).\nHowever, if the user has already signed in, the ProviderAttributeName must be\nCognito_Subject and ProviderAttributeValue must be the subject of the SAML\nassertion." ([admin-disable-provider-for-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-disable-provider-for-user-request admin-disable-provider-for-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-disable-provider-for-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-disable-provider-for-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminDisableProviderForUser", :http.request.configuration/output-deser-fn response-admin-disable-provider-for-user-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-disable-provider-for-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-disable-provider-for-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-disable-provider-for-user-response))

(clojure.core/defn get-user-pool-mfa-config "Gets the user pool multi-factor authentication (MFA) configuration." ([get-user-pool-mfa-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-user-pool-mfa-config-request get-user-pool-mfa-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-user-pool-mfa-config-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-user-pool-mfa-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUserPoolMfaConfig", :http.request.configuration/output-deser-fn response-get-user-pool-mfa-config-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-user-pool-mfa-config :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-user-pool-mfa-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-user-pool-mfa-config-response))

(clojure.core/defn set-user-pool-mfa-config "Set the user pool MFA configuration." ([set-user-pool-mfa-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-user-pool-mfa-config-request set-user-pool-mfa-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/set-user-pool-mfa-config-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/set-user-pool-mfa-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetUserPoolMfaConfig", :http.request.configuration/output-deser-fn response-set-user-pool-mfa-config-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef set-user-pool-mfa-config :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/set-user-pool-mfa-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/set-user-pool-mfa-config-response))

(clojure.core/defn admin-delete-user-attributes "Deletes the user attributes in a user pool as an administrator. Works on any\nuser.\n Requires developer credentials." ([admin-delete-user-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-delete-user-attributes-request admin-delete-user-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-delete-user-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-delete-user-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminDeleteUserAttributes", :http.request.configuration/output-deser-fn response-admin-delete-user-attributes-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-delete-user-attributes :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-delete-user-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-delete-user-attributes-response))

(clojure.core/defn admin-forget-device "Forgets the device, as an administrator.\n Requires developer credentials." ([admin-forget-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-forget-device-request admin-forget-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-forget-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminForgetDevice", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-forget-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-forget-device-request) :ret clojure.core/true?)

(clojure.core/defn forget-device "Forgets the specified device." ([forget-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-forget-device-request forget-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/forget-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ForgetDevice", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef forget-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/forget-device-request) :ret clojure.core/true?)

(clojure.core/defn associate-software-token "Returns a unique generated shared secret key code for the user account. The\nrequest takes an access token or a session string, but not both." ([] (associate-software-token {})) ([associate-software-token-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-software-token-request associate-software-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/associate-software-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/associate-software-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateSoftwareToken", :http.request.configuration/output-deser-fn response-associate-software-token-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "SoftwareTokenMFANotFoundException" :portkey.aws.cognito-idp/software-token-mfa-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-software-token :args (clojure.spec.alpha/? :portkey.aws.cognito-idp/associate-software-token-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/associate-software-token-response))

(clojure.core/defn list-user-pool-clients "Lists the clients that have been created for the specified user pool." ([list-user-pool-clients-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-user-pool-clients-request list-user-pool-clients-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-user-pool-clients-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-user-pool-clients-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUserPoolClients", :http.request.configuration/output-deser-fn response-list-user-pool-clients-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-user-pool-clients :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-user-pool-clients-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-user-pool-clients-response))

(clojure.core/defn admin-update-device-status "Updates the device status as an administrator.\n Requires developer credentials." ([admin-update-device-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-update-device-status-request admin-update-device-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-update-device-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-update-device-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminUpdateDeviceStatus", :http.request.configuration/output-deser-fn response-admin-update-device-status-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-update-device-status :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-update-device-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-update-device-status-response))

(clojure.core/defn forgot-password "Calling this API causes a message to be sent to the end user with a confirmation\ncode that is required to change the user's password. For the Username parameter,\nyou can use the username or user alias. If a verified phone number exists for\nthe user, the confirmation code is sent to the phone number. Otherwise, if a\nverified email exists, the confirmation code is sent to the email. If neither a\nverified phone number nor a verified email exists, InvalidParameterException is\nthrown. To use the confirmation code for resetting the password, call ." ([forgot-password-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-forgot-password-request forgot-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/forgot-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/forgot-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ForgotPassword", :http.request.configuration/output-deser-fn response-forgot-password-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef forgot-password :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/forgot-password-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/forgot-password-response))

(clojure.core/defn start-user-import-job "Starts the user import." ([start-user-import-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-user-import-job-request start-user-import-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/start-user-import-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/start-user-import-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartUserImportJob", :http.request.configuration/output-deser-fn response-start-user-import-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "PreconditionNotMetException" :portkey.aws.cognito-idp/precondition-not-met-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception}})))))
(clojure.spec.alpha/fdef start-user-import-job :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/start-user-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/start-user-import-job-response))

(clojure.core/defn sign-up "Registers the user in the specified user pool and creates a user name, password,\nand user attributes." ([sign-up-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-sign-up-request sign-up-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/sign-up-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/sign-up-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SignUp", :http.request.configuration/output-deser-fn response-sign-up-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "UsernameExistsException" :portkey.aws.cognito-idp/username-exists-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef sign-up :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/sign-up-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/sign-up-response))

(clojure.core/defn stop-user-import-job "Stops the user import job." ([stop-user-import-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-user-import-job-request stop-user-import-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/stop-user-import-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/stop-user-import-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopUserImportJob", :http.request.configuration/output-deser-fn response-stop-user-import-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "PreconditionNotMetException" :portkey.aws.cognito-idp/precondition-not-met-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception}})))))
(clojure.spec.alpha/fdef stop-user-import-job :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/stop-user-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/stop-user-import-job-response))

(clojure.core/defn delete-user-attributes "Deletes the attributes for a user." ([delete-user-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-attributes-request delete-user-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/delete-user-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-user-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserAttributes", :http.request.configuration/output-deser-fn response-delete-user-attributes-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-user-attributes :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-user-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/delete-user-attributes-response))

(clojure.core/defn resend-confirmation-code "Resends the confirmation (for confirmation of registration) to a specific user\nin the user pool." ([resend-confirmation-code-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-resend-confirmation-code-request resend-confirmation-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/resend-confirmation-code-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/resend-confirmation-code-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResendConfirmationCode", :http.request.configuration/output-deser-fn response-resend-confirmation-code-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef resend-confirmation-code :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/resend-confirmation-code-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/resend-confirmation-code-response))

(clojure.core/defn update-user-pool "Updates the specified user pool with the specified attributes. If you don't\nprovide a value for an attribute, it will be set to the default value. You can\nget a list of the current user pool settings with ." ([update-user-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-pool-request update-user-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-user-pool-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-user-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserPool", :http.request.configuration/output-deser-fn response-update-user-pool-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserPoolTaggingException" :portkey.aws.cognito-idp/user-pool-tagging-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserImportInProgressException" :portkey.aws.cognito-idp/user-import-in-progress-exception, "ConcurrentModificationException" :portkey.aws.cognito-idp/concurrent-modification-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-user-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-user-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-user-pool-response))

(clojure.core/defn admin-reset-user-password "Resets the specified user's password in a user pool as an administrator. Works\non any user.\n When a developer calls this API, the current password is invalidated, so it\nmust be changed. If a user tries to sign in after the API is called, the app\nwill get a PasswordResetRequiredException exception back and should direct the\nuser down the flow to reset the password, which is the same as the forgot\npassword flow. In addition, if the user pool has phone verification selected and\na verified phone number exists for the user, or if email verification is\nselected and a verified email exists for the user, calling this API will also\nresult in sending a message to the end user with the code to change their\npassword.\n Requires developer credentials." ([admin-reset-user-password-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-reset-user-password-request admin-reset-user-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-reset-user-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-reset-user-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminResetUserPassword", :http.request.configuration/output-deser-fn response-admin-reset-user-password-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef admin-reset-user-password :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-reset-user-password-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-reset-user-password-response))

(clojure.core/defn update-identity-provider "Updates identity provider information for a user pool." ([update-identity-provider-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-identity-provider-request update-identity-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-identity-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-identity-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateIdentityProvider", :http.request.configuration/output-deser-fn response-update-identity-provider-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "UnsupportedIdentityProviderException" :portkey.aws.cognito-idp/unsupported-identity-provider-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef update-identity-provider :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-identity-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-identity-provider-response))

(clojure.core/defn list-users-in-group "Lists the users in the specified group.\n Requires developer credentials." ([list-users-in-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-users-in-group-request list-users-in-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-users-in-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-users-in-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsersInGroup", :http.request.configuration/output-deser-fn response-list-users-in-group-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-users-in-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-users-in-group-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-users-in-group-response))

(clojure.core/defn update-user-attributes "Allows a user to update a specific attribute (one at a time)." ([update-user-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-attributes-request update-user-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-user-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-user-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserAttributes", :http.request.configuration/output-deser-fn response-update-user-attributes-response, :http.request.spec/error-spec {"ExpiredCodeException" :portkey.aws.cognito-idp/expired-code-exception, "InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-user-attributes :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-user-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-user-attributes-response))

(clojure.core/defn respond-to-auth-challenge "Responds to the authentication challenge." ([respond-to-auth-challenge-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-respond-to-auth-challenge-request respond-to-auth-challenge-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/respond-to-auth-challenge-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/respond-to-auth-challenge-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RespondToAuthChallenge", :http.request.configuration/output-deser-fn response-respond-to-auth-challenge-response, :http.request.spec/error-spec {"ExpiredCodeException" :portkey.aws.cognito-idp/expired-code-exception, "InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "MFAMethodNotFoundException" :portkey.aws.cognito-idp/mfa-method-not-found-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "SoftwareTokenMFANotFoundException" :portkey.aws.cognito-idp/software-token-mfa-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef respond-to-auth-challenge :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/respond-to-auth-challenge-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/respond-to-auth-challenge-response))

(clojure.core/defn global-sign-out "Signs out users from all devices." ([global-sign-out-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-global-sign-out-request global-sign-out-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/global-sign-out-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/global-sign-out-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GlobalSignOut", :http.request.configuration/output-deser-fn response-global-sign-out-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef global-sign-out :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/global-sign-out-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/global-sign-out-response))

(clojure.core/defn admin-set-user-mfa-preference "Sets the user's multi-factor authentication (MFA) preference." ([admin-set-user-mfa-preference-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-set-user-mfa-preference-request admin-set-user-mfa-preference-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-set-user-mfa-preference-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-set-user-mfa-preference-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminSetUserMFAPreference", :http.request.configuration/output-deser-fn response-admin-set-user-mfa-preference-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-set-user-mfa-preference :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-set-user-mfa-preference-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-set-user-mfa-preference-response))

(clojure.core/defn get-group "Gets a group.\n Requires developer credentials." ([get-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-group-request get-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGroup", :http.request.configuration/output-deser-fn response-get-group-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-group-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-group-response))

(clojure.core/defn update-group "Updates the specified group with the specified attributes.\n Requires developer credentials." ([update-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-group-request update-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGroup", :http.request.configuration/output-deser-fn response-update-group-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-group-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-group-response))

(clojure.core/defn delete-user "Allows a user to delete himself or herself." ([delete-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn admin-user-global-sign-out "Signs out users from all devices, as an administrator.\n Requires developer credentials." ([admin-user-global-sign-out-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-user-global-sign-out-request admin-user-global-sign-out-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-user-global-sign-out-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-user-global-sign-out-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminUserGlobalSignOut", :http.request.configuration/output-deser-fn response-admin-user-global-sign-out-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-user-global-sign-out :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-user-global-sign-out-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-user-global-sign-out-response))

(clojure.core/defn list-user-import-jobs "Lists the user import jobs." ([list-user-import-jobs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-user-import-jobs-request list-user-import-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-user-import-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-user-import-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUserImportJobs", :http.request.configuration/output-deser-fn response-list-user-import-jobs-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-user-import-jobs :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-user-import-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-user-import-jobs-response))

(clojure.core/defn create-user-pool "Creates a new Amazon Cognito user pool and sets the password policy for the\npool." ([create-user-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-pool-request create-user-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-user-pool-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-user-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserPool", :http.request.configuration/output-deser-fn response-create-user-pool-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserPoolTaggingException" :portkey.aws.cognito-idp/user-pool-tagging-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-user-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-user-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-user-pool-response))

(clojure.core/defn admin-update-user-attributes "Updates the specified user's attributes, including developer attributes, as an\nadministrator. Works on any user.\n For custom attributes, you must prepend the custom: prefix to the attribute\nname.\n In addition to updating user attributes, this API can also be used to mark\nphone and email as verified.\n Requires developer credentials." ([admin-update-user-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-update-user-attributes-request admin-update-user-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-update-user-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-update-user-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminUpdateUserAttributes", :http.request.configuration/output-deser-fn response-admin-update-user-attributes-response, :http.request.spec/error-spec {"InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef admin-update-user-attributes :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-update-user-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-update-user-attributes-response))

(clojure.core/defn describe-user-pool-domain "Gets information about a domain." ([describe-user-pool-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-pool-domain-request describe-user-pool-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-user-pool-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-user-pool-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserPoolDomain", :http.request.configuration/output-deser-fn response-describe-user-pool-domain-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-user-pool-domain :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-user-pool-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-user-pool-domain-response))

(clojure.core/defn verify-software-token "Use this API to register a user's entered TOTP code and mark the user's software\ntoken MFA status as \"verified\" if successful. The request takes an access token\nor a session string, but not both." ([verify-software-token-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-software-token-request verify-software-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/verify-software-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/verify-software-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "VerifySoftwareToken", :http.request.configuration/output-deser-fn response-verify-software-token-response, :http.request.spec/error-spec {"EnableSoftwareTokenMFAException" :portkey.aws.cognito-idp/enable-software-token-mfa-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "SoftwareTokenMFANotFoundException" :portkey.aws.cognito-idp/software-token-mfa-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef verify-software-token :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/verify-software-token-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/verify-software-token-response))

(clojure.core/defn add-custom-attributes "Adds additional user attributes to the user pool schema." ([add-custom-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-custom-attributes-request add-custom-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/add-custom-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/add-custom-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddCustomAttributes", :http.request.configuration/output-deser-fn response-add-custom-attributes-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserImportInProgressException" :portkey.aws.cognito-idp/user-import-in-progress-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef add-custom-attributes :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/add-custom-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/add-custom-attributes-response))

(clojure.core/defn create-identity-provider "Creates an identity provider for a user pool." ([create-identity-provider-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-identity-provider-request create-identity-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-identity-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-identity-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIdentityProvider", :http.request.configuration/output-deser-fn response-create-identity-provider-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "DuplicateProviderException" :portkey.aws.cognito-idp/duplicate-provider-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef create-identity-provider :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-identity-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-identity-provider-response))

(clojure.core/defn create-user-pool-domain "Creates a new domain for a user pool." ([create-user-pool-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-pool-domain-request create-user-pool-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-user-pool-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-user-pool-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserPoolDomain", :http.request.configuration/output-deser-fn response-create-user-pool-domain-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef create-user-pool-domain :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-user-pool-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-user-pool-domain-response))

(clojure.core/defn confirm-device "Confirms tracking of the device. This API call is the call that begins device\ntracking." ([confirm-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-device-request confirm-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/confirm-device-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/confirm-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmDevice", :http.request.configuration/output-deser-fn response-confirm-device-response, :http.request.spec/error-spec {"InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "UsernameExistsException" :portkey.aws.cognito-idp/username-exists-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef confirm-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/confirm-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/confirm-device-response))

(clojure.core/defn admin-update-auth-event-feedback "Provides feedback for an authentication event as to whether it was from a valid\nuser. This feedback is used for improving the risk evaluation decision for the\nuser pool as part of Amazon Cognito advanced security." ([admin-update-auth-event-feedback-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-update-auth-event-feedback-request admin-update-auth-event-feedback-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-update-auth-event-feedback-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-update-auth-event-feedback-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminUpdateAuthEventFeedback", :http.request.configuration/output-deser-fn response-admin-update-auth-event-feedback-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserPoolAddOnNotEnabledException" :portkey.aws.cognito-idp/user-pool-add-on-not-enabled-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-update-auth-event-feedback :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-update-auth-event-feedback-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-update-auth-event-feedback-response))

(clojure.core/defn create-resource-server "Creates a new OAuth2.0 resource server and defines custom scopes in it." ([create-resource-server-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-resource-server-request create-resource-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-resource-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-resource-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResourceServer", :http.request.configuration/output-deser-fn response-create-resource-server-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef create-resource-server :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-resource-server-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-resource-server-response))

(clojure.core/defn describe-user-import-job "Describes the user import job." ([describe-user-import-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-import-job-request describe-user-import-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-user-import-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-user-import-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserImportJob", :http.request.configuration/output-deser-fn response-describe-user-import-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-user-import-job :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-user-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-user-import-job-response))

(clojure.core/defn list-devices "Lists the devices." ([list-devices-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-devices-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn response-list-devices-response, :http.request.spec/error-spec {"InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-devices-response))

(clojure.core/defn delete-user-pool-domain "Deletes a domain for a user pool." ([delete-user-pool-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-pool-domain-request delete-user-pool-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/delete-user-pool-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-user-pool-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserPoolDomain", :http.request.configuration/output-deser-fn response-delete-user-pool-domain-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-user-pool-domain :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-user-pool-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/delete-user-pool-domain-response))

(clojure.core/defn admin-set-user-settings "Sets all the user settings for a specified user name. Works on any user.\n Requires developer credentials." ([admin-set-user-settings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-set-user-settings-request admin-set-user-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-set-user-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-set-user-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminSetUserSettings", :http.request.configuration/output-deser-fn response-admin-set-user-settings-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-set-user-settings :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-set-user-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-set-user-settings-response))

(clojure.core/defn delete-user-pool-client "Allows the developer to delete the user pool client." ([delete-user-pool-client-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-pool-client-request delete-user-pool-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-user-pool-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserPoolClient", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-user-pool-client :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-user-pool-client-request) :ret clojure.core/true?)

(clojure.core/defn delete-user-pool "Deletes the specified Amazon Cognito user pool." ([delete-user-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-pool-request delete-user-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-user-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserPool", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserImportInProgressException" :portkey.aws.cognito-idp/user-import-in-progress-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-user-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-user-pool-request) :ret clojure.core/true?)

(clojure.core/defn describe-user-pool "Returns the configuration information and metadata of the specified user pool." ([describe-user-pool-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-pool-request describe-user-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-user-pool-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-user-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserPool", :http.request.configuration/output-deser-fn response-describe-user-pool-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserPoolTaggingException" :portkey.aws.cognito-idp/user-pool-tagging-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-user-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-user-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-user-pool-response))

(clojure.core/defn get-ui-customization "Gets the UI Customization information for a particular app client's app UI, if\nthere is something set. If nothing is set for the particular client, but there\nis an existing pool level customization (app clientId will be ALL), then that is\nreturned. If nothing is present, then an empty shape is returned." ([get-ui-customization-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-ui-customization-request get-ui-customization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-ui-customization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-ui-customization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUICustomization", :http.request.configuration/output-deser-fn response-get-ui-customization-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-ui-customization :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-ui-customization-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-ui-customization-response))

(clojure.core/defn change-password "Changes the password for a specified user in a user pool." ([change-password-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-change-password-request change-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/change-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/change-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ChangePassword", :http.request.configuration/output-deser-fn response-change-password-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef change-password :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/change-password-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/change-password-response))

(clojure.core/defn admin-get-user "Gets the specified user by user name in a user pool as an administrator. Works\non any user.\n Requires developer credentials." ([admin-get-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-get-user-request admin-get-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-get-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-get-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminGetUser", :http.request.configuration/output-deser-fn response-admin-get-user-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-get-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-get-user-response))

(clojure.core/defn get-user-attribute-verification-code "Gets the user attribute verification code for the specified attribute name." ([get-user-attribute-verification-code-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-user-attribute-verification-code-request get-user-attribute-verification-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-user-attribute-verification-code-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-user-attribute-verification-code-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUserAttributeVerificationCode", :http.request.configuration/output-deser-fn response-get-user-attribute-verification-code-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "InvalidEmailRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-email-role-access-policy-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-user-attribute-verification-code :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-user-attribute-verification-code-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-user-attribute-verification-code-response))

(clojure.core/defn set-user-settings "Sets the user settings like multi-factor authentication (MFA). If MFA is to be\nremoved for a particular attribute pass the attribute with code delivery as\nnull. If null list is passed, all MFA options are removed." ([set-user-settings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-user-settings-request set-user-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/set-user-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/set-user-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetUserSettings", :http.request.configuration/output-deser-fn response-set-user-settings-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef set-user-settings :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/set-user-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/set-user-settings-response))

(clojure.core/defn delete-resource-server "Deletes a resource server." ([delete-resource-server-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-resource-server-request delete-resource-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-resource-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResourceServer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-resource-server :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-resource-server-request) :ret clojure.core/true?)

(clojure.core/defn admin-confirm-sign-up "Confirms user registration as an admin without using a confirmation code. Works\non any user.\n Requires developer credentials." ([admin-confirm-sign-up-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-confirm-sign-up-request admin-confirm-sign-up-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-confirm-sign-up-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-confirm-sign-up-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminConfirmSignUp", :http.request.configuration/output-deser-fn response-admin-confirm-sign-up-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "TooManyFailedAttemptsException" :portkey.aws.cognito-idp/too-many-failed-attempts-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef admin-confirm-sign-up :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-confirm-sign-up-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-confirm-sign-up-response))

(clojure.core/defn admin-list-devices "Lists devices, as an administrator.\n Requires developer credentials." ([admin-list-devices-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-list-devices-request admin-list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-list-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-list-devices-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminListDevices", :http.request.configuration/output-deser-fn response-admin-list-devices-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception}})))))
(clojure.spec.alpha/fdef admin-list-devices :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-list-devices-response))

(clojure.core/defn list-users "Lists the users in the Amazon Cognito user pool." ([list-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-users-response))

(clojure.core/defn initiate-auth "Initiates the authentication flow." ([initiate-auth-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-initiate-auth-request initiate-auth-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/initiate-auth-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/initiate-auth-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateAuth", :http.request.configuration/output-deser-fn response-initiate-auth-response, :http.request.spec/error-spec {"InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef initiate-auth :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/initiate-auth-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/initiate-auth-response))

(clojure.core/defn admin-disable-user "Disables the specified user as an administrator. Works on any user.\n Requires developer credentials." ([admin-disable-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-disable-user-request admin-disable-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-disable-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-disable-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminDisableUser", :http.request.configuration/output-deser-fn response-admin-disable-user-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-disable-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-disable-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-disable-user-response))

(clojure.core/defn verify-user-attribute "Verifies the specified user attributes in the user pool." ([verify-user-attribute-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-user-attribute-request verify-user-attribute-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/verify-user-attribute-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/verify-user-attribute-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "VerifyUserAttribute", :http.request.configuration/output-deser-fn response-verify-user-attribute-response, :http.request.spec/error-spec {"ExpiredCodeException" :portkey.aws.cognito-idp/expired-code-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef verify-user-attribute :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/verify-user-attribute-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/verify-user-attribute-response))

(clojure.core/defn create-user-pool-client "Creates the user pool client." ([create-user-pool-client-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-pool-client-request create-user-pool-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-user-pool-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-user-pool-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserPoolClient", :http.request.configuration/output-deser-fn response-create-user-pool-client-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "ScopeDoesNotExistException" :portkey.aws.cognito-idp/scope-does-not-exist-exception, "InvalidOAuthFlowException" :portkey.aws.cognito-idp/invalid-o-auth-flow-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef create-user-pool-client :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-user-pool-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-user-pool-client-response))

(clojure.core/defn list-resource-servers "Lists the resource servers for a user pool." ([list-resource-servers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resource-servers-request list-resource-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-resource-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-resource-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourceServers", :http.request.configuration/output-deser-fn response-list-resource-servers-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-resource-servers :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-resource-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-resource-servers-response))

(clojure.core/defn get-signing-certificate "This method takes a user pool ID, and returns the signing certificate." ([get-signing-certificate-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-signing-certificate-request get-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-signing-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-signing-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSigningCertificate", :http.request.configuration/output-deser-fn response-get-signing-certificate-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-signing-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-signing-certificate-response))

(clojure.core/defn confirm-sign-up "Confirms registration of a user and handles the existing alias from a previous\nuser." ([confirm-sign-up-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-sign-up-request confirm-sign-up-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/confirm-sign-up-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/confirm-sign-up-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmSignUp", :http.request.configuration/output-deser-fn response-confirm-sign-up-response, :http.request.spec/error-spec {"ExpiredCodeException" :portkey.aws.cognito-idp/expired-code-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "TooManyFailedAttemptsException" :portkey.aws.cognito-idp/too-many-failed-attempts-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef confirm-sign-up :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/confirm-sign-up-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/confirm-sign-up-response))

(clojure.core/defn create-group "Creates a new group in the specified user pool.\n Requires developer credentials." ([create-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-group-request create-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/create-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/create-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGroup", :http.request.configuration/output-deser-fn response-create-group-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "GroupExistsException" :portkey.aws.cognito-idp/group-exists-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "LimitExceededException" :portkey.aws.cognito-idp/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/create-group-response))

(clojure.core/defn update-auth-event-feedback "Provides the feedback for an authentication event whether it was from a valid\nuser or not. This feedback is used for improving the risk evaluation decision\nfor the user pool as part of Amazon Cognito advanced security." ([update-auth-event-feedback-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-auth-event-feedback-request update-auth-event-feedback-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-auth-event-feedback-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-auth-event-feedback-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAuthEventFeedback", :http.request.configuration/output-deser-fn response-update-auth-event-feedback-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserPoolAddOnNotEnabledException" :portkey.aws.cognito-idp/user-pool-add-on-not-enabled-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef update-auth-event-feedback :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-auth-event-feedback-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-auth-event-feedback-response))

(clojure.core/defn describe-resource-server "Describes a resource server." ([describe-resource-server-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-resource-server-request describe-resource-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-resource-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-resource-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeResourceServer", :http.request.configuration/output-deser-fn response-describe-resource-server-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-resource-server :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-resource-server-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-resource-server-response))

(clojure.core/defn admin-link-provider-for-user "Links an existing user account in a user pool (DestinationUser) to an identity\nfrom an external identity provider (SourceUser) based on a specified attribute\nname and value from the external identity provider. This allows you to create a\nlink from the existing user account to an external federated user identity that\nhas not yet been used to sign in, so that the federated user identity can be\nused to sign in as the existing user account.\n For example, if there is an existing user with a username and password, this\nAPI links that user to a federated user identity, so that when the federated\nuser identity is used, the user signs in as the existing user account.\n Because this API allows a user with an external federated identity to sign in\nas an existing user in the user pool, it is critical that it only be used with\nexternal identity providers and provider attributes that have been trusted by\nthe application owner.\n See also .\n This action is enabled only for admin access and requires developer\ncredentials." ([admin-link-provider-for-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-link-provider-for-user-request admin-link-provider-for-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-link-provider-for-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-link-provider-for-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminLinkProviderForUser", :http.request.configuration/output-deser-fn response-admin-link-provider-for-user-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-link-provider-for-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-link-provider-for-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-link-provider-for-user-response))

(clojure.core/defn admin-list-groups-for-user "Lists the groups that the user belongs to.\n Requires developer credentials." ([admin-list-groups-for-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-list-groups-for-user-request admin-list-groups-for-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-list-groups-for-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-list-groups-for-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminListGroupsForUser", :http.request.configuration/output-deser-fn response-admin-list-groups-for-user-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-list-groups-for-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-list-groups-for-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-list-groups-for-user-response))

(clojure.core/defn describe-user-pool-client "Client method for returning the configuration information and metadata of the\nspecified user pool app client." ([describe-user-pool-client-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-pool-client-request describe-user-pool-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/describe-user-pool-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/describe-user-pool-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserPoolClient", :http.request.configuration/output-deser-fn response-describe-user-pool-client-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-user-pool-client :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/describe-user-pool-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/describe-user-pool-client-response))

(clojure.core/defn admin-create-user "Creates a new user in the specified user pool.\n If MessageAction is not set, the default is to send a welcome message via email\nor phone (SMS).\n This message is based on a template that you configured in your call to or .\nThis template includes your custom sign-up instructions and placeholders for\nuser name and temporary password.\n Alternatively, you can call AdminCreateUser with “SUPPRESS” for the\nMessageAction parameter, and Amazon Cognito will not send any email.\n In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they\nsign in and change their password.\n AdminCreateUser requires developer credentials." ([admin-create-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-create-user-request admin-create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminCreateUser", :http.request.configuration/output-deser-fn response-admin-create-user-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "UsernameExistsException" :portkey.aws.cognito-idp/username-exists-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeDeliveryFailureException" :portkey.aws.cognito-idp/code-delivery-failure-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnsupportedUserStateException" :portkey.aws.cognito-idp/unsupported-user-state-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "PreconditionNotMetException" :portkey.aws.cognito-idp/precondition-not-met-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef admin-create-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-create-user-response))

(clojure.core/defn update-resource-server "Updates the name and scopes of resource server. All other fields are read-only." ([update-resource-server-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-resource-server-request update-resource-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-resource-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-resource-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResourceServer", :http.request.configuration/output-deser-fn response-update-resource-server-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef update-resource-server :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-resource-server-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-resource-server-response))

(clojure.core/defn get-csv-header "Gets the header information for the .csv file to be used as input for the user\nimport job." ([get-csv-header-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-csv-header-request get-csv-header-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-csv-header-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-csv-header-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCSVHeader", :http.request.configuration/output-deser-fn response-get-csv-header-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-csv-header :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-csv-header-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-csv-header-response))

(clojure.core/defn delete-identity-provider "Deletes an identity provider for a user pool." ([delete-identity-provider-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-identity-provider-request delete-identity-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/delete-identity-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIdentityProvider", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "UnsupportedIdentityProviderException" :portkey.aws.cognito-idp/unsupported-identity-provider-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-identity-provider :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/delete-identity-provider-request) :ret clojure.core/true?)

(clojure.core/defn update-user-pool-domain "Updates the Secure Sockets Layer (SSL) certificate for the custom domain for\nyour user pool.\n You can use this operation to provide the Amazon Resource Name (ARN) of a new\ncertificate to Amazon Cognito. You cannot use it to change the domain for a user\npool.\n A custom domain is used to host the Amazon Cognito hosted UI, which provides\nsign-up and sign-in pages for your application. When you set up a custom domain,\nyou provide a certificate that you manage with AWS Certificate Manager (ACM).\nWhen necessary, you can use this operation to change the certificate that you\napplied to your custom domain.\n Usually, this is unnecessary following routine certificate renewal with ACM.\nWhen you renew your existing certificate in ACM, the ARN for your certificate\nremains the same, and your custom domain uses the new certificate automatically.\n However, if you replace your existing certificate with a new one, ACM gives the\nnew certificate a new ARN. To apply the new certificate to your custom domain,\nyou must provide this ARN to Amazon Cognito.\n When you add your new certificate in ACM, you must choose US East (N. Virginia)\nas the AWS Region.\n After you submit your request, Amazon Cognito requires up to 1 hour to\ndistribute your new certificate to your custom domain.\n For more information about adding a custom domain to your user pool, see Using\nYour Own Domain for the Hosted UI\n(http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)." ([update-user-pool-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-pool-domain-request update-user-pool-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/update-user-pool-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/update-user-pool-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserPoolDomain", :http.request.configuration/output-deser-fn response-update-user-pool-domain-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef update-user-pool-domain :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/update-user-pool-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/update-user-pool-domain-response))

(clojure.core/defn get-identity-provider-by-identifier "Gets the specified identity provider." ([get-identity-provider-by-identifier-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-provider-by-identifier-request get-identity-provider-by-identifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-identity-provider-by-identifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-identity-provider-by-identifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIdentityProviderByIdentifier", :http.request.configuration/output-deser-fn response-get-identity-provider-by-identifier-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-identity-provider-by-identifier :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-identity-provider-by-identifier-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-identity-provider-by-identifier-response))

(clojure.core/defn admin-initiate-auth "Initiates the authentication flow, as an administrator.\n Requires developer credentials." ([admin-initiate-auth-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-initiate-auth-request admin-initiate-auth-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-initiate-auth-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-initiate-auth-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminInitiateAuth", :http.request.configuration/output-deser-fn response-admin-initiate-auth-response, :http.request.spec/error-spec {"InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "MFAMethodNotFoundException" :portkey.aws.cognito-idp/mfa-method-not-found-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef admin-initiate-auth :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-initiate-auth-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-initiate-auth-response))

(clojure.core/defn admin-delete-user "Deletes a user as an administrator. Works on any user.\n Requires developer credentials." ([admin-delete-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-delete-user-request admin-delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminDeleteUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-delete-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-delete-user-request) :ret clojure.core/true?)

(clojure.core/defn admin-respond-to-auth-challenge "Responds to an authentication challenge, as an administrator.\n Requires developer credentials." ([admin-respond-to-auth-challenge-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-respond-to-auth-challenge-request admin-respond-to-auth-challenge-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-respond-to-auth-challenge-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-respond-to-auth-challenge-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminRespondToAuthChallenge", :http.request.configuration/output-deser-fn response-admin-respond-to-auth-challenge-response, :http.request.spec/error-spec {"ExpiredCodeException" :portkey.aws.cognito-idp/expired-code-exception, "InvalidSmsRoleAccessPolicyException" :portkey.aws.cognito-idp/invalid-sms-role-access-policy-exception, "InvalidLambdaResponseException" :portkey.aws.cognito-idp/invalid-lambda-response-exception, "InvalidUserPoolConfigurationException" :portkey.aws.cognito-idp/invalid-user-pool-configuration-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "InvalidPasswordException" :portkey.aws.cognito-idp/invalid-password-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception, "CodeMismatchException" :portkey.aws.cognito-idp/code-mismatch-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UnexpectedLambdaException" :portkey.aws.cognito-idp/unexpected-lambda-exception, "MFAMethodNotFoundException" :portkey.aws.cognito-idp/mfa-method-not-found-exception, "AliasExistsException" :portkey.aws.cognito-idp/alias-exists-exception, "UserLambdaValidationException" :portkey.aws.cognito-idp/user-lambda-validation-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InvalidSmsRoleTrustRelationshipException" :portkey.aws.cognito-idp/invalid-sms-role-trust-relationship-exception, "SoftwareTokenMFANotFoundException" :portkey.aws.cognito-idp/software-token-mfa-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef admin-respond-to-auth-challenge :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-respond-to-auth-challenge-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-respond-to-auth-challenge-response))

(clojure.core/defn admin-list-user-auth-events "Lists a history of user activity and any risks detected as part of Amazon\nCognito advanced security." ([admin-list-user-auth-events-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-admin-list-user-auth-events-request admin-list-user-auth-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/admin-list-user-auth-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/admin-list-user-auth-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AdminListUserAuthEvents", :http.request.configuration/output-deser-fn response-admin-list-user-auth-events-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserPoolAddOnNotEnabledException" :portkey.aws.cognito-idp/user-pool-add-on-not-enabled-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef admin-list-user-auth-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/admin-list-user-auth-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/admin-list-user-auth-events-response))

(clojure.core/defn get-user "Gets the user attributes and metadata for a user." ([get-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-user-request get-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/get-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/get-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUser", :http.request.configuration/output-deser-fn response-get-user-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "PasswordResetRequiredException" :portkey.aws.cognito-idp/password-reset-required-exception, "UserNotFoundException" :portkey.aws.cognito-idp/user-not-found-exception, "UserNotConfirmedException" :portkey.aws.cognito-idp/user-not-confirmed-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-user :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/get-user-response))

(clojure.core/defn list-identity-providers "Lists information about all identity providers for a user pool." ([list-identity-providers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-identity-providers-request list-identity-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-idp/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityProviderService", :http.request.spec/output-spec :portkey.aws.cognito-idp/list-identity-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-04-18", :http.request.configuration/service-id "Cognito Identity Provider", :http.request.spec/input-spec :portkey.aws.cognito-idp/list-identity-providers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIdentityProviders", :http.request.configuration/output-deser-fn response-list-identity-providers-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-idp/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-idp/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-idp/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-idp/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-idp/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-identity-providers :args (clojure.spec.alpha/tuple :portkey.aws.cognito-idp/list-identity-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-idp/list-identity-providers-response))
