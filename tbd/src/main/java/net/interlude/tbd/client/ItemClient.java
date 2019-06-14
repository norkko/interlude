package net.interlude.tbd.client;

import net.interlude.tbd.client.fallback.ItemClientFallback;
import net.interlude.tbd.domain.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Primary
@FeignClient(name = "item-service", fallback = ItemClientFallback.class)
public interface ItemClient {

    @RequestMapping(method = RequestMethod.POST, value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void registerItem(Item item);

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Iterable<Object> fetchItems();

}
