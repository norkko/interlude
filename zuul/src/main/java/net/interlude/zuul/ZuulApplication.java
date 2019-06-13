package net.interlude.zuul;

import net.interlude.zuul.filter.CustomZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ZuulApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public CustomZuulFilter customZuulFilter() {
		return new CustomZuulFilter();
	}

	@Override
	public void run(String... args) {
		logger.info("Zuul service running");
	}
}
