package com.synectiks.aws.entities.rds;

import java.io.Serializable;
import java.util.List;

import software.amazon.awssdk.services.rds.model.DBSubnetGroup;

public class XformRdsDBSubnetGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dbSubnetGroupName;
    private String dbSubnetGroupDescription;
    private String vpcId;
    private String subnetGroupStatus;
    private List<XformRdsSubnet> subnets;
    private String dbSubnetGroupArn;
    
	public String getDbSubnetGroupName() {
		return dbSubnetGroupName;
	}
	public void setDbSubnetGroupName(String dbSubnetGroupName) {
		this.dbSubnetGroupName = dbSubnetGroupName;
	}
	public String getDbSubnetGroupDescription() {
		return dbSubnetGroupDescription;
	}
	public void setDbSubnetGroupDescription(String dbSubnetGroupDescription) {
		this.dbSubnetGroupDescription = dbSubnetGroupDescription;
	}
	public String getVpcId() {
		return vpcId;
	}
	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	public String getSubnetGroupStatus() {
		return subnetGroupStatus;
	}
	public void setSubnetGroupStatus(String subnetGroupStatus) {
		this.subnetGroupStatus = subnetGroupStatus;
	}
	public List<XformRdsSubnet> getSubnets() {
		return subnets;
	}
	public void setSubnets(List<XformRdsSubnet> subnets) {
		this.subnets = subnets;
	}
	public String getDbSubnetGroupArn() {
		return dbSubnetGroupArn;
	}
	public void setDbSubnetGroupArn(String dbSubnetGroupArn) {
		this.dbSubnetGroupArn = dbSubnetGroupArn;
	}
    
    public static XformRdsDBSubnetGroup build(DBSubnetGroup awsObj) {
    	XformRdsDBSubnetGroup obj = null;
    	if(awsObj != null) {
    		obj = new XformRdsDBSubnetGroup();
    		obj.setDbSubnetGroupName(awsObj.dbSubnetGroupName());
    		obj.setDbSubnetGroupDescription(awsObj.dbSubnetGroupDescription());
    	    obj.setVpcId(awsObj.vpcId());
    	    obj.setSubnetGroupStatus(awsObj.subnetGroupStatus());
    	    obj.setSubnets(XformRdsSubnet.list(awsObj.subnets()));
    	    obj.setDbSubnetGroupArn(awsObj.dbSubnetGroupArn());
    	}
    	return obj;
    }
}
