package _06_ke_thua.thuc_hanh;

import _07_abstractclass_interface.bai_tap.Colorable;
import _07_abstractclass_interface.bai_tap.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }
    @Override
    public void setHeight(double side) {
        setSide(side);
    }
    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide()*(percent/100));
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("blue", false, 2.4);
//        System.out.println(square);
//        System.out.println(square.getArea());
        square.setSide(4.2);
        System.out.println(square.getArea());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
