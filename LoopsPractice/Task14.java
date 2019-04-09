import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 10 and 200: ");
		int n = sc.nextInt();
		
		if (n >= 10 && n <= 200) {
			for (int i = n; i >= 1; i--) {
				if (i % 7 == 0) {
					System.out.println(i + " ");
				}
			}
		} else {
			System.out.println("Only between 10 and 200!");
		}
	}

}
