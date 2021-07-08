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
        int voucher50 = 1;
        int voucher20 = 1;
        int voucher10 = 2;
        for (Booking booking : bookings) {
            for (Customer customer : new CustomerServiceImpl().getAll()) {
                if (booking.getCustomerID() == customer.getId()) {
                    stackCustomer.push(customer);
                }
            }
        }

                boolean check = true;
                for (int i = 1; i <= voucher10; i++) {
                    try {
                        System.out.println(stackCustomer.pop() + " get voucher 10%");
                    }catch (EmptyStackException e) {
                        System.out.println("List is empty");
                    }
                }
                for (int j = 1; j <= voucher20; j++) {
                    try {
                        System.out.println(stackCustomer.pop() + " get voucher 20%");
                    }catch (EmptyStackException e) {
                        System.out.println("List is empty");
                    }
                }
                for (int k = 1; k <= voucher50; k++) {
                    try {
                        System.out.println(stackCustomer.pop() + " get voucher 50%");
                    }catch (EmptyStackException e) {
                        System.out.println("List is empty");
                    }
                }

    }
}
