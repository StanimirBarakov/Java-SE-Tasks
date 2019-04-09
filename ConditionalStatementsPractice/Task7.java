import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of money: ");
		double money = sc.nextDouble();
		System.out.print("Am i healthy? ");
		boolean healthy = sc.nextBoolean();

		if (healthy = true && money >= 10) {
			System.out.println("I'll go to cinema with friends!");
		}
		if (healthy = true && money < 10) {
			System.out.println("I'll go to a cafe!");
		}
		if (healthy = false && money >= 10) {
			System.out.println("I'll buy pills!");
		}
		if (healthy = false && money < 10) {
			System.out.println("I'll stay at home and drink tea! ");
		}

	}
}

	


