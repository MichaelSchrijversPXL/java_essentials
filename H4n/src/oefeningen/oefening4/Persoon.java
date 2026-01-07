package oefeningen.oefening4;

public class Persoon {
    private  String naam;
    private String voornaam;
    private Adres adres;

    public Persoon(String naam, String voornaam, String straat, String huisnummer, int postcode, String gemeente){
        this(naam, voornaam,new Adres(straat ,huisnummer,postcode, gemeente));
    }

    public Persoon(String naam, String voornaam, Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String toString(){
        return String.format("%s %s%n%s", naam, voornaam, adres.toString());
    }
}
