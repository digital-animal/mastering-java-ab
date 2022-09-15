// import java.util.regex.*;

public class Radix {
    public static void main(String[] args) {
        findRadix("1010101");
        findRadix("357");
        findRadix("492");
        findRadix("816ABC");
        findRadix("12ABCPQ");
    }

    public static void findRadix(String number) {
        String binaryPattern = "[0-1]+";
        String octalPattern = "[0-7]+";
        String decimalPattern = "[0-9]+";
        String hexPattern = "[0-9A-F]+";

        /*
        if(Pattern.matches(binaryPattern, number)) {
            System.out.println(number +" => Binary (Radix = 2)");
        }
        else if(Pattern.matches(octalPattern, number)) {
            System.out.println(number +" => Octal (Radix = 8)");
        }
        else if(Pattern.matches(decimalPattern, number)) {
            System.out.println(number +" => Decimal (Radix = 10)");
        }
        else if(Pattern.matches(hexPattern, number)) {
            System.out.println(number +" => Hexa Decimal (Radix = 16)");
        }
        else {
            System.out.println("Invalid number");
        }
        */
        
        if(number.matches(binaryPattern)) {
            System.out.println(number +" => Binary (Radix = 2)");
        }
        else if(number.matches(octalPattern)) {
            System.out.println(number +" => Octal (Radix = 8)");
        }
        else if(number.matches(decimalPattern)) {
            System.out.println(number +" => Decimal (Radix = 10)");
        }
        else if(number.matches(hexPattern)) {
            System.out.println(number +" => Hexa Decimal (Radix = 16)");
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
