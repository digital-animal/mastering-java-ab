
class WideningNarrowing {
	public static void main(String[] args) {
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		float f = 10f;
		double d = 10;
		char c = 10;
		// boolean t = true;
		
		// b = s; // invalid
		b = (byte)s; // narrowing(downcasting)
		System.out.printf("b = %d\n", b);
		s = b;
		i = b;
		l = b;
		f = b;
		// c = b; // invalid, not compitable
		d = f;
		// f = d; // invalid
		f = (float)d;
		// i = t; // invalid

		c = (char)b; 
		System.out.printf("s = %d, i = %d, l = %d, f = %.2f, c = %c\n", b, i, l, f, c);
		
		short m = 200;
		byte n = (byte)m;
		System.out.printf("n = %d\n", n);

	}
}