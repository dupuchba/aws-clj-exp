(ns portkey.aws.sms.-2016-10-24 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "sms", :region "us-gov-east-1"},
    :ssl-common-name "sms.us-gov-east-1.amazonaws.com",
    :endpoint "https://sms.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "sms", :region "ap-northeast-1"},
    :ssl-common-name "sms.ap-northeast-1.amazonaws.com",
    :endpoint "https://sms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sms", :region "eu-west-1"},
    :ssl-common-name "sms.eu-west-1.amazonaws.com",
    :endpoint "https://sms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sms", :region "us-east-2"},
    :ssl-common-name "sms.us-east-2.amazonaws.com",
    :endpoint "https://sms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sms", :region "ap-southeast-2"},
    :ssl-common-name "sms.ap-southeast-2.amazonaws.com",
    :endpoint "https://sms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sms", :region "cn-north-1"},
    :ssl-common-name "sms.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sms.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sms", :region "sa-east-1"},
    :ssl-common-name "sms.sa-east-1.amazonaws.com",
    :endpoint "https://sms.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sms", :region "ap-southeast-1"},
    :ssl-common-name "sms.ap-southeast-1.amazonaws.com",
    :endpoint "https://sms.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sms", :region "cn-northwest-1"},
    :ssl-common-name "sms.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://sms.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sms", :region "ap-northeast-2"},
    :ssl-common-name "sms.ap-northeast-2.amazonaws.com",
    :endpoint "https://sms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sms", :region "eu-west-3"},
    :ssl-common-name "sms.eu-west-3.amazonaws.com",
    :endpoint "https://sms.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sms", :region "ca-central-1"},
    :ssl-common-name "sms.ca-central-1.amazonaws.com",
    :endpoint "https://sms.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sms", :region "eu-central-1"},
    :ssl-common-name "sms.eu-central-1.amazonaws.com",
    :endpoint "https://sms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sms", :region "eu-west-2"},
    :ssl-common-name "sms.eu-west-2.amazonaws.com",
    :endpoint "https://sms.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sms", :region "us-gov-west-1"},
    :ssl-common-name "sms.us-gov-west-1.amazonaws.com",
    :endpoint "https://sms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sms", :region "us-west-2"},
    :ssl-common-name "sms.us-west-2.amazonaws.com",
    :endpoint "https://sms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sms", :region "us-east-1"},
    :ssl-common-name "sms.us-east-1.amazonaws.com",
    :endpoint "https://sms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sms", :region "us-west-1"},
    :ssl-common-name "sms.us-west-1.amazonaws.com",
    :endpoint "https://sms.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sms", :region "ap-south-1"},
    :ssl-common-name "sms.ap-south-1.amazonaws.com",
    :endpoint "https://sms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-server-group-replication-configuration)

(clojure.core/declare ser-associate-public-ip-address)

(clojure.core/declare ser-app-description)

(clojure.core/declare ser-app-name)

(clojure.core/declare ser-server-group-name)

(clojure.core/declare ser-server-group-id)

(clojure.core/declare ser-security-group)

(clojure.core/declare ser-vm-name)

(clojure.core/declare ser-subnet)

(clojure.core/declare ser-launch-order)

(clojure.core/declare ser-role-name)

(clojure.core/declare ser-encrypted)

(clojure.core/declare ser-vm-manager-name)

(clojure.core/declare ser-force-terminate-app)

(clojure.core/declare ser-connector-id)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-server-type)

(clojure.core/declare ser-logical-id)

(clojure.core/declare ser-server-groups)

(clojure.core/declare ser-key-name)

(clojure.core/declare ser-vm-manager-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-vm-id)

(clojure.core/declare ser-vm-manager-id)

(clojure.core/declare ser-server-group-launch-configuration)

(clojure.core/declare ser-replication-job-id)

(clojure.core/declare ser-replication-job-terminated)

(clojure.core/declare ser-output-format)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-vm-server-address-list)

(clojure.core/declare ser-server-group)

(clojure.core/declare ser-app-ids)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-server-replication-configuration)

(clojure.core/declare ser-server)

(clojure.core/declare ser-server-list)

(clojure.core/declare ser-app-id)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-frequency)

(clojure.core/declare ser-ec-2-key-name)

(clojure.core/declare ser-server-replication-parameters)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-server-group-replication-configurations)

(clojure.core/declare ser-server-group-launch-configurations)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-server-launch-configuration)

(clojure.core/declare ser-force-stop-app-replication)

(clojure.core/declare ser-server-launch-configurations)

(clojure.core/declare ser-vm-server-address)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-license-type)

(clojure.core/declare ser-server-replication-configurations)

(clojure.core/declare ser-vm-path)

(clojure.core/declare ser-vm-server)

(clojure.core/declare ser-user-data)

(clojure.core/declare ser-server-id)

(clojure.core/declare ser-number-of-recent-amis-to-keep)

(clojure.core/declare ser-client-token)

(clojure.core/declare ser-run-once)

(clojure.core/declare ser-vpc)

(clojure.core/defn- ser-server-group-replication-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerGroupReplicationConfiguration", :type "structure"} (clojure.core/contains? input :server-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-group-id (input :server-group-id)) #:http.request.field{:name "serverGroupId", :shape "ServerGroupId"})) (clojure.core/contains? input :server-replication-configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-replication-configurations (input :server-replication-configurations)) #:http.request.field{:name "serverReplicationConfigurations", :shape "ServerReplicationConfigurations"}))))

(clojure.core/defn- ser-associate-public-ip-address [input] #:http.request.field{:value input, :shape "AssociatePublicIpAddress"})

(clojure.core/defn- ser-app-description [input] #:http.request.field{:value input, :shape "AppDescription"})

(clojure.core/defn- ser-app-name [input] #:http.request.field{:value input, :shape "AppName"})

(clojure.core/defn- ser-server-group-name [input] #:http.request.field{:value input, :shape "ServerGroupName"})

(clojure.core/defn- ser-server-group-id [input] #:http.request.field{:value input, :shape "ServerGroupId"})

(clojure.core/defn- ser-security-group [input] #:http.request.field{:value input, :shape "SecurityGroup"})

(clojure.core/defn- ser-vm-name [input] #:http.request.field{:value input, :shape "VmName"})

(clojure.core/defn- ser-subnet [input] #:http.request.field{:value input, :shape "Subnet"})

(clojure.core/defn- ser-launch-order [input] #:http.request.field{:value input, :shape "LaunchOrder"})

(clojure.core/defn- ser-role-name [input] #:http.request.field{:value input, :shape "RoleName"})

(clojure.core/defn- ser-encrypted [input] #:http.request.field{:value input, :shape "Encrypted"})

(clojure.core/defn- ser-vm-manager-name [input] #:http.request.field{:value input, :shape "VmManagerName"})

(clojure.core/defn- ser-force-terminate-app [input] #:http.request.field{:value input, :shape "ForceTerminateApp"})

(clojure.core/defn- ser-connector-id [input] #:http.request.field{:value input, :shape "ConnectorId"})

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value input, :shape "InstanceType"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-server-type [input] #:http.request.field{:value (clojure.core/get {"VIRTUAL_MACHINE" "VIRTUAL_MACHINE", :virtual-machine "VIRTUAL_MACHINE"} input), :shape "ServerType"})

(clojure.core/defn- ser-logical-id [input] #:http.request.field{:value input, :shape "LogicalId"})

(clojure.core/defn- ser-server-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-group coll) #:http.request.field{:shape "ServerGroup"}))) input), :shape "ServerGroups", :type "list"})

(clojure.core/defn- ser-key-name [input] #:http.request.field{:value input, :shape "KeyName"})

(clojure.core/defn- ser-vm-manager-type [input] #:http.request.field{:value (clojure.core/get {"VSPHERE" "VSPHERE", :vsphere "VSPHERE", "SCVMM" "SCVMM", :scvmm "SCVMM", "HYPERV-MANAGER" "HYPERV-MANAGER", :hypervmanager "HYPERV-MANAGER"} input), :shape "VmManagerType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-vm-id [input] #:http.request.field{:value input, :shape "VmId"})

(clojure.core/defn- ser-vm-manager-id [input] #:http.request.field{:value input, :shape "VmManagerId"})

(clojure.core/defn- ser-server-group-launch-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerGroupLaunchConfiguration", :type "structure"} (clojure.core/contains? input :server-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-group-id (input :server-group-id)) #:http.request.field{:name "serverGroupId", :shape "ServerGroupId"})) (clojure.core/contains? input :launch-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-order (input :launch-order)) #:http.request.field{:name "launchOrder", :shape "LaunchOrder"})) (clojure.core/contains? input :server-launch-configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-launch-configurations (input :server-launch-configurations)) #:http.request.field{:name "serverLaunchConfigurations", :shape "ServerLaunchConfigurations"}))))

(clojure.core/defn- ser-replication-job-id [input] #:http.request.field{:value input, :shape "ReplicationJobId"})

(clojure.core/defn- ser-replication-job-terminated [input] #:http.request.field{:value input, :shape "ReplicationJobTerminated"})

(clojure.core/defn- ser-output-format [input] #:http.request.field{:value (clojure.core/get {"JSON" "JSON", :json "JSON", "YAML" "YAML", :yaml "YAML"} input), :shape "OutputFormat"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-vm-server-address-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-vm-server-address coll) #:http.request.field{:shape "VmServerAddress"}))) input), :shape "VmServerAddressList", :type "list"})

(clojure.core/defn- ser-server-group [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerGroup", :type "structure"} (clojure.core/contains? input :server-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-group-id (input :server-group-id)) #:http.request.field{:name "serverGroupId", :shape "ServerGroupId"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-group-name (input :name)) #:http.request.field{:name "name", :shape "ServerGroupName"})) (clojure.core/contains? input :server-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-list (input :server-list)) #:http.request.field{:name "serverList", :shape "ServerList"}))))

(clojure.core/defn- ser-app-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-app-id coll) #:http.request.field{:shape "AppId"}))) input), :shape "AppIds", :type "list"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-server-replication-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerReplicationConfiguration", :type "structure"} (clojure.core/contains? input :server) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server (input :server)) #:http.request.field{:name "server", :shape "Server"})) (clojure.core/contains? input :server-replication-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-replication-parameters (input :server-replication-parameters)) #:http.request.field{:name "serverReplicationParameters", :shape "ServerReplicationParameters"}))))

(clojure.core/defn- ser-server [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Server", :type "structure"} (clojure.core/contains? input :server-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "serverId", :shape "ServerId"})) (clojure.core/contains? input :server-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-type (input :server-type)) #:http.request.field{:name "serverType", :shape "ServerType"})) (clojure.core/contains? input :vm-server) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-server (input :vm-server)) #:http.request.field{:name "vmServer", :shape "VmServer"})) (clojure.core/contains? input :replication-job-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})) (clojure.core/contains? input :replication-job-terminated) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-job-terminated (input :replication-job-terminated)) #:http.request.field{:name "replicationJobTerminated", :shape "ReplicationJobTerminated"}))))

(clojure.core/defn- ser-server-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server coll) #:http.request.field{:shape "Server"}))) input), :shape "ServerList", :type "list"})

(clojure.core/defn- ser-app-id [input] #:http.request.field{:value input, :shape "AppId"})

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "bucket", :shape "BucketName"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-name (input :key)) #:http.request.field{:name "key", :shape "KeyName"}))))

(clojure.core/defn- ser-frequency [input] #:http.request.field{:value input, :shape "Frequency"})

(clojure.core/defn- ser-ec-2-key-name [input] #:http.request.field{:value input, :shape "EC2KeyName"})

(clojure.core/defn- ser-server-replication-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerReplicationParameters", :type "structure"} (clojure.core/contains? input :seed-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :seed-time)) #:http.request.field{:name "seedTime", :shape "Timestamp"})) (clojure.core/contains? input :frequency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "Frequency"})) (clojure.core/contains? input :run-once) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-run-once (input :run-once)) #:http.request.field{:name "runOnce", :shape "RunOnce"})) (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-type (input :license-type)) #:http.request.field{:name "licenseType", :shape "LicenseType"})) (clojure.core/contains? input :number-of-recent-amis-to-keep) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-recent-amis-to-keep (input :number-of-recent-amis-to-keep)) #:http.request.field{:name "numberOfRecentAmisToKeep", :shape "NumberOfRecentAmisToKeep"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encrypted (input :encrypted)) #:http.request.field{:name "encrypted", :shape "Encrypted"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "kmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-server-group-replication-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-group-replication-configuration coll) #:http.request.field{:shape "ServerGroupReplicationConfiguration"}))) input), :shape "ServerGroupReplicationConfigurations", :type "list"})

(clojure.core/defn- ser-server-group-launch-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-group-launch-configuration coll) #:http.request.field{:shape "ServerGroupLaunchConfiguration"}))) input), :shape "ServerGroupLaunchConfigurations", :type "list"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-server-launch-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerLaunchConfiguration", :type "structure"} (clojure.core/contains? input :logical-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logical-id (input :logical-id)) #:http.request.field{:name "logicalId", :shape "LogicalId"})) (clojure.core/contains? input :associate-public-ip-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-associate-public-ip-address (input :associate-public-ip-address)) #:http.request.field{:name "associatePublicIpAddress", :shape "AssociatePublicIpAddress"})) (clojure.core/contains? input :subnet) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet (input :subnet)) #:http.request.field{:name "subnet", :shape "Subnet"})) (clojure.core/contains? input :vpc) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "vpc", :shape "VPC"})) (clojure.core/contains? input :ec-2-key-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-key-name (input :ec-2-key-name)) #:http.request.field{:name "ec2KeyName", :shape "EC2KeyName"})) (clojure.core/contains? input :server) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server (input :server)) #:http.request.field{:name "server", :shape "Server"})) (clojure.core/contains? input :user-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-data (input :user-data)) #:http.request.field{:name "userData", :shape "UserData"})) (clojure.core/contains? input :security-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group (input :security-group)) #:http.request.field{:name "securityGroup", :shape "SecurityGroup"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "instanceType", :shape "InstanceType"}))))

(clojure.core/defn- ser-force-stop-app-replication [input] #:http.request.field{:value input, :shape "ForceStopAppReplication"})

(clojure.core/defn- ser-server-launch-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-launch-configuration coll) #:http.request.field{:shape "ServerLaunchConfiguration"}))) input), :shape "ServerLaunchConfigurations", :type "list"})

(clojure.core/defn- ser-vm-server-address [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VmServerAddress", :type "structure"} (clojure.core/contains? input :vm-manager-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-manager-id (input :vm-manager-id)) #:http.request.field{:name "vmManagerId", :shape "VmManagerId"})) (clojure.core/contains? input :vm-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-id (input :vm-id)) #:http.request.field{:name "vmId", :shape "VmId"}))))

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-license-type [input] #:http.request.field{:value (clojure.core/get {"AWS" "AWS", :aws "AWS", "BYOL" "BYOL", :byol "BYOL"} input), :shape "LicenseType"})

(clojure.core/defn- ser-server-replication-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-replication-configuration coll) #:http.request.field{:shape "ServerReplicationConfiguration"}))) input), :shape "ServerReplicationConfigurations", :type "list"})

(clojure.core/defn- ser-vm-path [input] #:http.request.field{:value input, :shape "VmPath"})

(clojure.core/defn- ser-vm-server [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VmServer", :type "structure"} (clojure.core/contains? input :vm-server-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-server-address (input :vm-server-address)) #:http.request.field{:name "vmServerAddress", :shape "VmServerAddress"})) (clojure.core/contains? input :vm-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-name (input :vm-name)) #:http.request.field{:name "vmName", :shape "VmName"})) (clojure.core/contains? input :vm-manager-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-manager-name (input :vm-manager-name)) #:http.request.field{:name "vmManagerName", :shape "VmManagerName"})) (clojure.core/contains? input :vm-manager-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-manager-type (input :vm-manager-type)) #:http.request.field{:name "vmManagerType", :shape "VmManagerType"})) (clojure.core/contains? input :vm-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-path (input :vm-path)) #:http.request.field{:name "vmPath", :shape "VmPath"}))))

(clojure.core/defn- ser-user-data [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UserData", :type "structure"} (clojure.core/contains? input :s-3-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3-location)) #:http.request.field{:name "s3Location", :shape "S3Location"}))))

(clojure.core/defn- ser-server-id [input] #:http.request.field{:value input, :shape "ServerId"})

(clojure.core/defn- ser-number-of-recent-amis-to-keep [input] #:http.request.field{:value input, :shape "NumberOfRecentAmisToKeep"})

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- ser-run-once [input] #:http.request.field{:value input, :shape "RunOnce"})

(clojure.core/defn- ser-vpc [input] #:http.request.field{:value input, :shape "VPC"})

(clojure.core/defn- req-disassociate-connector-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connector-id (input :connector-id)) #:http.request.field{:name "connectorId", :shape "ConnectorId"})]}))

(clojure.core/defn- req-put-app-replication-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"})) (clojure.core/contains? input :server-group-replication-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-group-replication-configurations (input :server-group-replication-configurations)) #:http.request.field{:name "serverGroupReplicationConfigurations", :shape "ServerGroupReplicationConfigurations"}))))

(clojure.core/defn- req-get-app-launch-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-generate-change-set-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"})) (clojure.core/contains? input :changeset-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-format (input :changeset-format)) #:http.request.field{:name "changesetFormat", :shape "OutputFormat"}))))

(clojure.core/defn- req-create-app-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-name (input :name)) #:http.request.field{:name "name", :shape "AppName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-description (input :description)) #:http.request.field{:name "description", :shape "AppDescription"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "clientToken", :shape "ClientToken"})) (clojure.core/contains? input :server-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-groups (input :server-groups)) #:http.request.field{:name "serverGroups", :shape "ServerGroups"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

(clojure.core/defn- req-create-replication-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "serverId", :shape "ServerId"}) (clojure.core/into (ser-timestamp (input :seed-replication-time)) #:http.request.field{:name "seedReplicationTime", :shape "Timestamp"})]} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "kmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :run-once) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-run-once (input :run-once)) #:http.request.field{:name "runOnce", :shape "RunOnce"})) (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-type (input :license-type)) #:http.request.field{:name "licenseType", :shape "LicenseType"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encrypted (input :encrypted)) #:http.request.field{:name "encrypted", :shape "Encrypted"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :number-of-recent-amis-to-keep) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-recent-amis-to-keep (input :number-of-recent-amis-to-keep)) #:http.request.field{:name "numberOfRecentAmisToKeep", :shape "NumberOfRecentAmisToKeep"})) (clojure.core/contains? input :frequency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "Frequency"}))))

(clojure.core/defn- req-update-app-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-name (input :name)) #:http.request.field{:name "name", :shape "AppName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-description (input :description)) #:http.request.field{:name "description", :shape "AppDescription"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :server-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-groups (input :server-groups)) #:http.request.field{:name "serverGroups", :shape "ServerGroups"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

(clojure.core/defn- req-get-app-replication-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-delete-app-launch-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-get-servers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :vm-server-address-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vm-server-address-list (input :vm-server-address-list)) #:http.request.field{:name "vmServerAddressList", :shape "VmServerAddressList"}))))

(clojure.core/defn- req-delete-app-replication-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-list-apps-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-ids (input :app-ids)) #:http.request.field{:name "appIds", :shape "AppIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-terminate-app-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-launch-app-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-delete-replication-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]}))

(clojure.core/defn- req-start-on-demand-replication-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-get-replication-runs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-stop-app-replication-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-delete-app-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"})) (clojure.core/contains? input :force-stop-app-replication) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-stop-app-replication (input :force-stop-app-replication)) #:http.request.field{:name "forceStopAppReplication", :shape "ForceStopAppReplication"})) (clojure.core/contains? input :force-terminate-app) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-terminate-app (input :force-terminate-app)) #:http.request.field{:name "forceTerminateApp", :shape "ForceTerminateApp"}))))

(clojure.core/defn- req-get-app-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-get-connectors-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-replication-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :replication-job-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-start-app-replication-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"}))))

(clojure.core/defn- req-delete-server-catalog-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-replication-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "kmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-type (input :license-type)) #:http.request.field{:name "licenseType", :shape "LicenseType"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encrypted (input :encrypted)) #:http.request.field{:name "encrypted", :shape "Encrypted"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :next-replication-run-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :next-replication-run-start-time)) #:http.request.field{:name "nextReplicationRunStartTime", :shape "Timestamp"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :number-of-recent-amis-to-keep) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-recent-amis-to-keep (input :number-of-recent-amis-to-keep)) #:http.request.field{:name "numberOfRecentAmisToKeep", :shape "NumberOfRecentAmisToKeep"})) (clojure.core/contains? input :frequency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "Frequency"}))))

(clojure.core/defn- req-import-server-catalog-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-put-app-launch-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :server-group-launch-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-group-launch-configurations (input :server-group-launch-configurations)) #:http.request.field{:name "serverGroupLaunchConfigurations", :shape "ServerGroupLaunchConfigurations"}))))

(clojure.core/defn- req-generate-template-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :app-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId"})) (clojure.core/contains? input :template-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-format (input :template-format)) #:http.request.field{:name "templateFormat", :shape "OutputFormat"}))))

(clojure.core/declare deser-replication-job-status-message)

(clojure.core/declare deser-connector-list)

(clojure.core/declare deser-app-status)

(clojure.core/declare deser-connector-capability-list)

(clojure.core/declare deser-replication-run)

(clojure.core/declare deser-app-launch-status-message)

(clojure.core/declare deser-server-group-replication-configuration)

(clojure.core/declare deser-app-replication-status-message)

(clojure.core/declare deser-associate-public-ip-address)

(clojure.core/declare deser-app-description)

(clojure.core/declare deser-app-name)

(clojure.core/declare deser-replication-run-stage-details)

(clojure.core/declare deser-server-group-name)

(clojure.core/declare deser-connector)

(clojure.core/declare deser-server-group-id)

(clojure.core/declare deser-security-group)

(clojure.core/declare deser-vm-name)

(clojure.core/declare deser-subnet)

(clojure.core/declare deser-launch-order)

(clojure.core/declare deser-replication-job)

(clojure.core/declare deser-role-name)

(clojure.core/declare deser-encrypted)

(clojure.core/declare deser-vm-manager-name)

(clojure.core/declare deser-connector-id)

(clojure.core/declare deser-instance-type)

(clojure.core/declare deser-mac-address)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-server-type)

(clojure.core/declare deser-replication-run-type)

(clojure.core/declare deser-logical-id)

(clojure.core/declare deser-server-groups)

(clojure.core/declare deser-key-name)

(clojure.core/declare deser-vm-manager-type)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-replication-run-state)

(clojure.core/declare deser-launch-details)

(clojure.core/declare deser-vm-id)

(clojure.core/declare deser-replication-run-stage-progress)

(clojure.core/declare deser-total-server-groups)

(clojure.core/declare deser-vm-manager-id)

(clojure.core/declare deser-server-group-launch-configuration)

(clojure.core/declare deser-replication-job-id)

(clojure.core/declare deser-replication-run-status-message)

(clojure.core/declare deser-ami-id)

(clojure.core/declare deser-apps)

(clojure.core/declare deser-replication-job-terminated)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-connector-status)

(clojure.core/declare deser-server-group)

(clojure.core/declare deser-replication-run-id)

(clojure.core/declare deser-app-status-message)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-stack-id)

(clojure.core/declare deser-app-launch-status)

(clojure.core/declare deser-server-replication-configuration)

(clojure.core/declare deser-server)

(clojure.core/declare deser-server-list)

(clojure.core/declare deser-app-id)

(clojure.core/declare deser-s-3-location)

(clojure.core/declare deser-total-servers)

(clojure.core/declare deser-frequency)

(clojure.core/declare deser-replication-job-list)

(clojure.core/declare deser-ec-2-key-name)

(clojure.core/declare deser-connector-version)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-replication-run-stage)

(clojure.core/declare deser-server-replication-parameters)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-app-replication-status)

(clojure.core/declare deser-server-group-replication-configurations)

(clojure.core/declare deser-server-group-launch-configurations)

(clojure.core/declare deser-stack-name)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-connector-capability)

(clojure.core/declare deser-server-launch-configuration)

(clojure.core/declare deser-replication-run-list)

(clojure.core/declare deser-server-launch-configurations)

(clojure.core/declare deser-replication-job-state)

(clojure.core/declare deser-vm-server-address)

(clojure.core/declare deser-bucket-name)

(clojure.core/declare deser-license-type)

(clojure.core/declare deser-server-replication-configurations)

(clojure.core/declare deser-vm-path)

(clojure.core/declare deser-vm-server)

(clojure.core/declare deser-user-data)

(clojure.core/declare deser-server-id)

(clojure.core/declare deser-number-of-recent-amis-to-keep)

(clojure.core/declare deser-run-once)

(clojure.core/declare deser-vpc)

(clojure.core/declare deser-app-summary)

(clojure.core/declare deser-server-catalog-status)

(clojure.core/defn- deser-replication-job-status-message [input] input)

(clojure.core/defn- deser-connector-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-connector coll))) input))

(clojure.core/defn- deser-app-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "UPDATING" :updating, "DELETING" :deleting, "DELETED" :deleted, "DELETE_FAILED" :delete-failed} input))

(clojure.core/defn- deser-connector-capability-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-connector-capability coll))) input))

(clojure.core/defn- deser-replication-run [input] (clojure.core/cond-> {} (clojure.core/contains? input "stageDetails") (clojure.core/assoc :stage-details (deser-replication-run-stage-details (input "stageDetails"))) (clojure.core/contains? input "amiId") (clojure.core/assoc :ami-id (deser-ami-id (input "amiId"))) (clojure.core/contains? input "kmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "kmsKeyId"))) (clojure.core/contains? input "replicationRunId") (clojure.core/assoc :replication-run-id (deser-replication-run-id (input "replicationRunId"))) (clojure.core/contains? input "encrypted") (clojure.core/assoc :encrypted (deser-encrypted (input "encrypted"))) (clojure.core/contains? input "statusMessage") (clojure.core/assoc :status-message (deser-replication-run-status-message (input "statusMessage"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-replication-run-type (input "type"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-replication-run-state (input "state"))) (clojure.core/contains? input "completedTime") (clojure.core/assoc :completed-time (deser-timestamp (input "completedTime"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "scheduledStartTime") (clojure.core/assoc :scheduled-start-time (deser-timestamp (input "scheduledStartTime")))))

(clojure.core/defn- deser-app-launch-status-message [input] input)

(clojure.core/defn- deser-server-group-replication-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "serverGroupId") (clojure.core/assoc :server-group-id (deser-server-group-id (input "serverGroupId"))) (clojure.core/contains? input "serverReplicationConfigurations") (clojure.core/assoc :server-replication-configurations (deser-server-replication-configurations (input "serverReplicationConfigurations")))))

(clojure.core/defn- deser-app-replication-status-message [input] input)

(clojure.core/defn- deser-associate-public-ip-address [input] input)

(clojure.core/defn- deser-app-description [input] input)

(clojure.core/defn- deser-app-name [input] input)

(clojure.core/defn- deser-replication-run-stage-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "stage") (clojure.core/assoc :stage (deser-replication-run-stage (input "stage"))) (clojure.core/contains? input "stageProgress") (clojure.core/assoc :stage-progress (deser-replication-run-stage-progress (input "stageProgress")))))

(clojure.core/defn- deser-server-group-name [input] input)

(clojure.core/defn- deser-connector [input] (clojure.core/cond-> {} (clojure.core/contains? input "vmManagerId") (clojure.core/assoc :vm-manager-id (deser-vm-manager-id (input "vmManagerId"))) (clojure.core/contains? input "vmManagerType") (clojure.core/assoc :vm-manager-type (deser-vm-manager-type (input "vmManagerType"))) (clojure.core/contains? input "capabilityList") (clojure.core/assoc :capability-list (deser-connector-capability-list (input "capabilityList"))) (clojure.core/contains? input "vmManagerName") (clojure.core/assoc :vm-manager-name (deser-vm-manager-name (input "vmManagerName"))) (clojure.core/contains? input "connectorId") (clojure.core/assoc :connector-id (deser-connector-id (input "connectorId"))) (clojure.core/contains? input "macAddress") (clojure.core/assoc :mac-address (deser-mac-address (input "macAddress"))) (clojure.core/contains? input "associatedOn") (clojure.core/assoc :associated-on (deser-timestamp (input "associatedOn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-connector-status (input "status"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-connector-version (input "version"))) (clojure.core/contains? input "ipAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "ipAddress")))))

(clojure.core/defn- deser-server-group-id [input] input)

(clojure.core/defn- deser-security-group [input] input)

(clojure.core/defn- deser-vm-name [input] input)

(clojure.core/defn- deser-subnet [input] input)

(clojure.core/defn- deser-launch-order [input] input)

(clojure.core/defn- deser-replication-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "kmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "kmsKeyId"))) (clojure.core/contains? input "runOnce") (clojure.core/assoc :run-once (deser-run-once (input "runOnce"))) (clojure.core/contains? input "licenseType") (clojure.core/assoc :license-type (deser-license-type (input "licenseType"))) (clojure.core/contains? input "seedReplicationTime") (clojure.core/assoc :seed-replication-time (deser-timestamp (input "seedReplicationTime"))) (clojure.core/contains? input "encrypted") (clojure.core/assoc :encrypted (deser-encrypted (input "encrypted"))) (clojure.core/contains? input "serverType") (clojure.core/assoc :server-type (deser-server-type (input "serverType"))) (clojure.core/contains? input "latestAmiId") (clojure.core/assoc :latest-ami-id (deser-ami-id (input "latestAmiId"))) (clojure.core/contains? input "statusMessage") (clojure.core/assoc :status-message (deser-replication-job-status-message (input "statusMessage"))) (clojure.core/contains? input "replicationRunList") (clojure.core/assoc :replication-run-list (deser-replication-run-list (input "replicationRunList"))) (clojure.core/contains? input "roleName") (clojure.core/assoc :role-name (deser-role-name (input "roleName"))) (clojure.core/contains? input "nextReplicationRunStartTime") (clojure.core/assoc :next-replication-run-start-time (deser-timestamp (input "nextReplicationRunStartTime"))) (clojure.core/contains? input "vmServer") (clojure.core/assoc :vm-server (deser-vm-server (input "vmServer"))) (clojure.core/contains? input "serverId") (clojure.core/assoc :server-id (deser-server-id (input "serverId"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-replication-job-state (input "state"))) (clojure.core/contains? input "replicationJobId") (clojure.core/assoc :replication-job-id (deser-replication-job-id (input "replicationJobId"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "numberOfRecentAmisToKeep") (clojure.core/assoc :number-of-recent-amis-to-keep (deser-number-of-recent-amis-to-keep (input "numberOfRecentAmisToKeep"))) (clojure.core/contains? input "frequency") (clojure.core/assoc :frequency (deser-frequency (input "frequency")))))

(clojure.core/defn- deser-role-name [input] input)

(clojure.core/defn- deser-encrypted [input] input)

(clojure.core/defn- deser-vm-manager-name [input] input)

(clojure.core/defn- deser-connector-id [input] input)

(clojure.core/defn- deser-instance-type [input] input)

(clojure.core/defn- deser-mac-address [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-server-type [input] (clojure.core/get {"VIRTUAL_MACHINE" :virtual-machine} input))

(clojure.core/defn- deser-replication-run-type [input] (clojure.core/get {"ON_DEMAND" :on-demand, "AUTOMATIC" :automatic} input))

(clojure.core/defn- deser-logical-id [input] input)

(clojure.core/defn- deser-server-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-group coll))) input))

(clojure.core/defn- deser-key-name [input] input)

(clojure.core/defn- deser-vm-manager-type [input] (clojure.core/get {"VSPHERE" :vsphere, "SCVMM" :scvmm, "HYPERV-MANAGER" :hypervmanager} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-replication-run-state [input] (clojure.core/get {"PENDING" :pending, "MISSED" :missed, "ACTIVE" :active, "FAILED" :failed, "COMPLETED" :completed, "DELETING" :deleting, "DELETED" :deleted} input))

(clojure.core/defn- deser-launch-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "latestLaunchTime") (clojure.core/assoc :latest-launch-time (deser-timestamp (input "latestLaunchTime"))) (clojure.core/contains? input "stackName") (clojure.core/assoc :stack-name (deser-stack-name (input "stackName"))) (clojure.core/contains? input "stackId") (clojure.core/assoc :stack-id (deser-stack-id (input "stackId")))))

(clojure.core/defn- deser-vm-id [input] input)

(clojure.core/defn- deser-replication-run-stage-progress [input] input)

(clojure.core/defn- deser-total-server-groups [input] input)

(clojure.core/defn- deser-vm-manager-id [input] input)

(clojure.core/defn- deser-server-group-launch-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "serverGroupId") (clojure.core/assoc :server-group-id (deser-server-group-id (input "serverGroupId"))) (clojure.core/contains? input "launchOrder") (clojure.core/assoc :launch-order (deser-launch-order (input "launchOrder"))) (clojure.core/contains? input "serverLaunchConfigurations") (clojure.core/assoc :server-launch-configurations (deser-server-launch-configurations (input "serverLaunchConfigurations")))))

(clojure.core/defn- deser-replication-job-id [input] input)

(clojure.core/defn- deser-replication-run-status-message [input] input)

(clojure.core/defn- deser-ami-id [input] input)

(clojure.core/defn- deser-apps [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-app-summary coll))) input))

(clojure.core/defn- deser-replication-job-terminated [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-connector-status [input] (clojure.core/get {"HEALTHY" :healthy, "UNHEALTHY" :unhealthy} input))

(clojure.core/defn- deser-server-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "serverGroupId") (clojure.core/assoc :server-group-id (deser-server-group-id (input "serverGroupId"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-server-group-name (input "name"))) (clojure.core/contains? input "serverList") (clojure.core/assoc :server-list (deser-server-list (input "serverList")))))

(clojure.core/defn- deser-replication-run-id [input] input)

(clojure.core/defn- deser-app-status-message [input] input)

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-stack-id [input] input)

(clojure.core/defn- deser-app-launch-status [input] (clojure.core/get {"CONFIGURATION_IN_PROGRESS" :configuration-in-progress, "TERMINATED" :terminated, "LAUNCH_IN_PROGRESS" :launch-in-progress, "VALIDATION_IN_PROGRESS" :validation-in-progress, "CONFIGURATION_INVALID" :configuration-invalid, "LAUNCHED" :launched, "TERMINATE_IN_PROGRESS" :terminate-in-progress, "LAUNCH_FAILED" :launch-failed, "DELTA_LAUNCH_FAILED" :delta-launch-failed, "READY_FOR_LAUNCH" :ready-for-launch, "READY_FOR_CONFIGURATION" :ready-for-configuration, "LAUNCH_PENDING" :launch-pending, "TERMINATE_FAILED" :terminate-failed, "DELTA_LAUNCH_IN_PROGRESS" :delta-launch-in-progress} input))

(clojure.core/defn- deser-server-replication-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "server") (clojure.core/assoc :server (deser-server (input "server"))) (clojure.core/contains? input "serverReplicationParameters") (clojure.core/assoc :server-replication-parameters (deser-server-replication-parameters (input "serverReplicationParameters")))))

(clojure.core/defn- deser-server [input] (clojure.core/cond-> {} (clojure.core/contains? input "serverId") (clojure.core/assoc :server-id (deser-server-id (input "serverId"))) (clojure.core/contains? input "serverType") (clojure.core/assoc :server-type (deser-server-type (input "serverType"))) (clojure.core/contains? input "vmServer") (clojure.core/assoc :vm-server (deser-vm-server (input "vmServer"))) (clojure.core/contains? input "replicationJobId") (clojure.core/assoc :replication-job-id (deser-replication-job-id (input "replicationJobId"))) (clojure.core/contains? input "replicationJobTerminated") (clojure.core/assoc :replication-job-terminated (deser-replication-job-terminated (input "replicationJobTerminated")))))

(clojure.core/defn- deser-server-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server coll))) input))

(clojure.core/defn- deser-app-id [input] input)

(clojure.core/defn- deser-s-3-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "bucket") (clojure.core/assoc :bucket (deser-bucket-name (input "bucket"))) (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-key-name (input "key")))))

(clojure.core/defn- deser-total-servers [input] input)

(clojure.core/defn- deser-frequency [input] input)

(clojure.core/defn- deser-replication-job-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-job coll))) input))

(clojure.core/defn- deser-ec-2-key-name [input] input)

(clojure.core/defn- deser-connector-version [input] input)

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-replication-run-stage [input] input)

(clojure.core/defn- deser-server-replication-parameters [input] (clojure.core/cond-> {} (clojure.core/contains? input "seedTime") (clojure.core/assoc :seed-time (deser-timestamp (input "seedTime"))) (clojure.core/contains? input "frequency") (clojure.core/assoc :frequency (deser-frequency (input "frequency"))) (clojure.core/contains? input "runOnce") (clojure.core/assoc :run-once (deser-run-once (input "runOnce"))) (clojure.core/contains? input "licenseType") (clojure.core/assoc :license-type (deser-license-type (input "licenseType"))) (clojure.core/contains? input "numberOfRecentAmisToKeep") (clojure.core/assoc :number-of-recent-amis-to-keep (deser-number-of-recent-amis-to-keep (input "numberOfRecentAmisToKeep"))) (clojure.core/contains? input "encrypted") (clojure.core/assoc :encrypted (deser-encrypted (input "encrypted"))) (clojure.core/contains? input "kmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "kmsKeyId")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-app-replication-status [input] (clojure.core/get {"REPLICATION_FAILED" :replication-failed, "DELTA_REPLICATION_FAILED" :delta-replication-failed, "REPLICATION_STOP_FAILED" :replication-stop-failed, "REPLICATION_PENDING" :replication-pending, "DELTA_REPLICATION_IN_PROGRESS" :delta-replication-in-progress, "CONFIGURATION_IN_PROGRESS" :configuration-in-progress, "DELTA_REPLICATED" :delta-replicated, "VALIDATION_IN_PROGRESS" :validation-in-progress, "READY_FOR_REPLICATION" :ready-for-replication, "REPLICATED" :replicated, "CONFIGURATION_INVALID" :configuration-invalid, "REPLICATION_STOPPED" :replication-stopped, "REPLICATION_IN_PROGRESS" :replication-in-progress, "REPLICATION_STOPPING" :replication-stopping, "READY_FOR_CONFIGURATION" :ready-for-configuration} input))

(clojure.core/defn- deser-server-group-replication-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-group-replication-configuration coll))) input))

(clojure.core/defn- deser-server-group-launch-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-group-launch-configuration coll))) input))

(clojure.core/defn- deser-stack-name [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-tag-key (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-connector-capability [input] (clojure.core/get {"VSPHERE" :vsphere, "SCVMM" :scvmm, "HYPERV-MANAGER" :hypervmanager, "SNAPSHOT_BATCHING" :snapshot-batching} input))

(clojure.core/defn- deser-server-launch-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "logicalId") (clojure.core/assoc :logical-id (deser-logical-id (input "logicalId"))) (clojure.core/contains? input "associatePublicIpAddress") (clojure.core/assoc :associate-public-ip-address (deser-associate-public-ip-address (input "associatePublicIpAddress"))) (clojure.core/contains? input "subnet") (clojure.core/assoc :subnet (deser-subnet (input "subnet"))) (clojure.core/contains? input "vpc") (clojure.core/assoc :vpc (deser-vpc (input "vpc"))) (clojure.core/contains? input "ec2KeyName") (clojure.core/assoc :ec-2-key-name (deser-ec-2-key-name (input "ec2KeyName"))) (clojure.core/contains? input "server") (clojure.core/assoc :server (deser-server (input "server"))) (clojure.core/contains? input "userData") (clojure.core/assoc :user-data (deser-user-data (input "userData"))) (clojure.core/contains? input "securityGroup") (clojure.core/assoc :security-group (deser-security-group (input "securityGroup"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "instanceType")))))

(clojure.core/defn- deser-replication-run-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-run coll))) input))

(clojure.core/defn- deser-server-launch-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-launch-configuration coll))) input))

(clojure.core/defn- deser-replication-job-state [input] (clojure.core/get {"PENDING" :pending, "ACTIVE" :active, "FAILED" :failed, "DELETING" :deleting, "DELETED" :deleted, "COMPLETED" :completed, "PAUSED_ON_FAILURE" :paused-on-failure, "FAILING" :failing} input))

(clojure.core/defn- deser-vm-server-address [input] (clojure.core/cond-> {} (clojure.core/contains? input "vmManagerId") (clojure.core/assoc :vm-manager-id (deser-vm-manager-id (input "vmManagerId"))) (clojure.core/contains? input "vmId") (clojure.core/assoc :vm-id (deser-vm-id (input "vmId")))))

(clojure.core/defn- deser-bucket-name [input] input)

(clojure.core/defn- deser-license-type [input] (clojure.core/get {"AWS" :aws, "BYOL" :byol} input))

(clojure.core/defn- deser-server-replication-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-replication-configuration coll))) input))

(clojure.core/defn- deser-vm-path [input] input)

(clojure.core/defn- deser-vm-server [input] (clojure.core/cond-> {} (clojure.core/contains? input "vmServerAddress") (clojure.core/assoc :vm-server-address (deser-vm-server-address (input "vmServerAddress"))) (clojure.core/contains? input "vmName") (clojure.core/assoc :vm-name (deser-vm-name (input "vmName"))) (clojure.core/contains? input "vmManagerName") (clojure.core/assoc :vm-manager-name (deser-vm-manager-name (input "vmManagerName"))) (clojure.core/contains? input "vmManagerType") (clojure.core/assoc :vm-manager-type (deser-vm-manager-type (input "vmManagerType"))) (clojure.core/contains? input "vmPath") (clojure.core/assoc :vm-path (deser-vm-path (input "vmPath")))))

(clojure.core/defn- deser-user-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "s3Location") (clojure.core/assoc :s-3-location (deser-s-3-location (input "s3Location")))))

(clojure.core/defn- deser-server-id [input] input)

(clojure.core/defn- deser-number-of-recent-amis-to-keep [input] input)

(clojure.core/defn- deser-run-once [input] input)

(clojure.core/defn- deser-vpc [input] input)

(clojure.core/defn- deser-app-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "launchStatusMessage") (clojure.core/assoc :launch-status-message (deser-app-launch-status-message (input "launchStatusMessage"))) (clojure.core/contains? input "lastModified") (clojure.core/assoc :last-modified (deser-timestamp (input "lastModified"))) (clojure.core/contains? input "totalServerGroups") (clojure.core/assoc :total-server-groups (deser-total-server-groups (input "totalServerGroups"))) (clojure.core/contains? input "replicationStatus") (clojure.core/assoc :replication-status (deser-app-replication-status (input "replicationStatus"))) (clojure.core/contains? input "launchStatus") (clojure.core/assoc :launch-status (deser-app-launch-status (input "launchStatus"))) (clojure.core/contains? input "totalServers") (clojure.core/assoc :total-servers (deser-total-servers (input "totalServers"))) (clojure.core/contains? input "latestReplicationTime") (clojure.core/assoc :latest-replication-time (deser-timestamp (input "latestReplicationTime"))) (clojure.core/contains? input "replicationStatusMessage") (clojure.core/assoc :replication-status-message (deser-app-replication-status-message (input "replicationStatusMessage"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-app-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-app-status (input "status"))) (clojure.core/contains? input "launchDetails") (clojure.core/assoc :launch-details (deser-launch-details (input "launchDetails"))) (clojure.core/contains? input "statusMessage") (clojure.core/assoc :status-message (deser-app-status-message (input "statusMessage"))) (clojure.core/contains? input "roleName") (clojure.core/assoc :role-name (deser-role-name (input "roleName"))) (clojure.core/contains? input "appId") (clojure.core/assoc :app-id (deser-app-id (input "appId"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-app-description (input "description")))))

(clojure.core/defn- deser-server-catalog-status [input] (clojure.core/get {"NOT_IMPORTED" :not-imported, "IMPORTING" :importing, "AVAILABLE" :available, "DELETED" :deleted, "EXPIRED" :expired} input))

(clojure.core/defn- response-delete-server-catalog-response ([input] (response-delete-server-catalog-response nil input)) ([resultWrapper1742757 input] (clojure.core/let [rawinput1742756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742758 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-app-response ([input] (response-create-app-response nil input)) ([resultWrapper1742760 input] (clojure.core/let [rawinput1742759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742761 {"appSummary" (rawinput1742759 "appSummary"), "serverGroups" (rawinput1742759 "serverGroups"), "tags" (rawinput1742759 "tags")}] (clojure.core/cond-> {} (letvar1742761 "appSummary") (clojure.core/assoc :app-summary (deser-app-summary (clojure.core/get-in letvar1742761 ["appSummary"]))) (letvar1742761 "serverGroups") (clojure.core/assoc :server-groups (deser-server-groups (clojure.core/get-in letvar1742761 ["serverGroups"]))) (letvar1742761 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1742761 ["tags"])))))))

(clojure.core/defn- response-put-app-replication-configuration-response ([input] (response-put-app-replication-configuration-response nil input)) ([resultWrapper1742763 input] (clojure.core/let [rawinput1742762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742764 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper1742766 input] (clojure.core/let [rawinput1742765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742767 {"message" (rawinput1742765 "message")}] (clojure.core/cond-> {} (letvar1742767 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742767 ["message"])))))))

(clojure.core/defn- response-missing-required-parameter-exception ([input] (response-missing-required-parameter-exception nil input)) ([resultWrapper1742769 input] (clojure.core/let [rawinput1742768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742770 {"message" (rawinput1742768 "message")}] (clojure.core/cond-> {} (letvar1742770 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742770 ["message"])))))))

(clojure.core/defn- response-disassociate-connector-response ([input] (response-disassociate-connector-response nil input)) ([resultWrapper1742772 input] (clojure.core/let [rawinput1742771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742773 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-app-replication-configuration-response ([input] (response-delete-app-replication-configuration-response nil input)) ([resultWrapper1742775 input] (clojure.core/let [rawinput1742774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742776 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-app-response ([input] (response-get-app-response nil input)) ([resultWrapper1742778 input] (clojure.core/let [rawinput1742777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742779 {"appSummary" (rawinput1742777 "appSummary"), "serverGroups" (rawinput1742777 "serverGroups"), "tags" (rawinput1742777 "tags")}] (clojure.core/cond-> {} (letvar1742779 "appSummary") (clojure.core/assoc :app-summary (deser-app-summary (clojure.core/get-in letvar1742779 ["appSummary"]))) (letvar1742779 "serverGroups") (clojure.core/assoc :server-groups (deser-server-groups (clojure.core/get-in letvar1742779 ["serverGroups"]))) (letvar1742779 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1742779 ["tags"])))))))

(clojure.core/defn- response-launch-app-response ([input] (response-launch-app-response nil input)) ([resultWrapper1742781 input] (clojure.core/let [rawinput1742780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742782 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-servers-response ([input] (response-get-servers-response nil input)) ([resultWrapper1742784 input] (clojure.core/let [rawinput1742783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742785 {"lastModifiedOn" (rawinput1742783 "lastModifiedOn"), "serverCatalogStatus" (rawinput1742783 "serverCatalogStatus"), "serverList" (rawinput1742783 "serverList"), "nextToken" (rawinput1742783 "nextToken")}] (clojure.core/cond-> {} (letvar1742785 "lastModifiedOn") (clojure.core/assoc :last-modified-on (deser-timestamp (clojure.core/get-in letvar1742785 ["lastModifiedOn"]))) (letvar1742785 "serverCatalogStatus") (clojure.core/assoc :server-catalog-status (deser-server-catalog-status (clojure.core/get-in letvar1742785 ["serverCatalogStatus"]))) (letvar1742785 "serverList") (clojure.core/assoc :server-list (deser-server-list (clojure.core/get-in letvar1742785 ["serverList"]))) (letvar1742785 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1742785 ["nextToken"])))))))

(clojure.core/defn- response-internal-error ([input] (response-internal-error nil input)) ([resultWrapper1742787 input] (clojure.core/let [rawinput1742786 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742788 {"message" (rawinput1742786 "message")}] (clojure.core/cond-> {} (letvar1742788 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742788 ["message"])))))))

(clojure.core/defn- response-generate-change-set-response ([input] (response-generate-change-set-response nil input)) ([resultWrapper1742790 input] (clojure.core/let [rawinput1742789 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742791 {"s3Location" (rawinput1742789 "s3Location")}] (clojure.core/cond-> {} (letvar1742791 "s3Location") (clojure.core/assoc :s-3-location (deser-s-3-location (clojure.core/get-in letvar1742791 ["s3Location"])))))))

(clojure.core/defn- response-list-apps-response ([input] (response-list-apps-response nil input)) ([resultWrapper1742793 input] (clojure.core/let [rawinput1742792 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742794 {"apps" (rawinput1742792 "apps"), "nextToken" (rawinput1742792 "nextToken")}] (clojure.core/cond-> {} (letvar1742794 "apps") (clojure.core/assoc :apps (deser-apps (clojure.core/get-in letvar1742794 ["apps"]))) (letvar1742794 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1742794 ["nextToken"])))))))

(clojure.core/defn- response-start-on-demand-replication-run-response ([input] (response-start-on-demand-replication-run-response nil input)) ([resultWrapper1742796 input] (clojure.core/let [rawinput1742795 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742797 {"replicationRunId" (rawinput1742795 "replicationRunId")}] (clojure.core/cond-> {} (letvar1742797 "replicationRunId") (clojure.core/assoc :replication-run-id (deser-replication-run-id (clojure.core/get-in letvar1742797 ["replicationRunId"])))))))

(clojure.core/defn- response-start-app-replication-response ([input] (response-start-app-replication-response nil input)) ([resultWrapper1742799 input] (clojure.core/let [rawinput1742798 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742800 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-generate-template-response ([input] (response-generate-template-response nil input)) ([resultWrapper1742802 input] (clojure.core/let [rawinput1742801 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742803 {"s3Location" (rawinput1742801 "s3Location")}] (clojure.core/cond-> {} (letvar1742803 "s3Location") (clojure.core/assoc :s-3-location (deser-s-3-location (clojure.core/get-in letvar1742803 ["s3Location"])))))))

(clojure.core/defn- response-update-app-response ([input] (response-update-app-response nil input)) ([resultWrapper1742805 input] (clojure.core/let [rawinput1742804 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742806 {"appSummary" (rawinput1742804 "appSummary"), "serverGroups" (rawinput1742804 "serverGroups"), "tags" (rawinput1742804 "tags")}] (clojure.core/cond-> {} (letvar1742806 "appSummary") (clojure.core/assoc :app-summary (deser-app-summary (clojure.core/get-in letvar1742806 ["appSummary"]))) (letvar1742806 "serverGroups") (clojure.core/assoc :server-groups (deser-server-groups (clojure.core/get-in letvar1742806 ["serverGroups"]))) (letvar1742806 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1742806 ["tags"])))))))

(clojure.core/defn- response-update-replication-job-response ([input] (response-update-replication-job-response nil input)) ([resultWrapper1742808 input] (clojure.core/let [rawinput1742807 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742809 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-import-server-catalog-response ([input] (response-import-server-catalog-response nil input)) ([resultWrapper1742811 input] (clojure.core/let [rawinput1742810 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742812 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-server-cannot-be-replicated-exception ([input] (response-server-cannot-be-replicated-exception nil input)) ([resultWrapper1742814 input] (clojure.core/let [rawinput1742813 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742815 {"message" (rawinput1742813 "message")}] (clojure.core/cond-> {} (letvar1742815 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742815 ["message"])))))))

(clojure.core/defn- response-temporarily-unavailable-exception ([input] (response-temporarily-unavailable-exception nil input)) ([resultWrapper1742817 input] (clojure.core/let [rawinput1742816 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742818 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-app-response ([input] (response-delete-app-response nil input)) ([resultWrapper1742820 input] (clojure.core/let [rawinput1742819 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742821 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-replication-job-response ([input] (response-delete-replication-job-response nil input)) ([resultWrapper1742823 input] (clojure.core/let [rawinput1742822 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742824 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-replication-job-response ([input] (response-create-replication-job-response nil input)) ([resultWrapper1742826 input] (clojure.core/let [rawinput1742825 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742827 {"replicationJobId" (rawinput1742825 "replicationJobId")}] (clojure.core/cond-> {} (letvar1742827 "replicationJobId") (clojure.core/assoc :replication-job-id (deser-replication-job-id (clojure.core/get-in letvar1742827 ["replicationJobId"])))))))

(clojure.core/defn- response-no-connectors-available-exception ([input] (response-no-connectors-available-exception nil input)) ([resultWrapper1742829 input] (clojure.core/let [rawinput1742828 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742830 {"message" (rawinput1742828 "message")}] (clojure.core/cond-> {} (letvar1742830 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742830 ["message"])))))))

(clojure.core/defn- response-get-app-replication-configuration-response ([input] (response-get-app-replication-configuration-response nil input)) ([resultWrapper1742832 input] (clojure.core/let [rawinput1742831 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742833 {"serverGroupReplicationConfigurations" (rawinput1742831 "serverGroupReplicationConfigurations")}] (clojure.core/cond-> {} (letvar1742833 "serverGroupReplicationConfigurations") (clojure.core/assoc :server-group-replication-configurations (deser-server-group-replication-configurations (clojure.core/get-in letvar1742833 ["serverGroupReplicationConfigurations"])))))))

(clojure.core/defn- response-unauthorized-operation-exception ([input] (response-unauthorized-operation-exception nil input)) ([resultWrapper1742835 input] (clojure.core/let [rawinput1742834 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742836 {"message" (rawinput1742834 "message")}] (clojure.core/cond-> {} (letvar1742836 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742836 ["message"])))))))

(clojure.core/defn- response-replication-job-already-exists-exception ([input] (response-replication-job-already-exists-exception nil input)) ([resultWrapper1742838 input] (clojure.core/let [rawinput1742837 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742839 {"message" (rawinput1742837 "message")}] (clojure.core/cond-> {} (letvar1742839 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742839 ["message"])))))))

(clojure.core/defn- response-put-app-launch-configuration-response ([input] (response-put-app-launch-configuration-response nil input)) ([resultWrapper1742841 input] (clojure.core/let [rawinput1742840 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742842 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-app-launch-configuration-response ([input] (response-delete-app-launch-configuration-response nil input)) ([resultWrapper1742844 input] (clojure.core/let [rawinput1742843 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742845 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-replication-jobs-response ([input] (response-get-replication-jobs-response nil input)) ([resultWrapper1742847 input] (clojure.core/let [rawinput1742846 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742848 {"replicationJobList" (rawinput1742846 "replicationJobList"), "nextToken" (rawinput1742846 "nextToken")}] (clojure.core/cond-> {} (letvar1742848 "replicationJobList") (clojure.core/assoc :replication-job-list (deser-replication-job-list (clojure.core/get-in letvar1742848 ["replicationJobList"]))) (letvar1742848 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1742848 ["nextToken"])))))))

(clojure.core/defn- response-get-replication-runs-response ([input] (response-get-replication-runs-response nil input)) ([resultWrapper1742850 input] (clojure.core/let [rawinput1742849 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742851 {"replicationJob" (rawinput1742849 "replicationJob"), "replicationRunList" (rawinput1742849 "replicationRunList"), "nextToken" (rawinput1742849 "nextToken")}] (clojure.core/cond-> {} (letvar1742851 "replicationJob") (clojure.core/assoc :replication-job (deser-replication-job (clojure.core/get-in letvar1742851 ["replicationJob"]))) (letvar1742851 "replicationRunList") (clojure.core/assoc :replication-run-list (deser-replication-run-list (clojure.core/get-in letvar1742851 ["replicationRunList"]))) (letvar1742851 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1742851 ["nextToken"])))))))

(clojure.core/defn- response-terminate-app-response ([input] (response-terminate-app-response nil input)) ([resultWrapper1742853 input] (clojure.core/let [rawinput1742852 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742854 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-connectors-response ([input] (response-get-connectors-response nil input)) ([resultWrapper1742856 input] (clojure.core/let [rawinput1742855 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742857 {"connectorList" (rawinput1742855 "connectorList"), "nextToken" (rawinput1742855 "nextToken")}] (clojure.core/cond-> {} (letvar1742857 "connectorList") (clojure.core/assoc :connector-list (deser-connector-list (clojure.core/get-in letvar1742857 ["connectorList"]))) (letvar1742857 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1742857 ["nextToken"])))))))

(clojure.core/defn- response-replication-run-limit-exceeded-exception ([input] (response-replication-run-limit-exceeded-exception nil input)) ([resultWrapper1742859 input] (clojure.core/let [rawinput1742858 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742860 {"message" (rawinput1742858 "message")}] (clojure.core/cond-> {} (letvar1742860 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742860 ["message"])))))))

(clojure.core/defn- response-stop-app-replication-response ([input] (response-stop-app-replication-response nil input)) ([resultWrapper1742862 input] (clojure.core/let [rawinput1742861 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742863 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1742865 input] (clojure.core/let [rawinput1742864 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742866 {"message" (rawinput1742864 "message")}] (clojure.core/cond-> {} (letvar1742866 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742866 ["message"])))))))

(clojure.core/defn- response-replication-job-not-found-exception ([input] (response-replication-job-not-found-exception nil input)) ([resultWrapper1742868 input] (clojure.core/let [rawinput1742867 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742869 {"message" (rawinput1742867 "message")}] (clojure.core/cond-> {} (letvar1742869 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1742869 ["message"])))))))

(clojure.core/defn- response-get-app-launch-configuration-response ([input] (response-get-app-launch-configuration-response nil input)) ([resultWrapper1742871 input] (clojure.core/let [rawinput1742870 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1742872 {"appId" (rawinput1742870 "appId"), "roleName" (rawinput1742870 "roleName"), "serverGroupLaunchConfigurations" (rawinput1742870 "serverGroupLaunchConfigurations")}] (clojure.core/cond-> {} (letvar1742872 "appId") (clojure.core/assoc :app-id (deser-app-id (clojure.core/get-in letvar1742872 ["appId"]))) (letvar1742872 "roleName") (clojure.core/assoc :role-name (deser-role-name (clojure.core/get-in letvar1742872 ["roleName"]))) (letvar1742872 "serverGroupLaunchConfigurations") (clojure.core/assoc :server-group-launch-configurations (deser-server-group-launch-configurations (clojure.core/get-in letvar1742872 ["serverGroupLaunchConfigurations"])))))))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.disassociate-connector-request/connector-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/disassociate-connector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.disassociate-connector-request/connector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/connector))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-status #{:delete-failed :deleted :creating "UPDATING" :deleting :active "DELETING" "CREATING" "ACTIVE" :updating "DELETED" "DELETE_FAILED"})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-server-catalog-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.put-app-replication-configuration-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.put-app-replication-configuration-request/server-group-replication-configurations (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-replication-configurations))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/put-app-replication-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.put-app-replication-configuration-request/app-id :portkey.aws.sms.-2016-10-24.put-app-replication-configuration-request/server-group-replication-configurations]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-capability-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/connector-capability))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-response/app-summary (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-summary))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-response/server-groups (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-groups))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-response/tags (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tags))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/create-app-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.create-app-response/app-summary :portkey.aws.sms.-2016-10-24.create-app-response/server-groups :portkey.aws.sms.-2016-10-24.create-app-response/tags]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/stage-details (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-stage-details))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/ami-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ami-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/kms-key-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/replication-run-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/encrypted (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/encrypted))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/state (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-state))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/completed-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/scheduled-start-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-run/stage-details :portkey.aws.sms.-2016-10-24.replication-run/ami-id :portkey.aws.sms.-2016-10-24.replication-run/kms-key-id :portkey.aws.sms.-2016-10-24.replication-run/replication-run-id :portkey.aws.sms.-2016-10-24.replication-run/encrypted :portkey.aws.sms.-2016-10-24.replication-run/status-message :portkey.aws.sms.-2016-10-24.replication-run/type :portkey.aws.sms.-2016-10-24.replication-run/state :portkey.aws.sms.-2016-10-24.replication-run/completed-time :portkey.aws.sms.-2016-10-24.replication-run/description :portkey.aws.sms.-2016-10-24.replication-run/scheduled-start-time]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/put-app-replication-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-launch-configuration-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-app-launch-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-app-launch-configuration-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-launch-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group-replication-configuration/server-group-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group-replication-configuration/server-replication-configurations (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-replication-configurations))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group-replication-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-group-replication-configuration/server-group-id :portkey.aws.sms.-2016-10-24.server-group-replication-configuration/server-replication-configurations]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-replication-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/associate-public-ip-address clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.missing-required-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.missing-required-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/disassociate-connector-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-app-replication-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-response/app-summary (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-summary))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-response/server-groups (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-groups))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-response/tags (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tags))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-app-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-app-response/app-summary :portkey.aws.sms.-2016-10-24.get-app-response/server-groups :portkey.aws.sms.-2016-10-24.get-app-response/tags]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.generate-change-set-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.generate-change-set-request/changeset-format (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/output-format))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/generate-change-set-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.generate-change-set-request/app-id :portkey.aws.sms.-2016-10-24.generate-change-set-request/changeset-format]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run-stage-details/stage (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-stage))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run-stage-details/stage-progress (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-stage-progress))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-stage-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-run-stage-details/stage :portkey.aws.sms.-2016-10-24.replication-run-stage-details/stage-progress]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/launch-app-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/vm-manager-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/vm-manager-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/capability-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-capability-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/vm-manager-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/connector-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/mac-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/mac-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/associated-on (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/version (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-version))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/ip-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ip-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.connector/vm-manager-id :portkey.aws.sms.-2016-10-24.connector/vm-manager-type :portkey.aws.sms.-2016-10-24.connector/capability-list :portkey.aws.sms.-2016-10-24.connector/vm-manager-name :portkey.aws.sms.-2016-10-24.connector/connector-id :portkey.aws.sms.-2016-10-24.connector/mac-address :portkey.aws.sms.-2016-10-24.connector/associated-on :portkey.aws.sms.-2016-10-24.connector/status :portkey.aws.sms.-2016-10-24.connector/version :portkey.aws.sms.-2016-10-24.connector/ip-address]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-request/name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-request/client-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/client-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-request/server-groups (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-groups))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-app-request/tags (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tags))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/create-app-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.create-app-request/name :portkey.aws.sms.-2016-10-24.create-app-request/description :portkey.aws.sms.-2016-10-24.create-app-request/role-name :portkey.aws.sms.-2016-10-24.create-app-request/client-token :portkey.aws.sms.-2016-10-24.create-app-request/server-groups :portkey.aws.sms.-2016-10-24.create-app-request/tags]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/last-modified-on (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/server-catalog-status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-catalog-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/server-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-servers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-servers-response/last-modified-on :portkey.aws.sms.-2016-10-24.get-servers-response/server-catalog-status :portkey.aws.sms.-2016-10-24.get-servers-response/server-list :portkey.aws.sms.-2016-10-24.get-servers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/security-group (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.internal-error/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/internal-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.internal-error/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/run-once (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/run-once))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/seed-replication-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/encrypted (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/encrypted))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/server-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/number-of-recent-amis-to-keep (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/number-of-recent-amis-to-keep))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/create-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.create-replication-job-request/server-id :portkey.aws.sms.-2016-10-24.create-replication-job-request/seed-replication-time] :opt-un [:portkey.aws.sms.-2016-10-24.create-replication-job-request/kms-key-id :portkey.aws.sms.-2016-10-24.create-replication-job-request/run-once :portkey.aws.sms.-2016-10-24.create-replication-job-request/license-type :portkey.aws.sms.-2016-10-24.create-replication-job-request/encrypted :portkey.aws.sms.-2016-10-24.create-replication-job-request/role-name :portkey.aws.sms.-2016-10-24.create-replication-job-request/description :portkey.aws.sms.-2016-10-24.create-replication-job-request/number-of-recent-amis-to-keep :portkey.aws.sms.-2016-10-24.create-replication-job-request/frequency]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/subnet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/launch-order clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-request/name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-request/server-groups (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-groups))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-request/tags (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tags))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/update-app-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.update-app-request/app-id :portkey.aws.sms.-2016-10-24.update-app-request/name :portkey.aws.sms.-2016-10-24.update-app-request/description :portkey.aws.sms.-2016-10-24.update-app-request/role-name :portkey.aws.sms.-2016-10-24.update-app-request/server-groups :portkey.aws.sms.-2016-10-24.update-app-request/tags]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.generate-change-set-response/s-3-location (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/s-3-location))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/generate-change-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.generate-change-set-response/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.list-apps-response/apps (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/apps))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.list-apps-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/list-apps-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.list-apps-response/apps :portkey.aws.sms.-2016-10-24.list-apps-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-response/replication-run-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-response/replication-run-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/kms-key-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/run-once (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/run-once))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/seed-replication-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/encrypted (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/encrypted))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/server-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/latest-ami-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ami-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/replication-run-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/next-replication-run-start-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/vm-server (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/server-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/state (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-state))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/number-of-recent-amis-to-keep (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/number-of-recent-amis-to-keep))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-job/kms-key-id :portkey.aws.sms.-2016-10-24.replication-job/run-once :portkey.aws.sms.-2016-10-24.replication-job/license-type :portkey.aws.sms.-2016-10-24.replication-job/seed-replication-time :portkey.aws.sms.-2016-10-24.replication-job/encrypted :portkey.aws.sms.-2016-10-24.replication-job/server-type :portkey.aws.sms.-2016-10-24.replication-job/latest-ami-id :portkey.aws.sms.-2016-10-24.replication-job/status-message :portkey.aws.sms.-2016-10-24.replication-job/replication-run-list :portkey.aws.sms.-2016-10-24.replication-job/role-name :portkey.aws.sms.-2016-10-24.replication-job/next-replication-run-start-time :portkey.aws.sms.-2016-10-24.replication-job/vm-server :portkey.aws.sms.-2016-10-24.replication-job/server-id :portkey.aws.sms.-2016-10-24.replication-job/state :portkey.aws.sms.-2016-10-24.replication-job/replication-job-id :portkey.aws.sms.-2016-10-24.replication-job/description :portkey.aws.sms.-2016-10-24.replication-job/number-of-recent-amis-to-keep :portkey.aws.sms.-2016-10-24.replication-job/frequency]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/role-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/start-app-replication-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-replication-configuration-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-app-replication-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-app-replication-configuration-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-manager-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.generate-template-response/s-3-location (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/s-3-location))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/generate-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.generate-template-response/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/force-terminate-app clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/instance-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/mac-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-app-launch-configuration-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-app-launch-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.delete-app-launch-configuration-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-request/vm-server-address-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server-address-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-servers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-servers-request/next-token :portkey.aws.sms.-2016-10-24.get-servers-request/max-results :portkey.aws.sms.-2016-10-24.get-servers-request/vm-server-address-list]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/tags (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/tag))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-type #{"VIRTUAL_MACHINE" :virtual-machine})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-type #{"ON_DEMAND" "AUTOMATIC" :automatic :on-demand})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/logical-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-app-replication-configuration-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-app-replication-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.delete-app-replication-configuration-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.list-apps-request/app-ids (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-ids))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.list-apps-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.list-apps-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/list-apps-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.list-apps-request/app-ids :portkey.aws.sms.-2016-10-24.list-apps-request/next-token :portkey.aws.sms.-2016-10-24.list-apps-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-groups (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server-group))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-response/app-summary (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-summary))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-response/server-groups (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-groups))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-app-response/tags (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tags))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/update-app-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.update-app-response/app-summary :portkey.aws.sms.-2016-10-24.update-app-response/server-groups :portkey.aws.sms.-2016-10-24.update-app-response/tags]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/update-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/import-server-catalog-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.terminate-app-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/terminate-app-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.terminate-app-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/key-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-manager-type #{"HYPERV-MANAGER" :scvmm "VSPHERE" "SCVMM" :vsphere :hypervmanager})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-cannot-be-replicated-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-cannot-be-replicated-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-cannot-be-replicated-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/temporarily-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-app-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-state #{"COMPLETED" "MISSED" :deleted :missed :pending :completed "PENDING" :deleting :active "DELETING" "ACTIVE" "FAILED" "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.launch-details/latest-launch-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.launch-details/stack-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/stack-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.launch-details/stack-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/stack-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/launch-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.launch-details/latest-launch-time :portkey.aws.sms.-2016-10-24.launch-details/stack-name :portkey.aws.sms.-2016-10-24.launch-details/stack-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.launch-app-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/launch-app-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.launch-app-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-stage-progress (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/total-server-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-response/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/create-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.create-replication-job-response/replication-job-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-manager-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group-launch-configuration/server-group-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group-launch-configuration/launch-order (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/launch-order))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group-launch-configuration/server-launch-configurations (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-launch-configurations))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group-launch-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-group-launch-configuration/server-group-id :portkey.aws.sms.-2016-10-24.server-group-launch-configuration/launch-order :portkey.aws.sms.-2016-10-24.server-group-launch-configuration/server-launch-configurations]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.no-connectors-available-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/no-connectors-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.no-connectors-available-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/ami-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-replication-job-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.delete-replication-job-request/replication-job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/apps (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/app-summary))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-terminated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/output-format #{"YAML" :yaml "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-server-address-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/vm-server-address))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-replication-configuration-response/server-group-replication-configurations (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-replication-configurations))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-app-replication-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-app-replication-configuration-response/server-group-replication-configurations]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.unauthorized-operation-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.unauthorized-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-status #{:unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/replication-job-id] :opt-un [:portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-job-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.get-replication-runs-request/replication-job-id] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-runs-request/next-token :portkey.aws.sms.-2016-10-24.get-replication-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.stop-app-replication-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/stop-app-replication-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.stop-app-replication-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/put-app-launch-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-app-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-app-request/force-stop-app-replication (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/force-stop-app-replication))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-app-request/force-terminate-app (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/force-terminate-app))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-app-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.delete-app-request/app-id :portkey.aws.sms.-2016-10-24.delete-app-request/force-stop-app-replication :portkey.aws.sms.-2016-10-24.delete-app-request/force-terminate-app]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group/server-group-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group/name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-group/server-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-group/server-group-id :portkey.aws.sms.-2016-10-24.server-group/name :portkey.aws.sms.-2016-10-24.server-group/server-list]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-ids (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/app-id))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/kms-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/stack-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-app-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-app-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-app-launch-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-connectors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-connectors-request/next-token :portkey.aws.sms.-2016-10-24.get-connectors-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-launch-status #{:launch-in-progress :ready-for-configuration :validation-in-progress :delta-launch-in-progress :terminate-in-progress "CONFIGURATION_IN_PROGRESS" "TERMINATED" "LAUNCH_IN_PROGRESS" "VALIDATION_IN_PROGRESS" :launch-failed :configuration-invalid :launched "CONFIGURATION_INVALID" "LAUNCHED" "TERMINATE_IN_PROGRESS" :delta-launch-failed :configuration-in-progress "LAUNCH_FAILED" "DELTA_LAUNCH_FAILED" :terminated "READY_FOR_LAUNCH" :launch-pending :terminate-failed "READY_FOR_CONFIGURATION" "LAUNCH_PENDING" "TERMINATE_FAILED" "DELTA_LAUNCH_IN_PROGRESS" :ready-for-launch})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-response/replication-job-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-jobs-response/replication-job-list :portkey.aws.sms.-2016-10-24.get-replication-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-configuration/server (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-configuration/server-replication-parameters (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-replication-parameters))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-replication-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-replication-configuration/server :portkey.aws.sms.-2016-10-24.server-replication-configuration/server-replication-parameters]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-job (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-run-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-runs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-job :portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-run-list :portkey.aws.sms.-2016-10-24.get-replication-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/server-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/server-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/vm-server (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/replication-job-terminated (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-terminated))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server/server-id :portkey.aws.sms.-2016-10-24.server/server-type :portkey.aws.sms.-2016-10-24.server/vm-server :portkey.aws.sms.-2016-10-24.server/replication-job-id :portkey.aws.sms.-2016-10-24.server/replication-job-terminated]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-jobs-request/replication-job-id :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/next-token :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/terminate-app-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.s-3-location/bucket (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/bucket-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.s-3-location/key (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/key-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.s-3-location/bucket :portkey.aws.sms.-2016-10-24.s-3-location/key]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-app-replication-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/start-app-replication-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.start-app-replication-request/app-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/total-servers clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-server-catalog-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/frequency clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/replication-job))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/ec-2-key-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-stage (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/seed-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/run-once (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/run-once))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/number-of-recent-amis-to-keep (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/number-of-recent-amis-to-keep))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/encrypted (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/encrypted))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-replication-parameters/kms-key-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-replication-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-replication-parameters/seed-time :portkey.aws.sms.-2016-10-24.server-replication-parameters/frequency :portkey.aws.sms.-2016-10-24.server-replication-parameters/run-once :portkey.aws.sms.-2016-10-24.server-replication-parameters/license-type :portkey.aws.sms.-2016-10-24.server-replication-parameters/number-of-recent-amis-to-keep :portkey.aws.sms.-2016-10-24.server-replication-parameters/encrypted :portkey.aws.sms.-2016-10-24.server-replication-parameters/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-replication-status #{:delta-replication-in-progress :delta-replication-failed "REPLICATION_FAILED" "DELTA_REPLICATION_FAILED" "REPLICATION_STOP_FAILED" :replication-pending :ready-for-configuration "REPLICATION_PENDING" "DELTA_REPLICATION_IN_PROGRESS" :validation-in-progress :replication-stopped :replicated "CONFIGURATION_IN_PROGRESS" :replication-stopping "DELTA_REPLICATED" "VALIDATION_IN_PROGRESS" "READY_FOR_REPLICATION" :replication-failed "REPLICATED" :configuration-invalid :delta-replicated :replication-stop-failed "CONFIGURATION_INVALID" :configuration-in-progress "REPLICATION_STOPPED" :ready-for-replication "REPLICATION_IN_PROGRESS" "REPLICATION_STOPPING" "READY_FOR_CONFIGURATION" :replication-in-progress})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group-replication-configurations (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server-group-replication-configuration))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-group-launch-configurations (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server-group-launch-configuration))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/stack-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-response/connector-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-connectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-connectors-response/connector-list :portkey.aws.sms.-2016-10-24.get-connectors-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.tag/key (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tag-key))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.tag/value (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/tag-value))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.tag/key :portkey.aws.sms.-2016-10-24.tag/value]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-capability #{"HYPERV-MANAGER" :scvmm "VSPHERE" "SCVMM" :vsphere :snapshot-batching :hypervmanager "SNAPSHOT_BATCHING"})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/encrypted (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/encrypted))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/next-replication-run-start-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/number-of-recent-amis-to-keep (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/number-of-recent-amis-to-keep))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/update-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.update-replication-job-request/replication-job-id] :opt-un [:portkey.aws.sms.-2016-10-24.update-replication-job-request/kms-key-id :portkey.aws.sms.-2016-10-24.update-replication-job-request/license-type :portkey.aws.sms.-2016-10-24.update-replication-job-request/encrypted :portkey.aws.sms.-2016-10-24.update-replication-job-request/role-name :portkey.aws.sms.-2016-10-24.update-replication-job-request/next-replication-run-start-time :portkey.aws.sms.-2016-10-24.update-replication-job-request/description :portkey.aws.sms.-2016-10-24.update-replication-job-request/number-of-recent-amis-to-keep :portkey.aws.sms.-2016-10-24.update-replication-job-request/frequency]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-run-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/logical-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/logical-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/associate-public-ip-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/associate-public-ip-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/subnet (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/subnet))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/vpc (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vpc))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/ec-2-key-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ec-2-key-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/server (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/user-data (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/user-data))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/security-group (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/security-group))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-launch-configuration/instance-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/instance-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-launch-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-launch-configuration/logical-id :portkey.aws.sms.-2016-10-24.server-launch-configuration/associate-public-ip-address :portkey.aws.sms.-2016-10-24.server-launch-configuration/subnet :portkey.aws.sms.-2016-10-24.server-launch-configuration/vpc :portkey.aws.sms.-2016-10-24.server-launch-configuration/ec-2-key-name :portkey.aws.sms.-2016-10-24.server-launch-configuration/server :portkey.aws.sms.-2016-10-24.server-launch-configuration/user-data :portkey.aws.sms.-2016-10-24.server-launch-configuration/security-group :portkey.aws.sms.-2016-10-24.server-launch-configuration/instance-type]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/stop-app-replication-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/force-stop-app-replication clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/replication-run))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/import-server-catalog-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-launch-configurations (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server-launch-configuration))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-state #{"COMPLETED" :deleted "FAILING" :pending :completed "PENDING" :deleting :active "DELETING" :failing "ACTIVE" "FAILED" "DELETED" "PAUSED_ON_FAILURE" :paused-on-failure :failed})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server-address/vm-manager-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server-address/vm-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-server-address (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.vm-server-address/vm-manager-id :portkey.aws.sms.-2016-10-24.vm-server-address/vm-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.put-app-launch-configuration-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.put-app-launch-configuration-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.put-app-launch-configuration-request/server-group-launch-configurations (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-launch-configurations))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/put-app-launch-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.put-app-launch-configuration-request/app-id :portkey.aws.sms.-2016-10-24.put-app-launch-configuration-request/role-name :portkey.aws.sms.-2016-10-24.put-app-launch-configuration-request/server-group-launch-configurations]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/license-type #{:aws "AWS" "BYOL" :byol})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-job-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-replication-configurations (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server-replication-configuration))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-server-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-path (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-path))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.vm-server/vm-server-address :portkey.aws.sms.-2016-10-24.vm-server/vm-name :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-name :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-type :portkey.aws.sms.-2016-10-24.vm-server/vm-path]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.user-data/s-3-location (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/s-3-location))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/user-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.user-data/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.generate-template-request/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.generate-template-request/template-format (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/output-format))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/generate-template-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.generate-template-request/app-id :portkey.aws.sms.-2016-10-24.generate-template-request/template-format]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/number-of-recent-amis-to-keep clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-launch-configuration-response/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-launch-configuration-response/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-app-launch-configuration-response/server-group-launch-configurations (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-group-launch-configurations))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-app-launch-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-app-launch-configuration-response/app-id :portkey.aws.sms.-2016-10-24.get-app-launch-configuration-response/role-name :portkey.aws.sms.-2016-10-24.get-app-launch-configuration-response/server-group-launch-configurations]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/client-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/run-once clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vpc (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/launch-status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-launch-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/last-modified (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/total-server-groups (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/total-server-groups))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/replication-status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-replication-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/launch-status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-launch-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/total-servers (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/total-servers))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/latest-replication-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/replication-status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-replication-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/launch-details (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/launch-details))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/app-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.app-summary/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/app-description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/app-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.app-summary/launch-status-message :portkey.aws.sms.-2016-10-24.app-summary/last-modified :portkey.aws.sms.-2016-10-24.app-summary/total-server-groups :portkey.aws.sms.-2016-10-24.app-summary/replication-status :portkey.aws.sms.-2016-10-24.app-summary/launch-status :portkey.aws.sms.-2016-10-24.app-summary/total-servers :portkey.aws.sms.-2016-10-24.app-summary/latest-replication-time :portkey.aws.sms.-2016-10-24.app-summary/replication-status-message :portkey.aws.sms.-2016-10-24.app-summary/name :portkey.aws.sms.-2016-10-24.app-summary/status :portkey.aws.sms.-2016-10-24.app-summary/launch-details :portkey.aws.sms.-2016-10-24.app-summary/status-message :portkey.aws.sms.-2016-10-24.app-summary/role-name :portkey.aws.sms.-2016-10-24.app-summary/app-id :portkey.aws.sms.-2016-10-24.app-summary/creation-time :portkey.aws.sms.-2016-10-24.app-summary/description]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-catalog-status #{:deleted "EXPIRED" :not-imported "AVAILABLE" "NOT_IMPORTED" :expired :available "DELETED" :importing "IMPORTING"})

(clojure.core/defn get-app-launch-configuration "Retrieves the application launch configuration associated with an application." ([] (get-app-launch-configuration {})) ([get-app-launch-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-app-launch-configuration-request get-app-launch-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-app-launch-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-app-launch-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAppLaunchConfiguration", :http.request.configuration/output-deser-fn response-get-app-launch-configuration-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-app-launch-configuration :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-app-launch-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-app-launch-configuration-response))

(clojure.core/defn get-connectors "Describes the connectors registered with the AWS SMS." ([] (get-connectors {})) ([get-connectors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-connectors-request get-connectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-connectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-connectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConnectors", :http.request.configuration/output-deser-fn response-get-connectors-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-connectors :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-connectors-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-connectors-response))

(clojure.core/defn terminate-app "Terminates the stack for an application." ([] (terminate-app {})) ([terminate-app-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-terminate-app-request terminate-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/terminate-app-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/terminate-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TerminateApp", :http.request.configuration/output-deser-fn response-terminate-app-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef terminate-app :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/terminate-app-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/terminate-app-response))

(clojure.core/defn import-server-catalog "Gathers a complete list of on-premises servers. Connectors must be installed and\nmonitoring all servers that you want to import.\n This call returns immediately, but might take additional time to retrieve all\nthe servers." ([] (import-server-catalog {})) ([import-server-catalog-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-import-server-catalog-request import-server-catalog-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/import-server-catalog-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/import-server-catalog-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportServerCatalog", :http.request.configuration/output-deser-fn response-import-server-catalog-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "NoConnectorsAvailableException" :portkey.aws.sms.-2016-10-24/no-connectors-available-exception}})))))
(clojure.spec.alpha/fdef import-server-catalog :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/import-server-catalog-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/import-server-catalog-response))

(clojure.core/defn list-apps "Returns a list of summaries for all applications." ([] (list-apps {})) ([list-apps-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-apps-request list-apps-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/list-apps-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/list-apps-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApps", :http.request.configuration/output-deser-fn response-list-apps-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef list-apps :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/list-apps-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/list-apps-response))

(clojure.core/defn start-on-demand-replication-run "Starts an on-demand replication run for the specified replication job. This\nreplication run starts immediately. This replication run is in addition to the\nones already scheduled.\n There is a limit on the number of on-demand replications runs you can request\nin a 24-hour period." ([start-on-demand-replication-run-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-on-demand-replication-run-request start-on-demand-replication-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartOnDemandReplicationRun", :http.request.configuration/output-deser-fn response-start-on-demand-replication-run-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "ReplicationRunLimitExceededException" :portkey.aws.sms.-2016-10-24/replication-run-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-on-demand-replication-run :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-response))

(clojure.core/defn generate-change-set "Generates a target change set for a currently launched stack and writes it to an\nAmazon S3 object in the customer’s Amazon S3 bucket." ([] (generate-change-set {})) ([generate-change-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-generate-change-set-request generate-change-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/generate-change-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/generate-change-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GenerateChangeSet", :http.request.configuration/output-deser-fn response-generate-change-set-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef generate-change-set :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/generate-change-set-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/generate-change-set-response))

(clojure.core/defn get-replication-runs "Describes the replication runs for the specified replication job." ([get-replication-runs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-replication-runs-request get-replication-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-replication-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-replication-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReplicationRuns", :http.request.configuration/output-deser-fn response-get-replication-runs-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-replication-runs :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/get-replication-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-replication-runs-response))

(clojure.core/defn delete-replication-job "Deletes the specified replication job.\n After you delete a replication job, there are no further replication runs. AWS\ndeletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts.\nThe AMIs created by the replication runs are not deleted." ([delete-replication-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-replication-job-request delete-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteReplicationJob", :http.request.configuration/output-deser-fn response-delete-replication-job-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "ReplicationJobNotFoundException" :portkey.aws.sms.-2016-10-24/replication-job-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/delete-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-replication-job-response))

(clojure.core/defn delete-app-launch-configuration "Deletes existing launch configuration for an application." ([] (delete-app-launch-configuration {})) ([delete-app-launch-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-app-launch-configuration-request delete-app-launch-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-app-launch-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-app-launch-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAppLaunchConfiguration", :http.request.configuration/output-deser-fn response-delete-app-launch-configuration-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef delete-app-launch-configuration :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/delete-app-launch-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-app-launch-configuration-response))

(clojure.core/defn put-app-launch-configuration "Creates a launch configuration for an application." ([] (put-app-launch-configuration {})) ([put-app-launch-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-app-launch-configuration-request put-app-launch-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/put-app-launch-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/put-app-launch-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAppLaunchConfiguration", :http.request.configuration/output-deser-fn response-put-app-launch-configuration-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef put-app-launch-configuration :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/put-app-launch-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/put-app-launch-configuration-response))

(clojure.core/defn get-replication-jobs "Describes the specified replication job or all of your replication jobs." ([] (get-replication-jobs {})) ([get-replication-jobs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-replication-jobs-request get-replication-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-replication-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-replication-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReplicationJobs", :http.request.configuration/output-deser-fn response-get-replication-jobs-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-replication-jobs :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-replication-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-replication-jobs-response))

(clojure.core/defn generate-template "Generates an Amazon CloudFormation template based on the current launch\nconfiguration and writes it to an Amazon S3 object in the customer’s Amazon S3\nbucket." ([] (generate-template {})) ([generate-template-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-generate-template-request generate-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/generate-template-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/generate-template-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GenerateTemplate", :http.request.configuration/output-deser-fn response-generate-template-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef generate-template :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/generate-template-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/generate-template-response))

(clojure.core/defn update-app "Updates an application." ([] (update-app {})) ([update-app-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-app-request update-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/update-app-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/update-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApp", :http.request.configuration/output-deser-fn response-update-app-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef update-app :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/update-app-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/update-app-response))

(clojure.core/defn delete-app "Deletes an existing application. Optionally deletes the launched stack\nassociated with the application and all AWS SMS replication jobs for servers in\nthe application." ([] (delete-app {})) ([delete-app-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-app-request delete-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-app-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApp", :http.request.configuration/output-deser-fn response-delete-app-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef delete-app :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/delete-app-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-app-response))

(clojure.core/defn create-app "Creates an application. An application consists of one or more server groups.\nEach server group contain one or more servers." ([] (create-app {})) ([create-app-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-app-request create-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/create-app-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/create-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApp", :http.request.configuration/output-deser-fn response-create-app-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef create-app :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/create-app-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/create-app-response))

(clojure.core/defn get-app-replication-configuration "Retrieves an application replication configuration associatd with an\napplication." ([] (get-app-replication-configuration {})) ([get-app-replication-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-app-replication-configuration-request get-app-replication-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-app-replication-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-app-replication-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAppReplicationConfiguration", :http.request.configuration/output-deser-fn response-get-app-replication-configuration-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-app-replication-configuration :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-app-replication-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-app-replication-configuration-response))

(clojure.core/defn stop-app-replication "Stops replicating an application." ([] (stop-app-replication {})) ([stop-app-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-app-replication-request stop-app-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/stop-app-replication-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/stop-app-replication-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopAppReplication", :http.request.configuration/output-deser-fn response-stop-app-replication-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef stop-app-replication :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/stop-app-replication-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/stop-app-replication-response))

(clojure.core/defn disassociate-connector "Disassociates the specified connector from AWS SMS.\n After you disassociate a connector, it is no longer available to support\nreplication jobs." ([disassociate-connector-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-connector-request disassociate-connector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/disassociate-connector-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/disassociate-connector-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateConnector", :http.request.configuration/output-deser-fn response-disassociate-connector-response, :http.request.spec/error-spec {"MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef disassociate-connector :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/disassociate-connector-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/disassociate-connector-response))

(clojure.core/defn delete-server-catalog "Deletes all servers from your server catalog." ([] (delete-server-catalog {})) ([delete-server-catalog-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-server-catalog-request delete-server-catalog-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-server-catalog-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-server-catalog-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServerCatalog", :http.request.configuration/output-deser-fn response-delete-server-catalog-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-server-catalog :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/delete-server-catalog-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-server-catalog-response))

(clojure.core/defn get-app "Retrieve information about an application." ([] (get-app {})) ([get-app-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-app-request get-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-app-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetApp", :http.request.configuration/output-deser-fn response-get-app-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef get-app :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-app-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-app-response))

(clojure.core/defn start-app-replication "Starts replicating an application." ([] (start-app-replication {})) ([start-app-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-app-replication-request start-app-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/start-app-replication-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/start-app-replication-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartAppReplication", :http.request.configuration/output-deser-fn response-start-app-replication-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef start-app-replication :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/start-app-replication-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/start-app-replication-response))

(clojure.core/defn launch-app "Launches an application stack." ([] (launch-app {})) ([launch-app-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-launch-app-request launch-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/launch-app-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/launch-app-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LaunchApp", :http.request.configuration/output-deser-fn response-launch-app-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef launch-app :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/launch-app-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/launch-app-response))

(clojure.core/defn delete-app-replication-configuration "Deletes existing replication configuration for an application." ([] (delete-app-replication-configuration {})) ([delete-app-replication-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-app-replication-configuration-request delete-app-replication-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-app-replication-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-app-replication-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAppReplicationConfiguration", :http.request.configuration/output-deser-fn response-delete-app-replication-configuration-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef delete-app-replication-configuration :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/delete-app-replication-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-app-replication-configuration-response))

(clojure.core/defn create-replication-job "Creates a replication job. The replication job schedules periodic replication\nruns to replicate your server to AWS. Each replication run creates an Amazon\nMachine Image (AMI)." ([create-replication-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-replication-job-request create-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/create-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/create-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateReplicationJob", :http.request.configuration/output-deser-fn response-create-replication-job-response, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "ServerCannotBeReplicatedException" :portkey.aws.sms.-2016-10-24/server-cannot-be-replicated-exception, "TemporarilyUnavailableException" :portkey.aws.sms.-2016-10-24/temporarily-unavailable-exception, "NoConnectorsAvailableException" :portkey.aws.sms.-2016-10-24/no-connectors-available-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "ReplicationJobAlreadyExistsException" :portkey.aws.sms.-2016-10-24/replication-job-already-exists-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/create-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/create-replication-job-response))

(clojure.core/defn put-app-replication-configuration "Creates or updates a replication configuration for an application." ([] (put-app-replication-configuration {})) ([put-app-replication-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-app-replication-configuration-request put-app-replication-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/put-app-replication-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/put-app-replication-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAppReplicationConfiguration", :http.request.configuration/output-deser-fn response-put-app-replication-configuration-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef put-app-replication-configuration :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/put-app-replication-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/put-app-replication-configuration-response))

(clojure.core/defn get-servers "Describes the servers in your server catalog.\n Before you can describe your servers, you must import them using\nImportServerCatalog." ([] (get-servers {})) ([get-servers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-servers-request get-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetServers", :http.request.configuration/output-deser-fn response-get-servers-response, :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-servers :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-servers-response))

(clojure.core/defn update-replication-job "Updates the specified settings for the specified replication job." ([update-replication-job-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-replication-job-request update-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/update-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id "SMS", :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/update-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateReplicationJob", :http.request.configuration/output-deser-fn response-update-replication-job-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "ServerCannotBeReplicatedException" :portkey.aws.sms.-2016-10-24/server-cannot-be-replicated-exception, "ReplicationJobNotFoundException" :portkey.aws.sms.-2016-10-24/replication-job-not-found-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error, "TemporarilyUnavailableException" :portkey.aws.sms.-2016-10-24/temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef update-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/update-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/update-replication-job-response))
