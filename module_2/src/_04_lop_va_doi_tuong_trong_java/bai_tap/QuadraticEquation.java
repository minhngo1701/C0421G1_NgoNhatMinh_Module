package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }
    public double getRoot1() {
        double x1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return x1;
    }
    public double getRoot2() {
        double x2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return x2;
    }
    public double getRoot3() {
        double x = -b / (2 * a);
        return x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm phân biệt: " + "x1 = " + quadraticEquation.getRoot1() + " và x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: " + "x = " + quadraticEquation.getRoot3());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
