import java.util.*;

class TestProgram {
	public static void main(String args[]) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name> ");
		name = sc.nextLine();

		System.out.println("Welcome "+name);

		sc.close();
	}
}