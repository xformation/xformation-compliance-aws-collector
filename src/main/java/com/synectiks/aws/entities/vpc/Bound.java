package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class Bound {
    private ICMPProtocol icmpProtocol;
    private String name;
    private String number;
    private String protocol;
    private String source;
    private String destination;
    private String destinationPort;
    private String destinationPortTo;
    private String direction;
    private String action;

    @JsonProperty("icmpProtocol")
    public ICMPProtocol getICMPProtocol() { return icmpProtocol; }
    @JsonProperty("icmpProtocol")
    public void setICMPProtocol(ICMPProtocol value) { this.icmpProtocol = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("number")
    public String getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(String value) { this.number = value; }

    @JsonProperty("protocol")
    public String getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(String value) { this.protocol = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("destination")
    public String getDestination() { return destination; }
    @JsonProperty("destination")
    public void setDestination(String value) { this.destination = value; }

    @JsonProperty("destinationPort")
    public String getDestinationPort() { return destinationPort; }
    @JsonProperty("destinationPort")
    public void setDestinationPort(String value) { this.destinationPort = value; }

    @JsonProperty("destinationPortTo")
    public String getDestinationPortTo() { return destinationPortTo; }
    @JsonProperty("destinationPortTo")
    public void setDestinationPortTo(String value) { this.destinationPortTo = value; }

    @JsonProperty("direction")
    public String getDirection() { return direction; }
    @JsonProperty("direction")
    public void setDirection(String value) { this.direction = value; }

    @JsonProperty("action")
    public String getAction() { return action; }
    @JsonProperty("action")
    public void setAction(String value) { this.action = value; }
	@Override
	public String toString() {
		return "Bound [icmpProtocol=" + icmpProtocol + ", name=" + name + ", number=" + number + ", protocol="
				+ protocol + ", source=" + source + ", destination=" + destination + ", destinationPort="
				+ destinationPort + ", destinationPortTo=" + destinationPortTo + ", direction=" + direction
				+ ", action=" + action + "]";
	}
}
