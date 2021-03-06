package _06_ke_thua.bai_tap.point_moveablepoint;


import java.util.Arrays;

public class MoveAblePoint extends Point {

        private float xSpeed;
        private float ySpeed;

        public MoveAblePoint() {}

//


    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
    }

//    @Override
//    public void setX(float x) {
//        setxSpeed(x);
//    }

    public float[] getSpeed() {
            float[] array2 = {getxSpeed(), getySpeed()};
            return array2;
    }
    public MoveAblePoint move() {
        super.setX(super.getX() + this.getxSpeed());
        super.setY(super.getY() + this.getySpeed());
        return this;
    }

//    @Override
//    public String toString() {
//        return "MoveAblePoint = " + Arrays.toString(getXY()) + ", speed = " + Arrays.toString(getSpeed());
//    }


    @Override
    public String toString() {
        return "MoveAblePoint{" + super.toString()  +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
//        MoveAblePoint moveAblePoint = new MoveAblePoint();
//        System.out.println(moveAblePoint);
//
//        moveAblePoint = new MoveAblePoint(3, 4);
//        System.out.println(moveAblePoint);

        MoveAblePoint moveAblePoint = new MoveAblePoint(2,5,4,6);
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
