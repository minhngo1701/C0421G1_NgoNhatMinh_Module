package _02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int month = sc.nextInt();
        System.out.println("Enter money:");
        double money = sc.nextDouble();
        System.out.println("Enter interest rate:");
        double interestRate = sc.nextDouble();
        double total = 0;
        for (int i = 1; i <= month; i++) {
            total += money * (interestRate/100 )/ 12 * month;
        }
        System.out.println("Tổng tiền lãi = " + total);
    }
}
