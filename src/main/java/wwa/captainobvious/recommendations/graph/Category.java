package wwa.captainobvious.recommendations.graph;

import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

public class Category extends Node{

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
