public class NumberWord {
    public static void main(String[] args) {
        numToWord(492);
        numToWord(4920);
	numToWord(1971);
        
    }

    public static void numToWord(int num) {
        int temp = num;
        String numString = "";
        int remainder;

        while(num > 0) {
            remainder = num % 10;
            numString += String.valueOf(remainder);
            num = num / 10;
        }

        int len = numString.length();

        System.out.print(temp+" => ");

        for(int i=len - 1; i>=0; i--) {
            System.out.print(printDigit(numString.charAt(i))+" ");
        }
        System.out.println();
    }

    public static String printDigit(char ch) {
        switch (ch) {
            case '0':
                return "Zero"; 
            case '1':
                return "One"; 
            case '2':
                return "Two"; 
            case '3':
                return "Three"; 
            case '4':
                return "Four"; 
            case '5':
                return "Five"; 
            case '6':
                return "Six"; 
            case '7':
                return "Seven"; 
            case '8':
                return "Eight"; 
            case '9':
                return "Nine"; 
            default:
                return "";
        }
    }
}
