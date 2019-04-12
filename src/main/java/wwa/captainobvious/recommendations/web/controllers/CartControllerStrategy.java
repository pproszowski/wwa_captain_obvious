package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.common.dtos.CartDto;

@Component
public final class CartControllerStrategy implements CartController {

    @Override
    public CartDto get() {
        return new CartDto();
    }
}
