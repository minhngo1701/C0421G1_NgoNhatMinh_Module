package com.codegym.formuserregister.controller;

import com.codegym.formuserregister.dto.UserDto;
import com.codegym.formuserregister.model.bean.User;
import com.codegym.formuserregister.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping("")
    public String showForm(Model model) {

        model.addAttribute("userDto", new UserDto());
        return "form";
    }

    @PostMapping("/register")
    public String register(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        return "result";
    }
}
