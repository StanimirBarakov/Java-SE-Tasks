import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String s = sc.next();
		String t = sc.next();
		
		if(s.length()>t.length()){
			System.out.println(t.substring(0, 5)+s.substring(5));
		}
		else{
			System.out.println(s.substring(0, 5)+t.substring(5));
		}
		
		
	}

}