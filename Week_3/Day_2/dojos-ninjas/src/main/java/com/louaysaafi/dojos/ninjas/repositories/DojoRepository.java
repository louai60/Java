package com.louaysaafi.dojos.ninjas.repositories;

import com.louaysaafi.dojos.ninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
}

