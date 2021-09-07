package com.codegym.rent_book.model.service;

import com.codegym.rent_book.model.bean.CodeRent;

public interface ICodeRentService {
    void save(CodeRent codeRent);
    CodeRent findById(int id);
    void remove(CodeRent codeRent);
}
