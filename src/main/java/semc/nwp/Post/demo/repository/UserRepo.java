package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import semc.nwp.Post.demo.model.Korisnik;

public interface UserRepo extends JpaRepository<Korisnik, Integer> {
}
