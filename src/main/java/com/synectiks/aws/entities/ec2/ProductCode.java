package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class ProductCode implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	@Override
	public String toString() {
		return "ProductCode [productCodeID=" + productCodeID + ", productCodeType=" + productCodeType + "]";
	}
    
    
}
