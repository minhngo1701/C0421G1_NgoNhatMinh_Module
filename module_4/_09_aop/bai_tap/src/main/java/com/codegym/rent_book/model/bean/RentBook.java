package com.codegym.rent_book.model.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameBook;
    private int amountOfRent;

    @OneToMany(mappedBy = "rentBook")
    private Set<CodeRent> codeRents;
    public RentBook() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getAmountOfRent() {
        return amountOfRent;
    }

    public void setAmountOfRent(int amountOfRent) {
        this.amountOfRent = amountOfRent;
    }
}
