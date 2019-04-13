package wwa.captainobvious.recommendations.web.dtos;

import java.util.List;

public class CartDto {

    public int total;
    public List<ItemDto> selected;
    public List<ItemDto> recommended;
}
