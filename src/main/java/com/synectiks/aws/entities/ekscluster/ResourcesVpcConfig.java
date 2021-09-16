package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class ResourcesVpcConfig implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean endpointPrivateAccess;
    private Boolean endpointPublicAccess;
    private PublicAccessCIDR[] publicAccessCidrs;
    private SecurityGroup[] additionalSecurityGroups;
    private SecurityGroup clusterSecurityGroup;
    private PublicAccessCIDR[] subnetIDS;
    private String vpcID;

    @JsonProperty("endpointPrivateAccess")
    public Boolean getEndpointPrivateAccess() { return endpointPrivateAccess; }
    @JsonProperty("endpointPrivateAccess")
    public void setEndpointPrivateAccess(Boolean value) { this.endpointPrivateAccess = value; }

    @JsonProperty("endpointPublicAccess")
    public Boolean getEndpointPublicAccess() { return endpointPublicAccess; }
    @JsonProperty("endpointPublicAccess")
    public void setEndpointPublicAccess(Boolean value) { this.endpointPublicAccess = value; }

    @JsonProperty("publicAccessCidrs")
    public PublicAccessCIDR[] getPublicAccessCidrs() { return publicAccessCidrs; }
    @JsonProperty("publicAccessCidrs")
    public void setPublicAccessCidrs(PublicAccessCIDR[] value) { this.publicAccessCidrs = value; }

    @JsonProperty("additionalSecurityGroups")
    public SecurityGroup[] getAdditionalSecurityGroups() { return additionalSecurityGroups; }
    @JsonProperty("additionalSecurityGroups")
    public void setAdditionalSecurityGroups(SecurityGroup[] value) { this.additionalSecurityGroups = value; }

    @JsonProperty("clusterSecurityGroup")
    public SecurityGroup getClusterSecurityGroup() { return clusterSecurityGroup; }
    @JsonProperty("clusterSecurityGroup")
    public void setClusterSecurityGroup(SecurityGroup value) { this.clusterSecurityGroup = value; }

    @JsonProperty("subnetIds")
    public PublicAccessCIDR[] getSubnetIDS() { return subnetIDS; }
    @JsonProperty("subnetIds")
    public void setSubnetIDS(PublicAccessCIDR[] value) { this.subnetIDS = value; }

    @JsonProperty("vpcId")
    public String getVpcID() { return vpcID; }
    @JsonProperty("vpcId")
    public void setVpcID(String value) { this.vpcID = value; }
    
	@Override
	public String toString() {
		return "ResourcesVpcConfig [endpointPrivateAccess=" + endpointPrivateAccess + ", endpointPublicAccess="
				+ endpointPublicAccess + ", publicAccessCidrs=" + Arrays.toString(publicAccessCidrs)
				+ ", additionalSecurityGroups=" + Arrays.toString(additionalSecurityGroups) + ", clusterSecurityGroup="
				+ clusterSecurityGroup + ", subnetIDS=" + Arrays.toString(subnetIDS) + ", vpcID=" + vpcID + "]";
	}
}
