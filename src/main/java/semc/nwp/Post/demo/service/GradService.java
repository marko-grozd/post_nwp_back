package semc.nwp.Post.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semc.nwp.Post.demo.model.Grad;
import semc.nwp.Post.demo.repository.CityRepo;

import java.util.List;

@Service
public class GradService {

    private final CityRepo cityRepo;

    @Autowired
    public GradService(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }


    public List<Grad> getAllCities() {
        return cityRepo.findAll();
    }
}
