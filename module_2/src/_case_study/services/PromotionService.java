package _case_study.services;

import _case_study.models.Booking;
import _case_study.models.Customer;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class PromotionService {
    private static Set<Booking> bookings = new TreeSet<>();
    public static Scanner sc = new Scanner(System.in);
    public static Stack<Customer> stackCustomer = new Stack<Customer>();
    public static List<Customer> customers = new LinkedList<>();

    public static void displayCustomerBooking() {
        bookings = (Set<Booking>) new ReadAndWriteFile<Booking>().readFile("src\\_case_study\\data\\Booking.csv");
        customers = (List<Customer>) new ReadAndWriteFile<Booking>().readFile("src\\_case_study\\data\\Customer.csv");
        for (Booking booking : bookings) {
            for (Customer customer : customers) {
                if (booking.getCustomerID() == customer.getId()) {
                    System.out.println("Enter year customer use service: ");
                    int year = sc.nextInt();
                    System.out.println(customer + "- Năm sử dụng: " + year);
                }
            }
        }
    }

    public void displayCustomerVoucher() {
        bookings = (Set<Booking>) new ReadAndWriteFile<Booking>().readFile("src\\_case_study\\data\\Booking.csv");
        int voucher50 = 2;
        int voucher20 = 3;
        int voucher10 = 4;
        for (Booking booking : bookings) {
            for (Customer customer : new CustomerServiceImpl().getAll()) {
                if (booking.getCustomerID() == customer.getId()) {
                    stackCustomer.push(customer);
                }
            }
        }
        while (!stackCustomer.isEmpty()) {

            for (int i = 0; i < voucher50; i++) {
                System.out.println(stackCustomer.pop() + " get voucher 50%");
            }
            for (int i = 0; i < voucher20; i++) {
                System.out.println(stackCustomer.pop() + " get voucher 20%");
            }
            for (int i = 0; i < voucher10; i++) {
                System.out.println(stackCustomer.pop() + " get voucher 10%");
            }

        }
    }
}
