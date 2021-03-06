package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrivateIPAddress {
	private NetworkInterfaceAssociation association;
	private String primary;
	private String privateDNSName;
	private String privateIPAddress;

	@JsonProperty("association")
	public NetworkInterfaceAssociation getAssociation() {
		return association;
	}

	@JsonProperty("association")
	public void setAssociation(NetworkInterfaceAssociation value) {
		this.association = value;
	}

	@JsonProperty("primary")
	public String getPrimary() {
		return primary;
	}

	@JsonProperty("primary")
	public void setPrimary(String value) {
		this.primary = value;
	}

	@JsonProperty("privateDnsName")
	public String getPrivateDNSName() {
		return privateDNSName;
	}

	@JsonProperty("privateDnsName")
	public void setPrivateDNSName(String value) {
		this.privateDNSName = value;
	}

	@JsonProperty("privateIpAddress")
	public String getPrivateIPAddress() {
		return privateIPAddress;
	}

	@JsonProperty("privateIpAddress")
	public void setPrivateIPAddress(String value) {
		this.privateIPAddress = value;
	}
}
