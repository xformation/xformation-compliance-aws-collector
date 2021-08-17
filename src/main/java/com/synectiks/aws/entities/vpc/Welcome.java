package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class Welcome {
    private String cidr;
    private Subnet[] subnets;
    private String dhcpOptionsID;
    private String instanceTenancy;
    private String isDefault;
    private String state;
    private VPNGateway[] vpnGateways;
    private InternetGateway[] internetGateways;
    private TransitGateway[] transitGateways;
    private RouteTable[] routeTables;
    private VpcPeeringConnection[] vpcPeeringConnections;
    private String hasFlowLogs;
    private FlowLog[] flowLogs;
    private CustomVpc vpc;
    private CustomTag[] tags;
    private String id;
    private String type;
    private String name;
    private String dome9ID;
    private String accountNumber;
    private String region;
    private ExternalFindings externalFindings;

    @JsonProperty("cidr")
    public String getCIDR() { return cidr; }
    @JsonProperty("cidr")
    public void setCIDR(String value) { this.cidr = value; }

    @JsonProperty("subnets")
    public Subnet[] getSubnets() { return subnets; }
    @JsonProperty("subnets")
    public void setSubnets(Subnet[] value) { this.subnets = value; }

    @JsonProperty("dhcpOptionsId")
    public String getDHCPOptionsID() { return dhcpOptionsID; }
    @JsonProperty("dhcpOptionsId")
    public void setDHCPOptionsID(String value) { this.dhcpOptionsID = value; }

    @JsonProperty("instanceTenancy")
    public String getInstanceTenancy() { return instanceTenancy; }
    @JsonProperty("instanceTenancy")
    public void setInstanceTenancy(String value) { this.instanceTenancy = value; }

    @JsonProperty("isDefault")
    public String getIsDefault() { return isDefault; }
    @JsonProperty("isDefault")
    public void setIsDefault(String value) { this.isDefault = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("vpnGateways")
    public VPNGateway[] getVPNGateways() { return vpnGateways; }
    @JsonProperty("vpnGateways")
    public void setVPNGateways(VPNGateway[] value) { this.vpnGateways = value; }

    @JsonProperty("internetGateways")
    public InternetGateway[] getInternetGateways() { return internetGateways; }
    @JsonProperty("internetGateways")
    public void setInternetGateways(InternetGateway[] value) { this.internetGateways = value; }

    @JsonProperty("transitGateways")
    public TransitGateway[] getTransitGateways() { return transitGateways; }
    @JsonProperty("transitGateways")
    public void setTransitGateways(TransitGateway[] value) { this.transitGateways = value; }

    @JsonProperty("routeTables")
    public RouteTable[] getRouteTables() { return routeTables; }
    @JsonProperty("routeTables")
    public void setRouteTables(RouteTable[] value) { this.routeTables = value; }

    @JsonProperty("vpcPeeringConnections")
    public VpcPeeringConnection[] getVpcPeeringConnections() { return vpcPeeringConnections; }
    @JsonProperty("vpcPeeringConnections")
    public void setVpcPeeringConnections(VpcPeeringConnection[] value) { this.vpcPeeringConnections = value; }

    @JsonProperty("hasFlowLogs")
    public String getHasFlowLogs() { return hasFlowLogs; }
    @JsonProperty("hasFlowLogs")
    public void setHasFlowLogs(String value) { this.hasFlowLogs = value; }

    @JsonProperty("flowLogs")
    public FlowLog[] getFlowLogs() { return flowLogs; }
    @JsonProperty("flowLogs")
    public void setFlowLogs(FlowLog[] value) { this.flowLogs = value; }

    @JsonProperty("vpc")
    public CustomVpc getVpc() { return vpc; }
    @JsonProperty("vpc")
    public void setVpc(CustomVpc value) { this.vpc = value; }

    @JsonProperty("tags")
    public CustomTag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(CustomTag[] value) { this.tags = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("dome9Id")
    public String getDome9ID() { return dome9ID; }
    @JsonProperty("dome9Id")
    public void setDome9ID(String value) { this.dome9ID = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("externalFindings")
    public ExternalFindings getExternalFindings() { return externalFindings; }
    @JsonProperty("externalFindings")
    public void setExternalFindings(ExternalFindings value) { this.externalFindings = value; }
}
