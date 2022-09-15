import java.lang.Double;
import  java.lang.NumberFormatException;

public class CommandLineSum {
	public static void main(String[] args) {
		double sum = 0;
		try {
			for(String x: args) {
				sum += Double.parseDouble(x);
			}
			System.out.printf("Summation = %.2f\n", sum);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Number Format.");
			// System.out.println(e);
		}
		finally {
			System.out.println("Program Terminated");
		}
	}
}