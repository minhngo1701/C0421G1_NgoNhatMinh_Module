package com.codegym.rent_book.controller;

import com.codegym.rent_book.exception.Errors;
import com.codegym.rent_book.model.bean.CodeRent;
import com.codegym.rent_book.model.bean.RentBook;
import com.codegym.rent_book.model.service.ICodeRentService;
import com.codegym.rent_book.model.service.IRentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/book")
public class RentBookController {
    @Autowired
    private IRentBookService iRentBookService;
    @Autowired
    private ICodeRentService iCodeRentService;
    @GetMapping("/list")
    public String showListRentBook(Model model) {
        List<RentBook> rentBooks = iRentBookService.findAll();
        model.addAttribute("rentBookList", rentBooks);
        return "list";
    }

    @GetMapping("/rent/{id}")
    public String showRentBook(@PathVariable int id, Model model) {
        model.addAttribute("rentBook", iRentBookService.findById(id));
        return "rent";
    }

    @PostMapping("/rent")
    public String createRentBook(@ModelAttribute RentBook rentBook, RedirectAttributes redirectAttributes) throws Errors {
        int rentCode = (int) ((Math.random()*89999) + 10000);
        rentBook.setAmountOfRent(rentBook.getAmountOfRent()-1);
        if (rentBook.getAmountOfRent() < 0) {
            throw new Errors();
        }
        iRentBookService.save(rentBook);
        iCodeRentService.save(new CodeRent(rentCode, rentBook));
        redirectAttributes.addFlashAttribute("codeRents", rentCode);
        return "redirect:/book/list";
    }

    @PostMapping("/return")
    public String giveBackBook(@RequestParam String code) throws Errors {

        CodeRent codeRent = iCodeRentService.findById(Integer.parseInt(code));
        if (codeRent == null) {
            throw new Errors();
        }
        RentBook rentBook = codeRent.getRentBook();
        rentBook.setAmountOfRent(rentBook.getAmountOfRent()+1);
        iRentBookService.save(rentBook);
        iCodeRentService.remove(codeRent);
        return "redirect:/book/list";
    }

    @ExceptionHandler(Errors.class)
    public String showError() {
        return "error";
    }
}
