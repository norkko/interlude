package net.interlude.account.service;

import net.interlude.account.domain.Account;
import net.interlude.account.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void save(Account account) {
        logger.info("saving user " + account.getUsername());
        accountRepository.save(account);
    }

    @Override public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
