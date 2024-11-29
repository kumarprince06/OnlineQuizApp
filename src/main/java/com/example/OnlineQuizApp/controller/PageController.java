package com.example.OnlineQuizApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller responsible for handling requests to various pages of the application.
 */
@Controller
public class PageController {

    /**
     * Handles the request for the home page.
     *
     * @param model the model to add attributes.
     * @return the view name of the home page.
     */
    @GetMapping({"", "/home"})
    public String home(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }

    /**
     * Handles the request for the quiz page.
     *
     * @param model the model to add attributes.
     * @return the view name of the contact page.
     */
    @GetMapping("/quiz")
    public String quiz(Model model) {
        model.addAttribute("title", "Quiz");
        return "quiz";
    }

    /**
     * Handles the request for the about page.
     *
     * @param model the model to add attributes.
     * @return the view name of the about page.
     */
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }

    /**
     * Handles the request for the contact page.
     *
     * @param model the model to add attributes.
     * @return the view name of the contact page.
     */
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact");
        return "contact";
    }

    /**
     * Handles the request for the leaderboard page.
     *
     * @param model the model to add attributes.
     * @return the view name of the leaderboard page.
     */
    @GetMapping("/leaderboard")
    public String leaderboard(Model model) {
        model.addAttribute("title", "Leaderboard");
        return "leaderboard";
    }

    /**
     * Handles the request for the login page.
     *
     * @param model the model to add attributes.
     * @return the view name of the login page.
     */
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login");
        return "auth/login";
    }

    /**
     * Handles the request for the register page.
     *
     * @param model the model to add attributes.
     * @return the view name of the register page.
     */
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Register");
        return "auth/register";
    }
}
