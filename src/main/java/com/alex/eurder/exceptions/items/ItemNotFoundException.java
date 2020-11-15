package com.alex.eurder.exceptions.items;

public class ItemNotFoundException extends RuntimeException {
    private String errorMessage;

    public ItemNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage(){
        return "Item with id: " + errorMessage + " is not found in the shop";
    }
}
