public class MinMax {
    public static void main(String[] args) {
        int a = 4, b = 9,  c = 2;
        System.out.println("Max = " + maxima(a, b, c));
        System.out.println("Min = " + minima(a, b, c));
    }

    public static int maxima(int x, int y, int z) {
        if(x>y && x>z) return x;
        else if(y>z) return y;
        else return z;
    }

    public static int minima(int x, int y, int z) {
        if(x<y && x<z) return x;
        else if(y<z) return y;
        else return z;
    }
}
