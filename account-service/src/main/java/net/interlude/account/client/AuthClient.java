package net.interlude.account.client;

import net.interlude.account.domain.Auth;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Primary
@FeignClient(name = "auth-service")
public interface AuthClient {
    @RequestMapping(method = RequestMethod.POST, value = "/uaa/auth", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void create(Auth auth);
}
