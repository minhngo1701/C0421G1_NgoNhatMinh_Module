package com.codegym.count_view.controller;

import com.codegym.count_view.model.bean.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter setupCounter() {
        return new Counter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute Counter counter) {
        counter.increment();
        return "view";
    }
}
