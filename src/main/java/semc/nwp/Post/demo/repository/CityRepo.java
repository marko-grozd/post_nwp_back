package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import semc.nwp.Post.demo.model.Grad;

@Repository
public interface CityRepo extends JpaRepository<Grad, Integer> {

}
