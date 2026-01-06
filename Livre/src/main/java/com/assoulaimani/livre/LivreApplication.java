package com.assoulaimani.livre;

import com.assoulaimani.livre.entities.Livre7;
import com.assoulaimani.livre.repositories.LivreRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LivreApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivreApplication.class, args);
    }
    @Bean
    CommandLineRunner initClients(LivreRepo livreRepo) {
        return args -> {

            Livre7 l1 = new Livre7();

            l1.setTitre("Spring MVC");
            l1.setAuteur("ASSOULAIMANI");

            Livre7 l2 = new Livre7();

            l2.setTitre("Microsoft");
            l2.setAuteur("TEST");

            livreRepo.save(l1);
            livreRepo.save(l2);


        };
    }
}
