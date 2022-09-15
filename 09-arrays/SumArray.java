public class SumArray {
    public static void main(String[] args) {
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        System.out.println(sumOfElements(A));
    }

    public static int sumOfElements(int A[]) {
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}
