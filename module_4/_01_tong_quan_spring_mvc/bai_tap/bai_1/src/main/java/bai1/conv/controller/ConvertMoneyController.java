package bai1.conv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertMoneyController {
    @PostMapping(value = "/convert")
    public ModelAndView convert(@RequestParam String usd) {
        double result = Double.parseDouble(usd) * 23000;
        return new ModelAndView("convert", "convertUSD", result);
    }

    @GetMapping(value = "/convert")
    public String showConvert() {
        return "convert";
    }

}
