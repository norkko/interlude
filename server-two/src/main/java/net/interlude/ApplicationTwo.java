package net.interlude;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApplicationTwo implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTwo.class, args);
    }

    @ResponseBody
    @GetMapping
    public String init() {
        return "";
    }

    @Override
    public void run(String... args) {
        System.out.println("Init server-two service");
    }
}
