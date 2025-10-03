public class WaterPokemon extends Pokemon {
    private int defense;
    private int accuracy;

    public WaterPokemon(String name, int level, int defense, int accuracy) {
        super(name, level);
        this.defense = defense;
        this.accuracy = accuracy;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats seaweed.");
    }

    public void hydroPump() {
        System.out.println(getName() + " uses Hydro Pump!");
    }

    public void surf() {
        System.out.println(getName() + " uses Surf!");
    }

    public int getDefense() { return defense; }
    public int getAccuracy() { return accuracy; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setAccuracy(int accuracy) { this.accuracy = accuracy; }
}
