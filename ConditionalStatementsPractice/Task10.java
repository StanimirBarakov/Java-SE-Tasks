import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity for the tank between 10 and 9999 liters!");
		int tank = sc.nextInt();
		int count = tank/5;
		int rest = tank%(count*5);
	
			if(tank>=10 && tank<=9999){
				if(rest==0){
					System.out.println(count + " times with the two buckets. ");
				}
				if (rest==1){
					System.out.println((count-1) + " times with the two buckets and 2 buckets from 3 liters. ");
				}
				if (rest==2){
					System.out.println((count) + " times with the two buckets and 1 bucket from 2 liters. ");
					
				}
				if(rest==3){
					System.out.println((count) + " times with the two buckets and 1 bucket from 3 liters.");
					
				}
				if(rest==4){
					System.out.println((count) + " times with the two buckets and 2 buckets from 2 liters.");
				}	
			}else{
				System.out.println("Only between 10 and 9999!");
			}
			
				
		
 
	}
}