package com.assoulaimani.livre.repositories;

import com.assoulaimani.livre.entities.Livre7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepo extends JpaRepository<Livre7, Long> {
}
