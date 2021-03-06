(ns portkey.aws.worklink.-2018-09-25 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-username)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-display-name)

(clojure.core/declare ser-fleet-name)

(clojure.core/declare ser-certificate-chain)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-identity-provider-type)

(clojure.core/declare ser-saml-metadata)

(clojure.core/declare ser-audit-stream-arn)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-certificate)

(clojure.core/declare ser-fleet-arn)

(clojure.core/declare ser-id)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-username [input] #:http.request.field{:value input, :shape "Username"})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-display-name [input] #:http.request.field{:value input, :shape "DisplayName"})

(clojure.core/defn- ser-fleet-name [input] #:http.request.field{:value input, :shape "FleetName"})

(clojure.core/defn- ser-certificate-chain [input] #:http.request.field{:value input, :shape "CertificateChain"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VpcId"})

(clojure.core/defn- ser-identity-provider-type [input] #:http.request.field{:value (clojure.core/get {"SAML" "SAML", :saml "SAML"} input), :shape "IdentityProviderType"})

(clojure.core/defn- ser-saml-metadata [input] #:http.request.field{:value input, :shape "SamlMetadata"})

(clojure.core/defn- ser-audit-stream-arn [input] #:http.request.field{:value input, :shape "AuditStreamArn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-certificate [input] #:http.request.field{:value input, :shape "Certificate"})

(clojure.core/defn- ser-fleet-arn [input] #:http.request.field{:value input, :shape "FleetArn"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-describe-identity-provider-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-describe-device-policy-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-delete-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-sign-out-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-username (input :username)) #:http.request.field{:name "Username", :shape "Username"})]}))

(clojure.core/defn- req-list-website-certificate-authorities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-id (input :device-id)) #:http.request.field{:name "DeviceId", :shape "Id"})]}))

(clojure.core/defn- req-describe-company-network-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-disassociate-website-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-id (input :website-ca-id)) #:http.request.field{:name "WebsiteCaId", :shape "Id"})]}))

(clojure.core/defn- req-describe-website-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-id (input :website-ca-id)) #:http.request.field{:name "WebsiteCaId", :shape "Id"})]}))

(clojure.core/defn- req-update-device-policy-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :device-ca-certificate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-chain (input :device-ca-certificate)) #:http.request.field{:name "DeviceCaCertificate", :shape "CertificateChain"}))))

(clojure.core/defn- req-update-audit-stream-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :audit-stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-stream-arn (input :audit-stream-arn)) #:http.request.field{:name "AuditStreamArn", :shape "AuditStreamArn"}))))

(clojure.core/defn- req-update-company-network-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-vpc-id (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "VpcId"}) (clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"}) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})]}))

(clojure.core/defn- req-describe-fleet-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-update-identity-provider-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-identity-provider-type (input :identity-provider-type)) #:http.request.field{:name "IdentityProviderType", :shape "IdentityProviderType"})]} (clojure.core/contains? input :identity-provider-saml-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-saml-metadata (input :identity-provider-saml-metadata)) #:http.request.field{:name "IdentityProviderSamlMetadata", :shape "SamlMetadata"}))))

(clojure.core/defn- req-update-fleet-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :optimize-for-end-user-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :optimize-for-end-user-location)) #:http.request.field{:name "OptimizeForEndUserLocation", :shape "Boolean"}))))

(clojure.core/defn- req-describe-audit-stream-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-list-fleets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-devices-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-name (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "FleetName"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :optimize-for-end-user-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :optimize-for-end-user-location)) #:http.request.field{:name "OptimizeForEndUserLocation", :shape "Boolean"}))))

(clojure.core/defn- req-associate-website-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-certificate (input :certificate)) #:http.request.field{:name "Certificate", :shape "Certificate"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"}))))

(clojure.core/declare deser-username)

(clojure.core/declare deser-device-operating-system-name)

(clojure.core/declare deser-device-model)

(clojure.core/declare deser-subnet-ids)

(clojure.core/declare deser-website-ca-summary-list)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-fleet-summary)

(clojure.core/declare deser-fleet-summary-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-website-ca-summary)

(clojure.core/declare deser-display-name)

(clojure.core/declare deser-fleet-name)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-device-status)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-device-patch-level)

(clojure.core/declare deser-device-summary)

(clojure.core/declare deser-identity-provider-type)

(clojure.core/declare deser-device-summary-list)

(clojure.core/declare deser-saml-metadata)

(clojure.core/declare deser-audit-stream-arn)

(clojure.core/declare deser-fleet-status)

(clojure.core/declare deser-device-operating-system-version)

(clojure.core/declare deser-certificate)

(clojure.core/declare deser-fleet-arn)

(clojure.core/declare deser-company-code)

(clojure.core/declare deser-id)

(clojure.core/declare deser-device-manufacturer)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-username [input] input)

(clojure.core/defn- deser-device-operating-system-name [input] input)

(clojure.core/defn- deser-device-model [input] input)

(clojure.core/defn- deser-subnet-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-website-ca-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-website-ca-summary coll))) input))

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-fleet-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetArn") (clojure.core/assoc :fleet-arn (deser-fleet-arn (input "FleetArn"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (input "CreatedTime"))) (clojure.core/contains? input "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (input "LastUpdatedTime"))) (clojure.core/contains? input "FleetName") (clojure.core/assoc :fleet-name (deser-fleet-name (input "FleetName"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-display-name (input "DisplayName"))) (clojure.core/contains? input "CompanyCode") (clojure.core/assoc :company-code (deser-company-code (input "CompanyCode"))) (clojure.core/contains? input "FleetStatus") (clojure.core/assoc :fleet-status (deser-fleet-status (input "FleetStatus")))))

(clojure.core/defn- deser-fleet-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-summary coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-website-ca-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "WebsiteCaId") (clojure.core/assoc :website-ca-id (deser-id (input "WebsiteCaId"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (input "CreatedTime"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-display-name (input "DisplayName")))))

(clojure.core/defn- deser-display-name [input] input)

(clojure.core/defn- deser-fleet-name [input] input)

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-device-status [input] (clojure.core/get {"ACTIVE" :active, "SIGNED_OUT" :signed-out} input))

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-device-patch-level [input] input)

(clojure.core/defn- deser-device-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceId") (clojure.core/assoc :device-id (deser-id (input "DeviceId"))) (clojure.core/contains? input "DeviceStatus") (clojure.core/assoc :device-status (deser-device-status (input "DeviceStatus")))))

(clojure.core/defn- deser-identity-provider-type [input] (clojure.core/get {"SAML" :saml} input))

(clojure.core/defn- deser-device-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-summary coll))) input))

(clojure.core/defn- deser-saml-metadata [input] input)

(clojure.core/defn- deser-audit-stream-arn [input] input)

(clojure.core/defn- deser-fleet-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting, "DELETED" :deleted, "FAILED_TO_CREATE" :failed-to-create, "FAILED_TO_DELETE" :failed-to-delete} input))

(clojure.core/defn- deser-device-operating-system-version [input] input)

(clojure.core/defn- deser-certificate [input] input)

(clojure.core/defn- deser-fleet-arn [input] input)

(clojure.core/defn- deser-company-code [input] input)

(clojure.core/defn- deser-id [input] input)

(clojure.core/defn- deser-device-manufacturer [input] input)

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-update-audit-stream-configuration-response ([input] (response-update-audit-stream-configuration-response nil input)) ([resultWrapper1900600 input] (clojure.core/let [rawinput1900599 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900601 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1900603 input] (clojure.core/let [rawinput1900602 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900604 {"Message" (rawinput1900602 "Message")}] (clojure.core/cond-> {} (letvar1900604 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1900604 ["Message"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1900606 input] (clojure.core/let [rawinput1900605 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900607 {"Message" (rawinput1900605 "Message")}] (clojure.core/cond-> {} (letvar1900607 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1900607 ["Message"])))))))

(clojure.core/defn- response-describe-fleet-metadata-response ([input] (response-describe-fleet-metadata-response nil input)) ([resultWrapper1900609 input] (clojure.core/let [rawinput1900608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900610 {"CreatedTime" (rawinput1900608 "CreatedTime"), "LastUpdatedTime" (rawinput1900608 "LastUpdatedTime"), "FleetName" (rawinput1900608 "FleetName"), "DisplayName" (rawinput1900608 "DisplayName"), "OptimizeForEndUserLocation" (rawinput1900608 "OptimizeForEndUserLocation"), "CompanyCode" (rawinput1900608 "CompanyCode"), "FleetStatus" (rawinput1900608 "FleetStatus")}] (clojure.core/cond-> {} (letvar1900610 "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (clojure.core/get-in letvar1900610 ["CreatedTime"]))) (letvar1900610 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (clojure.core/get-in letvar1900610 ["LastUpdatedTime"]))) (letvar1900610 "FleetName") (clojure.core/assoc :fleet-name (deser-fleet-name (clojure.core/get-in letvar1900610 ["FleetName"]))) (letvar1900610 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1900610 ["DisplayName"]))) (letvar1900610 "OptimizeForEndUserLocation") (clojure.core/assoc :optimize-for-end-user-location (deser-boolean (clojure.core/get-in letvar1900610 ["OptimizeForEndUserLocation"]))) (letvar1900610 "CompanyCode") (clojure.core/assoc :company-code (deser-company-code (clojure.core/get-in letvar1900610 ["CompanyCode"]))) (letvar1900610 "FleetStatus") (clojure.core/assoc :fleet-status (deser-fleet-status (clojure.core/get-in letvar1900610 ["FleetStatus"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1900612 input] (clojure.core/let [rawinput1900611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900613 {"Message" (rawinput1900611 "Message")}] (clojure.core/cond-> {} (letvar1900613 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1900613 ["Message"])))))))

(clojure.core/defn- response-list-fleets-response ([input] (response-list-fleets-response nil input)) ([resultWrapper1900615 input] (clojure.core/let [rawinput1900614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900616 {"FleetSummaryList" (rawinput1900614 "FleetSummaryList"), "NextToken" (rawinput1900614 "NextToken")}] (clojure.core/cond-> {} (letvar1900616 "FleetSummaryList") (clojure.core/assoc :fleet-summary-list (deser-fleet-summary-list (clojure.core/get-in letvar1900616 ["FleetSummaryList"]))) (letvar1900616 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1900616 ["NextToken"])))))))

(clojure.core/defn- response-describe-company-network-configuration-response ([input] (response-describe-company-network-configuration-response nil input)) ([resultWrapper1900618 input] (clojure.core/let [rawinput1900617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900619 {"VpcId" (rawinput1900617 "VpcId"), "SubnetIds" (rawinput1900617 "SubnetIds"), "SecurityGroupIds" (rawinput1900617 "SecurityGroupIds")}] (clojure.core/cond-> {} (letvar1900619 "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar1900619 ["VpcId"]))) (letvar1900619 "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (clojure.core/get-in letvar1900619 ["SubnetIds"]))) (letvar1900619 "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-ids (clojure.core/get-in letvar1900619 ["SecurityGroupIds"])))))))

(clojure.core/defn- response-list-website-certificate-authorities-response ([input] (response-list-website-certificate-authorities-response nil input)) ([resultWrapper1900621 input] (clojure.core/let [rawinput1900620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900622 {"WebsiteCertificateAuthorities" (rawinput1900620 "WebsiteCertificateAuthorities"), "NextToken" (rawinput1900620 "NextToken")}] (clojure.core/cond-> {} (letvar1900622 "WebsiteCertificateAuthorities") (clojure.core/assoc :website-certificate-authorities (deser-website-ca-summary-list (clojure.core/get-in letvar1900622 ["WebsiteCertificateAuthorities"]))) (letvar1900622 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1900622 ["NextToken"])))))))

(clojure.core/defn- response-sign-out-user-response ([input] (response-sign-out-user-response nil input)) ([resultWrapper1900624 input] (clojure.core/let [rawinput1900623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900625 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-website-certificate-authority-response ([input] (response-describe-website-certificate-authority-response nil input)) ([resultWrapper1900627 input] (clojure.core/let [rawinput1900626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900628 {"Certificate" (rawinput1900626 "Certificate"), "CreatedTime" (rawinput1900626 "CreatedTime"), "DisplayName" (rawinput1900626 "DisplayName")}] (clojure.core/cond-> {} (letvar1900628 "Certificate") (clojure.core/assoc :certificate (deser-certificate (clojure.core/get-in letvar1900628 ["Certificate"]))) (letvar1900628 "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (clojure.core/get-in letvar1900628 ["CreatedTime"]))) (letvar1900628 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1900628 ["DisplayName"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1900630 input] (clojure.core/let [rawinput1900629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900631 {"Message" (rawinput1900629 "Message")}] (clojure.core/cond-> {} (letvar1900631 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1900631 ["Message"])))))))

(clojure.core/defn- response-update-identity-provider-configuration-response ([input] (response-update-identity-provider-configuration-response nil input)) ([resultWrapper1900633 input] (clojure.core/let [rawinput1900632 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900634 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-company-network-configuration-response ([input] (response-update-company-network-configuration-response nil input)) ([resultWrapper1900636 input] (clojure.core/let [rawinput1900635 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900637 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-website-certificate-authority-response ([input] (response-associate-website-certificate-authority-response nil input)) ([resultWrapper1900639 input] (clojure.core/let [rawinput1900638 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900640 {"WebsiteCaId" (rawinput1900638 "WebsiteCaId")}] (clojure.core/cond-> {} (letvar1900640 "WebsiteCaId") (clojure.core/assoc :website-ca-id (deser-id (clojure.core/get-in letvar1900640 ["WebsiteCaId"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1900642 input] (clojure.core/let [rawinput1900641 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900643 {"Message" (rawinput1900641 "Message")}] (clojure.core/cond-> {} (letvar1900643 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1900643 ["Message"])))))))

(clojure.core/defn- response-describe-device-response ([input] (response-describe-device-response nil input)) ([resultWrapper1900645 input] (clojure.core/let [rawinput1900644 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900646 {"Username" (rawinput1900644 "Username"), "LastAccessedTime" (rawinput1900644 "LastAccessedTime"), "Manufacturer" (rawinput1900644 "Manufacturer"), "Status" (rawinput1900644 "Status"), "FirstAccessedTime" (rawinput1900644 "FirstAccessedTime"), "Model" (rawinput1900644 "Model"), "OperatingSystemVersion" (rawinput1900644 "OperatingSystemVersion"), "PatchLevel" (rawinput1900644 "PatchLevel"), "OperatingSystem" (rawinput1900644 "OperatingSystem")}] (clojure.core/cond-> {} (letvar1900646 "Username") (clojure.core/assoc :username (deser-username (clojure.core/get-in letvar1900646 ["Username"]))) (letvar1900646 "LastAccessedTime") (clojure.core/assoc :last-accessed-time (deser-date-time (clojure.core/get-in letvar1900646 ["LastAccessedTime"]))) (letvar1900646 "Manufacturer") (clojure.core/assoc :manufacturer (deser-device-manufacturer (clojure.core/get-in letvar1900646 ["Manufacturer"]))) (letvar1900646 "Status") (clojure.core/assoc :status (deser-device-status (clojure.core/get-in letvar1900646 ["Status"]))) (letvar1900646 "FirstAccessedTime") (clojure.core/assoc :first-accessed-time (deser-date-time (clojure.core/get-in letvar1900646 ["FirstAccessedTime"]))) (letvar1900646 "Model") (clojure.core/assoc :model (deser-device-model (clojure.core/get-in letvar1900646 ["Model"]))) (letvar1900646 "OperatingSystemVersion") (clojure.core/assoc :operating-system-version (deser-device-operating-system-version (clojure.core/get-in letvar1900646 ["OperatingSystemVersion"]))) (letvar1900646 "PatchLevel") (clojure.core/assoc :patch-level (deser-device-patch-level (clojure.core/get-in letvar1900646 ["PatchLevel"]))) (letvar1900646 "OperatingSystem") (clojure.core/assoc :operating-system (deser-device-operating-system-name (clojure.core/get-in letvar1900646 ["OperatingSystem"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1900648 input] (clojure.core/let [rawinput1900647 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900649 {"Message" (rawinput1900647 "Message")}] (clojure.core/cond-> {} (letvar1900649 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1900649 ["Message"])))))))

(clojure.core/defn- response-update-device-policy-configuration-response ([input] (response-update-device-policy-configuration-response nil input)) ([resultWrapper1900651 input] (clojure.core/let [rawinput1900650 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900652 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-fleet-response ([input] (response-create-fleet-response nil input)) ([resultWrapper1900654 input] (clojure.core/let [rawinput1900653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900655 {"FleetArn" (rawinput1900653 "FleetArn")}] (clojure.core/cond-> {} (letvar1900655 "FleetArn") (clojure.core/assoc :fleet-arn (deser-fleet-arn (clojure.core/get-in letvar1900655 ["FleetArn"])))))))

(clojure.core/defn- response-describe-device-policy-configuration-response ([input] (response-describe-device-policy-configuration-response nil input)) ([resultWrapper1900657 input] (clojure.core/let [rawinput1900656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900658 {"DeviceCaCertificate" (rawinput1900656 "DeviceCaCertificate")}] (clojure.core/cond-> {} (letvar1900658 "DeviceCaCertificate") (clojure.core/assoc :device-ca-certificate (deser-certificate (clojure.core/get-in letvar1900658 ["DeviceCaCertificate"])))))))

(clojure.core/defn- response-update-fleet-metadata-response ([input] (response-update-fleet-metadata-response nil input)) ([resultWrapper1900660 input] (clojure.core/let [rawinput1900659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900661 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-website-certificate-authority-response ([input] (response-disassociate-website-certificate-authority-response nil input)) ([resultWrapper1900663 input] (clojure.core/let [rawinput1900662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900664 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-audit-stream-configuration-response ([input] (response-describe-audit-stream-configuration-response nil input)) ([resultWrapper1900666 input] (clojure.core/let [rawinput1900665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900667 {"AuditStreamArn" (rawinput1900665 "AuditStreamArn")}] (clojure.core/cond-> {} (letvar1900667 "AuditStreamArn") (clojure.core/assoc :audit-stream-arn (deser-audit-stream-arn (clojure.core/get-in letvar1900667 ["AuditStreamArn"])))))))

(clojure.core/defn- response-delete-fleet-response ([input] (response-delete-fleet-response nil input)) ([resultWrapper1900669 input] (clojure.core/let [rawinput1900668 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900670 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-devices-response ([input] (response-list-devices-response nil input)) ([resultWrapper1900672 input] (clojure.core/let [rawinput1900671 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900673 {"Devices" (rawinput1900671 "Devices"), "NextToken" (rawinput1900671 "NextToken")}] (clojure.core/cond-> {} (letvar1900673 "Devices") (clojure.core/assoc :devices (deser-device-summary-list (clojure.core/get-in letvar1900673 ["Devices"]))) (letvar1900673 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1900673 ["NextToken"])))))))

(clojure.core/defn- response-describe-identity-provider-configuration-response ([input] (response-describe-identity-provider-configuration-response nil input)) ([resultWrapper1900675 input] (clojure.core/let [rawinput1900674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1900676 {"IdentityProviderType" (rawinput1900674 "IdentityProviderType"), "ServiceProviderSamlMetadata" (rawinput1900674 "ServiceProviderSamlMetadata"), "IdentityProviderSamlMetadata" (rawinput1900674 "IdentityProviderSamlMetadata")}] (clojure.core/cond-> {} (letvar1900676 "IdentityProviderType") (clojure.core/assoc :identity-provider-type (deser-identity-provider-type (clojure.core/get-in letvar1900676 ["IdentityProviderType"]))) (letvar1900676 "ServiceProviderSamlMetadata") (clojure.core/assoc :service-provider-saml-metadata (deser-saml-metadata (clojure.core/get-in letvar1900676 ["ServiceProviderSamlMetadata"]))) (letvar1900676 "IdentityProviderSamlMetadata") (clojure.core/assoc :identity-provider-saml-metadata (deser-saml-metadata (clojure.core/get-in letvar1900676 ["IdentityProviderSamlMetadata"])))))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-identity-provider-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-audit-stream-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-operating-system-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-fleet-metadata-response/created-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-fleet-metadata-response/last-updated-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-fleet-metadata-response/optimize-for-end-user-location (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/boolean))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-fleet-metadata-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.describe-fleet-metadata-response/created-time :portkey.aws.worklink.-2018-09-25.describe-fleet-metadata-response/last-updated-time :portkey.aws.worklink.-2018-09-25/fleet-name :portkey.aws.worklink.-2018-09-25/display-name :portkey.aws.worklink.-2018-09-25.describe-fleet-metadata-response/optimize-for-end-user-location :portkey.aws.worklink.-2018-09-25/company-code :portkey.aws.worklink.-2018-09-25/fleet-status]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-model (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-device-policy-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.worklink.-2018-09-25/subnet-id))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/website-ca-summary-list (clojure.spec.alpha/coll-of :portkey.aws.worklink.-2018-09-25/website-ca-summary))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.worklink.-2018-09-25/security-group-id))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/list-fleets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/fleet-summary-list :portkey.aws.worklink.-2018-09-25/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^subnet-([0-9a-f]{8}|[0-9a-f]{17})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/delete-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/sign-out-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/list-website-certificate-authorities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un [:portkey.aws.worklink.-2018-09-25/max-results :portkey.aws.worklink.-2018-09-25/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-request/device-id (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/id))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25.describe-device-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-company-network-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/vpc-id :portkey.aws.worklink.-2018-09-25/subnet-ids :portkey.aws.worklink.-2018-09-25/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.list-website-certificate-authorities-response/website-certificate-authorities (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/website-ca-summary-list))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/list-website-certificate-authorities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.list-website-certificate-authorities-response/website-certificate-authorities :portkey.aws.worklink.-2018-09-25/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/sign-out-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-company-network-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.disassociate-website-certificate-authority-request/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/id))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/disassociate-website-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25.disassociate-website-certificate-authority-request/website-ca-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.fleet-summary/created-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.fleet-summary/last-updated-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/fleet-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25.fleet-summary/created-time :portkey.aws.worklink.-2018-09-25.fleet-summary/last-updated-time :portkey.aws.worklink.-2018-09-25/fleet-name :portkey.aws.worklink.-2018-09-25/display-name :portkey.aws.worklink.-2018-09-25/company-code :portkey.aws.worklink.-2018-09-25/fleet-status]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-website-certificate-authority-response/created-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-website-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/certificate :portkey.aws.worklink.-2018-09-25.describe-website-certificate-authority-response/created-time :portkey.aws.worklink.-2018-09-25/display-name]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/fleet-summary-list (clojure.spec.alpha/coll-of :portkey.aws.worklink.-2018-09-25/fleet-summary))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-website-certificate-authority-request/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/id))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-website-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25.describe-website-certificate-authority-request/website-ca-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-identity-provider-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-company-network-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.update-device-policy-configuration-request/device-ca-certificate (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/certificate-chain))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-device-policy-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un [:portkey.aws.worklink.-2018-09-25.update-device-policy-configuration-request/device-ca-certificate]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.associate-website-certificate-authority-response/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/id))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/associate-website-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.associate-website-certificate-authority-response/website-ca-id]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.website-ca-summary/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/id))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.website-ca-summary/created-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/website-ca-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.website-ca-summary/website-ca-id :portkey.aws.worklink.-2018-09-25.website-ca-summary/created-time :portkey.aws.worklink.-2018-09-25/display-name]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-audit-stream-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un [:portkey.aws.worklink.-2018-09-25/audit-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-company-network-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25/vpc-id :portkey.aws.worklink.-2018-09-25/subnet-ids :portkey.aws.worklink.-2018-09-25/security-group-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/fleet-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 48)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-z0-9](?:[a-z0-9\-]{0,46}[a-z0-9])?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/last-accessed-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/manufacturer (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-manufacturer))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/status (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-status))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/first-accessed-time (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/model (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-model))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/operating-system-version (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-operating-system-version))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/patch-level (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-patch-level))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-response/operating-system (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-operating-system-name))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/username :portkey.aws.worklink.-2018-09-25.describe-device-response/last-accessed-time :portkey.aws.worklink.-2018-09-25.describe-device-response/manufacturer :portkey.aws.worklink.-2018-09-25.describe-device-response/status :portkey.aws.worklink.-2018-09-25.describe-device-response/first-accessed-time :portkey.aws.worklink.-2018-09-25.describe-device-response/model :portkey.aws.worklink.-2018-09-25.describe-device-response/operating-system-version :portkey.aws.worklink.-2018-09-25.describe-device-response/patch-level :portkey.aws.worklink.-2018-09-25.describe-device-response/operating-system]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-fleet-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-device-policy-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/create-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/fleet-arn]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/certificate-chain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32768)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}\u000D?\u000A)*-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}(\u000D?\u000A)?" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^sg-([0-9a-f]{8}|[0-9a-f]{17})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-status #{:active "ACTIVE" :signed-out "SIGNED_OUT"})

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^vpc-([0-9a-f]{8}|[0-9a-f]{17})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.update-identity-provider-configuration-request/identity-provider-saml-metadata (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/saml-metadata))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-identity-provider-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25/identity-provider-type] :opt-un [:portkey.aws.worklink.-2018-09-25.update-identity-provider-configuration-request/identity-provider-saml-metadata]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-patch-level (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.device-summary/device-id (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/id))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.device-summary/device-id :portkey.aws.worklink.-2018-09-25/device-status]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.update-fleet-metadata-request/optimize-for-end-user-location (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/boolean))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-fleet-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un [:portkey.aws.worklink.-2018-09-25/display-name :portkey.aws.worklink.-2018-09-25.update-fleet-metadata-request/optimize-for-end-user-location]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/identity-provider-type #{"SAML" :saml})

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-summary-list (clojure.spec.alpha/coll-of :portkey.aws.worklink.-2018-09-25/device-summary))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-audit-stream-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/saml-metadata (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 204800))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/audit-stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-device-policy-configuration-response/device-ca-certificate (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/certificate))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-device-policy-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.describe-device-policy-configuration-response/device-ca-certificate]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/list-fleets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/next-token :portkey.aws.worklink.-2018-09-25/max-results]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/update-fleet-metadata-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/disassociate-website-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/list-devices-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn] :opt-un [:portkey.aws.worklink.-2018-09-25/next-token :portkey.aws.worklink.-2018-09-25/max-results]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/fleet-status #{:deleted :creating :deleting "FAILED_TO_DELETE" "FAILED_TO_CREATE" :active "DELETING" "CREATING" "ACTIVE" "DELETED" :failed-to-create :failed-to-delete})

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.create-fleet-request/optimize-for-end-user-location (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/boolean))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/create-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-name] :opt-un [:portkey.aws.worklink.-2018-09-25/display-name :portkey.aws.worklink.-2018-09-25.create-fleet-request/optimize-for-end-user-location]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/associate-website-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink.-2018-09-25/fleet-arn :portkey.aws.worklink.-2018-09-25/certificate] :opt-un [:portkey.aws.worklink.-2018-09-25/display-name]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-operating-system-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/certificate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 8192)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}(\u000D?\u000A)?" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/fleet-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-audit-stream-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/audit-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/company-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/delete-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.list-devices-response/devices (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/device-summary-list))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/list-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25.list-devices-response/devices :portkey.aws.worklink.-2018-09-25/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/device-manufacturer (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-identity-provider-configuration-response/service-provider-saml-metadata (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/saml-metadata))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25.describe-identity-provider-configuration-response/identity-provider-saml-metadata (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/saml-metadata))
(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/describe-identity-provider-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.-2018-09-25/identity-provider-type :portkey.aws.worklink.-2018-09-25.describe-identity-provider-configuration-response/service-provider-saml-metadata :portkey.aws.worklink.-2018-09-25.describe-identity-provider-configuration-response/identity-provider-saml-metadata]))

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.worklink.-2018-09-25/boolean clojure.core/boolean?)

(clojure.core/defn list-website-certificate-authorities "Retrieves a list of certificate authorities added for the current account and\nRegion." ([list-website-certificate-authorities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-website-certificate-authorities-request list-website-certificate-authorities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/list-website-certificate-authorities-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listWebsiteCertificateAuthorities", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/list-website-certificate-authorities-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWebsiteCertificateAuthorities", :http.request.configuration/output-deser-fn response-list-website-certificate-authorities-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-website-certificate-authorities :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/list-website-certificate-authorities-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/list-website-certificate-authorities-response))

(clojure.core/defn list-fleets "Retrieves a list of fleets for the current account and Region." ([] (list-fleets {})) ([list-fleets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-fleets-request list-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/list-fleets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listFleets", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/list-fleets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFleets", :http.request.configuration/output-deser-fn response-list-fleets-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-fleets :args (clojure.spec.alpha/? :portkey.aws.worklink.-2018-09-25/list-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/list-fleets-response))

(clojure.core/defn associate-website-certificate-authority "Imports the root certificate of a certificate authority (CA) used to obtain TLS\ncertificates used by associated websites within the company network." ([associate-website-certificate-authority-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-website-certificate-authority-request associate-website-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/associate-website-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/associateWebsiteCertificateAuthority", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/associate-website-certificate-authority-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateWebsiteCertificateAuthority", :http.request.configuration/output-deser-fn response-associate-website-certificate-authority-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.worklink.-2018-09-25/resource-already-exists-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef associate-website-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/associate-website-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/associate-website-certificate-authority-response))

(clojure.core/defn create-fleet "Creates a fleet. A fleet consists of resources and the configuration that\ndelivers associated websites to authorized users who download and set up the\nAmazon WorkLink app." ([create-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-fleet-request create-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/create-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createFleet", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/create-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFleet", :http.request.configuration/output-deser-fn response-create-fleet-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.worklink.-2018-09-25/resource-already-exists-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-fleet :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/create-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/create-fleet-response))

(clojure.core/defn describe-website-certificate-authority "Provides information about the certificate authority." ([describe-website-certificate-authority-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-website-certificate-authority-request describe-website-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-website-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeWebsiteCertificateAuthority", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-website-certificate-authority-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWebsiteCertificateAuthority", :http.request.configuration/output-deser-fn response-describe-website-certificate-authority-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-website-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-website-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-website-certificate-authority-response))

(clojure.core/defn disassociate-website-certificate-authority "Removes a certificate authority (CA)." ([disassociate-website-certificate-authority-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-website-certificate-authority-request disassociate-website-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/disassociate-website-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/disassociateWebsiteCertificateAuthority", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/disassociate-website-certificate-authority-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateWebsiteCertificateAuthority", :http.request.configuration/output-deser-fn response-disassociate-website-certificate-authority-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disassociate-website-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/disassociate-website-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/disassociate-website-certificate-authority-response))

(clojure.core/defn update-company-network-configuration "Updates the company network configuration for the fleet." ([update-company-network-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-company-network-configuration-request update-company-network-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/update-company-network-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateCompanyNetworkConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/update-company-network-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCompanyNetworkConfiguration", :http.request.configuration/output-deser-fn response-update-company-network-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-company-network-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/update-company-network-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/update-company-network-configuration-response))

(clojure.core/defn update-identity-provider-configuration "Updates the identity provider configuration for the fleet." ([update-identity-provider-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-identity-provider-configuration-request update-identity-provider-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/update-identity-provider-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateIdentityProviderConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/update-identity-provider-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateIdentityProviderConfiguration", :http.request.configuration/output-deser-fn response-update-identity-provider-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-identity-provider-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/update-identity-provider-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/update-identity-provider-configuration-response))

(clojure.core/defn update-fleet-metadata "Updates fleet metadata, such as DisplayName." ([update-fleet-metadata-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-fleet-metadata-request update-fleet-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/update-fleet-metadata-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/UpdateFleetMetadata", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/update-fleet-metadata-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFleetMetadata", :http.request.configuration/output-deser-fn response-update-fleet-metadata-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-fleet-metadata :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/update-fleet-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/update-fleet-metadata-response))

(clojure.core/defn describe-fleet-metadata "Provides basic information for the specified fleet, excluding identity provider,\nnetworking, and device configuration details." ([describe-fleet-metadata-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-fleet-metadata-request describe-fleet-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-fleet-metadata-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeFleetMetadata", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-fleet-metadata-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFleetMetadata", :http.request.configuration/output-deser-fn response-describe-fleet-metadata-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-metadata :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-fleet-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-fleet-metadata-response))

(clojure.core/defn describe-company-network-configuration "Describes the networking configuration to access the internal websites\nassociated with the specified fleet." ([describe-company-network-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-company-network-configuration-request describe-company-network-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-company-network-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeCompanyNetworkConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-company-network-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCompanyNetworkConfiguration", :http.request.configuration/output-deser-fn response-describe-company-network-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-company-network-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-company-network-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-company-network-configuration-response))

(clojure.core/defn sign-out-user "Signs the user out from all of their devices. The user can sign in again if they\nhave valid credentials." ([sign-out-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-sign-out-user-request sign-out-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/sign-out-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signOutUser", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/sign-out-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SignOutUser", :http.request.configuration/output-deser-fn response-sign-out-user-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef sign-out-user :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/sign-out-user-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/sign-out-user-response))

(clojure.core/defn update-device-policy-configuration "Updates the device policy configuration for the fleet." ([update-device-policy-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-device-policy-configuration-request update-device-policy-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/update-device-policy-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateDevicePolicyConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/update-device-policy-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDevicePolicyConfiguration", :http.request.configuration/output-deser-fn response-update-device-policy-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-device-policy-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/update-device-policy-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/update-device-policy-configuration-response))

(clojure.core/defn update-audit-stream-configuration "Updates the audit stream configuration for the fleet." ([update-audit-stream-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-audit-stream-configuration-request update-audit-stream-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/update-audit-stream-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateAuditStreamConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/update-audit-stream-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAuditStreamConfiguration", :http.request.configuration/output-deser-fn response-update-audit-stream-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-audit-stream-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/update-audit-stream-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/update-audit-stream-configuration-response))

(clojure.core/defn delete-fleet "Deletes a fleet. Prevents users from accessing previously associated websites." ([delete-fleet-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-fleet-request delete-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/delete-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteFleet", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/delete-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFleet", :http.request.configuration/output-deser-fn response-delete-fleet-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-fleet :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/delete-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/delete-fleet-response))

(clojure.core/defn list-devices "Retrieves a list of devices registered with the specified fleet." ([list-devices-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listDevices", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/list-devices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn response-list-devices-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/list-devices-response))

(clojure.core/defn describe-identity-provider-configuration "Describes the identity provider configuration of the specified fleet." ([describe-identity-provider-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-identity-provider-configuration-request describe-identity-provider-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-identity-provider-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeIdentityProviderConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-identity-provider-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentityProviderConfiguration", :http.request.configuration/output-deser-fn response-describe-identity-provider-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-identity-provider-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-identity-provider-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-identity-provider-configuration-response))

(clojure.core/defn describe-audit-stream-configuration "Describes the configuration for delivering audit streams to the customer\naccount." ([describe-audit-stream-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-audit-stream-configuration-request describe-audit-stream-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-audit-stream-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeAuditStreamConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-audit-stream-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAuditStreamConfiguration", :http.request.configuration/output-deser-fn response-describe-audit-stream-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-audit-stream-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-audit-stream-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-audit-stream-configuration-response))

(clojure.core/defn describe-device-policy-configuration "Describes the device policy configuration for the specified fleet." ([describe-device-policy-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-device-policy-configuration-request describe-device-policy-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-device-policy-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeDevicePolicyConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-device-policy-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevicePolicyConfiguration", :http.request.configuration/output-deser-fn response-describe-device-policy-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-device-policy-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-device-policy-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-device-policy-configuration-response))

(clojure.core/defn describe-device "Provides information about a user's device." ([describe-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-device-request describe-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.worklink.-2018-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink.-2018-09-25/describe-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeDevice", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink.-2018-09-25/describe-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevice", :http.request.configuration/output-deser-fn response-describe-device-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink.-2018-09-25/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink.-2018-09-25/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink.-2018-09-25/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink.-2018-09-25/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink.-2018-09-25/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-device :args (clojure.spec.alpha/tuple :portkey.aws.worklink.-2018-09-25/describe-device-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink.-2018-09-25/describe-device-response))
