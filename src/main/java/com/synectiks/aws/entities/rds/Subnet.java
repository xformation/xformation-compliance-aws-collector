package com.synectiks.aws.entities.rds;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

public class Subnet {
	private Vpc vpc;
	private String state;
	private String availabilityZone;
	private String defaultForAz;
	private String mapPublicIPOnLaunch;
	private String availableIPAddressCount;
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
	private String dome9ID;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

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
	public String getDefaultForAz() {
		return defaultForAz;
	}

	@JsonProperty("defaultForAz")
	public void setDefaultForAz(String value) {
		this.defaultForAz = value;
	}

	@JsonProperty("mapPublicIpOnLaunch")
	public String getMapPublicIPOnLaunch() {
		return mapPublicIPOnLaunch;
	}

	@JsonProperty("mapPublicIpOnLaunch")
	public void setMapPublicIPOnLaunch(String value) {
		this.mapPublicIPOnLaunch = value;
	}

	@JsonProperty("availableIpAddressCount")
	public String getAvailableIPAddressCount() {
		return availableIPAddressCount;
	}

	@JsonProperty("availableIpAddressCount")
	public void setAvailableIPAddressCount(String value) {
		this.availableIPAddressCount = value;
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

	@JsonProperty("cidr")
	public String getCIDR() {
		return cidr;
	}

	@JsonProperty("cidr")
	public void setCIDR(String value) {
		this.cidr = value;
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

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
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

	@JsonProperty("dome9Id")
	public String getDome9ID() {
		return dome9ID;
	}

	@JsonProperty("dome9Id")
	public void setDome9ID(String value) {
		this.dome9ID = value;
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
}
