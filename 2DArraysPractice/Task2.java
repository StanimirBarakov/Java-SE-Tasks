
public class Task2 {

	public static void main(String[] args) {
		int [][]arr = {
						{6,9,8,3},
						{5,2,6,7},
						{5,4,3,9},
						{2,1,7,9}
		};
			System.out.print("The first diagonal is: ");
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i][i]+" ");
			}
			System.out.println();
			System.out.print("The second diagonal is: ");
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i][arr.length-i-1]+" ");
			}
	}

}
