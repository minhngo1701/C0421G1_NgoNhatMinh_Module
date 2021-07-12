package _case_study.services;

import _case_study.libs.BookingComparator;
import _case_study.libs.Exception;
import _case_study.libs.Regex;
import _case_study.models.*;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl extends Exception implements BookingService {
    private static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
    private static final String FILE_PATH = "src\\_case_study\\data\\Booking.csv";
    private static Regex regex = new Regex();

    @Override
    public void add() {
        bookings = (Set<Booking>) new ReadAndWriteFile<Booking>().readFile(FILE_PATH);
        if (bookings == null) {
            bookings = new TreeSet<>(new BookingComparator());
        }
        System.out.println("Display list customer:");
        new CustomerServiceImpl().display();
        System.out.println("Display list Facility");
        new FacilityServiceImpl().display();
        System.out.println("Enter your choice id:");
        int choiceID = choiceNumber();
        int idCustomer = 0;
        for (Customer customer : new CustomerServiceImpl().getAll()) {
            if (choiceID == customer.getId()) {
                idCustomer = customer.getId();
            }
        }

        Map<Facility, Integer> facility1 = new FacilityServiceImpl().getAll();
        Map<Facility, Integer> facilityVilla = new LinkedHashMap<>();
        Map<Facility, Integer> facilityHouse = new LinkedHashMap<>();
        Map<Facility, Integer> facilityRoom = new LinkedHashMap<>();
        System.out.println("Enter name service:");
        String nameService = regex.regexNameTest();
        for (Facility facility : facility1.keySet()) {
            if (nameService.equals(facility.getNameService())) {
                facility1.put(facility, facility1.get(facility) + 1);
            }
        }
        for (Facility key : facility1.keySet()) {
            if (key instanceof Villa) {
                facilityVilla.put(key,facility1.get(key));
            } else if (key instanceof House) {
                facilityHouse.put(key,facility1.get(key));
            } else if (key instanceof Room) {
                facilityRoom.put(key,facility1.get(key));
            }
        }


        System.out.println("Enter id booking:");
        String idBooking = regex.regexNameTest();
        System.out.println("Enter date start:");
        String dateStart = regex.regexDateMonthTest();

        System.out.println("Enter date end: ");
        String dateEnd = regex.regexDateMonthTest();

        System.out.println("Enter type of service:");
        String typeService = regex.regexNameTest();

        bookings.add(new Booking(idBooking, dateStart, dateEnd, idCustomer, nameService, typeService));

        new ReadAndWriteFile<Booking>().writeFileUseSet(bookings, FILE_PATH);
        new ReadAndWriteFile<Booking>().writeFileByByteStreamUseMap(facilityVilla, "src\\_case_study\\data\\Villa.csv");
        new ReadAndWriteFile<Booking>().writeFileByByteStreamUseMap(facilityHouse, "src\\_case_study\\data\\House.csv");
        new ReadAndWriteFile<Booking>().writeFileByByteStreamUseMap(facilityRoom, "src\\_case_study\\data\\Room.csv");
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        bookings = (Set<Booking>) new ReadAndWriteFile<Booking>().readFile(FILE_PATH);
        if (bookings == null) {
            System.out.println("List is empty");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    @Override
    public Set<Booking> getAll() {
        return bookings;
    }
}
