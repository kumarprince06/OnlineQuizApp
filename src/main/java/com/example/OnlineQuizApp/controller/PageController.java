package com.example.OnlineQuizApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/online-quiz")
public class PageController {

    @RequestMapping("/home")
    public String index(){
       return "index";
    }
}
