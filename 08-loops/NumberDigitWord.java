public class NumberDigitWord {
    public static void main(String[] args) {
        numToWord(492);
        numToWord(4920);
        numToWord(1971);
     
    }

    public static void numToWord(int num) {
        String numString = String.valueOf(num);
        int len = numString.length();
	
	System.out.print(num + " => ");
        for(int i=0; i<len; i++) {
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
   

