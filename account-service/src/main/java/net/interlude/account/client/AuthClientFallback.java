package net.interlude.account.client;

import net.interlude.account.domain.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthClientFallback implements AuthClient {

    private static final Logger logger = LoggerFactory.getLogger(AuthClientFallback.class);

    @Override
    public void create(Auth auth) {
        logger.warn("Unable to register account " + auth.getUsername());
    }
}
