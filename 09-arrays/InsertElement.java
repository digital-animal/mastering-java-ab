import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 4;
        A[1] = 9;
        A[2] = 2;
        A[3] = 3;
        A[4] = 5;

        int key;
        int index;
        printArray(A);

        Scanner sc = new Scanner(System.in);
        System.out.print("# Enter element & index to insert> ");
        key = sc.nextInt();
        index = sc.nextInt();

        insertKeyAt(A, key, index);
        printArray(A);
        
        sc.close();
    }

    public static void insertKeyAt(int A[], int key, int index) {
        if(index >= A.length || index < 0) {
            System.out.println("Index out of range. Insertion failed.");
            return;
        }
        else if(index == A.length-1) {
            A[index] = key;
	    return;
        }

        for(int i=A.length-1; i>index; i--) {
            A[i] = A[i-1];
        }
        A[index] = key;
    }

    public static void printArray(int A[]) {
        for(int x: A)
            System.out.print(x+" ");
        System.out.println();
    }
}
