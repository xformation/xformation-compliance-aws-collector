package com.synectiks.aws.entities.subnet;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

import software.amazon.awssdk.services.ec2.model.SubnetIpv6CidrBlockAssociation;

public class XformSubnet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Vpc vpc;
	private String state;
	private String availabilityZone;
	private String mapPublicIPOnLaunch;
	private String externalID;
	private String description;
	private String cidr;
	private RouteTable routeTable;
	private String ownerID;
	private Nacl nacl;
	private List<Tag> tags;
	private String id;
	private String type;
	private String name;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;


    private String availabilityZoneId;
    private Integer availableIpAddressCount;
    private String cidrBlock;
    private Boolean defaultForAz;
    private Boolean mapPublicIpOnLaunch;
    private Boolean mapCustomerOwnedIpOnLaunch;
    private String customerOwnedIpv4Pool;
    private String subnetId;
    private String vpcId;
    private String ownerId;
    private Boolean assignIpv6AddressOnCreation;
    private List<SubnetIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;
    private String subnetArn;
    private String outpostArn;
    
	@JsonProperty("vpc")
	public Vpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(Vpc value) {
		this.vpc = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("availabilityZone")
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	@JsonProperty("availabilityZone")
	public void setAvailabilityZone(String value) {
		this.availabilityZone = value;
	}

	@JsonProperty("defaultForAz")
	public Boolean getDefaultForAz() {
		return defaultForAz;
	}

	@JsonProperty("defaultForAz")
	public void setDefaultForAz(Boolean value) {
		this.defaultForAz = value;
	}

	@JsonProperty("mapPublicIpOnLaunch")
	public String getMapPublicIPOnLaunch() {
		return mapPublicIPOnLaunch;
	}

	@JsonProperty("externalId")
	public String getExternalID() {
		return externalID;
	}

	@JsonProperty("externalId")
	public void setExternalID(String value) {
		this.externalID = value;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("routeTable")
	public RouteTable getRouteTable() {
		return routeTable;
	}

	@JsonProperty("routeTable")
	public void setRouteTable(RouteTable value) {
		this.routeTable = value;
	}

	@JsonProperty("ownerId")
	public String getOwnerID() {
		return ownerID;
	}

	@JsonProperty("ownerId")
	public void setOwnerID(String value) {
		this.ownerID = value;
	}

	@JsonProperty("nacl")
	public Nacl getNacl() {
		return nacl;
	}

	@JsonProperty("nacl")
	public void setNacl(Nacl value) {
		this.nacl = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String value) {
		this.region = value;
	}

	@JsonProperty("externalFindings")
	public ExternalFindings getExternalFindings() {
		return externalFindings;
	}

	@JsonProperty("externalFindings")
	public void setExternalFindings(ExternalFindings value) {
		this.externalFindings = value;
	}

	@JsonProperty("cidr")
	public String getCidr() {
		return cidr;
	}

	@JsonProperty("cidr")
	public void setCidr(String cidr) {
		this.cidr = cidr;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public String getAvailabilityZoneId() {
		return availabilityZoneId;
	}

	public void setAvailabilityZoneId(String availabilityZoneId) {
		this.availabilityZoneId = availabilityZoneId;
	}

	public Integer getAvailableIpAddressCount() {
		return availableIpAddressCount;
	}

	public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
		this.availableIpAddressCount = availableIpAddressCount;
	}

	public String getCidrBlock() {
		return cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public Boolean getMapPublicIpOnLaunch() {
		return mapPublicIpOnLaunch;
	}

	public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
		this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
	}

	public Boolean getMapCustomerOwnedIpOnLaunch() {
		return mapCustomerOwnedIpOnLaunch;
	}

	public void setMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
		this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
	}

	public String getCustomerOwnedIpv4Pool() {
		return customerOwnedIpv4Pool;
	}

	public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
		this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
	}

	public String getSubnetId() {
		return subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getAssignIpv6AddressOnCreation() {
		return assignIpv6AddressOnCreation;
	}

	public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
		this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
	}

	public List<SubnetIpv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
		return ipv6CidrBlockAssociationSet;
	}

	public void setIpv6CidrBlockAssociationSet(List<SubnetIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
		this.ipv6CidrBlockAssociationSet = ipv6CidrBlockAssociationSet;
	}

	public String getSubnetArn() {
		return subnetArn;
	}

	public void setSubnetArn(String subnetArn) {
		this.subnetArn = subnetArn;
	}

	public String getOutpostArn() {
		return outpostArn;
	}

	public void setOutpostArn(String outpostArn) {
		this.outpostArn = outpostArn;
	}

}
