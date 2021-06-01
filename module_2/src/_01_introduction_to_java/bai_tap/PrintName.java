package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
