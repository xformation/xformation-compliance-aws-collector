package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class Status {
    private String message;
    private String code;

    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }
}
