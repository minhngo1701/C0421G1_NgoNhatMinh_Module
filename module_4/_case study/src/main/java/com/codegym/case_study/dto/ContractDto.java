package com.codegym.case_study.dto;

import com.codegym.case_study.model.entity.contract.ContractDetail;
import com.codegym.case_study.model.entity.customer.Customer;
import com.codegym.case_study.model.entity.employee.Employee;
import com.codegym.case_study.model.entity.service_entity.Service;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Set;


public class ContractDto {

    private Long id;
    private String startDate;
    private String endDate;
    @Min(value = 0, message = "Deposit must positive")
    private double deposit;
    private Employee employee;
    private Customer customer;
    private Service service;
    private Set<ContractDetail> contractDetails;

    public ContractDto() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}

