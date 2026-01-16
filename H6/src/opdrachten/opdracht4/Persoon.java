package opdrachten.opdracht4;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam){
        this.naam = naam;
        this.voornaam = naam;
    }

    public Persoon(){}
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

    public void print(){
        System.out.println("naam: " + naam);
        System.out.println("voornaam: " + voornaam);
    }
}
