package imoti.agency;

import imoti.Demo;
import imoti.clients.Client;
import imoti.properties.Property;

import java.util.Random;

public class Agency {

    private static final String[] NAMES = {"Гошо", "Тошо", "Пешо", "Драган", "Мирчо"};

    private String name;
    private String address;
    private String phone;
    private double money;
    private Agent[] agents;
    private Property[] catalogue;
    private int freePlaces;

    public Agency(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.money = 0;
        this.catalogue = new Property[30];
        this.freePlaces = catalogue.length;
        this.agents = new Agent[5];
        Random r = new Random();

        Agent.agency = this;
        Client.agency = this;
        for (int i = 0; i < agents.length; i++) {
            String randomName = Agency.NAMES[r.nextInt(Agency.NAMES.length)];
            this.agents[i] = new Agent(randomName);
        }
    }

    public String getPhone() {
        return phone;
    }

    public Agent getRandomAgent() {
        return this.agents[Demo.getRandomNumber(0, this.agents.length-1)];
    }

    public void addProperty(Property property) {
        this.catalogue[catalogue.length - freePlaces--] = property;
    }

    public Property getRandomProperty() {
        return this.catalogue[Demo.getRandomNumber(0, this.catalogue.length-1)];
    }

    public void addPayment(double payment, Agent agent){
        agent.addPayment(payment/2);
        this.money+=payment/2;
    }

    public void printBalance() {
        System.out.println("Agency total money = " + this.money);
    }

    public void printAgentsBalance() {

        for (int i = 0; i < agents.length; i++) {
            for (int j = 0; j < agents.length-i-1; j++) {
                if(agents[j].getMoney() <= agents[j+1].getMoney()){
                    Agent temp = agents[j];
                    agents[j] = agents[j+1];
                    agents[j+1] = temp;
                }
            }
        }
        for(Agent a : agents){
            a.printBalance();
        }
    }
}
