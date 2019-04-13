package wwa.captainobvious.recommendations.persistence.dtos;

import wwa.captainobvious.recommendations.web.dtos.ItemDto;

public class WeightedItemDto {

    public WeightedItemDto(final double priceWeight,
                           final double similarWeight,
                           final double alsoBoughtWeight,
                           final double weight,
                           final ItemDto item) {
        this.priceWeight = priceWeight;
        this.similarWeight = similarWeight;
        this.alsoBoughtWeight = alsoBoughtWeight;
        this.weight = weight;
        this.item = item;
    }

    public double priceWeight;
    public double similarWeight;
    public double alsoBoughtWeight;
    public double weight;
    public ItemDto item;
}
