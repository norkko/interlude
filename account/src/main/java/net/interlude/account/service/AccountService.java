package net.interlude.account.service;

import net.interlude.account.domain.Account;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AccountService {
    void save(Account account);
    Optional<Account> findByUsername(String username);
}
