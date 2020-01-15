package semc.nwp.Post.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semc.nwp.Post.demo.model.Pismo;
import semc.nwp.Post.demo.service.PismoService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("letters")
public class PismoController {
	
	
	@Autowired
	PismoService ps;
	
	@PostMapping
	public String insertLetter(@RequestBody Pismo pis) {
		return ps.insertLetter(pis);
	}
	
	@GetMapping
	public List<Pismo> allLetters() {
		return ps.findAll();
	}

}
