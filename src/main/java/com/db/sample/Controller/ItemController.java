package com.db.sample.Controller;

import com.db.sample.Repository.ItemRepository;
import com.db.sample.model.Item;
import com.db.sample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @PostMapping(value = "/addItem")
    public Optional<Item> add(@RequestBody final Item item)
    {
        itemRepository.save(item);
        return itemRepository.findById(item.getId());
    }

    @GetMapping(value = "/all")
    public List<Item> findAll() {
        return (List<Item>) itemRepository.findAll();
    }
}
