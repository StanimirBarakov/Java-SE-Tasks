import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = 5;

        int my = sc.nextInt();

        while (my!=n){
            if(my==n){
                System.out.println("Bravo");

            }else{
                if(my>n){
                    System.out.println("nadole");
                }else if(my<n){
                    System.out.println("nagore");
                }
            }
            my = sc.nextInt();
        }

    }
}
