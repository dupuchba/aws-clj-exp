(ns portkey.aws.cognito-identity.-2014-06-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cognito-identity", :region "ap-northeast-1"},
    :ssl-common-name "cognito-identity.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "cognito-identity", :region "eu-west-1"},
    :ssl-common-name "cognito-identity.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-identity.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "cognito-identity", :region "us-east-2"},
    :ssl-common-name "cognito-identity.us-east-2.amazonaws.com",
    :endpoint "https://cognito-identity.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cognito-identity", :region "ap-southeast-2"},
    :ssl-common-name "cognito-identity.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-identity.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "cognito-identity", :region "cn-north-1"},
    :ssl-common-name "cognito-identity.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cognito-identity.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cognito-identity", :region "ap-southeast-1"},
    :ssl-common-name "cognito-identity.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cognito-identity", :region "ap-northeast-2"},
    :ssl-common-name "cognito-identity.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-identity.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "cognito-identity", :region "ca-central-1"},
    :ssl-common-name "cognito-identity.ca-central-1.amazonaws.com",
    :endpoint "https://cognito-identity.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "cognito-identity", :region "eu-central-1"},
    :ssl-common-name "cognito-identity.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-identity.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "cognito-identity", :region "eu-west-2"},
    :ssl-common-name "cognito-identity.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-identity.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "cognito-identity", :region "us-west-2"},
    :ssl-common-name "cognito-identity.us-west-2.amazonaws.com",
    :endpoint "https://cognito-identity.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "cognito-identity", :region "us-east-1"},
    :ssl-common-name "cognito-identity.us-east-1.amazonaws.com",
    :endpoint "https://cognito-identity.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "cognito-identity", :region "ap-south-1"},
    :ssl-common-name "cognito-identity.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-cognito-identity-provider-list)

(clojure.core/declare ser-logins-list)

(clojure.core/declare ser-pagination-key)

(clojure.core/declare ser-oidc-provider-list)

(clojure.core/declare ser-identity-pool-unauthenticated)

(clojure.core/declare ser-saml-provider-list)

(clojure.core/declare ser-claim-value)

(clojure.core/declare ser-query-limit)

(clojure.core/declare ser-developer-provider-name)

(clojure.core/declare ser-cognito-identity-provider-token-check)

(clojure.core/declare ser-hide-disabled)

(clojure.core/declare ser-role-mapping)

(clojure.core/declare ser-identity-pool-id)

(clojure.core/declare ser-claim-name)

(clojure.core/declare ser-identity-id)

(clojure.core/declare ser-token-duration)

(clojure.core/declare ser-cognito-identity-provider-name)

(clojure.core/declare ser-role-mapping-map)

(clojure.core/declare ser-cognito-identity-provider-client-id)

(clojure.core/declare ser-identity-pool-name)

(clojure.core/declare ser-identity-provider-id)

(clojure.core/declare ser-role-mapping-type)

(clojure.core/declare ser-mapping-rule)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-mapping-rules-list)

(clojure.core/declare ser-identity-provider-name)

(clojure.core/declare ser-arn-string)

(clojure.core/declare ser-rules-configuration-type)

(clojure.core/declare ser-logins-map)

(clojure.core/declare ser-identity-providers)

(clojure.core/declare ser-cognito-identity-provider)

(clojure.core/declare ser-roles-map)

(clojure.core/declare ser-identity-provider-token)

(clojure.core/declare ser-identity-id-list)

(clojure.core/declare ser-developer-user-identifier)

(clojure.core/declare ser-mapping-rule-match-type)

(clojure.core/declare ser-ambiguous-role-resolution-type)

(clojure.core/declare ser-role-type)

(clojure.core/defn- ser-cognito-identity-provider-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cognito-identity-provider coll) #:http.request.field{:shape "CognitoIdentityProvider"}))) input), :shape "CognitoIdentityProviderList", :type "list"})

(clojure.core/defn- ser-logins-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-identity-provider-name coll) #:http.request.field{:shape "IdentityProviderName"}))) input), :shape "LoginsList", :type "list"})

(clojure.core/defn- ser-pagination-key [input] #:http.request.field{:value input, :shape "PaginationKey"})

(clojure.core/defn- ser-oidc-provider-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn-string coll) #:http.request.field{:shape "ARNString"}))) input), :shape "OIDCProviderList", :type "list"})

(clojure.core/defn- ser-identity-pool-unauthenticated [input] #:http.request.field{:value input, :shape "IdentityPoolUnauthenticated"})

(clojure.core/defn- ser-saml-provider-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn-string coll) #:http.request.field{:shape "ARNString"}))) input), :shape "SAMLProviderList", :type "list"})

(clojure.core/defn- ser-claim-value [input] #:http.request.field{:value input, :shape "ClaimValue"})

(clojure.core/defn- ser-query-limit [input] #:http.request.field{:value input, :shape "QueryLimit"})

(clojure.core/defn- ser-developer-provider-name [input] #:http.request.field{:value input, :shape "DeveloperProviderName"})

(clojure.core/defn- ser-cognito-identity-provider-token-check [input] #:http.request.field{:value input, :shape "CognitoIdentityProviderTokenCheck"})

(clojure.core/defn- ser-hide-disabled [input] #:http.request.field{:value input, :shape "HideDisabled"})

(clojure.core/defn- ser-role-mapping [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-mapping-type (:type input)) #:http.request.field{:name "Type", :shape "RoleMappingType"})], :shape "RoleMapping", :type "structure"} (clojure.core/contains? input :ambiguous-role-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ambiguous-role-resolution-type (input :ambiguous-role-resolution)) #:http.request.field{:name "AmbiguousRoleResolution", :shape "AmbiguousRoleResolutionType"})) (clojure.core/contains? input :rules-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rules-configuration-type (input :rules-configuration)) #:http.request.field{:name "RulesConfiguration", :shape "RulesConfigurationType"}))))

(clojure.core/defn- ser-identity-pool-id [input] #:http.request.field{:value input, :shape "IdentityPoolId"})

(clojure.core/defn- ser-claim-name [input] #:http.request.field{:value input, :shape "ClaimName"})

(clojure.core/defn- ser-identity-id [input] #:http.request.field{:value input, :shape "IdentityId"})

(clojure.core/defn- ser-token-duration [input] #:http.request.field{:value input, :shape "TokenDuration"})

(clojure.core/defn- ser-cognito-identity-provider-name [input] #:http.request.field{:value input, :shape "CognitoIdentityProviderName"})

(clojure.core/defn- ser-role-mapping-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-identity-provider-name k) #:http.request.field{:map-info "key", :shape "IdentityProviderName"}) (clojure.core/into (ser-role-mapping v) #:http.request.field{:map-info "value", :shape "RoleMapping"})])) input), :shape "RoleMappingMap", :type "map", :max 10})

(clojure.core/defn- ser-cognito-identity-provider-client-id [input] #:http.request.field{:value input, :shape "CognitoIdentityProviderClientId"})

(clojure.core/defn- ser-identity-pool-name [input] #:http.request.field{:value input, :shape "IdentityPoolName"})

(clojure.core/defn- ser-identity-provider-id [input] #:http.request.field{:value input, :shape "IdentityProviderId"})

(clojure.core/defn- ser-role-mapping-type [input] #:http.request.field{:value (clojure.core/get {"Token" "Token", :token "Token", "Rules" "Rules", :rules "Rules"} input), :shape "RoleMappingType"})

(clojure.core/defn- ser-mapping-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-claim-name (:claim input)) #:http.request.field{:name "Claim", :shape "ClaimName"}) (clojure.core/into (ser-mapping-rule-match-type (:match-type input)) #:http.request.field{:name "MatchType", :shape "MappingRuleMatchType"}) (clojure.core/into (ser-claim-value (:value input)) #:http.request.field{:name "Value", :shape "ClaimValue"}) (clojure.core/into (ser-arn-string (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "ARNString"})], :shape "MappingRule", :type "structure"}))

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-mapping-rules-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mapping-rule coll) #:http.request.field{:shape "MappingRule"}))) input), :shape "MappingRulesList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-identity-provider-name [input] #:http.request.field{:value input, :shape "IdentityProviderName"})

(clojure.core/defn- ser-arn-string [input] #:http.request.field{:value input, :shape "ARNString"})

(clojure.core/defn- ser-rules-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-mapping-rules-list (:rules input)) #:http.request.field{:name "Rules", :shape "MappingRulesList"})], :shape "RulesConfigurationType", :type "structure"}))

(clojure.core/defn- ser-logins-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-identity-provider-name k) #:http.request.field{:map-info "key", :shape "IdentityProviderName"}) (clojure.core/into (ser-identity-provider-token v) #:http.request.field{:map-info "value", :shape "IdentityProviderToken"})])) input), :shape "LoginsMap", :type "map", :max 10})

(clojure.core/defn- ser-identity-providers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-identity-provider-name k) #:http.request.field{:map-info "key", :shape "IdentityProviderName"}) (clojure.core/into (ser-identity-provider-id v) #:http.request.field{:map-info "value", :shape "IdentityProviderId"})])) input), :shape "IdentityProviders", :type "map", :max 10})

(clojure.core/defn- ser-cognito-identity-provider [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CognitoIdentityProvider", :type "structure"} (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-name (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "CognitoIdentityProviderName"})) (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-client-id (input :client-id)) #:http.request.field{:name "ClientId", :shape "CognitoIdentityProviderClientId"})) (clojure.core/contains? input :server-side-token-check) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-token-check (input :server-side-token-check)) #:http.request.field{:name "ServerSideTokenCheck", :shape "CognitoIdentityProviderTokenCheck", :box true}))))

(clojure.core/defn- ser-roles-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-role-type k) #:http.request.field{:map-info "key", :shape "RoleType"}) (clojure.core/into (ser-arn-string v) #:http.request.field{:map-info "value", :shape "ARNString"})])) input), :shape "RolesMap", :type "map", :max 2})

(clojure.core/defn- ser-identity-provider-token [input] #:http.request.field{:value input, :shape "IdentityProviderToken"})

(clojure.core/defn- ser-identity-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-identity-id coll) #:http.request.field{:shape "IdentityId"}))) input), :shape "IdentityIdList", :type "list", :max 60, :min 1})

(clojure.core/defn- ser-developer-user-identifier [input] #:http.request.field{:value input, :shape "DeveloperUserIdentifier"})

(clojure.core/defn- ser-mapping-rule-match-type [input] #:http.request.field{:value (clojure.core/get {"Equals" "Equals", :equals "Equals", "Contains" "Contains", :contains "Contains", "StartsWith" "StartsWith", :starts-with "StartsWith", "NotEqual" "NotEqual", :not-equal "NotEqual"} input), :shape "MappingRuleMatchType"})

(clojure.core/defn- ser-ambiguous-role-resolution-type [input] #:http.request.field{:value (clojure.core/get {"AuthenticatedRole" "AuthenticatedRole", :authenticated-role "AuthenticatedRole", "Deny" "Deny", :deny "Deny"} input), :shape "AmbiguousRoleResolutionType"})

(clojure.core/defn- ser-role-type [input] #:http.request.field{:value input, :shape "RoleType"})

(clojure.core/defn- req-list-identity-pools-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-delete-identity-pool-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-get-identity-pool-roles-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-get-id-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]} (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :logins) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"}))))

(clojure.core/defn- req-set-identity-pool-roles-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-roles-map (input :roles)) #:http.request.field{:name "Roles", :shape "RolesMap"})]} (clojure.core/contains? input :role-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-mapping-map (input :role-mappings)) #:http.request.field{:name "RoleMappings", :shape "RoleMappingMap"}))))

(clojure.core/defn- req-get-open-id-token-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})]} (clojure.core/contains? input :logins) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"}))))

(clojure.core/defn- req-get-credentials-for-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})]} (clojure.core/contains? input :logins) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"})) (clojure.core/contains? input :custom-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-string (input :custom-role-arn)) #:http.request.field{:name "CustomRoleArn", :shape "ARNString"}))))

(clojure.core/defn- req-unlink-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"}) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"}) (clojure.core/into (ser-logins-list (input :logins-to-remove)) #:http.request.field{:name "LoginsToRemove", :shape "LoginsList"})]}))

(clojure.core/defn- req-describe-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})]}))

(clojure.core/defn- req-merge-developer-identities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-developer-user-identifier (input :source-user-identifier)) #:http.request.field{:name "SourceUserIdentifier", :shape "DeveloperUserIdentifier"}) (clojure.core/into (ser-developer-user-identifier (input :destination-user-identifier)) #:http.request.field{:name "DestinationUserIdentifier", :shape "DeveloperUserIdentifier"}) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"}) (clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-get-open-id-token-for-developer-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"})]} (clojure.core/contains? input :identity-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})) (clojure.core/contains? input :token-duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-duration (input :token-duration)) #:http.request.field{:name "TokenDuration", :shape "TokenDuration"}))))

(clojure.core/defn- req-unlink-developer-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"}) (clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"}) (clojure.core/into (ser-developer-user-identifier (input :developer-user-identifier)) #:http.request.field{:name "DeveloperUserIdentifier", :shape "DeveloperUserIdentifier"})]}))

(clojure.core/defn- req-list-identities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"})) (clojure.core/contains? input :hide-disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hide-disabled (input :hide-disabled)) #:http.request.field{:name "HideDisabled", :shape "HideDisabled"}))))

(clojure.core/defn- req-identity-pool [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-identity-pool-name (input :identity-pool-name)) #:http.request.field{:name "IdentityPoolName", :shape "IdentityPoolName"}) (clojure.core/into (ser-identity-pool-unauthenticated (input :allow-unauthenticated-identities)) #:http.request.field{:name "AllowUnauthenticatedIdentities", :shape "IdentityPoolUnauthenticated"})]} (clojure.core/contains? input :supported-login-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-providers (input :supported-login-providers)) #:http.request.field{:name "SupportedLoginProviders", :shape "IdentityProviders"})) (clojure.core/contains? input :developer-provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"})) (clojure.core/contains? input :open-id-connect-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-oidc-provider-list (input :open-id-connect-provider-ar-ns)) #:http.request.field{:name "OpenIdConnectProviderARNs", :shape "OIDCProviderList"})) (clojure.core/contains? input :cognito-identity-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-list (input :cognito-identity-providers)) #:http.request.field{:name "CognitoIdentityProviders", :shape "CognitoIdentityProviderList"})) (clojure.core/contains? input :saml-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-saml-provider-list (input :saml-provider-ar-ns)) #:http.request.field{:name "SamlProviderARNs", :shape "SAMLProviderList"}))))

(clojure.core/defn- req-create-identity-pool-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-name (input :identity-pool-name)) #:http.request.field{:name "IdentityPoolName", :shape "IdentityPoolName"}) (clojure.core/into (ser-identity-pool-unauthenticated (input :allow-unauthenticated-identities)) #:http.request.field{:name "AllowUnauthenticatedIdentities", :shape "IdentityPoolUnauthenticated"})]} (clojure.core/contains? input :supported-login-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-providers (input :supported-login-providers)) #:http.request.field{:name "SupportedLoginProviders", :shape "IdentityProviders"})) (clojure.core/contains? input :developer-provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"})) (clojure.core/contains? input :open-id-connect-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-oidc-provider-list (input :open-id-connect-provider-ar-ns)) #:http.request.field{:name "OpenIdConnectProviderARNs", :shape "OIDCProviderList"})) (clojure.core/contains? input :cognito-identity-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-list (input :cognito-identity-providers)) #:http.request.field{:name "CognitoIdentityProviders", :shape "CognitoIdentityProviderList"})) (clojure.core/contains? input :saml-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-saml-provider-list (input :saml-provider-ar-ns)) #:http.request.field{:name "SamlProviderARNs", :shape "SAMLProviderList"}))))

(clojure.core/defn- req-delete-identities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id-list (input :identity-ids-to-delete)) #:http.request.field{:name "IdentityIdsToDelete", :shape "IdentityIdList"})]}))

(clojure.core/defn- req-describe-identity-pool-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-lookup-developer-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]} (clojure.core/contains? input :identity-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})) (clojure.core/contains? input :developer-user-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-developer-user-identifier (input :developer-user-identifier)) #:http.request.field{:name "DeveloperUserIdentifier", :shape "DeveloperUserIdentifier"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/declare deser-cognito-identity-provider-list)

(clojure.core/declare deser-logins-list)

(clojure.core/declare deser-pagination-key)

(clojure.core/declare deser-oidc-provider-list)

(clojure.core/declare deser-identity-pool-unauthenticated)

(clojure.core/declare deser-saml-provider-list)

(clojure.core/declare deser-claim-value)

(clojure.core/declare deser-developer-provider-name)

(clojure.core/declare deser-cognito-identity-provider-token-check)

(clojure.core/declare deser-role-mapping)

(clojure.core/declare deser-identity-description)

(clojure.core/declare deser-identity-pool-id)

(clojure.core/declare deser-claim-name)

(clojure.core/declare deser-identity-id)

(clojure.core/declare deser-date-type)

(clojure.core/declare deser-cognito-identity-provider-name)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-role-mapping-map)

(clojure.core/declare deser-cognito-identity-provider-client-id)

(clojure.core/declare deser-credentials)

(clojure.core/declare deser-unprocessed-identity-id)

(clojure.core/declare deser-identity-pool-name)

(clojure.core/declare deser-identity-provider-id)

(clojure.core/declare deser-role-mapping-type)

(clojure.core/declare deser-mapping-rule)

(clojure.core/declare deser-string)

(clojure.core/declare deser-secret-key-string)

(clojure.core/declare deser-mapping-rules-list)

(clojure.core/declare deser-identity-provider-name)

(clojure.core/declare deser-unprocessed-identity-id-list)

(clojure.core/declare deser-arn-string)

(clojure.core/declare deser-identity-pools-list)

(clojure.core/declare deser-identity-pool-short-description)

(clojure.core/declare deser-rules-configuration-type)

(clojure.core/declare deser-oidc-token)

(clojure.core/declare deser-session-token-string)

(clojure.core/declare deser-developer-user-identifier-list)

(clojure.core/declare deser-identities-list)

(clojure.core/declare deser-identity-providers)

(clojure.core/declare deser-cognito-identity-provider)

(clojure.core/declare deser-roles-map)

(clojure.core/declare deser-developer-user-identifier)

(clojure.core/declare deser-access-key-string)

(clojure.core/declare deser-mapping-rule-match-type)

(clojure.core/declare deser-ambiguous-role-resolution-type)

(clojure.core/declare deser-role-type)

(clojure.core/defn- deser-cognito-identity-provider-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cognito-identity-provider coll))) input))

(clojure.core/defn- deser-logins-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-identity-provider-name coll))) input))

(clojure.core/defn- deser-pagination-key [input] input)

(clojure.core/defn- deser-oidc-provider-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn-string coll))) input))

(clojure.core/defn- deser-identity-pool-unauthenticated [input] input)

(clojure.core/defn- deser-saml-provider-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn-string coll))) input))

(clojure.core/defn- deser-claim-value [input] input)

(clojure.core/defn- deser-developer-provider-name [input] input)

(clojure.core/defn- deser-cognito-identity-provider-token-check [input] input)

(clojure.core/defn- deser-role-mapping [input] (clojure.core/cond-> {:type (deser-role-mapping-type (input "Type"))} (clojure.core/contains? input "AmbiguousRoleResolution") (clojure.core/assoc :ambiguous-role-resolution (deser-ambiguous-role-resolution-type (input "AmbiguousRoleResolution"))) (clojure.core/contains? input "RulesConfiguration") (clojure.core/assoc :rules-configuration (deser-rules-configuration-type (input "RulesConfiguration")))))

(clojure.core/defn- deser-identity-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (input "IdentityId"))) (clojure.core/contains? input "Logins") (clojure.core/assoc :logins (deser-logins-list (input "Logins"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (input "LastModifiedDate")))))

(clojure.core/defn- deser-identity-pool-id [input] input)

(clojure.core/defn- deser-claim-name [input] input)

(clojure.core/defn- deser-identity-id [input] input)

(clojure.core/defn- deser-date-type [input] input)

(clojure.core/defn- deser-cognito-identity-provider-name [input] input)

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"AccessDenied" :access-denied, "InternalServerError" :internal-server-error} input))

(clojure.core/defn- deser-role-mapping-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-identity-provider-name k) (deser-role-mapping v)])) input))

(clojure.core/defn- deser-cognito-identity-provider-client-id [input] input)

(clojure.core/defn- deser-credentials [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccessKeyId") (clojure.core/assoc :access-key-id (deser-access-key-string (input "AccessKeyId"))) (clojure.core/contains? input "SecretKey") (clojure.core/assoc :secret-key (deser-secret-key-string (input "SecretKey"))) (clojure.core/contains? input "SessionToken") (clojure.core/assoc :session-token (deser-session-token-string (input "SessionToken"))) (clojure.core/contains? input "Expiration") (clojure.core/assoc :expiration (deser-date-type (input "Expiration")))))

(clojure.core/defn- deser-unprocessed-identity-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (input "IdentityId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode")))))

(clojure.core/defn- deser-identity-pool-name [input] input)

(clojure.core/defn- deser-identity-provider-id [input] input)

(clojure.core/defn- deser-role-mapping-type [input] (clojure.core/get {"Token" :token, "Rules" :rules} input))

(clojure.core/defn- deser-mapping-rule [input] (clojure.core/cond-> {:claim (deser-claim-name (input "Claim")), :match-type (deser-mapping-rule-match-type (input "MatchType")), :value (deser-claim-value (input "Value")), :role-arn (deser-arn-string (input "RoleARN"))}))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-secret-key-string [input] input)

(clojure.core/defn- deser-mapping-rules-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mapping-rule coll))) input))

(clojure.core/defn- deser-identity-provider-name [input] input)

(clojure.core/defn- deser-unprocessed-identity-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-identity-id coll))) input))

(clojure.core/defn- deser-arn-string [input] input)

(clojure.core/defn- deser-identity-pools-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-identity-pool-short-description coll))) input))

(clojure.core/defn- deser-identity-pool-short-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (input "IdentityPoolId"))) (clojure.core/contains? input "IdentityPoolName") (clojure.core/assoc :identity-pool-name (deser-identity-pool-name (input "IdentityPoolName")))))

(clojure.core/defn- deser-rules-configuration-type [input] (clojure.core/cond-> {:rules (deser-mapping-rules-list (input "Rules"))}))

(clojure.core/defn- deser-oidc-token [input] input)

(clojure.core/defn- deser-session-token-string [input] input)

(clojure.core/defn- deser-developer-user-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-developer-user-identifier coll))) input))

(clojure.core/defn- deser-identities-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-identity-description coll))) input))

(clojure.core/defn- deser-identity-providers [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-identity-provider-name k) (deser-identity-provider-id v)])) input))

(clojure.core/defn- deser-cognito-identity-provider [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProviderName") (clojure.core/assoc :provider-name (deser-cognito-identity-provider-name (input "ProviderName"))) (clojure.core/contains? input "ClientId") (clojure.core/assoc :client-id (deser-cognito-identity-provider-client-id (input "ClientId"))) (clojure.core/contains? input "ServerSideTokenCheck") (clojure.core/assoc :server-side-token-check (deser-cognito-identity-provider-token-check (input "ServerSideTokenCheck")))))

(clojure.core/defn- deser-roles-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-role-type k) (deser-arn-string v)])) input))

(clojure.core/defn- deser-developer-user-identifier [input] input)

(clojure.core/defn- deser-access-key-string [input] input)

(clojure.core/defn- deser-mapping-rule-match-type [input] (clojure.core/get {"Equals" :equals, "Contains" :contains, "StartsWith" :starts-with, "NotEqual" :not-equal} input))

(clojure.core/defn- deser-ambiguous-role-resolution-type [input] (clojure.core/get {"AuthenticatedRole" :authenticated-role, "Deny" :deny} input))

(clojure.core/defn- deser-role-type [input] input)

(clojure.core/defn- response-lookup-developer-identity-response ([input] (response-lookup-developer-identity-response nil input)) ([resultWrapper440230 input] (clojure.core/let [rawinput440229 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440231 {"IdentityId" (rawinput440229 "IdentityId"), "DeveloperUserIdentifierList" (rawinput440229 "DeveloperUserIdentifierList"), "NextToken" (rawinput440229 "NextToken")}] (clojure.core/cond-> {} (letvar440231 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440231 ["IdentityId"]))) (letvar440231 "DeveloperUserIdentifierList") (clojure.core/assoc :developer-user-identifier-list (deser-developer-user-identifier-list (clojure.core/get-in letvar440231 ["DeveloperUserIdentifierList"]))) (letvar440231 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar440231 ["NextToken"])))))))

(clojure.core/defn- response-get-open-id-token-response ([input] (response-get-open-id-token-response nil input)) ([resultWrapper440233 input] (clojure.core/let [rawinput440232 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440234 {"IdentityId" (rawinput440232 "IdentityId"), "Token" (rawinput440232 "Token")}] (clojure.core/cond-> {} (letvar440234 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440234 ["IdentityId"]))) (letvar440234 "Token") (clojure.core/assoc :token (deser-oidc-token (clojure.core/get-in letvar440234 ["Token"])))))))

(clojure.core/defn- response-get-id-response ([input] (response-get-id-response nil input)) ([resultWrapper440236 input] (clojure.core/let [rawinput440235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440237 {"IdentityId" (rawinput440235 "IdentityId")}] (clojure.core/cond-> {} (letvar440237 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440237 ["IdentityId"])))))))

(clojure.core/defn- response-delete-identities-response ([input] (response-delete-identities-response nil input)) ([resultWrapper440239 input] (clojure.core/let [rawinput440238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440240 {"UnprocessedIdentityIds" (rawinput440238 "UnprocessedIdentityIds")}] (clojure.core/cond-> {} (letvar440240 "UnprocessedIdentityIds") (clojure.core/assoc :unprocessed-identity-ids (deser-unprocessed-identity-id-list (clojure.core/get-in letvar440240 ["UnprocessedIdentityIds"])))))))

(clojure.core/defn- response-invalid-identity-pool-configuration-exception ([input] (response-invalid-identity-pool-configuration-exception nil input)) ([resultWrapper440242 input] (clojure.core/let [rawinput440241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440243 {"message" (rawinput440241 "message")}] (clojure.core/cond-> {} (letvar440243 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440243 ["message"])))))))

(clojure.core/defn- response-developer-user-already-registered-exception ([input] (response-developer-user-already-registered-exception nil input)) ([resultWrapper440245 input] (clojure.core/let [rawinput440244 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440246 {"message" (rawinput440244 "message")}] (clojure.core/cond-> {} (letvar440246 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440246 ["message"])))))))

(clojure.core/defn- response-get-credentials-for-identity-response ([input] (response-get-credentials-for-identity-response nil input)) ([resultWrapper440248 input] (clojure.core/let [rawinput440247 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440249 {"IdentityId" (rawinput440247 "IdentityId"), "Credentials" (rawinput440247 "Credentials")}] (clojure.core/cond-> {} (letvar440249 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440249 ["IdentityId"]))) (letvar440249 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar440249 ["Credentials"])))))))

(clojure.core/defn- response-get-open-id-token-for-developer-identity-response ([input] (response-get-open-id-token-for-developer-identity-response nil input)) ([resultWrapper440251 input] (clojure.core/let [rawinput440250 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440252 {"IdentityId" (rawinput440250 "IdentityId"), "Token" (rawinput440250 "Token")}] (clojure.core/cond-> {} (letvar440252 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440252 ["IdentityId"]))) (letvar440252 "Token") (clojure.core/assoc :token (deser-oidc-token (clojure.core/get-in letvar440252 ["Token"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper440254 input] (clojure.core/let [rawinput440253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440255 {"message" (rawinput440253 "message")}] (clojure.core/cond-> {} (letvar440255 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440255 ["message"])))))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper440257 input] (clojure.core/let [rawinput440256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440258 {"message" (rawinput440256 "message")}] (clojure.core/cond-> {} (letvar440258 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440258 ["message"])))))))

(clojure.core/defn- response-identity-description ([input] (response-identity-description nil input)) ([resultWrapper440260 input] (clojure.core/let [rawinput440259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440261 {"IdentityId" (rawinput440259 "IdentityId"), "Logins" (rawinput440259 "Logins"), "CreationDate" (rawinput440259 "CreationDate"), "LastModifiedDate" (rawinput440259 "LastModifiedDate")}] (clojure.core/cond-> {} (letvar440261 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440261 ["IdentityId"]))) (letvar440261 "Logins") (clojure.core/assoc :logins (deser-logins-list (clojure.core/get-in letvar440261 ["Logins"]))) (letvar440261 "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (clojure.core/get-in letvar440261 ["CreationDate"]))) (letvar440261 "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date-type (clojure.core/get-in letvar440261 ["LastModifiedDate"])))))))

(clojure.core/defn- response-list-identity-pools-response ([input] (response-list-identity-pools-response nil input)) ([resultWrapper440263 input] (clojure.core/let [rawinput440262 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440264 {"IdentityPools" (rawinput440262 "IdentityPools"), "NextToken" (rawinput440262 "NextToken")}] (clojure.core/cond-> {} (letvar440264 "IdentityPools") (clojure.core/assoc :identity-pools (deser-identity-pools-list (clojure.core/get-in letvar440264 ["IdentityPools"]))) (letvar440264 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar440264 ["NextToken"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper440266 input] (clojure.core/let [rawinput440265 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440267 {"message" (rawinput440265 "message")}] (clojure.core/cond-> {} (letvar440267 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440267 ["message"])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper440269 input] (clojure.core/let [rawinput440268 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440270 {"message" (rawinput440268 "message")}] (clojure.core/cond-> {} (letvar440270 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440270 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper440272 input] (clojure.core/let [rawinput440271 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440273 {"message" (rawinput440271 "message")}] (clojure.core/cond-> {} (letvar440273 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440273 ["message"])))))))

(clojure.core/defn- response-identity-pool ([input] (response-identity-pool nil input)) ([resultWrapper440275 input] (clojure.core/let [rawinput440274 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440276 {"IdentityPoolId" (rawinput440274 "IdentityPoolId"), "IdentityPoolName" (rawinput440274 "IdentityPoolName"), "AllowUnauthenticatedIdentities" (rawinput440274 "AllowUnauthenticatedIdentities"), "SupportedLoginProviders" (rawinput440274 "SupportedLoginProviders"), "DeveloperProviderName" (rawinput440274 "DeveloperProviderName"), "OpenIdConnectProviderARNs" (rawinput440274 "OpenIdConnectProviderARNs"), "CognitoIdentityProviders" (rawinput440274 "CognitoIdentityProviders"), "SamlProviderARNs" (rawinput440274 "SamlProviderARNs")}] (clojure.core/cond-> {:identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar440276 ["IdentityPoolId"])), :identity-pool-name (deser-identity-pool-name (clojure.core/get-in letvar440276 ["IdentityPoolName"])), :allow-unauthenticated-identities (deser-identity-pool-unauthenticated (clojure.core/get-in letvar440276 ["AllowUnauthenticatedIdentities"]))} (letvar440276 "SupportedLoginProviders") (clojure.core/assoc :supported-login-providers (deser-identity-providers (clojure.core/get-in letvar440276 ["SupportedLoginProviders"]))) (letvar440276 "DeveloperProviderName") (clojure.core/assoc :developer-provider-name (deser-developer-provider-name (clojure.core/get-in letvar440276 ["DeveloperProviderName"]))) (letvar440276 "OpenIdConnectProviderARNs") (clojure.core/assoc :open-id-connect-provider-ar-ns (deser-oidc-provider-list (clojure.core/get-in letvar440276 ["OpenIdConnectProviderARNs"]))) (letvar440276 "CognitoIdentityProviders") (clojure.core/assoc :cognito-identity-providers (deser-cognito-identity-provider-list (clojure.core/get-in letvar440276 ["CognitoIdentityProviders"]))) (letvar440276 "SamlProviderARNs") (clojure.core/assoc :saml-provider-ar-ns (deser-saml-provider-list (clojure.core/get-in letvar440276 ["SamlProviderARNs"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper440278 input] (clojure.core/let [rawinput440277 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440279 {"message" (rawinput440277 "message")}] (clojure.core/cond-> {} (letvar440279 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440279 ["message"])))))))

(clojure.core/defn- response-list-identities-response ([input] (response-list-identities-response nil input)) ([resultWrapper440281 input] (clojure.core/let [rawinput440280 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440282 {"IdentityPoolId" (rawinput440280 "IdentityPoolId"), "Identities" (rawinput440280 "Identities"), "NextToken" (rawinput440280 "NextToken")}] (clojure.core/cond-> {} (letvar440282 "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar440282 ["IdentityPoolId"]))) (letvar440282 "Identities") (clojure.core/assoc :identities (deser-identities-list (clojure.core/get-in letvar440282 ["Identities"]))) (letvar440282 "NextToken") (clojure.core/assoc :next-token (deser-pagination-key (clojure.core/get-in letvar440282 ["NextToken"])))))))

(clojure.core/defn- response-external-service-exception ([input] (response-external-service-exception nil input)) ([resultWrapper440284 input] (clojure.core/let [rawinput440283 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440285 {"message" (rawinput440283 "message")}] (clojure.core/cond-> {} (letvar440285 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440285 ["message"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper440287 input] (clojure.core/let [rawinput440286 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440288 {"message" (rawinput440286 "message")}] (clojure.core/cond-> {} (letvar440288 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440288 ["message"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper440290 input] (clojure.core/let [rawinput440289 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440291 {"message" (rawinput440289 "message")}] (clojure.core/cond-> {} (letvar440291 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar440291 ["message"])))))))

(clojure.core/defn- response-merge-developer-identities-response ([input] (response-merge-developer-identities-response nil input)) ([resultWrapper440293 input] (clojure.core/let [rawinput440292 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440294 {"IdentityId" (rawinput440292 "IdentityId")}] (clojure.core/cond-> {} (letvar440294 "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (clojure.core/get-in letvar440294 ["IdentityId"])))))))

(clojure.core/defn- response-get-identity-pool-roles-response ([input] (response-get-identity-pool-roles-response nil input)) ([resultWrapper440296 input] (clojure.core/let [rawinput440295 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar440297 {"IdentityPoolId" (rawinput440295 "IdentityPoolId"), "Roles" (rawinput440295 "Roles"), "RoleMappings" (rawinput440295 "RoleMappings")}] (clojure.core/cond-> {} (letvar440297 "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar440297 ["IdentityPoolId"]))) (letvar440297 "Roles") (clojure.core/assoc :roles (deser-roles-map (clojure.core/get-in letvar440297 ["Roles"]))) (letvar440297 "RoleMappings") (clojure.core/assoc :role-mappings (deser-role-mapping-map (clojure.core/get-in letvar440297 ["RoleMappings"])))))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-input/max-results (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-input/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/list-identity-pools-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-input/max-results] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.lookup-developer-identity-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/lookup-developer-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier-list :portkey.aws.cognito-identity.-2014-06-30.lookup-developer-identity-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/delete-identity-pool-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-response/token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/oidc-token))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-response/token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/logins-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/identity-provider-name))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-id-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/pagination-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.delete-identities-response/unprocessed-identity-ids (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/unprocessed-identity-id-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/delete-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.delete-identities-response/unprocessed-identity-ids]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/oidc-provider-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/arn-string))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.invalid-identity-pool-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/invalid-identity-pool-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.invalid-identity-pool-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-identity-pool-roles-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-pool-unauthenticated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/saml-provider-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/arn-string))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.developer-user-already-registered-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/developer-user-already-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.developer-user-already-registered-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-credentials-for-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30/credentials]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-id-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-id-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/account-id :portkey.aws.cognito-identity.-2014-06-30.get-id-input/logins]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/claim-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/query-limit (clojure.spec.alpha/int-in 1 60))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/developer-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w._-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-for-developer-identity-response/token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/oidc-token))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-for-developer-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-for-developer-identity-response/token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.set-identity-pool-roles-input/roles (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/roles-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.set-identity-pool-roles-input/role-mappings (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/role-mapping-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/set-identity-pool-roles-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30.set-identity-pool-roles-input/roles] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.set-identity-pool-roles-input/role-mappings]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-input/logins]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-credentials-for-identity-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-credentials-for-identity-input/custom-role-arn (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/arn-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-credentials-for-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.get-credentials-for-identity-input/logins :portkey.aws.cognito-identity.-2014-06-30.get-credentials-for-identity-input/custom-role-arn]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-token-check clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/hide-disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.unlink-identity-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.unlink-identity-input/logins-to-remove (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/unlink-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30.unlink-identity-input/logins :portkey.aws.cognito-identity.-2014-06-30.unlink-identity-input/logins-to-remove] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.role-mapping/type (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/role-mapping-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.role-mapping/ambiguous-role-resolution (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/ambiguous-role-resolution-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.role-mapping/rules-configuration (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/rules-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/role-mapping (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30.role-mapping/type] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.role-mapping/ambiguous-role-resolution :portkey.aws.cognito-identity.-2014-06-30.role-mapping/rules-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-description/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-description/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30.identity-description/logins :portkey.aws.cognito-identity.-2014-06-30.identity-description/creation-date :portkey.aws.cognito-identity.-2014-06-30.identity-description/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 55)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/describe-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-response/identity-pools (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-pools-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/list-identity-pools-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-response/identity-pools :portkey.aws.cognito-identity.-2014-06-30.list-identity-pools-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.merge-developer-identities-input/source-user-identifier (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.merge-developer-identities-input/destination-user-identifier (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/merge-developer-identities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30.merge-developer-identities-input/source-user-identifier :portkey.aws.cognito-identity.-2014-06-30.merge-developer-identities-input/destination-user-identifier :portkey.aws.cognito-identity.-2014-06-30/developer-provider-name :portkey.aws.cognito-identity.-2014-06-30/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/claim-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 55)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-for-developer-identity-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-for-developer-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30.get-open-id-token-for-developer-identity-input/logins] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30/token-duration]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/token-duration clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w._:/-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/error-code #{"AccessDenied" :internal-server-error "InternalServerError" :access-denied})

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/role-mapping-map (clojure.spec.alpha/map-of :portkey.aws.cognito-identity.-2014-06-30/identity-provider-name :portkey.aws.cognito-identity.-2014-06-30/role-mapping))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w_]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/access-key-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.credentials/secret-key (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/secret-key-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.credentials/session-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/session-token-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.credentials/expiration (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/credentials (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.credentials/access-key-id :portkey.aws.cognito-identity.-2014-06-30.credentials/secret-key :portkey.aws.cognito-identity.-2014-06-30.credentials/session-token :portkey.aws.cognito-identity.-2014-06-30.credentials/expiration]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/unlink-developer-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30/developer-provider-name :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/unprocessed-identity-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30/error-code]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-pool-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w ]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identities-input/max-results (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identities-input/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/list-identities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30.list-identities-input/max-results] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.list-identities-input/next-token :portkey.aws.cognito-identity.-2014-06-30/hide-disabled]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-provider-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w.;_/-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/role-mapping-type #{:rules :token "Rules" "Token"})

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/claim (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/claim-name))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/match-type (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/mapping-rule-match-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/value (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/claim-value))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/arn-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/mapping-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30.mapping-rule/claim :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/match-type :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/value :portkey.aws.cognito-identity.-2014-06-30.mapping-rule/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/secret-key-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 15)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\d+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/mapping-rules-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/mapping-rule :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-pool/allow-unauthenticated-identities (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-pool-unauthenticated))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-pool/supported-login-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-providers))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-pool/open-id-connect-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/oidc-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-pool/cognito-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.identity-pool/saml-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/saml-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-pool (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30/identity-pool-name :portkey.aws.cognito-identity.-2014-06-30.identity-pool/allow-unauthenticated-identities] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.identity-pool/supported-login-providers :portkey.aws.cognito-identity.-2014-06-30/developer-provider-name :portkey.aws.cognito-identity.-2014-06-30.identity-pool/open-id-connect-provider-ar-ns :portkey.aws.cognito-identity.-2014-06-30.identity-pool/cognito-identity-providers :portkey.aws.cognito-identity.-2014-06-30.identity-pool/saml-provider-ar-ns]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/unprocessed-identity-id-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/unprocessed-identity-id :max-count 60))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/arn-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-pools-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/identity-pool-short-description))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/allow-unauthenticated-identities (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-pool-unauthenticated))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/supported-login-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-providers))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/open-id-connect-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/oidc-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/cognito-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/saml-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/saml-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/create-identity-pool-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-name :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/allow-unauthenticated-identities] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/supported-login-providers :portkey.aws.cognito-identity.-2014-06-30/developer-provider-name :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/open-id-connect-provider-ar-ns :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/cognito-identity-providers :portkey.aws.cognito-identity.-2014-06-30.create-identity-pool-input/saml-provider-ar-ns]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identities-response/identities (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identities-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.list-identities-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/list-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30.list-identities-response/identities :portkey.aws.cognito-identity.-2014-06-30.list-identities-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-pool-short-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30/identity-pool-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.external-service-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/external-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.external-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.delete-identities-input/identity-ids-to-delete (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-id-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/delete-identities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30.delete-identities-input/identity-ids-to-delete] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.rules-configuration-type/rules (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/mapping-rules-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/rules-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30.rules-configuration-type/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/oidc-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/logins-map (clojure.spec.alpha/map-of :portkey.aws.cognito-identity.-2014-06-30/identity-provider-name :portkey.aws.cognito-identity.-2014-06-30/identity-provider-token))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/describe-identity-pool-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/session-token-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identities-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/identity-description))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-providers (clojure.spec.alpha/map-of :portkey.aws.cognito-identity.-2014-06-30/identity-provider-name :portkey.aws.cognito-identity.-2014-06-30/identity-provider-id))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.cognito-identity-provider/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-name))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.cognito-identity-provider/client-id (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-client-id))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.cognito-identity-provider/server-side-token-check (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider-token-check))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/cognito-identity-provider (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.cognito-identity-provider/provider-name :portkey.aws.cognito-identity.-2014-06-30.cognito-identity-provider/client-id :portkey.aws.cognito-identity.-2014-06-30.cognito-identity-provider/server-side-token-check]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/roles-map (clojure.spec.alpha/map-of :portkey.aws.cognito-identity.-2014-06-30/role-type :portkey.aws.cognito-identity.-2014-06-30/arn-string))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-provider-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/identity-id-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity.-2014-06-30/identity-id :min-count 1 :max-count 60))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/access-key-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/mapping-rule-match-type #{:starts-with "NotEqual" "StartsWith" :contains "Contains" :equals :not-equal "Equals"})

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/merge-developer-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.lookup-developer-identity-input/max-results (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.lookup-developer-identity-input/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/lookup-developer-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-id :portkey.aws.cognito-identity.-2014-06-30/developer-user-identifier :portkey.aws.cognito-identity.-2014-06-30.lookup-developer-identity-input/max-results :portkey.aws.cognito-identity.-2014-06-30.lookup-developer-identity-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/ambiguous-role-resolution-type #{:authenticated-role "AuthenticatedRole" "Deny" :deny})

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/role-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(un)?authenticated" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-identity-pool-roles-response/roles (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/roles-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30.get-identity-pool-roles-response/role-mappings (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/role-mapping-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.-2014-06-30/get-identity-pool-roles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.-2014-06-30/identity-pool-id :portkey.aws.cognito-identity.-2014-06-30.get-identity-pool-roles-response/roles :portkey.aws.cognito-identity.-2014-06-30.get-identity-pool-roles-response/role-mappings]))

(clojure.core/defn get-credentials-for-identity "Returns credentials for the provided identity ID. Any provided logins will be\nvalidated against supported login providers. If the token is for\ncognito-identity.amazonaws.com, it will be passed through to AWS Security Token\nService with the appropriate role for the token.\n This is a public API. You do not need any credentials to call this API." ([get-credentials-for-identity-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-credentials-for-identity-input get-credentials-for-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/get-credentials-for-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/get-credentials-for-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCredentialsForIdentity", :http.request.configuration/output-deser-fn response-get-credentials-for-identity-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InvalidIdentityPoolConfigurationException" :portkey.aws.cognito-identity.-2014-06-30/invalid-identity-pool-configuration-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "ExternalServiceException" :portkey.aws.cognito-identity.-2014-06-30/external-service-exception}})))))
(clojure.spec.alpha/fdef get-credentials-for-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/get-credentials-for-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/get-credentials-for-identity-response))

(clojure.core/defn delete-identities "Deletes identities from an identity pool. You can specify a list of 1-60\nidentities that you want to delete.\n You must use AWS Developer credentials to call this API." ([delete-identities-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-identities-input delete-identities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/delete-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/delete-identities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIdentities", :http.request.configuration/output-deser-fn response-delete-identities-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-identities :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/delete-identities-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/delete-identities-response))

(clojure.core/defn describe-identity "Returns metadata related to the given identity, including when the identity was\ncreated and any associated linked logins.\n You must use AWS Developer credentials to call this API." ([describe-identity-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-identity-input describe-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/identity-description, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/describe-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentity", :http.request.configuration/output-deser-fn response-identity-description, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/describe-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-description))

(clojure.core/defn get-id "Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an\nimplicit linked account.\n This is a public API. You do not need any credentials to call this API." ([get-id-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-id-input get-id-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/get-id-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/get-id-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetId", :http.request.configuration/output-deser-fn response-get-id-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "LimitExceededException" :portkey.aws.cognito-identity.-2014-06-30/limit-exceeded-exception, "ExternalServiceException" :portkey.aws.cognito-identity.-2014-06-30/external-service-exception}})))))
(clojure.spec.alpha/fdef get-id :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/get-id-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/get-id-response))

(clojure.core/defn delete-identity-pool "Deletes a user pool. Once a pool is deleted, users will not be able to\nauthenticate with the pool.\n You must use AWS Developer credentials to call this API." ([delete-identity-pool-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-identity-pool-input delete-identity-pool-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/delete-identity-pool-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIdentityPool", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/delete-identity-pool-input) :ret clojure.core/true?)

(clojure.core/defn list-identity-pools "Lists all of the Cognito identity pools registered for your account.\n You must use AWS Developer credentials to call this API." ([list-identity-pools-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-identity-pools-input list-identity-pools-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/list-identity-pools-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/list-identity-pools-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIdentityPools", :http.request.configuration/output-deser-fn response-list-identity-pools-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-identity-pools :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/list-identity-pools-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/list-identity-pools-response))

(clojure.core/defn get-open-id-token-for-developer-identity "Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a\nuser authenticated by your backend authentication process. Supplying multiple\nlogins will create an implicit linked account. You can only specify one\ndeveloper provider as part of the Logins map, which is linked to the identity\npool. The developer provider is the \"domain\" by which Cognito will refer to your\nusers.\n You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to\nlink new logins (that is, user credentials issued by a public provider or\ndeveloper provider) to an existing identity. When you want to create a new\nidentity, the IdentityId should be null. When you want to associate a new login\nwith an existing authenticated/unauthenticated identity, you can do so by\nproviding the existing IdentityId. This API will create the identity in the\nspecified IdentityPoolId.\n You must use AWS Developer credentials to call this API." ([get-open-id-token-for-developer-identity-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-open-id-token-for-developer-identity-input get-open-id-token-for-developer-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-for-developer-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-for-developer-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetOpenIdTokenForDeveloperIdentity", :http.request.configuration/output-deser-fn response-get-open-id-token-for-developer-identity-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "DeveloperUserAlreadyRegisteredException" :portkey.aws.cognito-identity.-2014-06-30/developer-user-already-registered-exception}})))))
(clojure.spec.alpha/fdef get-open-id-token-for-developer-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-for-developer-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-for-developer-identity-response))

(clojure.core/defn create-identity-pool "Creates a new identity pool. The identity pool is a store of user identity\ninformation that is specific to your AWS account. The limit on identity pools is\n60 per account. The keys for SupportedLoginProviders are as follows:\n * Facebook: graph.facebook.com\n * Google: accounts.google.com\n * Amazon: www.amazon.com\n * Twitter: api.twitter.com\n * Digits: www.digits.com\n You must use AWS Developer credentials to call this API." ([create-identity-pool-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-identity-pool-input create-identity-pool-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/identity-pool, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/create-identity-pool-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIdentityPool", :http.request.configuration/output-deser-fn response-identity-pool, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "LimitExceededException" :portkey.aws.cognito-identity.-2014-06-30/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/create-identity-pool-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-pool))

(clojure.core/defn lookup-developer-identity "Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list\nof DeveloperUserIdentifiers associated with an IdentityId for an existing\nidentity. Either IdentityID or DeveloperUserIdentifier must not be null. If you\nsupply only one of these values, the other value will be searched in the\ndatabase and returned as a part of the response. If you supply both,\nDeveloperUserIdentifier will be matched against IdentityID. If the values are\nverified against the database, the response returns both values and is the same\nas the request. Otherwise a ResourceConflictException is thrown.\n You must use AWS Developer credentials to call this API." ([lookup-developer-identity-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-lookup-developer-identity-input lookup-developer-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/lookup-developer-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/lookup-developer-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LookupDeveloperIdentity", :http.request.configuration/output-deser-fn response-lookup-developer-identity-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef lookup-developer-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/lookup-developer-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/lookup-developer-identity-response))

(clojure.core/defn set-identity-pool-roles "Sets the roles for an identity pool. These roles are used when making calls to\nGetCredentialsForIdentity action.\n You must use AWS Developer credentials to call this API." ([set-identity-pool-roles-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-identity-pool-roles-input set-identity-pool-roles-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/set-identity-pool-roles-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetIdentityPoolRoles", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "ConcurrentModificationException" :portkey.aws.cognito-identity.-2014-06-30/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef set-identity-pool-roles :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/set-identity-pool-roles-input) :ret clojure.core/true?)

(clojure.core/defn list-identities "Lists the identities in a pool.\n You must use AWS Developer credentials to call this API." ([list-identities-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-identities-input list-identities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/list-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/list-identities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIdentities", :http.request.configuration/output-deser-fn response-list-identities-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-identities :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/list-identities-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/list-identities-response))

(clojure.core/defn get-identity-pool-roles "Gets the roles for an identity pool.\n You must use AWS Developer credentials to call this API." ([get-identity-pool-roles-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-identity-pool-roles-input get-identity-pool-roles-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/get-identity-pool-roles-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/get-identity-pool-roles-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIdentityPoolRoles", :http.request.configuration/output-deser-fn response-get-identity-pool-roles-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-identity-pool-roles :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/get-identity-pool-roles-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/get-identity-pool-roles-response))

(clojure.core/defn merge-developer-identities "Merges two users having different IdentityIds, existing in the same identity\npool, and identified by the same developer provider. You can use this action to\nrequest that discrete users be merged and identified as a single user in the\nCognito environment. Cognito associates the given source user\n(SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier.\nOnly developer-authenticated users can be merged. If the users to be merged are\nassociated with the same public provider, but as two different users, an\nexception will be thrown.\n You must use AWS Developer credentials to call this API." ([merge-developer-identities-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-merge-developer-identities-input merge-developer-identities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/merge-developer-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/merge-developer-identities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MergeDeveloperIdentities", :http.request.configuration/output-deser-fn response-merge-developer-identities-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef merge-developer-identities :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/merge-developer-identities-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/merge-developer-identities-response))

(clojure.core/defn get-open-id-token "Gets an OpenID token, using a known Cognito ID. This known Cognito ID is\nreturned by GetId. You can optionally add additional logins for the identity.\nSupplying multiple logins creates an implicit link.\n The OpenId token is valid for 15 minutes.\n This is a public API. You do not need any credentials to call this API." ([get-open-id-token-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-open-id-token-input get-open-id-token-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetOpenIdToken", :http.request.configuration/output-deser-fn response-get-open-id-token-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "ExternalServiceException" :portkey.aws.cognito-identity.-2014-06-30/external-service-exception}})))))
(clojure.spec.alpha/fdef get-open-id-token :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/get-open-id-token-response))

(clojure.core/defn unlink-identity "Unlinks a federated identity from an existing account. Unlinked logins will be\nconsidered new identities next time they are seen. Removing the last linked\nlogin will make this identity inaccessible.\n This is a public API. You do not need any credentials to call this API." ([unlink-identity-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-unlink-identity-input unlink-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/unlink-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnlinkIdentity", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "ExternalServiceException" :portkey.aws.cognito-identity.-2014-06-30/external-service-exception}})))))
(clojure.spec.alpha/fdef unlink-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/unlink-identity-input) :ret clojure.core/true?)

(clojure.core/defn update-identity-pool "Updates a user pool.\n You must use AWS Developer credentials to call this API." ([identity-poolinput] (clojure.core/let [request-function-result__22119__auto__ (req-identity-pool identity-poolinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/identity-pool, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/identity-pool, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateIdentityPool", :http.request.configuration/output-deser-fn response-identity-pool, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception, "ConcurrentModificationException" :portkey.aws.cognito-identity.-2014-06-30/concurrent-modification-exception, "LimitExceededException" :portkey.aws.cognito-identity.-2014-06-30/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/identity-pool) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-pool))

(clojure.core/defn unlink-developer-identity "Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer\nusers will be considered new identities next time they are seen. If, for a given\nCognito identity, you remove all federated identities as well as the developer\nuser identifier, the Cognito identity becomes inaccessible.\n You must use AWS Developer credentials to call this API." ([unlink-developer-identity-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-unlink-developer-identity-input unlink-developer-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/unlink-developer-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnlinkDeveloperIdentity", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity.-2014-06-30/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef unlink-developer-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/unlink-developer-identity-input) :ret clojure.core/true?)

(clojure.core/defn describe-identity-pool "Gets details about a particular identity pool, including the pool name, ID\ndescription, creation date, and current number of users.\n You must use AWS Developer credentials to call this API." ([describe-identity-pool-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-identity-pool-input describe-identity-pool-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity.-2014-06-30/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity.-2014-06-30/identity-pool, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity.-2014-06-30/describe-identity-pool-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentityPool", :http.request.configuration/output-deser-fn response-identity-pool, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity.-2014-06-30/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity.-2014-06-30/describe-identity-pool-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity.-2014-06-30/identity-pool))
