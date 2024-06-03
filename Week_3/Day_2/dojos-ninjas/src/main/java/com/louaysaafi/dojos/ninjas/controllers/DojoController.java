package com.louaysaafi.dojos.ninjas.controllers;

import com.louaysaafi.dojos.ninjas.models.Dojo;
import com.louaysaafi.dojos.ninjas.services.DojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoController {

    @Autowired
    private DojoService dojoService;

    @GetMapping("/dojos/new")
    public String newDojo() {
        return "newDojo.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@RequestParam("name") String name) {
        Dojo dojo = new Dojo();
        dojo.setName(name);
        dojoService.createDojo(dojo);
        return "redirect:/dojos";
    }

    @GetMapping("/dojos")
    public String allDojos(Model model) {
        model.addAttribute("dojos", dojoService.allDojos());
        return "dojos.jsp";
    }

    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojo(id);
        model.addAttribute("dojo", dojo);
        model.addAttribute("ninjas", dojo.getNinjas());
        return "showDojo.jsp";
    }
}
