package com.synectiks.aws.entities.subnet;

import com.fasterxml.jackson.annotation.*;

public class StringClass {
    private String length;

    @JsonProperty("length")
    public String getLength() { return length; }
    @JsonProperty("length")
    public void setLength(String value) { this.length = value; }
}
