package imoti.clients;

import imoti.properties.Property;

public class Seller extends Client {

    private Property property;

    public Seller(String name, String phone, Property property) {
        super(name, phone, 0);
        this.property = property;
        this.property.setSeller(this);
    }

    public void registerProperty(){
        this.agent = agency.getRandomAgent();
        agency.addProperty(this.property);
        this.agent.addSeller(this);
    }

    public void getMoney(double priceWithoutCommission) {
        this.money += priceWithoutCommission;
    }
}
