package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class Options {
    private String amazonSideAsn;
    private String associationDefaultRouteTableID;
    private String autoAcceptSharedAttachments;
    private String defaultRouteTableAssociation;
    private String defaultRouteTablePropagation;
    private String dnsSupport;
    private String propagationDefaultRouteTableID;
    private String vpnEcmpSupport;

    @JsonProperty("amazonSideAsn")
    public String getAmazonSideAsn() { return amazonSideAsn; }
    @JsonProperty("amazonSideAsn")
    public void setAmazonSideAsn(String value) { this.amazonSideAsn = value; }

    @JsonProperty("associationDefaultRouteTableId")
    public String getAssociationDefaultRouteTableID() { return associationDefaultRouteTableID; }
    @JsonProperty("associationDefaultRouteTableId")
    public void setAssociationDefaultRouteTableID(String value) { this.associationDefaultRouteTableID = value; }

    @JsonProperty("autoAcceptSharedAttachments")
    public String getAutoAcceptSharedAttachments() { return autoAcceptSharedAttachments; }
    @JsonProperty("autoAcceptSharedAttachments")
    public void setAutoAcceptSharedAttachments(String value) { this.autoAcceptSharedAttachments = value; }

    @JsonProperty("defaultRouteTableAssociation")
    public String getDefaultRouteTableAssociation() { return defaultRouteTableAssociation; }
    @JsonProperty("defaultRouteTableAssociation")
    public void setDefaultRouteTableAssociation(String value) { this.defaultRouteTableAssociation = value; }

    @JsonProperty("defaultRouteTablePropagation")
    public String getDefaultRouteTablePropagation() { return defaultRouteTablePropagation; }
    @JsonProperty("defaultRouteTablePropagation")
    public void setDefaultRouteTablePropagation(String value) { this.defaultRouteTablePropagation = value; }

    @JsonProperty("dnsSupport")
    public String getDNSSupport() { return dnsSupport; }
    @JsonProperty("dnsSupport")
    public void setDNSSupport(String value) { this.dnsSupport = value; }

    @JsonProperty("propagationDefaultRouteTableId")
    public String getPropagationDefaultRouteTableID() { return propagationDefaultRouteTableID; }
    @JsonProperty("propagationDefaultRouteTableId")
    public void setPropagationDefaultRouteTableID(String value) { this.propagationDefaultRouteTableID = value; }

    @JsonProperty("vpnEcmpSupport")
    public String getVPNEcmpSupport() { return vpnEcmpSupport; }
    @JsonProperty("vpnEcmpSupport")
    public void setVPNEcmpSupport(String value) { this.vpnEcmpSupport = value; }
}
