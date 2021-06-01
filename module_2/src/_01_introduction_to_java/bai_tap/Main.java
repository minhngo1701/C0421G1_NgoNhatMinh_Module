package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate, usd;
        System.out.println("Nhập số USD:");
        usd = sc.nextInt();
        rate = usd * 23000;
        System.out.println("Giá quy đổi = " + rate + " VND");
    }
}
