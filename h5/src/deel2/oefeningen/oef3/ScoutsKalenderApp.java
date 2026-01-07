package deel2.oefeningen.oef3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoutsKalenderApp {
    static void main() {
        ArrayList<Activiteit> activiteiten = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef het jaar in:");
        int jaar = scan.nextInt();
        System.out.println("Geef de maan in:");
        int maand = scan.nextInt();
        LocalDate tempDate = LocalDate.of(jaar, maand, 1);
        int dagnummer;
        System.out.println("geef een dag in:");
        dagnummer = scan.nextInt();
        while (dagnummer != 0) {
            System.out.println("Geef een activiteit in:");
            activiteiten.add(new Activiteit(scan.next(), tempDate.withDayOfMonth(dagnummer)));
            System.out.println("geef een dag in:");
            dagnummer = scan.nextInt();
        }
        System.out.printf("******* kalender voor %TB *********%n", tempDate.getMonth());
        for (Activiteit activiteit:activiteiten){
            System.out.println(activiteit.toString());
        }
    }
}
