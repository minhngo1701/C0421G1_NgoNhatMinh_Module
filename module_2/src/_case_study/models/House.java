package _case_study.models;

public class House extends Facility {
    private String standardHouse;
    private int floor;

    public House() {
    }

    public House(String nameService, double area, double rentcost, int numberPerson, String typeRent, String standardHouse, int floor) {
        super(nameService, area, rentcost, numberPerson, typeRent);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getStandardHouse() + "," + getFloor();
    }
}
