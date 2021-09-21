package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RulesPackage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String provider;
	private String version;

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("provider")
	public String getProvider() {
		return provider;
	}

	@JsonProperty("provider")
	public void setProvider(String value) {
		this.provider = value;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String value) {
		this.version = value;
	}

	@Override
	public String toString() {
		return "RulesPackage [id=" + id + ", name=" + name + ", provider=" + provider + ", version=" + version + "]";
	}
}
