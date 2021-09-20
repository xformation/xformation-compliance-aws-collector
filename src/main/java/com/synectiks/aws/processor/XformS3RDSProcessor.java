package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.synectiks.aws.config.Constants;
import com.synectiks.aws.entities.s3.XformS3RDSEntity;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.rds.RdsClient;
import software.amazon.awssdk.services.rds.model.DBInstance;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesRequest;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesResponse;
import software.amazon.awssdk.services.rds.model.RdsException;

public class XformS3RDSProcessor extends XformAwsProcessor{

	public XformS3RDSProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RdsClient getCloudObject() throws Exception {
		// TODO Auto-generated method stub
		RdsClient rdsClient = RdsClient.builder().credentialsProvider(awsCredentialsProvider).region(region).build();;
		return rdsClient;
	}

	@Override
	protected List<XformS3RDSEntity> getXformObject() throws Exception {
		// TODO Auto-generated method stub
		RdsClient rdsClient=getCloudObject();
		List<XformS3RDSEntity> rdsInsancesList = new ArrayList<>();
		try {
			DescribeDbInstancesResponse response = rdsClient.describeDBInstances();
			DescribeDbInstancesRequest dbInstancesRequest = DescribeDbInstancesRequest.builder()
					.dbInstanceIdentifier("").build();
			DescribeDbInstancesResponse response2 = rdsClient.describeDBInstances(dbInstancesRequest);
			List<DBInstance> instanceList = response.dbInstances();
			for (DBInstance instance : instanceList) {
				Optional<String> dBInstanceIdentifier = instance.getValueForField("DBInstanceIdentifier", String.class);
				Optional<String> dBInstanceClass = instance.getValueForField("DBInstanceClass", String.class);
				Optional<String> engine = instance.getValueForField("Engine", String.class);
				Optional<String> dBInstanceStatus = instance.getValueForField("DBInstanceStatus", String.class);
				Optional<String> masterUsername = instance.getValueForField("MasterUsername", String.class);
				Optional<String> dBName = instance.getValueForField("DBName", String.class);
				Optional<String> endpoint = instance.getValueForField("Endpoint", String.class);
				Optional<String> allocatedStorage = instance.getValueForField("AllocatedStorage", String.class);
				Optional<String> instanceCreateTime = instance.getValueForField("InstanceCreateTime", String.class);
				Optional<String> preferredBackupWindow = instance.getValueForField("PreferredBackupWindow", String.class);
				Optional<String> backupRetentionPeriod = instance.getValueForField("BackupRetentionPeriod", String.class);
				Optional<String> dBSecurityGroups = instance.getValueForField("DBSecurityGroups", String.class);
				Optional<String> vpcSecurityGroups = instance.getValueForField("VpcSecurityGroups", String.class);
				Optional<String> dBParameterGroups = instance.getValueForField("DBParameterGroups", String.class);
				Optional<String> availabilityZone = instance.getValueForField("AvailabilityZone", String.class);
				Optional<String> dBSubnetGroup = instance.getValueForField("DBSubnetGroup", String.class);
				Optional<String> preferredMaintenanceWindow = instance.getValueForField("PreferredMaintenanceWindow", String.class);
				Optional<String> pendingModifiedValues = instance.getValueForField("PendingModifiedValues", String.class);
				Optional<String> latestRestorableTime = instance.getValueForField("LatestRestorableTime", String.class);
				Optional<String> multiAZ = instance.getValueForField("MultiAZ", String.class);
				Optional<String> engineVersion = instance.getValueForField("EngineVersion", String.class);
				Optional<String> autoMinorVersionUpgrade = instance.getValueForField("AutoMinorVersionUpgrade", String.class);
				Optional<String> readReplicaSourceDBInstanceIdentifier = instance.getValueForField("ReadReplicaSourceDBInstanceIdentifier", String.class);
				Optional<String> readReplicaDBInstanceIdentifiers = instance.getValueForField("ReadReplicaDBInstanceIdentifiers", String.class);
				Optional<String> readReplicaDBClusterIdentifiers = instance.getValueForField("ReadReplicaDBClusterIdentifiers", String.class);
				Optional<String> licenseModel = instance.getValueForField("LicenseModel", String.class);
				
				Optional<String> iops = instance.getValueForField("Iops", String.class);
				Optional<String> optionGroupMemberships = instance.getValueForField("OptionGroupMemberships", String.class);
				Optional<String> characterSetName = instance.getValueForField("CharacterSetName", String.class);
				Optional<String> secondaryAvailabilityZone = instance.getValueForField("SecondaryAvailabilityZone", String.class);
				Optional<String> publiclyAccessible = instance.getValueForField("PubliclyAccessible", String.class);
				Optional<String> statusInfos = instance.getValueForField("StatusInfos", String.class);
				Optional<String> storageType = instance.getValueForField("StorageType", String.class);
				Optional<String> tdeCredentialArn = instance.getValueForField("TdeCredentialArn", String.class);
				Optional<String> dbInstancePort = instance.getValueForField("DbInstancePort", String.class);
				Optional<String> dBClusterIdentifier = instance.getValueForField("DBClusterIdentifier", String.class);
				Optional<String> storageEncrypted = instance.getValueForField("StorageEncrypted", String.class);
				
				Optional<String> kmsKeyId = instance.getValueForField("KmsKeyId", String.class);
				Optional<String> dbiResourceId = instance.getValueForField("DbiResourceId", String.class);
				Optional<String> cACertificateIdentifier = instance.getValueForField("CACertificateIdentifier", String.class);
				Optional<String> domainMemberships = instance.getValueForField("DomainMemberships", String.class);
				Optional<String> copyTagsToSnapshot = instance.getValueForField("CopyTagsToSnapshot", String.class);
				Optional<String> monitoringInterval = instance.getValueForField("MonitoringInterval", String.class);
				Optional<String> enhancedMonitoringResourceArn = instance.getValueForField("EnhancedMonitoringResourceArn", String.class);
				Optional<String> monitoringRoleArn = instance.getValueForField("MonitoringRoleArn", String.class);
				Optional<String> promotionTier = instance.getValueForField("PromotionTier", String.class);
				Optional<String> pBInstanceArn = instance.getValueForField("DBInstanceArn", String.class);
				Optional<String> timezone = instance.getValueForField("Timezone", String.class);
				Optional<String> iAMDatabaseAuthenticationEnabled = instance.getValueForField("IAMDatabaseAuthenticationEnabled", String.class);
				Optional<String> performanceInsightsEnabled = instance.getValueForField("PerformanceInsightsEnabled", String.class);
				Optional<String> performanceInsightsKMSKeyId = instance.getValueForField("PerformanceInsightsKMSKeyId", String.class);
				Optional<String> performanceInsightsRetentionPeriod = instance.getValueForField("PerformanceInsightsRetentionPeriod", String.class);
				Optional<String> enabledCloudwatchLogsExports = instance.getValueForField("EnabledCloudwatchLogsExports", String.class);
				Optional<String> processorFeatures = instance.getValueForField("ProcessorFeatures", String.class);
				Optional<String> deletionProtection = instance.getValueForField("DeletionProtection", String.class);
				Optional<String> associatedRoles = instance.getValueForField("AssociatedRoles", String.class);
				Optional<String> listenerEndpoint = instance.getValueForField("ListenerEndpoint", String.class);
				Optional<String> maxAllocatedStorage = instance.getValueForField("MaxAllocatedStorage", String.class);
//				Optional<List> HibernationOptions = instance.getValueForField("SriovNetSupport", List.class);
				XformS3RDSEntity xformS3RDSEntity = new XformS3RDSEntity();
				
				xformS3RDSEntity.setAccountNumber(getAwsAccountNumber());
				if(dBInstanceIdentifier.isPresent()) {
					xformS3RDSEntity.setDBClusterName(dBInstanceIdentifier.get());
				}
//				if(dBInstanceClass.isPresent()) {
//					xformS3RDSEntity.setDBInstanceClass(dBInstanceClass.get());
//				}
//				if(engine.isPresent()) {
//					xformS3RDSEntity.setEngine(engine.get());
//				}
//				if(dBInstanceStatus.isPresent()) {
//					xformS3RDSEntity.setDBInstanceStatus(dBInstanceStatus.get());
//				}
//				if(masterUsername.isPresent()) {
//					xformS3RDSEntity.setMasterUsername(masterUsername.get());
//				}
//				if(dBName.isPresent()) {
//					xformS3RDSEntity.setDBName(dBName.get());
//				}
//				if(endpoint.isPresent()) {
//					xformS3RDSEntity.setEndpoint(endpoint.get());
//				}
//				if(allocatedStorage.isPresent()) {
//					xformS3RDSEntity.setAllocatedStorage(allocatedStorage.get());
//				}
//				if(instanceCreateTime.isPresent()) {
//					xformS3RDSEntity.setInstanceCreateTime(instanceCreateTime.get());
//				}
//				if(preferredBackupWindow.isPresent()) {
//					xformS3RDSEntity.setPreferredBackupWindow(preferredBackupWindow.get());
//				}
				if(backupRetentionPeriod.isPresent()) {
					xformS3RDSEntity.setBackupRetentionPeriod(backupRetentionPeriod.get());
				}
//				if(dBSecurityGroups.isPresent()) {
//					xformS3RDSEntity.setDBSecurityGroups(dBSecurityGroups.get());
//				}
//				if(vpcSecurityGroups.isPresent()) {
//					xformS3RDSEntity.setVpcSecurityGroups(vpcSecurityGroups.get());
//				}
//				if(dBParameterGroups.isPresent()) {
//					xformS3RDSEntity.setDBParameterGroups(dBParameterGroups.get());
//				}
				if(availabilityZone.isPresent()) {
					xformS3RDSEntity.setAvailabilityZone(availabilityZone.get());
				}
//				if(dBSubnetGroup.isPresent()) {
//					xformS3RDSEntity.setDBSubnetGroup(dBSubnetGroup.get());
//				}
//				if(preferredMaintenanceWindow.isPresent()) {
//					xformS3RDSEntity.setPreferredMaintenanceWindow(preferredMaintenanceWindow.get());
//				}
//				if(pendingModifiedValues.isPresent()) {
//					xformS3RDSEntity.setPendingModifiedValues(pendingModifiedValues.get());
//				}
//				if(latestRestorableTime.isPresent()) {
//					xformS3RDSEntity.setLatestRestorableTime(latestRestorableTime.get());
//				}
//				if(multiAZ.isPresent()) {
//					xformS3RDSEntity.setMultiAZ(multiAZ.get());
//				}
				if(engineVersion.isPresent()) {
					xformS3RDSEntity.setEngineVersion(engineVersion.get());
				}
				if(autoMinorVersionUpgrade.isPresent()) {
					xformS3RDSEntity.setAutoMinorVersionUpgrade(autoMinorVersionUpgrade.get());
				}
//				if(readReplicaSourceDBInstanceIdentifier.isPresent()) {
//					xformS3RDSEntity.setReadReplicaSourceDBInstanceIdentifier(readReplicaSourceDBInstanceIdentifier.get());
//				}
//				if(readReplicaDBInstanceIdentifiers.isPresent()) {
//					xformS3RDSEntity.setReadReplicaDBInstanceIdentifiers(readReplicaDBInstanceIdentifiers.get());
//				}
//				if(readReplicaDBClusterIdentifiers.isPresent()) {
//					xformS3RDSEntity.setReadReplicaDBClusterIdentifiers(readReplicaDBClusterIdentifiers.get());
//				}
//				if(licenseModel.isPresent()) {
//					xformS3RDSEntity.setLicenseModel(licenseModel.get());
//				}
//				if(iops.isPresent()) {
//					xformS3RDSEntity.setIops(iops.get());
//				}
//				if(optionGroupMemberships.isPresent()) {
//					xformS3RDSEntity.setOptionGroupMemberships(optionGroupMemberships.get());
//				}
//				if(characterSetName.isPresent()) {
//					xformS3RDSEntity.setCharacterSetName(characterSetName.get());
//				}
				if(secondaryAvailabilityZone.isPresent()) {
					xformS3RDSEntity.setSecondaryAvailabilityZone(secondaryAvailabilityZone.get());
				}
//				if(publiclyAccessible.isPresent()) {
//					xformS3RDSEntity.setPubliclyAccessible(publiclyAccessible.get());
//				}
//				if(statusInfos.isPresent()) {
//					xformS3RDSEntity.setStatusInfos(statusInfos.get());
//				}
				if(storageType.isPresent()) {
					xformS3RDSEntity.setStorageType(storageType.get());
				}
//				if(tdeCredentialArn.isPresent()) {
//					xformS3RDSEntity.setTdeCredentialArn(tdeCredentialArn.get());
//				}
//				if(dbInstancePort.isPresent()) {
//					xformS3RDSEntity.setDbInstancePort(dbInstancePort.get());
//				}
//				if(dBClusterIdentifier.isPresent()) {
//					xformS3RDSEntity.setDBClusterIdentifier(dBClusterIdentifier.get());
//				}
//				if(storageEncrypted.isPresent()) {
//					xformS3RDSEntity.setStorageEncrypted(storageEncrypted.get());
//				}
//				if(kmsKeyId.isPresent()) {
//					xformS3RDSEntity.setKmsKeyId(kmsKeyId.get());
//				}
//				if(dbiResourceId.isPresent()) {
//					xformS3RDSEntity.setDbiResourceId(dbiResourceId.get());
//				}
//				if(cACertificateIdentifier.isPresent()) {
//					xformS3RDSEntity.setCACertificateIdentifier(cACertificateIdentifier.get());
//				}
//				if(domainMemberships.isPresent()) {
//					xformS3RDSEntity.setDomainMemberships(domainMemberships.get());
//				}
//				if(copyTagsToSnapshot.isPresent()) {
//					xformS3RDSEntity.setCopyTagsToSnapshot(copyTagsToSnapshot.get());
//				}
//				if(monitoringInterval.isPresent()) {
//					xformS3RDSEntity.setMonitoringInterval(monitoringInterval.get());
//				}
//				if(enhancedMonitoringResourceArn.isPresent()) {
//					xformS3RDSEntity.setEnhancedMonitoringResourceArn(enhancedMonitoringResourceArn.get());
//				}
//				if(monitoringRoleArn.isPresent()) {
//					xformS3RDSEntity.setMonitoringRoleArn(monitoringRoleArn.get());
//				}
//				if(promotionTier.isPresent()) {
//					xformS3RDSEntity.setPromotionTier(promotionTier.get());
//				}
//				if(pBInstanceArn.isPresent()) {
//					xformS3RDSEntity.setPBInstanceArn(pBInstanceArn.get());
//				}
//				if(timezone.isPresent()) {
//					xformS3RDSEntity.setTimezone(timezone.get());
//				}
//				
//				if(iAMDatabaseAuthenticationEnabled.isPresent()) {
//					xformS3RDSEntity.setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled.get());
//				}
//				
//				if(performanceInsightsEnabled.isPresent()) {
//					xformS3RDSEntity.setPerformanceInsightsEnabled(performanceInsightsEnabled.get());
//				}
//				
//				if(performanceInsightsKMSKeyId.isPresent()) {
//					xformS3RDSEntity.setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId.get());
//				}
//				
//				if(performanceInsightsRetentionPeriod.isPresent()) {
//					xformS3RDSEntity.setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod.get());
//				}
//				if(enabledCloudwatchLogsExports.isPresent()) {
//					xformS3RDSEntity.setEnabledCloudwatchLogsExports(enabledCloudwatchLogsExports.get());
//				}
//				if(processorFeatures.isPresent()) {
//					xformS3RDSEntity.setProcessorFeatures(processorFeatures.get());
//				}
//				if(deletionProtection.isPresent()) {
//					xformS3RDSEntity.setDeletionProtection(deletionProtection.get());
//				}
//				if(associatedRoles.isPresent()) {
//					xformS3RDSEntity.setAssociatedRoles(associatedRoles.get());
//				}
//				if(listenerEndpoint.isPresent()) {
//					xformS3RDSEntity.setListenerEndpoint(listenerEndpoint.get());
//				}
//				if(maxAllocatedStorage.isPresent()) {
//					xformS3RDSEntity.setMaxAllocatedStorage(maxAllocatedStorage.get());
//				}
				
				rdsInsancesList.add(xformS3RDSEntity);
			}

		} catch (RdsException e) {
			System.out.println(e.getLocalizedMessage());
			System.exit(1);
		}
		rdsClient.close();
		return rdsInsancesList;

	}

}
