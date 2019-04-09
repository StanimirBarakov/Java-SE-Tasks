package torti.clients;

import torti.Demo;
import torti.clients.Client;

public class PrivateClient extends Client {

    private int[] vouchers;

    public PrivateClient(String name, String phone) {
        super(name, phone);
        this.vouchers = new int[Demo.randomNumber(1, 4)];
        for (int i = 0; i < vouchers.length; i++) {
            vouchers[i] = Demo.randomNumber(10, 30);
        }
    }

    @Override
    protected int getNumberOfOrderedCakes() {
        return Demo.randomNumber(1, 3);
    }

    @Override
    protected double calcHowMuchToPay(double totalPrice) {
        int allVouchers = 0;
        for (int i = 0; i < vouchers.length; i++) {
            allVouchers+= vouchers[i];
        }
        vouchers = new int[0];
        return allVouchers > totalPrice ? 0 : totalPrice - allVouchers;
    }

    @Override
    protected double giveTip(double amount) {
        return amount*2/100;
    }
}
