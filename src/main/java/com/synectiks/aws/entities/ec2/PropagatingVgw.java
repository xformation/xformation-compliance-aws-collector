package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class PropagatingVgw {
    private String gatewayID;

    @JsonProperty("gatewayId")
    public String getGatewayID() { return gatewayID; }
    @JsonProperty("gatewayId")
    public void setGatewayID(String value) { this.gatewayID = value; }
}
