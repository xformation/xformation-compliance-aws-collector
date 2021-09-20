package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.*;

public class Route {
    private String destinationCIDRBlock;
    private String destinationIpv6CIDRBlock;
    private String destinationPrefixListID;
    private String egressOnlyInternetGatewayID;
    private String gatewayID;
    private String instanceID;
    private String instanceOwnerID;
    private String natGatewayID;
    private String networkInterfaceID;
    private String origin;
    private String state;
    private String vpcPeeringConnectionID;

    @JsonProperty("destinationCidrBlock")
    public String getDestinationCIDRBlock() { return destinationCIDRBlock; }
    @JsonProperty("destinationCidrBlock")
    public void setDestinationCIDRBlock(String value) { this.destinationCIDRBlock = value; }

    @JsonProperty("destinationIpv6CidrBlock")
    public String getDestinationIpv6CIDRBlock() { return destinationIpv6CIDRBlock; }
    @JsonProperty("destinationIpv6CidrBlock")
    public void setDestinationIpv6CIDRBlock(String value) { this.destinationIpv6CIDRBlock = value; }

    @JsonProperty("destinationPrefixListId")
    public String getDestinationPrefixListID() { return destinationPrefixListID; }
    @JsonProperty("destinationPrefixListId")
    public void setDestinationPrefixListID(String value) { this.destinationPrefixListID = value; }

    @JsonProperty("egressOnlyInternetGatewayId")
    public String getEgressOnlyInternetGatewayID() { return egressOnlyInternetGatewayID; }
    @JsonProperty("egressOnlyInternetGatewayId")
    public void setEgressOnlyInternetGatewayID(String value) { this.egressOnlyInternetGatewayID = value; }

    @JsonProperty("gatewayId")
    public String getGatewayID() { return gatewayID; }
    @JsonProperty("gatewayId")
    public void setGatewayID(String value) { this.gatewayID = value; }

    @JsonProperty("instanceId")
    public String getInstanceID() { return instanceID; }
    @JsonProperty("instanceId")
    public void setInstanceID(String value) { this.instanceID = value; }

    @JsonProperty("instanceOwnerId")
    public String getInstanceOwnerID() { return instanceOwnerID; }
    @JsonProperty("instanceOwnerId")
    public void setInstanceOwnerID(String value) { this.instanceOwnerID = value; }

    @JsonProperty("natGatewayId")
    public String getNatGatewayID() { return natGatewayID; }
    @JsonProperty("natGatewayId")
    public void setNatGatewayID(String value) { this.natGatewayID = value; }

    @JsonProperty("networkInterfaceId")
    public String getNetworkInterfaceID() { return networkInterfaceID; }
    @JsonProperty("networkInterfaceId")
    public void setNetworkInterfaceID(String value) { this.networkInterfaceID = value; }

    @JsonProperty("origin")
    public String getOrigin() { return origin; }
    @JsonProperty("origin")
    public void setOrigin(String value) { this.origin = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("vpcPeeringConnectionId")
    public String getVpcPeeringConnectionID() { return vpcPeeringConnectionID; }
    @JsonProperty("vpcPeeringConnectionId")
    public void setVpcPeeringConnectionID(String value) { this.vpcPeeringConnectionID = value; }
}
