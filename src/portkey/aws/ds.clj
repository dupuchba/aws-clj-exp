(ns portkey.aws.ds (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ds", :region "ap-northeast-1"},
    :ssl-common-name "ds.ap-northeast-1.amazonaws.com",
    :endpoint "https://ds.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ds", :region "eu-west-1"},
    :ssl-common-name "ds.eu-west-1.amazonaws.com",
    :endpoint "https://ds.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ds", :region "us-east-2"},
    :ssl-common-name "ds.us-east-2.amazonaws.com",
    :endpoint "https://ds.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ds", :region "ap-southeast-2"},
    :ssl-common-name "ds.ap-southeast-2.amazonaws.com",
    :endpoint "https://ds.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ds", :region "cn-north-1"},
    :ssl-common-name "ds.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ds.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ds", :region "sa-east-1"},
    :ssl-common-name "ds.sa-east-1.amazonaws.com",
    :endpoint "https://ds.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ds", :region "ap-southeast-1"},
    :ssl-common-name "ds.ap-southeast-1.amazonaws.com",
    :endpoint "https://ds.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "ds", :region "cn-northwest-1"},
    :ssl-common-name "ds.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://ds.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ds", :region "ap-northeast-2"},
    :ssl-common-name "ds.ap-northeast-2.amazonaws.com",
    :endpoint "https://ds.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ds", :region "ca-central-1"},
    :ssl-common-name "ds.ca-central-1.amazonaws.com",
    :endpoint "https://ds.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ds", :region "eu-central-1"},
    :ssl-common-name "ds.eu-central-1.amazonaws.com",
    :endpoint "https://ds.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ds", :region "eu-west-2"},
    :ssl-common-name "ds.eu-west-2.amazonaws.com",
    :endpoint "https://ds.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ds", :region "us-gov-west-1"},
    :ssl-common-name "ds.us-gov-west-1.amazonaws.com",
    :endpoint "https://ds.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ds", :region "us-west-2"},
    :ssl-common-name "ds.us-west-2.amazonaws.com",
    :endpoint "https://ds.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ds", :region "us-east-1"},
    :ssl-common-name "ds.us-east-1.amazonaws.com",
    :endpoint "https://ds.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ds", :region "us-west-1"},
    :ssl-common-name "ds.us-west-1.amazonaws.com",
    :endpoint "https://ds.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ds", :region "ap-south-1"},
    :ssl-common-name "ds.ap-south-1.amazonaws.com",
    :endpoint "https://ds.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-remote-domain-names)

(clojure.core/declare ser-ip-addr)

(clojure.core/declare ser-radius-display-label)

(clojure.core/declare ser-delete-associated-conditional-forwarder)

(clojure.core/declare ser-connect-password)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-trust-password)

(clojure.core/declare ser-create-snapshot-before-schema-extension)

(clojure.core/declare ser-password)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-use-same-username)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-ldif-content)

(clojure.core/declare ser-topic-name)

(clojure.core/declare ser-radius-shared-secret)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-topic-names)

(clojure.core/declare ser-target-type)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-desired-number-of-domain-controllers)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-organizational-unit-dn)

(clojure.core/declare ser-trust-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-domain-controller-id)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-unshare-target)

(clojure.core/declare ser-user-name)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-trust-direction)

(clojure.core/declare ser-directory-short-name)

(clojure.core/declare ser-target-id)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-servers)

(clojure.core/declare ser-radius-authentication-protocol)

(clojure.core/declare ser-share-target)

(clojure.core/declare ser-trust-id)

(clojure.core/declare ser-directory-ids)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-schema-extension-id)

(clojure.core/declare ser-radius-settings)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-ip-route)

(clojure.core/declare ser-customer-user-name)

(clojure.core/declare ser-share-method)

(clojure.core/declare ser-directory-size)

(clojure.core/declare ser-directory-connect-settings)

(clojure.core/declare ser-ip-routes)

(clojure.core/declare ser-log-group-name)

(clojure.core/declare ser-dns-ip-addrs)

(clojure.core/declare ser-server)

(clojure.core/declare ser-selective-auth)

(clojure.core/declare ser-radius-retries)

(clojure.core/declare ser-computer-password)

(clojure.core/declare ser-directory-edition)

(clojure.core/declare ser-radius-timeout)

(clojure.core/declare ser-cidr-ips)

(clojure.core/declare ser-directory-id)

(clojure.core/declare ser-trust-ids)

(clojure.core/declare ser-remote-domain-name)

(clojure.core/declare ser-directory-name)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-user-password)

(clojure.core/declare ser-domain-controller-ids)

(clojure.core/declare ser-alias-name)

(clojure.core/declare ser-snapshot-ids)

(clojure.core/declare ser-directory-vpc-settings)

(clojure.core/declare ser-port-number)

(clojure.core/declare ser-notes)

(clojure.core/declare ser-computer-name)

(clojure.core/declare ser-snapshot-name)

(clojure.core/declare ser-cidr-ip)

(clojure.core/declare ser-snapshot-id)

(clojure.core/declare ser-update-security-group-for-directory-controllers)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-remote-domain-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-remote-domain-name coll) #:http.request.field{:shape "RemoteDomainName"}))) input), :shape "RemoteDomainNames", :type "list"})

(clojure.core/defn- ser-ip-addr [input] #:http.request.field{:value input, :shape "IpAddr"})

(clojure.core/defn- ser-radius-display-label [input] #:http.request.field{:value input, :shape "RadiusDisplayLabel"})

(clojure.core/defn- ser-delete-associated-conditional-forwarder [input] #:http.request.field{:value input, :shape "DeleteAssociatedConditionalForwarder"})

(clojure.core/defn- ser-connect-password [input] #:http.request.field{:value input, :shape "ConnectPassword"})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list"})

(clojure.core/defn- ser-trust-password [input] #:http.request.field{:value input, :shape "TrustPassword"})

(clojure.core/defn- ser-create-snapshot-before-schema-extension [input] #:http.request.field{:value input, :shape "CreateSnapshotBeforeSchemaExtension"})

(clojure.core/defn- ser-password [input] #:http.request.field{:value input, :shape "Password"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-use-same-username [input] #:http.request.field{:value input, :shape "UseSameUsername"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-ldif-content [input] #:http.request.field{:value input, :shape "LdifContent"})

(clojure.core/defn- ser-topic-name [input] #:http.request.field{:value input, :shape "TopicName"})

(clojure.core/defn- ser-radius-shared-secret [input] #:http.request.field{:value input, :shape "RadiusSharedSecret"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-topic-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-topic-name coll) #:http.request.field{:shape "TopicName"}))) input), :shape "TopicNames", :type "list"})

(clojure.core/defn- ser-target-type [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "TargetType"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-desired-number-of-domain-controllers [input] #:http.request.field{:value input, :shape "DesiredNumberOfDomainControllers"})

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-organizational-unit-dn [input] #:http.request.field{:value input, :shape "OrganizationalUnitDN"})

(clojure.core/defn- ser-trust-type [input] #:http.request.field{:value (clojure.core/get {"Forest" "Forest", :forest "Forest", "External" "External", :external "External"} input), :shape "TrustType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Attribute", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name (input :name)) #:http.request.field{:name "Name", :shape "AttributeName"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AttributeValue"}))))

(clojure.core/defn- ser-domain-controller-id [input] #:http.request.field{:value input, :shape "DomainControllerId"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-unshare-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"}) (clojure.core/into (ser-target-type (:type input)) #:http.request.field{:name "Type", :shape "TargetType"})], :shape "UnshareTarget", :type "structure"}))

(clojure.core/defn- ser-user-name [input] #:http.request.field{:value input, :shape "UserName"})

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "Attributes", :type "list"})

(clojure.core/defn- ser-trust-direction [input] #:http.request.field{:value (clojure.core/get {"One-Way: Outgoing" "One-Way: Outgoing", :one-way-outgoing "One-Way: Outgoing", "One-Way: Incoming" "One-Way: Incoming", :one-way-incoming "One-Way: Incoming", "Two-Way" "Two-Way", :two-way "Two-Way"} input), :shape "TrustDirection"})

(clojure.core/defn- ser-directory-short-name [input] #:http.request.field{:value input, :shape "DirectoryShortName"})

(clojure.core/defn- ser-target-id [input] #:http.request.field{:value input, :shape "TargetId"})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-servers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server coll) #:http.request.field{:shape "Server"}))) input), :shape "Servers", :type "list"})

(clojure.core/defn- ser-radius-authentication-protocol [input] #:http.request.field{:value (clojure.core/get {"PAP" "PAP", :pap "PAP", "CHAP" "CHAP", :chap "CHAP", "MS-CHAPv1" "MS-CHAPv1", :mscha-pv-1 "MS-CHAPv1", "MS-CHAPv2" "MS-CHAPv2", :mscha-pv-2 "MS-CHAPv2"} input), :shape "RadiusAuthenticationProtocol"})

(clojure.core/defn- ser-share-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"}) (clojure.core/into (ser-target-type (:type input)) #:http.request.field{:name "Type", :shape "TargetType"})], :shape "ShareTarget", :type "structure"}))

(clojure.core/defn- ser-trust-id [input] #:http.request.field{:value input, :shape "TrustId"})

(clojure.core/defn- ser-directory-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-directory-id coll) #:http.request.field{:shape "DirectoryId"}))) input), :shape "DirectoryIds", :type "list"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-schema-extension-id [input] #:http.request.field{:value input, :shape "SchemaExtensionId"})

(clojure.core/defn- ser-radius-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RadiusSettings", :type "structure"} (clojure.core/contains? input :radius-servers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-servers (input :radius-servers)) #:http.request.field{:name "RadiusServers", :shape "Servers"})) (clojure.core/contains? input :radius-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-number (input :radius-port)) #:http.request.field{:name "RadiusPort", :shape "PortNumber"})) (clojure.core/contains? input :radius-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-timeout (input :radius-timeout)) #:http.request.field{:name "RadiusTimeout", :shape "RadiusTimeout"})) (clojure.core/contains? input :radius-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-retries (input :radius-retries)) #:http.request.field{:name "RadiusRetries", :shape "RadiusRetries"})) (clojure.core/contains? input :shared-secret) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-shared-secret (input :shared-secret)) #:http.request.field{:name "SharedSecret", :shape "RadiusSharedSecret"})) (clojure.core/contains? input :authentication-protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-authentication-protocol (input :authentication-protocol)) #:http.request.field{:name "AuthenticationProtocol", :shape "RadiusAuthenticationProtocol"})) (clojure.core/contains? input :display-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-display-label (input :display-label)) #:http.request.field{:name "DisplayLabel", :shape "RadiusDisplayLabel"})) (clojure.core/contains? input :use-same-username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-same-username (input :use-same-username)) #:http.request.field{:name "UseSameUsername", :shape "UseSameUsername"}))))

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VpcId"})

(clojure.core/defn- ser-ip-route [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IpRoute", :type "structure"} (clojure.core/contains? input :cidr-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cidr-ip (input :cidr-ip)) #:http.request.field{:name "CidrIp", :shape "CidrIp"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"}))))

(clojure.core/defn- ser-customer-user-name [input] #:http.request.field{:value input, :shape "CustomerUserName"})

(clojure.core/defn- ser-share-method [input] #:http.request.field{:value (clojure.core/get {"ORGANIZATIONS" "ORGANIZATIONS", :organizations "ORGANIZATIONS", "HANDSHAKE" "HANDSHAKE", :handshake "HANDSHAKE"} input), :shape "ShareMethod"})

(clojure.core/defn- ser-directory-size [input] #:http.request.field{:value (clojure.core/get {"Small" "Small", :small "Small", "Large" "Large", :large "Large"} input), :shape "DirectorySize"})

(clojure.core/defn- ser-directory-connect-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-id (:vpc-id input)) #:http.request.field{:name "VpcId", :shape "VpcId"}) (clojure.core/into (ser-subnet-ids (:subnet-ids input)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"}) (clojure.core/into (ser-dns-ip-addrs (:customer-dns-ips input)) #:http.request.field{:name "CustomerDnsIps", :shape "DnsIpAddrs"}) (clojure.core/into (ser-user-name (:customer-user-name input)) #:http.request.field{:name "CustomerUserName", :shape "UserName"})], :shape "DirectoryConnectSettings", :type "structure"}))

(clojure.core/defn- ser-ip-routes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-route coll) #:http.request.field{:shape "IpRoute"}))) input), :shape "IpRoutes", :type "list"})

(clojure.core/defn- ser-log-group-name [input] #:http.request.field{:value input, :shape "LogGroupName"})

(clojure.core/defn- ser-dns-ip-addrs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-addr coll) #:http.request.field{:shape "IpAddr"}))) input), :shape "DnsIpAddrs", :type "list"})

(clojure.core/defn- ser-server [input] #:http.request.field{:value input, :shape "Server"})

(clojure.core/defn- ser-selective-auth [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "SelectiveAuth"})

(clojure.core/defn- ser-radius-retries [input] #:http.request.field{:value input, :shape "RadiusRetries"})

(clojure.core/defn- ser-computer-password [input] #:http.request.field{:value input, :shape "ComputerPassword"})

(clojure.core/defn- ser-directory-edition [input] #:http.request.field{:value (clojure.core/get {"Enterprise" "Enterprise", :enterprise "Enterprise", "Standard" "Standard", :standard "Standard"} input), :shape "DirectoryEdition"})

(clojure.core/defn- ser-radius-timeout [input] #:http.request.field{:value input, :shape "RadiusTimeout"})

(clojure.core/defn- ser-cidr-ips [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cidr-ip coll) #:http.request.field{:shape "CidrIp"}))) input), :shape "CidrIps", :type "list"})

(clojure.core/defn- ser-directory-id [input] #:http.request.field{:value input, :shape "DirectoryId"})

(clojure.core/defn- ser-trust-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trust-id coll) #:http.request.field{:shape "TrustId"}))) input), :shape "TrustIds", :type "list"})

(clojure.core/defn- ser-remote-domain-name [input] #:http.request.field{:value input, :shape "RemoteDomainName"})

(clojure.core/defn- ser-directory-name [input] #:http.request.field{:value input, :shape "DirectoryName"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-user-password [input] #:http.request.field{:value input, :shape "UserPassword"})

(clojure.core/defn- ser-domain-controller-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-controller-id coll) #:http.request.field{:shape "DomainControllerId"}))) input), :shape "DomainControllerIds", :type "list"})

(clojure.core/defn- ser-alias-name [input] #:http.request.field{:value input, :shape "AliasName"})

(clojure.core/defn- ser-snapshot-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-snapshot-id coll) #:http.request.field{:shape "SnapshotId"}))) input), :shape "SnapshotIds", :type "list"})

(clojure.core/defn- ser-directory-vpc-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-id (:vpc-id input)) #:http.request.field{:name "VpcId", :shape "VpcId"}) (clojure.core/into (ser-subnet-ids (:subnet-ids input)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"})], :shape "DirectoryVpcSettings", :type "structure"}))

(clojure.core/defn- ser-port-number [input] #:http.request.field{:value input, :shape "PortNumber"})

(clojure.core/defn- ser-notes [input] #:http.request.field{:value input, :shape "Notes"})

(clojure.core/defn- ser-computer-name [input] #:http.request.field{:value input, :shape "ComputerName"})

(clojure.core/defn- ser-snapshot-name [input] #:http.request.field{:value input, :shape "SnapshotName"})

(clojure.core/defn- ser-cidr-ip [input] #:http.request.field{:value input, :shape "CidrIp"})

(clojure.core/defn- ser-snapshot-id [input] #:http.request.field{:value input, :shape "SnapshotId"})

(clojure.core/defn- ser-update-security-group-for-directory-controllers [input] #:http.request.field{:value input, :shape "UpdateSecurityGroupForDirectoryControllers"})

(clojure.core/defn- req-describe-snapshots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :snapshot-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-ids (input :snapshot-ids)) #:http.request.field{:name "SnapshotIds", :shape "SnapshotIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-create-conditional-forwarder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"}) (clojure.core/into (ser-dns-ip-addrs (input :dns-ip-addrs)) #:http.request.field{:name "DnsIpAddrs", :shape "DnsIpAddrs"})]}))

(clojure.core/defn- req-get-directory-limits-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-directories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-ids (input :directory-ids)) #:http.request.field{:name "DirectoryIds", :shape "DirectoryIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-connect-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"}) (clojure.core/into (ser-connect-password (input :password)) #:http.request.field{:name "Password", :shape "ConnectPassword"}) (clojure.core/into (ser-directory-size (input :size)) #:http.request.field{:name "Size", :shape "DirectorySize"}) (clojure.core/into (ser-directory-connect-settings (input :connect-settings)) #:http.request.field{:name "ConnectSettings", :shape "DirectoryConnectSettings"})]} (clojure.core/contains? input :short-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-short-name (input :short-name)) #:http.request.field{:name "ShortName", :shape "DirectoryShortName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-create-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"}) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"}) (clojure.core/into (ser-directory-size (input :size)) #:http.request.field{:name "Size", :shape "DirectorySize"})]} (clojure.core/contains? input :short-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-short-name (input :short-name)) #:http.request.field{:name "ShortName", :shape "DirectoryShortName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :vpc-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-vpc-settings (input :vpc-settings)) #:http.request.field{:name "VpcSettings", :shape "DirectoryVpcSettings"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-reject-shared-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :shared-directory-id)) #:http.request.field{:name "SharedDirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-start-schema-extension-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-create-snapshot-before-schema-extension (input :create-snapshot-before-schema-extension)) #:http.request.field{:name "CreateSnapshotBeforeSchemaExtension", :shape "CreateSnapshotBeforeSchemaExtension"}) (clojure.core/into (ser-ldif-content (input :ldif-content)) #:http.request.field{:name "LdifContent", :shape "LdifContent"}) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})]}))

(clojure.core/defn- req-create-microsoft-ad-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"}) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"}) (clojure.core/into (ser-directory-vpc-settings (input :vpc-settings)) #:http.request.field{:name "VpcSettings", :shape "DirectoryVpcSettings"})]} (clojure.core/contains? input :short-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-short-name (input :short-name)) #:http.request.field{:name "ShortName", :shape "DirectoryShortName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :edition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-edition (input :edition)) #:http.request.field{:name "Edition", :shape "DirectoryEdition"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-create-log-subscription-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "LogGroupName", :shape "LogGroupName"})]}))

(clojure.core/defn- req-create-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-name (input :name)) #:http.request.field{:name "Name", :shape "SnapshotName"}))))

(clojure.core/defn- req-delete-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-update-number-of-domain-controllers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-desired-number-of-domain-controllers (input :desired-number)) #:http.request.field{:name "DesiredNumber", :shape "DesiredNumberOfDomainControllers"})]}))

(clojure.core/defn- req-list-schema-extensions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-share-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-share-target (input :share-target)) #:http.request.field{:name "ShareTarget", :shape "ShareTarget"}) (clojure.core/into (ser-share-method (input :share-method)) #:http.request.field{:name "ShareMethod", :shape "ShareMethod"})]} (clojure.core/contains? input :share-notes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notes (input :share-notes)) #:http.request.field{:name "ShareNotes", :shape "Notes"}))))

(clojure.core/defn- req-reset-user-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-customer-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "CustomerUserName"}) (clojure.core/into (ser-user-password (input :new-password)) #:http.request.field{:name "NewPassword", :shape "UserPassword"})]}))

(clojure.core/defn- req-delete-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"})]}))

(clojure.core/defn- req-update-conditional-forwarder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"}) (clojure.core/into (ser-dns-ip-addrs (input :dns-ip-addrs)) #:http.request.field{:name "DnsIpAddrs", :shape "DnsIpAddrs"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-add-ip-routes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-ip-routes (input :ip-routes)) #:http.request.field{:name "IpRoutes", :shape "IpRoutes"})]} (clojure.core/contains? input :update-security-group-for-directory-controllers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-security-group-for-directory-controllers (input :update-security-group-for-directory-controllers)) #:http.request.field{:name "UpdateSecurityGroupForDirectoryControllers", :shape "UpdateSecurityGroupForDirectoryControllers"}))))

(clojure.core/defn- req-accept-shared-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :shared-directory-id)) #:http.request.field{:name "SharedDirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-deregister-event-topic-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-topic-name (input :topic-name)) #:http.request.field{:name "TopicName", :shape "TopicName"})]}))

(clojure.core/defn- req-create-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"}) (clojure.core/into (ser-trust-password (input :trust-password)) #:http.request.field{:name "TrustPassword", :shape "TrustPassword"}) (clojure.core/into (ser-trust-direction (input :trust-direction)) #:http.request.field{:name "TrustDirection", :shape "TrustDirection"})]} (clojure.core/contains? input :trust-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trust-type (input :trust-type)) #:http.request.field{:name "TrustType", :shape "TrustType"})) (clojure.core/contains? input :conditional-forwarder-ip-addrs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-ip-addrs (input :conditional-forwarder-ip-addrs)) #:http.request.field{:name "ConditionalForwarderIpAddrs", :shape "DnsIpAddrs"})) (clojure.core/contains? input :selective-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-selective-auth (input :selective-auth)) #:http.request.field{:name "SelectiveAuth", :shape "SelectiveAuth"}))))

(clojure.core/defn- req-enable-radius-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-radius-settings (input :radius-settings)) #:http.request.field{:name "RadiusSettings", :shape "RadiusSettings"})]}))

(clojure.core/defn- req-create-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-alias-name (input :alias)) #:http.request.field{:name "Alias", :shape "AliasName"})]}))

(clojure.core/defn- req-disable-sso-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connect-password (input :password)) #:http.request.field{:name "Password", :shape "ConnectPassword"}))))

(clojure.core/defn- req-cancel-schema-extension-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-schema-extension-id (input :schema-extension-id)) #:http.request.field{:name "SchemaExtensionId", :shape "SchemaExtensionId"})]}))

(clojure.core/defn- req-get-snapshot-limits-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-describe-trusts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :trust-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trust-ids (input :trust-ids)) #:http.request.field{:name "TrustIds", :shape "TrustIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-enable-sso-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connect-password (input :password)) #:http.request.field{:name "Password", :shape "ConnectPassword"}))))

(clojure.core/defn- req-unshare-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-unshare-target (input :unshare-target)) #:http.request.field{:name "UnshareTarget", :shape "UnshareTarget"})]}))

(clojure.core/defn- req-describe-event-topics-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :topic-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-names (input :topic-names)) #:http.request.field{:name "TopicNames", :shape "TopicNames"}))))

(clojure.core/defn- req-restore-from-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"})]}))

(clojure.core/defn- req-update-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trust-id (input :trust-id)) #:http.request.field{:name "TrustId", :shape "TrustId"})]} (clojure.core/contains? input :selective-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-selective-auth (input :selective-auth)) #:http.request.field{:name "SelectiveAuth", :shape "SelectiveAuth"}))))

(clojure.core/defn- req-list-log-subscriptions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-remove-ip-routes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-cidr-ips (input :cidr-ips)) #:http.request.field{:name "CidrIps", :shape "CidrIps"})]}))

(clojure.core/defn- req-remove-tags-from-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-describe-shared-directories-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :owner-directory-id)) #:http.request.field{:name "OwnerDirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :shared-directory-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-ids (input :shared-directory-ids)) #:http.request.field{:name "SharedDirectoryIds", :shape "DirectoryIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-delete-log-subscription-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-describe-conditional-forwarders-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :remote-domain-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-domain-names (input :remote-domain-names)) #:http.request.field{:name "RemoteDomainNames", :shape "RemoteDomainNames"}))))

(clojure.core/defn- req-list-ip-routes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-register-event-topic-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-topic-name (input :topic-name)) #:http.request.field{:name "TopicName", :shape "TopicName"})]}))

(clojure.core/defn- req-disable-radius-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-verify-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trust-id (input :trust-id)) #:http.request.field{:name "TrustId", :shape "TrustId"})]}))

(clojure.core/defn- req-add-tags-to-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-domain-controllers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :domain-controller-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-controller-ids (input :domain-controller-ids)) #:http.request.field{:name "DomainControllerIds", :shape "DomainControllerIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-update-radius-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-radius-settings (input :radius-settings)) #:http.request.field{:name "RadiusSettings", :shape "RadiusSettings"})]}))

(clojure.core/defn- req-create-computer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-computer-name (input :computer-name)) #:http.request.field{:name "ComputerName", :shape "ComputerName"}) (clojure.core/into (ser-computer-password (input :password)) #:http.request.field{:name "Password", :shape "ComputerPassword"})]} (clojure.core/contains? input :organizational-unit-distinguished-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit-dn (input :organizational-unit-distinguished-name)) #:http.request.field{:name "OrganizationalUnitDistinguishedName", :shape "OrganizationalUnitDN"})) (clojure.core/contains? input :computer-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :computer-attributes)) #:http.request.field{:name "ComputerAttributes", :shape "Attributes"}))))

(clojure.core/defn- req-delete-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trust-id (input :trust-id)) #:http.request.field{:name "TrustId", :shape "TrustId"})]} (clojure.core/contains? input :delete-associated-conditional-forwarder) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-associated-conditional-forwarder (input :delete-associated-conditional-forwarder)) #:http.request.field{:name "DeleteAssociatedConditionalForwarder", :shape "DeleteAssociatedConditionalForwarder"}))))

(clojure.core/defn- req-delete-conditional-forwarder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"})]}))

(clojure.core/declare deser-ip-addr)

(clojure.core/declare deser-conditional-forwarder)

(clojure.core/declare deser-snapshots)

(clojure.core/declare deser-ip-route-status-msg)

(clojure.core/declare deser-radius-display-label)

(clojure.core/declare deser-directory-limits)

(clojure.core/declare deser-domain-controller-status-reason)

(clojure.core/declare deser-created-date-time)

(clojure.core/declare deser-request-id)

(clojure.core/declare deser-subnet-ids)

(clojure.core/declare deser-customer-id)

(clojure.core/declare deser-ip-addrs)

(clojure.core/declare deser-domain-controller-status)

(clojure.core/declare deser-snapshot-limits)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-owner-directory-description)

(clojure.core/declare deser-event-topic)

(clojure.core/declare deser-use-same-username)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-stage-reason)

(clojure.core/declare deser-start-time)

(clojure.core/declare deser-manual-snapshots-limit-reached)

(clojure.core/declare deser-directory-description)

(clojure.core/declare deser-topic-name)

(clojure.core/declare deser-schema-extension-status-reason)

(clojure.core/declare deser-radius-shared-secret)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-state-last-updated-date-time)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-desired-number-of-domain-controllers)

(clojure.core/declare deser-ip-route-info)

(clojure.core/declare deser-limit)

(clojure.core/declare deser-trust-type)

(clojure.core/declare deser-availability-zone)

(clojure.core/declare deser-snapshot-type)

(clojure.core/declare deser-directory-vpc-settings-description)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-attribute)

(clojure.core/declare deser-domain-controllers)

(clojure.core/declare deser-log-subscriptions)

(clojure.core/declare deser-domain-controller-id)

(clojure.core/declare deser-computer)

(clojure.core/declare deser-cloud-only-directories-limit-reached)

(clojure.core/declare deser-user-name)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-trust-direction)

(clojure.core/declare deser-directory-short-name)

(clojure.core/declare deser-trust-state-reason)

(clojure.core/declare deser-snapshot-status)

(clojure.core/declare deser-ip-routes-info)

(clojure.core/declare deser-event-topics)

(clojure.core/declare deser-share-status)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-added-date-time)

(clojure.core/declare deser-servers)

(clojure.core/declare deser-radius-authentication-protocol)

(clojure.core/declare deser-trust-id)

(clojure.core/declare deser-sso-enabled)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-schema-extension-info)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-schema-extension-id)

(clojure.core/declare deser-trusts)

(clojure.core/declare deser-radius-settings)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-share-method)

(clojure.core/declare deser-shared-directories)

(clojure.core/declare deser-directory-size)

(clojure.core/declare deser-replication-scope)

(clojure.core/declare deser-directory-type)

(clojure.core/declare deser-last-updated-date-time)

(clojure.core/declare deser-directory-connect-settings-description)

(clojure.core/declare deser-topic-arn)

(clojure.core/declare deser-snapshot)

(clojure.core/declare deser-shared-directory)

(clojure.core/declare deser-trust-state)

(clojure.core/declare deser-log-group-name)

(clojure.core/declare deser-dns-ip-addrs)

(clojure.core/declare deser-access-url)

(clojure.core/declare deser-server)

(clojure.core/declare deser-selective-auth)

(clojure.core/declare deser-end-date-time)

(clojure.core/declare deser-radius-retries)

(clojure.core/declare deser-directory-edition)

(clojure.core/declare deser-radius-timeout)

(clojure.core/declare deser-directory-stage)

(clojure.core/declare deser-directory-id)

(clojure.core/declare deser-subscription-created-date-time)

(clojure.core/declare deser-schema-extensions-info)

(clojure.core/declare deser-domain-controller)

(clojure.core/declare deser-remote-domain-name)

(clojure.core/declare deser-directory-name)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-conditional-forwarders)

(clojure.core/declare deser-topic-status)

(clojure.core/declare deser-connected-directories-limit-reached)

(clojure.core/declare deser-trust)

(clojure.core/declare deser-alias-name)

(clojure.core/declare deser-launch-time)

(clojure.core/declare deser-radius-status)

(clojure.core/declare deser-directory-descriptions)

(clojure.core/declare deser-availability-zones)

(clojure.core/declare deser-port-number)

(clojure.core/declare deser-schema-extension-status)

(clojure.core/declare deser-ip-route-status-reason)

(clojure.core/declare deser-start-date-time)

(clojure.core/declare deser-notes)

(clojure.core/declare deser-computer-name)

(clojure.core/declare deser-log-subscription)

(clojure.core/declare deser-snapshot-name)

(clojure.core/declare deser-cidr-ip)

(clojure.core/declare deser-snapshot-id)

(clojure.core/declare deser-sid)

(clojure.core/defn- deser-ip-addr [input] input)

(clojure.core/defn- deser-conditional-forwarder [input] (clojure.core/cond-> {} (clojure.core/contains? input "RemoteDomainName") (clojure.core/assoc :remote-domain-name (deser-remote-domain-name (input "RemoteDomainName"))) (clojure.core/contains? input "DnsIpAddrs") (clojure.core/assoc :dns-ip-addrs (deser-dns-ip-addrs (input "DnsIpAddrs"))) (clojure.core/contains? input "ReplicationScope") (clojure.core/assoc :replication-scope (deser-replication-scope (input "ReplicationScope")))))

(clojure.core/defn- deser-snapshots [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-snapshot coll))) input))

(clojure.core/defn- deser-ip-route-status-msg [input] (clojure.core/get {"Adding" :adding, "Added" :added, "Removing" :removing, "Removed" :removed, "AddFailed" :add-failed, "RemoveFailed" :remove-failed} input))

(clojure.core/defn- deser-radius-display-label [input] input)

(clojure.core/defn- deser-directory-limits [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConnectedDirectoriesLimit") (clojure.core/assoc :connected-directories-limit (deser-limit (input "ConnectedDirectoriesLimit"))) (clojure.core/contains? input "ConnectedDirectoriesCurrentCount") (clojure.core/assoc :connected-directories-current-count (deser-limit (input "ConnectedDirectoriesCurrentCount"))) (clojure.core/contains? input "CloudOnlyDirectoriesLimit") (clojure.core/assoc :cloud-only-directories-limit (deser-limit (input "CloudOnlyDirectoriesLimit"))) (clojure.core/contains? input "CloudOnlyDirectoriesCurrentCount") (clojure.core/assoc :cloud-only-directories-current-count (deser-limit (input "CloudOnlyDirectoriesCurrentCount"))) (clojure.core/contains? input "CloudOnlyDirectoriesLimitReached") (clojure.core/assoc :cloud-only-directories-limit-reached (deser-cloud-only-directories-limit-reached (input "CloudOnlyDirectoriesLimitReached"))) (clojure.core/contains? input "CloudOnlyMicrosoftADCurrentCount") (clojure.core/assoc :cloud-only-microsoft-ad-current-count (deser-limit (input "CloudOnlyMicrosoftADCurrentCount"))) (clojure.core/contains? input "ConnectedDirectoriesLimitReached") (clojure.core/assoc :connected-directories-limit-reached (deser-connected-directories-limit-reached (input "ConnectedDirectoriesLimitReached"))) (clojure.core/contains? input "CloudOnlyMicrosoftADLimit") (clojure.core/assoc :cloud-only-microsoft-ad-limit (deser-limit (input "CloudOnlyMicrosoftADLimit"))) (clojure.core/contains? input "CloudOnlyMicrosoftADLimitReached") (clojure.core/assoc :cloud-only-microsoft-ad-limit-reached (deser-cloud-only-directories-limit-reached (input "CloudOnlyMicrosoftADLimitReached")))))

(clojure.core/defn- deser-domain-controller-status-reason [input] input)

(clojure.core/defn- deser-created-date-time [input] input)

(clojure.core/defn- deser-request-id [input] input)

(clojure.core/defn- deser-subnet-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-customer-id [input] input)

(clojure.core/defn- deser-ip-addrs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-addr coll))) input))

(clojure.core/defn- deser-domain-controller-status [input] (clojure.core/get {"Creating" :creating, "Active" :active, "Impaired" :impaired, "Restoring" :restoring, "Deleting" :deleting, "Deleted" :deleted, "Failed" :failed} input))

(clojure.core/defn- deser-snapshot-limits [input] (clojure.core/cond-> {} (clojure.core/contains? input "ManualSnapshotsLimit") (clojure.core/assoc :manual-snapshots-limit (deser-limit (input "ManualSnapshotsLimit"))) (clojure.core/contains? input "ManualSnapshotsCurrentCount") (clojure.core/assoc :manual-snapshots-current-count (deser-limit (input "ManualSnapshotsCurrentCount"))) (clojure.core/contains? input "ManualSnapshotsLimitReached") (clojure.core/assoc :manual-snapshots-limit-reached (deser-manual-snapshots-limit-reached (input "ManualSnapshotsLimitReached")))))

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-owner-directory-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-customer-id (input "AccountId"))) (clojure.core/contains? input "DnsIpAddrs") (clojure.core/assoc :dns-ip-addrs (deser-dns-ip-addrs (input "DnsIpAddrs"))) (clojure.core/contains? input "VpcSettings") (clojure.core/assoc :vpc-settings (deser-directory-vpc-settings-description (input "VpcSettings"))) (clojure.core/contains? input "RadiusSettings") (clojure.core/assoc :radius-settings (deser-radius-settings (input "RadiusSettings"))) (clojure.core/contains? input "RadiusStatus") (clojure.core/assoc :radius-status (deser-radius-status (input "RadiusStatus")))))

(clojure.core/defn- deser-event-topic [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "TopicName") (clojure.core/assoc :topic-name (deser-topic-name (input "TopicName"))) (clojure.core/contains? input "TopicArn") (clojure.core/assoc :topic-arn (deser-topic-arn (input "TopicArn"))) (clojure.core/contains? input "CreatedDateTime") (clojure.core/assoc :created-date-time (deser-created-date-time (input "CreatedDateTime"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-topic-status (input "Status")))))

(clojure.core/defn- deser-use-same-username [input] input)

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-stage-reason [input] input)

(clojure.core/defn- deser-start-time [input] input)

(clojure.core/defn- deser-manual-snapshots-limit-reached [input] input)

(clojure.core/defn- deser-directory-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-directory-type (input "Type"))) (clojure.core/contains? input "OwnerDirectoryDescription") (clojure.core/assoc :owner-directory-description (deser-owner-directory-description (input "OwnerDirectoryDescription"))) (clojure.core/contains? input "StageReason") (clojure.core/assoc :stage-reason (deser-stage-reason (input "StageReason"))) (clojure.core/contains? input "Edition") (clojure.core/assoc :edition (deser-directory-edition (input "Edition"))) (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-alias-name (input "Alias"))) (clojure.core/contains? input "ShortName") (clojure.core/assoc :short-name (deser-directory-short-name (input "ShortName"))) (clojure.core/contains? input "DesiredNumberOfDomainControllers") (clojure.core/assoc :desired-number-of-domain-controllers (deser-desired-number-of-domain-controllers (input "DesiredNumberOfDomainControllers"))) (clojure.core/contains? input "ShareStatus") (clojure.core/assoc :share-status (deser-share-status (input "ShareStatus"))) (clojure.core/contains? input "ShareNotes") (clojure.core/assoc :share-notes (deser-notes (input "ShareNotes"))) (clojure.core/contains? input "SsoEnabled") (clojure.core/assoc :sso-enabled (deser-sso-enabled (input "SsoEnabled"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "RadiusSettings") (clojure.core/assoc :radius-settings (deser-radius-settings (input "RadiusSettings"))) (clojure.core/contains? input "ShareMethod") (clojure.core/assoc :share-method (deser-share-method (input "ShareMethod"))) (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-directory-size (input "Size"))) (clojure.core/contains? input "DnsIpAddrs") (clojure.core/assoc :dns-ip-addrs (deser-dns-ip-addrs (input "DnsIpAddrs"))) (clojure.core/contains? input "AccessUrl") (clojure.core/assoc :access-url (deser-access-url (input "AccessUrl"))) (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "ConnectSettings") (clojure.core/assoc :connect-settings (deser-directory-connect-settings-description (input "ConnectSettings"))) (clojure.core/contains? input "StageLastUpdatedDateTime") (clojure.core/assoc :stage-last-updated-date-time (deser-last-updated-date-time (input "StageLastUpdatedDateTime"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-directory-name (input "Name"))) (clojure.core/contains? input "LaunchTime") (clojure.core/assoc :launch-time (deser-launch-time (input "LaunchTime"))) (clojure.core/contains? input "RadiusStatus") (clojure.core/assoc :radius-status (deser-radius-status (input "RadiusStatus"))) (clojure.core/contains? input "VpcSettings") (clojure.core/assoc :vpc-settings (deser-directory-vpc-settings-description (input "VpcSettings"))) (clojure.core/contains? input "Stage") (clojure.core/assoc :stage (deser-directory-stage (input "Stage")))))

(clojure.core/defn- deser-topic-name [input] input)

(clojure.core/defn- deser-schema-extension-status-reason [input] input)

(clojure.core/defn- deser-radius-shared-secret [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-state-last-updated-date-time [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-desired-number-of-domain-controllers [input] input)

(clojure.core/defn- deser-ip-route-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "CidrIp") (clojure.core/assoc :cidr-ip (deser-cidr-ip (input "CidrIp"))) (clojure.core/contains? input "IpRouteStatusMsg") (clojure.core/assoc :ip-route-status-msg (deser-ip-route-status-msg (input "IpRouteStatusMsg"))) (clojure.core/contains? input "AddedDateTime") (clojure.core/assoc :added-date-time (deser-added-date-time (input "AddedDateTime"))) (clojure.core/contains? input "IpRouteStatusReason") (clojure.core/assoc :ip-route-status-reason (deser-ip-route-status-reason (input "IpRouteStatusReason"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description")))))

(clojure.core/defn- deser-limit [input] input)

(clojure.core/defn- deser-trust-type [input] (clojure.core/get {"Forest" :forest, "External" :external} input))

(clojure.core/defn- deser-availability-zone [input] input)

(clojure.core/defn- deser-snapshot-type [input] (clojure.core/get {"Auto" :auto, "Manual" :manual} input))

(clojure.core/defn- deser-directory-vpc-settings-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (input "VpcId"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (input "SubnetIds"))) (clojure.core/contains? input "SecurityGroupId") (clojure.core/assoc :security-group-id (deser-security-group-id (input "SecurityGroupId"))) (clojure.core/contains? input "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (input "AvailabilityZones")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-attribute [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-attribute-name (input "Name"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-attribute-value (input "Value")))))

(clojure.core/defn- deser-domain-controllers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-controller coll))) input))

(clojure.core/defn- deser-log-subscriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-log-subscription coll))) input))

(clojure.core/defn- deser-domain-controller-id [input] input)

(clojure.core/defn- deser-computer [input] (clojure.core/cond-> {} (clojure.core/contains? input "ComputerId") (clojure.core/assoc :computer-id (deser-sid (input "ComputerId"))) (clojure.core/contains? input "ComputerName") (clojure.core/assoc :computer-name (deser-computer-name (input "ComputerName"))) (clojure.core/contains? input "ComputerAttributes") (clojure.core/assoc :computer-attributes (deser-attributes (input "ComputerAttributes")))))

(clojure.core/defn- deser-cloud-only-directories-limit-reached [input] input)

(clojure.core/defn- deser-user-name [input] input)

(clojure.core/defn- deser-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute coll))) input))

(clojure.core/defn- deser-trust-direction [input] (clojure.core/get {"One-Way: Outgoing" :one-way-outgoing, "One-Way: Incoming" :one-way-incoming, "Two-Way" :two-way} input))

(clojure.core/defn- deser-directory-short-name [input] input)

(clojure.core/defn- deser-trust-state-reason [input] input)

(clojure.core/defn- deser-snapshot-status [input] (clojure.core/get {"Creating" :creating, "Completed" :completed, "Failed" :failed} input))

(clojure.core/defn- deser-ip-routes-info [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-route-info coll))) input))

(clojure.core/defn- deser-event-topics [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-topic coll))) input))

(clojure.core/defn- deser-share-status [input] (clojure.core/get {"Rejecting" :rejecting, "Rejected" :rejected, "Deleting" :deleting, "ShareFailed" :share-failed, "Deleted" :deleted, "Sharing" :sharing, "Shared" :shared, "RejectFailed" :reject-failed, "PendingAcceptance" :pending-acceptance} input))

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-added-date-time [input] input)

(clojure.core/defn- deser-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server coll))) input))

(clojure.core/defn- deser-radius-authentication-protocol [input] (clojure.core/get {"PAP" :pap, "CHAP" :chap, "MS-CHAPv1" :mscha-pv-1, "MS-CHAPv2" :mscha-pv-2} input))

(clojure.core/defn- deser-trust-id [input] input)

(clojure.core/defn- deser-sso-enabled [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-schema-extension-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "SchemaExtensionId") (clojure.core/assoc :schema-extension-id (deser-schema-extension-id (input "SchemaExtensionId"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "SchemaExtensionStatus") (clojure.core/assoc :schema-extension-status (deser-schema-extension-status (input "SchemaExtensionStatus"))) (clojure.core/contains? input "SchemaExtensionStatusReason") (clojure.core/assoc :schema-extension-status-reason (deser-schema-extension-status-reason (input "SchemaExtensionStatusReason"))) (clojure.core/contains? input "StartDateTime") (clojure.core/assoc :start-date-time (deser-start-date-time (input "StartDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-end-date-time (input "EndDateTime")))))

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-schema-extension-id [input] input)

(clojure.core/defn- deser-trusts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trust coll))) input))

(clojure.core/defn- deser-radius-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "RadiusServers") (clojure.core/assoc :radius-servers (deser-servers (input "RadiusServers"))) (clojure.core/contains? input "RadiusPort") (clojure.core/assoc :radius-port (deser-port-number (input "RadiusPort"))) (clojure.core/contains? input "RadiusTimeout") (clojure.core/assoc :radius-timeout (deser-radius-timeout (input "RadiusTimeout"))) (clojure.core/contains? input "RadiusRetries") (clojure.core/assoc :radius-retries (deser-radius-retries (input "RadiusRetries"))) (clojure.core/contains? input "SharedSecret") (clojure.core/assoc :shared-secret (deser-radius-shared-secret (input "SharedSecret"))) (clojure.core/contains? input "AuthenticationProtocol") (clojure.core/assoc :authentication-protocol (deser-radius-authentication-protocol (input "AuthenticationProtocol"))) (clojure.core/contains? input "DisplayLabel") (clojure.core/assoc :display-label (deser-radius-display-label (input "DisplayLabel"))) (clojure.core/contains? input "UseSameUsername") (clojure.core/assoc :use-same-username (deser-use-same-username (input "UseSameUsername")))))

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-share-method [input] (clojure.core/get {"ORGANIZATIONS" :organizations, "HANDSHAKE" :handshake} input))

(clojure.core/defn- deser-shared-directories [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-shared-directory coll))) input))

(clojure.core/defn- deser-directory-size [input] (clojure.core/get {"Small" :small, "Large" :large} input))

(clojure.core/defn- deser-replication-scope [input] (clojure.core/get {"Domain" :domain} input))

(clojure.core/defn- deser-directory-type [input] (clojure.core/get {"SimpleAD" :simple-ad, "ADConnector" :ad-connector, "MicrosoftAD" :microsoft-ad, "SharedMicrosoftAD" :shared-microsoft-ad} input))

(clojure.core/defn- deser-last-updated-date-time [input] input)

(clojure.core/defn- deser-directory-connect-settings-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (input "VpcId"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (input "SubnetIds"))) (clojure.core/contains? input "CustomerUserName") (clojure.core/assoc :customer-user-name (deser-user-name (input "CustomerUserName"))) (clojure.core/contains? input "SecurityGroupId") (clojure.core/assoc :security-group-id (deser-security-group-id (input "SecurityGroupId"))) (clojure.core/contains? input "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (input "AvailabilityZones"))) (clojure.core/contains? input "ConnectIps") (clojure.core/assoc :connect-ips (deser-ip-addrs (input "ConnectIps")))))

(clojure.core/defn- deser-topic-arn [input] input)

(clojure.core/defn- deser-snapshot [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (input "SnapshotId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-snapshot-type (input "Type"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-snapshot-name (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-snapshot-status (input "Status"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-start-time (input "StartTime")))))

(clojure.core/defn- deser-shared-directory [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreatedDateTime") (clojure.core/assoc :created-date-time (deser-created-date-time (input "CreatedDateTime"))) (clojure.core/contains? input "OwnerAccountId") (clojure.core/assoc :owner-account-id (deser-customer-id (input "OwnerAccountId"))) (clojure.core/contains? input "SharedDirectoryId") (clojure.core/assoc :shared-directory-id (deser-directory-id (input "SharedDirectoryId"))) (clojure.core/contains? input "ShareStatus") (clojure.core/assoc :share-status (deser-share-status (input "ShareStatus"))) (clojure.core/contains? input "ShareNotes") (clojure.core/assoc :share-notes (deser-notes (input "ShareNotes"))) (clojure.core/contains? input "ShareMethod") (clojure.core/assoc :share-method (deser-share-method (input "ShareMethod"))) (clojure.core/contains? input "LastUpdatedDateTime") (clojure.core/assoc :last-updated-date-time (deser-last-updated-date-time (input "LastUpdatedDateTime"))) (clojure.core/contains? input "OwnerDirectoryId") (clojure.core/assoc :owner-directory-id (deser-directory-id (input "OwnerDirectoryId"))) (clojure.core/contains? input "SharedAccountId") (clojure.core/assoc :shared-account-id (deser-customer-id (input "SharedAccountId")))))

(clojure.core/defn- deser-trust-state [input] (clojure.core/get {"Verified" :verified, "Created" :created, "Failed" :failed, "Creating" :creating, "UpdateFailed" :update-failed, "VerifyFailed" :verify-failed, "Deleting" :deleting, "Deleted" :deleted, "Verifying" :verifying, "Updating" :updating, "Updated" :updated} input))

(clojure.core/defn- deser-log-group-name [input] input)

(clojure.core/defn- deser-dns-ip-addrs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-addr coll))) input))

(clojure.core/defn- deser-access-url [input] input)

(clojure.core/defn- deser-server [input] input)

(clojure.core/defn- deser-selective-auth [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} input))

(clojure.core/defn- deser-end-date-time [input] input)

(clojure.core/defn- deser-radius-retries [input] input)

(clojure.core/defn- deser-directory-edition [input] (clojure.core/get {"Enterprise" :enterprise, "Standard" :standard} input))

(clojure.core/defn- deser-radius-timeout [input] input)

(clojure.core/defn- deser-directory-stage [input] (clojure.core/get {"Created" :created, "Failed" :failed, "Active" :active, "Creating" :creating, "Inoperable" :inoperable, "Restoring" :restoring, "RestoreFailed" :restore-failed, "Deleting" :deleting, "Deleted" :deleted, "Impaired" :impaired, "Requested" :requested} input))

(clojure.core/defn- deser-directory-id [input] input)

(clojure.core/defn- deser-subscription-created-date-time [input] input)

(clojure.core/defn- deser-schema-extensions-info [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-schema-extension-info coll))) input))

(clojure.core/defn- deser-domain-controller [input] (clojure.core/cond-> {} (clojure.core/contains? input "StatusLastUpdatedDateTime") (clojure.core/assoc :status-last-updated-date-time (deser-last-updated-date-time (input "StatusLastUpdatedDateTime"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (input "SubnetId"))) (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-availability-zone (input "AvailabilityZone"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-domain-controller-status (input "Status"))) (clojure.core/contains? input "DomainControllerId") (clojure.core/assoc :domain-controller-id (deser-domain-controller-id (input "DomainControllerId"))) (clojure.core/contains? input "StatusReason") (clojure.core/assoc :status-reason (deser-domain-controller-status-reason (input "StatusReason"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (input "VpcId"))) (clojure.core/contains? input "DnsIpAddr") (clojure.core/assoc :dns-ip-addr (deser-ip-addr (input "DnsIpAddr"))) (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "LaunchTime") (clojure.core/assoc :launch-time (deser-launch-time (input "LaunchTime")))))

(clojure.core/defn- deser-remote-domain-name [input] input)

(clojure.core/defn- deser-directory-name [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-conditional-forwarders [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-conditional-forwarder coll))) input))

(clojure.core/defn- deser-topic-status [input] (clojure.core/get {"Registered" :registered, "Topic not found" :topicnotfound, "Failed" :failed, "Deleted" :deleted} input))

(clojure.core/defn- deser-connected-directories-limit-reached [input] input)

(clojure.core/defn- deser-trust [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreatedDateTime") (clojure.core/assoc :created-date-time (deser-created-date-time (input "CreatedDateTime"))) (clojure.core/contains? input "StateLastUpdatedDateTime") (clojure.core/assoc :state-last-updated-date-time (deser-state-last-updated-date-time (input "StateLastUpdatedDateTime"))) (clojure.core/contains? input "TrustType") (clojure.core/assoc :trust-type (deser-trust-type (input "TrustType"))) (clojure.core/contains? input "TrustDirection") (clojure.core/assoc :trust-direction (deser-trust-direction (input "TrustDirection"))) (clojure.core/contains? input "TrustStateReason") (clojure.core/assoc :trust-state-reason (deser-trust-state-reason (input "TrustStateReason"))) (clojure.core/contains? input "TrustId") (clojure.core/assoc :trust-id (deser-trust-id (input "TrustId"))) (clojure.core/contains? input "LastUpdatedDateTime") (clojure.core/assoc :last-updated-date-time (deser-last-updated-date-time (input "LastUpdatedDateTime"))) (clojure.core/contains? input "TrustState") (clojure.core/assoc :trust-state (deser-trust-state (input "TrustState"))) (clojure.core/contains? input "SelectiveAuth") (clojure.core/assoc :selective-auth (deser-selective-auth (input "SelectiveAuth"))) (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "RemoteDomainName") (clojure.core/assoc :remote-domain-name (deser-remote-domain-name (input "RemoteDomainName")))))

(clojure.core/defn- deser-alias-name [input] input)

(clojure.core/defn- deser-launch-time [input] input)

(clojure.core/defn- deser-radius-status [input] (clojure.core/get {"Creating" :creating, "Completed" :completed, "Failed" :failed} input))

(clojure.core/defn- deser-directory-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-directory-description coll))) input))

(clojure.core/defn- deser-availability-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-availability-zone coll))) input))

(clojure.core/defn- deser-port-number [input] input)

(clojure.core/defn- deser-schema-extension-status [input] (clojure.core/get {"CreatingSnapshot" :creating-snapshot, "Failed" :failed, "Cancelled" :cancelled, "CancelInProgress" :cancel-in-progress, "RollbackInProgress" :rollback-in-progress, "UpdatingSchema" :updating-schema, "Completed" :completed, "Initializing" :initializing, "Replicating" :replicating} input))

(clojure.core/defn- deser-ip-route-status-reason [input] input)

(clojure.core/defn- deser-start-date-time [input] input)

(clojure.core/defn- deser-notes [input] input)

(clojure.core/defn- deser-computer-name [input] input)

(clojure.core/defn- deser-log-subscription [input] (clojure.core/cond-> {} (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "LogGroupName") (clojure.core/assoc :log-group-name (deser-log-group-name (input "LogGroupName"))) (clojure.core/contains? input "SubscriptionCreatedDateTime") (clojure.core/assoc :subscription-created-date-time (deser-subscription-created-date-time (input "SubscriptionCreatedDateTime")))))

(clojure.core/defn- deser-snapshot-name [input] input)

(clojure.core/defn- deser-cidr-ip [input] input)

(clojure.core/defn- deser-snapshot-id [input] input)

(clojure.core/defn- deser-sid [input] input)

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper569511 input] (clojure.core/let [rawinput569510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569512 {"Tags" (rawinput569510 "Tags"), "NextToken" (rawinput569510 "NextToken")}] (clojure.core/cond-> {} (letvar569512 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar569512 ["Tags"]))) (letvar569512 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569512 ["NextToken"])))))))

(clojure.core/defn- response-update-radius-result ([input] (response-update-radius-result nil input)) ([resultWrapper569514 input] (clojure.core/let [rawinput569513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569515 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-event-topics-result ([input] (response-describe-event-topics-result nil input)) ([resultWrapper569517 input] (clojure.core/let [rawinput569516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569518 {"EventTopics" (rawinput569516 "EventTopics")}] (clojure.core/cond-> {} (letvar569518 "EventTopics") (clojure.core/assoc :event-topics (deser-event-topics (clojure.core/get-in letvar569518 ["EventTopics"])))))))

(clojure.core/defn- response-organizations-exception ([input] (response-organizations-exception nil input)) ([resultWrapper569520 input] (clojure.core/let [rawinput569519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569521 {"Message" (rawinput569519 "Message"), "RequestId" (rawinput569519 "RequestId")}] (clojure.core/cond-> {} (letvar569521 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569521 ["Message"]))) (letvar569521 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569521 ["RequestId"])))))))

(clojure.core/defn- response-create-conditional-forwarder-result ([input] (response-create-conditional-forwarder-result nil input)) ([resultWrapper569523 input] (clojure.core/let [rawinput569522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569524 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-conditional-forwarder-result ([input] (response-update-conditional-forwarder-result nil input)) ([resultWrapper569526 input] (clojure.core/let [rawinput569525 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569527 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-entity-does-not-exist-exception ([input] (response-entity-does-not-exist-exception nil input)) ([resultWrapper569529 input] (clojure.core/let [rawinput569528 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569530 {"Message" (rawinput569528 "Message"), "RequestId" (rawinput569528 "RequestId")}] (clojure.core/cond-> {} (letvar569530 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569530 ["Message"]))) (letvar569530 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569530 ["RequestId"])))))))

(clojure.core/defn- response-directory-already-shared-exception ([input] (response-directory-already-shared-exception nil input)) ([resultWrapper569532 input] (clojure.core/let [rawinput569531 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569533 {"Message" (rawinput569531 "Message"), "RequestId" (rawinput569531 "RequestId")}] (clojure.core/cond-> {} (letvar569533 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569533 ["Message"]))) (letvar569533 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569533 ["RequestId"])))))))

(clojure.core/defn- response-describe-conditional-forwarders-result ([input] (response-describe-conditional-forwarders-result nil input)) ([resultWrapper569535 input] (clojure.core/let [rawinput569534 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569536 {"ConditionalForwarders" (rawinput569534 "ConditionalForwarders")}] (clojure.core/cond-> {} (letvar569536 "ConditionalForwarders") (clojure.core/assoc :conditional-forwarders (deser-conditional-forwarders (clojure.core/get-in letvar569536 ["ConditionalForwarders"])))))))

(clojure.core/defn- response-client-exception ([input] (response-client-exception nil input)) ([resultWrapper569538 input] (clojure.core/let [rawinput569537 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569539 {"Message" (rawinput569537 "Message"), "RequestId" (rawinput569537 "RequestId")}] (clojure.core/cond-> {} (letvar569539 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569539 ["Message"]))) (letvar569539 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569539 ["RequestId"])))))))

(clojure.core/defn- response-ip-route-limit-exceeded-exception ([input] (response-ip-route-limit-exceeded-exception nil input)) ([resultWrapper569541 input] (clojure.core/let [rawinput569540 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569542 {"Message" (rawinput569540 "Message"), "RequestId" (rawinput569540 "RequestId")}] (clojure.core/cond-> {} (letvar569542 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569542 ["Message"]))) (letvar569542 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569542 ["RequestId"])))))))

(clojure.core/defn- response-enable-radius-result ([input] (response-enable-radius-result nil input)) ([resultWrapper569544 input] (clojure.core/let [rawinput569543 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569545 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-ip-routes-result ([input] (response-list-ip-routes-result nil input)) ([resultWrapper569547 input] (clojure.core/let [rawinput569546 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569548 {"IpRoutesInfo" (rawinput569546 "IpRoutesInfo"), "NextToken" (rawinput569546 "NextToken")}] (clojure.core/cond-> {} (letvar569548 "IpRoutesInfo") (clojure.core/assoc :ip-routes-info (deser-ip-routes-info (clojure.core/get-in letvar569548 ["IpRoutesInfo"]))) (letvar569548 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569548 ["NextToken"])))))))

(clojure.core/defn- response-create-alias-result ([input] (response-create-alias-result nil input)) ([resultWrapper569550 input] (clojure.core/let [rawinput569549 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569551 {"DirectoryId" (rawinput569549 "DirectoryId"), "Alias" (rawinput569549 "Alias")}] (clojure.core/cond-> {} (letvar569551 "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (clojure.core/get-in letvar569551 ["DirectoryId"]))) (letvar569551 "Alias") (clojure.core/assoc :alias (deser-alias-name (clojure.core/get-in letvar569551 ["Alias"])))))))

(clojure.core/defn- response-share-directory-result ([input] (response-share-directory-result nil input)) ([resultWrapper569553 input] (clojure.core/let [rawinput569552 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569554 {"SharedDirectoryId" (rawinput569552 "SharedDirectoryId")}] (clojure.core/cond-> {} (letvar569554 "SharedDirectoryId") (clojure.core/assoc :shared-directory-id (deser-directory-id (clojure.core/get-in letvar569554 ["SharedDirectoryId"])))))))

(clojure.core/defn- response-describe-trusts-result ([input] (response-describe-trusts-result nil input)) ([resultWrapper569556 input] (clojure.core/let [rawinput569555 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569557 {"Trusts" (rawinput569555 "Trusts"), "NextToken" (rawinput569555 "NextToken")}] (clojure.core/cond-> {} (letvar569557 "Trusts") (clojure.core/assoc :trusts (deser-trusts (clojure.core/get-in letvar569557 ["Trusts"]))) (letvar569557 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569557 ["NextToken"])))))))

(clojure.core/defn- response-directory-limit-exceeded-exception ([input] (response-directory-limit-exceeded-exception nil input)) ([resultWrapper569559 input] (clojure.core/let [rawinput569558 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569560 {"Message" (rawinput569558 "Message"), "RequestId" (rawinput569558 "RequestId")}] (clojure.core/cond-> {} (letvar569560 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569560 ["Message"]))) (letvar569560 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569560 ["RequestId"])))))))

(clojure.core/defn- response-invalid-target-exception ([input] (response-invalid-target-exception nil input)) ([resultWrapper569562 input] (clojure.core/let [rawinput569561 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569563 {"Message" (rawinput569561 "Message"), "RequestId" (rawinput569561 "RequestId")}] (clojure.core/cond-> {} (letvar569563 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569563 ["Message"]))) (letvar569563 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569563 ["RequestId"])))))))

(clojure.core/defn- response-describe-directories-result ([input] (response-describe-directories-result nil input)) ([resultWrapper569565 input] (clojure.core/let [rawinput569564 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569566 {"DirectoryDescriptions" (rawinput569564 "DirectoryDescriptions"), "NextToken" (rawinput569564 "NextToken")}] (clojure.core/cond-> {} (letvar569566 "DirectoryDescriptions") (clojure.core/assoc :directory-descriptions (deser-directory-descriptions (clojure.core/get-in letvar569566 ["DirectoryDescriptions"]))) (letvar569566 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569566 ["NextToken"])))))))

(clojure.core/defn- response-list-schema-extensions-result ([input] (response-list-schema-extensions-result nil input)) ([resultWrapper569568 input] (clojure.core/let [rawinput569567 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569569 {"SchemaExtensionsInfo" (rawinput569567 "SchemaExtensionsInfo"), "NextToken" (rawinput569567 "NextToken")}] (clojure.core/cond-> {} (letvar569569 "SchemaExtensionsInfo") (clojure.core/assoc :schema-extensions-info (deser-schema-extensions-info (clojure.core/get-in letvar569569 ["SchemaExtensionsInfo"]))) (letvar569569 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569569 ["NextToken"])))))))

(clojure.core/defn- response-register-event-topic-result ([input] (response-register-event-topic-result nil input)) ([resultWrapper569571 input] (clojure.core/let [rawinput569570 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569572 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-share-limit-exceeded-exception ([input] (response-share-limit-exceeded-exception nil input)) ([resultWrapper569574 input] (clojure.core/let [rawinput569573 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569575 {"Message" (rawinput569573 "Message"), "RequestId" (rawinput569573 "RequestId")}] (clojure.core/cond-> {} (letvar569575 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569575 ["Message"]))) (letvar569575 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569575 ["RequestId"])))))))

(clojure.core/defn- response-service-exception ([input] (response-service-exception nil input)) ([resultWrapper569577 input] (clojure.core/let [rawinput569576 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569578 {"Message" (rawinput569576 "Message"), "RequestId" (rawinput569576 "RequestId")}] (clojure.core/cond-> {} (letvar569578 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569578 ["Message"]))) (letvar569578 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569578 ["RequestId"])))))))

(clojure.core/defn- response-remove-ip-routes-result ([input] (response-remove-ip-routes-result nil input)) ([resultWrapper569580 input] (clojure.core/let [rawinput569579 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569581 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-trust-result ([input] (response-create-trust-result nil input)) ([resultWrapper569583 input] (clojure.core/let [rawinput569582 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569584 {"TrustId" (rawinput569582 "TrustId")}] (clojure.core/cond-> {} (letvar569584 "TrustId") (clojure.core/assoc :trust-id (deser-trust-id (clojure.core/get-in letvar569584 ["TrustId"])))))))

(clojure.core/defn- response-disable-sso-result ([input] (response-disable-sso-result nil input)) ([resultWrapper569586 input] (clojure.core/let [rawinput569585 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569587 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-shared-directories-result ([input] (response-describe-shared-directories-result nil input)) ([resultWrapper569589 input] (clojure.core/let [rawinput569588 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569590 {"SharedDirectories" (rawinput569588 "SharedDirectories"), "NextToken" (rawinput569588 "NextToken")}] (clojure.core/cond-> {} (letvar569590 "SharedDirectories") (clojure.core/assoc :shared-directories (deser-shared-directories (clojure.core/get-in letvar569590 ["SharedDirectories"]))) (letvar569590 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569590 ["NextToken"])))))))

(clojure.core/defn- response-deregister-event-topic-result ([input] (response-deregister-event-topic-result nil input)) ([resultWrapper569592 input] (clojure.core/let [rawinput569591 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569593 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-directory-limits-result ([input] (response-get-directory-limits-result nil input)) ([resultWrapper569595 input] (clojure.core/let [rawinput569594 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569596 {"DirectoryLimits" (rawinput569594 "DirectoryLimits")}] (clojure.core/cond-> {} (letvar569596 "DirectoryLimits") (clojure.core/assoc :directory-limits (deser-directory-limits (clojure.core/get-in letvar569596 ["DirectoryLimits"])))))))

(clojure.core/defn- response-tag-limit-exceeded-exception ([input] (response-tag-limit-exceeded-exception nil input)) ([resultWrapper569598 input] (clojure.core/let [rawinput569597 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569599 {"Message" (rawinput569597 "Message"), "RequestId" (rawinput569597 "RequestId")}] (clojure.core/cond-> {} (letvar569599 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569599 ["Message"]))) (letvar569599 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569599 ["RequestId"])))))))

(clojure.core/defn- response-invalid-password-exception ([input] (response-invalid-password-exception nil input)) ([resultWrapper569601 input] (clojure.core/let [rawinput569600 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569602 {"Message" (rawinput569600 "Message"), "RequestId" (rawinput569600 "RequestId")}] (clojure.core/cond-> {} (letvar569602 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569602 ["Message"]))) (letvar569602 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569602 ["RequestId"])))))))

(clojure.core/defn- response-update-trust-result ([input] (response-update-trust-result nil input)) ([resultWrapper569604 input] (clojure.core/let [rawinput569603 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569605 {"RequestId" (rawinput569603 "RequestId"), "TrustId" (rawinput569603 "TrustId")}] (clojure.core/cond-> {} (letvar569605 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569605 ["RequestId"]))) (letvar569605 "TrustId") (clojure.core/assoc :trust-id (deser-trust-id (clojure.core/get-in letvar569605 ["TrustId"])))))))

(clojure.core/defn- response-delete-conditional-forwarder-result ([input] (response-delete-conditional-forwarder-result nil input)) ([resultWrapper569607 input] (clojure.core/let [rawinput569606 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569608 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-entity-already-exists-exception ([input] (response-entity-already-exists-exception nil input)) ([resultWrapper569610 input] (clojure.core/let [rawinput569609 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569611 {"Message" (rawinput569609 "Message"), "RequestId" (rawinput569609 "RequestId")}] (clojure.core/cond-> {} (letvar569611 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569611 ["Message"]))) (letvar569611 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569611 ["RequestId"])))))))

(clojure.core/defn- response-create-microsoft-ad-result ([input] (response-create-microsoft-ad-result nil input)) ([resultWrapper569613 input] (clojure.core/let [rawinput569612 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569614 {"DirectoryId" (rawinput569612 "DirectoryId")}] (clojure.core/cond-> {} (letvar569614 "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (clojure.core/get-in letvar569614 ["DirectoryId"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper569616 input] (clojure.core/let [rawinput569615 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569617 {"Message" (rawinput569615 "Message"), "RequestId" (rawinput569615 "RequestId")}] (clojure.core/cond-> {} (letvar569617 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569617 ["Message"]))) (letvar569617 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569617 ["RequestId"])))))))

(clojure.core/defn- response-delete-snapshot-result ([input] (response-delete-snapshot-result nil input)) ([resultWrapper569619 input] (clojure.core/let [rawinput569618 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569620 {"SnapshotId" (rawinput569618 "SnapshotId")}] (clojure.core/cond-> {} (letvar569620 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar569620 ["SnapshotId"])))))))

(clojure.core/defn- response-reject-shared-directory-result ([input] (response-reject-shared-directory-result nil input)) ([resultWrapper569622 input] (clojure.core/let [rawinput569621 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569623 {"SharedDirectoryId" (rawinput569621 "SharedDirectoryId")}] (clojure.core/cond-> {} (letvar569623 "SharedDirectoryId") (clojure.core/assoc :shared-directory-id (deser-directory-id (clojure.core/get-in letvar569623 ["SharedDirectoryId"])))))))

(clojure.core/defn- response-domain-controller-limit-exceeded-exception ([input] (response-domain-controller-limit-exceeded-exception nil input)) ([resultWrapper569625 input] (clojure.core/let [rawinput569624 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569626 {"Message" (rawinput569624 "Message"), "RequestId" (rawinput569624 "RequestId")}] (clojure.core/cond-> {} (letvar569626 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569626 ["Message"]))) (letvar569626 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569626 ["RequestId"])))))))

(clojure.core/defn- response-directory-unavailable-exception ([input] (response-directory-unavailable-exception nil input)) ([resultWrapper569628 input] (clojure.core/let [rawinput569627 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569629 {"Message" (rawinput569627 "Message"), "RequestId" (rawinput569627 "RequestId")}] (clojure.core/cond-> {} (letvar569629 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569629 ["Message"]))) (letvar569629 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569629 ["RequestId"])))))))

(clojure.core/defn- response-create-snapshot-result ([input] (response-create-snapshot-result nil input)) ([resultWrapper569631 input] (clojure.core/let [rawinput569630 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569632 {"SnapshotId" (rawinput569630 "SnapshotId")}] (clojure.core/cond-> {} (letvar569632 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar569632 ["SnapshotId"])))))))

(clojure.core/defn- response-directory-not-shared-exception ([input] (response-directory-not-shared-exception nil input)) ([resultWrapper569634 input] (clojure.core/let [rawinput569633 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569635 {"Message" (rawinput569633 "Message"), "RequestId" (rawinput569633 "RequestId")}] (clojure.core/cond-> {} (letvar569635 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569635 ["Message"]))) (letvar569635 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569635 ["RequestId"])))))))

(clojure.core/defn- response-update-number-of-domain-controllers-result ([input] (response-update-number-of-domain-controllers-result nil input)) ([resultWrapper569637 input] (clojure.core/let [rawinput569636 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569638 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper569640 input] (clojure.core/let [rawinput569639 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569641 {"Message" (rawinput569639 "Message"), "RequestId" (rawinput569639 "RequestId")}] (clojure.core/cond-> {} (letvar569641 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569641 ["Message"]))) (letvar569641 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569641 ["RequestId"])))))))

(clojure.core/defn- response-describe-domain-controllers-result ([input] (response-describe-domain-controllers-result nil input)) ([resultWrapper569643 input] (clojure.core/let [rawinput569642 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569644 {"DomainControllers" (rawinput569642 "DomainControllers"), "NextToken" (rawinput569642 "NextToken")}] (clojure.core/cond-> {} (letvar569644 "DomainControllers") (clojure.core/assoc :domain-controllers (deser-domain-controllers (clojure.core/get-in letvar569644 ["DomainControllers"]))) (letvar569644 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569644 ["NextToken"])))))))

(clojure.core/defn- response-verify-trust-result ([input] (response-verify-trust-result nil input)) ([resultWrapper569646 input] (clojure.core/let [rawinput569645 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569647 {"TrustId" (rawinput569645 "TrustId")}] (clojure.core/cond-> {} (letvar569647 "TrustId") (clojure.core/assoc :trust-id (deser-trust-id (clojure.core/get-in letvar569647 ["TrustId"])))))))

(clojure.core/defn- response-restore-from-snapshot-result ([input] (response-restore-from-snapshot-result nil input)) ([resultWrapper569649 input] (clojure.core/let [rawinput569648 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569650 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unshare-directory-result ([input] (response-unshare-directory-result nil input)) ([resultWrapper569652 input] (clojure.core/let [rawinput569651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569653 {"SharedDirectoryId" (rawinput569651 "SharedDirectoryId")}] (clojure.core/cond-> {} (letvar569653 "SharedDirectoryId") (clojure.core/assoc :shared-directory-id (deser-directory-id (clojure.core/get-in letvar569653 ["SharedDirectoryId"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper569655 input] (clojure.core/let [rawinput569654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569656 {"Message" (rawinput569654 "Message"), "RequestId" (rawinput569654 "RequestId")}] (clojure.core/cond-> {} (letvar569656 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569656 ["Message"]))) (letvar569656 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569656 ["RequestId"])))))))

(clojure.core/defn- response-describe-snapshots-result ([input] (response-describe-snapshots-result nil input)) ([resultWrapper569658 input] (clojure.core/let [rawinput569657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569659 {"Snapshots" (rawinput569657 "Snapshots"), "NextToken" (rawinput569657 "NextToken")}] (clojure.core/cond-> {} (letvar569659 "Snapshots") (clojure.core/assoc :snapshots (deser-snapshots (clojure.core/get-in letvar569659 ["Snapshots"]))) (letvar569659 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569659 ["NextToken"])))))))

(clojure.core/defn- response-create-log-subscription-result ([input] (response-create-log-subscription-result nil input)) ([resultWrapper569661 input] (clojure.core/let [rawinput569660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569662 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-log-subscriptions-result ([input] (response-list-log-subscriptions-result nil input)) ([resultWrapper569664 input] (clojure.core/let [rawinput569663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569665 {"LogSubscriptions" (rawinput569663 "LogSubscriptions"), "NextToken" (rawinput569663 "NextToken")}] (clojure.core/cond-> {} (letvar569665 "LogSubscriptions") (clojure.core/assoc :log-subscriptions (deser-log-subscriptions (clojure.core/get-in letvar569665 ["LogSubscriptions"]))) (letvar569665 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar569665 ["NextToken"])))))))

(clojure.core/defn- response-cancel-schema-extension-result ([input] (response-cancel-schema-extension-result nil input)) ([resultWrapper569667 input] (clojure.core/let [rawinput569666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569668 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-tags-from-resource-result ([input] (response-remove-tags-from-resource-result nil input)) ([resultWrapper569670 input] (clojure.core/let [rawinput569669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569671 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-user-does-not-exist-exception ([input] (response-user-does-not-exist-exception nil input)) ([resultWrapper569673 input] (clojure.core/let [rawinput569672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569674 {"Message" (rawinput569672 "Message"), "RequestId" (rawinput569672 "RequestId")}] (clojure.core/cond-> {} (letvar569674 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569674 ["Message"]))) (letvar569674 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569674 ["RequestId"])))))))

(clojure.core/defn- response-get-snapshot-limits-result ([input] (response-get-snapshot-limits-result nil input)) ([resultWrapper569676 input] (clojure.core/let [rawinput569675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569677 {"SnapshotLimits" (rawinput569675 "SnapshotLimits")}] (clojure.core/cond-> {} (letvar569677 "SnapshotLimits") (clojure.core/assoc :snapshot-limits (deser-snapshot-limits (clojure.core/get-in letvar569677 ["SnapshotLimits"])))))))

(clojure.core/defn- response-create-directory-result ([input] (response-create-directory-result nil input)) ([resultWrapper569679 input] (clojure.core/let [rawinput569678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569680 {"DirectoryId" (rawinput569678 "DirectoryId")}] (clojure.core/cond-> {} (letvar569680 "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (clojure.core/get-in letvar569680 ["DirectoryId"])))))))

(clojure.core/defn- response-create-computer-result ([input] (response-create-computer-result nil input)) ([resultWrapper569682 input] (clojure.core/let [rawinput569681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569683 {"Computer" (rawinput569681 "Computer")}] (clojure.core/cond-> {} (letvar569683 "Computer") (clojure.core/assoc :computer (deser-computer (clojure.core/get-in letvar569683 ["Computer"])))))))

(clojure.core/defn- response-delete-log-subscription-result ([input] (response-delete-log-subscription-result nil input)) ([resultWrapper569685 input] (clojure.core/let [rawinput569684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569686 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-enable-sso-result ([input] (response-enable-sso-result nil input)) ([resultWrapper569688 input] (clojure.core/let [rawinput569687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569689 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-ip-routes-result ([input] (response-add-ip-routes-result nil input)) ([resultWrapper569691 input] (clojure.core/let [rawinput569690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569692 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-directory-result ([input] (response-delete-directory-result nil input)) ([resultWrapper569694 input] (clojure.core/let [rawinput569693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569695 {"DirectoryId" (rawinput569693 "DirectoryId")}] (clojure.core/cond-> {} (letvar569695 "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (clojure.core/get-in letvar569695 ["DirectoryId"])))))))

(clojure.core/defn- response-insufficient-permissions-exception ([input] (response-insufficient-permissions-exception nil input)) ([resultWrapper569697 input] (clojure.core/let [rawinput569696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569698 {"Message" (rawinput569696 "Message"), "RequestId" (rawinput569696 "RequestId")}] (clojure.core/cond-> {} (letvar569698 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569698 ["Message"]))) (letvar569698 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569698 ["RequestId"])))))))

(clojure.core/defn- response-start-schema-extension-result ([input] (response-start-schema-extension-result nil input)) ([resultWrapper569700 input] (clojure.core/let [rawinput569699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569701 {"SchemaExtensionId" (rawinput569699 "SchemaExtensionId")}] (clojure.core/cond-> {} (letvar569701 "SchemaExtensionId") (clojure.core/assoc :schema-extension-id (deser-schema-extension-id (clojure.core/get-in letvar569701 ["SchemaExtensionId"])))))))

(clojure.core/defn- response-connect-directory-result ([input] (response-connect-directory-result nil input)) ([resultWrapper569703 input] (clojure.core/let [rawinput569702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569704 {"DirectoryId" (rawinput569702 "DirectoryId")}] (clojure.core/cond-> {} (letvar569704 "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (clojure.core/get-in letvar569704 ["DirectoryId"])))))))

(clojure.core/defn- response-delete-trust-result ([input] (response-delete-trust-result nil input)) ([resultWrapper569706 input] (clojure.core/let [rawinput569705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569707 {"TrustId" (rawinput569705 "TrustId")}] (clojure.core/cond-> {} (letvar569707 "TrustId") (clojure.core/assoc :trust-id (deser-trust-id (clojure.core/get-in letvar569707 ["TrustId"])))))))

(clojure.core/defn- response-authentication-failed-exception ([input] (response-authentication-failed-exception nil input)) ([resultWrapper569709 input] (clojure.core/let [rawinput569708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569710 {"Message" (rawinput569708 "Message"), "RequestId" (rawinput569708 "RequestId")}] (clojure.core/cond-> {} (letvar569710 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569710 ["Message"]))) (letvar569710 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569710 ["RequestId"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper569712 input] (clojure.core/let [rawinput569711 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569713 {"Message" (rawinput569711 "Message"), "RequestId" (rawinput569711 "RequestId")}] (clojure.core/cond-> {} (letvar569713 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569713 ["Message"]))) (letvar569713 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569713 ["RequestId"])))))))

(clojure.core/defn- response-snapshot-limit-exceeded-exception ([input] (response-snapshot-limit-exceeded-exception nil input)) ([resultWrapper569715 input] (clojure.core/let [rawinput569714 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569716 {"Message" (rawinput569714 "Message"), "RequestId" (rawinput569714 "RequestId")}] (clojure.core/cond-> {} (letvar569716 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar569716 ["Message"]))) (letvar569716 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar569716 ["RequestId"])))))))

(clojure.core/defn- response-disable-radius-result ([input] (response-disable-radius-result nil input)) ([resultWrapper569718 input] (clojure.core/let [rawinput569717 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569719 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-accept-shared-directory-result ([input] (response-accept-shared-directory-result nil input)) ([resultWrapper569721 input] (clojure.core/let [rawinput569720 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569722 {"SharedDirectory" (rawinput569720 "SharedDirectory")}] (clojure.core/cond-> {} (letvar569722 "SharedDirectory") (clojure.core/assoc :shared-directory (deser-shared-directory (clojure.core/get-in letvar569722 ["SharedDirectory"])))))))

(clojure.core/defn- response-add-tags-to-resource-result ([input] (response-add-tags-to-resource-result nil input)) ([resultWrapper569724 input] (clojure.core/let [rawinput569723 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569725 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reset-user-password-result ([input] (response-reset-user-password-result nil input)) ([resultWrapper569727 input] (clojure.core/let [rawinput569726 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar569728 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.ds/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.ds/tag-key))

(clojure.spec.alpha/def :portkey.aws.ds/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/tags :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/describe-snapshots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/snapshot-ids :portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds/update-radius-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/create-conditional-forwarder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/remote-domain-name :portkey.aws.ds/dns-ip-addrs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/get-directory-limits-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/describe-directories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-ids :portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.connect-directory-request/name (clojure.spec.alpha/and :portkey.aws.ds/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.connect-directory-request/short-name (clojure.spec.alpha/and :portkey.aws.ds/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.connect-directory-request/password (clojure.spec.alpha/and :portkey.aws.ds/connect-password))
(clojure.spec.alpha/def :portkey.aws.ds.connect-directory-request/size (clojure.spec.alpha/and :portkey.aws.ds/directory-size))
(clojure.spec.alpha/def :portkey.aws.ds.connect-directory-request/connect-settings (clojure.spec.alpha/and :portkey.aws.ds/directory-connect-settings))
(clojure.spec.alpha/def :portkey.aws.ds/connect-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.connect-directory-request/name :portkey.aws.ds.connect-directory-request/password :portkey.aws.ds.connect-directory-request/size :portkey.aws.ds.connect-directory-request/connect-settings] :opt-un [:portkey.aws.ds.connect-directory-request/short-name :portkey.aws.ds/description :portkey.aws.ds/tags]))

(clojure.spec.alpha/def :portkey.aws.ds.create-directory-request/name (clojure.spec.alpha/and :portkey.aws.ds/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.create-directory-request/short-name (clojure.spec.alpha/and :portkey.aws.ds/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.create-directory-request/size (clojure.spec.alpha/and :portkey.aws.ds/directory-size))
(clojure.spec.alpha/def :portkey.aws.ds.create-directory-request/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds/directory-vpc-settings))
(clojure.spec.alpha/def :portkey.aws.ds/create-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.create-directory-request/name :portkey.aws.ds/password :portkey.aws.ds.create-directory-request/size] :opt-un [:portkey.aws.ds.create-directory-request/short-name :portkey.aws.ds/description :portkey.aws.ds.create-directory-request/vpc-settings :portkey.aws.ds/tags]))

(clojure.spec.alpha/def :portkey.aws.ds/remote-domain-names (clojure.spec.alpha/coll-of :portkey.aws.ds/remote-domain-name))

(clojure.spec.alpha/def :portkey.aws.ds/ip-addr (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/describe-event-topics-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/event-topics]))

(clojure.spec.alpha/def :portkey.aws.ds.reject-shared-directory-request/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds/reject-shared-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.reject-shared-directory-request/shared-directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.organizations-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/organizations-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.organizations-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/conditional-forwarder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/remote-domain-name :portkey.aws.ds/dns-ip-addrs :portkey.aws.ds/replication-scope]))

(clojure.spec.alpha/def :portkey.aws.ds/create-conditional-forwarder-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/start-schema-extension-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/create-snapshot-before-schema-extension :portkey.aws.ds/ldif-content :portkey.aws.ds/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/snapshots (clojure.spec.alpha/coll-of :portkey.aws.ds/snapshot))

(clojure.spec.alpha/def :portkey.aws.ds/ip-route-status-msg #{"AddFailed" :adding "Removed" "RemoveFailed" :removing :added "Removing" "Added" :add-failed "Adding" :remove-failed :removed})

(clojure.spec.alpha/def :portkey.aws.ds/radius-display-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ds.create-microsoft-ad-request/name (clojure.spec.alpha/and :portkey.aws.ds/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.create-microsoft-ad-request/short-name (clojure.spec.alpha/and :portkey.aws.ds/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.create-microsoft-ad-request/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds/directory-vpc-settings))
(clojure.spec.alpha/def :portkey.aws.ds.create-microsoft-ad-request/edition (clojure.spec.alpha/and :portkey.aws.ds/directory-edition))
(clojure.spec.alpha/def :portkey.aws.ds/create-microsoft-ad-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.create-microsoft-ad-request/name :portkey.aws.ds/password :portkey.aws.ds.create-microsoft-ad-request/vpc-settings] :opt-un [:portkey.aws.ds.create-microsoft-ad-request/short-name :portkey.aws.ds/description :portkey.aws.ds.create-microsoft-ad-request/edition :portkey.aws.ds/tags]))

(clojure.spec.alpha/def :portkey.aws.ds/update-conditional-forwarder-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/create-log-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/log-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/connected-directories-limit (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/connected-directories-current-count (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/cloud-only-directories-limit (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/cloud-only-directories-current-count (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/cloud-only-microsoft-ad-current-count (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/cloud-only-microsoft-ad-limit (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.directory-limits/cloud-only-microsoft-ad-limit-reached (clojure.spec.alpha/and :portkey.aws.ds/cloud-only-directories-limit-reached))
(clojure.spec.alpha/def :portkey.aws.ds/directory-limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.directory-limits/connected-directories-limit :portkey.aws.ds.directory-limits/connected-directories-current-count :portkey.aws.ds.directory-limits/cloud-only-directories-limit :portkey.aws.ds.directory-limits/cloud-only-directories-current-count :portkey.aws.ds/cloud-only-directories-limit-reached :portkey.aws.ds.directory-limits/cloud-only-microsoft-ad-current-count :portkey.aws.ds/connected-directories-limit-reached :portkey.aws.ds.directory-limits/cloud-only-microsoft-ad-limit :portkey.aws.ds.directory-limits/cloud-only-microsoft-ad-limit-reached]))

(clojure.spec.alpha/def :portkey.aws.ds.create-snapshot-request/name (clojure.spec.alpha/and :portkey.aws.ds/snapshot-name))
(clojure.spec.alpha/def :portkey.aws.ds/create-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds.create-snapshot-request/name]))

(clojure.spec.alpha/def :portkey.aws.ds/domain-controller-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/delete-associated-conditional-forwarder clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.entity-does-not-exist-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/entity-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.entity-does-not-exist-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/created-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/connect-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ds.directory-already-shared-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/directory-already-shared-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.directory-already-shared-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/describe-conditional-forwarders-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/conditional-forwarders]))

(clojure.spec.alpha/def :portkey.aws.ds/request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([A-Fa-f0-9]{8}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{12})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.ds/subnet-id))

(clojure.spec.alpha/def :portkey.aws.ds.client-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.client-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.ip-route-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/ip-route-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.ip-route-limit-exceeded-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/delete-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.update-number-of-domain-controllers-request/desired-number (clojure.spec.alpha/and :portkey.aws.ds/desired-number-of-domain-controllers))
(clojure.spec.alpha/def :portkey.aws.ds/update-number-of-domain-controllers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds.update-number-of-domain-controllers-request/desired-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/customer-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(\d{12})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/ip-addrs (clojure.spec.alpha/coll-of :portkey.aws.ds/ip-addr))

(clojure.spec.alpha/def :portkey.aws.ds/list-schema-extensions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.share-directory-request/share-notes (clojure.spec.alpha/and :portkey.aws.ds/notes))
(clojure.spec.alpha/def :portkey.aws.ds/share-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/share-target :portkey.aws.ds/share-method] :opt-un [:portkey.aws.ds.share-directory-request/share-notes]))

(clojure.spec.alpha/def :portkey.aws.ds/trust-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(.|\s)*\S(.|\s)*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/create-snapshot-before-schema-extension clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds/domain-controller-status #{:deleted "Failed" "Active" "Creating" :creating "Restoring" :restoring :deleting "Deleting" "Deleted" :active :impaired "Impaired" :failed})

(clojure.spec.alpha/def :portkey.aws.ds/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(?=^.{8,64}$)((?=.*\d)(?=.*[A-Z])(?=.*[a-z])|(?=.*\d)(?=.*[^A-Za-z0-9\s])(?=.*[a-z])|(?=.*[^A-Za-z0-9\s])(?=.*[A-Z])(?=.*[a-z])|(?=.*\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9\s]))^.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/enable-radius-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.snapshot-limits/manual-snapshots-limit (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds.snapshot-limits/manual-snapshots-current-count (clojure.spec.alpha/and :portkey.aws.ds/limit))
(clojure.spec.alpha/def :portkey.aws.ds/snapshot-limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.snapshot-limits/manual-snapshots-limit :portkey.aws.ds.snapshot-limits/manual-snapshots-current-count :portkey.aws.ds/manual-snapshots-limit-reached]))

(clojure.spec.alpha/def :portkey.aws.ds/list-ip-routes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/ip-routes-info :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.reset-user-password-request/user-name (clojure.spec.alpha/and :portkey.aws.ds/customer-user-name))
(clojure.spec.alpha/def :portkey.aws.ds.reset-user-password-request/new-password (clojure.spec.alpha/and :portkey.aws.ds/user-password))
(clojure.spec.alpha/def :portkey.aws.ds/reset-user-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds.reset-user-password-request/user-name :portkey.aws.ds.reset-user-password-request/new-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ds.owner-directory-description/account-id (clojure.spec.alpha/and :portkey.aws.ds/customer-id))
(clojure.spec.alpha/def :portkey.aws.ds.owner-directory-description/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds/directory-vpc-settings-description))
(clojure.spec.alpha/def :portkey.aws.ds/owner-directory-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds.owner-directory-description/account-id :portkey.aws.ds/dns-ip-addrs :portkey.aws.ds.owner-directory-description/vpc-settings :portkey.aws.ds/radius-settings :portkey.aws.ds/radius-status]))

(clojure.spec.alpha/def :portkey.aws.ds/delete-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/snapshot-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.event-topic/status (clojure.spec.alpha/and :portkey.aws.ds/topic-status))
(clojure.spec.alpha/def :portkey.aws.ds/event-topic (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/topic-name :portkey.aws.ds/topic-arn :portkey.aws.ds/created-date-time :portkey.aws.ds.event-topic/status]))

(clojure.spec.alpha/def :portkey.aws.ds/use-same-username clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(subnet-[0-9a-f]{8}|subnet-[0-9a-f]{17})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.create-alias-result/alias (clojure.spec.alpha/and :portkey.aws.ds/alias-name))
(clojure.spec.alpha/def :portkey.aws.ds/create-alias-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds.create-alias-result/alias]))

(clojure.spec.alpha/def :portkey.aws.ds.share-directory-result/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds/share-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.share-directory-result/shared-directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds/describe-trusts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/trusts :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/stage-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/update-conditional-forwarder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/remote-domain-name :portkey.aws.ds/dns-ip-addrs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/manual-snapshots-limit-reached clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds/ldif-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500000))))

(clojure.spec.alpha/def :portkey.aws.ds/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/resource-id] :opt-un [:portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.directory-description/type (clojure.spec.alpha/and :portkey.aws.ds/directory-type))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/edition (clojure.spec.alpha/and :portkey.aws.ds/directory-edition))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/alias (clojure.spec.alpha/and :portkey.aws.ds/alias-name))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/short-name (clojure.spec.alpha/and :portkey.aws.ds/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/share-notes (clojure.spec.alpha/and :portkey.aws.ds/notes))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/size (clojure.spec.alpha/and :portkey.aws.ds/directory-size))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/connect-settings (clojure.spec.alpha/and :portkey.aws.ds/directory-connect-settings-description))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/stage-last-updated-date-time (clojure.spec.alpha/and :portkey.aws.ds/last-updated-date-time))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/name (clojure.spec.alpha/and :portkey.aws.ds/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds/directory-vpc-settings-description))
(clojure.spec.alpha/def :portkey.aws.ds.directory-description/stage (clojure.spec.alpha/and :portkey.aws.ds/directory-stage))
(clojure.spec.alpha/def :portkey.aws.ds/directory-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.directory-description/type :portkey.aws.ds/owner-directory-description :portkey.aws.ds/stage-reason :portkey.aws.ds.directory-description/edition :portkey.aws.ds.directory-description/alias :portkey.aws.ds.directory-description/short-name :portkey.aws.ds/desired-number-of-domain-controllers :portkey.aws.ds/share-status :portkey.aws.ds.directory-description/share-notes :portkey.aws.ds/sso-enabled :portkey.aws.ds/description :portkey.aws.ds/radius-settings :portkey.aws.ds/share-method :portkey.aws.ds.directory-description/size :portkey.aws.ds/dns-ip-addrs :portkey.aws.ds/access-url :portkey.aws.ds/directory-id :portkey.aws.ds.directory-description/connect-settings :portkey.aws.ds.directory-description/stage-last-updated-date-time :portkey.aws.ds.directory-description/name :portkey.aws.ds/launch-time :portkey.aws.ds/radius-status :portkey.aws.ds.directory-description/vpc-settings :portkey.aws.ds.directory-description/stage]))

(clojure.spec.alpha/def :portkey.aws.ds.directory-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/directory-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.directory-limit-exceeded-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/topic-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/schema-extension-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/add-ip-routes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/ip-routes] :opt-un [:portkey.aws.ds/update-security-group-for-directory-controllers]))

(clojure.spec.alpha/def :portkey.aws.ds.invalid-target-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.invalid-target-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/describe-directories-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-descriptions :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/list-schema-extensions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/schema-extensions-info :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/register-event-topic-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/radius-shared-secret (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 8 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.ds.share-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/share-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.share-limit-exceeded-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.service-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.service-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/remove-ip-routes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/create-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds/disable-sso-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/topic-names (clojure.spec.alpha/coll-of :portkey.aws.ds/topic-name))

(clojure.spec.alpha/def :portkey.aws.ds.accept-shared-directory-request/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds/accept-shared-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.accept-shared-directory-request/shared-directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/state-last-updated-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/target-type #{:account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.ds/deregister-event-topic-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/topic-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/describe-shared-directories-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/shared-directories :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/tags (clojure.spec.alpha/coll-of :portkey.aws.ds/tag))

(clojure.spec.alpha/def :portkey.aws.ds/desired-number-of-domain-controllers (clojure.spec.alpha/int-in 2 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ds/deregister-event-topic-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/ip-route-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/cidr-ip :portkey.aws.ds/ip-route-status-msg :portkey.aws.ds/added-date-time :portkey.aws.ds/ip-route-status-reason :portkey.aws.ds/description]))

(clojure.spec.alpha/def :portkey.aws.ds.create-trust-request/conditional-forwarder-ip-addrs (clojure.spec.alpha/and :portkey.aws.ds/dns-ip-addrs))
(clojure.spec.alpha/def :portkey.aws.ds/create-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/remote-domain-name :portkey.aws.ds/trust-password :portkey.aws.ds/trust-direction] :opt-un [:portkey.aws.ds/trust-type :portkey.aws.ds.create-trust-request/conditional-forwarder-ip-addrs :portkey.aws.ds/selective-auth]))

(clojure.spec.alpha/def :portkey.aws.ds/get-directory-limits-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-limits]))

(clojure.spec.alpha/def :portkey.aws.ds/limit (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ds.tag-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.tag-limit-exceeded-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/invalid-password-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.invalid-password-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/organizational-unit-dn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.ds/trust-type #{"Forest" :external :forest "External"})

(clojure.spec.alpha/def :portkey.aws.ds/enable-radius-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/radius-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/availability-zone (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/update-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/request-id :portkey.aws.ds/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds/snapshot-type #{:manual "Auto" "Manual" :auto})

(clojure.spec.alpha/def :portkey.aws.ds/directory-vpc-settings-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/vpc-id :portkey.aws.ds/subnet-ids :portkey.aws.ds/security-group-id :portkey.aws.ds/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.ds/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/delete-conditional-forwarder-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.create-alias-request/alias (clojure.spec.alpha/and :portkey.aws.ds/alias-name))
(clojure.spec.alpha/def :portkey.aws.ds/create-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds.create-alias-request/alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/entity-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.entity-already-exists-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/create-microsoft-ad-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.attribute/name (clojure.spec.alpha/and :portkey.aws.ds/attribute-name))
(clojure.spec.alpha/def :portkey.aws.ds.attribute/value (clojure.spec.alpha/and :portkey.aws.ds/attribute-value))
(clojure.spec.alpha/def :portkey.aws.ds/attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.attribute/name :portkey.aws.ds.attribute/value]))

(clojure.spec.alpha/def :portkey.aws.ds.disable-sso-request/password (clojure.spec.alpha/and :portkey.aws.ds/connect-password))
(clojure.spec.alpha/def :portkey.aws.ds/disable-sso-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds/user-name :portkey.aws.ds.disable-sso-request/password]))

(clojure.spec.alpha/def :portkey.aws.ds/domain-controllers (clojure.spec.alpha/coll-of :portkey.aws.ds/domain-controller))

(clojure.spec.alpha/def :portkey.aws.ds.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.invalid-next-token-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/log-subscriptions (clojure.spec.alpha/coll-of :portkey.aws.ds/log-subscription))

(clojure.spec.alpha/def :portkey.aws.ds/delete-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.ds.reject-shared-directory-result/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds/reject-shared-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.reject-shared-directory-result/shared-directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds/cancel-schema-extension-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/schema-extension-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/domain-controller-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^dc-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.domain-controller-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/domain-controller-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.domain-controller-limit-exceeded-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.computer/computer-id (clojure.spec.alpha/and :portkey.aws.ds/sid))
(clojure.spec.alpha/def :portkey.aws.ds.computer/computer-attributes (clojure.spec.alpha/and :portkey.aws.ds/attributes))
(clojure.spec.alpha/def :portkey.aws.ds/computer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.computer/computer-id :portkey.aws.ds/computer-name :portkey.aws.ds.computer/computer-attributes]))

(clojure.spec.alpha/def :portkey.aws.ds/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[d]-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/cloud-only-directories-limit-reached clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.unshare-target/id (clojure.spec.alpha/and :portkey.aws.ds/target-id))
(clojure.spec.alpha/def :portkey.aws.ds.unshare-target/type (clojure.spec.alpha/and :portkey.aws.ds/target-type))
(clojure.spec.alpha/def :portkey.aws.ds/unshare-target (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.unshare-target/id :portkey.aws.ds.unshare-target/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/attributes (clojure.spec.alpha/coll-of :portkey.aws.ds/attribute))

(clojure.spec.alpha/def :portkey.aws.ds/trust-direction #{:one-way-incoming :one-way-outgoing "One-Way: Incoming" "One-Way: Outgoing" "Two-Way" :two-way})

(clojure.spec.alpha/def :portkey.aws.ds/directory-short-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.directory-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/directory-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.directory-unavailable-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/trust-state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/get-snapshot-limits-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/snapshot-status #{"Failed" "Creating" :creating :completed "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.ds/describe-trusts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/trust-ids :portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds/ip-routes-info (clojure.spec.alpha/coll-of :portkey.aws.ds/ip-route-info))

(clojure.spec.alpha/def :portkey.aws.ds.enable-sso-request/password (clojure.spec.alpha/and :portkey.aws.ds/connect-password))
(clojure.spec.alpha/def :portkey.aws.ds/enable-sso-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds/user-name :portkey.aws.ds.enable-sso-request/password]))

(clojure.spec.alpha/def :portkey.aws.ds/unshare-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/unshare-target] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/describe-event-topics-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/topic-names]))

(clojure.spec.alpha/def :portkey.aws.ds/event-topics (clojure.spec.alpha/coll-of :portkey.aws.ds/event-topic))

(clojure.spec.alpha/def :portkey.aws.ds/share-status #{:deleted "Rejecting" :rejected "Rejected" :reject-failed :share-failed :rejecting :sharing :pending-acceptance :deleting "Deleting" "ShareFailed" "Deleted" "Sharing" :shared "Shared" "RejectFailed" "PendingAcceptance"})

(clojure.spec.alpha/def :portkey.aws.ds/target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ds/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/create-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.ds.directory-not-shared-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/directory-not-shared-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.directory-not-shared-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/update-number-of-domain-controllers-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/added-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/servers (clojure.spec.alpha/coll-of :portkey.aws.ds/server))

(clojure.spec.alpha/def :portkey.aws.ds/radius-authentication-protocol #{:chap "PAP" "CHAP" :mscha-pv-1 :mscha-pv-2 :pap "MS-CHAPv1" "MS-CHAPv2"})

(clojure.spec.alpha/def :portkey.aws.ds.share-target/id (clojure.spec.alpha/and :portkey.aws.ds/target-id))
(clojure.spec.alpha/def :portkey.aws.ds.share-target/type (clojure.spec.alpha/and :portkey.aws.ds/target-type))
(clojure.spec.alpha/def :portkey.aws.ds/share-target (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.share-target/id :portkey.aws.ds.share-target/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.unsupported-operation-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.unsupported-operation-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/describe-domain-controllers-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/domain-controllers :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/trust-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^t-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/directory-ids (clojure.spec.alpha/coll-of :portkey.aws.ds/directory-id))

(clojure.spec.alpha/def :portkey.aws.ds/restore-from-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/snapshot-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/sso-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds/verify-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds/update-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/trust-id] :opt-un [:portkey.aws.ds/selective-auth]))

(clojure.spec.alpha/def :portkey.aws.ds/restore-from-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/schema-extension-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/schema-extension-id :portkey.aws.ds/description :portkey.aws.ds/schema-extension-status :portkey.aws.ds/schema-extension-status-reason :portkey.aws.ds/start-date-time :portkey.aws.ds/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.ds/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(sg-[0-9a-f]{8}|sg-[0-9a-f]{17})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/schema-extension-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^e-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/trusts (clojure.spec.alpha/coll-of :portkey.aws.ds/trust))

(clojure.spec.alpha/def :portkey.aws.ds.radius-settings/radius-servers (clojure.spec.alpha/and :portkey.aws.ds/servers))
(clojure.spec.alpha/def :portkey.aws.ds.radius-settings/radius-port (clojure.spec.alpha/and :portkey.aws.ds/port-number))
(clojure.spec.alpha/def :portkey.aws.ds.radius-settings/shared-secret (clojure.spec.alpha/and :portkey.aws.ds/radius-shared-secret))
(clojure.spec.alpha/def :portkey.aws.ds.radius-settings/authentication-protocol (clojure.spec.alpha/and :portkey.aws.ds/radius-authentication-protocol))
(clojure.spec.alpha/def :portkey.aws.ds.radius-settings/display-label (clojure.spec.alpha/and :portkey.aws.ds/radius-display-label))
(clojure.spec.alpha/def :portkey.aws.ds/radius-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.radius-settings/radius-servers :portkey.aws.ds.radius-settings/radius-port :portkey.aws.ds/radius-timeout :portkey.aws.ds/radius-retries :portkey.aws.ds.radius-settings/shared-secret :portkey.aws.ds.radius-settings/authentication-protocol :portkey.aws.ds.radius-settings/display-label :portkey.aws.ds/use-same-username]))

(clojure.spec.alpha/def :portkey.aws.ds/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(vpc-[0-9a-f]{8}|vpc-[0-9a-f]{17})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/ip-route (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/cidr-ip :portkey.aws.ds/description]))

(clojure.spec.alpha/def :portkey.aws.ds/customer-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(?!.*\\|.*\"|.*\/|.*\[|.*\]|.*:|.*;|.*\||.*=|.*,|.*\+|.*\*|.*\?|.*<|.*>|.*@).*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/share-method #{"ORGANIZATIONS" :handshake :organizations "HANDSHAKE"})

(clojure.spec.alpha/def :portkey.aws.ds.unshare-directory-result/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds/unshare-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.unshare-directory-result/shared-directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds/shared-directories (clojure.spec.alpha/coll-of :portkey.aws.ds/shared-directory))

(clojure.spec.alpha/def :portkey.aws.ds/directory-size #{:large :small "Large" "Small"})

(clojure.spec.alpha/def :portkey.aws.ds.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.access-denied-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.directory-connect-settings/customer-dns-ips (clojure.spec.alpha/and :portkey.aws.ds/dns-ip-addrs))
(clojure.spec.alpha/def :portkey.aws.ds.directory-connect-settings/customer-user-name (clojure.spec.alpha/and :portkey.aws.ds/user-name))
(clojure.spec.alpha/def :portkey.aws.ds/directory-connect-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/vpc-id :portkey.aws.ds/subnet-ids :portkey.aws.ds.directory-connect-settings/customer-dns-ips :portkey.aws.ds.directory-connect-settings/customer-user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/ip-routes (clojure.spec.alpha/coll-of :portkey.aws.ds/ip-route))

(clojure.spec.alpha/def :portkey.aws.ds/replication-scope #{"Domain" :domain})

(clojure.spec.alpha/def :portkey.aws.ds/directory-type #{:microsoft-ad "SimpleAD" :simple-ad "MicrosoftAD" "SharedMicrosoftAD" :shared-microsoft-ad :ad-connector "ADConnector"})

(clojure.spec.alpha/def :portkey.aws.ds/last-updated-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.directory-connect-settings-description/customer-user-name (clojure.spec.alpha/and :portkey.aws.ds/user-name))
(clojure.spec.alpha/def :portkey.aws.ds.directory-connect-settings-description/connect-ips (clojure.spec.alpha/and :portkey.aws.ds/ip-addrs))
(clojure.spec.alpha/def :portkey.aws.ds/directory-connect-settings-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/vpc-id :portkey.aws.ds/subnet-ids :portkey.aws.ds.directory-connect-settings-description/customer-user-name :portkey.aws.ds/security-group-id :portkey.aws.ds/availability-zones :portkey.aws.ds.directory-connect-settings-description/connect-ips]))

(clojure.spec.alpha/def :portkey.aws.ds/describe-snapshots-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/snapshots :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/create-log-subscription-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.snapshot/type (clojure.spec.alpha/and :portkey.aws.ds/snapshot-type))
(clojure.spec.alpha/def :portkey.aws.ds.snapshot/name (clojure.spec.alpha/and :portkey.aws.ds/snapshot-name))
(clojure.spec.alpha/def :portkey.aws.ds.snapshot/status (clojure.spec.alpha/and :portkey.aws.ds/snapshot-status))
(clojure.spec.alpha/def :portkey.aws.ds/snapshot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/snapshot-id :portkey.aws.ds.snapshot/type :portkey.aws.ds.snapshot/name :portkey.aws.ds.snapshot/status :portkey.aws.ds/start-time]))

(clojure.spec.alpha/def :portkey.aws.ds/list-log-subscriptions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/log-subscriptions :portkey.aws.ds/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.shared-directory/owner-account-id (clojure.spec.alpha/and :portkey.aws.ds/customer-id))
(clojure.spec.alpha/def :portkey.aws.ds.shared-directory/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.shared-directory/share-notes (clojure.spec.alpha/and :portkey.aws.ds/notes))
(clojure.spec.alpha/def :portkey.aws.ds.shared-directory/owner-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.shared-directory/shared-account-id (clojure.spec.alpha/and :portkey.aws.ds/customer-id))
(clojure.spec.alpha/def :portkey.aws.ds/shared-directory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/created-date-time :portkey.aws.ds.shared-directory/owner-account-id :portkey.aws.ds.shared-directory/shared-directory-id :portkey.aws.ds/share-status :portkey.aws.ds.shared-directory/share-notes :portkey.aws.ds/share-method :portkey.aws.ds/last-updated-date-time :portkey.aws.ds.shared-directory/owner-directory-id :portkey.aws.ds.shared-directory/shared-account-id]))

(clojure.spec.alpha/def :portkey.aws.ds/cancel-schema-extension-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/remove-tags-from-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.user-does-not-exist-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/user-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.user-does-not-exist-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/trust-state #{"Verified" :deleted "Created" "Failed" "Creating" "UpdateFailed" :creating :updated :verify-failed "VerifyFailed" :created :deleting :update-failed "Deleting" "Deleted" :updating "Verifying" :verifying "Updating" :verified :failed "Updated"})

(clojure.spec.alpha/def :portkey.aws.ds/log-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[-._/#A-Za-z0-9]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/dns-ip-addrs (clojure.spec.alpha/coll-of :portkey.aws.ds/ip-addr))

(clojure.spec.alpha/def :portkey.aws.ds/access-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ds/get-snapshot-limits-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/snapshot-limits]))

(clojure.spec.alpha/def :portkey.aws.ds/create-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds/server (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ds/create-computer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/computer]))

(clojure.spec.alpha/def :portkey.aws.ds/selective-auth #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.ds/delete-log-subscription-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/end-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/radius-retries (clojure.spec.alpha/int-in 0 10))

(clojure.spec.alpha/def :portkey.aws.ds/computer-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 8 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/enable-sso-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/add-ip-routes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/list-log-subscriptions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds/remove-ip-routes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/cidr-ips] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/remove-tags-from-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/resource-id :portkey.aws.ds/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/directory-edition #{"Standard" :standard "Enterprise" :enterprise})

(clojure.spec.alpha/def :portkey.aws.ds/radius-timeout (clojure.spec.alpha/int-in 1 20))

(clojure.spec.alpha/def :portkey.aws.ds/cidr-ips (clojure.spec.alpha/coll-of :portkey.aws.ds/cidr-ip))

(clojure.spec.alpha/def :portkey.aws.ds/directory-stage #{:deleted "Created" "Failed" "Active" "Creating" "Inoperable" :creating "Restoring" :restoring :created :deleting "RestoreFailed" :inoperable "Deleting" :restore-failed "Deleted" :active :impaired "Impaired" :requested "Requested" :failed})

(clojure.spec.alpha/def :portkey.aws.ds/delete-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds/directory-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^d-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.describe-shared-directories-request/owner-directory-id (clojure.spec.alpha/and :portkey.aws.ds/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.describe-shared-directories-request/shared-directory-ids (clojure.spec.alpha/and :portkey.aws.ds/directory-ids))
(clojure.spec.alpha/def :portkey.aws.ds/describe-shared-directories-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.describe-shared-directories-request/owner-directory-id] :opt-un [:portkey.aws.ds.describe-shared-directories-request/shared-directory-ids :portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds/delete-log-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.insufficient-permissions-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/insufficient-permissions-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.insufficient-permissions-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/subscription-created-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/trust-ids (clojure.spec.alpha/coll-of :portkey.aws.ds/trust-id))

(clojure.spec.alpha/def :portkey.aws.ds/describe-conditional-forwarders-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds/remote-domain-names]))

(clojure.spec.alpha/def :portkey.aws.ds/schema-extensions-info (clojure.spec.alpha/coll-of :portkey.aws.ds/schema-extension-info))

(clojure.spec.alpha/def :portkey.aws.ds/list-ip-routes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds/start-schema-extension-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/schema-extension-id]))

(clojure.spec.alpha/def :portkey.aws.ds.domain-controller/status-last-updated-date-time (clojure.spec.alpha/and :portkey.aws.ds/last-updated-date-time))
(clojure.spec.alpha/def :portkey.aws.ds.domain-controller/status (clojure.spec.alpha/and :portkey.aws.ds/domain-controller-status))
(clojure.spec.alpha/def :portkey.aws.ds.domain-controller/status-reason (clojure.spec.alpha/and :portkey.aws.ds/domain-controller-status-reason))
(clojure.spec.alpha/def :portkey.aws.ds.domain-controller/dns-ip-addr (clojure.spec.alpha/and :portkey.aws.ds/ip-addr))
(clojure.spec.alpha/def :portkey.aws.ds/domain-controller (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.domain-controller/status-last-updated-date-time :portkey.aws.ds/subnet-id :portkey.aws.ds/availability-zone :portkey.aws.ds.domain-controller/status :portkey.aws.ds/domain-controller-id :portkey.aws.ds.domain-controller/status-reason :portkey.aws.ds/vpc-id :portkey.aws.ds.domain-controller/dns-ip-addr :portkey.aws.ds/directory-id :portkey.aws.ds/launch-time]))

(clojure.spec.alpha/def :portkey.aws.ds/remote-domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+[.]?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/register-event-topic-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/topic-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/directory-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.tag/key (clojure.spec.alpha/and :portkey.aws.ds/tag-key))
(clojure.spec.alpha/def :portkey.aws.ds.tag/value (clojure.spec.alpha/and :portkey.aws.ds/tag-value))
(clojure.spec.alpha/def :portkey.aws.ds/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.tag/key :portkey.aws.ds.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/conditional-forwarders (clojure.spec.alpha/coll-of :portkey.aws.ds/conditional-forwarder))

(clojure.spec.alpha/def :portkey.aws.ds/connect-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds/user-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.ds/topic-status #{:deleted "Failed" "Topic not found" "Registered" :topicnotfound "Deleted" :registered :failed})

(clojure.spec.alpha/def :portkey.aws.ds/connected-directories-limit-reached clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds/domain-controller-ids (clojure.spec.alpha/coll-of :portkey.aws.ds/domain-controller-id))

(clojure.spec.alpha/def :portkey.aws.ds/trust (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/created-date-time :portkey.aws.ds/state-last-updated-date-time :portkey.aws.ds/trust-type :portkey.aws.ds/trust-direction :portkey.aws.ds/trust-state-reason :portkey.aws.ds/trust-id :portkey.aws.ds/last-updated-date-time :portkey.aws.ds/trust-state :portkey.aws.ds/selective-auth :portkey.aws.ds/directory-id :portkey.aws.ds/remote-domain-name]))

(clojure.spec.alpha/def :portkey.aws.ds/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 62)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/launch-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/disable-radius-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/delete-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds/radius-status #{"Failed" "Creating" :creating :completed "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.ds/snapshot-ids (clojure.spec.alpha/coll-of :portkey.aws.ds/snapshot-id))

(clojure.spec.alpha/def :portkey.aws.ds/directory-vpc-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/vpc-id :portkey.aws.ds/subnet-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.authentication-failed-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/authentication-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.authentication-failed-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/directory-descriptions (clojure.spec.alpha/coll-of :portkey.aws.ds/directory-description))

(clojure.spec.alpha/def :portkey.aws.ds/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.ds/availability-zone))

(clojure.spec.alpha/def :portkey.aws.ds/verify-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/trust-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/port-number (clojure.spec.alpha/int-in 1025 65535))

(clojure.spec.alpha/def :portkey.aws.ds/schema-extension-status #{"CreatingSnapshot" "Failed" :initializing "Cancelled" "CancelInProgress" :rollback-in-progress "RollbackInProgress" :completed :cancel-in-progress :updating-schema :cancelled :replicating "UpdatingSchema" "Completed" "Initializing" :creating-snapshot "Replicating" :failed})

(clojure.spec.alpha/def :portkey.aws.ds.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.invalid-parameter-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.snapshot-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds/snapshot-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.snapshot-limit-exceeded-exception/message :portkey.aws.ds/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds/add-tags-to-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/resource-id :portkey.aws.ds/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/describe-domain-controllers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id] :opt-un [:portkey.aws.ds/domain-controller-ids :portkey.aws.ds/next-token :portkey.aws.ds/limit]))

(clojure.spec.alpha/def :portkey.aws.ds/update-radius-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/radius-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.create-computer-request/password (clojure.spec.alpha/and :portkey.aws.ds/computer-password))
(clojure.spec.alpha/def :portkey.aws.ds.create-computer-request/organizational-unit-distinguished-name (clojure.spec.alpha/and :portkey.aws.ds/organizational-unit-dn))
(clojure.spec.alpha/def :portkey.aws.ds.create-computer-request/computer-attributes (clojure.spec.alpha/and :portkey.aws.ds/attributes))
(clojure.spec.alpha/def :portkey.aws.ds/create-computer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/computer-name :portkey.aws.ds.create-computer-request/password] :opt-un [:portkey.aws.ds.create-computer-request/organizational-unit-distinguished-name :portkey.aws.ds.create-computer-request/computer-attributes]))

(clojure.spec.alpha/def :portkey.aws.ds/ip-route-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds/start-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds/notes (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ds/disable-radius-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/computer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.ds/delete-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/trust-id] :opt-un [:portkey.aws.ds/delete-associated-conditional-forwarder]))

(clojure.spec.alpha/def :portkey.aws.ds/accept-shared-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/shared-directory]))

(clojure.spec.alpha/def :portkey.aws.ds/log-subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds/directory-id :portkey.aws.ds/log-group-name :portkey.aws.ds/subscription-created-date-time]))

(clojure.spec.alpha/def :portkey.aws.ds/snapshot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/delete-conditional-forwarder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds/directory-id :portkey.aws.ds/remote-domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/cidr-ip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])(\/([1-9]|[1-2][0-9]|3[0-2]))$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/snapshot-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^s-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds/add-tags-to-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/reset-user-password-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds/update-security-group-for-directory-controllers clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds/sid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[&\w+-.@]+" s__21078__auto__))))

(clojure.core/defn describe-trusts "Obtains information about the trust relationships for this account.\n If no input parameters are provided, such as DirectoryId or TrustIds, this\nrequest describes all the trust relationships belonging to the account." ([] (describe-trusts {})) ([describe-trusts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-trusts-request describe-trusts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-trusts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-trusts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrusts", :http.request.configuration/output-deser-fn response-describe-trusts-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef describe-trusts :args (clojure.spec.alpha/? :portkey.aws.ds/describe-trusts-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-trusts-result))

(clojure.core/defn update-number-of-domain-controllers "Adds or removes domain controllers to or from the directory. Based on the\ndifference between current value and new value (provided through this API call),\ndomain controllers will be added or removed. It may take up to 45 minutes for\nany new domain controllers to become fully active once the requested number of\ndomain controllers is updated. During this time, you cannot make another update\nrequest." ([update-number-of-domain-controllers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-number-of-domain-controllers-request update-number-of-domain-controllers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/update-number-of-domain-controllers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/update-number-of-domain-controllers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateNumberOfDomainControllers", :http.request.configuration/output-deser-fn response-update-number-of-domain-controllers-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "DomainControllerLimitExceededException" :portkey.aws.ds/domain-controller-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef update-number-of-domain-controllers :args (clojure.spec.alpha/tuple :portkey.aws.ds/update-number-of-domain-controllers-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/update-number-of-domain-controllers-result))

(clojure.core/defn delete-conditional-forwarder "Deletes a conditional forwarder that has been set up for your AWS directory." ([delete-conditional-forwarder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-conditional-forwarder-request delete-conditional-forwarder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/delete-conditional-forwarder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/delete-conditional-forwarder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConditionalForwarder", :http.request.configuration/output-deser-fn response-delete-conditional-forwarder-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef delete-conditional-forwarder :args (clojure.spec.alpha/tuple :portkey.aws.ds/delete-conditional-forwarder-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/delete-conditional-forwarder-result))

(clojure.core/defn verify-trust "AWS Directory Service for Microsoft Active Directory allows you to configure and\nverify trust relationships.\n This action verifies a trust relationship between your AWS Managed Microsoft AD\ndirectory and an external domain." ([verify-trust-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-verify-trust-request verify-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/verify-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/verify-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "VerifyTrust", :http.request.configuration/output-deser-fn response-verify-trust-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef verify-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds/verify-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/verify-trust-result))

(clojure.core/defn reset-user-password "Resets the password for any user in your AWS Managed Microsoft AD or Simple AD\ndirectory." ([reset-user-password-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-reset-user-password-request reset-user-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/reset-user-password-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/reset-user-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetUserPassword", :http.request.configuration/output-deser-fn response-reset-user-password-result, :http.request.spec/error-spec {"DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "UserDoesNotExistException" :portkey.aws.ds/user-does-not-exist-exception, "InvalidPasswordException" :portkey.aws.ds/invalid-password-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef reset-user-password :args (clojure.spec.alpha/tuple :portkey.aws.ds/reset-user-password-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/reset-user-password-result))

(clojure.core/defn create-alias "Creates an alias for a directory and assigns the alias to the directory. The\nalias is used to construct the access URL for the directory, such as\nhttp://<alias>.awsapps.com.\n After an alias has been created, it cannot be deleted or reused, so this\noperation should only be used when absolutely necessary." ([create-alias-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-alias-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn response-create-alias-result, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-alias-result))

(clojure.core/defn update-radius "Updates the Remote Authentication Dial In User Service (RADIUS) server\ninformation for an AD Connector or Microsoft AD directory." ([update-radius-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-radius-request update-radius-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/update-radius-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/update-radius-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRadius", :http.request.configuration/output-deser-fn response-update-radius-result, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef update-radius :args (clojure.spec.alpha/tuple :portkey.aws.ds/update-radius-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/update-radius-result))

(clojure.core/defn remove-ip-routes "Removes IP address blocks from a directory." ([remove-ip-routes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-ip-routes-request remove-ip-routes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/remove-ip-routes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/remove-ip-routes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveIpRoutes", :http.request.configuration/output-deser-fn response-remove-ip-routes-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef remove-ip-routes :args (clojure.spec.alpha/tuple :portkey.aws.ds/remove-ip-routes-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/remove-ip-routes-result))

(clojure.core/defn enable-radius "Enables multi-factor authentication (MFA) with the Remote Authentication Dial In\nUser Service (RADIUS) server for an AD Connector or Microsoft AD directory." ([enable-radius-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-enable-radius-request enable-radius-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/enable-radius-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/enable-radius-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableRadius", :http.request.configuration/output-deser-fn response-enable-radius-result, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef enable-radius :args (clojure.spec.alpha/tuple :portkey.aws.ds/enable-radius-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/enable-radius-result))

(clojure.core/defn delete-log-subscription "Deletes the specified log subscription." ([delete-log-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-log-subscription-request delete-log-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/delete-log-subscription-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/delete-log-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLogSubscription", :http.request.configuration/output-deser-fn response-delete-log-subscription-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef delete-log-subscription :args (clojure.spec.alpha/tuple :portkey.aws.ds/delete-log-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/delete-log-subscription-result))

(clojure.core/defn delete-directory "Deletes an AWS Directory Service directory.\n Before you call DeleteDirectory, ensure that all of the required permissions\nhave been explicitly granted through a policy. For details about what\npermissions are required to run the DeleteDirectory operation, see AWS Directory\nService API Permissions: Actions, Resources, and Conditions Reference\n(http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html)." ([delete-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-directory-request delete-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/delete-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/delete-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectory", :http.request.configuration/output-deser-fn response-delete-directory-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef delete-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/delete-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/delete-directory-result))

(clojure.core/defn deregister-event-topic "Removes the specified directory as a publisher to the specified SNS topic." ([deregister-event-topic-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-deregister-event-topic-request deregister-event-topic-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/deregister-event-topic-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/deregister-event-topic-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterEventTopic", :http.request.configuration/output-deser-fn response-deregister-event-topic-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef deregister-event-topic :args (clojure.spec.alpha/tuple :portkey.aws.ds/deregister-event-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/deregister-event-topic-result))

(clojure.core/defn describe-domain-controllers "Provides information about any domain controllers in your directory." ([describe-domain-controllers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-domain-controllers-request describe-domain-controllers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-domain-controllers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-domain-controllers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDomainControllers", :http.request.configuration/output-deser-fn response-describe-domain-controllers-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef describe-domain-controllers :args (clojure.spec.alpha/tuple :portkey.aws.ds/describe-domain-controllers-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-domain-controllers-result))

(clojure.core/defn describe-conditional-forwarders "Obtains information about the conditional forwarders for this account.\n If no input parameters are provided for RemoteDomainNames, this request\ndescribes all conditional forwarders for the specified directory ID." ([describe-conditional-forwarders-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-conditional-forwarders-request describe-conditional-forwarders-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-conditional-forwarders-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-conditional-forwarders-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConditionalForwarders", :http.request.configuration/output-deser-fn response-describe-conditional-forwarders-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef describe-conditional-forwarders :args (clojure.spec.alpha/tuple :portkey.aws.ds/describe-conditional-forwarders-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-conditional-forwarders-result))

(clojure.core/defn create-snapshot "Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.\n You cannot take snapshots of AD Connector directories." ([create-snapshot-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-snapshot-request create-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSnapshot", :http.request.configuration/output-deser-fn response-create-snapshot-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "SnapshotLimitExceededException" :portkey.aws.ds/snapshot-limit-exceeded-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef create-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-snapshot-result))

(clojure.core/defn disable-sso "Disables single-sign on for a directory." ([disable-sso-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-sso-request disable-sso-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/disable-sso-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/disable-sso-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableSso", :http.request.configuration/output-deser-fn response-disable-sso-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InsufficientPermissionsException" :portkey.aws.ds/insufficient-permissions-exception, "AuthenticationFailedException" :portkey.aws.ds/authentication-failed-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef disable-sso :args (clojure.spec.alpha/tuple :portkey.aws.ds/disable-sso-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/disable-sso-result))

(clojure.core/defn update-trust "Updates the trust that has been set up between your AWS Managed Microsoft AD\ndirectory and an on-premises Active Directory." ([update-trust-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-trust-request update-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/update-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/update-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrust", :http.request.configuration/output-deser-fn response-update-trust-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef update-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds/update-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/update-trust-result))

(clojure.core/defn list-log-subscriptions "Lists the active log subscriptions for the AWS account." ([] (list-log-subscriptions {})) ([list-log-subscriptions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-log-subscriptions-request list-log-subscriptions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/list-log-subscriptions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/list-log-subscriptions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLogSubscriptions", :http.request.configuration/output-deser-fn response-list-log-subscriptions-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef list-log-subscriptions :args (clojure.spec.alpha/? :portkey.aws.ds/list-log-subscriptions-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/list-log-subscriptions-result))

(clojure.core/defn register-event-topic "Associates a directory with an SNS topic. This establishes the directory as a\npublisher to the specified SNS topic. You can then receive email or text (SMS)\nmessages when the status of your directory changes. You get notified if your\ndirectory goes from an Active status to an Impaired or Inoperable status. You\nalso receive a notification when the directory returns to an Active status." ([register-event-topic-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-event-topic-request register-event-topic-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/register-event-topic-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/register-event-topic-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterEventTopic", :http.request.configuration/output-deser-fn response-register-event-topic-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef register-event-topic :args (clojure.spec.alpha/tuple :portkey.aws.ds/register-event-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/register-event-topic-result))

(clojure.core/defn list-tags-for-resource "Lists all tags on a directory." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.ds/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/list-tags-for-resource-result))

(clojure.core/defn cancel-schema-extension "Cancels an in-progress schema extension to a Microsoft AD directory. Once a\nschema extension has started replicating to all domain controllers, the task can\nno longer be canceled. A schema extension can be canceled during any of the\nfollowing states; Initializing, CreatingSnapshot, and UpdatingSchema." ([cancel-schema-extension-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-schema-extension-request cancel-schema-extension-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/cancel-schema-extension-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/cancel-schema-extension-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelSchemaExtension", :http.request.configuration/output-deser-fn response-cancel-schema-extension-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef cancel-schema-extension :args (clojure.spec.alpha/tuple :portkey.aws.ds/cancel-schema-extension-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/cancel-schema-extension-result))

(clojure.core/defn add-ip-routes "If the DNS server for your on-premises domain uses a publicly addressable IP\naddress, you must add a CIDR address block to correctly route traffic to and\nfrom your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address\nblock. You can also use AddIpRoutes to facilitate routing traffic that uses\npublic IP ranges from your Microsoft AD on AWS to a peer VPC.\n Before you call AddIpRoutes, ensure that all of the required permissions have\nbeen explicitly granted through a policy. For details about what permissions are\nrequired to run the AddIpRoutes operation, see AWS Directory Service API\nPermissions: Actions, Resources, and Conditions Reference\n(http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html)." ([add-ip-routes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-ip-routes-request add-ip-routes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/add-ip-routes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/add-ip-routes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddIpRoutes", :http.request.configuration/output-deser-fn response-add-ip-routes-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "IpRouteLimitExceededException" :portkey.aws.ds/ip-route-limit-exceeded-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef add-ip-routes :args (clojure.spec.alpha/tuple :portkey.aws.ds/add-ip-routes-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/add-ip-routes-result))

(clojure.core/defn create-microsoft-ad "Creates an AWS Managed Microsoft AD directory.\n Before you call CreateMicrosoftAD, ensure that all of the required permissions\nhave been explicitly granted through a policy. For details about what\npermissions are required to run the CreateMicrosoftAD operation, see AWS\nDirectory Service API Permissions: Actions, Resources, and Conditions Reference\n(http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html)." ([create-microsoft-ad-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-microsoft-ad-request create-microsoft-ad-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-microsoft-ad-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-microsoft-ad-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMicrosoftAD", :http.request.configuration/output-deser-fn response-create-microsoft-ad-result, :http.request.spec/error-spec {"DirectoryLimitExceededException" :portkey.aws.ds/directory-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef create-microsoft-ad :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-microsoft-ad-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-microsoft-ad-result))

(clojure.core/defn list-ip-routes "Lists the address blocks that you have added to a directory." ([list-ip-routes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-ip-routes-request list-ip-routes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/list-ip-routes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/list-ip-routes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIpRoutes", :http.request.configuration/output-deser-fn response-list-ip-routes-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef list-ip-routes :args (clojure.spec.alpha/tuple :portkey.aws.ds/list-ip-routes-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/list-ip-routes-result))

(clojure.core/defn connect-directory "Creates an AD Connector to connect to an on-premises directory.\n Before you call ConnectDirectory, ensure that all of the required permissions\nhave been explicitly granted through a policy. For details about what\npermissions are required to run the ConnectDirectory operation, see AWS\nDirectory Service API Permissions: Actions, Resources, and Conditions Reference\n(http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html)." ([connect-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-connect-directory-request connect-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/connect-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/connect-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConnectDirectory", :http.request.configuration/output-deser-fn response-connect-directory-result, :http.request.spec/error-spec {"DirectoryLimitExceededException" :portkey.aws.ds/directory-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef connect-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/connect-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/connect-directory-result))

(clojure.core/defn delete-snapshot "Deletes a directory snapshot." ([delete-snapshot-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-snapshot-request delete-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/delete-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/delete-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSnapshot", :http.request.configuration/output-deser-fn response-delete-snapshot-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef delete-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.ds/delete-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/delete-snapshot-result))

(clojure.core/defn create-trust "AWS Directory Service for Microsoft Active Directory allows you to configure\ntrust relationships. For example, you can establish a trust between your AWS\nManaged Microsoft AD directory, and your existing on-premises Microsoft Active\nDirectory. This would allow you to provide users and groups access to resources\nin either domain, with a single set of credentials.\n This action initiates the creation of the AWS side of a trust relationship\nbetween an AWS Managed Microsoft AD directory and an external domain. You can\ncreate either a forest trust or an external trust." ([create-trust-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-trust-request create-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrust", :http.request.configuration/output-deser-fn response-create-trust-result, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef create-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-trust-result))

(clojure.core/defn unshare-directory "Stops the directory sharing between the directory owner and consumer accounts." ([unshare-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-unshare-directory-request unshare-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/unshare-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/unshare-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnshareDirectory", :http.request.configuration/output-deser-fn response-unshare-directory-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidTargetException" :portkey.aws.ds/invalid-target-exception, "DirectoryNotSharedException" :portkey.aws.ds/directory-not-shared-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef unshare-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/unshare-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/unshare-directory-result))

(clojure.core/defn list-schema-extensions "Lists all schema extensions applied to a Microsoft AD Directory." ([list-schema-extensions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-schema-extensions-request list-schema-extensions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/list-schema-extensions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/list-schema-extensions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSchemaExtensions", :http.request.configuration/output-deser-fn response-list-schema-extensions-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef list-schema-extensions :args (clojure.spec.alpha/tuple :portkey.aws.ds/list-schema-extensions-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/list-schema-extensions-result))

(clojure.core/defn delete-trust "Deletes an existing trust relationship between your AWS Managed Microsoft AD\ndirectory and an external domain." ([delete-trust-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-trust-request delete-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/delete-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/delete-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrust", :http.request.configuration/output-deser-fn response-delete-trust-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds/delete-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/delete-trust-result))

(clojure.core/defn disable-radius "Disables multi-factor authentication (MFA) with the Remote Authentication Dial\nIn User Service (RADIUS) server for an AD Connector or Microsoft AD directory." ([disable-radius-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-radius-request disable-radius-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/disable-radius-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/disable-radius-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableRadius", :http.request.configuration/output-deser-fn response-disable-radius-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef disable-radius :args (clojure.spec.alpha/tuple :portkey.aws.ds/disable-radius-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/disable-radius-result))

(clojure.core/defn restore-from-snapshot "Restores a directory using an existing directory snapshot.\n When you restore a directory from a snapshot, any changes made to the directory\nafter the snapshot date are overwritten.\n This action returns as soon as the restore operation is initiated. You can\nmonitor the progress of the restore operation by calling the DescribeDirectories\noperation with the directory identifier. When the DirectoryDescription.Stage\nvalue changes to Active, the restore operation is complete." ([restore-from-snapshot-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-restore-from-snapshot-request restore-from-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/restore-from-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/restore-from-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreFromSnapshot", :http.request.configuration/output-deser-fn response-restore-from-snapshot-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef restore-from-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.ds/restore-from-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/restore-from-snapshot-result))

(clojure.core/defn describe-snapshots "Obtains information about the directory snapshots that belong to this account.\n This operation supports pagination with the use of the NextToken request and\nresponse parameters. If more results are available, the\nDescribeSnapshots.NextToken member contains a token that you pass in the next\ncall to DescribeSnapshots to retrieve the next set of items.\n You can also specify a maximum number of return results with the Limit\nparameter." ([] (describe-snapshots {})) ([describe-snapshots-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-snapshots-request describe-snapshots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-snapshots-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-snapshots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSnapshots", :http.request.configuration/output-deser-fn response-describe-snapshots-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef describe-snapshots :args (clojure.spec.alpha/? :portkey.aws.ds/describe-snapshots-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-snapshots-result))

(clojure.core/defn describe-shared-directories "Returns the shared directories in your account." ([describe-shared-directories-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-shared-directories-request describe-shared-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-shared-directories-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-shared-directories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSharedDirectories", :http.request.configuration/output-deser-fn response-describe-shared-directories-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef describe-shared-directories :args (clojure.spec.alpha/tuple :portkey.aws.ds/describe-shared-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-shared-directories-result))

(clojure.core/defn create-log-subscription "Creates a subscription to forward real time Directory Service domain controller\nsecurity logs to the specified CloudWatch log group in your AWS account." ([create-log-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-log-subscription-request create-log-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-log-subscription-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-log-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLogSubscription", :http.request.configuration/output-deser-fn response-create-log-subscription-result, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "InsufficientPermissionsException" :portkey.aws.ds/insufficient-permissions-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef create-log-subscription :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-log-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-log-subscription-result))

(clojure.core/defn share-directory "Shares a specified directory (DirectoryId) in your AWS account (directory owner)\nwith another AWS account (directory consumer). With this operation you can use\nyour directory from any AWS account and from any Amazon VPC within an AWS\nRegion.\n When you share your AWS Managed Microsoft AD directory, AWS Directory Service\ncreates a shared directory in the directory consumer account. This shared\ndirectory contains the metadata to provide access to the directory within the\ndirectory owner account. The shared directory is visible in all VPCs in the\ndirectory consumer account.\n The ShareMethod parameter determines whether the specified directory can be\nshared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It\nalso determines whether you can share the directory with any other AWS account\neither inside or outside of the organization (HANDSHAKE).\n The ShareNotes parameter is only used when HANDSHAKE is called, which sends a\ndirectory sharing request to the directory consumer." ([share-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-share-directory-request share-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/share-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/share-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ShareDirectory", :http.request.configuration/output-deser-fn response-share-directory-result, :http.request.spec/error-spec {"OrganizationsException" :portkey.aws.ds/organizations-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryAlreadySharedException" :portkey.aws.ds/directory-already-shared-exception, "ClientException" :portkey.aws.ds/client-exception, "InvalidTargetException" :portkey.aws.ds/invalid-target-exception, "ShareLimitExceededException" :portkey.aws.ds/share-limit-exceeded-exception, "ServiceException" :portkey.aws.ds/service-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "AccessDeniedException" :portkey.aws.ds/access-denied-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef share-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/share-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/share-directory-result))

(clojure.core/defn create-directory "Creates a Simple AD directory.\n Before you call CreateDirectory, ensure that all of the required permissions\nhave been explicitly granted through a policy. For details about what\npermissions are required to run the CreateDirectory operation, see AWS Directory\nService API Permissions: Actions, Resources, and Conditions Reference\n(http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html)." ([create-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-directory-request create-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectory", :http.request.configuration/output-deser-fn response-create-directory-result, :http.request.spec/error-spec {"DirectoryLimitExceededException" :portkey.aws.ds/directory-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef create-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-directory-result))

(clojure.core/defn remove-tags-from-resource "Removes tags from a directory." ([remove-tags-from-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-from-resource-request remove-tags-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/remove-tags-from-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/remove-tags-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.configuration/output-deser-fn response-remove-tags-from-resource-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.ds/remove-tags-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/remove-tags-from-resource-result))

(clojure.core/defn describe-directories "Obtains information about the directories that belong to this account.\n You can retrieve information about specific directories by passing the\ndirectory identifiers in the DirectoryIds parameter. Otherwise, all directories\nthat belong to the current account are returned.\n This operation supports pagination with the use of the NextToken request and\nresponse parameters. If more results are available, the\nDescribeDirectoriesResult.NextToken member contains a token that you pass in the\nnext call to DescribeDirectories to retrieve the next set of items.\n You can also specify a maximum number of return results with the Limit\nparameter." ([] (describe-directories {})) ([describe-directories-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-directories-request describe-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-directories-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-directories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectories", :http.request.configuration/output-deser-fn response-describe-directories-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.ds/invalid-next-token-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef describe-directories :args (clojure.spec.alpha/? :portkey.aws.ds/describe-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-directories-result))

(clojure.core/defn reject-shared-directory "Rejects a directory sharing request that was sent from the directory owner\naccount." ([reject-shared-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-reject-shared-directory-request reject-shared-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/reject-shared-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/reject-shared-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RejectSharedDirectory", :http.request.configuration/output-deser-fn response-reject-shared-directory-result, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryAlreadySharedException" :portkey.aws.ds/directory-already-shared-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef reject-shared-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/reject-shared-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/reject-shared-directory-result))

(clojure.core/defn start-schema-extension "Applies a schema extension to a Microsoft AD directory." ([start-schema-extension-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-schema-extension-request start-schema-extension-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/start-schema-extension-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/start-schema-extension-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSchemaExtension", :http.request.configuration/output-deser-fn response-start-schema-extension-result, :http.request.spec/error-spec {"DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "SnapshotLimitExceededException" :portkey.aws.ds/snapshot-limit-exceeded-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef start-schema-extension :args (clojure.spec.alpha/tuple :portkey.aws.ds/start-schema-extension-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/start-schema-extension-result))

(clojure.core/defn update-conditional-forwarder "Updates a conditional forwarder that has been set up for your AWS directory." ([update-conditional-forwarder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-conditional-forwarder-request update-conditional-forwarder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/update-conditional-forwarder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/update-conditional-forwarder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConditionalForwarder", :http.request.configuration/output-deser-fn response-update-conditional-forwarder-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef update-conditional-forwarder :args (clojure.spec.alpha/tuple :portkey.aws.ds/update-conditional-forwarder-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/update-conditional-forwarder-result))

(clojure.core/defn get-snapshot-limits "Obtains the manual snapshot limits for a directory." ([get-snapshot-limits-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-snapshot-limits-request get-snapshot-limits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/get-snapshot-limits-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/get-snapshot-limits-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSnapshotLimits", :http.request.configuration/output-deser-fn response-get-snapshot-limits-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef get-snapshot-limits :args (clojure.spec.alpha/tuple :portkey.aws.ds/get-snapshot-limits-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/get-snapshot-limits-result))

(clojure.core/defn create-conditional-forwarder "Creates a conditional forwarder associated with your AWS directory. Conditional\nforwarders are required in order to set up a trust relationship with another\ndomain. The conditional forwarder points to the trusted domain." ([create-conditional-forwarder-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-conditional-forwarder-request create-conditional-forwarder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-conditional-forwarder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-conditional-forwarder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConditionalForwarder", :http.request.configuration/output-deser-fn response-create-conditional-forwarder-result, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef create-conditional-forwarder :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-conditional-forwarder-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-conditional-forwarder-result))

(clojure.core/defn add-tags-to-resource "Adds or overwrites one or more tags for the specified directory. Each directory\ncan have a maximum of 50 tags. Each tag consists of a key and optional value.\nTag keys must be unique to each resource." ([add-tags-to-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-to-resource-request add-tags-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/add-tags-to-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/add-tags-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToResource", :http.request.configuration/output-deser-fn response-add-tags-to-resource-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "TagLimitExceededException" :portkey.aws.ds/tag-limit-exceeded-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.ds/add-tags-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/add-tags-to-resource-result))

(clojure.core/defn enable-sso "Enables single sign-on for a directory." ([enable-sso-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-enable-sso-request enable-sso-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/enable-sso-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/enable-sso-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableSso", :http.request.configuration/output-deser-fn response-enable-sso-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InsufficientPermissionsException" :portkey.aws.ds/insufficient-permissions-exception, "AuthenticationFailedException" :portkey.aws.ds/authentication-failed-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef enable-sso :args (clojure.spec.alpha/tuple :portkey.aws.ds/enable-sso-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/enable-sso-result))

(clojure.core/defn accept-shared-directory "Accepts a directory sharing request that was sent from the directory owner\naccount." ([accept-shared-directory-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-accept-shared-directory-request accept-shared-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/accept-shared-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/accept-shared-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptSharedDirectory", :http.request.configuration/output-deser-fn response-accept-shared-directory-result, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "DirectoryAlreadySharedException" :portkey.aws.ds/directory-already-shared-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef accept-shared-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds/accept-shared-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/accept-shared-directory-result))

(clojure.core/defn get-directory-limits "Obtains directory limit information for the current region." ([] (get-directory-limits {})) ([get-directory-limits-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-directory-limits-request get-directory-limits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/get-directory-limits-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/get-directory-limits-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDirectoryLimits", :http.request.configuration/output-deser-fn response-get-directory-limits-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef get-directory-limits :args (clojure.spec.alpha/? :portkey.aws.ds/get-directory-limits-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/get-directory-limits-result))

(clojure.core/defn create-computer "Creates a computer account in the specified directory, and joins the computer to\nthe directory." ([create-computer-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-computer-request create-computer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/create-computer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/create-computer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateComputer", :http.request.configuration/output-deser-fn response-create-computer-result, :http.request.spec/error-spec {"AuthenticationFailedException" :portkey.aws.ds/authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.ds/directory-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.ds/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds/unsupported-operation-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef create-computer :args (clojure.spec.alpha/tuple :portkey.aws.ds/create-computer-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/create-computer-result))

(clojure.core/defn describe-event-topics "Obtains information about which SNS topics receive status messages from the\nspecified directory.\n If no input parameters are provided, such as DirectoryId or TopicName, this\nrequest describes all of the associations in the account." ([] (describe-event-topics {})) ([describe-event-topics-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-event-topics-request describe-event-topics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.ds/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds/describe-event-topics-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds/describe-event-topics-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEventTopics", :http.request.configuration/output-deser-fn response-describe-event-topics-result, :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds/invalid-parameter-exception, "ClientException" :portkey.aws.ds/client-exception, "ServiceException" :portkey.aws.ds/service-exception}})))))
(clojure.spec.alpha/fdef describe-event-topics :args (clojure.spec.alpha/? :portkey.aws.ds/describe-event-topics-request) :ret (clojure.spec.alpha/and :portkey.aws.ds/describe-event-topics-result))
