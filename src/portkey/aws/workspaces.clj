(ns portkey.aws.workspaces (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "workspaces", :region "ap-northeast-1"},
    :ssl-common-name "workspaces.ap-northeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "workspaces", :region "eu-west-1"},
    :ssl-common-name "workspaces.eu-west-1.amazonaws.com",
    :endpoint "https://workspaces.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "workspaces", :region "ap-southeast-2"},
    :ssl-common-name "workspaces.ap-southeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "workspaces", :region "sa-east-1"},
    :ssl-common-name "workspaces.sa-east-1.amazonaws.com",
    :endpoint "https://workspaces.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "workspaces", :region "ap-southeast-1"},
    :ssl-common-name "workspaces.ap-southeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "workspaces", :region "ap-northeast-2"},
    :ssl-common-name "workspaces.ap-northeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "workspaces", :region "ca-central-1"},
    :ssl-common-name "workspaces.ca-central-1.amazonaws.com",
    :endpoint "https://workspaces.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "workspaces", :region "eu-central-1"},
    :ssl-common-name "workspaces.eu-central-1.amazonaws.com",
    :endpoint "https://workspaces.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "workspaces", :region "eu-west-2"},
    :ssl-common-name "workspaces.eu-west-2.amazonaws.com",
    :endpoint "https://workspaces.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "workspaces", :region "us-gov-west-1"},
    :ssl-common-name "workspaces.us-gov-west-1.amazonaws.com",
    :endpoint "https://workspaces.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "workspaces", :region "us-west-2"},
    :ssl-common-name "workspaces.us-west-2.amazonaws.com",
    :endpoint "https://workspaces.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "workspaces", :region "us-east-1"},
    :ssl-common-name "workspaces.us-east-1.amazonaws.com",
    :endpoint "https://workspaces.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-workspace-request-list)

(clojure.core/declare ser-workspace-image-id-list)

(clojure.core/declare ser-start-request)

(clojure.core/declare ser-workspace-image-id)

(clojure.core/declare ser-reconnect-enum)

(clojure.core/declare ser-dedicated-tenancy-support-enum)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-ip-rule-item)

(clojure.core/declare ser-ip-rule-desc)

(clojure.core/declare ser-start-workspace-requests)

(clojure.core/declare ser-client-properties)

(clojure.core/declare ser-management-cidr-range-constraint)

(clojure.core/declare ser-workspace-image-description)

(clojure.core/declare ser-reboot-workspace-requests)

(clojure.core/declare ser-compute)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-ip-group-name)

(clojure.core/declare ser-rebuild-request)

(clojure.core/declare ser-terminate-request)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-ec-2-image-id)

(clojure.core/declare ser-ip-group-id-list)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-workspace-image-name)

(clojure.core/declare ser-reboot-request)

(clojure.core/declare ser-root-volume-size-gib)

(clojure.core/declare ser-ip-rule-list)

(clojure.core/declare ser-user-name)

(clojure.core/declare ser-workspace-properties)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-rebuild-workspace-requests)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-stop-workspace-requests)

(clojure.core/declare ser-terminate-workspace-requests)

(clojure.core/declare ser-running-mode)

(clojure.core/declare ser-workspace-request)

(clojure.core/declare ser-running-mode-auto-stop-timeout-in-minutes)

(clojure.core/declare ser-volume-encryption-key)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-ip-group-desc)

(clojure.core/declare ser-bundle-id-list)

(clojure.core/declare ser-bundle-id)

(clojure.core/declare ser-ip-rule)

(clojure.core/declare ser-ip-group-id)

(clojure.core/declare ser-stop-request)

(clojure.core/declare ser-directory-id)

(clojure.core/declare ser-bundle-owner)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-workspace-image-ingestion-process)

(clojure.core/declare ser-resource-id-list)

(clojure.core/declare ser-management-cidr-range-max-results)

(clojure.core/declare ser-dedicated-tenancy-management-cidr-range)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-directory-id-list)

(clojure.core/declare ser-workspace-id)

(clojure.core/declare ser-target-workspace-state)

(clojure.core/declare ser-ip-revoked-rule-list)

(clojure.core/declare ser-workspace-id-list)

(clojure.core/declare ser-user-volume-size-gib)

(clojure.core/defn- ser-workspace-request-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-workspace-request coll) #:http.request.field{:shape "WorkspaceRequest"}))) input), :shape "WorkspaceRequestList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-workspace-image-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-workspace-image-id coll) #:http.request.field{:shape "WorkspaceImageId"}))) input), :shape "WorkspaceImageIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-start-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StartRequest", :type "structure"} (clojure.core/contains? input :workspace-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}))))

(clojure.core/defn- ser-workspace-image-id [input] #:http.request.field{:value input, :shape "WorkspaceImageId"})

(clojure.core/defn- ser-reconnect-enum [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "ReconnectEnum"})

(clojure.core/defn- ser-dedicated-tenancy-support-enum [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "DedicatedTenancySupportEnum"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-ip-rule-item [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IpRuleItem", :type "structure"} (clojure.core/contains? input :ip-rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-rule (input :ip-rule)) #:http.request.field{:name "ipRule", :shape "IpRule"})) (clojure.core/contains? input :rule-desc) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-rule-desc (input :rule-desc)) #:http.request.field{:name "ruleDesc", :shape "IpRuleDesc"}))))

(clojure.core/defn- ser-ip-rule-desc [input] #:http.request.field{:value input, :shape "IpRuleDesc"})

(clojure.core/defn- ser-start-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-start-request coll) #:http.request.field{:shape "StartRequest"}))) input), :shape "StartWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-client-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ClientProperties", :type "structure"} (clojure.core/contains? input :reconnect-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reconnect-enum (input :reconnect-enabled)) #:http.request.field{:name "ReconnectEnabled", :shape "ReconnectEnum"}))))

(clojure.core/defn- ser-management-cidr-range-constraint [input] #:http.request.field{:value input, :shape "ManagementCidrRangeConstraint"})

(clojure.core/defn- ser-workspace-image-description [input] #:http.request.field{:value input, :shape "WorkspaceImageDescription"})

(clojure.core/defn- ser-reboot-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-reboot-request coll) #:http.request.field{:shape "RebootRequest"}))) input), :shape "RebootWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-compute [input] #:http.request.field{:value (clojure.core/get {"VALUE" "VALUE", :performance "PERFORMANCE", :value "VALUE", "POWER" "POWER", :powerpro "POWERPRO", "GRAPHICS" "GRAPHICS", :power "POWER", :graphicspro "GRAPHICSPRO", "STANDARD" "STANDARD", :graphics "GRAPHICS", :standard "STANDARD", "POWERPRO" "POWERPRO", "GRAPHICSPRO" "GRAPHICSPRO", "PERFORMANCE" "PERFORMANCE"} input), :shape "Compute"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-ip-group-name [input] #:http.request.field{:value input, :shape "IpGroupName"})

(clojure.core/defn- ser-rebuild-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workspace-id (:workspace-id input)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"})], :shape "RebuildRequest", :type "structure"}))

(clojure.core/defn- ser-terminate-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workspace-id (:workspace-id input)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"})], :shape "TerminateRequest", :type "structure"}))

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-ec-2-image-id [input] #:http.request.field{:value input, :shape "Ec2ImageId"})

(clojure.core/defn- ser-ip-group-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-group-id coll) #:http.request.field{:shape "IpGroupId"}))) input), :shape "IpGroupIdList", :type "list"})

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-workspace-image-name [input] #:http.request.field{:value input, :shape "WorkspaceImageName"})

(clojure.core/defn- ser-reboot-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workspace-id (:workspace-id input)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"})], :shape "RebootRequest", :type "structure"}))

(clojure.core/defn- ser-root-volume-size-gib [input] #:http.request.field{:value input, :shape "RootVolumeSizeGib"})

(clojure.core/defn- ser-ip-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-rule-item coll) #:http.request.field{:shape "IpRuleItem"}))) input), :shape "IpRuleList", :type "list"})

(clojure.core/defn- ser-user-name [input] #:http.request.field{:value input, :shape "UserName"})

(clojure.core/defn- ser-workspace-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WorkspaceProperties", :type "structure"} (clojure.core/contains? input :running-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-running-mode (input :running-mode)) #:http.request.field{:name "RunningMode", :shape "RunningMode"})) (clojure.core/contains? input :running-mode-auto-stop-timeout-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-running-mode-auto-stop-timeout-in-minutes (input :running-mode-auto-stop-timeout-in-minutes)) #:http.request.field{:name "RunningModeAutoStopTimeoutInMinutes", :shape "RunningModeAutoStopTimeoutInMinutes"})) (clojure.core/contains? input :root-volume-size-gib) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-root-volume-size-gib (input :root-volume-size-gib)) #:http.request.field{:name "RootVolumeSizeGib", :shape "RootVolumeSizeGib"})) (clojure.core/contains? input :user-volume-size-gib) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-volume-size-gib (input :user-volume-size-gib)) #:http.request.field{:name "UserVolumeSizeGib", :shape "UserVolumeSizeGib"})) (clojure.core/contains? input :compute-type-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute (input :compute-type-name)) #:http.request.field{:name "ComputeTypeName", :shape "Compute"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-rebuild-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rebuild-request coll) #:http.request.field{:shape "RebuildRequest"}))) input), :shape "RebuildWorkspaceRequests", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-stop-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stop-request coll) #:http.request.field{:shape "StopRequest"}))) input), :shape "StopWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-terminate-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-terminate-request coll) #:http.request.field{:shape "TerminateRequest"}))) input), :shape "TerminateWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-running-mode [input] #:http.request.field{:value (clojure.core/get {"AUTO_STOP" "AUTO_STOP", :auto-stop "AUTO_STOP", "ALWAYS_ON" "ALWAYS_ON", :always-on "ALWAYS_ON"} input), :shape "RunningMode"})

(clojure.core/defn- ser-workspace-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-directory-id (:directory-id input)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-user-name (:user-name input)) #:http.request.field{:name "UserName", :shape "UserName"}) (clojure.core/into (ser-bundle-id (:bundle-id input)) #:http.request.field{:name "BundleId", :shape "BundleId"})], :shape "WorkspaceRequest", :type "structure"} (clojure.core/contains? input :volume-encryption-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-encryption-key (input :volume-encryption-key)) #:http.request.field{:name "VolumeEncryptionKey", :shape "VolumeEncryptionKey"})) (clojure.core/contains? input :user-volume-encryption-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :user-volume-encryption-enabled)) #:http.request.field{:name "UserVolumeEncryptionEnabled", :shape "BooleanObject"})) (clojure.core/contains? input :root-volume-encryption-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :root-volume-encryption-enabled)) #:http.request.field{:name "RootVolumeEncryptionEnabled", :shape "BooleanObject"})) (clojure.core/contains? input :workspace-properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-properties (input :workspace-properties)) #:http.request.field{:name "WorkspaceProperties", :shape "WorkspaceProperties"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- ser-running-mode-auto-stop-timeout-in-minutes [input] #:http.request.field{:value input, :shape "RunningModeAutoStopTimeoutInMinutes"})

(clojure.core/defn- ser-volume-encryption-key [input] #:http.request.field{:value input, :shape "VolumeEncryptionKey"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-ip-group-desc [input] #:http.request.field{:value input, :shape "IpGroupDesc"})

(clojure.core/defn- ser-bundle-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bundle-id coll) #:http.request.field{:shape "BundleId"}))) input), :shape "BundleIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-bundle-id [input] #:http.request.field{:value input, :shape "BundleId"})

(clojure.core/defn- ser-ip-rule [input] #:http.request.field{:value input, :shape "IpRule"})

(clojure.core/defn- ser-ip-group-id [input] #:http.request.field{:value input, :shape "IpGroupId"})

(clojure.core/defn- ser-stop-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StopRequest", :type "structure"} (clojure.core/contains? input :workspace-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}))))

(clojure.core/defn- ser-directory-id [input] #:http.request.field{:value input, :shape "DirectoryId"})

(clojure.core/defn- ser-bundle-owner [input] #:http.request.field{:value input, :shape "BundleOwner"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-workspace-image-ingestion-process [input] #:http.request.field{:value (clojure.core/get {"BYOL_REGULAR" "BYOL_REGULAR", :byol-regular "BYOL_REGULAR", "BYOL_GRAPHICS" "BYOL_GRAPHICS", :byol-graphics "BYOL_GRAPHICS", "BYOL_GRAPHICSPRO" "BYOL_GRAPHICSPRO", :byol-graphicspro "BYOL_GRAPHICSPRO"} input), :shape "WorkspaceImageIngestionProcess"})

(clojure.core/defn- ser-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "ResourceIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-management-cidr-range-max-results [input] #:http.request.field{:value input, :shape "ManagementCidrRangeMaxResults"})

(clojure.core/defn- ser-dedicated-tenancy-management-cidr-range [input] #:http.request.field{:value input, :shape "DedicatedTenancyManagementCidrRange"})

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-directory-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-directory-id coll) #:http.request.field{:shape "DirectoryId"}))) input), :shape "DirectoryIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-workspace-id [input] #:http.request.field{:value input, :shape "WorkspaceId"})

(clojure.core/defn- ser-target-workspace-state [input] #:http.request.field{:value (clojure.core/get {"AVAILABLE" "AVAILABLE", :available "AVAILABLE", "ADMIN_MAINTENANCE" "ADMIN_MAINTENANCE", :admin-maintenance "ADMIN_MAINTENANCE"} input), :shape "TargetWorkspaceState"})

(clojure.core/defn- ser-ip-revoked-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-rule coll) #:http.request.field{:shape "IpRule"}))) input), :shape "IpRevokedRuleList", :type "list"})

(clojure.core/defn- ser-workspace-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-workspace-id coll) #:http.request.field{:shape "WorkspaceId"}))) input), :shape "WorkspaceIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-user-volume-size-gib [input] #:http.request.field{:value input, :shape "UserVolumeSizeGib"})

(clojure.core/defn- req-describe-workspace-bundles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :bundle-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-id-list (input :bundle-ids)) #:http.request.field{:name "BundleIds", :shape "BundleIdList"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-owner (input :owner)) #:http.request.field{:name "Owner", :shape "BundleOwner"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-authorize-ip-rules-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"}) (clojure.core/into (ser-ip-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRuleList"})]}))

(clojure.core/defn- req-describe-account-modifications-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-list-available-management-cidr-ranges-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-management-cidr-range-constraint (input :management-cidr-range-constraint)) #:http.request.field{:name "ManagementCidrRangeConstraint", :shape "ManagementCidrRangeConstraint"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-management-cidr-range-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ManagementCidrRangeMaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-describe-workspace-directories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id-list (input :directory-ids)) #:http.request.field{:name "DirectoryIds", :shape "DirectoryIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-describe-workspaces-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :workspace-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id-list (input :workspace-ids)) #:http.request.field{:name "WorkspaceIds", :shape "WorkspaceIdList"})) (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})) (clojure.core/contains? input :bundle-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-id (input :bundle-id)) #:http.request.field{:name "BundleId", :shape "BundleId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-stop-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stop-workspace-requests (input :stop-workspace-requests)) #:http.request.field{:name "StopWorkspaceRequests", :shape "StopWorkspaceRequests"})]}))

(clojure.core/defn- req-delete-ip-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"})]}))

(clojure.core/defn- req-update-rules-of-ip-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"}) (clojure.core/into (ser-ip-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRuleList"})]}))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-terminate-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-terminate-workspace-requests (input :terminate-workspace-requests)) #:http.request.field{:name "TerminateWorkspaceRequests", :shape "TerminateWorkspaceRequests"})]}))

(clojure.core/defn- req-rebuild-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rebuild-workspace-requests (input :rebuild-workspace-requests)) #:http.request.field{:name "RebuildWorkspaceRequests", :shape "RebuildWorkspaceRequests"})]}))

(clojure.core/defn- req-modify-workspace-properties-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}) (clojure.core/into (ser-workspace-properties (input :workspace-properties)) #:http.request.field{:name "WorkspaceProperties", :shape "WorkspaceProperties"})]}))

(clojure.core/defn- req-start-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-start-workspace-requests (input :start-workspace-requests)) #:http.request.field{:name "StartWorkspaceRequests", :shape "StartWorkspaceRequests"})]}))

(clojure.core/defn- req-describe-client-properties-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id-list (input :resource-ids)) #:http.request.field{:name "ResourceIds", :shape "ResourceIdList"})]}))

(clojure.core/defn- req-modify-workspace-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}) (clojure.core/into (ser-target-workspace-state (input :workspace-state)) #:http.request.field{:name "WorkspaceState", :shape "TargetWorkspaceState"})]}))

(clojure.core/defn- req-describe-workspace-images-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-image-id-list (input :image-ids)) #:http.request.field{:name "ImageIds", :shape "WorkspaceImageIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Limit"}))))

(clojure.core/defn- req-revoke-ip-rules-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"}) (clojure.core/into (ser-ip-revoked-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRevokedRuleList"})]}))

(clojure.core/defn- req-describe-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-delete-workspace-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-image-id (input :image-id)) #:http.request.field{:name "ImageId", :shape "WorkspaceImageId"})]}))

(clojure.core/defn- req-create-ip-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "IpGroupName"})]} (clojure.core/contains? input :group-desc) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-group-desc (input :group-desc)) #:http.request.field{:name "GroupDesc", :shape "IpGroupDesc"})) (clojure.core/contains? input :user-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRuleList"}))))

(clojure.core/defn- req-describe-workspaces-connection-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :workspace-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id-list (input :workspace-ids)) #:http.request.field{:name "WorkspaceIds", :shape "WorkspaceIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-describe-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-modify-account-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :dedicated-tenancy-support) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dedicated-tenancy-support-enum (input :dedicated-tenancy-support)) #:http.request.field{:name "DedicatedTenancySupport", :shape "DedicatedTenancySupportEnum"})) (clojure.core/contains? input :dedicated-tenancy-management-cidr-range) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dedicated-tenancy-management-cidr-range (input :dedicated-tenancy-management-cidr-range)) #:http.request.field{:name "DedicatedTenancyManagementCidrRange", :shape "DedicatedTenancyManagementCidrRange"}))))

(clojure.core/defn- req-modify-client-properties-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"}) (clojure.core/into (ser-client-properties (input :client-properties)) #:http.request.field{:name "ClientProperties", :shape "ClientProperties"})]}))

(clojure.core/defn- req-associate-ip-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-ip-group-id-list (input :group-ids)) #:http.request.field{:name "GroupIds", :shape "IpGroupIdList"})]}))

(clojure.core/defn- req-create-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-request-list (input :workspaces)) #:http.request.field{:name "Workspaces", :shape "WorkspaceRequestList"})]}))

(clojure.core/defn- req-disassociate-ip-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-ip-group-id-list (input :group-ids)) #:http.request.field{:name "GroupIds", :shape "IpGroupIdList"})]}))

(clojure.core/defn- req-reboot-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-reboot-workspace-requests (input :reboot-workspace-requests)) #:http.request.field{:name "RebootWorkspaceRequests", :shape "RebootWorkspaceRequests"})]}))

(clojure.core/defn- req-import-workspace-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ec-2-image-id (input :ec-2-image-id)) #:http.request.field{:name "Ec2ImageId", :shape "Ec2ImageId"}) (clojure.core/into (ser-workspace-image-ingestion-process (input :ingestion-process)) #:http.request.field{:name "IngestionProcess", :shape "WorkspaceImageIngestionProcess"}) (clojure.core/into (ser-workspace-image-name (input :image-name)) #:http.request.field{:name "ImageName", :shape "WorkspaceImageName"}) (clojure.core/into (ser-workspace-image-description (input :image-description)) #:http.request.field{:name "ImageDescription", :shape "WorkspaceImageDescription"})]}))

(clojure.core/defn- req-describe-ip-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-group-id-list (input :group-ids)) #:http.request.field{:name "GroupIds", :shape "IpGroupIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Limit"}))))

(clojure.core/declare deser-dns-ip-addresses)

(clojure.core/declare deser-workspace-image-id)

(clojure.core/declare deser-reconnect-enum)

(clojure.core/declare deser-workspace-directory)

(clojure.core/declare deser-failed-start-workspace-requests)

(clojure.core/declare deser-default-ou)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-modification-resource-enum)

(clojure.core/declare deser-subnet-ids)

(clojure.core/declare deser-ip-rule-item)

(clojure.core/declare deser-ip-rule-desc)

(clojure.core/declare deser-account-modification-list)

(clojure.core/declare deser-workspaces-ip-groups-list)

(clojure.core/declare deser-workspace-connection-status-list)

(clojure.core/declare deser-failed-create-workspace-requests)

(clojure.core/declare deser-client-properties)

(clojure.core/declare deser-failed-stop-workspace-requests)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-connection-state)

(clojure.core/declare deser-workspace-image-description)

(clojure.core/declare deser-compute)

(clojure.core/declare deser-failed-reboot-workspace-requests)

(clojure.core/declare deser-workspace-bundle)

(clojure.core/declare deser-client-properties-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-alias)

(clojure.core/declare deser-ip-group-name)

(clojure.core/declare deser-bundle-list)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-ip-group-id-list)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-client-properties-result)

(clojure.core/declare deser-workspace-image-name)

(clojure.core/declare deser-workspaces-ip-group)

(clojure.core/declare deser-failed-terminate-workspace-requests)

(clojure.core/declare deser-failed-workspace-change-request)

(clojure.core/declare deser-workspace-directory-type)

(clojure.core/declare deser-root-volume-size-gib)

(clojure.core/declare deser-ip-rule-list)

(clojure.core/declare deser-error-type)

(clojure.core/declare deser-workspace-image-list)

(clojure.core/declare deser-operating-system-type)

(clojure.core/declare deser-user-name)

(clojure.core/declare deser-workspace-properties)

(clojure.core/declare deser-modification-state-enum)

(clojure.core/declare deser-root-storage)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-workspace-image-required-tenancy)

(clojure.core/declare deser-dedicated-tenancy-support-result-enum)

(clojure.core/declare deser-running-mode)

(clojure.core/declare deser-dedicated-tenancy-modification-state-enum)

(clojure.core/declare deser-workspace-request)

(clojure.core/declare deser-workspace-state)

(clojure.core/declare deser-running-mode-auto-stop-timeout-in-minutes)

(clojure.core/declare deser-volume-encryption-key)

(clojure.core/declare deser-dedicated-tenancy-cidr-range-list)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-modification-state-list)

(clojure.core/declare deser-failed-rebuild-workspace-requests)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-workspace)

(clojure.core/declare deser-workspace-list)

(clojure.core/declare deser-ip-group-desc)

(clojure.core/declare deser-failed-create-workspace-request)

(clojure.core/declare deser-bundle-id)

(clojure.core/declare deser-default-workspace-creation-properties)

(clojure.core/declare deser-ip-rule)

(clojure.core/declare deser-modification-state)

(clojure.core/declare deser-workspace-image-error-code)

(clojure.core/declare deser-ip-group-id)

(clojure.core/declare deser-workspace-error-code)

(clojure.core/declare deser-directory-list)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-directory-id)

(clojure.core/declare deser-bundle-owner)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-workspace-image)

(clojure.core/declare deser-directory-name)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-compute-type)

(clojure.core/declare deser-workspace-image-state)

(clojure.core/declare deser-account-modification)

(clojure.core/declare deser-dedicated-tenancy-management-cidr-range)

(clojure.core/declare deser-boolean-object)

(clojure.core/declare deser-computer-name)

(clojure.core/declare deser-workspace-id)

(clojure.core/declare deser-workspace-directory-state)

(clojure.core/declare deser-operating-system)

(clojure.core/declare deser-user-volume-size-gib)

(clojure.core/declare deser-user-storage)

(clojure.core/declare deser-registration-code)

(clojure.core/declare deser-workspace-connection-status)

(clojure.core/defn- deser-dns-ip-addresses [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address coll))) input))

(clojure.core/defn- deser-workspace-image-id [input] input)

(clojure.core/defn- deser-reconnect-enum [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-workspace-directory [input] (clojure.core/cond-> {} (clojure.core/contains? input "DnsIpAddresses") (clojure.core/assoc :dns-ip-addresses (deser-dns-ip-addresses (input "DnsIpAddresses"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (input "SubnetIds"))) (clojure.core/contains? input "IamRoleId") (clojure.core/assoc :iam-role-id (deser-arn (input "IamRoleId"))) (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-alias (input "Alias"))) (clojure.core/contains? input "WorkspaceSecurityGroupId") (clojure.core/assoc :workspace-security-group-id (deser-security-group-id (input "WorkspaceSecurityGroupId"))) (clojure.core/contains? input "CustomerUserName") (clojure.core/assoc :customer-user-name (deser-user-name (input "CustomerUserName"))) (clojure.core/contains? input "DirectoryType") (clojure.core/assoc :directory-type (deser-workspace-directory-type (input "DirectoryType"))) (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "ipGroupIds") (clojure.core/assoc :ip-group-ids (deser-ip-group-id-list (input "ipGroupIds"))) (clojure.core/contains? input "DirectoryName") (clojure.core/assoc :directory-name (deser-directory-name (input "DirectoryName"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-workspace-directory-state (input "State"))) (clojure.core/contains? input "WorkspaceCreationProperties") (clojure.core/assoc :workspace-creation-properties (deser-default-workspace-creation-properties (input "WorkspaceCreationProperties"))) (clojure.core/contains? input "RegistrationCode") (clojure.core/assoc :registration-code (deser-registration-code (input "RegistrationCode")))))

(clojure.core/defn- deser-failed-start-workspace-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-workspace-change-request coll))) input))

(clojure.core/defn- deser-default-ou [input] input)

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-modification-resource-enum [input] (clojure.core/get {"ROOT_VOLUME" :root-volume, "USER_VOLUME" :user-volume, "COMPUTE_TYPE" :compute-type} input))

(clojure.core/defn- deser-subnet-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-ip-rule-item [input] (clojure.core/cond-> {} (clojure.core/contains? input "ipRule") (clojure.core/assoc :ip-rule (deser-ip-rule (input "ipRule"))) (clojure.core/contains? input "ruleDesc") (clojure.core/assoc :rule-desc (deser-ip-rule-desc (input "ruleDesc")))))

(clojure.core/defn- deser-ip-rule-desc [input] input)

(clojure.core/defn- deser-account-modification-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-modification coll))) input))

(clojure.core/defn- deser-workspaces-ip-groups-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workspaces-ip-group coll))) input))

(clojure.core/defn- deser-workspace-connection-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workspace-connection-status coll))) input))

(clojure.core/defn- deser-failed-create-workspace-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-create-workspace-request coll))) input))

(clojure.core/defn- deser-client-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReconnectEnabled") (clojure.core/assoc :reconnect-enabled (deser-reconnect-enum (input "ReconnectEnabled")))))

(clojure.core/defn- deser-failed-stop-workspace-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-workspace-change-request coll))) input))

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-connection-state [input] (clojure.core/get {"CONNECTED" :connected, "DISCONNECTED" :disconnected, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-workspace-image-description [input] input)

(clojure.core/defn- deser-compute [input] (clojure.core/get {"VALUE" :value, "STANDARD" :standard, "PERFORMANCE" :performance, "POWER" :power, "GRAPHICS" :graphics, "POWERPRO" :powerpro, "GRAPHICSPRO" :graphicspro} input))

(clojure.core/defn- deser-failed-reboot-workspace-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-workspace-change-request coll))) input))

(clojure.core/defn- deser-workspace-bundle [input] (clojure.core/cond-> {} (clojure.core/contains? input "BundleId") (clojure.core/assoc :bundle-id (deser-bundle-id (input "BundleId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-empty-string (input "Name"))) (clojure.core/contains? input "Owner") (clojure.core/assoc :owner (deser-bundle-owner (input "Owner"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "RootStorage") (clojure.core/assoc :root-storage (deser-root-storage (input "RootStorage"))) (clojure.core/contains? input "UserStorage") (clojure.core/assoc :user-storage (deser-user-storage (input "UserStorage"))) (clojure.core/contains? input "ComputeType") (clojure.core/assoc :compute-type (deser-compute-type (input "ComputeType")))))

(clojure.core/defn- deser-client-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-client-properties-result coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-alias [input] input)

(clojure.core/defn- deser-ip-group-name [input] input)

(clojure.core/defn- deser-bundle-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workspace-bundle coll))) input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-ip-group-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-group-id coll))) input))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-client-properties-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-non-empty-string (input "ResourceId"))) (clojure.core/contains? input "ClientProperties") (clojure.core/assoc :client-properties (deser-client-properties (input "ClientProperties")))))

(clojure.core/defn- deser-workspace-image-name [input] input)

(clojure.core/defn- deser-workspaces-ip-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "groupId") (clojure.core/assoc :group-id (deser-ip-group-id (input "groupId"))) (clojure.core/contains? input "groupName") (clojure.core/assoc :group-name (deser-ip-group-name (input "groupName"))) (clojure.core/contains? input "groupDesc") (clojure.core/assoc :group-desc (deser-ip-group-desc (input "groupDesc"))) (clojure.core/contains? input "userRules") (clojure.core/assoc :user-rules (deser-ip-rule-list (input "userRules")))))

(clojure.core/defn- deser-failed-terminate-workspace-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-workspace-change-request coll))) input))

(clojure.core/defn- deser-failed-workspace-change-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "WorkspaceId") (clojure.core/assoc :workspace-id (deser-workspace-id (input "WorkspaceId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-type (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description (input "ErrorMessage")))))

(clojure.core/defn- deser-workspace-directory-type [input] (clojure.core/get {"SIMPLE_AD" :simple-ad, "AD_CONNECTOR" :ad-connector} input))

(clojure.core/defn- deser-root-volume-size-gib [input] input)

(clojure.core/defn- deser-ip-rule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-rule-item coll))) input))

(clojure.core/defn- deser-error-type [input] input)

(clojure.core/defn- deser-workspace-image-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workspace-image coll))) input))

(clojure.core/defn- deser-operating-system-type [input] (clojure.core/get {"WINDOWS" :windows, "LINUX" :linux} input))

(clojure.core/defn- deser-user-name [input] input)

(clojure.core/defn- deser-workspace-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "RunningMode") (clojure.core/assoc :running-mode (deser-running-mode (input "RunningMode"))) (clojure.core/contains? input "RunningModeAutoStopTimeoutInMinutes") (clojure.core/assoc :running-mode-auto-stop-timeout-in-minutes (deser-running-mode-auto-stop-timeout-in-minutes (input "RunningModeAutoStopTimeoutInMinutes"))) (clojure.core/contains? input "RootVolumeSizeGib") (clojure.core/assoc :root-volume-size-gib (deser-root-volume-size-gib (input "RootVolumeSizeGib"))) (clojure.core/contains? input "UserVolumeSizeGib") (clojure.core/assoc :user-volume-size-gib (deser-user-volume-size-gib (input "UserVolumeSizeGib"))) (clojure.core/contains? input "ComputeTypeName") (clojure.core/assoc :compute-type-name (deser-compute (input "ComputeTypeName")))))

(clojure.core/defn- deser-modification-state-enum [input] (clojure.core/get {"UPDATE_INITIATED" :update-initiated, "UPDATE_IN_PROGRESS" :update-in-progress} input))

(clojure.core/defn- deser-root-storage [input] (clojure.core/cond-> {} (clojure.core/contains? input "Capacity") (clojure.core/assoc :capacity (deser-non-empty-string (input "Capacity")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-workspace-image-required-tenancy [input] (clojure.core/get {"DEFAULT" :default, "DEDICATED" :dedicated} input))

(clojure.core/defn- deser-dedicated-tenancy-support-result-enum [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-running-mode [input] (clojure.core/get {"AUTO_STOP" :auto-stop, "ALWAYS_ON" :always-on} input))

(clojure.core/defn- deser-dedicated-tenancy-modification-state-enum [input] (clojure.core/get {"PENDING" :pending, "COMPLETED" :completed, "FAILED" :failed} input))

(clojure.core/defn- deser-workspace-request [input] (clojure.core/cond-> {:directory-id (deser-directory-id (input "DirectoryId")), :user-name (deser-user-name (input "UserName")), :bundle-id (deser-bundle-id (input "BundleId"))} (clojure.core/contains? input "VolumeEncryptionKey") (clojure.core/assoc :volume-encryption-key (deser-volume-encryption-key (input "VolumeEncryptionKey"))) (clojure.core/contains? input "UserVolumeEncryptionEnabled") (clojure.core/assoc :user-volume-encryption-enabled (deser-boolean-object (input "UserVolumeEncryptionEnabled"))) (clojure.core/contains? input "RootVolumeEncryptionEnabled") (clojure.core/assoc :root-volume-encryption-enabled (deser-boolean-object (input "RootVolumeEncryptionEnabled"))) (clojure.core/contains? input "WorkspaceProperties") (clojure.core/assoc :workspace-properties (deser-workspace-properties (input "WorkspaceProperties"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags")))))

(clojure.core/defn- deser-workspace-state [input] (clojure.core/get {"MAINTENANCE" :maintenance, "AVAILABLE" :available, "UPDATING" :updating, "REBOOTING" :rebooting, "TERMINATED" :terminated, "PENDING" :pending, "ERROR" :error, "REBUILDING" :rebuilding, "STOPPED" :stopped, "STARTING" :starting, "ADMIN_MAINTENANCE" :admin-maintenance, "IMPAIRED" :impaired, "STOPPING" :stopping, "TERMINATING" :terminating, "SUSPENDED" :suspended, "UNHEALTHY" :unhealthy} input))

(clojure.core/defn- deser-running-mode-auto-stop-timeout-in-minutes [input] input)

(clojure.core/defn- deser-volume-encryption-key [input] input)

(clojure.core/defn- deser-dedicated-tenancy-cidr-range-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dedicated-tenancy-management-cidr-range coll))) input))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-modification-state-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-modification-state coll))) input))

(clojure.core/defn- deser-failed-rebuild-workspace-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-workspace-change-request coll))) input))

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-workspace [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (input "SubnetId"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description (input "ErrorMessage"))) (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-user-name (input "UserName"))) (clojure.core/contains? input "WorkspaceProperties") (clojure.core/assoc :workspace-properties (deser-workspace-properties (input "WorkspaceProperties"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-workspace-error-code (input "ErrorCode"))) (clojure.core/contains? input "ModificationStates") (clojure.core/assoc :modification-states (deser-modification-state-list (input "ModificationStates"))) (clojure.core/contains? input "VolumeEncryptionKey") (clojure.core/assoc :volume-encryption-key (deser-volume-encryption-key (input "VolumeEncryptionKey"))) (clojure.core/contains? input "BundleId") (clojure.core/assoc :bundle-id (deser-bundle-id (input "BundleId"))) (clojure.core/contains? input "UserVolumeEncryptionEnabled") (clojure.core/assoc :user-volume-encryption-enabled (deser-boolean-object (input "UserVolumeEncryptionEnabled"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-directory-id (input "DirectoryId"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-workspace-state (input "State"))) (clojure.core/contains? input "RootVolumeEncryptionEnabled") (clojure.core/assoc :root-volume-encryption-enabled (deser-boolean-object (input "RootVolumeEncryptionEnabled"))) (clojure.core/contains? input "ComputerName") (clojure.core/assoc :computer-name (deser-computer-name (input "ComputerName"))) (clojure.core/contains? input "WorkspaceId") (clojure.core/assoc :workspace-id (deser-workspace-id (input "WorkspaceId")))))

(clojure.core/defn- deser-workspace-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workspace coll))) input))

(clojure.core/defn- deser-ip-group-desc [input] input)

(clojure.core/defn- deser-failed-create-workspace-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "WorkspaceRequest") (clojure.core/assoc :workspace-request (deser-workspace-request (input "WorkspaceRequest"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-type (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description (input "ErrorMessage")))))

(clojure.core/defn- deser-bundle-id [input] input)

(clojure.core/defn- deser-default-workspace-creation-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "EnableWorkDocs") (clojure.core/assoc :enable-work-docs (deser-boolean-object (input "EnableWorkDocs"))) (clojure.core/contains? input "EnableInternetAccess") (clojure.core/assoc :enable-internet-access (deser-boolean-object (input "EnableInternetAccess"))) (clojure.core/contains? input "DefaultOu") (clojure.core/assoc :default-ou (deser-default-ou (input "DefaultOu"))) (clojure.core/contains? input "CustomSecurityGroupId") (clojure.core/assoc :custom-security-group-id (deser-security-group-id (input "CustomSecurityGroupId"))) (clojure.core/contains? input "UserEnabledAsLocalAdministrator") (clojure.core/assoc :user-enabled-as-local-administrator (deser-boolean-object (input "UserEnabledAsLocalAdministrator")))))

(clojure.core/defn- deser-ip-rule [input] input)

(clojure.core/defn- deser-modification-state [input] (clojure.core/cond-> {} (clojure.core/contains? input "Resource") (clojure.core/assoc :resource (deser-modification-resource-enum (input "Resource"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-modification-state-enum (input "State")))))

(clojure.core/defn- deser-workspace-image-error-code [input] input)

(clojure.core/defn- deser-ip-group-id [input] input)

(clojure.core/defn- deser-workspace-error-code [input] input)

(clojure.core/defn- deser-directory-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workspace-directory coll))) input))

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-directory-id [input] input)

(clojure.core/defn- deser-bundle-owner [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-workspace-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "ImageId") (clojure.core/assoc :image-id (deser-workspace-image-id (input "ImageId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-workspace-image-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-workspace-image-description (input "Description"))) (clojure.core/contains? input "OperatingSystem") (clojure.core/assoc :operating-system (deser-operating-system (input "OperatingSystem"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-workspace-image-state (input "State"))) (clojure.core/contains? input "RequiredTenancy") (clojure.core/assoc :required-tenancy (deser-workspace-image-required-tenancy (input "RequiredTenancy"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-workspace-image-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description (input "ErrorMessage")))))

(clojure.core/defn- deser-directory-name [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-compute-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-compute (input "Name")))))

(clojure.core/defn- deser-workspace-image-state [input] (clojure.core/get {"AVAILABLE" :available, "PENDING" :pending, "ERROR" :error} input))

(clojure.core/defn- deser-account-modification [input] (clojure.core/cond-> {} (clojure.core/contains? input "ModificationState") (clojure.core/assoc :modification-state (deser-dedicated-tenancy-modification-state-enum (input "ModificationState"))) (clojure.core/contains? input "DedicatedTenancySupport") (clojure.core/assoc :dedicated-tenancy-support (deser-dedicated-tenancy-support-result-enum (input "DedicatedTenancySupport"))) (clojure.core/contains? input "DedicatedTenancyManagementCidrRange") (clojure.core/assoc :dedicated-tenancy-management-cidr-range (deser-dedicated-tenancy-management-cidr-range (input "DedicatedTenancyManagementCidrRange"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-workspace-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-description (input "ErrorMessage")))))

(clojure.core/defn- deser-dedicated-tenancy-management-cidr-range [input] input)

(clojure.core/defn- deser-boolean-object [input] input)

(clojure.core/defn- deser-computer-name [input] input)

(clojure.core/defn- deser-workspace-id [input] input)

(clojure.core/defn- deser-workspace-directory-state [input] (clojure.core/get {"REGISTERING" :registering, "REGISTERED" :registered, "DEREGISTERING" :deregistering, "DEREGISTERED" :deregistered, "ERROR" :error} input))

(clojure.core/defn- deser-operating-system [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-operating-system-type (input "Type")))))

(clojure.core/defn- deser-user-volume-size-gib [input] input)

(clojure.core/defn- deser-user-storage [input] (clojure.core/cond-> {} (clojure.core/contains? input "Capacity") (clojure.core/assoc :capacity (deser-non-empty-string (input "Capacity")))))

(clojure.core/defn- deser-registration-code [input] input)

(clojure.core/defn- deser-workspace-connection-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "WorkspaceId") (clojure.core/assoc :workspace-id (deser-workspace-id (input "WorkspaceId"))) (clojure.core/contains? input "ConnectionState") (clojure.core/assoc :connection-state (deser-connection-state (input "ConnectionState"))) (clojure.core/contains? input "ConnectionStateCheckTimestamp") (clojure.core/assoc :connection-state-check-timestamp (deser-timestamp (input "ConnectionStateCheckTimestamp"))) (clojure.core/contains? input "LastKnownUserConnectionTimestamp") (clojure.core/assoc :last-known-user-connection-timestamp (deser-timestamp (input "LastKnownUserConnectionTimestamp")))))

(clojure.core/defn- response-describe-account-result ([input] (response-describe-account-result nil input)) ([resultWrapper2167418 input] (clojure.core/let [rawinput2167417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167419 {"DedicatedTenancySupport" (rawinput2167417 "DedicatedTenancySupport"), "DedicatedTenancyManagementCidrRange" (rawinput2167417 "DedicatedTenancyManagementCidrRange")}] (clojure.core/cond-> {} (letvar2167419 "DedicatedTenancySupport") (clojure.core/assoc :dedicated-tenancy-support (deser-dedicated-tenancy-support-result-enum (clojure.core/get-in letvar2167419 ["DedicatedTenancySupport"]))) (letvar2167419 "DedicatedTenancyManagementCidrRange") (clojure.core/assoc :dedicated-tenancy-management-cidr-range (deser-dedicated-tenancy-management-cidr-range (clojure.core/get-in letvar2167419 ["DedicatedTenancyManagementCidrRange"])))))))

(clojure.core/defn- response-update-rules-of-ip-group-result ([input] (response-update-rules-of-ip-group-result nil input)) ([resultWrapper2167421 input] (clojure.core/let [rawinput2167420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167422 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-values-exception ([input] (response-invalid-parameter-values-exception nil input)) ([resultWrapper2167424 input] (clojure.core/let [rawinput2167423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167425 {"message" (rawinput2167423 "message")}] (clojure.core/cond-> {} (letvar2167425 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167425 ["message"])))))))

(clojure.core/defn- response-delete-tags-result ([input] (response-delete-tags-result nil input)) ([resultWrapper2167427 input] (clojure.core/let [rawinput2167426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167428 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-workspaces-connection-status-result ([input] (response-describe-workspaces-connection-status-result nil input)) ([resultWrapper2167430 input] (clojure.core/let [rawinput2167429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167431 {"WorkspacesConnectionStatus" (rawinput2167429 "WorkspacesConnectionStatus"), "NextToken" (rawinput2167429 "NextToken")}] (clojure.core/cond-> {} (letvar2167431 "WorkspacesConnectionStatus") (clojure.core/assoc :workspaces-connection-status (deser-workspace-connection-status-list (clojure.core/get-in letvar2167431 ["WorkspacesConnectionStatus"]))) (letvar2167431 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167431 ["NextToken"])))))))

(clojure.core/defn- response-associate-ip-groups-result ([input] (response-associate-ip-groups-result nil input)) ([resultWrapper2167433 input] (clojure.core/let [rawinput2167432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167434 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-terminate-workspaces-result ([input] (response-terminate-workspaces-result nil input)) ([resultWrapper2167436 input] (clojure.core/let [rawinput2167435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167437 {"FailedRequests" (rawinput2167435 "FailedRequests")}] (clojure.core/cond-> {} (letvar2167437 "FailedRequests") (clojure.core/assoc :failed-requests (deser-failed-terminate-workspace-requests (clojure.core/get-in letvar2167437 ["FailedRequests"])))))))

(clojure.core/defn- response-resource-creation-failed-exception ([input] (response-resource-creation-failed-exception nil input)) ([resultWrapper2167439 input] (clojure.core/let [rawinput2167438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167440 {"message" (rawinput2167438 "message")}] (clojure.core/cond-> {} (letvar2167440 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167440 ["message"])))))))

(clojure.core/defn- response-describe-workspace-bundles-result ([input] (response-describe-workspace-bundles-result nil input)) ([resultWrapper2167442 input] (clojure.core/let [rawinput2167441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167443 {"Bundles" (rawinput2167441 "Bundles"), "NextToken" (rawinput2167441 "NextToken")}] (clojure.core/cond-> {} (letvar2167443 "Bundles") (clojure.core/assoc :bundles (deser-bundle-list (clojure.core/get-in letvar2167443 ["Bundles"]))) (letvar2167443 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167443 ["NextToken"])))))))

(clojure.core/defn- response-operation-in-progress-exception ([input] (response-operation-in-progress-exception nil input)) ([resultWrapper2167445 input] (clojure.core/let [rawinput2167444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167446 {"message" (rawinput2167444 "message")}] (clojure.core/cond-> {} (letvar2167446 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167446 ["message"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper2167448 input] (clojure.core/let [rawinput2167447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167449 {"message" (rawinput2167447 "message")}] (clojure.core/cond-> {} (letvar2167449 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167449 ["message"])))))))

(clojure.core/defn- response-delete-ip-group-result ([input] (response-delete-ip-group-result nil input)) ([resultWrapper2167451 input] (clojure.core/let [rawinput2167450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167452 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-revoke-ip-rules-result ([input] (response-revoke-ip-rules-result nil input)) ([resultWrapper2167454 input] (clojure.core/let [rawinput2167453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167455 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-import-workspace-image-result ([input] (response-import-workspace-image-result nil input)) ([resultWrapper2167457 input] (clojure.core/let [rawinput2167456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167458 {"ImageId" (rawinput2167456 "ImageId")}] (clojure.core/cond-> {} (letvar2167458 "ImageId") (clojure.core/assoc :image-id (deser-workspace-image-id (clojure.core/get-in letvar2167458 ["ImageId"])))))))

(clojure.core/defn- response-describe-tags-result ([input] (response-describe-tags-result nil input)) ([resultWrapper2167460 input] (clojure.core/let [rawinput2167459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167461 {"TagList" (rawinput2167459 "TagList")}] (clojure.core/cond-> {} (letvar2167461 "TagList") (clojure.core/assoc :tag-list (deser-tag-list (clojure.core/get-in letvar2167461 ["TagList"])))))))

(clojure.core/defn- response-rebuild-workspaces-result ([input] (response-rebuild-workspaces-result nil input)) ([resultWrapper2167463 input] (clojure.core/let [rawinput2167462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167464 {"FailedRequests" (rawinput2167462 "FailedRequests")}] (clojure.core/cond-> {} (letvar2167464 "FailedRequests") (clojure.core/assoc :failed-requests (deser-failed-rebuild-workspace-requests (clojure.core/get-in letvar2167464 ["FailedRequests"])))))))

(clojure.core/defn- response-describe-account-modifications-result ([input] (response-describe-account-modifications-result nil input)) ([resultWrapper2167466 input] (clojure.core/let [rawinput2167465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167467 {"AccountModifications" (rawinput2167465 "AccountModifications"), "NextToken" (rawinput2167465 "NextToken")}] (clojure.core/cond-> {} (letvar2167467 "AccountModifications") (clojure.core/assoc :account-modifications (deser-account-modification-list (clojure.core/get-in letvar2167467 ["AccountModifications"]))) (letvar2167467 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167467 ["NextToken"])))))))

(clojure.core/defn- response-stop-workspaces-result ([input] (response-stop-workspaces-result nil input)) ([resultWrapper2167469 input] (clojure.core/let [rawinput2167468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167470 {"FailedRequests" (rawinput2167468 "FailedRequests")}] (clojure.core/cond-> {} (letvar2167470 "FailedRequests") (clojure.core/assoc :failed-requests (deser-failed-stop-workspace-requests (clojure.core/get-in letvar2167470 ["FailedRequests"])))))))

(clojure.core/defn- response-modify-client-properties-result ([input] (response-modify-client-properties-result nil input)) ([resultWrapper2167472 input] (clojure.core/let [rawinput2167471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167473 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-associated-exception ([input] (response-resource-associated-exception nil input)) ([resultWrapper2167475 input] (clojure.core/let [rawinput2167474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167476 {"message" (rawinput2167474 "message")}] (clojure.core/cond-> {} (letvar2167476 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167476 ["message"])))))))

(clojure.core/defn- response-describe-workspace-images-result ([input] (response-describe-workspace-images-result nil input)) ([resultWrapper2167478 input] (clojure.core/let [rawinput2167477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167479 {"Images" (rawinput2167477 "Images"), "NextToken" (rawinput2167477 "NextToken")}] (clojure.core/cond-> {} (letvar2167479 "Images") (clojure.core/assoc :images (deser-workspace-image-list (clojure.core/get-in letvar2167479 ["Images"]))) (letvar2167479 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167479 ["NextToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper2167481 input] (clojure.core/let [rawinput2167480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167482 {"message" (rawinput2167480 "message"), "ResourceId" (rawinput2167480 "ResourceId")}] (clojure.core/cond-> {} (letvar2167482 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167482 ["message"]))) (letvar2167482 "ResourceId") (clojure.core/assoc :resource-id (deser-non-empty-string (clojure.core/get-in letvar2167482 ["ResourceId"])))))))

(clojure.core/defn- response-delete-workspace-image-result ([input] (response-delete-workspace-image-result nil input)) ([resultWrapper2167484 input] (clojure.core/let [rawinput2167483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167485 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reboot-workspaces-result ([input] (response-reboot-workspaces-result nil input)) ([resultWrapper2167487 input] (clojure.core/let [rawinput2167486 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167488 {"FailedRequests" (rawinput2167486 "FailedRequests")}] (clojure.core/cond-> {} (letvar2167488 "FailedRequests") (clojure.core/assoc :failed-requests (deser-failed-reboot-workspace-requests (clojure.core/get-in letvar2167488 ["FailedRequests"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper2167490 input] (clojure.core/let [rawinput2167489 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167491 {"message" (rawinput2167489 "message")}] (clojure.core/cond-> {} (letvar2167491 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167491 ["message"])))))))

(clojure.core/defn- response-operation-not-supported-exception ([input] (response-operation-not-supported-exception nil input)) ([resultWrapper2167493 input] (clojure.core/let [rawinput2167492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167494 {"message" (rawinput2167492 "message")}] (clojure.core/cond-> {} (letvar2167494 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167494 ["message"])))))))

(clojure.core/defn- response-create-tags-result ([input] (response-create-tags-result nil input)) ([resultWrapper2167496 input] (clojure.core/let [rawinput2167495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167497 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-workspaces-result ([input] (response-start-workspaces-result nil input)) ([resultWrapper2167499 input] (clojure.core/let [rawinput2167498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167500 {"FailedRequests" (rawinput2167498 "FailedRequests")}] (clojure.core/cond-> {} (letvar2167500 "FailedRequests") (clojure.core/assoc :failed-requests (deser-failed-start-workspace-requests (clojure.core/get-in letvar2167500 ["FailedRequests"])))))))

(clojure.core/defn- response-create-workspaces-result ([input] (response-create-workspaces-result nil input)) ([resultWrapper2167502 input] (clojure.core/let [rawinput2167501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167503 {"FailedRequests" (rawinput2167501 "FailedRequests"), "PendingRequests" (rawinput2167501 "PendingRequests")}] (clojure.core/cond-> {} (letvar2167503 "FailedRequests") (clojure.core/assoc :failed-requests (deser-failed-create-workspace-requests (clojure.core/get-in letvar2167503 ["FailedRequests"]))) (letvar2167503 "PendingRequests") (clojure.core/assoc :pending-requests (deser-workspace-list (clojure.core/get-in letvar2167503 ["PendingRequests"])))))))

(clojure.core/defn- response-resource-limit-exceeded-exception ([input] (response-resource-limit-exceeded-exception nil input)) ([resultWrapper2167505 input] (clojure.core/let [rawinput2167504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167506 {"message" (rawinput2167504 "message")}] (clojure.core/cond-> {} (letvar2167506 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167506 ["message"])))))))

(clojure.core/defn- response-describe-workspace-directories-result ([input] (response-describe-workspace-directories-result nil input)) ([resultWrapper2167508 input] (clojure.core/let [rawinput2167507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167509 {"Directories" (rawinput2167507 "Directories"), "NextToken" (rawinput2167507 "NextToken")}] (clojure.core/cond-> {} (letvar2167509 "Directories") (clojure.core/assoc :directories (deser-directory-list (clojure.core/get-in letvar2167509 ["Directories"]))) (letvar2167509 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167509 ["NextToken"])))))))

(clojure.core/defn- response-invalid-resource-state-exception ([input] (response-invalid-resource-state-exception nil input)) ([resultWrapper2167511 input] (clojure.core/let [rawinput2167510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167512 {"message" (rawinput2167510 "message")}] (clojure.core/cond-> {} (letvar2167512 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167512 ["message"])))))))

(clojure.core/defn- response-create-ip-group-result ([input] (response-create-ip-group-result nil input)) ([resultWrapper2167514 input] (clojure.core/let [rawinput2167513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167515 {"GroupId" (rawinput2167513 "GroupId")}] (clojure.core/cond-> {} (letvar2167515 "GroupId") (clojure.core/assoc :group-id (deser-ip-group-id (clojure.core/get-in letvar2167515 ["GroupId"])))))))

(clojure.core/defn- response-describe-client-properties-result ([input] (response-describe-client-properties-result nil input)) ([resultWrapper2167517 input] (clojure.core/let [rawinput2167516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167518 {"ClientPropertiesList" (rawinput2167516 "ClientPropertiesList")}] (clojure.core/cond-> {} (letvar2167518 "ClientPropertiesList") (clojure.core/assoc :client-properties-list (deser-client-properties-list (clojure.core/get-in letvar2167518 ["ClientPropertiesList"])))))))

(clojure.core/defn- response-disassociate-ip-groups-result ([input] (response-disassociate-ip-groups-result nil input)) ([resultWrapper2167520 input] (clojure.core/let [rawinput2167519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167521 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-available-management-cidr-ranges-result ([input] (response-list-available-management-cidr-ranges-result nil input)) ([resultWrapper2167523 input] (clojure.core/let [rawinput2167522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167524 {"ManagementCidrRanges" (rawinput2167522 "ManagementCidrRanges"), "NextToken" (rawinput2167522 "NextToken")}] (clojure.core/cond-> {} (letvar2167524 "ManagementCidrRanges") (clojure.core/assoc :management-cidr-ranges (deser-dedicated-tenancy-cidr-range-list (clojure.core/get-in letvar2167524 ["ManagementCidrRanges"]))) (letvar2167524 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167524 ["NextToken"])))))))

(clojure.core/defn- response-describe-workspaces-result ([input] (response-describe-workspaces-result nil input)) ([resultWrapper2167526 input] (clojure.core/let [rawinput2167525 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167527 {"Workspaces" (rawinput2167525 "Workspaces"), "NextToken" (rawinput2167525 "NextToken")}] (clojure.core/cond-> {} (letvar2167527 "Workspaces") (clojure.core/assoc :workspaces (deser-workspace-list (clojure.core/get-in letvar2167527 ["Workspaces"]))) (letvar2167527 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167527 ["NextToken"])))))))

(clojure.core/defn- response-unsupported-workspace-configuration-exception ([input] (response-unsupported-workspace-configuration-exception nil input)) ([resultWrapper2167529 input] (clojure.core/let [rawinput2167528 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167530 {"message" (rawinput2167528 "message")}] (clojure.core/cond-> {} (letvar2167530 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167530 ["message"])))))))

(clojure.core/defn- response-modify-workspace-properties-result ([input] (response-modify-workspace-properties-result nil input)) ([resultWrapper2167532 input] (clojure.core/let [rawinput2167531 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167533 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-unavailable-exception ([input] (response-resource-unavailable-exception nil input)) ([resultWrapper2167535 input] (clojure.core/let [rawinput2167534 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167536 {"message" (rawinput2167534 "message"), "ResourceId" (rawinput2167534 "ResourceId")}] (clojure.core/cond-> {} (letvar2167536 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar2167536 ["message"]))) (letvar2167536 "ResourceId") (clojure.core/assoc :resource-id (deser-non-empty-string (clojure.core/get-in letvar2167536 ["ResourceId"])))))))

(clojure.core/defn- response-modify-account-result ([input] (response-modify-account-result nil input)) ([resultWrapper2167538 input] (clojure.core/let [rawinput2167537 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167539 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-ip-groups-result ([input] (response-describe-ip-groups-result nil input)) ([resultWrapper2167541 input] (clojure.core/let [rawinput2167540 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167542 {"Result" (rawinput2167540 "Result"), "NextToken" (rawinput2167540 "NextToken")}] (clojure.core/cond-> {} (letvar2167542 "Result") (clojure.core/assoc :result (deser-workspaces-ip-groups-list (clojure.core/get-in letvar2167542 ["Result"]))) (letvar2167542 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2167542 ["NextToken"])))))))

(clojure.core/defn- response-authorize-ip-rules-result ([input] (response-authorize-ip-rules-result nil input)) ([resultWrapper2167544 input] (clojure.core/let [rawinput2167543 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167545 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-modify-workspace-state-result ([input] (response-modify-workspace-state-result nil input)) ([resultWrapper2167547 input] (clojure.core/let [rawinput2167546 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2167548 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-account-result/dedicated-tenancy-support (clojure.spec.alpha/and :portkey.aws.workspaces/dedicated-tenancy-support-result-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-account-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-account-result/dedicated-tenancy-support :portkey.aws.workspaces/dedicated-tenancy-management-cidr-range]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-request-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-request/bundle-ids (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-request/owner (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-owner))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-bundles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-bundles-request/bundle-ids :portkey.aws.workspaces.describe-workspace-bundles-request/owner :portkey.aws.workspaces.describe-workspace-bundles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.authorize-ip-rules-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.authorize-ip-rules-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/authorize-ip-rules-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.authorize-ip-rules-request/group-id :portkey.aws.workspaces.authorize-ip-rules-request/user-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-image-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-account-modifications-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-account-modifications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-account-modifications-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/update-rules-of-ip-group-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.invalid-parameter-values-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/invalid-parameter-values-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.invalid-parameter-values-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/start-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/dns-ip-addresses (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-address))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"wsi-[0-9a-z]{9,63}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/reconnect-enum #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.workspaces/dedicated-tenancy-support-enum #{"ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.workspaces/delete-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/iam-role-id (clojure.spec.alpha/and :portkey.aws.workspaces/arn))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/workspace-security-group-id (clojure.spec.alpha/and :portkey.aws.workspaces/security-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/customer-user-name (clojure.spec.alpha/and :portkey.aws.workspaces/user-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/directory-type (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-directory-type))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/ip-group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/state (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-directory-state))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/workspace-creation-properties (clojure.spec.alpha/and :portkey.aws.workspaces/default-workspace-creation-properties))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-directory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/dns-ip-addresses :portkey.aws.workspaces/subnet-ids :portkey.aws.workspaces.workspace-directory/iam-role-id :portkey.aws.workspaces/alias :portkey.aws.workspaces.workspace-directory/workspace-security-group-id :portkey.aws.workspaces.workspace-directory/customer-user-name :portkey.aws.workspaces.workspace-directory/directory-type :portkey.aws.workspaces/directory-id :portkey.aws.workspaces.workspace-directory/ip-group-ids :portkey.aws.workspaces/directory-name :portkey.aws.workspaces.workspace-directory/state :portkey.aws.workspaces.workspace-directory/workspace-creation-properties :portkey.aws.workspaces/registration-code]))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-start-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-result/workspaces-connection-status (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-connection-status-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-connection-status-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-connection-status-result/workspaces-connection-status :portkey.aws.workspaces.describe-workspaces-connection-status-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/default-ou (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.list-available-management-cidr-ranges-request/max-results (clojure.spec.alpha/and :portkey.aws.workspaces/management-cidr-range-max-results))
(clojure.spec.alpha/def :portkey.aws.workspaces.list-available-management-cidr-ranges-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/list-available-management-cidr-ranges-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/management-cidr-range-constraint] :opt-un [:portkey.aws.workspaces.list-available-management-cidr-ranges-request/max-results :portkey.aws.workspaces.list-available-management-cidr-ranges-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.workspaces/modification-resource-enum #{"ROOT_VOLUME" "USER_VOLUME" :user-volume "COMPUTE_TYPE" :compute-type :root-volume})

(clojure.spec.alpha/def :portkey.aws.workspaces/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.workspaces/subnet-id))

(clojure.spec.alpha/def :portkey.aws.workspaces/associate-ip-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-request/directory-ids (clojure.spec.alpha/and :portkey.aws.workspaces/directory-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-directories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-directories-request/directory-ids :portkey.aws.workspaces.describe-workspace-directories-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.ip-rule-item/ip-rule (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule))
(clojure.spec.alpha/def :portkey.aws.workspaces.ip-rule-item/rule-desc (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-desc))
(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.ip-rule-item/ip-rule :portkey.aws.workspaces.ip-rule-item/rule-desc]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule-desc (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/account-modification-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/account-modification))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspaces-ip-groups-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspaces-ip-group))

(clojure.spec.alpha/def :portkey.aws.workspaces.terminate-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-terminate-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.terminate-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-request/workspace-ids (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-request/workspace-ids :portkey.aws.workspaces/directory-id :portkey.aws.workspaces/user-name :portkey.aws.workspaces/bundle-id :portkey.aws.workspaces/limit :portkey.aws.workspaces.describe-workspaces-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/start-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/start-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-connection-status-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-connection-status))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-create-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-create-workspace-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.client-properties/reconnect-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/reconnect-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces/client-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.client-properties/reconnect-enabled]))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-stop-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(subnet-[0-9a-f]{8})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/connection-state #{"UNKNOWN" :disconnected :unknown :connected "CONNECTED" "DISCONNECTED"})

(clojure.spec.alpha/def :portkey.aws.workspaces/stop-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/stop-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/management-cidr-range-constraint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])(\/(3[0-2]|[1-2][0-9]|[0-9]))$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_./() -]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-creation-failed-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-creation-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-creation-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.delete-ip-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces/delete-ip-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.delete-ip-group-request/group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.update-rules-of-ip-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.update-rules-of-ip-group-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/update-rules-of-ip-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.update-rules-of-ip-group-request/group-id :portkey.aws.workspaces.update-rules-of-ip-group-request/user-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/reboot-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/compute #{"VALUE" :performance :value "POWER" :powerpro "GRAPHICS" :power :graphicspro "STANDARD" :graphics :standard "POWERPRO" "GRAPHICSPRO" "PERFORMANCE"})

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-reboot-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-bundle/name (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-bundle/owner (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-owner))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-bundle (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/bundle-id :portkey.aws.workspaces.workspace-bundle/name :portkey.aws.workspaces.workspace-bundle/owner :portkey.aws.workspaces/description :portkey.aws.workspaces/root-storage :portkey.aws.workspaces/user-storage :portkey.aws.workspaces/compute-type]))

(clojure.spec.alpha/def :portkey.aws.workspaces/client-properties-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/client-properties-result))

(clojure.spec.alpha/def :portkey.aws.workspaces.delete-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces.delete-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.workspaces/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.delete-tags-request/resource-id :portkey.aws.workspaces.delete-tags-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.workspaces/alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/terminate-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-result/bundles (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-bundles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-bundles-result/bundles :portkey.aws.workspaces.describe-workspace-bundles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/rebuild-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-bundle))

(clojure.spec.alpha/def :portkey.aws.workspaces/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.workspaces/ec-2-image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^ami\-([a-f0-9]{8}|[a-f0-9]{17})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-group-id))

(clojure.spec.alpha/def :portkey.aws.workspaces/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces.operation-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/operation-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.operation-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.client-properties-result/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/client-properties-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.client-properties-result/resource-id :portkey.aws.workspaces/client-properties]))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/limit (clojure.spec.alpha/int-in 1 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_./()\\-]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-properties-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces/workspace-properties] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/start-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/start-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/group-name (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/group-desc (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-desc))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspaces-ip-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.workspaces-ip-group/group-id :portkey.aws.workspaces.workspaces-ip-group/group-name :portkey.aws.workspaces.workspaces-ip-group/group-desc :portkey.aws.workspaces.workspaces-ip-group/user-rules]))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-terminate-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.failed-workspace-change-request/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/error-type))
(clojure.spec.alpha/def :portkey.aws.workspaces.failed-workspace-change-request/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces/failed-workspace-change-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces.failed-workspace-change-request/error-code :portkey.aws.workspaces.failed-workspace-change-request/error-message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-directory-type #{:simple-ad :ad-connector "SIMPLE_AD" "AD_CONNECTOR"})

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-client-properties-request/resource-ids (clojure.spec.alpha/and :portkey.aws.workspaces/resource-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-client-properties-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.describe-client-properties-request/resource-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/root-volume-size-gib clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workspaces/delete-ip-group-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/revoke-ip-rules-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.modify-workspace-state-request/workspace-state (clojure.spec.alpha/and :portkey.aws.workspaces/target-workspace-state))
(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces.modify-workspace-state-request/workspace-state] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.import-workspace-image-result/image-id (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-id))
(clojure.spec.alpha/def :portkey.aws.workspaces/import-workspace-image-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.import-workspace-image-result/image-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-rule-item))

(clojure.spec.alpha/def :portkey.aws.workspaces/error-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-images-request/image-ids (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-images-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-images-request/max-results (clojure.spec.alpha/and :portkey.aws.workspaces/limit))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-images-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-images-request/image-ids :portkey.aws.workspaces.describe-workspace-images-request/next-token :portkey.aws.workspaces.describe-workspace-images-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.workspaces/describe-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/tag-list]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-image))

(clojure.spec.alpha/def :portkey.aws.workspaces/operating-system-type #{:windows "WINDOWS" "LINUX" :linux})

(clojure.spec.alpha/def :portkey.aws.workspaces.revoke-ip-rules-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.revoke-ip-rules-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-revoked-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/revoke-ip-rules-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.revoke-ip-rules-request/group-id :portkey.aws.workspaces.revoke-ip-rules-request/user-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.rebuild-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-rebuild-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.rebuild-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-account-modifications-result/account-modifications (clojure.spec.alpha/and :portkey.aws.workspaces/account-modification-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-account-modifications-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-account-modifications-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-account-modifications-result/account-modifications :portkey.aws.workspaces.describe-account-modifications-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-properties/compute-type-name (clojure.spec.alpha/and :portkey.aws.workspaces/compute))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/running-mode :portkey.aws.workspaces/running-mode-auto-stop-timeout-in-minutes :portkey.aws.workspaces/root-volume-size-gib :portkey.aws.workspaces/user-volume-size-gib :portkey.aws.workspaces.workspace-properties/compute-type-name]))

(clojure.spec.alpha/def :portkey.aws.workspaces.stop-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-stop-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/stop-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.stop-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces/modification-state-enum #{"UPDATE_INITIATED" "UPDATE_IN_PROGRESS" :update-initiated :update-in-progress})

(clojure.spec.alpha/def :portkey.aws.workspaces.root-storage/capacity (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/root-storage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.root-storage/capacity]))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/tag))

(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/rebuild-request :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-client-properties-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-required-tenancy #{:default "DEDICATED" "DEFAULT" :dedicated})

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.workspaces/dedicated-tenancy-support-result-enum #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.workspaces/stop-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/stop-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/describe-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/terminate-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-associated-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-associated-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-associated-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-images-result/images (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-images-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-images-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-images-result/images :portkey.aws.workspaces.describe-workspace-images-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces.resource-not-found-exception/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-not-found-exception/message :portkey.aws.workspaces.resource-not-found-exception/resource-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-tags-request/tags (clojure.spec.alpha/and :portkey.aws.workspaces/tag-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.create-tags-request/resource-id :portkey.aws.workspaces.create-tags-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/running-mode #{"ALWAYS_ON" :always-on :auto-stop "AUTO_STOP"})

(clojure.spec.alpha/def :portkey.aws.workspaces/delete-workspace-image-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/dedicated-tenancy-modification-state-enum #{"COMPLETED" :pending :completed "PENDING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-request/user-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-request/root-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-request/tags (clojure.spec.alpha/and :portkey.aws.workspaces/tag-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/directory-id :portkey.aws.workspaces/user-name :portkey.aws.workspaces/bundle-id] :opt-un [:portkey.aws.workspaces/volume-encryption-key :portkey.aws.workspaces.workspace-request/user-volume-encryption-enabled :portkey.aws.workspaces.workspace-request/root-volume-encryption-enabled :portkey.aws.workspaces/workspace-properties :portkey.aws.workspaces.workspace-request/tags]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-state #{:admin-maintenance :starting :pending "MAINTENANCE" :unhealthy "AVAILABLE" "UPDATING" "REBOOTING" "TERMINATED" "PENDING" "ERROR" :suspended :stopping :terminating :stopped :rebooting "REBUILDING" "STOPPED" "STARTING" :terminated "ADMIN_MAINTENANCE" :maintenance :updating :impaired :error :rebuilding :available "IMPAIRED" "STOPPING" "TERMINATING" "SUSPENDED" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.workspaces/running-mode-auto-stop-timeout-in-minutes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workspaces/volume-encryption-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/dedicated-tenancy-cidr-range-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/dedicated-tenancy-management-cidr-range))

(clojure.spec.alpha/def :portkey.aws.workspaces.reboot-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-reboot-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.reboot-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.workspaces/modification-state-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/modification-state))

(clojure.spec.alpha/def :portkey.aws.workspaces.delete-workspace-image-request/image-id (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-id))
(clojure.spec.alpha/def :portkey.aws.workspaces/delete-workspace-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.delete-workspace-image-request/image-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-rebuild-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(sg-[0-9a-f]{8})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-error-code))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/modification-states (clojure.spec.alpha/and :portkey.aws.workspaces/modification-state-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/user-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/state (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-state))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/root-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/subnet-id :portkey.aws.workspaces.workspace/error-message :portkey.aws.workspaces/user-name :portkey.aws.workspaces/workspace-properties :portkey.aws.workspaces.workspace/error-code :portkey.aws.workspaces.workspace/modification-states :portkey.aws.workspaces/volume-encryption-key :portkey.aws.workspaces/bundle-id :portkey.aws.workspaces.workspace/user-volume-encryption-enabled :portkey.aws.workspaces/ip-address :portkey.aws.workspaces/directory-id :portkey.aws.workspaces.workspace/state :portkey.aws.workspaces.workspace/root-volume-encryption-enabled :portkey.aws.workspaces/computer-name :portkey.aws.workspaces/workspace-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-request/group-name (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-request/group-desc (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-desc))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-ip-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.create-ip-group-request/group-name] :opt-un [:portkey.aws.workspaces.create-ip-group-request/group-desc :portkey.aws.workspaces.create-ip-group-request/user-rules]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-request/workspace-ids (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-connection-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-connection-status-request/workspace-ids :portkey.aws.workspaces.describe-workspaces-connection-status-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-desc (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.failed-create-workspace-request/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/error-type))
(clojure.spec.alpha/def :portkey.aws.workspaces.failed-create-workspace-request/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces/failed-create-workspace-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-request :portkey.aws.workspaces.failed-create-workspace-request/error-code :portkey.aws.workspaces.failed-create-workspace-request/error-message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/bundle-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^wsb-[0-9a-z]{8,63}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/enable-work-docs (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/enable-internet-access (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/custom-security-group-id (clojure.spec.alpha/and :portkey.aws.workspaces/security-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/user-enabled-as-local-administrator (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces/default-workspace-creation-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.default-workspace-creation-properties/enable-work-docs :portkey.aws.workspaces.default-workspace-creation-properties/enable-internet-access :portkey.aws.workspaces/default-ou :portkey.aws.workspaces.default-workspace-creation-properties/custom-security-group-id :portkey.aws.workspaces.default-workspace-creation-properties/user-enabled-as-local-administrator]))

(clojure.spec.alpha/def :portkey.aws.workspaces.operation-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/operation-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.operation-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/create-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.describe-tags-request/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.start-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-start-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/start-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.start-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-create-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-workspaces-result/pending-requests (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.create-workspaces-result/failed-requests :portkey.aws.workspaces.create-workspaces-result/pending-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces.modification-state/resource (clojure.spec.alpha/and :portkey.aws.workspaces/modification-resource-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces.modification-state/state (clojure.spec.alpha/and :portkey.aws.workspaces/modification-state-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces/modification-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.modification-state/resource :portkey.aws.workspaces.modification-state/state]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"wsipg-[0-9a-z]{8,63}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces.modify-account-request/dedicated-tenancy-support (clojure.spec.alpha/and :portkey.aws.workspaces/dedicated-tenancy-support-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces/modify-account-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.modify-account-request/dedicated-tenancy-support :portkey.aws.workspaces/dedicated-tenancy-management-cidr-range]))

(clojure.spec.alpha/def :portkey.aws.workspaces.modify-client-properties-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/modify-client-properties-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.modify-client-properties-request/resource-id :portkey.aws.workspaces/client-properties] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.associate-ip-groups-request/group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/associate-ip-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/directory-id :portkey.aws.workspaces.associate-ip-groups-request/group-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-workspaces-request/workspaces (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-request-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.create-workspaces-request/workspaces] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-result/directories (clojure.spec.alpha/and :portkey.aws.workspaces/directory-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-directories-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-directories-result/directories :portkey.aws.workspaces.describe-workspace-directories-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.invalid-resource-state-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/invalid-resource-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.invalid-resource-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/stop-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-directory))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-result/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-ip-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.create-ip-group-result/group-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^d-[0-9a-f]{8,63}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-owner (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.workspaces.disassociate-ip-groups-request/group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/disassociate-ip-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/directory-id :portkey.aws.workspaces.disassociate-ip-groups-request/group-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/image-id (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/name (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/description (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-description))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/state (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-state))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/required-tenancy (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-required-tenancy))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-error-code))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-image/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.workspace-image/image-id :portkey.aws.workspaces.workspace-image/name :portkey.aws.workspaces.workspace-image/description :portkey.aws.workspaces/operating-system :portkey.aws.workspaces.workspace-image/state :portkey.aws.workspaces.workspace-image/required-tenancy :portkey.aws.workspaces.workspace-image/error-code :portkey.aws.workspaces.workspace-image/error-message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/describe-client-properties-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/client-properties-list]))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.tag/key (clojure.spec.alpha/and :portkey.aws.workspaces/tag-key))
(clojure.spec.alpha/def :portkey.aws.workspaces.tag/value (clojure.spec.alpha/and :portkey.aws.workspaces/tag-value))
(clojure.spec.alpha/def :portkey.aws.workspaces/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.tag/key] :opt-un [:portkey.aws.workspaces.tag/value]))

(clojure.spec.alpha/def :portkey.aws.workspaces.compute-type/name (clojure.spec.alpha/and :portkey.aws.workspaces/compute))
(clojure.spec.alpha/def :portkey.aws.workspaces/compute-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.compute-type/name]))

(clojure.spec.alpha/def :portkey.aws.workspaces/disassociate-ip-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-ingestion-process #{:byol-graphicspro "BYOL_GRAPHICS" "BYOL_REGULAR" "BYOL_GRAPHICSPRO" :byol-regular :byol-graphics})

(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/reboot-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/non-empty-string :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/management-cidr-range-max-results (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.workspaces.list-available-management-cidr-ranges-result/management-cidr-ranges (clojure.spec.alpha/and :portkey.aws.workspaces/dedicated-tenancy-cidr-range-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.list-available-management-cidr-ranges-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/list-available-management-cidr-ranges-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.list-available-management-cidr-ranges-result/management-cidr-ranges :portkey.aws.workspaces.list-available-management-cidr-ranges-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-result/workspaces (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-result/workspaces :portkey.aws.workspaces.describe-workspaces-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.unsupported-workspace-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/unsupported-workspace-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.unsupported-workspace-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.import-workspace-image-request/ingestion-process (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-ingestion-process))
(clojure.spec.alpha/def :portkey.aws.workspaces.import-workspace-image-request/image-name (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.import-workspace-image-request/image-description (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-image-description))
(clojure.spec.alpha/def :portkey.aws.workspaces/import-workspace-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/ec-2-image-id :portkey.aws.workspaces.import-workspace-image-request/ingestion-process :portkey.aws.workspaces.import-workspace-image-request/image-name :portkey.aws.workspaces.import-workspace-image-request/image-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-properties-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-request/group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.workspaces/limit))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-ip-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-ip-groups-request/group-ids :portkey.aws.workspaces.describe-ip-groups-request/next-token :portkey.aws.workspaces.describe-ip-groups-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces.resource-unavailable-exception/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-unavailable-exception/message :portkey.aws.workspaces.resource-unavailable-exception/resource-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-image-state #{:pending "AVAILABLE" "PENDING" "ERROR" :error :available})

(clojure.spec.alpha/def :portkey.aws.workspaces.account-modification/modification-state (clojure.spec.alpha/and :portkey.aws.workspaces/dedicated-tenancy-modification-state-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces.account-modification/dedicated-tenancy-support (clojure.spec.alpha/and :portkey.aws.workspaces/dedicated-tenancy-support-result-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces.account-modification/start-time (clojure.spec.alpha/and :portkey.aws.workspaces/timestamp))
(clojure.spec.alpha/def :portkey.aws.workspaces.account-modification/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-error-code))
(clojure.spec.alpha/def :portkey.aws.workspaces.account-modification/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces/account-modification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.account-modification/modification-state :portkey.aws.workspaces.account-modification/dedicated-tenancy-support :portkey.aws.workspaces/dedicated-tenancy-management-cidr-range :portkey.aws.workspaces.account-modification/start-time :portkey.aws.workspaces.account-modification/error-code :portkey.aws.workspaces.account-modification/error-message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-account-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/dedicated-tenancy-management-cidr-range (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"(^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\.0\.0)(\/(16$))$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.workspaces/computer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/directory-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^ws-[0-9a-z]{8,63}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-directory-state #{"REGISTERING" "DEREGISTERING" :deregistering "ERROR" "REGISTERED" :registering :deregistered :error "DEREGISTERED" :registered})

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-result/result (clojure.spec.alpha/and :portkey.aws.workspaces/workspaces-ip-groups-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-ip-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-ip-groups-result/result :portkey.aws.workspaces.describe-ip-groups-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.operating-system/type (clojure.spec.alpha/and :portkey.aws.workspaces/operating-system-type))
(clojure.spec.alpha/def :portkey.aws.workspaces/operating-system (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.operating-system/type]))

(clojure.spec.alpha/def :portkey.aws.workspaces/target-workspace-state #{:admin-maintenance "AVAILABLE" "ADMIN_MAINTENANCE" :available})

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-revoked-rule-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-rule))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/authorize-ip-rules-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/user-volume-size-gib clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workspaces.user-storage/capacity (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/user-storage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.user-storage/capacity]))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/registration-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-connection-status/connection-state-check-timestamp (clojure.spec.alpha/and :portkey.aws.workspaces/timestamp))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-connection-status/last-known-user-connection-timestamp (clojure.spec.alpha/and :portkey.aws.workspaces/timestamp))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-connection-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces/connection-state :portkey.aws.workspaces.workspace-connection-status/connection-state-check-timestamp :portkey.aws.workspaces.workspace-connection-status/last-known-user-connection-timestamp]))

(clojure.core/defn describe-client-properties ([describe-client-properties-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-client-properties-request describe-client-properties-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-client-properties-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-client-properties-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeClientProperties", :http.request.configuration/output-deser-fn response-describe-client-properties-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-client-properties :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/describe-client-properties-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-client-properties-result))

(clojure.core/defn update-rules-of-ip-group ([update-rules-of-ip-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-rules-of-ip-group-request update-rules-of-ip-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/update-rules-of-ip-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/update-rules-of-ip-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRulesOfIpGroup", :http.request.configuration/output-deser-fn response-update-rules-of-ip-group-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef update-rules-of-ip-group :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/update-rules-of-ip-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/update-rules-of-ip-group-result))

(clojure.core/defn describe-workspace-directories ([] (describe-workspace-directories {})) ([describe-workspace-directories-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workspace-directories-request describe-workspace-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspace-directories-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspace-directories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkspaceDirectories", :http.request.configuration/output-deser-fn response-describe-workspace-directories-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef describe-workspace-directories :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspace-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspace-directories-result))

(clojure.core/defn terminate-workspaces ([terminate-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-terminate-workspaces-request terminate-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/terminate-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/terminate-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TerminateWorkspaces", :http.request.configuration/output-deser-fn response-terminate-workspaces-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef terminate-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/terminate-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/terminate-workspaces-result))

(clojure.core/defn create-ip-group ([create-ip-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-ip-group-request create-ip-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/create-ip-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/create-ip-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIpGroup", :http.request.configuration/output-deser-fn response-create-ip-group-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.workspaces/resource-already-exists-exception, "ResourceCreationFailedException" :portkey.aws.workspaces/resource-creation-failed-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef create-ip-group :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/create-ip-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/create-ip-group-result))

(clojure.core/defn start-workspaces ([start-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-workspaces-request start-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/start-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/start-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartWorkspaces", :http.request.configuration/output-deser-fn response-start-workspaces-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef start-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/start-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/start-workspaces-result))

(clojure.core/defn delete-tags ([delete-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/delete-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/delete-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn response-delete-tags-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/delete-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/delete-tags-result))

(clojure.core/defn modify-client-properties ([modify-client-properties-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-modify-client-properties-request modify-client-properties-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/modify-client-properties-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/modify-client-properties-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyClientProperties", :http.request.configuration/output-deser-fn response-modify-client-properties-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef modify-client-properties :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/modify-client-properties-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/modify-client-properties-result))

(clojure.core/defn create-tags ([create-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/create-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/create-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTags", :http.request.configuration/output-deser-fn response-create-tags-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/create-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/create-tags-result))

(clojure.core/defn reboot-workspaces ([reboot-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-reboot-workspaces-request reboot-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/reboot-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/reboot-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RebootWorkspaces", :http.request.configuration/output-deser-fn response-reboot-workspaces-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef reboot-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/reboot-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/reboot-workspaces-result))

(clojure.core/defn describe-workspaces ([] (describe-workspaces {})) ([describe-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workspaces-request describe-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkspaces", :http.request.configuration/output-deser-fn response-describe-workspaces-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceUnavailableException" :portkey.aws.workspaces/resource-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-workspaces :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspaces-result))

(clojure.core/defn disassociate-ip-groups ([disassociate-ip-groups-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-ip-groups-request disassociate-ip-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/disassociate-ip-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/disassociate-ip-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateIpGroups", :http.request.configuration/output-deser-fn response-disassociate-ip-groups-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef disassociate-ip-groups :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/disassociate-ip-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/disassociate-ip-groups-result))

(clojure.core/defn describe-account-modifications ([] (describe-account-modifications {})) ([describe-account-modifications-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-account-modifications-request describe-account-modifications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-account-modifications-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-account-modifications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAccountModifications", :http.request.configuration/output-deser-fn response-describe-account-modifications-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-account-modifications :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-account-modifications-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-account-modifications-result))

(clojure.core/defn modify-workspace-properties ([modify-workspace-properties-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-modify-workspace-properties-request modify-workspace-properties-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/modify-workspace-properties-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/modify-workspace-properties-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyWorkspaceProperties", :http.request.configuration/output-deser-fn response-modify-workspace-properties-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "OperationInProgressException" :portkey.aws.workspaces/operation-in-progress-exception, "UnsupportedWorkspaceConfigurationException" :portkey.aws.workspaces/unsupported-workspace-configuration-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception, "ResourceUnavailableException" :portkey.aws.workspaces/resource-unavailable-exception}})))))
(clojure.spec.alpha/fdef modify-workspace-properties :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/modify-workspace-properties-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/modify-workspace-properties-result))

(clojure.core/defn revoke-ip-rules ([revoke-ip-rules-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-revoke-ip-rules-request revoke-ip-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/revoke-ip-rules-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/revoke-ip-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RevokeIpRules", :http.request.configuration/output-deser-fn response-revoke-ip-rules-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef revoke-ip-rules :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/revoke-ip-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/revoke-ip-rules-result))

(clojure.core/defn describe-tags ([describe-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-result, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-tags-result))

(clojure.core/defn associate-ip-groups ([associate-ip-groups-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-ip-groups-request associate-ip-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/associate-ip-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/associate-ip-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateIpGroups", :http.request.configuration/output-deser-fn response-associate-ip-groups-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception, "OperationNotSupportedException" :portkey.aws.workspaces/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef associate-ip-groups :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/associate-ip-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/associate-ip-groups-result))

(clojure.core/defn describe-workspaces-connection-status ([] (describe-workspaces-connection-status {})) ([describe-workspaces-connection-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workspaces-connection-status-request describe-workspaces-connection-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspaces-connection-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspaces-connection-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkspacesConnectionStatus", :http.request.configuration/output-deser-fn response-describe-workspaces-connection-status-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef describe-workspaces-connection-status :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspaces-connection-status-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspaces-connection-status-result))

(clojure.core/defn describe-workspace-bundles ([] (describe-workspace-bundles {})) ([describe-workspace-bundles-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workspace-bundles-request describe-workspace-bundles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspace-bundles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspace-bundles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkspaceBundles", :http.request.configuration/output-deser-fn response-describe-workspace-bundles-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef describe-workspace-bundles :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspace-bundles-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspace-bundles-result))

(clojure.core/defn modify-workspace-state ([modify-workspace-state-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-modify-workspace-state-request modify-workspace-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/modify-workspace-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/modify-workspace-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyWorkspaceState", :http.request.configuration/output-deser-fn response-modify-workspace-state-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef modify-workspace-state :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/modify-workspace-state-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/modify-workspace-state-result))

(clojure.core/defn rebuild-workspaces ([rebuild-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-rebuild-workspaces-request rebuild-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/rebuild-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/rebuild-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RebuildWorkspaces", :http.request.configuration/output-deser-fn response-rebuild-workspaces-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef rebuild-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/rebuild-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/rebuild-workspaces-result))

(clojure.core/defn delete-workspace-image ([delete-workspace-image-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-workspace-image-request delete-workspace-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/delete-workspace-image-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/delete-workspace-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteWorkspaceImage", :http.request.configuration/output-deser-fn response-delete-workspace-image-result, :http.request.spec/error-spec {"ResourceAssociatedException" :portkey.aws.workspaces/resource-associated-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-workspace-image :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/delete-workspace-image-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/delete-workspace-image-result))

(clojure.core/defn list-available-management-cidr-ranges ([list-available-management-cidr-ranges-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-available-management-cidr-ranges-request list-available-management-cidr-ranges-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/list-available-management-cidr-ranges-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/list-available-management-cidr-ranges-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAvailableManagementCidrRanges", :http.request.configuration/output-deser-fn response-list-available-management-cidr-ranges-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef list-available-management-cidr-ranges :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/list-available-management-cidr-ranges-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/list-available-management-cidr-ranges-result))

(clojure.core/defn import-workspace-image ([import-workspace-image-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-import-workspace-image-request import-workspace-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/import-workspace-image-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/import-workspace-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportWorkspaceImage", :http.request.configuration/output-deser-fn response-import-workspace-image-result, :http.request.spec/error-spec {"ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.workspaces/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "OperationNotSupportedException" :portkey.aws.workspaces/operation-not-supported-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef import-workspace-image :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/import-workspace-image-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/import-workspace-image-result))

(clojure.core/defn describe-account ([] (describe-account {})) ([describe-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-account-request describe-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-account-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAccount", :http.request.configuration/output-deser-fn response-describe-account-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-account :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-account-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-account-result))

(clojure.core/defn describe-ip-groups ([] (describe-ip-groups {})) ([describe-ip-groups-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-ip-groups-request describe-ip-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-ip-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-ip-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIpGroups", :http.request.configuration/output-deser-fn response-describe-ip-groups-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-ip-groups :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-ip-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-ip-groups-result))

(clojure.core/defn describe-workspace-images ([] (describe-workspace-images {})) ([describe-workspace-images-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workspace-images-request describe-workspace-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspace-images-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspace-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkspaceImages", :http.request.configuration/output-deser-fn response-describe-workspace-images-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-workspace-images :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspace-images-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspace-images-result))

(clojure.core/defn delete-ip-group ([delete-ip-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-ip-group-request delete-ip-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/delete-ip-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/delete-ip-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIpGroup", :http.request.configuration/output-deser-fn response-delete-ip-group-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceAssociatedException" :portkey.aws.workspaces/resource-associated-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-ip-group :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/delete-ip-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/delete-ip-group-result))

(clojure.core/defn stop-workspaces ([stop-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-stop-workspaces-request stop-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/stop-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/stop-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopWorkspaces", :http.request.configuration/output-deser-fn response-stop-workspaces-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef stop-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/stop-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/stop-workspaces-result))

(clojure.core/defn create-workspaces ([create-workspaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-workspaces-request create-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/create-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/create-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateWorkspaces", :http.request.configuration/output-deser-fn response-create-workspaces-result, :http.request.spec/error-spec {"ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef create-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/create-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/create-workspaces-result))

(clojure.core/defn modify-account ([] (modify-account {})) ([modify-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-modify-account-request modify-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/modify-account-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/modify-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyAccount", :http.request.configuration/output-deser-fn response-modify-account-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "ResourceUnavailableException" :portkey.aws.workspaces/resource-unavailable-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef modify-account :args (clojure.spec.alpha/? :portkey.aws.workspaces/modify-account-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/modify-account-result))

(clojure.core/defn authorize-ip-rules ([authorize-ip-rules-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-authorize-ip-rules-request authorize-ip-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.configuration/target-prefix "WorkspacesService", :http.request.spec/output-spec :portkey.aws.workspaces/authorize-ip-rules-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/authorize-ip-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AuthorizeIpRules", :http.request.configuration/output-deser-fn response-authorize-ip-rules-result, :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef authorize-ip-rules :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/authorize-ip-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/authorize-ip-rules-result))
