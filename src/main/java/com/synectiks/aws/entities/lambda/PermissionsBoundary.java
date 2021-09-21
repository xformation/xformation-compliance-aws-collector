package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionsBoundary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@Override
	public String toString() {
		return "PermissionsBoundary [permissionsBoundaryArn=" + permissionsBoundaryArn + ", permissionsBoundaryType="
				+ permissionsBoundaryType + "]";
	}
}
