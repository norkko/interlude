package net.interlude.account.controller;

import net.interlude.account.domain.Account;
import net.interlude.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Account> findAccounts() {
        return accountService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createAccount(@RequestBody Account account) {
        accountService.createAccount(account);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeAccount(@PathVariable int id) {
        accountService.removeById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateAccount(@PathVariable int id, @RequestBody Account account) {
        accountService.updateAccount(id, account);
    }

}