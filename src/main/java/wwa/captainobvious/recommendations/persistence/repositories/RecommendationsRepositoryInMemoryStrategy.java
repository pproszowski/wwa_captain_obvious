package wwa.captainobvious.recommendations.persistence.repositories;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.domain.entities.Item;
import wwa.captainobvious.recommendations.domain.entities.Recommendation;
import wwa.captainobvious.recommendations.domain.repositories.RecommendationRepository;
import wwa.captainobvious.recommendations.persistence.dtos.MeteredItemDto;

import java.util.List;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockWeightedItemDto.givenWeightedItems;

@Component
public final class RecommendationsRepositoryInMemoryStrategy implements RecommendationRepository {

    private final List<MeteredItemDto> items = givenWeightedItems();

    @Override
    public Recommendation get(final Item item) {
        return null;
    }
}
