package com.synectiks.aws.entities.vpc;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.assets.CloudManagedService;
import com.synectiks.aws.entities.common.Tag;
import com.synectiks.aws.entities.ekscluster.XformEksCluster;
import com.synectiks.aws.entities.subnet.XformSubnet;

public class XformVpc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cidr;
	private List<XformSubnet> subnets;
	private String dhcpOptionsID;
	private String instanceTenancy;
	private Boolean isDefault;
	private String state;
	private List<VPNGateway> vpnGateways;
	private List<InternetGateway> internetGateways;
	private List<TransitGateway> transitGateways;
	private List<RouteTable> routeTables;
	private List<VpcPeeringConnection> vpcPeeringConnections;
	private Boolean hasFlowLogs;
	private List<FlowLog> flowLogs;
	private Vpc vpc;
	private List<Tag> tags;
	private String id;
	private String type;
	private String name;

	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

	private List<XformEksCluster> cluster;
	private CloudManagedService cloudService;
	
	@JsonProperty("cidr")
	public String getCIDR() {
		return cidr;
	}

	@JsonProperty("cidr")
	public void setCIDR(String value) {
		this.cidr = value;
	}

	@JsonProperty("subnets")
	public List<XformSubnet> getSubnets() {
		return subnets;
	}

	@JsonProperty("subnets")
	public void setSubnets(List<XformSubnet> value) {
		this.subnets = value;
	}

	@JsonProperty("dhcpOptionsId")
	public String getDHCPOptionsID() {
		return dhcpOptionsID;
	}

	@JsonProperty("dhcpOptionsId")
	public void setDHCPOptionsID(String value) {
		this.dhcpOptionsID = value;
	}

	@JsonProperty("instanceTenancy")
	public String getInstanceTenancy() {
		return instanceTenancy;
	}

	@JsonProperty("instanceTenancy")
	public void setInstanceTenancy(String value) {
		this.instanceTenancy = value;
	}

	@JsonProperty("isDefault")
	public Boolean getIsDefault() {
		return isDefault;
	}

	@JsonProperty("isDefault")
	public void setIsDefault(Boolean value) {
		this.isDefault = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("vpnGateways")
	public List<VPNGateway> getVPNGateways() {
		return vpnGateways;
	}

	@JsonProperty("vpnGateways")
	public void setVPNGateways(List<VPNGateway> value) {
		this.vpnGateways = value;
	}

	@JsonProperty("internetGateways")
	public List<InternetGateway> getInternetGateways() {
		return internetGateways;
	}

	@JsonProperty("internetGateways")
	public void setInternetGateways(List<InternetGateway> value) {
		this.internetGateways = value;
	}

	@JsonProperty("transitGateways")
	public List<TransitGateway> getTransitGateways() {
		return transitGateways;
	}

	@JsonProperty("transitGateways")
	public void setTransitGateways(List<TransitGateway> value) {
		this.transitGateways = value;
	}

	@JsonProperty("routeTables")
	public List<RouteTable> getRouteTables() {
		return routeTables;
	}

	@JsonProperty("routeTables")
	public void setRouteTables(List<RouteTable> value) {
		this.routeTables = value;
	}

	@JsonProperty("vpcPeeringConnections")
	public List<VpcPeeringConnection> getVpcPeeringConnections() {
		return vpcPeeringConnections;
	}

	@JsonProperty("vpcPeeringConnections")
	public void setVpcPeeringConnections(List<VpcPeeringConnection> value) {
		this.vpcPeeringConnections = value;
	}

	@JsonProperty("hasFlowLogs")
	public Boolean getHasFlowLogs() {
		return hasFlowLogs;
	}

	@JsonProperty("hasFlowLogs")
	public void setHasFlowLogs(Boolean value) {
		this.hasFlowLogs = value;
	}

	@JsonProperty("flowLogs")
	public List<FlowLog> getFlowLogs() {
		return flowLogs;
	}

	@JsonProperty("flowLogs")
	public void setFlowLogs(List<FlowLog> value) {
		this.flowLogs = value;
	}

	@JsonProperty("vpc")
	public Vpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(Vpc value) {
		this.vpc = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String value) {
		this.region = value;
	}

	@JsonProperty("externalFindings")
	public ExternalFindings getExternalFindings() {
		return externalFindings;
	}

	@JsonProperty("externalFindings")
	public void setExternalFindings(ExternalFindings value) {
		this.externalFindings = value;
	}
	
	@JsonProperty("cluster")
	public List<XformEksCluster> getCluster() {
		return cluster;
	}

	@JsonProperty("cluster")
	public void setCluster(List<XformEksCluster> cluster) {
		this.cluster = cluster;
	}

	@JsonProperty("cloudService")
	public CloudManagedService getCloudService() {
		return cloudService;
	}

	@JsonProperty("cloudService")
	public void setCloudService(CloudManagedService cloudService) {
		this.cloudService = cloudService;
	}
	
	@Override
	public String toString() {
		return "XformVpc [cidr=" + cidr + ", subnets=" + subnets + ", dhcpOptionsID=" + dhcpOptionsID
				+ ", instanceTenancy=" + instanceTenancy + ", isDefault=" + isDefault + ", state=" + state
				+ ", vpnGateways=" + vpnGateways + ", internetGateways=" + internetGateways + ", transitGateways="
				+ transitGateways + ", routeTables=" + routeTables + ", vpcPeeringConnections=" + vpcPeeringConnections
				+ ", hasFlowLogs=" + hasFlowLogs + ", flowLogs=" + flowLogs + ", vpc=" + vpc + ", tags=" + tags
				+ ", id=" + id + ", type=" + type + ", name=" + name + ", accountNumber=" + accountNumber + ", region="
				+ region + ", externalFindings=" + externalFindings + "]";
	}
	
}
