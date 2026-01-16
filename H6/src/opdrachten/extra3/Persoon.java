package opdrachten.extra3;

import java.util.Objects;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public final String toString(){
        return String.format("%s %s", naam, voornaam);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return persoon.naam.equals(naam) && persoon.voornaam.equals(voornaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, voornaam);
    }
}
