
public class Task5 {

	public static void main(String[] args) {
		
		int [][]arr = { 
						{1,2,3,16},
						{5,6,7,16},
						{9,10,11,16},
						{13,14,15,16}
		};
		int rowSum = 0;
		int colSum = 0;
		int maxRowSum = 0;
		int maxColSum = 0;
		for (int i = 0; i < arr.length; i++) {
			rowSum = 0;
			colSum = 0;
			for (int j = 0; j <= arr[i].length - 1; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
				if (maxRowSum < rowSum) {
					maxRowSum = rowSum;
				}
				if (maxColSum < colSum) {
					maxColSum = colSum;
				}
			}
		}
		System.out.print("Max sum of rows: " + maxRowSum);
		System.out.println();
		System.out.print("Max sum of colums: " + maxColSum);
		System.out.println();

		if (maxColSum > maxRowSum) {
			System.out.println("Max sum of rows is smaller than max sum of cols!");
		} else {
			System.out.println("Max sum of rows is bigger than max sum of cols!");
		}

	}

}
