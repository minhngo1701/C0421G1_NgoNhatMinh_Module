package com.codegym.case_study.dto;

import com.codegym.case_study.model.entity.contract.Contract;
import com.codegym.case_study.model.entity.customer.CustomerType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;


public class CustomerDto {

    private Long id;
    @NotEmpty(message = "Name mustnt empty")
    private String nameCustomer;
    private String dateOfBirth;
    private boolean gender;
    @Pattern(regexp = "^\\d{12}|\\d{9}", message = "ID card not ok! Please retry. Id must have 9 or 12 number")
    private String idCard;
    @Pattern(regexp = "^[(][84]{2}[)]\\+9[0-1]\\d{7}|09[0-1]\\d{7}$", message = "Phone incorrect! please retry. Ex:090xxxxxxx or 091xxxxxxx(x is number 0-9)")
    private String phone;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email is wrong! please retry. Ex:abc@gmail.com")
    private String email;
    @NotEmpty(message = "Address mustn't empty")
    private String address;
    @Pattern(regexp = "^KH-\\d{4}$", message = "Customer code is wrong. Ex:KH-xxxx (x is number 0-9)")
    private String customerCode;
    private CustomerType customerType;
    private Set<Contract> contracts;

    public CustomerDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

