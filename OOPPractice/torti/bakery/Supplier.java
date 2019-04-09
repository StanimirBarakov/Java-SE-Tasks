package torti.bakery;

import torti.Contact;

public class Supplier extends Contact {

    private double money;
    private Order[] orders;
    private int freePlaces;

    public Supplier(String name, String phone) {
        super(name, phone);
        this.money = 0;
        this.orders = new Order[10];
        this.freePlaces = orders.length;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.money;
    }

    public int getActiveOrders(){
        int counter = 0;
        for (int i = 0; i < orders.length; i++) {
            if(orders[i] != null){
                counter++;
            }
        }
        return counter;
    }

    public void takeMoney(double money){
        this.money += money;
    }

    public double getMoney() {
        return money;
    }

    public void addOrder(Order order) {
        orders[orders.length - freePlaces--] = order;
    }
}
