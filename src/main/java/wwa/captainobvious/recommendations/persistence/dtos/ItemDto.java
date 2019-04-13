package wwa.captainobvious.recommendations.persistence.dtos;

public class ItemDto {

    public ItemDto(final String id,
                   final String name,
                   final String categoryId,
                   final String imageUrl,
                   final int price,
                   final int count) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.imageUrl = imageUrl;
        this.price = price;
        this.count = count;
    }

    public String id;
    public String name;
    public String categoryId;
    public String imageUrl;
    public int price;
    public int count;
}
