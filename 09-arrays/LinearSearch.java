import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        int A[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        Scanner sc = new Scanner(System.in);
        int key;
        System.out.print("Enter a key to search> ");
        key = sc.nextInt();

        int index = linearSearch(A, key);
    
        if(index != -1 ) {
            System.out.println(key+" found at index " + index);
        } 
        else {
            System.out.println(key +" not found");
        }
        sc.close();
    }

    public static int linearSearch(int A[], int key) {
        for(int i=0; i<A.length; i++)
            if(A[i] == key) return i;
        return -1;
    }
}
