package opdrachten.extra3;

import java.time.LocalDate;

public class DierApp {
    static void main() {
        //Dier olifant = new Dier("olifant", "herbivoor");
        Hond hond1 = new Hond("lassie", "collie", LocalDate.of(2023, 5, 15));
        Hond hond2 = new Hond("matz", "maltheser", LocalDate.of(2022, 8, 22));
        Persoon eigenaar = new Persoon("rochard", "bartmans");
        hond1.setEigenaar(eigenaar);
        hond2.setEigenaar(eigenaar);

        Hond hond3 = new Hond(hond2);
        hond3.setEigenaar(new Persoon(hond1.getEigenaar().getNaam(), hond1.getEigenaar().getVoornaam()));

        Rund melkKoe = new Rund(true, LocalDate.of(2020, 7, 12));

        Rund vleesKoe = new Rund(false, LocalDate.of(2022, 10, 31));

        Dier poly = new Hond("pollie", "morf");

        ((Hond) poly).setEigenaar(eigenaar);

        Hond hond4 = new Hond("diesel", "stafford", LocalDate.of(2019, 12, 19));

        int teller = 0;
        Dier[] dieren = {hond1, hond2, hond3, poly, melkKoe, vleesKoe, hond4};
        for (Dier dier : dieren) {
            if (dier instanceof Hond) {
                if (dier.getLeeftijd() > 5) {
                    teller++;
                    String naam = ((Hond) dier).getNaam().toUpperCase();
                    ((Hond) dier).setNaam(naam);
                }
            }
            System.out.println(dier);
            System.out.println();
        }
        System.out.println("aantal dieren ouder dan 5: " + teller);
        System.out.println();
        System.out.println("aantal dieren: " + Dier.getAantal());
        System.out.println("aantal honden: " + Hond.getAantal());
        System.out.println("aantal runderen: " + Rund.getAantal());
        System.out.println(hond1.getEigenaar().equals(hond3.getEigenaar()));

    }
}
