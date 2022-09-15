public class RegularExpression {
	public static void main(String[] args) {
		// String str = "t";
		// String str = "abc";
		// String str = "a";
		// String str = "4";
		// String str = "x";
		String str = "Java Programming Language";
		
		// System.out.println(str.matches("."));
		// System.out.println(str.matches("[abc]"));
		// System.out.println(str.matches("\\d"));
		// System.out.println(str.matches("\\w"));
		// System.out.println(str.matches("\\w+"));
		// System.out.println(str.matches("[a-zA-Z0-9 ]+"));
		// System.out.println(str.matches(".*"));
		// System.out.println(str.matches("[a-zA-Z ]*"));
		// System.out.println(str.matches("[a-zA-Z ]+"));
		// System.out.println(str.matches("[a-zA-Z ]{5}"));
		System.out.println(str.matches("[a-zA-Z ]{5,25}"));
	}
} 