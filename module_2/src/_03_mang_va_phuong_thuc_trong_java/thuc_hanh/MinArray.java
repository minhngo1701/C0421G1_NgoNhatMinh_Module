package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class MinArray {
    public static void main(String[] args) {
        int array[] = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Min = " + minValue(array));
    }
    public static int minValue(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
