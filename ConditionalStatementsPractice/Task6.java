import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for A1: ");
		int a1 = sc.nextInt();
		System.out.print("Enter a value for A2: ");
		int a2 = sc.nextInt();
		System.out.print("Enter a value for A3: ");
		int a3 = sc.nextInt();
		int help = a1;
		
		a1 = a2;
		a2 = a3;
		a3 = help;
		
		System.out.println("Now A1 is " + a1 + ", A2 is " + a2 + " and A3 is " + a3 + "!");
		
		
		

	}

}
