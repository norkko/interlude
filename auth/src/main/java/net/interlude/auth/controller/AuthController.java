package net.interlude.auth.controller;

import net.interlude.auth.domain.Auth;
import net.interlude.auth.repository.AuthRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AuthRepository authRepository;

    @PostMapping
    public void findAll(@RequestBody Auth auth) {
        authRepository.save(auth);
    }


    @GetMapping
    public @ResponseBody List<Auth> findAll() {
        return authRepository.findAll();
    }

}