package com.alex.eurder.service.dto;

import java.util.Objects;

public class ItemDTOCompactOverview {
    private long itemId;
    private String itemName;

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getItemID(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTOCompactOverview that = (ItemDTOCompactOverview) o;
        return itemId == that.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return "ItemDTOCompactOverview{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
