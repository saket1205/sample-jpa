package com.db.sample.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long cartId;

    @OneToMany
    List<Item> items;

    public Cart(Long cartId) {
        this.cartId = cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getCartId() {
        return cartId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
