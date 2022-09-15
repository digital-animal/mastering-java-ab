import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 4;
        A[1] = 9;
        A[2] = 2;
        A[3] = 3;
        A[4] = 5;
        int key;
        printArray(A);

        Scanner sc = new Scanner(System.in);
        System.out.print("# Enter an element to delete> ");
        key = sc.nextInt();

        deleteKey(A, key);
        printArray(A);
        
        sc.close(); 
    }

    public static void deleteKey(int A[], int key) {
        int index = linearSearch(A, key);
        if(index == -1) {
            System.out.println(key + " not found");
            return;
        }
        for(int i=index; i<A.length-1; i++) {
            A[i] = A[i+1];
        }
    }

    public static void printArray(int A[]) {
        for(int x: A)
            System.out.print(x+" ");
        System.out.println();
    }

    public static int linearSearch(int A[], int key) {
        for(int i=0; i<A.length; i++)
            if(A[i] == key) return i;
        return -1;
    }
}
