package voorbeelden.opdracht4;

public class KlasGroep {
    private String klasgroep;
    private int aantalStudenten;
    public static final int MAX_AANTAL = 40;
    private static int teller;
    public static int totaalAantal;

    public KlasGroep(String klasgroep, int aantalStudenten) {
        this.klasgroep = klasgroep;
        setAantalStudenten(aantalStudenten);
        teller++;
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
        totaalAantal -= this.aantalStudenten;
        this.aantalStudenten = aantalStudenten;
        totaalAantal += aantalStudenten;
    }

    public String getKlasgroep() {
        return klasgroep;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public static int getTeller(){
        return teller;
    }

    public static int getTotaalAantal(){
        return totaalAantal;
    }
}
