
class DataTypeDetails {
	public static void main(String args[]) {
		int x = 5;
		System.out.printf("'+5'\n");
		System.out.println(Integer.toBinaryString(x));		
		System.out.println(Integer.toHexString(x));		
		System.out.println(Integer.toOctalString(x));

		x = 13;
		System.out.printf("'+13'\n");
		System.out.println(Integer.toBinaryString(x));		
		System.out.println(Integer.toHexString(x));		
		System.out.println(Integer.toOctalString(x));
		
		x = -5;
		System.out.printf("'-5'\n");
		System.out.println(Integer.toBinaryString(x));		
		System.out.println(Integer.toHexString(x));		
		System.out.println(Integer.toOctalString(x));	
		
	}
}