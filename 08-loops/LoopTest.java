public class LoopTest {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int k=1;
        int n=100;

        while(i<n) {
            System.out.print(i+" ");
            i = i*2;
        }
        System.out.println();

        do {
            System.out.print(j+" ");
            j = j*2;
        } while(j<n);
        System.out.println();

        while(true) {
            System.out.print(k+" ");
            k = k*2;
            if(k>100) break;
        }
        System.out.println();

        for(int x=1; x<100; x*=2) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.exit(0);
    }
}
