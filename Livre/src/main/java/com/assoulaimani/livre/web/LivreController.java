package com.assoulaimani.livre.web;

import com.assoulaimani.livre.entities.Livre7;
import com.assoulaimani.livre.repositories.LivreRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivreController {
    private final LivreRepo livreRepo;
    public LivreController(final LivreRepo livreRepo) {
        this.livreRepo = livreRepo;
    }

    @GetMapping("/livres")
    public List<Livre7> getAllLivres() {
        return livreRepo.findAll();
    }

    @GetMapping("/livres/{id}")
    public Livre7 getLivreById(@PathVariable Long id) {
        return livreRepo.findById(id).get();
    }

    @PostMapping("/livres")
    public Livre7 addLivre(@RequestBody Livre7 livre) {
        return livreRepo.save(livre);
    }


    @PutMapping("/livres/{id}")
    public Livre7 setLivre(@PathVariable Long id , @RequestBody Livre7 livre) {
        livre.setId_livre(id);
        return livreRepo.save(livre);
    }
    @DeleteMapping("/livres/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreRepo.deleteById(id);
    }
}
