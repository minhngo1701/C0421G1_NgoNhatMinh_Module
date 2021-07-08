package _case_study.services;

import _case_study.models.Booking;
import _case_study.models.Customer;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class PromotionServiceImpl implements Service {
    private static Stack<String> voucher = new Stack();
    private static final String FILE_PATH = "src\\_case_study\\data\\Booking.csv";
    private static Set<Booking> bookings = new TreeSet<>();
    private static Scanner sc = new Scanner(System.in);
    @Override
    public void add() {
        voucher.add("50%");
        voucher.add("20%");
        voucher.add("10%");
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
        System.out.println("Enter year");
        int year = sc.nextInt();
        for (Booking booking : bookings) {
            System.out.println(booking + " year:" + year);
        }
    }
}
