(ns portkey.aws.appsync (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "appsync", :region "ap-northeast-1"},
    :ssl-common-name "appsync.ap-northeast-1.amazonaws.com",
    :endpoint "https://appsync.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "appsync", :region "eu-west-1"},
    :ssl-common-name "appsync.eu-west-1.amazonaws.com",
    :endpoint "https://appsync.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "appsync", :region "us-east-2"},
    :ssl-common-name "appsync.us-east-2.amazonaws.com",
    :endpoint "https://appsync.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "appsync", :region "ap-southeast-2"},
    :ssl-common-name "appsync.ap-southeast-2.amazonaws.com",
    :endpoint "https://appsync.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "appsync", :region "ap-southeast-1"},
    :ssl-common-name "appsync.ap-southeast-1.amazonaws.com",
    :endpoint "https://appsync.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "appsync", :region "ap-northeast-2"},
    :ssl-common-name "appsync.ap-northeast-2.amazonaws.com",
    :endpoint "https://appsync.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "appsync", :region "eu-central-1"},
    :ssl-common-name "appsync.eu-central-1.amazonaws.com",
    :endpoint "https://appsync.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "appsync", :region "us-west-2"},
    :ssl-common-name "appsync.us-west-2.amazonaws.com",
    :endpoint "https://appsync.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "appsync", :region "us-east-1"},
    :ssl-common-name "appsync.us-east-1.amazonaws.com",
    :endpoint "https://appsync.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "appsync", :region "ap-south-1"},
    :ssl-common-name "appsync.ap-south-1.amazonaws.com",
    :endpoint "https://appsync.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-relational-database-data-source-config)

(clojure.core/declare ser-resolver-kind)

(clojure.core/declare ser-field-log-level)

(clojure.core/declare ser-functions-ids)

(clojure.core/declare ser-http-data-source-config)

(clojure.core/declare ser-data-source-type)

(clojure.core/declare ser-log-config)

(clojure.core/declare ser-rds-http-endpoint-config)

(clojure.core/declare ser-lambda-data-source-config)

(clojure.core/declare ser-default-action)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-relational-database-source-type)

(clojure.core/declare ser-user-pool-config)

(clojure.core/declare ser-aws-iam-config)

(clojure.core/declare ser-type-definition-format)

(clojure.core/declare ser-pipeline-config)

(clojure.core/declare ser-output-type)

(clojure.core/declare ser-authorization-config)

(clojure.core/declare ser-authorization-type)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-authentication-type)

(clojure.core/declare ser-mapping-template)

(clojure.core/declare ser-long)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-open-id-connect-config)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-dynamodb-data-source-config)

(clojure.core/declare ser-elasticsearch-data-source-config)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-relational-database-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RelationalDatabaseDataSourceConfig", :type "structure"} (clojure.core/contains? input :relational-database-source-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relational-database-source-type (input :relational-database-source-type)) #:http.request.field{:name "relationalDatabaseSourceType", :shape "RelationalDatabaseSourceType"})) (clojure.core/contains? input :rds-http-endpoint-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rds-http-endpoint-config (input :rds-http-endpoint-config)) #:http.request.field{:name "rdsHttpEndpointConfig", :shape "RdsHttpEndpointConfig"}))))

(clojure.core/defn- ser-resolver-kind [input] #:http.request.field{:value (clojure.core/get {"UNIT" "UNIT", :unit "UNIT", "PIPELINE" "PIPELINE", :pipeline "PIPELINE"} input), :shape "ResolverKind"})

(clojure.core/defn- ser-field-log-level [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "ERROR" "ERROR", :error "ERROR", "ALL" "ALL", :all "ALL"} input), :shape "FieldLogLevel"})

(clojure.core/defn- ser-functions-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "FunctionsIds", :type "list"})

(clojure.core/defn- ser-http-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpDataSourceConfig", :type "structure"} (clojure.core/contains? input :endpoint) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :endpoint)) #:http.request.field{:name "endpoint", :shape "String"})) (clojure.core/contains? input :authorization-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authorization-config (input :authorization-config)) #:http.request.field{:name "authorizationConfig", :shape "AuthorizationConfig"}))))

(clojure.core/defn- ser-data-source-type [input] #:http.request.field{:value (clojure.core/get {:amazon-dynamodb "AMAZON_DYNAMODB", :aws-lambda "AWS_LAMBDA", :relational-database "RELATIONAL_DATABASE", "AWS_LAMBDA" "AWS_LAMBDA", "RELATIONAL_DATABASE" "RELATIONAL_DATABASE", "NONE" "NONE", :amazon-elasticsearch "AMAZON_ELASTICSEARCH", "AMAZON_DYNAMODB" "AMAZON_DYNAMODB", "AMAZON_ELASTICSEARCH" "AMAZON_ELASTICSEARCH", :http "HTTP", "HTTP" "HTTP", :none "NONE"} input), :shape "DataSourceType"})

(clojure.core/defn- ser-log-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-log-level (:field-log-level input)) #:http.request.field{:name "fieldLogLevel", :shape "FieldLogLevel"}) (clojure.core/into (ser-string (:cloud-watch-logs-role-arn input)) #:http.request.field{:name "cloudWatchLogsRoleArn", :shape "String"})], :shape "LogConfig", :type "structure"}))

(clojure.core/defn- ser-rds-http-endpoint-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RdsHttpEndpointConfig", :type "structure"} (clojure.core/contains? input :aws-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :aws-region)) #:http.request.field{:name "awsRegion", :shape "String"})) (clojure.core/contains? input :db-cluster-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :db-cluster-identifier)) #:http.request.field{:name "dbClusterIdentifier", :shape "String"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :database-name)) #:http.request.field{:name "databaseName", :shape "String"})) (clojure.core/contains? input :schema) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :schema)) #:http.request.field{:name "schema", :shape "String"})) (clojure.core/contains? input :aws-secret-store-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :aws-secret-store-arn)) #:http.request.field{:name "awsSecretStoreArn", :shape "String"}))))

(clojure.core/defn- ser-lambda-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:lambda-function-arn input)) #:http.request.field{:name "lambdaFunctionArn", :shape "String"})], :shape "LambdaDataSourceConfig", :type "structure"}))

(clojure.core/defn- ser-default-action [input] #:http.request.field{:value (clojure.core/get {"ALLOW" "ALLOW", :allow "ALLOW", "DENY" "DENY", :deny "DENY"} input), :shape "DefaultAction"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-relational-database-source-type [input] #:http.request.field{:value (clojure.core/get {"RDS_HTTP_ENDPOINT" "RDS_HTTP_ENDPOINT", :rds-http-endpoint "RDS_HTTP_ENDPOINT"} input), :shape "RelationalDatabaseSourceType"})

(clojure.core/defn- ser-user-pool-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:user-pool-id input)) #:http.request.field{:name "userPoolId", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"}) (clojure.core/into (ser-default-action (:default-action input)) #:http.request.field{:name "defaultAction", :shape "DefaultAction"})], :shape "UserPoolConfig", :type "structure"} (clojure.core/contains? input :app-id-client-regex) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :app-id-client-regex)) #:http.request.field{:name "appIdClientRegex", :shape "String"}))))

(clojure.core/defn- ser-aws-iam-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsIamConfig", :type "structure"} (clojure.core/contains? input :signing-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signing-region)) #:http.request.field{:name "signingRegion", :shape "String"})) (clojure.core/contains? input :signing-service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signing-service-name)) #:http.request.field{:name "signingServiceName", :shape "String"}))))

(clojure.core/defn- ser-type-definition-format [input] #:http.request.field{:value (clojure.core/get {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"} input), :shape "TypeDefinitionFormat"})

(clojure.core/defn- ser-pipeline-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PipelineConfig", :type "structure"} (clojure.core/contains? input :functions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-functions-ids (input :functions)) #:http.request.field{:name "functions", :shape "FunctionsIds"}))))

(clojure.core/defn- ser-output-type [input] #:http.request.field{:value (clojure.core/get {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"} input), :shape "OutputType"})

(clojure.core/defn- ser-authorization-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-authorization-type (:authorization-type input)) #:http.request.field{:name "authorizationType", :shape "AuthorizationType"})], :shape "AuthorizationConfig", :type "structure"} (clojure.core/contains? input :aws-iam-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-iam-config (input :aws-iam-config)) #:http.request.field{:name "awsIamConfig", :shape "AwsIamConfig"}))))

(clojure.core/defn- ser-authorization-type [input] #:http.request.field{:value (clojure.core/get {"AWS_IAM" "AWS_IAM", :aws-iam "AWS_IAM"} input), :shape "AuthorizationType"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-authentication-type [input] #:http.request.field{:value (clojure.core/get {"API_KEY" "API_KEY", :api-key "API_KEY", "AWS_IAM" "AWS_IAM", :aws-iam "AWS_IAM", "AMAZON_COGNITO_USER_POOLS" "AMAZON_COGNITO_USER_POOLS", :amazon-cognito-user-pools "AMAZON_COGNITO_USER_POOLS", "OPENID_CONNECT" "OPENID_CONNECT", :openid-connect "OPENID_CONNECT"} input), :shape "AuthenticationType"})

(clojure.core/defn- ser-mapping-template [input] #:http.request.field{:value input, :shape "MappingTemplate"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-open-id-connect-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:issuer input)) #:http.request.field{:name "issuer", :shape "String"})], :shape "OpenIDConnectConfig", :type "structure"} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-id)) #:http.request.field{:name "clientId", :shape "String"})) (clojure.core/contains? input :iat-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :iat-ttl)) #:http.request.field{:name "iatTTL", :shape "Long"})) (clojure.core/contains? input :auth-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :auth-ttl)) #:http.request.field{:name "authTTL", :shape "Long"}))))

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-dynamodb-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:table-name input)) #:http.request.field{:name "tableName", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"})], :shape "DynamodbDataSourceConfig", :type "structure"} (clojure.core/contains? input :use-caller-credentials) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-caller-credentials)) #:http.request.field{:name "useCallerCredentials", :shape "Boolean"}))))

(clojure.core/defn- ser-elasticsearch-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:endpoint input)) #:http.request.field{:name "endpoint", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"})], :shape "ElasticsearchDataSourceConfig", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"}) (clojure.core/into (ser-string (input :function-version)) #:http.request.field{:name "functionVersion", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"}))))

(clojure.core/defn- req-update-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :body [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat"})]} (clojure.core/contains? input :definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :definition)) #:http.request.field{:name "definition", :shape "String"}))))

(clojure.core/defn- req-update-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-data-source-type (input :type)) #:http.request.field{:name "type", :shape "DataSourceType"})]} (clojure.core/contains? input :elasticsearch-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-data-source-config (input :elasticsearch-config)) #:http.request.field{:name "elasticsearchConfig", :shape "ElasticsearchDataSourceConfig"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-data-source-config (input :lambda-config)) #:http.request.field{:name "lambdaConfig", :shape "LambdaDataSourceConfig"})) (clojure.core/contains? input :dynamodb-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamodb-data-source-config (input :dynamodb-config)) #:http.request.field{:name "dynamodbConfig", :shape "DynamodbDataSourceConfig"})) (clojure.core/contains? input :relational-database-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relational-database-data-source-config (input :relational-database-config)) #:http.request.field{:name "relationalDatabaseConfig", :shape "RelationalDatabaseDataSourceConfig"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "String"})) (clojure.core/contains? input :http-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-data-source-config (input :http-config)) #:http.request.field{:name "httpConfig", :shape "HttpDataSourceConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-get-schema-creation-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-update-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})]} (clojure.core/contains? input :log-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-config (input :log-config)) #:http.request.field{:name "logConfig", :shape "LogConfig"})) (clojure.core/contains? input :authentication-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "authenticationType", :shape "AuthenticationType"})) (clojure.core/contains? input :user-pool-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-config (input :user-pool-config)) #:http.request.field{:name "userPoolConfig", :shape "UserPoolConfig"})) (clojure.core/contains? input :open-id-connect-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-id-connect-config (input :open-id-connect-config)) #:http.request.field{:name "openIDConnectConfig", :shape "OpenIDConnectConfig"}))))

(clojure.core/defn- req-create-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-data-source-type (input :type)) #:http.request.field{:name "type", :shape "DataSourceType"})]} (clojure.core/contains? input :elasticsearch-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-data-source-config (input :elasticsearch-config)) #:http.request.field{:name "elasticsearchConfig", :shape "ElasticsearchDataSourceConfig"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-data-source-config (input :lambda-config)) #:http.request.field{:name "lambdaConfig", :shape "LambdaDataSourceConfig"})) (clojure.core/contains? input :dynamodb-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamodb-data-source-config (input :dynamodb-config)) #:http.request.field{:name "dynamodbConfig", :shape "DynamodbDataSourceConfig"})) (clojure.core/contains? input :relational-database-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relational-database-data-source-config (input :relational-database-config)) #:http.request.field{:name "relationalDatabaseConfig", :shape "RelationalDatabaseDataSourceConfig"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "String"})) (clojure.core/contains? input :http-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-data-source-config (input :http-config)) #:http.request.field{:name "httpConfig", :shape "HttpDataSourceConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-get-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})]}))

(clojure.core/defn- req-delete-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "id", :shape "String", :location "uri", :location-name "id"})]}))

(clojure.core/defn- req-create-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "authenticationType", :shape "AuthenticationType"})]} (clojure.core/contains? input :log-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-config (input :log-config)) #:http.request.field{:name "logConfig", :shape "LogConfig"})) (clojure.core/contains? input :user-pool-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-config (input :user-pool-config)) #:http.request.field{:name "userPoolConfig", :shape "UserPoolConfig"})) (clojure.core/contains? input :open-id-connect-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-id-connect-config (input :open-id-connect-config)) #:http.request.field{:name "openIDConnectConfig", :shape "OpenIDConnectConfig"}))))

(clojure.core/defn- req-list-resolvers-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :type-name)) #:http.request.field{:name "typeName", :shape "String", :location "uri", :location-name "typeName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-list-api-keys-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-delete-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :function-id)) #:http.request.field{:name "functionId", :shape "ResourceName", :location "uri", :location-name "functionId"})]}))

(clojure.core/defn- req-list-graphql-apis-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :function-id)) #:http.request.field{:name "functionId", :shape "ResourceName", :location "uri", :location-name "functionId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"}) (clojure.core/into (ser-string (input :function-version)) #:http.request.field{:name "functionVersion", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"}))))

(clojure.core/defn- req-delete-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})]}))

(clojure.core/defn- req-create-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-string (input :definition)) #:http.request.field{:name "definition", :shape "String"}) (clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat"})]}))

(clojure.core/defn- req-list-resolvers-by-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :function-id)) #:http.request.field{:name "functionId", :shape "String", :location "uri", :location-name "functionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-create-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :expires)) #:http.request.field{:name "expires", :shape "Long"}))))

(clojure.core/defn- req-delete-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})]}))

(clojure.core/defn- req-get-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :function-id)) #:http.request.field{:name "functionId", :shape "ResourceName", :location "uri", :location-name "functionId"})]}))

(clojure.core/defn- req-get-introspection-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :querystring [(clojure.core/into (ser-output-type (input :format)) #:http.request.field{:name "format", :shape "OutputType", :location "querystring", :location-name "format"})]}))

(clojure.core/defn- req-list-data-sources-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})], :body [(clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"})) (clojure.core/contains? input :kind) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resolver-kind (input :kind)) #:http.request.field{:name "kind", :shape "ResolverKind"})) (clojure.core/contains? input :pipeline-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-config (input :pipeline-config)) #:http.request.field{:name "pipelineConfig", :shape "PipelineConfig"}))))

(clojure.core/defn- req-create-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :body [(clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"})) (clojure.core/contains? input :kind) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resolver-kind (input :kind)) #:http.request.field{:name "kind", :shape "ResolverKind"})) (clojure.core/contains? input :pipeline-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-config (input :pipeline-config)) #:http.request.field{:name "pipelineConfig", :shape "PipelineConfig"}))))

(clojure.core/defn- req-list-functions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-start-schema-creation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-blob (input :definition)) #:http.request.field{:name "definition", :shape "Blob"})]}))

(clojure.core/defn- req-update-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "id", :shape "String", :location "uri", :location-name "id"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :expires)) #:http.request.field{:name "expires", :shape "Long"}))))

(clojure.core/defn- req-delete-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-list-types-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :querystring [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat", :location "querystring", :location-name "format"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :querystring [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat", :location "querystring", :location-name "format"})]}))

(clojure.core/declare deser-relational-database-data-source-config)

(clojure.core/declare deser-functions)

(clojure.core/declare deser-resolver-kind)

(clojure.core/declare deser-field-log-level)

(clojure.core/declare deser-functions-ids)

(clojure.core/declare deser-http-data-source-config)

(clojure.core/declare deser-schema-status)

(clojure.core/declare deser-type)

(clojure.core/declare deser-data-source-type)

(clojure.core/declare deser-log-config)

(clojure.core/declare deser-rds-http-endpoint-config)

(clojure.core/declare deser-lambda-data-source-config)

(clojure.core/declare deser-graphql-apis)

(clojure.core/declare deser-default-action)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-relational-database-source-type)

(clojure.core/declare deser-user-pool-config)

(clojure.core/declare deser-aws-iam-config)

(clojure.core/declare deser-type-definition-format)

(clojure.core/declare deser-type-list)

(clojure.core/declare deser-graphql-api)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-pipeline-config)

(clojure.core/declare deser-data-sources)

(clojure.core/declare deser-resolvers)

(clojure.core/declare deser-authorization-config)

(clojure.core/declare deser-authorization-type)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-string)

(clojure.core/declare deser-authentication-type)

(clojure.core/declare deser-mapping-template)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-map-of-string-to-string)

(clojure.core/declare deser-function-configuration)

(clojure.core/declare deser-api-keys)

(clojure.core/declare deser-long)

(clojure.core/declare deser-open-id-connect-config)

(clojure.core/declare deser-api-key)

(clojure.core/declare deser-blob)

(clojure.core/declare deser-resolver)

(clojure.core/declare deser-dynamodb-data-source-config)

(clojure.core/declare deser-elasticsearch-data-source-config)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-relational-database-data-source-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "relationalDatabaseSourceType") (clojure.core/assoc :relational-database-source-type (deser-relational-database-source-type (input "relationalDatabaseSourceType"))) (clojure.core/contains? input "rdsHttpEndpointConfig") (clojure.core/assoc :rds-http-endpoint-config (deser-rds-http-endpoint-config (input "rdsHttpEndpointConfig")))))

(clojure.core/defn- deser-functions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-function-configuration coll))) input))

(clojure.core/defn- deser-resolver-kind [input] (clojure.core/get {"UNIT" :unit, "PIPELINE" :pipeline} input))

(clojure.core/defn- deser-field-log-level [input] (clojure.core/get {"NONE" :none, "ERROR" :error, "ALL" :all} input))

(clojure.core/defn- deser-functions-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-http-data-source-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "endpoint") (clojure.core/assoc :endpoint (deser-string (input "endpoint"))) (clojure.core/contains? input "authorizationConfig") (clojure.core/assoc :authorization-config (deser-authorization-config (input "authorizationConfig")))))

(clojure.core/defn- deser-schema-status [input] (clojure.core/get {"PROCESSING" :processing, "ACTIVE" :active, "DELETING" :deleting} input))

(clojure.core/defn- deser-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "definition") (clojure.core/assoc :definition (deser-string (input "definition"))) (clojure.core/contains? input "format") (clojure.core/assoc :format (deser-type-definition-format (input "format")))))

(clojure.core/defn- deser-data-source-type [input] (clojure.core/get {"AWS_LAMBDA" :aws-lambda, "AMAZON_DYNAMODB" :amazon-dynamodb, "AMAZON_ELASTICSEARCH" :amazon-elasticsearch, "NONE" :none, "HTTP" :http, "RELATIONAL_DATABASE" :relational-database} input))

(clojure.core/defn- deser-log-config [input] (clojure.core/cond-> {:field-log-level (deser-field-log-level (input "fieldLogLevel")), :cloud-watch-logs-role-arn (deser-string (input "cloudWatchLogsRoleArn"))}))

(clojure.core/defn- deser-rds-http-endpoint-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "awsRegion") (clojure.core/assoc :aws-region (deser-string (input "awsRegion"))) (clojure.core/contains? input "dbClusterIdentifier") (clojure.core/assoc :db-cluster-identifier (deser-string (input "dbClusterIdentifier"))) (clojure.core/contains? input "databaseName") (clojure.core/assoc :database-name (deser-string (input "databaseName"))) (clojure.core/contains? input "schema") (clojure.core/assoc :schema (deser-string (input "schema"))) (clojure.core/contains? input "awsSecretStoreArn") (clojure.core/assoc :aws-secret-store-arn (deser-string (input "awsSecretStoreArn")))))

(clojure.core/defn- deser-lambda-data-source-config [input] (clojure.core/cond-> {:lambda-function-arn (deser-string (input "lambdaFunctionArn"))}))

(clojure.core/defn- deser-graphql-apis [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-graphql-api coll))) input))

(clojure.core/defn- deser-default-action [input] (clojure.core/get {"ALLOW" :allow, "DENY" :deny} input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-relational-database-source-type [input] (clojure.core/get {"RDS_HTTP_ENDPOINT" :rds-http-endpoint} input))

(clojure.core/defn- deser-user-pool-config [input] (clojure.core/cond-> {:user-pool-id (deser-string (input "userPoolId")), :aws-region (deser-string (input "awsRegion")), :default-action (deser-default-action (input "defaultAction"))} (clojure.core/contains? input "appIdClientRegex") (clojure.core/assoc :app-id-client-regex (deser-string (input "appIdClientRegex")))))

(clojure.core/defn- deser-aws-iam-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "signingRegion") (clojure.core/assoc :signing-region (deser-string (input "signingRegion"))) (clojure.core/contains? input "signingServiceName") (clojure.core/assoc :signing-service-name (deser-string (input "signingServiceName")))))

(clojure.core/defn- deser-type-definition-format [input] (clojure.core/get {"SDL" :sdl, "JSON" :json} input))

(clojure.core/defn- deser-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-type coll))) input))

(clojure.core/defn- deser-graphql-api [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "apiId") (clojure.core/assoc :api-id (deser-string (input "apiId"))) (clojure.core/contains? input "authenticationType") (clojure.core/assoc :authentication-type (deser-authentication-type (input "authenticationType"))) (clojure.core/contains? input "logConfig") (clojure.core/assoc :log-config (deser-log-config (input "logConfig"))) (clojure.core/contains? input "userPoolConfig") (clojure.core/assoc :user-pool-config (deser-user-pool-config (input "userPoolConfig"))) (clojure.core/contains? input "openIDConnectConfig") (clojure.core/assoc :open-id-connect-config (deser-open-id-connect-config (input "openIDConnectConfig"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "uris") (clojure.core/assoc :uris (deser-map-of-string-to-string (input "uris")))))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-pipeline-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "functions") (clojure.core/assoc :functions (deser-functions-ids (input "functions")))))

(clojure.core/defn- deser-data-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-source coll))) input))

(clojure.core/defn- deser-resolvers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resolver coll))) input))

(clojure.core/defn- deser-authorization-config [input] (clojure.core/cond-> {:authorization-type (deser-authorization-type (input "authorizationType"))} (clojure.core/contains? input "awsIamConfig") (clojure.core/assoc :aws-iam-config (deser-aws-iam-config (input "awsIamConfig")))))

(clojure.core/defn- deser-authorization-type [input] (clojure.core/get {"AWS_IAM" :aws-iam} input))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-authentication-type [input] (clojure.core/get {"API_KEY" :api-key, "AWS_IAM" :aws-iam, "AMAZON_COGNITO_USER_POOLS" :amazon-cognito-user-pools, "OPENID_CONNECT" :openid-connect} input))

(clojure.core/defn- deser-mapping-template [input] input)

(clojure.core/defn- deser-data-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "elasticsearchConfig") (clojure.core/assoc :elasticsearch-config (deser-elasticsearch-data-source-config (input "elasticsearchConfig"))) (clojure.core/contains? input "lambdaConfig") (clojure.core/assoc :lambda-config (deser-lambda-data-source-config (input "lambdaConfig"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "dynamodbConfig") (clojure.core/assoc :dynamodb-config (deser-dynamodb-data-source-config (input "dynamodbConfig"))) (clojure.core/contains? input "relationalDatabaseConfig") (clojure.core/assoc :relational-database-config (deser-relational-database-data-source-config (input "relationalDatabaseConfig"))) (clojure.core/contains? input "serviceRoleArn") (clojure.core/assoc :service-role-arn (deser-string (input "serviceRoleArn"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-data-source-type (input "type"))) (clojure.core/contains? input "dataSourceArn") (clojure.core/assoc :data-source-arn (deser-string (input "dataSourceArn"))) (clojure.core/contains? input "httpConfig") (clojure.core/assoc :http-config (deser-http-data-source-config (input "httpConfig"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description")))))

(clojure.core/defn- deser-map-of-string-to-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-function-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "functionId") (clojure.core/assoc :function-id (deser-string (input "functionId"))) (clojure.core/contains? input "functionArn") (clojure.core/assoc :function-arn (deser-string (input "functionArn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "dataSourceName") (clojure.core/assoc :data-source-name (deser-resource-name (input "dataSourceName"))) (clojure.core/contains? input "requestMappingTemplate") (clojure.core/assoc :request-mapping-template (deser-mapping-template (input "requestMappingTemplate"))) (clojure.core/contains? input "responseMappingTemplate") (clojure.core/assoc :response-mapping-template (deser-mapping-template (input "responseMappingTemplate"))) (clojure.core/contains? input "functionVersion") (clojure.core/assoc :function-version (deser-string (input "functionVersion")))))

(clojure.core/defn- deser-api-keys [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-api-key coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-open-id-connect-config [input] (clojure.core/cond-> {:issuer (deser-string (input "issuer"))} (clojure.core/contains? input "clientId") (clojure.core/assoc :client-id (deser-string (input "clientId"))) (clojure.core/contains? input "iatTTL") (clojure.core/assoc :iat-ttl (deser-long (input "iatTTL"))) (clojure.core/contains? input "authTTL") (clojure.core/assoc :auth-ttl (deser-long (input "authTTL")))))

(clojure.core/defn- deser-api-key [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "expires") (clojure.core/assoc :expires (deser-long (input "expires")))))

(clojure.core/defn- deser-blob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-resolver [input] (clojure.core/cond-> {} (clojure.core/contains? input "typeName") (clojure.core/assoc :type-name (deser-resource-name (input "typeName"))) (clojure.core/contains? input "fieldName") (clojure.core/assoc :field-name (deser-resource-name (input "fieldName"))) (clojure.core/contains? input "dataSourceName") (clojure.core/assoc :data-source-name (deser-resource-name (input "dataSourceName"))) (clojure.core/contains? input "resolverArn") (clojure.core/assoc :resolver-arn (deser-string (input "resolverArn"))) (clojure.core/contains? input "requestMappingTemplate") (clojure.core/assoc :request-mapping-template (deser-mapping-template (input "requestMappingTemplate"))) (clojure.core/contains? input "responseMappingTemplate") (clojure.core/assoc :response-mapping-template (deser-mapping-template (input "responseMappingTemplate"))) (clojure.core/contains? input "kind") (clojure.core/assoc :kind (deser-resolver-kind (input "kind"))) (clojure.core/contains? input "pipelineConfig") (clojure.core/assoc :pipeline-config (deser-pipeline-config (input "pipelineConfig")))))

(clojure.core/defn- deser-dynamodb-data-source-config [input] (clojure.core/cond-> {:table-name (deser-string (input "tableName")), :aws-region (deser-string (input "awsRegion"))} (clojure.core/contains? input "useCallerCredentials") (clojure.core/assoc :use-caller-credentials (deser-boolean (input "useCallerCredentials")))))

(clojure.core/defn- deser-elasticsearch-data-source-config [input] (clojure.core/cond-> {:endpoint (deser-string (input "endpoint")), :aws-region (deser-string (input "awsRegion"))}))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-list-graphql-apis-response ([input] (response-list-graphql-apis-response nil input)) ([resultWrapper103815 input] (clojure.core/let [rawinput103814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103816 {"graphqlApis" (rawinput103814 "graphqlApis"), "nextToken" (rawinput103814 "nextToken")}] (clojure.core/cond-> {} (letvar103816 "graphqlApis") (clojure.core/assoc :graphql-apis (deser-graphql-apis (clojure.core/get-in letvar103816 ["graphqlApis"]))) (letvar103816 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103816 ["nextToken"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper103818 input] (clojure.core/let [rawinput103817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103819 {"message" (rawinput103817 "message")}] (clojure.core/cond-> {} (letvar103819 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103819 ["message"])))))))

(clojure.core/defn- response-delete-type-response ([input] (response-delete-type-response nil input)) ([resultWrapper103821 input] (clojure.core/let [rawinput103820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103822 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-graphql-api-response ([input] (response-delete-graphql-api-response nil input)) ([resultWrapper103824 input] (clojure.core/let [rawinput103823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103825 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper103827 input] (clojure.core/let [rawinput103826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103828 {"message" (rawinput103826 "message")}] (clojure.core/cond-> {} (letvar103828 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar103828 ["message"])))))))

(clojure.core/defn- response-update-function-response ([input] (response-update-function-response nil input)) ([resultWrapper103830 input] (clojure.core/let [rawinput103829 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103831 {"functionConfiguration" (rawinput103829 "functionConfiguration")}] (clojure.core/cond-> {} (letvar103831 "functionConfiguration") (clojure.core/assoc :function-configuration (deser-function-configuration (clojure.core/get-in letvar103831 ["functionConfiguration"])))))))

(clojure.core/defn- response-api-limit-exceeded-exception ([input] (response-api-limit-exceeded-exception nil input)) ([resultWrapper103833 input] (clojure.core/let [rawinput103832 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103834 {"message" (rawinput103832 "message")}] (clojure.core/cond-> {} (letvar103834 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103834 ["message"])))))))

(clojure.core/defn- response-create-function-response ([input] (response-create-function-response nil input)) ([resultWrapper103836 input] (clojure.core/let [rawinput103835 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103837 {"functionConfiguration" (rawinput103835 "functionConfiguration")}] (clojure.core/cond-> {} (letvar103837 "functionConfiguration") (clojure.core/assoc :function-configuration (deser-function-configuration (clojure.core/get-in letvar103837 ["functionConfiguration"])))))))

(clojure.core/defn- response-list-resolvers-by-function-response ([input] (response-list-resolvers-by-function-response nil input)) ([resultWrapper103839 input] (clojure.core/let [rawinput103838 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103840 {"resolvers" (rawinput103838 "resolvers"), "nextToken" (rawinput103838 "nextToken")}] (clojure.core/cond-> {} (letvar103840 "resolvers") (clojure.core/assoc :resolvers (deser-resolvers (clojure.core/get-in letvar103840 ["resolvers"]))) (letvar103840 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103840 ["nextToken"])))))))

(clojure.core/defn- response-update-resolver-response ([input] (response-update-resolver-response nil input)) ([resultWrapper103842 input] (clojure.core/let [rawinput103841 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103843 {"resolver" (rawinput103841 "resolver")}] (clojure.core/cond-> {} (letvar103843 "resolver") (clojure.core/assoc :resolver (deser-resolver (clojure.core/get-in letvar103843 ["resolver"])))))))

(clojure.core/defn- response-list-api-keys-response ([input] (response-list-api-keys-response nil input)) ([resultWrapper103845 input] (clojure.core/let [rawinput103844 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103846 {"apiKeys" (rawinput103844 "apiKeys"), "nextToken" (rawinput103844 "nextToken")}] (clojure.core/cond-> {} (letvar103846 "apiKeys") (clojure.core/assoc :api-keys (deser-api-keys (clojure.core/get-in letvar103846 ["apiKeys"]))) (letvar103846 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103846 ["nextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper103848 input] (clojure.core/let [rawinput103847 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103849 {"message" (rawinput103847 "message")}] (clojure.core/cond-> {} (letvar103849 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103849 ["message"])))))))

(clojure.core/defn- response-list-types-response ([input] (response-list-types-response nil input)) ([resultWrapper103851 input] (clojure.core/let [rawinput103850 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103852 {"types" (rawinput103850 "types"), "nextToken" (rawinput103850 "nextToken")}] (clojure.core/cond-> {} (letvar103852 "types") (clojure.core/assoc :types (deser-type-list (clojure.core/get-in letvar103852 ["types"]))) (letvar103852 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103852 ["nextToken"])))))))

(clojure.core/defn- response-list-functions-response ([input] (response-list-functions-response nil input)) ([resultWrapper103854 input] (clojure.core/let [rawinput103853 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103855 {"functions" (rawinput103853 "functions"), "nextToken" (rawinput103853 "nextToken")}] (clojure.core/cond-> {} (letvar103855 "functions") (clojure.core/assoc :functions (deser-functions (clojure.core/get-in letvar103855 ["functions"]))) (letvar103855 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103855 ["nextToken"])))))))

(clojure.core/defn- response-delete-resolver-response ([input] (response-delete-resolver-response nil input)) ([resultWrapper103857 input] (clojure.core/let [rawinput103856 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103858 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resolvers-response ([input] (response-list-resolvers-response nil input)) ([resultWrapper103860 input] (clojure.core/let [rawinput103859 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103861 {"resolvers" (rawinput103859 "resolvers"), "nextToken" (rawinput103859 "nextToken")}] (clojure.core/cond-> {} (letvar103861 "resolvers") (clojure.core/assoc :resolvers (deser-resolvers (clojure.core/get-in letvar103861 ["resolvers"]))) (letvar103861 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103861 ["nextToken"])))))))

(clojure.core/defn- response-graph-ql-schema-exception ([input] (response-graph-ql-schema-exception nil input)) ([resultWrapper103863 input] (clojure.core/let [rawinput103862 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103864 {"message" (rawinput103862 "message")}] (clojure.core/cond-> {} (letvar103864 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar103864 ["message"])))))))

(clojure.core/defn- response-create-data-source-response ([input] (response-create-data-source-response nil input)) ([resultWrapper103866 input] (clojure.core/let [rawinput103865 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103867 {"dataSource" (rawinput103865 "dataSource")}] (clojure.core/cond-> {} (letvar103867 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar103867 ["dataSource"])))))))

(clojure.core/defn- response-get-function-response ([input] (response-get-function-response nil input)) ([resultWrapper103869 input] (clojure.core/let [rawinput103868 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103870 {"functionConfiguration" (rawinput103868 "functionConfiguration")}] (clojure.core/cond-> {} (letvar103870 "functionConfiguration") (clojure.core/assoc :function-configuration (deser-function-configuration (clojure.core/get-in letvar103870 ["functionConfiguration"])))))))

(clojure.core/defn- response-create-api-key-response ([input] (response-create-api-key-response nil input)) ([resultWrapper103872 input] (clojure.core/let [rawinput103871 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103873 {"apiKey" (rawinput103871 "apiKey")}] (clojure.core/cond-> {} (letvar103873 "apiKey") (clojure.core/assoc :api-key (deser-api-key (clojure.core/get-in letvar103873 ["apiKey"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper103875 input] (clojure.core/let [rawinput103874 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103876 {"message" (rawinput103874 "message")}] (clojure.core/cond-> {} (letvar103876 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103876 ["message"])))))))

(clojure.core/defn- response-delete-api-key-response ([input] (response-delete-api-key-response nil input)) ([resultWrapper103878 input] (clojure.core/let [rawinput103877 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103879 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-function-response ([input] (response-delete-function-response nil input)) ([resultWrapper103881 input] (clojure.core/let [rawinput103880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103882 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-data-source-response ([input] (response-update-data-source-response nil input)) ([resultWrapper103884 input] (clojure.core/let [rawinput103883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103885 {"dataSource" (rawinput103883 "dataSource")}] (clojure.core/cond-> {} (letvar103885 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar103885 ["dataSource"])))))))

(clojure.core/defn- response-get-introspection-schema-response ([input] (response-get-introspection-schema-response nil input)) ([resultWrapper103887 input] (clojure.core/let [rawinput103886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103888 {"schema" (rawinput103886 "schema")}] (clojure.core/cond-> {} (letvar103888 "schema") (clojure.core/assoc :schema (deser-blob (clojure.core/get-in letvar103888 ["schema"])))))))

(clojure.core/defn- response-get-graphql-api-response ([input] (response-get-graphql-api-response nil input)) ([resultWrapper103890 input] (clojure.core/let [rawinput103889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103891 {"graphqlApi" (rawinput103889 "graphqlApi")}] (clojure.core/cond-> {} (letvar103891 "graphqlApi") (clojure.core/assoc :graphql-api (deser-graphql-api (clojure.core/get-in letvar103891 ["graphqlApi"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper103893 input] (clojure.core/let [rawinput103892 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103894 {"message" (rawinput103892 "message")}] (clojure.core/cond-> {} (letvar103894 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103894 ["message"])))))))

(clojure.core/defn- response-update-api-key-response ([input] (response-update-api-key-response nil input)) ([resultWrapper103896 input] (clojure.core/let [rawinput103895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103897 {"apiKey" (rawinput103895 "apiKey")}] (clojure.core/cond-> {} (letvar103897 "apiKey") (clojure.core/assoc :api-key (deser-api-key (clojure.core/get-in letvar103897 ["apiKey"])))))))

(clojure.core/defn- response-api-key-limit-exceeded-exception ([input] (response-api-key-limit-exceeded-exception nil input)) ([resultWrapper103899 input] (clojure.core/let [rawinput103898 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103900 {"message" (rawinput103898 "message")}] (clojure.core/cond-> {} (letvar103900 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103900 ["message"])))))))

(clojure.core/defn- response-get-resolver-response ([input] (response-get-resolver-response nil input)) ([resultWrapper103902 input] (clojure.core/let [rawinput103901 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103903 {"resolver" (rawinput103901 "resolver")}] (clojure.core/cond-> {} (letvar103903 "resolver") (clojure.core/assoc :resolver (deser-resolver (clojure.core/get-in letvar103903 ["resolver"])))))))

(clojure.core/defn- response-start-schema-creation-response ([input] (response-start-schema-creation-response nil input)) ([resultWrapper103905 input] (clojure.core/let [rawinput103904 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103906 {"status" (rawinput103904 "status")}] (clojure.core/cond-> {} (letvar103906 "status") (clojure.core/assoc :status (deser-schema-status (clojure.core/get-in letvar103906 ["status"])))))))

(clojure.core/defn- response-create-graphql-api-response ([input] (response-create-graphql-api-response nil input)) ([resultWrapper103908 input] (clojure.core/let [rawinput103907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103909 {"graphqlApi" (rawinput103907 "graphqlApi")}] (clojure.core/cond-> {} (letvar103909 "graphqlApi") (clojure.core/assoc :graphql-api (deser-graphql-api (clojure.core/get-in letvar103909 ["graphqlApi"])))))))

(clojure.core/defn- response-create-resolver-response ([input] (response-create-resolver-response nil input)) ([resultWrapper103911 input] (clojure.core/let [rawinput103910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103912 {"resolver" (rawinput103910 "resolver")}] (clojure.core/cond-> {} (letvar103912 "resolver") (clojure.core/assoc :resolver (deser-resolver (clojure.core/get-in letvar103912 ["resolver"])))))))

(clojure.core/defn- response-create-type-response ([input] (response-create-type-response nil input)) ([resultWrapper103914 input] (clojure.core/let [rawinput103913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103915 {"type" (rawinput103913 "type")}] (clojure.core/cond-> {} (letvar103915 "type") (clojure.core/assoc :type (deser-type (clojure.core/get-in letvar103915 ["type"])))))))

(clojure.core/defn- response-delete-data-source-response ([input] (response-delete-data-source-response nil input)) ([resultWrapper103917 input] (clojure.core/let [rawinput103916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103918 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-api-key-validity-out-of-bounds-exception ([input] (response-api-key-validity-out-of-bounds-exception nil input)) ([resultWrapper103920 input] (clojure.core/let [rawinput103919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103921 {"message" (rawinput103919 "message")}] (clojure.core/cond-> {} (letvar103921 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar103921 ["message"])))))))

(clojure.core/defn- response-list-data-sources-response ([input] (response-list-data-sources-response nil input)) ([resultWrapper103923 input] (clojure.core/let [rawinput103922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103924 {"dataSources" (rawinput103922 "dataSources"), "nextToken" (rawinput103922 "nextToken")}] (clojure.core/cond-> {} (letvar103924 "dataSources") (clojure.core/assoc :data-sources (deser-data-sources (clojure.core/get-in letvar103924 ["dataSources"]))) (letvar103924 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar103924 ["nextToken"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper103926 input] (clojure.core/let [rawinput103925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103927 {"message" (rawinput103925 "message")}] (clojure.core/cond-> {} (letvar103927 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar103927 ["message"])))))))

(clojure.core/defn- response-get-schema-creation-status-response ([input] (response-get-schema-creation-status-response nil input)) ([resultWrapper103929 input] (clojure.core/let [rawinput103928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103930 {"status" (rawinput103928 "status"), "details" (rawinput103928 "details")}] (clojure.core/cond-> {} (letvar103930 "status") (clojure.core/assoc :status (deser-schema-status (clojure.core/get-in letvar103930 ["status"]))) (letvar103930 "details") (clojure.core/assoc :details (deser-string (clojure.core/get-in letvar103930 ["details"])))))))

(clojure.core/defn- response-get-data-source-response ([input] (response-get-data-source-response nil input)) ([resultWrapper103932 input] (clojure.core/let [rawinput103931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103933 {"dataSource" (rawinput103931 "dataSource")}] (clojure.core/cond-> {} (letvar103933 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar103933 ["dataSource"])))))))

(clojure.core/defn- response-update-type-response ([input] (response-update-type-response nil input)) ([resultWrapper103935 input] (clojure.core/let [rawinput103934 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103936 {"type" (rawinput103934 "type")}] (clojure.core/cond-> {} (letvar103936 "type") (clojure.core/assoc :type (deser-type (clojure.core/get-in letvar103936 ["type"])))))))

(clojure.core/defn- response-get-type-response ([input] (response-get-type-response nil input)) ([resultWrapper103938 input] (clojure.core/let [rawinput103937 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103939 {"type" (rawinput103937 "type")}] (clojure.core/cond-> {} (letvar103939 "type") (clojure.core/assoc :type (deser-type (clojure.core/get-in letvar103939 ["type"])))))))

(clojure.core/defn- response-update-graphql-api-response ([input] (response-update-graphql-api-response nil input)) ([resultWrapper103941 input] (clojure.core/let [rawinput103940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar103942 {"graphqlApi" (rawinput103940 "graphqlApi")}] (clojure.core/cond-> {} (letvar103942 "graphqlApi") (clojure.core/assoc :graphql-api (deser-graphql-api (clojure.core/get-in letvar103942 ["graphqlApi"])))))))

(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-response/graphql-apis (clojure.spec.alpha/and :portkey.aws.appsync/graphql-apis))
(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-graphql-apis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-graphql-apis-response/graphql-apis :portkey.aws.appsync.list-graphql-apis-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.relational-database-data-source-config/relational-database-source-type (clojure.spec.alpha/and :portkey.aws.appsync/relational-database-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.relational-database-data-source-config/rds-http-endpoint-config (clojure.spec.alpha/and :portkey.aws.appsync/rds-http-endpoint-config))
(clojure.spec.alpha/def :portkey.aws.appsync/relational-database-data-source-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.relational-database-data-source-config/relational-database-source-type :portkey.aws.appsync.relational-database-data-source-config/rds-http-endpoint-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.create-function-request/function-version (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/create-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-function-request/api-id :portkey.aws.appsync.create-function-request/name :portkey.aws.appsync.create-function-request/data-source-name :portkey.aws.appsync.create-function-request/request-mapping-template :portkey.aws.appsync.create-function-request/function-version] :opt-un [:portkey.aws.appsync.create-function-request/description :portkey.aws.appsync.create-function-request/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/functions (clojure.spec.alpha/coll-of :portkey.aws.appsync/function-configuration))

(clojure.spec.alpha/def :portkey.aws.appsync/resolver-kind #{:pipeline :unit "UNIT" "PIPELINE"})

(clojure.spec.alpha/def :portkey.aws.appsync/field-log-level #{"ERROR" :all "NONE" :error "ALL" :none})

(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/update-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-type-request/api-id :portkey.aws.appsync.update-type-request/type-name :portkey.aws.appsync.update-type-request/format] :opt-un [:portkey.aws.appsync.update-type-request/definition]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-type-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/functions-ids (clojure.spec.alpha/coll-of :portkey.aws.appsync/string))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.http-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.http-data-source-config/authorization-config (clojure.spec.alpha/and :portkey.aws.appsync/authorization-config))
(clojure.spec.alpha/def :portkey.aws.appsync/http-data-source-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.http-data-source-config/endpoint :portkey.aws.appsync.http-data-source-config/authorization-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/schema-status #{:processing :deleting :active "DELETING" "ACTIVE" "PROCESSING"})

(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/relational-database-config (clojure.spec.alpha/and :portkey.aws.appsync/relational-database-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/http-config (clojure.spec.alpha/and :portkey.aws.appsync/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/update-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-data-source-request/api-id :portkey.aws.appsync.update-data-source-request/name :portkey.aws.appsync.update-data-source-request/type] :opt-un [:portkey.aws.appsync.update-data-source-request/elasticsearch-config :portkey.aws.appsync.update-data-source-request/lambda-config :portkey.aws.appsync.update-data-source-request/dynamodb-config :portkey.aws.appsync.update-data-source-request/relational-database-config :portkey.aws.appsync.update-data-source-request/service-role-arn :portkey.aws.appsync.update-data-source-request/http-config :portkey.aws.appsync.update-data-source-request/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.type/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.type/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.type/name :portkey.aws.appsync.type/description :portkey.aws.appsync.type/arn :portkey.aws.appsync.type/definition :portkey.aws.appsync.type/format]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-function-response/function-configuration (clojure.spec.alpha/and :portkey.aws.appsync/function-configuration))
(clojure.spec.alpha/def :portkey.aws.appsync/update-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-function-response/function-configuration]))

(clojure.spec.alpha/def :portkey.aws.appsync/data-source-type #{:amazon-dynamodb :aws-lambda :relational-database "AWS_LAMBDA" "RELATIONAL_DATABASE" "NONE" :amazon-elasticsearch "AMAZON_DYNAMODB" "AMAZON_ELASTICSEARCH" :http "HTTP" :none})

(clojure.spec.alpha/def :portkey.aws.appsync.log-config/field-log-level (clojure.spec.alpha/and :portkey.aws.appsync/field-log-level))
(clojure.spec.alpha/def :portkey.aws.appsync.log-config/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/log-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.log-config/field-log-level :portkey.aws.appsync.log-config/cloud-watch-logs-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.api-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-schema-creation-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-schema-creation-status-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/log-config (clojure.spec.alpha/and :portkey.aws.appsync/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync/update-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-graphql-api-request/api-id :portkey.aws.appsync.update-graphql-api-request/name] :opt-un [:portkey.aws.appsync.update-graphql-api-request/log-config :portkey.aws.appsync.update-graphql-api-request/authentication-type :portkey.aws.appsync.update-graphql-api-request/user-pool-config :portkey.aws.appsync.update-graphql-api-request/open-id-connect-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/relational-database-config (clojure.spec.alpha/and :portkey.aws.appsync/relational-database-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/http-config (clojure.spec.alpha/and :portkey.aws.appsync/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/create-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-data-source-request/api-id :portkey.aws.appsync.create-data-source-request/name :portkey.aws.appsync.create-data-source-request/type] :opt-un [:portkey.aws.appsync.create-data-source-request/elasticsearch-config :portkey.aws.appsync.create-data-source-request/lambda-config :portkey.aws.appsync.create-data-source-request/dynamodb-config :portkey.aws.appsync.create-data-source-request/relational-database-config :portkey.aws.appsync.create-data-source-request/service-role-arn :portkey.aws.appsync.create-data-source-request/http-config :portkey.aws.appsync.create-data-source-request/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.rds-http-endpoint-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.rds-http-endpoint-config/db-cluster-identifier (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.rds-http-endpoint-config/database-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.rds-http-endpoint-config/schema (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.rds-http-endpoint-config/aws-secret-store-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/rds-http-endpoint-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.rds-http-endpoint-config/aws-region :portkey.aws.appsync.rds-http-endpoint-config/db-cluster-identifier :portkey.aws.appsync.rds-http-endpoint-config/database-name :portkey.aws.appsync.rds-http-endpoint-config/schema :portkey.aws.appsync.rds-http-endpoint-config/aws-secret-store-arn]))

(clojure.spec.alpha/def :portkey.aws.appsync.lambda-data-source-config/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/lambda-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.lambda-data-source-config/lambda-function-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.create-function-response/function-configuration (clojure.spec.alpha/and :portkey.aws.appsync/function-configuration))
(clojure.spec.alpha/def :portkey.aws.appsync/create-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-function-response/function-configuration]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-by-function-response/resolvers (clojure.spec.alpha/and :portkey.aws.appsync/resolvers))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-by-function-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-by-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-resolvers-by-function-response/resolvers :portkey.aws.appsync.list-resolvers-by-function-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-resolver-request/api-id :portkey.aws.appsync.get-resolver-request/type-name :portkey.aws.appsync.get-resolver-request/field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/update-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-response/api-keys (clojure.spec.alpha/and :portkey.aws.appsync/api-keys))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-api-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-api-keys-response/api-keys :portkey.aws.appsync.list-api-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync/graphql-apis (clojure.spec.alpha/coll-of :portkey.aws.appsync/graphql-api))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-api-key-request/api-id :portkey.aws.appsync.delete-api-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/log-config (clojure.spec.alpha/and :portkey.aws.appsync/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync/create-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-graphql-api-request/name :portkey.aws.appsync.create-graphql-api-request/authentication-type] :opt-un [:portkey.aws.appsync.create-graphql-api-request/log-config :portkey.aws.appsync.create-graphql-api-request/user-pool-config :portkey.aws.appsync.create-graphql-api-request/open-id-connect-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-resolvers-request/api-id :portkey.aws.appsync.list-resolvers-request/type-name] :opt-un [:portkey.aws.appsync.list-resolvers-request/next-token :portkey.aws.appsync.list-resolvers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync/default-action #{"DENY" :allow "ALLOW" :deny})

(clojure.spec.alpha/def :portkey.aws.appsync.delete-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-graphql-api-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\\S]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-types-response/types (clojure.spec.alpha/and :portkey.aws.appsync/type-list))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-types-response/types :portkey.aws.appsync.list-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync/relational-database-source-type #{:rds-http-endpoint "RDS_HTTP_ENDPOINT"})

(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/user-pool-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/default-action (clojure.spec.alpha/and :portkey.aws.appsync/default-action))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/app-id-client-regex (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/user-pool-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.user-pool-config/user-pool-id :portkey.aws.appsync.user-pool-config/aws-region :portkey.aws.appsync.user-pool-config/default-action] :opt-un [:portkey.aws.appsync.user-pool-config/app-id-client-regex]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-api-keys-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-api-keys-request/api-id] :opt-un [:portkey.aws.appsync.list-api-keys-request/next-token :portkey.aws.appsync.list-api-keys-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.appsync/functions))
(clojure.spec.alpha/def :portkey.aws.appsync.list-functions-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-functions-response/functions :portkey.aws.appsync.list-functions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-graphql-api-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.aws-iam-config/signing-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.aws-iam-config/signing-service-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/aws-iam-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.aws-iam-config/signing-region :portkey.aws.appsync.aws-iam-config/signing-service-name]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/type-definition-format #{"SDL" "JSON" :sdl :json})

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-response/resolvers (clojure.spec.alpha/and :portkey.aws.appsync/resolvers))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-resolvers-response/resolvers :portkey.aws.appsync.list-resolvers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.graph-ql-schema-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/graph-ql-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.graph-ql-schema-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-function-request/api-id :portkey.aws.appsync.delete-function-request/function-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/create-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-function-response/function-configuration (clojure.spec.alpha/and :portkey.aws.appsync/function-configuration))
(clojure.spec.alpha/def :portkey.aws.appsync/get-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-function-response/function-configuration]))

(clojure.spec.alpha/def :portkey.aws.appsync/type-list (clojure.spec.alpha/coll-of :portkey.aws.appsync/type))

(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-graphql-apis-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-graphql-apis-request/next-token :portkey.aws.appsync.list-graphql-apis-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync/create-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-api-key-response/api-key]))

(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/log-config (clojure.spec.alpha/and :portkey.aws.appsync/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/uris (clojure.spec.alpha/and :portkey.aws.appsync/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.appsync/graphql-api (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.graphql-api/name :portkey.aws.appsync.graphql-api/api-id :portkey.aws.appsync.graphql-api/authentication-type :portkey.aws.appsync.graphql-api/log-config :portkey.aws.appsync.graphql-api/user-pool-config :portkey.aws.appsync.graphql-api/open-id-connect-config :portkey.aws.appsync.graphql-api/arn :portkey.aws.appsync.graphql-api/uris]))

(clojure.spec.alpha/def :portkey.aws.appsync/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync.pipeline-config/functions (clojure.spec.alpha/and :portkey.aws.appsync/functions-ids))
(clojure.spec.alpha/def :portkey.aws.appsync/pipeline-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.pipeline-config/functions]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.update-function-request/function-version (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/update-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-function-request/api-id :portkey.aws.appsync.update-function-request/name :portkey.aws.appsync.update-function-request/function-id :portkey.aws.appsync.update-function-request/data-source-name :portkey.aws.appsync.update-function-request/request-mapping-template :portkey.aws.appsync.update-function-request/function-version] :opt-un [:portkey.aws.appsync.update-function-request/description :portkey.aws.appsync.update-function-request/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync/output-type #{"SDL" "JSON" :sdl :json})

(clojure.spec.alpha/def :portkey.aws.appsync.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/data-sources (clojure.spec.alpha/coll-of :portkey.aws.appsync/data-source))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/resolvers (clojure.spec.alpha/coll-of :portkey.aws.appsync/resolver))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-resolver-request/api-id :portkey.aws.appsync.delete-resolver-request/type-name :portkey.aws.appsync.delete-resolver-request/field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/create-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-type-request/api-id :portkey.aws.appsync.create-type-request/definition :portkey.aws.appsync.create-type-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/update-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-response/schema (clojure.spec.alpha/and :portkey.aws.appsync/blob))
(clojure.spec.alpha/def :portkey.aws.appsync/get-introspection-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-introspection-schema-response/schema]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/get-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.authorization-config/authorization-type (clojure.spec.alpha/and :portkey.aws.appsync/authorization-type))
(clojure.spec.alpha/def :portkey.aws.appsync.authorization-config/aws-iam-config (clojure.spec.alpha/and :portkey.aws.appsync/aws-iam-config))
(clojure.spec.alpha/def :portkey.aws.appsync/authorization-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.authorization-config/authorization-type] :opt-un [:portkey.aws.appsync.authorization-config/aws-iam-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-by-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-by-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-by-function-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-by-function-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-by-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-resolvers-by-function-request/api-id :portkey.aws.appsync.list-resolvers-by-function-request/function-id] :opt-un [:portkey.aws.appsync.list-resolvers-by-function-request/next-token :portkey.aws.appsync.list-resolvers-by-function-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-data-source-request/api-id :portkey.aws.appsync.get-data-source-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/create-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-api-key-request/api-id] :opt-un [:portkey.aws.appsync.create-api-key-request/description :portkey.aws.appsync.create-api-key-request/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync/authorization-type #{:aws-iam "AWS_IAM"})

(clojure.spec.alpha/def :portkey.aws.appsync/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[_A-Za-z][_0-9A-Za-z]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-type-request/api-id :portkey.aws.appsync.delete-type-request/type-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync/authentication-type #{"AMAZON_COGNITO_USER_POOLS" :openid-connect :aws-iam "AWS_IAM" "OPENID_CONNECT" "API_KEY" :api-key :amazon-cognito-user-pools})

(clojure.spec.alpha/def :portkey.aws.appsync/mapping-template (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.appsync.data-source/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/relational-database-config (clojure.spec.alpha/and :portkey.aws.appsync/relational-database-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/data-source-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/http-config (clojure.spec.alpha/and :portkey.aws.appsync/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.data-source/elasticsearch-config :portkey.aws.appsync.data-source/lambda-config :portkey.aws.appsync.data-source/name :portkey.aws.appsync.data-source/dynamodb-config :portkey.aws.appsync.data-source/relational-database-config :portkey.aws.appsync.data-source/service-role-arn :portkey.aws.appsync.data-source/type :portkey.aws.appsync.data-source/data-source-arn :portkey.aws.appsync.data-source/http-config :portkey.aws.appsync.data-source/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-function-request/api-id :portkey.aws.appsync.get-function-request/function-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync/update-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-api-key-response/api-key]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-request/format (clojure.spec.alpha/and :portkey.aws.appsync/output-type))
(clojure.spec.alpha/def :portkey.aws.appsync/get-introspection-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-introspection-schema-request/api-id :portkey.aws.appsync.get-introspection-schema-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-key-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-data-sources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-data-sources-request/api-id] :opt-un [:portkey.aws.appsync.list-data-sources-request/next-token :portkey.aws.appsync.list-data-sources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync/map-of-string-to-string (clojure.spec.alpha/map-of :portkey.aws.appsync/string :portkey.aws.appsync/string))

(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/get-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-response/status (clojure.spec.alpha/and :portkey.aws.appsync/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync/start-schema-creation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.start-schema-creation-response/status]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/kind (clojure.spec.alpha/and :portkey.aws.appsync/resolver-kind))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/pipeline-config (clojure.spec.alpha/and :portkey.aws.appsync/pipeline-config))
(clojure.spec.alpha/def :portkey.aws.appsync/update-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-resolver-request/api-id :portkey.aws.appsync.update-resolver-request/type-name :portkey.aws.appsync.update-resolver-request/field-name :portkey.aws.appsync.update-resolver-request/request-mapping-template] :opt-un [:portkey.aws.appsync.update-resolver-request/data-source-name :portkey.aws.appsync.update-resolver-request/response-mapping-template :portkey.aws.appsync.update-resolver-request/kind :portkey.aws.appsync.update-resolver-request/pipeline-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/kind (clojure.spec.alpha/and :portkey.aws.appsync/resolver-kind))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/pipeline-config (clojure.spec.alpha/and :portkey.aws.appsync/pipeline-config))
(clojure.spec.alpha/def :portkey.aws.appsync/create-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.create-resolver-request/api-id :portkey.aws.appsync.create-resolver-request/type-name :portkey.aws.appsync.create-resolver-request/field-name :portkey.aws.appsync.create-resolver-request/request-mapping-template] :opt-un [:portkey.aws.appsync.create-resolver-request/data-source-name :portkey.aws.appsync.create-resolver-request/response-mapping-template :portkey.aws.appsync.create-resolver-request/kind :portkey.aws.appsync.create-resolver-request/pipeline-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/create-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/function-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.function-configuration/function-version (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.function-configuration/function-id :portkey.aws.appsync.function-configuration/function-arn :portkey.aws.appsync.function-configuration/name :portkey.aws.appsync.function-configuration/description :portkey.aws.appsync.function-configuration/data-source-name :portkey.aws.appsync.function-configuration/request-mapping-template :portkey.aws.appsync.function-configuration/response-mapping-template :portkey.aws.appsync.function-configuration/function-version]))

(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/create-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync/api-keys (clojure.spec.alpha/coll-of :portkey.aws.appsync/api-key))

(clojure.spec.alpha/def :portkey.aws.appsync/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appsync.create-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/create-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.create-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.list-functions-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-functions-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-functions-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-functions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-functions-request/api-id] :opt-un [:portkey.aws.appsync.list-functions-request/next-token :portkey.aws.appsync.list-functions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/blob))
(clojure.spec.alpha/def :portkey.aws.appsync/start-schema-creation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.start-schema-creation-request/api-id :portkey.aws.appsync.start-schema-creation-request/definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/update-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.update-api-key-request/api-id :portkey.aws.appsync.update-api-key-request/id] :opt-un [:portkey.aws.appsync.update-api-key-request/description :portkey.aws.appsync.update-api-key-request/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key-validity-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key-validity-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-key-validity-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync/max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.delete-data-source-request/api-id :portkey.aws.appsync.delete-data-source-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/issuer (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/client-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/iat-ttl (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync.open-id-connect-config/auth-ttl (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/open-id-connect-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.open-id-connect-config/issuer] :opt-un [:portkey.aws.appsync.open-id-connect-config/client-id :portkey.aws.appsync.open-id-connect-config/iat-ttl :portkey.aws.appsync.open-id-connect-config/auth-ttl]))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.api-key/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.api-key/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.api-key/id :portkey.aws.appsync.api-key/description :portkey.aws.appsync.api-key/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-response/data-sources (clojure.spec.alpha/and :portkey.aws.appsync/data-sources))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-data-sources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.list-data-sources-response/data-sources :portkey.aws.appsync.list-data-sources-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.appsync.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-types-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.list-types-request/api-id :portkey.aws.appsync.list-types-request/format] :opt-un [:portkey.aws.appsync.list-types-request/next-token :portkey.aws.appsync.list-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.resolver/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/resolver-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/kind (clojure.spec.alpha/and :portkey.aws.appsync/resolver-kind))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/pipeline-config (clojure.spec.alpha/and :portkey.aws.appsync/pipeline-config))
(clojure.spec.alpha/def :portkey.aws.appsync/resolver (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.resolver/type-name :portkey.aws.appsync.resolver/field-name :portkey.aws.appsync.resolver/data-source-name :portkey.aws.appsync.resolver/resolver-arn :portkey.aws.appsync.resolver/request-mapping-template :portkey.aws.appsync.resolver/response-mapping-template :portkey.aws.appsync.resolver/kind :portkey.aws.appsync.resolver/pipeline-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/get-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.get-type-request/api-id :portkey.aws.appsync.get-type-request/type-name :portkey.aws.appsync.get-type-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-response/status (clojure.spec.alpha/and :portkey.aws.appsync/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-response/details (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-schema-creation-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-schema-creation-status-response/status :portkey.aws.appsync.get-schema-creation-status-response/details]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/get-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.update-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/update-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.get-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/get-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.get-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/table-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/use-caller-credentials (clojure.spec.alpha/and :portkey.aws.appsync/boolean))
(clojure.spec.alpha/def :portkey.aws.appsync/dynamodb-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.dynamodb-data-source-config/table-name :portkey.aws.appsync.dynamodb-data-source-config/aws-region] :opt-un [:portkey.aws.appsync.dynamodb-data-source-config/use-caller-credentials]))

(clojure.spec.alpha/def :portkey.aws.appsync.elasticsearch-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.elasticsearch-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/elasticsearch-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.elasticsearch-data-source-config/endpoint :portkey.aws.appsync.elasticsearch-data-source-config/aws-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/update-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.update-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync/boolean clojure.core/boolean?)

(clojure.core/defn start-schema-creation "Adds a new schema to your GraphQL API.\n This operation is asynchronous. Use to determine when it has completed." ([start-schema-creation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-schema-creation-request start-schema-creation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/start-schema-creation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schemacreation", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/start-schema-creation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSchemaCreation", :http.request.configuration/output-deser-fn response-start-schema-creation-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef start-schema-creation :args (clojure.spec.alpha/tuple :portkey.aws.appsync/start-schema-creation-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/start-schema-creation-response))

(clojure.core/defn get-type "Retrieves a Type object." ([get-type-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-type-request get-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetType", :http.request.configuration/output-deser-fn response-get-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-type-response))

(clojure.core/defn delete-resolver "Deletes a Resolver object." ([delete-resolver-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-resolver-request delete-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/delete-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResolver", :http.request.configuration/output-deser-fn response-delete-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-resolver-response))

(clojure.core/defn delete-function "Deletes a Function." ([delete-function-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-function-request delete-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/delete-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunction", :http.request.configuration/output-deser-fn response-delete-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-function-response))

(clojure.core/defn get-introspection-schema "Retrieves the introspection schema for a GraphQL API." ([get-introspection-schema-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-introspection-schema-request get-introspection-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-introspection-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schema", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-introspection-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntrospectionSchema", :http.request.configuration/output-deser-fn response-get-introspection-schema-response, :http.request.spec/error-spec {"GraphQLSchemaException" :portkey.aws.appsync/graph-ql-schema-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-introspection-schema :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-introspection-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-introspection-schema-response))

(clojure.core/defn create-graphql-api "Creates a GraphqlApi object." ([create-graphql-api-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-graphql-api-request create-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/create-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGraphqlApi", :http.request.configuration/output-deser-fn response-create-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiLimitExceededException" :portkey.aws.appsync/api-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-graphql-api-response))

(clojure.core/defn list-data-sources "Lists the data sources for a given API." ([list-data-sources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-data-sources-request list-data-sources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-data-sources-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-data-sources-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDataSources", :http.request.configuration/output-deser-fn response-list-data-sources-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-data-sources :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-data-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-data-sources-response))

(clojure.core/defn create-api-key "Creates a unique key that you can distribute to clients who are executing your\nAPI." ([create-api-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-api-key-request create-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/create-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApiKey", :http.request.configuration/output-deser-fn response-create-api-key-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiKeyLimitExceededException" :portkey.aws.appsync/api-key-limit-exceeded-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync/api-key-validity-out-of-bounds-exception}})))))
(clojure.spec.alpha/fdef create-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-api-key-response))

(clojure.core/defn delete-api-key "Deletes an API key." ([delete-api-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-api-key-request delete-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys/{id}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/delete-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApiKey", :http.request.configuration/output-deser-fn response-delete-api-key-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-api-key-response))

(clojure.core/defn get-resolver "Retrieves a Resolver object." ([get-resolver-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resolver-request get-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolver", :http.request.configuration/output-deser-fn response-get-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception}})))))
(clojure.spec.alpha/fdef get-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-resolver-response))

(clojure.core/defn update-data-source "Updates a DataSource object." ([update-data-source-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-data-source-request update-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/update-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDataSource", :http.request.configuration/output-deser-fn response-update-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-data-source-response))

(clojure.core/defn update-api-key "Updates an API key." ([update-api-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-api-key-request update-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys/{id}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/update-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApiKey", :http.request.configuration/output-deser-fn response-update-api-key-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync/api-key-validity-out-of-bounds-exception}})))))
(clojure.spec.alpha/fdef update-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-api-key-response))

(clojure.core/defn create-resolver "Creates a Resolver object.\n A resolver converts incoming requests into a format that a data source can\nunderstand and converts the data source's responses into GraphQL." ([create-resolver-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-resolver-request create-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/create-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResolver", :http.request.configuration/output-deser-fn response-create-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-resolver-response))

(clojure.core/defn get-function "Get a Function." ([get-function-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-function-request get-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunction", :http.request.configuration/output-deser-fn response-get-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception}})))))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-function-response))

(clojure.core/defn delete-type "Deletes a Type object." ([delete-type-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-type-request delete-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/delete-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteType", :http.request.configuration/output-deser-fn response-delete-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-type-response))

(clojure.core/defn get-schema-creation-status "Retrieves the current status of a schema creation operation." ([get-schema-creation-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-schema-creation-status-request get-schema-creation-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-schema-creation-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schemacreation", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-schema-creation-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSchemaCreationStatus", :http.request.configuration/output-deser-fn response-get-schema-creation-status-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-schema-creation-status :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-schema-creation-status-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-schema-creation-status-response))

(clojure.core/defn update-resolver "Updates a Resolver object." ([update-resolver-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-resolver-request update-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/update-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResolver", :http.request.configuration/output-deser-fn response-update-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-resolver-response))

(clojure.core/defn list-graphql-apis "Lists your GraphQL APIs." ([] (list-graphql-apis {})) ([list-graphql-apis-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-graphql-apis-request list-graphql-apis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-graphql-apis-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-graphql-apis-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGraphqlApis", :http.request.configuration/output-deser-fn response-list-graphql-apis-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-graphql-apis :args (clojure.spec.alpha/? :portkey.aws.appsync/list-graphql-apis-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-graphql-apis-response))

(clojure.core/defn list-api-keys "Lists the API keys for a given API.\n API keys are deleted automatically sometime after they expire. However, they\nmay still be included in the response until they have actually been deleted. You\ncan safely call DeleteApiKey to manually delete a key before it's automatically\ndeleted." ([list-api-keys-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-api-keys-request list-api-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-api-keys-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-api-keys-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApiKeys", :http.request.configuration/output-deser-fn response-list-api-keys-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-api-keys-response))

(clojure.core/defn update-graphql-api "Updates a GraphqlApi object." ([update-graphql-api-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-graphql-api-request update-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/update-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGraphqlApi", :http.request.configuration/output-deser-fn response-update-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-graphql-api-response))

(clojure.core/defn update-function "Updates a Function object." ([update-function-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-function-request update-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/update-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunction", :http.request.configuration/output-deser-fn response-update-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-function-response))

(clojure.core/defn list-functions "List multiple functions." ([list-functions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-functions-request list-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-functions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-functions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFunctions", :http.request.configuration/output-deser-fn response-list-functions-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-functions-response))

(clojure.core/defn list-resolvers-by-function "List the resolvers that are associated with a specific function." ([list-resolvers-by-function-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resolvers-by-function-request list-resolvers-by-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-resolvers-by-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-resolvers-by-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolversByFunction", :http.request.configuration/output-deser-fn response-list-resolvers-by-function-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-resolvers-by-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-resolvers-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-resolvers-by-function-response))

(clojure.core/defn update-type "Updates a Type object." ([update-type-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-type-request update-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/update-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/update-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateType", :http.request.configuration/output-deser-fn response-update-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-type-response))

(clojure.core/defn get-data-source "Retrieves a DataSource object." ([get-data-source-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-data-source-request get-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDataSource", :http.request.configuration/output-deser-fn response-get-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-data-source-response))

(clojure.core/defn get-graphql-api "Retrieves a GraphqlApi object." ([get-graphql-api-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-graphql-api-request get-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/get-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/get-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGraphqlApi", :http.request.configuration/output-deser-fn response-get-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-graphql-api-response))

(clojure.core/defn create-function "Creates a Function object.\n A function is a reusable entity. Multiple functions can be used to compose the\nresolver logic." ([create-function-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-function-request create-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/create-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFunction", :http.request.configuration/output-deser-fn response-create-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-function-response))

(clojure.core/defn create-data-source "Creates a DataSource object." ([create-data-source-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-data-source-request create-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/create-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDataSource", :http.request.configuration/output-deser-fn response-create-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-data-source-response))

(clojure.core/defn create-type "Creates a Type object." ([create-type-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-type-request create-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/create-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/create-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateType", :http.request.configuration/output-deser-fn response-create-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-type-response))

(clojure.core/defn delete-graphql-api "Deletes a GraphqlApi object." ([delete-graphql-api-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-graphql-api-request delete-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/delete-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGraphqlApi", :http.request.configuration/output-deser-fn response-delete-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-graphql-api-response))

(clojure.core/defn list-resolvers "Lists the resolvers for a given API and type." ([list-resolvers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resolvers-request list-resolvers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-resolvers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-resolvers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolvers", :http.request.configuration/output-deser-fn response-list-resolvers-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-resolvers :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-resolvers-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-resolvers-response))

(clojure.core/defn delete-data-source "Deletes a DataSource object." ([delete-data-source-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-data-source-request delete-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/delete-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/delete-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDataSource", :http.request.configuration/output-deser-fn response-delete-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-data-source-response))

(clojure.core/defn list-types "Lists the types for a given API." ([list-types-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-types-request list-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.appsync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync/list-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync/list-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTypes", :http.request.configuration/output-deser-fn response-list-types-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-types :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-types-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-types-response))
