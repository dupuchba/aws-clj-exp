(ns portkey.aws.AWSMigrationHub.-2017-05-31 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "mgh", :region "us-west-2"},
    :ssl-common-name "mgh.us-west-2.amazonaws.com",
    :endpoint "https://mgh.us-west-2.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-created-artifact-name)

(clojure.core/declare ser-migration-task-name)

(clojure.core/declare ser-dry-run)

(clojure.core/declare ser-discovered-resource-description)

(clojure.core/declare ser-resource-attribute-list)

(clojure.core/declare ser-resource-attribute-type)

(clojure.core/declare ser-next-update-seconds)

(clojure.core/declare ser-created-artifact)

(clojure.core/declare ser-created-artifact-description)

(clojure.core/declare ser-discovered-resource)

(clojure.core/declare ser-configuration-id)

(clojure.core/declare ser-update-date-time)

(clojure.core/declare ser-status)

(clojure.core/declare ser-status-detail)

(clojure.core/declare ser-max-results-resources)

(clojure.core/declare ser-application-id)

(clojure.core/declare ser-application-status)

(clojure.core/declare ser-resource-attribute)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-progress-percent)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-resource-attribute-value)

(clojure.core/declare ser-token)

(clojure.core/declare ser-task)

(clojure.core/declare ser-max-results-created-artifacts)

(clojure.core/declare ser-progress-update-stream)

(clojure.core/defn- ser-created-artifact-name [input] #:http.request.field{:value input, :shape "CreatedArtifactName"})

(clojure.core/defn- ser-migration-task-name [input] #:http.request.field{:value input, :shape "MigrationTaskName"})

(clojure.core/defn- ser-dry-run [input] #:http.request.field{:value input, :shape "DryRun"})

(clojure.core/defn- ser-discovered-resource-description [input] #:http.request.field{:value input, :shape "DiscoveredResourceDescription"})

(clojure.core/defn- ser-resource-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-attribute coll) #:http.request.field{:shape "ResourceAttribute"}))) input), :shape "ResourceAttributeList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-resource-attribute-type [input] #:http.request.field{:value (clojure.core/get {"MAC_ADDRESS" "MAC_ADDRESS", :ipv-4-address "IPV4_ADDRESS", "IPV6_ADDRESS" "IPV6_ADDRESS", :bios-id "BIOS_ID", "BIOS_ID" "BIOS_ID", "VM_PATH" "VM_PATH", :vm-path "VM_PATH", "IPV4_ADDRESS" "IPV4_ADDRESS", "VM_MANAGED_OBJECT_REFERENCE" "VM_MANAGED_OBJECT_REFERENCE", :vm-managed-object-reference "VM_MANAGED_OBJECT_REFERENCE", :vm-manager-id "VM_MANAGER_ID", :fqdn "FQDN", :vm-name "VM_NAME", :mac-address "MAC_ADDRESS", "FQDN" "FQDN", "MOTHERBOARD_SERIAL_NUMBER" "MOTHERBOARD_SERIAL_NUMBER", "VM_NAME" "VM_NAME", "VM_MANAGER_ID" "VM_MANAGER_ID", :ipv-6-address "IPV6_ADDRESS", :motherboard-serial-number "MOTHERBOARD_SERIAL_NUMBER"} input), :shape "ResourceAttributeType"})

(clojure.core/defn- ser-next-update-seconds [input] #:http.request.field{:value input, :shape "NextUpdateSeconds"})

(clojure.core/defn- ser-created-artifact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-created-artifact-name (:name input)) #:http.request.field{:name "Name", :shape "CreatedArtifactName"})], :shape "CreatedArtifact", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-created-artifact-description (input :description)) #:http.request.field{:name "Description", :shape "CreatedArtifactDescription"}))))

(clojure.core/defn- ser-created-artifact-description [input] #:http.request.field{:value input, :shape "CreatedArtifactDescription"})

(clojure.core/defn- ser-discovered-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-id (:configuration-id input)) #:http.request.field{:name "ConfigurationId", :shape "ConfigurationId"})], :shape "DiscoveredResource", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-discovered-resource-description (input :description)) #:http.request.field{:name "Description", :shape "DiscoveredResourceDescription"}))))

(clojure.core/defn- ser-configuration-id [input] #:http.request.field{:value input, :shape "ConfigurationId"})

(clojure.core/defn- ser-update-date-time [input] #:http.request.field{:value input, :shape "UpdateDateTime"})

(clojure.core/defn- ser-status [input] #:http.request.field{:value (clojure.core/get {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "Status"})

(clojure.core/defn- ser-status-detail [input] #:http.request.field{:value input, :shape "StatusDetail"})

(clojure.core/defn- ser-max-results-resources [input] #:http.request.field{:value input, :shape "MaxResultsResources"})

(clojure.core/defn- ser-application-id [input] #:http.request.field{:value input, :shape "ApplicationId"})

(clojure.core/defn- ser-application-status [input] #:http.request.field{:value (clojure.core/get {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "ApplicationStatus"})

(clojure.core/defn- ser-resource-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-attribute-type (:type input)) #:http.request.field{:name "Type", :shape "ResourceAttributeType"}) (clojure.core/into (ser-resource-attribute-value (:value input)) #:http.request.field{:name "Value", :shape "ResourceAttributeValue"})], :shape "ResourceAttribute", :type "structure"}))

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-progress-percent [input] #:http.request.field{:value input, :shape "ProgressPercent"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-resource-attribute-value [input] #:http.request.field{:value input, :shape "ResourceAttributeValue"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-task [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-status (:status input)) #:http.request.field{:name "Status", :shape "Status"})], :shape "Task", :type "structure"} (clojure.core/contains? input :status-detail) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-status-detail (input :status-detail)) #:http.request.field{:name "StatusDetail", :shape "StatusDetail"})) (clojure.core/contains? input :progress-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-progress-percent (input :progress-percent)) #:http.request.field{:name "ProgressPercent", :shape "ProgressPercent"}))))

(clojure.core/defn- ser-max-results-created-artifacts [input] #:http.request.field{:value input, :shape "MaxResultsCreatedArtifacts"})

(clojure.core/defn- ser-progress-update-stream [input] #:http.request.field{:value input, :shape "ProgressUpdateStream"})

(clojure.core/defn- req-associate-discovered-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-discovered-resource (input :discovered-resource)) #:http.request.field{:name "DiscoveredResource", :shape "DiscoveredResource"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-describe-migration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]}))

(clojure.core/defn- req-list-created-artifacts-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-created-artifacts (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsCreatedArtifacts"}))))

(clojure.core/defn- req-import-migration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-discovered-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-resources (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsResources"}))))

(clojure.core/defn- req-disassociate-discovered-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-configuration-id (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "ConfigurationId"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-migration-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :resource-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "ResourceName"}))))

(clojure.core/defn- req-create-progress-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream-name)) #:http.request.field{:name "ProgressUpdateStreamName", :shape "ProgressUpdateStream"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-progress-update-streams-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-disassociate-created-artifact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-created-artifact-name (input :created-artifact-name)) #:http.request.field{:name "CreatedArtifactName", :shape "CreatedArtifactName"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-delete-progress-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream-name)) #:http.request.field{:name "ProgressUpdateStreamName", :shape "ProgressUpdateStream"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-describe-application-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "ApplicationId"})]}))

(clojure.core/defn- req-put-resource-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-resource-attribute-list (input :resource-attribute-list)) #:http.request.field{:name "ResourceAttributeList", :shape "ResourceAttributeList"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-notify-migration-task-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-task (input :task)) #:http.request.field{:name "Task", :shape "Task"}) (clojure.core/into (ser-update-date-time (input :update-date-time)) #:http.request.field{:name "UpdateDateTime", :shape "UpdateDateTime"}) (clojure.core/into (ser-next-update-seconds (input :next-update-seconds)) #:http.request.field{:name "NextUpdateSeconds", :shape "NextUpdateSeconds"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-associate-created-artifact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-created-artifact (input :created-artifact)) #:http.request.field{:name "CreatedArtifact", :shape "CreatedArtifact"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-notify-application-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "ApplicationId"}) (clojure.core/into (ser-application-status (input :status)) #:http.request.field{:name "Status", :shape "ApplicationStatus"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/declare deser-created-artifact-name)

(clojure.core/declare deser-migration-task-name)

(clojure.core/declare deser-discovered-resource-description)

(clojure.core/declare deser-resource-attribute-type)

(clojure.core/declare deser-latest-resource-attribute-list)

(clojure.core/declare deser-progress-update-stream-summary)

(clojure.core/declare deser-migration-task)

(clojure.core/declare deser-migration-task-summary)

(clojure.core/declare deser-created-artifact)

(clojure.core/declare deser-created-artifact-description)

(clojure.core/declare deser-discovered-resource)

(clojure.core/declare deser-configuration-id)

(clojure.core/declare deser-update-date-time)

(clojure.core/declare deser-discovered-resource-list)

(clojure.core/declare deser-status)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-migration-task-summary-list)

(clojure.core/declare deser-status-detail)

(clojure.core/declare deser-application-status)

(clojure.core/declare deser-resource-attribute)

(clojure.core/declare deser-created-artifact-list)

(clojure.core/declare deser-progress-update-stream-summary-list)

(clojure.core/declare deser-progress-percent)

(clojure.core/declare deser-resource-attribute-value)

(clojure.core/declare deser-token)

(clojure.core/declare deser-task)

(clojure.core/declare deser-progress-update-stream)

(clojure.core/defn- deser-created-artifact-name [input] input)

(clojure.core/defn- deser-migration-task-name [input] input)

(clojure.core/defn- deser-discovered-resource-description [input] input)

(clojure.core/defn- deser-resource-attribute-type [input] (clojure.core/get {"MAC_ADDRESS" :mac-address, "IPV6_ADDRESS" :ipv-6-address, "BIOS_ID" :bios-id, "VM_PATH" :vm-path, "IPV4_ADDRESS" :ipv-4-address, "VM_MANAGED_OBJECT_REFERENCE" :vm-managed-object-reference, "FQDN" :fqdn, "MOTHERBOARD_SERIAL_NUMBER" :motherboard-serial-number, "VM_NAME" :vm-name, "VM_MANAGER_ID" :vm-manager-id} input))

(clojure.core/defn- deser-latest-resource-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-attribute coll))) input))

(clojure.core/defn- deser-progress-update-stream-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProgressUpdateStreamName") (clojure.core/assoc :progress-update-stream-name (deser-progress-update-stream (input "ProgressUpdateStreamName")))))

(clojure.core/defn- deser-migration-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProgressUpdateStream") (clojure.core/assoc :progress-update-stream (deser-progress-update-stream (input "ProgressUpdateStream"))) (clojure.core/contains? input "MigrationTaskName") (clojure.core/assoc :migration-task-name (deser-migration-task-name (input "MigrationTaskName"))) (clojure.core/contains? input "Task") (clojure.core/assoc :task (deser-task (input "Task"))) (clojure.core/contains? input "UpdateDateTime") (clojure.core/assoc :update-date-time (deser-update-date-time (input "UpdateDateTime"))) (clojure.core/contains? input "ResourceAttributeList") (clojure.core/assoc :resource-attribute-list (deser-latest-resource-attribute-list (input "ResourceAttributeList")))))

(clojure.core/defn- deser-migration-task-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProgressUpdateStream") (clojure.core/assoc :progress-update-stream (deser-progress-update-stream (input "ProgressUpdateStream"))) (clojure.core/contains? input "MigrationTaskName") (clojure.core/assoc :migration-task-name (deser-migration-task-name (input "MigrationTaskName"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-status (input "Status"))) (clojure.core/contains? input "ProgressPercent") (clojure.core/assoc :progress-percent (deser-progress-percent (input "ProgressPercent"))) (clojure.core/contains? input "StatusDetail") (clojure.core/assoc :status-detail (deser-status-detail (input "StatusDetail"))) (clojure.core/contains? input "UpdateDateTime") (clojure.core/assoc :update-date-time (deser-update-date-time (input "UpdateDateTime")))))

(clojure.core/defn- deser-created-artifact [input] (clojure.core/cond-> {:name (deser-created-artifact-name (input "Name"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-created-artifact-description (input "Description")))))

(clojure.core/defn- deser-created-artifact-description [input] input)

(clojure.core/defn- deser-discovered-resource [input] (clojure.core/cond-> {:configuration-id (deser-configuration-id (input "ConfigurationId"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-discovered-resource-description (input "Description")))))

(clojure.core/defn- deser-configuration-id [input] input)

(clojure.core/defn- deser-update-date-time [input] input)

(clojure.core/defn- deser-discovered-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-discovered-resource coll))) input))

(clojure.core/defn- deser-status [input] (clojure.core/get {"NOT_STARTED" :not-started, "IN_PROGRESS" :in-progress, "FAILED" :failed, "COMPLETED" :completed} input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-migration-task-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-migration-task-summary coll))) input))

(clojure.core/defn- deser-status-detail [input] input)

(clojure.core/defn- deser-application-status [input] (clojure.core/get {"NOT_STARTED" :not-started, "IN_PROGRESS" :in-progress, "COMPLETED" :completed} input))

(clojure.core/defn- deser-resource-attribute [input] (clojure.core/cond-> {:type (deser-resource-attribute-type (input "Type")), :value (deser-resource-attribute-value (input "Value"))}))

(clojure.core/defn- deser-created-artifact-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-created-artifact coll))) input))

(clojure.core/defn- deser-progress-update-stream-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-progress-update-stream-summary coll))) input))

(clojure.core/defn- deser-progress-percent [input] input)

(clojure.core/defn- deser-resource-attribute-value [input] input)

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-task [input] (clojure.core/cond-> {:status (deser-status (input "Status"))} (clojure.core/contains? input "StatusDetail") (clojure.core/assoc :status-detail (deser-status-detail (input "StatusDetail"))) (clojure.core/contains? input "ProgressPercent") (clojure.core/assoc :progress-percent (deser-progress-percent (input "ProgressPercent")))))

(clojure.core/defn- deser-progress-update-stream [input] input)

(clojure.core/defn- response-dry-run-operation ([input] (response-dry-run-operation nil input)) ([resultWrapper31904 input] (clojure.core/let [rawinput31903 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31905 {"Message" (rawinput31903 "Message")}] (clojure.core/cond-> {} (letvar31905 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31905 ["Message"])))))))

(clojure.core/defn- response-describe-migration-task-result ([input] (response-describe-migration-task-result nil input)) ([resultWrapper31907 input] (clojure.core/let [rawinput31906 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31908 {"MigrationTask" (rawinput31906 "MigrationTask")}] (clojure.core/cond-> {} (letvar31908 "MigrationTask") (clojure.core/assoc :migration-task (deser-migration-task (clojure.core/get-in letvar31908 ["MigrationTask"])))))))

(clojure.core/defn- response-list-migration-tasks-result ([input] (response-list-migration-tasks-result nil input)) ([resultWrapper31910 input] (clojure.core/let [rawinput31909 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31911 {"NextToken" (rawinput31909 "NextToken"), "MigrationTaskSummaryList" (rawinput31909 "MigrationTaskSummaryList")}] (clojure.core/cond-> {} (letvar31911 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar31911 ["NextToken"]))) (letvar31911 "MigrationTaskSummaryList") (clojure.core/assoc :migration-task-summary-list (deser-migration-task-summary-list (clojure.core/get-in letvar31911 ["MigrationTaskSummaryList"])))))))

(clojure.core/defn- response-list-discovered-resources-result ([input] (response-list-discovered-resources-result nil input)) ([resultWrapper31913 input] (clojure.core/let [rawinput31912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31914 {"NextToken" (rawinput31912 "NextToken"), "DiscoveredResourceList" (rawinput31912 "DiscoveredResourceList")}] (clojure.core/cond-> {} (letvar31914 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar31914 ["NextToken"]))) (letvar31914 "DiscoveredResourceList") (clojure.core/assoc :discovered-resource-list (deser-discovered-resource-list (clojure.core/get-in letvar31914 ["DiscoveredResourceList"])))))))

(clojure.core/defn- response-notify-migration-task-state-result ([input] (response-notify-migration-task-state-result nil input)) ([resultWrapper31916 input] (clojure.core/let [rawinput31915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31917 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper31919 input] (clojure.core/let [rawinput31918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31920 {"Message" (rawinput31918 "Message")}] (clojure.core/cond-> {} (letvar31920 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31920 ["Message"])))))))

(clojure.core/defn- response-unauthorized-operation ([input] (response-unauthorized-operation nil input)) ([resultWrapper31922 input] (clojure.core/let [rawinput31921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31923 {"Message" (rawinput31921 "Message")}] (clojure.core/cond-> {} (letvar31923 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31923 ["Message"])))))))

(clojure.core/defn- response-put-resource-attributes-result ([input] (response-put-resource-attributes-result nil input)) ([resultWrapper31925 input] (clojure.core/let [rawinput31924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31926 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-created-artifact-result ([input] (response-disassociate-created-artifact-result nil input)) ([resultWrapper31928 input] (clojure.core/let [rawinput31927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31929 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-progress-update-stream-result ([input] (response-delete-progress-update-stream-result nil input)) ([resultWrapper31931 input] (clojure.core/let [rawinput31930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31932 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-policy-error-exception ([input] (response-policy-error-exception nil input)) ([resultWrapper31934 input] (clojure.core/let [rawinput31933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31935 {"Message" (rawinput31933 "Message")}] (clojure.core/cond-> {} (letvar31935 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31935 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper31937 input] (clojure.core/let [rawinput31936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31938 {"Message" (rawinput31936 "Message")}] (clojure.core/cond-> {} (letvar31938 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31938 ["Message"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper31940 input] (clojure.core/let [rawinput31939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31941 {"Message" (rawinput31939 "Message")}] (clojure.core/cond-> {} (letvar31941 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31941 ["Message"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper31943 input] (clojure.core/let [rawinput31942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31944 {"Message" (rawinput31942 "Message")}] (clojure.core/cond-> {} (letvar31944 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31944 ["Message"])))))))

(clojure.core/defn- response-notify-application-state-result ([input] (response-notify-application-state-result nil input)) ([resultWrapper31946 input] (clojure.core/let [rawinput31945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31947 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-created-artifact-result ([input] (response-associate-created-artifact-result nil input)) ([resultWrapper31949 input] (clojure.core/let [rawinput31948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31950 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-discovered-resource-result ([input] (response-disassociate-discovered-resource-result nil input)) ([resultWrapper31952 input] (clojure.core/let [rawinput31951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31953 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-progress-update-streams-result ([input] (response-list-progress-update-streams-result nil input)) ([resultWrapper31955 input] (clojure.core/let [rawinput31954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31956 {"ProgressUpdateStreamSummaryList" (rawinput31954 "ProgressUpdateStreamSummaryList"), "NextToken" (rawinput31954 "NextToken")}] (clojure.core/cond-> {} (letvar31956 "ProgressUpdateStreamSummaryList") (clojure.core/assoc :progress-update-stream-summary-list (deser-progress-update-stream-summary-list (clojure.core/get-in letvar31956 ["ProgressUpdateStreamSummaryList"]))) (letvar31956 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar31956 ["NextToken"])))))))

(clojure.core/defn- response-describe-application-state-result ([input] (response-describe-application-state-result nil input)) ([resultWrapper31958 input] (clojure.core/let [rawinput31957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31959 {"ApplicationStatus" (rawinput31957 "ApplicationStatus"), "LastUpdatedTime" (rawinput31957 "LastUpdatedTime")}] (clojure.core/cond-> {} (letvar31959 "ApplicationStatus") (clojure.core/assoc :application-status (deser-application-status (clojure.core/get-in letvar31959 ["ApplicationStatus"]))) (letvar31959 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-update-date-time (clojure.core/get-in letvar31959 ["LastUpdatedTime"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper31961 input] (clojure.core/let [rawinput31960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31962 {"Message" (rawinput31960 "Message")}] (clojure.core/cond-> {} (letvar31962 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar31962 ["Message"])))))))

(clojure.core/defn- response-import-migration-task-result ([input] (response-import-migration-task-result nil input)) ([resultWrapper31964 input] (clojure.core/let [rawinput31963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31965 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-discovered-resource-result ([input] (response-associate-discovered-resource-result nil input)) ([resultWrapper31967 input] (clojure.core/let [rawinput31966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31968 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-created-artifacts-result ([input] (response-list-created-artifacts-result nil input)) ([resultWrapper31970 input] (clojure.core/let [rawinput31969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31971 {"NextToken" (rawinput31969 "NextToken"), "CreatedArtifactList" (rawinput31969 "CreatedArtifactList")}] (clojure.core/cond-> {} (letvar31971 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar31971 ["NextToken"]))) (letvar31971 "CreatedArtifactList") (clojure.core/assoc :created-artifact-list (deser-created-artifact-list (clojure.core/get-in letvar31971 ["CreatedArtifactList"])))))))

(clojure.core/defn- response-create-progress-update-stream-result ([input] (response-create-progress-update-stream-result nil input)) ([resultWrapper31973 input] (clojure.core/let [rawinput31972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar31974 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[^:|]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.dry-run-operation/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.dry-run-operation/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-type #{"MAC_ADDRESS" :ipv-4-address "IPV6_ADDRESS" :bios-id "BIOS_ID" "VM_PATH" :vm-path "IPV4_ADDRESS" "VM_MANAGED_OBJECT_REFERENCE" :vm-managed-object-reference :vm-manager-id :fqdn :vm-name :mac-address "FQDN" "MOTHERBOARD_SERIAL_NUMBER" "VM_NAME" "VM_MANAGER_ID" :ipv-6-address :motherboard-serial-number})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/migration-task]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/latest-resource-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/next-update-seconds (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-result/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.progress-update-stream-summary/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.progress-update-stream-summary/progress-update-stream-name]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.migration-task/resource-attribute-list (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/latest-resource-attribute-list))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/task :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time :portkey.aws.AWSMigrationHub.-2017-05-31.migration-task/resource-attribute-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-result/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/max-results (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-created-artifacts))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/status :portkey.aws.AWSMigrationHub.-2017-05-31/progress-percent :portkey.aws.AWSMigrationHub.-2017-05-31/status-detail :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-name))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/description (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-description))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/description]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.discovered-resource/description (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-description))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/configuration-id] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.discovered-resource/description]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/configuration-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-resources))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.unauthorized-operation/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.unauthorized-operation/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "NOT_STARTED" "FAILED" :not-started :failed})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/configuration-id] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/max-results :portkey.aws.AWSMigrationHub.-2017-05-31/resource-name]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/status-detail (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-resources (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.create-progress-update-stream-request/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.create-progress-update-stream-request/progress-update-stream-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.policy-error-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.policy-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/application-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/application-status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "NOT_STARTED" :not-started})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/type (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-type))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/value (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-value))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/type :portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.delete-progress-update-stream-request/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.delete-progress-update-stream-request/progress-update-stream-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/application-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-percent (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-list] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary-list :portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/task :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time :portkey.aws.AWSMigrationHub.-2017-05-31/next-update-seconds] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.describe-application-state-result/last-updated-time (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/application-status :portkey.aws.AWSMigrationHub.-2017-05-31.describe-application-state-result/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/task (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/status] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/status-detail :portkey.aws.AWSMigrationHub.-2017-05-31/progress-percent]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-created-artifacts (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-result/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[^/:|\000-\037]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.notify-application-state-request/status (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/application-status))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/application-id :portkey.aws.AWSMigrationHub.-2017-05-31.notify-application-state-request/status] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn associate-created-artifact "Associates a created artifact of an AWS cloud resource, the target receiving the\nmigration, with the migration task performed by a migration tool. This API has\nthe following traits:\n * Migration tools can call the AssociateCreatedArtifact operation to indicate\nwhich AWS artifact is associated with a migration task.\n * The created artifact name must be provided in ARN (Amazon Resource Name)\nformat which will contain information about type and region; for example:\narn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.\n * Examples of the AWS resource behind the created artifact are, AMI's, EC2\ninstance, or DMS endpoint, etc." ([associate-created-artifact-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-created-artifact-request associate-created-artifact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateCreatedArtifact", :http.request.configuration/output-deser-fn response-associate-created-artifact-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-created-artifact :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-result))

(clojure.core/defn import-migration-task "Registers a new migration task which represents a server, database, etc., being\nmigrated to AWS by a migration tool.\n This API is a prerequisite to calling the NotifyMigrationTaskState API as the\nmigration tool must first register the migration task with Migration Hub." ([import-migration-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-import-migration-task-request import-migration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportMigrationTask", :http.request.configuration/output-deser-fn response-import-migration-task-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef import-migration-task :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-result))

(clojure.core/defn disassociate-discovered-resource "Disassociate an Application Discovery Service (ADS) discovered resource from a\nmigration task." ([disassociate-discovered-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-discovered-resource-request disassociate-discovered-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDiscoveredResource", :http.request.configuration/output-deser-fn response-disassociate-discovered-resource-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-discovered-resource :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-result))

(clojure.core/defn disassociate-created-artifact "Disassociates a created artifact of an AWS resource with a migration task\nperformed by a migration tool that was previously associated. This API has the\nfollowing traits:\n * A migration user can call the DisassociateCreatedArtifacts operation to\ndisassociate a created AWS Artifact from a migration task.\n * The created artifact name must be provided in ARN (Amazon Resource Name)\nformat which will contain information about type and region; for example:\narn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b.\n * Examples of the AWS resource behind the created artifact are, AMI's, EC2\ninstance, or RDS instance, etc." ([disassociate-created-artifact-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-created-artifact-request disassociate-created-artifact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateCreatedArtifact", :http.request.configuration/output-deser-fn response-disassociate-created-artifact-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-created-artifact :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-result))

(clojure.core/defn list-created-artifacts "Lists the created artifacts attached to a given migration task in an update\nstream. This API has the following traits:\n * Gets the list of the created artifacts while migration is taking place.\n * Shows the artifacts created by the migration tool that was associated by the\nAssociateCreatedArtifact API.\n * Lists created artifacts in a paginated interface." ([list-created-artifacts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-created-artifacts-request list-created-artifacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCreatedArtifacts", :http.request.configuration/output-deser-fn response-list-created-artifacts-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-created-artifacts :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-result))

(clojure.core/defn describe-migration-task "Retrieves a list of all attributes associated with a specific migration task." ([describe-migration-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-migration-task-request describe-migration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMigrationTask", :http.request.configuration/output-deser-fn response-describe-migration-task-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-migration-task :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-result))

(clojure.core/defn delete-progress-update-stream "Deletes a progress update stream, including all of its tasks, which was\npreviously created as an AWS resource used for access control. This API has the\nfollowing traits:\n * The only parameter needed for DeleteProgressUpdateStream is the stream name\n(same as a CreateProgressUpdateStream call).\n * The call will return, and a background process will asynchronously delete the\nstream and all of its resources (tasks, associated resources, resource\nattributes, created artifacts).\n * If the stream takes time to be deleted, it might still show up on a\nListProgressUpdateStreams call.\n * CreateProgressUpdateStream, ImportMigrationTask, NotifyMigrationTaskState,\nand all Associate[*] APIs realted to the tasks belonging to the stream will\nthrow \"InvalidInputException\" if the stream of the same name is in the process\nof being deleted.\n * Once the stream and all of its resources are deleted,\nCreateProgressUpdateStream for a stream of the same name will succeed, and that\nstream will be an entirely new logical resource (without any resources\nassociated with the old stream)." ([delete-progress-update-stream-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-progress-update-stream-request delete-progress-update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProgressUpdateStream", :http.request.configuration/output-deser-fn response-delete-progress-update-stream-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-progress-update-stream :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-result))

(clojure.core/defn list-progress-update-streams "Lists progress update streams associated with the user account making this call." ([] (list-progress-update-streams {})) ([list-progress-update-streams-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-progress-update-streams-request list-progress-update-streams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProgressUpdateStreams", :http.request.configuration/output-deser-fn response-list-progress-update-streams-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-progress-update-streams :args (clojure.spec.alpha/? :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-result))

(clojure.core/defn put-resource-attributes "Provides identifying details of the resource being migrated so that it can be\nassociated in the Application Discovery Service (ADS)'s repository. This\nassociation occurs asynchronously after PutResourceAttributes returns.\n * Keep in mind that subsequent calls to PutResourceAttributes will override\npreviously stored attributes. For example, if it is first called with a MAC\naddress, but later, it is desired to add an IP address, it will then be required\nto call it with both the IP and MAC addresses to prevent overiding the MAC\naddress.\n * Note the instructions regarding the special use case of the\nResourceAttributeList\n(https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#migrationhub-PutResourceAttributes-request-ResourceAttributeList)\nparameter when specifying any \"VM\" related value.\n Because this is an asynchronous call, it will always return 200, whether an\nassociation occurs or not. To confirm if an association was found based on the\nprovided details, call ListDiscoveredResources." ([put-resource-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-resource-attributes-request put-resource-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResourceAttributes", :http.request.configuration/output-deser-fn response-put-resource-attributes-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef put-resource-attributes :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-result))

(clojure.core/defn notify-migration-task-state "Notifies Migration Hub of the current status, progress, or other detail\nregarding a migration task. This API has the following traits:\n * Migration tools will call the NotifyMigrationTaskState API to share the\nlatest progress and status.\n * MigrationTaskName is used for addressing updates to the correct target.\n * ProgressUpdateStream is used for access control and to provide a namespace\nfor each migration tool." ([notify-migration-task-state-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-notify-migration-task-state-request notify-migration-task-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "NotifyMigrationTaskState", :http.request.configuration/output-deser-fn response-notify-migration-task-state-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef notify-migration-task-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-result))

(clojure.core/defn list-migration-tasks "Lists all, or filtered by resource name, migration tasks associated with the\nuser account making this call. This API has the following traits:\n * Can show a summary list of the most recent migration tasks.\n * Can show a summary list of migration tasks associated with a given discovered\nresource.\n * Lists migration tasks in a paginated interface." ([] (list-migration-tasks {})) ([list-migration-tasks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-migration-tasks-request list-migration-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMigrationTasks", :http.request.configuration/output-deser-fn response-list-migration-tasks-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-migration-tasks :args (clojure.spec.alpha/? :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-result))

(clojure.core/defn list-discovered-resources "Lists discovered resources associated with the given MigrationTask." ([list-discovered-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-discovered-resources-request list-discovered-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDiscoveredResources", :http.request.configuration/output-deser-fn response-list-discovered-resources-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-discovered-resources :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-result))

(clojure.core/defn notify-application-state "Sets the migration state of an application. For a given application identified\nby the value passed to ApplicationId, its status is set or updated by passing\none of three values to Status: NOT_STARTED | IN_PROGRESS | COMPLETED." ([notify-application-state-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-notify-application-state-request notify-application-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "NotifyApplicationState", :http.request.configuration/output-deser-fn response-notify-application-state-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef notify-application-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-result))

(clojure.core/defn create-progress-update-stream "Creates a progress update stream which is an AWS resource used for access\ncontrol as well as a namespace for migration task names that is implicitly\nlinked to your AWS account. It must uniquely identify the migration tool as it\nis used for all updates made by the tool; however, it does not need to be unique\nfor each AWS account because it is scoped to the AWS account." ([create-progress-update-stream-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-progress-update-stream-request create-progress-update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProgressUpdateStream", :http.request.configuration/output-deser-fn response-create-progress-update-stream-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef create-progress-update-stream :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-result))

(clojure.core/defn associate-discovered-resource "Associates a discovered resource ID from Application Discovery Service (ADS)\nwith a migration task." ([associate-discovered-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-discovered-resource-request associate-discovered-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDiscoveredResource", :http.request.configuration/output-deser-fn response-associate-discovered-resource-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-discovered-resource :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-result))

(clojure.core/defn describe-application-state "Gets the migration status of an application." ([describe-application-state-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-application-state-request describe-application-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeApplicationState", :http.request.configuration/output-deser-fn response-describe-application-state-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-application-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-result))
