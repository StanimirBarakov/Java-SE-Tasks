package torti.cakes;

public class SpecialCake extends Cake {

    private static final String[] SPECIAL_CAKE_TYPES = {"юбилейна", "юбилейна", "рекламна"};

    private String eventName;

    public SpecialCake(String name, String desc, double price, int pieces, String type, String eventName) {
        super(name, desc, price, pieces, type);
        this.eventName = eventName;
    }

    @Override
    protected boolean validType(String type) {
        for (int i = 0; i < SPECIAL_CAKE_TYPES.length; i++) {
            if(type.equals(SPECIAL_CAKE_TYPES[i])){
                return true;
            }
        }
        return false;
    }
}
