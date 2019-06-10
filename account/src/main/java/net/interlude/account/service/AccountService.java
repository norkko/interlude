package net.interlude.account.service;

import net.interlude.account.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {
    void save(Account account);
    List<Account> findAll();
    Optional<Account> findByUsername(String username);
}
