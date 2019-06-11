package net.interlude.account.service;

import net.interlude.account.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {

    /**
     * Stores an object.
     * @param account
     */
    void save(Account account);

    /**
     * Returns all stored objects.
     */
    List<Account> findAll();

    /**
     * Returns a stored object queried by username field.
     * @param username
     */
    Optional<Account> findByUsername(String username);
}
