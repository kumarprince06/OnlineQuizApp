package com.example.OnlineQuizApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }

    @RequestMapping("/home")
    public String index(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }
    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }
    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact");
        return "contact";
    }
    @RequestMapping("/leaderboard")
    public String leaderboard(Model model) {
        model.addAttribute("title", "Leaderboard");
        return "leaderboard";
    }
}
