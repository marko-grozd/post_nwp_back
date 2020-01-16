package semc.nwp.Post.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semc.nwp.Post.demo.model.Adresa;
import semc.nwp.Post.demo.service.AdresaService;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@CrossOrigin("http://localhost:4200")
public class AdresaController {

    @Autowired
    private AdresaService as;

    @GetMapping
    public List<Adresa> all() {
        return as.findAll();
    }

    @PostMapping
    public String insert(Adresa adr) {
        try {
            as.add(adr);
            return "Dodato";
        } catch (Exception e) {
            return "Greska";
        }
    }

    @GetMapping("/{id}")
    public List<Adresa> byIdGrad(@PathVariable("id") int id) {
     return as.getByCityId(id);
    }

    @GetMapping("byid/{id}")
    public Adresa getById(@PathVariable("id") int id) {
        return as.getById(id);
    }
}
