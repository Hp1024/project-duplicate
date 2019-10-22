package com.stackroute.datapopulator.model;
import java.util.List;
import java.util.Map;

public class Node {
    private String node_id;
    private String node_name;
//    private Map<String,String> attribute;
    private List<Map<String,String>> node_attributes;

    public Node() {
    }

    public Node(String node_id, String node_name,List<Map<String,String>>  node_attributes) {
        this.node_id = node_id;
        this.node_name = node_name;
        this.node_attributes = node_attributes;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public List<Map<String,String>> getNode_attributes() {
        return node_attributes;
    }

    public void setNode_attributes(List<Map<String,String>> node_attributes) {
        this.node_attributes = node_attributes;
    }
}
