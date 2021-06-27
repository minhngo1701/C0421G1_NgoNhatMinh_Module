package _15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a: ");
            int a = sc.nextInt();
            System.out.println("Nhập cạnh b: ");
            int b = sc.nextInt();
            System.out.println("Nhập cạnh c: ");
            int c = sc.nextInt();
            Triangle triangle = new Triangle(a,b,c);
            if (triangle.getA() < 0 || triangle.getB() < 0 || triangle.getC() < 0) {
                throw new IllegalTriangleException("Cạnh tam giác không thể là số âm");
            }else if ((triangle.getA() + triangle.getB()) <= triangle.getC() || (triangle.getA() + triangle.getC()) <= triangle.getB() || (triangle.getB() + triangle.getC()) <= triangle.getA()) {
                throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
            } else {
                System.out.println("a, b, c là 3 cạnh của tam giác");
            }
        } catch (IllegalTriangleException e) {
            System.err.println(e);
        }
    }

}
