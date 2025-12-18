package voorbeelden.opdracht1;

public class Auteur {
    private String voornaam;
    private String naam;

    public Auteur(String voornaam, String naam) {
        this.voornaam = voornaam;
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString(){
        return "Auteur: " + voornaam + " " + naam;
    }
}
