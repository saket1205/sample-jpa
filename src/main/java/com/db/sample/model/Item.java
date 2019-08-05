package com.db.sample.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long itemId;

    int quantity;
    String description;

    public Long getId() {
        return itemId;
    }

    public void setId(Long id) {
        this.itemId = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item(Long id, int quantity, String description) {
        this.itemId = id;
        this.quantity = quantity;
        this.description = description;
    }
}
