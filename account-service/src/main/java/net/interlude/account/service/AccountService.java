package net.interlude.account.service;

import net.interlude.account.domain.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    void createAccount(Account account);

    Iterable<Account> findAll();

    void removeById(int id);

    void updateAccount(int id, Account account);
}