package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class VPNGateway {
    private String availabilityZone;
    private String state;
    private String type;
    private String vpnGatewayID;
    private TagsEntities tags;
    private DirectConnectVirtualInterface[] directConnectVirtualInterfaces;
    private VpcAttachment[] vpcAttachments;

    @JsonProperty("availabilityZone")
    public String getAvailabilityZone() { return availabilityZone; }
    @JsonProperty("availabilityZone")
    public void setAvailabilityZone(String value) { this.availabilityZone = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("vpnGatewayId")
    public String getVPNGatewayID() { return vpnGatewayID; }
    @JsonProperty("vpnGatewayId")
    public void setVPNGatewayID(String value) { this.vpnGatewayID = value; }

    @JsonProperty("tags")
    public TagsEntities getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(TagsEntities value) { this.tags = value; }

    @JsonProperty("directConnectVirtualInterfaces")
    public DirectConnectVirtualInterface[] getDirectConnectVirtualInterfaces() { return directConnectVirtualInterfaces; }
    @JsonProperty("directConnectVirtualInterfaces")
    public void setDirectConnectVirtualInterfaces(DirectConnectVirtualInterface[] value) { this.directConnectVirtualInterfaces = value; }

    @JsonProperty("vpcAttachments")
    public VpcAttachment[] getVpcAttachments() { return vpcAttachments; }
    @JsonProperty("vpcAttachments")
    public void setVpcAttachments(VpcAttachment[] value) { this.vpcAttachments = value; }
}
