package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        System.out.println("Mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter array1[" + i + "]:");
            array1[i] = sc.nextInt();
            array3[i] = array1[i];
        }
        System.out.println("Mảng 2:");
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Enter array2[" + j + "]:");
            array2[j] = sc.nextInt();
            array3[array2.length+j] = array2[j];
        }
        System.out.print("Mảng array3: ");
        for (int element:array3) {
            System.out.print(element + " ");
        }
    }
}
