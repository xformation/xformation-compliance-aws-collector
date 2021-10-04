package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;

public class InlinePolicy {
    private String name;
    private AttachedGroup document;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("document")
    public AttachedGroup getDocument() { return document; }
    @JsonProperty("document")
    public void setDocument(AttachedGroup value) { this.document = value; }
}
