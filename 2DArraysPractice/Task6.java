
public class Task6 {

	public static void main(String[] args) {
			
		int [][]arr = {
						{11,12,13,14,15,16},
						{21,22,23,24,25,26},
						{31,32,33,34,35,36},
						{41,42,43,44,45,46},
						{51,52,53,54,55,56},
						{61,62,63,64,65,66}

		};
		int sum = 0;
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length - 1; j++) {
				if ((i + 1) % 2 == 0) {
					sum += arr[i][j];
					System.out.print(arr[i][j] + " ");

				}

			}
			totalSum += sum;
			if ((i + 1) % 2 == 0) {
				System.out.println();
				System.out.print("The sum of the row: "+sum);
				System.out.println();
			}
		}
		System.out.println("The sum of the all rows: "+ totalSum);
		
	}

}
