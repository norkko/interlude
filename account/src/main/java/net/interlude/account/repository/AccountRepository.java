package net.interlude.account.repository;

import net.interlude.account.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

    /**
     * Returns a stored object queried by username field.
     * @param username
     */
    Optional<Account> findByUsername(String username);

    /**
     * Returns all stored objects.
     */
    List<Account> findAll();
}
