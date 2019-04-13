package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.web.dtos.CartDto;

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
            cart.selected = givenItems().stream().limit(4).collect(Collectors.toList());
            cart.recommended = givenItems().stream().limit(4).collect(Collectors.toList());
            cart.total = cart.selected.stream().mapToInt(x -> x.price).sum();
            carts.add(cart);
        }
        Collections.shuffle(carts);
        return carts;
    }
}
