
public class Task4 {

	public static void main(String[] args) {

		int [][]arr = {
						{1,2,4,4},
						{5,6,7,8},
						{3,10,11,12},
						{13,14,15,16}
					};
		for (int i = 0; i <arr.length; i++) {
			for (int j = arr.length-1; j >= 0; j--) { 
				System.out.print(arr[j][i]+ " ");
			}	
			System.out.println();
		}
						
	}

}
