package torti.cakes;

public class StandardCake extends Cake {

    private static final String[] STANDARD_CAKE_TYPES = {"бисквитена", "еклерова", "плодова", "шоколадова"};

    private boolean syrup;

    public StandardCake(String name, String desc, double price, int pieces, String type, boolean syrup) {
        super(name, desc, price, pieces, type);
        this.syrup = syrup;
    }

    @Override
    protected boolean validType(String type) {
        for (int i = 0; i < STANDARD_CAKE_TYPES.length; i++) {
            if(type.equals(STANDARD_CAKE_TYPES[i])){
                return true;
            }
        }
        return false;
    }
}
