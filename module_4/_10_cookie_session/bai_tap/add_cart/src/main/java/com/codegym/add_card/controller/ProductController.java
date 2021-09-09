package com.codegym.add_card.controller;

import com.codegym.add_card.dto.CartDto;
import com.codegym.add_card.dto.ProductDto;
import com.codegym.add_card.model.bean.Product;
import com.codegym.add_card.model.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public CartDto setupCart() {
        return new CartDto();
    }

    @GetMapping("/shop")
    public String showShop(Model model) {
        Iterable<Product> products = iProductService.findAll();
        model.addAttribute("productList", products);
        return "shop";
    }

    @GetMapping("/add/{id}")
    public String addCart(@PathVariable Long id, @SessionAttribute("cart") CartDto cart ,@RequestParam("action") String action) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "error";
        }
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productOptional.get(), productDto);
        if (action.equals("show")) {
            cart.addProduct(productDto);
            return "redirect:/shopping-cart";
        }
        if (action.equals("sub")) {
            cart.subProduct(productDto);
            return "redirect:/shopping-cart";
        }
        if (action.equals("delete")) {
            cart.removeProduct(productDto);
            return "redirect:/shopping-cart";
        }

        cart.addProduct(productDto);
        return "redirect:/shop";
    }

    @PostMapping("/shop")
    public String payment(@SessionAttribute("cart") CartDto cartDto) {
        cartDto.clearAll();
        return "payment";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable Long id, Model model) {
        Product product = iProductService.findById(id).get();
        model.addAttribute("product", product);
        return "detail";
    }
}
