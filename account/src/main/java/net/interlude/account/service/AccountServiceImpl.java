package net.interlude.account.service;

import net.interlude.account.domain.Account;
import net.interlude.account.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void save(Account account) {
        accountRepository.save(account);
        Account createdUser = this.findByUsername(account.getUsername());
        logger.info("fetching created used: " + createdUser.getUsername());
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

}
