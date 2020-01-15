package semc.nwp.Post.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semc.nwp.Post.demo.model.Korisnik;
import semc.nwp.Post.demo.repository.UserRepo;

import java.util.List;

@Service
public class KorisnikService {

    private final UserRepo userRepo;

    @Autowired
    public KorisnikService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public List<Korisnik> allUsers() {
        return userRepo.findAll();
    }
    
    public Korisnik findById(int id) {
    	return userRepo.findById(id)
    			.orElse(null);
    }
}
