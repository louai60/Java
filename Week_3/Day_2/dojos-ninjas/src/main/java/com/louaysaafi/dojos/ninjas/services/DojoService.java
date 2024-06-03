package com.louaysaafi.dojos.ninjas.services;

import com.louaysaafi.dojos.ninjas.models.Dojo;
import com.louaysaafi.dojos.ninjas.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DojoService {

    @Autowired
    private DojoRepository dojoRepository;

    public List<Dojo> allDojos() {
        return (List<Dojo>) dojoRepository.findAll();
    }

    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    public Dojo findDojo(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }
}
