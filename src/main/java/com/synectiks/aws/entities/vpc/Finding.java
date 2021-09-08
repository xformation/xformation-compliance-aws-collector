package com.synectiks.aws.entities.vpc;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Finding {
	private String receivedTimeStamp;
	private String findingSeverity;
	private String originalFindingSeverity;
	private String resourceID;
	private String resourceName;
	private String findingSourceURL;
	private String platform;
	private String findingSource;
	private String findingSourceDescription;
	private String findingID;
	private String scanID;
	private String findingCreatedAt;
	private String findingTitle;
	private String findingDescription;
	private String findingStatus;
	private String findingRecommendation;
	private String findingCategory;
	private List<TagsEntities> relatedFindingsRef;
	private String ruleID;
	private FindingRulesPackage findingRulesPackage;
	private List<AdditionalField> additionalFields;

	@JsonProperty("receivedTimeStamp")
	public String getReceivedTimeStamp() {
		return receivedTimeStamp;
	}

	@JsonProperty("receivedTimeStamp")
	public void setReceivedTimeStamp(String value) {
		this.receivedTimeStamp = value;
	}

	@JsonProperty("findingSeverity")
	public String getFindingSeverity() {
		return findingSeverity;
	}

	@JsonProperty("findingSeverity")
	public void setFindingSeverity(String value) {
		this.findingSeverity = value;
	}

	@JsonProperty("originalFindingSeverity")
	public String getOriginalFindingSeverity() {
		return originalFindingSeverity;
	}

	@JsonProperty("originalFindingSeverity")
	public void setOriginalFindingSeverity(String value) {
		this.originalFindingSeverity = value;
	}

	@JsonProperty("resourceId")
	public String getResourceID() {
		return resourceID;
	}

	@JsonProperty("resourceId")
	public void setResourceID(String value) {
		this.resourceID = value;
	}

	@JsonProperty("resourceName")
	public String getResourceName() {
		return resourceName;
	}

	@JsonProperty("resourceName")
	public void setResourceName(String value) {
		this.resourceName = value;
	}

	@JsonProperty("findingSourceUrl")
	public String getFindingSourceURL() {
		return findingSourceURL;
	}

	@JsonProperty("findingSourceUrl")
	public void setFindingSourceURL(String value) {
		this.findingSourceURL = value;
	}

	@JsonProperty("platform")
	public String getPlatform() {
		return platform;
	}

	@JsonProperty("platform")
	public void setPlatform(String value) {
		this.platform = value;
	}

	@JsonProperty("findingSource")
	public String getFindingSource() {
		return findingSource;
	}

	@JsonProperty("findingSource")
	public void setFindingSource(String value) {
		this.findingSource = value;
	}

	@JsonProperty("findingSourceDescription")
	public String getFindingSourceDescription() {
		return findingSourceDescription;
	}

	@JsonProperty("findingSourceDescription")
	public void setFindingSourceDescription(String value) {
		this.findingSourceDescription = value;
	}

	@JsonProperty("findingId")
	public String getFindingID() {
		return findingID;
	}

	@JsonProperty("findingId")
	public void setFindingID(String value) {
		this.findingID = value;
	}

	@JsonProperty("scanId")
	public String getScanID() {
		return scanID;
	}

	@JsonProperty("scanId")
	public void setScanID(String value) {
		this.scanID = value;
	}

	@JsonProperty("findingCreatedAt")
	public String getFindingCreatedAt() {
		return findingCreatedAt;
	}

	@JsonProperty("findingCreatedAt")
	public void setFindingCreatedAt(String value) {
		this.findingCreatedAt = value;
	}

	@JsonProperty("findingTitle")
	public String getFindingTitle() {
		return findingTitle;
	}

	@JsonProperty("findingTitle")
	public void setFindingTitle(String value) {
		this.findingTitle = value;
	}

	@JsonProperty("findingDescription")
	public String getFindingDescription() {
		return findingDescription;
	}

	@JsonProperty("findingDescription")
	public void setFindingDescription(String value) {
		this.findingDescription = value;
	}

	@JsonProperty("findingStatus")
	public String getFindingStatus() {
		return findingStatus;
	}

	@JsonProperty("findingStatus")
	public void setFindingStatus(String value) {
		this.findingStatus = value;
	}

	@JsonProperty("findingRecommendation")
	public String getFindingRecommendation() {
		return findingRecommendation;
	}

	@JsonProperty("findingRecommendation")
	public void setFindingRecommendation(String value) {
		this.findingRecommendation = value;
	}

	@JsonProperty("findingCategory")
	public String getFindingCategory() {
		return findingCategory;
	}

	@JsonProperty("findingCategory")
	public void setFindingCategory(String value) {
		this.findingCategory = value;
	}

	@JsonProperty("relatedFindingsRef")
	public List<TagsEntities> getRelatedFindingsRef() {
		return relatedFindingsRef;
	}

	@JsonProperty("relatedFindingsRef")
	public void setRelatedFindingsRef(List<TagsEntities> value) {
		this.relatedFindingsRef = value;
	}

	@JsonProperty("ruleId")
	public String getRuleID() {
		return ruleID;
	}

	@JsonProperty("ruleId")
	public void setRuleID(String value) {
		this.ruleID = value;
	}

	@JsonProperty("findingRulesPackage")
	public FindingRulesPackage getFindingRulesPackage() {
		return findingRulesPackage;
	}

	@JsonProperty("findingRulesPackage")
	public void setFindingRulesPackage(FindingRulesPackage value) {
		this.findingRulesPackage = value;
	}

	@JsonProperty("additionalFields")
	public List<AdditionalField> getAdditionalFields() {
		return additionalFields;
	}

	@JsonProperty("additionalFields")
	public void setAdditionalFields(List<AdditionalField> value) {
		this.additionalFields = value;
	}
}
