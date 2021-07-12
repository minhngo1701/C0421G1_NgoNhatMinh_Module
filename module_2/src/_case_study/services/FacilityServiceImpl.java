package _case_study.services;

import _case_study.libs.Exception;
import _case_study.libs.Regex;
import _case_study.models.Facility;
import _case_study.models.House;
import _case_study.models.Room;
import _case_study.models.Villa;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityServiceImpl extends Exception implements FacilityService {
    private static Map<Facility, Integer> facilityVilla = new LinkedHashMap<>();
    private static Map<Facility, Integer> facilityHouse = new LinkedHashMap<>();
    private static Map<Facility, Integer> facilityRoom = new LinkedHashMap<>();
    private static Map<Facility, Integer> facility = new LinkedHashMap<>();
    private static Regex regex = new Regex();
    private static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    private static final String FILE_PATH_VILLA = "src\\_case_study\\data\\Villa.csv";
    private static final String FILE_PATH_HOUSE = "src\\_case_study\\data\\House.csv";
    private static final String FILE_PATH_ROOM = "src\\_case_study\\data\\Room.csv";






    @Override
    public void add() {
    }

    @Override
    public void delete() {

    }


    @Override
    public void edit() {

    }

    @Override
    public void display() {
        getAllVilla();
        for (Facility key : facilityVilla.keySet()) {
            System.out.println(key + " - " + facilityVilla.get(key));
        }
        getAllHouse();
        for (Facility key : facilityHouse.keySet()) {
            System.out.println(key + " - " + facilityHouse.get(key));
        }
        getAllRoom();
        for (Facility key : facilityRoom.keySet()) {
            System.out.println(key + " - " + facilityRoom.get(key));
        }
    }

    @Override
    public void addNewVilla() {
        facilityVilla = (Map<Facility, Integer>) new ReadAndWriteFile<Facility>().readFile(FILE_PATH_VILLA);
        if (facilityVilla == null) {
            facilityVilla = new LinkedHashMap<>();
        }
        System.out.println("Add new Service:");
        String service = input().nextLine();

        System.out.println("Add new area:");
        double area = choiceDouble();
        System.out.println("Add new cost rent:");
        double rentCost = choiceDouble();

        System.out.println("Add new amount person:");
        int amountPerson = choiceNumber();

        System.out.println("Add new type rent:");
        String typeRent = input().nextLine();

        System.out.println("Add new Standard:");
        String standard = input().nextLine();
        System.out.println("Add new swimming pool area:");
        double poolArea = choiceDouble();

        System.out.println("Add new floor:");
        int floor = choiceNumber();



        facilityVilla.put(new Villa(service, area, rentCost, amountPerson, typeRent, standard, poolArea, floor), 0);
        facility.putAll(facilityVilla);
        new ReadAndWriteFile<Facility>().writeFileByByteStreamUseMap(facilityVilla, FILE_PATH_VILLA);

    }

    @Override
    public void addNewHouse() {
        facilityHouse = (Map<Facility, Integer>) new ReadAndWriteFile<Facility>().readFile(FILE_PATH_HOUSE);
        if (facilityHouse == null) {
            facilityHouse = new LinkedHashMap<>();
        }
        System.out.println("Add new Service:");
        String service = input().nextLine();

        System.out.println("Add new area:");
        double area = input().nextDouble();
        System.out.println("Add new cost rent:");
        double rentCost = choiceDouble();

        System.out.println("Add new amount person:");
        int amountPerson = choiceNumber();

        System.out.println("Add new type rent:");
        String typeRent = input().nextLine();

        System.out.println("Add new Standard:");
        String standard = input().nextLine();
        System.out.println("Add new floor:");
        int floor = choiceNumber();

        facilityHouse.put(new House(service, area, rentCost, amountPerson, typeRent, standard, floor), 0);
        facility.putAll(facilityHouse);
        new ReadAndWriteFile<Facility>().writeFileByByteStreamUseMap(facilityHouse, FILE_PATH_HOUSE);

    }

    @Override
    public void addNewRoom() {
        facilityRoom = (Map<Facility, Integer>) new ReadAndWriteFile<Facility>().readFile(FILE_PATH_ROOM);
        if (facilityRoom == null) {
            facilityRoom = new LinkedHashMap<>();
        }
        System.out.println("Add new Service:");
        String service = input().nextLine();

        System.out.println("Add new area:");
        double area = input().nextDouble();
        System.out.println("Add new cost rent:");
        double rentCost = choiceDouble();

        System.out.println("Add new amount person:");
        int amountPerson = choiceNumber();

        System.out.println("Add new type rent:");
        String typeRent = input().nextLine();
        System.out.println("Add new free service");
        String freeService = input().nextLine();
        facilityRoom.put(new Room(service, area, rentCost, amountPerson, typeRent, freeService), 0);
        facility.putAll(facilityRoom);
        new ReadAndWriteFile<Facility>().writeFileByByteStreamUseMap(facilityRoom, FILE_PATH_ROOM);
    }

    @Override
    public Map<Facility, Integer> getAll() {
        return facility;
    }

    @Override
    public Map<Facility, Integer> getAllVilla() {
        facilityVilla = (Map<Facility, Integer>) new ReadAndWriteFile<Facility>().readFile(FILE_PATH_VILLA);
        return facilityVilla;
    }

    @Override
    public Map<Facility, Integer> getAllHouse() {
        facilityHouse = (Map<Facility, Integer>) new ReadAndWriteFile<Facility>().readFile(FILE_PATH_HOUSE);
        return facilityHouse;
    }

    @Override
    public Map<Facility, Integer> getAllRoom() {
        facilityRoom = (Map<Facility, Integer>) new ReadAndWriteFile<Facility>().readFile(FILE_PATH_ROOM);
        return facilityRoom;
    }

}
