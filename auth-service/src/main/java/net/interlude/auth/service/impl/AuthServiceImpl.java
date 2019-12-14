package net.interlude.auth.service.impl;

import net.interlude.auth.domain.Auth;
import net.interlude.auth.repository.AuthRepository;
import net.interlude.auth.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceImpl implements AuthService {

    private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    @Autowired
    private AuthRepository repository;

    @Override
    public void create(Auth auth) {
        try {
            logger.info("registering account " + auth.getUsername());
            Auth account = new Auth();
            account.setUsername(auth.getUsername());
            account.setPassword(auth.getPassword());
            repository.save(account);
        } catch (Exception e) {
            logger.warn("exception occurred creating account: " + e);
        }

    }



}