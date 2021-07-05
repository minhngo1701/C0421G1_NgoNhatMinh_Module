package _case_study.services;

import _case_study.controller.FacilityManagement;
import _case_study.controller.FuramaController;
import _case_study.models.Facility;
import _case_study.models.House;
import _case_study.models.Room;
import _case_study.models.Villa;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> list = new LinkedHashMap<>();
    private static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    private static final String FILE_PATH_VILLA = "src\\_case_study\\data\\Villa.csv";
    private static final String FILE_PATH_HOUSE = "src\\_case_study\\data\\House.csv";
    private static final String FILE_PATH_ROOM = "src\\_case_study\\data\\Room.csv";
    private static List<Facility> newList = new ArrayList<>();
    static {
        list.put(new Villa("villa", 300, 1000000,6,"tháng","TCVN", 20, 4), 1);
        list.put(new House("house", 240, 1000000,3,"tháng","TCVN", 2), 2);
        list.put(new Room("room", 100, 200000,4,"ngày","Lái xe"), 1);

    }

    @Override
    public void add() {

        while (true) {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");
            int choice = input().nextInt();
            switch (choice){
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    new FacilityManagement().displayFacilityMenu();
                    break;
                default:
                    System.out.println("please re-enter:");
            }
        }
    }

    @Override
    public void delete() {

    }


    @Override
    public void edit() {

    }

    @Override
    public void display() {
        for (Facility key : list.keySet()) {
            System.out.println(key + " - " + list.get(key));
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Add new Service:");
        String service = input().nextLine();
        System.out.println("Add new area:");
        double area = input().nextDouble();
        System.out.println("Add new cost rent:");
        double rentCost = input().nextDouble();
        System.out.println("Add new amount person:");
        int amountPerson = input().nextInt();
        System.out.println("Add new type rent:");
        String typeRent = input().nextLine();
        System.out.println("Add new Standard:");
        String standard = input().nextLine();
        System.out.println("Add new swimming pool area:");
        double poolArea = input().nextDouble();
        System.out.println("Add new floor:");
        int floor = input().nextInt();

        list.put(new Villa(service, area,rentCost,amountPerson,typeRent,standard,poolArea,floor), 0);


    }

    @Override
    public void addNewHouse() {
        System.out.println("Add new Service:");
        String service = input().nextLine();
        System.out.println("Add new area:");
        double area = input().nextDouble();
        System.out.println("Add new cost rent:");
        double rentCost = input().nextDouble();
        System.out.println("Add new amount person:");
        int amountPerson = input().nextInt();
        System.out.println("Add new type rent:");
        String typeRent = input().nextLine();
        System.out.println("Add new Standard:");
        String standard = input().nextLine();
        System.out.println("Add new floor:");
        int floor = input().nextInt();
        list.put(new House(service,area,rentCost,amountPerson,typeRent,standard,floor), 0);


    }

    @Override
    public void addNewRoom() {
        System.out.println("Add new Service:");
        String service = input().nextLine();
        System.out.println("Add new area:");
        double area = input().nextDouble();
        System.out.println("Add new cost rent:");
        double rentCost = input().nextDouble();
        System.out.println("Add new amount person:");
        int amountPerson = input().nextInt();
        System.out.println("Add new type rent:");
        String typeRent = input().nextLine();
        System.out.println("Add new free service");
        String freeService = input().nextLine();
        list.put(new Room(service,area,rentCost,amountPerson,typeRent,freeService), 0);
       
    }
}
