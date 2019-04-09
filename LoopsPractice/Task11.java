import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int space = n-1;
		int stars = 1;
		for(int row=1;row<=n;row++){
			for(int col=1;col<=space;col++){
				System.out.print(" ");
			}
			for(int i = 1;i<=stars;i++){
				System.out.print("*");
			}
			stars+=2;
			space--;
			System.out.println();
			
		}
		
		
		
	}
}