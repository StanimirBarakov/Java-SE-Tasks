import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the square: ");
		int n =sc.nextInt();
		System.out.println("Enter a char: ");
		char c = sc.next().charAt(0);
			for(int row = 1;row<=n;row++){
				for(int col = 1;col<=n;col++){
					if(row==1||row==n){
						System.out.print("*");
						
					}else {
						if(col==1||col==n){ 
					System.out.print("*");
						}
						else{
							System.out.print(c);
						}
						
					}
					
				}
				System.out.println();
			}
		
			
	}

}
