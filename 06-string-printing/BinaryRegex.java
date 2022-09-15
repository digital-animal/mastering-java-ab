public class BinaryRegex {
	public static void main(String[] args) {
		// binary regex
		// int bin = 10101;
		// String str = String.valueOf(bin);
		// String str = new String("10101");
		// System.out.println(str.matches("[0-1]+"));
		
		// octal regex
		// int oct = 742;
		// String str = String.valueOf(oct);
		// String str = oct+"";
		// String str = new String("742");
		// System.out.println(str.matches("[0-7]+"));
		
		// hexadecimal regex
		// String hex = "ABC";
		// String str = new String(hex);
		// String str = new String("ABC");
		// System.out.println(str.matches("[0-9a-fA-F]+"));
		
		// date regex
		String str = new String("24/09/1992");
		// String str = new String("24/09/92");
		System.out.println(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
	}
}