package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class Issue implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
    private String message;
    private PublicAccessCIDR[] resourceIDS;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    @JsonProperty("resourceIds")
    public PublicAccessCIDR[] getResourceIDS() { return resourceIDS; }
    @JsonProperty("resourceIds")
    public void setResourceIDS(PublicAccessCIDR[] value) { this.resourceIDS = value; }
    
	@Override
	public String toString() {
		return "Issue [code=" + code + ", message=" + message + ", resourceIDS=" + Arrays.toString(resourceIDS) + "]";
	}
}
