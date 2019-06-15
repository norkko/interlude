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
    public Iterable<Item> findItems() {
        return itemService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void registerItem(@RequestBody Item item) {
        itemService.registerItem(item);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeItem(@PathVariable int id) {
        itemService.removeById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateItem(@PathVariable int id, @RequestBody Item item) {
        itemService.updateItem(id, item);
    }

}
