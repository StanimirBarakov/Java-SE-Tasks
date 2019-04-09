package imoti.properties;

import imoti.agency.Agent;
import imoti.clients.Seller;

public abstract class Property {

    private String description;
    private String address;
    private double price;
    private int area;
    private Agent agent;
    private String type;
    private Seller seller;

    public Property(String description, String address, double price, int area, String type) {
        this.description = description;
        this.address = address;
        this.price = price;
        this.area = area;
        if(validType(type)) {
            this.type = type;
        }
    }

    protected abstract boolean validType(String type);

    public double getPrice() {
        return price;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }
}
