package com.db.sample.Controller;

import com.db.sample.Repository.ItemRepository;
import com.db.sample.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(value = "/get/{itemId}")
    public Optional<Item> getItem(@PathVariable Long itemId)
    {
        return itemRepository.findById(itemId);
    }
}
