package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.List;

@Component
public final class RecommendationsControllerStrategy implements RecommendationsController {

    @Override
    public RecommendationDto get(final List<Integer> itemsIds) {
        return new RecommendationDto();
    }
}
