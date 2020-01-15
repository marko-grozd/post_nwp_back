package semc.nwp.Post.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semc.nwp.Post.demo.model.Korisnik;
import semc.nwp.Post.demo.service.KorisnikService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("users")
public class KorisnikController {

    @Autowired
    KorisnikService ks;

    @GetMapping
    public List<Korisnik> allUsers() {
        return ks.allUsers();
    }
    
    @GetMapping("/{id}")
    public Korisnik getById(@PathVariable int id) {
    	return ks.findById(id);
    }
}
