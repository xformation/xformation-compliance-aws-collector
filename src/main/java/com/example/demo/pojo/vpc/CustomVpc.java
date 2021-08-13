package com.example.demo.pojo.vpc;

import com.fasterxml.jackson.annotation.*;

public class CustomVpc {
    private String cloudAccountID;
    private String cidr;
    private String region;
    private String id;
    private String accountNumber;
    private VPNGateway[] vpnGateways;
    private InternetGateway[] internetGateways;
    private String dhcpOptionsID;
    private String instanceTenancy;
    private boolean isDefault;
    private String state;
    private CustomTag[] tags;
    private String name;
    private VpcPeeringConnection[] vpcPeeringConnections;
    private String source;
    private String ownerID;

    @JsonProperty("cloudAccountId")
    public String getCloudAccountID() { return cloudAccountID; }
    @JsonProperty("cloudAccountId")
    public void setCloudAccountID(String value) { this.cloudAccountID = value; }

    @JsonProperty("cidr")
    public String getCIDR() { return cidr; }
    @JsonProperty("cidr")
    public void setCIDR(String value) { this.cidr = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }

    @JsonProperty("vpnGateways")
    public VPNGateway[] getVPNGateways() { return vpnGateways; }
    @JsonProperty("vpnGateways")
    public void setVPNGateways(VPNGateway[] value) { this.vpnGateways = value; }

    @JsonProperty("internetGateways")
    public InternetGateway[] getInternetGateways() { return internetGateways; }
    @JsonProperty("internetGateways")
    public void setInternetGateways(InternetGateway[] value) { this.internetGateways = value; }

    @JsonProperty("dhcpOptionsId")
    public String getDHCPOptionsID() { return dhcpOptionsID; }
    @JsonProperty("dhcpOptionsId")
    public void setDHCPOptionsID(String value) { this.dhcpOptionsID = value; }

    @JsonProperty("instanceTenancy")
    public String getInstanceTenancy() { return instanceTenancy; }
    @JsonProperty("instanceTenancy")
    public void setInstanceTenancy(String value) { this.instanceTenancy = value; }

    @JsonProperty("isDefault")
    public boolean getIsDefault() { return isDefault; }
    @JsonProperty("isDefault")
    public void setIsDefault(boolean value) { this.isDefault = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("tags")
    public CustomTag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(CustomTag[] value) { this.tags = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("vpcPeeringConnections")
    public VpcPeeringConnection[] getVpcPeeringConnections() { return vpcPeeringConnections; }
    @JsonProperty("vpcPeeringConnections")
    public void setVpcPeeringConnections(VpcPeeringConnection[] value) { this.vpcPeeringConnections = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("ownerId")
    public String getOwnerID() { return ownerID; }
    @JsonProperty("ownerId")
    public void setOwnerID(String value) { this.ownerID = value; }
}
