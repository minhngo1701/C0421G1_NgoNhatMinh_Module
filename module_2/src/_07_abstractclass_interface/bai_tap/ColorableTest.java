package _07_abstractclass_interface.bai_tap;

import _06_ke_thua.thuc_hanh.Circle;
import _06_ke_thua.thuc_hanh.Rectangle;
import _06_ke_thua.thuc_hanh.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3.4);
        resizeables[1] = new Rectangle(2, 4);
        resizeables[2] = new Square(3);


        for (Resizeable resizeable : resizeables) {
            if (resizeable instanceof Square) {
                Colorable colorable = (Square)resizeable;
                colorable.howToColor();
            } else if (resizeable instanceof Rectangle) {
                System.out.println("Area rectangle is: " + ((Rectangle) resizeable).getArea());
            } else if  (resizeable instanceof Circle) {
                System.out.println("Area circle is: " + ((Circle) resizeable).getArea());
            }
        }
    }
}
