package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductServiceImpl;
import com.codegym.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductService iproductService = new ProductServiceImpl();

    @GetMapping("")
    public String index(Model model) {

        List<Product> productList = iproductService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Product product) {
        product.setId((int) (Math.random() * 10000));
        iproductService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Product product) {
        iproductService.update(product.getId(), product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iproductService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/view";
    }
//    @GetMapping("")
//    public String search(@RequestParam String nameProduct, Model model) {
//        model.addAttribute("product", iproductService.search(nameProduct));
//        return "/index";
//    }
}
