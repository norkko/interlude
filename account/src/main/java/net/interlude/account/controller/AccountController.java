package net.interlude.account.controller;

import net.interlude.account.domain.Account;
import net.interlude.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping
    public void createUser(@RequestBody Account account) {
        accountService.save(account);
    }

}
