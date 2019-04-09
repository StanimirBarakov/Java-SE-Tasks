public class Task12 {

	public static void main(String[] args) {
		for(int n = 100;n<=999;n++){
			int a = n/100;
			int b = n%100/10;
			int c = n%10;
		if(a!=b&&a!=c&&b!=c){
			System.out.println(n);
			continue;
		}
		}
		
	}

}
