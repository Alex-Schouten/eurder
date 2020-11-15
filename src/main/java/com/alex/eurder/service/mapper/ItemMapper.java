package com.alex.eurder.service.mapper;

import com.alex.eurder.business.entity.Item;
import com.alex.eurder.service.dto.ItemDTO;
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

}
