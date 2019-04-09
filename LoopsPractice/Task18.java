import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Enter second number: ");
		int m = sc.nextInt();
		
		if((n >= 1 && n <= 9) && (m >= 1 && m <=9)){
		for(int i = 1;i <= n;i++){
			for(int j = 1;j <= m;j++){
				System.out.println(i +" * "+ j +" = "+(i*j));
				}
			}
		}else{
			System.out.println("Only from 1 to 9!");
		}

	}

}
