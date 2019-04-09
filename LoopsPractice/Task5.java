import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		System.out.println("Enter higher number: ");
		int y = sc.nextInt();
		if(x<y){
		for(int i = x;i<=y;i++){
			System.out.println(i);
			}
		}else{
			System.out.println("You have NOT read my instructions!");
		}

	}
}