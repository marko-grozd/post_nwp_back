package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import semc.nwp.Post.demo.model.Adresa;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Adresa, Integer> {

    public List<Adresa> findByGradPostanskiBroj(int idGrad);

}
