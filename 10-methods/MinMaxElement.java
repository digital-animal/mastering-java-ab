public class MinMaxElement {
    public static void main(String[] args) {
        int A[] = {41, 43, 47, 97, 23, 29, 31, 37, 53, 59, 71, 73, 79, 83, 89, 11, 13, 17, 19, 61, 67, 2, 3, 5, 7};
        System.out.println(findMin(A));
        System.out.println(findMax(A));
    }

    public static int findMin(int A[]) {
        int min = A[0];

        for(int i=0; i<A.length; i++) {
            if(A[i] < min)
                min = A[i];
        }
        return min;
    }

    public static int findMax(int A[]) {
        int max = A[0];

        for(int i=0; i<A.length; i++) {
            if(A[i] > max)
                max = A[i];
        }
        return max;
    }
}
