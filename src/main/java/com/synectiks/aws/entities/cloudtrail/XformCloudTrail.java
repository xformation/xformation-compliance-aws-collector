package com.synectiks.aws.entities.cloudtrail;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

public class XformCloudTrail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cloudWatchLogsLogGroupArn;
    private String cloudWatchLogsRoleArn;
    private String homeRegion;
    private Boolean includeGlobalServiceEvents;
    private Boolean isMultiRegionTrail;
    private Boolean isOrganizationTrail;
    private String kmsKeyID;
    private Boolean logFileValidationEnabled;
    private String s3BucketName;
    private String s3KeyPrefix;
    private String snsTopicArn;
    private String snsTopicName;
    private String trailArn;
    private Status status;
    private List<EventSelector> eventSelectors;
    private List<MetricFilter> metricFilters;
    private String hasSNSSubscriber;
    private List<Tag> tags;
    private String id;
    private String type;
    private String name;
    private String accountNumber;
    private String region;
    private ExternalFindings externalFindings;
    private Boolean hasCustomEventSelectors;
    private Boolean hasInsightSelectors;

    
    
    @JsonProperty("cloudWatchLogsLogGroupArn")
    public String getCloudWatchLogsLogGroupArn() { return cloudWatchLogsLogGroupArn; }
    @JsonProperty("cloudWatchLogsLogGroupArn")
    public void setCloudWatchLogsLogGroupArn(String value) { this.cloudWatchLogsLogGroupArn = value; }

    @JsonProperty("cloudWatchLogsRoleArn")
    public String getCloudWatchLogsRoleArn() { return cloudWatchLogsRoleArn; }
    @JsonProperty("cloudWatchLogsRoleArn")
    public void setCloudWatchLogsRoleArn(String value) { this.cloudWatchLogsRoleArn = value; }

    @JsonProperty("homeRegion")
    public String getHomeRegion() { return homeRegion; }
    @JsonProperty("homeRegion")
    public void setHomeRegion(String value) { this.homeRegion = value; }

    @JsonProperty("includeGlobalServiceEvents")
    public Boolean getIncludeGlobalServiceEvents() { return includeGlobalServiceEvents; }
    @JsonProperty("includeGlobalServiceEvents")
    public void setIncludeGlobalServiceEvents(Boolean value) { this.includeGlobalServiceEvents = value; }

    @JsonProperty("isMultiRegionTrail")
    public Boolean getIsMultiRegionTrail() { return isMultiRegionTrail; }
    @JsonProperty("isMultiRegionTrail")
    public void setIsMultiRegionTrail(Boolean value) { this.isMultiRegionTrail = value; }

    @JsonProperty("isOrganizationTrail")
    public Boolean getIsOrganizationTrail() { return isOrganizationTrail; }
    @JsonProperty("isOrganizationTrail")
    public void setIsOrganizationTrail(Boolean value) { this.isOrganizationTrail = value; }

    @JsonProperty("kmsKeyId")
    public String getKmsKeyID() { return kmsKeyID; }
    @JsonProperty("kmsKeyId")
    public void setKmsKeyID(String value) { this.kmsKeyID = value; }

    @JsonProperty("logFileValidationEnabled")
    public Boolean getLogFileValidationEnabled() { return logFileValidationEnabled; }
    @JsonProperty("logFileValidationEnabled")
    public void setLogFileValidationEnabled(Boolean value) { this.logFileValidationEnabled = value; }

    @JsonProperty("s3BucketName")
    public String getS3BucketName() { return s3BucketName; }
    @JsonProperty("s3BucketName")
    public void setS3BucketName(String value) { this.s3BucketName = value; }

    @JsonProperty("s3KeyPrefix")
    public String getS3KeyPrefix() { return s3KeyPrefix; }
    @JsonProperty("s3KeyPrefix")
    public void setS3KeyPrefix(String value) { this.s3KeyPrefix = value; }

    @JsonProperty("snsTopicArn")
    public String getSnsTopicArn() { return snsTopicArn; }
    @JsonProperty("snsTopicArn")
    public void setSnsTopicArn(String value) { this.snsTopicArn = value; }

    @JsonProperty("snsTopicName")
    public String getSnsTopicName() { return snsTopicName; }
    @JsonProperty("snsTopicName")
    public void setSnsTopicName(String value) { this.snsTopicName = value; }

    @JsonProperty("trailArn")
    public String getTrailArn() { return trailArn; }
    @JsonProperty("trailArn")
    public void setTrailArn(String value) { this.trailArn = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("eventSelectors")
    public List<EventSelector> getEventSelectors() { return eventSelectors; }
    @JsonProperty("eventSelectors")
    public void setEventSelectors(List<EventSelector> value) { this.eventSelectors = value; }

    @JsonProperty("metricFilters")
    public List<MetricFilter> getMetricFilters() { return metricFilters; }
    @JsonProperty("metricFilters")
    public void setMetricFilters(List<MetricFilter> value) { this.metricFilters = value; }

    @JsonProperty("hasSNSSubscriber")
    public String getHasSNSSubscriber() { return hasSNSSubscriber; }
    @JsonProperty("hasSNSSubscriber")
    public void setHasSNSSubscriber(String value) { this.hasSNSSubscriber = value; }

    @JsonProperty("tags")
    public List<Tag> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Tag> value) { this.tags = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("externalFindings")
    public ExternalFindings getExternalFindings() { return externalFindings; }
    @JsonProperty("externalFindings")
    public void setExternalFindings(ExternalFindings value) { this.externalFindings = value; }
	
    @JsonProperty("hasCustomEventSelectors")
    public Boolean getHasCustomEventSelectors() {
		return hasCustomEventSelectors;
	}
    @JsonProperty("hasCustomEventSelectors")
	public void setHasCustomEventSelectors(Boolean hasCustomEventSelectors) {
		this.hasCustomEventSelectors = hasCustomEventSelectors;
	}
	
    @JsonProperty("hasInsightSelectors")
	public Boolean getHasInsightSelectors() {
		return hasInsightSelectors;
	}
    @JsonProperty("hasInsightSelectors")
	public void setHasInsightSelectors(Boolean hasInsightSelectors) {
		this.hasInsightSelectors = hasInsightSelectors;
	}
}
