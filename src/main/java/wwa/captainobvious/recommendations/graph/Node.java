package wwa.captainobvious.recommendations.graph;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public abstract class Node {
    @Id
    @GeneratedValue
    protected Long id;

    @Relationship(value = "IS_A")
    protected Set<Node> connections;

    protected String name;
}
