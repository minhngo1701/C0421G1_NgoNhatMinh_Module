package com.codegym.rent_book.model.repository;

import com.codegym.rent_book.model.bean.RentBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentBookRepository extends JpaRepository<RentBook, Integer> {
}
