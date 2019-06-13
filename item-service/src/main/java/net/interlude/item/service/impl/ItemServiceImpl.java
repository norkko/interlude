package net.interlude.item.service;

import net.interlude.item.domain.Item;
import net.interlude.item.repository.ItemRepository;
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
        Item item = new Item();
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        itemRepository.save(item);
        logger.info("registered item " + this.findByName(item.getName()).getId());
    }

    @Override
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findByName(String name) {
        return itemRepository.findByName(name);
    }

}
