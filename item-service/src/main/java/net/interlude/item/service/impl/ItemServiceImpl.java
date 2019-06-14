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
    public void registerItem(Item itemDetails) {
        try {
            Item item = new Item();
            item.setName(itemDetails.getName());
            item.setDescription(itemDetails.getDescription());
            itemRepository.save(item);
            logger.info("registered item " + this.findByName(item.getName()).getId());
        } catch (Exception e) {
            logger.warn("exception occurred registering item: " + e);
        }

    }

    @Override
    public Iterable<Item> findAll() {
        try {
            return itemRepository.findAll();
        } catch (Exception e) {
            logger.warn("exception occurred fetching items: " + e);
        }
        return null;
    }

    @Override
    public Item findByName(String name) {
        try {
            return itemRepository.findByName(name);
        } catch (Exception e) {
            logger.warn("exception occurred finding: " + name);
        }
        return null;
    }

}
