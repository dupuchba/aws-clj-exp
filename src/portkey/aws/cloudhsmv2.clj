(ns portkey.aws.cloudhsmv2 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "cloudhsm", :region "us-gov-east-1"},
    :ssl-common-name "cloudhsmv2.us-gov-east-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-northeast-1"},
    :ssl-common-name "cloudhsmv2.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudhsm", :region "eu-west-1"},
    :ssl-common-name "cloudhsmv2.eu-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudhsm", :region "us-east-2"},
    :ssl-common-name "cloudhsmv2.us-east-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-2"},
    :ssl-common-name "cloudhsmv2.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-1"},
    :ssl-common-name "cloudhsmv2.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "cloudhsm", :region "ap-northeast-2"},
    :ssl-common-name "cloudhsmv2.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudhsm", :region "eu-west-3"},
    :ssl-common-name "cloudhsmv2.eu-west-3.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudhsm", :region "ca-central-1"},
    :ssl-common-name "cloudhsmv2.ca-central-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudhsm", :region "eu-central-1"},
    :ssl-common-name "cloudhsmv2.eu-central-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudhsm", :region "eu-west-2"},
    :ssl-common-name "cloudhsmv2.eu-west-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-gov-west-1"},
    :ssl-common-name "cloudhsmv2.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudhsm", :region "us-west-2"},
    :ssl-common-name "cloudhsmv2.us-west-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudhsm", :region "us-east-1"},
    :ssl-common-name "cloudhsmv2.us-east-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-west-1"},
    :ssl-common-name "cloudhsmv2.us-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudhsm", :region "ap-south-1"},
    :ssl-common-name "cloudhsmv2.ap-south-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "cloudhsm", :region "eu-north-1"},
    :ssl-common-name "cloudhsmv2.eu-north-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-backup-id)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-cluster-id)

(clojure.core/declare ser-hsm-id)

(clojure.core/declare ser-strings)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-cert)

(clojure.core/declare ser-external-az)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-string)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-field)

(clojure.core/declare ser-hsm-type)

(clojure.core/declare ser-eni-id)

(clojure.core/declare ser-max-size)

(clojure.core/declare ser-region)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-backup-id [input] #:http.request.field{:value input, :shape "BackupId"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-cluster-id [input] #:http.request.field{:value input, :shape "ClusterId"})

(clojure.core/defn- ser-hsm-id [input] #:http.request.field{:value input, :shape "HsmId"})

(clojure.core/defn- ser-strings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "Strings", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-cert [input] #:http.request.field{:value input, :shape "Cert"})

(clojure.core/defn- ser-external-az [input] #:http.request.field{:value input, :shape "ExternalAz"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-field k) #:http.request.field{:map-info "key", :shape "Field"}) (clojure.core/into (ser-strings v) #:http.request.field{:map-info "value", :shape "Strings"})])) input), :shape "Filters", :type "map"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IpAddress"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-field [input] #:http.request.field{:value input, :shape "Field"})

(clojure.core/defn- ser-hsm-type [input] #:http.request.field{:value input, :shape "HsmType"})

(clojure.core/defn- ser-eni-id [input] #:http.request.field{:value input, :shape "EniId"})

(clojure.core/defn- ser-max-size [input] #:http.request.field{:value input, :shape "MaxSize"})

(clojure.core/defn- ser-region [input] #:http.request.field{:value input, :shape "Region"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]}))

(clojure.core/defn- req-describe-backups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxSize"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :sort-ascending) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-ascending)) #:http.request.field{:name "SortAscending", :shape "Boolean"}))))

(clojure.core/defn- req-delete-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-describe-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxSize"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ClusterId"}) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "TagList", :shape "TagList"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"}) (clojure.core/into (ser-hsm-type (input :hsm-type)) #:http.request.field{:name "HsmType", :shape "HsmType"})]} (clojure.core/contains? input :source-backup-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-id (input :source-backup-id)) #:http.request.field{:name "SourceBackupId", :shape "BackupId"}))))

(clojure.core/defn- req-restore-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-create-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-external-az (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "ExternalAz"})]} (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IpAddress", :shape "IpAddress"}))))

(clojure.core/defn- req-copy-backup-to-region-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-region (input :destination-region)) #:http.request.field{:name "DestinationRegion", :shape "Region"}) (clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ClusterId"}) (clojure.core/into (ser-tag-key-list (input :tag-key-list)) #:http.request.field{:name "TagKeyList", :shape "TagKeyList"})]}))

(clojure.core/defn- req-delete-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :hsm-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hsm-id (input :hsm-id)) #:http.request.field{:name "HsmId", :shape "HsmId"})) (clojure.core/contains? input :eni-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eni-id (input :eni-id)) #:http.request.field{:name "EniId", :shape "EniId"})) (clojure.core/contains? input :eni-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :eni-ip)) #:http.request.field{:name "EniIp", :shape "IpAddress"}))))

(clojure.core/defn- req-initialize-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-cert (input :signed-cert)) #:http.request.field{:name "SignedCert", :shape "Cert"}) (clojure.core/into (ser-cert (input :trust-anchor)) #:http.request.field{:name "TrustAnchor", :shape "Cert"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ClusterId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxSize"}))))

(clojure.core/declare deser-backup-policy)

(clojure.core/declare deser-hsm)

(clojure.core/declare deser-hsms)

(clojure.core/declare deser-security-group)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-certificates)

(clojure.core/declare deser-state-message)

(clojure.core/declare deser-backup-id)

(clojure.core/declare deser-pre-co-password)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-cluster-id)

(clojure.core/declare deser-hsm-id)

(clojure.core/declare deser-backup-state)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-external-subnet-mapping)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-cluster-state)

(clojure.core/declare deser-cert)

(clojure.core/declare deser-cluster)

(clojure.core/declare deser-external-az)

(clojure.core/declare deser-hsm-state)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-backup)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-destination-backup)

(clojure.core/declare deser-string)

(clojure.core/declare deser-clusters)

(clojure.core/declare deser-backups)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-hsm-type)

(clojure.core/declare deser-eni-id)

(clojure.core/declare deser-region)

(clojure.core/defn- deser-backup-policy [input] (clojure.core/get {"DEFAULT" :default} input))

(clojure.core/defn- deser-hsm [input] (clojure.core/cond-> {:hsm-id (deser-hsm-id (input "HsmId"))} (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-external-az (input "AvailabilityZone"))) (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-cluster-id (input "ClusterId"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (input "SubnetId"))) (clojure.core/contains? input "EniId") (clojure.core/assoc :eni-id (deser-eni-id (input "EniId"))) (clojure.core/contains? input "EniIp") (clojure.core/assoc :eni-ip (deser-ip-address (input "EniIp"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-hsm-state (input "State"))) (clojure.core/contains? input "StateMessage") (clojure.core/assoc :state-message (deser-string (input "StateMessage")))))

(clojure.core/defn- deser-hsms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hsm coll))) input))

(clojure.core/defn- deser-security-group [input] input)

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-certificates [input] (clojure.core/cond-> {} (clojure.core/contains? input "ClusterCsr") (clojure.core/assoc :cluster-csr (deser-cert (input "ClusterCsr"))) (clojure.core/contains? input "HsmCertificate") (clojure.core/assoc :hsm-certificate (deser-cert (input "HsmCertificate"))) (clojure.core/contains? input "AwsHardwareCertificate") (clojure.core/assoc :aws-hardware-certificate (deser-cert (input "AwsHardwareCertificate"))) (clojure.core/contains? input "ManufacturerHardwareCertificate") (clojure.core/assoc :manufacturer-hardware-certificate (deser-cert (input "ManufacturerHardwareCertificate"))) (clojure.core/contains? input "ClusterCertificate") (clojure.core/assoc :cluster-certificate (deser-cert (input "ClusterCertificate")))))

(clojure.core/defn- deser-state-message [input] input)

(clojure.core/defn- deser-backup-id [input] input)

(clojure.core/defn- deser-pre-co-password [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-cluster-id [input] input)

(clojure.core/defn- deser-hsm-id [input] input)

(clojure.core/defn- deser-backup-state [input] (clojure.core/get {"CREATE_IN_PROGRESS" :create-in-progress, "READY" :ready, "DELETED" :deleted, "PENDING_DELETION" :pending-deletion} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-external-subnet-mapping [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-external-az k) (deser-subnet-id v)])) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-cluster-state [input] (clojure.core/get {"INITIALIZE_IN_PROGRESS" :initialize-in-progress, "DELETE_IN_PROGRESS" :delete-in-progress, "UPDATE_IN_PROGRESS" :update-in-progress, "CREATE_IN_PROGRESS" :create-in-progress, "UNINITIALIZED" :uninitialized, "INITIALIZED" :initialized, "ACTIVE" :active, "DELETED" :deleted, "DEGRADED" :degraded} input))

(clojure.core/defn- deser-cert [input] input)

(clojure.core/defn- deser-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreateTimestamp") (clojure.core/assoc :create-timestamp (deser-timestamp (input "CreateTimestamp"))) (clojure.core/contains? input "BackupPolicy") (clojure.core/assoc :backup-policy (deser-backup-policy (input "BackupPolicy"))) (clojure.core/contains? input "Hsms") (clojure.core/assoc :hsms (deser-hsms (input "Hsms"))) (clojure.core/contains? input "SecurityGroup") (clojure.core/assoc :security-group (deser-security-group (input "SecurityGroup"))) (clojure.core/contains? input "Certificates") (clojure.core/assoc :certificates (deser-certificates (input "Certificates"))) (clojure.core/contains? input "StateMessage") (clojure.core/assoc :state-message (deser-state-message (input "StateMessage"))) (clojure.core/contains? input "PreCoPassword") (clojure.core/assoc :pre-co-password (deser-pre-co-password (input "PreCoPassword"))) (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-cluster-id (input "ClusterId"))) (clojure.core/contains? input "SubnetMapping") (clojure.core/assoc :subnet-mapping (deser-external-subnet-mapping (input "SubnetMapping"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (input "VpcId"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-cluster-state (input "State"))) (clojure.core/contains? input "HsmType") (clojure.core/assoc :hsm-type (deser-hsm-type (input "HsmType"))) (clojure.core/contains? input "SourceBackupId") (clojure.core/assoc :source-backup-id (deser-backup-id (input "SourceBackupId")))))

(clojure.core/defn- deser-external-az [input] input)

(clojure.core/defn- deser-hsm-state [input] (clojure.core/get {"CREATE_IN_PROGRESS" :create-in-progress, "ACTIVE" :active, "DEGRADED" :degraded, "DELETE_IN_PROGRESS" :delete-in-progress, "DELETED" :deleted} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-backup [input] (clojure.core/cond-> {:backup-id (deser-backup-id (input "BackupId"))} (clojure.core/contains? input "CreateTimestamp") (clojure.core/assoc :create-timestamp (deser-timestamp (input "CreateTimestamp"))) (clojure.core/contains? input "CopyTimestamp") (clojure.core/assoc :copy-timestamp (deser-timestamp (input "CopyTimestamp"))) (clojure.core/contains? input "SourceRegion") (clojure.core/assoc :source-region (deser-region (input "SourceRegion"))) (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-cluster-id (input "ClusterId"))) (clojure.core/contains? input "DeleteTimestamp") (clojure.core/assoc :delete-timestamp (deser-timestamp (input "DeleteTimestamp"))) (clojure.core/contains? input "BackupState") (clojure.core/assoc :backup-state (deser-backup-state (input "BackupState"))) (clojure.core/contains? input "SourceBackup") (clojure.core/assoc :source-backup (deser-backup-id (input "SourceBackup"))) (clojure.core/contains? input "SourceCluster") (clojure.core/assoc :source-cluster (deser-cluster-id (input "SourceCluster")))))

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-destination-backup [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreateTimestamp") (clojure.core/assoc :create-timestamp (deser-timestamp (input "CreateTimestamp"))) (clojure.core/contains? input "SourceRegion") (clojure.core/assoc :source-region (deser-region (input "SourceRegion"))) (clojure.core/contains? input "SourceBackup") (clojure.core/assoc :source-backup (deser-backup-id (input "SourceBackup"))) (clojure.core/contains? input "SourceCluster") (clojure.core/assoc :source-cluster (deser-cluster-id (input "SourceCluster")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-clusters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cluster coll))) input))

(clojure.core/defn- deser-backups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-backup coll))) input))

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-hsm-type [input] input)

(clojure.core/defn- deser-eni-id [input] input)

(clojure.core/defn- deser-region [input] input)

(clojure.core/defn- response-cloud-hsm-internal-failure-exception ([input] (response-cloud-hsm-internal-failure-exception nil input)) ([resultWrapper356372 input] (clojure.core/let [rawinput356371 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356373 {"Message" (rawinput356371 "Message")}] (clojure.core/cond-> {} (letvar356373 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar356373 ["Message"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper356375 input] (clojure.core/let [rawinput356374 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356376 {"TagList" (rawinput356374 "TagList"), "NextToken" (rawinput356374 "NextToken")}] (clojure.core/cond-> {:tag-list (deser-tag-list (clojure.core/get-in letvar356376 ["TagList"]))} (letvar356376 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar356376 ["NextToken"])))))))

(clojure.core/defn- response-describe-clusters-response ([input] (response-describe-clusters-response nil input)) ([resultWrapper356378 input] (clojure.core/let [rawinput356377 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356379 {"Clusters" (rawinput356377 "Clusters"), "NextToken" (rawinput356377 "NextToken")}] (clojure.core/cond-> {} (letvar356379 "Clusters") (clojure.core/assoc :clusters (deser-clusters (clojure.core/get-in letvar356379 ["Clusters"]))) (letvar356379 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar356379 ["NextToken"])))))))

(clojure.core/defn- response-cloud-hsm-invalid-request-exception ([input] (response-cloud-hsm-invalid-request-exception nil input)) ([resultWrapper356381 input] (clojure.core/let [rawinput356380 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356382 {"Message" (rawinput356380 "Message")}] (clojure.core/cond-> {} (letvar356382 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar356382 ["Message"])))))))

(clojure.core/defn- response-delete-cluster-response ([input] (response-delete-cluster-response nil input)) ([resultWrapper356384 input] (clojure.core/let [rawinput356383 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356385 {"Cluster" (rawinput356383 "Cluster")}] (clojure.core/cond-> {} (letvar356385 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar356385 ["Cluster"])))))))

(clojure.core/defn- response-delete-backup-response ([input] (response-delete-backup-response nil input)) ([resultWrapper356387 input] (clojure.core/let [rawinput356386 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356388 {"Backup" (rawinput356386 "Backup")}] (clojure.core/cond-> {} (letvar356388 "Backup") (clojure.core/assoc :backup (deser-backup (clojure.core/get-in letvar356388 ["Backup"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper356390 input] (clojure.core/let [rawinput356389 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356391 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-cluster-response ([input] (response-create-cluster-response nil input)) ([resultWrapper356393 input] (clojure.core/let [rawinput356392 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356394 {"Cluster" (rawinput356392 "Cluster")}] (clojure.core/cond-> {} (letvar356394 "Cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar356394 ["Cluster"])))))))

(clojure.core/defn- response-restore-backup-response ([input] (response-restore-backup-response nil input)) ([resultWrapper356396 input] (clojure.core/let [rawinput356395 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356397 {"Backup" (rawinput356395 "Backup")}] (clojure.core/cond-> {} (letvar356397 "Backup") (clojure.core/assoc :backup (deser-backup (clojure.core/get-in letvar356397 ["Backup"])))))))

(clojure.core/defn- response-initialize-cluster-response ([input] (response-initialize-cluster-response nil input)) ([resultWrapper356399 input] (clojure.core/let [rawinput356398 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356400 {"State" (rawinput356398 "State"), "StateMessage" (rawinput356398 "StateMessage")}] (clojure.core/cond-> {} (letvar356400 "State") (clojure.core/assoc :state (deser-cluster-state (clojure.core/get-in letvar356400 ["State"]))) (letvar356400 "StateMessage") (clojure.core/assoc :state-message (deser-state-message (clojure.core/get-in letvar356400 ["StateMessage"])))))))

(clojure.core/defn- response-cloud-hsm-service-exception ([input] (response-cloud-hsm-service-exception nil input)) ([resultWrapper356402 input] (clojure.core/let [rawinput356401 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356403 {"Message" (rawinput356401 "Message")}] (clojure.core/cond-> {} (letvar356403 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar356403 ["Message"])))))))

(clojure.core/defn- response-cloud-hsm-resource-not-found-exception ([input] (response-cloud-hsm-resource-not-found-exception nil input)) ([resultWrapper356405 input] (clojure.core/let [rawinput356404 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356406 {"Message" (rawinput356404 "Message")}] (clojure.core/cond-> {} (letvar356406 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar356406 ["Message"])))))))

(clojure.core/defn- response-create-hsm-response ([input] (response-create-hsm-response nil input)) ([resultWrapper356408 input] (clojure.core/let [rawinput356407 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356409 {"Hsm" (rawinput356407 "Hsm")}] (clojure.core/cond-> {} (letvar356409 "Hsm") (clojure.core/assoc :hsm (deser-hsm (clojure.core/get-in letvar356409 ["Hsm"])))))))

(clojure.core/defn- response-cloud-hsm-access-denied-exception ([input] (response-cloud-hsm-access-denied-exception nil input)) ([resultWrapper356411 input] (clojure.core/let [rawinput356410 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356412 {"Message" (rawinput356410 "Message")}] (clojure.core/cond-> {} (letvar356412 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar356412 ["Message"])))))))

(clojure.core/defn- response-delete-hsm-response ([input] (response-delete-hsm-response nil input)) ([resultWrapper356414 input] (clojure.core/let [rawinput356413 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356415 {"HsmId" (rawinput356413 "HsmId")}] (clojure.core/cond-> {} (letvar356415 "HsmId") (clojure.core/assoc :hsm-id (deser-hsm-id (clojure.core/get-in letvar356415 ["HsmId"])))))))

(clojure.core/defn- response-describe-backups-response ([input] (response-describe-backups-response nil input)) ([resultWrapper356417 input] (clojure.core/let [rawinput356416 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356418 {"Backups" (rawinput356416 "Backups"), "NextToken" (rawinput356416 "NextToken")}] (clojure.core/cond-> {} (letvar356418 "Backups") (clojure.core/assoc :backups (deser-backups (clojure.core/get-in letvar356418 ["Backups"]))) (letvar356418 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar356418 ["NextToken"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper356420 input] (clojure.core/let [rawinput356419 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356421 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-copy-backup-to-region-response ([input] (response-copy-backup-to-region-response nil input)) ([resultWrapper356423 input] (clojure.core/let [rawinput356422 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar356424 {"DestinationBackup" (rawinput356422 "DestinationBackup")}] (clojure.core/cond-> {} (letvar356424 "DestinationBackup") (clojure.core/assoc :destination-backup (deser-destination-backup (clojure.core/get-in letvar356424 ["DestinationBackup"])))))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/backup-policy #{:default "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.hsm/availability-zone (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/external-az))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.hsm/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.hsm/state (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/hsm-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.hsm/state-message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/hsm (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/hsm-id] :opt-un [:portkey.aws.cloudhsmv2.hsm/availability-zone :portkey.aws.cloudhsmv2/cluster-id :portkey.aws.cloudhsmv2/subnet-id :portkey.aws.cloudhsmv2/eni-id :portkey.aws.cloudhsmv2.hsm/eni-ip :portkey.aws.cloudhsmv2.hsm/state :portkey.aws.cloudhsmv2.hsm/state-message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/subnet-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cloud-hsm-internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.cloud-hsm-internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/cluster-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/hsms (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/hsm))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/security-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"sg-[0-9a-fA-F]" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"subnet-[0-9a-fA-F]{8,17}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.certificates/cluster-csr (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.certificates/hsm-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.certificates/aws-hardware-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.certificates/manufacturer-hardware-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.certificates/cluster-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.certificates/cluster-csr :portkey.aws.cloudhsmv2.certificates/hsm-certificate :portkey.aws.cloudhsmv2.certificates/aws-hardware-certificate :portkey.aws.cloudhsmv2.certificates/manufacturer-hardware-certificate :portkey.aws.cloudhsmv2.certificates/cluster-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/state-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 300)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/backup-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"backup-[2-7a-zA-Z]{11,16}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/list-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/tag-list] :opt-un [:portkey.aws.cloudhsmv2/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/pre-co-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 7 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/describe-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/clusters :portkey.aws.cloudhsmv2/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cloud-hsm-invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.cloud-hsm-invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cluster-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"cluster-[2-7a-zA-Z]{11,16}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.describe-backups-request/max-results (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/max-size))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.describe-backups-request/sort-ascending (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/describe-backups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/next-token :portkey.aws.cloudhsmv2.describe-backups-request/max-results :portkey.aws.cloudhsmv2/filters :portkey.aws.cloudhsmv2.describe-backups-request/sort-ascending]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/hsm-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"hsm-[2-7a-zA-Z]{11,16}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/delete-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/backup]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/backup-state #{:deleted :ready :pending-deletion "READY" "CREATE_IN_PROGRESS" :create-in-progress "PENDING_DELETION" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/strings (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/string))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/delete-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.describe-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/max-size))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/describe-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/filters :portkey.aws.cloudhsmv2/next-token :portkey.aws.cloudhsmv2.describe-clusters-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/external-subnet-mapping (clojure.spec.alpha/map-of :portkey.aws.cloudhsmv2/external-az :portkey.aws.cloudhsmv2/subnet-id))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.tag-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.tag-resource-request/resource-id :portkey.aws.cloudhsmv2/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cluster-state #{:deleted "INITIALIZE_IN_PROGRESS" :initialized "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "CREATE_IN_PROGRESS" "UNINITIALIZED" :delete-in-progress :initialize-in-progress :create-in-progress "INITIALIZED" :active :degraded "ACTIVE" :update-in-progress "DELETED" "DEGRADED" :uninitialized})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/restore-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/backup]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.initialize-cluster-response/state (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/initialize-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.initialize-cluster-response/state :portkey.aws.cloudhsmv2/state-message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cert (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 5000)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9+-/=\s]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cloud-hsm-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cloud-hsm-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.cloud-hsm-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cluster/create-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cluster/subnet-mapping (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/external-subnet-mapping))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cluster/state (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cluster/source-backup-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.cluster/create-timestamp :portkey.aws.cloudhsmv2/backup-policy :portkey.aws.cloudhsmv2/hsms :portkey.aws.cloudhsmv2/security-group :portkey.aws.cloudhsmv2/certificates :portkey.aws.cloudhsmv2/state-message :portkey.aws.cloudhsmv2/pre-co-password :portkey.aws.cloudhsmv2/cluster-id :portkey.aws.cloudhsmv2.cluster/subnet-mapping :portkey.aws.cloudhsmv2/vpc-id :portkey.aws.cloudhsmv2.cluster/state :portkey.aws.cloudhsmv2/hsm-type :portkey.aws.cloudhsmv2.cluster/source-backup-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/external-az (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-z]{2}(-(gov))?-(east|west|north|south|central){1,2}-\d[a-z]" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/hsm-state #{:deleted "DELETE_IN_PROGRESS" "CREATE_IN_PROGRESS" :delete-in-progress :create-in-progress :active :degraded "ACTIVE" "DELETED" "DEGRADED"})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.backup/create-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.backup/copy-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.backup/source-region (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/region))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.backup/delete-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.backup/source-backup (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.backup/source-cluster (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/backup (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/backup-id] :opt-un [:portkey.aws.cloudhsmv2.backup/create-timestamp :portkey.aws.cloudhsmv2.backup/copy-timestamp :portkey.aws.cloudhsmv2.backup/source-region :portkey.aws.cloudhsmv2/cluster-id :portkey.aws.cloudhsmv2.backup/delete-timestamp :portkey.aws.cloudhsmv2/backup-state :portkey.aws.cloudhsmv2.backup/source-backup :portkey.aws.cloudhsmv2.backup/source-cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"vpc-[0-9a-fA-F]" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cloud-hsm-resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.cloud-hsm-resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.destination-backup/create-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.destination-backup/source-region (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/region))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.destination-backup/source-backup (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.destination-backup/source-cluster (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/destination-backup (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.destination-backup/create-timestamp :portkey.aws.cloudhsmv2.destination-backup/source-region :portkey.aws.cloudhsmv2.destination-backup/source-backup :portkey.aws.cloudhsmv2.destination-backup/source-cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/clusters (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/cluster))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.create-cluster-request/source-backup-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/subnet-ids :portkey.aws.cloudhsmv2/hsm-type] :opt-un [:portkey.aws.cloudhsmv2.create-cluster-request/source-backup-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/filters (clojure.spec.alpha/map-of :portkey.aws.cloudhsmv2/field :portkey.aws.cloudhsmv2/strings))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/create-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/hsm]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/backups (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2/backup))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/restore-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.cloud-hsm-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.cloud-hsm-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.create-hsm-request/availability-zone (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/external-az))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/create-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/cluster-id :portkey.aws.cloudhsmv2.create-hsm-request/availability-zone] :opt-un [:portkey.aws.cloudhsmv2/ip-address]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.tag/key (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.tag/value (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.tag/key :portkey.aws.cloudhsmv2.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.copy-backup-to-region-request/destination-region (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/region))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/copy-backup-to-region-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.copy-backup-to-region-request/destination-region :portkey.aws.cloudhsmv2/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/delete-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/hsm-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/field (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/hsm-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(hsm1\.medium)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/eni-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"eni-[0-9a-fA-F]{8,17}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/describe-backups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/backups :portkey.aws.cloudhsmv2/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/max-size (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-z]{2}(-(gov))?-(east|west|north|south|central){1,2}-\d" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.untag-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.untag-resource-request/resource-id :portkey.aws.cloudhsmv2/tag-key-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.delete-hsm-request/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/delete-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/cluster-id] :opt-un [:portkey.aws.cloudhsmv2/hsm-id :portkey.aws.cloudhsmv2/eni-id :portkey.aws.cloudhsmv2.delete-hsm-request/eni-ip]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/copy-backup-to-region-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2/destination-backup]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.initialize-cluster-request/signed-cert (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.initialize-cluster-request/trust-anchor (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/initialize-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2/cluster-id :portkey.aws.cloudhsmv2.initialize-cluster-request/signed-cert :portkey.aws.cloudhsmv2.initialize-cluster-request/trust-anchor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.list-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.list-tags-request/max-results (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/max-size))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.list-tags-request/resource-id] :opt-un [:portkey.aws.cloudhsmv2/next-token :portkey.aws.cloudhsmv2.list-tags-request/max-results]))

(clojure.core/defn tag-resource "Adds or overwrites one or more tags for the specified AWS CloudHSM cluster." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/tag-resource-response))

(clojure.core/defn restore-backup "Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state.\nFor more information on deleting a backup, see DeleteBackup." ([restore-backup-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-restore-backup-request restore-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/restore-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/restore-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreBackup", :http.request.configuration/output-deser-fn response-restore-backup-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef restore-backup :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/restore-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/restore-backup-response))

(clojure.core/defn create-hsm "Creates a new hardware security module (HSM) in the specified AWS CloudHSM\ncluster." ([create-hsm-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-hsm-request create-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/create-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/create-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHsm", :http.request.configuration/output-deser-fn response-create-hsm-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef create-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/create-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/create-hsm-response))

(clojure.core/defn create-cluster "Creates a new AWS CloudHSM cluster." ([create-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/create-cluster-response))

(clojure.core/defn list-tags "Gets a list of tags for the specified AWS CloudHSM cluster.\n This is a paginated operation, which means that each response might contain\nonly a subset of all the tags. When the response contains only a subset of tags,\nit includes a NextToken value. Use this value in a subsequent ListTags request\nto get more tags. When you receive a response with no NextToken (or an empty or\nnull value), that means there are no more tags to get." ([list-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/list-tags-response))

(clojure.core/defn describe-clusters "Gets information about AWS CloudHSM clusters.\n This is a paginated operation, which means that each response might contain\nonly a subset of all the clusters. When the response contains only a subset of\nclusters, it includes a NextToken value. Use this value in a subsequent\nDescribeClusters request to get more clusters. When you receive a response with\nno NextToken (or an empty or null value), that means there are no more clusters\nto get." ([] (describe-clusters {})) ([describe-clusters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-clusters-request describe-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/describe-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/describe-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeClusters", :http.request.configuration/output-deser-fn response-describe-clusters-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-clusters :args (clojure.spec.alpha/? :portkey.aws.cloudhsmv2/describe-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/describe-clusters-response))

(clojure.core/defn delete-hsm "Deletes the specified HSM. To specify an HSM, you can use its identifier (ID),\nthe IP address of the HSM's elastic network interface (ENI), or the ID of the\nHSM's ENI. You need to specify only one of these values. To find these values,\nuse DescribeClusters." ([delete-hsm-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-hsm-request delete-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/delete-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/delete-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteHsm", :http.request.configuration/output-deser-fn response-delete-hsm-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/delete-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/delete-hsm-response))

(clojure.core/defn delete-cluster "Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you\nmust delete all HSMs in the cluster. To see if the cluster contains any HSMs,\nuse DescribeClusters. To delete an HSM, use DeleteHsm." ([delete-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/delete-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCluster", :http.request.configuration/output-deser-fn response-delete-cluster-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/delete-cluster-response))

(clojure.core/defn untag-resource "Removes the specified tag or tags from the specified AWS CloudHSM cluster." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/untag-resource-response))

(clojure.core/defn initialize-cluster "Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by\nyour issuing certificate authority (CA) and the CA's root certificate. Before\nyou can claim a cluster, you must sign the cluster's certificate signing request\n(CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters." ([initialize-cluster-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-initialize-cluster-request initialize-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/initialize-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/initialize-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitializeCluster", :http.request.configuration/output-deser-fn response-initialize-cluster-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef initialize-cluster :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/initialize-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/initialize-cluster-response))

(clojure.core/defn delete-backup "Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days\nafter the DeleteBackup request. For more information on restoring a backup, see\nRestoreBackup" ([delete-backup-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-backup-request delete-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/delete-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/delete-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBackup", :http.request.configuration/output-deser-fn response-delete-backup-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/delete-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/delete-backup-response))

(clojure.core/defn describe-backups "Gets information about backups of AWS CloudHSM clusters.\n This is a paginated operation, which means that each response might contain\nonly a subset of all the backups. When the response contains only a subset of\nbackups, it includes a NextToken value. Use this value in a subsequent\nDescribeBackups request to get more backups. When you receive a response with no\nNextToken (or an empty or null value), that means there are no more backups to\nget." ([] (describe-backups {})) ([describe-backups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-backups-request describe-backups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/describe-backups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/describe-backups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBackups", :http.request.configuration/output-deser-fn response-describe-backups-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-backups :args (clojure.spec.alpha/? :portkey.aws.cloudhsmv2/describe-backups-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/describe-backups-response))

(clojure.core/defn copy-backup-to-region "Copy an AWS CloudHSM cluster backup to a different region." ([copy-backup-to-region-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-copy-backup-to-region-request copy-backup-to-region-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2/endpoints, :http.request.configuration/target-prefix "BaldrApiService", :http.request.spec/output-spec :portkey.aws.cloudhsmv2/copy-backup-to-region-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2/copy-backup-to-region-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CopyBackupToRegion", :http.request.configuration/output-deser-fn response-copy-backup-to-region-response, :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef copy-backup-to-region :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2/copy-backup-to-region-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2/copy-backup-to-region-response))
