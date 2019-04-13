package wwa.captainobvious.recommendations.domain.repositories;

import wwa.captainobvious.recommendations.domain.entities.Item;
import wwa.captainobvious.recommendations.domain.entities.Recommendation;

public interface RecommendationRepository {

    Recommendation get(Item item);
}
