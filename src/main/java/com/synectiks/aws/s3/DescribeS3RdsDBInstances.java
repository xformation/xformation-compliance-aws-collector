package com.synectiks.aws.s3;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
//snippet-start:[rds.java2.describe_instances.import]
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.rds.RdsClient;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesResponse;
import software.amazon.awssdk.services.rds.model.DBInstance;
import software.amazon.awssdk.services.rds.model.DescribeDbInstancesRequest;
import software.amazon.awssdk.services.rds.model.RdsException;

import java.util.ArrayList;
import java.util.List;

import com.synectiks.aws.config.Constants;
//snippet-end:[rds.java2.describe_instances.import]

/**
 * To run this Java V2 code example, ensure that you have setup your development
 * environment, including your credentials.
 *
 * For information, see this documentation topic:
 *
 * https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
 */
public class DescribeS3RdsDBInstances {
	private Region region;
	private AwsCredentialsProvider asAwsCredentialsProvider;

	public DescribeS3RdsDBInstances() {

	}

	public DescribeS3RdsDBInstances(Region region,AwsCredentialsProvider asAwsCredentialsProvider) {
		this.asAwsCredentialsProvider = asAwsCredentialsProvider;
		this.region = region;
	}

	public DescribeS3RdsDBInstances(AwsCredentialsProvider asAwsCredentialsProvider) {
		this.asAwsCredentialsProvider = asAwsCredentialsProvider;
	}

	public DescribeS3RdsDBInstances(Region region) {
		this.region = region;
	}

	public RdsClient getRdsClient() {
		Region rg = null;
		if (this.region != null) {
			rg = this.region;
		} else {
			System.out.println("Default region is: " + Constants.DEFAULT_REGION.toString());
			rg = Constants.DEFAULT_REGION;
		}
		RdsClient rdsClient = RdsClient.builder().region(region).build();
		return rdsClient;
	}

	public List<S3RDSEntity> describeInstances() {
		RdsClient rdsClient = getRdsClient();
		List<S3RDSEntity> rdsInsancesList = new ArrayList<>();
		try {
			DescribeDbInstancesResponse response = rdsClient.describeDBInstances();
			DescribeDbInstancesRequest dbInstancesRequest = DescribeDbInstancesRequest.builder()
					.dbInstanceIdentifier("").build();
			DescribeDbInstancesResponse response2 = rdsClient.describeDBInstances(dbInstancesRequest);
			List<DBInstance> instanceList = response.dbInstances();
			for (DBInstance instance : instanceList) {
				S3RDSEntity entity = new S3RDSEntity();
				entity.setAccountNumber(null);
				entity.setAddress(null);
				entity.setAutoMinorVersionUpgrade(null);
				entity.setBackupRetentionPeriod(String.valueOf(instance.backupRetentionPeriod()));
				entity.setCreatedTime(String.valueOf(instance.instanceCreateTime()));
				entity.setDBClusterName(instance.dbClusterIdentifier());
				entity.setDBType(instance.storageType());
				entity.setDescription(null);
				entity.setDome9ID(null);
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
		// snippet-end:[rds.java2.describe_instances.main]
		return rdsInsancesList;
	}
}
