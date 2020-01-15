package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import semc.nwp.Post.demo.model.Adresa;

@Repository
public interface AddressRepo extends JpaRepository<Adresa, Integer> {

}
