package _case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    public void displayFacilityMenu() {
        while (true) {
            System.out.println("-----Facility Menu-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
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
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
