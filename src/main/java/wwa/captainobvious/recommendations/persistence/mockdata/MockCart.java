package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.common.dtos.CartDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockItems.givenItems;

public final class MockCart {

    private MockCart() {
    }

    public static List<CartDto> givenCarts() {
        List<CartDto> carts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CartDto cart = new CartDto();
            cart.items = givenItems().stream().limit(4).collect(Collectors.toList());
            cart.total = i + 1;
            carts.add(cart);
        }
        Collections.shuffle(carts);
        return carts;
    }
}
