package com.synectiks.aws.entities.s3;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DirectConnectVirtualInterface implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String addressFamily;
	private String amazonAddress;
	private String asn;
	private String authKey;
	private List<BGPPeer> bgpPeers;
	private String connectionID;
	private String customerAddress;
	private String customerRouterConfig;
	private String location;
	private String ownerAccount;
	private List<Document> routeFilterPrefixes;
	private String virtualGatewayID;
	private String virtualInterfaceID;
	private String virtualInterfaceName;
	private String virtualInterfaceState;
	private String virtualInterfaceType;
	private String vlan;
	private String externalID;
	private Connection connection;

	@JsonProperty("addressFamily")
	public String getAddressFamily() {
		return addressFamily;
	}

	@JsonProperty("addressFamily")
	public void setAddressFamily(String value) {
		this.addressFamily = value;
	}

	@JsonProperty("amazonAddress")
	public String getAmazonAddress() {
		return amazonAddress;
	}

	@JsonProperty("amazonAddress")
	public void setAmazonAddress(String value) {
		this.amazonAddress = value;
	}

	@JsonProperty("asn")
	public String getAsn() {
		return asn;
	}

	@JsonProperty("asn")
	public void setAsn(String value) {
		this.asn = value;
	}

	@JsonProperty("authKey")
	public String getAuthKey() {
		return authKey;
	}

	@JsonProperty("authKey")
	public void setAuthKey(String value) {
		this.authKey = value;
	}

	@JsonProperty("bgpPeers")
	public List<BGPPeer> getBGPPeers() {
		return bgpPeers;
	}

	@JsonProperty("bgpPeers")
	public void setBGPPeers(List<BGPPeer> value) {
		this.bgpPeers = value;
	}

	@JsonProperty("connectionId")
	public String getConnectionID() {
		return connectionID;
	}

	@JsonProperty("connectionId")
	public void setConnectionID(String value) {
		this.connectionID = value;
	}

	@JsonProperty("customerAddress")
	public String getCustomerAddress() {
		return customerAddress;
	}

	@JsonProperty("customerAddress")
	public void setCustomerAddress(String value) {
		this.customerAddress = value;
	}

	@JsonProperty("customerRouterConfig")
	public String getCustomerRouterConfig() {
		return customerRouterConfig;
	}

	@JsonProperty("customerRouterConfig")
	public void setCustomerRouterConfig(String value) {
		this.customerRouterConfig = value;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String value) {
		this.location = value;
	}

	@JsonProperty("ownerAccount")
	public String getOwnerAccount() {
		return ownerAccount;
	}

	@JsonProperty("ownerAccount")
	public void setOwnerAccount(String value) {
		this.ownerAccount = value;
	}

	@JsonProperty("routeFilterPrefixes")
	public List<Document> getRouteFilterPrefixes() {
		return routeFilterPrefixes;
	}

	@JsonProperty("routeFilterPrefixes")
	public void setRouteFilterPrefixes(List<Document> value) {
		this.routeFilterPrefixes = value;
	}

	@JsonProperty("virtualGatewayId")
	public String getVirtualGatewayID() {
		return virtualGatewayID;
	}

	@JsonProperty("virtualGatewayId")
	public void setVirtualGatewayID(String value) {
		this.virtualGatewayID = value;
	}

	@JsonProperty("virtualInterfaceId")
	public String getVirtualInterfaceID() {
		return virtualInterfaceID;
	}

	@JsonProperty("virtualInterfaceId")
	public void setVirtualInterfaceID(String value) {
		this.virtualInterfaceID = value;
	}

	@JsonProperty("virtualInterfaceName")
	public String getVirtualInterfaceName() {
		return virtualInterfaceName;
	}

	@JsonProperty("virtualInterfaceName")
	public void setVirtualInterfaceName(String value) {
		this.virtualInterfaceName = value;
	}

	@JsonProperty("virtualInterfaceState")
	public String getVirtualInterfaceState() {
		return virtualInterfaceState;
	}

	@JsonProperty("virtualInterfaceState")
	public void setVirtualInterfaceState(String value) {
		this.virtualInterfaceState = value;
	}

	@JsonProperty("virtualInterfaceType")
	public String getVirtualInterfaceType() {
		return virtualInterfaceType;
	}

	@JsonProperty("virtualInterfaceType")
	public void setVirtualInterfaceType(String value) {
		this.virtualInterfaceType = value;
	}

	@JsonProperty("vlan")
	public String getVLAN() {
		return vlan;
	}

	@JsonProperty("vlan")
	public void setVLAN(String value) {
		this.vlan = value;
	}

	@JsonProperty("externalId")
	public String getExternalID() {
		return externalID;
	}

	@JsonProperty("externalId")
	public void setExternalID(String value) {
		this.externalID = value;
	}

	@JsonProperty("connection")
	public Connection getConnection() {
		return connection;
	}

	@JsonProperty("connection")
	public void setConnection(Connection value) {
		this.connection = value;
	}

	@Override
	public String toString() {
		return "DirectConnectVirtualInterface [addressFamily=" + addressFamily + ", amazonAddress=" + amazonAddress
				+ ", asn=" + asn + ", authKey=" + authKey + ", bgpPeers=" + bgpPeers + ", connectionID=" + connectionID
				+ ", customerAddress=" + customerAddress + ", customerRouterConfig=" + customerRouterConfig
				+ ", location=" + location + ", ownerAccount=" + ownerAccount + ", routeFilterPrefixes="
				+ routeFilterPrefixes + ", virtualGatewayID=" + virtualGatewayID + ", virtualInterfaceID="
				+ virtualInterfaceID + ", virtualInterfaceName=" + virtualInterfaceName + ", virtualInterfaceState="
				+ virtualInterfaceState + ", virtualInterfaceType=" + virtualInterfaceType + ", vlan=" + vlan
				+ ", externalID=" + externalID + ", connection=" + connection + "]";
	}

}
