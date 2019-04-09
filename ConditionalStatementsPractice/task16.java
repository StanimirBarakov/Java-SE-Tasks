import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number: ");
		int number = sc.nextInt();
		int n1=number/100;
		int n2=number%100/10;
		int n3=number%100%10;
		
		if (number>=100&&number<=999){
			if(n1<n2&&n2<n3){
				System.out.println("Your number: " + number + " The digits are arranged in ascending order!");
				}
			else if(n1>n2&&n2>n3){
				System.out.println("Your number: " + number + " The digits are arranged in descending order!");
			}
			else if(n1==n2&&n2==n3){
				System.out.println("Your number: " + number + " The digits are the same!");
			}
			else { System.out.println("The digits are unordered!");
			}
		  }
		else{ 
			System.out.println("You have NOT read my instructions!");
			
			
		}
		
			
		}
		

	}
	

