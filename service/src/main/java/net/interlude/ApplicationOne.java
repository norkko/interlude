package net.interlude;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ApplicationOne implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOne.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Client service running");
    }
}