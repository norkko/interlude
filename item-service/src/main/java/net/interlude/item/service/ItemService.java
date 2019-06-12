package net.interlude.item.service;

import net.interlude.item.domain.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    /**
     * Registers an item.
     * @param item
     */
    void registerItem(Item item);

    /**
     * Returns all registered items.
     */
    Iterable<Item> findAll();

    /**
     * Returns a registered item queried by name field.
     * @param name
     */
    Item findByName(String name);
}
