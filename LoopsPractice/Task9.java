import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		for(int i = n;i<=m;i++){
			int mult = i*i;
			if (sum>200){
				break;
			}
			if(mult%3==0){
				System.out.println("Skip 3");
				
			}else {
				System.out.println(mult);
				sum+=mult;
			}
			
		}
		
		
	}

}
