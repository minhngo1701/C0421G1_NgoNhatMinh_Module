package _14_thuat_toan_sap_xep.bai_tap;

public class InsertSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void insertSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            int index = i;
            double temp = list[i];
            while (index > 0 && temp < list[index - 1]) {
                list[index] = list[index-1];
                index--;
            }
            list[index] = temp;
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
