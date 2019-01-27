(ns portkey.aws.rekognition (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "rekognition", :region "ap-northeast-1"},
    :ssl-common-name "rekognition.ap-northeast-1.amazonaws.com",
    :endpoint "https://rekognition.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "rekognition", :region "eu-west-1"},
    :ssl-common-name "rekognition.eu-west-1.amazonaws.com",
    :endpoint "https://rekognition.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "rekognition", :region "us-east-2"},
    :ssl-common-name "rekognition.us-east-2.amazonaws.com",
    :endpoint "https://rekognition.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "rekognition", :region "ap-southeast-2"},
    :ssl-common-name "rekognition.ap-southeast-2.amazonaws.com",
    :endpoint "https://rekognition.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "rekognition", :region "us-west-2"},
    :ssl-common-name "rekognition.us-west-2.amazonaws.com",
    :endpoint "https://rekognition.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "rekognition", :region "us-east-1"},
    :ssl-common-name "rekognition.us-east-1.amazonaws.com",
    :endpoint "https://rekognition.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "rekognition", :region "us-gov-west-1"},
    :ssl-common-name "rekognition.us-gov-west-1.amazonaws.com",
    :endpoint "https://rekognition.us-gov-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-face-attributes)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-s-3-object-version)

(clojure.core/declare ser-stream-processor-output)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-face-id-list)

(clojure.core/declare ser-person-tracking-sort-by)

(clojure.core/declare ser-face-search-sort-by)

(clojure.core/declare ser-video)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-job-tag)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-s-3-object-name)

(clojure.core/declare ser-kinesis-data-stream)

(clojure.core/declare ser-image-blob)

(clojure.core/declare ser-u-integer)

(clojure.core/declare ser-percent)

(clojure.core/declare ser-face-search-settings)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-celebrity-recognition-sort-by)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-kinesis-video-stream)

(clojure.core/declare ser-max-faces)

(clojure.core/declare ser-stream-processor-input)

(clojure.core/declare ser-content-moderation-sort-by)

(clojure.core/declare ser-stream-processor-settings)

(clojure.core/declare ser-label-detection-sort-by)

(clojure.core/declare ser-sns-topic-arn)

(clojure.core/declare ser-kinesis-data-arn)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-face-id)

(clojure.core/declare ser-kinesis-video-arn)

(clojure.core/declare ser-notification-channel)

(clojure.core/declare ser-rekognition-unique-id)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-image)

(clojure.core/declare ser-max-faces-to-index)

(clojure.core/declare ser-stream-processor-name)

(clojure.core/declare ser-quality-filter)

(clojure.core/declare ser-external-image-id)

(clojure.core/declare ser-s-3-object)

(clojure.core/declare ser-collection-id)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-face-attributes [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "ALL" "ALL", :all "ALL"} input), :shape "FaceAttributes"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-s-3-object-version [input] #:http.request.field{:value input, :shape "S3ObjectVersion"})

(clojure.core/defn- ser-stream-processor-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamProcessorOutput", :type "structure"} (clojure.core/contains? input :kinesis-data-stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-data-stream (input :kinesis-data-stream)) #:http.request.field{:name "KinesisDataStream", :shape "KinesisDataStream"}))))

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-face-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-face-id coll) #:http.request.field{:shape "FaceId"}))) input), :shape "FaceIdList", :type "list", :max 4096, :min 1})

(clojure.core/defn- ser-person-tracking-sort-by [input] #:http.request.field{:value (clojure.core/get {"INDEX" "INDEX", :index "INDEX", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "PersonTrackingSortBy"})

(clojure.core/defn- ser-face-search-sort-by [input] #:http.request.field{:value (clojure.core/get {"INDEX" "INDEX", :index "INDEX", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "FaceSearchSortBy"})

(clojure.core/defn- ser-video [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Video", :type "structure"} (clojure.core/contains? input :s-3-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object (input :s-3-object)) #:http.request.field{:name "S3Object", :shape "S3Object"}))))

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-job-tag [input] #:http.request.field{:value input, :shape "JobTag"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-s-3-object-name [input] #:http.request.field{:value input, :shape "S3ObjectName"})

(clojure.core/defn- ser-kinesis-data-stream [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisDataStream", :type "structure"} (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-data-arn (input :arn)) #:http.request.field{:name "Arn", :shape "KinesisDataArn"}))))

(clojure.core/defn- ser-image-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ImageBlob"})

(clojure.core/defn- ser-u-integer [input] #:http.request.field{:value input, :shape "UInteger"})

(clojure.core/defn- ser-percent [input] #:http.request.field{:value input, :shape "Percent"})

(clojure.core/defn- ser-face-search-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FaceSearchSettings", :type "structure"} (clojure.core/contains? input :collection-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"}))))

(clojure.core/defn- ser-attribute [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "ALL" "ALL", :all "ALL"} input), :shape "Attribute"})

(clojure.core/defn- ser-celebrity-recognition-sort-by [input] #:http.request.field{:value (clojure.core/get {"ID" "ID", :id "ID", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "CelebrityRecognitionSortBy"})

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "Attributes", :type "list"})

(clojure.core/defn- ser-kinesis-video-stream [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisVideoStream", :type "structure"} (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-video-arn (input :arn)) #:http.request.field{:name "Arn", :shape "KinesisVideoArn"}))))

(clojure.core/defn- ser-max-faces [input] #:http.request.field{:value input, :shape "MaxFaces"})

(clojure.core/defn- ser-stream-processor-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamProcessorInput", :type "structure"} (clojure.core/contains? input :kinesis-video-stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-video-stream (input :kinesis-video-stream)) #:http.request.field{:name "KinesisVideoStream", :shape "KinesisVideoStream"}))))

(clojure.core/defn- ser-content-moderation-sort-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "ContentModerationSortBy"})

(clojure.core/defn- ser-stream-processor-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamProcessorSettings", :type "structure"} (clojure.core/contains? input :face-search) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-face-search-settings (input :face-search)) #:http.request.field{:name "FaceSearch", :shape "FaceSearchSettings"}))))

(clojure.core/defn- ser-label-detection-sort-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "LabelDetectionSortBy"})

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SNSTopicArn"})

(clojure.core/defn- ser-kinesis-data-arn [input] #:http.request.field{:value input, :shape "KinesisDataArn"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-face-id [input] #:http.request.field{:value input, :shape "FaceId"})

(clojure.core/defn- ser-kinesis-video-arn [input] #:http.request.field{:value input, :shape "KinesisVideoArn"})

(clojure.core/defn- ser-notification-channel [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sns-topic-arn (:sns-topic-arn input)) #:http.request.field{:name "SNSTopicArn", :shape "SNSTopicArn"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})], :shape "NotificationChannel", :type "structure"}))

(clojure.core/defn- ser-rekognition-unique-id [input] #:http.request.field{:value input, :shape "RekognitionUniqueId"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-image [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Image", :type "structure"} (clojure.core/contains? input :bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-blob (input :bytes)) #:http.request.field{:name "Bytes", :shape "ImageBlob"})) (clojure.core/contains? input :s-3-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object (input :s-3-object)) #:http.request.field{:name "S3Object", :shape "S3Object"}))))

(clojure.core/defn- ser-max-faces-to-index [input] #:http.request.field{:value input, :shape "MaxFacesToIndex"})

(clojure.core/defn- ser-stream-processor-name [input] #:http.request.field{:value input, :shape "StreamProcessorName"})

(clojure.core/defn- ser-quality-filter [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "AUTO" "AUTO", :auto "AUTO"} input), :shape "QualityFilter"})

(clojure.core/defn- ser-external-image-id [input] #:http.request.field{:value input, :shape "ExternalImageId"})

(clojure.core/defn- ser-s-3-object [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Object", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :bucket)) #:http.request.field{:name "Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-name (input :name)) #:http.request.field{:name "Name", :shape "S3ObjectName"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :version)) #:http.request.field{:name "Version", :shape "S3ObjectVersion"}))))

(clojure.core/defn- ser-collection-id [input] #:http.request.field{:value input, :shape "CollectionId"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-create-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-input (input :input)) #:http.request.field{:name "Input", :shape "StreamProcessorInput"}) (clojure.core/into (ser-stream-processor-output (input :output)) #:http.request.field{:name "Output", :shape "StreamProcessorOutput"}) (clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"}) (clojure.core/into (ser-stream-processor-settings (input :settings)) #:http.request.field{:name "Settings", :shape "StreamProcessorSettings"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-start-face-search-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"}) (clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-list-stream-processors-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-detect-text-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]}))

(clojure.core/defn- req-detect-moderation-labels-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"}))))

(clojure.core/defn- req-search-faces-by-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :max-faces) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-faces (input :max-faces)) #:http.request.field{:name "MaxFaces", :shape "MaxFaces"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"}))))

(clojure.core/defn- req-delete-collection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]}))

(clojure.core/defn- req-start-person-tracking-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-recognize-celebrities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]}))

(clojure.core/defn- req-start-content-moderation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-get-celebrity-info-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rekognition-unique-id (input :id)) #:http.request.field{:name "Id", :shape "RekognitionUniqueId"})]}))

(clojure.core/defn- req-create-collection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]}))

(clojure.core/defn- req-get-celebrity-recognition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-celebrity-recognition-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "CelebrityRecognitionSortBy"}))))

(clojure.core/defn- req-list-collections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-index-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :external-image-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-external-image-id (input :external-image-id)) #:http.request.field{:name "ExternalImageId", :shape "ExternalImageId"})) (clojure.core/contains? input :detection-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :detection-attributes)) #:http.request.field{:name "DetectionAttributes", :shape "Attributes"})) (clojure.core/contains? input :max-faces) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-faces-to-index (input :max-faces)) #:http.request.field{:name "MaxFaces", :shape "MaxFacesToIndex"})) (clojure.core/contains? input :quality-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quality-filter (input :quality-filter)) #:http.request.field{:name "QualityFilter", :shape "QualityFilter"}))))

(clojure.core/defn- req-delete-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-detect-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "Attributes"}))))

(clojure.core/defn- req-start-celebrity-recognition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-stop-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-describe-collection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]}))

(clojure.core/defn- req-compare-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :source-image)) #:http.request.field{:name "SourceImage", :shape "Image"}) (clojure.core/into (ser-image (input :target-image)) #:http.request.field{:name "TargetImage", :shape "Image"})]} (clojure.core/contains? input :similarity-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :similarity-threshold)) #:http.request.field{:name "SimilarityThreshold", :shape "Percent"}))))

(clojure.core/defn- req-search-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-face-id (input :face-id)) #:http.request.field{:name "FaceId", :shape "FaceId"})]} (clojure.core/contains? input :max-faces) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-faces (input :max-faces)) #:http.request.field{:name "MaxFaces", :shape "MaxFaces"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"}))))

(clojure.core/defn- req-get-person-tracking-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-person-tracking-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "PersonTrackingSortBy"}))))

(clojure.core/defn- req-delete-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-face-id-list (input :face-ids)) #:http.request.field{:name "FaceIds", :shape "FaceIdList"})]}))

(clojure.core/defn- req-detect-labels-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :max-labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-u-integer (input :max-labels)) #:http.request.field{:name "MaxLabels", :shape "UInteger"})) (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"}))))

(clojure.core/defn- req-get-label-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-label-detection-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "LabelDetectionSortBy"}))))

(clojure.core/defn- req-get-content-moderation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-moderation-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ContentModerationSortBy"}))))

(clojure.core/defn- req-start-face-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :face-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-face-attributes (input :face-attributes)) #:http.request.field{:name "FaceAttributes", :shape "FaceAttributes"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-get-face-search-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-face-search-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "FaceSearchSortBy"}))))

(clojure.core/defn- req-start-label-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-start-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-list-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-face-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-match-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-match))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-attributes #{:default :all "DEFAULT" "ALL"})

(clojure.spec.alpha/def :portkey.aws.rekognition.person-detail/index (clojure.spec.alpha/and :portkey.aws.rekognition/person-index))
(clojure.spec.alpha/def :portkey.aws.rekognition.person-detail/face (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/person-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.person-detail/index :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.person-detail/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.sunglasses/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.sunglasses/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/sunglasses (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.sunglasses/value :portkey.aws.rekognition.sunglasses/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-response/faces (clojure.spec.alpha/and :portkey.aws.rekognition/face-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-faces-response/faces :portkey.aws.rekognition.list-faces-response/next-token :portkey.aws.rekognition.list-faces-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/input (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-input))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/output (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-output))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/settings (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition/create-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.create-stream-processor-request/input :portkey.aws.rekognition.create-stream-processor-request/output :portkey.aws.rekognition.create-stream-processor-request/name :portkey.aws.rekognition.create-stream-processor-request/settings :portkey.aws.rekognition/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.stream-processor/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.stream-processor/status (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-status))
(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.stream-processor/name :portkey.aws.rekognition.stream-processor/status]))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-face-search-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video :portkey.aws.rekognition/collection-id] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition.start-face-search-request/face-match-threshold :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition/stop-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/detected-text (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/type (clojure.spec.alpha/and :portkey.aws.rekognition/text-types))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/id (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/parent-id (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/text-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.text-detection/detected-text :portkey.aws.rekognition.text-detection/type :portkey.aws.rekognition.text-detection/id :portkey.aws.rekognition.text-detection/parent-id :portkey.aws.rekognition.text-detection/confidence :portkey.aws.rekognition/geometry]))

(clojure.spec.alpha/def :portkey.aws.rekognition/urls (clojure.spec.alpha/coll-of :portkey.aws.rekognition/url))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/stream-processor))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-image-format-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.face-detection/face (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.face-detection/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.recognize-celebrities-response/celebrity-faces (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.recognize-celebrities-response/unrecognized-faces (clojure.spec.alpha/and :portkey.aws.rekognition/compared-face-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/recognize-celebrities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.recognize-celebrities-response/celebrity-faces :portkey.aws.rekognition.recognize-celebrities-response/unrecognized-faces :portkey.aws.rekognition/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-index clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition.list-stream-processors-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-stream-processors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-stream-processors-request/next-token :portkey.aws.rekognition/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/describe-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.describe-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/labels (clojure.spec.alpha/and :portkey.aws.rekognition/label-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-label-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-label-detection-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-label-detection-response/next-token :portkey.aws.rekognition.get-label-detection-response/labels]))

(clojure.spec.alpha/def :portkey.aws.rekognition/landmarks (clojure.spec.alpha/coll-of :portkey.aws.rekognition/landmark))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-label-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-faces-response/deleted-faces (clojure.spec.alpha/and :portkey.aws.rekognition/face-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.delete-faces-response/deleted-faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-response/persons (clojure.spec.alpha/and :portkey.aws.rekognition/person-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-person-tracking-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-person-tracking-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-person-tracking-response/next-token :portkey.aws.rekognition.get-person-tracking-response/persons]))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/kinesis-data-stream]))

(clojure.spec.alpha/def :portkey.aws.rekognition/page-size (clojure.spec.alpha/int-in 0 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/source-image-face (clojure.spec.alpha/and :portkey.aws.rekognition/compared-source-image-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/compare-faces-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/unmatched-faces (clojure.spec.alpha/and :portkey.aws.rekognition/compare-faces-unmatch-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/source-image-orientation-correction (clojure.spec.alpha/and :portkey.aws.rekognition/orientation-correction))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/target-image-orientation-correction (clojure.spec.alpha/and :portkey.aws.rekognition/orientation-correction))
(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.compare-faces-response/source-image-face :portkey.aws.rekognition.compare-faces-response/face-matches :portkey.aws.rekognition.compare-faces-response/unmatched-faces :portkey.aws.rekognition.compare-faces-response/source-image-orientation-correction :portkey.aws.rekognition.compare-faces-response/target-image-orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-id-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-id :min-count 1 :max-count 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/width (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/height (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/left (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/top (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/bounding-box (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.bounding-box/width :portkey.aws.rekognition.bounding-box/height :portkey.aws.rekognition.bounding-box/left :portkey.aws.rekognition.bounding-box/top]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.smile/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.smile/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/smile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.smile/value :portkey.aws.rekognition.smile/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/detect-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.age-range/low (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.age-range/high (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition/age-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.age-range/low :portkey.aws.rekognition.age-range/high]))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-tracking-sort-by #{"INDEX" "TIMESTAMP" :index :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-s-3-object-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-search-sort-by #{"INDEX" "TIMESTAMP" :index :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-moderation-labels-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-moderation-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition.detect-moderation-labels-request/min-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-response/searched-face-id (clojure.spec.alpha/and :portkey.aws.rekognition/face-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.search-faces-response/searched-face-id :portkey.aws.rekognition.search-faces-response/face-matches :portkey.aws.rekognition.search-faces-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-by-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition/max-faces :portkey.aws.rekognition.search-faces-by-image-request/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition.landmark/type (clojure.spec.alpha/and :portkey.aws.rekognition/landmark-type))
(clojure.spec.alpha/def :portkey.aws.rekognition.landmark/x (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.landmark/y (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/landmark (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.landmark/type :portkey.aws.rekognition.landmark/x :portkey.aws.rekognition.landmark/y]))

(clojure.spec.alpha/def :portkey.aws.rekognition/video (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.rekognition/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition/emotions (clojure.spec.alpha/coll-of :portkey.aws.rekognition/emotion))

(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/id (clojure.spec.alpha/and :portkey.aws.rekognition/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/face (clojure.spec.alpha/and :portkey.aws.rekognition/compared-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/match-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/urls :portkey.aws.rekognition.celebrity/name :portkey.aws.rekognition.celebrity/id :portkey.aws.rekognition.celebrity/face :portkey.aws.rekognition.celebrity/match-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/geometry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition/polygon]))

(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/id (clojure.spec.alpha/and :portkey.aws.rekognition/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/face (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/urls :portkey.aws.rekognition.celebrity-detail/name :portkey.aws.rekognition.celebrity-detail/id :portkey.aws.rekognition.celebrity-detail/confidence :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.celebrity-detail/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-response/faces (clojure.spec.alpha/and :portkey.aws.rekognition/face-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-face-detection-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-face-detection-response/next-token :portkey.aws.rekognition.get-face-detection-response/faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.emotion/type (clojure.spec.alpha/and :portkey.aws.rekognition/emotion-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.emotion/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/emotion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.emotion/type :portkey.aws.rekognition.emotion/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/face :portkey.aws.rekognition/face-detail]))

(clojure.spec.alpha/def :portkey.aws.rekognition.eye-open/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.eye-open/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/eye-open (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.eye-open/value :portkey.aws.rekognition.eye-open/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-text-response/text-detections (clojure.spec.alpha/and :portkey.aws.rekognition/text-detection-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.detect-text-response/text-detections]))

(clojure.spec.alpha/def :portkey.aws.rekognition/delete-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-recognitions (clojure.spec.alpha/coll-of :portkey.aws.rekognition/celebrity-recognition))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-person-tracking-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.mustache/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.mustache/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/mustache (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.mustache/value :portkey.aws.rekognition.mustache/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-model-version-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/string))

(clojure.spec.alpha/def :portkey.aws.rekognition/job-tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/collection-id-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/collection-id))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/searched-face-bounding-box (clojure.spec.alpha/and :portkey.aws.rekognition/bounding-box))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/searched-face-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-by-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.search-faces-by-image-response/searched-face-bounding-box :portkey.aws.rekognition.search-faces-by-image-response/searched-face-confidence :portkey.aws.rekognition.search-faces-by-image-response/face-matches :portkey.aws.rekognition.search-faces-by-image-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-unmatch-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/compared-face))

(clojure.spec.alpha/def :portkey.aws.rekognition/label-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition/label]))

(clojure.spec.alpha/def :portkey.aws.rekognition/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-object-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rekognition/recognize-celebrities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-content-moderation-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-content-moderation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition.start-content-moderation-request/min-confidence :portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-response/persons (clojure.spec.alpha/and :portkey.aws.rekognition/person-matches))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-face-search-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition.get-face-search-response/next-token :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-face-search-response/persons]))

(clojure.spec.alpha/def :portkey.aws.rekognition/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.kinesis-data-stream/arn (clojure.spec.alpha/and :portkey.aws.rekognition/kinesis-data-arn))
(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-data-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.kinesis-data-stream/arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition/text-detection-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/text-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.face-match/similarity (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.face-match/similarity :portkey.aws.rekognition/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition/image-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.rekognition/u-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-info-request/id (clojure.spec.alpha/and :portkey.aws.rekognition/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-info-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.get-celebrity-info-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.gender/value (clojure.spec.alpha/and :portkey.aws.rekognition/gender-type))
(clojure.spec.alpha/def :portkey.aws.rekognition.gender/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/gender (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.gender/value :portkey.aws.rekognition.gender/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.compared-source-image-face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/compared-source-image-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.compared-source-image-face/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-content-moderation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/unindexed-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/reasons :portkey.aws.rekognition/face-detail]))

(clojure.spec.alpha/def :portkey.aws.rekognition/delete-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/percent clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition.face-search-settings/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-search-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition.face-search-settings/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition/unindexed-faces (clojure.spec.alpha/coll-of :portkey.aws.rekognition/unindexed-face))

(clojure.spec.alpha/def :portkey.aws.rekognition/create-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/attribute #{:default :all "DEFAULT" "ALL"})

(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-response/face-records (clojure.spec.alpha/and :portkey.aws.rekognition/face-record-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/index-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.index-faces-response/face-records :portkey.aws.rekognition/orientation-correction :portkey.aws.rekognition.index-faces-response/face-model-version :portkey.aws.rekognition/unindexed-faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.pose/roll (clojure.spec.alpha/and :portkey.aws.rekognition/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.pose/yaw (clojure.spec.alpha/and :portkey.aws.rekognition/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.pose/pitch (clojure.spec.alpha/and :portkey.aws.rekognition/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition/pose (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.pose/roll :portkey.aws.rekognition.pose/yaw :portkey.aws.rekognition.pose/pitch]))

(clojure.spec.alpha/def :portkey.aws.rekognition.person-match/person (clojure.spec.alpha/and :portkey.aws.rekognition/person-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.person-match/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/person-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.person-match/person :portkey.aws.rekognition.person-match/face-matches]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-recognition-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-recognition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-celebrity-recognition-request/next-token :portkey.aws.rekognition.get-celebrity-recognition-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.create-collection-response/status-code (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-collection-response/collection-arn (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-collection-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/create-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.create-collection-response/status-code :portkey.aws.rekognition.create-collection-response/collection-arn :portkey.aws.rekognition.create-collection-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-recognition-sort-by #{"TIMESTAMP" "ID" :id :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/attributes (clojure.spec.alpha/coll-of :portkey.aws.rekognition/attribute))

(clojure.spec.alpha/def :portkey.aws.rekognition.face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/face-id :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition/image-id :portkey.aws.rekognition/external-image-id :portkey.aws.rekognition.face/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.kinesis-video-stream/arn (clojure.spec.alpha/and :portkey.aws.rekognition/kinesis-video-arn))
(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-video-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.kinesis-video-stream/arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition.mouth-open/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.mouth-open/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/mouth-open (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.mouth-open/value :portkey.aws.rekognition.mouth-open/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-request/max-results (clojure.spec.alpha/and :portkey.aws.rekognition/page-size))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-collections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-collections-request/next-token :portkey.aws.rekognition.list-collections-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.moderation-label/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.moderation-label/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.moderation-label/parent-name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/moderation-label (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.moderation-label/confidence :portkey.aws.rekognition.moderation-label/name :portkey.aws.rekognition.moderation-label/parent-name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.person-detection/person (clojure.spec.alpha/and :portkey.aws.rekognition/person-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/person-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.person-detection/person]))

(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-request/detection-attributes (clojure.spec.alpha/and :portkey.aws.rekognition/attributes))
(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-request/max-faces (clojure.spec.alpha/and :portkey.aws.rekognition/max-faces-to-index))
(clojure.spec.alpha/def :portkey.aws.rekognition/index-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition/external-image-id :portkey.aws.rekognition.index-faces-request/detection-attributes :portkey.aws.rekognition.index-faces-request/max-faces :portkey.aws.rekognition/quality-filter]))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.delete-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/detect-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition/attributes]))

(clojure.spec.alpha/def :portkey.aws.rekognition/moderation-labels (clojure.spec.alpha/coll-of :portkey.aws.rekognition/moderation-label))

(clojure.spec.alpha/def :portkey.aws.rekognition/max-faces (clojure.spec.alpha/int-in 1 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/create-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/stream-processor-arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/person-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-celebrity-recognition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-stream-processors-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-stream-processors-response/stream-processors (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-stream-processors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-stream-processors-response/next-token :portkey.aws.rekognition.list-stream-processors-response/stream-processors]))

(clojure.spec.alpha/def :portkey.aws.rekognition.stop-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/stop-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.stop-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/kinesis-video-stream]))

(clojure.spec.alpha/def :portkey.aws.rekognition/content-moderation-sort-by #{"TIMESTAMP" "NAME" :name :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/labels (clojure.spec.alpha/coll-of :portkey.aws.rekognition/label))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-response/celebrities (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-recognitions))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-recognition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-celebrity-recognition-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-celebrity-recognition-response/next-token :portkey.aws.rekognition.get-celebrity-recognition-response/celebrities]))

(clojure.spec.alpha/def :portkey.aws.rekognition.stream-processor-settings/face-search (clojure.spec.alpha/and :portkey.aws.rekognition/face-search-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.stream-processor-settings/face-search]))

(clojure.spec.alpha/def :portkey.aws.rekognition/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-matches (clojure.spec.alpha/coll-of :portkey.aws.rekognition/person-match))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.point/x (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.point/y (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.point/x :portkey.aws.rekognition.point/y]))

(clojure.spec.alpha/def :portkey.aws.rekognition/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition/label-detection-sort-by #{"TIMESTAMP" "NAME" :name :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/landmark-type #{:eye-left :mouth-down :right-eye-left :right-eye-brow-up "rightEyeBrowUp" :right-eye-brow-right "leftEyeRight" "rightEyeUp" "leftEyeLeft" "eyeRight" "leftEyeBrowUp" "rightEyeRight" :left-pupil "rightEyeLeft" "leftEyeUp" :left-eye-brow-right "mouthDown" :mouth-right :right-eye-down :right-pupil :mouth-up :left-eye-brow-left :nose-left :left-eye-brow-up "rightPupil" "leftPupil" "noseRight" "rightEyeBrowLeft" :right-eye-brow-left "nose" "eyeLeft" "mouthUp" :mouth-left "mouthLeft" "rightEyeBrowRight" "mouthRight" :right-eye-up :left-eye-left "noseLeft" "leftEyeBrowLeft" :nose :left-eye-up :left-eye-down :left-eye-right "leftEyeBrowRight" :eye-right :right-eye-right :nose-right "leftEyeDown" "rightEyeDown"})

(clojure.spec.alpha/def :portkey.aws.rekognition/describe-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-request/source-image (clojure.spec.alpha/and :portkey.aws.rekognition/image))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-request/target-image (clojure.spec.alpha/and :portkey.aws.rekognition/image))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-request/similarity-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.compare-faces-request/source-image :portkey.aws.rekognition.compare-faces-request/target-image] :opt-un [:portkey.aws.rekognition.compare-faces-request/similarity-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^arn:aws:sns:.*:\w{12}:.+$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition/face-id] :opt-un [:portkey.aws.rekognition/max-faces :portkey.aws.rekognition.search-faces-request/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-match-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/compare-faces-match))

(clojure.spec.alpha/def :portkey.aws.rekognition/gender-type #{:female :male "Male" "Female"})

(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/person-tracking-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-person-tracking-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-person-tracking-request/next-token :portkey.aws.rekognition.get-person-tracking-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-info-response/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-info-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/urls :portkey.aws.rekognition.get-celebrity-info-response/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/status-message (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/status (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/input (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-input))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/settings (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/output (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-output))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/describe-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.describe-stream-processor-response/last-update-timestamp :portkey.aws.rekognition.describe-stream-processor-response/status-message :portkey.aws.rekognition/role-arn :portkey.aws.rekognition.describe-stream-processor-response/status :portkey.aws.rekognition.describe-stream-processor-response/creation-timestamp :portkey.aws.rekognition.describe-stream-processor-response/input :portkey.aws.rekognition.describe-stream-processor-response/settings :portkey.aws.rekognition/stream-processor-arn :portkey.aws.rekognition.describe-stream-processor-response/output :portkey.aws.rekognition.describe-stream-processor-response/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.label/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.label/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/label (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.label/name :portkey.aws.rekognition.label/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/u-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-data-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):kinesis:([a-z\d-]+):\d{12}:.+$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/detect-moderation-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/moderation-labels]))

(clojure.spec.alpha/def :portkey.aws.rekognition.face-detail/eyes-open (clojure.spec.alpha/and :portkey.aws.rekognition/eye-open))
(clojure.spec.alpha/def :portkey.aws.rekognition.face-detail/quality (clojure.spec.alpha/and :portkey.aws.rekognition/image-quality))
(clojure.spec.alpha/def :portkey.aws.rekognition.face-detail/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/sunglasses :portkey.aws.rekognition/landmarks :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition/smile :portkey.aws.rekognition/age-range :portkey.aws.rekognition/emotions :portkey.aws.rekognition/mustache :portkey.aws.rekognition.face-detail/eyes-open :portkey.aws.rekognition/gender :portkey.aws.rekognition/pose :portkey.aws.rekognition.face-detail/quality :portkey.aws.rekognition/mouth-open :portkey.aws.rekognition/eyeglasses :portkey.aws.rekognition.face-detail/confidence :portkey.aws.rekognition/beard]))

(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9A-Za-z\.\-_]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-faces-request/face-ids (clojure.spec.alpha/and :portkey.aws.rekognition/face-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition.delete-faces-request/face-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-labels-request/max-labels (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.detect-labels-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition.detect-labels-request/max-labels :portkey.aws.rekognition.detect-labels-request/min-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-collection-response/status-code (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.delete-collection-response/status-code]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-response/collection-ids (clojure.spec.alpha/and :portkey.aws.rekognition/collection-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-response/face-model-versions (clojure.spec.alpha/and :portkey.aws.rekognition/face-model-version-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-collections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-collections-response/collection-ids :portkey.aws.rekognition.list-collections-response/next-token :portkey.aws.rekognition.list-collections-response/face-model-versions]))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-faces-response/face-details (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.detect-faces-response/face-details :portkey.aws.rekognition/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-video-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/label-detection-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-label-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-label-detection-request/next-token :portkey.aws.rekognition.get-label-detection-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition/notification-channel (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/sns-topic-arn :portkey.aws.rekognition/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/degree clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition/rekognition-unique-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9A-Za-z]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-status #{:starting :running :stopping :stopped "STOPPED" "STARTING" "FAILED" "STOPPING" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.rekognition/timestamp clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition/video-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/label-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/label-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/content-moderation-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-content-moderation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-content-moderation-request/next-token :portkey.aws.rekognition.get-content-moderation-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/face-attributes :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition/text-types #{"WORD" "LINE" :line :word})

(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/moderation-labels (clojure.spec.alpha/and :portkey.aws.rekognition/content-moderation-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-content-moderation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-content-moderation-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-content-moderation-response/moderation-labels :portkey.aws.rekognition.get-content-moderation-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.rekognition/reasons (clojure.spec.alpha/coll-of :portkey.aws.rekognition/reason))

(clojure.spec.alpha/def :portkey.aws.rekognition/content-moderation-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/content-moderation-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/face-search-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-face-search-request/next-token :portkey.aws.rekognition.get-face-search-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.image-quality/brightness (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.image-quality/sharpness (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/image-quality (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.image-quality/brightness :portkey.aws.rekognition.image-quality/sharpness]))

(clojure.spec.alpha/def :portkey.aws.rekognition/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition/reason #{"EXTREME_POSE" "LOW_BRIGHTNESS" :low-confidence :exceeds-max-faces :low-sharpness "LOW_CONFIDENCE" :extreme-pose "SMALL_BOUNDING_BOX" "EXCEEDS_MAX_FACES" "LOW_SHARPNESS" :small-bounding-box :low-brightness})

(clojure.spec.alpha/def :portkey.aws.rekognition/start-celebrity-recognition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-detail-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-detail))

(clojure.spec.alpha/def :portkey.aws.rekognition/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/orientation-correction #{:rotate-90 "ROTATE_0" "ROTATE_180" "ROTATE_90" :rotate-180 :rotate-0 "ROTATE_270" :rotate-270})

(clojure.spec.alpha/def :portkey.aws.rekognition/compared-face-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/compared-face))

(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/codec (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/duration-millis (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/format (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/frame-rate (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/frame-height (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/frame-width (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition/video-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.video-metadata/codec :portkey.aws.rekognition.video-metadata/duration-millis :portkey.aws.rekognition.video-metadata/format :portkey.aws.rekognition.video-metadata/frame-rate :portkey.aws.rekognition.video-metadata/frame-height :portkey.aws.rekognition.video-metadata/frame-width]))

(clojure.spec.alpha/def :portkey.aws.rekognition/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/emotion-name #{"UNKNOWN" :disgusted "ANGRY" :sad :calm :unknown :happy :confused "HAPPY" "CONFUSED" "DISGUSTED" "CALM" "SAD" "SURPRISED" :surprised :angry})

(clojure.spec.alpha/def :portkey.aws.rekognition.image/bytes (clojure.spec.alpha/and :portkey.aws.rekognition/image-blob))
(clojure.spec.alpha/def :portkey.aws.rekognition/image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.image/bytes :portkey.aws.rekognition/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.rekognition/polygon (clojure.spec.alpha/coll-of :portkey.aws.rekognition/point))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/max-faces-to-index (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-label-detection-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-label-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition.start-label-detection-request/min-confidence :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.start-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-match/similarity (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-match/face (clojure.spec.alpha/and :portkey.aws.rekognition/compared-face))
(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.compare-faces-match/similarity :portkey.aws.rekognition.compare-faces-match/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.eyeglasses/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.eyeglasses/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/eyeglasses (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.eyeglasses/value :portkey.aws.rekognition.eyeglasses/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/image-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-recognition/celebrity (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-recognition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.celebrity-recognition/celebrity]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-person-tracking-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/quality-filter #{"AUTO" "NONE" :auto :none})

(clojure.spec.alpha/def :portkey.aws.rekognition/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition/external-image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.compared-face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.compared-face/quality (clojure.spec.alpha/and :portkey.aws.rekognition/image-quality))
(clojure.spec.alpha/def :portkey.aws.rekognition/compared-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.compared-face/confidence :portkey.aws.rekognition/landmarks :portkey.aws.rekognition/pose :portkey.aws.rekognition.compared-face/quality]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-record-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-record))

(clojure.spec.alpha/def :portkey.aws.rekognition/video-job-status #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/celebrity))

(clojure.spec.alpha/def :portkey.aws.rekognition.s-3-object/bucket (clojure.spec.alpha/and :portkey.aws.rekognition/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.rekognition.s-3-object/name (clojure.spec.alpha/and :portkey.aws.rekognition/s-3-object-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.s-3-object/version (clojure.spec.alpha/and :portkey.aws.rekognition/s-3-object-version))
(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.s-3-object/bucket :portkey.aws.rekognition.s-3-object/name :portkey.aws.rekognition.s-3-object/version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/detect-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/labels :portkey.aws.rekognition/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/face-count (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/collection-arn (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition/describe-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.describe-collection-response/face-count :portkey.aws.rekognition.describe-collection-response/face-model-version :portkey.aws.rekognition.describe-collection-response/collection-arn :portkey.aws.rekognition.describe-collection-response/creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.rekognition/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.rekognition/collection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-request/max-results (clojure.spec.alpha/and :portkey.aws.rekognition/page-size))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un [:portkey.aws.rekognition.list-faces-request/next-token :portkey.aws.rekognition.list-faces-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-pagination-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.beard/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.beard/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/beard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.beard/value :portkey.aws.rekognition.beard/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-face-detection-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.rekognition/content-moderation-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition/moderation-label]))

(clojure.spec.alpha/def :portkey.aws.rekognition/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__27882__auto__))))

(clojure.core/defn get-label-detection ([get-label-detection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-label-detection-request get-label-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-label-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-label-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLabelDetection", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-label-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-label-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-label-detection-response))

(clojure.core/defn stop-stream-processor ([stop-stream-processor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-stream-processor-request stop-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/stop-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/stop-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopStreamProcessor", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef stop-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/stop-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/stop-stream-processor-response))

(clojure.core/defn start-content-moderation ([start-content-moderation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-content-moderation-request start-content-moderation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-content-moderation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-content-moderation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartContentModeration", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-content-moderation :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-content-moderation-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-content-moderation-response))

(clojure.core/defn get-celebrity-info ([get-celebrity-info-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-celebrity-info-request get-celebrity-info-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-celebrity-info-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-celebrity-info-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCelebrityInfo", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-celebrity-info :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-celebrity-info-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-celebrity-info-response))

(clojure.core/defn compare-faces ([compare-faces-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-compare-faces-request compare-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/compare-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/compare-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CompareFaces", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef compare-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/compare-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/compare-faces-response))

(clojure.core/defn list-collections ([] (list-collections {})) ([list-collections-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-collections-request list-collections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/list-collections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/list-collections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCollections", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-collections :args (clojure.spec.alpha/? :portkey.aws.rekognition/list-collections-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/list-collections-response))

(clojure.core/defn recognize-celebrities ([recognize-celebrities-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-recognize-celebrities-request recognize-celebrities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/recognize-celebrities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/recognize-celebrities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RecognizeCelebrities", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef recognize-celebrities :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/recognize-celebrities-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/recognize-celebrities-response))

(clojure.core/defn create-stream-processor ([create-stream-processor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-stream-processor-request create-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/create-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/create-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStreamProcessor", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/create-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/create-stream-processor-response))

(clojure.core/defn start-celebrity-recognition ([start-celebrity-recognition-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-celebrity-recognition-request start-celebrity-recognition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-celebrity-recognition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-celebrity-recognition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartCelebrityRecognition", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-celebrity-recognition :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-celebrity-recognition-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-celebrity-recognition-response))

(clojure.core/defn start-face-search ([start-face-search-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-face-search-request start-face-search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-face-search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-face-search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartFaceSearch", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-face-search :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-face-search-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-face-search-response))

(clojure.core/defn get-person-tracking ([get-person-tracking-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-person-tracking-request get-person-tracking-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-person-tracking-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-person-tracking-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPersonTracking", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-person-tracking :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-person-tracking-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-person-tracking-response))

(clojure.core/defn detect-labels ([detect-labels-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-labels-request detect-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-labels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-labels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectLabels", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-labels :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-labels-response))

(clojure.core/defn detect-moderation-labels ([detect-moderation-labels-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-moderation-labels-request detect-moderation-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-moderation-labels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-moderation-labels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectModerationLabels", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-moderation-labels :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-moderation-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-moderation-labels-response))

(clojure.core/defn get-celebrity-recognition ([get-celebrity-recognition-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-celebrity-recognition-request get-celebrity-recognition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-celebrity-recognition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-celebrity-recognition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCelebrityRecognition", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-celebrity-recognition :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-celebrity-recognition-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-celebrity-recognition-response))

(clojure.core/defn start-face-detection ([start-face-detection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-face-detection-request start-face-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-face-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-face-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartFaceDetection", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-face-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-face-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-face-detection-response))

(clojure.core/defn describe-collection ([describe-collection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-collection-request describe-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/describe-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/describe-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCollection", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/describe-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/describe-collection-response))

(clojure.core/defn detect-text ([detect-text-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-text-request detect-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectText", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-text :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-text-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-text-response))

(clojure.core/defn start-person-tracking ([start-person-tracking-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-person-tracking-request start-person-tracking-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-person-tracking-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-person-tracking-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartPersonTracking", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-person-tracking :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-person-tracking-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-person-tracking-response))

(clojure.core/defn delete-stream-processor ([delete-stream-processor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-stream-processor-request delete-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/delete-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/delete-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStreamProcessor", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/delete-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/delete-stream-processor-response))

(clojure.core/defn create-collection ([create-collection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-collection-request create-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/create-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/create-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCollection", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.rekognition/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/create-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/create-collection-response))

(clojure.core/defn delete-faces ([delete-faces-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-faces-request delete-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/delete-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/delete-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteFaces", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/delete-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/delete-faces-response))

(clojure.core/defn list-faces ([list-faces-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-faces-request list-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/list-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/list-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFaces", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/list-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/list-faces-response))

(clojure.core/defn get-content-moderation ([get-content-moderation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-content-moderation-request get-content-moderation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-content-moderation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-content-moderation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContentModeration", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-content-moderation :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-content-moderation-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-content-moderation-response))

(clojure.core/defn delete-collection ([delete-collection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-collection-request delete-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/delete-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/delete-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCollection", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/delete-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/delete-collection-response))

(clojure.core/defn search-faces ([search-faces-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-search-faces-request search-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/search-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/search-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchFaces", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef search-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/search-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/search-faces-response))

(clojure.core/defn start-stream-processor ([start-stream-processor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-stream-processor-request start-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartStreamProcessor", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-stream-processor-response))

(clojure.core/defn list-stream-processors ([] (list-stream-processors {})) ([list-stream-processors-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stream-processors-request list-stream-processors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/list-stream-processors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/list-stream-processors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamProcessors", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-stream-processors :args (clojure.spec.alpha/? :portkey.aws.rekognition/list-stream-processors-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/list-stream-processors-response))

(clojure.core/defn detect-faces ([detect-faces-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-faces-request detect-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectFaces", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-faces-response))

(clojure.core/defn get-face-search ([get-face-search-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-face-search-request get-face-search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-face-search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-face-search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFaceSearch", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-face-search :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-face-search-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-face-search-response))

(clojure.core/defn describe-stream-processor ([describe-stream-processor-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stream-processor-request describe-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/describe-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/describe-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStreamProcessor", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/describe-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/describe-stream-processor-response))

(clojure.core/defn index-faces ([index-faces-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-index-faces-request index-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/index-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/index-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "IndexFaces", :http.request.spec/error-spec {"InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception, "InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef index-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/index-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/index-faces-response))

(clojure.core/defn search-faces-by-image ([search-faces-by-image-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-search-faces-by-image-request search-faces-by-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/search-faces-by-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/search-faces-by-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchFacesByImage", :http.request.spec/error-spec {"InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception, "InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef search-faces-by-image :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/search-faces-by-image-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/search-faces-by-image-response))

(clojure.core/defn start-label-detection ([start-label-detection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-label-detection-request start-label-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-label-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-label-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartLabelDetection", :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-label-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-label-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-label-detection-response))

(clojure.core/defn get-face-detection ([get-face-detection-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-face-detection-request get-face-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-face-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-face-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFaceDetection", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-face-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-face-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-face-detection-response))