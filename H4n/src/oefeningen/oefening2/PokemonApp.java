package oefeningen.oefening2;

public class PokemonApp {
    static void main() {
        Pokedex test = new Pokedex(5);
        test.bevat(new Pokemon("charmander", "fire"));
        test.voegToe(new Pokemon("charmander", "fire"));
        System.out.println(test.toString());
    }
}
