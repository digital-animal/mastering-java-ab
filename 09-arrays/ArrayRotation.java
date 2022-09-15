public class ArrayRotation {
    public static void main(String[] args) {
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        printArray(A);
        System.out.println("# Rotate Right: ");
        rotateRight(A);
        printArray(A);

        System.out.println("# Rotate Right: ");
        rotateRight(A);
        printArray(A);
        
        System.out.println("# Rotate Left: ");
        rotateLeft(A);
        printArray(A);

        System.out.println("# Rotate Left: ");
        rotateLeft(A);
        printArray(A);
    }

    public static void rotateRight(int A[]) {
        int n = A.length;
        int temp = A[n-1];

        for(int i=n-1; i>0; i--) {
            A[i] = A[i-1];
        }
        A[0] = temp;
    }

    public static void rotateLeft(int A[]) {
        int n = A.length;
        int temp = A[0];

        for(int i=0; i<n-1; i++) {
            A[i] = A[i+1];
        }
        A[n-1] = temp;
    }

    public static void printArray(int A[]) {
        for(int x: A)
            System.out.print(x+" ");
        System.out.println();
    }
}
