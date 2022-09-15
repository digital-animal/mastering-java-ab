import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int num1, num2;
        int result;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers> ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    
        String option;

        while(true) {
            System.out.println("# ========= M E N U ==========");
            System.out.println("# Choices => ADD, SUB, MUL, DIV, MOD, QUIT");
            System.out.println("# ============================");
            System.out.print("# Enter your choice> ");
            option = sc.next().toUpperCase();
            
            switch(option) {
                case "ADD":
                    result = add(num1, num2);
                    System.out.printf("%d + %d = %d", num1, num2, result);
                    break;
                case "SUB":
                    result = sub(num1, num2);
                    System.out.printf("%d - %d = %d", num1, num2, result);
                    break;
                case "MUL":
                    result = mul(num1, num2);
                    System.out.printf("%d x %d = %d", num1, num2, result);
                    break;
                case "DIV":
                    result = div(num1, num2);
                    System.out.printf("%d / %d = %d", num1, num2, result);
                    break;
                case "MOD":
                    result = mod(num1, num2);
                    System.out.printf("%d mod %d = %d", num1, num2, result);
                    break;
                case "QUIT":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.printf("Invalid Choice");
                    sc.close();
                    break;
            }
            System.out.println("\n");
	    System.out.print("Enter two numbers> ");
	    num1 = sc.nextInt();
       	    num2 = sc.nextInt();
        }
        
    }

    public static int add(int x, int y) {
        return x+y;
    }

    public static int sub(int x, int y) {
        return x-y;
    }

    public static int mul(int x, int y) {
        return x*y;
    }

    public static int div(int x, int y) {
        int result = -1;
        try {
            if(y!=0)
                result = x/y;
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public static int mod(int x, int y) {
        int result = -1;
        try {
            if(y!= 0) ;
                result = x%y;
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
