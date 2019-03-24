(ns portkey.aws.codecommit.-2015-04-13 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "codecommit", :region "ap-northeast-1"},
    :ssl-common-name "codecommit.ap-northeast-1.amazonaws.com",
    :endpoint "https://codecommit.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codecommit", :region "eu-west-1"},
    :ssl-common-name "codecommit.eu-west-1.amazonaws.com",
    :endpoint "https://codecommit.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codecommit", :region "us-east-2"},
    :ssl-common-name "codecommit.us-east-2.amazonaws.com",
    :endpoint "https://codecommit.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "codecommit", :region "ap-southeast-2"},
    :ssl-common-name "codecommit.ap-southeast-2.amazonaws.com",
    :endpoint "https://codecommit.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codecommit", :region "sa-east-1"},
    :ssl-common-name "codecommit.sa-east-1.amazonaws.com",
    :endpoint "https://codecommit.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "codecommit", :region "ap-southeast-1"},
    :ssl-common-name "codecommit.ap-southeast-1.amazonaws.com",
    :endpoint "https://codecommit.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "codecommit", :region "ap-northeast-2"},
    :ssl-common-name "codecommit.ap-northeast-2.amazonaws.com",
    :endpoint "https://codecommit.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codecommit", :region "eu-west-3"},
    :ssl-common-name "codecommit.eu-west-3.amazonaws.com",
    :endpoint "https://codecommit.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codecommit", :region "ca-central-1"},
    :ssl-common-name "codecommit.ca-central-1.amazonaws.com",
    :endpoint "https://codecommit.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codecommit", :region "eu-central-1"},
    :ssl-common-name "codecommit.eu-central-1.amazonaws.com",
    :endpoint "https://codecommit.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codecommit", :region "eu-west-2"},
    :ssl-common-name "codecommit.eu-west-2.amazonaws.com",
    :endpoint "https://codecommit.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codecommit", :region "us-west-2"},
    :ssl-common-name "codecommit.us-west-2.amazonaws.com",
    :endpoint "https://codecommit.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codecommit", :region "us-east-1"},
    :ssl-common-name "codecommit.us-east-1.amazonaws.com",
    :endpoint "https://codecommit.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codecommit", :region "us-west-1"},
    :ssl-common-name "codecommit.us-west-1.amazonaws.com",
    :endpoint "https://codecommit.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codecommit", :region "ap-south-1"},
    :ssl-common-name "codecommit.ap-south-1.amazonaws.com",
    :endpoint "https://codecommit.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "fips"
   {:credential-scope {:service "codecommit", :region "ca-central-1"},
    :ssl-common-name "codecommit-fips.ca-central-1.amazonaws.com",
    :endpoint "https://codecommit-fips.ca-central-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-object-id)

(clojure.core/declare ser-email)

(clojure.core/declare ser-pull-request-id)

(clojure.core/declare ser-repository-trigger-event-list)

(clojure.core/declare ser-is-move)

(clojure.core/declare ser-delete-file-entries)

(clojure.core/declare ser-repository-trigger-event-enum)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-path)

(clojure.core/declare ser-branch-name)

(clojure.core/declare ser-title)

(clojure.core/declare ser-source-file-specifier)

(clojure.core/declare ser-file-content)

(clojure.core/declare ser-location)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-order-enum)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-put-file-entry)

(clojure.core/declare ser-repository-triggers-list)

(clojure.core/declare ser-repository-trigger-name)

(clojure.core/declare ser-commit-id)

(clojure.core/declare ser-keep-empty-folders)

(clojure.core/declare ser-comment-id)

(clojure.core/declare ser-repository-trigger-custom-data)

(clojure.core/declare ser-merge-option-type-enum)

(clojure.core/declare ser-description)

(clojure.core/declare ser-message)

(clojure.core/declare ser-branch-name-list)

(clojure.core/declare ser-position)

(clojure.core/declare ser-content)

(clojure.core/declare ser-repository-description)

(clojure.core/declare ser-repository-trigger)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-pull-request-status-enum)

(clojure.core/declare ser-put-file-entries)

(clojure.core/declare ser-pull-request-event-type)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-relative-file-version-enum)

(clojure.core/declare ser-set-file-mode-entries)

(clojure.core/declare ser-target-list)

(clojure.core/declare ser-target)

(clojure.core/declare ser-name)

(clojure.core/declare ser-set-file-mode-entry)

(clojure.core/declare ser-sort-by-enum)

(clojure.core/declare ser-file-mode-type-enum)

(clojure.core/declare ser-delete-file-entry)

(clojure.core/declare ser-commit-name)

(clojure.core/declare ser-reference-name)

(clojure.core/declare ser-repository-name-list)

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-object-id [input] #:http.request.field{:value input, :shape "ObjectId"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-pull-request-id [input] #:http.request.field{:value input, :shape "PullRequestId"})

(clojure.core/defn- ser-repository-trigger-event-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-trigger-event-enum coll) #:http.request.field{:shape "RepositoryTriggerEventEnum"}))) input), :shape "RepositoryTriggerEventList", :type "list"})

(clojure.core/defn- ser-is-move [input] #:http.request.field{:value input, :shape "IsMove"})

(clojure.core/defn- ser-delete-file-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-delete-file-entry coll) #:http.request.field{:shape "DeleteFileEntry"}))) input), :shape "DeleteFileEntries", :type "list"})

(clojure.core/defn- ser-repository-trigger-event-enum [input] #:http.request.field{:value (clojure.core/get {"all" "all", :all "all", "updateReference" "updateReference", :update-reference "updateReference", "createReference" "createReference", :create-reference "createReference", "deleteReference" "deleteReference", :delete-reference "deleteReference"} input), :shape "RepositoryTriggerEventEnum"})

(clojure.core/defn- ser-repository-name [input] #:http.request.field{:value input, :shape "RepositoryName"})

(clojure.core/defn- ser-path [input] #:http.request.field{:value input, :shape "Path"})

(clojure.core/defn- ser-branch-name [input] #:http.request.field{:value input, :shape "BranchName"})

(clojure.core/defn- ser-title [input] #:http.request.field{:value input, :shape "Title"})

(clojure.core/defn- ser-source-file-specifier [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"})], :shape "SourceFileSpecifier", :type "structure"} (clojure.core/contains? input :is-move) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-move (input :is-move)) #:http.request.field{:name "isMove", :shape "IsMove"}))))

(clojure.core/defn- ser-file-content [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "FileContent"})

(clojure.core/defn- ser-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Location", :type "structure"} (clojure.core/contains? input :file-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})) (clojure.core/contains? input :file-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-position (input :file-position)) #:http.request.field{:name "filePosition", :shape "Position"})) (clojure.core/contains? input :relative-file-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relative-file-version-enum (input :relative-file-version)) #:http.request.field{:name "relativeFileVersion", :shape "RelativeFileVersionEnum"}))))

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-order-enum [input] #:http.request.field{:value (clojure.core/get {"ascending" "ascending", :ascending "ascending", "descending" "descending", :descending "descending"} input), :shape "OrderEnum"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-put-file-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"})], :shape "PutFileEntry", :type "structure"} (clojure.core/contains? input :file-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-mode-type-enum (input :file-mode)) #:http.request.field{:name "fileMode", :shape "FileModeTypeEnum"})) (clojure.core/contains? input :file-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-content (input :file-content)) #:http.request.field{:name "fileContent", :shape "FileContent"})) (clojure.core/contains? input :source-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-file-specifier (input :source-file)) #:http.request.field{:name "sourceFile", :shape "SourceFileSpecifier"}))))

(clojure.core/defn- ser-repository-triggers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-trigger coll) #:http.request.field{:shape "RepositoryTrigger"}))) input), :shape "RepositoryTriggersList", :type "list"})

(clojure.core/defn- ser-repository-trigger-name [input] #:http.request.field{:value input, :shape "RepositoryTriggerName"})

(clojure.core/defn- ser-commit-id [input] #:http.request.field{:value input, :shape "CommitId"})

(clojure.core/defn- ser-keep-empty-folders [input] #:http.request.field{:value input, :shape "KeepEmptyFolders"})

(clojure.core/defn- ser-comment-id [input] #:http.request.field{:value input, :shape "CommentId"})

(clojure.core/defn- ser-repository-trigger-custom-data [input] #:http.request.field{:value input, :shape "RepositoryTriggerCustomData"})

(clojure.core/defn- ser-merge-option-type-enum [input] #:http.request.field{:value (clojure.core/get {"FAST_FORWARD_MERGE" "FAST_FORWARD_MERGE", :fast-forward-merge "FAST_FORWARD_MERGE"} input), :shape "MergeOptionTypeEnum"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-message [input] #:http.request.field{:value input, :shape "Message"})

(clojure.core/defn- ser-branch-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-branch-name coll) #:http.request.field{:shape "BranchName"}))) input), :shape "BranchNameList", :type "list"})

(clojure.core/defn- ser-position [input] #:http.request.field{:value input, :shape "Position"})

(clojure.core/defn- ser-content [input] #:http.request.field{:value input, :shape "Content"})

(clojure.core/defn- ser-repository-description [input] #:http.request.field{:value input, :shape "RepositoryDescription"})

(clojure.core/defn- ser-repository-trigger [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-trigger-name (:name input)) #:http.request.field{:name "name", :shape "RepositoryTriggerName"}) (clojure.core/into (ser-arn (:destination-arn input)) #:http.request.field{:name "destinationArn", :shape "Arn"}) (clojure.core/into (ser-repository-trigger-event-list (:events input)) #:http.request.field{:name "events", :shape "RepositoryTriggerEventList"})], :shape "RepositoryTrigger", :type "structure"} (clojure.core/contains? input :custom-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-trigger-custom-data (input :custom-data)) #:http.request.field{:name "customData", :shape "RepositoryTriggerCustomData"})) (clojure.core/contains? input :branches) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-branch-name-list (input :branches)) #:http.request.field{:name "branches", :shape "BranchNameList"}))))

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-pull-request-status-enum [input] #:http.request.field{:value (clojure.core/get {"OPEN" "OPEN", :open "OPEN", "CLOSED" "CLOSED", :closed "CLOSED"} input), :shape "PullRequestStatusEnum"})

(clojure.core/defn- ser-put-file-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-put-file-entry coll) #:http.request.field{:shape "PutFileEntry"}))) input), :shape "PutFileEntries", :type "list"})

(clojure.core/defn- ser-pull-request-event-type [input] #:http.request.field{:value (clojure.core/get {"PULL_REQUEST_CREATED" "PULL_REQUEST_CREATED", :pull-request-created "PULL_REQUEST_CREATED", "PULL_REQUEST_STATUS_CHANGED" "PULL_REQUEST_STATUS_CHANGED", :pull-request-status-changed "PULL_REQUEST_STATUS_CHANGED", "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" "PULL_REQUEST_SOURCE_REFERENCE_UPDATED", :pull-request-source-reference-updated "PULL_REQUEST_SOURCE_REFERENCE_UPDATED", "PULL_REQUEST_MERGE_STATE_CHANGED" "PULL_REQUEST_MERGE_STATE_CHANGED", :pull-request-merge-state-changed "PULL_REQUEST_MERGE_STATE_CHANGED"} input), :shape "PullRequestEventType"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-relative-file-version-enum [input] #:http.request.field{:value (clojure.core/get {"BEFORE" "BEFORE", :before "BEFORE", "AFTER" "AFTER", :after "AFTER"} input), :shape "RelativeFileVersionEnum"})

(clojure.core/defn- ser-set-file-mode-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-set-file-mode-entry coll) #:http.request.field{:shape "SetFileModeEntry"}))) input), :shape "SetFileModeEntries", :type "list"})

(clojure.core/defn- ser-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target coll) #:http.request.field{:shape "Target"}))) input), :shape "TargetList", :type "list"})

(clojure.core/defn- ser-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-name (:repository-name input)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-reference-name (:source-reference input)) #:http.request.field{:name "sourceReference", :shape "ReferenceName"})], :shape "Target", :type "structure"} (clojure.core/contains? input :destination-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reference-name (input :destination-reference)) #:http.request.field{:name "destinationReference", :shape "ReferenceName"}))))

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-set-file-mode-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"}) (clojure.core/into (ser-file-mode-type-enum (:file-mode input)) #:http.request.field{:name "fileMode", :shape "FileModeTypeEnum"})], :shape "SetFileModeEntry", :type "structure"}))

(clojure.core/defn- ser-sort-by-enum [input] #:http.request.field{:value (clojure.core/get {"repositoryName" "repositoryName", :repository-name "repositoryName", "lastModifiedDate" "lastModifiedDate", :last-modified-date "lastModifiedDate"} input), :shape "SortByEnum"})

(clojure.core/defn- ser-file-mode-type-enum [input] #:http.request.field{:value (clojure.core/get {"EXECUTABLE" "EXECUTABLE", :executable "EXECUTABLE", "NORMAL" "NORMAL", :normal "NORMAL", "SYMLINK" "SYMLINK", :symlink "SYMLINK"} input), :shape "FileModeTypeEnum"})

(clojure.core/defn- ser-delete-file-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"})], :shape "DeleteFileEntry", :type "structure"}))

(clojure.core/defn- ser-commit-name [input] #:http.request.field{:value input, :shape "CommitName"})

(clojure.core/defn- ser-reference-name [input] #:http.request.field{:value input, :shape "ReferenceName"})

(clojure.core/defn- ser-repository-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-name coll) #:http.request.field{:shape "RepositoryName"}))) input), :shape "RepositoryNameList", :type "list"})

(clojure.core/defn- req-get-branch-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :repository-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})) (clojure.core/contains? input :branch-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}))))

(clojure.core/defn- req-create-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-title (input :title)) #:http.request.field{:name "title", :shape "Title"}) (clojure.core/into (ser-target-list (input :targets)) #:http.request.field{:name "targets", :shape "TargetList"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-update-default-branch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :default-branch-name)) #:http.request.field{:name "defaultBranchName", :shape "BranchName"})]}))

(clojure.core/defn- req-delete-file-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"}) (clojure.core/into (ser-commit-id (input :parent-commit-id)) #:http.request.field{:name "parentCommitId", :shape "CommitId"})]} (clojure.core/contains? input :keep-empty-folders) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-keep-empty-folders (input :keep-empty-folders)) #:http.request.field{:name "keepEmptyFolders", :shape "KeepEmptyFolders"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "Message"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "email", :shape "Email"}))))

(clojure.core/defn- req-delete-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-get-merge-conflicts-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-name (input :destination-commit-specifier)) #:http.request.field{:name "destinationCommitSpecifier", :shape "CommitName"}) (clojure.core/into (ser-commit-name (input :source-commit-specifier)) #:http.request.field{:name "sourceCommitSpecifier", :shape "CommitName"}) (clojure.core/into (ser-merge-option-type-enum (input :merge-option)) #:http.request.field{:name "mergeOption", :shape "MergeOptionTypeEnum"})]}))

(clojure.core/defn- req-create-branch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}) (clojure.core/into (ser-commit-id (input :commit-id)) #:http.request.field{:name "commitId", :shape "CommitId"})]}))

(clojure.core/defn- req-get-file-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})]} (clojure.core/contains? input :commit-specifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-name (input :commit-specifier)) #:http.request.field{:name "commitSpecifier", :shape "CommitName"}))))

(clojure.core/defn- req-delete-comment-content-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :comment-id)) #:http.request.field{:name "commentId", :shape "CommentId"})]}))

(clojure.core/defn- req-get-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"})]}))

(clojure.core/defn- req-update-comment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :comment-id)) #:http.request.field{:name "commentId", :shape "CommentId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]}))

(clojure.core/defn- req-post-comment-for-compared-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]} (clojure.core/contains? input :before-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "location", :shape "Location"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-get-comments-for-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"})]} (clojure.core/contains? input :repository-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})) (clojure.core/contains? input :before-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"})) (clojure.core/contains? input :after-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-update-pull-request-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-pull-request-status-enum (input :pull-request-status)) #:http.request.field{:name "pullRequestStatus", :shape "PullRequestStatusEnum"})]}))

(clojure.core/defn- req-get-comment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :comment-id)) #:http.request.field{:name "commentId", :shape "CommentId"})]}))

(clojure.core/defn- req-get-repository-triggers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-test-repository-triggers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-triggers-list (input :triggers)) #:http.request.field{:name "triggers", :shape "RepositoryTriggersList"})]}))

(clojure.core/defn- req-batch-get-repositories-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name-list (input :repository-names)) #:http.request.field{:name "repositoryNames", :shape "RepositoryNameList"})]}))

(clojure.core/defn- req-get-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-update-pull-request-description-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})]}))

(clojure.core/defn- req-get-comments-for-compared-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"})]} (clojure.core/contains? input :before-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-pull-request-events-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"})]} (clojure.core/contains? input :pull-request-event-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pull-request-event-type (input :pull-request-event-type)) #:http.request.field{:name "pullRequestEventType", :shape "PullRequestEventType"})) (clojure.core/contains? input :actor-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :actor-arn)) #:http.request.field{:name "actorArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-branches-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-post-comment-reply-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :in-reply-to)) #:http.request.field{:name "inReplyTo", :shape "CommentId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-get-folder-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-path (input :folder-path)) #:http.request.field{:name "folderPath", :shape "Path"})]} (clojure.core/contains? input :commit-specifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-name (input :commit-specifier)) #:http.request.field{:name "commitSpecifier", :shape "CommitName"}))))

(clojure.core/defn- req-create-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :repository-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-description (input :repository-description)) #:http.request.field{:name "repositoryDescription", :shape "RepositoryDescription"}))))

(clojure.core/defn- req-create-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"})]} (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "email", :shape "Email"})) (clojure.core/contains? input :delete-files) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-file-entries (input :delete-files)) #:http.request.field{:name "deleteFiles", :shape "DeleteFileEntries"})) (clojure.core/contains? input :set-file-modes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-file-mode-entries (input :set-file-modes)) #:http.request.field{:name "setFileModes", :shape "SetFileModeEntries"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "Message"})) (clojure.core/contains? input :keep-empty-folders) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-keep-empty-folders (input :keep-empty-folders)) #:http.request.field{:name "keepEmptyFolders", :shape "KeepEmptyFolders"})) (clojure.core/contains? input :put-files) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-put-file-entries (input :put-files)) #:http.request.field{:name "putFiles", :shape "PutFileEntries"})) (clojure.core/contains? input :author-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :author-name)) #:http.request.field{:name "authorName", :shape "Name"})) (clojure.core/contains? input :parent-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :parent-commit-id)) #:http.request.field{:name "parentCommitId", :shape "CommitId"}))))

(clojure.core/defn- req-post-comment-for-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"}) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "location", :shape "Location"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-list-repositories-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by-enum (input :sort-by)) #:http.request.field{:name "sortBy", :shape "SortByEnum"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-enum (input :order)) #:http.request.field{:name "order", :shape "OrderEnum"}))))

(clojure.core/defn- req-put-file-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}) (clojure.core/into (ser-file-content (input :file-content)) #:http.request.field{:name "fileContent", :shape "FileContent"}) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})]} (clojure.core/contains? input :file-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-mode-type-enum (input :file-mode)) #:http.request.field{:name "fileMode", :shape "FileModeTypeEnum"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "email", :shape "Email"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "Message"})) (clojure.core/contains? input :parent-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :parent-commit-id)) #:http.request.field{:name "parentCommitId", :shape "CommitId"}))))

(clojure.core/defn- req-update-repository-description-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :repository-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-description (input :repository-description)) #:http.request.field{:name "repositoryDescription", :shape "RepositoryDescription"}))))

(clojure.core/defn- req-get-differences-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-name (input :after-commit-specifier)) #:http.request.field{:name "afterCommitSpecifier", :shape "CommitName"})]} (clojure.core/contains? input :before-commit-specifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-name (input :before-commit-specifier)) #:http.request.field{:name "beforeCommitSpecifier", :shape "CommitName"})) (clojure.core/contains? input :before-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :before-path)) #:http.request.field{:name "beforePath", :shape "Path"})) (clojure.core/contains? input :after-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :after-path)) #:http.request.field{:name "afterPath", :shape "Path"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-pull-requests-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :author-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :author-arn)) #:http.request.field{:name "authorArn", :shape "Arn"})) (clojure.core/contains? input :pull-request-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pull-request-status-enum (input :pull-request-status)) #:http.request.field{:name "pullRequestStatus", :shape "PullRequestStatusEnum"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-put-repository-triggers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-triggers-list (input :triggers)) #:http.request.field{:name "triggers", :shape "RepositoryTriggersList"})]}))

(clojure.core/defn- req-merge-pull-request-by-fast-forward-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :source-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :source-commit-id)) #:http.request.field{:name "sourceCommitId", :shape "CommitId"}))))

(clojure.core/defn- req-update-pull-request-title-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-title (input :title)) #:http.request.field{:name "title", :shape "Title"})]}))

(clojure.core/defn- req-get-blob-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-object-id (input :blob-id)) #:http.request.field{:name "blobId", :shape "ObjectId"})]}))

(clojure.core/defn- req-update-repository-name-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :old-name)) #:http.request.field{:name "oldName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-name (input :new-name)) #:http.request.field{:name "newName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-get-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-object-id (input :commit-id)) #:http.request.field{:name "commitId", :shape "ObjectId"})]}))

(clojure.core/defn- req-delete-branch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"})]}))

(clojure.core/declare deser-is-comment-deleted)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-object-id)

(clojure.core/declare deser-pull-request-created-event-metadata)

(clojure.core/declare deser-email)

(clojure.core/declare deser-pull-request-id)

(clojure.core/declare deser-repository-trigger-event-list)

(clojure.core/declare deser-object-size)

(clojure.core/declare deser-is-merged)

(clojure.core/declare deser-comment)

(clojure.core/declare deser-merge-metadata)

(clojure.core/declare deser-files-metadata)

(clojure.core/declare deser-sub-module-list)

(clojure.core/declare deser-pull-request-target)

(clojure.core/declare deser-repository-metadata-list)

(clojure.core/declare deser-last-modified-date)

(clojure.core/declare deser-comments)

(clojure.core/declare deser-repository-trigger-event-enum)

(clojure.core/declare deser-repository-triggers-configuration-id)

(clojure.core/declare deser-comments-for-pull-request-data)

(clojure.core/declare deser-repository-name)

(clojure.core/declare deser-path)

(clojure.core/declare deser-repository-id)

(clojure.core/declare deser-folder)

(clojure.core/declare deser-symbolic-link)

(clojure.core/declare deser-folder-list)

(clojure.core/declare deser-branch-name)

(clojure.core/declare deser-title)

(clojure.core/declare deserblob)

(clojure.core/declare deser-parent-list)

(clojure.core/declare deser-difference-list)

(clojure.core/declare deser-repository-trigger-execution-failure)

(clojure.core/declare deser-branch-info)

(clojure.core/declare deser-file)

(clojure.core/declare deser-pull-request-event)

(clojure.core/declare deser-pull-request)

(clojure.core/declare deser-repository-trigger-name-list)

(clojure.core/declare deser-file-content)

(clojure.core/declare deser-location)

(clojure.core/declare deser-difference)

(clojure.core/declare deser-pull-request-source-reference-updated-event-metadata)

(clojure.core/declare deser-mode)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-file-metadata)

(clojure.core/declare deser-comments-for-compared-commit)

(clojure.core/declare deser-date)

(clojure.core/declare deser-pull-request-merged-state-changed-event-metadata)

(clojure.core/declare deser-repository-triggers-list)

(clojure.core/declare deser-blob-metadata)

(clojure.core/declare deser-repository-trigger-execution-failure-message)

(clojure.core/declare deser-clone-url-http)

(clojure.core/declare deser-repository-trigger-name)

(clojure.core/declare deser-commit-id)

(clojure.core/declare deser-commit)

(clojure.core/declare deser-comments-for-pull-request)

(clojure.core/declare deser-sub-module)

(clojure.core/declare deser-comment-id)

(clojure.core/declare deser-repository-trigger-custom-data)

(clojure.core/declare deser-description)

(clojure.core/declare deser-repository-name-id-pair-list)

(clojure.core/declare deser-pull-request-id-list)

(clojure.core/declare deser-change-type-enum)

(clojure.core/declare deser-message)

(clojure.core/declare deser-pull-request-event-list)

(clojure.core/declare deser-event-date)

(clojure.core/declare deser-clone-url-ssh)

(clojure.core/declare deser-branch-name-list)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-position)

(clojure.core/declare deser-content)

(clojure.core/declare deser-repository-description)

(clojure.core/declare deser-repository-trigger)

(clojure.core/declare deser-repository-name-id-pair)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-repository-not-found-list)

(clojure.core/declare deser-creation-date)

(clojure.core/declare deser-symbolic-link-list)

(clojure.core/declare deser-pull-request-status-enum)

(clojure.core/declare deser-pull-request-event-type)

(clojure.core/declare deser-relative-file-version-enum)

(clojure.core/declare deser-repository-metadata)

(clojure.core/declare deser-name)

(clojure.core/declare deser-repository-trigger-execution-failure-list)

(clojure.core/declare deser-pull-request-target-list)

(clojure.core/declare deser-file-mode-type-enum)

(clojure.core/declare deser-file-list)

(clojure.core/declare deser-reference-name)

(clojure.core/declare deser-pull-request-status-changed-event-metadata)

(clojure.core/declare deser-is-mergeable)

(clojure.core/declare deser-comments-for-compared-commit-data)

(clojure.core/declare deser-user-info)

(clojure.core/declare deser-additional-data)

(clojure.core/defn- deser-is-comment-deleted [input] input)

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-object-id [input] input)

(clojure.core/defn- deser-pull-request-created-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "sourceCommitId") (clojure.core/assoc :source-commit-id (deser-commit-id (input "sourceCommitId"))) (clojure.core/contains? input "destinationCommitId") (clojure.core/assoc :destination-commit-id (deser-commit-id (input "destinationCommitId"))) (clojure.core/contains? input "mergeBase") (clojure.core/assoc :merge-base (deser-commit-id (input "mergeBase")))))

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-pull-request-id [input] input)

(clojure.core/defn- deser-repository-trigger-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger-event-enum coll))) input))

(clojure.core/defn- deser-object-size [input] input)

(clojure.core/defn- deser-is-merged [input] input)

(clojure.core/defn- deser-comment [input] (clojure.core/cond-> {} (clojure.core/contains? input "commentId") (clojure.core/assoc :comment-id (deser-comment-id (input "commentId"))) (clojure.core/contains? input "content") (clojure.core/assoc :content (deser-content (input "content"))) (clojure.core/contains? input "inReplyTo") (clojure.core/assoc :in-reply-to (deser-comment-id (input "inReplyTo"))) (clojure.core/contains? input "creationDate") (clojure.core/assoc :creation-date (deser-creation-date (input "creationDate"))) (clojure.core/contains? input "lastModifiedDate") (clojure.core/assoc :last-modified-date (deser-last-modified-date (input "lastModifiedDate"))) (clojure.core/contains? input "authorArn") (clojure.core/assoc :author-arn (deser-arn (input "authorArn"))) (clojure.core/contains? input "deleted") (clojure.core/assoc :deleted (deser-is-comment-deleted (input "deleted"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken")))))

(clojure.core/defn- deser-merge-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "isMerged") (clojure.core/assoc :is-merged (deser-is-merged (input "isMerged"))) (clojure.core/contains? input "mergedBy") (clojure.core/assoc :merged-by (deser-arn (input "mergedBy")))))

(clojure.core/defn- deser-files-metadata [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-metadata coll))) input))

(clojure.core/defn- deser-sub-module-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sub-module coll))) input))

(clojure.core/defn- deser-pull-request-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "sourceReference") (clojure.core/assoc :source-reference (deser-reference-name (input "sourceReference"))) (clojure.core/contains? input "destinationReference") (clojure.core/assoc :destination-reference (deser-reference-name (input "destinationReference"))) (clojure.core/contains? input "destinationCommit") (clojure.core/assoc :destination-commit (deser-commit-id (input "destinationCommit"))) (clojure.core/contains? input "sourceCommit") (clojure.core/assoc :source-commit (deser-commit-id (input "sourceCommit"))) (clojure.core/contains? input "mergeBase") (clojure.core/assoc :merge-base (deser-commit-id (input "mergeBase"))) (clojure.core/contains? input "mergeMetadata") (clojure.core/assoc :merge-metadata (deser-merge-metadata (input "mergeMetadata")))))

(clojure.core/defn- deser-repository-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-metadata coll))) input))

(clojure.core/defn- deser-last-modified-date [input] input)

(clojure.core/defn- deser-comments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comment coll))) input))

(clojure.core/defn- deser-repository-trigger-event-enum [input] (clojure.core/get {"all" :all, "updateReference" :update-reference, "createReference" :create-reference, "deleteReference" :delete-reference} input))

(clojure.core/defn- deser-repository-triggers-configuration-id [input] input)

(clojure.core/defn- deser-comments-for-pull-request-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comments-for-pull-request coll))) input))

(clojure.core/defn- deser-repository-name [input] input)

(clojure.core/defn- deser-path [input] input)

(clojure.core/defn- deser-repository-id [input] input)

(clojure.core/defn- deser-folder [input] (clojure.core/cond-> {} (clojure.core/contains? input "treeId") (clojure.core/assoc :tree-id (deser-object-id (input "treeId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath")))))

(clojure.core/defn- deser-symbolic-link [input] (clojure.core/cond-> {} (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath"))) (clojure.core/contains? input "fileMode") (clojure.core/assoc :file-mode (deser-file-mode-type-enum (input "fileMode")))))

(clojure.core/defn- deser-folder-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-folder coll))) input))

(clojure.core/defn- deser-branch-name [input] input)

(clojure.core/defn- deser-title [input] input)

(clojure.core/defn- deserblob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-parent-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-id coll))) input))

(clojure.core/defn- deser-difference-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-difference coll))) input))

(clojure.core/defn- deser-repository-trigger-execution-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "trigger") (clojure.core/assoc :trigger (deser-repository-trigger-name (input "trigger"))) (clojure.core/contains? input "failureMessage") (clojure.core/assoc :failure-message (deser-repository-trigger-execution-failure-message (input "failureMessage")))))

(clojure.core/defn- deser-branch-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "branchName") (clojure.core/assoc :branch-name (deser-branch-name (input "branchName"))) (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-commit-id (input "commitId")))))

(clojure.core/defn- deser-file [input] (clojure.core/cond-> {} (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath"))) (clojure.core/contains? input "fileMode") (clojure.core/assoc :file-mode (deser-file-mode-type-enum (input "fileMode")))))

(clojure.core/defn- deser-pull-request-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (input "pullRequestId"))) (clojure.core/contains? input "eventDate") (clojure.core/assoc :event-date (deser-event-date (input "eventDate"))) (clojure.core/contains? input "pullRequestEventType") (clojure.core/assoc :pull-request-event-type (deser-pull-request-event-type (input "pullRequestEventType"))) (clojure.core/contains? input "actorArn") (clojure.core/assoc :actor-arn (deser-arn (input "actorArn"))) (clojure.core/contains? input "pullRequestCreatedEventMetadata") (clojure.core/assoc :pull-request-created-event-metadata (deser-pull-request-created-event-metadata (input "pullRequestCreatedEventMetadata"))) (clojure.core/contains? input "pullRequestStatusChangedEventMetadata") (clojure.core/assoc :pull-request-status-changed-event-metadata (deser-pull-request-status-changed-event-metadata (input "pullRequestStatusChangedEventMetadata"))) (clojure.core/contains? input "pullRequestSourceReferenceUpdatedEventMetadata") (clojure.core/assoc :pull-request-source-reference-updated-event-metadata (deser-pull-request-source-reference-updated-event-metadata (input "pullRequestSourceReferenceUpdatedEventMetadata"))) (clojure.core/contains? input "pullRequestMergedStateChangedEventMetadata") (clojure.core/assoc :pull-request-merged-state-changed-event-metadata (deser-pull-request-merged-state-changed-event-metadata (input "pullRequestMergedStateChangedEventMetadata")))))

(clojure.core/defn- deser-pull-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "creationDate") (clojure.core/assoc :creation-date (deser-creation-date (input "creationDate"))) (clojure.core/contains? input "lastActivityDate") (clojure.core/assoc :last-activity-date (deser-last-modified-date (input "lastActivityDate"))) (clojure.core/contains? input "pullRequestStatus") (clojure.core/assoc :pull-request-status (deser-pull-request-status-enum (input "pullRequestStatus"))) (clojure.core/contains? input "pullRequestTargets") (clojure.core/assoc :pull-request-targets (deser-pull-request-target-list (input "pullRequestTargets"))) (clojure.core/contains? input "authorArn") (clojure.core/assoc :author-arn (deser-arn (input "authorArn"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken"))) (clojure.core/contains? input "title") (clojure.core/assoc :title (deser-title (input "title"))) (clojure.core/contains? input "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (input "pullRequestId"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description")))))

(clojure.core/defn- deser-repository-trigger-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger-name coll))) input))

(clojure.core/defn- deser-file-content [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "filePath") (clojure.core/assoc :file-path (deser-path (input "filePath"))) (clojure.core/contains? input "filePosition") (clojure.core/assoc :file-position (deser-position (input "filePosition"))) (clojure.core/contains? input "relativeFileVersion") (clojure.core/assoc :relative-file-version (deser-relative-file-version-enum (input "relativeFileVersion")))))

(clojure.core/defn- deser-difference [input] (clojure.core/cond-> {} (clojure.core/contains? input "beforeBlob") (clojure.core/assoc :before-blob (deser-blob-metadata (input "beforeBlob"))) (clojure.core/contains? input "afterBlob") (clojure.core/assoc :after-blob (deser-blob-metadata (input "afterBlob"))) (clojure.core/contains? input "changeType") (clojure.core/assoc :change-type (deser-change-type-enum (input "changeType")))))

(clojure.core/defn- deser-pull-request-source-reference-updated-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (input "beforeCommitId"))) (clojure.core/contains? input "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (input "afterCommitId"))) (clojure.core/contains? input "mergeBase") (clojure.core/assoc :merge-base (deser-commit-id (input "mergeBase")))))

(clojure.core/defn- deser-mode [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-file-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "fileMode") (clojure.core/assoc :file-mode (deser-file-mode-type-enum (input "fileMode")))))

(clojure.core/defn- deser-comments-for-compared-commit [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (input "beforeCommitId"))) (clojure.core/contains? input "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (input "afterCommitId"))) (clojure.core/contains? input "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (input "beforeBlobId"))) (clojure.core/contains? input "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (input "afterBlobId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location (input "location"))) (clojure.core/contains? input "comments") (clojure.core/assoc :comments (deser-comments (input "comments")))))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-pull-request-merged-state-changed-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "destinationReference") (clojure.core/assoc :destination-reference (deser-reference-name (input "destinationReference"))) (clojure.core/contains? input "mergeMetadata") (clojure.core/assoc :merge-metadata (deser-merge-metadata (input "mergeMetadata")))))

(clojure.core/defn- deser-repository-triggers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger coll))) input))

(clojure.core/defn- deser-blob-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "path") (clojure.core/assoc :path (deser-path (input "path"))) (clojure.core/contains? input "mode") (clojure.core/assoc :mode (deser-mode (input "mode")))))

(clojure.core/defn- deser-repository-trigger-execution-failure-message [input] input)

(clojure.core/defn- deser-clone-url-http [input] input)

(clojure.core/defn- deser-repository-trigger-name [input] input)

(clojure.core/defn- deser-commit-id [input] input)

(clojure.core/defn- deser-commit [input] (clojure.core/cond-> {} (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-object-id (input "commitId"))) (clojure.core/contains? input "treeId") (clojure.core/assoc :tree-id (deser-object-id (input "treeId"))) (clojure.core/contains? input "parents") (clojure.core/assoc :parents (deser-parent-list (input "parents"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "author") (clojure.core/assoc :author (deser-user-info (input "author"))) (clojure.core/contains? input "committer") (clojure.core/assoc :committer (deser-user-info (input "committer"))) (clojure.core/contains? input "additionalData") (clojure.core/assoc :additional-data (deser-additional-data (input "additionalData")))))

(clojure.core/defn- deser-comments-for-pull-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (input "pullRequestId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (input "beforeCommitId"))) (clojure.core/contains? input "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (input "afterCommitId"))) (clojure.core/contains? input "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (input "beforeBlobId"))) (clojure.core/contains? input "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (input "afterBlobId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location (input "location"))) (clojure.core/contains? input "comments") (clojure.core/assoc :comments (deser-comments (input "comments")))))

(clojure.core/defn- deser-sub-module [input] (clojure.core/cond-> {} (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-object-id (input "commitId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath")))))

(clojure.core/defn- deser-comment-id [input] input)

(clojure.core/defn- deser-repository-trigger-custom-data [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-repository-name-id-pair-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-name-id-pair coll))) input))

(clojure.core/defn- deser-pull-request-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pull-request-id coll))) input))

(clojure.core/defn- deser-change-type-enum [input] (clojure.core/get {"A" :a, "M" :m, "D" :d} input))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-pull-request-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pull-request-event coll))) input))

(clojure.core/defn- deser-event-date [input] input)

(clojure.core/defn- deser-clone-url-ssh [input] input)

(clojure.core/defn- deser-branch-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-branch-name coll))) input))

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-position [input] input)

(clojure.core/defn- deser-content [input] input)

(clojure.core/defn- deser-repository-description [input] input)

(clojure.core/defn- deser-repository-trigger [input] (clojure.core/cond-> {:name (deser-repository-trigger-name (input "name")), :destination-arn (deser-arn (input "destinationArn")), :events (deser-repository-trigger-event-list (input "events"))} (clojure.core/contains? input "customData") (clojure.core/assoc :custom-data (deser-repository-trigger-custom-data (input "customData"))) (clojure.core/contains? input "branches") (clojure.core/assoc :branches (deser-branch-name-list (input "branches")))))

(clojure.core/defn- deser-repository-name-id-pair [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "repositoryId") (clojure.core/assoc :repository-id (deser-repository-id (input "repositoryId")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-repository-not-found-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-name coll))) input))

(clojure.core/defn- deser-creation-date [input] input)

(clojure.core/defn- deser-symbolic-link-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-symbolic-link coll))) input))

(clojure.core/defn- deser-pull-request-status-enum [input] (clojure.core/get {"OPEN" :open, "CLOSED" :closed} input))

(clojure.core/defn- deser-pull-request-event-type [input] (clojure.core/get {"PULL_REQUEST_CREATED" :pull-request-created, "PULL_REQUEST_STATUS_CHANGED" :pull-request-status-changed, "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" :pull-request-source-reference-updated, "PULL_REQUEST_MERGE_STATE_CHANGED" :pull-request-merge-state-changed} input))

(clojure.core/defn- deser-relative-file-version-enum [input] (clojure.core/get {"BEFORE" :before, "AFTER" :after} input))

(clojure.core/defn- deser-repository-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "creationDate") (clojure.core/assoc :creation-date (deser-creation-date (input "creationDate"))) (clojure.core/contains? input "cloneUrlSsh") (clojure.core/assoc :clone-url-ssh (deser-clone-url-ssh (input "cloneUrlSsh"))) (clojure.core/contains? input "accountId") (clojure.core/assoc :account-id (deser-account-id (input "accountId"))) (clojure.core/contains? input "repositoryId") (clojure.core/assoc :repository-id (deser-repository-id (input "repositoryId"))) (clojure.core/contains? input "defaultBranch") (clojure.core/assoc :default-branch (deser-branch-name (input "defaultBranch"))) (clojure.core/contains? input "repositoryDescription") (clojure.core/assoc :repository-description (deser-repository-description (input "repositoryDescription"))) (clojure.core/contains? input "lastModifiedDate") (clojure.core/assoc :last-modified-date (deser-last-modified-date (input "lastModifiedDate"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "cloneUrlHttp") (clojure.core/assoc :clone-url-http (deser-clone-url-http (input "cloneUrlHttp")))))

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-repository-trigger-execution-failure-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger-execution-failure coll))) input))

(clojure.core/defn- deser-pull-request-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pull-request-target coll))) input))

(clojure.core/defn- deser-file-mode-type-enum [input] (clojure.core/get {"EXECUTABLE" :executable, "NORMAL" :normal, "SYMLINK" :symlink} input))

(clojure.core/defn- deser-file-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file coll))) input))

(clojure.core/defn- deser-reference-name [input] input)

(clojure.core/defn- deser-pull-request-status-changed-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "pullRequestStatus") (clojure.core/assoc :pull-request-status (deser-pull-request-status-enum (input "pullRequestStatus")))))

(clojure.core/defn- deser-is-mergeable [input] input)

(clojure.core/defn- deser-comments-for-compared-commit-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comments-for-compared-commit coll))) input))

(clojure.core/defn- deser-user-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "email") (clojure.core/assoc :email (deser-email (input "email"))) (clojure.core/contains? input "date") (clojure.core/assoc :date (deser-date (input "date")))))

(clojure.core/defn- deser-additional-data [input] input)

(clojure.core/defn- response-get-file-output ([input] (response-get-file-output nil input)) ([resultWrapper1557042 input] (clojure.core/let [rawinput1557041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557043 {"commitId" (rawinput1557041 "commitId"), "blobId" (rawinput1557041 "blobId"), "filePath" (rawinput1557041 "filePath"), "fileMode" (rawinput1557041 "fileMode"), "fileSize" (rawinput1557041 "fileSize"), "fileContent" (rawinput1557041 "fileContent")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar1557043 ["commitId"])), :blob-id (deser-object-id (clojure.core/get-in letvar1557043 ["blobId"])), :file-path (deser-path (clojure.core/get-in letvar1557043 ["filePath"])), :file-mode (deser-file-mode-type-enum (clojure.core/get-in letvar1557043 ["fileMode"])), :file-size (deser-object-size (clojure.core/get-in letvar1557043 ["fileSize"])), :file-content (deser-file-content (clojure.core/get-in letvar1557043 ["fileContent"]))}))))

(clojure.core/defn- response-file-too-large-exception ([input] (response-file-too-large-exception nil input)) ([resultWrapper1557045 input] (clojure.core/let [rawinput1557044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557046 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-blob-id-exception ([input] (response-invalid-blob-id-exception nil input)) ([resultWrapper1557048 input] (clojure.core/let [rawinput1557047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557049 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-actor-does-not-exist-exception ([input] (response-actor-does-not-exist-exception nil input)) ([resultWrapper1557051 input] (clojure.core/let [rawinput1557050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557052 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sort-by-exception ([input] (response-invalid-sort-by-exception nil input)) ([resultWrapper1557054 input] (clojure.core/let [rawinput1557053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557055 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-commit-output ([input] (response-get-commit-output nil input)) ([resultWrapper1557057 input] (clojure.core/let [rawinput1557056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557058 {"commit" (rawinput1557056 "commit")}] (clojure.core/cond-> {:commit (deser-commit (clojure.core/get-in letvar1557058 ["commit"]))}))))

(clojure.core/defn- response-comment-does-not-exist-exception ([input] (response-comment-does-not-exist-exception nil input)) ([resultWrapper1557060 input] (clojure.core/let [rawinput1557059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557061 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-not-found-exception ([input] (response-encryption-key-not-found-exception nil input)) ([resultWrapper1557063 input] (clojure.core/let [rawinput1557062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557064 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-file-position-exception ([input] (response-invalid-file-position-exception nil input)) ([resultWrapper1557066 input] (clojure.core/let [rawinput1557065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557067 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-pull-request-status-output ([input] (response-update-pull-request-status-output nil input)) ([resultWrapper1557069 input] (clojure.core/let [rawinput1557068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557070 {"pullRequest" (rawinput1557068 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar1557070 ["pullRequest"]))}))))

(clojure.core/defn- response-maximum-repository-triggers-exceeded-exception ([input] (response-maximum-repository-triggers-exceeded-exception nil input)) ([resultWrapper1557072 input] (clojure.core/let [rawinput1557071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557073 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deletion-parameter-exception ([input] (response-invalid-deletion-parameter-exception nil input)) ([resultWrapper1557075 input] (clojure.core/let [rawinput1557074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557076 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-does-not-exist-exception ([input] (response-file-does-not-exist-exception nil input)) ([resultWrapper1557078 input] (clojure.core/let [rawinput1557077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557079 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-client-request-token-required-exception ([input] (response-client-request-token-required-exception nil input)) ([resultWrapper1557081 input] (clojure.core/let [rawinput1557080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557082 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-blob-output ([input] (response-get-blob-output nil input)) ([resultWrapper1557084 input] (clojure.core/let [rawinput1557083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557085 {"content" (rawinput1557083 "content")}] (clojure.core/cond-> {:content (deserblob (clojure.core/get-in letvar1557085 ["content"]))}))))

(clojure.core/defn- response-maximum-open-pull-requests-exceeded-exception ([input] (response-maximum-open-pull-requests-exceeded-exception nil input)) ([resultWrapper1557087 input] (clojure.core/let [rawinput1557086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557088 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-reference-name-exception ([input] (response-invalid-reference-name-exception nil input)) ([resultWrapper1557090 input] (clojure.core/let [rawinput1557089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557091 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-name-conflicts-with-directory-name-exception ([input] (response-file-name-conflicts-with-directory-name-exception nil input)) ([resultWrapper1557093 input] (clojure.core/let [rawinput1557092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557094 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-entry-required-exception ([input] (response-file-entry-required-exception nil input)) ([resultWrapper1557096 input] (clojure.core/let [rawinput1557095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557097 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-status-exception ([input] (response-invalid-pull-request-status-exception nil input)) ([resultWrapper1557099 input] (clojure.core/let [rawinput1557098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557100 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-id-exception ([input] (response-invalid-pull-request-id-exception nil input)) ([resultWrapper1557102 input] (clojure.core/let [rawinput1557101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557103 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-description-exception ([input] (response-invalid-repository-description-exception nil input)) ([resultWrapper1557105 input] (clojure.core/let [rawinput1557104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557106 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-pull-request-already-closed-exception ([input] (response-pull-request-already-closed-exception nil input)) ([resultWrapper1557108 input] (clojure.core/let [rawinput1557107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557109 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-name-exception ([input] (response-invalid-repository-trigger-name-exception nil input)) ([resultWrapper1557111 input] (clojure.core/let [rawinput1557110 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557112 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-path-exception ([input] (response-invalid-path-exception nil input)) ([resultWrapper1557114 input] (clojure.core/let [rawinput1557113 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557115 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-integrity-checks-failed-exception ([input] (response-encryption-integrity-checks-failed-exception nil input)) ([resultWrapper1557117 input] (clojure.core/let [rawinput1557116 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557118 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-message-length-exceeded-exception ([input] (response-commit-message-length-exceeded-exception nil input)) ([resultWrapper1557120 input] (clojure.core/let [rawinput1557119 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557121 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-title-exception ([input] (response-invalid-title-exception nil input)) ([resultWrapper1557123 input] (clojure.core/let [rawinput1557122 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557124 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-access-denied-exception ([input] (response-encryption-key-access-denied-exception nil input)) ([resultWrapper1557126 input] (clojure.core/let [rawinput1557125 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557127 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-client-request-token-exception ([input] (response-invalid-client-request-token-exception nil input)) ([resultWrapper1557129 input] (clojure.core/let [rawinput1557128 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557130 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-name-required-exception ([input] (response-branch-name-required-exception nil input)) ([resultWrapper1557132 input] (clojure.core/let [rawinput1557131 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557133 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-comment-output ([input] (response-get-comment-output nil input)) ([resultWrapper1557135 input] (clojure.core/let [rawinput1557134 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557136 {"comment" (rawinput1557134 "comment")}] (clojure.core/cond-> {} (letvar1557136 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1557136 ["comment"])))))))

(clojure.core/defn- response-path-does-not-exist-exception ([input] (response-path-does-not-exist-exception nil input)) ([resultWrapper1557138 input] (clojure.core/let [rawinput1557137 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557139 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-source-commit-specifier-exception ([input] (response-invalid-source-commit-specifier-exception nil input)) ([resultWrapper1557141 input] (clojure.core/let [rawinput1557140 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557142 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-folder-does-not-exist-exception ([input] (response-folder-does-not-exist-exception nil input)) ([resultWrapper1557144 input] (clojure.core/let [rawinput1557143 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557145 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-trigger-branch-name-list-required-exception ([input] (response-repository-trigger-branch-name-list-required-exception nil input)) ([resultWrapper1557147 input] (clojure.core/let [rawinput1557146 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557148 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-no-change-exception ([input] (response-no-change-exception nil input)) ([resultWrapper1557150 input] (clojure.core/let [rawinput1557149 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557151 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-does-not-exist-exception ([input] (response-branch-does-not-exist-exception nil input)) ([resultWrapper1557153 input] (clojure.core/let [rawinput1557152 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557154 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-target-exception ([input] (response-invalid-target-exception nil input)) ([resultWrapper1557156 input] (clojure.core/let [rawinput1557155 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557157 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-parent-commit-does-not-exist-exception ([input] (response-parent-commit-does-not-exist-exception nil input)) ([resultWrapper1557159 input] (clojure.core/let [rawinput1557158 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557160 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-source-file-or-content-required-exception ([input] (response-source-file-or-content-required-exception nil input)) ([resultWrapper1557162 input] (clojure.core/let [rawinput1557161 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557163 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-folder-content-size-limit-exceeded-exception ([input] (response-folder-content-size-limit-exceeded-exception nil input)) ([resultWrapper1557165 input] (clojure.core/let [rawinput1557164 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557166 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-branch-output ([input] (response-delete-branch-output nil input)) ([resultWrapper1557168 input] (clojure.core/let [rawinput1557167 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557169 {"deletedBranch" (rawinput1557167 "deletedBranch")}] (clojure.core/cond-> {} (letvar1557169 "deletedBranch") (clojure.core/assoc :deleted-branch (deser-branch-info (clojure.core/get-in letvar1557169 ["deletedBranch"])))))))

(clojure.core/defn- response-update-pull-request-title-output ([input] (response-update-pull-request-title-output nil input)) ([resultWrapper1557171 input] (clojure.core/let [rawinput1557170 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557172 {"pullRequest" (rawinput1557170 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar1557172 ["pullRequest"]))}))))

(clojure.core/defn- response-invalid-file-mode-exception ([input] (response-invalid-file-mode-exception nil input)) ([resultWrapper1557174 input] (clojure.core/let [rawinput1557173 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557175 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-file-output ([input] (response-delete-file-output nil input)) ([resultWrapper1557177 input] (clojure.core/let [rawinput1557176 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557178 {"commitId" (rawinput1557176 "commitId"), "blobId" (rawinput1557176 "blobId"), "treeId" (rawinput1557176 "treeId"), "filePath" (rawinput1557176 "filePath")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar1557178 ["commitId"])), :blob-id (deser-object-id (clojure.core/get-in letvar1557178 ["blobId"])), :tree-id (deser-object-id (clojure.core/get-in letvar1557178 ["treeId"])), :file-path (deser-path (clojure.core/get-in letvar1557178 ["filePath"]))}))))

(clojure.core/defn- response-invalid-max-results-exception ([input] (response-invalid-max-results-exception nil input)) ([resultWrapper1557180 input] (clojure.core/let [rawinput1557179 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557181 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-pull-request-id-required-exception ([input] (response-pull-request-id-required-exception nil input)) ([resultWrapper1557183 input] (clojure.core/let [rawinput1557182 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557184 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-repository-triggers-output ([input] (response-put-repository-triggers-output nil input)) ([resultWrapper1557186 input] (clojure.core/let [rawinput1557185 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557187 {"configurationId" (rawinput1557185 "configurationId")}] (clojure.core/cond-> {} (letvar1557187 "configurationId") (clojure.core/assoc :configuration-id (deser-repository-triggers-configuration-id (clojure.core/get-in letvar1557187 ["configurationId"])))))))

(clojure.core/defn- response-invalid-continuation-token-exception ([input] (response-invalid-continuation-token-exception nil input)) ([resultWrapper1557189 input] (clojure.core/let [rawinput1557188 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557190 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-unavailable-exception ([input] (response-encryption-key-unavailable-exception nil input)) ([resultWrapper1557192 input] (clojure.core/let [rawinput1557191 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557193 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-parent-commit-id-required-exception ([input] (response-parent-commit-id-required-exception nil input)) ([resultWrapper1557195 input] (clojure.core/let [rawinput1557194 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557196 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-branches-output ([input] (response-list-branches-output nil input)) ([resultWrapper1557198 input] (clojure.core/let [rawinput1557197 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557199 {"branches" (rawinput1557197 "branches"), "nextToken" (rawinput1557197 "nextToken")}] (clojure.core/cond-> {} (letvar1557199 "branches") (clojure.core/assoc :branches (deser-branch-name-list (clojure.core/get-in letvar1557199 ["branches"]))) (letvar1557199 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557199 ["nextToken"])))))))

(clojure.core/defn- response-reference-name-required-exception ([input] (response-reference-name-required-exception nil input)) ([resultWrapper1557201 input] (clojure.core/let [rawinput1557200 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557202 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-default-branch-cannot-be-deleted-exception ([input] (response-default-branch-cannot-be-deleted-exception nil input)) ([resultWrapper1557204 input] (clojure.core/let [rawinput1557203 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557205 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-idempotency-parameter-mismatch-exception ([input] (response-idempotency-parameter-mismatch-exception nil input)) ([resultWrapper1557207 input] (clojure.core/let [rawinput1557206 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557208 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-file-output ([input] (response-put-file-output nil input)) ([resultWrapper1557210 input] (clojure.core/let [rawinput1557209 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557211 {"commitId" (rawinput1557209 "commitId"), "blobId" (rawinput1557209 "blobId"), "treeId" (rawinput1557209 "treeId")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar1557211 ["commitId"])), :blob-id (deser-object-id (clojure.core/get-in letvar1557211 ["blobId"])), :tree-id (deser-object-id (clojure.core/get-in letvar1557211 ["treeId"]))}))))

(clojure.core/defn- response-repository-trigger-destination-arn-required-exception ([input] (response-repository-trigger-destination-arn-required-exception nil input)) ([resultWrapper1557213 input] (clojure.core/let [rawinput1557212 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557214 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-same-path-request-exception ([input] (response-same-path-request-exception nil input)) ([resultWrapper1557216 input] (clojure.core/let [rawinput1557215 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557217 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-content-and-source-file-specified-exception ([input] (response-file-content-and-source-file-specified-exception nil input)) ([resultWrapper1557219 input] (clojure.core/let [rawinput1557218 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557220 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tip-of-source-reference-is-different-exception ([input] (response-tip-of-source-reference-is-different-exception nil input)) ([resultWrapper1557222 input] (clojure.core/let [rawinput1557221 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557223 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-name-required-exception ([input] (response-repository-name-required-exception nil input)) ([resultWrapper1557225 input] (clojure.core/let [rawinput1557224 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557226 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-status-update-exception ([input] (response-invalid-pull-request-status-update-exception nil input)) ([resultWrapper1557228 input] (clojure.core/let [rawinput1557227 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557229 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-author-arn-exception ([input] (response-invalid-author-arn-exception nil input)) ([resultWrapper1557231 input] (clojure.core/let [rawinput1557230 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557232 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-does-not-exist-exception ([input] (response-commit-does-not-exist-exception nil input)) ([resultWrapper1557234 input] (clojure.core/let [rawinput1557233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557235 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-email-exception ([input] (response-invalid-email-exception nil input)) ([resultWrapper1557237 input] (clojure.core/let [rawinput1557236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557238 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-repository-output ([input] (response-create-repository-output nil input)) ([resultWrapper1557240 input] (clojure.core/let [rawinput1557239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557241 {"repositoryMetadata" (rawinput1557239 "repositoryMetadata")}] (clojure.core/cond-> {} (letvar1557241 "repositoryMetadata") (clojure.core/assoc :repository-metadata (deser-repository-metadata (clojure.core/get-in letvar1557241 ["repositoryMetadata"])))))))

(clojure.core/defn- response-merge-pull-request-by-fast-forward-output ([input] (response-merge-pull-request-by-fast-forward-output nil input)) ([resultWrapper1557243 input] (clojure.core/let [rawinput1557242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557244 {"pullRequest" (rawinput1557242 "pullRequest")}] (clojure.core/cond-> {} (letvar1557244 "pullRequest") (clojure.core/assoc :pull-request (deser-pull-request (clojure.core/get-in letvar1557244 ["pullRequest"])))))))

(clojure.core/defn- response-post-comment-reply-output ([input] (response-post-comment-reply-output nil input)) ([resultWrapper1557246 input] (clojure.core/let [rawinput1557245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557247 {"comment" (rawinput1557245 "comment")}] (clojure.core/cond-> {} (letvar1557247 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1557247 ["comment"])))))))

(clojure.core/defn- response-directory-name-conflicts-with-file-name-exception ([input] (response-directory-name-conflicts-with-file-name-exception nil input)) ([resultWrapper1557249 input] (clojure.core/let [rawinput1557248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557250 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-repository-triggers-output ([input] (response-get-repository-triggers-output nil input)) ([resultWrapper1557252 input] (clojure.core/let [rawinput1557251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557253 {"configurationId" (rawinput1557251 "configurationId"), "triggers" (rawinput1557251 "triggers")}] (clojure.core/cond-> {} (letvar1557253 "configurationId") (clojure.core/assoc :configuration-id (deser-repository-triggers-configuration-id (clojure.core/get-in letvar1557253 ["configurationId"]))) (letvar1557253 "triggers") (clojure.core/assoc :triggers (deser-repository-triggers-list (clojure.core/get-in letvar1557253 ["triggers"])))))))

(clojure.core/defn- response-file-mode-required-exception ([input] (response-file-mode-required-exception nil input)) ([resultWrapper1557255 input] (clojure.core/let [rawinput1557254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557256 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-region-exception ([input] (response-invalid-repository-trigger-region-exception nil input)) ([resultWrapper1557258 input] (clojure.core/let [rawinput1557257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557259 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-file-entries-exceeded-exception ([input] (response-maximum-file-entries-exceeded-exception nil input)) ([resultWrapper1557261 input] (clojure.core/let [rawinput1557260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557262 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reference-does-not-exist-exception ([input] (response-reference-does-not-exist-exception nil input)) ([resultWrapper1557264 input] (clojure.core/let [rawinput1557263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557265 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-comment-id-required-exception ([input] (response-comment-id-required-exception nil input)) ([resultWrapper1557267 input] (clojure.core/let [rawinput1557266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557268 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-merge-option-required-exception ([input] (response-merge-option-required-exception nil input)) ([resultWrapper1557270 input] (clojure.core/let [rawinput1557269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557271 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-before-commit-id-and-after-commit-id-are-same-exception ([input] (response-before-commit-id-and-after-commit-id-are-same-exception nil input)) ([resultWrapper1557273 input] (clojure.core/let [rawinput1557272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557274 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-post-comment-for-pull-request-output ([input] (response-post-comment-for-pull-request-output nil input)) ([resultWrapper1557276 input] (clojure.core/let [rawinput1557275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557277 {"repositoryName" (rawinput1557275 "repositoryName"), "pullRequestId" (rawinput1557275 "pullRequestId"), "beforeCommitId" (rawinput1557275 "beforeCommitId"), "afterCommitId" (rawinput1557275 "afterCommitId"), "beforeBlobId" (rawinput1557275 "beforeBlobId"), "afterBlobId" (rawinput1557275 "afterBlobId"), "location" (rawinput1557275 "location"), "comment" (rawinput1557275 "comment")}] (clojure.core/cond-> {} (letvar1557277 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1557277 ["repositoryName"]))) (letvar1557277 "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (clojure.core/get-in letvar1557277 ["pullRequestId"]))) (letvar1557277 "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (clojure.core/get-in letvar1557277 ["beforeCommitId"]))) (letvar1557277 "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (clojure.core/get-in letvar1557277 ["afterCommitId"]))) (letvar1557277 "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (clojure.core/get-in letvar1557277 ["beforeBlobId"]))) (letvar1557277 "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (clojure.core/get-in letvar1557277 ["afterBlobId"]))) (letvar1557277 "location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1557277 ["location"]))) (letvar1557277 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1557277 ["comment"])))))))

(clojure.core/defn- response-get-comments-for-compared-commit-output ([input] (response-get-comments-for-compared-commit-output nil input)) ([resultWrapper1557279 input] (clojure.core/let [rawinput1557278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557280 {"commentsForComparedCommitData" (rawinput1557278 "commentsForComparedCommitData"), "nextToken" (rawinput1557278 "nextToken")}] (clojure.core/cond-> {} (letvar1557280 "commentsForComparedCommitData") (clojure.core/assoc :comments-for-compared-commit-data (deser-comments-for-compared-commit-data (clojure.core/get-in letvar1557280 ["commentsForComparedCommitData"]))) (letvar1557280 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557280 ["nextToken"])))))))

(clojure.core/defn- response-comment-deleted-exception ([input] (response-comment-deleted-exception nil input)) ([resultWrapper1557282 input] (clojure.core/let [rawinput1557281 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557283 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-pull-request-does-not-exist-exception ([input] (response-pull-request-does-not-exist-exception nil input)) ([resultWrapper1557285 input] (clojure.core/let [rawinput1557284 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557286 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-repositories-output ([input] (response-list-repositories-output nil input)) ([resultWrapper1557288 input] (clojure.core/let [rawinput1557287 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557289 {"repositories" (rawinput1557287 "repositories"), "nextToken" (rawinput1557287 "nextToken")}] (clojure.core/cond-> {} (letvar1557289 "repositories") (clojure.core/assoc :repositories (deser-repository-name-id-pair-list (clojure.core/get-in letvar1557289 ["repositories"]))) (letvar1557289 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557289 ["nextToken"])))))))

(clojure.core/defn- response-blob-id-does-not-exist-exception ([input] (response-blob-id-does-not-exist-exception nil input)) ([resultWrapper1557291 input] (clojure.core/let [rawinput1557290 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557292 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-comment-content-required-exception ([input] (response-comment-content-required-exception nil input)) ([resultWrapper1557294 input] (clojure.core/let [rawinput1557293 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557295 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-names-required-exception ([input] (response-repository-names-required-exception nil input)) ([resultWrapper1557297 input] (clojure.core/let [rawinput1557296 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557298 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-branches-exceeded-exception ([input] (response-maximum-branches-exceeded-exception nil input)) ([resultWrapper1557300 input] (clojure.core/let [rawinput1557299 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557301 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-limit-exceeded-exception ([input] (response-repository-limit-exceeded-exception nil input)) ([resultWrapper1557303 input] (clojure.core/let [rawinput1557302 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557304 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-pull-request-description-output ([input] (response-update-pull-request-description-output nil input)) ([resultWrapper1557306 input] (clojure.core/let [rawinput1557305 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557307 {"pullRequest" (rawinput1557305 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar1557307 ["pullRequest"]))}))))

(clojure.core/defn- response-parent-commit-id-outdated-exception ([input] (response-parent-commit-id-outdated-exception nil input)) ([resultWrapper1557309 input] (clojure.core/let [rawinput1557308 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557310 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-blob-id-required-exception ([input] (response-blob-id-required-exception nil input)) ([resultWrapper1557312 input] (clojure.core/let [rawinput1557311 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557313 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-multiple-repositories-in-pull-request-exception ([input] (response-multiple-repositories-in-pull-request-exception nil input)) ([resultWrapper1557315 input] (clojure.core/let [rawinput1557314 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557316 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-content-size-limit-exceeded-exception ([input] (response-file-content-size-limit-exceeded-exception nil input)) ([resultWrapper1557318 input] (clojure.core/let [rawinput1557317 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557319 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-name-is-tag-name-exception ([input] (response-branch-name-is-tag-name-exception nil input)) ([resultWrapper1557321 input] (clojure.core/let [rawinput1557320 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557322 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-name-exists-exception ([input] (response-repository-name-exists-exception nil input)) ([resultWrapper1557324 input] (clojure.core/let [rawinput1557323 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557325 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-branch-name-exception ([input] (response-invalid-branch-name-exception nil input)) ([resultWrapper1557327 input] (clojure.core/let [rawinput1557326 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557328 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-relative-file-version-enum-exception ([input] (response-invalid-relative-file-version-enum-exception nil input)) ([resultWrapper1557330 input] (clojure.core/let [rawinput1557329 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557331 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-file-entry-conflict-exception ([input] (response-put-file-entry-conflict-exception nil input)) ([resultWrapper1557333 input] (clojure.core/let [rawinput1557332 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557334 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-comment-content-output ([input] (response-delete-comment-content-output nil input)) ([resultWrapper1557336 input] (clojure.core/let [rawinput1557335 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557337 {"comment" (rawinput1557335 "comment")}] (clojure.core/cond-> {} (letvar1557337 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1557337 ["comment"])))))))

(clojure.core/defn- response-comment-not-created-by-caller-exception ([input] (response-comment-not-created-by-caller-exception nil input)) ([resultWrapper1557339 input] (clojure.core/let [rawinput1557338 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557340 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-folder-output ([input] (response-get-folder-output nil input)) ([resultWrapper1557342 input] (clojure.core/let [rawinput1557341 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557343 {"commitId" (rawinput1557341 "commitId"), "folderPath" (rawinput1557341 "folderPath"), "treeId" (rawinput1557341 "treeId"), "subFolders" (rawinput1557341 "subFolders"), "files" (rawinput1557341 "files"), "symbolicLinks" (rawinput1557341 "symbolicLinks"), "subModules" (rawinput1557341 "subModules")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar1557343 ["commitId"])), :folder-path (deser-path (clojure.core/get-in letvar1557343 ["folderPath"]))} (letvar1557343 "treeId") (clojure.core/assoc :tree-id (deser-object-id (clojure.core/get-in letvar1557343 ["treeId"]))) (letvar1557343 "subFolders") (clojure.core/assoc :sub-folders (deser-folder-list (clojure.core/get-in letvar1557343 ["subFolders"]))) (letvar1557343 "files") (clojure.core/assoc :files (deser-file-list (clojure.core/get-in letvar1557343 ["files"]))) (letvar1557343 "symbolicLinks") (clojure.core/assoc :symbolic-links (deser-symbolic-link-list (clojure.core/get-in letvar1557343 ["symbolicLinks"]))) (letvar1557343 "subModules") (clojure.core/assoc :sub-modules (deser-sub-module-list (clojure.core/get-in letvar1557343 ["subModules"])))))))

(clojure.core/defn- response-path-required-exception ([input] (response-path-required-exception nil input)) ([resultWrapper1557345 input] (clojure.core/let [rawinput1557344 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557346 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-event-type-exception ([input] (response-invalid-pull-request-event-type-exception nil input)) ([resultWrapper1557348 input] (clojure.core/let [rawinput1557347 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557349 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-repository-output ([input] (response-delete-repository-output nil input)) ([resultWrapper1557351 input] (clojure.core/let [rawinput1557350 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557352 {"repositoryId" (rawinput1557350 "repositoryId")}] (clojure.core/cond-> {} (letvar1557352 "repositoryId") (clojure.core/assoc :repository-id (deser-repository-id (clojure.core/get-in letvar1557352 ["repositoryId"])))))))

(clojure.core/defn- response-invalid-parent-commit-id-exception ([input] (response-invalid-parent-commit-id-exception nil input)) ([resultWrapper1557354 input] (clojure.core/let [rawinput1557353 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557355 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-actor-arn-exception ([input] (response-invalid-actor-arn-exception nil input)) ([resultWrapper1557357 input] (clojure.core/let [rawinput1557356 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557358 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-targets-exception ([input] (response-invalid-targets-exception nil input)) ([resultWrapper1557360 input] (clojure.core/let [rawinput1557359 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557361 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-name-exception ([input] (response-invalid-repository-name-exception nil input)) ([resultWrapper1557363 input] (clojure.core/let [rawinput1557362 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557364 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-repository-output ([input] (response-get-repository-output nil input)) ([resultWrapper1557366 input] (clojure.core/let [rawinput1557365 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557367 {"repositoryMetadata" (rawinput1557365 "repositoryMetadata")}] (clojure.core/cond-> {} (letvar1557367 "repositoryMetadata") (clojure.core/assoc :repository-metadata (deser-repository-metadata (clojure.core/get-in letvar1557367 ["repositoryMetadata"])))))))

(clojure.core/defn- response-describe-pull-request-events-output ([input] (response-describe-pull-request-events-output nil input)) ([resultWrapper1557369 input] (clojure.core/let [rawinput1557368 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557370 {"pullRequestEvents" (rawinput1557368 "pullRequestEvents"), "nextToken" (rawinput1557368 "nextToken")}] (clojure.core/cond-> {:pull-request-events (deser-pull-request-event-list (clojure.core/get-in letvar1557370 ["pullRequestEvents"]))} (letvar1557370 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557370 ["nextToken"])))))))

(clojure.core/defn- response-invalid-order-exception ([input] (response-invalid-order-exception nil input)) ([resultWrapper1557372 input] (clojure.core/let [rawinput1557371 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557373 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-pull-requests-output ([input] (response-list-pull-requests-output nil input)) ([resultWrapper1557375 input] (clojure.core/let [rawinput1557374 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557376 {"pullRequestIds" (rawinput1557374 "pullRequestIds"), "nextToken" (rawinput1557374 "nextToken")}] (clojure.core/cond-> {:pull-request-ids (deser-pull-request-id-list (clojure.core/get-in letvar1557376 ["pullRequestIds"]))} (letvar1557376 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557376 ["nextToken"])))))))

(clojure.core/defn- response-update-comment-output ([input] (response-update-comment-output nil input)) ([resultWrapper1557378 input] (clojure.core/let [rawinput1557377 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557379 {"comment" (rawinput1557377 "comment")}] (clojure.core/cond-> {} (letvar1557379 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1557379 ["comment"])))))))

(clojure.core/defn- response-invalid-description-exception ([input] (response-invalid-description-exception nil input)) ([resultWrapper1557381 input] (clojure.core/let [rawinput1557380 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557382 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-manual-merge-required-exception ([input] (response-manual-merge-required-exception nil input)) ([resultWrapper1557384 input] (clojure.core/let [rawinput1557383 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557385 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-destination-arn-exception ([input] (response-invalid-repository-trigger-destination-arn-exception nil input)) ([resultWrapper1557387 input] (clojure.core/let [rawinput1557386 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557388 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-same-file-content-exception ([input] (response-same-file-content-exception nil input)) ([resultWrapper1557390 input] (clojure.core/let [rawinput1557389 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557391 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-repository-names-exceeded-exception ([input] (response-maximum-repository-names-exceeded-exception nil input)) ([resultWrapper1557393 input] (clojure.core/let [rawinput1557392 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557394 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-comment-id-exception ([input] (response-invalid-comment-id-exception nil input)) ([resultWrapper1557396 input] (clojure.core/let [rawinput1557395 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557397 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-required-exception ([input] (response-commit-required-exception nil input)) ([resultWrapper1557399 input] (clojure.core/let [rawinput1557398 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557400 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-pull-request-output ([input] (response-get-pull-request-output nil input)) ([resultWrapper1557402 input] (clojure.core/let [rawinput1557401 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557403 {"pullRequest" (rawinput1557401 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar1557403 ["pullRequest"]))}))))

(clojure.core/defn- response-commit-id-does-not-exist-exception ([input] (response-commit-id-does-not-exist-exception nil input)) ([resultWrapper1557405 input] (clojure.core/let [rawinput1557404 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557406 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-id-required-exception ([input] (response-commit-id-required-exception nil input)) ([resultWrapper1557408 input] (clojure.core/let [rawinput1557407 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557409 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-targets-required-exception ([input] (response-targets-required-exception nil input)) ([resultWrapper1557411 input] (clojure.core/let [rawinput1557410 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557412 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-does-not-exist-exception ([input] (response-repository-does-not-exist-exception nil input)) ([resultWrapper1557414 input] (clojure.core/let [rawinput1557413 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557415 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-title-required-exception ([input] (response-title-required-exception nil input)) ([resultWrapper1557417 input] (clojure.core/let [rawinput1557416 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557418 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-commit-id-exception ([input] (response-invalid-commit-id-exception nil input)) ([resultWrapper1557420 input] (clojure.core/let [rawinput1557419 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557421 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-comment-content-size-limit-exceeded-exception ([input] (response-comment-content-size-limit-exceeded-exception nil input)) ([resultWrapper1557423 input] (clojure.core/let [rawinput1557422 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557424 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tips-divergence-exceeded-exception ([input] (response-tips-divergence-exceeded-exception nil input)) ([resultWrapper1557426 input] (clojure.core/let [rawinput1557425 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557427 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-content-required-exception ([input] (response-file-content-required-exception nil input)) ([resultWrapper1557429 input] (clojure.core/let [rawinput1557428 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557430 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-trigger-name-required-exception ([input] (response-repository-trigger-name-required-exception nil input)) ([resultWrapper1557432 input] (clojure.core/let [rawinput1557431 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557433 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-author-does-not-exist-exception ([input] (response-author-does-not-exist-exception nil input)) ([resultWrapper1557435 input] (clojure.core/let [rawinput1557434 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557436 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reference-type-not-supported-exception ([input] (response-reference-type-not-supported-exception nil input)) ([resultWrapper1557438 input] (clojure.core/let [rawinput1557437 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557439 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-destination-commit-specifier-exception ([input] (response-invalid-destination-commit-specifier-exception nil input)) ([resultWrapper1557441 input] (clojure.core/let [rawinput1557440 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557442 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-trigger-events-list-required-exception ([input] (response-repository-trigger-events-list-required-exception nil input)) ([resultWrapper1557444 input] (clojure.core/let [rawinput1557443 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557445 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-pull-request-output ([input] (response-create-pull-request-output nil input)) ([resultWrapper1557447 input] (clojure.core/let [rawinput1557446 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557448 {"pullRequest" (rawinput1557446 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar1557448 ["pullRequest"]))}))))

(clojure.core/defn- response-pull-request-status-required-exception ([input] (response-pull-request-status-required-exception nil input)) ([resultWrapper1557450 input] (clojure.core/let [rawinput1557449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557451 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-test-repository-triggers-output ([input] (response-test-repository-triggers-output nil input)) ([resultWrapper1557453 input] (clojure.core/let [rawinput1557452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557454 {"successfulExecutions" (rawinput1557452 "successfulExecutions"), "failedExecutions" (rawinput1557452 "failedExecutions")}] (clojure.core/cond-> {} (letvar1557454 "successfulExecutions") (clojure.core/assoc :successful-executions (deser-repository-trigger-name-list (clojure.core/get-in letvar1557454 ["successfulExecutions"]))) (letvar1557454 "failedExecutions") (clojure.core/assoc :failed-executions (deser-repository-trigger-execution-failure-list (clojure.core/get-in letvar1557454 ["failedExecutions"])))))))

(clojure.core/defn- response-invalid-repository-trigger-events-exception ([input] (response-invalid-repository-trigger-events-exception nil input)) ([resultWrapper1557456 input] (clojure.core/let [rawinput1557455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557457 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-commit-output ([input] (response-create-commit-output nil input)) ([resultWrapper1557459 input] (clojure.core/let [rawinput1557458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557460 {"commitId" (rawinput1557458 "commitId"), "treeId" (rawinput1557458 "treeId"), "filesAdded" (rawinput1557458 "filesAdded"), "filesUpdated" (rawinput1557458 "filesUpdated"), "filesDeleted" (rawinput1557458 "filesDeleted")}] (clojure.core/cond-> {} (letvar1557460 "commitId") (clojure.core/assoc :commit-id (deser-object-id (clojure.core/get-in letvar1557460 ["commitId"]))) (letvar1557460 "treeId") (clojure.core/assoc :tree-id (deser-object-id (clojure.core/get-in letvar1557460 ["treeId"]))) (letvar1557460 "filesAdded") (clojure.core/assoc :files-added (deser-files-metadata (clojure.core/get-in letvar1557460 ["filesAdded"]))) (letvar1557460 "filesUpdated") (clojure.core/assoc :files-updated (deser-files-metadata (clojure.core/get-in letvar1557460 ["filesUpdated"]))) (letvar1557460 "filesDeleted") (clojure.core/assoc :files-deleted (deser-files-metadata (clojure.core/get-in letvar1557460 ["filesDeleted"])))))))

(clojure.core/defn- response-invalid-file-location-exception ([input] (response-invalid-file-location-exception nil input)) ([resultWrapper1557462 input] (clojure.core/let [rawinput1557461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557463 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-name-exists-exception ([input] (response-branch-name-exists-exception nil input)) ([resultWrapper1557465 input] (clojure.core/let [rawinput1557464 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557466 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-merge-option-exception ([input] (response-invalid-merge-option-exception nil input)) ([resultWrapper1557468 input] (clojure.core/let [rawinput1557467 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557469 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-path-conflicts-with-submodule-path-exception ([input] (response-file-path-conflicts-with-submodule-path-exception nil input)) ([resultWrapper1557471 input] (clojure.core/let [rawinput1557470 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557472 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-target-required-exception ([input] (response-target-required-exception nil input)) ([resultWrapper1557474 input] (clojure.core/let [rawinput1557473 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557475 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-triggers-list-required-exception ([input] (response-repository-triggers-list-required-exception nil input)) ([resultWrapper1557477 input] (clojure.core/let [rawinput1557476 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557478 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-comments-for-pull-request-output ([input] (response-get-comments-for-pull-request-output nil input)) ([resultWrapper1557480 input] (clojure.core/let [rawinput1557479 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557481 {"commentsForPullRequestData" (rawinput1557479 "commentsForPullRequestData"), "nextToken" (rawinput1557479 "nextToken")}] (clojure.core/cond-> {} (letvar1557481 "commentsForPullRequestData") (clojure.core/assoc :comments-for-pull-request-data (deser-comments-for-pull-request-data (clojure.core/get-in letvar1557481 ["commentsForPullRequestData"]))) (letvar1557481 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557481 ["nextToken"])))))))

(clojure.core/defn- response-get-merge-conflicts-output ([input] (response-get-merge-conflicts-output nil input)) ([resultWrapper1557483 input] (clojure.core/let [rawinput1557482 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557484 {"mergeable" (rawinput1557482 "mergeable"), "destinationCommitId" (rawinput1557482 "destinationCommitId"), "sourceCommitId" (rawinput1557482 "sourceCommitId")}] (clojure.core/cond-> {:mergeable (deser-is-mergeable (clojure.core/get-in letvar1557484 ["mergeable"])), :destination-commit-id (deser-commit-id (clojure.core/get-in letvar1557484 ["destinationCommitId"])), :source-commit-id (deser-commit-id (clojure.core/get-in letvar1557484 ["sourceCommitId"]))}))))

(clojure.core/defn- response-post-comment-for-compared-commit-output ([input] (response-post-comment-for-compared-commit-output nil input)) ([resultWrapper1557486 input] (clojure.core/let [rawinput1557485 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557487 {"repositoryName" (rawinput1557485 "repositoryName"), "beforeCommitId" (rawinput1557485 "beforeCommitId"), "afterCommitId" (rawinput1557485 "afterCommitId"), "beforeBlobId" (rawinput1557485 "beforeBlobId"), "afterBlobId" (rawinput1557485 "afterBlobId"), "location" (rawinput1557485 "location"), "comment" (rawinput1557485 "comment")}] (clojure.core/cond-> {} (letvar1557487 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1557487 ["repositoryName"]))) (letvar1557487 "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (clojure.core/get-in letvar1557487 ["beforeCommitId"]))) (letvar1557487 "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (clojure.core/get-in letvar1557487 ["afterCommitId"]))) (letvar1557487 "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (clojure.core/get-in letvar1557487 ["beforeBlobId"]))) (letvar1557487 "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (clojure.core/get-in letvar1557487 ["afterBlobId"]))) (letvar1557487 "location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1557487 ["location"]))) (letvar1557487 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar1557487 ["comment"])))))))

(clojure.core/defn- response-get-differences-output ([input] (response-get-differences-output nil input)) ([resultWrapper1557489 input] (clojure.core/let [rawinput1557488 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557490 {"differences" (rawinput1557488 "differences"), "NextToken" (rawinput1557488 "NextToken")}] (clojure.core/cond-> {} (letvar1557490 "differences") (clojure.core/assoc :differences (deser-difference-list (clojure.core/get-in letvar1557490 ["differences"]))) (letvar1557490 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1557490 ["NextToken"])))))))

(clojure.core/defn- response-source-and-destination-are-same-exception ([input] (response-source-and-destination-are-same-exception nil input)) ([resultWrapper1557492 input] (clojure.core/let [rawinput1557491 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557493 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-branch-output ([input] (response-get-branch-output nil input)) ([resultWrapper1557495 input] (clojure.core/let [rawinput1557494 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557496 {"branch" (rawinput1557494 "branch")}] (clojure.core/cond-> {} (letvar1557496 "branch") (clojure.core/assoc :branch (deser-branch-info (clojure.core/get-in letvar1557496 ["branch"])))))))

(clojure.core/defn- response-repository-not-associated-with-pull-request-exception ([input] (response-repository-not-associated-with-pull-request-exception nil input)) ([resultWrapper1557498 input] (clojure.core/let [rawinput1557497 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557499 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-branch-name-exception ([input] (response-invalid-repository-trigger-branch-name-exception nil input)) ([resultWrapper1557501 input] (clojure.core/let [rawinput1557500 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557502 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-commit-exception ([input] (response-invalid-commit-exception nil input)) ([resultWrapper1557504 input] (clojure.core/let [rawinput1557503 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557505 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-repositories-output ([input] (response-batch-get-repositories-output nil input)) ([resultWrapper1557507 input] (clojure.core/let [rawinput1557506 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557508 {"repositories" (rawinput1557506 "repositories"), "repositoriesNotFound" (rawinput1557506 "repositoriesNotFound")}] (clojure.core/cond-> {} (letvar1557508 "repositories") (clojure.core/assoc :repositories (deser-repository-metadata-list (clojure.core/get-in letvar1557508 ["repositories"]))) (letvar1557508 "repositoriesNotFound") (clojure.core/assoc :repositories-not-found (deser-repository-not-found-list (clojure.core/get-in letvar1557508 ["repositoriesNotFound"])))))))

(clojure.core/defn- response-invalid-repository-trigger-custom-data-exception ([input] (response-invalid-repository-trigger-custom-data-exception nil input)) ([resultWrapper1557510 input] (clojure.core/let [rawinput1557509 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557511 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-name-length-exceeded-exception ([input] (response-name-length-exceeded-exception nil input)) ([resultWrapper1557513 input] (clojure.core/let [rawinput1557512 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557514 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-disabled-exception ([input] (response-encryption-key-disabled-exception nil input)) ([resultWrapper1557516 input] (clojure.core/let [rawinput1557515 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557517 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-restricted-source-file-exception ([input] (response-restricted-source-file-exception nil input)) ([resultWrapper1557519 input] (clojure.core/let [rawinput1557518 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1557520 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-size (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-size))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-file-output/commit-id :portkey.aws.codecommit.-2015-04-13.get-file-output/blob-id :portkey.aws.codecommit.-2015-04-13.get-file-output/file-path :portkey.aws.codecommit.-2015-04-13.get-file-output/file-mode :portkey.aws.codecommit.-2015-04-13.get-file-output/file-size :portkey.aws.codecommit.-2015-04-13.get-file-output/file-content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-comment-deleted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-branch-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-branch-input/branch-name]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-blob-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/actor-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/title (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/targets (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/target-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-pull-request-input/title :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/targets] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-pull-request-input/description :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-sort-by-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-default-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-default-branch-input/default-branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-default-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-default-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.update-default-branch-input/default-branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-commit-output/commit (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-commit-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-commit-output/commit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-file-position-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-status-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-repository-triggers-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/client-request-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-deletion-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-blob-output/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/blob))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-blob-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-blob-output/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-open-pull-requests-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-reference-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/keep-empty-folders (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/keep-empty-folders))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-file-input/repository-name :portkey.aws.codecommit.-2015-04-13.delete-file-input/branch-name :portkey.aws.codecommit.-2015-04-13.delete-file-input/file-path :portkey.aws.codecommit.-2015-04-13.delete-file-input/parent-commit-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-file-input/keep-empty-folders :portkey.aws.codecommit.-2015-04-13.delete-file-input/commit-message :portkey.aws.codecommit.-2015-04-13.delete-file-input/name :portkey.aws.codecommit.-2015-04-13.delete-file-input/email]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/object-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/destination-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-created-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/source-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/destination-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/merge-base]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-name-conflicts-with-directory-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-entry-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-enum))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/object-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-merged clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-description-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-repository-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-path-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/in-reply-to (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/last-modified-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/deleted (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-comment-deleted))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.comment/comment-id :portkey.aws.codecommit.-2015-04-13.comment/content :portkey.aws.codecommit.-2015-04-13.comment/in-reply-to :portkey.aws.codecommit.-2015-04-13.comment/creation-date :portkey.aws.codecommit.-2015-04-13.comment/last-modified-date :portkey.aws.codecommit.-2015-04-13.comment/author-arn :portkey.aws.codecommit.-2015-04-13.comment/deleted :portkey.aws.codecommit.-2015-04-13.comment/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/destination-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/source-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/merge-option (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-option-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/destination-commit-specifier :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/source-commit-specifier :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/merge-option] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-branch-input/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.create-branch-input/branch-name :portkey.aws.codecommit.-2015-04-13.create-branch-input/commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-move clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-metadata/is-merged (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-merged))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-metadata/merged-by (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.merge-metadata/is-merged :portkey.aws.codecommit.-2015-04-13.merge-metadata/merged-by]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-title-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-file-entries (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/delete-file-entry))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/files-metadata (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/file-metadata))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/sub-module-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/sub-module))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-input/commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-file-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-file-input/file-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-file-input/commit-specifier]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comment-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comment-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-commit (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-commit (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-target/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-reference :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-reference :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-commit :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-commit :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-base :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-metadata))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/last-modified-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/comment))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-enum #{"createReference" :all "updateReference" :delete-reference "all" :update-reference "deleteReference" :create-reference})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-triggers-configuration-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-source-commit-specifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request-data (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\w\.-]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-branch-name-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.folder/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.folder/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.folder/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.folder/tree-id :portkey.aws.codecommit.-2015-04-13.folder/absolute-path :portkey.aws.codecommit.-2015-04-13.folder/relative-path]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/symbolic-link (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.symbolic-link/blob-id :portkey.aws.codecommit.-2015-04-13.symbolic-link/absolute-path :portkey.aws.codecommit.-2015-04-13.symbolic-link/relative-path :portkey.aws.codecommit.-2015-04-13.symbolic-link/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/folder))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/no-change-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/title (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-comment-content-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-comment-content-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-comment-content-input/comment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-pull-request-input/pull-request-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/source-file-or-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/object-id))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/difference-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/difference))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-branch-output/deleted-branch (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-branch-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-branch-output/deleted-branch]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/trigger (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/failure-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/trigger :portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/failure-message]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-comment-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-comment-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-comment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-comment-input/comment-id :portkey.aws.codecommit.-2015-04-13.update-comment-input/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/content] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-title-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.branch-info/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.branch-info/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.branch-info/branch-name :portkey.aws.codecommit.-2015-04-13.branch-info/commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/pull-request-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/after-commit-id :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/next-token :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.file/blob-id :portkey.aws.codecommit.-2015-04-13.file/absolute-path :portkey.aws.codecommit.-2015-04-13.file/relative-path :portkey.aws.codecommit.-2015-04-13.file/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-file-mode-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.source-file-specifier/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.source-file-specifier/is-move (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-move))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/source-file-specifier (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.source-file-specifier/file-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.source-file-specifier/is-move]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/event-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/event-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-event-type (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-event-type))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/actor-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-created-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-created-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-status-changed-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-changed-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-source-reference-updated-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-source-reference-updated-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-merged-state-changed-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-merged-state-changed-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-id :portkey.aws.codecommit.-2015-04-13.pull-request-event/event-date :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-event-type :portkey.aws.codecommit.-2015-04-13.pull-request-event/actor-arn :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-created-event-metadata :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-status-changed-event-metadata :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-source-reference-updated-event-metadata :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-merged-state-changed-event-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-file-output/commit-id :portkey.aws.codecommit.-2015-04-13.delete-file-output/blob-id :portkey.aws.codecommit.-2015-04-13.delete-file-output/tree-id :portkey.aws.codecommit.-2015-04-13.delete-file-output/file-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/last-activity-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-targets (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-target-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/title (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request/creation-date :portkey.aws.codecommit.-2015-04-13.pull-request/last-activity-date :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-status :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-targets :portkey.aws.codecommit.-2015-04-13.pull-request/author-arn :portkey.aws.codecommit.-2015-04-13.pull-request/client-request-token :portkey.aws.codecommit.-2015-04-13.pull-request/title :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-id :portkey.aws.codecommit.-2015-04-13.pull-request/description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-output/configuration-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-configuration-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.put-repository-triggers-output/configuration-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.location/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.location/file-position (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/position))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.location/relative-file-version (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/relative-file-version-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.location/file-path :portkey.aws.codecommit.-2015-04-13.location/file-position :portkey.aws.codecommit.-2015-04-13.location/relative-file-version]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-output/branches (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-branches-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-branches-output/branches :portkey.aws.codecommit.-2015-04-13.list-branches-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.difference/before-blob (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/blob-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.difference/after-blob (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/blob-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.difference/change-type (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/change-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/difference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.difference/before-blob :portkey.aws.codecommit.-2015-04-13.difference/after-blob :portkey.aws.codecommit.-2015-04-13.difference/change-type]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/default-branch-cannot-be-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-source-reference-updated-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/before-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/after-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/merge-base]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-file-output/commit-id :portkey.aws.codecommit.-2015-04-13.put-file-output/blob-id :portkey.aws.codecommit.-2015-04-13.put-file-output/tree-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-destination-arn-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/same-path-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/order-enum #{:descending :ascending "descending" "ascending"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content-and-source-file-specified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/tip-of-source-reference-is-different-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/mode (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comment-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-comment-input/comment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-author-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-repository-triggers-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/triggers (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/repository-name :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/triggers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-email-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-repository-output/repository-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-repository-output/repository-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-output/pull-request]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-reply-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-reply-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/directory-name-conflicts-with-file-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/configuration-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-configuration-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/triggers (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/configuration-id :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/triggers]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-mode-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file-metadata/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file-metadata/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file-metadata/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.file-metadata/absolute-path :portkey.aws.codecommit.-2015-04-13.file-metadata/blob-id :portkey.aws.codecommit.-2015-04-13.file-metadata/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/comments (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/repository-name :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/location :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/comments]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-file-entries-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/date (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/merge-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-merged-state-changed-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/destination-reference :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/merge-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-entry/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-entry/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-entry/file-content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-entry/source-file (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/source-file-specifier))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-file-entry/file-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.put-file-entry/file-mode :portkey.aws.codecommit.-2015-04-13.put-file-entry/file-content :portkey.aws.codecommit.-2015-04-13.put-file-entry/source-file]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-triggers-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.blob-metadata/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.blob-metadata/path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.blob-metadata/mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/mode))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.blob-metadata/blob-id :portkey.aws.codecommit.-2015-04-13.blob-metadata/path :portkey.aws.codecommit.-2015-04-13.blob-metadata/mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-input/repository-names (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.batch-get-repositories-input/repository-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-option-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/clone-url-http (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/before-commit-id-and-after-commit-id-are-same-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/pull-request-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/comments-for-compared-commit-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/comments-for-compared-commit-data :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-repository-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/parents (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/parent-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/author (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/user-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/committer (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/user-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/additional-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/additional-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.commit/commit-id :portkey.aws.codecommit.-2015-04-13.commit/tree-id :portkey.aws.codecommit.-2015-04-13.commit/parents :portkey.aws.codecommit.-2015-04-13.commit/message :portkey.aws.codecommit.-2015-04-13.commit/author :portkey.aws.codecommit.-2015-04-13.commit/committer :portkey.aws.codecommit.-2015-04-13.commit/additional-data]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-output/repositories (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-repositories-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-repositories-output/repositories :portkey.aws.codecommit.-2015-04-13.list-repositories-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/after-commit-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/next-token :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob-id-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-event-type (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-event-type))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/actor-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-event-type :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/actor-arn :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/next-token :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/keep-empty-folders clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-names-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-branches-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-description-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/comments (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/pull-request-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/repository-name :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/location :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/comments]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.sub-module/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.sub-module/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.sub-module/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/sub-module (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.sub-module/commit-id :portkey.aws.codecommit.-2015-04-13.sub-module/absolute-path :portkey.aws.codecommit.-2015-04-13.sub-module/relative-path]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/multiple-repositories-in-pull-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-custom-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-branches-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.list-branches-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-branches-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-option-type-enum #{"FAST_FORWARD_MERGE" :fast-forward-merge})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-id-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/pull-request-id))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/change-type-enum #{:m "M" :d "A" "D" :a})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-event-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/pull-request-event))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/event-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/clone-url-ssh (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-relative-file-version-enum-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/branch-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/in-reply-to (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-reply-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/in-reply-to :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/content] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-entry-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-comment-content-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-comment-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-comment-content-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-not-created-by-caller-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/position clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/folder-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-folders (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/folder-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/files (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/symbolic-links (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/symbolic-link-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-modules (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/sub-module-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-folder-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-folder-output/commit-id :portkey.aws.codecommit.-2015-04-13.get-folder-output/folder-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-folder-output/tree-id :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-folders :portkey.aws.codecommit.-2015-04-13.get-folder-output/files :portkey.aws.codecommit.-2015-04-13.get-folder-output/symbolic-links :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-modules]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-input/commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-input/folder-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-folder-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-folder-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-folder-input/folder-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-folder-input/commit-specifier]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/delete-files (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-file-entries))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/set-file-modes (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/set-file-mode-entries))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/keep-empty-folders (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/keep-empty-folders))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/put-files (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/put-file-entries))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/author-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.create-commit-input/branch-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-commit-input/email :portkey.aws.codecommit.-2015-04-13.create-commit-input/delete-files :portkey.aws.codecommit.-2015-04-13.create-commit-input/set-file-modes :portkey.aws.codecommit.-2015-04-13.create-commit-input/commit-message :portkey.aws.codecommit.-2015-04-13.create-commit-input/keep-empty-folders :portkey.aws.codecommit.-2015-04-13.create-commit-input/put-files :portkey.aws.codecommit.-2015-04-13.create-commit-input/author-name :portkey.aws.codecommit.-2015-04-13.create-commit-input/parent-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/path-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-event-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-repository-output/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-repository-output/repository-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/content] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-actor-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-targets-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-input/sort-by (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/sort-by-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-input/order (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/order-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-repositories-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-repositories-input/next-token :portkey.aws.codecommit.-2015-04-13.list-repositories-input/sort-by :portkey.aws.codecommit.-2015-04-13.list-repositories-input/order]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-output/repository-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-repository-output/repository-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/file-content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-file-input/repository-name :portkey.aws.codecommit.-2015-04-13.put-file-input/branch-name :portkey.aws.codecommit.-2015-04-13.put-file-input/file-content :portkey.aws.codecommit.-2015-04-13.put-file-input/file-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.put-file-input/file-mode :portkey.aws.codecommit.-2015-04-13.put-file-input/email :portkey.aws.codecommit.-2015-04-13.put-file-input/name :portkey.aws.codecommit.-2015-04-13.put-file-input/commit-message :portkey.aws.codecommit.-2015-04-13.put-file-input/parent-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/pull-request-events (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-event-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/pull-request-events] :opt-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-order-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/pull-request-ids (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-pull-requests-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/pull-request-ids] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/destination-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/custom-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-custom-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/branches (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/events (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.repository-trigger/name :portkey.aws.codecommit.-2015-04-13.repository-trigger/destination-arn :portkey.aws.codecommit.-2015-04-13.repository-trigger/events] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-trigger/custom-data :portkey.aws.codecommit.-2015-04-13.repository-trigger/branches]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-repository-description-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-comment-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-comment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.update-comment-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-description-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-name :portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/manual-merge-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-destination-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/same-file-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-repository-names-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-not-found-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/before-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/before-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/limit))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-differences-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-differences-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-commit-specifier] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-differences-input/before-commit-specifier :portkey.aws.codecommit.-2015-04-13.get-differences-input/before-path :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-path :portkey.aws.codecommit.-2015-04-13.get-differences-input/max-results :portkey.aws.codecommit.-2015-04-13/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-pull-requests-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/author-arn :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/pull-request-status :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/next-token :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-pull-request-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-pull-request-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-pull-request-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-id-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/symbolic-link-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/symbolic-link))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum #{:open :closed "CLOSED" "OPEN"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-entries (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/put-file-entry))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/targets-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/triggers (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/repository-name :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/triggers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/title-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/source-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-event-type #{"PULL_REQUEST_MERGE_STATE_CHANGED" :pull-request-created :pull-request-status-changed "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" :pull-request-merge-state-changed :pull-request-source-reference-updated "PULL_REQUEST_STATUS_CHANGED" "PULL_REQUEST_CREATED"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/tips-divergence-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/relative-file-version-enum #{:after "BEFORE" "AFTER" :before})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-ssh (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/clone-url-ssh))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/account-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/account-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/default-branch (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/last-modified-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-http (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/clone-url-http))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.repository-metadata/creation-date :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-ssh :portkey.aws.codecommit.-2015-04-13.repository-metadata/account-id :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-id :portkey.aws.codecommit.-2015-04-13.repository-metadata/default-branch :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-description :portkey.aws.codecommit.-2015-04-13.repository-metadata/last-modified-date :portkey.aws.codecommit.-2015-04-13/arn :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-http]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/set-file-mode-entries (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/set-file-mode-entry))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/target-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/target))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/title (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/title] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/author-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-destination-commit-specifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-blob-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-blob-input/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-blob-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-blob-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-blob-input/blob-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-events-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.target/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.target/source-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.target/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/target (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.target/repository-name :portkey.aws.codecommit.-2015-04-13.target/source-reference] :opt-un [:portkey.aws.codecommit.-2015-04-13.target/destination-reference]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-pull-request-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-pull-request-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-status-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-name-input/old-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-name-input/new-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-repository-name-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-repository-name-input/old-name :portkey.aws.codecommit.-2015-04-13.update-repository-name-input/new-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/successful-executions (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/failed-executions (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/successful-executions :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/failed-executions]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-events-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.set-file-mode-entry/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.set-file-mode-entry/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/set-file-mode-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.set-file-mode-entry/file-path :portkey.aws.codecommit.-2015-04-13.set-file-mode-entry/file-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-output/files-added (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/files-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-output/files-updated (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/files-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-commit-output/files-deleted (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/files-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-commit-output/commit-id :portkey.aws.codecommit.-2015-04-13.create-commit-output/tree-id :portkey.aws.codecommit.-2015-04-13.create-commit-output/files-added :portkey.aws.codecommit.-2015-04-13.create-commit-output/files-updated :portkey.aws.codecommit.-2015-04-13.create-commit-output/files-deleted]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-target-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/pull-request-target))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-file-location-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-commit-input/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-commit-input/commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/sort-by-enum #{"repositoryName" "lastModifiedDate" :repository-name :last-modified-date})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum #{"NORMAL" :executable :normal "EXECUTABLE" :symlink "SYMLINK"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.delete-branch-input/branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-merge-option-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-path-conflicts-with-submodule-path-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/target-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-entry/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-file-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-file-entry/file-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-triggers-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/file))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/comments-for-pull-request-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/comments-for-pull-request-data :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/mergeable (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-mergeable))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/destination-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/mergeable :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/destination-commit-id :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/source-commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-output/differences (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/difference-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-differences-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-differences-output/differences :portkey.aws.codecommit.-2015-04-13/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/source-and-destination-are-same-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-status-changed-event-metadata/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-status-changed-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-status-changed-event-metadata/pull-request-status]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-branch-output/branch (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-branch-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-branch-output/branch]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-not-associated-with-pull-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-branch-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-mergeable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-metadata-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories-not-found (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-not-found-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories-not-found]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-custom-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit-data (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.user-info/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.user-info/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.user-info/date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/user-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.user-info/name :portkey.aws.codecommit.-2015-04-13.user-info/email :portkey.aws.codecommit.-2015-04-13.user-info/date]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/additional-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/restricted-source-file-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn create-commit ([create-commit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-commit-input create-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/create-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCommit", :http.request.configuration/output-deser-fn response-create-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidDeletionParameterException" :portkey.aws.codecommit.-2015-04-13/invalid-deletion-parameter-exception, "FileDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception, "FileNameConflictsWithDirectoryNameException" :portkey.aws.codecommit.-2015-04-13/file-name-conflicts-with-directory-name-exception, "FileEntryRequiredException" :portkey.aws.codecommit.-2015-04-13/file-entry-required-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "NoChangeException" :portkey.aws.codecommit.-2015-04-13/no-change-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception, "SourceFileOrContentRequiredException" :portkey.aws.codecommit.-2015-04-13/source-file-or-content-required-exception, "FolderContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/folder-content-size-limit-exceeded-exception, "InvalidFileModeException" :portkey.aws.codecommit.-2015-04-13/invalid-file-mode-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception, "SamePathRequestException" :portkey.aws.codecommit.-2015-04-13/same-path-request-exception, "FileContentAndSourceFileSpecifiedException" :portkey.aws.codecommit.-2015-04-13/file-content-and-source-file-specified-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit.-2015-04-13/invalid-email-exception, "DirectoryNameConflictsWithFileNameException" :portkey.aws.codecommit.-2015-04-13/directory-name-conflicts-with-file-name-exception, "FileModeRequiredException" :portkey.aws.codecommit.-2015-04-13/file-mode-required-exception, "MaximumFileEntriesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-file-entries-exceeded-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception, "FileContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/file-content-size-limit-exceeded-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "PutFileEntryConflictException" :portkey.aws.codecommit.-2015-04-13/put-file-entry-conflict-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "FilePathConflictsWithSubmodulePathException" :portkey.aws.codecommit.-2015-04-13/file-path-conflicts-with-submodule-path-exception, "NameLengthExceededException" :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "RestrictedSourceFileException" :portkey.aws.codecommit.-2015-04-13/restricted-source-file-exception}})))))
(clojure.spec.alpha/fdef create-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/create-commit-output))

(clojure.core/defn get-repository-triggers ([get-repository-triggers-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-repository-triggers-input get-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRepositoryTriggers", :http.request.configuration/output-deser-fn response-get-repository-triggers-output, :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-output))

(clojure.core/defn get-repository ([get-repository-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-repository-input get-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRepository", :http.request.configuration/output-deser-fn response-get-repository-output, :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-repository-output))

(clojure.core/defn list-repositories ([] (list-repositories {})) ([list-repositories-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-repositories-input list-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/list-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/list-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRepositories", :http.request.configuration/output-deser-fn response-list-repositories-output, :http.request.spec/error-spec {"InvalidSortByException" :portkey.aws.codecommit.-2015-04-13/invalid-sort-by-exception, "InvalidOrderException" :portkey.aws.codecommit.-2015-04-13/invalid-order-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception}})))))
(clojure.spec.alpha/fdef list-repositories :args (clojure.spec.alpha/? :portkey.aws.codecommit.-2015-04-13/list-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/list-repositories-output))

(clojure.core/defn update-repository-name ([update-repository-name-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-repository-name-input update-repository-name-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-repository-name-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRepositoryName", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "RepositoryNameExistsException" :portkey.aws.codecommit.-2015-04-13/repository-name-exists-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception}})))))
(clojure.spec.alpha/fdef update-repository-name :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-repository-name-input) :ret clojure.core/true?)

(clojure.core/defn put-repository-triggers ([put-repository-triggers-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-repository-triggers-input put-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRepositoryTriggers", :http.request.configuration/output-deser-fn response-put-repository-triggers-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "MaximumRepositoryTriggersExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-repository-triggers-exceeded-exception, "InvalidRepositoryTriggerNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "RepositoryTriggerBranchNameListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-branch-name-list-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryTriggerDestinationArnRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-destination-arn-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryTriggerRegionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-region-exception, "MaximumBranchesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-branches-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "InvalidRepositoryTriggerDestinationArnException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-destination-arn-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "RepositoryTriggerNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-required-exception, "RepositoryTriggerEventsListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-events-list-required-exception, "InvalidRepositoryTriggerEventsException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-events-exception, "RepositoryTriggersListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-triggers-list-required-exception, "InvalidRepositoryTriggerBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-branch-name-exception, "InvalidRepositoryTriggerCustomDataException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-custom-data-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef put-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-output))

(clojure.core/defn get-file ([get-file-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-file-input get-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFile", :http.request.configuration/output-deser-fn response-get-file-output, :http.request.spec/error-spec {"FileTooLargeException" :portkey.aws.codecommit.-2015-04-13/file-too-large-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "FileDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-file-output))

(clojure.core/defn batch-get-repositories ([batch-get-repositories-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-batch-get-repositories-input batch-get-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetRepositories", :http.request.configuration/output-deser-fn response-batch-get-repositories-output, :http.request.spec/error-spec {"RepositoryNamesRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-names-required-exception, "MaximumRepositoryNamesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-repository-names-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef batch-get-repositories :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-output))

(clojure.core/defn delete-file ([delete-file-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-file-input delete-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFile", :http.request.configuration/output-deser-fn response-delete-file-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "FileDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit.-2015-04-13/invalid-email-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "NameLengthExceededException" :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef delete-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-file-output))

(clojure.core/defn get-commit ([get-commit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-commit-input get-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCommit", :http.request.configuration/output-deser-fn response-get-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-id-does-not-exist-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-commit-output))

(clojure.core/defn post-comment-for-compared-commit ([post-comment-for-compared-commit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-post-comment-for-compared-commit-input post-comment-for-compared-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostCommentForComparedCommit", :http.request.configuration/output-deser-fn response-post-comment-for-compared-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidFilePositionException" :portkey.aws.codecommit.-2015-04-13/invalid-file-position-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "PathDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "BeforeCommitIdAndAfterCommitIdAreSameException" :portkey.aws.codecommit.-2015-04-13/before-commit-id-and-after-commit-id-are-same-exception, "CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "InvalidRelativeFileVersionEnumException" :portkey.aws.codecommit.-2015-04-13/invalid-relative-file-version-enum-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "InvalidFileLocationException" :portkey.aws.codecommit.-2015-04-13/invalid-file-location-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef post-comment-for-compared-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-output))

(clojure.core/defn update-pull-request-description ([update-pull-request-description-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-pull-request-description-input update-pull-request-description-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePullRequestDescription", :http.request.configuration/output-deser-fn response-update-pull-request-description-output, :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "InvalidDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-description-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-description :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-output))

(clojure.core/defn get-folder ([get-folder-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-folder-input get-folder-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-folder-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-folder-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFolder", :http.request.configuration/output-deser-fn response-get-folder-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "FolderDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/folder-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-folder :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-folder-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-folder-output))

(clojure.core/defn update-comment ([update-comment-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-comment-input update-comment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-comment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-comment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateComment", :http.request.configuration/output-deser-fn response-update-comment-output, :http.request.spec/error-spec {"CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception, "CommentNotCreatedByCallerException" :portkey.aws.codecommit.-2015-04-13/comment-not-created-by-caller-exception, "CommentDeletedException" :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef update-comment :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-comment-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-comment-output))

(clojure.core/defn delete-repository ([delete-repository-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-repository-input delete-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRepository", :http.request.configuration/output-deser-fn response-delete-repository-output, :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-repository-output))

(clojure.core/defn get-branch ([] (get-branch {})) ([get-branch-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-branch-input get-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-branch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBranch", :http.request.configuration/output-deser-fn response-get-branch-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-branch :args (clojure.spec.alpha/? :portkey.aws.codecommit.-2015-04-13/get-branch-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-branch-output))

(clojure.core/defn get-blob ([get-blob-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-blob-input get-blob-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-blob-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-blob-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBlob", :http.request.configuration/output-deser-fn response-get-blob-output, :http.request.spec/error-spec {"FileTooLargeException" :portkey.aws.codecommit.-2015-04-13/file-too-large-exception, "InvalidBlobIdException" :portkey.aws.codecommit.-2015-04-13/invalid-blob-id-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "BlobIdDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/blob-id-does-not-exist-exception, "BlobIdRequiredException" :portkey.aws.codecommit.-2015-04-13/blob-id-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-blob :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-blob-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-blob-output))

(clojure.core/defn get-differences ([get-differences-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-differences-input get-differences-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-differences-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-differences-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDifferences", :http.request.configuration/output-deser-fn response-get-differences-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "PathDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-differences :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-differences-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-differences-output))

(clojure.core/defn delete-comment-content ([delete-comment-content-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-comment-content-input delete-comment-content-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-comment-content-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-comment-content-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCommentContent", :http.request.configuration/output-deser-fn response-delete-comment-content-output, :http.request.spec/error-spec {"CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception, "CommentDeletedException" :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef delete-comment-content :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-comment-content-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-comment-content-output))

(clojure.core/defn list-branches ([list-branches-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-branches-input list-branches-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/list-branches-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/list-branches-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBranches", :http.request.configuration/output-deser-fn response-list-branches-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef list-branches :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/list-branches-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/list-branches-output))

(clojure.core/defn get-comments-for-pull-request ([get-comments-for-pull-request-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-comments-for-pull-request-input get-comments-for-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCommentsForPullRequest", :http.request.configuration/output-deser-fn response-get-comments-for-pull-request-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "RepositoryNotAssociatedWithPullRequestException" :portkey.aws.codecommit.-2015-04-13/repository-not-associated-with-pull-request-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-comments-for-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-output))

(clojure.core/defn get-pull-request ([get-pull-request-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-pull-request-input get-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPullRequest", :http.request.configuration/output-deser-fn response-get-pull-request-output, :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-pull-request-output))

(clojure.core/defn get-comment ([get-comment-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-comment-input get-comment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-comment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-comment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetComment", :http.request.configuration/output-deser-fn response-get-comment-output, :http.request.spec/error-spec {"CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception, "CommentDeletedException" :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef get-comment :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-comment-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-comment-output))

(clojure.core/defn update-default-branch ([update-default-branch-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-default-branch-input update-default-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-default-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDefaultBranch", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-default-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-default-branch-input) :ret clojure.core/true?)

(clojure.core/defn post-comment-reply ([post-comment-reply-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-post-comment-reply-input post-comment-reply-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/post-comment-reply-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/post-comment-reply-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostCommentReply", :http.request.configuration/output-deser-fn response-post-comment-reply-output, :http.request.spec/error-spec {"ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception}})))))
(clojure.spec.alpha/fdef post-comment-reply :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/post-comment-reply-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/post-comment-reply-output))

(clojure.core/defn get-merge-conflicts ([get-merge-conflicts-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-merge-conflicts-input get-merge-conflicts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMergeConflicts", :http.request.configuration/output-deser-fn response-get-merge-conflicts-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidSourceCommitSpecifierException" :portkey.aws.codecommit.-2015-04-13/invalid-source-commit-specifier-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "MergeOptionRequiredException" :portkey.aws.codecommit.-2015-04-13/merge-option-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "TipsDivergenceExceededException" :portkey.aws.codecommit.-2015-04-13/tips-divergence-exceeded-exception, "InvalidDestinationCommitSpecifierException" :portkey.aws.codecommit.-2015-04-13/invalid-destination-commit-specifier-exception, "InvalidMergeOptionException" :portkey.aws.codecommit.-2015-04-13/invalid-merge-option-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-merge-conflicts :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-output))

(clojure.core/defn create-pull-request ([create-pull-request-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-pull-request-input create-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/create-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePullRequest", :http.request.configuration/output-deser-fn response-create-pull-request-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "MaximumOpenPullRequestsExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-open-pull-requests-exceeded-exception, "InvalidReferenceNameException" :portkey.aws.codecommit.-2015-04-13/invalid-reference-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "InvalidTitleException" :portkey.aws.codecommit.-2015-04-13/invalid-title-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "InvalidTargetException" :portkey.aws.codecommit.-2015-04-13/invalid-target-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ReferenceNameRequiredException" :portkey.aws.codecommit.-2015-04-13/reference-name-required-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "ReferenceDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/reference-does-not-exist-exception, "MultipleRepositoriesInPullRequestException" :portkey.aws.codecommit.-2015-04-13/multiple-repositories-in-pull-request-exception, "InvalidTargetsException" :portkey.aws.codecommit.-2015-04-13/invalid-targets-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "InvalidDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-description-exception, "TargetsRequiredException" :portkey.aws.codecommit.-2015-04-13/targets-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "TitleRequiredException" :portkey.aws.codecommit.-2015-04-13/title-required-exception, "ReferenceTypeNotSupportedException" :portkey.aws.codecommit.-2015-04-13/reference-type-not-supported-exception, "TargetRequiredException" :portkey.aws.codecommit.-2015-04-13/target-required-exception, "SourceAndDestinationAreSameException" :portkey.aws.codecommit.-2015-04-13/source-and-destination-are-same-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/create-pull-request-output))

(clojure.core/defn merge-pull-request-by-fast-forward ([merge-pull-request-by-fast-forward-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-merge-pull-request-by-fast-forward-input merge-pull-request-by-fast-forward-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MergePullRequestByFastForward", :http.request.configuration/output-deser-fn response-merge-pull-request-by-fast-forward-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "TipOfSourceReferenceIsDifferentException" :portkey.aws.codecommit.-2015-04-13/tip-of-source-reference-is-different-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "ReferenceDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/reference-does-not-exist-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "ManualMergeRequiredException" :portkey.aws.codecommit.-2015-04-13/manual-merge-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef merge-pull-request-by-fast-forward :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-output))

(clojure.core/defn create-branch ([create-branch-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-branch-input create-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBranch", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "BranchNameExistsException" :portkey.aws.codecommit.-2015-04-13/branch-name-exists-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-branch-input) :ret clojure.core/true?)

(clojure.core/defn list-pull-requests ([list-pull-requests-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-pull-requests-input list-pull-requests-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/list-pull-requests-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/list-pull-requests-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPullRequests", :http.request.configuration/output-deser-fn response-list-pull-requests-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestStatusException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidAuthorArnException" :portkey.aws.codecommit.-2015-04-13/invalid-author-arn-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "AuthorDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/author-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef list-pull-requests :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/list-pull-requests-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/list-pull-requests-output))

(clojure.core/defn describe-pull-request-events ([describe-pull-request-events-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-pull-request-events-input describe-pull-request-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePullRequestEvents", :http.request.configuration/output-deser-fn response-describe-pull-request-events-output, :http.request.spec/error-spec {"ActorDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/actor-does-not-exist-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestEventTypeException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-event-type-exception, "InvalidActorArnException" :portkey.aws.codecommit.-2015-04-13/invalid-actor-arn-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef describe-pull-request-events :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-output))

(clojure.core/defn post-comment-for-pull-request ([post-comment-for-pull-request-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-post-comment-for-pull-request-input post-comment-for-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostCommentForPullRequest", :http.request.configuration/output-deser-fn response-post-comment-for-pull-request-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidFilePositionException" :portkey.aws.codecommit.-2015-04-13/invalid-file-position-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "PathDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "BeforeCommitIdAndAfterCommitIdAreSameException" :portkey.aws.codecommit.-2015-04-13/before-commit-id-and-after-commit-id-are-same-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "InvalidRelativeFileVersionEnumException" :portkey.aws.codecommit.-2015-04-13/invalid-relative-file-version-enum-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "InvalidFileLocationException" :portkey.aws.codecommit.-2015-04-13/invalid-file-location-exception, "RepositoryNotAssociatedWithPullRequestException" :portkey.aws.codecommit.-2015-04-13/repository-not-associated-with-pull-request-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef post-comment-for-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-output))

(clojure.core/defn put-file ([put-file-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-file-input put-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/put-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/put-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutFile", :http.request.configuration/output-deser-fn response-put-file-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidDeletionParameterException" :portkey.aws.codecommit.-2015-04-13/invalid-deletion-parameter-exception, "FileNameConflictsWithDirectoryNameException" :portkey.aws.codecommit.-2015-04-13/file-name-conflicts-with-directory-name-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception, "FolderContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/folder-content-size-limit-exceeded-exception, "InvalidFileModeException" :portkey.aws.codecommit.-2015-04-13/invalid-file-mode-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit.-2015-04-13/invalid-email-exception, "DirectoryNameConflictsWithFileNameException" :portkey.aws.codecommit.-2015-04-13/directory-name-conflicts-with-file-name-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception, "FileContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/file-content-size-limit-exceeded-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "SameFileContentException" :portkey.aws.codecommit.-2015-04-13/same-file-content-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "FileContentRequiredException" :portkey.aws.codecommit.-2015-04-13/file-content-required-exception, "FilePathConflictsWithSubmodulePathException" :portkey.aws.codecommit.-2015-04-13/file-path-conflicts-with-submodule-path-exception, "NameLengthExceededException" :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef put-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/put-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/put-file-output))

(clojure.core/defn update-pull-request-status ([update-pull-request-status-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-pull-request-status-input update-pull-request-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePullRequestStatus", :http.request.configuration/output-deser-fn response-update-pull-request-status-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestStatusException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "InvalidPullRequestStatusUpdateException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-update-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "PullRequestStatusRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-status-required-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-status :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-output))

(clojure.core/defn test-repository-triggers ([test-repository-triggers-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-test-repository-triggers-input test-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TestRepositoryTriggers", :http.request.configuration/output-deser-fn response-test-repository-triggers-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "MaximumRepositoryTriggersExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-repository-triggers-exceeded-exception, "InvalidRepositoryTriggerNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "RepositoryTriggerBranchNameListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-branch-name-list-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryTriggerDestinationArnRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-destination-arn-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryTriggerRegionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-region-exception, "MaximumBranchesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-branches-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "InvalidRepositoryTriggerDestinationArnException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-destination-arn-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "RepositoryTriggerNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-required-exception, "RepositoryTriggerEventsListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-events-list-required-exception, "InvalidRepositoryTriggerEventsException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-events-exception, "RepositoryTriggersListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-triggers-list-required-exception, "InvalidRepositoryTriggerBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-branch-name-exception, "InvalidRepositoryTriggerCustomDataException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-custom-data-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef test-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-output))

(clojure.core/defn delete-branch ([delete-branch-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-branch-input delete-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-branch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBranch", :http.request.configuration/output-deser-fn response-delete-branch-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "DefaultBranchCannotBeDeletedException" :portkey.aws.codecommit.-2015-04-13/default-branch-cannot-be-deleted-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef delete-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-branch-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-branch-output))

(clojure.core/defn update-repository-description ([update-repository-description-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-repository-description-input update-repository-description-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-repository-description-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRepositoryDescription", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidRepositoryDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-description-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-repository-description :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-repository-description-input) :ret clojure.core/true?)

(clojure.core/defn update-pull-request-title ([update-pull-request-title-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-pull-request-title-input update-pull-request-title-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePullRequestTitle", :http.request.configuration/output-deser-fn response-update-pull-request-title-output, :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "TitleRequiredException" :portkey.aws.codecommit.-2015-04-13/title-required-exception, "InvalidTitleException" :portkey.aws.codecommit.-2015-04-13/invalid-title-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-title :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-output))

(clojure.core/defn create-repository ([create-repository-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-repository-input create-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/create-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRepository", :http.request.configuration/output-deser-fn response-create-repository-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidRepositoryDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-description-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "RepositoryLimitExceededException" :portkey.aws.codecommit.-2015-04-13/repository-limit-exceeded-exception, "RepositoryNameExistsException" :portkey.aws.codecommit.-2015-04-13/repository-name-exists-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/create-repository-output))

(clojure.core/defn get-comments-for-compared-commit ([get-comments-for-compared-commit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-comments-for-compared-commit-input get-comments-for-compared-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCommentsForComparedCommit", :http.request.configuration/output-deser-fn response-get-comments-for-compared-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-comments-for-compared-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-output))
