import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n> ");
        n = sc.nextInt();
        System.out.printf("fact(%d) = %d\n", n, factorial(n));

        sc.close();
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        return f;
    }
}
