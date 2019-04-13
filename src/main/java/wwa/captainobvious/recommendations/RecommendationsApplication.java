package wwa.captainobvious.recommendations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import wwa.captainobvious.recommendations.graph.GraphRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableNeo4jRepositories
public class RecommendationsApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecommendationsApplication.class, args);
    }

}

