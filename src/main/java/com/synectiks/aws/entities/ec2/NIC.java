package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class NIC {
    private String id;
    private String name;
    private Subnet subnet;
    private String privateDNSName;
    private String publicIPAddress;
    private String privateIPAddress;
    private ElasticIP elasticIP;
    private String macAddress;
    private List<SecurityGroup> securityGroups;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("subnet")
    public Subnet getSubnet() { return subnet; }
    @JsonProperty("subnet")
    public void setSubnet(Subnet value) { this.subnet = value; }

    @JsonProperty("privateDnsName")
    public String getPrivateDNSName() { return privateDNSName; }
    @JsonProperty("privateDnsName")
    public void setPrivateDNSName(String value) { this.privateDNSName = value; }

    @JsonProperty("publicIpAddress")
    public String getPublicIPAddress() { return publicIPAddress; }
    @JsonProperty("publicIpAddress")
    public void setPublicIPAddress(String value) { this.publicIPAddress = value; }

    @JsonProperty("privateIpAddress")
    public String getPrivateIPAddress() { return privateIPAddress; }
    @JsonProperty("privateIpAddress")
    public void setPrivateIPAddress(String value) { this.privateIPAddress = value; }

    @JsonProperty("elasticIP")
    public ElasticIP getElasticIP() { return elasticIP; }
    @JsonProperty("elasticIP")
    public void setElasticIP(ElasticIP value) { this.elasticIP = value; }

    @JsonProperty("macAddress")
    public String getMACAddress() { return macAddress; }
    @JsonProperty("macAddress")
    public void setMACAddress(String value) { this.macAddress = value; }

    @JsonProperty("securityGroups")
    public List<SecurityGroup> getSecurityGroups() { return securityGroups; }
    @JsonProperty("securityGroups")
    public void setSecurityGroups(List<SecurityGroup> value) { this.securityGroups = value; }
}
