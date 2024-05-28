package com.louaysaafi.Omikuji.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OmikujiController {

    @GetMapping("/omikuji")
    public String omikujiForm() {
        return "omikuji-form";
    }

    @PostMapping("/omikuji/submit")
    public String processOmikujiForm(HttpServletRequest request, HttpSession session) {
        String question = request.getParameter("question");
        String fortune = generateFortune();
        session.setAttribute("question", question);
        session.setAttribute("fortune", fortune);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune(HttpSession session, Model model) {
        String question = (String) session.getAttribute("question");
        String fortune = (String) session.getAttribute("fortune");
        model.addAttribute("question", question);
        model.addAttribute("fortune", fortune);
        return "omikuji-show";
    }

    private String generateFortune() {
        // Implement your fortune generation logic here
        return "Your fortune will be good!";
    }
}

