import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number without zeros: ");
		int number = sc.nextInt();
		int n1 = number/100;
		int n2 = number%100/10;
		int n3 = number%100%10;
		
		
		if((number<100||number>999)||(n1==0||n2==0||n3==0)){
			System.out.println("You have NOT read my instructions!");
			}else {
				if((number%n1==0) && (number%n2==0) && (number%n3==0)){
					System.out.println("The number is divided into all its digits! ");
				}else {
					System.out.println("The number cant be divided into all its digits!");
				
		
	}
		

}
}
}