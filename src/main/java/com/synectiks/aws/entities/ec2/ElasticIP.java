package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class ElasticIP {
    private String associationID;
    private String allocationID;

    @JsonProperty("associationId")
    public String getAssociationID() { return associationID; }
    @JsonProperty("associationId")
    public void setAssociationID(String value) { this.associationID = value; }

    @JsonProperty("allocationId")
    public String getAllocationID() { return allocationID; }
    @JsonProperty("allocationId")
    public void setAllocationID(String value) { this.allocationID = value; }
}
