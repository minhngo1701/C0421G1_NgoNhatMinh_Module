package _case_study.models;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String nameService;
    private double area;
    private double rentcost;
    private int numberPerson;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, double area, double rentcost, int numberPerson, String typeRent) {
        this.nameService = nameService;
        this.area = area;
        this.rentcost = rentcost;
        this.numberPerson = numberPerson;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentcost() {
        return rentcost;
    }

    public void setRentcost(double rentcost) {
        this.rentcost = rentcost;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return nameService +
                "," + area +
                "," + rentcost +
                "," + numberPerson +
                "," + typeRent;
    }
}
