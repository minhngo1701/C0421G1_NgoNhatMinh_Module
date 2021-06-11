package _06_ke_thua.thuc_hanh;

import _07_abstractclass_interface.bai_tap.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and height = " + getHeight() + ", which is a subclass of" + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(1.4, 3.2);
        System.out.println(rectangle);

        rectangle = new Rectangle("blue", false, 2.5, 3.5 );
        System.out.println(rectangle);
    }

    @Override
    public void resize(double percent) {
        this.width = this.width * percent;
        this.height = this.height * percent;
    }
}
