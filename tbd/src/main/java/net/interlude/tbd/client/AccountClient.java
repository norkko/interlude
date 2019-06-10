package net.interlude.tbd.client;

import net.interlude.tbd.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "account")
public interface AccountClient {
    @RequestMapping(method = RequestMethod.POST, value = "/v1/account", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void createUser(Account account);
}
