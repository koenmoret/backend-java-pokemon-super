import java.util.List;

public class FirePokemon extends Pokemon {
    private int attack;
    private int special;

    public FirePokemon(String name, int level, List<Type> types, int attack, int special) {
        super(name, level, types);
        this.attack = attack;
        this.special = special;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats spicy berries.");
    }

    @Override
    public void specialMove() {
        System.out.println(name + " uses FlamethrowerDeLuxe!");
    }

    public void flameThrower() {
        System.out.println(getName() + " uses Flamethrower!");
    }

    public void inferno() {
        System.out.println(getName() + " uses Inferno!");
    }

}