import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 2 and 27: ");
		int n = sc.nextInt();
		if (n >= 2 && n <= 27) {
			for (int i = 100; i <= 999; i++) {
				int a = i / 100;
				int b = i % 100 / 10;
				int c = i % 10;
				if (a + b + c == n) {
					System.out.println(i);

				}
			}
		} else {
			System.out.println("Only between 2 and 27");
		}

	}

}
