package _15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = sc.nextInt();
        triangle(a, b, c);
    }

    public static void triangle(int a, int b, int c) {

        try {
            if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (c + b) > a) {
                System.out.println("a,b,c là 3 cạnh của tam giác");
            } else {
                throw new IllegalTriangleException("Cạnh tạm giác không thể là số âm hoặc tổng hai cạnh phải lớn hơn cạnh còn lại.");
            }

        } catch (IllegalTriangleException e) {
            System.err.println(e);
        }

    }


}
