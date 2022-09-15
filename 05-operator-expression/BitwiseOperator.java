
class BitwiseOperator {
	public static void main(String[] args) {
		int x=10;
		int y=6;
		
		x=0b1010;
		y=0b0110;
		
		System.out.println(String.format("%s", Integer.toBinaryString(x)));
		System.out.println(String.format("%s", Integer.toBinaryString(y)));
		
		System.out.printf("x = %d\n", x);
		System.out.printf("y = %d\n", y);
		
		System.out.printf("x = %s\n", Integer.toBinaryString(x));
		System.out.printf("y = %s\n", Integer.toBinaryString(y));
		
		System.out.printf("x & y = %d\n", x&y);
		System.out.printf("x & y = %s\n", Integer.toBinaryString(x&y));
		
		System.out.printf("x | y = %d\n", x|y);
		System.out.printf("x | y = %s\n", Integer.toBinaryString(x|y));

		System.out.printf("x ^ y = %d\n", x^y);
		System.out.printf("x ^ y = %s\n", Integer.toBinaryString(x^y));

		System.out.printf("~x = %d\n", ~x); 
		System.out.printf("~x = %s\n", Integer.toBinaryString(~x));
		System.out.printf("~x = %s\n", Integer.toBinaryString(~x));

		System.out.printf("~y = %d\n", ~y);
		System.out.printf("~y = %s\n", Integer.toBinaryString(~y));

		System.out.printf("x>>1 = %d\n", x>>1);
		System.out.printf("x>>1 = %s\n", Integer.toBinaryString(x>>1));
		System.out.printf("x>>1 = %s\n", Integer.toBinaryString(x>>1));

		System.out.printf("x>>>1 = %d\n", x>>>1); // unsigned right shift
		System.out.printf("x>>>1 = %s\n", Integer.toBinaryString(x>>>1));

		System.out.printf("y>>1 = %d\n", y>>1);
		System.out.printf("y>>1 = %s\n", Integer.toBinaryString(y>>1));

		System.out.printf("x<<2 = %d\n", x<<2);
		System.out.printf("x<<2 = %s\n", Integer.toBinaryString(x<<2));

		System.out.printf("y<<2 = %d\n", y<<2);
		System.out.printf("y<<2 = %s\n", Integer.toBinaryString(y<<2));
		
	}
}