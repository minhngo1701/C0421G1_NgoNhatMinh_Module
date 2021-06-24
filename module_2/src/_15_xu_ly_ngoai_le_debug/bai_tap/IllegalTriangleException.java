package _15_xu_ly_ngoai_le_debug.bai_tap;//package _15_xu_ly_ngoai_le_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    String mess;
    public IllegalTriangleException(String mess) {
        this.mess = mess;
    }

    @Override
    public String toString() {
        return "Error: " + mess;
    }
}
