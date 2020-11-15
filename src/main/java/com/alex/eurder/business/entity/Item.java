package com.alex.eurder.business.entity;

import java.util.Objects;

public class Item {
    private final long itemId;
    private final String itemName;
    private final String itemDescription;
    private final Integer itemPrice;
    private final Integer itemsInStock;

    public Item(long itemId, String itemName, String itemDescription, Integer itemPrice,Integer itemsInStock){
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemsInStock = itemsInStock;
    }

    public long getItemId(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public String getItemDescription(){
        return itemDescription;
    }

    public Integer getItemPrice(){
        return itemPrice;
    }

    public Integer getItemsInStock(){
        return itemsInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemId == item.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemsInStock=" + itemsInStock +
                '}';
    }
}

