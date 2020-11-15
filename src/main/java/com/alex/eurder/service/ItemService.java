package com.alex.eurder.service;

import com.alex.eurder.business.repository.ItemRepository;
import com.alex.eurder.service.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Autowired
    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper){
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemRepository getItemRepository(){return itemRepository;}

    public ItemMapper getItemMapper(){return itemMapper;}



}
