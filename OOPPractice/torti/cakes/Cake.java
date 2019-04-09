package torti.cakes;

public abstract class Cake {

    private String name;
    private String desc;
    private double price;
    private int pieces;
    private String type;

    public Cake(String name, String desc, double price, int pieces, String type) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.pieces = pieces;
        if(validType(type)) {
            this.type = type;
        }
    }

    protected abstract boolean validType(String type);

    @Override
    public String toString() {
        return this.name + " - " + this.price;
    }

    public double getPrice() {
        return price;
    }
}
