package com.synectiks.aws.s3;

import java.util.ArrayList;
import java.util.List;

import com.synectiks.aws.config.Constants;
//snippet-end:[rds.java2.describe_instances.import]
import com.synectiks.aws.entities.s3.XformS3RDSEntity;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
//snippet-start:[rds.java2.describe_instances.import]
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.rds.RdsClient;
import software.amazon.awssdk.services.rds.model.DBInstance;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesRequest;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesResponse;
import software.amazon.awssdk.services.rds.model.RdsException;

public class DescribeS3RdsDBInstances {
	private String accessKey;
	private String secretKey;
	private Region region;
	private AwsCredentialsProvider awsCredentialsProvider;

	public DescribeS3RdsDBInstances(Region region) {
		this.region = region;
	}

	public DescribeS3RdsDBInstances(String accessKey, String secretKey) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}

	public DescribeS3RdsDBInstances(String accessKey, String secretKey, Region region) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.region = region;
	}

	public DescribeS3RdsDBInstances(AwsCredentialsProvider awsCredentialsProvider) {
		this.awsCredentialsProvider = awsCredentialsProvider;
	}

	public DescribeS3RdsDBInstances(AwsCredentialsProvider awsCredentialsProvider, Region region) {
		this.awsCredentialsProvider = awsCredentialsProvider;
		this.region = region;
	}

	public static AwsCredentialsProvider getAwsCredentialsProvider(String accessKey, String secretKey) {
		AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
		AwsCredentialsProvider asAwsCredentialsProvider = StaticCredentialsProvider.create(credentials);
		return asAwsCredentialsProvider;
	}

	public RdsClient getRdsClient() {
		Region rg = null;
		if (this.region != null) {
			rg = this.region;
		} else {
			System.out.println("Default region is: " + Constants.DEFAULT_REGION.toString());
			rg = Constants.DEFAULT_REGION;
		}
		RdsClient rdsClient = null;
		if (accessKey != null && secretKey != null) {
			AwsCredentialsProvider asAwsCredentialsProvider = getAwsCredentialsProvider(accessKey, secretKey);
			rdsClient = RdsClient.builder().credentialsProvider(asAwsCredentialsProvider).region(rg).build();
		} else if (awsCredentialsProvider != null) {
			rdsClient = RdsClient.builder().credentialsProvider(awsCredentialsProvider).region(rg).build();
		} else {
			rdsClient = RdsClient.builder().region(rg).build();
		}
		return rdsClient;
	}

	public List<XformS3RDSEntity> describeInstances() {
		RdsClient rdsClient = getRdsClient();
		List<XformS3RDSEntity> rdsInsancesList = new ArrayList<>();
		try {
			DescribeDbInstancesResponse response = rdsClient.describeDBInstances();
			DescribeDbInstancesRequest dbInstancesRequest = DescribeDbInstancesRequest.builder()
					.dbInstanceIdentifier("").build();
			DescribeDbInstancesResponse response2 = rdsClient.describeDBInstances(dbInstancesRequest);
			List<DBInstance> instanceList = response.dbInstances();
			for (DBInstance instance : instanceList) {
				XformS3RDSEntity entity = new XformS3RDSEntity();
				entity.setAccountNumber(null);
				entity.setAddress(null);
				entity.setAutoMinorVersionUpgrade(null);
				entity.setBackupRetentionPeriod(String.valueOf(instance.backupRetentionPeriod()));
				entity.setCreatedTime(String.valueOf(instance.instanceCreateTime()));
				entity.setDBClusterName(instance.dbClusterIdentifier());
				entity.setDBType(instance.storageType());
				entity.setDescription(null);
				entity.setEncryptionKey(null);
				entity.setEngineVersion(instance.engineVersion());
				entity.setExternalFindings(null);
				entity.setHostedZoneID(null);
				entity.setID(instance.dbInstanceIdentifier());
				entity.setInboundRules(null);
				entity.setInstanceType(null);
				entity.setIsMultiAvailabilityZone(String.valueOf(instance.multiAZ()));
				entity.setIsStorageEncrypted(String.valueOf(instance.storageEncrypted()));
				entity.setKmsKeyID(instance.kmsKeyId());
				entity.setName(instance.dbName());
				entity.setNics(null);
//        	 entity.setOptionGroups(instance.optionGroupMemberships());
				entity.setOutboundRules(null);
//        	 entity.setParameterGroups(instance.dbParameterGroups());
				entity.setPort(String.valueOf(instance.dbInstancePort()));
				entity.setRegion(String.valueOf(Constants.DEFAULT_REGION));
				entity.setRegionInstance(null);
				entity.setSecondaryAvailabilityZone(instance.secondaryAvailabilityZone());
				entity.setStatus(instance.dbInstanceStatus());
				entity.setStorageType(instance.storageType());
//        	 entity.setTags(value);
				entity.setType(null);
//        	 entity.setVpc(instance.vpc);
				rdsInsancesList.add(entity);
			}

		} catch (RdsException e) {
			System.out.println(e.getLocalizedMessage());
			System.exit(1);
		}
		rdsClient.close();
		return rdsInsancesList;
	}
}
