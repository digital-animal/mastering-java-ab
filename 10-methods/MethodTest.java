public class MethodTest {
    public static void main(String[] args) {
        System.out.println(max(4, 9));
        System.out.println(max(2, 3));
        System.out.println(max(5, 7));
        System.out.println(max(8, 1));
        System.out.println(max(6, 0));
    }    

    public static int max(int x, int y) {
        if(x>y) return x;
        return y;
    }
}
