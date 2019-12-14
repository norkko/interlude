package net.interlude.account.service.impl;

import net.interlude.account.client.AuthClient;
import net.interlude.account.domain.Account;
import net.interlude.account.domain.Auth;
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
    private AccountRepository repository;

    @Autowired
    private AuthClient authClient;

    @Override
    public Iterable<Account> findAll() {
        try {
            logger.info("fetching all accounts");
            return repository.findAll();
        } catch (Exception e) {
            logger.warn("exception occurred fetching accounts: " + e);
        }
        return null;
    }

    @Override
    public void create(Auth auth) {
        try {
            logger.info("registering account " + auth.getUsername());
            Account account = new Account();
            account.setName(auth.getUsername());
            repository.save(account);

            authClient.create(auth);
        } catch (Exception e) {
            logger.warn("exception occurred creating account: " + e);
        }

    }

    @Override
    public void removeById(int id) {
        try {
            logger.info("removing account " + id);
            repository.removeById(id);
        } catch (Exception e) {
            logger.warn("exception occurred removing accounts " + id);
        }

    }

    @Override
    public void updateAccount(int id, Account update) {
        try {
            logger.info("updating account " + id);
            Account account = repository.findById(id);
            account.setName(update.getName());
            repository.save(account);
        } catch (Exception e) {
            logger.warn("exception occurred updating account: " + id);
        }
    }

}