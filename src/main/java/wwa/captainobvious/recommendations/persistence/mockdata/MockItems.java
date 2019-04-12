package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.common.dtos.ItemDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class MockItems {

    private static List<String> names = Arrays.asList("Peleryna",
                                                      "Pendrive",
                                                      "Mysz",
                                                      "Podkładka",
                                                      "0.5l",
                                                      "Kubek",
                                                      "Baterie",
                                                      "Koszulka",
                                                      "Zeszyt",
                                                      "Ołówek",
                                                      "Krzesło",
                                                      "Stół",
                                                      "Okulary",
                                                      "Opaska",
                                                      "Przepaska",
                                                      "Łyżeczka",
                                                      "Stickery",
                                                      "Laptop");

    private static List<String> images = Arrays.asList("https://discordemoji.com/assets/emoji/3142_noice.png",
                                                       "https://openclipart.org/image/90px/svg_to_png/318263/1555084665.png",
                                                       "https://openclipart.org/image/90px/svg_to_png/318262/1555084545.png",
                                                       "https://openclipart.org/image/90px/svg_to_png/318252/1555072876.png",
                                                       "https://openclipart.org/image/90px/svg_to_png/188447/Developers-Openclipart-has-a-JSON-API.png",
                                                       "https://openclipart.org/image/90px/svg_to_png/237835/NEW-Questions-Asked-Clipart-2016011843.png");

    private MockItems() {
    }

    public static List<ItemDto> givenItems() {
        Random random = new Random();
        ArrayList<ItemDto> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ItemDto item = new ItemDto();
            item.id = "" + i;
            item.name = names.get(random.nextInt(names.size()));
            item.count = random.nextInt(3) + 1;
            item.price = (random.nextInt(10) + 1) * 10;
            item.categoryId = "" + random.nextInt(10);
            item.imageUrl = images.get(random.nextInt(images.size()));
            items.add(item);
        }
        Collections.shuffle(items);
        return items;
    }
}
