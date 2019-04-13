package wwa.captainobvious.recommendations.persistence.dtos;

import wwa.captainobvious.recommendations.web.dtos.ItemDto;

public class WeightedItemDto {

    public double priceWeight;
    public double similarWeight;
    public double alsoBoughtWeight;
    public double weight;
    public ItemDto item;
}
