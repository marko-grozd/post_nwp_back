package semc.nwp.Post.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semc.nwp.Post.demo.service.PostService;
import semc.nwp.Post.demo.model.Grad;

@RestController
@RequestMapping("post")
public class PostController {
	
	
	@Autowired
	PostService ps;
	
	@GetMapping("allCities")
	public List<Grad> allCities() {
		return ps.allCities();
	}
	

}
