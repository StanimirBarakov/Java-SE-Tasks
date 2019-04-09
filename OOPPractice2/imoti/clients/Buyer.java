package imoti.clients;

import imoti.Demo;
import imoti.agency.Agent;
import imoti.agency.View;
import imoti.properties.Property;

public class Buyer extends Client {

    private View[] views;
    private int viewsFreePlaces;

    public Buyer(String name, String phone, double money) {
        super(name, phone, money);
        this.views = new View[3];
        this.viewsFreePlaces = views.length;
    }

    public void regEnquiry() {
        this.agent = agency.getRandomAgent();
        this.agent.addBuyer(this);
    }

    public void requestView(Property property) {
        if(property.getPrice() <= this.money){
            View view = new View(property, this.agent, this, "dnes");
            this.views[this.views.length - viewsFreePlaces--] = view;
            this.agent.addView(view);
        }
    }

    public void buyProperty() {
        //TODO handle already sold property
        Property property = views[Demo.getRandomNumber(0, views.length-1)].getProperty();
        payCommission(property);
        double priceWithoutCommission = property.getPrice()*97/100;
        this.money -= priceWithoutCommission;
        property.getSeller().getMoney(priceWithoutCommission);
        property.getSeller().payCommission(property);
    }
}
