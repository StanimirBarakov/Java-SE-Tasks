
public class Task7 {

	public static void main(String[] args) {
	int []arr={1,3,6,3,8,5,9};
	int []arr2 = new int [arr.length];
		for(int i = 0;i<arr.length;i++){
			if(i==0){
				arr2[i]=arr[i];
			}else if (i==arr.length-1){
				arr2[i]=arr[i];
				
			}else{
				arr2[i]=arr[i-1]+arr[i+1];
			}
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr2[i]+" ");
		}
		
		
	}

}
