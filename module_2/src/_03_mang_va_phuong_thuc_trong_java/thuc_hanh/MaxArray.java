package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        do {
            if (size > 20) {
                System.out.println("Size not exceed 20");
            }
        } while (size>20);
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array[" + i + "]:");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max = " + max + " vị trí: " + index);
    }
}
