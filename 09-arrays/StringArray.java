import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String Languages[] = {"C", "C++", "Java", "Python", "JS", "Ada", "Basic", "Pascal"};
        printArray(Languages);

        Arrays.sort(Languages);
        
        printArray(Languages);
    }

    public static void printArray(String A[]) {

        for(String x: A)
            System.out.print(x+" ");
        System.out.println();
    }
}
