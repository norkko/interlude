package net.interlude.tbd.client.fallback;

import net.interlude.tbd.client.AccountClient;
import net.interlude.tbd.domain.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AccountClientFallback implements AccountClient {

    private static final Logger logger = LoggerFactory.getLogger(AccountClientFallback.class);

    @Override
    public void createUser(Account account) {
        logger.warn("Unable to create user " + account.getUsername());
    }

}