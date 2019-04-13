package wwa.captainobvious.recommendations.persistence.repos;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.graph.GraphRepository;
import wwa.captainobvious.recommendations.persistence.dtos.WeightedItemDto;
import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockWeightedItemDto.givenWeightedItems;

@Component
public final class RecommendationsRepositoryInMemoryStrategy implements RecommendationsRepository {

    private final List<WeightedItemDto> items = givenWeightedItems();
    private GraphRepository graphRepository;

    public RecommendationsRepositoryInMemoryStrategy(GraphRepository graphRepository) {
        this.graphRepository = graphRepository;
    }

    @Override
    public RecommendationDto get(final List<Integer> itemsIds) {
        RecommendationDto recommendationDto = new RecommendationDto();
        items.forEach(item -> item.weight = calculateWeight(itemsIds));
        recommendationDto.items = items
                .stream()
                .sorted(Comparator.comparingDouble(value -> value.weight))
                .map(weightedItemDto -> weightedItemDto.item)
                .filter(itemDto -> !itemsIds.contains(Integer.parseInt(itemDto.id)))
                .limit(10)
                .collect(Collectors.toList());
        return recommendationDto;
    }

    private double calculateWeight(List<Integer> itemsIds) {
        Integer totalPrice = items.stream().filter(item -> itemsIds.contains(Integer.parseInt(item.item.id))).mapToInt(value -> value.item.price).sum();
        return 3;
    }
}
