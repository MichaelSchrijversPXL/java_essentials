package opdrachten.extra1;

import java.time.LocalDate;

public class Hond extends Dier {
    private String naam;
    private String ras;
    private Persoon eigenaar;
    private static int aantal;

    public Hond(String naam, String ras, String voornaamEigenaar, String achterNaamEigenaar, LocalDate geboorteDatum) {
        this(naam, ras, geboorteDatum);
        eigenaar = new Persoon(achterNaamEigenaar, voornaamEigenaar);
    }

    public Hond(String naam, String ras, LocalDate geboorteDatum) {
        super("hond", "carnivoor", geboorteDatum);
        this.naam = naam;
        this.ras = ras;
    }

    public Hond(String naam, String ras) {
        this(naam, ras, LocalDate.now());
    }

    public Hond(Hond hond) {
        this(hond.naam, hond.ras, hond.getGeboorteDatum());
        eigenaar = hond.eigenaar;

    }

    public String getNaam() {
        return naam;
    }

    public static int getAantal(){
        return aantal;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getRas() {
        return ras;
    }

    public Persoon getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(Persoon eigenaar) {
        this.eigenaar = eigenaar;
    }

    public void print() {
        super.print();
        System.out.printf("Het is %s de %s.%n", naam, ras);
        if (eigenaar != null) {
            System.out.printf("Mijn baasje is %s %s.%n", eigenaar.getNaam(), eigenaar.getVoornaam());
        }
    }
}
