package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter number element:");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Size not exceed 10");
            }
        } while (size > 10);
        int[] array = new int[10];
        for (int i = 0; i < size; i++) {
            System.out.println("Element array[" + i + "]:");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter number need delete:");
        int number = sc.nextInt();

        int index = 0;
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (number == array[i]) {
               index = i;
               check = true;
            }
        }
        if (check) {
            for (int j = index; j < size-1; j++) {
                array[j] = array[j+1];
            }
            array[size-1] = 0;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
