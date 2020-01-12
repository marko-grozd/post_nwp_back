package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import semc.nwp.Post.demo.service.model.Grad;

public interface CityRepo extends JpaRepository<Grad, Integer> {

}
