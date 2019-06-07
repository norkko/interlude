package net.interlude;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}

@Data
@Entity
class Thing {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Thing(){

    }

    public Thing(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

@RepositoryRestResource
interface ThingRepository extends JpaRepository<Thing, Long> {

}

@RestController
class ThingController {

    @Autowired
    ThingRepository thingRepository;

    @PostMapping
    public void findAll(@RequestBody Thing thing) {
        thingRepository.save(thing);
    }

    @GetMapping
    public @ResponseBody List<Thing> findAll() {
        return thingRepository.findAll();
    }
}

@Component
class ThingInitializer implements CommandLineRunner {

    private final ThingRepository thingRepository;

    ThingInitializer(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    @Override
    public void run(String... args) {
        thingRepository.findAll().forEach(System.out::println);
    }
}