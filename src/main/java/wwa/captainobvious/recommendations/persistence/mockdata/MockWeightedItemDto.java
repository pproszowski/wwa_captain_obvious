package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.persistence.dtos.WeightedItemDto;

import java.util.List;
import java.util.stream.Collectors;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockItems.givenItems;

public final class MockWeightedItemDto {

    private MockWeightedItemDto() {
    }

    public static List<WeightedItemDto> givenWeightedItems() {
        return givenItems().stream().map(itemDto -> {
            WeightedItemDto dto = new WeightedItemDto();

            dto.item = itemDto;
            return dto;
        }).collect(Collectors.toList());
    }
}
