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
     * Removed a registered item.
     * @param id
     */
    void removeById(int id);

    /**
     * Updates a registered item.
     * @param id
     */
    void updateItem(int id, Item item);
}
