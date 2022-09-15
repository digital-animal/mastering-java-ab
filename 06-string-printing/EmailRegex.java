import java.util.Scanner;

public class EmailRegex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your email> ");
		String email = sc.nextLine();
		String pattern = "[a-zA-Z0-9.-_]+@[a-zA-Z0-9]+.(com|org|edu)";
		
		if(email.matches(pattern))
		{
			System.out.printf("Your email = %s\n", email);
			// System.out.printf("Index of = %d\n", email.indexOf("@"));
			int i = email.indexOf("@");
			int j = email.lastIndexOf(".");
			int n = email.length();
			System.out.printf("Username = %s\n", email.substring(0, i));
			System.out.printf("Host name = %s\n", email.substring(i+1, j));
			System.out.printf("Domain name = %s\n", email.substring(j+1, n));

		} 
		else
		{
			System.out.println("Invalid email address.");
		}
		sc.close();
	}
}