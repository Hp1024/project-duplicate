package com.stackroute.datapopulator.model;

import java.util.List;

public class DataModel {
    private List<Node> nodes;
    private List<Relationship> relationships;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }
}
