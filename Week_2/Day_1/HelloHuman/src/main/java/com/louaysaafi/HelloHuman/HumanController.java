package com.louaysaafi.HelloHuman;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @GetMapping("/")
    public String greet(@RequestParam(name = "name") String name) {
        return "Hello " + name + "!";
    }
}
