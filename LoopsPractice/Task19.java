import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(10....99): ");
		int n = sc.nextInt();
		if(n>=10&&n<=99){
		for(int i = n;i>1;){
			if(i%2==0){
				n=n/2;
				
			}else{
				n=n*3+1;
			}
			System.out.print(n+" ");	
			i=n;
			
			
			}
		
		}else{
			System.out.println("Only from 10 to 99!");
		}
		
	}

}
