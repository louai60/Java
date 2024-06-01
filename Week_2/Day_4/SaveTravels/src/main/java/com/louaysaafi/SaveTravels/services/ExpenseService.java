package com.louaysaafi.SaveTravels.services;

import com.louaysaafi.SaveTravels.models.Expense;
import com.louaysaafi.SaveTravels.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository repository;

    public List<Expense> findAll() {
        return repository.findAll();
    }

    public Expense save(Expense expense) {
        return repository.save(expense);
    }

    public Expense findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}