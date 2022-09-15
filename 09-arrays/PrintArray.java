public class PrintArray {
    public static void main(String[] args) {
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};

        for(int i=0; i< A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();

        for(int i=A.length-1; i>=0; i--) {
            System.out.print(A[i]+" ");
        }
        System.out.println();

        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
