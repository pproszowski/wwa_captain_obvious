package wwa.captainobvious.recommendations.persistence.repos;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.common.dtos.CartDto;

import java.util.List;
import java.util.Random;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockCart.givenCarts;

@Component
public final class CartRepositoryInMemoryStrategy implements CartRepository {

    private final List<CartDto> cartDtos = givenCarts();

    @Override
    public CartDto get() {
        Random rand = new Random();
        return cartDtos.get(rand.nextInt(cartDtos.size()));
    }
}
