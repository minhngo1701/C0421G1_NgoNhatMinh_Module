package _06_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "height = " + getHeight() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.6);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.3, "red", 3.6);
        System.out.println(cylinder);
    }
}
