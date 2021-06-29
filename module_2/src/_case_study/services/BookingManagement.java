package _case_study.services;

import _case_study.controller.FuramaController;

import java.util.Scanner;

public class BookingManagement {

        public static Scanner input() {
            Scanner sc = new Scanner(System.in);
            return sc;
        }
     public void displayBookingMenu() {
         while (true) {
             System.out.println("-----Booking Menu-----");
             System.out.println("1. Display list booking");
             System.out.println("2. Add new booking");
             System.out.println("3. Create new contracts");
             System.out.println("4. Display list contracts");
             System.out.println("5. Edit contracts");
             System.out.println("6. Return main menu");
             System.out.println("Enter your choice");
             int choice = input().nextInt();
             switch (choice) {
                 case 1:
                     break;
                 case 2:
                     break;
                 case 3:
                     break;
                 case 4:
                     break;
                 case 5:
                     break;
                 case 6:
                     new FuramaController().displayMainMenu();
                     break;
                 default:
                     System.out.println("Please re-enter:");
             }
         }
     }
}
