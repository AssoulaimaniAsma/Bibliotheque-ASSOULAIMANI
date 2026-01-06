package com.assoulaimani.emprunte.web;

import com.assoulaimani.emprunte.Model.Etudiant7;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ETUDIANT")
public interface EtdFeign {
    @GetMapping("/etudiants")
    public List<Etudiant7> getAllEtudiants() ;
    @GetMapping("/etudiants/{id}")
    public Etudiant7 getEtudiantById(@PathVariable Long id);
}