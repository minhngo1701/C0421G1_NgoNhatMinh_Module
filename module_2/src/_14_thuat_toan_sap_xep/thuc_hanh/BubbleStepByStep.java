package _14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Scanner;

public class BubbleStepByStep {
    public static void bubbleStepByStep(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.println("list after the " + k + " sort");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = sc.nextInt();

        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter list[" + i + "]:");
            list[i] = sc.nextInt();
        }
        System.out.println("Display array: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        bubbleStepByStep(list);
    }
}
