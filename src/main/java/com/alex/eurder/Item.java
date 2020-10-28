package com.alex.eurder;

import java.util.Objects;
import java.util.UUID;

public class Item {
    private String itemId;
    private String itemName;
    private String itemDescription;
    private Integer itemPrice;
    private Integer itemsInStock;

    public Item(String itemName, String itemDescription, Integer itemPrice,Integer itemsInStock){
        this.itemId = UUID.randomUUID().toString();
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemsInStock = itemsInStock;
    }

    public String getItemId(){
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
        return Objects.equals(itemId, item.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemsInStock=" + itemsInStock +
                '}';
    }
}

