package com.synectiks.aws.entities.iam;

import com.fasterxml.jackson.annotation.*;

public class PermissionsBoundary {
    private String permissionsBoundaryArn;
    private String permissionsBoundaryType;

    @JsonProperty("permissionsBoundaryArn")
    public String getPermissionsBoundaryArn() { return permissionsBoundaryArn; }
    @JsonProperty("permissionsBoundaryArn")
    public void setPermissionsBoundaryArn(String value) { this.permissionsBoundaryArn = value; }

    @JsonProperty("permissionsBoundaryType")
    public String getPermissionsBoundaryType() { return permissionsBoundaryType; }
    @JsonProperty("permissionsBoundaryType")
    public void setPermissionsBoundaryType(String value) { this.permissionsBoundaryType = value; }
}
