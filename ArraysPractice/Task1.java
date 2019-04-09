
public class Task1 {

	public static void main(String[] args) {
	
		int [] arr = {1,7,4,3,8,-3,6};
		int min = arr[0];
			for(int i = 0;i<arr.length;i++){
				if(arr[i]%3==0){
					if(min%3==1){
						min = arr[i];
						continue;
					}
					if(min>arr[i]){
						min=arr[i];
						
					}
				}
			}
			System.out.println(min);
			
	}
		
}			
		

	