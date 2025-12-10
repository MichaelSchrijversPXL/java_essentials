package voorbeelden.opdracht3;

public class KlasGroep {
    private String klasgroep;
    private int aantalStudenten;
    public static final int MAX_AANTAL = 40;

    public KlasGroep(String klasgroep, int aantalStudenten) {
        this.klasgroep = klasgroep;
        setAantalStudenten(aantalStudenten);
    }

    public KlasGroep() {
        this("1TINx", 0);
    }

    public void setKlasgroep(String klasgroep) {
        this.klasgroep = klasgroep;
    }

    public void setAantalStudenten(int aantalStudenten) {
        if (aantalStudenten > MAX_AANTAL){
            aantalStudenten = MAX_AANTAL;
        }
        this.aantalStudenten = aantalStudenten;
    }

    public String getKlasgroep() {
        return klasgroep;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }
}
