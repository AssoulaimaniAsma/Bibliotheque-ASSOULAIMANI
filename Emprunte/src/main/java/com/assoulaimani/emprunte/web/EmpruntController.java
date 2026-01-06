package com.assoulaimani.emprunte.web;


import com.assoulaimani.emprunte.Model.Etudiant7;
import com.assoulaimani.emprunte.Model.Livre7;
import com.assoulaimani.emprunte.etities.Emprunte7;
import com.assoulaimani.emprunte.repository.EmprunteRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpruntController {
    private EmprunteRepo emprunteRepo;
    private final EtdFeign etdFeign;
    private final LivreFeign livreFeign;

    public EmpruntController(EmprunteRepo emprunteRepo, EtdFeign etdFeign, LivreFeign livreFeign) {
        this.emprunteRepo = emprunteRepo;
        this.etdFeign = etdFeign;
        this.livreFeign = livreFeign;
    }

    @GetMapping("/emprunts")
    public List<Emprunte7> getEmprunts() {
        List<Emprunte7> empruntes = emprunteRepo.findAll();
        List<Livre7> livres =livreFeign.getAllLivres();
        List<Etudiant7> etudiants =etdFeign.getAllEtudiants();
        for (Emprunte7 emprunte : empruntes) {
            for (Livre7 livre : livres) {
                if (emprunte.getId_livre() == livre.getId_livre()) {
                    emprunte.setLivre(livre);
                    break;
                }
            }
            for (Etudiant7 etudiant : etudiants) {
                if(emprunte.getId_etd() == etudiant.getId_etd()) {
                    emprunte.setEtudiant(etudiant);
                    break;
                }
            }
        }
        return empruntes;
    }
    @GetMapping("/emprunts/{id}")
    public Emprunte7 getEmprunte(@PathVariable Long id) {
        Emprunte7 emprunte = emprunteRepo.findById(id).get();
        Etudiant7 etudiant = etdFeign.getEtudiantById(emprunte.getEtudiant().getId_etd());
        emprunte.setEtudiant(etudiant);
        Livre7 livre = livreFeign.getLivreById(emprunte.getLivre().getId_livre());
        emprunte.setLivre(livre);
        return emprunte;
    }

    @PostMapping("/emprunts")
    public Emprunte7 addEmprunte(@RequestBody Emprunte7 emprunte) {
        return emprunteRepo.save(emprunte);
    }

    @PutMapping("/emprunts/{id}")
    public Emprunte7 updateEmprunte(@RequestBody Emprunte7 emprunte, @PathVariable Long id) {
        emprunte.setId_emprunte(id);
        return emprunteRepo.save(emprunte);
    }

    @DeleteMapping("/emprunts/{id}")
    public void deleteEmprunte(@PathVariable Long id) {
        emprunteRepo.deleteById(id);
    }

}
