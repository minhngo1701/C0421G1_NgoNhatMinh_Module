package _case_study.services;

import _case_study.libs.BookingComparator;
import _case_study.models.Booking;
import _case_study.models.Customer;
import _case_study.models.Facility;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    private static Set<Booking> bookings = new TreeSet<>(new BookingComparator());

    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    static {
        bookings.add(new Booking("ndfjhn","10/7/2021","20/7/2021",4,"Villa","ngày"));
        bookings.add(new Booking("ndfjhn","5/7/2021","6/9/2021",4,"House","tháng"));
        bookings.add(new Booking("ndfjhn","8/7/2021","13/7/2021",4,"House","ngày"));
        bookings.add(new Booking("ndfjhn","1/7/2021","4/7/2021",4,"Room","ngày"));
    }
    @Override
    public void add() {
        System.out.println("Display list customer:");
        new CustomerServiceImpl().display();
        System.out.println("Display list Facility");
        new FacilityServiceImpl().display();
        System.out.println("Enter your choice id:");
        int choiceID = input().nextInt();
        int idCustomer = 0;
        for (Customer customer : new CustomerServiceImpl().getAll()) {
            if (choiceID == customer.getId()) {
                idCustomer = customer.getId();
            }
        }
        System.out.println("Enter service you want:");
        String service = input().nextLine();
        Map<Facility, Integer> facility1 = new FacilityServiceImpl().getAll();
        String nameService = null;
        for (Facility facility : facility1.keySet()) {
            if (service.equals(facility.getNameService())) {
                nameService = facility.getNameService();
            }
        }
        System.out.println("Enter id booking:");
        String idBooking = input().nextLine();
        System.out.println("Enter date start:");
        String dateStart = input().nextLine();
        System.out.println("Enter date end: ");
        String dateEnd = input().nextLine();
        System.out.println("Enter type of service:");
        String typeService = input().nextLine();
        bookings.add(new Booking(idBooking, dateStart, dateEnd, idCustomer, nameService, typeService));



}

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}
