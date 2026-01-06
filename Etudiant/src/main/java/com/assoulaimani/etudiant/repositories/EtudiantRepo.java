package com.assoulaimani.etudiant.repositories;

import com.assoulaimani.etudiant.entity.Etudiant7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant7, Long> {
}
