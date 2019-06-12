package net.interlude.tbd.client.fallback;

import net.interlude.tbd.client.ItemClient;
import net.interlude.tbd.domain.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ItemClientFallback implements ItemClient {

    private static final Logger logger = LoggerFactory.getLogger(ItemClientFallback.class);

    @Override
    public void registerItem(Item item) {
        logger.warn("Unable to register item " + item.getName());
    }

    @Override
    public Iterable<Object> fetchItems() {
        logger.warn("Unable to fetch items");
        return null;
    }

}