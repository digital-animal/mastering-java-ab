public class ArrayDemo {
    public static void main(String[] args) {
        // array declaration and initialization
        // int A[] = new int[10];
        // int B[] = {4, 9, 2, 3, 5};
        // int C[];
        // C = new int[10];
        // int[] D = new int[5];

        int arr[] = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
            arr[i]++; // can modify array element
        }
        System.out.println();

        for(int x:arr) {
            System.out.print(x+" ");
            x++;
        }
        System.out.println();

        // cannot modify
        for(int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println(arr);
        System.out.println(arr.length);
    }
}
