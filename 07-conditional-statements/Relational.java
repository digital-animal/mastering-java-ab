public class Relational {
    public static void main(String[] args) {
        float a=5.4f, b=5.5f, c=15.0f;
        System.out.println(a>b && a>c);
        System.out.println(a<b && a<c);
        System.out.println(a<b || b>c);

        int n=-5;
        if(n>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
