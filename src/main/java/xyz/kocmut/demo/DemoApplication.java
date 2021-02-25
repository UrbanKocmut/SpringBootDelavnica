package xyz.kocmut.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {


    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PackageRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Package("Jack", "Bauer"));
            repository.save(new Package("Chloe", "O'Brian"));
            repository.save(new Package("Kim", "Bauer"));
            repository.save(new Package("David", "Palmer"));
            repository.save(new Package("Michelle", "Dessler"));


            System.out.println(repository.findAll().get(0).sourceAddress);

            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }

}
