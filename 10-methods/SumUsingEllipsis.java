public class SumUsingEllipsis {
    public static void main(String[] args) {
        System.out.println(findSum());
        System.out.println(findSum(4));
        System.out.println(findSum(4, 9));
        System.out.println(findSum(4, 9, 2));
        System.out.println(findSum(new int[]{4, 9, 2, 3, 5}));
    }

    public static int findSum(int ...A) {
        int sum = 0;
        for(int x: A) {
            sum += x;
        }
        return sum;
    }
}
