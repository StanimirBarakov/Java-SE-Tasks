import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        String input = null;
        int bought = 0;

//        HashMap<String, Buyer> people = new HashMap<>();

        ArrayList<Buyer> people = new ArrayList<>();


//       String line = scanner.nextLine();
            while (n-->0) {
                String line = scanner.nextLine();
                String[] input=line.split(" ");
            if (input.length == 4) {
                String citizenName = input[0];
                int citizenAge = Integer.parseInt(input[1]);
                String citizenId = input[2];
                String citizenBirthDate = input[3];

                Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthDate);
                people.add(citizen);

            } else if (input.length == 3) {
                String rebelName = input[0];
                int rebelAge = Integer.parseInt(input[1]);
                String rebelGroup = input[2];

                Rebel rebel = new Rebel(rebelName, rebelAge, rebelGroup);
                people.add(rebel);
            }
//                line = scanner.nextLine();
        }

        int sum=0;
            String line1 = scanner.nextLine();
        while (!line1.equalsIgnoreCase("End")) {



            for (Buyer person : people) {
                if(person.getName().equals(line1)){
                    person.buyFood();
                    //bought=person.getFood();
                }

            }
            //sum+=bought;
            line1 = scanner.nextLine();


        }

        for (Buyer person : people) {
            sum+=person.getFood();
        }
        
        System.out.println(sum);


    }

}
