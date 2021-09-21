package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkInterfaceAssociation {
	private String allocationID;
	private String associationID;
	private String ipOwnerID;
	private String publicDNSName;
	private String publicIP;

	@JsonProperty("allocationId")
	public String getAllocationID() {
		return allocationID;
	}

	@JsonProperty("allocationId")
	public void setAllocationID(String value) {
		this.allocationID = value;
	}

	@JsonProperty("associationId")
	public String getAssociationID() {
		return associationID;
	}

	@JsonProperty("associationId")
	public void setAssociationID(String value) {
		this.associationID = value;
	}

	@JsonProperty("ipOwnerId")
	public String getIPOwnerID() {
		return ipOwnerID;
	}

	@JsonProperty("ipOwnerId")
	public void setIPOwnerID(String value) {
		this.ipOwnerID = value;
	}

	@JsonProperty("publicDnsName")
	public String getPublicDNSName() {
		return publicDNSName;
	}

	@JsonProperty("publicDnsName")
	public void setPublicDNSName(String value) {
		this.publicDNSName = value;
	}

	@JsonProperty("publicIp")
	public String getPublicIP() {
		return publicIP;
	}

	@JsonProperty("publicIp")
	public void setPublicIP(String value) {
		this.publicIP = value;
	}
}
