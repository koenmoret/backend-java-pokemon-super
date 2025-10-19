import java.util.List;

public abstract class Pokemon {

    protected String name;
    protected int level;
    private final List<Type> types;

    public Pokemon(String name, int level, List<Type> types) {
        this.name = name;
        this.level = level;
        this.types = types;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Level: " + level);
    }

    public abstract void eats();
    public abstract void specialMove();

    public List<Type> getTypes() { return types; }

    public String getName() { return name; }
    public int getLevel() { return level; }
    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }

}