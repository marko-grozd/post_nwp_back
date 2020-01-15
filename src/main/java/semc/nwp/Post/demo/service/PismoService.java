package semc.nwp.Post.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semc.nwp.Post.demo.model.Pismo;
import semc.nwp.Post.demo.repository.PismoRepo;

@Service
public class PismoService {
	
	private final PismoRepo pr;
	
	
	@Autowired
	public PismoService(PismoRepo pr) {
		this.pr = pr;
	}
	
	
	public String insertLetter(Pismo pismo) {
		System.out.println(pismo);
		System.out.println(pismo.getKorisnik1().getIdKorisnik());
		System.out.println(pismo.getKorisnik2().getIdKorisnik());
		pismo.setDatumPrijema(new Date());
		try {
			System.out.println(pismo);
			pr.save(pismo);
			return "Uspesno";
		} catch (Exception e) {
			System.out.println("Dogodila se greska " + e.getMessage());
			e.printStackTrace();
			return "Greska";
		}
		
	}


	public List<Pismo> findAll() {
		return pr.findAll();
	}

}
