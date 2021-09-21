package com.synectiks.aws.entities.s3;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XformS3RDSEntity {
	private String description;
	private String port;
	private String address;
	private String hostedZoneID;
	private String status;
	private String dbType;
	private String isPublic;
	private String instanceType;
	private String isStorageEncrypted;
	private String storageType;
	private String regionInstance;
	private String createdTime;
	private String availabilityZone;
	private String secondaryAvailabilityZone;
	private String isMultiAvailabilityZone;
	private String kmsKeyID;
	private String dbClusterName;
	private EncryptionKey encryptionKey;
	private String autoMinorVersionUpgrade;
	private String backupRetentionPeriod;
	private String engineVersion;
	private List<OptionGroup> optionGroups;
	private List<ParameterGroup> parameterGroups;
	private List<BoundRule> inboundRules;
	private List<BoundRule> outboundRules;
	private List<NIC> nics;
	private Vpc vpc;
	private List<Tag> tags;
	private String id;
	private String type;
	private String name;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("port")
	public String getPort() {
		return port;
	}

	@JsonProperty("port")
	public void setPort(String value) {
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

	@JsonProperty("dbType")
	public String getDBType() {
		return dbType;
	}

	@JsonProperty("dbType")
	public void setDBType(String value) {
		this.dbType = value;
	}

	@JsonProperty("isPublic")
	public String getIsPublic() {
		return isPublic;
	}

	@JsonProperty("isPublic")
	public void setIsPublic(String value) {
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
	public String getIsStorageEncrypted() {
		return isStorageEncrypted;
	}

	@JsonProperty("isStorageEncrypted")
	public void setIsStorageEncrypted(String value) {
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
	public String getCreatedTime() {
		return createdTime;
	}

	@JsonProperty("createdTime")
	public void setCreatedTime(String value) {
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
	public String getIsMultiAvailabilityZone() {
		return isMultiAvailabilityZone;
	}

	@JsonProperty("isMultiAvailabilityZone")
	public void setIsMultiAvailabilityZone(String value) {
		this.isMultiAvailabilityZone = value;
	}

	@JsonProperty("kmsKeyId")
	public String getKmsKeyID() {
		return kmsKeyID;
	}

	@JsonProperty("kmsKeyId")
	public void setKmsKeyID(String value) {
		this.kmsKeyID = value;
	}

	@JsonProperty("dbClusterName")
	public String getDBClusterName() {
		return dbClusterName;
	}

	@JsonProperty("dbClusterName")
	public void setDBClusterName(String value) {
		this.dbClusterName = value;
	}

	@JsonProperty("encryptionKey")
	public EncryptionKey getEncryptionKey() {
		return encryptionKey;
	}

	@JsonProperty("encryptionKey")
	public void setEncryptionKey(EncryptionKey value) {
		this.encryptionKey = value;
	}

	@JsonProperty("autoMinorVersionUpgrade")
	public String getAutoMinorVersionUpgrade() {
		return autoMinorVersionUpgrade;
	}

	@JsonProperty("autoMinorVersionUpgrade")
	public void setAutoMinorVersionUpgrade(String value) {
		this.autoMinorVersionUpgrade = value;
	}

	@JsonProperty("backupRetentionPeriod")
	public String getBackupRetentionPeriod() {
		return backupRetentionPeriod;
	}

	@JsonProperty("backupRetentionPeriod")
	public void setBackupRetentionPeriod(String value) {
		this.backupRetentionPeriod = value;
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
	public Vpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(Vpc value) {
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

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
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

}
