package com.codegym.case_study.dto;

import com.codegym.case_study.model.entity.contract.Contract;
import com.codegym.case_study.model.entity.service_entity.RentType;
import com.codegym.case_study.model.entity.service_entity.ServiceType;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;

public class ServiceDto {
    private Long id;
    @Pattern(regexp = "^[a-zA-Z0-9 ]+(([',. -][a-zA-Z0-9 ])?[a-zA-Z0-9]*)*$", message = "Name is wrong! please retry.")
    private String nameService;
    @Min(value = 0, message = "ara must be positive")
    private int area;
    @Min(value = 0, message = "cost must be positive")
    private double cost;
    @Min(value = 0, message = "max must be positive")
    private int maxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    @Min(value = 0, message = "pool must be positive")
    private double poolArea;
    @Min(value = 0, message = "number must be positive")
    private int numberOfFloors;
    @Pattern(regexp = "^DV-\\d{4}$", message = "Service code is wrong! Please retry. Ex:DV-xxxx (x is number 0-9)")
    private String serviceCode;
    private ServiceType serviceType;
    private RentType rentType;
    private Set<Contract> contracts;

    public ServiceDto() {
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}

