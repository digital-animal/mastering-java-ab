import java.lang.Math;

public class ShapeArea {
    public static void main(String[] args) {
        System.out.format("Circle: %.2f \n", getArea(10));
	System.out.printf("Triangle: %.2f \n", getArea(4.2f, 9.3f));
        System.out.println("Rectangle: " + getArea(8, 6));
    }
    public static double getArea(int radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    public static float getArea(float base, float height) {
        return 0.5f*base*height;
    }

    public static int getArea(int length, int breadth) {
        return length*breadth;
    }
}
