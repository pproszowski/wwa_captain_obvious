package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.common.dtos.CartDto;
import wwa.captainobvious.recommendations.persistence.repos.CartRepository;

@Component
public final class CartControllerStrategy implements CartController {

    private final CartRepository cartRepository;

    public CartControllerStrategy(final CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public CartDto get() {
        return cartRepository.get();
    }
}
