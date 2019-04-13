package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.persistence.repos.RecommendationsRepository;
import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.List;

@Component
public final class RecommendationsControllerStrategy implements RecommendationsController {

    private final RecommendationsRepository recommendationsRepository;

    public RecommendationsControllerStrategy(final RecommendationsRepository recommendationsRepository) {
        this.recommendationsRepository = recommendationsRepository;
    }

    @Override
    public RecommendationDto get(final List<Integer> itemsIds) {
        return recommendationsRepository.get(itemsIds);
    }
}
