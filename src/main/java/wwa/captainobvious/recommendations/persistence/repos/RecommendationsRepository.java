package wwa.captainobvious.recommendations.persistence.repos;

import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.List;

public interface RecommendationsRepository {

    RecommendationDto get(List<Integer> itemsIds);
}
