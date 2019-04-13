package wwa.captainobvious.recommendations.domain.entities;

public final class Item {

    public final String id;
    public final String name;
    public final int count;
    public final int price;
    public final String imageUrl;
    public final String categoryId;

    public Item(final String id,
                final String name,
                final int count,
                final int price,
                final String imageUrl,
                final String categoryId) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
    }

    public int value() {
        return count * price;
    }
}
