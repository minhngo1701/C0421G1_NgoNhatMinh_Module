package com.codegym.blog.controller;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.service.IBlogService;
import com.codegym.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String index(@PageableDefault(value = 3) Pageable pageable, Model model) {
        Page<Blog> blogPage = iBlogService.findAll(pageable);
        model.addAttribute("blogs", blogPage);
        model.addAttribute("category", iCategoryService.findAll());
        return "/blog/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("categoryList", iCategoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "/blog/create";
    }
    @PostMapping("/save")
    public String save(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("categoryList", iCategoryService.findAll());
        model.addAttribute("blog", iBlogService.findById(id));
        return "/blog/edit";
    }
    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/blog/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog) {
        iBlogService.remove(blog.getId());
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
//        model.addAttribute("blogs", iBlogService.findAll());
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/view";
    }
    @GetMapping("/search")
    public String search(@RequestParam String nameBlog, Model model) {
        model.addAttribute("blogList", iBlogService.findAllByNameBlog(nameBlog));
        return "/blog/search";
    }
}
