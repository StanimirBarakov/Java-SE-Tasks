import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum =0;
		for (int i=n;i>0;i--){
			sum+=i;
			
		}
		System.out.println("The sum of number 1 to " + n + " is: " +sum);
		
			
		}
	}
	
	



