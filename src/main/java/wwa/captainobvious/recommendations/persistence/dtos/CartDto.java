package wwa.captainobvious.recommendations.persistence.dtos;


import java.util.List;

public class CartDto {

    public int total;
    public List<ItemDto> selected;
    public List<ItemDto> recommended;
}
