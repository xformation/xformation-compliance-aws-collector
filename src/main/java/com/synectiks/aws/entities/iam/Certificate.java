package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;

public class Certificate {
    private String isActive;
    private String lastRotated;

    @JsonProperty("isActive")
    public String getIsActive() { return isActive; }
    @JsonProperty("isActive")
    public void setIsActive(String value) { this.isActive = value; }

    @JsonProperty("lastRotated")
    public String getLastRotated() { return lastRotated; }
    @JsonProperty("lastRotated")
    public void setLastRotated(String value) { this.lastRotated = value; }
}
