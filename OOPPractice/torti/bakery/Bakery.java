package torti.bakery;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import torti.Contact;
import torti.Demo;
import torti.cakes.*;

import java.util.Arrays;

public class Bakery extends Contact {


    public static final int MAX_CAKES = 50;
    private String address;
    private double money;
    private Supplier[] suppliers;
    private Cake[] catalogue;
    private int kidsOrders = 0;
    private int specialOrders = 0;
    private int standardOrders = 0;
    private int weddingOrders = 0;

    public Bakery(String name, String phone, String address) {
        super(name, phone);
        this.address = address;
        this.money = 0;
        this.catalogue = new Cake[MAX_CAKES];
        this.suppliers = new Supplier[5];
        for (int i = 0; i < suppliers.length; i++) {
            suppliers[i] = new Supplier(Demo.generateRandomName(), "555-#nomnom");
        }
    }

    public void addCake(Cake cake){
        for (int i = 0; i < catalogue.length; i++) {
            if(catalogue[i] == null){
                catalogue[i] = cake;
                break;
            }
        }
    }

    public void printCatalogue() {
        for (int i = 0; i < catalogue.length; i++) {
            Cake cake = catalogue[i];
            System.out.println(cake);
        }
    }

    public void printProfit(){
        System.out.println(this.money);
    }

    public void printSuppliers() {

        for (int i = 0; i < suppliers.length; i++) {
            for (int j = 0; j < suppliers.length - i - 1; j++) {
                if(suppliers[j].getMoney() <= suppliers[j+1].getMoney()){
                    Supplier temp = suppliers[j];
                    suppliers[j] = suppliers[j+1];
                    suppliers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < suppliers.length; i++) {
            Supplier supplier = suppliers[i];
            System.out.println(supplier);
        }
    }

    public void printMostSoldCake() {
        String[] types = {"Standard", "Special", "Wedding", "Kids"};
        int[] ordered = {standardOrders, specialOrders, weddingOrders, kidsOrders};
        int max = ordered[0];
        int maxIdx = 0;
        for (int i = 1; i < ordered.length; i++) {
            if(max < ordered[i]){
                max = ordered[i];
                maxIdx = i;
            }
        }
        System.out.println("Most sold is " + types[maxIdx]);
    }

    public void printMostFuckedSupplier() {

        for (int i = 0; i < suppliers.length; i++) {
            for (int j = 0; j < suppliers.length - i - 1; j++) {
                if(suppliers[j].getActiveOrders() <= suppliers[j+1].getActiveOrders()){
                    Supplier temp = suppliers[j];
                    suppliers[j] = suppliers[j+1];
                    suppliers[j+1] = temp;
                }
            }
        }
        System.out.println(suppliers[0]);
    }

    public Cake getCake() {
        Cake randomCake;
        do{
            int index = Demo.randomNumber(0, catalogue.length-1);
            randomCake = catalogue[index];
            if(randomCake != null){
                catalogue[index] = null;
                break;
            }
        }
        while (true);
        if(randomCake instanceof StandardCake) standardOrders++;
        if(randomCake instanceof KidsCake) kidsOrders++;
        if(randomCake instanceof WeddingCake) weddingOrders++;
        if(randomCake instanceof SpecialCake) specialOrders++;
        return randomCake;
    }

    public Supplier getRandomSupplier() {
        return suppliers[Demo.randomNumber(0, suppliers.length-1)];
    }

    public void getMoney(double toPay) {
        this.money += toPay;
    }
}
