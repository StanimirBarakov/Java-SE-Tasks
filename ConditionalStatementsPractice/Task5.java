import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter a third number: ");
		int num3 = sc.nextInt();
		
		if ((num1 > num2) && (num1 > num3) && (num2>num3)){
			System.out.println(num1 + " , " + num2 + " , " + num3);
		}
		if ((num1 > num2) && (num1 > num3) && (num2<num3)){
			System.out.println(num1 + " , " + num3 + " , " + num2);
		}
		if ((num2 > num1) && (num2 > num3) && (num1>num3)){
			System.out.println(num2 + " , " + num1 + " , " + num3);
		}
		if ((num2 > num1) && (num2 > num3) && (num1<num3)){
			System.out.println(num2 + " , " + num3 + " , " + num1);
		}
		if ((num3 > num1) && (num3 > num2) && (num1>num2)){
			System.out.println(num3 + " , " + num1 + " , " + num2);
		}
		if ((num3 > num1) && (num3 > num2) && (num1<num2)){
			System.out.println(num3 + " , " + num2 + " , " + num1);
		}	
		if ((num1 == num2) || (num1 == num3) || (num2==num3) ){
			System.out.println("You entered same numbers!");
		}
			
	}

}
