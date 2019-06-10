package net.interlude.tbd.controller;

import net.interlude.tbd.client.AccountClient;
import net.interlude.tbd.domain.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);


    @Autowired
    AccountClient accountClient;

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody Account account) {
        logger.info("creating account " + account.getUsername());
        accountClient.createUser(account);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Object> fetchUsers() {
        logger.info("fetching everyone");
        return accountClient.getUsers();
    }

}
