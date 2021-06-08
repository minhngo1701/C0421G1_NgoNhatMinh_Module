package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {

        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSpeed() {

        return this.speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public void turnOn() {

        on = true;
    }

    public void turnOff() {

        on = false;
    }

    public boolean isOn() {

        return on;
    }


    public double getRadius() {

        return this.radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String speed() {
        if (this.speed == this.SLOW) {
            return "SLOW";
        } else if (this.speed == this.MEDIUM) {
            return "MEDIUM";
        } else if (this.speed == this.FAST) {
            return "FAST";
        } else {
            return "Invalid";
        }
    }

    @Override
    public String toString() {
        if (isOn() == true) {
            return "Fan{" + " Fan is on " +
                    ", speed=" + speed() +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" + " Fan is off " +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.turnOn();
        fan1.setColor("Yellow");
        System.out.println(fan1.toString());

        fan2.turnOff();
        System.out.println(fan2.toString());
    }
}
