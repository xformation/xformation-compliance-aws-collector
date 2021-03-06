package com.synectiks.aws.main;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityResult;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.cloudtrail.CloudTrailClient;
import software.amazon.awssdk.services.ec2.Ec2Client;

public abstract class XformAwsProcessor implements XformCollector {

	private String accessKey;
	private String secretKey;
	protected Region region;
	private String regionAsText;
	private String bucket;
	private AwsCredentials awsCredentials;
	protected AwsCredentialsProvider awsCredentialsProvider;
//	private Ec2Client ec2Client;
//	private CloudTrailClient cloudTrailClient;

	public XformAwsProcessor(String accessKey, String secretKey, String region) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.regionAsText = region;
		this.region = Region.of(region);
		this.awsCredentials = AwsBasicCredentials.create(accessKey, secretKey);
		this.awsCredentialsProvider = StaticCredentialsProvider.create(this.awsCredentials);
	}

	public XformAwsProcessor(String accessKey, String secretKey, String region, String bucket) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.regionAsText = region;
		this.region = Region.of(region);
		this.bucket = bucket;
		this.awsCredentials = AwsBasicCredentials.create(accessKey, secretKey);
		this.awsCredentialsProvider = StaticCredentialsProvider.create(this.awsCredentials);
	}

	protected abstract <T> T getCloudObject() throws Exception;

	protected abstract <T> T getXformObject() throws Exception;
	
	protected abstract <T> T getXformObjectById(String id) throws Exception;

	@Override
	public String getAwsAccountNumber() {
		GetCallerIdentityResult callerIdentity = getAWSSecurityTokenService()
				.getCallerIdentity(new GetCallerIdentityRequest());
		return callerIdentity.getAccount();
	}

	@Override
	public AWSSecurityTokenService getAWSSecurityTokenService() {
		AWSSecurityTokenService awsSecurityTokenService = AWSSecurityTokenServiceClientBuilder.standard()
				.withCredentials(
						new AWSStaticCredentialsProvider(new BasicAWSCredentials(this.accessKey, this.secretKey)))
				.withRegion(this.regionAsText).build();
		return awsSecurityTokenService;
	}

	public Ec2Client getEc2Client() {
		Ec2Client ec2Client = Ec2Client.builder().credentialsProvider(getAwsCredentialsProvider()).region(getRegion())
				.build();
		return ec2Client;
	}

	public CloudTrailClient getCloudTrailClient() {
		CloudTrailClient cloudTrailClient = CloudTrailClient
												.builder()
												.credentialsProvider(getAwsCredentialsProvider())
								                .region(getRegion())
								                .build();
		return cloudTrailClient;
	}
	
	public void closeEc2Client(Ec2Client ec2Client) {
		if (ec2Client != null) {
			ec2Client.close();
		}
	}

	public void closeCloudTrailClient(CloudTrailClient cloudTrailClient) {
		if (cloudTrailClient != null) {
			cloudTrailClient.close();
		}
	}
	
//	public void closeEc2Client() {
//		if (this.ec2Client != null) {
//			this.ec2Client.close();
//		}
//	}
	
	public String getAccessKey() {
		return accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public Region getRegion() {
		return region;
	}

	public String getRegionAsText() {
		return regionAsText;
	}

	public String getBucket() {
		return bucket;
	}

	public AwsCredentials getAwsCredentials() {
		return awsCredentials;
	}

	public AwsCredentialsProvider getAwsCredentialsProvider() {
		return awsCredentialsProvider;
	}

}
