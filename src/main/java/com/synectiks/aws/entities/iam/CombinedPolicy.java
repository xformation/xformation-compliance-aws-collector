package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;

public class CombinedPolicy {
    private String name;
    private String id;
    private String relationType;
    private AttachedGroup policyDocument;

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
    public AttachedGroup getPolicyDocument() { return policyDocument; }
    @JsonProperty("policyDocument")
    public void setPolicyDocument(AttachedGroup value) { this.policyDocument = value; }
}
