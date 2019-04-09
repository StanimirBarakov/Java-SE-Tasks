import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for A: ");
		double a = sc.nextDouble();
		System.out.println("Enter a value for B: ");
		double b = sc.nextDouble();
		System.out.println("Enter a value for C: ");
		double c = sc.nextDouble();
			if (c > a && c < b) {
				System.out.println("The number " + c + " is between " + a + " and " + b + "!");
			} else {
				System.out.println("The number " + c + " is NOT between " + a + " and " + b + "!");
			}
	
		}

}
