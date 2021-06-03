package _02_vong_lap_trong_java.bai_tap;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        while (number < 100) {
            int s = 1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    s++;
                }
            }
            if (s == 2) {
                System.out.println(number);
            }
            number++;
        }
    }
}
