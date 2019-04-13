package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.domain.entities.Cart;
import wwa.captainobvious.recommendations.domain.entities.Item;
import wwa.captainobvious.recommendations.domain.repositories.CartRepository;
import wwa.captainobvious.recommendations.web.dtos.CartDto;
import wwa.captainobvious.recommendations.web.dtos.ItemDto;

import java.util.stream.Collectors;

@Component
public final class CartControllerStrategy implements CartController {

    private final CartRepository cartRepository;

    public CartControllerStrategy(final CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public CartDto get() {
        Cart cart = cartRepository.get();
        CartDto dto = new CartDto();
        dto.selected = cart.cartItems.stream().map(CartControllerStrategy::toItemDto).collect(Collectors.toList());
        dto.recommended = cart.recommendedItems
            .stream()
            .map(recommendedItem -> recommendedItem.item)
            .map(CartControllerStrategy::toItemDto)
            .collect(Collectors.toList());
        return dto;
    }

    private static ItemDto toItemDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.id = item.id;
        itemDto.price = item.price;
        itemDto.count = item.count;
        itemDto.imageUrl = item.imageUrl;
        itemDto.categoryId = item.categoryId;
        return itemDto;
    }
}
