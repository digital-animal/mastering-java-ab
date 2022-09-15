
class BitwiseMask {
	public static void main(String[] args) {
		byte a = 9, b = 12; // 9 = 1001, 12 = 1100
		byte c;
		
		c =(byte) (a << 4);
		c = (byte)(c | b);
		
		// System.out.printf("a = %s, b = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b));
		
		// System.out.printf("Merged: c = %s\n", Integer.toBinaryString(c));
		
		// System.out.printf("First 4 bits(LHS): %s\n", Integer.toBinaryString((c&0b11110000)>>4));	
		// System.out.printf("Last 4 bits(RHS): %s\n", Integer.toBinaryString(c&0b0001111));

		System.out.println("a = " + ((c&0b11110000)>>4));	
		System.out.println("b = " + ((c&0b0001111))); 

	}
}