package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class EnvironmentVariable implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return "EnvironmentVariable [key=" + key + ", value=" + value + "]";
	}
}
