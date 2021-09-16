package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class SecurityGroup implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private BoundRule[] inboundRules;
    private BoundRule[] outboundRules;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("inboundRules")
    public BoundRule[] getInboundRules() { return inboundRules; }
    @JsonProperty("inboundRules")
    public void setInboundRules(BoundRule[] value) { this.inboundRules = value; }

    @JsonProperty("outboundRules")
    public BoundRule[] getOutboundRules() { return outboundRules; }
    @JsonProperty("outboundRules")
    public void setOutboundRules(BoundRule[] value) { this.outboundRules = value; }
    
	@Override
	public String toString() {
		return "SecurityGroup [id=" + id + ", inboundRules=" + Arrays.toString(inboundRules) + ", outboundRules="
				+ Arrays.toString(outboundRules) + "]";
	}
}
