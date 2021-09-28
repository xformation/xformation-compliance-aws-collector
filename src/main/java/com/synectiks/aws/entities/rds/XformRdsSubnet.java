package com.synectiks.aws.entities.rds;

import java.util.ArrayList;
import java.util.List;

import software.amazon.awssdk.services.rds.model.Subnet;

public class XformRdsSubnet {

	private String subnetIdentifier;
    private XformRdsAvailabilityZone subnetAvailabilityZone;
    private XformRdsOutpost subnetOutpost;
    private String subnetStatus;
    
	public String getSubnetIdentifier() {
		return subnetIdentifier;
	}
	public void setSubnetIdentifier(String subnetIdentifier) {
		this.subnetIdentifier = subnetIdentifier;
	}
	public XformRdsAvailabilityZone getSubnetAvailabilityZone() {
		return subnetAvailabilityZone;
	}
	public void setSubnetAvailabilityZone(XformRdsAvailabilityZone subnetAvailabilityZone) {
		this.subnetAvailabilityZone = subnetAvailabilityZone;
	}
	public XformRdsOutpost getSubnetOutpost() {
		return subnetOutpost;
	}
	public void setSubnetOutpost(XformRdsOutpost subnetOutpost) {
		this.subnetOutpost = subnetOutpost;
	}
	public String getSubnetStatus() {
		return subnetStatus;
	}
	public void setSubnetStatus(String subnetStatus) {
		this.subnetStatus = subnetStatus;
	}
    
	public static XformRdsSubnet build(Subnet awsObj) {
		XformRdsSubnet obj = null;
		if(awsObj != null) {
				obj = new XformRdsSubnet();
				obj.setSubnetIdentifier(awsObj.subnetIdentifier());
				obj.setSubnetAvailabilityZone(XformRdsAvailabilityZone.build(awsObj.subnetAvailabilityZone()));
				obj.setSubnetOutpost(XformRdsOutpost.build(awsObj.subnetOutpost()));
				obj.setSubnetStatus(awsObj.subnetStatus());
		}
		return obj;
	}
	
	public static List<XformRdsSubnet> list(List<Subnet> awsObj) {
		List<XformRdsSubnet> list = new ArrayList<>();
		if(awsObj != null) {
			for(Subnet sb: awsObj) {
				list.add(build(sb));
			}
		}
		return list;
	}
}
