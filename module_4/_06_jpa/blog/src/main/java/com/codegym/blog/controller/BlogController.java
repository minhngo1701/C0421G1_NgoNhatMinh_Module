package com.codegym.blog.controller;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("")
    public String index(Model model) {

        List<Blog> productList = iBlogService.findAll();
        model.addAttribute("blogs", productList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        iBlogService.remove(blog.getId());
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/view";
    }
//    @GetMapping("/search")
//    public String search(@RequestParam String nameBlog, Model model) {
//        List<Blog> productList = iBlogService.search(nameBlog);
//        model.addAttribute("blogSearch", blogList);
//        return "/search";
//    }
}
