package com.codegym.rent_book.model.service;

import com.codegym.rent_book.exception.Errors;
import com.codegym.rent_book.model.bean.RentBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IRentBookService {
    List<RentBook> findAll();
    RentBook findById(int id);
    void save(RentBook rentBook) throws Errors;
}
