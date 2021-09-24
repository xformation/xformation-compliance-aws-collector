package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.synectiks.aws.config.Converter;
import com.synectiks.aws.entities.cloudtrail.XformCloudTrail;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.cloudtrail.CloudTrailClient;
import software.amazon.awssdk.services.cloudtrail.model.DescribeTrailsRequest;
import software.amazon.awssdk.services.cloudtrail.model.DescribeTrailsResponse;
import software.amazon.awssdk.services.cloudtrail.model.Trail;

public class XformCloudTrailProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformCloudTrailProcessor.class);

	public XformCloudTrailProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<Trail> getCloudObject() {
		CloudTrailClient cloudTrailClient = getCloudTrailClient();
		List<Trail> trails = null;
		try {
			DescribeTrailsRequest trailsRequest = DescribeTrailsRequest
														.builder()
														.build();
			DescribeTrailsResponse response = cloudTrailClient.describeTrails(trailsRequest);
	        trails = response.trailList();
	        
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getCloudObject: ", e);
		} finally {
			closeCloudTrailClient(cloudTrailClient);
		}
		return trails;
	}
	
	@Override
	public List<XformCloudTrail> getXformObject() {
		List<Trail> cloudTrailList = getCloudObject();
		List<XformCloudTrail> xformCloudTrailList = new ArrayList<>();
		for (Trail awsCloudTrail : cloudTrailList) {
			createXformCloudTrail(xformCloudTrailList, awsCloudTrail);
		}
		return xformCloudTrailList;
	}

	private void createXformCloudTrail(List<XformCloudTrail> xformCloudTrailList, Trail trail) {
			
		Optional<String> name = trail.getValueForField("Name", String.class);
		Optional<String> s3BucketName = trail.getValueForField("S3BucketName", String.class);
		Optional<String> s3KeyPrefix = trail.getValueForField("S3KeyPrefix", String.class);
		Optional<String> snsTopicName = trail.getValueForField("SnsTopicName", String.class);
		Optional<String> snsTopicARN = trail.getValueForField("SnsTopicARN", String.class);
		Optional<Boolean> includeGlobalServiceEvents = trail.getValueForField("IncludeGlobalServiceEvents", Boolean.class);
		Optional<Boolean> isMultiRegionTrail = trail.getValueForField("IsMultiRegionTrail", Boolean.class);
		Optional<String> homeRegion = trail.getValueForField("HomeRegion", String.class);
		Optional<String> trailARN = trail.getValueForField("TrailARN", String.class);
		Optional<Boolean> logFileValidationEnabled = trail.getValueForField("LogFileValidationEnabled", Boolean.class);
		Optional<String> cloudWatchLogsLogGroupArn = trail.getValueForField("CloudWatchLogsLogGroupArn", String.class);
		Optional<String> cloudWatchLogsRoleArn = trail.getValueForField("CloudWatchLogsRoleArn", String.class);
		Optional<String> kmsKeyId = trail.getValueForField("KmsKeyId", String.class);
		Optional<Boolean> hasCustomEventSelectors = trail.getValueForField("HasCustomEventSelectors", Boolean.class);
		Optional<Boolean> hasInsightSelectors = trail.getValueForField("HasInsightSelectors", Boolean.class);
		Optional<Boolean> isOrganizationTrail = trail.getValueForField("IsOrganizationTrail", Boolean.class);
	            
		XformCloudTrail obj = new XformCloudTrail();
		
		if(name.isPresent()) {
			obj.setName(name.get());
		}
		if(s3BucketName.isPresent()) {
			obj.setS3BucketName(s3BucketName.get());
		}
		if(s3KeyPrefix.isPresent()) {
			obj.setS3KeyPrefix(s3KeyPrefix.get());
		}
		if(snsTopicName.isPresent()) {
			obj.setSnsTopicName(snsTopicName.get());
		}
		if(snsTopicARN.isPresent()) {
			obj.setSnsTopicArn(snsTopicARN.get());
		}
		if(includeGlobalServiceEvents.isPresent()) {
			obj.setIncludeGlobalServiceEvents(includeGlobalServiceEvents.get());
		}
		if(isMultiRegionTrail.isPresent()) {
			obj.setIsMultiRegionTrail(isMultiRegionTrail.get());
		}
		if(homeRegion.isPresent()) {
			obj.setHomeRegion(homeRegion.get());
		}
		if(trailARN.isPresent()) {
			obj.setTrailArn(trailARN.get());
		}
	
		if(logFileValidationEnabled.isPresent()) {
			obj.setLogFileValidationEnabled(logFileValidationEnabled.get());
		}
		if(cloudWatchLogsLogGroupArn.isPresent()) {
			obj.setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn.get());
		}
		if(cloudWatchLogsRoleArn.isPresent()) {
			obj.setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn.get());
		}
		if(kmsKeyId.isPresent()) {
			obj.setKmsKeyID(kmsKeyId.get());
		}
		if(hasCustomEventSelectors.isPresent()) {
			obj.setHasCustomEventSelectors(hasCustomEventSelectors.get());
		}
		if(hasInsightSelectors.isPresent()) {
			obj.setHasInsightSelectors(hasInsightSelectors.get());
		}
		if(isOrganizationTrail.isPresent()) {
			obj.setIsOrganizationTrail(isOrganizationTrail.get());
		}
		
		obj.setAccountNumber(getAwsAccountNumber());
		obj.setRegion(getRegionAsText());
		
		xformCloudTrailList.add(obj);
	}
	
	public List<Trail> getCloudObjectByName(String trailName) {
		CloudTrailClient cloudTrailClient = getCloudTrailClient();
		List<Trail> trails = null;
		try {
			DescribeTrailsRequest trailsRequest = DescribeTrailsRequest
														.builder()
														.trailNameList(trailName)
										                .build();
			DescribeTrailsResponse response = cloudTrailClient.describeTrails(trailsRequest);
	        trails = response.trailList();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getCloudObjectByName: ", e);
		}finally {
			closeCloudTrailClient(cloudTrailClient);
		} 
		return trails;
	}
	
	@Override
	public List<XformCloudTrail> getXformObjectById(String trailName) {
		List<Trail> cloudTrailList = getCloudObjectByName(trailName);
		List<XformCloudTrail> xformCloudTrailList = new ArrayList<>();
		for (Trail awsCloudTrail : cloudTrailList) {
			createXformCloudTrail(xformCloudTrailList, awsCloudTrail);
		}
		return xformCloudTrailList;
	}

}
