package _case_study.controller;

import _case_study.services.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    private static int choiceNumber() {
        boolean checkValid = false;
        int choice = 0;
        while (!checkValid) {
            try {
                choice = Integer.parseInt(input().nextLine());
                checkValid = true;
            } catch (NumberFormatException e) {
                System.out.print("You must enter a number: ");
            }
        }
        return choice;
    }
    public void displayFacilityMenu() {
        while (true) {
            System.out.println("-----Facility Menu-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice");
            switch (choiceNumber()) {
                case 1:
                    new FacilityServiceImpl().display();
                    break;
                case 2:
                    while (true) {
                        System.out.println("1. Add new Villa");
                        System.out.println("2. Add new House");
                        System.out.println("3. Add new Room");
                        System.out.println("4. Back to menu");
                        int input = input().nextInt();
                        switch (input){
                            case 1:
                                new FacilityServiceImpl().addNewVilla();
                                break;
                            case 2:
                                new FacilityServiceImpl().addNewHouse();
                                break;
                            case 3:
                                new FacilityServiceImpl().addNewRoom();
                                break;
                            case 4:
                                new FacilityManagement().displayFacilityMenu();
                                break;
                            default:
                                System.out.println("please re-enter:");
                        }
                    }
                case 3:
                    break;
                case 4:
                    new FuramaController().displayMainMenu();
                    break;
                default:
                    System.out.println("Please re-enter:");
            }

        }
    }
}
