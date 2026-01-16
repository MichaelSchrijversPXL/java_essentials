package oefeningen.oef1;

public class Manager extends Werknemer {
    private int bonus;
    private static int aantal;
// is de functie niet manager?
    public Manager(String voornaam, String naam, String functie, double salaris) {
        super(voornaam, naam, functie, salaris);
        bonus = 50;
        aantal++;
    }

    public Manager(String voornaam, String naam, String functie, double salaris, int bonus) {
        this(voornaam, naam, functie, salaris);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public static int getAantal() {
        return aantal;
    }

    public static double getProcAandeelManagers() {
        return 1.0 * aantal / Werknemer.getAantal() * 100;
    }

    @Override
    public double getSalaris() {
        return super.getSalaris() + bonus;
    }
    @Override
    public void print(){
        System.out.printf("%s %s ", getNaam(), getVoornaam());
        System.out.printf("is een %s en verdient %.2f", getFunctie(), getSalaris());
    }


}
