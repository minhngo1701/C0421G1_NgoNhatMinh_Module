package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MinElenmentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array[" + i + "]:");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
