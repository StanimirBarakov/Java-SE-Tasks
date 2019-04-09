import java.util.Objects;

public class Rebel implements Buyer,Person {

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void buyFood() {
        this.food=this.food+5;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rebel rebel = (Rebel) o;
        return Objects.equals(name, rebel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
