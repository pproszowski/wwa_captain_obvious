package wwa.captainobvious.recommendations.persistence.repos;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.web.dtos.CartDto;

import java.util.List;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockCart.givenCarts;

@Component
public final class CartRepositoryInMemoryStrategy implements CartRepository {

    private final List<CartDto> cartDtos = givenCarts();

    @Override
    public CartDto get() {
        return cartDtos.iterator().next();
    }
}
