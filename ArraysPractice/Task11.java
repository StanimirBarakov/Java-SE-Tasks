
public class Task11 {

	public static void main(String[] args) {
		int[] arr = { 34, 54, 35, 55, 103, 65, 7 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.println(arr[i]);
			}

		}

	}

}
