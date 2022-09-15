public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int n) {
        // 0 1 1 2 3 5 8 13 21 34 55 89 ... 
        int f0 = 0;
        int f1 = 1;
        int f2;

        for(int i=0; i<n; i++) {
            System.out.print(f0+" ");
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
    }
}
