package com.alex.eurder.service;

import com.alex.eurder.business.entity.Item;
import com.alex.eurder.business.repository.ItemRepository;
import com.alex.eurder.exceptions.items.ItemNotFoundException;
import com.alex.eurder.service.dto.ItemDTO;
import com.alex.eurder.service.dto.ItemDTOCompactOverview;
import com.alex.eurder.service.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Autowired
    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper){
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemDTO addAnItem(ItemDTO itemDTO){
        Item item = itemRepository.save(itemMapper.createItem(itemDTO));
        return itemMapper.detailDTO(item);
    }

    public ItemDTO updateAnItem(ItemDTO itemDTO) {
        Item item = itemRepository.getItem(itemId);

        item.getItemId();
        item.getItemName();
        item.getItemDescription();
        item.getItemPrice();
        item.getItemsInStock();
        return itemMapper.detailDTO(item);
    }


    public List<ItemDTOCompactOverview> getItemByName(String partialItemName) {
        List<Item> items =
                itemRepository.getItems().stream()
                .filter(item -> item.getItemName().toLowerCase().contains(partialItemName.toLowerCase()))
                .collect(Collectors.toList());

        if (items.isEmpty()) throw new ItemNotFoundException("No item matching this title");

        return items.stream().map(item -> itemMapper.overviewDTO(item)).collect(Collectors.toList());
    }










    public ItemRepository getItemRepository(){return itemRepository;}

    public ItemMapper getItemMapper(){return itemMapper;}

    public ItemDTO getItemByID(String id) {
        return itemMapper.toDTO(itemRepository.getItemMap().get(id));
    }



}
