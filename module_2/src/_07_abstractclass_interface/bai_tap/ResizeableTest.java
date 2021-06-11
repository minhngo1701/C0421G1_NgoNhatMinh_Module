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
        resizeables[1] = new Rectangle(2,4);
        resizeables[2] = new Square(3);

        for (Resizeable resizeable : resizeables) {
            resizeable.resize(3);
            if (resizeable instanceof Circle) {
                System.out.println(((Circle) resizeable).getArea());
            } else if (resizeable instanceof Rectangle) {
                System.out.println(((Rectangle) resizeable).getArea());
            } else if (resizeable instanceof Square)
                System.out.println((Square)resizeable.);
            }
        }
    }
}
