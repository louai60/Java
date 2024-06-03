package com.louaysaafi.dojos.ninjas.services;

import com.louaysaafi.dojos.ninjas.models.Ninja;
import com.louaysaafi.dojos.ninjas.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> allNinjas() {
        return (List<Ninja>) ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
}
