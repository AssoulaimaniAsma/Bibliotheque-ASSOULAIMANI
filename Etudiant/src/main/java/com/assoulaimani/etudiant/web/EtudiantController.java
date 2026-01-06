package com.assoulaimani.etudiant.web;

import com.assoulaimani.etudiant.entity.Etudiant7;
import com.assoulaimani.etudiant.repositories.EtudiantRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtudiantController {
    private final EtudiantRepo etudiantRepo;
    public EtudiantController(EtudiantRepo etudiantRepo) {
        this.etudiantRepo = etudiantRepo;
    }

    @GetMapping("/etudiants")
    public List<Etudiant7> getAllEtudiants() {
        return etudiantRepo.findAll();
    }

    @GetMapping("/etudiants/{id}")
    public Etudiant7 getEtudiantById(@PathVariable Long id) {
        return etudiantRepo.findById(id).get();
    }

    @PostMapping("/etudiants")
    public Etudiant7 addEtudiant(@RequestBody Etudiant7 etudiant) {
        return etudiantRepo.save(etudiant);
    }

    @PutMapping("/etudiants/{id}")
    public Etudiant7 update(@PathVariable Long id, @RequestBody Etudiant7 etudiant) {
        etudiant.setId_etd(id);
        return etudiantRepo.save(etudiant);
    }

    @DeleteMapping ("/etudiants/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantRepo.deleteById(id);
    }


}
