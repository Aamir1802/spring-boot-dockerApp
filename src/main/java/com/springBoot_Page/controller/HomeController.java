package com.springBoot_Page.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/spring-boot-docker")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot");
        return "index"; // This returns the index.html view
    }
}

