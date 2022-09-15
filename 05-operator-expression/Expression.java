import java.util.Scanner;

class Expression {
	public static void main(String[] args) {
		// example 1
		float base, height, area;
		System.out.print("Enter base and height of the triangle> ");
		Scanner sc = new Scanner(System.in);
		base = sc.nextFloat();
		height = sc.nextFloat();
		
		area = 0.5f*base*height;
		
		System.out.printf("Area = %.2f\n", area);
		
		sc.close();
	}
}