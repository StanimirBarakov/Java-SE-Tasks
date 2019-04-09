package torti;

import torti.bakery.Bakery;
import torti.cakes.*;
import torti.clients.Client;
import torti.clients.CoorporateClient;
import torti.clients.PrivateClient;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        //Да се създаде сладкарница „Сладки таланти“ с пет доставчика с произволни имена.
        Bakery bakery = new Bakery("Сладки таланти", "555-22-33", "Зависи кой питате");

        for (int i = 0; i < Bakery.MAX_CAKES; i++) {
            Cake cake;
            int chance = randomNumber(0, 100);
            if(chance <= 25){
                cake = new StandardCake(
                        generateRandomCakeName(),
                        "desc",
                        randomNumber(10, 30),
                        randomNumber(8, 32),
                        generateRandomCakeType(),
                        new Random().nextBoolean()
                );
            }
            else if( chance <= 50){
                cake = new WeddingCake(
                        generateRandomCakeName(),
                        "desc",
                        randomNumber(150, 3000),
                        randomNumber(8, 320),
                        generateRandomCakeType(),
                        randomNumber(1, 8));
            }
            else if( chance <= 75){
                cake = new SpecialCake(
                        generateRandomCakeName(),
                        "desc",
                        randomNumber(1500, 3000),
                        randomNumber(2, 22),
                        generateRandomCakeType(),
                        "Zavurshvane na season X");
            }
            else {
                cake = new KidsCake(
                        generateRandomCakeName(),
                        "desc",
                        randomNumber(5, 15),
                        randomNumber(2, 12),
                        generateRandomCakeType(),
                        generateRandomName());
            }
            bakery.addCake(cake);
        }

        Client.bakery = bakery;
        Client[] clients = new Client[10];

        //create clients
        for (int i = 0; i < 5; i++) {
            Client client = new CoorporateClient(generateRandomName(), "555-44-22");
            clients[i] = client;
        }
        //create clients
        for (int i = 5; i < 10; i++) {
            Client client = new PrivateClient(generateRandomName(), "555-44-22");
            clients[i] = client;
        }

        for (int i = 0; i < clients.length; i++) {
            clients[i].makeOrder();
        }

        System.out.println("============= CATALOGUE =============");
        bakery.printCatalogue();
        System.out.println("============= PROFIT =============");
        bakery.printProfit();
        System.out.println("============= SUPPLIERS =============");
        bakery.printSuppliers();
        System.out.println("============= MOST SOLD CAKE =============");
        bakery.printMostSoldCake();
        System.out.println("============= MOST FUCKED SUPPLIER =============");
        bakery.printMostFuckedSupplier();
        System.out.println("============= MOST GENEROUS CLIENT =============");
        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients.length - i - 1; j++) {
                if(clients[j].getExpences() <= clients[j+1].getExpences()){
                    Client temp = clients[j];
                    clients[j] = clients[j+1];
                    clients[j+1] = temp;
                }
            }
        }
        System.out.println(clients[0]);

    }

    public static int randomNumber(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }

    public static String generateRandomName(){
        final String[] names = {"Gosho", "Tosho", "Misho", "Tisho"};
        return names[randomNumber(0, names.length-1)];
    }

    public static String generateRandomCakeName(){
        final String[] names = {"Nedelq", "Subota", "Lazur", "Garash", "Biskvitka", "Solena"};
        return names[randomNumber(0, names.length-1)];
    }

    public static String generateRandomCakeType(){
        final String[] names = {"за рожден ден", "за кръщене", "за прощапулник","юбилейна", "юбилейна", "рекламна","бисквитена", "еклерова", "плодова", "шоколадова","голяма", "малка", "средна"};
        return names[randomNumber(0, names.length-1)];
    }
}
