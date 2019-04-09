package torti.cakes;

public class KidsCake extends Cake {

    private static final String[] KIDS_CAKE_TYPES = {"за рожден ден", "за кръщене", "за прощапулник"};

    private String kidsName;

    public KidsCake(String name, String desc, double price, int pieces, String type, String kidsName) {
        super(name, desc, price, pieces, type);
        this.kidsName = kidsName;
    }

    @Override
    protected boolean validType(String type) {
        for (int i = 0; i < KIDS_CAKE_TYPES.length; i++) {
            if(type.equals(KIDS_CAKE_TYPES[i])){
                return true;
            }
        }
        return false;
    }
}
