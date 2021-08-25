package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class FindingsCount {
    private String high;
    private String medium;
    private String low;
    private String info;

    @JsonProperty("high")
    public String getHigh() { return high; }
    @JsonProperty("high")
    public void setHigh(String value) { this.high = value; }

    @JsonProperty("medium")
    public String getMedium() { return medium; }
    @JsonProperty("medium")
    public void setMedium(String value) { this.medium = value; }

    @JsonProperty("low")
    public String getLow() { return low; }
    @JsonProperty("low")
    public void setLow(String value) { this.low = value; }

    @JsonProperty("info")
    public String getInfo() { return info; }
    @JsonProperty("info")
    public void setInfo(String value) { this.info = value; }
}
