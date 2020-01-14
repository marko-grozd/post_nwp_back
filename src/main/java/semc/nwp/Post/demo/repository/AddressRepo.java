package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import semc.nwp.Post.demo.model.Adresa;

public interface AddressRepo extends JpaRepository<Adresa, Integer> {

}
