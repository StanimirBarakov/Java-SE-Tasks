import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter first string: ");
		String str1 = sc.next();
		System.out.print("Enter second string: ");
		String str2 = sc.next();
		
		
		System.out.print(str1.toUpperCase() + " " + str1.toLowerCase()+" ");
		System.out.print(str2.toUpperCase()+ " " + str2.toLowerCase()+" ");
		
	 }

}