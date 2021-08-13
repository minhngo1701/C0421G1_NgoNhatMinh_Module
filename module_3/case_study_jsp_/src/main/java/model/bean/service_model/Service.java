package model.bean.service_model;

public class Service {
    private int serviceId;
    private String serviceName;
    private double area;
    private int floor;
    private int amountPersonMax;
    private double rentCost;
    private String standardRoom;
    private String description;
    private int typeOfRentId;
    private int typeOfServiceId;
    private String status;

    public Service() {
    }

    public Service(int serviceId, String serviceName, double area, int floor, int amountPersonMax, double rentCost, String standardRoom, String description, int typeOfRentId, int typeOfServiceId, String status) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.floor = floor;
        this.amountPersonMax = amountPersonMax;
        this.rentCost = rentCost;
        this.standardRoom = standardRoom;
        this.description = description;
        this.typeOfRentId = typeOfRentId;
        this.typeOfServiceId = typeOfServiceId;
        this.status = status;
    }

    public Service(String serviceName, double area, int floor, int amountPersonMax, double rentCost, String standardRoom, String description, int typeOfRentId, int typeOfServiceId, String status) {
        this.serviceName = serviceName;
        this.area = area;
        this.floor = floor;
        this.amountPersonMax = amountPersonMax;
        this.rentCost = rentCost;
        this.standardRoom = standardRoom;
        this.description = description;
        this.typeOfRentId = typeOfRentId;
        this.typeOfServiceId = typeOfServiceId;
        this.status = status;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getAmountPersonMax() {
        return amountPersonMax;
    }

    public void setAmountPersonMax(int amountPersonMax) {
        this.amountPersonMax = amountPersonMax;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTypeOfRentId() {
        return typeOfRentId;
    }

    public void setTypeOfRentId(int typeOfRentId) {
        this.typeOfRentId = typeOfRentId;
    }

    public int getTypeOfServiceId() {
        return typeOfServiceId;
    }

    public void setTypeOfServiceId(int typeOfServiceId) {
        this.typeOfServiceId = typeOfServiceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
