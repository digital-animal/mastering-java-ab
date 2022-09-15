import java.util.Scanner;
import java.lang.Math;

public class ArithmeticSeries {
    public static void main(String[] args) {
        int a, d, n, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, d, n> ");
        a = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        arithmeticProgression(a, d, n);
        System.out.println();

        System.out.print("Enter a, r, n> ");
        a = sc.nextInt();
        r = sc.nextInt();
        n = sc.nextInt();

        geometricProgression(a, r, n);
        sc.close();
    }

    public static void arithmeticProgression(int a, int d, int n) {

        int t = 0;
        for(int i=0; i<n; i++) {
            t = a + i*d; // a + (a+d) + (a+2d) + (a+3d) + ...
            System.out.print(t+" ");
        }
        System.out.println();
        
    }

    public static void geometricProgression(int a, int r, int n) {

        int t = 0;
        for(int i=0; i<n; i++) {
            t = a*(int)Math.pow(r, i); // a + ar^1 + ar^2 + ar^3 + ...
            System.out.print(t+" ");
        }
        System.out.println();
    }
}
