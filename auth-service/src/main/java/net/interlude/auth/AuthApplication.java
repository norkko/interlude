package net.interlude.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class AuthApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AuthApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("Auth service running");
    }

}
