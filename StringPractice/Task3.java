import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {	

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()==str2.length()){
			for(int i=0;i<str2.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					System.out.println(i+1 +" "+str1.charAt(i)+"-"+str2.charAt(i));
				}
			}
		}else{
			System.out.println("The strings are different!");
		}
		
	}
}