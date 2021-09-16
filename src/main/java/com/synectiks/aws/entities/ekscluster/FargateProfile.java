package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class FargateProfile implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clusterName;
    private String createdAt;
    private String fargateProfileArn;
    private String fargateProfileName;
    private String podExecutionRoleArn;
    private Selector[] selectors;
    private String status;
    private PublicAccessCIDR[] subnets;
    private Tag[] tags;

    @JsonProperty("clusterName")
    public String getClusterName() { return clusterName; }
    @JsonProperty("clusterName")
    public void setClusterName(String value) { this.clusterName = value; }

    @JsonProperty("createdAt")
    public String getCreatedAt() { return createdAt; }
    @JsonProperty("createdAt")
    public void setCreatedAt(String value) { this.createdAt = value; }

    @JsonProperty("fargateProfileArn")
    public String getFargateProfileArn() { return fargateProfileArn; }
    @JsonProperty("fargateProfileArn")
    public void setFargateProfileArn(String value) { this.fargateProfileArn = value; }

    @JsonProperty("fargateProfileName")
    public String getFargateProfileName() { return fargateProfileName; }
    @JsonProperty("fargateProfileName")
    public void setFargateProfileName(String value) { this.fargateProfileName = value; }

    @JsonProperty("podExecutionRoleArn")
    public String getPodExecutionRoleArn() { return podExecutionRoleArn; }
    @JsonProperty("podExecutionRoleArn")
    public void setPodExecutionRoleArn(String value) { this.podExecutionRoleArn = value; }

    @JsonProperty("selectors")
    public Selector[] getSelectors() { return selectors; }
    @JsonProperty("selectors")
    public void setSelectors(Selector[] value) { this.selectors = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("subnets")
    public PublicAccessCIDR[] getSubnets() { return subnets; }
    @JsonProperty("subnets")
    public void setSubnets(PublicAccessCIDR[] value) { this.subnets = value; }

    @JsonProperty("tags")
    public Tag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(Tag[] value) { this.tags = value; }
    
	@Override
	public String toString() {
		return "FargateProfile [clusterName=" + clusterName + ", createdAt=" + createdAt + ", fargateProfileArn="
				+ fargateProfileArn + ", fargateProfileName=" + fargateProfileName + ", podExecutionRoleArn="
				+ podExecutionRoleArn + ", selectors=" + Arrays.toString(selectors) + ", status=" + status
				+ ", subnets=" + Arrays.toString(subnets) + ", tags=" + Arrays.toString(tags) + "]";
	}
}
