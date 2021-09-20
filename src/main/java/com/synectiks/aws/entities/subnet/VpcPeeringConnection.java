package com.synectiks.aws.entities.subnet;

import com.fasterxml.jackson.annotation.*;

public class VpcPeeringConnection {
    private String vpcPeeringConnectionID;
    private TargetVpc targetVpc;
    private Status status;
    private String expirationTime;

    @JsonProperty("vpcPeeringConnectionId")
    public String getVpcPeeringConnectionID() { return vpcPeeringConnectionID; }
    @JsonProperty("vpcPeeringConnectionId")
    public void setVpcPeeringConnectionID(String value) { this.vpcPeeringConnectionID = value; }

    @JsonProperty("targetVpc")
    public TargetVpc getTargetVpc() { return targetVpc; }
    @JsonProperty("targetVpc")
    public void setTargetVpc(TargetVpc value) { this.targetVpc = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("expirationTime")
    public String getExpirationTime() { return expirationTime; }
    @JsonProperty("expirationTime")
    public void setExpirationTime(String value) { this.expirationTime = value; }
}
