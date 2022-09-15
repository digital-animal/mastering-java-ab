public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(153));
        System.out.println(reverseNumber(12321));
        System.out.println(reverseNumber(123));
        System.out.println(isPalindrome(153));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(12321));
    }

    public static int reverseNumber(int num) {
        // reverse = reverse*10 + remainder
        int reverse = 0;
        int remainder;
        while(num > 0) {
            remainder = num % 10;
            reverse = reverse*10 + remainder; //  10*x+y
            num = num / 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int num) {
        if(num == reverseNumber(num))
            return true;
        return false;
    }
}
