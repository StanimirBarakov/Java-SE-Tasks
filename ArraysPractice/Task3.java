
public class Task3 {

	public static void main(String[] args) {
		int n = 2;
		int []arr = new int [10];
		for (int i = 0; i < arr.length; i++) {
			if (i < 2){
				arr[i]=n;
			}else{
				arr[i]=arr[i-1]+arr[i-2];
				}
			
			}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}

	}

}
