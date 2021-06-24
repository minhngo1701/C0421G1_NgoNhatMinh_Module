package _15_xu_ly_ngoai_le_debug.bai_tap;

public class Test {
    static void validate(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {
        validate(20);
        System.out.println("rest of the code...");
    }
}
