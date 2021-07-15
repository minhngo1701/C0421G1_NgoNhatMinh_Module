package _final_exam.lib;

import java.util.Scanner;

public class Check {
    public static Scanner sc = new Scanner(System.in);

    public static int choiceNumber() {
        int choice = 0;
        while (true) {
            String str = sc.nextLine();
            if (str.trim().equals("")) {
                System.out.println("Please re-enter:");
                continue;
            }
            try {
                choice = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("You must enter number:");
                continue;
            }
            return choice;
        }
    }
    public static double choiceDouble() {
        double choice = 0.0f;
        while (true) {
            String str = sc.nextLine();
            if (str.trim().equals("")) {
                System.out.println("Please re-enter:");
                continue;
            }
            try {
                choice = Double.parseDouble(str);
            } catch (NumberFormatException e) {
                System.out.println("You must enter number:");
                continue;
            }
            return choice;
        }
    }

}
