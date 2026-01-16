package opdrachten.extra1;

import java.time.LocalDate;

public class DierApp {
    static void main() {
        Dier olifant = new Dier("olifant", "herbivoor");
        Hond hond1 = new Hond("lassie", "collie", LocalDate.of(2028, 5, 15));
        Hond hond2 = new Hond("matz", "maltheser", LocalDate.of(2022, 8, 22));
        Persoon eigenaar = new Persoon("rochard", "bartmans");
        hond1.setEigenaar(eigenaar);
        hond2.setEigenaar(eigenaar);

        Hond hond3 = new Hond(hond2);

        Rund melkKoe = new Rund(true, LocalDate.of(2020, 7, 12));

        Rund vleesKoe = new Rund(false, LocalDate.of(2022, 10, 31));

        Dier poly = new Hond("pollie", "morf");

        ((Hond)poly).setEigenaar(eigenaar);

        Hond hond4 = new Hond("diesel", "stafford", LocalDate.of(2019,12,19));

        Dier[] dieren = {hond1,hond2,hond3,poly,melkKoe,vleesKoe,olifant, hond4};
        for (Dier dier:dieren){
            dier.print();
        }
        System.out.println("aantal dieren: " + Dier.getAantal());
        System.out.println("aantal honden: " + Hond.getAantal());
        System.out.println("aantal runderen: " + Rund.getAantal());

    }
}
