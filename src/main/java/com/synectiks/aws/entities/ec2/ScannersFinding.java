package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class ScannersFinding implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String findingID;
    private String findingTitle;
    private String scanID;
    private String assetType;
    private String creationTime;
    private String source;
    private RulesPackage rulesPackage;
    private String ruleID;
    private String ruleSeverity;

    @JsonProperty("findingId")
    public String getFindingID() { return findingID; }
    @JsonProperty("findingId")
    public void setFindingID(String value) { this.findingID = value; }

    @JsonProperty("findingTitle")
    public String getFindingTitle() { return findingTitle; }
    @JsonProperty("findingTitle")
    public void setFindingTitle(String value) { this.findingTitle = value; }

    @JsonProperty("scanId")
    public String getScanID() { return scanID; }
    @JsonProperty("scanId")
    public void setScanID(String value) { this.scanID = value; }

    @JsonProperty("assetType")
    public String getAssetType() { return assetType; }
    @JsonProperty("assetType")
    public void setAssetType(String value) { this.assetType = value; }

    @JsonProperty("creationTime")
    public String getCreationTime() { return creationTime; }
    @JsonProperty("creationTime")
    public void setCreationTime(String value) { this.creationTime = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("rulesPackage")
    public RulesPackage getRulesPackage() { return rulesPackage; }
    @JsonProperty("rulesPackage")
    public void setRulesPackage(RulesPackage value) { this.rulesPackage = value; }

    @JsonProperty("ruleId")
    public String getRuleID() { return ruleID; }
    @JsonProperty("ruleId")
    public void setRuleID(String value) { this.ruleID = value; }

    @JsonProperty("ruleSeverity")
    public String getRuleSeverity() { return ruleSeverity; }
    @JsonProperty("ruleSeverity")
    public void setRuleSeverity(String value) { this.ruleSeverity = value; }
	@Override
	public String toString() {
		return "ScannersFinding [findingID=" + findingID + ", findingTitle=" + findingTitle + ", scanID=" + scanID
				+ ", assetType=" + assetType + ", creationTime=" + creationTime + ", source=" + source
				+ ", rulesPackage=" + rulesPackage + ", ruleID=" + ruleID + ", ruleSeverity=" + ruleSeverity + "]";
	}
    
    
}
