package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array3 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array2.length+j] = array2[j];
        }
        System.out.print("Mảng array3: ");
        for (int element:array3) {
            System.out.print(element + " ");
        }
    }
}
