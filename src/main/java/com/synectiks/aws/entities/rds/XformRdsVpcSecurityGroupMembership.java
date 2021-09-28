package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import software.amazon.awssdk.services.rds.model.VpcSecurityGroupMembership;

public class XformRdsVpcSecurityGroupMembership implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String vpcSecurityGroupId;
    private String status;
    
	public String getVpcSecurityGroupId() {
		return vpcSecurityGroupId;
	}
	public void setVpcSecurityGroupId(String vpcSecurityGroupId) {
		this.vpcSecurityGroupId = vpcSecurityGroupId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static XformRdsVpcSecurityGroupMembership build(VpcSecurityGroupMembership awsObj) {
		XformRdsVpcSecurityGroupMembership obj = null;
		if(awsObj != null) {
			obj = new XformRdsVpcSecurityGroupMembership();
			obj.setStatus(awsObj.status());
			obj.setVpcSecurityGroupId(awsObj.vpcSecurityGroupId());
		}
		return obj;
	}
		
	public static List<XformRdsVpcSecurityGroupMembership> list(List<VpcSecurityGroupMembership> awsObj) {
		List<XformRdsVpcSecurityGroupMembership> list = new ArrayList<>();;
		if(awsObj != null) {
			for(VpcSecurityGroupMembership vsgm: awsObj) {
				list.add(build(vsgm));
			}
		}
		return list;
	}
}
