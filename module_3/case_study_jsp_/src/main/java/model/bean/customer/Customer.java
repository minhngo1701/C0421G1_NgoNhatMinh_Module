package model.bean.customer;

import java.util.Date;

public class Customer {
    private int id;
    private String typeOfCustomerId;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String cardId;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, String typeOfCustomerId, String name, String dateOfBirth, String gender, String cardId, String phone, String email, String address) {
        this.id = id;
        this.typeOfCustomerId = typeOfCustomerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cardId = cardId;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfCustomerId() {
        return typeOfCustomerId;
    }

    public void setTypeOfCustomerId(String typeOfCustomerId) {
        this.typeOfCustomerId = typeOfCustomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
