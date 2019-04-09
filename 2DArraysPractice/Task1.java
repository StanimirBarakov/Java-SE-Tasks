
public class Task1 {

	public static void main(String[] args) {

		int[][] arr = {
						{48,72,13,14,15},
						{21,22,53,24,75},
						{55,57,33,21,35},
						{41,87,43,44,45},
						{59,34,53,54,55},
						{61,69,63,64,65}
		};
		
			int min = arr[0][0];
			int max = arr[0][0];
			
			for(int i = 0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					if(min>arr[i][j]){
						min=arr[i][j];
					}
					if(max<arr[i][j]){
						max=arr[i][j];
					}
				}
			}
				System.out.print("The lowest number in the matrix is : "+min);
				System.out.println();
				System.out.println("The highest number in the matrix is : "+max);
		
	}

}