public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(1902);
        isLeapYear(1800);
        isLeapYear(2000);
        isLeapYear(2004);
        isLeapYear(2020);
        isLeapYear(2021);
    }

    public static void isLeapYear(int year) {
        if(year%400==0)
            System.out.println(year+" is leap year");
        else if(year%100!=0 && year%4==0)
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is not leap year");
    }
}