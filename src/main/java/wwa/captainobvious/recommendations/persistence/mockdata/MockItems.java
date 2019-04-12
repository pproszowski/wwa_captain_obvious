package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.common.dtos.ItemDto;

import java.util.ArrayList;
import java.util.List;

public final class MockItems {

    private MockItems() {
    }

    public static List<ItemDto> givenItems() {
        return new ArrayList<>();
    }
}
