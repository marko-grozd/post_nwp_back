package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import semc.nwp.Post.demo.model.Korisnik;

@Repository
public interface UserRepo extends JpaRepository<Korisnik, Integer> {
}
