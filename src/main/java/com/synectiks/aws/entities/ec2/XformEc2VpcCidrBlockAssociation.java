package com.synectiks.aws.entities.ec2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import software.amazon.awssdk.services.ec2.model.VpcCidrBlockAssociation;

public class XformEc2VpcCidrBlockAssociation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String associationId;
    private String cidrBlock;
    private XformEc2VpcCidrBlockState cidrBlockState;
    
	public String getAssociationId() {
		return associationId;
	}
	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}
	public String getCidrBlock() {
		return cidrBlock;
	}
	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}
	public XformEc2VpcCidrBlockState getCidrBlockState() {
		return cidrBlockState;
	}
	public void setCidrBlockState(XformEc2VpcCidrBlockState cidrBlockState) {
		this.cidrBlockState = cidrBlockState;
	}
    
	public static XformEc2VpcCidrBlockAssociation build(VpcCidrBlockAssociation awsObj) {
		XformEc2VpcCidrBlockAssociation obj = null;
		if(awsObj != null) {
			obj = new XformEc2VpcCidrBlockAssociation();
			obj.setAssociationId(awsObj.associationId());
			obj.setCidrBlock(awsObj.cidrBlock());
			obj.setCidrBlockState(XformEc2VpcCidrBlockState.build(awsObj.cidrBlockState()));
		}
		return obj;
	}
	
	public static List<XformEc2VpcCidrBlockAssociation> list(List<VpcCidrBlockAssociation> awsObj) {
		List<XformEc2VpcCidrBlockAssociation> list = new ArrayList<>();
		if(awsObj != null) {
			for(VpcCidrBlockAssociation vcba: awsObj) {
				list.add(build(vcba));
			}
		}
		return list;
	}
}
