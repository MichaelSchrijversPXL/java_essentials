package deel1.oefeningen.oefening2;

public class Munt {
    private String naam;
    private double koers;
    static final int AFRONDING = 3;
    static int aantal = 0;

    public Munt(){
        this("euro", 1.0);
    }

    public Munt(String naam, double koers){
        this.naam = naam;
        this.koers = koers;
        aantal++;
    }

    public String getNaam() {
        return naam.toUpperCase();
    }

    public double getKoers() {
        double tijdelijk = koers;
        tijdelijk = Math.round(tijdelijk * 1000);
        tijdelijk /= 1000;
        return tijdelijk;
    }

    public static int getAantal() {
        return aantal;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKoers(double koers) {
        this.koers = koers;
    }

    public static void setAantal(int aantal) {
        Munt.aantal = aantal;
    }

    public String toString(){
        return String.format("%.3f %s%n", getKoers(), getNaam());
    }
}
