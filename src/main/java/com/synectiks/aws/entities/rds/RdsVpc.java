package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;
import com.synectiks.aws.entities.ec2.XformEc2VpcCidrBlockAssociation;

import software.amazon.awssdk.services.ec2.model.Vpc;
import software.amazon.awssdk.services.ec2.model.VpcIpv6CidrBlockAssociation;

public class RdsVpc implements Serializable{
	
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
	private Boolean isDefault;
	private String state;
	private List<Tag> tags;
	private String name;
	private List<VpcPeeringConnection> vpcPeeringConnections;
	private String source;
	private String ownerID;
	private List<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;
	private List<XformEc2VpcCidrBlockAssociation> cidrBlockAssociationSet;
    
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
	public Boolean getIsDefault() {
		return isDefault;
	}

	@JsonProperty("isDefault")
	public void setIsDefault(Boolean value) {
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
	
	@JsonProperty("ipv6CidrBlockAssociationSet")
	public List<VpcIpv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
		return ipv6CidrBlockAssociationSet;
	}

	@JsonProperty("ipv6CidrBlockAssociationSet")
	public void setIpv6CidrBlockAssociationSet(List<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
		this.ipv6CidrBlockAssociationSet = ipv6CidrBlockAssociationSet;
	}

	@JsonProperty("cidrBlockAssociationSet")
	public List<XformEc2VpcCidrBlockAssociation> getCidrBlockAssociationSet() {
		return cidrBlockAssociationSet;
	}

	@JsonProperty("cidrBlockAssociationSet")
	public void setCidrBlockAssociationSet(List<XformEc2VpcCidrBlockAssociation> cidrBlockAssociationSet) {
		this.cidrBlockAssociationSet = cidrBlockAssociationSet;
	}
	
	public static RdsVpc build(Vpc vpc) {
		RdsVpc obj = null;
		if(vpc != null) {
			obj = new RdsVpc();
			obj.setCIDR(vpc.cidrBlock());
	        obj.setDHCPOptionsID(vpc.dhcpOptionsId());
	        obj.setState(vpc.stateAsString());
	        obj.setID(vpc.vpcId());
	        obj.setOwnerID(vpc.ownerId());
	        obj.setInstanceTenancy(vpc.instanceTenancyAsString());
	        obj.setIpv6CidrBlockAssociationSet(vpc.ipv6CidrBlockAssociationSet());
	        obj.setCidrBlockAssociationSet(XformEc2VpcCidrBlockAssociation.list(vpc.cidrBlockAssociationSet()));
	        obj.setIsDefault(vpc.isDefault());
	        List<Tag> tagList = new ArrayList<>();
	        for (Object oTag : vpc.tags()) {
	        	software.amazon.awssdk.services.ec2.model.Tag tag = (software.amazon.awssdk.services.ec2.model.Tag)oTag;
	        	Tag xTag = new Tag(); 
	        	xTag.setKey(tag.key());
	        	xTag.setValue(tag.value());
	        	tagList.add(xTag);
	        }
	        obj.setTags(tagList);
	    }
		return obj;
	}
	
	
}
