(ns portkey.aws.datasync.-2018-11-09 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "datasync", :region "ap-northeast-1"},
    :ssl-common-name "datasync.ap-northeast-1.amazonaws.com",
    :endpoint "https://datasync.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "datasync", :region "eu-west-1"},
    :ssl-common-name "datasync.eu-west-1.amazonaws.com",
    :endpoint "https://datasync.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "datasync", :region "us-east-2"},
    :ssl-common-name "datasync.us-east-2.amazonaws.com",
    :endpoint "https://datasync.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "datasync", :region "ap-southeast-2"},
    :ssl-common-name "datasync.ap-southeast-2.amazonaws.com",
    :endpoint "https://datasync.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "datasync", :region "ap-southeast-1"},
    :ssl-common-name "datasync.ap-southeast-1.amazonaws.com",
    :endpoint "https://datasync.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "datasync", :region "ap-northeast-2"},
    :ssl-common-name "datasync.ap-northeast-2.amazonaws.com",
    :endpoint "https://datasync.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "datasync", :region "eu-central-1"},
    :ssl-common-name "datasync.eu-central-1.amazonaws.com",
    :endpoint "https://datasync.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "datasync", :region "us-west-2"},
    :ssl-common-name "datasync.us-west-2.amazonaws.com",
    :endpoint "https://datasync.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "datasync", :region "us-east-1"},
    :ssl-common-name "datasync.us-east-1.amazonaws.com",
    :endpoint "https://datasync.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "datasync", :region "us-west-1"},
    :ssl-common-name "datasync.us-west-1.amazonaws.com",
    :endpoint "https://datasync.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-ec-2-subnet-arn)

(clojure.core/declare ser-tag-list-entry)

(clojure.core/declare ser-efs-filesystem-arn)

(clojure.core/declare ser-location-arn)

(clojure.core/declare ser-subdirectory)

(clojure.core/declare ser-server-hostname)

(clojure.core/declare ser-on-prem-config)

(clojure.core/declare ser-task-execution-arn)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-log-group-arn)

(clojure.core/declare ser-mtime)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-uid)

(clojure.core/declare ser-verify-mode)

(clojure.core/declare ser-iam-role-arn)

(clojure.core/declare ser-s-3-config)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-activation-key)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-task-arn)

(clojure.core/declare ser-preserve-deleted-files)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-posix-permissions)

(clojure.core/declare ser-agent-arn)

(clojure.core/declare ser-gid)

(clojure.core/declare ser-ec-2-config)

(clojure.core/declare ser-preserve-devices)

(clojure.core/declare ser-s-3-bucket-arn)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-bytes-per-second)

(clojure.core/declare ser-taggable-resource-arn)

(clojure.core/declare ser-atime)

(clojure.core/declare ser-ec-2-security-group-arn)

(clojure.core/declare ser-agent-arn-list)

(clojure.core/declare ser-options)

(clojure.core/declare ser-ec-2-security-group-arn-list)

(clojure.core/defn- ser-ec-2-subnet-arn [input] #:http.request.field{:value input, :shape "Ec2SubnetArn"})

(clojure.core/defn- ser-tag-list-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagListEntry", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-efs-filesystem-arn [input] #:http.request.field{:value input, :shape "EfsFilesystemArn"})

(clojure.core/defn- ser-location-arn [input] #:http.request.field{:value input, :shape "LocationArn"})

(clojure.core/defn- ser-subdirectory [input] #:http.request.field{:value input, :shape "Subdirectory"})

(clojure.core/defn- ser-server-hostname [input] #:http.request.field{:value input, :shape "ServerHostname"})

(clojure.core/defn- ser-on-prem-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-agent-arn-list (:agent-arns input)) #:http.request.field{:name "AgentArns", :shape "AgentArnList"})], :shape "OnPremConfig", :type "structure"}))

(clojure.core/defn- ser-task-execution-arn [input] #:http.request.field{:value input, :shape "TaskExecutionArn"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-log-group-arn [input] #:http.request.field{:value input, :shape "LogGroupArn"})

(clojure.core/defn- ser-mtime [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PRESERVE" "PRESERVE", :preserve "PRESERVE"} input), :shape "Mtime"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-uid [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "INT_VALUE" "INT_VALUE", :int-value "INT_VALUE", "NAME" "NAME", :name "NAME", "BOTH" "BOTH", :both "BOTH"} input), :shape "Uid"})

(clojure.core/defn- ser-verify-mode [input] #:http.request.field{:value (clojure.core/get {"POINT_IN_TIME_CONSISTENT" "POINT_IN_TIME_CONSISTENT", :point-in-time-consistent "POINT_IN_TIME_CONSISTENT", "NONE" "NONE", :none "NONE"} input), :shape "VerifyMode"})

(clojure.core/defn- ser-iam-role-arn [input] #:http.request.field{:value input, :shape "IamRoleArn"})

(clojure.core/defn- ser-s-3-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-iam-role-arn (:bucket-access-role-arn input)) #:http.request.field{:name "BucketAccessRoleArn", :shape "IamRoleArn"})], :shape "S3Config", :type "structure"}))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-list-entry coll) #:http.request.field{:shape "TagListEntry"}))) input), :shape "TagList", :type "list", :max 55, :min 0})

(clojure.core/defn- ser-activation-key [input] #:http.request.field{:value input, :shape "ActivationKey"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-task-arn [input] #:http.request.field{:value input, :shape "TaskArn"})

(clojure.core/defn- ser-preserve-deleted-files [input] #:http.request.field{:value (clojure.core/get {"PRESERVE" "PRESERVE", :preserve "PRESERVE", "REMOVE" "REMOVE", :remove "REMOVE"} input), :shape "PreserveDeletedFiles"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-posix-permissions [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BEST_EFFORT" "BEST_EFFORT", :best-effort "BEST_EFFORT", "PRESERVE" "PRESERVE", :preserve "PRESERVE"} input), :shape "PosixPermissions"})

(clojure.core/defn- ser-agent-arn [input] #:http.request.field{:value input, :shape "AgentArn"})

(clojure.core/defn- ser-gid [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "INT_VALUE" "INT_VALUE", :int-value "INT_VALUE", "NAME" "NAME", :name "NAME", "BOTH" "BOTH", :both "BOTH"} input), :shape "Gid"})

(clojure.core/defn- ser-ec-2-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ec-2-subnet-arn (:subnet-arn input)) #:http.request.field{:name "SubnetArn", :shape "Ec2SubnetArn"}) (clojure.core/into (ser-ec-2-security-group-arn-list (:security-group-arns input)) #:http.request.field{:name "SecurityGroupArns", :shape "Ec2SecurityGroupArnList"})], :shape "Ec2Config", :type "structure"}))

(clojure.core/defn- ser-preserve-devices [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PRESERVE" "PRESERVE", :preserve "PRESERVE"} input), :shape "PreserveDevices"})

(clojure.core/defn- ser-s-3-bucket-arn [input] #:http.request.field{:value input, :shape "S3BucketArn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-bytes-per-second [input] #:http.request.field{:value input, :shape "BytesPerSecond"})

(clojure.core/defn- ser-taggable-resource-arn [input] #:http.request.field{:value input, :shape "TaggableResourceArn"})

(clojure.core/defn- ser-atime [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BEST_EFFORT" "BEST_EFFORT", :best-effort "BEST_EFFORT"} input), :shape "Atime"})

(clojure.core/defn- ser-ec-2-security-group-arn [input] #:http.request.field{:value input, :shape "Ec2SecurityGroupArn"})

(clojure.core/defn- ser-agent-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-agent-arn coll) #:http.request.field{:shape "AgentArn"}))) input), :shape "AgentArnList", :type "list", :max 64, :min 1})

(clojure.core/defn- ser-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Options", :type "structure"} (clojure.core/contains? input :mtime) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mtime (input :mtime)) #:http.request.field{:name "Mtime", :shape "Mtime"})) (clojure.core/contains? input :uid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uid (input :uid)) #:http.request.field{:name "Uid", :shape "Uid"})) (clojure.core/contains? input :verify-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verify-mode (input :verify-mode)) #:http.request.field{:name "VerifyMode", :shape "VerifyMode"})) (clojure.core/contains? input :preserve-deleted-files) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preserve-deleted-files (input :preserve-deleted-files)) #:http.request.field{:name "PreserveDeletedFiles", :shape "PreserveDeletedFiles"})) (clojure.core/contains? input :posix-permissions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-posix-permissions (input :posix-permissions)) #:http.request.field{:name "PosixPermissions", :shape "PosixPermissions"})) (clojure.core/contains? input :gid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gid (input :gid)) #:http.request.field{:name "Gid", :shape "Gid"})) (clojure.core/contains? input :preserve-devices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preserve-devices (input :preserve-devices)) #:http.request.field{:name "PreserveDevices", :shape "PreserveDevices"})) (clojure.core/contains? input :bytes-per-second) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bytes-per-second (input :bytes-per-second)) #:http.request.field{:name "BytesPerSecond", :shape "BytesPerSecond"})) (clojure.core/contains? input :atime) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-atime (input :atime)) #:http.request.field{:name "Atime", :shape "Atime"}))))

(clojure.core/defn- ser-ec-2-security-group-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ec-2-security-group-arn coll) #:http.request.field{:shape "Ec2SecurityGroupArn"}))) input), :shape "Ec2SecurityGroupArnList", :type "list", :max 5, :min 1})

(clojure.core/defn- req-list-agents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-agent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-agent-arn (input :agent-arn)) #:http.request.field{:name "AgentArn", :shape "AgentArn"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :name)) #:http.request.field{:name "Name", :shape "TagValue"}))))

(clojure.core/defn- req-start-task-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "TaskArn"})]} (clojure.core/contains? input :override-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options (input :override-options)) #:http.request.field{:name "OverrideOptions", :shape "Options"}))))

(clojure.core/defn- req-describe-task-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-execution-arn (input :task-execution-arn)) #:http.request.field{:name "TaskExecutionArn", :shape "TaskExecutionArn"})]}))

(clojure.core/defn- req-create-location-s-3-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subdirectory (input :subdirectory)) #:http.request.field{:name "Subdirectory", :shape "Subdirectory"}) (clojure.core/into (ser-s-3-bucket-arn (input :s-3-bucket-arn)) #:http.request.field{:name "S3BucketArn", :shape "S3BucketArn"}) (clojure.core/into (ser-s-3-config (input :s-3-config)) #:http.request.field{:name "S3Config", :shape "S3Config"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-create-agent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-activation-key (input :activation-key)) #:http.request.field{:name "ActivationKey", :shape "ActivationKey"})]} (clojure.core/contains? input :agent-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :agent-name)) #:http.request.field{:name "AgentName", :shape "TagValue"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-taggable-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "TaggableResourceArn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-cancel-task-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-execution-arn (input :task-execution-arn)) #:http.request.field{:name "TaskExecutionArn", :shape "TaskExecutionArn"})]}))

(clojure.core/defn- req-delete-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "TaskArn"})]}))

(clojure.core/defn- req-create-location-efs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subdirectory (input :subdirectory)) #:http.request.field{:name "Subdirectory", :shape "Subdirectory"}) (clojure.core/into (ser-efs-filesystem-arn (input :efs-filesystem-arn)) #:http.request.field{:name "EfsFilesystemArn", :shape "EfsFilesystemArn"}) (clojure.core/into (ser-ec-2-config (input :ec-2-config)) #:http.request.field{:name "Ec2Config", :shape "Ec2Config"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-taggable-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "TaggableResourceArn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-describe-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "TaskArn"})]}))

(clojure.core/defn- req-create-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-location-arn (input :source-location-arn)) #:http.request.field{:name "SourceLocationArn", :shape "LocationArn"}) (clojure.core/into (ser-location-arn (input :destination-location-arn)) #:http.request.field{:name "DestinationLocationArn", :shape "LocationArn"})]} (clojure.core/contains? input :cloud-watch-log-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-group-arn (input :cloud-watch-log-group-arn)) #:http.request.field{:name "CloudWatchLogGroupArn", :shape "LogGroupArn"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :name)) #:http.request.field{:name "Name", :shape "TagValue"})) (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options (input :options)) #:http.request.field{:name "Options", :shape "Options"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-delete-agent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-agent-arn (input :agent-arn)) #:http.request.field{:name "AgentArn", :shape "AgentArn"})]}))

(clojure.core/defn- req-describe-location-s-3-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-location-arn (input :location-arn)) #:http.request.field{:name "LocationArn", :shape "LocationArn"})]}))

(clojure.core/defn- req-create-location-nfs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subdirectory (input :subdirectory)) #:http.request.field{:name "Subdirectory", :shape "Subdirectory"}) (clojure.core/into (ser-server-hostname (input :server-hostname)) #:http.request.field{:name "ServerHostname", :shape "ServerHostname"}) (clojure.core/into (ser-on-prem-config (input :on-prem-config)) #:http.request.field{:name "OnPremConfig", :shape "OnPremConfig"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-describe-location-nfs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-location-arn (input :location-arn)) #:http.request.field{:name "LocationArn", :shape "LocationArn"})]}))

(clojure.core/defn- req-list-task-executions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :task-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "TaskArn"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-location-efs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-location-arn (input :location-arn)) #:http.request.field{:name "LocationArn", :shape "LocationArn"})]}))

(clojure.core/defn- req-update-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "TaskArn"})]} (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options (input :options)) #:http.request.field{:name "Options", :shape "Options"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :name)) #:http.request.field{:name "Name", :shape "TagValue"}))))

(clojure.core/defn- req-delete-location-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-location-arn (input :location-arn)) #:http.request.field{:name "LocationArn", :shape "LocationArn"})]}))

(clojure.core/defn- req-describe-agent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-agent-arn (input :agent-arn)) #:http.request.field{:name "AgentArn", :shape "AgentArn"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-taggable-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "TaggableResourceArn"}) (clojure.core/into (ser-tag-key-list (input :keys)) #:http.request.field{:name "Keys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-list-locations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/declare deser-phase-status)

(clojure.core/declare deser-ec-2-subnet-arn)

(clojure.core/declare deser-tag-list-entry)

(clojure.core/declare deser-location-list)

(clojure.core/declare deserstring)

(clojure.core/declare deser-task-execution-list-entry)

(clojure.core/declare deser-location-arn)

(clojure.core/declare deser-on-prem-config)

(clojure.core/declare deser-task-execution-status)

(clojure.core/declare deser-agent-list)

(clojure.core/declare deserlong)

(clojure.core/declare deser-task-execution-arn)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-log-group-arn)

(clojure.core/declare deser-mtime)

(clojure.core/declare deser-task-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-uid)

(clojure.core/declare deser-verify-mode)

(clojure.core/declare deser-iam-role-arn)

(clojure.core/declare deser-s-3-config)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-agent-status)

(clojure.core/declare deser-task-arn)

(clojure.core/declare deser-preserve-deleted-files)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-task-execution-result-detail)

(clojure.core/declare deser-agent-list-entry)

(clojure.core/declare deser-task-list-entry)

(clojure.core/declare deser-posix-permissions)

(clojure.core/declare deser-duration)

(clojure.core/declare deser-agent-arn)

(clojure.core/declare deser-task-execution-list)

(clojure.core/declare deser-gid)

(clojure.core/declare deser-ec-2-config)

(clojure.core/declare deser-preserve-devices)

(clojure.core/declare deser-location-uri)

(clojure.core/declare deser-bytes-per-second)

(clojure.core/declare deser-location-list-entry)

(clojure.core/declare deser-atime)

(clojure.core/declare deser-ec-2-security-group-arn)

(clojure.core/declare deser-task-status)

(clojure.core/declare deser-agent-arn-list)

(clojure.core/declare deser-time)

(clojure.core/declare deser-options)

(clojure.core/declare deser-ec-2-security-group-arn-list)

(clojure.core/defn- deser-phase-status [input] (clojure.core/get {"PENDING" :pending, "SUCCESS" :success, "ERROR" :error} input))

(clojure.core/defn- deser-ec-2-subnet-arn [input] input)

(clojure.core/defn- deser-tag-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-location-list-entry coll))) input))

(clojure.core/defn- deserstring [input] input)

(clojure.core/defn- deser-task-execution-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "TaskExecutionArn") (clojure.core/assoc :task-execution-arn (deser-task-execution-arn (input "TaskExecutionArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-task-execution-status (input "Status")))))

(clojure.core/defn- deser-location-arn [input] input)

(clojure.core/defn- deser-on-prem-config [input] (clojure.core/cond-> {:agent-arns (deser-agent-arn-list (input "AgentArns"))}))

(clojure.core/defn- deser-task-execution-status [input] (clojure.core/get {"LAUNCHING" :launching, "PREPARING" :preparing, "TRANSFERRING" :transferring, "VERIFYING" :verifying, "SUCCESS" :success, "ERROR" :error} input))

(clojure.core/defn- deser-agent-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-list-entry coll))) input))

(clojure.core/defn- deserlong [input] input)

(clojure.core/defn- deser-task-execution-arn [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-log-group-arn [input] input)

(clojure.core/defn- deser-mtime [input] (clojure.core/get {"NONE" :none, "PRESERVE" :preserve} input))

(clojure.core/defn- deser-task-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-task-list-entry coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-uid [input] (clojure.core/get {"NONE" :none, "INT_VALUE" :int-value, "NAME" :name, "BOTH" :both} input))

(clojure.core/defn- deser-verify-mode [input] (clojure.core/get {"POINT_IN_TIME_CONSISTENT" :point-in-time-consistent, "NONE" :none} input))

(clojure.core/defn- deser-iam-role-arn [input] input)

(clojure.core/defn- deser-s-3-config [input] (clojure.core/cond-> {:bucket-access-role-arn (deser-iam-role-arn (input "BucketAccessRoleArn"))}))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-list-entry coll))) input))

(clojure.core/defn- deser-agent-status [input] (clojure.core/get {"ONLINE" :online, "OFFLINE" :offline} input))

(clojure.core/defn- deser-task-arn [input] input)

(clojure.core/defn- deser-preserve-deleted-files [input] (clojure.core/get {"PRESERVE" :preserve, "REMOVE" :remove} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-task-execution-result-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "PrepareDuration") (clojure.core/assoc :prepare-duration (deser-duration (input "PrepareDuration"))) (clojure.core/contains? input "PrepareStatus") (clojure.core/assoc :prepare-status (deser-phase-status (input "PrepareStatus"))) (clojure.core/contains? input "TransferDuration") (clojure.core/assoc :transfer-duration (deser-duration (input "TransferDuration"))) (clojure.core/contains? input "TransferStatus") (clojure.core/assoc :transfer-status (deser-phase-status (input "TransferStatus"))) (clojure.core/contains? input "VerifyDuration") (clojure.core/assoc :verify-duration (deser-duration (input "VerifyDuration"))) (clojure.core/contains? input "VerifyStatus") (clojure.core/assoc :verify-status (deser-phase-status (input "VerifyStatus"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deserstring (input "ErrorCode"))) (clojure.core/contains? input "ErrorDetail") (clojure.core/assoc :error-detail (deserstring (input "ErrorDetail")))))

(clojure.core/defn- deser-agent-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "AgentArn") (clojure.core/assoc :agent-arn (deser-agent-arn (input "AgentArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-tag-value (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-agent-status (input "Status")))))

(clojure.core/defn- deser-task-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "TaskArn") (clojure.core/assoc :task-arn (deser-task-arn (input "TaskArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-task-status (input "Status"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-tag-value (input "Name")))))

(clojure.core/defn- deser-posix-permissions [input] (clojure.core/get {"NONE" :none, "BEST_EFFORT" :best-effort, "PRESERVE" :preserve} input))

(clojure.core/defn- deser-duration [input] input)

(clojure.core/defn- deser-agent-arn [input] input)

(clojure.core/defn- deser-task-execution-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-task-execution-list-entry coll))) input))

(clojure.core/defn- deser-gid [input] (clojure.core/get {"NONE" :none, "INT_VALUE" :int-value, "NAME" :name, "BOTH" :both} input))

(clojure.core/defn- deser-ec-2-config [input] (clojure.core/cond-> {:subnet-arn (deser-ec-2-subnet-arn (input "SubnetArn")), :security-group-arns (deser-ec-2-security-group-arn-list (input "SecurityGroupArns"))}))

(clojure.core/defn- deser-preserve-devices [input] (clojure.core/get {"NONE" :none, "PRESERVE" :preserve} input))

(clojure.core/defn- deser-location-uri [input] input)

(clojure.core/defn- deser-bytes-per-second [input] input)

(clojure.core/defn- deser-location-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (input "LocationArn"))) (clojure.core/contains? input "LocationUri") (clojure.core/assoc :location-uri (deser-location-uri (input "LocationUri")))))

(clojure.core/defn- deser-atime [input] (clojure.core/get {"NONE" :none, "BEST_EFFORT" :best-effort} input))

(clojure.core/defn- deser-ec-2-security-group-arn [input] input)

(clojure.core/defn- deser-task-status [input] (clojure.core/get {"AVAILABLE" :available, "CREATING" :creating, "RUNNING" :running, "UNAVAILABLE" :unavailable} input))

(clojure.core/defn- deser-agent-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-arn coll))) input))

(clojure.core/defn- deser-time [input] input)

(clojure.core/defn- deser-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "Mtime") (clojure.core/assoc :mtime (deser-mtime (input "Mtime"))) (clojure.core/contains? input "Uid") (clojure.core/assoc :uid (deser-uid (input "Uid"))) (clojure.core/contains? input "VerifyMode") (clojure.core/assoc :verify-mode (deser-verify-mode (input "VerifyMode"))) (clojure.core/contains? input "PreserveDeletedFiles") (clojure.core/assoc :preserve-deleted-files (deser-preserve-deleted-files (input "PreserveDeletedFiles"))) (clojure.core/contains? input "PosixPermissions") (clojure.core/assoc :posix-permissions (deser-posix-permissions (input "PosixPermissions"))) (clojure.core/contains? input "Gid") (clojure.core/assoc :gid (deser-gid (input "Gid"))) (clojure.core/contains? input "PreserveDevices") (clojure.core/assoc :preserve-devices (deser-preserve-devices (input "PreserveDevices"))) (clojure.core/contains? input "BytesPerSecond") (clojure.core/assoc :bytes-per-second (deser-bytes-per-second (input "BytesPerSecond"))) (clojure.core/contains? input "Atime") (clojure.core/assoc :atime (deser-atime (input "Atime")))))

(clojure.core/defn- deser-ec-2-security-group-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ec-2-security-group-arn coll))) input))

(clojure.core/defn- response-list-tasks-response ([input] (response-list-tasks-response nil input)) ([resultWrapper512096 input] (clojure.core/let [rawinput512095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512097 {"Tasks" (rawinput512095 "Tasks"), "NextToken" (rawinput512095 "NextToken")}] (clojure.core/cond-> {} (letvar512097 "Tasks") (clojure.core/assoc :tasks (deser-task-list (clojure.core/get-in letvar512097 ["Tasks"]))) (letvar512097 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar512097 ["NextToken"])))))))

(clojure.core/defn- response-describe-task-response ([input] (response-describe-task-response nil input)) ([resultWrapper512099 input] (clojure.core/let [rawinput512098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512100 {"CloudWatchLogGroupArn" (rawinput512098 "CloudWatchLogGroupArn"), "CurrentTaskExecutionArn" (rawinput512098 "CurrentTaskExecutionArn"), "Status" (rawinput512098 "Status"), "ErrorDetail" (rawinput512098 "ErrorDetail"), "TaskArn" (rawinput512098 "TaskArn"), "ErrorCode" (rawinput512098 "ErrorCode"), "CreationTime" (rawinput512098 "CreationTime"), "SourceLocationArn" (rawinput512098 "SourceLocationArn"), "DestinationLocationArn" (rawinput512098 "DestinationLocationArn"), "Name" (rawinput512098 "Name"), "Options" (rawinput512098 "Options")}] (clojure.core/cond-> {} (letvar512100 "CloudWatchLogGroupArn") (clojure.core/assoc :cloud-watch-log-group-arn (deser-log-group-arn (clojure.core/get-in letvar512100 ["CloudWatchLogGroupArn"]))) (letvar512100 "CurrentTaskExecutionArn") (clojure.core/assoc :current-task-execution-arn (deser-task-execution-arn (clojure.core/get-in letvar512100 ["CurrentTaskExecutionArn"]))) (letvar512100 "Status") (clojure.core/assoc :status (deser-task-status (clojure.core/get-in letvar512100 ["Status"]))) (letvar512100 "ErrorDetail") (clojure.core/assoc :error-detail (deserstring (clojure.core/get-in letvar512100 ["ErrorDetail"]))) (letvar512100 "TaskArn") (clojure.core/assoc :task-arn (deser-task-arn (clojure.core/get-in letvar512100 ["TaskArn"]))) (letvar512100 "ErrorCode") (clojure.core/assoc :error-code (deserstring (clojure.core/get-in letvar512100 ["ErrorCode"]))) (letvar512100 "CreationTime") (clojure.core/assoc :creation-time (deser-time (clojure.core/get-in letvar512100 ["CreationTime"]))) (letvar512100 "SourceLocationArn") (clojure.core/assoc :source-location-arn (deser-location-arn (clojure.core/get-in letvar512100 ["SourceLocationArn"]))) (letvar512100 "DestinationLocationArn") (clojure.core/assoc :destination-location-arn (deser-location-arn (clojure.core/get-in letvar512100 ["DestinationLocationArn"]))) (letvar512100 "Name") (clojure.core/assoc :name (deser-tag-value (clojure.core/get-in letvar512100 ["Name"]))) (letvar512100 "Options") (clojure.core/assoc :options (deser-options (clojure.core/get-in letvar512100 ["Options"])))))))

(clojure.core/defn- response-describe-agent-response ([input] (response-describe-agent-response nil input)) ([resultWrapper512102 input] (clojure.core/let [rawinput512101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512103 {"AgentArn" (rawinput512101 "AgentArn"), "Name" (rawinput512101 "Name"), "Status" (rawinput512101 "Status"), "LastConnectionTime" (rawinput512101 "LastConnectionTime"), "CreationTime" (rawinput512101 "CreationTime")}] (clojure.core/cond-> {} (letvar512103 "AgentArn") (clojure.core/assoc :agent-arn (deser-agent-arn (clojure.core/get-in letvar512103 ["AgentArn"]))) (letvar512103 "Name") (clojure.core/assoc :name (deser-tag-value (clojure.core/get-in letvar512103 ["Name"]))) (letvar512103 "Status") (clojure.core/assoc :status (deser-agent-status (clojure.core/get-in letvar512103 ["Status"]))) (letvar512103 "LastConnectionTime") (clojure.core/assoc :last-connection-time (deser-time (clojure.core/get-in letvar512103 ["LastConnectionTime"]))) (letvar512103 "CreationTime") (clojure.core/assoc :creation-time (deser-time (clojure.core/get-in letvar512103 ["CreationTime"])))))))

(clojure.core/defn- response-cancel-task-execution-response ([input] (response-cancel-task-execution-response nil input)) ([resultWrapper512105 input] (clojure.core/let [rawinput512104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512106 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-task-execution-response ([input] (response-describe-task-execution-response nil input)) ([resultWrapper512108 input] (clojure.core/let [rawinput512107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512109 {"BytesTransferred" (rawinput512107 "BytesTransferred"), "StartTime" (rawinput512107 "StartTime"), "TaskExecutionArn" (rawinput512107 "TaskExecutionArn"), "Result" (rawinput512107 "Result"), "Status" (rawinput512107 "Status"), "BytesWritten" (rawinput512107 "BytesWritten"), "EstimatedFilesToTransfer" (rawinput512107 "EstimatedFilesToTransfer"), "EstimatedBytesToTransfer" (rawinput512107 "EstimatedBytesToTransfer"), "FilesTransferred" (rawinput512107 "FilesTransferred"), "Options" (rawinput512107 "Options")}] (clojure.core/cond-> {} (letvar512109 "BytesTransferred") (clojure.core/assoc :bytes-transferred (deserlong (clojure.core/get-in letvar512109 ["BytesTransferred"]))) (letvar512109 "StartTime") (clojure.core/assoc :start-time (deser-time (clojure.core/get-in letvar512109 ["StartTime"]))) (letvar512109 "TaskExecutionArn") (clojure.core/assoc :task-execution-arn (deser-task-execution-arn (clojure.core/get-in letvar512109 ["TaskExecutionArn"]))) (letvar512109 "Result") (clojure.core/assoc :result (deser-task-execution-result-detail (clojure.core/get-in letvar512109 ["Result"]))) (letvar512109 "Status") (clojure.core/assoc :status (deser-task-execution-status (clojure.core/get-in letvar512109 ["Status"]))) (letvar512109 "BytesWritten") (clojure.core/assoc :bytes-written (deserlong (clojure.core/get-in letvar512109 ["BytesWritten"]))) (letvar512109 "EstimatedFilesToTransfer") (clojure.core/assoc :estimated-files-to-transfer (deserlong (clojure.core/get-in letvar512109 ["EstimatedFilesToTransfer"]))) (letvar512109 "EstimatedBytesToTransfer") (clojure.core/assoc :estimated-bytes-to-transfer (deserlong (clojure.core/get-in letvar512109 ["EstimatedBytesToTransfer"]))) (letvar512109 "FilesTransferred") (clojure.core/assoc :files-transferred (deserlong (clojure.core/get-in letvar512109 ["FilesTransferred"]))) (letvar512109 "Options") (clojure.core/assoc :options (deser-options (clojure.core/get-in letvar512109 ["Options"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper512111 input] (clojure.core/let [rawinput512110 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512112 {"message" (rawinput512110 "message"), "errorCode" (rawinput512110 "errorCode")}] (clojure.core/cond-> {} (letvar512112 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar512112 ["message"]))) (letvar512112 "errorCode") (clojure.core/assoc :error-code (deserstring (clojure.core/get-in letvar512112 ["errorCode"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper512114 input] (clojure.core/let [rawinput512113 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512115 {"Tags" (rawinput512113 "Tags"), "NextToken" (rawinput512113 "NextToken")}] (clojure.core/cond-> {} (letvar512115 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar512115 ["Tags"]))) (letvar512115 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar512115 ["NextToken"])))))))

(clojure.core/defn- response-describe-location-efs-response ([input] (response-describe-location-efs-response nil input)) ([resultWrapper512117 input] (clojure.core/let [rawinput512116 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512118 {"LocationArn" (rawinput512116 "LocationArn"), "LocationUri" (rawinput512116 "LocationUri"), "Ec2Config" (rawinput512116 "Ec2Config"), "CreationTime" (rawinput512116 "CreationTime")}] (clojure.core/cond-> {} (letvar512118 "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (clojure.core/get-in letvar512118 ["LocationArn"]))) (letvar512118 "LocationUri") (clojure.core/assoc :location-uri (deser-location-uri (clojure.core/get-in letvar512118 ["LocationUri"]))) (letvar512118 "Ec2Config") (clojure.core/assoc :ec-2-config (deser-ec-2-config (clojure.core/get-in letvar512118 ["Ec2Config"]))) (letvar512118 "CreationTime") (clojure.core/assoc :creation-time (deser-time (clojure.core/get-in letvar512118 ["CreationTime"])))))))

(clojure.core/defn- response-create-agent-response ([input] (response-create-agent-response nil input)) ([resultWrapper512120 input] (clojure.core/let [rawinput512119 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512121 {"AgentArn" (rawinput512119 "AgentArn")}] (clojure.core/cond-> {} (letvar512121 "AgentArn") (clojure.core/assoc :agent-arn (deser-agent-arn (clojure.core/get-in letvar512121 ["AgentArn"])))))))

(clojure.core/defn- response-list-locations-response ([input] (response-list-locations-response nil input)) ([resultWrapper512123 input] (clojure.core/let [rawinput512122 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512124 {"Locations" (rawinput512122 "Locations"), "NextToken" (rawinput512122 "NextToken")}] (clojure.core/cond-> {} (letvar512124 "Locations") (clojure.core/assoc :locations (deser-location-list (clojure.core/get-in letvar512124 ["Locations"]))) (letvar512124 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar512124 ["NextToken"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper512126 input] (clojure.core/let [rawinput512125 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512127 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-location-s-3-response ([input] (response-describe-location-s-3-response nil input)) ([resultWrapper512129 input] (clojure.core/let [rawinput512128 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512130 {"LocationArn" (rawinput512128 "LocationArn"), "LocationUri" (rawinput512128 "LocationUri"), "S3Config" (rawinput512128 "S3Config"), "CreationTime" (rawinput512128 "CreationTime")}] (clojure.core/cond-> {} (letvar512130 "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (clojure.core/get-in letvar512130 ["LocationArn"]))) (letvar512130 "LocationUri") (clojure.core/assoc :location-uri (deser-location-uri (clojure.core/get-in letvar512130 ["LocationUri"]))) (letvar512130 "S3Config") (clojure.core/assoc :s-3-config (deser-s-3-config (clojure.core/get-in letvar512130 ["S3Config"]))) (letvar512130 "CreationTime") (clojure.core/assoc :creation-time (deser-time (clojure.core/get-in letvar512130 ["CreationTime"])))))))

(clojure.core/defn- response-update-agent-response ([input] (response-update-agent-response nil input)) ([resultWrapper512132 input] (clojure.core/let [rawinput512131 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512133 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-task-response ([input] (response-update-task-response nil input)) ([resultWrapper512135 input] (clojure.core/let [rawinput512134 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512136 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-task-execution-response ([input] (response-start-task-execution-response nil input)) ([resultWrapper512138 input] (clojure.core/let [rawinput512137 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512139 {"TaskExecutionArn" (rawinput512137 "TaskExecutionArn")}] (clojure.core/cond-> {} (letvar512139 "TaskExecutionArn") (clojure.core/assoc :task-execution-arn (deser-task-execution-arn (clojure.core/get-in letvar512139 ["TaskExecutionArn"])))))))

(clojure.core/defn- response-create-task-response ([input] (response-create-task-response nil input)) ([resultWrapper512141 input] (clojure.core/let [rawinput512140 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512142 {"TaskArn" (rawinput512140 "TaskArn")}] (clojure.core/cond-> {} (letvar512142 "TaskArn") (clojure.core/assoc :task-arn (deser-task-arn (clojure.core/get-in letvar512142 ["TaskArn"])))))))

(clojure.core/defn- response-delete-agent-response ([input] (response-delete-agent-response nil input)) ([resultWrapper512144 input] (clojure.core/let [rawinput512143 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512145 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-location-response ([input] (response-delete-location-response nil input)) ([resultWrapper512147 input] (clojure.core/let [rawinput512146 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512148 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-task-executions-response ([input] (response-list-task-executions-response nil input)) ([resultWrapper512150 input] (clojure.core/let [rawinput512149 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512151 {"TaskExecutions" (rawinput512149 "TaskExecutions"), "NextToken" (rawinput512149 "NextToken")}] (clojure.core/cond-> {} (letvar512151 "TaskExecutions") (clojure.core/assoc :task-executions (deser-task-execution-list (clojure.core/get-in letvar512151 ["TaskExecutions"]))) (letvar512151 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar512151 ["NextToken"])))))))

(clojure.core/defn- response-delete-task-response ([input] (response-delete-task-response nil input)) ([resultWrapper512153 input] (clojure.core/let [rawinput512152 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512154 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-agents-response ([input] (response-list-agents-response nil input)) ([resultWrapper512156 input] (clojure.core/let [rawinput512155 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512157 {"Agents" (rawinput512155 "Agents"), "NextToken" (rawinput512155 "NextToken")}] (clojure.core/cond-> {} (letvar512157 "Agents") (clojure.core/assoc :agents (deser-agent-list (clojure.core/get-in letvar512157 ["Agents"]))) (letvar512157 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar512157 ["NextToken"])))))))

(clojure.core/defn- response-create-location-s-3-response ([input] (response-create-location-s-3-response nil input)) ([resultWrapper512159 input] (clojure.core/let [rawinput512158 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512160 {"LocationArn" (rawinput512158 "LocationArn")}] (clojure.core/cond-> {} (letvar512160 "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (clojure.core/get-in letvar512160 ["LocationArn"])))))))

(clojure.core/defn- response-describe-location-nfs-response ([input] (response-describe-location-nfs-response nil input)) ([resultWrapper512162 input] (clojure.core/let [rawinput512161 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512163 {"LocationArn" (rawinput512161 "LocationArn"), "LocationUri" (rawinput512161 "LocationUri"), "OnPremConfig" (rawinput512161 "OnPremConfig"), "CreationTime" (rawinput512161 "CreationTime")}] (clojure.core/cond-> {} (letvar512163 "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (clojure.core/get-in letvar512163 ["LocationArn"]))) (letvar512163 "LocationUri") (clojure.core/assoc :location-uri (deser-location-uri (clojure.core/get-in letvar512163 ["LocationUri"]))) (letvar512163 "OnPremConfig") (clojure.core/assoc :on-prem-config (deser-on-prem-config (clojure.core/get-in letvar512163 ["OnPremConfig"]))) (letvar512163 "CreationTime") (clojure.core/assoc :creation-time (deser-time (clojure.core/get-in letvar512163 ["CreationTime"])))))))

(clojure.core/defn- response-create-location-nfs-response ([input] (response-create-location-nfs-response nil input)) ([resultWrapper512165 input] (clojure.core/let [rawinput512164 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512166 {"LocationArn" (rawinput512164 "LocationArn")}] (clojure.core/cond-> {} (letvar512166 "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (clojure.core/get-in letvar512166 ["LocationArn"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper512168 input] (clojure.core/let [rawinput512167 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512169 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-location-efs-response ([input] (response-create-location-efs-response nil input)) ([resultWrapper512171 input] (clojure.core/let [rawinput512170 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar512172 {"LocationArn" (rawinput512170 "LocationArn")}] (clojure.core/cond-> {} (letvar512172 "LocationArn") (clojure.core/assoc :location-arn (deser-location-arn (clojure.core/get-in letvar512172 ["LocationArn"])))))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/phase-status #{"SUCCESS" :pending "PENDING" "ERROR" :success :error})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.list-tasks-response/tasks (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.list-tasks-response/tasks :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/ec-2-subnet-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):ec2:[a-z\-0-9]*:[0-9]{12}:subnet/.*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-agents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/max-results :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.update-agent-request/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/update-agent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/agent-arn] :opt-un [:portkey.aws.datasync.-2018-11-09.update-agent-request/name]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/cloud-watch-log-group-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/log-group-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/current-task-execution-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-execution-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/error-detail (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/string))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/error-code (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/string))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/creation-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/source-location-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/location-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/destination-location-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/location-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-response/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.describe-task-response/cloud-watch-log-group-arn :portkey.aws.datasync.-2018-11-09.describe-task-response/current-task-execution-arn :portkey.aws.datasync.-2018-11-09.describe-task-response/status :portkey.aws.datasync.-2018-11-09.describe-task-response/error-detail :portkey.aws.datasync.-2018-11-09/task-arn :portkey.aws.datasync.-2018-11-09.describe-task-response/error-code :portkey.aws.datasync.-2018-11-09.describe-task-response/creation-time :portkey.aws.datasync.-2018-11-09.describe-task-response/source-location-arn :portkey.aws.datasync.-2018-11-09.describe-task-response/destination-location-arn :portkey.aws.datasync.-2018-11-09.describe-task-response/name :portkey.aws.datasync.-2018-11-09/options]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.start-task-execution-request/override-options (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/options))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/start-task-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/task-arn] :opt-un [:portkey.aws.datasync.-2018-11-09.start-task-execution-request/override-options]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.tag-list-entry/key (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-key))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.tag-list-entry/value (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.tag-list-entry/key :portkey.aws.datasync.-2018-11-09.tag-list-entry/value]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/location-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/location-list-entry))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/efs-filesystem-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):elasticfilesystem:[a-z\-0-9]*:[0-9]{12}:file-system/fs-.*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-agent-response/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-agent-response/status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/agent-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-agent-response/last-connection-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-agent-response/creation-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-agent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/agent-arn :portkey.aws.datasync.-2018-11-09.describe-agent-response/name :portkey.aws.datasync.-2018-11-09.describe-agent-response/status :portkey.aws.datasync.-2018-11-09.describe-agent-response/last-connection-time :portkey.aws.datasync.-2018-11-09.describe-agent-response/creation-time]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/cancel-task-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/bytes-transferred (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/long))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/start-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/result (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-execution-result-detail))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-execution-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/bytes-written (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/long))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/estimated-files-to-transfer (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/long))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/estimated-bytes-to-transfer (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/long))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/files-transferred (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/long))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-task-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.describe-task-execution-response/bytes-transferred :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/start-time :portkey.aws.datasync.-2018-11-09/task-execution-arn :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/result :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/status :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/bytes-written :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/estimated-files-to-transfer :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/estimated-bytes-to-transfer :portkey.aws.datasync.-2018-11-09.describe-task-execution-response/files-transferred :portkey.aws.datasync.-2018-11-09/options]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/string))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.invalid-request-exception/error-code (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/string))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.invalid-request-exception/message :portkey.aws.datasync.-2018-11-09.invalid-request-exception/error-code]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.list-tags-for-resource-response/tags :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-list-entry/status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-execution-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-execution-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/task-execution-arn :portkey.aws.datasync.-2018-11-09.task-execution-list-entry/status]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-task-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/task-execution-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/location-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):datasync:[a-z\-0-9]+:[0-9]{12}:location/loc-[0-9a-z]{17}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/subdirectory (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-\./]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-location-efs-response/creation-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-location-efs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn :portkey.aws.datasync.-2018-11-09/location-uri :portkey.aws.datasync.-2018-11-09/ec-2-config :portkey.aws.datasync.-2018-11-09.describe-location-efs-response/creation-time]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-location-s-3-request/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-location-s-3-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/subdirectory :portkey.aws.datasync.-2018-11-09/s-3-bucket-arn :portkey.aws.datasync.-2018-11-09/s-3-config] :opt-un [:portkey.aws.datasync.-2018-11-09.create-location-s-3-request/tags]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-agent-request/agent-name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-agent-request/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-agent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/activation-key] :opt-un [:portkey.aws.datasync.-2018-11-09.create-agent-request/agent-name :portkey.aws.datasync.-2018-11-09.create-agent-request/tags]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/taggable-resource-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.list-tags-for-resource-request/resource-arn] :opt-un [:portkey.aws.datasync.-2018-11-09/max-results :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/max-results :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/cancel-task-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/task-execution-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-agent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/agent-arn]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/server-hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(([a-zA-Z0-9\-]*[a-zA-Z0-9])\.)*([A-Za-z0-9\-]*[A-Za-z0-9])$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.on-prem-config/agent-arns (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/agent-arn-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/on-prem-config (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.on-prem-config/agent-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/delete-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/task-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-execution-status #{"SUCCESS" :preparing "TRANSFERRING" "ERROR" :transferring "PREPARING" :success :error :verifying "VERIFYING" "LAUNCHING" :launching})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/agent-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/agent-list-entry))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-location-efs-request/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-location-efs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/subdirectory :portkey.aws.datasync.-2018-11-09/efs-filesystem-arn :portkey.aws.datasync.-2018-11-09/ec-2-config] :opt-un [:portkey.aws.datasync.-2018-11-09.create-location-efs-request/tags]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-execution-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):datasync:[a-z\-0-9]*:[0-9]{12}:task/task-[0-9a-f]{17}/execution/exec-[0-9a-f]{17}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9\s+=._:/-]{1,128}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/log-group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 562)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):logs:[a-z\-0-9]*:[0-9]{12}:log-group:([^:\*]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/mtime #{"PRESERVE" :preserve "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/task-list-entry))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.list-locations-response/locations (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/location-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-locations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.list-locations-response/locations :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 93)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9=_-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/uid #{"NAME" :int-value :name "NONE" "INT_VALUE" :both "BOTH" :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-location-s-3-response/creation-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-location-s-3-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn :portkey.aws.datasync.-2018-11-09/location-uri :portkey.aws.datasync.-2018-11-09/s-3-config :portkey.aws.datasync.-2018-11-09.describe-location-s-3-response/creation-time]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/verify-mode #{:point-in-time-consistent "NONE" "POINT_IN_TIME_CONSISTENT" :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/iam-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):iam::[0-9]{12}:role/.*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/taggable-resource-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.tag-resource-request/resource-arn :portkey.aws.datasync.-2018-11-09.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.s-3-config/bucket-access-role-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/s-3-config (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.s-3-config/bucket-access-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/tag-list-entry :min-count 0 :max-count 55))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/activation-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 29)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[A-Z0-9]{5}(-[A-Z0-9]{5}){4}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/agent-status #{:offline :online "OFFLINE" "ONLINE"})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/update-agent-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/task-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-task-request/source-location-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/location-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-task-request/destination-location-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/location-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-task-request/cloud-watch-log-group-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/log-group-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-task-request/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-task-request/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.create-task-request/source-location-arn :portkey.aws.datasync.-2018-11-09.create-task-request/destination-location-arn] :opt-un [:portkey.aws.datasync.-2018-11-09.create-task-request/cloud-watch-log-group-arn :portkey.aws.datasync.-2018-11-09.create-task-request/name :portkey.aws.datasync.-2018-11-09/options :portkey.aws.datasync.-2018-11-09.create-task-request/tags]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):datasync:[a-z\-0-9]*:[0-9]{12}:task/task-[0-9a-f]{17}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/update-task-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/delete-agent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/agent-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/preserve-deleted-files #{:remove "REMOVE" "PRESERVE" :preserve})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9\s+=._:/-]{1,256}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/prepare-duration (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/duration))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/prepare-status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/phase-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/transfer-duration (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/duration))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/transfer-status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/phase-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/verify-duration (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/duration))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/verify-status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/phase-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/error-code (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/string))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/error-detail (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/string))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-execution-result-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.task-execution-result-detail/prepare-duration :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/prepare-status :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/transfer-duration :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/transfer-status :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/verify-duration :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/verify-status :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/error-code :portkey.aws.datasync.-2018-11-09.task-execution-result-detail/error-detail]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/start-task-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/task-execution-arn]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.agent-list-entry/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.agent-list-entry/status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/agent-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/agent-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/agent-arn :portkey.aws.datasync.-2018-11-09.agent-list-entry/name :portkey.aws.datasync.-2018-11-09.agent-list-entry/status]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-list-entry/status (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-status))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.task-list-entry/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/task-arn :portkey.aws.datasync.-2018-11-09.task-list-entry/status :portkey.aws.datasync.-2018-11-09.task-list-entry/name]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/posix-permissions #{"PRESERVE" "BEST_EFFORT" :preserve "NONE" :best-effort :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/duration clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-location-s-3-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/location-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/agent-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):datasync:[a-z\-0-9]+:[0-9]{12}:agent/agent-[0-9a-z]{17}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/task-arn]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/delete-agent-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-execution-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/task-execution-list-entry))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.create-location-nfs-request/tags (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-location-nfs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/subdirectory :portkey.aws.datasync.-2018-11-09/server-hostname :portkey.aws.datasync.-2018-11-09/on-prem-config] :opt-un [:portkey.aws.datasync.-2018-11-09.create-location-nfs-request/tags]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/gid #{"NAME" :int-value :name "NONE" "INT_VALUE" :both "BOTH" :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-location-nfs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/location-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.ec-2-config/subnet-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/ec-2-subnet-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.ec-2-config/security-group-arns (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/ec-2-security-group-arn-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/ec-2-config (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.ec-2-config/subnet-arn :portkey.aws.datasync.-2018-11-09.ec-2-config/security-group-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/preserve-devices #{"PRESERVE" :preserve "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-task-executions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/task-arn :portkey.aws.datasync.-2018-11-09/max-results :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/s-3-bucket-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 76)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):s3:::([^/]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/max-results (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/delete-location-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/location-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(efs|nfs|s3)://[a-zA-Z0-9.\-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.list-task-executions-response/task-executions (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/task-execution-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-task-executions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.list-task-executions-response/task-executions :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-location-efs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/location-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/delete-task-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/bytes-per-second clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.update-task-request/name (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-value))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/update-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/task-arn] :opt-un [:portkey.aws.datasync.-2018-11-09/options :portkey.aws.datasync.-2018-11-09.update-task-request/name]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.list-agents-response/agents (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/agent-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-agents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09.list-agents-response/agents :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-location-s-3-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/taggable-resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):datasync:[a-z\-0-9]+:[0-9]{12}:(agent|task|location)/(agent|task|loc)-[0-9a-z]{17}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/delete-location-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/location-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.describe-location-nfs-response/creation-time (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/time))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-location-nfs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn :portkey.aws.datasync.-2018-11-09/location-uri :portkey.aws.datasync.-2018-11-09/on-prem-config :portkey.aws.datasync.-2018-11-09.describe-location-nfs-response/creation-time]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/describe-agent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09/agent-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/location-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn :portkey.aws.datasync.-2018-11-09/location-uri]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-location-nfs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/atime #{"BEST_EFFORT" "NONE" :best-effort :none})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/ec-2-security-group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/task-status #{:creating :unavailable "AVAILABLE" :running "UNAVAILABLE" "CREATING" :available "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/agent-arn-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/agent-arn :min-count 1 :max-count 64))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/create-location-efs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/location-arn]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/taggable-resource-arn))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09.untag-resource-request/keys (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.datasync.-2018-11-09.untag-resource-request/resource-arn :portkey.aws.datasync.-2018-11-09.untag-resource-request/keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/list-locations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/max-results :portkey.aws.datasync.-2018-11-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datasync.-2018-11-09/mtime :portkey.aws.datasync.-2018-11-09/uid :portkey.aws.datasync.-2018-11-09/verify-mode :portkey.aws.datasync.-2018-11-09/preserve-deleted-files :portkey.aws.datasync.-2018-11-09/posix-permissions :portkey.aws.datasync.-2018-11-09/gid :portkey.aws.datasync.-2018-11-09/preserve-devices :portkey.aws.datasync.-2018-11-09/bytes-per-second :portkey.aws.datasync.-2018-11-09/atime]))

(clojure.spec.alpha/def :portkey.aws.datasync.-2018-11-09/ec-2-security-group-arn-list (clojure.spec.alpha/coll-of :portkey.aws.datasync.-2018-11-09/ec-2-security-group-arn :min-count 1 :max-count 5))

(clojure.core/defn tag-resource "Applies a key-value pair to an AWS resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/tag-resource-response))

(clojure.core/defn list-task-executions "Returns a list of executed tasks." ([] (list-task-executions {})) ([list-task-executions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-task-executions-request list-task-executions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/list-task-executions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/list-task-executions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTaskExecutions", :http.request.configuration/output-deser-fn response-list-task-executions-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-task-executions :args (clojure.spec.alpha/? :portkey.aws.datasync.-2018-11-09/list-task-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/list-task-executions-response))

(clojure.core/defn list-locations "Returns a lists of source and destination locations.\n If you have more locations than are returned in a response (that is, the\nresponse returns only a truncated list of your agents), the response contains a\ntoken that you can specify in your next request to fetch the next page of\nlocations." ([] (list-locations {})) ([list-locations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-locations-request list-locations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/list-locations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/list-locations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLocations", :http.request.configuration/output-deser-fn response-list-locations-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-locations :args (clojure.spec.alpha/? :portkey.aws.datasync.-2018-11-09/list-locations-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/list-locations-response))

(clojure.core/defn delete-task "Deletes a task." ([delete-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-task-request delete-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/delete-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/delete-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTask", :http.request.configuration/output-deser-fn response-delete-task-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-task :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/delete-task-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/delete-task-response))

(clojure.core/defn create-location-efs "Creates an endpoint for an Amazon EFS file system." ([create-location-efs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-location-efs-request create-location-efs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/create-location-efs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/create-location-efs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLocationEfs", :http.request.configuration/output-deser-fn response-create-location-efs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-location-efs :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/create-location-efs-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/create-location-efs-response))

(clojure.core/defn start-task-execution "Starts a specific invocation of a task. A TaskExecution value represents an\nindividual run of a task. Each task can have at most one TaskExecution at a\ntime.\n TaskExecution has the following transition phases: INITIALIZING | PREPARING |\nTRANSFERRING | VERIFYING | SUCCESS/FAILURE.\n For detailed information, see Task Execution in Components and Terminology\n(https://docs.aws.amazon.com/sync-service/latest/userguide/how-awssync-works.html#terminology)\nin the AWS DataSync User Guide." ([start-task-execution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-task-execution-request start-task-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/start-task-execution-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/start-task-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartTaskExecution", :http.request.configuration/output-deser-fn response-start-task-execution-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef start-task-execution :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/start-task-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/start-task-execution-response))

(clojure.core/defn list-tasks "Returns a list of all the tasks." ([] (list-tasks {})) ([list-tasks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tasks-request list-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/list-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/list-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTasks", :http.request.configuration/output-deser-fn response-list-tasks-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-tasks :args (clojure.spec.alpha/? :portkey.aws.datasync.-2018-11-09/list-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/list-tasks-response))

(clojure.core/defn create-location-s-3 "Creates an endpoint for an Amazon S3 bucket.\n For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity\nand Access Management (IAM) role that has the required permissions. You can set\nup the required permissions by creating an IAM policy that grants the required\npermissions and attaching the policy to the role. An example of such a policy is\nshown in the examples section. For more information, see Configuring Amazon S3\nLocation Settings\n(https://docs.aws.amazon.com/sync-service/latest/userguide/configuring-s3-locations.html)\nin the AWS DataSync User Guide." ([create-location-s-3-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-location-s-3-request create-location-s-3-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/create-location-s-3-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/create-location-s-3-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLocationS3", :http.request.configuration/output-deser-fn response-create-location-s-3-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-location-s-3 :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/create-location-s-3-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/create-location-s-3-response))

(clojure.core/defn describe-agent "Returns metadata such as the name, the network interfaces, and the status (that\nis, whether the agent is running or not) for an agent. To specify which agent to\ndescribe, use the Amazon Resource Name (ARN) of the agent in your request." ([describe-agent-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-agent-request describe-agent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/describe-agent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/describe-agent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAgent", :http.request.configuration/output-deser-fn response-describe-agent-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-agent :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/describe-agent-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/describe-agent-response))

(clojure.core/defn update-task "Updates the metadata associated with a task." ([update-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-task-request update-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/update-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/update-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTask", :http.request.configuration/output-deser-fn response-update-task-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-task :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/update-task-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/update-task-response))

(clojure.core/defn list-agents "Returns a list of agents owned by an AWS account in the AWS Region specified in\nthe request. The returned list is ordered by agent Amazon Resource Name (ARN).\n By default, this operation returns a maximum of 100 agents. This operation\nsupports pagination that enables you to optionally reduce the number of agents\nreturned in a response.\n If you have more agents than are returned in a response (that is, the response\nreturns only a truncated list of your agents), the response contains a marker\nthat you can specify in your next request to fetch the next page of agents." ([] (list-agents {})) ([list-agents-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-agents-request list-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/list-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/list-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAgents", :http.request.configuration/output-deser-fn response-list-agents-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-agents :args (clojure.spec.alpha/? :portkey.aws.datasync.-2018-11-09/list-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/list-agents-response))

(clojure.core/defn create-agent "Activates an AWS DataSync agent that you have deployed on your host. The\nactivation process associates your agent with your account. In the activation\nprocess, you specify information such as the AWS Region that you want to\nactivate the agent in. You activate the agent in the AWS Region where your\ntarget locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in\nthis AWS Region.\n You can use an agent for more than one location. If a task uses multiple\nagents, all of them need to have status AVAILABLE for the task to run. If you\nuse multiple agents for a source location, the status of all the agents must be\nAVAILABLE for the task to run. For more information, see Activating a Sync Agent\n(https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent)\nin the AWS DataSync User Guide.\n Agents are automatically updated by AWS on a regular basis, using a mechanism\nthat ensures minimal interruption to your tasks." ([create-agent-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-agent-request create-agent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/create-agent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/create-agent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAgent", :http.request.configuration/output-deser-fn response-create-agent-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-agent :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/create-agent-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/create-agent-response))

(clojure.core/defn list-tags-for-resource "Returns all the tags associated with a specified resources." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/list-tags-for-resource-response))

(clojure.core/defn cancel-task-execution "Cancels execution of a task.\n When you cancel a task execution, the transfer of some files are abruptly\ninterrupted. The contents of files that are transferred to the destination might\nbe incomplete or inconsistent with the source files. However, if you start a new\ntask execution on the same task and you allow the task execution to complete,\nfile content on the destination is complete and consistent. This applies to\nother unexpected failures that interrupt a task execution. In all of these\ncases, AWS DataSync successfully complete the transfer when you start the next\ntask execution." ([cancel-task-execution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-task-execution-request cancel-task-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/cancel-task-execution-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/cancel-task-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelTaskExecution", :http.request.configuration/output-deser-fn response-cancel-task-execution-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef cancel-task-execution :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/cancel-task-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/cancel-task-execution-response))

(clojure.core/defn describe-location-efs "Returns metadata, such as the path information about an Amazon EFS location." ([describe-location-efs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-location-efs-request describe-location-efs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/describe-location-efs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/describe-location-efs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLocationEfs", :http.request.configuration/output-deser-fn response-describe-location-efs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-location-efs :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/describe-location-efs-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/describe-location-efs-response))

(clojure.core/defn describe-location-s-3 "Returns metadata, such as bucket name, about an Amazon S3 bucket location." ([describe-location-s-3-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-location-s-3-request describe-location-s-3-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/describe-location-s-3-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/describe-location-s-3-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLocationS3", :http.request.configuration/output-deser-fn response-describe-location-s-3-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-location-s-3 :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/describe-location-s-3-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/describe-location-s-3-response))

(clojure.core/defn describe-location-nfs "Returns metadata, such as the path information, about a NFS location." ([describe-location-nfs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-location-nfs-request describe-location-nfs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/describe-location-nfs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/describe-location-nfs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLocationNfs", :http.request.configuration/output-deser-fn response-describe-location-nfs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-location-nfs :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/describe-location-nfs-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/describe-location-nfs-response))

(clojure.core/defn describe-task "Returns metadata about a task." ([describe-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-task-request describe-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/describe-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/describe-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTask", :http.request.configuration/output-deser-fn response-describe-task-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-task :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/describe-task-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/describe-task-response))

(clojure.core/defn update-agent "Updates the name of an agent." ([update-agent-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-agent-request update-agent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/update-agent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/update-agent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAgent", :http.request.configuration/output-deser-fn response-update-agent-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-agent :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/update-agent-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/update-agent-response))

(clojure.core/defn create-location-nfs "Creates an endpoint for a Network File System (NFS) file system." ([create-location-nfs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-location-nfs-request create-location-nfs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/create-location-nfs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/create-location-nfs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLocationNfs", :http.request.configuration/output-deser-fn response-create-location-nfs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-location-nfs :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/create-location-nfs-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/create-location-nfs-response))

(clojure.core/defn untag-resource "Removes a tag from an AWS resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/untag-resource-response))

(clojure.core/defn create-task "Creates a task. A task is a set of two locations (source and destination) and a\nset of default OverrideOptions that you use to control the behavior of a task.\nIf you don't specify default values for Options when you create a task, AWS\nDataSync populates them with safe service defaults.\n When you initially create a task, it enters the INITIALIZING status and then\nthe CREATING status. In CREATING status, AWS DataSync attempts to mount the\nsource Network File System (NFS) location. The task transitions to the AVAILABLE\nstatus without waiting for the destination location to mount. Instead, AWS\nDataSync mounts a destination before every task execution and then unmounts it\nafter every task execution.\n If an agent that is associated with a source (NFS) location goes offline, the\ntask transitions to the UNAVAILABLE status. If the status of the task remains in\nthe CREATING status for more than a few minutes, it means that your agent might\nbe having trouble mounting the source NFS file system. Check the task's\nErrorCode and ErrorDetail. Mount issues are often caused by either a\nmisconfigured firewall or a mistyped NFS server host name." ([create-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-task-request create-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/create-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/create-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTask", :http.request.configuration/output-deser-fn response-create-task-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-task :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/create-task-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/create-task-response))

(clojure.core/defn delete-location "Deletes the configuration of a location used by AWS DataSync." ([delete-location-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-location-request delete-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/delete-location-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/delete-location-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLocation", :http.request.configuration/output-deser-fn response-delete-location-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-location :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/delete-location-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/delete-location-response))

(clojure.core/defn delete-agent "Deletes an agent. To specify which agent to delete, use the Amazon Resource Name\n(ARN) of the agent in your request. The operation disassociates the agent from\nyour AWS account. However, it doesn't delete the agent virtual machine (VM) from\nyour on-premises environment.\n After you delete an agent, you can't reactivate it and you longer pay software\ncharges for it." ([delete-agent-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-agent-request delete-agent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/delete-agent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/delete-agent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAgent", :http.request.configuration/output-deser-fn response-delete-agent-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-agent :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/delete-agent-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/delete-agent-response))

(clojure.core/defn describe-task-execution "Returns detailed metadata about a task that is being executed." ([describe-task-execution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-task-execution-request describe-task-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.datasync.-2018-11-09/endpoints, :http.request.configuration/target-prefix "FmrsService", :http.request.spec/output-spec :portkey.aws.datasync.-2018-11-09/describe-task-execution-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-11-09", :http.request.configuration/service-id "DataSync", :http.request.spec/input-spec :portkey.aws.datasync.-2018-11-09/describe-task-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTaskExecution", :http.request.configuration/output-deser-fn response-describe-task-execution-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.datasync.-2018-11-09/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-task-execution :args (clojure.spec.alpha/tuple :portkey.aws.datasync.-2018-11-09/describe-task-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.datasync.-2018-11-09/describe-task-execution-response))
