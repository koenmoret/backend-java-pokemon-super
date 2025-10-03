import java.util.List;

public class ElectricPokemon extends Pokemon {
    private int speed;
    private int xp;

    public ElectricPokemon(String name, int level, List<Type> types, int speed, int xp) {
        super(name, level, types);
        this.speed = speed;
        this.xp = xp;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats electric seeds.");
    }

    @Override
    public void specialMove() {
        System.out.println(getName() + " uses ThunderDeLuxe!");
    }

    public void thunder() {
        System.out.println(getName() + " uses Thunder!");
    }

    public void electroBall() {
        System.out.println(getName() + " uses Electro Ball!");
    }

//    public int getSpeed() { return speed; }
//    public int getXp() { return xp; }
//    public void setSpeed(int speed) { this.speed = speed; }
//    public void setXp(int xp) { this.xp = xp; }
}