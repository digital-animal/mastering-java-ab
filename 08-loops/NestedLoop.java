public class NestedLoop {
    public static void main(String[] args) {
        printMatrix(5);
    }

    public static void printMatrix(int n) {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++) {
                System.out.printf("(%d,%d) ", i, j);
            }
            System.out.println();
        }
    }
}