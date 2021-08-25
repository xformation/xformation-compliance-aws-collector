package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class CustomTag {
    private String key;
    private String value;

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
	@Override
	public String toString() {
		return "CustomTag [key=" + key + ", value=" + value + "]";
	}
    
    
}
