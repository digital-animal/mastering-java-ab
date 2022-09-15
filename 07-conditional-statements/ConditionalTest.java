public class ConditionalTest {
    public static void main(String[] args) {
        evenOdd(4);
        evenOdd(9);

        isYoung(24);
        isYoung(36);
        isYoung(42);

        showGrade(92, 83, 72);
        showGrade(65, 77, 55);
        showGrade(42, 71, 45);
        showGrade(25, 45, 32);
        
    }

    public static void evenOdd(int num) {
        if(num%2==0)
            System.out.println("Even");
        else if(num%2==1)
            System.out.println("Odd");
    }

    public static void isYoung(int age) {
        if(age>=18 && age<40)
            System.out.println("Young");
        else
            System.out.println("Not Young");
    }

    public static void showGrade(int m1,int m2, int m3) {

        float marks = (float)(m1+m2+m3)/3.0f;

        if(marks >= 80 && marks <=100)
            System.out.println("A+");
        else if(marks >= 70 && marks <80)
            System.out.println("A");
        else if(marks >= 60 && marks <70)
            System.out.println("A-");
        else if(marks >= 50 && marks <60)
            System.out.println("B");
        else if(marks >= 40 && marks <50)
            System.out.println("C");
        else if(marks >= 33 && marks <40)
            System.out.println("D");
        else if(marks >= 0 && marks <33)
            System.out.println("F");
    }
}
