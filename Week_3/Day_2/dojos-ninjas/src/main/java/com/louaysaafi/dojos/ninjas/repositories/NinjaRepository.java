package com.louaysaafi.dojos.ninjas.repositories;

import com.louaysaafi.dojos.ninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
}

