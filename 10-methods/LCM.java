public class LCM {
    public static void main(String[] args) {
        System.out.println(findLCM(4, 9));
        System.out.println(findLCM(9, 24));
        System.out.println(findLCM(12, 32));
        System.out.println(findLCM(18, 48));
        System.out.println(findLCM(36, 48));
        System.out.println(findLCM(48, 72));
    }

    public static int findLCM(int x, int y) {

        int max = x>y? x: y;
        int limit = x*y;
        
        for(int i=max; i<=limit; i++) {
            if(i%x == 0 && i%y==0)
                return i;
        }
        return limit;
    }
}
