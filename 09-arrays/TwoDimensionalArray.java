public class TwoDimensionalArray {
    public static void main(String[] args) {
        int A[][] = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6},
        };

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                System.out.format("%2d ", A[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        for(int x[]:A) {
            for(int y:x) {
                System.out.format("%2d ", y);
            }
            System.out.println();
        }
    }
}
