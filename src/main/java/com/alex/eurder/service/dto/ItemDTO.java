package com.alex.eurder.service.dto;

import java.util.Objects;

public class ItemDTO {
    private String itemId;
    private String itemName;
    private String itemDescription;
    private Integer itemPrice;
    private Integer itemsInStock;

    public String getItemId(){

        return itemId;
    }

    public void setItemId(){
        this.itemId = itemId;
    }

    public String getItemName(){

        return itemName;
    }

    public void setItemName(){
        this.itemName = itemName;
    }

    public String getItemDescription(){

        return itemDescription;
    }

    public void setItemDescription(){
        this.itemDescription = itemDescription;
    }

    public Integer getItemPrice(){

        return itemPrice;
    }

    public void setItemPrice(){
        this.itemPrice = itemPrice;
    }

    public Integer getItemsInStock(){

        return itemsInStock;
    }

    public void setItemsInStock(){
        this.itemsInStock = itemsInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTO itemDTO = (ItemDTO) o;
        return Objects.equals(itemId, itemDTO.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }
}
