package bai1.checkbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class SandwichCondimentController {
    @GetMapping(value = "")
    public String showList(){
        return "list";
    }

    @GetMapping(value = "/save")
    public ModelAndView checkSandwichCondiment(@RequestParam ("condiment") String[] condiments) {
        String result = Arrays.toString(condiments);
        return new ModelAndView("display", "sandwichCondiments", result);
    }
}
