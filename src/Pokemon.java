public class Pokemon {

    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Level: " + level);
    }

    public void eats() {
        System.out.println(name + " is eating.");
    }

    public String getName() { return name; }
    public int getLevel() { return level; }
    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }
}