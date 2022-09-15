public class DataValidation {
    public static void main(String[] args) {
        System.out.println(validate("Amal"));
        System.out.println(validate("@mir"));
        System.out.println(validate("John Doe"));
        System.out.println();
        System.out.println(validate(18));
        System.out.println(validate(12));
        System.out.println(validate(5));
    }

    public static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    public static boolean validate(int age) {
        return  age>=6 && age<=15;
    }
}
