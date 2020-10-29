package com.alex.eurder.service.dto;

import com.alex.eurder.business.entity.Item;

public class CartDTO {
    private Item item;
    private String amountOfItems;
    private String shippingDate;

    public Item getItem(){
        return item;
    }

    public void setItem(Item item){this.item = item;}

    public String getAmountOfItems(){
        return amountOfItems;
    }

    public void setAmountOfItems(){this.amountOfItems = amountOfItems;}

    public String getShippingDate(){
        return shippingDate;
    }

    public void setShippingDate(){this.shippingDate = shippingDate;}

}
