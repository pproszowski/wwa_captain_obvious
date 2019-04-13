package wwa.captainobvious.recommendations.graph;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface GraphRepository extends Neo4jRepository<Node, Long> {
    @Query("MATCH (n) RETURN n")
    List<Node> findAll();

    @Query("MATCH (p1{name: \"\"}), (p2{name: \"\"), p = shortestPath((p1)-[*..15]-(p2)) RETURN p)")
    Integer findDistance();
}
