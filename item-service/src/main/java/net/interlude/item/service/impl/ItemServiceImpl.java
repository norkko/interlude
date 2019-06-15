package net.interlude.item.service.impl;

import net.interlude.item.domain.Item;
import net.interlude.item.repository.ItemRepository;
import net.interlude.item.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemServiceImpl implements ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void registerItem(Item created) {
        try {
            logger.info("registering item " + created.getName());
            Item item = new Item();
            item.setName(created.getName());
            item.setDescription(created.getDescription());
            itemRepository.save(item);
        } catch (Exception e) {
            logger.warn("exception occurred registering item: " + e);
        }

    }

    @Override
    public Iterable<Item> findAll() {
        try {
            logger.info("fetching all items");
            return itemRepository.findAll();
        } catch (Exception e) {
            logger.warn("exception occurred fetching items: " + e);
        }
        return null;
    }

    @Override
    public void removeById(int id) {
        try {
            logger.info("removing item " + id);
            itemRepository.removeById(id);
        } catch (Exception e) {
            logger.warn("exception occurred removing item " + id);
        }

    }

    @Override
    public void updateItem(int id, Item update) {
        try {
            Item item = itemRepository.findById(id);
            item.setName(update.getName());
            item.setDescription(update.getDescription());
            itemRepository.save(item);
        } catch (Exception e) {
            logger.warn("exception occurred updating item: " + id);
        }
    }

}
