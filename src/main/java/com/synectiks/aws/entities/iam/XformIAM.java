package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;
import com.synectiks.aws.entities.common.Tag;

import java.util.List;

public class XformIAM {
    private String createDate;
    private String passwordLastUsed;
    private String arn;
    private String path;
    private List<ManagedPolicy> managedPolicies;
    private List<InlinePolicy> inlinePolicies;
    private List<AttachedGroup> attachedGroups;
    private String passwordEnabled;
    private String passwordLastChanged;
    private String passwordNextRotation;
    private String mfaActive;
    private AccessKey firstAccessKey;
    private AccessKey secondAccessKey;
    private Certificate firstCertificate;
    private Certificate secondCertificate;
    private List<CombinedPolicy> combinedPolicies;
    private String virtualMfaEnabled;
    private String mfaType;
    private PermissionsBoundary permissionsBoundary;
    private List<Tag> tags;
    private String id;
    private String type;
    private String name;
    private String dome9ID;
    private String accountNumber;
    private String region;
    private ExternalFindings externalFindings;

    @JsonProperty("createDate")
    public String getCreateDate() { return createDate; }
    @JsonProperty("createDate")
    public void setCreateDate(String value) { this.createDate = value; }

    @JsonProperty("passwordLastUsed")
    public String getPasswordLastUsed() { return passwordLastUsed; }
    @JsonProperty("passwordLastUsed")
    public void setPasswordLastUsed(String value) { this.passwordLastUsed = value; }

    @JsonProperty("arn")
    public String getArn() { return arn; }
    @JsonProperty("arn")
    public void setArn(String value) { this.arn = value; }

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

    @JsonProperty("attachedGroups")
    public List<AttachedGroup> getAttachedGroups() { return attachedGroups; }
    @JsonProperty("attachedGroups")
    public void setAttachedGroups(List<AttachedGroup> value) { this.attachedGroups = value; }

    @JsonProperty("passwordEnabled")
    public String getPasswordEnabled() { return passwordEnabled; }
    @JsonProperty("passwordEnabled")
    public void setPasswordEnabled(String value) { this.passwordEnabled = value; }

    @JsonProperty("passwordLastChanged")
    public String getPasswordLastChanged() { return passwordLastChanged; }
    @JsonProperty("passwordLastChanged")
    public void setPasswordLastChanged(String value) { this.passwordLastChanged = value; }

    @JsonProperty("passwordNextRotation")
    public String getPasswordNextRotation() { return passwordNextRotation; }
    @JsonProperty("passwordNextRotation")
    public void setPasswordNextRotation(String value) { this.passwordNextRotation = value; }

    @JsonProperty("mfaActive")
    public String getMfaActive() { return mfaActive; }
    @JsonProperty("mfaActive")
    public void setMfaActive(String value) { this.mfaActive = value; }

    @JsonProperty("firstAccessKey")
    public AccessKey getFirstAccessKey() { return firstAccessKey; }
    @JsonProperty("firstAccessKey")
    public void setFirstAccessKey(AccessKey value) { this.firstAccessKey = value; }

    @JsonProperty("secondAccessKey")
    public AccessKey getSecondAccessKey() { return secondAccessKey; }
    @JsonProperty("secondAccessKey")
    public void setSecondAccessKey(AccessKey value) { this.secondAccessKey = value; }

    @JsonProperty("firstCertificate")
    public Certificate getFirstCertificate() { return firstCertificate; }
    @JsonProperty("firstCertificate")
    public void setFirstCertificate(Certificate value) { this.firstCertificate = value; }

    @JsonProperty("secondCertificate")
    public Certificate getSecondCertificate() { return secondCertificate; }
    @JsonProperty("secondCertificate")
    public void setSecondCertificate(Certificate value) { this.secondCertificate = value; }

    @JsonProperty("combinedPolicies")
    public List<CombinedPolicy> getCombinedPolicies() { return combinedPolicies; }
    @JsonProperty("combinedPolicies")
    public void setCombinedPolicies(List<CombinedPolicy> value) { this.combinedPolicies = value; }

    @JsonProperty("virtualMfaEnabled")
    public String getVirtualMfaEnabled() { return virtualMfaEnabled; }
    @JsonProperty("virtualMfaEnabled")
    public void setVirtualMfaEnabled(String value) { this.virtualMfaEnabled = value; }

    @JsonProperty("mfaType")
    public String getMfaType() { return mfaType; }
    @JsonProperty("mfaType")
    public void setMfaType(String value) { this.mfaType = value; }

    @JsonProperty("permissionsBoundary")
    public PermissionsBoundary getPermissionsBoundary() { return permissionsBoundary; }
    @JsonProperty("permissionsBoundary")
    public void setPermissionsBoundary(PermissionsBoundary value) { this.permissionsBoundary = value; }

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

    @JsonProperty("dome9Id")
    public String getDome9ID() { return dome9ID; }
    @JsonProperty("dome9Id")
    public void setDome9ID(String value) { this.dome9ID = value; }

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
}
