package imoti.properties;

public class Appartment extends Property {

    private static final String[] CONSTRUCTION_TYPES = {"ЕПК", "Тухла", "Панел", "Кирпич"};
    private static final String[] APPARTMENT_TYPES = {"студио", "гарсониера", "двустаен", "тристаен", "мезонет"};

    private String constructionType;

    public Appartment(String description, String address, double price, int area, String type, String constructionType) {
        super(description, address, price, area, type);
        if(validConstructionType(constructionType)) {
            this.constructionType = constructionType;
        }
    }

    private boolean validConstructionType(String type) {
        for(String t : CONSTRUCTION_TYPES){
            if(t.equals(type)){
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean validType(String type) {
        for(String t : APPARTMENT_TYPES){
            if(t.equals(type)){
                return true;
            }
        }
        return false;
    }
}
