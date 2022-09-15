public class StringMethods {
	public static void main(String[] args) {
		String str = "Java Programming";
		// String str = new String("Java Programming");
		String str2 = " Language";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str2.trim());
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println(str.replace('a', '_'));
		System.out.println(str.startsWith("J"));
		System.out.println(str.startsWith("j"));
		System.out.println(str.endsWith("t"));
		System.out.println(str.endsWith("g"));
		System.out.println(str.contains("ing"));
		System.out.println(str.contains("c++"));
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('P'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', 5));
		System.out.println(str.indexOf("Prog"));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.equals("Java Programming"));
		System.out.println(str.equals("java programming"));
		System.out.println(str.equalsIgnoreCase("java programming"));
		System.out.println(str.compareTo("java programming"));
		System.out.println(String.valueOf(2));
		System.out.println(String.valueOf('A'));
		System.out.println(str.concat(str2));
		
		String str3 = "Python";
		String str4 = "Python";
		String str5 = "python";
		String str6 = new String("Python");
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str3.equals(str6));
		System.out.println(str3.equalsIgnoreCase(str5));

		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareTo(str5));
		System.out.println(str5.compareTo(str3));
		System.out.println(str3.compareTo(str6));
		System.out.println(str3.compareToIgnoreCase(str5));

		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
	}
}