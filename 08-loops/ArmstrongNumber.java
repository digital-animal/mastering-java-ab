import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(countDigit(123));
        System.out.println(countDigit(49235));
        displayDigit(123);
        displayDigit(49235);
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(171));
        System.out.println(isArmstrong(371));
    }

    public static int countDigit(int num) {
        int count=0;
        while(num != 0)
        {
            num = num /10;
            count++;
        }
        return count;
    }

    public static void displayDigit(int num) {
        int digit;
        while(num != 0)
        {
            digit = num%10;
            System.out.print(digit+" ");
            num = num /10;
        }
        System.out.println();
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int n = countDigit(num);
        int sum = 0;
        int digit;

        while(true) {
            digit = num %10;
            sum += Math.pow(digit, n);
            num = num/10;
            if(num == 0) break;
        }

        if(sum == temp)
            return true;
        return false;
    }
}
