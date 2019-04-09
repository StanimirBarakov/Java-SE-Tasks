
public class Task17 {

	public static void main(String[] args) {
		
		int []arr = {1,3,2,4,3,7};
		boolean zigZag = true;
		
		for(int i = 1;i<arr.length-1;i++){
			if(!((arr[i]>arr[i-1] && arr[i] > arr[i+1]) || (arr[i]< arr[i-1] && arr[i] < arr[i+1]))){
				zigZag = false;
				break;
			}
			
		}
		System.out.println(zigZag);
		
	}

}
