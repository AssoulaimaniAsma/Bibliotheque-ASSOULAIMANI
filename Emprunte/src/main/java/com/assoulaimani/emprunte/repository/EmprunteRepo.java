package com.assoulaimani.emprunte.repository;

import com.assoulaimani.emprunte.etities.Emprunte7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprunteRepo extends JpaRepository<Emprunte7, Long> {
}
