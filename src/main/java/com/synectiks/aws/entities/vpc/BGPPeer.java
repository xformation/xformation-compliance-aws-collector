package com.synectiks.aws.entities.vpc;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class BGPPeer implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String addressFamily;
    private String amazonAddress;
    private String asn;
    private String authKey;
    private String bgpPeerState;
    private String bgpStatus;
    private String customerAddress;

    @JsonProperty("addressFamily")
    public String getAddressFamily() { return addressFamily; }
    @JsonProperty("addressFamily")
    public void setAddressFamily(String value) { this.addressFamily = value; }

    @JsonProperty("amazonAddress")
    public String getAmazonAddress() { return amazonAddress; }
    @JsonProperty("amazonAddress")
    public void setAmazonAddress(String value) { this.amazonAddress = value; }

    @JsonProperty("asn")
    public String getAsn() { return asn; }
    @JsonProperty("asn")
    public void setAsn(String value) { this.asn = value; }

    @JsonProperty("authKey")
    public String getAuthKey() { return authKey; }
    @JsonProperty("authKey")
    public void setAuthKey(String value) { this.authKey = value; }

    @JsonProperty("bgpPeerState")
    public String getBGPPeerState() { return bgpPeerState; }
    @JsonProperty("bgpPeerState")
    public void setBGPPeerState(String value) { this.bgpPeerState = value; }

    @JsonProperty("bgpStatus")
    public String getBGPStatus() { return bgpStatus; }
    @JsonProperty("bgpStatus")
    public void setBGPStatus(String value) { this.bgpStatus = value; }

    @JsonProperty("customerAddress")
    public String getCustomerAddress() { return customerAddress; }
    @JsonProperty("customerAddress")
    public void setCustomerAddress(String value) { this.customerAddress = value; }
	@Override
	public String toString() {
		return "BGPPeer [addressFamily=" + addressFamily + ", amazonAddress=" + amazonAddress + ", asn=" + asn
				+ ", authKey=" + authKey + ", bgpPeerState=" + bgpPeerState + ", bgpStatus=" + bgpStatus
				+ ", customerAddress=" + customerAddress + "]";
	}
}
