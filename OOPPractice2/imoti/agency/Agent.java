package imoti.agency;

import imoti.clients.Buyer;
import imoti.clients.Seller;

public class Agent {

    public static Agency agency;
    private String name;
    private String phone;
    private double money;
    private Buyer[] buyers;
    private Seller[] sellers;
    private View[] views;
    private int buyersFreePlaces;
    private int sellersFreePlaces;
    private int viewsFreePlaces;

    public Agent(String name) {
        this.name = name;
        this.phone = agency.getPhone();
        this.money = 0;
        this.buyers = new Buyer[10];
        this.sellers = new Seller[30];
        this.views = new View[30];
        this.buyersFreePlaces = buyers.length;
        this.sellersFreePlaces = sellers.length;
        this.viewsFreePlaces = views.length;
    }

    public void addSeller(Seller seller) {
        this.sellers[this.sellers.length - sellersFreePlaces--] = seller;
    }

    public void addBuyer(Buyer buyer) {
        this.buyers[this.buyers.length - buyersFreePlaces--] = buyer;
    }

    public void addView(View view) {
        this.views[this.views.length - viewsFreePlaces--] = view;
    }

    public void addPayment(double payment) {
        this.money+=payment;
    }

    public void printBalance() {
        System.out.println("Agent "+ this.name +" total money = " + this.money);
    }

    public double getMoney() {
        return money;
    }
}
