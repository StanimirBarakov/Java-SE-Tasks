import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prime = 0;
		int n = sc.nextInt();
		for(int i = 2;i<=n;i++){
			if(n%i==0){
				prime++;
			}
		}
		if(prime == 1){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}
		
		
	}

}
