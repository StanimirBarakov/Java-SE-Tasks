import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a four digit number: ");
		int number = sc.nextInt();
		
		int a1 = number / 1000;
		int a2 = number % 1000 / 100;
		int a3 = number % 1000 % 100 / 10;
		int a4 = number % 1000 % 100 % 10;
		
		int firstNumber = (a1 * 10) + a4;
		int secondNumber =(a2 * 10) + a3;
		
		if (firstNumber>secondNumber){
			System.out.println(firstNumber+">"+secondNumber);	
		}
		else if (firstNumber<secondNumber){
			System.out.println(firstNumber+"<"+secondNumber);
		}
		else{
			System.out.println(firstNumber+"="+secondNumber);
		}
		
	}

}
