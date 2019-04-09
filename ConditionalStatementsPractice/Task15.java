import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for temperature between -100 and 100!  ");
		int hour = sc.nextInt();
		
		if(hour>0&&(hour<=24)){
			if(hour>=4&&hour<=9){
				System.out.println("Good morning! ");
			}
			else if(hour>9&&hour<18){
				System.out.println("Good day! ");
			}
			else if((hour>=18&&hour<24)||(hour<0&&hour<4)){
				System.out.println("Cool! ");
			}
		}
		else {
			System.out.println("You have NOT read my instructions! ");
		}
	}

}