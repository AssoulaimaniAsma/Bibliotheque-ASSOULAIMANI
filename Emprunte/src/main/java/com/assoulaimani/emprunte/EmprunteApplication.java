package com.assoulaimani.emprunte;

import com.assoulaimani.emprunte.etities.Emprunte7;
import com.assoulaimani.emprunte.repository.EmprunteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
public class EmprunteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmprunteApplication.class, args);
    }

    @Bean
    CommandLineRunner initEmprunt(EmprunteRepo emprunteRepo) {
        return args -> {

            LocalDate today = LocalDate.now();

            Emprunte7 emp1 = Emprunte7.builder()
                    .id_etd(1L)
                    .id_livre(1L)
                    .date_emprunte(today)
                    .dateRetour(today.plusDays(7))
                    .build();

            Emprunte7 emp2 = Emprunte7.builder()
                    .id_etd(2L)
                    .id_livre(2L)
                    .date_emprunte(today)
                    .dateRetour(today.plusDays(10))
                    .build();

            Emprunte7 emp3 = Emprunte7.builder()
                    .id_etd(2L)
                    .id_livre(3L)
                    .date_emprunte(today)
                    .dateRetour(today.plusDays(14))
                    .build();

            emprunteRepo.save(emp1);
            emprunteRepo.save(emp2);
            emprunteRepo.save(emp3);
        };
    }
}
