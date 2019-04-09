import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for N [10....5555]: ");
		int n = sc.nextInt();
		System.out.println("Enter a value for M [10....5555]:");
		int m = sc.nextInt();
		int temp = 0;
		if((m>=10&&m<=5555)&&(n>=10&&n<=5555)&&(n!=m)){
		if(m>n){
			temp=n;
			n=m;
			m=temp;
		}
		for(int i = n;i>=m;i--){
			if (i+50>=m||i+50>=n){
			if(i%50==0){
			System.out.println(i);	
			
				}
			}
		}
		}else{
			System.out.println("You have NOT read my instructions! ");
		}
	}

}
