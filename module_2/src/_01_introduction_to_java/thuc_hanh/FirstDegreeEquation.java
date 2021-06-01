package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhập a:");
        a = sc.nextDouble();
        System.out.println("Nhập b:");
        b = sc.nextDouble();
        System.out.println("Nhập c:");
        c = sc.nextDouble();
        if (a == 0 && b == c) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (a == 0 && b != c ) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            double x = (c - b) / a;
            System.out.println("Phương trình có nghiệm là " + x);
        }
    }
}
