package bai2.calculator.controller;

import bai2.calculator.model.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @GetMapping(value = "/calculator")
    public String showCalculator() {
        return "display";
    }

    @PostMapping(value = "/calculator")
    public ModelAndView calculator(@RequestParam String number1, String number2, String operator)
    {

        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("resultCalculator", calculatorService.calculatorSimple(operator, number1, number2));
        modelAndView.addObject("nameOperator", operator);
        return modelAndView;
    }

}
