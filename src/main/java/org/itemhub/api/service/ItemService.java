package org.itemhub.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.itemhub.api.entity.Item;
import org.itemhub.api.exception.IdNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private List<Item> items = new ArrayList();
    private AtomicInteger idCounter = new AtomicInteger(1);

    public Item addItem(Item item) {
        item.setId(idCounter.getAndIncrement());
        items.add(item);
        return item;
    }

    public Item getItemById(int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IdNotFoundException("Item not found with id " + id));
    }
}
