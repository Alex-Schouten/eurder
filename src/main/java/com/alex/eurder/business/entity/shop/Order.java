package com.alex.eurder.business.entity.shop;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Order {

    private static final int TIME_TO_SHIP=1;
    private final long itemId;
    private final int amount;
    private final LocalDate shippingDate;
    private final double finalPrice;
    private final String customerId;

    public Order (long itemId, int amount, double finalPrice){
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = LocalDate.now().plusDays(TIME_TO_SHIP);
        this.finalPrice  = finalPrice;
        this.customerId = UUID.randomUUID().toString();
    }

    public Long getItemID(){return itemId;}

    public int getAmount(){return amount;}

    public LocalDate getShippingDate(){return shippingDate;}

    public double getFinalPrice(){return finalPrice;}

    public String getCustomerId(){return customerId;}


}
