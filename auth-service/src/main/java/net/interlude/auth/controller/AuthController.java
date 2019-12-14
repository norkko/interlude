package net.interlude.auth.controller;

import net.interlude.auth.domain.Auth;
import net.interlude.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Auth auth) {
        authService.create(auth);
    }

}