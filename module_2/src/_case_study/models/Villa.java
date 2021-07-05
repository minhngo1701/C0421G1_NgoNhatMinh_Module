package _case_study.models;

public class Villa extends Facility {
    private String Standard;
    private double swimmingPoolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String nameService, double area, double rentcost, int numberPerson, String typeRent, String standard, double swimmingPoolArea, int floor) {
        super(nameService, area, rentcost, numberPerson, typeRent);
        Standard = standard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.floor = floor;
    }

    public String getStandard() {
        return Standard;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getStandard() + "," + getSwimmingPoolArea() + "," + getFloor();
    }
}
