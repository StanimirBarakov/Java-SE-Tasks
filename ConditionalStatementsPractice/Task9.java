import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 99: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number between 10 and 99: ");
		int secondNum = sc.nextInt();

		int mult = firstNum * secondNum;
		int thirdDigit = (mult % 10) % 10;

		if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
			System.out.println("You have not read my instructions! ");
		} else if (mult % 2 == 0) {
			System.out.println(mult + " , " + thirdDigit + " Even ");
		} else {
			System.out.println(mult + " , " + thirdDigit + " Odd ");
		}

	}

}
