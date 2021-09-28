package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import software.amazon.awssdk.services.rds.model.OptionGroupMembership;

public class XformRdsOptionGroupMembership implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String optionGroupName;
    private String status;
    
	public String getOptionGroupName() {
		return optionGroupName;
	}
	public void setOptionGroupName(String optionGroupName) {
		this.optionGroupName = optionGroupName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static XformRdsOptionGroupMembership build(OptionGroupMembership awsObj) {
		XformRdsOptionGroupMembership obj = null;
		if(awsObj != null) {
			obj = new XformRdsOptionGroupMembership();
			obj.setOptionGroupName(awsObj.optionGroupName());
			obj.setStatus(awsObj.status());
		}
		return obj;
	}
	
	public static List<XformRdsOptionGroupMembership> list(List<OptionGroupMembership> awsObj) {
		List<XformRdsOptionGroupMembership> list = new ArrayList<>();
		if(awsObj != null) {
			for(OptionGroupMembership ogm: awsObj) {
				list.add(build(ogm));
			}
		}
		return list;
	}
	
}
