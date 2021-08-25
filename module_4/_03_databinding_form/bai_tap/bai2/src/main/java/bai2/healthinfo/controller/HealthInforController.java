package bai2.healthinfo.controller;

import bai2.healthinfo.model.bean.Health;
import bai2.healthinfo.model.service.IHealthInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HealthInforController {
    @Autowired
    private IHealthInfoService iHealthInfoService;

    @GetMapping("/health")
    public String showForm(Model model){
        model.addAttribute("health",new Health());
        return "index";
    }

    @PostMapping(value = "/health")
    public String heathInfo(@ModelAttribute("health") Health health, RedirectAttributes redirectAttributes){
        iHealthInfoService.save(health);
        redirectAttributes.addFlashAttribute("message","You fill in success.");
        return "redirect:/";
    }
}
