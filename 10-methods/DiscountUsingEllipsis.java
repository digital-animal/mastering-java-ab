public class DiscountUsingEllipsis {
    public static void main(String[] args) {
        System.out.println(getDiscount(200, 150));
        System.out.println(getDiscount(200, 150, 300));
        System.out.println(getDiscount(200, 150, 300, 400));
    }

    public static double getDiscount(double ...P) {
        double sum=0;
        for(double x: P) {
            sum += x;
        }

        if(sum <= 500) return sum*0.10;
        else if(sum > 500 && sum <= 1000) return sum*0.15;
        else if(sum > 1000) return sum*0.20;
        return 0;
    }
}
