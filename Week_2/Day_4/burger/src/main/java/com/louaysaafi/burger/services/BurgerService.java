package com.louaysaafi.burger.services;

import com.louaysaafi.burger.models.Burger;
import com.louaysaafi.burger.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {
    private final BurgerRepository burgerRepo;

    public BurgerService(BurgerRepository burgerRepo) {
        this.burgerRepo = burgerRepo;
    }


    public List<Burger> allBurgers() {
        return burgerRepo.findAll();
    }

    public Burger addBurger(Burger burger) {
        return  burgerRepo.save(burger);    }
}
