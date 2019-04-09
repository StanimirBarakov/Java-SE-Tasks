import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num;
		int i = 1;
		int sum = 0;
		
		
		do{
			System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		}while(num<1);
			
		do{
			
			sum+=i;
			i++;
		
		}
		while(i<=num);
		System.out.println("The sum of the numbers from 1 to "+num+ " is "+ sum +"!");
		
	

	}

}
