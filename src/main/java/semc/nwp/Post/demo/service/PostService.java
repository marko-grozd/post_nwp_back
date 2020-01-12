package semc.nwp.Post.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semc.nwp.Post.demo.repository.CityRepo;
import semc.nwp.Post.demo.model.Grad;

@Service
public class PostService {
	
	@Autowired
	CityRepo cr;
	
	
	public List<Grad> allCities() {
		return cr.findAll();
	}

}
