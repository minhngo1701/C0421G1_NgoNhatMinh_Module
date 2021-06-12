package _07_abstractclass_interface.bai_tap;

import _06_ke_thua.thuc_hanh.Circle;
import _06_ke_thua.thuc_hanh.Rectangle;
import _06_ke_thua.thuc_hanh.Square;

public class ResizeableTest {
    public static void main(String[] args) {
//        Circle circles = new Circle(3);
//        circles.resize(10);
//        System.out.println(circles);

//        Rectangle rectangle = new Rectangle(2,5);
//        rectangle.resize(4);
//        System.out.println(rectangle);

//        Square square = new Square(3);
//        square.resize(5);
//        System.out.println(square);

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3.4);
        resizeables[1] = new Rectangle(2, 4);
        resizeables[2] = new Square(3);
        double percent = Math.round(Math.random()*100) + 1;

        System.out.println("Pre-resize: ");

        for (Resizeable resizeable : resizeables) {
            if (resizeable instanceof Circle) {
                System.out.println("Area circle is: " + ((Circle) resizeable).getArea());
            } else if (resizeable instanceof Rectangle) {
                System.out.println("Area rectangle is: " + ((Rectangle) resizeable).getArea());
            } else if (resizeable instanceof Square) {
                System.out.println("Area square is: " + ((Square)resizeable).getArea());
            } else {
                System.out.println("Invalid");
            }
        }

        System.out.println("After-resize: ");
        for (Resizeable resizeable : resizeables) {
            resizeable.resize(percent);
            if (resizeable instanceof Circle) {
                System.out.println("Area circle is: " + ((Circle) resizeable).getArea());
            } else if (resizeable instanceof Rectangle) {
                System.out.println("Area rectangle is: " + ((Rectangle) resizeable).getArea());
            } else if (resizeable instanceof Square) {
                System.out.println("Area square is: " + ((Square)resizeable).getArea());
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
