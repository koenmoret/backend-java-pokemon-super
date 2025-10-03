public class Main {
    public static void main(String[] args) {
        IO.println("Hello PokemonWorld!!!");
        IO.println("");

        FirePokemon charmander = new FirePokemon("Charmander", 10, 52, 60);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 8, 65, 80);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 9, 45, 30);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 12, 90, 100);

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

        // Overridden method from subclass
        charmander.eats();
        squirtle.eats();
        bulbasaur.eats();
        pikachu.eats();

        // Subclass-specific methods
        charmander.flameThrower();
        charmander.inferno();

        squirtle.hydroPump();
        squirtle.surf();

        bulbasaur.leafStorm();
        bulbasaur.solarBeam();

        pikachu.thunder();
        pikachu.electroBall();
    }
}