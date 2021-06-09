package _06_ke_thua.bai_tap.point2d_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {}

//

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z) {
        getXY();
        this.z = z;
    }
    public float[] getXYZ() {
        float[] array = {getX(), getY(), getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "Point = " + Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);
    }
}
