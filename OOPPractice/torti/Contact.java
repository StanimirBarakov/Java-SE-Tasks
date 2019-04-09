package torti;

public abstract class Contact {

    protected String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
