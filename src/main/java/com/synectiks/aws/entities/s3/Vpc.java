package com.synectiks.aws.entities.s3;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vpc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cloudAccountID;
	private String cidr;
	private String region;
	private String id;
	private String accountNumber;
	private List<VPNGateway> vpnGateways;
	private List<InternetGateway> internetGateways;
	private String dhcpOptionsID;
	private String instanceTenancy;
	private String isDefault;
	private String state;
	private List<Tag> tags;
	private String name;
	private List<VpcPeeringConnection> vpcPeeringConnections;
	private String source;
	private String ownerID;

	@JsonProperty("cloudAccountId")
	public String getCloudAccountID() {
		return cloudAccountID;
	}

	@JsonProperty("cloudAccountId")
	public void setCloudAccountID(String value) {
		this.cloudAccountID = value;
	}

	@JsonProperty("cidr")
	public String getCIDR() {
		return cidr;
	}

	@JsonProperty("cidr")
	public void setCIDR(String value) {
		this.cidr = value;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String value) {
		this.region = value;
	}

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	@JsonProperty("vpnGateways")
	public List<VPNGateway> getVPNGateways() {
		return vpnGateways;
	}

	@JsonProperty("vpnGateways")
	public void setVPNGateways(List<VPNGateway> value) {
		this.vpnGateways = value;
	}

	@JsonProperty("internetGateways")
	public List<InternetGateway> getInternetGateways() {
		return internetGateways;
	}

	@JsonProperty("internetGateways")
	public void setInternetGateways(List<InternetGateway> value) {
		this.internetGateways = value;
	}

	@JsonProperty("dhcpOptionsId")
	public String getDHCPOptionsID() {
		return dhcpOptionsID;
	}

	@JsonProperty("dhcpOptionsId")
	public void setDHCPOptionsID(String value) {
		this.dhcpOptionsID = value;
	}

	@JsonProperty("instanceTenancy")
	public String getInstanceTenancy() {
		return instanceTenancy;
	}

	@JsonProperty("instanceTenancy")
	public void setInstanceTenancy(String value) {
		this.instanceTenancy = value;
	}

	@JsonProperty("isDefault")
	public String getIsDefault() {
		return isDefault;
	}

	@JsonProperty("isDefault")
	public void setIsDefault(String value) {
		this.isDefault = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("vpcPeeringConnections")
	public List<VpcPeeringConnection> getVpcPeeringConnections() {
		return vpcPeeringConnections;
	}

	@JsonProperty("vpcPeeringConnections")
	public void setVpcPeeringConnections(List<VpcPeeringConnection> value) {
		this.vpcPeeringConnections = value;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String value) {
		this.source = value;
	}

	@JsonProperty("ownerId")
	public String getOwnerID() {
		return ownerID;
	}

	@JsonProperty("ownerId")
	public void setOwnerID(String value) {
		this.ownerID = value;
	}

	@Override
	public String toString() {
		return "Vpc [cloudAccountID=" + cloudAccountID + ", cidr=" + cidr + ", region=" + region + ", id=" + id
				+ ", accountNumber=" + accountNumber + ", vpnGateways=" + vpnGateways + ", internetGateways="
				+ internetGateways + ", dhcpOptionsID=" + dhcpOptionsID + ", instanceTenancy=" + instanceTenancy
				+ ", isDefault=" + isDefault + ", state=" + state + ", tags=" + tags + ", name=" + name
				+ ", vpcPeeringConnections=" + vpcPeeringConnections + ", source=" + source + ", ownerID=" + ownerID
				+ "]";
	}

}
