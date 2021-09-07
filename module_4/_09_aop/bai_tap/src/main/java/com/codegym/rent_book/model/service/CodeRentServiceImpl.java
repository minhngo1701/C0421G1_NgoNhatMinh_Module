package com.codegym.rent_book.model.service;

import com.codegym.rent_book.model.bean.CodeRent;
import com.codegym.rent_book.model.repository.ICodeRentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeRentServiceImpl implements ICodeRentService {
    @Autowired
    private ICodeRentRepository iCodeRentRepository;

    @Override
    public void save(CodeRent codeRent) {
        iCodeRentRepository.save(codeRent);
    }

    @Override
    public CodeRent findById(int id) {
        return iCodeRentRepository.findById(id).get();
    }

    @Override
    public void remove(CodeRent codeRent) {
        iCodeRentRepository.delete(codeRent);
    }
}
