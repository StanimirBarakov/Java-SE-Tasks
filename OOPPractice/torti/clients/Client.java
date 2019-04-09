package torti.clients;

import torti.Contact;
import torti.bakery.Bakery;
import torti.bakery.Order;
import torti.bakery.Supplier;
import torti.cakes.Cake;

public abstract class Client extends Contact {

    public static Bakery bakery;
    private int expences;

    public Client(String name, String phone) {
        super(name, phone);
    }

    protected abstract int getNumberOfOrderedCakes();

    protected abstract double calcHowMuchToPay(double totalPrice);

    protected abstract double giveTip(double amount);

    public void makeOrder(){
        int numberOfCakes = getNumberOfOrderedCakes();
        Cake[] orderedCakes = new Cake[numberOfCakes];
        for (int i = 0; i < orderedCakes.length; i++) {
            orderedCakes[i] = bakery.getCake();
        }
        Order order = new Order("It talents office", this, orderedCakes);
        Supplier randomSupplier = bakery.getRandomSupplier();
        randomSupplier.addOrder(order);
        double toPay = calcHowMuchToPay(order.getPrice());
        bakery.getMoney(toPay);
        this.expences += toPay;
        double tip = giveTip(toPay);
        randomSupplier.takeMoney(tip);
        this.expences += tip;

    }

    public int getExpences() {
        return expences;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.expences + "lv ";
    }
}
