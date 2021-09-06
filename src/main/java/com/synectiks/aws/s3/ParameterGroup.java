package com.synectiks.aws.s3;

import com.fasterxml.jackson.annotation.*;

public class ParameterGroup {
    private String parameterApplyStatus;
    private String dbParameterGroupArn;
    private String dbParameterGroupFamily;
    private String dbParameterGroupName;
    private String description;

    @JsonProperty("parameterApplyStatus")
    public String getParameterApplyStatus() { return parameterApplyStatus; }
    @JsonProperty("parameterApplyStatus")
    public void setParameterApplyStatus(String value) { this.parameterApplyStatus = value; }

    @JsonProperty("dbParameterGroupArn")
    public String getDBParameterGroupArn() { return dbParameterGroupArn; }
    @JsonProperty("dbParameterGroupArn")
    public void setDBParameterGroupArn(String value) { this.dbParameterGroupArn = value; }

    @JsonProperty("dbParameterGroupFamily")
    public String getDBParameterGroupFamily() { return dbParameterGroupFamily; }
    @JsonProperty("dbParameterGroupFamily")
    public void setDBParameterGroupFamily(String value) { this.dbParameterGroupFamily = value; }

    @JsonProperty("dbParameterGroupName")
    public String getDBParameterGroupName() { return dbParameterGroupName; }
    @JsonProperty("dbParameterGroupName")
    public void setDBParameterGroupName(String value) { this.dbParameterGroupName = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }
}
