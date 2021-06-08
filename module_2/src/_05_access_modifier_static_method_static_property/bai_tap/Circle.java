package _05_access_modifier_static_method_static_property.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

//    private double getRadius() {
//        return radius;
//    }
//    private double getArea() {
//        return radius * radius * Math.PI;
//    }

//    protected double getRadius() {
//        return radius;
//    }
//    protected double getArea() {
//        return radius * radius * Math.PI;
//    }

//    double getRadius() {
//        return radius;
//    }
//    double getArea() {
//        return radius * radius * Math.PI;
//    }
}
