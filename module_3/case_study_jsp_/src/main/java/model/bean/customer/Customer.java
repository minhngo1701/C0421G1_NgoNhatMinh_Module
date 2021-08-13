package model.bean.customer;

import java.util.BitSet;

public class Customer {
    private int customerId;
    private int typeOfCustomerId;
    private String customerName;
    private String dateOfBirth;
    private boolean gender;
    private String cardId;
    private String phoneCus;
    private String emailCus;
    private String addressCus;
    private String customerCode;
    public Customer() {
    }

    public Customer(int id, int typeOfCustomerId, String name, String dateOfBirth, boolean gender, String cardId, String phone, String email, String address, String customerCode) {
        this.customerId = id;
        this.typeOfCustomerId = typeOfCustomerId;
        this.customerName = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cardId = cardId;
        this.phoneCus = phone;
        this.emailCus = email;
        this.addressCus = address;
        this.customerCode = customerCode;
    }

    public Customer(int typeOfCustomerId, String name, String dateOfBirth, Boolean gender, String cardId, String phone, String email, String address, String customerCode) {
        this.typeOfCustomerId = typeOfCustomerId;
        this.customerName = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cardId = cardId;
        this.phoneCus = phone;
        this.emailCus = email;
        this.addressCus = address;
        this.customerCode = customerCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public boolean isGender() {
        return gender;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTypeOfCustomerId() {
        return typeOfCustomerId;
    }

    public void setTypeOfCustomerId(int typeOfCustomerId) {
        this.typeOfCustomerId = typeOfCustomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getPhoneCus() {
        return phoneCus;
    }

    public void setPhoneCus(String phoneCus) {
        this.phoneCus = phoneCus;
    }

    public String getEmailCus() {
        return emailCus;
    }

    public void setEmailCus(String emailCus) {
        this.emailCus = emailCus;
    }

    public String getAddressCus() {
        return addressCus;
    }

    public void setAddressCus(String addressCus) {
        this.addressCus = addressCus;
    }
}
