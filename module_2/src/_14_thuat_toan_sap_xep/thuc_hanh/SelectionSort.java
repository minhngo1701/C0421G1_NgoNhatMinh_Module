package _14_thuat_toan_sap_xep.thuc_hanh;

public class SelectionSort {
    static double[] list1 = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length-1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;

                }

            }
            if (minIndex != 1) {
                double temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
            }
            System.out.println("list after " + i + " sort ");
            for (int k = 0; k < list1.length; k++) {
                System.out.print(list1[k] + " ");
            }
        }

    }

    public static void main(String[] args) {
        selectionSort(list1);
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
    }
}
