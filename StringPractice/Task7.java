import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int countedWords=str.length;
		int sum=0;
		int maxSum=0;
		for(int i=0;i<str.length;i++){
			sum=str[i].length();
			if(sum>maxSum){
				maxSum=sum;
			}
			sum=0;
		}
		System.out.println(countedWords+" "+ maxSum);
		sc.close();
	}
}
