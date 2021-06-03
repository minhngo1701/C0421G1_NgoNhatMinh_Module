package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = {"A","B","C","D","E","F"};
        System.out.println("Enter input");
        String input = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (input.equals(array[i])) {
                System.out.println(input + " vị trí thứ " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + input + " in list");
        }
    }
}
