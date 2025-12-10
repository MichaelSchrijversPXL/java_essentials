package voorbeelden.opdracht2;

public class Auto {
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;
    private boolean automaat;

    public Auto(){}

    public Auto(String merk, String kleur, int deuren){
        this(merk,kleur, deuren,0);
    }

    public Auto(String merk, String kleur, int deuren, int kilometerstand){
        this.merk = merk;
        this.kleur = kleur;
        aantalDeuren = deuren;
        setKilometerstand(kilometerstand);
    }

    //copyconstructor
    public Auto(Auto object){
        this( object.merk, object.kleur,object.kilometerstand, object.aantalDeuren);
        automaat = object.automaat;
    }

    public void setAutomaat(boolean automaat) {
        this.automaat = automaat;
    }

    //setters
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

    public void setKilometerstand(int kilometerstand) {
        if(kilometerstand < 0){
            kilometerstand *= -1;
        }
        this.kilometerstand = kilometerstand;
    }
    //getters

    public boolean isAutomaat() {
        return automaat;
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public double getPrijs() {
        double prijs = 20000;
        if (aantalDeuren == 5)
            prijs += 2000;
        else if (aantalDeuren == 3) {
            prijs = prijs - 500;
        }

        if (automaat)
            prijs = prijs + 2000;
        else {
            prijs = prijs * 0.98;
        }
        return prijs;
    }

    public void rijden(int afstand){
        kilometerstand += kilometerstand;
    }

    public void rijden(int uren, int snelheid){
        kilometerstand += uren * snelheid;
    }

    public void printGegevens() {
        System.out.printf("het merk is %S%n", merk);
        System.out.printf("de kleur is %s%n", kleur);
        System.out.printf("de kilometerstand is %,d%n", kilometerstand);
        if (automaat) {
            System.out.println("De wagen is een automaat");
        }
        System.out.println(this.getPrijs());
    }

}
