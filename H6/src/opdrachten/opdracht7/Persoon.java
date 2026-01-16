package opdrachten.opdracht7;

public class Persoon {
    private String naam;
    private String voornaam;
    private static int aantalPersonen;

    public Persoon(String naam, String voornaam){
        this.naam = naam;
        this.voornaam = naam;
        aantalPersonen++;
    }

    public Persoon(){aantalPersonen++;}
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

    static int getAantalPersonen(){
        return aantalPersonen;
    }

    public void print(){
        System.out.println("naam: " + naam);
        System.out.println("voornaam: " + voornaam);
    }
}
