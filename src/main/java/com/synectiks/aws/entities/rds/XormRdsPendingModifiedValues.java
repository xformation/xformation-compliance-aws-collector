package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.util.List;

import software.amazon.awssdk.services.rds.model.PendingCloudwatchLogsExports;
import software.amazon.awssdk.services.rds.model.PendingModifiedValues;
import software.amazon.awssdk.services.rds.model.ProcessorFeature;

public class XormRdsPendingModifiedValues implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dbInstanceClass;
    private Integer allocatedStorage;
    private String masterUserPassword;
    private Integer port;
    private Integer backupRetentionPeriod;
    private Boolean multiAZ;
    private String engineVersion;
    private String licenseModel;
    private Integer iops;
    private String dbInstanceIdentifier;
    private String storageType;
    private String caCertificateIdentifier;
    private String dbSubnetGroupName;
    private PendingCloudwatchLogsExports pendingCloudwatchLogsExports;
    private List<ProcessorFeature> processorFeatures;

	public String getDbInstanceClass() {
		return dbInstanceClass;
	}

	public void setDbInstanceClass(String dbInstanceClass) {
		this.dbInstanceClass = dbInstanceClass;
	}

	public Integer getAllocatedStorage() {
		return allocatedStorage;
	}

	public void setAllocatedStorage(Integer allocatedStorage) {
		this.allocatedStorage = allocatedStorage;
	}

	public String getMasterUserPassword() {
		return masterUserPassword;
	}

	public void setMasterUserPassword(String masterUserPassword) {
		this.masterUserPassword = masterUserPassword;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getBackupRetentionPeriod() {
		return backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public Boolean getMultiAZ() {
		return multiAZ;
	}

	public void setMultiAZ(Boolean multiAZ) {
		this.multiAZ = multiAZ;
	}

	public String getEngineVersion() {
		return engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public String getLicenseModel() {
		return licenseModel;
	}

	public void setLicenseModel(String licenseModel) {
		this.licenseModel = licenseModel;
	}

	public Integer getIops() {
		return iops;
	}

	public void setIops(Integer iops) {
		this.iops = iops;
	}

	public String getDbInstanceIdentifier() {
		return dbInstanceIdentifier;
	}

	public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
		this.dbInstanceIdentifier = dbInstanceIdentifier;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getCaCertificateIdentifier() {
		return caCertificateIdentifier;
	}

	public void setCaCertificateIdentifier(String caCertificateIdentifier) {
		this.caCertificateIdentifier = caCertificateIdentifier;
	}

	public String getDbSubnetGroupName() {
		return dbSubnetGroupName;
	}

	public void setDbSubnetGroupName(String dbSubnetGroupName) {
		this.dbSubnetGroupName = dbSubnetGroupName;
	}

	public PendingCloudwatchLogsExports getPendingCloudwatchLogsExports() {
		return pendingCloudwatchLogsExports;
	}

	public void setPendingCloudwatchLogsExports(PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
		this.pendingCloudwatchLogsExports = pendingCloudwatchLogsExports;
	}

	public List<ProcessorFeature> getProcessorFeatures() {
		return processorFeatures;
	}

	public void setProcessorFeatures(List<ProcessorFeature> processorFeatures) {
		this.processorFeatures = processorFeatures;
	}
	
	public static XormRdsPendingModifiedValues build(PendingModifiedValues awsObj) {
		XormRdsPendingModifiedValues obj = null;
		if(awsObj != null) {
			obj = new XormRdsPendingModifiedValues();
			obj.dbInstanceClass = awsObj.dbInstanceClass();
	        obj.allocatedStorage = awsObj.allocatedStorage();
	        obj.masterUserPassword = awsObj.masterUserPassword();
	        obj.port = awsObj.port();
	        obj.backupRetentionPeriod = awsObj.backupRetentionPeriod();
	        obj.multiAZ = awsObj.multiAZ();
	        obj.engineVersion = awsObj.engineVersion();
	        obj.licenseModel = awsObj.licenseModel();
	        obj.iops = awsObj.iops();
	        obj.dbInstanceIdentifier = awsObj.dbInstanceIdentifier();
	        obj.storageType = awsObj.storageType();
	        obj.caCertificateIdentifier = awsObj.caCertificateIdentifier();
	        obj.dbSubnetGroupName = awsObj.dbSubnetGroupName();
	        obj.pendingCloudwatchLogsExports = awsObj.pendingCloudwatchLogsExports();
	        obj.processorFeatures = awsObj.processorFeatures();
		}
		return obj;
	}

}
