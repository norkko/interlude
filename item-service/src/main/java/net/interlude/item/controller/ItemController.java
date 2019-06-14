package net.interlude.item.controller;

import net.interlude.item.domain.Item;
import net.interlude.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Item> index() {
        return itemService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void registerItem(@RequestBody Item item) {
        itemService.registerItem(item);
    }

}
