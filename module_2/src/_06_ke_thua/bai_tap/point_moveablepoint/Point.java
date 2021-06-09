package _06_ke_thua.bai_tap.point_moveablepoint;


public class Point {


        private float x;
        private float y;


        public Point(){
        }

        public Point(float x, float y) {
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
            float[] array = {this.x , this.y};
            return array;
        }


        @Override
        public String toString() {
            return "Point = " + "(" + getX() + "," + getY() + ")";
        }

        public static void main(String[] args) {
            Point point = new Point();
            System.out.println(point);

            point = new Point(1,2);
            System.out.println(point);
        }
    }


