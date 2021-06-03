package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element array[" + i + "]:");
            array[i] = sc.nextInt();
        }
        System.out.print("Element array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        int first = 0;
        int last = array.length -1;
        while (first < last){
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                first++;
                last--;
        }
        System.out.print("Reverse array: ");
        for (int reverse : array) {
            System.out.print(reverse + " ");
        }
    }
}
