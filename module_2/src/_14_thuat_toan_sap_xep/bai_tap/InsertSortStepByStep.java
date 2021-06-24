package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertSortStepByStep {
    public static void insertSortStepByStep(int[] list) {
        boolean check = false;
        while (check == false) {
            boolean test = true;
            for (int i = 1; i < list.length; i++) {
                int index = i;
                int temp = list[i];
                while (index > 0 && temp < list[index - 1]) {
                    list[index] = list[index - 1];
                    index--;
                    check = true;
                }
                list[index] = temp;
                test = check;
            }

            if (test == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            } else {
                System.out.println("List after insert sort: ");
                for (int i = 0; i < list.length; i++) {
                    System.out.print(list[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array:");
        int size = sc.nextInt();

        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter list[" + i + "]: ");
            list[i] = sc.nextInt();
        }

        System.out.println("Display list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        insertSortStepByStep(list);
    }
}
