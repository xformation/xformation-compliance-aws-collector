package com.synectiks.aws.entities.lambda;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class ExecutionRole implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String arn;
    private ResourcePolicy assumeRolePolicy;
    private String path;
    private List<ManagedPolicy> managedPolicies;
    private List<InlinePolicy> inlinePolicies;
    private List<CombinedPolicy> combinedPolicies;
    private String accessAnalyzerFindingCount;
    private PermissionsBoundary permissionsBoundary;
    private List<EnvironmentVariable> tags;
    private RoleLastUsed roleLastUsed;
    private String maxSessionDuration;
    private String id;
    private String type;
    private String name;
    private String accountNumber;
    private String region;
    private ExternalFindings externalFindings;

    @JsonProperty("arn")
    public String getArn() { return arn; }
    @JsonProperty("arn")
    public void setArn(String value) { this.arn = value; }

    @JsonProperty("assumeRolePolicy")
    public ResourcePolicy getAssumeRolePolicy() { return assumeRolePolicy; }
    @JsonProperty("assumeRolePolicy")
    public void setAssumeRolePolicy(ResourcePolicy value) { this.assumeRolePolicy = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("managedPolicies")
    public List<ManagedPolicy> getManagedPolicies() { return managedPolicies; }
    @JsonProperty("managedPolicies")
    public void setManagedPolicies(List<ManagedPolicy> value) { this.managedPolicies = value; }

    @JsonProperty("inlinePolicies")
    public List<InlinePolicy> getInlinePolicies() { return inlinePolicies; }
    @JsonProperty("inlinePolicies")
    public void setInlinePolicies(List<InlinePolicy> value) { this.inlinePolicies = value; }

    @JsonProperty("combinedPolicies")
    public List<CombinedPolicy> getCombinedPolicies() { return combinedPolicies; }
    @JsonProperty("combinedPolicies")
    public void setCombinedPolicies(List<CombinedPolicy> value) { this.combinedPolicies = value; }

    @JsonProperty("accessAnalyzerFindingCount")
    public String getAccessAnalyzerFindingCount() { return accessAnalyzerFindingCount; }
    @JsonProperty("accessAnalyzerFindingCount")
    public void setAccessAnalyzerFindingCount(String value) { this.accessAnalyzerFindingCount = value; }

    @JsonProperty("permissionsBoundary")
    public PermissionsBoundary getPermissionsBoundary() { return permissionsBoundary; }
    @JsonProperty("permissionsBoundary")
    public void setPermissionsBoundary(PermissionsBoundary value) { this.permissionsBoundary = value; }

    @JsonProperty("tags")
    public List<EnvironmentVariable> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<EnvironmentVariable> value) { this.tags = value; }

    @JsonProperty("roleLastUsed")
    public RoleLastUsed getRoleLastUsed() { return roleLastUsed; }
    @JsonProperty("roleLastUsed")
    public void setRoleLastUsed(RoleLastUsed value) { this.roleLastUsed = value; }

    @JsonProperty("maxSessionDuration")
    public String getMaxSessionDuration() { return maxSessionDuration; }
    @JsonProperty("maxSessionDuration")
    public void setMaxSessionDuration(String value) { this.maxSessionDuration = value; }

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
	@Override
	public String toString() {
		return "ExecutionRole [arn=" + arn + ", assumeRolePolicy=" + assumeRolePolicy + ", path=" + path
				+ ", managedPolicies=" + managedPolicies + ", inlinePolicies=" + inlinePolicies + ", combinedPolicies="
				+ combinedPolicies + ", accessAnalyzerFindingCount=" + accessAnalyzerFindingCount
				+ ", permissionsBoundary=" + permissionsBoundary + ", tags=" + tags + ", roleLastUsed=" + roleLastUsed
				+ ", maxSessionDuration=" + maxSessionDuration + ", id=" + id + ", type=" + type + ", name=" + name
				+ ", accountNumber=" + accountNumber + ", region=" + region + ", externalFindings=" + externalFindings
				+ "]";
	}
}
