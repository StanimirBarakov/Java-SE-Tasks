import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter a second number: ");
		int secondNumber = sc.nextInt();

		int sum = firstNumber + secondNumber;
		int sub = firstNumber - secondNumber;
		int mult = firstNumber * secondNumber;
		int div = firstNumber / secondNumber;
		int mod = firstNumber % secondNumber;

		System.out.println("The summation of the numbers is: " + sum);
		System.out.println("The substraction of the numbers is: " + sub);
		System.out.println("The multiplication of the numbers is: " + mult);
		System.out.println("The division of the numbers is: " + div);
		System.out.println("The moulus of the numbers is: " + mod);

	}

}
