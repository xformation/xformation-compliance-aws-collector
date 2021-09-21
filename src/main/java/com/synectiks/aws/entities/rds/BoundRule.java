package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoundRule {
	private String protocol;
	private String port;
	private String portTo;
	private String scope;
	private ScopeMetaData scopeMetaData;
	private String serviceType;

	@JsonProperty("protocol")
	public String getProtocol() {
		return protocol;
	}

	@JsonProperty("protocol")
	public void setProtocol(String value) {
		this.protocol = value;
	}

	@JsonProperty("port")
	public String getPort() {
		return port;
	}

	@JsonProperty("port")
	public void setPort(String value) {
		this.port = value;
	}

	@JsonProperty("portTo")
	public String getPortTo() {
		return portTo;
	}

	@JsonProperty("portTo")
	public void setPortTo(String value) {
		this.portTo = value;
	}

	@JsonProperty("scope")
	public String getScope() {
		return scope;
	}

	@JsonProperty("scope")
	public void setScope(String value) {
		this.scope = value;
	}

	@JsonProperty("scopeMetaData")
	public ScopeMetaData getScopeMetaData() {
		return scopeMetaData;
	}

	@JsonProperty("scopeMetaData")
	public void setScopeMetaData(ScopeMetaData value) {
		this.scopeMetaData = value;
	}

	@JsonProperty("serviceType")
	public String getServiceType() {
		return serviceType;
	}

	@JsonProperty("serviceType")
	public void setServiceType(String value) {
		this.serviceType = value;
	}
}
