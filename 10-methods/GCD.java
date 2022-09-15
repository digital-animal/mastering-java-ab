public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(4, 9));
        System.out.println(findGCD(9, 24));
        System.out.println(findGCD(12, 32));
        System.out.println(findGCD(18, 48));
        System.out.println(findGCD(36, 48));
        System.out.println(findGCD(48, 72));
    }

    /*
    public static int findGCD(int x, int y) {

        int min = x<y? x: y;
        
        for(int i=min; i>=1; i--) {
            if(x%i == 0 && y%i==0)
                return i;
        }
        return 1;
    }
    */

    public static int findGCD(int m, int n) {

        while(m != n) {
            if(m>n) m = m - n;
            else if(m<n) n = n - m;
        }
        
        return m;
    }
}
