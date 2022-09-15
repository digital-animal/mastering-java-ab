/// str.replaceAll("RegexPattern","StringToReplace")

public class StringRegex {
	public static void main(String[] args) {
		
		String str1 = "A4#$q9*~z2@";
		String str2 = "A quick brown fox jumps over the lazy dog";
		String str3 = " once upon   a    time in the     wild west ";
		
		// str1 = str1.replaceAll("[~!@#$%^&*]", "");
		str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.printf("%s", str1);
		System.out.println();

		// str3 = str3.replaceAll("\\s\\s+", " ");
		str3 = str3.replaceAll("\\s+", " ").trim();
		// str3 = str3.trim();
		System.out.printf("%s", str3);
		System.out.println();
		
		// str2 = str2.replaceAll("\\s\\s+", " ").trim();
		str2 = str2.replaceAll("\\s+", " ").trim();
		System.out.printf("%s", str2);
		System.out.printf("\n");
		// System.out.println(str2.split("\\s"));
		String words[] = str2.split("\\s");
		System.out.println();
		System.out.printf("No of words = %d\n", words.length);
		
		int count = 0;
		for(String word:words)
		{
			count++;
			System.out.println(word);
		}
		System.out.printf("Word count = %d\n", count);

	}
}