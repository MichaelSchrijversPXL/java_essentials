package H1oefeningen.oefening1;

public class Toren {
    private String naam;
    private String locatie;
    private int datumVoltooid;
    private int hoogte;
    private int aantalVerdiepingen;

    // getters
    public String getNaam() {
        return naam;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getDatumVoltooid() {
        return datumVoltooid;
    }

    public int getHoogte() {
        return hoogte;
    }

    public int getAantalVerdiepingen() {
        return aantalVerdiepingen;
    }

    //setters

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setDatumVoltooid(int datumVoltooid) {
        this.datumVoltooid = datumVoltooid;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public void setAantalVerdiepingen(int aantalVerdiepingen) {
        this.aantalVerdiepingen = aantalVerdiepingen;
    }
}
