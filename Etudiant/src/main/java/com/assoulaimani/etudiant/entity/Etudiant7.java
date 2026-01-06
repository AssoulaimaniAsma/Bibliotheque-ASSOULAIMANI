package com.assoulaimani.etudiant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Etudiant7 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_etd;
    private String nom;
    private String prenom;
}
