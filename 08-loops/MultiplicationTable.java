import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n> ");
        n = sc.nextInt();

        for(int i=1; i<=10; i++)
            System.out.printf("%2d x %2d = %4d\n", n, i, n*i);

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
