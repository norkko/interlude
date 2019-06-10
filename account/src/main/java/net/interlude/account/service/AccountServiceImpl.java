package net.interlude.account.service;

import net.interlude.account.domain.Account;
import net.interlude.account.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void save(Account accountDetails) {
        try {
            Account account = new Account();
            account.setUsername(accountDetails.getUsername());
            account.setPassword(accountDetails.getPassword());
            accountRepository.save(account);
            logger.info("created used: " + this.findByUsername(account.getUsername()).get().getId());
        } catch (Exception e) {
            logger.warn("exception occurred " + e);
        }
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

}
