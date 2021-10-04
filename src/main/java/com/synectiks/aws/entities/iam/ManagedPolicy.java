package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;

public class ManagedPolicy {
    private String arn;
    private String name;

    @JsonProperty("arn")
    public String getArn() { return arn; }
    @JsonProperty("arn")
    public void setArn(String value) { this.arn = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
