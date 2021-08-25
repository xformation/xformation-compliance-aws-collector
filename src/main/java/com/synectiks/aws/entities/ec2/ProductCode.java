package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class ProductCode {
    private String productCodeID;
    private String productCodeType;

    @JsonProperty("productCodeId")
    public String getProductCodeID() { return productCodeID; }
    @JsonProperty("productCodeId")
    public void setProductCodeID(String value) { this.productCodeID = value; }

    @JsonProperty("productCodeType")
    public String getProductCodeType() { return productCodeType; }
    @JsonProperty("productCodeType")
    public void setProductCodeType(String value) { this.productCodeType = value; }
}
