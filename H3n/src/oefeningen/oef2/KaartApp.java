package oefeningen.oef2;


import java.util.Arrays;
import java.util.Collections;

public class KaartApp {
    static void main(String[] args) {
        Kaart[] kaarten = new Kaart[52];
        int teller = 0;
        for (Soort soort : Soort.values()) {
            for (Waarde waarde : Waarde.values()) {
                kaarten[teller] = new Kaart(waarde,soort);
                teller ++;
            }
        }

        Collections.shuffle(Arrays.asList(kaarten));
        teller = 2;
        Kaart speler = kaarten[0];
        Kaart computer = kaarten[1];
        System.out.printf("speler: %s %s%n", speler.getWaarde(), speler.getSoort());
        System.out.printf("computer: %s %s%n", computer.getWaarde(), computer.getSoort());
        while(computer.getWaarde() == speler.getWaarde()){
            speler = kaarten[teller];
            teller++;
        }
        if (speler.getWaarde().ordinal() > computer.getWaarde().ordinal()){
            System.out.printf("winnaar speler: %s %s", speler.getWaarde(), speler.getSoort());
        } else {
            System.out.printf("winnaar computer: %s %s", computer.getWaarde(), computer.getSoort());
        }
    }
}
