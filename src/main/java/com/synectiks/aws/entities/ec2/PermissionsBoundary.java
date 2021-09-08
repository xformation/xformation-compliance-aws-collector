package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionsBoundary {
	private String permissionsBoundaryArn;
	private String permissionsBoundaryType;

	@JsonProperty("permissionsBoundaryArn")
	public String getPermissionsBoundaryArn() {
		return permissionsBoundaryArn;
	}

	@JsonProperty("permissionsBoundaryArn")
	public void setPermissionsBoundaryArn(String value) {
		this.permissionsBoundaryArn = value;
	}

	@JsonProperty("permissionsBoundaryType")
	public String getPermissionsBoundaryType() {
		return permissionsBoundaryType;
	}

	@JsonProperty("permissionsBoundaryType")
	public void setPermissionsBoundaryType(String value) {
		this.permissionsBoundaryType = value;
	}
}
