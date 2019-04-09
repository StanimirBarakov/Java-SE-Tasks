package imoti.properties;

public class Field extends Property {

    private static final String[] FIELD_TYPES = {"нива", "поляна", "гора"};

    private boolean inRegulation;

    public Field(String description, String address, double price, int area, String type, boolean inRegulation) {
        super(description, address, price, area, type);
        this.inRegulation = inRegulation;
    }

    @Override
    protected boolean validType(String type) {
        for(String t : FIELD_TYPES){
            if(t.equals(type)){
                return true;
            }
        }
        return false;
    }
}
