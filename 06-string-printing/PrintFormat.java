public class PrintFormat {
	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.println("Sum is "+x+y);
		System.out.println("Sum is "+(x+y));
		System.out.printf("Sum of %d and %d is %d\n", x, y, x+y);
		System.out.printf("x = %d\n", x);
		System.out.printf("x = %5d\n", x);
		System.out.printf("x = %05d\n\n", x);

		float f = 12.56f;
		System.out.printf("f = %f\n", f);
		System.out.printf("f = %.2f\n", f);
		System.out.printf("f = %e\n", f);
		System.out.printf("f = %g\n\n", f);
		
		f = 0.1256f;
		System.out.printf("f = %e\n", f);
		System.out.printf("f = %.2e\n", f);
		System.out.printf("f = %g\n\n", f);
		
		String str = "Java Programming!";
		System.out.printf("Welcome to %s\n", str);
		System.out.printf("Welcome to %20s\n", str);
		System.out.printf("Welcome to %-20s\n", str);

		System.out.printf("%1$d %2$d %1$d\n", x, y);
		System.out.printf("%3$s %2$f %1$d\n", x, f, str);

	}
}