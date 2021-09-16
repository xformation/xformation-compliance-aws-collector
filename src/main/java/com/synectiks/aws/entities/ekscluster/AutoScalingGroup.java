package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class AutoScalingGroup implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
    
	@Override
	public String toString() {
		return "AutoScalingGroup [name=" + name + "]";
	}
}
