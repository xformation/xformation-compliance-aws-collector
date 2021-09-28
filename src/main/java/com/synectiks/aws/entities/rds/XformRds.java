package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

import software.amazon.awssdk.services.rds.model.DBInstanceRole;
import software.amazon.awssdk.services.rds.model.DBInstanceStatusInfo;
import software.amazon.awssdk.services.rds.model.DBSecurityGroupMembership;
import software.amazon.awssdk.services.rds.model.DomainMembership;
import software.amazon.awssdk.services.rds.model.ProcessorFeature;

public class XformRds implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	private Integer port;
	private String address;
	private String hostedZoneID;
	private String status;
	private String dbType;
	private Boolean isPublic;
	private String instanceType;
	private Boolean isStorageEncrypted;
	private String regionInstance;
	private Instant createdTime;
	private Boolean isMultiAvailabilityZone;
	private String dbClusterName;
	private EncryptionKey encryptionKey;
	private List<OptionGroup> optionGroups;
	private List<ParameterGroup> parameterGroups;
	private List<BoundRule> inboundRules;
	private List<BoundRule> outboundRules;
	private List<NIC> nics;
	private RdsVpc vpc;
	private List<Tag> tags;
	private String id;
	private String type;
	private String name;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;
	
	
	private String dbInstanceIdentifier;
    private String dbInstanceClass;
    private String engine;
    private String dbInstanceStatus;
    private String masterUsername;
    private String dbName;
    private XformRdsEndpoint endpoint;
    private Integer allocatedStorage;
    private Instant instanceCreateTime;
    private String preferredBackupWindow;
    private Integer backupRetentionPeriod;
    private List<DBSecurityGroupMembership> dbSecurityGroups;
    private List<XformRdsVpcSecurityGroupMembership> vpcSecurityGroups;
    private List<XformRdsDBParameterGroupStatus> dbParameterGroups;
    private String availabilityZone;
    private XformRdsDBSubnetGroup dbSubnetGroup;
    private String preferredMaintenanceWindow;
    private XormRdsPendingModifiedValues pendingModifiedValues;
    private Instant latestRestorableTime;
    private Boolean multiAZ;
    private String engineVersion;
    private Boolean autoMinorVersionUpgrade;
    private String readReplicaSourceDBInstanceIdentifier;
    private List<String> readReplicaDBInstanceIdentifiers;
    private List<String> readReplicaDBClusterIdentifiers;
    private String licenseModel;
    private Integer iops;
    private List<XformRdsOptionGroupMembership> optionGroupMemberships;
    private String characterSetName;
    private String secondaryAvailabilityZone;
    private Boolean publiclyAccessible;
    private List<DBInstanceStatusInfo> statusInfos;
    private String storageType;
    private String tdeCredentialArn;
    private Integer dbInstancePort;
    private String dbClusterIdentifier;
    private Boolean storageEncrypted;
    private String kmsKeyId;
    private String dbiResourceId;
    private String caCertificateIdentifier;
    private List<DomainMembership> domainMemberships;
    private Boolean copyTagsToSnapshot;
    private Integer monitoringInterval;
    private String enhancedMonitoringResourceArn;
    private String monitoringRoleArn;
    private Integer promotionTier;
    private String dbInstanceArn;
    private String timezone;
    private Boolean iamDatabaseAuthenticationEnabled;
    private Boolean performanceInsightsEnabled;
    private String performanceInsightsKMSKeyId;
    private Integer performanceInsightsRetentionPeriod;
    private List<String> enabledCloudwatchLogsExports;
    private List<ProcessorFeature> processorFeatures;
    private Boolean deletionProtection;
    private List<DBInstanceRole> associatedRoles;
    private XformRdsEndpoint listenerEndpoint;
    private Integer maxAllocatedStorage;

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("port")
	public Integer getPort() {
		return port;
	}

	@JsonProperty("port")
	public void setPort(Integer value) {
		this.port = value;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String value) {
		this.address = value;
	}

	@JsonProperty("hostedZoneId")
	public String getHostedZoneID() {
		return hostedZoneID;
	}

	@JsonProperty("hostedZoneId")
	public void setHostedZoneID(String value) {
		this.hostedZoneID = value;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String value) {
		this.status = value;
	}

	@JsonProperty("isPublic")
	public Boolean getIsPublic() {
		return isPublic;
	}

	@JsonProperty("isPublic")
	public void setIsPublic(Boolean value) {
		this.isPublic = value;
	}

	@JsonProperty("instanceType")
	public String getInstanceType() {
		return instanceType;
	}

	@JsonProperty("instanceType")
	public void setInstanceType(String value) {
		this.instanceType = value;
	}

	@JsonProperty("isStorageEncrypted")
	public Boolean getIsStorageEncrypted() {
		return isStorageEncrypted;
	}

	@JsonProperty("isStorageEncrypted")
	public void setIsStorageEncrypted(Boolean value) {
		this.isStorageEncrypted = value;
	}

	@JsonProperty("storageType")
	public String getStorageType() {
		return storageType;
	}

	@JsonProperty("storageType")
	public void setStorageType(String value) {
		this.storageType = value;
	}

	@JsonProperty("regionInstance")
	public String getRegionInstance() {
		return regionInstance;
	}

	@JsonProperty("regionInstance")
	public void setRegionInstance(String value) {
		this.regionInstance = value;
	}

	@JsonProperty("createdTime")
	public Instant getCreatedTime() {
		return createdTime;
	}

	@JsonProperty("createdTime")
	public void setCreatedTime(Instant value) {
		this.createdTime = value;
	}

	@JsonProperty("availabilityZone")
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	@JsonProperty("availabilityZone")
	public void setAvailabilityZone(String value) {
		this.availabilityZone = value;
	}

	@JsonProperty("secondaryAvailabilityZone")
	public String getSecondaryAvailabilityZone() {
		return secondaryAvailabilityZone;
	}

	@JsonProperty("secondaryAvailabilityZone")
	public void setSecondaryAvailabilityZone(String value) {
		this.secondaryAvailabilityZone = value;
	}

	@JsonProperty("isMultiAvailabilityZone")
	public Boolean getIsMultiAvailabilityZone() {
		return isMultiAvailabilityZone;
	}

	@JsonProperty("isMultiAvailabilityZone")
	public void setIsMultiAvailabilityZone(Boolean value) {
		this.isMultiAvailabilityZone = value;
	}

	@JsonProperty("encryptionKey")
	public EncryptionKey getEncryptionKey() {
		return encryptionKey;
	}

	@JsonProperty("encryptionKey")
	public void setEncryptionKey(EncryptionKey value) {
		this.encryptionKey = value;
	}

	@JsonProperty("engineVersion")
	public String getEngineVersion() {
		return engineVersion;
	}

	@JsonProperty("engineVersion")
	public void setEngineVersion(String value) {
		this.engineVersion = value;
	}

	@JsonProperty("optionGroups")
	public List<OptionGroup> getOptionGroups() {
		return optionGroups;
	}

	@JsonProperty("optionGroups")
	public void setOptionGroups(List<OptionGroup> value) {
		this.optionGroups = value;
	}

	@JsonProperty("parameterGroups")
	public List<ParameterGroup> getParameterGroups() {
		return parameterGroups;
	}

	@JsonProperty("parameterGroups")
	public void setParameterGroups(List<ParameterGroup> value) {
		this.parameterGroups = value;
	}

	@JsonProperty("inboundRules")
	public List<BoundRule> getInboundRules() {
		return inboundRules;
	}

	@JsonProperty("inboundRules")
	public void setInboundRules(List<BoundRule> value) {
		this.inboundRules = value;
	}

	@JsonProperty("outboundRules")
	public List<BoundRule> getOutboundRules() {
		return outboundRules;
	}

	@JsonProperty("outboundRules")
	public void setOutboundRules(List<BoundRule> value) {
		this.outboundRules = value;
	}

	@JsonProperty("nics")
	public List<NIC> getNics() {
		return nics;
	}

	@JsonProperty("nics")
	public void setNics(List<NIC> value) {
		this.nics = value;
	}

	@JsonProperty("vpc")
	public RdsVpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(RdsVpc value) {
		this.vpc = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String value) {
		this.region = value;
	}

	@JsonProperty("externalFindings")
	public ExternalFindings getExternalFindings() {
		return externalFindings;
	}

	@JsonProperty("externalFindings")
	public void setExternalFindings(ExternalFindings value) {
		this.externalFindings = value;
	}

	@JsonProperty("dbType")
	public String getDbType() {
		return dbType;
	}

	@JsonProperty("dbType")
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	@JsonProperty("dbClusterName")
	public String getDbClusterName() {
		return dbClusterName;
	}

	@JsonProperty("dbType")
	public void setDbClusterName(String dbClusterName) {
		this.dbClusterName = dbClusterName;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("dbInstanceIdentifier")
	public String getDbInstanceIdentifier() {
		return dbInstanceIdentifier;
	}

	@JsonProperty("dbInstanceIdentifier")
	public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
		this.dbInstanceIdentifier = dbInstanceIdentifier;
	}

	@JsonProperty("dbInstanceClass")
	public String getDbInstanceClass() {
		return dbInstanceClass;
	}

	@JsonProperty("dbInstanceClass")
	public void setDbInstanceClass(String dbInstanceClass) {
		this.dbInstanceClass = dbInstanceClass;
	}

	@JsonProperty("engine")
	public String getEngine() {
		return engine;
	}

	@JsonProperty("engine")
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@JsonProperty("dbInstanceStatus")
	public String getDbInstanceStatus() {
		return dbInstanceStatus;
	}

	@JsonProperty("dbInstanceStatus")
	public void setDbInstanceStatus(String dbInstanceStatus) {
		this.dbInstanceStatus = dbInstanceStatus;
	}

	@JsonProperty("masterUsername")
	public String getMasterUsername() {
		return masterUsername;
	}

	@JsonProperty("masterUsername")
	public void setMasterUsername(String masterUsername) {
		this.masterUsername = masterUsername;
	}

	@JsonProperty("dbName")
	public String getDbName() {
		return dbName;
	}

	@JsonProperty("dbName")
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	@JsonProperty("endpoint")
	public XformRdsEndpoint getEndpoint() {
		return endpoint;
	}

	@JsonProperty("endpoint")
	public void setEndpoint(XformRdsEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	@JsonProperty("allocatedStorage")
	public Integer getAllocatedStorage() {
		return allocatedStorage;
	}

	@JsonProperty("allocatedStorage")
	public void setAllocatedStorage(Integer allocatedStorage) {
		this.allocatedStorage = allocatedStorage;
	}

	@JsonProperty("instanceCreateTime")
	public Instant getInstanceCreateTime() {
		return instanceCreateTime;
	}

	@JsonProperty("instanceCreateTime")
	public void setInstanceCreateTime(Instant instanceCreateTime) {
		this.instanceCreateTime = instanceCreateTime;
	}

	@JsonProperty("preferredBackupWindow")
	public String getPreferredBackupWindow() {
		return preferredBackupWindow;
	}

	@JsonProperty("preferredBackupWindow")
	public void setPreferredBackupWindow(String preferredBackupWindow) {
		this.preferredBackupWindow = preferredBackupWindow;
	}

	@JsonProperty("backupRetentionPeriod")
	public Integer getBackupRetentionPeriod() {
		return backupRetentionPeriod;
	}

	@JsonProperty("backupRetentionPeriod")
	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	@JsonProperty("dbSecurityGroups")
	public List<DBSecurityGroupMembership> getDbSecurityGroups() {
		return dbSecurityGroups;
	}

	@JsonProperty("dbSecurityGroups")
	public void setDbSecurityGroups(List<DBSecurityGroupMembership> dbSecurityGroups) {
		this.dbSecurityGroups = dbSecurityGroups;
	}

	@JsonProperty("vpcSecurityGroups")
	public List<XformRdsVpcSecurityGroupMembership> getVpcSecurityGroups() {
		return vpcSecurityGroups;
	}

	@JsonProperty("vpcSecurityGroups")
	public void setVpcSecurityGroups(List<XformRdsVpcSecurityGroupMembership> vpcSecurityGroups) {
		this.vpcSecurityGroups = vpcSecurityGroups;
	}

	@JsonProperty("dbParameterGroups")
	public List<XformRdsDBParameterGroupStatus> getDbParameterGroups() {
		return dbParameterGroups;
	}

	@JsonProperty("dbParameterGroups")
	public void setDbParameterGroups(List<XformRdsDBParameterGroupStatus> dbParameterGroups) {
		this.dbParameterGroups = dbParameterGroups;
	}

	@JsonProperty("dbSubnetGroup")
	public XformRdsDBSubnetGroup getDbSubnetGroup() {
		return dbSubnetGroup;
	}

	@JsonProperty("dbSubnetGroup")
	public void setDbSubnetGroup(XformRdsDBSubnetGroup dbSubnetGroup) {
		this.dbSubnetGroup = dbSubnetGroup;
	}

	@JsonProperty("preferredMaintenanceWindow")
	public String getPreferredMaintenanceWindow() {
		return preferredMaintenanceWindow;
	}

	@JsonProperty("preferredMaintenanceWindow")
	public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
		this.preferredMaintenanceWindow = preferredMaintenanceWindow;
	}

	@JsonProperty("pendingModifiedValues")
	public XormRdsPendingModifiedValues getPendingModifiedValues() {
		return pendingModifiedValues;
	}

	@JsonProperty("pendingModifiedValues")
	public void setPendingModifiedValues(XormRdsPendingModifiedValues pendingModifiedValues) {
		this.pendingModifiedValues = pendingModifiedValues;
	}

	@JsonProperty("latestRestorableTime")
	public Instant getLatestRestorableTime() {
		return latestRestorableTime;
	}

	@JsonProperty("latestRestorableTime")
	public void setLatestRestorableTime(Instant latestRestorableTime) {
		this.latestRestorableTime = latestRestorableTime;
	}

	@JsonProperty("multiAZ")
	public Boolean getMultiAZ() {
		return multiAZ;
	}

	@JsonProperty("multiAZ")
	public void setMultiAZ(Boolean multiAZ) {
		this.multiAZ = multiAZ;
	}

	@JsonProperty("autoMinorVersionUpgrade")
	public Boolean getAutoMinorVersionUpgrade() {
		return autoMinorVersionUpgrade;
	}

	@JsonProperty("autoMinorVersionUpgrade")
	public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
		this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
	}

	@JsonProperty("readReplicaSourceDBInstanceIdentifier")
	public String getReadReplicaSourceDBInstanceIdentifier() {
		return readReplicaSourceDBInstanceIdentifier;
	}

	@JsonProperty("readReplicaSourceDBInstanceIdentifier")
	public void setReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
		this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
	}

	@JsonProperty("readReplicaDBInstanceIdentifiers")
	public List<String> getReadReplicaDBInstanceIdentifiers() {
		return readReplicaDBInstanceIdentifiers;
	}

	@JsonProperty("readReplicaDBInstanceIdentifiers")
	public void setReadReplicaDBInstanceIdentifiers(List<String> readReplicaDBInstanceIdentifiers) {
		this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiers;
	}

	@JsonProperty("readReplicaDBClusterIdentifiers")
	public List<String> getReadReplicaDBClusterIdentifiers() {
		return readReplicaDBClusterIdentifiers;
	}

	@JsonProperty("readReplicaDBClusterIdentifiers")
	public void setReadReplicaDBClusterIdentifiers(List<String> readReplicaDBClusterIdentifiers) {
		this.readReplicaDBClusterIdentifiers = readReplicaDBClusterIdentifiers;
	}

	@JsonProperty("licenseModel")
	public String getLicenseModel() {
		return licenseModel;
	}

	@JsonProperty("licenseModel")
	public void setLicenseModel(String licenseModel) {
		this.licenseModel = licenseModel;
	}

	@JsonProperty("iops")
	public Integer getIops() {
		return iops;
	}

	@JsonProperty("iops")
	public void setIops(Integer iops) {
		this.iops = iops;
	}

	@JsonProperty("optionGroupMemberships")
	public List<XformRdsOptionGroupMembership> getOptionGroupMemberships() {
		return optionGroupMemberships;
	}

	@JsonProperty("optionGroupMemberships")
	public void setOptionGroupMemberships(List<XformRdsOptionGroupMembership> optionGroupMemberships) {
		this.optionGroupMemberships = optionGroupMemberships;
	}

	@JsonProperty("characterSetName")
	public String getCharacterSetName() {
		return characterSetName;
	}

	@JsonProperty("characterSetName")
	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	@JsonProperty("publiclyAccessible")
	public Boolean getPubliclyAccessible() {
		return publiclyAccessible;
	}

	@JsonProperty("publiclyAccessible")
	public void setPubliclyAccessible(Boolean publiclyAccessible) {
		this.publiclyAccessible = publiclyAccessible;
	}

	@JsonProperty("statusInfos")
	public List<DBInstanceStatusInfo> getStatusInfos() {
		return statusInfos;
	}

	@JsonProperty("statusInfos")
	public void setStatusInfos(List<DBInstanceStatusInfo> statusInfos) {
		this.statusInfos = statusInfos;
	}

	@JsonProperty("tdeCredentialArn")
	public String getTdeCredentialArn() {
		return tdeCredentialArn;
	}

	@JsonProperty("tdeCredentialArn")
	public void setTdeCredentialArn(String tdeCredentialArn) {
		this.tdeCredentialArn = tdeCredentialArn;
	}

	@JsonProperty("dbInstancePort")
	public Integer getDbInstancePort() {
		return dbInstancePort;
	}

	@JsonProperty("dbInstancePort")
	public void setDbInstancePort(Integer dbInstancePort) {
		this.dbInstancePort = dbInstancePort;
	}

	@JsonProperty("dbClusterIdentifier")
	public String getDbClusterIdentifier() {
		return dbClusterIdentifier;
	}

	@JsonProperty("dbClusterIdentifier")
	public void setDbClusterIdentifier(String dbClusterIdentifier) {
		this.dbClusterIdentifier = dbClusterIdentifier;
	}

	@JsonProperty("storageEncrypted")
	public Boolean getStorageEncrypted() {
		return storageEncrypted;
	}

	@JsonProperty("storageEncrypted")
	public void setStorageEncrypted(Boolean storageEncrypted) {
		this.storageEncrypted = storageEncrypted;
	}

	@JsonProperty("kmsKeyId")
	public String getKmsKeyId() {
		return kmsKeyId;
	}

	@JsonProperty("kmsKeyId")
	public void setKmsKeyId(String kmsKeyId) {
		this.kmsKeyId = kmsKeyId;
	}

	@JsonProperty("dbiResourceId")
	public String getDbiResourceId() {
		return dbiResourceId;
	}

	@JsonProperty("dbiResourceId")
	public void setDbiResourceId(String dbiResourceId) {
		this.dbiResourceId = dbiResourceId;
	}

	@JsonProperty("caCertificateIdentifier")
	public String getCaCertificateIdentifier() {
		return caCertificateIdentifier;
	}

	@JsonProperty("caCertificateIdentifier")
	public void setCaCertificateIdentifier(String caCertificateIdentifier) {
		this.caCertificateIdentifier = caCertificateIdentifier;
	}

	@JsonProperty("domainMemberships")
	public List<DomainMembership> getDomainMemberships() {
		return domainMemberships;
	}

	@JsonProperty("domainMemberships")
	public void setDomainMemberships(List<DomainMembership> domainMemberships) {
		this.domainMemberships = domainMemberships;
	}

	@JsonProperty("copyTagsToSnapshot")
	public Boolean getCopyTagsToSnapshot() {
		return copyTagsToSnapshot;
	}

	@JsonProperty("copyTagsToSnapshot")
	public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
		this.copyTagsToSnapshot = copyTagsToSnapshot;
	}

	@JsonProperty("monitoringInterval")
	public Integer getMonitoringInterval() {
		return monitoringInterval;
	}

	@JsonProperty("monitoringInterval")
	public void setMonitoringInterval(Integer monitoringInterval) {
		this.monitoringInterval = monitoringInterval;
	}

	@JsonProperty("enhancedMonitoringResourceArn")
	public String getEnhancedMonitoringResourceArn() {
		return enhancedMonitoringResourceArn;
	}

	@JsonProperty("enhancedMonitoringResourceArn")
	public void setEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
		this.enhancedMonitoringResourceArn = enhancedMonitoringResourceArn;
	}

	@JsonProperty("monitoringRoleArn")
	public String getMonitoringRoleArn() {
		return monitoringRoleArn;
	}

	@JsonProperty("monitoringRoleArn")
	public void setMonitoringRoleArn(String monitoringRoleArn) {
		this.monitoringRoleArn = monitoringRoleArn;
	}

	@JsonProperty("promotionTier")
	public Integer getPromotionTier() {
		return promotionTier;
	}

	@JsonProperty("promotionTier")
	public void setPromotionTier(Integer promotionTier) {
		this.promotionTier = promotionTier;
	}

	@JsonProperty("dbInstanceArn")
	public String getDbInstanceArn() {
		return dbInstanceArn;
	}

	@JsonProperty("dbInstanceArn")
	public void setDbInstanceArn(String dbInstanceArn) {
		this.dbInstanceArn = dbInstanceArn;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@JsonProperty("iamDatabaseAuthenticationEnabled")
	public Boolean getIamDatabaseAuthenticationEnabled() {
		return iamDatabaseAuthenticationEnabled;
	}

	@JsonProperty("iamDatabaseAuthenticationEnabled")
	public void setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
		this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
	}

	@JsonProperty("performanceInsightsEnabled")
	public Boolean getPerformanceInsightsEnabled() {
		return performanceInsightsEnabled;
	}

	@JsonProperty("performanceInsightsEnabled")
	public void setPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
		this.performanceInsightsEnabled = performanceInsightsEnabled;
	}

	@JsonProperty("performanceInsightsKMSKeyId")
	public String getPerformanceInsightsKMSKeyId() {
		return performanceInsightsKMSKeyId;
	}

	@JsonProperty("performanceInsightsKMSKeyId")
	public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
		this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
	}

	@JsonProperty("performanceInsightsRetentionPeriod")
	public Integer getPerformanceInsightsRetentionPeriod() {
		return performanceInsightsRetentionPeriod;
	}

	@JsonProperty("performanceInsightsRetentionPeriod")
	public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
		this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
	}

	@JsonProperty("enabledCloudwatchLogsExports")
	public List<String> getEnabledCloudwatchLogsExports() {
		return enabledCloudwatchLogsExports;
	}

	@JsonProperty("enabledCloudwatchLogsExports")
	public void setEnabledCloudwatchLogsExports(List<String> enabledCloudwatchLogsExports) {
		this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
	}

	@JsonProperty("processorFeatures")
	public List<ProcessorFeature> getProcessorFeatures() {
		return processorFeatures;
	}

	@JsonProperty("processorFeatures")
	public void setProcessorFeatures(List<ProcessorFeature> processorFeatures) {
		this.processorFeatures = processorFeatures;
	}

	@JsonProperty("deletionProtection")
	public Boolean getDeletionProtection() {
		return deletionProtection;
	}

	@JsonProperty("deletionProtection")
	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
	}

	@JsonProperty("associatedRoles")
	public List<DBInstanceRole> getAssociatedRoles() {
		return associatedRoles;
	}

	@JsonProperty("associatedRoles")
	public void setAssociatedRoles(List<DBInstanceRole> associatedRoles) {
		this.associatedRoles = associatedRoles;
	}

	@JsonProperty("listenerEndpoint")
	public XformRdsEndpoint getListenerEndpoint() {
		return listenerEndpoint;
	}

	@JsonProperty("listenerEndpoint")
	public void setListenerEndpoint(XformRdsEndpoint listenerEndpoint) {
		this.listenerEndpoint = listenerEndpoint;
	}

	@JsonProperty("maxAllocatedStorage")
	public Integer getMaxAllocatedStorage() {
		return maxAllocatedStorage;
	}

	@JsonProperty("maxAllocatedStorage")
	public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
		this.maxAllocatedStorage = maxAllocatedStorage;
	}
}
