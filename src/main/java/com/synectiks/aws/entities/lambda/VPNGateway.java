package com.synectiks.aws.entities.lambda;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VPNGateway implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String availabilityZone;
	private String state;
	private String type;
	private String vpnGatewayID;
	private ResourcePolicy tags;
	private List<DirectConnectVirtualInterface> directConnectVirtualInterfaces;
	private List<VpcAttachment> vpcAttachments;

	@JsonProperty("availabilityZone")
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	@JsonProperty("availabilityZone")
	public void setAvailabilityZone(String value) {
		this.availabilityZone = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("vpnGatewayId")
	public String getVPNGatewayID() {
		return vpnGatewayID;
	}

	@JsonProperty("vpnGatewayId")
	public void setVPNGatewayID(String value) {
		this.vpnGatewayID = value;
	}

	@JsonProperty("tags")
	public ResourcePolicy getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(ResourcePolicy value) {
		this.tags = value;
	}

	@JsonProperty("directConnectVirtualInterfaces")
	public List<DirectConnectVirtualInterface> getDirectConnectVirtualInterfaces() {
		return directConnectVirtualInterfaces;
	}

	@JsonProperty("directConnectVirtualInterfaces")
	public void setDirectConnectVirtualInterfaces(List<DirectConnectVirtualInterface> value) {
		this.directConnectVirtualInterfaces = value;
	}

	@JsonProperty("vpcAttachments")
	public List<VpcAttachment> getVpcAttachments() {
		return vpcAttachments;
	}

	@JsonProperty("vpcAttachments")
	public void setVpcAttachments(List<VpcAttachment> value) {
		this.vpcAttachments = value;
	}

	@Override
	public String toString() {
		return "VPNGateway [availabilityZone=" + availabilityZone + ", state=" + state + ", type=" + type
				+ ", vpnGatewayID=" + vpnGatewayID + ", tags=" + tags + ", directConnectVirtualInterfaces="
				+ directConnectVirtualInterfaces + ", vpcAttachments=" + vpcAttachments + "]";
	}
}
