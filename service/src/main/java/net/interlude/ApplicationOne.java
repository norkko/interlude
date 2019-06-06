package net.interlude;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApplicationOne implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOne.class, args);
    }

    @ResponseBody
    @GetMapping(value = "/hello")
    public String init() {
        return "world";
    }

    @Override
    public void run(String... args) {

    }
}
