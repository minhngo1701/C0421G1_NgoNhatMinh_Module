package com.codegym.controller;

import com.codegym.model.bean.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {

    @GetMapping()
    public String showUpdateMail(Model model) {
        List<String> languegeList = new ArrayList<>();
        languegeList.add("English");
        languegeList.add("Vietnamese");
        languegeList.add("Japanese");
        languegeList.add("Chinese");
        List<Integer> sizeList = new ArrayList<>();
        sizeList.add(5);
        sizeList.add(10);
        sizeList.add(15);
        sizeList.add(25);
        sizeList.add(50);
        sizeList.add(100);
        Mail mail = new Mail();
        model.addAttribute("mail", mail);
        model.addAttribute("languageList", languegeList);
        model.addAttribute("sizeList", sizeList);
        return "update";
    }
    @PostMapping("/update")
    public String updateMail(@ModelAttribute Mail mail, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Edit success");
        return "redirect:/update";
    }
}
