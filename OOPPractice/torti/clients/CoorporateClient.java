package torti.clients;

import torti.Demo;

public class CoorporateClient extends Client {

    private int discount;

    public CoorporateClient(String name, String phone) {
        super(name, phone);
        this.discount = Demo.randomNumber(5, 15);
    }

    @Override
    protected int getNumberOfOrderedCakes() {
        return Demo.randomNumber(3, 5);
    }

    @Override
    protected double calcHowMuchToPay(double totalPrice) {
        return totalPrice - totalPrice*discount/100;
    }

    @Override
    protected double giveTip(double amount) {
        return amount*5/100;
    }
}
