package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class Scan implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String scanID;
    private String scanName;
    private List<RulesPackage> rulesPackages;
    private FindingsCount findingsCount;
    private String state;
    private String source;
    private String creationTime;
    private String startTime;
    private String endTime;
    private AssumeRolePolicy sourceAdditionalFields;

    @JsonProperty("scanId")
    public String getScanID() { return scanID; }
    @JsonProperty("scanId")
    public void setScanID(String value) { this.scanID = value; }

    @JsonProperty("scanName")
    public String getScanName() { return scanName; }
    @JsonProperty("scanName")
    public void setScanName(String value) { this.scanName = value; }

    @JsonProperty("rulesPackages")
    public List<RulesPackage> getRulesPackages() { return rulesPackages; }
    @JsonProperty("rulesPackages")
    public void setRulesPackages(List<RulesPackage> value) { this.rulesPackages = value; }

    @JsonProperty("findingsCount")
    public FindingsCount getFindingsCount() { return findingsCount; }
    @JsonProperty("findingsCount")
    public void setFindingsCount(FindingsCount value) { this.findingsCount = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("creationTime")
    public String getCreationTime() { return creationTime; }
    @JsonProperty("creationTime")
    public void setCreationTime(String value) { this.creationTime = value; }

    @JsonProperty("startTime")
    public String getStartTime() { return startTime; }
    @JsonProperty("startTime")
    public void setStartTime(String value) { this.startTime = value; }

    @JsonProperty("endTime")
    public String getEndTime() { return endTime; }
    @JsonProperty("endTime")
    public void setEndTime(String value) { this.endTime = value; }

    @JsonProperty("sourceAdditionalFields")
    public AssumeRolePolicy getSourceAdditionalFields() { return sourceAdditionalFields; }
    @JsonProperty("sourceAdditionalFields")
    public void setSourceAdditionalFields(AssumeRolePolicy value) { this.sourceAdditionalFields = value; }
	@Override
	public String toString() {
		return "Scan [scanID=" + scanID + ", scanName=" + scanName + ", rulesPackages=" + rulesPackages
				+ ", findingsCount=" + findingsCount + ", state=" + state + ", source=" + source + ", creationTime="
				+ creationTime + ", startTime=" + startTime + ", endTime=" + endTime + ", sourceAdditionalFields="
				+ sourceAdditionalFields + "]";
	}
    
    
}
