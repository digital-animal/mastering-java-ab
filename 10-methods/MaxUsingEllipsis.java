public class MaxUsingEllipsis {
    public static void main(String[] args) {
        System.out.println(findMax());
	System.out.println(findMax(4));
        System.out.println(findMax(4, 9));
        System.out.println(findMax(4, 9, 11));
        System.out.println(findMax(new int[]{2, 3, 5, 7, 11, 13, 17, 19}));
    }

    public static int findMax(int ...A) {
        int max = Integer.MIN_VALUE;

	if(A.length == 0) return max;

        for(int x: A) {
            if(x > max)
                max = x;
        }
        return max;
    }
}
