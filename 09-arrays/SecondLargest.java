public class SecondLargest {
    public static void main(String[] args) {
        
        // int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0, 11, 13, 17, 19, 23, 29};

        // int secondLargest = findSecondLargest(A);
        int secondLargest = findSecondLargestB(A);
    
        System.out.println("Second Largest =  " + secondLargest);

    }

    public static int findSecondLargest(int A[]) {
        int secondLargest = Integer.MIN_VALUE;
        int largest = A[0];

        for(int i=0; i<A.length; i++) {
            if(A[i] > largest) {
                largest = A[i];
            }
        }

        for(int i=0; i<A.length; i++) {
            if(A[i] > secondLargest && A[i] < largest)
                secondLargest = A[i];
        }
        return secondLargest;
    } 

    public static int findSecondLargestB(int A[]) {
        int secondLargest = A[0];
        int largest = A[0];

        for(int i=0; i<A.length; i++) {
            if(A[i] > largest) {
                secondLargest = largest;
                largest = A[i];
            }
            else if(A[i] > secondLargest) {
                secondLargest = A[i];
            }
        }
        return secondLargest;
    } 
}
