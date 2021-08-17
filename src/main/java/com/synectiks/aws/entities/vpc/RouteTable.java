package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class RouteTable {
    private Association[] associations;
    private PropagatingVgw[] propagatingVgws;
    private Route[] routes;
    private String routeTableID;
    private String vpcID;
    private Tags tags;
    private String name;
    private TagsEntities tagsEntities;

    @JsonProperty("associations")
    public Association[] getAssociations() { return associations; }
    @JsonProperty("associations")
    public void setAssociations(Association[] value) { this.associations = value; }

    @JsonProperty("propagatingVgws")
    public PropagatingVgw[] getPropagatingVgws() { return propagatingVgws; }
    @JsonProperty("propagatingVgws")
    public void setPropagatingVgws(PropagatingVgw[] value) { this.propagatingVgws = value; }

    @JsonProperty("routes")
    public Route[] getRoutes() { return routes; }
    @JsonProperty("routes")
    public void setRoutes(Route[] value) { this.routes = value; }

    @JsonProperty("routeTableId")
    public String getRouteTableID() { return routeTableID; }
    @JsonProperty("routeTableId")
    public void setRouteTableID(String value) { this.routeTableID = value; }

    @JsonProperty("vpcId")
    public String getVpcID() { return vpcID; }
    @JsonProperty("vpcId")
    public void setVpcID(String value) { this.vpcID = value; }

    @JsonProperty("tags")
    public Tags getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(Tags value) { this.tags = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tagsEntities")
    public TagsEntities getTagsEntities() { return tagsEntities; }
    @JsonProperty("tagsEntities")
    public void setTagsEntities(TagsEntities value) { this.tagsEntities = value; }
}