public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(max(4, 9)); 
        System.out.println(max(4.9f, 3.2f)); 
        System.out.println(max(49, 23, 57)); 

        System.exit(0);
    }
    public static int max(int x, int y) {
        return x>y? x: y;
    }

    public static float max(float x, float y) {
        return x>y? x: y;
    }

    public static int max(int x, int y, int z) {
        if(x>y && x>z) return x;
        else if(y>z) return y;
        return z;
    }
}
