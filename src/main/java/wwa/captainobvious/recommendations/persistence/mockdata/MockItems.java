package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.common.dtos.ItemDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MockItems {

    private MockItems() {
    }

    public static List<ItemDto> givenItems() {
        ArrayList<ItemDto> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ItemDto item = new ItemDto();
            item.id = "" + i;
            item.name = "a" + i;
            item.count = i + 1;
            item.price = (i + 1) * 10;
            item.categoryId = "2";
            item.imageUrl = "https://discordemoji.com/assets/emoji/3142_noice.png";
            items.add(item);
        }
        Collections.shuffle(items);
        return items;
    }
}
