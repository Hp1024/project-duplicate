package com.stackroute.datapopulator.model;

import java.util.Map;

public class Relationship {
    private long relation_id;
    private String relation_name;
    private Node source_node;
    private Node destination_node;
    private Map relation_attrributes;

    public long getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(long relation_id) {
        this.relation_id = relation_id;
    }

    public String getRelation_name() {
        return relation_name;
    }

    public void setRelation_name(String relation_name) {
        this.relation_name = relation_name;
    }

    public Node getSource_node() {
        return source_node;
    }

    public void setSource_node(Node source_node) {
        this.source_node = source_node;
    }

    public Node getDestination_node() {
        return destination_node;
    }

    public void setDestination_node(Node destination_node) {
        this.destination_node = destination_node;
    }

    public Map getRelation_attrributes() {
        return relation_attrributes;
    }

    public void setRelation_attrributes(Map relation_attrributes) {
        this.relation_attrributes = relation_attrributes;
    }
}
