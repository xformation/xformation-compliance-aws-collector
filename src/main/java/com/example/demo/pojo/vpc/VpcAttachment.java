package com.example.demo.pojo.vpc;

import com.fasterxml.jackson.annotation.*;

public class VpcAttachment {
    private String state;
    private String vpcID;

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("vpcId")
    public String getVpcID() { return vpcID; }
    @JsonProperty("vpcId")
    public void setVpcID(String value) { this.vpcID = value; }
}
