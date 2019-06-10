package net.interlude.account.service;

import net.interlude.account.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    void save(Account account);
    Account findByUsername(String username);
}
