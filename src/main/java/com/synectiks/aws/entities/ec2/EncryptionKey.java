package com.synectiks.aws.entities.ec2;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

public class EncryptionKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String arn;
	private String awsAccountID;
	private String creationDate;
	private String deletionDate;
	private String description;
	private String enabled;
	private String expirationModel;
	private String keyState;
	private String keyUsage;
	private String origin;
	private String customerMasterKeySpec;
	private String isSymmetricKey;
	private String keyManager;
	private List<ManagedPolicy> aliases;
	private String isCustomerManaged;
	private String rotationStatus;
	private List<Policy> policies;
	private List<AssetsStat> kmsAssetsStats;
	private String accessAnalyzerFindingCount;
	private List<Tag> tags;
	private String id;
	private String type;
	private String name;
	private String dome9ID;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

	@JsonProperty("arn")
	public String getArn() {
		return arn;
	}

	@JsonProperty("arn")
	public void setArn(String value) {
		this.arn = value;
	}

	@JsonProperty("awsAccountId")
	public String getAwsAccountID() {
		return awsAccountID;
	}

	@JsonProperty("awsAccountId")
	public void setAwsAccountID(String value) {
		this.awsAccountID = value;
	}

	@JsonProperty("creationDate")
	public String getCreationDate() {
		return creationDate;
	}

	@JsonProperty("creationDate")
	public void setCreationDate(String value) {
		this.creationDate = value;
	}

	@JsonProperty("deletionDate")
	public String getDeletionDate() {
		return deletionDate;
	}

	@JsonProperty("deletionDate")
	public void setDeletionDate(String value) {
		this.deletionDate = value;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("enabled")
	public String getEnabled() {
		return enabled;
	}

	@JsonProperty("enabled")
	public void setEnabled(String value) {
		this.enabled = value;
	}

	@JsonProperty("expirationModel")
	public String getExpirationModel() {
		return expirationModel;
	}

	@JsonProperty("expirationModel")
	public void setExpirationModel(String value) {
		this.expirationModel = value;
	}

	@JsonProperty("keyState")
	public String getKeyState() {
		return keyState;
	}

	@JsonProperty("keyState")
	public void setKeyState(String value) {
		this.keyState = value;
	}

	@JsonProperty("keyUsage")
	public String getKeyUsage() {
		return keyUsage;
	}

	@JsonProperty("keyUsage")
	public void setKeyUsage(String value) {
		this.keyUsage = value;
	}

	@JsonProperty("origin")
	public String getOrigin() {
		return origin;
	}

	@JsonProperty("origin")
	public void setOrigin(String value) {
		this.origin = value;
	}

	@JsonProperty("customerMasterKeySpec")
	public String getCustomerMasterKeySpec() {
		return customerMasterKeySpec;
	}

	@JsonProperty("customerMasterKeySpec")
	public void setCustomerMasterKeySpec(String value) {
		this.customerMasterKeySpec = value;
	}

	@JsonProperty("isSymmetricKey")
	public String getIsSymmetricKey() {
		return isSymmetricKey;
	}

	@JsonProperty("isSymmetricKey")
	public void setIsSymmetricKey(String value) {
		this.isSymmetricKey = value;
	}

	@JsonProperty("keyManager")
	public String getKeyManager() {
		return keyManager;
	}

	@JsonProperty("keyManager")
	public void setKeyManager(String value) {
		this.keyManager = value;
	}

	@JsonProperty("aliases")
	public List<ManagedPolicy> getAliases() {
		return aliases;
	}

	@JsonProperty("aliases")
	public void setAliases(List<ManagedPolicy> value) {
		this.aliases = value;
	}

	@JsonProperty("isCustomerManaged")
	public String getIsCustomerManaged() {
		return isCustomerManaged;
	}

	@JsonProperty("isCustomerManaged")
	public void setIsCustomerManaged(String value) {
		this.isCustomerManaged = value;
	}

	@JsonProperty("rotationStatus")
	public String getRotationStatus() {
		return rotationStatus;
	}

	@JsonProperty("rotationStatus")
	public void setRotationStatus(String value) {
		this.rotationStatus = value;
	}

	@JsonProperty("policies")
	public List<Policy> getPolicies() {
		return policies;
	}

	@JsonProperty("policies")
	public void setPolicies(List<Policy> value) {
		this.policies = value;
	}

	@JsonProperty("kmsAssetsStats")
	public List<AssetsStat> getKmsAssetsStats() {
		return kmsAssetsStats;
	}

	@JsonProperty("kmsAssetsStats")
	public void setKmsAssetsStats(List<AssetsStat> value) {
		this.kmsAssetsStats = value;
	}

	@JsonProperty("accessAnalyzerFindingCount")
	public String getAccessAnalyzerFindingCount() {
		return accessAnalyzerFindingCount;
	}

	@JsonProperty("accessAnalyzerFindingCount")
	public void setAccessAnalyzerFindingCount(String value) {
		this.accessAnalyzerFindingCount = value;
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

	@JsonProperty("dome9Id")
	public String getDome9ID() {
		return dome9ID;
	}

	@JsonProperty("dome9Id")
	public void setDome9ID(String value) {
		this.dome9ID = value;
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

	@Override
	public String toString() {
		return "EncryptionKey [arn=" + arn + ", awsAccountID=" + awsAccountID + ", creationDate=" + creationDate
				+ ", deletionDate=" + deletionDate + ", description=" + description + ", enabled=" + enabled
				+ ", expirationModel=" + expirationModel + ", keyState=" + keyState + ", keyUsage=" + keyUsage
				+ ", origin=" + origin + ", customerMasterKeySpec=" + customerMasterKeySpec + ", isSymmetricKey="
				+ isSymmetricKey + ", keyManager=" + keyManager + ", aliases=" + aliases + ", isCustomerManaged="
				+ isCustomerManaged + ", rotationStatus=" + rotationStatus + ", policies=" + policies
				+ ", kmsAssetsStats=" + kmsAssetsStats + ", accessAnalyzerFindingCount=" + accessAnalyzerFindingCount
				+ ", tags=" + tags + ", id=" + id + ", type=" + type + ", name=" + name + ", dome9ID=" + dome9ID
				+ ", accountNumber=" + accountNumber + ", region=" + region + ", externalFindings=" + externalFindings
				+ "]";
	}

}
