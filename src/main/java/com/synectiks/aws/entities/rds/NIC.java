package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class NIC {
    private Subnet subnet;
    private List<SecurityGroup> securityGroups;

    @JsonProperty("subnet")
    public Subnet getSubnet() { return subnet; }
    @JsonProperty("subnet")
    public void setSubnet(Subnet value) { this.subnet = value; }

    @JsonProperty("securityGroups")
    public List<SecurityGroup> getSecurityGroups() { return securityGroups; }
    @JsonProperty("securityGroups")
    public void setSecurityGroups(List<SecurityGroup> value) { this.securityGroups = value; }
}
