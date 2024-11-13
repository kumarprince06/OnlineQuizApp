package com.example.OnlineQuizApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login");
        return "auth/login";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Register");
        return "auth/register";
    }

}
