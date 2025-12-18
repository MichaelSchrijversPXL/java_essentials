package oefeningen.oefening2;

public class Pokedex {
    private Pokemon[] pokemon;

    Pokedex(int lengte) {
        pokemon = new Pokemon[lengte];
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public boolean bevat(Pokemon pokemon) {
        for (Pokemon mon : this.pokemon) {
            if (mon == null) {
                return false;
            }
            if (mon.getNaam().equals(pokemon.getNaam())) {
                return true;
            }
        }
        return false;
    }

    public void voegToe(Pokemon pokemon) {
        for (int i = 0; i < this.pokemon.length; i++) {
            if (this.pokemon[i] == null) {
                this.pokemon[i] = pokemon;
                return;
            }
        }
    }

    public String toString() {
        StringBuilder hulp = new StringBuilder();
        for (Pokemon mon : pokemon) {
            if (mon == null) {
                return hulp.toString();
            } else {
                hulp.append("- ").append(mon.toString()).append("\n");
            }
        }
        return hulp.toString();
    }
}
