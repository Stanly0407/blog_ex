package com.ex.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage( Model model) {
        model.addAttribute("title", "Главня страница");
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage( Model model) {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }


}


