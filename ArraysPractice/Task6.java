
public class Task6 {

	public static void main(String[] args) {
		int[] arr={1,4,6,3,6,8};
		int[] arr1={1,4,6,3,6,8};
		boolean equal=true;
		for(int i = 0;i<arr.length;i++){
			if(arr.length!=arr1.length){
				equal = false;
				break;
			}
				if(arr[i]!=arr1[i]){
					equal=false;
					break;
				}
			
		} 
				System.out.println(equal);
			
		
		
	}

}

