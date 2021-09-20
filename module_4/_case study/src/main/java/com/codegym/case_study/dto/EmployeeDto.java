package com.codegym.case_study.dto;

import com.codegym.case_study.model.entity.contract.Contract;
import com.codegym.case_study.model.entity.employee.Division;
import com.codegym.case_study.model.entity.employee.EducationDegree;
import com.codegym.case_study.model.entity.employee.Position;
import com.codegym.case_study.model.entity.user.User;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;


public class EmployeeDto {

    private Long id;
    @NotEmpty(message = "Name mustnt empty")
    private String nameEmployee;
    private String dateOfBirth;
    @Pattern(regexp = "^\\d{12}|\\d{9}", message = "ID card not ok! Please retry. Id must have 9 or 12 number")
    private String idCard;
    @Min(value = 0, message = "salary must be positive")
    private double salary;
    @Pattern(regexp = "^[(][84]{2}[)]\\\\+9[0-1]\\d{7}|09[0-1]\\d{7}$", message = "Phone incorrect! please retry. Ex:090xxxxxxx or 091xxxxxxx(x is number 0-9)")
    private String phone;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email is wrong!")
    private String email;
    @NotEmpty(message = "Address mustn't empty")
    private String address;
    private Position position;
    private EducationDegree educationDegree;
    private Division division;
    private Set<Contract> contracts;
    private User user;
    public EmployeeDto() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

