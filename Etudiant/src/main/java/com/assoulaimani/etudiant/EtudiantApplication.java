package com.assoulaimani.etudiant;

import com.assoulaimani.etudiant.config.GlobalConfig;
import com.assoulaimani.etudiant.config.TestParam;
import com.assoulaimani.etudiant.entity.Etudiant7;
import com.assoulaimani.etudiant.repositories.EtudiantRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({GlobalConfig.class, TestParam.class})

public class EtudiantApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtudiantApplication.class, args);
    }

    @Bean
    CommandLineRunner initEtudiant(EtudiantRepo etudiantRepo) {
        return args -> {

            Etudiant7 e1 = new Etudiant7();
            e1.setNom("ASSOULAIMANI");
            e1.setPrenom("ASMA");

            Etudiant7 e2 = new Etudiant7();
            e2.setNom("ELIMARI");
            e2.setPrenom("Latifa");

            Etudiant7 e3 = new Etudiant7();
            e3.setNom("MaJDOUL");
            e3.setPrenom("Manal");

            etudiantRepo.save(e1);
            etudiantRepo.save(e2);
            etudiantRepo.save(e3);

        };
    }
}

