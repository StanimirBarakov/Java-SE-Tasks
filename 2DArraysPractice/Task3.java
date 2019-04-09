
public class Task3 {

	public static void main(String[] args) {
		int arr[][] = {
							{12,44,65,38},
							{53,93,79,27},
							{72,84,34,96},
							{31,57,48,55}
								
		};
		int numbers = 0;
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
				numbers++;
			}
		}
			System.out.println("The sum of the matrix is: "+sum);
			System.out.println("The average number is :"+(sum/numbers));
			
			
	}

}
