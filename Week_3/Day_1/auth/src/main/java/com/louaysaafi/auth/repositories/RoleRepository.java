package com.louaysaafi.auth.repositories;

import com.louaysaafi.auth.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> { // Assuming the ID type is Long
    List<Role> findAll();

    List<Role> findByName(String name);
}
