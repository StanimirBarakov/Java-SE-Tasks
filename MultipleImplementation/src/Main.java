
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Birthable> birthdays = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pet pet = null;
        while (!input.equals("End")) {
            String[] line = input.split("\\s+");

            if (line[0].equals("Citizen")) {

                String name = line[1];
                int age = Integer.parseInt(line[2]);
                String id = line[3];
                String data = line[4];

                Citizen citizen = new Citizen(name, age, id, data);

                birthdays.add(citizen);
            } else if (line[0].equals("Pet")) {
                String name = line[1];
                String data = line[2];

                pet = new Pet(name, data);

                birthdays.add(pet);
            } else if (line[0].equals("Robot")) {
                String name = line[1];
                String id = line[2];
                Robot robot = new Robot(name, id);
                //birthdays.add();
            }
            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();

        boolean matches = false;
        String godina = "";
        String cqlaGodina = "";
        for (Birthable birthday : birthdays) {
            String[] arr = birthday.getBirthDate().split("/");
            godina = arr[2];

            if (input2.equals(godina)) {
                matches = true;
                cqlaGodina = birthday.getBirthDate();

            }

        }

        if (matches) {
            System.out.println(cqlaGodina);
        } else {
            System.out.println("<no output>");
        }


    }
}

