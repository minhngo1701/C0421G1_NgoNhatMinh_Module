package _06_ke_thua.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point2D {
        private float x = 0.0f;
        private float y = 0.0f;


        public Point2D(){
        }

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public float[] getXY() {
            float[] array = {getX(), getY()};
            return array;
        }


        @Override
        public String toString() {
            return "Point2D = "  + Arrays.toString(getXY());
        }

        public static void main(String[] args) {
            Point2D point2D = new Point2D();
            System.out.println(point2D);

            point2D = new Point2D(2, 3);
            point2D.setXY(1, 4);
            System.out.println(point2D);
        }
}
