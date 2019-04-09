
public class Task2 {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length/2; i++) {
			arr2[i]=arr[i];
				
			}
		int index=arr.length/2;
		for(int i =arr.length-1;i>=arr.length/2;i--){
			arr2[index]=arr[i];
			index++;
		}
		for(int i = 0;i<arr2.length;i++){
			System.out.print(arr2[i]+ " ");
		}
		

	}

}
