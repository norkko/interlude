package net.interlude.account.service.impl;

import net.interlude.account.domain.Account;
import net.interlude.account.repository.AccountRepository;
import net.interlude.account.service.AccountService;
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
    public Iterable<Account> findAll() {
        try {
            logger.info("fetching all accounts");
            return accountRepository.findAll();
        } catch (Exception e) {
            logger.warn("exception occurred fetching accounts: " + e);
        }
        return null;
    }

    @Override
    public void createAccount(Account account) {
        try {
            logger.info("registering account " + account.getUsername());
            Account newAccount = new Account();
            newAccount.setUsername(account.getUsername());
            newAccount.setPassword(account.getPassword());
            accountRepository.save(newAccount);
        } catch (Exception e) {
            logger.warn("exception occurred creating account: " + e);
        }

    }

    @Override
    public void removeById(int id) {
        try {
            logger.info("removing account " + id);
            accountRepository.removeById(id);
        } catch (Exception e) {
            logger.warn("exception occurred removing accounts " + id);
        }

    }

    @Override
    public void updateAccount(int id, Account update) {
        try {
            logger.info("updating account " + id);
            Account account = accountRepository.findById(id);
            account.setUsername(update.getUsername());
            account.setPassword(update.getPassword());
            accountRepository.save(account);
        } catch (Exception e) {
            logger.warn("exception occurred updating account: " + id);
        }
    }

}