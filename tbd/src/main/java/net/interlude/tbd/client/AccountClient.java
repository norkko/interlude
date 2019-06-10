package net.interlude.tbd.client;

import net.interlude.tbd.client.fallback.AccountClientFallback;
import net.interlude.tbd.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Primary
@FeignClient(name = "account", fallback = AccountClientFallback.class)
public interface AccountClient {

    @RequestMapping(method = RequestMethod.POST, value = "/v1/account", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void createUser(Account account);

    @RequestMapping(method = RequestMethod.GET, value = "/v1/account")
    List<Object> getUsers();

}
