package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.rds.RdsVpc;
import com.synectiks.aws.entities.rds.XformRds;
import com.synectiks.aws.entities.rds.XformRdsDBParameterGroupStatus;
import com.synectiks.aws.entities.rds.XformRdsDBSubnetGroup;
import com.synectiks.aws.entities.rds.XformRdsEndpoint;
import com.synectiks.aws.entities.rds.XformRdsOptionGroupMembership;
import com.synectiks.aws.entities.rds.XformRdsVpcSecurityGroupMembership;
import com.synectiks.aws.entities.rds.XormRdsPendingModifiedValues;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.rds.RdsClient;
import software.amazon.awssdk.services.rds.model.DBInstance;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesRequest;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesResponse;

public class XformRdsProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformRdsProcessor.class);
	
	public XformRdsProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	protected List<DBInstance> getCloudObject() throws Exception {
		RdsClient rdsClient = null;
		List<DBInstance> instanceList = null;
		try {
			rdsClient = RdsClient.builder().credentialsProvider(awsCredentialsProvider).region(region).build();
			DescribeDbInstancesRequest dbInstancesRequest = DescribeDbInstancesRequest
					.builder()
					.build();
			DescribeDbInstancesResponse response = rdsClient.describeDBInstances(dbInstancesRequest);
			instanceList = response.dbInstances();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rdsClient != null) {
				rdsClient.close();
			}
		}
		return instanceList;
	}

	@Override
	public List<XformRds> getXformObject() throws Exception {
		List<DBInstance> instanceList = getCloudObject();
		List<XformRds> rdsInsancesList = new ArrayList<>();
		XformVpcProcessor vpcProcessor = new XformVpcProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		for (DBInstance obj : instanceList) {
			XformRds xformRds = new XformRds();
			
//			xformRds.setDescription()
			
			if(obj.endpoint() != null) {
				xformRds.setPort(obj.endpoint().port());
				xformRds.setAddress(obj.endpoint().address());
				xformRds.setHostedZoneID(obj.endpoint().hostedZoneId());
			}

			xformRds.setStatus(obj.dbInstanceStatus());
			xformRds.setDbType(obj.storageType());
			xformRds.setIsPublic(obj.publiclyAccessible());
//			xformRds.setInstanceType();
			xformRds.setIsStorageEncrypted(obj.storageEncrypted());
			xformRds.setRegionInstance(getRegionAsText());
			xformRds.setCreatedTime(obj.instanceCreateTime());
			xformRds.setIsMultiAvailabilityZone(obj.multiAZ());
			xformRds.setDbClusterName(obj.dbClusterIdentifier());
//			xformRds.setEncryptionKey(); 
//			xformRds.setOptionGroups(obj.optionGroupMemberships()); 
//			xformRds.setParameterGroups(obj.dbParameterGroups()); 
//			xformRds.setInboundRules(); 
//			xformRds.setOutboundRules(); 
//			xformRds.setNics(); 
			xformRds.setVpc(RdsVpc.build(vpcProcessor.getCloudObjectById(obj.dbSubnetGroup().vpcId()).get(0))); 
			xformRds.getVpc().setAccountNumber(getAwsAccountNumber());
			xformRds.getVpc().setRegion(getRegionAsText());
//			private List<Tag> tags;
			
			xformRds.setId(obj.dbInstanceIdentifier());
			xformRds.setType(obj.storageType());
			xformRds.setName(obj.dbName());
			xformRds.setAccountNumber(getAwsAccountNumber());
			xformRds.setRegion(getRegionAsText());
//			xformRds.setExternalFindings(); 
			
			xformRds.setDbInstanceIdentifier(obj.dbInstanceIdentifier()); 
			xformRds.setDbInstanceClass(obj.dbInstanceClass()); 
			xformRds.setEngine(obj.engine());
			xformRds.setDbInstanceStatus(obj.dbInstanceStatus()); 
			xformRds.setMasterUsername(obj.masterUsername());
			xformRds.setDbName(obj.dbName());
			xformRds.setEndpoint(XformRdsEndpoint.build(obj.endpoint()));
			xformRds.setAllocatedStorage(obj.allocatedStorage());
			xformRds.setInstanceCreateTime(obj.instanceCreateTime());
			xformRds.setPreferredBackupWindow(obj.preferredBackupWindow());
			xformRds.setBackupRetentionPeriod(obj.backupRetentionPeriod());
			xformRds.setDbSecurityGroups(obj.dbSecurityGroups()); 
			xformRds.setVpcSecurityGroups(XformRdsVpcSecurityGroupMembership.list(obj.vpcSecurityGroups())); 
			xformRds.setDbParameterGroups(XformRdsDBParameterGroupStatus.list(obj.dbParameterGroups()));
			xformRds.setAvailabilityZone(obj.availabilityZone());
			xformRds.setDbSubnetGroup(XformRdsDBSubnetGroup.build(obj.dbSubnetGroup()));
			xformRds.setPreferredMaintenanceWindow(obj.preferredMaintenanceWindow());
			xformRds.setPendingModifiedValues(XormRdsPendingModifiedValues.build(obj.pendingModifiedValues()));
			xformRds.setLatestRestorableTime(obj.latestRestorableTime());
			xformRds.setMultiAZ(obj.multiAZ());
			xformRds.setEngineVersion(obj.engineVersion());
			xformRds.setAutoMinorVersionUpgrade(obj.autoMinorVersionUpgrade());
			xformRds.setReadReplicaSourceDBInstanceIdentifier(obj.readReplicaSourceDBInstanceIdentifier());
			xformRds.setReadReplicaDBInstanceIdentifiers(obj.readReplicaDBInstanceIdentifiers());
			xformRds.setReadReplicaDBClusterIdentifiers(obj.readReplicaDBClusterIdentifiers());
			xformRds.setLicenseModel(obj.licenseModel());
			xformRds.setIops(obj.iops());
			xformRds.setOptionGroupMemberships(XformRdsOptionGroupMembership.list(obj.optionGroupMemberships()));
			xformRds.setCharacterSetName(obj.characterSetName());
			xformRds.setSecondaryAvailabilityZone(obj.secondaryAvailabilityZone());
			xformRds.setPubliclyAccessible(obj.publiclyAccessible());
			xformRds.setStatusInfos(obj.statusInfos());
			xformRds.setStorageType(obj.storageType());
			xformRds.setTdeCredentialArn(obj.tdeCredentialArn());
			xformRds.setDbInstancePort(obj.dbInstancePort());
			xformRds.setDbClusterIdentifier(obj.dbClusterIdentifier());
			xformRds.setStorageEncrypted(obj.storageEncrypted());
			xformRds.setKmsKeyId(obj.kmsKeyId());
			xformRds.setDbiResourceId(obj.dbiResourceId());
			xformRds.setCaCertificateIdentifier(obj.caCertificateIdentifier());
			xformRds.setDomainMemberships(obj.domainMemberships());
			xformRds.setCopyTagsToSnapshot(obj.copyTagsToSnapshot());
			xformRds.setMonitoringInterval(obj.monitoringInterval());
			xformRds.setEnhancedMonitoringResourceArn(obj.enhancedMonitoringResourceArn());
			xformRds.setMonitoringRoleArn(obj.monitoringRoleArn());
			xformRds.setPromotionTier(obj.promotionTier());
			xformRds.setDbInstanceArn(obj.dbInstanceArn());
			xformRds.setTimezone(obj.timezone());
			xformRds.setIamDatabaseAuthenticationEnabled(obj.iamDatabaseAuthenticationEnabled());
			xformRds.setPerformanceInsightsEnabled(obj.performanceInsightsEnabled());
			xformRds.setPerformanceInsightsKMSKeyId(obj.performanceInsightsKMSKeyId()); 
			xformRds.setPerformanceInsightsRetentionPeriod(obj.performanceInsightsRetentionPeriod());
			xformRds.setEnabledCloudwatchLogsExports(obj.enabledCloudwatchLogsExports());
			xformRds.setProcessorFeatures(obj.processorFeatures());
			xformRds.setDeletionProtection(obj.deletionProtection()); 
			xformRds.setAssociatedRoles(obj.associatedRoles()); 
			xformRds.setListenerEndpoint(XformRdsEndpoint.build(obj.listenerEndpoint())); 
			xformRds.setMaxAllocatedStorage(obj.maxAllocatedStorage()); 
			
			rdsInsancesList.add(xformRds);
		} 
		
		return rdsInsancesList;

	}

	
	@Override
	protected <T> T getXformObjectById(String id) throws Exception {
		return null;
	}
}
