package com.synectiks.aws.s3;

import com.fasterxml.jackson.annotation.*;

public class Connection {
    private String connectionID;
    private String connectionName;
    private String connectionState;
    private String location;
    private String partnerName;
    private String bandwidth;
    private String vlan;

    @JsonProperty("connectionId")
    public String getConnectionID() { return connectionID; }
    @JsonProperty("connectionId")
    public void setConnectionID(String value) { this.connectionID = value; }

    @JsonProperty("connectionName")
    public String getConnectionName() { return connectionName; }
    @JsonProperty("connectionName")
    public void setConnectionName(String value) { this.connectionName = value; }

    @JsonProperty("connectionState")
    public String getConnectionState() { return connectionState; }
    @JsonProperty("connectionState")
    public void setConnectionState(String value) { this.connectionState = value; }

    @JsonProperty("location")
    public String getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(String value) { this.location = value; }

    @JsonProperty("partnerName")
    public String getPartnerName() { return partnerName; }
    @JsonProperty("partnerName")
    public void setPartnerName(String value) { this.partnerName = value; }

    @JsonProperty("bandwidth")
    public String getBandwidth() { return bandwidth; }
    @JsonProperty("bandwidth")
    public void setBandwidth(String value) { this.bandwidth = value; }

    @JsonProperty("vlan")
    public String getVLAN() { return vlan; }
    @JsonProperty("vlan")
    public void setVLAN(String value) { this.vlan = value; }
}
