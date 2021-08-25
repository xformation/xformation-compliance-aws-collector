package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class CombinedPolicy {
    private String name;
    private String id;
    private String relationType;
    private AssumeRolePolicy policyDocument;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("relationType")
    public String getRelationType() { return relationType; }
    @JsonProperty("relationType")
    public void setRelationType(String value) { this.relationType = value; }

    @JsonProperty("policyDocument")
    public AssumeRolePolicy getPolicyDocument() { return policyDocument; }
    @JsonProperty("policyDocument")
    public void setPolicyDocument(AssumeRolePolicy value) { this.policyDocument = value; }
}
