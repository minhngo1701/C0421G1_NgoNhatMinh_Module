package com.codegym.rent_book.model.service;

import com.codegym.rent_book.exception.MultiException;
import com.codegym.rent_book.model.bean.RentBook;

import java.util.List;

public interface IRentBookService {
    List<RentBook> findAll();
    RentBook findById(int id);
    void save(RentBook rentBook) throws MultiException;
}
