public class Arithmetic {
	public static void main(String[] args) {
		int a=14, b=5;
		int q=a/b;
		int r=a%b;
		System.out.printf("Quotient = %d\n", q);
		System.out.printf("Remainder = %d\n", r);
		
		byte x=4;
		short y=9;
		int z=x+y;
		System.out.printf("Sum = %d\n", z);

		float c = (float)a / b;
		System.out.println("Float Division = " + c);
	}
}