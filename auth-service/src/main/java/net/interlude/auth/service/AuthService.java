package net.interlude.auth.service;

import net.interlude.auth.domain.Auth;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    void create(Auth auth);
}