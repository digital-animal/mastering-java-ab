public class StringLiteral {
	public static void main(String[] args) {
		String str1 = "Java Program";
		System.out.printf("%s\n", str1); 
		
		String str2 = new String("JAVA");
		System.out.printf("%s\n", str2);
		
		char ch[] = {'A', 'B', 'C'};
		String str3 = new String(ch);		
		System.out.printf("%s\n", str3);
		
		byte b[] = {65, 66, 67, 97, 98, 99};
		String str4 = new String(b);		
		System.out.printf("%s\n", str4);
		
		String s1="Python";
		String s2="Python";
		String s3=new String("Python");
		
		System.out.printf("%s\n", s1);
		System.out.printf("%s\n", s2);
		System.out.printf("%s\n", s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);

	}
}