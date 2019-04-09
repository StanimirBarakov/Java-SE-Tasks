import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		String[] str=sc.nextLine().split(", ");
		for(int i = 0; i<str[0].length();i++){
			if(str[0].charAt(i)==str[1].charAt(0)){
				System.out.println(str[1]);
			}else{
				System.out.println(str[0].charAt(i));
			}
		}
		
	}
}