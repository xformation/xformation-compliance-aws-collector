package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import software.amazon.awssdk.services.eks.model.LogType;

public class ClusterLogging implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean enabled;
//    private PublicAccessCIDR[] types;
    private List<LogType> types;
    
    @JsonProperty("enabled")
    public Boolean getEnabled() { return enabled; }
    @JsonProperty("enabled")
    public void setEnabled(Boolean value) { this.enabled = value; }

//    @JsonProperty("types")
//    public PublicAccessCIDR[] getTypes() { return types; }
//    @JsonProperty("types")
//    public void setTypes(PublicAccessCIDR[] value) { this.types = value; }
    
    @JsonProperty("types")
    public List<LogType> getTypes() { return types; }
    @JsonProperty("types")
    public void setTypes(List<LogType> value) { this.types = value; }
    
	@Override
	public String toString() {
		return "ClusterLogging [enabled=" + enabled + ", types=" + types + "]";
	}
}
