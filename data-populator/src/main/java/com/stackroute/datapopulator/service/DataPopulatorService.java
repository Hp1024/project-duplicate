package com.stackroute.datapopulator.service;

import com.stackroute.datapopulator.repository.DataRepository;
import org.springframework.stereotype.Service;

@Service
public class DataPopulatorService {
    private DataRepository dataRepository;
//    private Gson gson = new Gson();
//    private DataModel dataModel=new DataModel();
//    private final Driver driver= GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "password" ) );;
    public DataPopulatorService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    private String line="{\"nodes\":[{\"nodeId\":\"c985c5e8-8533-489e-b26c-32d633178a31\",\"nodeName\":[\"Disease\"],\"nodeAttributes\":{\"name\":\"HIV\\/AIDS\"}},{\"nodeId\":\"422dbba5-b0ea-4af4-baec-5ccbbd6dfef4\",\"nodeName\":[\"Symptoms\"],\"nodeAttributes\":{\"name\":\"Flu-like illness\"}}],\"relationships\":[{\"sourceNode\":\"c985c5e8-8533-489e-b26c-32d633178a31\",\"relId\":\"093aa4c9-3119-4aab-b9d4-645c9c87ac21\",\"destNode\":\"422dbba5-b0ea-4af4-baec-5ccbbd6dfef4\",\"relName\":\"has\"}]}";
    public boolean dataPopulator(){
        dataRepository.neo4j(this.line);
//        JSONObject jo=new JSONObject(line);
//        Map<String, Object> params = new HashMap<>();
//        params.put("nodes",jo.get("nodes"));
//        System.out.println(jo);
//        try ( Session session = driver.session() )
//        {   session.run("CALL apoc.load.json($json) YIELD value AS row"+
//                            " UNWIND row.nodes AS node" +
//                            " UNWIND node.nodeAttributes AS attribute" +
//                            " WITH row,node,attribute.name AS name,attribute.value AS value"+
//                            " MERGE (n:Node{id:node.nodeId,type:node.nodeName,name:value})  "+
//                            " WITH row"+
//                            " UNWIND row.relationships AS rel" +
//                            " WITH rel.relName AS relName , rel.relId AS relId,rel.destNode AS destNode,rel.sourceNode AS sourceNode"+
//                            " MATCH  (a:Node{id:sourceNode}),(b:Node{id:destNode}) "+
//                            " MERGE  (a)-[r:relName{id:relId,name:relName}]->(b) ", parameters( "json", jo ));
//        }
        return true;

    }

}
