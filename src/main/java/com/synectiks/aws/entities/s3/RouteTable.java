package com.synectiks.aws.entities.s3;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteTable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AssociationElement> associations;
	private List<PropagatingVgw> propagatingVgws;
	private List<Route> routes;
	private String routeTableID;
	private String vpcID;
	private Tags tags;
	private String name;
	private Document tagsEntities;

	@JsonProperty("associations")
	public List<AssociationElement> getAssociations() {
		return associations;
	}

	@JsonProperty("associations")
	public void setAssociations(List<AssociationElement> value) {
		this.associations = value;
	}

	@JsonProperty("propagatingVgws")
	public List<PropagatingVgw> getPropagatingVgws() {
		return propagatingVgws;
	}

	@JsonProperty("propagatingVgws")
	public void setPropagatingVgws(List<PropagatingVgw> value) {
		this.propagatingVgws = value;
	}

	@JsonProperty("routes")
	public List<Route> getRoutes() {
		return routes;
	}

	@JsonProperty("routes")
	public void setRoutes(List<Route> value) {
		this.routes = value;
	}

	@JsonProperty("routeTableId")
	public String getRouteTableID() {
		return routeTableID;
	}

	@JsonProperty("routeTableId")
	public void setRouteTableID(String value) {
		this.routeTableID = value;
	}

	@JsonProperty("vpcId")
	public String getVpcID() {
		return vpcID;
	}

	@JsonProperty("vpcId")
	public void setVpcID(String value) {
		this.vpcID = value;
	}

	@JsonProperty("tags")
	public Tags getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(Tags value) {
		this.tags = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("tagsEntities")
	public Document getTagsEntities() {
		return tagsEntities;
	}

	@JsonProperty("tagsEntities")
	public void setTagsEntities(Document value) {
		this.tagsEntities = value;
	}

	@Override
	public String toString() {
		return "RouteTable [associations=" + associations + ", propagatingVgws=" + propagatingVgws + ", routes="
				+ routes + ", routeTableID=" + routeTableID + ", vpcID=" + vpcID + ", tags=" + tags + ", name=" + name
				+ ", tagsEntities=" + tagsEntities + "]";
	}

}
