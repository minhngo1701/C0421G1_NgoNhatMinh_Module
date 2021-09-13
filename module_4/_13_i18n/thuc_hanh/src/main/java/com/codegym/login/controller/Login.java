package com.codegym.login.controller;

import com.codegym.login.model.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {
    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/do-login")
    public String doLogin(@ModelAttribute User user, Model model) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456")) {
            model.addAttribute("user", user);
            return "index";
        }
        return "error";
    }
}
