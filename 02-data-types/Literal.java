
class Literal {
	public static void main(String args[]) {
		// byte b = 15;
		// byte b = 0b1010;
		// byte b = 012;
		byte b = 0x7A;
		// short s = 15;
		short s = 0xABC;
		int i = 15;
		System.out.println(b);		
		System.out.println(s);	
		System.out.println(i);	
		
		// long l=125;
		long l=125L;
		System.out.println(l);			
		
		long m=492_357_816L;
		System.out.println(m);	
		
		float f=12.56F;
		System.out.println(f);	
		
		double d=12.56D;
		System.out.println(d);
	}
}