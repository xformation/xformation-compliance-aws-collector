package com.synectiks.aws.entities.s3;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkInterface {
	private String name;
	private NetworkInterfaceAssociation association;
	private Attachment attachment;
	private String availabilityZone;
	private String description;
	private String interfaceType;
	private List<Document> ipv6Addresses;
	private String macAddress;
	private String networkInterfaceID;
	private String ownerID;
	private String privateDNSName;
	private String privateIPAddress;
	private List<PrivateIPAddress> privateIPAddresses;
	private String requesterID;
	private String requesterManaged;
	private String sourceDestCheck;
	private String status;
	private String subnetID;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("association")
	public NetworkInterfaceAssociation getAssociation() {
		return association;
	}

	@JsonProperty("association")
	public void setAssociation(NetworkInterfaceAssociation value) {
		this.association = value;
	}

	@JsonProperty("attachment")
	public Attachment getAttachment() {
		return attachment;
	}

	@JsonProperty("attachment")
	public void setAttachment(Attachment value) {
		this.attachment = value;
	}

	@JsonProperty("availabilityZone")
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	@JsonProperty("availabilityZone")
	public void setAvailabilityZone(String value) {
		this.availabilityZone = value;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("interfaceType")
	public String getInterfaceType() {
		return interfaceType;
	}

	@JsonProperty("interfaceType")
	public void setInterfaceType(String value) {
		this.interfaceType = value;
	}

	@JsonProperty("ipv6Addresses")
	public List<Document> getIpv6Addresses() {
		return ipv6Addresses;
	}

	@JsonProperty("ipv6Addresses")
	public void setIpv6Addresses(List<Document> value) {
		this.ipv6Addresses = value;
	}

	@JsonProperty("macAddress")
	public String getMACAddress() {
		return macAddress;
	}

	@JsonProperty("macAddress")
	public void setMACAddress(String value) {
		this.macAddress = value;
	}

	@JsonProperty("networkInterfaceId")
	public String getNetworkInterfaceID() {
		return networkInterfaceID;
	}

	@JsonProperty("networkInterfaceId")
	public void setNetworkInterfaceID(String value) {
		this.networkInterfaceID = value;
	}

	@JsonProperty("ownerId")
	public String getOwnerID() {
		return ownerID;
	}

	@JsonProperty("ownerId")
	public void setOwnerID(String value) {
		this.ownerID = value;
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

	@JsonProperty("privateIpAddresses")
	public List<PrivateIPAddress> getPrivateIPAddresses() {
		return privateIPAddresses;
	}

	@JsonProperty("privateIpAddresses")
	public void setPrivateIPAddresses(List<PrivateIPAddress> value) {
		this.privateIPAddresses = value;
	}

	@JsonProperty("requesterId")
	public String getRequesterID() {
		return requesterID;
	}

	@JsonProperty("requesterId")
	public void setRequesterID(String value) {
		this.requesterID = value;
	}

	@JsonProperty("requesterManaged")
	public String getRequesterManaged() {
		return requesterManaged;
	}

	@JsonProperty("requesterManaged")
	public void setRequesterManaged(String value) {
		this.requesterManaged = value;
	}

	@JsonProperty("sourceDestCheck")
	public String getSourceDestCheck() {
		return sourceDestCheck;
	}

	@JsonProperty("sourceDestCheck")
	public void setSourceDestCheck(String value) {
		this.sourceDestCheck = value;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String value) {
		this.status = value;
	}

	@JsonProperty("subnetId")
	public String getSubnetID() {
		return subnetID;
	}

	@JsonProperty("subnetId")
	public void setSubnetID(String value) {
		this.subnetID = value;
	}
}
