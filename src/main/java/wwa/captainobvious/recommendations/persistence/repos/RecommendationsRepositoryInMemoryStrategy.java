package wwa.captainobvious.recommendations.persistence.repos;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.persistence.dtos.WeightedItemDto;
import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockWeightedItemDto.givenWeightedItems;

@Component
public final class RecommendationsRepositoryInMemoryStrategy implements RecommendationsRepository {

    private final List<WeightedItemDto> items = givenWeightedItems();

    @Override
    public RecommendationDto get(final List<Integer> itemsIds) {
        RecommendationDto recommendationDto = new RecommendationDto();
        recommendationDto.items = items
            .stream()
            .sorted(Comparator.comparingDouble(value -> value.weight))
            .map(weightedItemDto -> weightedItemDto.item)
            .filter(itemDto -> !itemsIds.contains(Integer.parseInt(itemDto.id)))
            .limit(10)
            .collect(Collectors.toList());
        return recommendationDto;
    }
}
