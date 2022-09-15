import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        int n;
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers> ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.printf("# Enter number %d>", i);
            num = sc.nextInt();
            sum += num;
        }

        System.out.println("Summation = "+sum);

        sc.close();
    }
}
