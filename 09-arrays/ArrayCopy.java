public class ArrayCopy {
    public static void main(String[] args) {
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        int B[] = new int[A.length];
        int C[] = new int[A.length];
        int D[] = new int[A.length*2];

        for(int i=0, k=A.length-1; i<A.length; i++, k--) {
            B[i] = A[i]; // copy
            C[k] = A[i]; // reverse copy
            D[i] = A[i]; // increase array size
        }
        A = D; // size increased
        D = null;

        printArray(A);
        printArray(B);
        printArray(C);
        // printArray(D);
        printArray(A);
    }

    public static void printArray(int A[]) {
        for(int x: A)
            System.out.print(x+" ");
        System.out.println();
    }
}
