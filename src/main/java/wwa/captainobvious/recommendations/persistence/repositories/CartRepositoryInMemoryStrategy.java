package wwa.captainobvious.recommendations.persistence.repositories;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.domain.entities.Cart;
import wwa.captainobvious.recommendations.domain.repositories.CartRepository;

@Component
public final class CartRepositoryInMemoryStrategy implements CartRepository {

//    private final List<CartDto> cartDtos = givenCarts();

    @Override
    public Cart get() {
        return null;
    }

}
