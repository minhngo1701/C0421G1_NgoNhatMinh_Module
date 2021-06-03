package _02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int s = 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                s += 1;
            }
        }
        if (s == 2) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " not prime number");
        }

    }
}

