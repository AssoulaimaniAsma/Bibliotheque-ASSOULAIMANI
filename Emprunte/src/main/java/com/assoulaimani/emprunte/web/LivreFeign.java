package com.assoulaimani.emprunte.web;

import com.assoulaimani.emprunte.Model.Livre7;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "LIVRE")

public  interface LivreFeign {
    @GetMapping("/livres")
    public List<Livre7> getAllLivres();
    @GetMapping("/livres/{id}")
    public Livre7 getLivreById(@PathVariable Long id);
}
