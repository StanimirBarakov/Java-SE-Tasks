import java.util.Scanner;

public class Task4{

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);

		String[] str=sc.nextLine().split(", ");
		int maxSum=0;
		int index=-1;
		int sum=0;
		for(int i=0;i<str.length;i++){
			for(int a=0;a<str[i].length();a++){
				 sum+=str[i].charAt(a);
			}
			if(sum>maxSum){
				maxSum=sum;
				index=i;
			}
			sum=0;
		}
		System.out.println(str[index]);	
		sc.close();
	}
}