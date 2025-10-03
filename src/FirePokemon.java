public class FirePokemon extends Pokemon {
    private int attack;
    private int special;

    public FirePokemon(String name, int level, int attack, int special) {
        super(name, level);
        this.attack = attack;
        this.special = special;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats spicy berries.");
    }

    public void flameThrower() {
        System.out.println(getName() + " uses Flamethrower!");
    }

    public void inferno() {
        System.out.println(getName() + " uses Inferno!");
    }

    public int getAttack() { return attack; }
    public int getSpecial() { return special; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setSpecial(int special) { this.special = special; }
}