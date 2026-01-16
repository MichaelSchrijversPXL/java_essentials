package oefeningen.oef1;

public class Werknemer extends Persoon {
    private double salaris;
    private String functie;
    private static int minimum = 1000;
    private static int aantal;

    public Werknemer(String voornaam, String naam, String functie, double salaris) {
        super(voornaam, naam);
        setSalaris(salaris);
        this.functie = functie;
        aantal++;
    }

    public Werknemer(String voornaam, String naam) {
        this(voornaam, naam, "algemeen bediende", 1800);

    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        if (salaris < minimum){
            salaris = minimum;
        }
        this.salaris = salaris;
    }

    public static int getAantal(){
        return aantal;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Override
    public void print(){
        super.print();
        System.out.printf("is een %s en verdient: %.2f%n", functie, salaris);

    }
}
