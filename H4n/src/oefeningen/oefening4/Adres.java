package oefeningen.oefening4;

public class Adres {
    private String straat;
    private String huisnummer;
    private Gemeente gemeente;

    public Adres(String straat, String huisNummer, int postcode, String gemeente){
        this.straat = straat;
        this.huisnummer = huisNummer;
        this.gemeente = new Gemeente(postcode, gemeente);
    }

    public String getStraat() {
        return straat;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public void setHuisNummer(String huisNummer) {
        this.huisnummer = huisNummer;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s", straat, huisnummer, gemeente.toString());
    }
}


