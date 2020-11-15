package com.alex.eurder.business.repository;

import com.alex.eurder.business.entity.Item;
import com.alex.eurder.exceptions.items.ItemNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ItemRepository {

    private final Map<Long, Item> items;

    public ItemRepository(){
        this.items =  new HashMap<>();
        addFirstThreeItems();
    }

    public Item save(Item item){
        if(item == null)
            throw new ItemNotFoundException("No data provided");
        if(items.containsValue(item))
            throw new ItemNotFoundException(item.getItemId() + " already exists");

        items.put(item.getItemId(), item);
        return item;
    }

    public void addFirstThreeItems(){
        Item matchsticks = new Item(151819151819L, "Matches", "First grade quality matches", 15, 19);
        Item firestarter = new Item(152829152829L, "Liquid Firestarter", "Premium ZIP firestarter, concentrated liquid", 29, 2);
        Item chocolate = new Item(153839L, "Chocolate", "Dark chocolate and mint bar", 3, 17);

        items.put(151819151819L, matchsticks);
        items.put(152829152829L, firestarter);
        items.put(153839153839L, chocolate);
    }

    public Item getItem(long itemId) {
        Item item = items.get(itemId);
        if (Objects.isNull(item)) {
            throw new ItemNotFoundException("There is no item with this ID " + itemId);
        }
        return item;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items.values());
    }

//    public Map<Long,Item> getItemMap(){
//        return items;
//    }
//
//    public Map<Long, Item> getDeletedItems(){
//        return deletedItems;
//    }
///
}
