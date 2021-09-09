package com.codegym.add_card.controller;

import com.codegym.add_card.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CartController {


    @GetMapping("/shopping-cart")
    public String showCart(@SessionAttribute("cart") CartDto cartDto, Model model) {
        model.addAttribute("cart", cartDto);
        return "cart";
    }
}
