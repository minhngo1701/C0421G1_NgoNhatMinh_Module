package com.codegym.rent_book.model.service;

import com.codegym.rent_book.exception.Errors;
import com.codegym.rent_book.model.bean.RentBook;
import com.codegym.rent_book.model.repository.IRentBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentBookServiceImpl implements IRentBookService {
    @Autowired
    private IRentBookRepository iRentBookRepository;
    @Override
    public List<RentBook> findAll() {
        return iRentBookRepository.findAll();
    }

    @Override
    public RentBook findById(int id) {
        return iRentBookRepository.findById(id).get();
    }


    @Override
    public void save(RentBook rentBook) throws Errors {
        try {
            iRentBookRepository.save(rentBook);
        }catch (Exception e) {
            throw new Errors();
        }
    }
}
