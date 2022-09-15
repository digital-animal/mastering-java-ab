import java.util.Scanner;

// 1.6 reading from keyboard

class ReadKeyboard {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		// example 1
		// int a, b, c;
		// System.out.print("Enter two numbers> ");
		// a = s.nextInt();
		// b = s.nextInt();
		// c = a + b;
		// System.out.println("Summation is  = "+c);
		
		// example 2
		// System.out.println("\n");
		// String name;
		// System.out.print("Enter your name> ");
		// name = s.nextLine();
		
		// System.out.println("Welcome " + name);
		
		// example 3
		// useRadix()
		s.useRadix(2); // binary
		System.out.printf("Enter a number in binary> ");
		int x = s.nextInt();
		System.out.println(x);

		s.close();
	}
}