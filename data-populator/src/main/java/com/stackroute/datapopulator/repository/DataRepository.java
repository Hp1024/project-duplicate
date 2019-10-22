package com.stackroute.datapopulator.repository;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DataRepository extends Neo4jRepository {
//    @Query("CALL apoc.load.json(\"https://raw.githubusercontent.com/Hp1024/Project_data/master/Data.json\") YIELD value AS row "+
//            " UNWIND row.nodes AS node" +
//            " UNWIND node.nodeAttributes AS attribute" +
//            " WITH row,node,attribute.name AS name,attribute.value AS value"+
//            " MERGE (n:Node{id:node.nodeId,type:node.nodeName,name:value})  "+
//            " WITH row"+
//            " UNWIND row.relationships AS rel" +
//            " WITH rel.relName AS relName , rel.relId AS relId,rel.destNode AS destNode,rel.sourceNode AS sourceNode"+
//            " MATCH  (a:Node{id:sourceNode}),(b:Node{id:destNode}) "+
//            " MERGE  (a)-[r:relName{id:relId,name:relName}]->(b) ")
//    public void neo4j();
//@Query("CALL apoc.load.json(\"http://localhost:3000/nodes\") YIELD value AS node "+
//        " CALL apoc.load.json(\"http://localhost:3000/relationships\") YIELD value AS rel "+
//        " UNWIND node.nodeAttributes AS attribute" +
//        " WITH rel,node,attribute.name AS name,attribute.value AS value"+
//        " MERGE (n:Node{id:node.nodeId,type:node.nodeName,name:value})  "+
//        " WITH rel.relName AS relName , rel.relId AS relId,rel.destNode AS destNode,rel.sourceNode AS sourceNode"+
//        " MATCH  (a:Node{id:sourceNode}),(b:Node{id:destNode}) "+
//        " MERGE  (a)-[r:relName{id:relId,name:relName}]->(b) ")
//public void neo4j();
    @Query("WITH apoc.convert.fromJsonMap({0}) AS row "+
            " UNWIND row.nodes AS node" +
            " WITH row,node"+
            " CALL apoc.create.node(node.nodeName,node.nodeAttributes) YIELD node AS n" +
            " SET n.uuid = node.nodeId"+
            " WITH row"+
            " UNWIND row.relationships AS rel" +
            " MATCH (a) WHERE a.uuid = rel.sourceNode"+
            " MATCH (b) WHERE b.uuid = rel.destNode"+
            " CALL apoc.merge.relationship(a, rel.relName,rel.id,rel.relAttributes, b) YIELD rel AS r"+
            " SET r.uuid=rel.relId")
    public void neo4j(String line);
}
