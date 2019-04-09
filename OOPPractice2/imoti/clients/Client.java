package imoti.clients;

import imoti.agency.Agency;
import imoti.agency.Agent;
import imoti.properties.Property;

public abstract class Client {

    public static Agency agency;
    protected Agent agent;
    private String name;
    private String phone;
    protected double money;

    public Client(String name, String phone, double money){
        this.name = name;
        this.phone = phone;
        this.money = money;
    }

    public void payCommission(Property property){
        double payment = property.getPrice()*3/100;
        agency.addPayment(payment, this.agent);//3% of property price
        this.money -= payment;
    }
}
