package net.interlude.tbd.controller;

import net.interlude.tbd.client.ItemClient;
import net.interlude.tbd.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    ItemClient itemClient;

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody Item item) {
        itemClient.registerItem(item);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Object> fetchUsers() {
        return itemClient.fetchItems();
    }

}
