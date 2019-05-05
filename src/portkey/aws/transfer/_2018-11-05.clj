(ns portkey.aws.transfer.-2018-11-05 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "transfer", :region "ap-northeast-1"},
    :ssl-common-name "transfer.ap-northeast-1.amazonaws.com",
    :endpoint "https://transfer.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "transfer", :region "eu-west-1"},
    :ssl-common-name "transfer.eu-west-1.amazonaws.com",
    :endpoint "https://transfer.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "transfer", :region "us-east-2"},
    :ssl-common-name "transfer.us-east-2.amazonaws.com",
    :endpoint "https://transfer.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "transfer", :region "ap-southeast-2"},
    :ssl-common-name "transfer.ap-southeast-2.amazonaws.com",
    :endpoint "https://transfer.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "transfer", :region "ap-southeast-1"},
    :ssl-common-name "transfer.ap-southeast-1.amazonaws.com",
    :endpoint "https://transfer.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "transfer", :region "ap-northeast-2"},
    :ssl-common-name "transfer.ap-northeast-2.amazonaws.com",
    :endpoint "https://transfer.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "transfer", :region "eu-west-3"},
    :ssl-common-name "transfer.eu-west-3.amazonaws.com",
    :endpoint "https://transfer.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "transfer", :region "ca-central-1"},
    :ssl-common-name "transfer.ca-central-1.amazonaws.com",
    :endpoint "https://transfer.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "transfer", :region "eu-central-1"},
    :ssl-common-name "transfer.eu-central-1.amazonaws.com",
    :endpoint "https://transfer.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "transfer", :region "eu-west-2"},
    :ssl-common-name "transfer.eu-west-2.amazonaws.com",
    :endpoint "https://transfer.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "transfer", :region "us-west-2"},
    :ssl-common-name "transfer.us-west-2.amazonaws.com",
    :endpoint "https://transfer.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "transfer", :region "us-east-1"},
    :ssl-common-name "transfer.us-east-1.amazonaws.com",
    :endpoint "https://transfer.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "transfer", :region "us-west-1"},
    :ssl-common-name "transfer.us-west-1.amazonaws.com",
    :endpoint "https://transfer.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "transfer", :region "ap-south-1"},
    :ssl-common-name "transfer.ap-south-1.amazonaws.com",
    :endpoint "https://transfer.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-ssh-public-key-body)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-nullable-role)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-home-directory)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-identity-provider-details)

(clojure.core/declare ser-user-name)

(clojure.core/declare ser-ssh-public-key-id)

(clojure.core/declare ser-role)

(clojure.core/declare ser-url)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-identity-provider-type)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-user-password)

(clojure.core/declare ser-server-id)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-ssh-public-key-body [input] #:http.request.field{:value input, :shape "SshPublicKeyBody"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-nullable-role [input] #:http.request.field{:value input, :shape "NullableRole"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-home-directory [input] #:http.request.field{:value input, :shape "HomeDirectory"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-identity-provider-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IdentityProviderDetails", :type "structure"} (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :url)) #:http.request.field{:name "Url", :shape "Url"})) (clojure.core/contains? input :invocation-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :invocation-role)) #:http.request.field{:name "InvocationRole", :shape "Role"}))))

(clojure.core/defn- ser-user-name [input] #:http.request.field{:value input, :shape "UserName"})

(clojure.core/defn- ser-ssh-public-key-id [input] #:http.request.field{:value input, :shape "SshPublicKeyId"})

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-url [input] #:http.request.field{:value input, :shape "Url"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-identity-provider-type [input] #:http.request.field{:value (clojure.core/get {"SERVICE_MANAGED" "SERVICE_MANAGED", :service-managed "SERVICE_MANAGED", "API_GATEWAY" "API_GATEWAY", :api-gateway "API_GATEWAY"} input), :shape "IdentityProviderType"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-policy [input] #:http.request.field{:value input, :shape "Policy"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-user-password [input] #:http.request.field{:value input, :shape "UserPassword"})

(clojure.core/defn- ser-server-id [input] #:http.request.field{:value input, :shape "ServerId"})

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]} (clojure.core/contains? input :home-directory) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-home-directory (input :home-directory)) #:http.request.field{:name "HomeDirectory", :shape "HomeDirectory"})) (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}))))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-import-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-ssh-public-key-body (input :ssh-public-key-body)) #:http.request.field{:name "SshPublicKeyBody", :shape "SshPublicKeyBody"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]}))

(clojure.core/defn- req-stop-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-servers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-start-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]}))

(clojure.core/defn- req-delete-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"})]}))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]} (clojure.core/contains? input :home-directory) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-home-directory (input :home-directory)) #:http.request.field{:name "HomeDirectory", :shape "HomeDirectory"})) (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})) (clojure.core/contains? input :ssh-public-key-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssh-public-key-body (input :ssh-public-key-body)) #:http.request.field{:name "SshPublicKeyBody", :shape "SshPublicKeyBody"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-create-server-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :identity-provider-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-provider-details (input :identity-provider-details)) #:http.request.field{:name "IdentityProviderDetails", :shape "IdentityProviderDetails"})) (clojure.core/contains? input :identity-provider-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-provider-type (input :identity-provider-type)) #:http.request.field{:name "IdentityProviderType", :shape "IdentityProviderType"})) (clojure.core/contains? input :logging-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :logging-role)) #:http.request.field{:name "LoggingRole", :shape "Role"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-test-identity-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]} (clojure.core/contains? input :user-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-password (input :user-password)) #:http.request.field{:name "UserPassword", :shape "UserPassword"}))))

(clojure.core/defn- req-delete-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-ssh-public-key-id (input :ssh-public-key-id)) #:http.request.field{:name "SshPublicKeyId", :shape "SshPublicKeyId"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"}) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})]}))

(clojure.core/defn- req-update-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"})]} (clojure.core/contains? input :identity-provider-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-provider-details (input :identity-provider-details)) #:http.request.field{:name "IdentityProviderDetails", :shape "IdentityProviderDetails"})) (clojure.core/contains? input :logging-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-role (input :logging-role)) #:http.request.field{:name "LoggingRole", :shape "NullableRole"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-describe-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "ServerId", :shape "ServerId"})]}))

(clojure.core/declare deser-ssh-public-key-count)

(clojure.core/declare deser-ssh-public-key-body)

(clojure.core/declare deser-status-code)

(clojure.core/declare deser-ssh-public-key)

(clojure.core/declare deser-date-imported)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-listed-servers)

(clojure.core/declare deser-home-directory)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-identity-provider-details)

(clojure.core/declare deser-user-name)

(clojure.core/declare deser-ssh-public-key-id)

(clojure.core/declare deser-role)

(clojure.core/declare deser-ssh-public-keys)

(clojure.core/declare deser-described-server)

(clojure.core/declare deser-url)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-message)

(clojure.core/declare deser-service-error-message)

(clojure.core/declare deser-identity-provider-type)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-described-user)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-state)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-listed-users)

(clojure.core/declare deser-user-count)

(clojure.core/declare deser-server-id)

(clojure.core/declare deser-listed-user)

(clojure.core/declare deser-listed-server)

(clojure.core/defn- deser-ssh-public-key-count [input] input)

(clojure.core/defn- deser-ssh-public-key-body [input] input)

(clojure.core/defn- deser-status-code [input] input)

(clojure.core/defn- deser-ssh-public-key [input] (clojure.core/cond-> {:date-imported (deser-date-imported (input "DateImported")), :ssh-public-key-body (deser-ssh-public-key-body (input "SshPublicKeyBody")), :ssh-public-key-id (deser-ssh-public-key-id (input "SshPublicKeyId"))}))

(clojure.core/defn- deser-date-imported [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-listed-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listed-server coll))) input))

(clojure.core/defn- deser-home-directory [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-identity-provider-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-url (input "Url"))) (clojure.core/contains? input "InvocationRole") (clojure.core/assoc :invocation-role (deser-role (input "InvocationRole")))))

(clojure.core/defn- deser-user-name [input] input)

(clojure.core/defn- deser-ssh-public-key-id [input] input)

(clojure.core/defn- deser-role [input] input)

(clojure.core/defn- deser-ssh-public-keys [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssh-public-key coll))) input))

(clojure.core/defn- deser-described-server [input] (clojure.core/cond-> {:arn (deser-arn (input "Arn"))} (clojure.core/contains? input "IdentityProviderDetails") (clojure.core/assoc :identity-provider-details (deser-identity-provider-details (input "IdentityProviderDetails"))) (clojure.core/contains? input "IdentityProviderType") (clojure.core/assoc :identity-provider-type (deser-identity-provider-type (input "IdentityProviderType"))) (clojure.core/contains? input "LoggingRole") (clojure.core/assoc :logging-role (deser-role (input "LoggingRole"))) (clojure.core/contains? input "ServerId") (clojure.core/assoc :server-id (deser-server-id (input "ServerId"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-state (input "State"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "UserCount") (clojure.core/assoc :user-count (deser-user-count (input "UserCount")))))

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-service-error-message [input] input)

(clojure.core/defn- deser-identity-provider-type [input] (clojure.core/get {"SERVICE_MANAGED" :service-managed, "API_GATEWAY" :api-gateway} input))

(clojure.core/defn- deser-resource-type [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-described-user [input] (clojure.core/cond-> {:arn (deser-arn (input "Arn"))} (clojure.core/contains? input "HomeDirectory") (clojure.core/assoc :home-directory (deser-home-directory (input "HomeDirectory"))) (clojure.core/contains? input "Policy") (clojure.core/assoc :policy (deser-policy (input "Policy"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role (input "Role"))) (clojure.core/contains? input "SshPublicKeys") (clojure.core/assoc :ssh-public-keys (deser-ssh-public-keys (input "SshPublicKeys"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-user-name (input "UserName")))))

(clojure.core/defn- deser-policy [input] input)

(clojure.core/defn- deser-state [input] (clojure.core/get {"OFFLINE" :offline, "ONLINE" :online, "STARTING" :starting, "STOPPING" :stopping, "START_FAILED" :start-failed, "STOP_FAILED" :stop-failed} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-resource [input] input)

(clojure.core/defn- deser-listed-users [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listed-user coll))) input))

(clojure.core/defn- deser-user-count [input] input)

(clojure.core/defn- deser-server-id [input] input)

(clojure.core/defn- deser-listed-user [input] (clojure.core/cond-> {:arn (deser-arn (input "Arn"))} (clojure.core/contains? input "HomeDirectory") (clojure.core/assoc :home-directory (deser-home-directory (input "HomeDirectory"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role (input "Role"))) (clojure.core/contains? input "SshPublicKeyCount") (clojure.core/assoc :ssh-public-key-count (deser-ssh-public-key-count (input "SshPublicKeyCount"))) (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-user-name (input "UserName")))))

(clojure.core/defn- deser-listed-server [input] (clojure.core/cond-> {:arn (deser-arn (input "Arn"))} (clojure.core/contains? input "IdentityProviderType") (clojure.core/assoc :identity-provider-type (deser-identity-provider-type (input "IdentityProviderType"))) (clojure.core/contains? input "LoggingRole") (clojure.core/assoc :logging-role (deser-role (input "LoggingRole"))) (clojure.core/contains? input "ServerId") (clojure.core/assoc :server-id (deser-server-id (input "ServerId"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-state (input "State"))) (clojure.core/contains? input "UserCount") (clojure.core/assoc :user-count (deser-user-count (input "UserCount")))))

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper2127350 input] (clojure.core/let [rawinput2127349 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127351 {"ServerId" (rawinput2127349 "ServerId"), "UserName" (rawinput2127349 "UserName")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127351 ["ServerId"])), :user-name (deser-user-name (clojure.core/get-in letvar2127351 ["UserName"]))}))))

(clojure.core/defn- response-list-servers-response ([input] (response-list-servers-response nil input)) ([resultWrapper2127353 input] (clojure.core/let [rawinput2127352 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127354 {"NextToken" (rawinput2127352 "NextToken"), "Servers" (rawinput2127352 "Servers")}] (clojure.core/cond-> {:servers (deser-listed-servers (clojure.core/get-in letvar2127354 ["Servers"]))} (letvar2127354 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2127354 ["NextToken"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper2127356 input] (clojure.core/let [rawinput2127355 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127357 {"Message" (rawinput2127355 "Message")}] (clojure.core/cond-> {:message (deser-message (clojure.core/get-in letvar2127357 ["Message"]))}))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper2127359 input] (clojure.core/let [rawinput2127358 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127360 {"Arn" (rawinput2127358 "Arn"), "NextToken" (rawinput2127358 "NextToken"), "Tags" (rawinput2127358 "Tags")}] (clojure.core/cond-> {} (letvar2127360 "Arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar2127360 ["Arn"]))) (letvar2127360 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2127360 ["NextToken"]))) (letvar2127360 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2127360 ["Tags"])))))))

(clojure.core/defn- response-internal-service-error ([input] (response-internal-service-error nil input)) ([resultWrapper2127362 input] (clojure.core/let [rawinput2127361 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127363 {"Message" (rawinput2127361 "Message")}] (clojure.core/cond-> {:message (deser-message (clojure.core/get-in letvar2127363 ["Message"]))}))))

(clojure.core/defn- response-resource-exists-exception ([input] (response-resource-exists-exception nil input)) ([resultWrapper2127365 input] (clojure.core/let [rawinput2127364 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127366 {"Message" (rawinput2127364 "Message"), "Resource" (rawinput2127364 "Resource"), "ResourceType" (rawinput2127364 "ResourceType")}] (clojure.core/cond-> {:message (deser-message (clojure.core/get-in letvar2127366 ["Message"])), :resource (deser-resource (clojure.core/get-in letvar2127366 ["Resource"])), :resource-type (deser-resource-type (clojure.core/get-in letvar2127366 ["ResourceType"]))}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper2127368 input] (clojure.core/let [rawinput2127367 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127369 {"Message" (rawinput2127367 "Message")}] (clojure.core/cond-> {} (letvar2127369 "Message") (clojure.core/assoc :message (deser-service-error-message (clojure.core/get-in letvar2127369 ["Message"])))))))

(clojure.core/defn- response-update-user-response ([input] (response-update-user-response nil input)) ([resultWrapper2127371 input] (clojure.core/let [rawinput2127370 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127372 {"ServerId" (rawinput2127370 "ServerId"), "UserName" (rawinput2127370 "UserName")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127372 ["ServerId"])), :user-name (deser-user-name (clojure.core/get-in letvar2127372 ["UserName"]))}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper2127374 input] (clojure.core/let [rawinput2127373 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127375 {"Message" (rawinput2127373 "Message")}] (clojure.core/cond-> {:message (deser-message (clojure.core/get-in letvar2127375 ["Message"]))}))))

(clojure.core/defn- response-update-server-response ([input] (response-update-server-response nil input)) ([resultWrapper2127377 input] (clojure.core/let [rawinput2127376 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127378 {"ServerId" (rawinput2127376 "ServerId")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127378 ["ServerId"]))}))))

(clojure.core/defn- response-describe-user-response ([input] (response-describe-user-response nil input)) ([resultWrapper2127380 input] (clojure.core/let [rawinput2127379 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127381 {"ServerId" (rawinput2127379 "ServerId"), "User" (rawinput2127379 "User")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127381 ["ServerId"])), :user (deser-described-user (clojure.core/get-in letvar2127381 ["User"]))}))))

(clojure.core/defn- response-import-ssh-public-key-response ([input] (response-import-ssh-public-key-response nil input)) ([resultWrapper2127383 input] (clojure.core/let [rawinput2127382 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127384 {"ServerId" (rawinput2127382 "ServerId"), "SshPublicKeyId" (rawinput2127382 "SshPublicKeyId"), "UserName" (rawinput2127382 "UserName")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127384 ["ServerId"])), :ssh-public-key-id (deser-ssh-public-key-id (clojure.core/get-in letvar2127384 ["SshPublicKeyId"])), :user-name (deser-user-name (clojure.core/get-in letvar2127384 ["UserName"]))}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper2127386 input] (clojure.core/let [rawinput2127385 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127387 {"Message" (rawinput2127385 "Message"), "Resource" (rawinput2127385 "Resource"), "ResourceType" (rawinput2127385 "ResourceType")}] (clojure.core/cond-> {:message (deser-message (clojure.core/get-in letvar2127387 ["Message"])), :resource (deser-resource (clojure.core/get-in letvar2127387 ["Resource"])), :resource-type (deser-resource-type (clojure.core/get-in letvar2127387 ["ResourceType"]))}))))

(clojure.core/defn- response-describe-server-response ([input] (response-describe-server-response nil input)) ([resultWrapper2127389 input] (clojure.core/let [rawinput2127388 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127390 {"Server" (rawinput2127388 "Server")}] (clojure.core/cond-> {:server (deser-described-server (clojure.core/get-in letvar2127390 ["Server"]))}))))

(clojure.core/defn- response-create-server-response ([input] (response-create-server-response nil input)) ([resultWrapper2127392 input] (clojure.core/let [rawinput2127391 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127393 {"ServerId" (rawinput2127391 "ServerId")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127393 ["ServerId"]))}))))

(clojure.core/defn- response-test-identity-provider-response ([input] (response-test-identity-provider-response nil input)) ([resultWrapper2127395 input] (clojure.core/let [rawinput2127394 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127396 {"Message" (rawinput2127394 "Message"), "StatusCode" (rawinput2127394 "StatusCode"), "Url" (rawinput2127394 "Url")}] (clojure.core/cond-> {:status-code (deser-status-code (clojure.core/get-in letvar2127396 ["StatusCode"])), :url (deser-url (clojure.core/get-in letvar2127396 ["Url"]))} (letvar2127396 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar2127396 ["Message"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper2127398 input] (clojure.core/let [rawinput2127397 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2127399 {"NextToken" (rawinput2127397 "NextToken"), "ServerId" (rawinput2127397 "ServerId"), "Users" (rawinput2127397 "Users")}] (clojure.core/cond-> {:server-id (deser-server-id (clojure.core/get-in letvar2127399 ["ServerId"])), :users (deser-listed-users (clojure.core/get-in letvar2127399 ["Users"]))} (letvar2127399 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2127399 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.transfer.-2018-11-05/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/ssh-public-key-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/create-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un [:portkey.aws.transfer.-2018-11-05/home-directory :portkey.aws.transfer.-2018-11-05/policy :portkey.aws.transfer.-2018-11-05/role]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/ssh-public-key-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^ssh-rsa\s+[A-Za-z0-9+/]+[=]{0,3}(\s+.+)?\s*$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un [:portkey.aws.transfer.-2018-11-05/max-results :portkey.aws.transfer.-2018-11-05/next-token]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.list-servers-response/servers (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/listed-servers))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/list-servers-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05.list-servers-response/servers] :opt-un [:portkey.aws.transfer.-2018-11-05/next-token]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/invalid-request-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transfer.-2018-11-05/arn :portkey.aws.transfer.-2018-11-05/next-token :portkey.aws.transfer.-2018-11-05/tags]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/status-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/import-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/ssh-public-key-body :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/stop-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/ssh-public-key (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/date-imported :portkey.aws.transfer.-2018-11-05/ssh-public-key-body :portkey.aws.transfer.-2018-11-05/ssh-public-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn] :opt-un [:portkey.aws.transfer.-2018-11-05/max-results :portkey.aws.transfer.-2018-11-05/next-token]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/date-imported clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/list-servers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transfer.-2018-11-05/max-results :portkey.aws.transfer.-2018-11-05/next-token]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/internal-service-error (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/nullable-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^$|arn:.*role/.*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/tags (clojure.spec.alpha/coll-of :portkey.aws.transfer.-2018-11-05/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/listed-servers (clojure.spec.alpha/coll-of :portkey.aws.transfer.-2018-11-05/listed-server))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/start-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/resource-exists-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/message :portkey.aws.transfer.-2018-11-05/resource :portkey.aws.transfer.-2018-11-05/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/home-directory (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^$|/.*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/service-error-message))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transfer.-2018-11-05.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 6144))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/update-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.identity-provider-details/invocation-role (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/role))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/identity-provider-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transfer.-2018-11-05/url :portkey.aws.transfer.-2018-11-05.identity-provider-details/invocation-role]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/update-server-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-z0-9]{3,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn :portkey.aws.transfer.-2018-11-05/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/ssh-public-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^key-[0-9a-f]{17}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:.*role/.*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.describe-user-response/user (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/described-user))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/describe-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05.describe-user-response/user] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/ssh-public-keys (clojure.spec.alpha/coll-of :portkey.aws.transfer.-2018-11-05/ssh-public-key :max-count 5))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/describe-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/import-ssh-public-key-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/ssh-public-key-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/resource-not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/message :portkey.aws.transfer.-2018-11-05/resource :portkey.aws.transfer.-2018-11-05/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.described-server/logging-role (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/role))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/described-server (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn] :opt-un [:portkey.aws.transfer.-2018-11-05/identity-provider-details :portkey.aws.transfer.-2018-11-05/identity-provider-type :portkey.aws.transfer.-2018-11-05.described-server/logging-role :portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/state :portkey.aws.transfer.-2018-11-05/tags :portkey.aws.transfer.-2018-11-05/user-count]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/service-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/delete-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.describe-server-response/server (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/described-server))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/describe-server-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05.describe-server-response/server] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/create-server-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/identity-provider-type #{"API_GATEWAY" "SERVICE_MANAGED" :api-gateway :service-managed})

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/resource-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/test-identity-provider-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/status-code :portkey.aws.transfer.-2018-11-05/url] :opt-un [:portkey.aws.transfer.-2018-11-05/message]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 20 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/role :portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un [:portkey.aws.transfer.-2018-11-05/home-directory :portkey.aws.transfer.-2018-11-05/policy :portkey.aws.transfer.-2018-11-05/ssh-public-key-body :portkey.aws.transfer.-2018-11-05/tags]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.create-server-request/logging-role (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/role))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/create-server-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transfer.-2018-11-05/identity-provider-details :portkey.aws.transfer.-2018-11-05/identity-provider-type :portkey.aws.transfer.-2018-11-05.create-server-request/logging-role :portkey.aws.transfer.-2018-11-05/tags]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/test-identity-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un [:portkey.aws.transfer.-2018-11-05/user-password]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/described-user (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn] :opt-un [:portkey.aws.transfer.-2018-11-05/home-directory :portkey.aws.transfer.-2018-11-05/policy :portkey.aws.transfer.-2018-11-05/role :portkey.aws.transfer.-2018-11-05/ssh-public-keys :portkey.aws.transfer.-2018-11-05/tags :portkey.aws.transfer.-2018-11-05/user-name]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/delete-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/ssh-public-key-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/state #{:offline :start-failed :starting :stopping :online "STARTING" "OFFLINE" :stop-failed "START_FAILED" "STOP_FAILED" "ONLINE" "STOPPING"})

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.tag/key (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/tag-key))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.tag/value (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/tag-value))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05.tag/key :portkey.aws.transfer.-2018-11-05.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/resource (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/user-password (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/listed-users (clojure.spec.alpha/coll-of :portkey.aws.transfer.-2018-11-05/listed-user))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/user-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.update-server-request/logging-role (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/nullable-role))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/update-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un [:portkey.aws.transfer.-2018-11-05/identity-provider-details :portkey.aws.transfer.-2018-11-05.update-server-request/logging-role]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/server-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^s-([0-9a-f]{17})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/listed-user (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn] :opt-un [:portkey.aws.transfer.-2018-11-05/home-directory :portkey.aws.transfer.-2018-11-05/role :portkey.aws.transfer.-2018-11-05/ssh-public-key-count :portkey.aws.transfer.-2018-11-05/user-name]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.list-users-response/users (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/listed-users))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/list-users-response (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05.list-users-response/users] :opt-un [:portkey.aws.transfer.-2018-11-05/next-token]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn :portkey.aws.transfer.-2018-11-05/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05.listed-server/logging-role (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/role))
(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/listed-server (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/arn] :opt-un [:portkey.aws.transfer.-2018-11-05/identity-provider-type :portkey.aws.transfer.-2018-11-05.listed-server/logging-role :portkey.aws.transfer.-2018-11-05/server-id :portkey.aws.transfer.-2018-11-05/state :portkey.aws.transfer.-2018-11-05/user-count]))

(clojure.spec.alpha/def :portkey.aws.transfer.-2018-11-05/describe-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transfer.-2018-11-05/server-id] :opt-un []))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn import-ssh-public-key ([import-ssh-public-key-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-import-ssh-public-key-request import-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/import-ssh-public-key-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/import-ssh-public-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportSshPublicKey", :http.request.configuration/output-deser-fn response-import-ssh-public-key-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceExistsException" :portkey.aws.transfer.-2018-11-05/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef import-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/import-ssh-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/import-ssh-public-key-response))

(clojure.core/defn start-server ([start-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-server-request start-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/start-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartServer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef start-server :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/start-server-request) :ret clojure.core/true?)

(clojure.core/defn update-server ([update-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-server-request update-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/update-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/update-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServer", :http.request.configuration/output-deser-fn response-update-server-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-server :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/update-server-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/update-server-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidNextTokenException" :portkey.aws.transfer.-2018-11-05/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/list-tags-for-resource-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceExistsException" :portkey.aws.transfer.-2018-11-05/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/create-user-response))

(clojure.core/defn delete-ssh-public-key ([delete-ssh-public-key-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-ssh-public-key-request delete-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/delete-ssh-public-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSshPublicKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/delete-ssh-public-key-request) :ret clojure.core/true?)

(clojure.core/defn stop-server ([stop-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-stop-server-request stop-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/stop-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopServer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-server :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/stop-server-request) :ret clojure.core/true?)

(clojure.core/defn create-server ([] (create-server {})) ([create-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-server-request create-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/create-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/create-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateServer", :http.request.configuration/output-deser-fn response-create-server-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-server :args (clojure.spec.alpha/? :portkey.aws.transfer.-2018-11-05/create-server-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/create-server-response))

(clojure.core/defn list-servers ([] (list-servers {})) ([list-servers-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-servers-request list-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/list-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/list-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListServers", :http.request.configuration/output-deser-fn response-list-servers-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidNextTokenException" :portkey.aws.transfer.-2018-11-05/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-servers :args (clojure.spec.alpha/? :portkey.aws.transfer.-2018-11-05/list-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/list-servers-response))

(clojure.core/defn delete-server ([delete-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-server-request delete-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/delete-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-server :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/delete-server-request) :ret clojure.core/true?)

(clojure.core/defn list-users ([list-users-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/list-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/list-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidNextTokenException" :portkey.aws.transfer.-2018-11-05/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/list-users-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn describe-server ([describe-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-server-request describe-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/describe-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/describe-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServer", :http.request.configuration/output-deser-fn response-describe-server-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-server :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/describe-server-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/describe-server-response))

(clojure.core/defn update-user ([update-user-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/update-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/update-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUser", :http.request.configuration/output-deser-fn response-update-user-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/update-user-response))

(clojure.core/defn test-identity-provider ([test-identity-provider-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-test-identity-provider-request test-identity-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/test-identity-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/test-identity-provider-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TestIdentityProvider", :http.request.configuration/output-deser-fn response-test-identity-provider-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef test-identity-provider :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/test-identity-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/test-identity-provider-response))

(clojure.core/defn describe-user ([describe-user-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.transfer.-2018-11-05/endpoints, :http.request.configuration/target-prefix "TransferService", :http.request.spec/output-spec :portkey.aws.transfer.-2018-11-05/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "Transfer", :http.request.spec/input-spec :portkey.aws.transfer.-2018-11-05/describe-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUser", :http.request.configuration/output-deser-fn response-describe-user-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.transfer.-2018-11-05/service-unavailable-exception, "InternalServiceError" :portkey.aws.transfer.-2018-11-05/internal-service-error, "InvalidRequestException" :portkey.aws.transfer.-2018-11-05/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.transfer.-2018-11-05/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.transfer.-2018-11-05/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.transfer.-2018-11-05/describe-user-response))