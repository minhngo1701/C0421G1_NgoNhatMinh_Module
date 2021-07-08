package _case_study.controller;

import _case_study.services.PromotionService;

import java.util.Scanner;

public class PromotionManagement {
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
    public void displayPromotionMenu() {
        while (true) {
            System.out.println("-----Promotion Menu-----");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.println("Enter your choice");

            switch (choiceNumber()) {
                case 1:
                    new PromotionService().displayCustomerBooking();
                    break;
                case 2:
                    new PromotionService().displayCustomerVoucher();
                    break;
                case 3:
                    new  FuramaController().displayMainMenu();
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
