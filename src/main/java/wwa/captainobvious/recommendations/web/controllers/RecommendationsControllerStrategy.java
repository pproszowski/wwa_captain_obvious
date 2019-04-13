package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.domain.repositories.RecommendationRepository;
import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.List;

@Component
public final class RecommendationsControllerStrategy implements RecommendationsController {

    private final RecommendationRepository repository;

    public RecommendationsControllerStrategy(final RecommendationRepository repository) {
        this.repository = repository;
    }

    @Override
    public RecommendationDto get(final List<Integer> itemsIds) {
        if (itemsIds == null) {

        } else {

        }
        return null;
    }
}
