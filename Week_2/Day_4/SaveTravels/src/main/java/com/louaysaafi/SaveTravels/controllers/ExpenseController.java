package com.louaysaafi.SaveTravels.controllers;

import com.louaysaafi.SaveTravels.models.Expense;
import com.louaysaafi.SaveTravels.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {
    @Autowired
    private ExpenseService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("expenses", service.findAll());
        return "index.jsp";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "add-expense.jsp";
    }

    @PostMapping("/add")
    public String addExpense(@ModelAttribute("expense") Expense expense) {
        service.save(expense);
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String viewExpense(@PathVariable Long id, Model model) {
        model.addAttribute("expense", service.findById(id));
        return "view-expense.jsp";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("expense", service.findById(id));
        return "edit-expense.jsp";
    }

    @PostMapping("/edit/{id}")
    public String updateExpense(@PathVariable Long id, @ModelAttribute("expense") Expense expense) {
        Expense existingExpense = service.findById(id);
        existingExpense.setName(expense.getName());
        existingExpense.setVendor(expense.getVendor());
        existingExpense.setAmount(expense.getAmount());
        existingExpense.setDescription(expense.getDescription());
        service.save(existingExpense);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }


}

