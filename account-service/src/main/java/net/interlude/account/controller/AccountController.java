package net.interlude.account.controller;

import net.interlude.account.domain.Account;
import net.interlude.account.domain.Auth;
import net.interlude.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Account> findAll() {
        return accountService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Auth auth) {
        accountService.create(auth);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable int id) {
        accountService.removeById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable int id, @RequestBody Account account) {
        accountService.updateAccount(id, account);
    }

}