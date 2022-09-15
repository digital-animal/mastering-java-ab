public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6},
        };

        // int B[][] = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9},
        // };

        int B[][] = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1},
        };

        int m = A.length;
        int n = A[0].length;
        int C[][] = new int[m][n];


        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                C[i][j] = 0;
                for(int k=0; k<n; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("# Matrix A: ");
        printMatrix(A);

        System.out.println("# Matrix B: ");
        printMatrix(B);

        System.out.println("# Matrix A x B: ");
        printMatrix(C);
    }

    public static void printMatrix(int A[][]) {

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                System.out.format("%2d ", A[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
