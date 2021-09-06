package com.synectiks.aws.s3;

import com.fasterxml.jackson.annotation.*;

public class Policy {
    private String name;
    private Document document;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("document")
    public Document getDocument() { return document; }
    @JsonProperty("document")
    public void setDocument(Document value) { this.document = value; }
}
