package _case_study.controller;

import _case_study.services.*;

import java.util.Scanner;

public class FuramaController {
    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    public void displayMainMenu() {
        while (true) {
            System.out.println("-----Main Menu-----");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int choice = input().nextInt();
            switch (choice) {
                case 1:
                    new EmployeeManagement().displayEmployeesMenu();
                    break;
                case 2:
                    new CustomerManagement().displayCustomerMenu();
                    break;
                case 3:
                    new FacilityManagement().displayFacilityMenu();
                    break;
                case 4:
                    new BookingManagement().displayBookingMenu();
                    break;
                case 5:
                    new PromotionManagement().displayPromotionMenu();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
