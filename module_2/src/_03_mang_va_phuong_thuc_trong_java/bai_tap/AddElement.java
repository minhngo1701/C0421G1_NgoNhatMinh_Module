package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter number element:");
            size = sc.nextInt();
            if (size >= 10) {
                System.out.println("Size not exceed 10");
            }
        } while (size >= 10);
        int array[] = new int[10];
        for (int i = 0; i < size; i++){
            System.out.print("Element array[" + i + "]:");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter value want to add:");
        int number = sc.nextInt();
        System.out.println("Enter index need add");
        int index = sc.nextInt();
        for (int i = size-1; i >= index; i--) {
            array[i+1] = array[i];
            if (i == index) {
                array[i] = number;
            }
        }
        for (int element:array) {
            System.out.print(element + " ");
        }
    }
}
