import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for the row 1 (1-8): ");
		int row1 = sc.nextInt();
		System.out.print("Enter a number for the col 1 (1-8): ");
		int col1 = sc.nextInt();
		System.out.print("Enter a number for the row 2 (1-8): ");
		int row2 = sc.nextInt();
		System.out.print("Enter a number for the col 2 (1-8): ");
		int col2 = sc.nextInt();
		
		if((row1<1||row1>8)||(col1<1||col1>8)||(row2<1||row2>8)||(col2<1||col2>8)){
			System.out.println("Only from 1 to 8!");
		}
		else if((row1+col1) % 2 == (row2+col2)%2){
		   System.out.println("The positions are the same! ");
		}
			else {
				System.out.println("They are NOT the same!");
		}
		
		}
	

}