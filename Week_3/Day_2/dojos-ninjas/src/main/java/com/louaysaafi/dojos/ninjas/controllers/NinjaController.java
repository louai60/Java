package com.louaysaafi.dojos.ninjas.controllers;

import com.louaysaafi.dojos.ninjas.models.Ninja;
import com.louaysaafi.dojos.ninjas.services.DojoService;
import com.louaysaafi.dojos.ninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @Autowired
    private DojoService dojoService;

    @GetMapping("/ninjas/new")
    public String newNinja(Model model) {
        model.addAttribute("dojos", dojoService.allDojos());
        return "newNinja.jsp";
    }

    @PostMapping("/ninjas")
    public String createNinja(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("dojo") Long dojoId) {

        Ninja ninja = new Ninja();
        ninja.setFirstName(firstName);
        ninja.setLastName(lastName);
        ninja.setDojo(dojoService.findDojo(dojoId));
        ninjaService.createNinja(ninja);
        return "redirect:/ninjas";
    }

    @GetMapping("/ninjas")
    public String allNinjas(Model model) {
        model.addAttribute("ninjas", ninjaService.allNinjas());
        return "ninjas.jsp";
    }
}

