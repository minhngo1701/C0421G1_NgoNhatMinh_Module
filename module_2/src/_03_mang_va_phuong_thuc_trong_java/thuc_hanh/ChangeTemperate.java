package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChangeTemperate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(c));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    double f = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(f));
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * (9 / 5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
