package semc.nwp.Post.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import semc.nwp.Post.demo.model.Grad;
import semc.nwp.Post.demo.service.GradService;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("cities")
public class GradController {

    @Autowired
    GradService service;

    @GetMapping
    public List<Grad> getAllCities() {
        return service.getAllCities();
    }
}
