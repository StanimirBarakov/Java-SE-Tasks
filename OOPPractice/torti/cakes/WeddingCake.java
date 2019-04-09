package torti.cakes;

public class WeddingCake extends Cake {

    private static final String[] WEDDING_CAKE_TYPES = {"голяма", "малка", "средна"};

    private int floors;

    public WeddingCake(String name, String desc, double price, int pieces, String type, int floors) {
        super(name, desc, price, pieces, type);
        this.floors = floors;
    }

    @Override
    protected boolean validType(String type) {
        for (int i = 0; i < WEDDING_CAKE_TYPES.length; i++) {
            if(type.equals(WEDDING_CAKE_TYPES[i])){
                return true;
            }
        }
        return false;
    }
}
