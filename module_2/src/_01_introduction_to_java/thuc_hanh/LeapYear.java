package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm:");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận");
                } else {
                    System.out.println("Năm " + year + " không phải là năm nhuận");
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận");
            }
        } else {
            System.out.println("Năm " + year + " không phải là năm nhuận");
        }
    }
}
