package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.synectiks.aws.entities.s3.XformS3RDSEntity;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.rds.RdsClient;
import software.amazon.awssdk.services.rds.model.DBInstance;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesRequest;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesResponse;
import software.amazon.awssdk.services.rds.model.RdsException;

public class XformS3RDSProcessor extends XformAwsProcessor {

	public XformS3RDSProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RdsClient getCloudObject() throws Exception {
		// TODO Auto-generated method stub
		RdsClient rdsClient = RdsClient.builder().credentialsProvider(awsCredentialsProvider).region(region).build();
		;
		return rdsClient;
	}

	@Override
	public List<XformS3RDSEntity> getXformObject() throws Exception {
		// TODO Auto-generated method stub
		RdsClient rdsClient = getCloudObject();
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
				Optional<String> preferredBackupWindow = instance.getValueForField("PreferredBackupWindow",
						String.class);
				Optional<String> backupRetentionPeriod = instance.getValueForField("BackupRetentionPeriod",
						String.class);
				Optional<String> dBSecurityGroups = instance.getValueForField("DBSecurityGroups", String.class);
				Optional<String> vpcSecurityGroups = instance.getValueForField("VpcSecurityGroups", String.class);
				Optional<List> dBParameterGroups = instance.getValueForField("DBParameterGroups", List.class);
				Optional<String> availabilityZone = instance.getValueForField("AvailabilityZone", String.class);
				Optional<String> dBSubnetGroup = instance.getValueForField("DBSubnetGroup", String.class);
				Optional<String> preferredMaintenanceWindow = instance.getValueForField("PreferredMaintenanceWindow",
						String.class);
				Optional<String> pendingModifiedValues = instance.getValueForField("PendingModifiedValues",
						String.class);
				Optional<String> latestRestorableTime = instance.getValueForField("LatestRestorableTime", String.class);
				Optional<String> multiAZ = instance.getValueForField("MultiAZ", String.class);
				Optional<String> engineVersion = instance.getValueForField("EngineVersion", String.class);
				Optional<String> autoMinorVersionUpgrade = instance.getValueForField("AutoMinorVersionUpgrade",
						String.class);
				Optional<String> readReplicaSourceDBInstanceIdentifier = instance
						.getValueForField("ReadReplicaSourceDBInstanceIdentifier", String.class);
				Optional<String> readReplicaDBInstanceIdentifiers = instance
						.getValueForField("ReadReplicaDBInstanceIdentifiers", String.class);
				Optional<String> readReplicaDBClusterIdentifiers = instance
						.getValueForField("ReadReplicaDBClusterIdentifiers", String.class);
				Optional<String> licenseModel = instance.getValueForField("LicenseModel", String.class);

				Optional<String> iops = instance.getValueForField("Iops", String.class);
				Optional<List> optionGroupMemberships = instance.getValueForField("OptionGroupMemberships", List.class);
				Optional<String> characterSetName = instance.getValueForField("CharacterSetName", String.class);
				Optional<String> secondaryAvailabilityZone = instance.getValueForField("SecondaryAvailabilityZone",
						String.class);
				Optional<String> publiclyAccessible = instance.getValueForField("PubliclyAccessible", String.class);
				Optional<String> statusInfos = instance.getValueForField("StatusInfos", String.class);
				Optional<String> storageType = instance.getValueForField("StorageType", String.class);
				Optional<String> tdeCredentialArn = instance.getValueForField("TdeCredentialArn", String.class);
				Optional<String> dbInstancePort = instance.getValueForField("DbInstancePort", String.class);
				Optional<String> dBClusterIdentifier = instance.getValueForField("DBClusterIdentifier", String.class);
				Optional<String> storageEncrypted = instance.getValueForField("StorageEncrypted", String.class);

				Optional<String> kmsKeyId = instance.getValueForField("KmsKeyId", String.class);
				Optional<String> dbiResourceId = instance.getValueForField("DbiResourceId", String.class);
				Optional<String> cACertificateIdentifier = instance.getValueForField("CACertificateIdentifier",
						String.class);
				Optional<String> domainMemberships = instance.getValueForField("DomainMemberships", String.class);
				Optional<String> copyTagsToSnapshot = instance.getValueForField("CopyTagsToSnapshot", String.class);
				Optional<String> monitoringInterval = instance.getValueForField("MonitoringInterval", String.class);
				Optional<String> enhancedMonitoringResourceArn = instance
						.getValueForField("EnhancedMonitoringResourceArn", String.class);
				Optional<String> monitoringRoleArn = instance.getValueForField("MonitoringRoleArn", String.class);
				Optional<String> promotionTier = instance.getValueForField("PromotionTier", String.class);
				Optional<String> pBInstanceArn = instance.getValueForField("DBInstanceArn", String.class);
				Optional<String> timezone = instance.getValueForField("Timezone", String.class);
				Optional<String> iAMDatabaseAuthenticationEnabled = instance
						.getValueForField("IAMDatabaseAuthenticationEnabled", String.class);
				Optional<String> performanceInsightsEnabled = instance.getValueForField("PerformanceInsightsEnabled",
						String.class);
				Optional<String> performanceInsightsKMSKeyId = instance.getValueForField("PerformanceInsightsKMSKeyId",
						String.class);
				Optional<String> performanceInsightsRetentionPeriod = instance
						.getValueForField("PerformanceInsightsRetentionPeriod", String.class);
				Optional<String> enabledCloudwatchLogsExports = instance
						.getValueForField("EnabledCloudwatchLogsExports", String.class);
				Optional<String> processorFeatures = instance.getValueForField("ProcessorFeatures", String.class);
				Optional<String> deletionProtection = instance.getValueForField("DeletionProtection", String.class);
				Optional<String> associatedRoles = instance.getValueForField("AssociatedRoles", String.class);
				Optional<String> listenerEndpoint = instance.getValueForField("ListenerEndpoint", String.class);
				Optional<String> maxAllocatedStorage = instance.getValueForField("MaxAllocatedStorage", String.class);
//				Optional<List> HibernationOptions = instance.getValueForField("SriovNetSupport", List.class);
				XformS3RDSEntity xformS3RDSEntity = new XformS3RDSEntity();

				xformS3RDSEntity.setAccountNumber(getAwsAccountNumber());
//				xformS3RDSEntity.setAddress(null);
				if (autoMinorVersionUpgrade.isPresent()) {
					xformS3RDSEntity.setAutoMinorVersionUpgrade(autoMinorVersionUpgrade.get());
				}
				if (backupRetentionPeriod.isPresent()) {
					xformS3RDSEntity.setBackupRetentionPeriod(backupRetentionPeriod.get());
				}
				if (instanceCreateTime.isPresent()) {
					xformS3RDSEntity.setCreatedTime(instanceCreateTime.get());
				}
				if (dBClusterIdentifier.isPresent()) {
					xformS3RDSEntity.setDBClusterName(dBClusterIdentifier.get());
				}
				if (storageType.isPresent()) {
					xformS3RDSEntity.setDBType(instance.storageType());
				}
//				xformS3RDSEntity.setDescription(null);
//				xformS3RDSEntity.setEncryptionKey(null);
				if (engineVersion.isPresent()) {
					xformS3RDSEntity.setEngineVersion(engineVersion.get());
				}
//				xformS3RDSEntity.setExternalFindings(null);
//				xformS3RDSEntity.setHostedZoneID(null);
				if (dBInstanceIdentifier.isPresent()) {
					xformS3RDSEntity.setID(dBInstanceIdentifier.get());
				}
//				xformS3RDSEntity.setInboundRules(null);
//				xformS3RDSEntity.setInstanceType(null);
				if (multiAZ.isPresent()) {
					xformS3RDSEntity.setIsMultiAvailabilityZone(multiAZ.get());
				}
				if (storageEncrypted.isPresent()) {
					xformS3RDSEntity.setIsStorageEncrypted(storageEncrypted.get());
				}
				if (kmsKeyId.isPresent()) {
					xformS3RDSEntity.setKmsKeyID(kmsKeyId.get());
				}
				if (dBName.isPresent()) {
					xformS3RDSEntity.setName(dBName.get());
				}
//				xformS3RDSEntity.setNics(null);
				if (optionGroupMemberships.isPresent()) {
					xformS3RDSEntity.setOptionGroups(optionGroupMemberships.get());
				}
//				xformS3RDSEntity.setOutboundRules(null);
				if (dBParameterGroups.isPresent()) {
					xformS3RDSEntity.setParameterGroups(dBParameterGroups.get());
				}
				if (dbInstancePort.isPresent()) {
					xformS3RDSEntity.setPort(dbInstancePort.get());
				}
				xformS3RDSEntity.setRegion(getRegionAsText());
//				xformS3RDSEntity.setRegionInstance(null);
				if (secondaryAvailabilityZone.isPresent()) {
					xformS3RDSEntity.setSecondaryAvailabilityZone(secondaryAvailabilityZone.get());

				}
				if (dBInstanceStatus.isPresent()) {
					xformS3RDSEntity.setStatus(dBInstanceStatus.get());
				}
				if (storageType.isPresent()) {
					xformS3RDSEntity.setStorageType(storageType.get());
				}

//        	 entity.setTags(value);
				xformS3RDSEntity.setType(null);
//        	 entity.setVpc(instance.vpc);
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
