public class Task4 {

	public static void main(String[] args) {
		int[] arr = {4};
		int index = arr.length-1;
		boolean mirror=true;
		for(int i = 0;i<arr.length;i++){
			if((arr[i])!=arr[index]){
			mirror = false;	
			}
			index--;
		}
		System.out.println(mirror);
		
		
		
		
	}

}
