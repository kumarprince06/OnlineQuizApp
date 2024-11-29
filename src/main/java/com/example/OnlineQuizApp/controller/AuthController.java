package com.example.OnlineQuizApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.OnlineQuizApp.model.User;
import com.example.OnlineQuizApp.repository.UserRepository;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Controller to handle authentication-related requests such as login and
 * registration.
 */
@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Handles user registration.
     *
     * @param userForm      the user form object containing user input.
     * @param bindingResult holds the result of validation and binding.
     * @param session       the HTTP session to manage user state.
     * @param model         the model to add attributes for the view.
     * @return the registration page or redirect to another page on success.
     */
    @PostMapping("/register")
    public String register() {

        return "redirect:/auth/login";
    }
}
