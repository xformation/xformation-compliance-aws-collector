package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class AssociationElement {
    private String isMain;
    private String subnetID;

    @JsonProperty("isMain")
    public String getIsMain() { return isMain; }
    @JsonProperty("isMain")
    public void setIsMain(String value) { this.isMain = value; }

    @JsonProperty("subnetId")
    public String getSubnetID() { return subnetID; }
    @JsonProperty("subnetId")
    public void setSubnetID(String value) { this.subnetID = value; }
}
