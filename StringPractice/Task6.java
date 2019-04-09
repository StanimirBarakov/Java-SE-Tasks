import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		String []text = sc.nextLine().split(" ");
		for (int i = 0; i < text.length; i++) {
			text[i] = text[i].substring(0, 1).toUpperCase()+text[i].substring(1);
		}
		str = String.join(" ", text);
		System.out.println(str);
		
	}

}