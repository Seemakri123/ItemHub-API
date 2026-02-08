package org.itemhub.api.controller;

import jakarta.validation.Valid;
import org.itemhub.api.entity.Item;
import org.itemhub.api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Add a new item
    @PostMapping
    public ResponseEntity<Item> addItem(
            @Valid @RequestBody Item item) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(itemService.addItem(item));
    }

    // Get item by id
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable int id) {

        return ResponseEntity.ok(itemService.getItemById(id));
    }
}
