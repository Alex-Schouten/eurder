package com.alex.eurder.service.mapper;

import com.alex.eurder.business.entity.Item;
import com.alex.eurder.service.dto.ItemDTO;
import com.alex.eurder.service.dto.ItemDTOCompactOverview;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item createItem(ItemDTO itemDTO){
        return new Item(
                itemDTO.getItemId(),
                itemDTO.getItemName(),
                itemDTO.getItemDescription(),
                itemDTO.getItemPrice(),
                itemDTO.getItemsInStock()
        );
    }

    public ItemDTO detailDTO(Item item){
        ItemDTO result = new ItemDTO();
        result.setItemId();
        result.setItemName();
        result.setItemDescription();
        result.setItemPrice();
        result.setItemsInStock();
        return result;
    }

    public ItemDTOCompactOverview overviewDTO(Item item) {
        ItemDTOCompactOverview result = new ItemDTOCompactOverview();
        result.setItemId(item.getItemId());
        result.setItemName(item.getItemName());
        return result;
    }

}
