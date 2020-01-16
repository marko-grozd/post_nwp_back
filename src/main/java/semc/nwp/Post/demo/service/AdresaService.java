package semc.nwp.Post.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semc.nwp.Post.demo.model.Adresa;
import semc.nwp.Post.demo.repository.AddressRepo;

import java.util.List;

@Service
public class AdresaService {

    private final AddressRepo addressRepo;

    @Autowired
    public AdresaService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }


    public List<Adresa> findAll() {
        return addressRepo.findAll();
    }

    public void add(Adresa adresa) {
        addressRepo.save(adresa);
    }

    /*By{atributKlaseAdresa}{atributKlaseGrad}*/
    public List<Adresa> getByCityId(int cityId) {
        return addressRepo.findByGradPostanskiBroj(cityId);
    }

    public Adresa getById(int adrid) {
        return addressRepo.findById(adrid)
                .orElse(null);
    }
}
