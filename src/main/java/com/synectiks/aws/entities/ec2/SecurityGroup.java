package com.synectiks.aws.entities.ec2;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String type;
	private String name;
	private String dome9ID;
	private String accountNumber;
	private String region;
	private Vpc vpc;
	private List<Tag> tags;
	private String source;
	private String description;
	private List<BoundRule> inboundRules;
	private List<BoundRule> outboundRules;
	private List<AssumeRolePolicy> inboundPrefixes;
	private List<AssumeRolePolicy> outboundPrefixes;
	private List<AssetsStat> networkAssetsStats;
	private String isProtected;
	private List<NetworkInterface> networkInterfaces;

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

	@JsonProperty("vpc")
	public Vpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(Vpc value) {
		this.vpc = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String value) {
		this.source = value;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("inboundRules")
	public List<BoundRule> getInboundRules() {
		return inboundRules;
	}

	@JsonProperty("inboundRules")
	public void setInboundRules(List<BoundRule> value) {
		this.inboundRules = value;
	}

	@JsonProperty("outboundRules")
	public List<BoundRule> getOutboundRules() {
		return outboundRules;
	}

	@JsonProperty("outboundRules")
	public void setOutboundRules(List<BoundRule> value) {
		this.outboundRules = value;
	}

	@JsonProperty("inboundPrefixes")
	public List<AssumeRolePolicy> getInboundPrefixes() {
		return inboundPrefixes;
	}

	@JsonProperty("inboundPrefixes")
	public void setInboundPrefixes(List<AssumeRolePolicy> value) {
		this.inboundPrefixes = value;
	}

	@JsonProperty("outboundPrefixes")
	public List<AssumeRolePolicy> getOutboundPrefixes() {
		return outboundPrefixes;
	}

	@JsonProperty("outboundPrefixes")
	public void setOutboundPrefixes(List<AssumeRolePolicy> value) {
		this.outboundPrefixes = value;
	}

	@JsonProperty("networkAssetsStats")
	public List<AssetsStat> getNetworkAssetsStats() {
		return networkAssetsStats;
	}

	@JsonProperty("networkAssetsStats")
	public void setNetworkAssetsStats(List<AssetsStat> value) {
		this.networkAssetsStats = value;
	}

	@JsonProperty("isProtected")
	public String getIsProtected() {
		return isProtected;
	}

	@JsonProperty("isProtected")
	public void setIsProtected(String value) {
		this.isProtected = value;
	}

	@JsonProperty("networkInterfaces")
	public List<NetworkInterface> getNetworkInterfaces() {
		return networkInterfaces;
	}

	@JsonProperty("networkInterfaces")
	public void setNetworkInterfaces(List<NetworkInterface> value) {
		this.networkInterfaces = value;
	}

	@Override
	public String toString() {
		return "SecurityGroup [id=" + id + ", type=" + type + ", name=" + name + ", dome9ID=" + dome9ID
				+ ", accountNumber=" + accountNumber + ", region=" + region + ", vpc=" + vpc + ", tags=" + tags
				+ ", source=" + source + ", description=" + description + ", inboundRules=" + inboundRules
				+ ", outboundRules=" + outboundRules + ", inboundPrefixes=" + inboundPrefixes + ", outboundPrefixes="
				+ outboundPrefixes + ", networkAssetsStats=" + networkAssetsStats + ", isProtected=" + isProtected
				+ ", networkInterfaces=" + networkInterfaces + "]";
	}
}
