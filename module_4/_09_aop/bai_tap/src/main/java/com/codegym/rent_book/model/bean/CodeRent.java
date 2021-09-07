package com.codegym.rent_book.model.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CodeRent {
    @Id
    private Integer code;

    public RentBook getRentBook() {
        return rentBook;
    }

    public void setRentBook(RentBook rentBook) {
        this.rentBook = rentBook;
    }

    @ManyToOne(targetEntity = RentBook.class)
    @JoinColumn(name = "code_book", referencedColumnName = "id")
    private RentBook rentBook;
    public CodeRent() {
    }

    public CodeRent(Integer code, RentBook rentBook) {
        this.code = code;
        this.rentBook = rentBook;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
