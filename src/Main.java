import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IO.println("Hello PokemonWorld!!!");
        IO.println("");

        FirePokemon charmander = new FirePokemon("Charmander", 10, Arrays.asList(Type.FIRE, Type.WATER), 52, 60);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 8, Arrays.asList(Type.WATER), 65, 80);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 9, Arrays.asList(Type.GRASS), 45, 30);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 12, Arrays.asList(Type.ELECTRIC), 90, 100);

        charmander.printInfo();
        charmander.eats();
        charmander.flameThrower();
        charmander.inferno();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        squirtle.printInfo();
        squirtle.eats();
        squirtle.hydroPump();
        squirtle.surf();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        bulbasaur.printInfo();
        bulbasaur.eats();
        bulbasaur.leafStorm();
        bulbasaur.solarBeam();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        pikachu.printInfo();
        pikachu.eats();
        pikachu.thunder();
        pikachu.electroBall();

        IO.println("");
        IO.println("--------------- Opdracht 6 --------------------------");
        IO.println("");

        // Superclass methods
        charmander.printInfo();
        squirtle.printInfo();
        bulbasaur.printInfo();
        pikachu.printInfo();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        // Overridden method from subclass
        charmander.eats();
        squirtle.eats();
        bulbasaur.eats();
        pikachu.eats();
        IO.println("");
        IO.println("-------------- Bonus ---------------------------");
        IO.println("");
        // Subclass-specific methods
        for (Type type : charmander.getTypes()) {
            IO.println("Choose type " + type);
        }
        charmander.flameThrower();
        charmander.inferno();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        squirtle.hydroPump();
        squirtle.surf();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        bulbasaur.leafStorm();
        bulbasaur.solarBeam();
        IO.println("");
        IO.println("-----------------------------------------");
        IO.println("");
        pikachu.thunder();
        pikachu.electroBall();
        pikachu.specialMove();


    }
}
