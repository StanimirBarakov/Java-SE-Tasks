package imoti.properties;

public class House extends Appartment {

    private static final String[] HOUSE_TYPES = {"етаж от къща", "цяла къща"};

    private int parkingSlots;
    private double yardArea;

    public House(String description, String address, double price, int area, String type, String constructionType, int parkingSlots, double yardArea) {
        super(description, address, price, area, type, constructionType);
        this.parkingSlots = parkingSlots;
        this.yardArea = yardArea;
    }

    @Override
    protected boolean validType(String type) {
        for(String t : HOUSE_TYPES){
            if(t.equals(type)){
                return true;
            }
        }
        return false;
    }
}
