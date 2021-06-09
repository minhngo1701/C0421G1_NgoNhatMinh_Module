package _06_ke_thua.bai_tap;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-this.side1)*(getPerimeter()/2-this.side2)*(getPerimeter()/2-this.side3));
    }

    public String toString() {
        return "Triangle{" + "cạnh 1: " + getSide1() + ", cạnh 2: " + getSide2() + ", cạnh 3: " + getSide3() + "}, " + super.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color:");
        String color = sc.nextLine();
        System.out.println("Enter side1:");
        double side1 = sc.nextDouble();
        System.out.println("Enter side2:");
        double side2 = sc.nextDouble();
        System.out.println("Enter side3:");
        double side3 = sc.nextDouble();

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(color, false, side1, side2, side3);
        System.out.println(triangle);
        System.out.println("Perimeter is: " + triangle.getPerimeter());
        System.out.println("Area is: " + triangle.getArea());
    }
}
