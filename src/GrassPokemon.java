public class GrassPokemon extends Pokemon {
    private int hp;
    private int food;

    public GrassPokemon(String name, int level, int hp, int food) {
        super(name, level);
        this.hp = hp;
        this.food = food;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats leaves.");
    }

    public void leafStorm() {
        System.out.println(getName() + " uses Leaf Storm!");
    }

    public void solarBeam() {
        System.out.println(getName() + " uses Solar Beam!");
    }

    public int getHp() { return hp; }
    public int getFood() { return food; }
    public void setHp(int hp) { this.hp = hp; }
    public void setFood(int food) { this.food = food; }
}