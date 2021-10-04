package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;

public class AccessKey {
    private String isActive;
    private String lastRotated;
    private String lastUsedDate;
    private String lastUsedRegion;
    private String lastUsedService;

    @JsonProperty("isActive")
    public String getIsActive() { return isActive; }
    @JsonProperty("isActive")
    public void setIsActive(String value) { this.isActive = value; }

    @JsonProperty("lastRotated")
    public String getLastRotated() { return lastRotated; }
    @JsonProperty("lastRotated")
    public void setLastRotated(String value) { this.lastRotated = value; }

    @JsonProperty("lastUsedDate")
    public String getLastUsedDate() { return lastUsedDate; }
    @JsonProperty("lastUsedDate")
    public void setLastUsedDate(String value) { this.lastUsedDate = value; }

    @JsonProperty("lastUsedRegion")
    public String getLastUsedRegion() { return lastUsedRegion; }
    @JsonProperty("lastUsedRegion")
    public void setLastUsedRegion(String value) { this.lastUsedRegion = value; }

    @JsonProperty("lastUsedService")
    public String getLastUsedService() { return lastUsedService; }
    @JsonProperty("lastUsedService")
    public void setLastUsedService(String value) { this.lastUsedService = value; }
}
