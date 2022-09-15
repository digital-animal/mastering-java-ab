
class TestUnicode {
	public static void main(String args[]) {
		for(char x=0x0370; x<=0x03FF; x++)
			System.out.printf(x+ " ");

		System.out.println();
		
		for(char x=0x0980; x<=0x09FF; x++)
			System.out.printf(x+ " ");
	}
}