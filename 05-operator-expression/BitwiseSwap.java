import java.util.Scanner;

class BitwiseSwap {
	public static void main(String[] args) {
		System.out.print("Enter two integer> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("Before Swapping: a = %d, b = %d\n", a, b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.printf("After Swapping: a = %d, b = %d\n", a, b);

		sc.close();
	}
}