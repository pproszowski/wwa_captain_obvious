package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.persistence.dtos.MeteredItemDto;

import java.util.List;
import java.util.stream.Collectors;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockItems.givenItems;

public final class MockWeightedItemDto {

    private MockWeightedItemDto() {
    }

    public static List<MeteredItemDto> givenWeightedItems() {
        return givenItems().stream().map(itemDto -> {
            MeteredItemDto dto = new MeteredItemDto();

//            dto.item = itemDto;
            return dto;
        }).collect(Collectors.toList());
    }
}
