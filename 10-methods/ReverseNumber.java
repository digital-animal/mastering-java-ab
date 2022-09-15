public class ReverseNumber {
    public static void main(String[] args) {
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        System.out.println(reverse(492));

        printArray(A);
        A = reverse(A);
        printArray(A);

    }

    public static int reverse(int num) {
        int reverseNumber = 0;
        int remainder;

        while(num > 0) {
            remainder = num % 10;
            reverseNumber = reverseNumber*10 + remainder;
            num = num / 10;
        }
        return reverseNumber;
    }

    public static int[] reverse(int A[]) {
        int B[] = new int[A.length];

        for(int i=A.length-1, k=0; i>=0; i--, k++) {
            B[k] = A[i];
        }
        return B;
    }

    public static void printArray(int A[]) {
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}