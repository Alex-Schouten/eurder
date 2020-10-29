package com.alex.eurder.business.entity;

public class Cart {
    private Item item;
    private String amountOfItems;
    private String shippingDate;

    public Cart(Item item, String amountOfItems, String shippingDate) {
        this.item = item;
        this.amountOfItems = amountOfItems;
        this.shippingDate = shippingDate;
    }

    public Item getItem(){
        return item;
    }

    public String getAmountOfItems(){
        return amountOfItems;
    }

    public String getShippingDate(){
        return shippingDate;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "item=" + item +
                ", amountOfItems='" + amountOfItems + '\'' +
                ", shippingDate='" + shippingDate + '\'' +
                '}';
    }
}
