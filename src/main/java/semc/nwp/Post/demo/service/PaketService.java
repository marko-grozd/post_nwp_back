package semc.nwp.Post.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semc.nwp.Post.demo.model.Grad;
import semc.nwp.Post.demo.model.Paket;
import semc.nwp.Post.demo.repository.PackageRepo;

import java.util.Date;
import java.util.List;

@Service
public class PaketService {

    private final PackageRepo pr;

    @Autowired
    public PaketService(final PackageRepo pr) {
        this.pr = pr;
    }

    public List<Paket> getAll() {
        return pr.findAll();
    }

    public String insertPackage(Paket p) {
        p.setDatumPrijema(new Date());
        try {
            pr.save(p);
            return "Uspesno";
        } catch (Exception e) {
            e.printStackTrace();
            return "Dogodila se greska";
        }
    }


}
