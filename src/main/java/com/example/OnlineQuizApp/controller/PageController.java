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

    @RequestMapping("/leaderboard")
    public String leaderboard(Model model) {
        model.addAttribute("title", "Leaderboard");
        return "leaderboard";
    }
}
