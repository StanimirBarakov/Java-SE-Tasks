import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter a second number: ");
		int secondNumber = sc.nextInt();

		if (firstNumber < secondNumber) {
			System.out.println(firstNumber + " , " + secondNumber);
		} else {
			System.out.println(secondNumber + " , " + firstNumber);
		}

	}

}
