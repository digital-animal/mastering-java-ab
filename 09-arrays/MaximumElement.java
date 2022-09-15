public class MaximumElement {
    public static void main(String[] args) {
        
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};

        int max = findMax(A);
    
        System.out.println("Maximum =  " + max);

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
