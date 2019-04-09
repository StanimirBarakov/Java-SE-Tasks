package imoti;

import imoti.agency.Agency;
import imoti.agency.Agent;
import imoti.clients.Buyer;
import imoti.clients.Client;
import imoti.clients.Seller;
import imoti.properties.Appartment;
import imoti.properties.Field;
import imoti.properties.House;
import imoti.properties.Property;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        Random r=  new Random();
        //Да се създаде агенция „Таланти Естейтс“ с пет агента с произволни имена.
        Agency agency = new Agency("Таланти Естейтс", "бул. България 69", "0878334455");

        Seller[] sellers = new Seller[30];

        for (int i = 0; i < sellers.length; i++) {
            //33% to be house, appartment or field

            Property property;
            int chance = r.nextInt(100)+1;//random number between 1 and 100
            if(chance <= 33){
                property = new House(
                        "desc",
                        "address1",
                        getRandomNumber(50000, 80000),
                        157,
                        "polqna",
                        "kirpi4",
                        3,
                        1000);
            }
            else if(chance <= 67){
                property = new Appartment(
                        "desc 2",
                        "address 2",
                        getRandomNumber(70000, 150000),
                        157,
                        "polqna",
                        "kirpi4");
            }
            else{
                property = new Field(
                        "desc 2",
                        "address 2",
                        getRandomNumber(30000, 85000),
                        157,
                        "polqna",
                        false);
            }
            Seller seller = new Seller("Seller " + (i+1), "555-43-245", property);
            seller.registerProperty();
            sellers[i] = seller;
        }

        Buyer[] buyers = new Buyer[10];
        for (int i = 0; i < buyers.length; i++) {
            Buyer buyer = new Buyer("Buyer" + (i+1), "555-44-323",getRandomNumber(300000, 1500000));
            buyers[i] = buyer;
        }

        for (int i = 0; i < buyers.length; i++) {
            buyers[i].regEnquiry();
        }

        for (int i = 0; i < buyers.length; i++) {
            for (int j = 0; j < 3; j++) {
                Property property = agency.getRandomProperty();
                buyers[i].requestView(property);
            }

        }

        for (int i = 0; i < buyers.length; i++) {
            buyers[i].buyProperty();
        }

        agency.printBalance();
        agency.printAgentsBalance();

    }

    public static int getRandomNumber(int min, int max){
        return new Random().nextInt(max-min+1) + min;
    }
}
