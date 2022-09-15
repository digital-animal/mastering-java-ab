public class RecursionDemo {
    public static void main(String[] args) {
        fun(5);

        System.exit(0);
    }

    public static void fun(int n) {
        if(n > 0) {
            // fun(n-1);
            System.out.print(n+" ");
            fun(n-1);
        }
    }
}
