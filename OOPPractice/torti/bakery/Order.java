package torti.bakery;

import torti.cakes.Cake;
import torti.clients.Client;

public class Order {

    private double price;
    private String address;
    private String datetime;
    private Client client;
    private Cake[] orderedCakes;

    public Order(String address, Client client, Cake[] orderedCakes) {
        this.address = address;
        this.datetime = "now";
        this.client = client;
        this.orderedCakes = orderedCakes;
        for (int i = 0; i < orderedCakes.length; i++) {
            this.price += orderedCakes[i].getPrice();
        }
    }

    public double getPrice() {
        return price;
    }
}
