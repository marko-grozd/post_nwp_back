package semc.nwp.Post.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semc.nwp.Post.demo.model.Paket;
import semc.nwp.Post.demo.service.PaketService;

import java.util.List;

@RestController
@RequestMapping("/packages")
@CrossOrigin("http://localhost:4200")
public class PaketController {

    @Autowired
    PaketService ps;

    @GetMapping
    public List<Paket> getAll() {
        return ps.getAll();
    }

    @PostMapping
    public String insert(@RequestBody Paket paket) {
        return ps.insertPackage(paket);
    }
}
