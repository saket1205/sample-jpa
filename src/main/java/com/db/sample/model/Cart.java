package com.db.sample.model;

import java.util.List;

public class Cart {
    int cartId;
    List<Item> items;

    public Cart(int cartId) {
        this.cartId = cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCartId() {
        return cartId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
