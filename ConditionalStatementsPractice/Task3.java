import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for the A: ");
		int a = sc.nextInt();
		System.out.println("Enter a value for B: ");
		int b = sc.nextInt();
		int c = a;

		a = b;
		b = c;

		System.out.println("Now A is: " + a + " And B is:" + b);

	}

}
