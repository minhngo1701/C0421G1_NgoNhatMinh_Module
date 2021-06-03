package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class CountPrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Hai mươi số nguyên tố đầu tiên:");
        int count = 0;
        while (true) {
            int s = 1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    s++;
                }
            }
            if (s == 2) {
                System.out.println(number);
                count++;
            }
            if (count == 20) {
                break;
            }
            number++;
        }
    }
}
