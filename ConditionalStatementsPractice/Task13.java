import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for temperature between -100 and 100!  ");
		int temp = sc.nextInt();
		
		if(temp>(-100)&&(temp<=100)){
			if(temp<(-20)){
				System.out.println("Freezing moooooooooooooon! ");
			}
			else if(temp>(-20)&&temp<0){
				System.out.println("Cold! ");
			}
			else if(temp<15&&temp>0){
				System.out.println("Cool! ");
			}
			else if(temp>15&&temp<25){
				System.out.println("Warm! ");
			}
			else if(temp>25){
				System.out.println("Hot!");
			}
		}
		else {
			System.out.println("You have NOT read my instructions! ");
		}
	}

}
