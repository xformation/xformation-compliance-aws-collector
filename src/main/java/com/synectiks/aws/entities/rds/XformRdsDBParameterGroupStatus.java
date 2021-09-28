package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import software.amazon.awssdk.services.rds.model.DBParameterGroupStatus;

public class XformRdsDBParameterGroupStatus implements Serializable {

	private String dbParameterGroupName;
    private String parameterApplyStatus;
    
	public String getDbParameterGroupName() {
		return dbParameterGroupName;
	}
	public void setDbParameterGroupName(String dbParameterGroupName) {
		this.dbParameterGroupName = dbParameterGroupName;
	}
	public String getParameterApplyStatus() {
		return parameterApplyStatus;
	}
	public void setParameterApplyStatus(String parameterApplyStatus) {
		this.parameterApplyStatus = parameterApplyStatus;
	}
    
	public static XformRdsDBParameterGroupStatus build(DBParameterGroupStatus awsObj) {
		XformRdsDBParameterGroupStatus obj = null;
		if(awsObj != null) {
			obj = new XformRdsDBParameterGroupStatus();
			obj.setDbParameterGroupName(awsObj.dbParameterGroupName());
			obj.setParameterApplyStatus(awsObj.parameterApplyStatus());
		}
		return obj;
	}
	
	public static List<XformRdsDBParameterGroupStatus> list(List<DBParameterGroupStatus> awsObj) {
		List<XformRdsDBParameterGroupStatus> list = new ArrayList<>();
		if(awsObj != null) {
			for(DBParameterGroupStatus dpgs: awsObj) {
				list.add(build(dpgs));
			}
		}
		return list;
	}
}
