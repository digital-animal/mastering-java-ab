import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        float s;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.print("# Enter three sides of triangle (a, b, c)> ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)*0.5f;

        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("Area = %.2f\n", area);

        sc.close();
    }
}
