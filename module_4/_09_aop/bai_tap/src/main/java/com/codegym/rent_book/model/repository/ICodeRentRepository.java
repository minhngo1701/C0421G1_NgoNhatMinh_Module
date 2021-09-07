package com.codegym.rent_book.model.repository;

import com.codegym.rent_book.model.bean.CodeRent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICodeRentRepository extends JpaRepository<CodeRent, Integer> {
}
