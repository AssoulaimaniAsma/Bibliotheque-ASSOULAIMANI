package com.assoulaimani.emprunte.etities;

import com.assoulaimani.emprunte.Model.Etudiant7;
import com.assoulaimani.emprunte.Model.Livre7;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Emprunte7 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_emprunte;
    private Long id_livre;
    private Long id_etd;
    private LocalDate date_emprunte;
    private LocalDate dateRetour;
    @Transient
    private Etudiant7 etudiant;
    @Transient
    private Livre7 livre;
}
