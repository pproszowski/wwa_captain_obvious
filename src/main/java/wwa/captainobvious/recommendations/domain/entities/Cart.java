package wwa.captainobvious.recommendations.domain.entities;

import java.util.List;

public final class Cart {

    public final List<Item> cartItems;
    public final List<RecommendedItem> recommendedItems;

    public Cart(final List<Item> cartItems, final List<RecommendedItem> recommendedItems) {
        this.cartItems = cartItems;
        this.recommendedItems = recommendedItems;
    }

    public int totalValue() {
        return cartItems.stream().mapToInt(Item::value).sum();
    }
}
