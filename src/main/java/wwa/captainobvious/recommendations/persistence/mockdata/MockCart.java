package wwa.captainobvious.recommendations.persistence.mockdata;

import wwa.captainobvious.recommendations.common.dtos.CartDto;

import java.util.Arrays;
import java.util.List;

public final class MockCart {

    private MockCart() {
    }

    public static CartDto givenCart() {
        return new CartDto();
    }

    public static List<CartDto> givenCarts() {
        return Arrays.asList(givenCart(), givenCart());
    }
}
