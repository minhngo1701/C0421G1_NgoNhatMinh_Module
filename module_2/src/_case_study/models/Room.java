package _case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double area, double rentcost, int numberPerson, String typeRent, String freeService) {
        super(nameService, area, rentcost, numberPerson, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getFreeService();
    }
}
