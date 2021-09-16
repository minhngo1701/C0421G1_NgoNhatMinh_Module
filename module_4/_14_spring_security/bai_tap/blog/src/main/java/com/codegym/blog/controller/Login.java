package com.codegym.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
    @GetMapping("/login")
    public String getLoginPage(){
        return "/blog/login";
    }
    @GetMapping("/home")
    public String getHomePage() {
        return "/blog/home";
    }
}
