package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.common.dtos.CartDto;

import java.util.ArrayList;
import java.util.List;

public final class MockCart {

    private MockCart() {
    }

    public static List<CartDto> givenCarts() {
        List<CartDto> carts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CartDto cart = new CartDto();
            cart.items = new ArrayList<>();
            cart.total = i + 1;
            carts.add(cart);
        }
        return carts;
    }
}
