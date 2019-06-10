package net.interlude.account.service;

import net.interlude.account.domain.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    void save(Account account);
}
