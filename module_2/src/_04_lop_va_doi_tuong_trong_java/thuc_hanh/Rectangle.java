package _04_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width:");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Area is: " + rectangle.getPerimeter());
        System.out.println("Area is: " + rectangle.toString());
    }
}
